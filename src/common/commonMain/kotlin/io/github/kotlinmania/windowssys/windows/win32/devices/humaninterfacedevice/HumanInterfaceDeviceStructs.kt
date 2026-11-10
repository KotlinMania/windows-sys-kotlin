@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect

public data class Cpoint(public var lP: Int = 0, public var dwLog: UInt = 0u)

public data class Diactiona(
    public var uAppData: Int = 0,
    public var dwSemantic: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var anonymous: Diactiona0 = Diactiona0(),
    public var guidInstance: Guid = Guid(),
    public var dwObjID: UInt = 0u,
    public var dwHow: UInt = 0u,
)

public data class Diactiona0(public var lptszActionName: Pcstr = null, public var uResIdString: UInt = 0u)

public data class Diactionformata(
    public var dwSize: UInt = 0u,
    public var dwActionSize: UInt = 0u,
    public var dwDataSize: UInt = 0u,
    public var dwNumActions: UInt = 0u,
    public var rgoAction: Diactiona? = null,
    public var guidActionMap: Guid = Guid(),
    public var dwGenre: UInt = 0u,
    public var dwBufferSize: UInt = 0u,
    public var lAxisMin: Int = 0,
    public var lAxisMax: Int = 0,
    public var hInstString: Hinstance = null,
    public var ftTimeStamp: Filetime = Filetime(),
    public var dwCRC: UInt = 0u,
    public var tszActionMap: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Diactionformata) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwActionSize != other.dwActionSize) return false
        if (this.dwDataSize != other.dwDataSize) return false
        if (this.dwNumActions != other.dwNumActions) return false
        if (this.rgoAction != other.rgoAction) return false
        if (this.guidActionMap != other.guidActionMap) return false
        if (this.dwGenre != other.dwGenre) return false
        if (this.dwBufferSize != other.dwBufferSize) return false
        if (this.lAxisMin != other.lAxisMin) return false
        if (this.lAxisMax != other.lAxisMax) return false
        if (this.hInstString != other.hInstString) return false
        if (this.ftTimeStamp != other.ftTimeStamp) return false
        if (this.dwCRC != other.dwCRC) return false
        if (!this.tszActionMap.contentEquals(other.tszActionMap)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwActionSize.hashCode()
        result = 31 * result + this.dwDataSize.hashCode()
        result = 31 * result + this.dwNumActions.hashCode()
        result = 31 * result + this.rgoAction.hashCode()
        result = 31 * result + this.guidActionMap.hashCode()
        result = 31 * result + this.dwGenre.hashCode()
        result = 31 * result + this.dwBufferSize.hashCode()
        result = 31 * result + this.lAxisMin.hashCode()
        result = 31 * result + this.lAxisMax.hashCode()
        result = 31 * result + this.hInstString.hashCode()
        result = 31 * result + this.ftTimeStamp.hashCode()
        result = 31 * result + this.dwCRC.hashCode()
        result = 31 * result + this.tszActionMap.contentHashCode()
        return result
    }
}

public data class Diactionformatw(
    public var dwSize: UInt = 0u,
    public var dwActionSize: UInt = 0u,
    public var dwDataSize: UInt = 0u,
    public var dwNumActions: UInt = 0u,
    public var rgoAction: Diactionw? = null,
    public var guidActionMap: Guid = Guid(),
    public var dwGenre: UInt = 0u,
    public var dwBufferSize: UInt = 0u,
    public var lAxisMin: Int = 0,
    public var lAxisMax: Int = 0,
    public var hInstString: Hinstance = null,
    public var ftTimeStamp: Filetime = Filetime(),
    public var dwCRC: UInt = 0u,
    public var tszActionMap: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Diactionformatw) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwActionSize != other.dwActionSize) return false
        if (this.dwDataSize != other.dwDataSize) return false
        if (this.dwNumActions != other.dwNumActions) return false
        if (this.rgoAction != other.rgoAction) return false
        if (this.guidActionMap != other.guidActionMap) return false
        if (this.dwGenre != other.dwGenre) return false
        if (this.dwBufferSize != other.dwBufferSize) return false
        if (this.lAxisMin != other.lAxisMin) return false
        if (this.lAxisMax != other.lAxisMax) return false
        if (this.hInstString != other.hInstString) return false
        if (this.ftTimeStamp != other.ftTimeStamp) return false
        if (this.dwCRC != other.dwCRC) return false
        if (!this.tszActionMap.contentEquals(other.tszActionMap)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwActionSize.hashCode()
        result = 31 * result + this.dwDataSize.hashCode()
        result = 31 * result + this.dwNumActions.hashCode()
        result = 31 * result + this.rgoAction.hashCode()
        result = 31 * result + this.guidActionMap.hashCode()
        result = 31 * result + this.dwGenre.hashCode()
        result = 31 * result + this.dwBufferSize.hashCode()
        result = 31 * result + this.lAxisMin.hashCode()
        result = 31 * result + this.lAxisMax.hashCode()
        result = 31 * result + this.hInstString.hashCode()
        result = 31 * result + this.ftTimeStamp.hashCode()
        result = 31 * result + this.dwCRC.hashCode()
        result = 31 * result + this.tszActionMap.contentHashCode()
        return result
    }
}

public data class Diactionw(
    public var uAppData: Int = 0,
    public var dwSemantic: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var anonymous: Diactionw0 = Diactionw0(),
    public var guidInstance: Guid = Guid(),
    public var dwObjID: UInt = 0u,
    public var dwHow: UInt = 0u,
)

public data class Diactionw0(public var lptszActionName: Pcwstr = null, public var uResIdString: UInt = 0u)

public data class Dicolorset(
    public var dwSize: UInt = 0u,
    public var cTextFore: UInt = 0u,
    public var cTextHighlight: UInt = 0u,
    public var cCalloutLine: UInt = 0u,
    public var cCalloutHighlight: UInt = 0u,
    public var cBorder: UInt = 0u,
    public var cControlFill: UInt = 0u,
    public var cHighlightFill: UInt = 0u,
    public var cAreaFill: UInt = 0u,
)

public data class Dicondition(
    public var lOffset: Int = 0,
    public var lPositiveCoefficient: Int = 0,
    public var lNegativeCoefficient: Int = 0,
    public var dwPositiveSaturation: UInt = 0u,
    public var dwNegativeSaturation: UInt = 0u,
    public var lDeadBand: Int = 0,
)

public data class Diconfiguredevicesparamsa(
    public var dwSize: UInt = 0u,
    public var dwcUsers: UInt = 0u,
    public var lptszUserNames: Pstr = null,
    public var dwcFormats: UInt = 0u,
    public var lprgFormats: Diactionformata? = null,
    public var hwnd: Hwnd = null,
    public var dics: Dicolorset = Dicolorset(),
    public var lpUnkDDSTarget: COpaquePointer? = null,
)

public data class Diconfiguredevicesparamsw(
    public var dwSize: UInt = 0u,
    public var dwcUsers: UInt = 0u,
    public var lptszUserNames: Pwstr = null,
    public var dwcFormats: UInt = 0u,
    public var lprgFormats: Diactionformatw? = null,
    public var hwnd: Hwnd = null,
    public var dics: Dicolorset = Dicolorset(),
    public var lpUnkDDSTarget: COpaquePointer? = null,
)

public data class Diconstantforce(public var lMagnitude: Int = 0)

public data class Dicustomforce(
    public var cChannels: UInt = 0u,
    public var dwSamplePeriod: UInt = 0u,
    public var cSamples: UInt = 0u,
    public var rglForceData: Int? = null,
)

