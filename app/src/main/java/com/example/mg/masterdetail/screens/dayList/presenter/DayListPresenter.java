package com.example.mg.masterdetail.screens.dayList.presenter;

import com.example.mg.masterdetail.data.ILoadItemsInteractor;
import com.example.mg.masterdetail.data.WeatherInteractor;
import com.example.mg.masterdetail.data.model.Weather10daysModel;
import com.example.mg.masterdetail.data.model.WeatherModel;
import com.example.mg.masterdetail.screens.dayList.WeatherFragment;
import com.example.mg.masterdetail.screens.dayList.contract.IDayListContract;
import com.example.mg.masterdetail.util.NetworkHelper;

public class DayListPresenter implements IDayListContract.UserActions,
        ILoadItemsInteractor.OnFinishedListener {

    //private static final String TAG = "DayListPresenter";
    private WeatherFragment view;
    private ILoadItemsInteractor mWeatherInteractor;


    public DayListPresenter(WeatherFragment view) {
        assert this.view != null;
        this.view = view;
        mWeatherInteractor = WeatherInteractor.getInstance();
        fetchData();
    }

    @Override
    public void onFinished(Weather10daysModel tenDaysModel, WeatherModel dayModel) {
        view.hideProgress();
        view.init(dayModel.getCurrent_observation());
        view.setupRecyclerView(tenDaysModel.getForecast().getSimpleforecast().getForecastday());
    }

    @Override
    public void fetchData() {
        if (NetworkHelper.getInstance().isNetworkAvailable(view.getActivity())) {
            view.showProgress();
            mWeatherInteractor.weather10DaysData(this);
        } else {
            view.hideProgress();
            view.showNoInternet();
        }

    }
}
