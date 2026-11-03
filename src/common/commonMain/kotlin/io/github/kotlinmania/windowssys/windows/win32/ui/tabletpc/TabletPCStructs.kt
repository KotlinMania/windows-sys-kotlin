@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID

public data class CHARACTER_RANGE(public var wcLow: UShort = 0u, public var cChars: UShort = 0u)

public data class DYNAMIC_RENDERER_CACHED_DATA(public var strokeId: Int = 0, public var dynamicRenderer: Long = 0L)

public data class FLICK_DATA(public var _bitfield: Int = 0)

public data class FLICK_POINT(public var _bitfield: Int = 0)

public data class GESTURE_DATA(
    public var gestureId: Int = 0,
    public var recoConfidence: Int = 0,
    public var strokeCount: Int = 0,
)

public data class IEC_GESTUREINFO(
    public var nmhdr: Controls.NMHDR = Controls.NMHDR(),
    public var Cursor: Long = 0L,
    public var Strokes: Long = 0L,
    public var Gestures: System.Variant.VARIANT = System.Variant.VARIANT(),
)

public data class IEC_RECOGNITIONRESULTINFO(public var nmhdr: Controls.NMHDR = Controls.NMHDR(), public var RecognitionResult: Long = 0L)

public data class IEC_STROKEINFO(
    public var nmhdr: Controls.NMHDR = Controls.NMHDR(),
    public var Cursor: Long = 0L,
    public var Stroke: Long = 0L,
)

public data class INKMETRIC(
    public var iHeight: Int = 0,
    public var iFontAscent: Int = 0,
    public var iFontDescent: Int = 0,
    public var dwFlags: UInt = 0u,
    public var color: Foundation.COLORREF = Foundation.COLORREF(),
)

public data class InkRecoGuide(
    public var rectWritingBox: Foundation.RECT = Foundation.RECT(),
    public var rectDrawnBox: Foundation.RECT = Foundation.RECT(),
    public var cRows: Int = 0,
    public var cColumns: Int = 0,
    public var midline: Int = 0,
)

public data class LATTICE_METRICS(public var lsBaseline: LINE_SEGMENT = LINE_SEGMENT(), public var iMidlineOffset: Short = 0)

public data class LINE_SEGMENT(public var PtA: Foundation.POINT = Foundation.POINT(), public var PtB: Foundation.POINT = Foundation.POINT())

public data class PACKET_DESCRIPTION(
    public var cbPacketSize: UInt = 0u,
    public var cPacketProperties: UInt = 0u,
    public var pPacketProperties: Long = 0L,
    public var cButtons: UInt = 0u,
    public var pguidButtons: Long = 0L,
)

public data class PACKET_PROPERTY(public var guid: GUID = GUID(), public var PropertyMetrics: PROPERTY_METRICS = PROPERTY_METRICS())

public data class PROPERTY_METRICS(
    public var nLogicalMin: Int = 0,
    public var nLogicalMax: Int = 0,
    public var Units: PROPERTY_UNITS = 0,
    public var fResolution: Float = 0.0f,
)

public data class RECO_ATTRS(
    public var dwRecoCapabilityFlags: UInt = 0u,
    public var awcVendorName: UShortArray = UShortArray(32),
    public var awcFriendlyName: UShortArray = UShortArray(64),
    public var awLanguageId: UShortArray = UShortArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RECO_ATTRS) return false
        if (this.dwRecoCapabilityFlags != other.dwRecoCapabilityFlags) return false
        if (!this.awcVendorName.contentEquals(other.awcVendorName)) return false
        if (!this.awcFriendlyName.contentEquals(other.awcFriendlyName)) return false
        if (!this.awLanguageId.contentEquals(other.awLanguageId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwRecoCapabilityFlags.hashCode()
        result = 31 * result + this.awcVendorName.contentHashCode()
        result = 31 * result + this.awcFriendlyName.contentHashCode()
        result = 31 * result + this.awLanguageId.contentHashCode()
        return result
    }
}

public data class RECO_GUIDE(
    public var xOrigin: Int = 0,
    public var yOrigin: Int = 0,
    public var cxBox: Int = 0,
    public var cyBox: Int = 0,
    public var cxBase: Int = 0,
    public var cyBase: Int = 0,
    public var cHorzBox: Int = 0,
    public var cVertBox: Int = 0,
    public var cyMid: Int = 0,
)

public data class RECO_LATTICE(
    public var ulColumnCount: UInt = 0u,
    public var pLatticeColumns: Long = 0L,
    public var ulPropertyCount: UInt = 0u,
    public var pGuidProperties: Long = 0L,
    public var ulBestResultColumnCount: UInt = 0u,
    public var pulBestResultColumns: Long = 0L,
    public var pulBestResultIndexes: Long = 0L,
)

public data class RECO_LATTICE_COLUMN(
    public var key: UInt = 0u,
    public var cpProp: RECO_LATTICE_PROPERTIES = RECO_LATTICE_PROPERTIES(),
    public var cStrokes: UInt = 0u,
    public var pStrokes: Long = 0L,
    public var cLatticeElements: UInt = 0u,
    public var pLatticeElements: Long = 0L,
)

public data class RECO_LATTICE_ELEMENT(
    public var score: Int = 0,
    public var type: UShort = 0u,
    public var pData: Long = 0L,
    public var ulNextColumn: UInt = 0u,
    public var ulStrokeNumber: UInt = 0u,
    public var epProp: RECO_LATTICE_PROPERTIES = RECO_LATTICE_PROPERTIES(),
)

public data class RECO_LATTICE_PROPERTIES(public var cProperties: UInt = 0u, public var apProps: Long = 0L)

public data class RECO_LATTICE_PROPERTY(
    public var guidProperty: GUID = GUID(),
    public var cbPropertyValue: UShort = 0u,
    public var pPropertyValue: Long = 0L,
)

public data class RECO_RANGE(public var iwcBegin: UInt = 0u, public var cCount: UInt = 0u)

public data class STROKE_RANGE(public var iStrokeBegin: UInt = 0u, public var iStrokeEnd: UInt = 0u)

public data class SYSTEM_EVENT_DATA(
    public var bModifier: UByte = 0u,
    public var wKey: UShort = 0u,
    public var xPos: Int = 0,
    public var yPos: Int = 0,
    public var bCursorMode: UByte = 0u,
    public var dwButtonState: UInt = 0u,
)

public data class StylusInfo(
    public var tcid: UInt = 0u,
    public var cid: UInt = 0u,
    public var bIsInvertedCursor: BOOL = 0,
)
