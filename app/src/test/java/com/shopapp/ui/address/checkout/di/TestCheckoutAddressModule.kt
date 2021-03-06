package com.shopapp.ui.address.checkout.di

import com.nhaarman.mockito_kotlin.mock
import com.shopapp.ui.address.base.contract.AddressPresenter
import com.shopapp.ui.address.base.contract.AddressView
import com.shopapp.ui.address.checkout.contract.CheckoutAddressListPresenter
import com.shopapp.ui.address.checkout.contract.CheckoutUnAuthAddressPresenter
import dagger.Module
import dagger.Provides

@Module
class TestCheckoutAddressModule {

    @Provides
    fun provideCheckoutUnAuthAddressPresenter(): CheckoutUnAuthAddressPresenter = mock()

    @Provides
    fun provideCheckoutAddressListPresenter(): CheckoutAddressListPresenter = mock()

    @Provides
    fun provideAddressPresenter(): AddressPresenter<AddressView> = mock()
}