public data class Didataformat(
    public var dwSize: UInt = 0u,
    public var dwObjSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwDataSize: UInt = 0u,
    public var dwNumObjs: UInt = 0u,
    public var rgodf: Diobjectdataformat? = null,
)

public data class Didevcaps(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwDevType: UInt = 0u,
    public var dwAxes: UInt = 0u,
    public var dwButtons: UInt = 0u,
    public var dwPOVs: UInt = 0u,
    public var dwFFSamplePeriod: UInt = 0u,
    public var dwFFMinTimeResolution: UInt = 0u,
    public var dwFirmwareRevision: UInt = 0u,
    public var dwHardwareRevision: UInt = 0u,
    public var dwFFDriverVersion: UInt = 0u,
)

public data class DidevcapsDx3(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwDevType: UInt = 0u,
    public var dwAxes: UInt = 0u,
    public var dwButtons: UInt = 0u,
    public var dwPOVs: UInt = 0u,
)

public data class Dideviceimageinfoa(
    public var tszImagePath: ByteArray = ByteArray(260),
    public var dwFlags: UInt = 0u,
    public var dwViewID: UInt = 0u,
    public var rcOverlay: Rect = Rect(),
    public var dwObjID: UInt = 0u,
    public var dwcValidPts: UInt = 0u,
    public var rgptCalloutLine: List<Point> = List(5) { Point() },
    public var rcCalloutRect: Rect = Rect(),
    public var dwTextAlign: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dideviceimageinfoa) return false
        if (!this.tszImagePath.contentEquals(other.tszImagePath)) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwViewID != other.dwViewID) return false
        if (this.rcOverlay != other.rcOverlay) return false
        if (this.dwObjID != other.dwObjID) return false
        if (this.dwcValidPts != other.dwcValidPts) return false
        if (this.rgptCalloutLine != other.rgptCalloutLine) return false
        if (this.rcCalloutRect != other.rcCalloutRect) return false
        if (this.dwTextAlign != other.dwTextAlign) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.tszImagePath.contentHashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwViewID.hashCode()
        result = 31 * result + this.rcOverlay.hashCode()
        result = 31 * result + this.dwObjID.hashCode()
        result = 31 * result + this.dwcValidPts.hashCode()
        result = 31 * result + this.rgptCalloutLine.hashCode()
        result = 31 * result + this.rcCalloutRect.hashCode()
        result = 31 * result + this.dwTextAlign.hashCode()
        return result
    }
}

public data class Dideviceimageinfoheadera(
    public var dwSize: UInt = 0u,
    public var dwSizeImageInfo: UInt = 0u,
    public var dwcViews: UInt = 0u,
    public var dwcButtons: UInt = 0u,
    public var dwcAxes: UInt = 0u,
    public var dwcPOVs: UInt = 0u,
    public var dwBufferSize: UInt = 0u,
    public var dwBufferUsed: UInt = 0u,
    public var lprgImageInfoArray: Dideviceimageinfoa? = null,
)

public data class Dideviceimageinfoheaderw(
    public var dwSize: UInt = 0u,
    public var dwSizeImageInfo: UInt = 0u,
    public var dwcViews: UInt = 0u,
    public var dwcButtons: UInt = 0u,
    public var dwcAxes: UInt = 0u,
    public var dwcPOVs: UInt = 0u,
    public var dwBufferSize: UInt = 0u,
    public var dwBufferUsed: UInt = 0u,
    public var lprgImageInfoArray: Dideviceimageinfow? = null,
)

public data class Dideviceimageinfow(
    public var tszImagePath: UShortArray = UShortArray(260),
    public var dwFlags: UInt = 0u,
    public var dwViewID: UInt = 0u,
    public var rcOverlay: Rect = Rect(),
    public var dwObjID: UInt = 0u,
    public var dwcValidPts: UInt = 0u,
    public var rgptCalloutLine: List<Point> = List(5) { Point() },
    public var rcCalloutRect: Rect = Rect(),
    public var dwTextAlign: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dideviceimageinfow) return false
        if (!this.tszImagePath.contentEquals(other.tszImagePath)) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwViewID != other.dwViewID) return false
        if (this.rcOverlay != other.rcOverlay) return false
        if (this.dwObjID != other.dwObjID) return false
        if (this.dwcValidPts != other.dwcValidPts) return false
        if (this.rgptCalloutLine != other.rgptCalloutLine) return false
        if (this.rcCalloutRect != other.rcCalloutRect) return false
        if (this.dwTextAlign != other.dwTextAlign) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.tszImagePath.contentHashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwViewID.hashCode()
        result = 31 * result + this.rcOverlay.hashCode()
        result = 31 * result + this.dwObjID.hashCode()
        result = 31 * result + this.dwcValidPts.hashCode()
        result = 31 * result + this.rgptCalloutLine.hashCode()
        result = 31 * result + this.rcCalloutRect.hashCode()
        result = 31 * result + this.dwTextAlign.hashCode()
        return result
    }
}

public data class Dideviceinstancea(
    public var dwSize: UInt = 0u,
    public var guidInstance: Guid = Guid(),
    public var guidProduct: Guid = Guid(),
    public var dwDevType: UInt = 0u,
    public var tszInstanceName: ByteArray = ByteArray(260),
    public var tszProductName: ByteArray = ByteArray(260),
    public var guidFFDriver: Guid = Guid(),
    public var wUsagePage: UShort = 0u,
    public var wUsage: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dideviceinstancea) return false
        if (this.dwSize != other.dwSize) return false
        if (this.guidInstance != other.guidInstance) return false
        if (this.guidProduct != other.guidProduct) return false
        if (this.dwDevType != other.dwDevType) return false
        if (!this.tszInstanceName.contentEquals(other.tszInstanceName)) return false
        if (!this.tszProductName.contentEquals(other.tszProductName)) return false
        if (this.guidFFDriver != other.guidFFDriver) return false
        if (this.wUsagePage != other.wUsagePage) return false
        if (this.wUsage != other.wUsage) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.guidInstance.hashCode()
        result = 31 * result + this.guidProduct.hashCode()
        result = 31 * result + this.dwDevType.hashCode()
        result = 31 * result + this.tszInstanceName.contentHashCode()
        result = 31 * result + this.tszProductName.contentHashCode()
        result = 31 * result + this.guidFFDriver.hashCode()
        result = 31 * result + this.wUsagePage.hashCode()
        result = 31 * result + this.wUsage.hashCode()
        return result
    }
}

public data class Dideviceinstancew(
    public var dwSize: UInt = 0u,
    public var guidInstance: Guid = Guid(),
    public var guidProduct: Guid = Guid(),
    public var dwDevType: UInt = 0u,
    public var tszInstanceName: UShortArray = UShortArray(260),
    public var tszProductName: UShortArray = UShortArray(260),
    public var guidFFDriver: Guid = Guid(),
    public var wUsagePage: UShort = 0u,
    public var wUsage: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dideviceinstancew) return false
        if (this.dwSize != other.dwSize) return false
        if (this.guidInstance != other.guidInstance) return false
        if (this.guidProduct != other.guidProduct) return false
        if (this.dwDevType != other.dwDevType) return false
        if (!this.tszInstanceName.contentEquals(other.tszInstanceName)) return false
        if (!this.tszProductName.contentEquals(other.tszProductName)) return false
        if (this.guidFFDriver != other.guidFFDriver) return false
        if (this.wUsagePage != other.wUsagePage) return false
        if (this.wUsage != other.wUsage) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.guidInstance.hashCode()
        result = 31 * result + this.guidProduct.hashCode()
        result = 31 * result + this.dwDevType.hashCode()
        result = 31 * result + this.tszInstanceName.contentHashCode()
        result = 31 * result + this.tszProductName.contentHashCode()
        result = 31 * result + this.guidFFDriver.hashCode()
        result = 31 * result + this.wUsagePage.hashCode()
        result = 31 * result + this.wUsage.hashCode()
        return result
    }
}

