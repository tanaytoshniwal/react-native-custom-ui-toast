import React from 'react';
import { StyleSheet } from 'react-native'
import { Button, Text, View } from 'native-base'
import CustomUiToast from 'react-native-custom-ui-toast';
import Icon from 'react-native-vector-icons/FontAwesome';

class App extends React.Component {
  showToast = (position) => {
    CustomUiToast.showToast(
      "hello world",
      3000, {
        position: position,
        offsetX: 0,
        offsetY: 0,
        backgroundColor: '#000000',
        color: '#ffffff'
      })
  }
  render() {
    return (
      <View style={styles.view}>
        <Button style={styles.btn} bordered dark rounded iconLeft iconRight onPress={() => {
          this.showToast('top')
        }} >
          <Icon name="comment-o" size={18} color={'rgb(90, 90, 90)'} />
          <Text>Show Toast - Top</Text>
          <Icon name="android" size={18} color={'#00c68c'} />
        </Button>
        <Button style={styles.btn} bordered dark rounded iconLeft iconRight onPress={() => {
          this.showToast('topleft')
        }} >
          <Icon name="comment-o" size={18} color={'rgb(90, 90, 90)'} />
          <Text>Show Toast - Top Left</Text>
          <Icon name="android" size={18} color={'#00c68c'} />
        </Button>
        <Button style={styles.btn} bordered dark rounded iconLeft iconRight onPress={() => {
          this.showToast('topright')
        }} >
          <Icon name="comment-o" size={18} color={'rgb(90, 90, 90)'} />
          <Text>Show Toast - Top Right</Text>
          <Icon name="android" size={18} color={'#00c68c'} />
        </Button>
        <Button style={styles.btn} bordered dark rounded iconLeft iconRight onPress={() => {
          this.showToast('center')
        }} >
          <Icon name="comment-o" size={18} color={'rgb(90, 90, 90)'} />
          <Text>Show Toast - Center</Text>
          <Icon name="android" size={18} color={'#00c68c'} />
        </Button>
        <Button style={styles.btn} bordered dark rounded iconLeft iconRight onPress={() => {
          this.showToast('centerleft')
        }} >
          <Icon name="comment-o" size={18} color={'rgb(90, 90, 90)'} />
          <Text>Show Toast - Center Left</Text>
          <Icon name="android" size={18} color={'#00c68c'} />
        </Button>
        <Button style={styles.btn} bordered dark rounded iconLeft iconRight onPress={() => {
          this.showToast('centerright')
        }} >
          <Icon name="comment-o" size={18} color={'rgb(90, 90, 90)'} />
          <Text>Show Toast - Center Right</Text>
          <Icon name="android" size={18} color={'#00c68c'} />
        </Button>
        <Button style={styles.btn} bordered dark rounded iconLeft iconRight onPress={() => {
          this.showToast('bottom')
        }} >
          <Icon name="comment-o" size={18} color={'rgb(90, 90, 90)'} />
          <Text>Show Toast - Bottom</Text>
          <Icon name="android" size={18} color={'#00c68c'} />
        </Button>
        <Button style={styles.btn} bordered dark rounded iconLeft iconRight onPress={() => {
          this.showToast('bottomleft')
        }} >
          <Icon name="comment-o" size={18} color={'rgb(90, 90, 90)'} />
          <Text>Show Toast - Bottom Left</Text>
          <Icon name="android" size={18} color={'#00c68c'} />
        </Button>
        <Button style={styles.btn} bordered dark rounded iconLeft iconRight onPress={() => {
          this.showToast('bottomright')
        }} >
          <Icon name="comment-o" size={18} color={'rgb(90, 90, 90)'} />
          <Text>Show Toast - Bottom Right</Text>
          <Icon name="android" size={18} color={'#00c68c'} />
        </Button>
      </View>
    );
  }
};

const styles = StyleSheet.create({
  view: {
    flex: 1,
    flexDirection: 'column',
    justifyContent: 'center',
    padding: 45,
    alignItems: 'center'
  },
  btn: {
    paddingHorizontal: 10,
    marginVertical: 10,
    justifyContent: 'center'
  }
})

export default App;
