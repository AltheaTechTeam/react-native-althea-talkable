
# react-native-althea-talkable

## Getting started

`$ npm install react-native-althea-talkable --save`

### Mostly automatic installation

`$ react-native link react-native-althea-talkable`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-althea-talkable` and add `RNAltheaTalkable.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNAltheaTalkable.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<


#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNAltheaTalkablePackage;` to the imports at the top of the file
  - Add `new RNAltheaTalkablePackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-althea-talkable'
  	project(':react-native-althea-talkable').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-althea-talkable/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-althea-talkable')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNAltheaTalkable.sln` in `node_modules/react-native-althea-talkable/windows/RNAltheaTalkable.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Com.Reactlibrary.RNAltheaTalkable;` to the usings at the top of the file
  - Add `new RNAltheaTalkablePackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNAltheaTalkable from 'react-native-althea-talkable';

// TODO: What to do with the module?
RNAltheaTalkable;
```
  
