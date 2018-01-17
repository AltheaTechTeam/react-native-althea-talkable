
package com.althea.talkable;

import android.app.Activity;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.talkable.sdk.Talkable;
import com.talkable.sdk.models.AffiliateMember;
import com.talkable.sdk.models.Customer;

import java.io.UnsupportedEncodingException;

public class RNAltheaTalkableModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public RNAltheaTalkableModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "RNAltheaTalkable";
    }

    @ReactMethod
    public void showAdvocateSignUp() {

        Activity        activity        = getCurrentActivity();
        AffiliateMember affiliateMember = new AffiliateMember();

        if (activity != null) {

            Talkable.showOffer(activity, affiliateMember);
        }
    }

    @ReactMethod
    public void showAdvocateShare(ReadableMap readableMap, String campaignTag) {

        Activity                  activity = getCurrentActivity();
        ReadableMapKeySetIterator iterator = readableMap.keySetIterator();
        Customer                  customer = new Customer();

        if (activity == null) {

            return;
        }

        while (iterator.hasNextKey()) {

            String key = iterator.nextKey();

            switch (key) {

                case "customer_id":
                    customer.setId(readableMap.getString(key));
                    break;
                case "customer_email":
                    try {

                        customer.setEmail(readableMap.getString(key));
                    } catch (UnsupportedEncodingException ex) {

                        ex.printStackTrace();
                    }
                    break;
                case "customer_firstname":
                    customer.setFirstName(readableMap.getString(key));
                    break;
                case "customer_lastname":
                    customer.setLastName(readableMap.getString(key));
                    break;
                default:
                    // do nothing
            }
        }

        AffiliateMember affiliateMember = new AffiliateMember(customer);

        affiliateMember.setCampaignTag(campaignTag);
        Talkable.showOffer(activity, affiliateMember);
    }

}