Android Lifecycle
=============

A 'compatibility' version of the ActivityLifecycleCallbacks APIs (http://developer.android.com/reference/android/app/Application.ActivityLifecycleCallbacks.html)
that were introduced in Android 4 (API Level 14) and adding similar mechanism for Fragment.

Why & When you need this
=============

The reason google introduced ActivityLifecycleCallbacks APIs in Android 4 is try to simplify and modularize the code which need to "inject" to Activity's lifecycle.

For instance the Google Analytics service requires call a specific method in onStart and onStop of all activities, another good example is ViewServer enable developer inspect UI hierarchy in an un-rooted device.

Further more, you might expect those code could be plug-in or out in your building, and this library can make it easier for you.

More info about ActivityLifecycleCallbacks APIs, please check android documents.

Since fragment play more and more important role in android UI development(One Activity + fragments), you would need similar tools to simplify your fragment development.

How to use
=============

- You can grab the jar from Maven Central Repository and put it to your libs dictionary
- Maven
```xml
<dependency>
  <groupId>com.cocosw</groupId>
  <artifactId>lifecycle</artifactId>
  <version>0.1</version>
</dependency>
```
- Gradle
```xml
compile 'com.cocosw:lifecycle:0.1'
```

API
============

- Have all your activities extend one of the base activities in the `com.cocosw.lifecycle.app` package.

- Create your activity/fragment lifecycle callbacks class extend from `ActivityLifecycleCallbacksCompat` and `FragmentLifecycleCallbacks`

- Call `LifecycleDispatcher.registerActivityLifecycleCallbacks(this, callback)` and/or `LifecycleDispatcher.registerFragmentLifecycleCallbacks(this, callback)`.


For Android 4.0
============

- This library will use build-in activity lifecycle mechanism for API >14 target platform.
- If you decide to drop 2.x support and move to android activity lifecycle API, you could done that by modify few lines, because the API is basically the same as the official one.


ActionBarSherlock or AppCompact
============

If you use a library that already requires your activities to extend a base class, you can simply create your own base activity.

Licence
============

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.