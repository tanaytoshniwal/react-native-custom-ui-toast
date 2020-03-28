# react-native-custom-ui-toast

A simple custom toast library. **(Currently only availabe for android devices)**

## Getting started

`$ npm install react-native-custom-ui-toast --save`

### Mostly automatic installation

`$ react-native link react-native-custom-ui-toast`

## Example Application
Checkout the [GitHub page](https://github.com/tanaytoshniwal/react-native-custom-ui-toast/tree/master/example) to get the code of this application

<img src="https://github.com/tanaytoshniwal/react-native-custom-ui-toast/blob/master/screenshots/react-native-custom-ui-toast.gif" width="400" />

## Usage
Import the library in your component by adding this line on top:
```javascript
import CustomUiToast from 'react-native-custom-ui-toast';
```
Use **showToast** method to display a toast:
```javascript
CustomUiToast.showToast(
    // Toast Message
    "hello world",
    // Toast Duration
    3000,
    // Style Object
    {
        // Toast position
        position: 'bottom',
        // Toast Offset on x-axis
        offsetX: 0,
        // Toast Offset on y-axis
        offsetY: 0,
        // Toast Background color
        backgroundColor: '#000000',
        // Toast Text color
        color: '#ffffff'
    })
```

## Arguments

| Argument | Argument Type |  Description |
|:--------:|:-------------:|:------------:|
| Message | String | Toast Message |
| Duration | Number | Toast Duration |
| Styles | Object | Toast Styling Object |

### Styles

| Style | Style Type | Default |  Description |
|:--------:|:-------------:|:------------:|:------------:|
| position | String | bottom | Toast Position |
| offsetX | Number | 0 | Toast Offset on x-axis |
| offsetY | Number | 0 | Toast Offset on y-axis |
| backgroundColor | String | #AAAAAA | Toast Background Color |
| color | String | #000000 | Toast Text Color |

### Positions

| Position |   Description |
|:--------:|:------------:|
| top | Set toast position to Top Center |
| topleft | Set toast position to Top Left |
| topright | Set toast position to Top Right |
| center | Set toast position to Center |
| centerleft | Set toast position to Center Left |
| centerright | Set toast position to Center Right |
| bottom | Set toast position to Bottom |
| bottomleft | Set toast position to Bottom Left |
| bottomright | Set toast position to Bottom Right |