public data class DideviceinstanceDx3a(
    public var dwSize: UInt = 0u,
    public var guidInstance: Guid = Guid(),
    public var guidProduct: Guid = Guid(),
    public var dwDevType: UInt = 0u,
    public var tszInstanceName: ByteArray = ByteArray(260),
    public var tszProductName: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DideviceinstanceDx3a) return false
        if (this.dwSize != other.dwSize) return false
        if (this.guidInstance != other.guidInstance) return false
        if (this.guidProduct != other.guidProduct) return false
        if (this.dwDevType != other.dwDevType) return false
        if (!this.tszInstanceName.contentEquals(other.tszInstanceName)) return false
        if (!this.tszProductName.contentEquals(other.tszProductName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.guidInstance.hashCode()
        result = 31 * result + this.guidProduct.hashCode()
        result = 31 * result + this.dwDevType.hashCode()
        result = 31 * result + this.tszInstanceName.contentHashCode()
        result = 31 * result + this.tszProductName.contentHashCode()
        return result
    }
}

public data class DideviceinstanceDx3w(
    public var dwSize: UInt = 0u,
    public var guidInstance: Guid = Guid(),
    public var guidProduct: Guid = Guid(),
    public var dwDevType: UInt = 0u,
    public var tszInstanceName: UShortArray = UShortArray(260),
    public var tszProductName: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DideviceinstanceDx3w) return false
        if (this.dwSize != other.dwSize) return false
        if (this.guidInstance != other.guidInstance) return false
        if (this.guidProduct != other.guidProduct) return false
        if (this.dwDevType != other.dwDevType) return false
        if (!this.tszInstanceName.contentEquals(other.tszInstanceName)) return false
        if (!this.tszProductName.contentEquals(other.tszProductName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.guidInstance.hashCode()
        result = 31 * result + this.guidProduct.hashCode()
        result = 31 * result + this.dwDevType.hashCode()
        result = 31 * result + this.tszInstanceName.contentHashCode()
        result = 31 * result + this.tszProductName.contentHashCode()
        return result
    }
}

public data class Dideviceobjectdata(
    public var dwOfs: UInt = 0u,
    public var dwData: UInt = 0u,
    public var dwTimeStamp: UInt = 0u,
    public var dwSequence: UInt = 0u,
    public var uAppData: Int = 0,
)

public data class DideviceobjectdataDx3(
    public var dwOfs: UInt = 0u,
    public var dwData: UInt = 0u,
    public var dwTimeStamp: UInt = 0u,
    public var dwSequence: UInt = 0u,
)

public data class Dideviceobjectinstancea(
    public var dwSize: UInt = 0u,
    public var guidType: Guid = Guid(),
    public var dwOfs: UInt = 0u,
    public var dwType: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var tszName: ByteArray = ByteArray(260),
    public var dwFFMaxForce: UInt = 0u,
    public var dwFFForceResolution: UInt = 0u,
    public var wCollectionNumber: UShort = 0u,
    public var wDesignatorIndex: UShort = 0u,
    public var wUsagePage: UShort = 0u,
    public var wUsage: UShort = 0u,
    public var dwDimension: UInt = 0u,
    public var wExponent: UShort = 0u,
    public var wReportId: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dideviceobjectinstancea) return false
        if (this.dwSize != other.dwSize) return false
        if (this.guidType != other.guidType) return false
        if (this.dwOfs != other.dwOfs) return false
        if (this.dwType != other.dwType) return false
        if (this.dwFlags != other.dwFlags) return false
        if (!this.tszName.contentEquals(other.tszName)) return false
        if (this.dwFFMaxForce != other.dwFFMaxForce) return false
        if (this.dwFFForceResolution != other.dwFFForceResolution) return false
        if (this.wCollectionNumber != other.wCollectionNumber) return false
        if (this.wDesignatorIndex != other.wDesignatorIndex) return false
        if (this.wUsagePage != other.wUsagePage) return false
        if (this.wUsage != other.wUsage) return false
        if (this.dwDimension != other.dwDimension) return false
        if (this.wExponent != other.wExponent) return false
        if (this.wReportId != other.wReportId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.guidType.hashCode()
        result = 31 * result + this.dwOfs.hashCode()
        result = 31 * result + this.dwType.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.tszName.contentHashCode()
        result = 31 * result + this.dwFFMaxForce.hashCode()
        result = 31 * result + this.dwFFForceResolution.hashCode()
        result = 31 * result + this.wCollectionNumber.hashCode()
        result = 31 * result + this.wDesignatorIndex.hashCode()
        result = 31 * result + this.wUsagePage.hashCode()
        result = 31 * result + this.wUsage.hashCode()
        result = 31 * result + this.dwDimension.hashCode()
        result = 31 * result + this.wExponent.hashCode()
        result = 31 * result + this.wReportId.hashCode()
        return result
    }
}

public data class Dideviceobjectinstancew(
    public var dwSize: UInt = 0u,
    public var guidType: Guid = Guid(),
    public var dwOfs: UInt = 0u,
    public var dwType: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var tszName: UShortArray = UShortArray(260),
    public var dwFFMaxForce: UInt = 0u,
    public var dwFFForceResolution: UInt = 0u,
    public var wCollectionNumber: UShort = 0u,
    public var wDesignatorIndex: UShort = 0u,
    public var wUsagePage: UShort = 0u,
    public var wUsage: UShort = 0u,
    public var dwDimension: UInt = 0u,
    public var wExponent: UShort = 0u,
    public var wReportId: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dideviceobjectinstancew) return false
        if (this.dwSize != other.dwSize) return false
        if (this.guidType != other.guidType) return false
        if (this.dwOfs != other.dwOfs) return false
        if (this.dwType != other.dwType) return false
        if (this.dwFlags != other.dwFlags) return false
        if (!this.tszName.contentEquals(other.tszName)) return false
        if (this.dwFFMaxForce != other.dwFFMaxForce) return false
        if (this.dwFFForceResolution != other.dwFFForceResolution) return false
        if (this.wCollectionNumber != other.wCollectionNumber) return false
        if (this.wDesignatorIndex != other.wDesignatorIndex) return false
        if (this.wUsagePage != other.wUsagePage) return false
        if (this.wUsage != other.wUsage) return false
        if (this.dwDimension != other.dwDimension) return false
        if (this.wExponent != other.wExponent) return false
        if (this.wReportId != other.wReportId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.guidType.hashCode()
        result = 31 * result + this.dwOfs.hashCode()
        result = 31 * result + this.dwType.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.tszName.contentHashCode()
        result = 31 * result + this.dwFFMaxForce.hashCode()
        result = 31 * result + this.dwFFForceResolution.hashCode()
        result = 31 * result + this.wCollectionNumber.hashCode()
        result = 31 * result + this.wDesignatorIndex.hashCode()
        result = 31 * result + this.wUsagePage.hashCode()
        result = 31 * result + this.wUsage.hashCode()
        result = 31 * result + this.dwDimension.hashCode()
        result = 31 * result + this.wExponent.hashCode()
        result = 31 * result + this.wReportId.hashCode()
        return result
    }
}

