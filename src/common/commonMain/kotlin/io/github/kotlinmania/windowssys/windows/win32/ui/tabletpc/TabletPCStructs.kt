@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Colorref
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.system.variant.Variant
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Nmhdr

public data class CharacterRange(public var wcLow: UShort = 0u, public var cChars: UShort = 0u)

public data class DynamicRendererCachedData(public var strokeId: Int = 0, public var dynamicRenderer: COpaquePointer? = null)

public data class FlickData(public var bitfield: Int = 0)

public data class FlickPoint(public var bitfield: Int = 0)

public data class GestureData(
    public var gestureId: Int = 0,
    public var recoConfidence: Int = 0,
    public var strokeCount: Int = 0,
)

public data class IecGestureinfo(
    public var nmhdr: Nmhdr = Nmhdr(),
    public var cursor: COpaquePointer? = null,
    public var strokes: COpaquePointer? = null,
    public var gestures: Variant = Variant(),
)

public data class IecRecognitionresultinfo(public var nmhdr: Nmhdr = Nmhdr(), public var recognitionResult: COpaquePointer? = null)

public data class IecStrokeinfo(
    public var nmhdr: Nmhdr = Nmhdr(),
    public var cursor: COpaquePointer? = null,
    public var stroke: COpaquePointer? = null,
)

public data class Inkmetric(
    public var iHeight: Int = 0,
    public var iFontAscent: Int = 0,
    public var iFontDescent: Int = 0,
    public var dwFlags: UInt = 0u,
    public var color: Colorref = 0u,
)

public data class InkRecoGuide(
    public var rectWritingBox: Rect = Rect(),
    public var rectDrawnBox: Rect = Rect(),
    public var cRows: Int = 0,
    public var cColumns: Int = 0,
    public var midline: Int = 0,
)

public data class LatticeMetrics(public var lsBaseline: LineSegment = LineSegment(), public var iMidlineOffset: Short = 0)

public data class LineSegment(public var ptA: Point = Point(), public var ptB: Point = Point())

public data class PacketDescription(
    public var cbPacketSize: UInt = 0u,
    public var cPacketProperties: UInt = 0u,
    public var pPacketProperties: PacketProperty? = null,
    public var cButtons: UInt = 0u,
    public var pguidButtons: Guid? = null,
)

public data class PacketProperty(public var guid: Guid = Guid(), public var propertyMetrics: PropertyMetrics = PropertyMetrics())

public data class PropertyMetrics(
    public var nLogicalMin: Int = 0,
    public var nLogicalMax: Int = 0,
    public var units: PropertyUnits = 0,
    public var fResolution: Float = 0.0f,
)

public data class RecoAttrs(
    public var dwRecoCapabilityFlags: UInt = 0u,
    public var awcVendorName: UShortArray = UShortArray(32),
    public var awcFriendlyName: UShortArray = UShortArray(64),
    public var awLanguageId: UShortArray = UShortArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RecoAttrs) return false
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

public data class RecoGuide(
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

public data class RecoLattice(
    public var ulColumnCount: UInt = 0u,
    public var pLatticeColumns: RecoLatticeColumn? = null,
    public var ulPropertyCount: UInt = 0u,
    public var pGuidProperties: Guid? = null,
    public var ulBestResultColumnCount: UInt = 0u,
    public var pulBestResultColumns: UInt? = null,
    public var pulBestResultIndexes: UInt? = null,
)

public data class RecoLatticeColumn(
    public var key: UInt = 0u,
    public var cpProp: RecoLatticeProperties = RecoLatticeProperties(),
    public var cStrokes: UInt = 0u,
    public var pStrokes: UInt? = null,
    public var cLatticeElements: UInt = 0u,
    public var pLatticeElements: RecoLatticeElement? = null,
)

public data class RecoLatticeElement(
    public var score: Int = 0,
    public var type: UShort = 0u,
    public var pData: COpaquePointer? = null,
    public var ulNextColumn: UInt = 0u,
    public var ulStrokeNumber: UInt = 0u,
    public var epProp: RecoLatticeProperties = RecoLatticeProperties(),
)

public data class RecoLatticeProperties(public var cProperties: UInt = 0u, public var apProps: COpaquePointer? = null)

public data class RecoLatticeProperty(
    public var guidProperty: Guid = Guid(),
    public var cbPropertyValue: UShort = 0u,
    public var pPropertyValue: COpaquePointer? = null,
)

public data class RecoRange(public var iwcBegin: UInt = 0u, public var cCount: UInt = 0u)

public data class StrokeRange(public var iStrokeBegin: UInt = 0u, public var iStrokeEnd: UInt = 0u)

public data class SystemEventData(
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
    public var bIsInvertedCursor: Bool = 0,
)
