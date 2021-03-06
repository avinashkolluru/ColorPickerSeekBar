ColorPickerSeekBar
==================

ColorPickerSeekBar is an extension of SeekBar Android Widget for choosing a color. User can touch the thumb and drag left or right to set the color.

<img src='./ColorPickerSeekBar-Screenshot.png' width='270' height='480' />

This github repo contains 2 modules

1. ColorPickerSeekBar (com.ak.android.widget.colorpickerseekbar) which is an Android Library
2. ColorPickerSampleApp - A sample app showing how to use the above library

<h3>Setup</h3>
The library is now only compatible with Gradle out of the box. To use this library in your project, either:

* Add the dependency from Maven: 
`compile 'com.github.avinashkolluru.colorpickerseekbar:library:1.0-SNAPSHOT'`. You'll also need to add the Sonatype snapshots repository to your repositories {} tag:
~~~
repositories {
    mavenCentral()
    maven {
        url 'https://oss.sonatype.org/content/repositories/snapshots'
    }
}
~~~

* Copy the library project(ColorPickerSeekBar) into your Gradle project. In your settings.gradle, add the project (using the include (':ColorPickerSeekBar') notation) and add a dependency to the library module in your app. Sync Gradle and then go ahead!

<h3>Usage</h3>
To use the ColorPickerSeekBar all you have to do is import the library, add it as a dependency and define the view

~~~
 <com.ak.android.widget.colorpickerseekbar.ColorPickerSeekBar
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/colorpicker"/>
~~~

To receive color change events when the user drags along the seekbar register a ColorPickerSeekBar.OnColorSeekBarChangeListener

~~~

colorPickerSeekBar.setOnColorSeekbarChangeListener(new ColorPickerSeekBar.OnColorSeekBarChangeListener() {
            @Override
            public void onColorChanged(SeekBar seekBar, int color, boolean fromUser) {
                view.setBackgroundColor(color);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

~~~