public data class DideviceobjectinstanceDx3a(
    public var dwSize: UInt = 0u,
    public var guidType: Guid = Guid(),
    public var dwOfs: UInt = 0u,
    public var dwType: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var tszName: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DideviceobjectinstanceDx3a) return false
        if (this.dwSize != other.dwSize) return false
        if (this.guidType != other.guidType) return false
        if (this.dwOfs != other.dwOfs) return false
        if (this.dwType != other.dwType) return false
        if (this.dwFlags != other.dwFlags) return false
        if (!this.tszName.contentEquals(other.tszName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.guidType.hashCode()
        result = 31 * result + this.dwOfs.hashCode()
        result = 31 * result + this.dwType.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.tszName.contentHashCode()
        return result
    }
}

public data class DideviceobjectinstanceDx3w(
    public var dwSize: UInt = 0u,
    public var guidType: Guid = Guid(),
    public var dwOfs: UInt = 0u,
    public var dwType: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var tszName: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DideviceobjectinstanceDx3w) return false
        if (this.dwSize != other.dwSize) return false
        if (this.guidType != other.guidType) return false
        if (this.dwOfs != other.dwOfs) return false
        if (this.dwType != other.dwType) return false
        if (this.dwFlags != other.dwFlags) return false
        if (!this.tszName.contentEquals(other.tszName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.guidType.hashCode()
        result = 31 * result + this.dwOfs.hashCode()
        result = 31 * result + this.dwType.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.tszName.contentHashCode()
        return result
    }
}

public data class Didevicestate(
    public var dwSize: UInt = 0u,
    public var dwState: UInt = 0u,
    public var dwLoad: UInt = 0u,
)

public data class Didriverversions(
    public var dwSize: UInt = 0u,
    public var dwFirmwareRevision: UInt = 0u,
    public var dwHardwareRevision: UInt = 0u,
    public var dwFFDriverVersion: UInt = 0u,
)

public data class Dieffect(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwDuration: UInt = 0u,
    public var dwSamplePeriod: UInt = 0u,
    public var dwGain: UInt = 0u,
    public var dwTriggerButton: UInt = 0u,
    public var dwTriggerRepeatInterval: UInt = 0u,
    public var cAxes: UInt = 0u,
    public var rgdwAxes: UInt? = null,
    public var rglDirection: Int? = null,
    public var lpEnvelope: Dienvelope? = null,
    public var cbTypeSpecificParams: UInt = 0u,
    public var lpvTypeSpecificParams: COpaquePointer? = null,
    public var dwStartDelay: UInt = 0u,
)

public data class Dieffectattributes(
    public var dwEffectId: UInt = 0u,
    public var dwEffType: UInt = 0u,
    public var dwStaticParams: UInt = 0u,
    public var dwDynamicParams: UInt = 0u,
    public var dwCoords: UInt = 0u,
)

public data class Dieffectinfoa(
    public var dwSize: UInt = 0u,
    public var guid: Guid = Guid(),
    public var dwEffType: UInt = 0u,
    public var dwStaticParams: UInt = 0u,
    public var dwDynamicParams: UInt = 0u,
    public var tszName: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dieffectinfoa) return false
        if (this.dwSize != other.dwSize) return false
        if (this.guid != other.guid) return false
        if (this.dwEffType != other.dwEffType) return false
        if (this.dwStaticParams != other.dwStaticParams) return false
        if (this.dwDynamicParams != other.dwDynamicParams) return false
        if (!this.tszName.contentEquals(other.tszName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.guid.hashCode()
        result = 31 * result + this.dwEffType.hashCode()
        result = 31 * result + this.dwStaticParams.hashCode()
        result = 31 * result + this.dwDynamicParams.hashCode()
        result = 31 * result + this.tszName.contentHashCode()
        return result
    }
}

public data class Dieffectinfow(
    public var dwSize: UInt = 0u,
    public var guid: Guid = Guid(),
    public var dwEffType: UInt = 0u,
    public var dwStaticParams: UInt = 0u,
    public var dwDynamicParams: UInt = 0u,
    public var tszName: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dieffectinfow) return false
        if (this.dwSize != other.dwSize) return false
        if (this.guid != other.guid) return false
        if (this.dwEffType != other.dwEffType) return false
        if (this.dwStaticParams != other.dwStaticParams) return false
        if (this.dwDynamicParams != other.dwDynamicParams) return false
        if (!this.tszName.contentEquals(other.tszName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.guid.hashCode()
        result = 31 * result + this.dwEffType.hashCode()
        result = 31 * result + this.dwStaticParams.hashCode()
        result = 31 * result + this.dwDynamicParams.hashCode()
        result = 31 * result + this.tszName.contentHashCode()
        return result
    }
}

public data class DieffectDx5(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwDuration: UInt = 0u,
    public var dwSamplePeriod: UInt = 0u,
    public var dwGain: UInt = 0u,
    public var dwTriggerButton: UInt = 0u,
    public var dwTriggerRepeatInterval: UInt = 0u,
    public var cAxes: UInt = 0u,
    public var rgdwAxes: UInt? = null,
    public var rglDirection: Int? = null,
    public var lpEnvelope: Dienvelope? = null,
    public var cbTypeSpecificParams: UInt = 0u,
    public var lpvTypeSpecificParams: COpaquePointer? = null,
)

public data class Dieffescape(
    public var dwSize: UInt = 0u,
    public var dwCommand: UInt = 0u,
    public var lpvInBuffer: COpaquePointer? = null,
    public var cbInBuffer: UInt = 0u,
    public var lpvOutBuffer: COpaquePointer? = null,
    public var cbOutBuffer: UInt = 0u,
)

public data class Dienvelope(
    public var dwSize: UInt = 0u,
    public var dwAttackLevel: UInt = 0u,
    public var dwAttackTime: UInt = 0u,
    public var dwFadeLevel: UInt = 0u,
    public var dwFadeTime: UInt = 0u,
)

public data class Diffdeviceattributes(
    public var dwFlags: UInt = 0u,
    public var dwFFSamplePeriod: UInt = 0u,
    public var dwFFMinTimeResolution: UInt = 0u,
)

public data class Diffobjectattributes(public var dwFFMaxForce: UInt = 0u, public var dwFFForceResolution: UInt = 0u)

public data class Difileeffect(
    public var dwSize: UInt = 0u,
    public var guidEffect: Guid = Guid(),
    public var lpDiEffect: Dieffect? = null,
    public var szFriendlyName: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Difileeffect) return false
        if (this.dwSize != other.dwSize) return false
        if (this.guidEffect != other.guidEffect) return false
        if (this.lpDiEffect != other.lpDiEffect) return false
        if (!this.szFriendlyName.contentEquals(other.szFriendlyName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.guidEffect.hashCode()
        result = 31 * result + this.lpDiEffect.hashCode()
        result = 31 * result + this.szFriendlyName.contentHashCode()
        return result
    }
}

public data class Dihidffinitinfo(
    public var dwSize: UInt = 0u,
    public var pwszDeviceInterface: Pwstr = null,
    public var guidInstance: Guid = Guid(),
)

