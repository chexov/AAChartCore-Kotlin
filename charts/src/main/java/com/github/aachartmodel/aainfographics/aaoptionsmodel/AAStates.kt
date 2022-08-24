/**
 * Copyright (C), 2015-2020,
 * FileName: AAStates
 * Author: AnAn
 * Date: 2020-01-29 23:53
 * Description:
 * History:
 */
package com.github.aachartmodel.aainfographics.aaoptionsmodel

class AAStates {
    var hover: AAHover? = null
    var select: AASelect? = null
    var inactive: AAInactive? = null

    fun hover(prop: AAHover?): AAStates {
        hover = prop
        return this
    }

    fun select(prop: AASelect?): AAStates {
        select = prop
        return this
    }

    fun inactive(prop: AAInactive?): AAStates {
        inactive = prop
        return this
    }
}


class AAHover {
    var borderColor: String? = null
    var brightness: Float? = null
    var color: String? = null
    var halo: AAHalo? = null
    var lineWidth: Number? = null
    var lineWidthPlus: Number? = null
    fun borderColor(prop: String?): AAHover {
        borderColor = prop
        return this
    }

    fun brightness(prop: Float?): AAHover {
        brightness = prop
        return this
    }

    fun color(prop: String?): AAHover {
        color = prop
        return this
    }

    fun halo(prop: AAHalo?): AAHover {
        halo = prop
        return this
    }

    fun lineWidth(prop: Number?): AAHover {
        lineWidth = prop
        return this
    }

    fun lineWidthPlus(prop: Number?): AAHover {
        lineWidthPlus = prop
        return this
    }
}

class AASelect {
    var borderColor: String? = null
    var color: String? = null
    var halo: AAHalo? = null

    fun borderColor(prop: String?): AASelect {
        borderColor = prop
        return this
    }

    fun color(prop: String?): AASelect {
        color = prop
        return this
    }

    fun halo(prop: AAHalo?): AASelect {
        halo = prop
        return this
    }
}

class AAHalo {
    var attributes: Map<String, *>? = null
    var opacity: Float? = null
    var size: Number? = null

    fun attributes(prop: AASVGAttributes?): AAHalo {
        attributes = prop?.toDic()
        return this
    }

    fun opacity(prop: Float?): AAHalo {
        opacity = prop
        return this
    }

    fun size(prop: Number?): AAHalo {
        size = prop
        return this
    }
}

class AAInactive {
    var enabled: Boolean? = null
    var opacity: Number? = null
    fun enabled(prop: Boolean?): AAInactive {
        enabled = prop
        return this
    }

    fun opacity(prop: Number?): AAInactive {
        opacity = prop
        return this
    }
}

class AASVGAttributes {
    var fill: String? = null
    var stroke: String? = null
    var strokeWidth: Number? = null

    fun fill(prop: String?): AASVGAttributes {
        fill = prop
        return this
    }

    fun stroke(prop: String?): AASVGAttributes {
        stroke = prop
        return this
    }

    fun strokeWidth(prop: Number?): AASVGAttributes {
        strokeWidth = prop
        return this
    }

    fun toDic(): Map<String, Any> {
        val dic: MutableMap<String, Any> = HashMap()
        if (strokeWidth != null) {
            dic["stroke-width"] = strokeWidth!!
        }
        if (fill != null) {
            dic["fill"] = fill!!
        }
        if (stroke != null) {
            dic["stroke"] = stroke!!
        }
        return dic
    }

}

