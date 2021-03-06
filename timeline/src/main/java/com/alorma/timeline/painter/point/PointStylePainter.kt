package com.alorma.timeline.painter.point

import android.content.res.TypedArray
import android.graphics.Canvas
import android.graphics.Rect
import com.alorma.timeline.property.Property

abstract class PointStylePainter {

    open fun initProperties(typedArray: TypedArray) {

    }

    open fun initColors(strokeColor: Int, fillColor: Int) {

    }

    open fun initSizes(strokeSize: Float, fillSize: Float) {

    }

    open fun <T> updateProperty(property: Property<T>) {

    }

    open fun draw(canvas: Canvas, rect: Rect) {

    }
}