public data class Dijoyconfig(
    public var dwSize: UInt = 0u,
    public var guidInstance: Guid = Guid(),
    public var hwc: Joyreghwconfig = Joyreghwconfig(),
    public var dwGain: UInt = 0u,
    public var wszType: UShortArray = UShortArray(256),
    public var wszCallout: UShortArray = UShortArray(256),
    public var guidGameport: Guid = Guid(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dijoyconfig) return false
        if (this.dwSize != other.dwSize) return false
        if (this.guidInstance != other.guidInstance) return false
        if (this.hwc != other.hwc) return false
        if (this.dwGain != other.dwGain) return false
        if (!this.wszType.contentEquals(other.wszType)) return false
        if (!this.wszCallout.contentEquals(other.wszCallout)) return false
        if (this.guidGameport != other.guidGameport) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.guidInstance.hashCode()
        result = 31 * result + this.hwc.hashCode()
        result = 31 * result + this.dwGain.hashCode()
        result = 31 * result + this.wszType.contentHashCode()
        result = 31 * result + this.wszCallout.contentHashCode()
        result = 31 * result + this.guidGameport.hashCode()
        return result
    }
}

public data class DijoyconfigDx5(
    public var dwSize: UInt = 0u,
    public var guidInstance: Guid = Guid(),
    public var hwc: Joyreghwconfig = Joyreghwconfig(),
    public var dwGain: UInt = 0u,
    public var wszType: UShortArray = UShortArray(256),
    public var wszCallout: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DijoyconfigDx5) return false
        if (this.dwSize != other.dwSize) return false
        if (this.guidInstance != other.guidInstance) return false
        if (this.hwc != other.hwc) return false
        if (this.dwGain != other.dwGain) return false
        if (!this.wszType.contentEquals(other.wszType)) return false
        if (!this.wszCallout.contentEquals(other.wszCallout)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.guidInstance.hashCode()
        result = 31 * result + this.hwc.hashCode()
        result = 31 * result + this.dwGain.hashCode()
        result = 31 * result + this.wszType.contentHashCode()
        result = 31 * result + this.wszCallout.contentHashCode()
        return result
    }
}

public data class Dijoystate(
    public var lX: Int = 0,
    public var lY: Int = 0,
    public var lZ: Int = 0,
    public var lRx: Int = 0,
    public var lRy: Int = 0,
    public var lRz: Int = 0,
    public var rglSlider: IntArray = IntArray(2),
    public var rgdwPOV: UIntArray = UIntArray(4),
    public var rgbButtons: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dijoystate) return false
        if (this.lX != other.lX) return false
        if (this.lY != other.lY) return false
        if (this.lZ != other.lZ) return false
        if (this.lRx != other.lRx) return false
        if (this.lRy != other.lRy) return false
        if (this.lRz != other.lRz) return false
        if (!this.rglSlider.contentEquals(other.rglSlider)) return false
        if (!this.rgdwPOV.contentEquals(other.rgdwPOV)) return false
        if (!this.rgbButtons.contentEquals(other.rgbButtons)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lX.hashCode()
        result = 31 * result + this.lY.hashCode()
        result = 31 * result + this.lZ.hashCode()
        result = 31 * result + this.lRx.hashCode()
        result = 31 * result + this.lRy.hashCode()
        result = 31 * result + this.lRz.hashCode()
        result = 31 * result + this.rglSlider.contentHashCode()
        result = 31 * result + this.rgdwPOV.contentHashCode()
        result = 31 * result + this.rgbButtons.contentHashCode()
        return result
    }
}

public class Dijoystate2(
    public var lX: Int = 0,
    public var lY: Int = 0,
    public var lZ: Int = 0,
    public var lRx: Int = 0,
    public var lRy: Int = 0,
    public var lRz: Int = 0,
    public var rglSlider: IntArray = IntArray(2),
    public var rgdwPOV: UIntArray = UIntArray(4),
    public var rgbButtons: UByteArray = UByteArray(128),
    public var lVX: Int = 0,
    public var lVY: Int = 0,
    public var lVZ: Int = 0,
    public var lVRx: Int = 0,
    public var lVRy: Int = 0,
    public var lVRz: Int = 0,
    public var rglVSlider: IntArray = IntArray(2),
    public var lAX: Int = 0,
    public var lAY: Int = 0,
    public var lAZ: Int = 0,
    public var lARx: Int = 0,
    public var lARy: Int = 0,
    public var lARz: Int = 0,
    public var rglASlider: IntArray = IntArray(2),
    public var lFX: Int = 0,
    public var lFY: Int = 0,
    public var lFZ: Int = 0,
    public var lFRx: Int = 0,
    public var lFRy: Int = 0,
    public var lFRz: Int = 0,
    public var rglFSlider: IntArray = IntArray(2),
)

public data class Dijoytypeinfo(
    public var dwSize: UInt = 0u,
    public var hws: Joyreghwsettings = Joyreghwsettings(),
    public var clsidConfig: Guid = Guid(),
    public var wszDisplayName: UShortArray = UShortArray(256),
    public var wszCallout: UShortArray = UShortArray(260),
    public var wszHardwareId: UShortArray = UShortArray(256),
    public var dwFlags1: UInt = 0u,
    public var dwFlags2: UInt = 0u,
    public var wszMapFile: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dijoytypeinfo) return false
        if (this.dwSize != other.dwSize) return false
        if (this.hws != other.hws) return false
        if (this.clsidConfig != other.clsidConfig) return false
        if (!this.wszDisplayName.contentEquals(other.wszDisplayName)) return false
        if (!this.wszCallout.contentEquals(other.wszCallout)) return false
        if (!this.wszHardwareId.contentEquals(other.wszHardwareId)) return false
        if (this.dwFlags1 != other.dwFlags1) return false
        if (this.dwFlags2 != other.dwFlags2) return false
        if (!this.wszMapFile.contentEquals(other.wszMapFile)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.hws.hashCode()
        result = 31 * result + this.clsidConfig.hashCode()
        result = 31 * result + this.wszDisplayName.contentHashCode()
        result = 31 * result + this.wszCallout.contentHashCode()
        result = 31 * result + this.wszHardwareId.contentHashCode()
        result = 31 * result + this.dwFlags1.hashCode()
        result = 31 * result + this.dwFlags2.hashCode()
        result = 31 * result + this.wszMapFile.contentHashCode()
        return result
    }
}

public data class DijoytypeinfoDx5(
    public var dwSize: UInt = 0u,
    public var hws: Joyreghwsettings = Joyreghwsettings(),
    public var clsidConfig: Guid = Guid(),
    public var wszDisplayName: UShortArray = UShortArray(256),
    public var wszCallout: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DijoytypeinfoDx5) return false
        if (this.dwSize != other.dwSize) return false
        if (this.hws != other.hws) return false
        if (this.clsidConfig != other.clsidConfig) return false
        if (!this.wszDisplayName.contentEquals(other.wszDisplayName)) return false
        if (!this.wszCallout.contentEquals(other.wszCallout)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.hws.hashCode()
        result = 31 * result + this.clsidConfig.hashCode()
        result = 31 * result + this.wszDisplayName.contentHashCode()
        result = 31 * result + this.wszCallout.contentHashCode()
        return result
    }
}

public data class DijoytypeinfoDx6(
    public var dwSize: UInt = 0u,
    public var hws: Joyreghwsettings = Joyreghwsettings(),
    public var clsidConfig: Guid = Guid(),
    public var wszDisplayName: UShortArray = UShortArray(256),
    public var wszCallout: UShortArray = UShortArray(260),
    public var wszHardwareId: UShortArray = UShortArray(256),
    public var dwFlags1: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DijoytypeinfoDx6) return false
        if (this.dwSize != other.dwSize) return false
        if (this.hws != other.hws) return false
        if (this.clsidConfig != other.clsidConfig) return false
        if (!this.wszDisplayName.contentEquals(other.wszDisplayName)) return false
        if (!this.wszCallout.contentEquals(other.wszCallout)) return false
        if (!this.wszHardwareId.contentEquals(other.wszHardwareId)) return false
        if (this.dwFlags1 != other.dwFlags1) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.hws.hashCode()
        result = 31 * result + this.clsidConfig.hashCode()
        result = 31 * result + this.wszDisplayName.contentHashCode()
        result = 31 * result + this.wszCallout.contentHashCode()
        result = 31 * result + this.wszHardwareId.contentHashCode()
        result = 31 * result + this.dwFlags1.hashCode()
        return result
    }
}

