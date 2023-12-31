/*
 * Copyright © 2017-2019 Harvard Pilgrim Health Care Institute (HPHCI) and its Contributors.
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial
 * portions of the Software.
 *
 * Funding Source: Food and Drug Administration (“Funding Agency”) effective 18 September 2014 as Contract no. HHSF22320140030I/HHSF22301006T (the “Prime Contract”).
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.harvard.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class NetworkChangeReceiver<T, V> extends BroadcastReceiver {

  private NetworkChangeCallback callback;

  public NetworkChangeReceiver(V v) {
    this.callback = (NetworkChangeCallback) v;
  }

  @Override
  public void onReceive(Context context, Intent intent) {
    boolean status = isNetworkAvailable(context);
    if (callback != null) {
      callback.onNetworkChanged(status);
    }
  }

  private boolean isNetworkAvailable(Context context) {
    try {
      ConnectivityManager cm = (ConnectivityManager)
          context.getSystemService(Context.CONNECTIVITY_SERVICE);
      NetworkInfo activeNetworkInfo = cm.getActiveNetworkInfo();
      return (activeNetworkInfo != null
          && ((NetworkInfo) activeNetworkInfo).isConnectedOrConnecting());
    } catch (NullPointerException e) {
      return false;
    }
  }

  public interface NetworkChangeCallback {
    void onNetworkChanged(boolean status);
  }
}