public data class Dijoyuservalues(
    public var dwSize: UInt = 0u,
    public var ruv: Joyreguservalues = Joyreguservalues(),
    public var wszGlobalDriver: UShortArray = UShortArray(256),
    public var wszGameportEmulator: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dijoyuservalues) return false
        if (this.dwSize != other.dwSize) return false
        if (this.ruv != other.ruv) return false
        if (!this.wszGlobalDriver.contentEquals(other.wszGlobalDriver)) return false
        if (!this.wszGameportEmulator.contentEquals(other.wszGameportEmulator)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.ruv.hashCode()
        result = 31 * result + this.wszGlobalDriver.contentHashCode()
        result = 31 * result + this.wszGameportEmulator.contentHashCode()
        return result
    }
}

public data class Dimousestate(
    public var lX: Int = 0,
    public var lY: Int = 0,
    public var lZ: Int = 0,
    public var rgbButtons: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dimousestate) return false
        if (this.lX != other.lX) return false
        if (this.lY != other.lY) return false
        if (this.lZ != other.lZ) return false
        if (!this.rgbButtons.contentEquals(other.rgbButtons)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lX.hashCode()
        result = 31 * result + this.lY.hashCode()
        result = 31 * result + this.lZ.hashCode()
        result = 31 * result + this.rgbButtons.contentHashCode()
        return result
    }
}

public data class Dimousestate2(
    public var lX: Int = 0,
    public var lY: Int = 0,
    public var lZ: Int = 0,
    public var rgbButtons: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dimousestate2) return false
        if (this.lX != other.lX) return false
        if (this.lY != other.lY) return false
        if (this.lZ != other.lZ) return false
        if (!this.rgbButtons.contentEquals(other.rgbButtons)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lX.hashCode()
        result = 31 * result + this.lY.hashCode()
        result = 31 * result + this.lZ.hashCode()
        result = 31 * result + this.rgbButtons.contentHashCode()
        return result
    }
}

public data class Diobjectattributes(
    public var dwFlags: UInt = 0u,
    public var wUsagePage: UShort = 0u,
    public var wUsage: UShort = 0u,
)

public data class Diobjectcalibration(
    public var lMin: Int = 0,
    public var lCenter: Int = 0,
    public var lMax: Int = 0,
)

public data class Diobjectdataformat(
    public var pguid: Guid? = null,
    public var dwOfs: UInt = 0u,
    public var dwType: UInt = 0u,
    public var dwFlags: UInt = 0u,
)

public data class Diperiodic(
    public var dwMagnitude: UInt = 0u,
    public var lOffset: Int = 0,
    public var dwPhase: UInt = 0u,
    public var dwPeriod: UInt = 0u,
)

public data class Dipovcalibration(public var lMin: IntArray = IntArray(5), public var lMax: IntArray = IntArray(5)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dipovcalibration) return false
        if (!this.lMin.contentEquals(other.lMin)) return false
        if (!this.lMax.contentEquals(other.lMax)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lMin.contentHashCode()
        result = 31 * result + this.lMax.contentHashCode()
        return result
    }
}

public data class Dipropcal(
    public var diph: Dipropheader = Dipropheader(),
    public var lMin: Int = 0,
    public var lCenter: Int = 0,
    public var lMax: Int = 0,
)

public data class Dipropcalpov(
    public var diph: Dipropheader = Dipropheader(),
    public var lMin: IntArray = IntArray(5),
    public var lMax: IntArray = IntArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dipropcalpov) return false
        if (this.diph != other.diph) return false
        if (!this.lMin.contentEquals(other.lMin)) return false
        if (!this.lMax.contentEquals(other.lMax)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.diph.hashCode()
        result = 31 * result + this.lMin.contentHashCode()
        result = 31 * result + this.lMax.contentHashCode()
        return result
    }
}

public data class Dipropcpoints(
    public var diph: Dipropheader = Dipropheader(),
    public var dwCPointsNum: UInt = 0u,
    public var cp: List<Cpoint> = List(8) { Cpoint() },
)

public data class Dipropdword(public var diph: Dipropheader = Dipropheader(), public var dwData: UInt = 0u)

public data class Dipropguidandpath(
    public var diph: Dipropheader = Dipropheader(),
    public var guidClass: Guid = Guid(),
    public var wszPath: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dipropguidandpath) return false
        if (this.diph != other.diph) return false
        if (this.guidClass != other.guidClass) return false
        if (!this.wszPath.contentEquals(other.wszPath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.diph.hashCode()
        result = 31 * result + this.guidClass.hashCode()
        result = 31 * result + this.wszPath.contentHashCode()
        return result
    }
}

public data class Dipropheader(
    public var dwSize: UInt = 0u,
    public var dwHeaderSize: UInt = 0u,
    public var dwObj: UInt = 0u,
    public var dwHow: UInt = 0u,
)

public data class Diproppointer(public var diph: Dipropheader = Dipropheader(), public var uData: Int = 0)

public data class Diproprange(
    public var diph: Dipropheader = Dipropheader(),
    public var lMin: Int = 0,
    public var lMax: Int = 0,
)

public data class Dipropstring(public var diph: Dipropheader = Dipropheader(), public var wsz: UShortArray = UShortArray(260)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dipropstring) return false
        if (this.diph != other.diph) return false
        if (!this.wsz.contentEquals(other.wsz)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.diph.hashCode()
        result = 31 * result + this.wsz.contentHashCode()
        return result
    }
}

public data class Dirampforce(public var lStart: Int = 0, public var lEnd: Int = 0)

public data class HiddAttributes(
    public var size: UInt = 0u,
    public var vendorID: UShort = 0u,
    public var productID: UShort = 0u,
    public var versionNumber: UShort = 0u,
)

public data class HiddConfiguration(
    public var cookie: COpaquePointer? = null,
    public var size: UInt = 0u,
    public var ringBufferSize: UInt = 0u,
)

public data class HidpButtonArrayData(public var arrayIndex: UShort = 0u, public var on: Boolean = false)

public data class HidpButtonCaps(
    public var usagePage: UShort = 0u,
    public var reportID: UByte = 0u,
    public var isAlias: Boolean = false,
    public var bitField: UShort = 0u,
    public var linkCollection: UShort = 0u,
    public var linkUsage: UShort = 0u,
    public var linkUsagePage: UShort = 0u,
    public var isRange: Boolean = false,
    public var isStringRange: Boolean = false,
    public var isDesignatorRange: Boolean = false,
    public var isAbsolute: Boolean = false,
    public var reportCount: UShort = 0u,
    public var reserved2: UShort = 0u,
    public var reserved: UIntArray = UIntArray(9),
    public var anonymous: HidpButtonCaps0 = HidpButtonCaps0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HidpButtonCaps) return false
        if (this.usagePage != other.usagePage) return false
        if (this.reportID != other.reportID) return false
        if (this.isAlias != other.isAlias) return false
        if (this.bitField != other.bitField) return false
        if (this.linkCollection != other.linkCollection) return false
        if (this.linkUsage != other.linkUsage) return false
        if (this.linkUsagePage != other.linkUsagePage) return false
        if (this.isRange != other.isRange) return false
        if (this.isStringRange != other.isStringRange) return false
        if (this.isDesignatorRange != other.isDesignatorRange) return false
        if (this.isAbsolute != other.isAbsolute) return false
        if (this.reportCount != other.reportCount) return false
        if (this.reserved2 != other.reserved2) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.usagePage.hashCode()
        result = 31 * result + this.reportID.hashCode()
        result = 31 * result + this.isAlias.hashCode()
        result = 31 * result + this.bitField.hashCode()
        result = 31 * result + this.linkCollection.hashCode()
        result = 31 * result + this.linkUsage.hashCode()
        result = 31 * result + this.linkUsagePage.hashCode()
        result = 31 * result + this.isRange.hashCode()
        result = 31 * result + this.isStringRange.hashCode()
        result = 31 * result + this.isDesignatorRange.hashCode()
        result = 31 * result + this.isAbsolute.hashCode()
        result = 31 * result + this.reportCount.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }
}

public data class HidpButtonCaps0(public var range: HidpButtonCaps00 = HidpButtonCaps00(), public var notRange: HidpButtonCaps01 = HidpButtonCaps01())

public data class HidpButtonCaps01(
    public var usage: UShort = 0u,
    public var reserved1: UShort = 0u,
    public var stringIndex: UShort = 0u,
    public var reserved2: UShort = 0u,
    public var designatorIndex: UShort = 0u,
    public var reserved3: UShort = 0u,
    public var dataIndex: UShort = 0u,
    public var reserved4: UShort = 0u,
)

public data class HidpButtonCaps00(
    public var usageMin: UShort = 0u,
    public var usageMax: UShort = 0u,
    public var stringMin: UShort = 0u,
    public var stringMax: UShort = 0u,
    public var designatorMin: UShort = 0u,
    public var designatorMax: UShort = 0u,
    public var dataIndexMin: UShort = 0u,
    public var dataIndexMax: UShort = 0u,
)

public data class HidpCaps(
    public var usage: UShort = 0u,
    public var usagePage: UShort = 0u,
    public var inputReportByteLength: UShort = 0u,
    public var outputReportByteLength: UShort = 0u,
    public var featureReportByteLength: UShort = 0u,
    public var reserved: UShortArray = UShortArray(17),
    public var numberLinkCollectionNodes: UShort = 0u,
    public var numberInputButtonCaps: UShort = 0u,
    public var numberInputValueCaps: UShort = 0u,
    public var numberInputDataIndices: UShort = 0u,
    public var numberOutputButtonCaps: UShort = 0u,
    public var numberOutputValueCaps: UShort = 0u,
    public var numberOutputDataIndices: UShort = 0u,
    public var numberFeatureButtonCaps: UShort = 0u,
    public var numberFeatureValueCaps: UShort = 0u,
    public var numberFeatureDataIndices: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HidpCaps) return false
        if (this.usage != other.usage) return false
        if (this.usagePage != other.usagePage) return false
        if (this.inputReportByteLength != other.inputReportByteLength) return false
        if (this.outputReportByteLength != other.outputReportByteLength) return false
        if (this.featureReportByteLength != other.featureReportByteLength) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.numberLinkCollectionNodes != other.numberLinkCollectionNodes) return false
        if (this.numberInputButtonCaps != other.numberInputButtonCaps) return false
        if (this.numberInputValueCaps != other.numberInputValueCaps) return false
        if (this.numberInputDataIndices != other.numberInputDataIndices) return false
        if (this.numberOutputButtonCaps != other.numberOutputButtonCaps) return false
        if (this.numberOutputValueCaps != other.numberOutputValueCaps) return false
        if (this.numberOutputDataIndices != other.numberOutputDataIndices) return false
        if (this.numberFeatureButtonCaps != other.numberFeatureButtonCaps) return false
        if (this.numberFeatureValueCaps != other.numberFeatureValueCaps) return false
        if (this.numberFeatureDataIndices != other.numberFeatureDataIndices) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.usage.hashCode()
        result = 31 * result + this.usagePage.hashCode()
        result = 31 * result + this.inputReportByteLength.hashCode()
        result = 31 * result + this.outputReportByteLength.hashCode()
        result = 31 * result + this.featureReportByteLength.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.numberLinkCollectionNodes.hashCode()
        result = 31 * result + this.numberInputButtonCaps.hashCode()
        result = 31 * result + this.numberInputValueCaps.hashCode()
        result = 31 * result + this.numberInputDataIndices.hashCode()
        result = 31 * result + this.numberOutputButtonCaps.hashCode()
        result = 31 * result + this.numberOutputValueCaps.hashCode()
        result = 31 * result + this.numberOutputDataIndices.hashCode()
        result = 31 * result + this.numberFeatureButtonCaps.hashCode()
        result = 31 * result + this.numberFeatureValueCaps.hashCode()
        result = 31 * result + this.numberFeatureDataIndices.hashCode()
        return result
    }
}

public data class HidpData(
    public var dataIndex: UShort = 0u,
    public var reserved: UShort = 0u,
    public var anonymous: HidpData0 = HidpData0(),
)

public data class HidpData0(public var rawValue: UInt = 0u, public var on: Boolean = false)

public data class HidpExtendedAttributes(
    public var numGlobalUnknowns: UByte = 0u,
    public var reserved: UByteArray = UByteArray(3),
    public var globalUnknowns: HidpUnknownToken? = null,
    public var data: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HidpExtendedAttributes) return false
        if (this.numGlobalUnknowns != other.numGlobalUnknowns) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.globalUnknowns != other.globalUnknowns) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numGlobalUnknowns.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.globalUnknowns.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class HidpKeyboardModifierState(public var anonymous: HidpKeyboardModifierState0 = HidpKeyboardModifierState0())

public data class HidpKeyboardModifierState0(public var anonymous: HidpKeyboardModifierState00 = HidpKeyboardModifierState00(), public var ul: UInt = 0u)

public data class HidpKeyboardModifierState00(public var bitfield: UInt = 0u)

public data class HidpLinkCollectionNode(
    public var linkUsage: UShort = 0u,
    public var linkUsagePage: UShort = 0u,
    public var parent: UShort = 0u,
    public var numberOfChildren: UShort = 0u,
    public var nextSibling: UShort = 0u,
    public var firstChild: UShort = 0u,
    public var bitfield: UInt = 0u,
    public var userContext: COpaquePointer? = null,
)

public data class HidpUnknownToken(
    public var token: UByte = 0u,
    public var reserved: UByteArray = UByteArray(3),
    public var bitField: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HidpUnknownToken) return false
        if (this.token != other.token) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.bitField != other.bitField) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.token.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.bitField.hashCode()
        return result
    }
}

public class HidpValueCaps(
    public var usagePage: UShort = 0u,
    public var reportID: UByte = 0u,
    public var isAlias: Boolean = false,
    public var bitField: UShort = 0u,
    public var linkCollection: UShort = 0u,
    public var linkUsage: UShort = 0u,
    public var linkUsagePage: UShort = 0u,
    public var isRange: Boolean = false,
    public var isStringRange: Boolean = false,
    public var isDesignatorRange: Boolean = false,
    public var isAbsolute: Boolean = false,
    public var hasNull: Boolean = false,
    public var reserved: UByte = 0u,
    public var bitSize: UShort = 0u,
    public var reportCount: UShort = 0u,
    public var reserved2: UShortArray = UShortArray(5),
    public var unitsExp: UInt = 0u,
    public var units: UInt = 0u,
    public var logicalMin: Int = 0,
    public var logicalMax: Int = 0,
    public var physicalMin: Int = 0,
    public var physicalMax: Int = 0,
    public var anonymous: HidpValueCaps0 = HidpValueCaps0(),
)

public data class HidpValueCaps0(public var range: HidpValueCaps00 = HidpValueCaps00(), public var notRange: HidpValueCaps01 = HidpValueCaps01())

public data class HidpValueCaps01(
    public var usage: UShort = 0u,
    public var reserved1: UShort = 0u,
    public var stringIndex: UShort = 0u,
    public var reserved2: UShort = 0u,
    public var designatorIndex: UShort = 0u,
    public var reserved3: UShort = 0u,
    public var dataIndex: UShort = 0u,
    public var reserved4: UShort = 0u,
)

public data class HidpValueCaps00(
    public var usageMin: UShort = 0u,
    public var usageMax: UShort = 0u,
    public var stringMin: UShort = 0u,
    public var stringMax: UShort = 0u,
    public var designatorMin: UShort = 0u,
    public var designatorMax: UShort = 0u,
    public var dataIndexMin: UShort = 0u,
    public var dataIndexMax: UShort = 0u,
)

public data class HidCollectionInformation(
    public var descriptorSize: UInt = 0u,
    public var polled: Boolean = false,
    public var reserved1: UByteArray = UByteArray(1),
    public var vendorID: UShort = 0u,
    public var productID: UShort = 0u,
    public var versionNumber: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HidCollectionInformation) return false
        if (this.descriptorSize != other.descriptorSize) return false
        if (this.polled != other.polled) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (this.vendorID != other.vendorID) return false
        if (this.productID != other.productID) return false
        if (this.versionNumber != other.versionNumber) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.descriptorSize.hashCode()
        result = 31 * result + this.polled.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.vendorID.hashCode()
        result = 31 * result + this.productID.hashCode()
        result = 31 * result + this.versionNumber.hashCode()
        return result
    }
}

public data class HidDriverConfig(public var size: UInt = 0u, public var ringBufferSize: UInt = 0u)

public data class HidXferPacket(
    public var reportBuffer: COpaquePointer? = null,
    public var reportBufferLen: UInt = 0u,
    public var reportId: UByte = 0u,
)

public data class IndicatorList(public var makeCode: UShort = 0u, public var indicatorFlags: UShort = 0u)

public data class InputButtonEnableInfo(public var buttonType: GpiobuttonsButtonType = 0, public var enabled: Boolean = false)

public data class Joycalibrate(
    public var wXbase: UInt = 0u,
    public var wXdelta: UInt = 0u,
    public var wYbase: UInt = 0u,
    public var wYdelta: UInt = 0u,
    public var wZbase: UInt = 0u,
    public var wZdelta: UInt = 0u,
)

public data class Joypos(
    public var dwX: UInt = 0u,
    public var dwY: UInt = 0u,
    public var dwZ: UInt = 0u,
    public var dwR: UInt = 0u,
    public var dwU: UInt = 0u,
    public var dwV: UInt = 0u,
)

public data class Joyrange(
    public var jpMin: Joypos = Joypos(),
    public var jpMax: Joypos = Joypos(),
    public var jpCenter: Joypos = Joypos(),
)

public data class Joyreghwconfig(
    public var hws: Joyreghwsettings = Joyreghwsettings(),
    public var dwUsageSettings: UInt = 0u,
    public var hwv: Joyreghwvalues = Joyreghwvalues(),
    public var dwType: UInt = 0u,
    public var dwReserved: UInt = 0u,
)

public data class Joyreghwsettings(public var dwFlags: UInt = 0u, public var dwNumButtons: UInt = 0u)

public data class Joyreghwvalues(
    public var jrvHardware: Joyrange = Joyrange(),
    public var dwPOVValues: UIntArray = UIntArray(4),
    public var dwCalFlags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Joyreghwvalues) return false
        if (this.jrvHardware != other.jrvHardware) return false
        if (!this.dwPOVValues.contentEquals(other.dwPOVValues)) return false
        if (this.dwCalFlags != other.dwCalFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.jrvHardware.hashCode()
        result = 31 * result + this.dwPOVValues.contentHashCode()
        result = 31 * result + this.dwCalFlags.hashCode()
        return result
    }
}

public data class Joyreguservalues(
    public var dwTimeOut: UInt = 0u,
    public var jrvRanges: Joyrange = Joyrange(),
    public var jpDeadZone: Joypos = Joypos(),
)

public data class KeyboardAttributes(
    public var keyboardIdentifier: KeyboardId = KeyboardId(),
    public var keyboardMode: UShort = 0u,
    public var numberOfFunctionKeys: UShort = 0u,
    public var numberOfIndicators: UShort = 0u,
    public var numberOfKeysTotal: UShort = 0u,
    public var inputDataQueueLength: UInt = 0u,
    public var keyRepeatMinimum: KeyboardTypematicParameters = KeyboardTypematicParameters(),
    public var keyRepeatMaximum: KeyboardTypematicParameters = KeyboardTypematicParameters(),
)

public data class KeyboardExtendedAttributes(
    public var version: UByte = 0u,
    public var formFactor: UByte = 0u,
    public var keyType: UByte = 0u,
    public var physicalLayout: UByte = 0u,
    public var vendorSpecificPhysicalLayout: UByte = 0u,
    public var iETFLanguageTagIndex: UByte = 0u,
    public var implementedInputAssistControls: UByte = 0u,
)

public data class KeyboardId(public var type: UByte = 0u, public var subtype: UByte = 0u)

public data class KeyboardImeStatus(
    public var unitId: UShort = 0u,
    public var imeOpen: UInt = 0u,
    public var imeConvMode: UInt = 0u,
)

public data class KeyboardIndicatorParameters(public var unitId: UShort = 0u, public var ledFlags: UShort = 0u)

public data class KeyboardIndicatorTranslation(public var numberOfIndicatorKeys: UShort = 0u, public var indicatorList: List<IndicatorList> = List(1) { IndicatorList() })

public data class KeyboardInputData(
    public var unitId: UShort = 0u,
    public var makeCode: UShort = 0u,
    public var flags: UShort = 0u,
    public var reserved: UShort = 0u,
    public var extraInformation: UInt = 0u,
)

public data class KeyboardTypematicParameters(
    public var unitId: UShort = 0u,
    public var rate: UShort = 0u,
    public var delay: UShort = 0u,
)

public data class KeyboardUnitIdParameter(public var unitId: UShort = 0u)

public data class MouseAttributes(
    public var mouseIdentifier: UShort = 0u,
    public var numberOfButtons: UShort = 0u,
    public var sampleRate: UShort = 0u,
    public var inputDataQueueLength: UInt = 0u,
)

public data class MouseInputData(
    public var unitId: UShort = 0u,
    public var flags: UShort = 0u,
    public var anonymous: MouseInputData0 = MouseInputData0(),
    public var rawButtons: UInt = 0u,
    public var lastX: Int = 0,
    public var lastY: Int = 0,
    public var extraInformation: UInt = 0u,
)

public data class MouseInputData0(public var buttons: UInt = 0u, public var anonymous: MouseInputData00 = MouseInputData00())

public data class MouseInputData00(public var buttonFlags: UShort = 0u, public var buttonData: UShort = 0u)

public data class MouseUnitIdParameter(public var unitId: UShort = 0u)

public data class UsageAndPage(public var usage: UShort = 0u, public var usagePage: UShort = 0u)
