@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.devices.humaninterfacedevice

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.FILETIME
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.POINT
import io.github.kotlinmania.windowssys.windows.win32.foundation.RECT

public data class CPOINT(public var lP: Int = 0, public var dwLog: UInt = 0u)

public data class DIACTIONA(
    public var uAppData: ULong = 0uL,
    public var dwSemantic: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var Anonymous: DIACTIONA_0 = DIACTIONA_0(),
    public var guidInstance: GUID = GUID(),
    public var dwObjID: UInt = 0u,
    public var dwHow: UInt = 0u,
)

public data class DIACTIONA_0(public var lptszActionName: PCSTR = 0L, public var uResIdString: UInt = 0u)

public data class DIACTIONFORMATA(
    public var dwSize: UInt = 0u,
    public var dwActionSize: UInt = 0u,
    public var dwDataSize: UInt = 0u,
    public var dwNumActions: UInt = 0u,
    public var rgoAction: Long = 0L,
    public var guidActionMap: GUID = GUID(),
    public var dwGenre: UInt = 0u,
    public var dwBufferSize: UInt = 0u,
    public var lAxisMin: Int = 0,
    public var lAxisMax: Int = 0,
    public var hInstString: HINSTANCE = 0L,
    public var ftTimeStamp: FILETIME = FILETIME(),
    public var dwCRC: UInt = 0u,
    public var tszActionMap: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DIACTIONFORMATA) return false
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

public data class DIACTIONFORMATW(
    public var dwSize: UInt = 0u,
    public var dwActionSize: UInt = 0u,
    public var dwDataSize: UInt = 0u,
    public var dwNumActions: UInt = 0u,
    public var rgoAction: Long = 0L,
    public var guidActionMap: GUID = GUID(),
    public var dwGenre: UInt = 0u,
    public var dwBufferSize: UInt = 0u,
    public var lAxisMin: Int = 0,
    public var lAxisMax: Int = 0,
    public var hInstString: HINSTANCE = 0L,
    public var ftTimeStamp: FILETIME = FILETIME(),
    public var dwCRC: UInt = 0u,
    public var tszActionMap: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DIACTIONFORMATW) return false
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

public data class DIACTIONW(
    public var uAppData: ULong = 0uL,
    public var dwSemantic: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var Anonymous: DIACTIONW_0 = DIACTIONW_0(),
    public var guidInstance: GUID = GUID(),
    public var dwObjID: UInt = 0u,
    public var dwHow: UInt = 0u,
)

public data class DIACTIONW_0(public var lptszActionName: PCWSTR = 0L, public var uResIdString: UInt = 0u)

public data class DICOLORSET(
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

public data class DICONDITION(
    public var lOffset: Int = 0,
    public var lPositiveCoefficient: Int = 0,
    public var lNegativeCoefficient: Int = 0,
    public var dwPositiveSaturation: UInt = 0u,
    public var dwNegativeSaturation: UInt = 0u,
    public var lDeadBand: Int = 0,
)

public data class DICONFIGUREDEVICESPARAMSA(
    public var dwSize: UInt = 0u,
    public var dwcUsers: UInt = 0u,
    public var lptszUserNames: PSTR = 0L,
    public var dwcFormats: UInt = 0u,
    public var lprgFormats: Long = 0L,
    public var hwnd: HWND = 0L,
    public var dics: DICOLORSET = DICOLORSET(),
    public var lpUnkDDSTarget: Long = 0L,
)

public data class DICONFIGUREDEVICESPARAMSW(
    public var dwSize: UInt = 0u,
    public var dwcUsers: UInt = 0u,
    public var lptszUserNames: PWSTR = 0L,
    public var dwcFormats: UInt = 0u,
    public var lprgFormats: Long = 0L,
    public var hwnd: HWND = 0L,
    public var dics: DICOLORSET = DICOLORSET(),
    public var lpUnkDDSTarget: Long = 0L,
)

public data class DICONSTANTFORCE(public var lMagnitude: Int = 0)

public data class DICUSTOMFORCE(
    public var cChannels: UInt = 0u,
    public var dwSamplePeriod: UInt = 0u,
    public var cSamples: UInt = 0u,
    public var rglForceData: Long = 0L,
)

public data class DIDATAFORMAT(
    public var dwSize: UInt = 0u,
    public var dwObjSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwDataSize: UInt = 0u,
    public var dwNumObjs: UInt = 0u,
    public var rgodf: Long = 0L,
)

public data class DIDEVCAPS(
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

public data class DIDEVCAPS_DX3(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwDevType: UInt = 0u,
    public var dwAxes: UInt = 0u,
    public var dwButtons: UInt = 0u,
    public var dwPOVs: UInt = 0u,
)

public data class DIDEVICEIMAGEINFOA(
    public var tszImagePath: ByteArray = ByteArray(260),
    public var dwFlags: UInt = 0u,
    public var dwViewID: UInt = 0u,
    public var rcOverlay: RECT = RECT(),
    public var dwObjID: UInt = 0u,
    public var dwcValidPts: UInt = 0u,
    public var rgptCalloutLine: List<POINT> = List(5) { POINT() },
    public var rcCalloutRect: RECT = RECT(),
    public var dwTextAlign: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DIDEVICEIMAGEINFOA) return false
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

public data class DIDEVICEIMAGEINFOHEADERA(
    public var dwSize: UInt = 0u,
    public var dwSizeImageInfo: UInt = 0u,
    public var dwcViews: UInt = 0u,
    public var dwcButtons: UInt = 0u,
    public var dwcAxes: UInt = 0u,
    public var dwcPOVs: UInt = 0u,
    public var dwBufferSize: UInt = 0u,
    public var dwBufferUsed: UInt = 0u,
    public var lprgImageInfoArray: Long = 0L,
)

public data class DIDEVICEIMAGEINFOHEADERW(
    public var dwSize: UInt = 0u,
    public var dwSizeImageInfo: UInt = 0u,
    public var dwcViews: UInt = 0u,
    public var dwcButtons: UInt = 0u,
    public var dwcAxes: UInt = 0u,
    public var dwcPOVs: UInt = 0u,
    public var dwBufferSize: UInt = 0u,
    public var dwBufferUsed: UInt = 0u,
    public var lprgImageInfoArray: Long = 0L,
)

public data class DIDEVICEIMAGEINFOW(
    public var tszImagePath: UShortArray = UShortArray(260),
    public var dwFlags: UInt = 0u,
    public var dwViewID: UInt = 0u,
    public var rcOverlay: RECT = RECT(),
    public var dwObjID: UInt = 0u,
    public var dwcValidPts: UInt = 0u,
    public var rgptCalloutLine: List<POINT> = List(5) { POINT() },
    public var rcCalloutRect: RECT = RECT(),
    public var dwTextAlign: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DIDEVICEIMAGEINFOW) return false
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

public data class DIDEVICEINSTANCEA(
    public var dwSize: UInt = 0u,
    public var guidInstance: GUID = GUID(),
    public var guidProduct: GUID = GUID(),
    public var dwDevType: UInt = 0u,
    public var tszInstanceName: ByteArray = ByteArray(260),
    public var tszProductName: ByteArray = ByteArray(260),
    public var guidFFDriver: GUID = GUID(),
    public var wUsagePage: UShort = 0u,
    public var wUsage: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DIDEVICEINSTANCEA) return false
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

public data class DIDEVICEINSTANCEW(
    public var dwSize: UInt = 0u,
    public var guidInstance: GUID = GUID(),
    public var guidProduct: GUID = GUID(),
    public var dwDevType: UInt = 0u,
    public var tszInstanceName: UShortArray = UShortArray(260),
    public var tszProductName: UShortArray = UShortArray(260),
    public var guidFFDriver: GUID = GUID(),
    public var wUsagePage: UShort = 0u,
    public var wUsage: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DIDEVICEINSTANCEW) return false
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

public data class DIDEVICEINSTANCE_DX3A(
    public var dwSize: UInt = 0u,
    public var guidInstance: GUID = GUID(),
    public var guidProduct: GUID = GUID(),
    public var dwDevType: UInt = 0u,
    public var tszInstanceName: ByteArray = ByteArray(260),
    public var tszProductName: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DIDEVICEINSTANCE_DX3A) return false
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

public data class DIDEVICEINSTANCE_DX3W(
    public var dwSize: UInt = 0u,
    public var guidInstance: GUID = GUID(),
    public var guidProduct: GUID = GUID(),
    public var dwDevType: UInt = 0u,
    public var tszInstanceName: UShortArray = UShortArray(260),
    public var tszProductName: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DIDEVICEINSTANCE_DX3W) return false
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

public data class DIDEVICEOBJECTDATA(
    public var dwOfs: UInt = 0u,
    public var dwData: UInt = 0u,
    public var dwTimeStamp: UInt = 0u,
    public var dwSequence: UInt = 0u,
    public var uAppData: ULong = 0uL,
)

public data class DIDEVICEOBJECTDATA_DX3(
    public var dwOfs: UInt = 0u,
    public var dwData: UInt = 0u,
    public var dwTimeStamp: UInt = 0u,
    public var dwSequence: UInt = 0u,
)

public data class DIDEVICEOBJECTINSTANCEA(
    public var dwSize: UInt = 0u,
    public var guidType: GUID = GUID(),
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
        if (other !is DIDEVICEOBJECTINSTANCEA) return false
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

public data class DIDEVICEOBJECTINSTANCEW(
    public var dwSize: UInt = 0u,
    public var guidType: GUID = GUID(),
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
        if (other !is DIDEVICEOBJECTINSTANCEW) return false
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

public data class DIDEVICEOBJECTINSTANCE_DX3A(
    public var dwSize: UInt = 0u,
    public var guidType: GUID = GUID(),
    public var dwOfs: UInt = 0u,
    public var dwType: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var tszName: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DIDEVICEOBJECTINSTANCE_DX3A) return false
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

public data class DIDEVICEOBJECTINSTANCE_DX3W(
    public var dwSize: UInt = 0u,
    public var guidType: GUID = GUID(),
    public var dwOfs: UInt = 0u,
    public var dwType: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var tszName: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DIDEVICEOBJECTINSTANCE_DX3W) return false
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

public data class DIDEVICESTATE(
    public var dwSize: UInt = 0u,
    public var dwState: UInt = 0u,
    public var dwLoad: UInt = 0u,
)

public data class DIDRIVERVERSIONS(
    public var dwSize: UInt = 0u,
    public var dwFirmwareRevision: UInt = 0u,
    public var dwHardwareRevision: UInt = 0u,
    public var dwFFDriverVersion: UInt = 0u,
)

public data class DIEFFECT(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwDuration: UInt = 0u,
    public var dwSamplePeriod: UInt = 0u,
    public var dwGain: UInt = 0u,
    public var dwTriggerButton: UInt = 0u,
    public var dwTriggerRepeatInterval: UInt = 0u,
    public var cAxes: UInt = 0u,
    public var rgdwAxes: Long = 0L,
    public var rglDirection: Long = 0L,
    public var lpEnvelope: Long = 0L,
    public var cbTypeSpecificParams: UInt = 0u,
    public var lpvTypeSpecificParams: Long = 0L,
    public var dwStartDelay: UInt = 0u,
)

public data class DIEFFECTATTRIBUTES(
    public var dwEffectId: UInt = 0u,
    public var dwEffType: UInt = 0u,
    public var dwStaticParams: UInt = 0u,
    public var dwDynamicParams: UInt = 0u,
    public var dwCoords: UInt = 0u,
)

public data class DIEFFECTINFOA(
    public var dwSize: UInt = 0u,
    public var guid: GUID = GUID(),
    public var dwEffType: UInt = 0u,
    public var dwStaticParams: UInt = 0u,
    public var dwDynamicParams: UInt = 0u,
    public var tszName: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DIEFFECTINFOA) return false
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

public data class DIEFFECTINFOW(
    public var dwSize: UInt = 0u,
    public var guid: GUID = GUID(),
    public var dwEffType: UInt = 0u,
    public var dwStaticParams: UInt = 0u,
    public var dwDynamicParams: UInt = 0u,
    public var tszName: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DIEFFECTINFOW) return false
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

public data class DIEFFECT_DX5(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwDuration: UInt = 0u,
    public var dwSamplePeriod: UInt = 0u,
    public var dwGain: UInt = 0u,
    public var dwTriggerButton: UInt = 0u,
    public var dwTriggerRepeatInterval: UInt = 0u,
    public var cAxes: UInt = 0u,
    public var rgdwAxes: Long = 0L,
    public var rglDirection: Long = 0L,
    public var lpEnvelope: Long = 0L,
    public var cbTypeSpecificParams: UInt = 0u,
    public var lpvTypeSpecificParams: Long = 0L,
)

public data class DIEFFESCAPE(
    public var dwSize: UInt = 0u,
    public var dwCommand: UInt = 0u,
    public var lpvInBuffer: Long = 0L,
    public var cbInBuffer: UInt = 0u,
    public var lpvOutBuffer: Long = 0L,
    public var cbOutBuffer: UInt = 0u,
)

public data class DIENVELOPE(
    public var dwSize: UInt = 0u,
    public var dwAttackLevel: UInt = 0u,
    public var dwAttackTime: UInt = 0u,
    public var dwFadeLevel: UInt = 0u,
    public var dwFadeTime: UInt = 0u,
)

public data class DIFFDEVICEATTRIBUTES(
    public var dwFlags: UInt = 0u,
    public var dwFFSamplePeriod: UInt = 0u,
    public var dwFFMinTimeResolution: UInt = 0u,
)

public data class DIFFOBJECTATTRIBUTES(public var dwFFMaxForce: UInt = 0u, public var dwFFForceResolution: UInt = 0u)

public data class DIFILEEFFECT(
    public var dwSize: UInt = 0u,
    public var GuidEffect: GUID = GUID(),
    public var lpDiEffect: Long = 0L,
    public var szFriendlyName: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DIFILEEFFECT) return false
        if (this.dwSize != other.dwSize) return false
        if (this.GuidEffect != other.GuidEffect) return false
        if (this.lpDiEffect != other.lpDiEffect) return false
        if (!this.szFriendlyName.contentEquals(other.szFriendlyName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.GuidEffect.hashCode()
        result = 31 * result + this.lpDiEffect.hashCode()
        result = 31 * result + this.szFriendlyName.contentHashCode()
        return result
    }
}

public data class DIHIDFFINITINFO(
    public var dwSize: UInt = 0u,
    public var pwszDeviceInterface: PWSTR = 0L,
    public var GuidInstance: GUID = GUID(),
)

public data class DIJOYCONFIG(
    public var dwSize: UInt = 0u,
    public var guidInstance: GUID = GUID(),
    public var hwc: JOYREGHWCONFIG = JOYREGHWCONFIG(),
    public var dwGain: UInt = 0u,
    public var wszType: UShortArray = UShortArray(256),
    public var wszCallout: UShortArray = UShortArray(256),
    public var guidGameport: GUID = GUID(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DIJOYCONFIG) return false
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

public data class DIJOYCONFIG_DX5(
    public var dwSize: UInt = 0u,
    public var guidInstance: GUID = GUID(),
    public var hwc: JOYREGHWCONFIG = JOYREGHWCONFIG(),
    public var dwGain: UInt = 0u,
    public var wszType: UShortArray = UShortArray(256),
    public var wszCallout: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DIJOYCONFIG_DX5) return false
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

public data class DIJOYSTATE(
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
        if (other !is DIJOYSTATE) return false
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

public class DIJOYSTATE2(
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

public data class DIJOYTYPEINFO(
    public var dwSize: UInt = 0u,
    public var hws: JOYREGHWSETTINGS = JOYREGHWSETTINGS(),
    public var clsidConfig: GUID = GUID(),
    public var wszDisplayName: UShortArray = UShortArray(256),
    public var wszCallout: UShortArray = UShortArray(260),
    public var wszHardwareId: UShortArray = UShortArray(256),
    public var dwFlags1: UInt = 0u,
    public var dwFlags2: UInt = 0u,
    public var wszMapFile: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DIJOYTYPEINFO) return false
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

public data class DIJOYTYPEINFO_DX5(
    public var dwSize: UInt = 0u,
    public var hws: JOYREGHWSETTINGS = JOYREGHWSETTINGS(),
    public var clsidConfig: GUID = GUID(),
    public var wszDisplayName: UShortArray = UShortArray(256),
    public var wszCallout: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DIJOYTYPEINFO_DX5) return false
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

public data class DIJOYTYPEINFO_DX6(
    public var dwSize: UInt = 0u,
    public var hws: JOYREGHWSETTINGS = JOYREGHWSETTINGS(),
    public var clsidConfig: GUID = GUID(),
    public var wszDisplayName: UShortArray = UShortArray(256),
    public var wszCallout: UShortArray = UShortArray(260),
    public var wszHardwareId: UShortArray = UShortArray(256),
    public var dwFlags1: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DIJOYTYPEINFO_DX6) return false
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

public data class DIJOYUSERVALUES(
    public var dwSize: UInt = 0u,
    public var ruv: JOYREGUSERVALUES = JOYREGUSERVALUES(),
    public var wszGlobalDriver: UShortArray = UShortArray(256),
    public var wszGameportEmulator: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DIJOYUSERVALUES) return false
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

public data class DIMOUSESTATE(
    public var lX: Int = 0,
    public var lY: Int = 0,
    public var lZ: Int = 0,
    public var rgbButtons: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DIMOUSESTATE) return false
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

public data class DIMOUSESTATE2(
    public var lX: Int = 0,
    public var lY: Int = 0,
    public var lZ: Int = 0,
    public var rgbButtons: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DIMOUSESTATE2) return false
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

public data class DIOBJECTATTRIBUTES(
    public var dwFlags: UInt = 0u,
    public var wUsagePage: UShort = 0u,
    public var wUsage: UShort = 0u,
)

public data class DIOBJECTCALIBRATION(
    public var lMin: Int = 0,
    public var lCenter: Int = 0,
    public var lMax: Int = 0,
)

public data class DIOBJECTDATAFORMAT(
    public var pguid: Long = 0L,
    public var dwOfs: UInt = 0u,
    public var dwType: UInt = 0u,
    public var dwFlags: UInt = 0u,
)

public data class DIPERIODIC(
    public var dwMagnitude: UInt = 0u,
    public var lOffset: Int = 0,
    public var dwPhase: UInt = 0u,
    public var dwPeriod: UInt = 0u,
)

public data class DIPOVCALIBRATION(public var lMin: IntArray = IntArray(5), public var lMax: IntArray = IntArray(5)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DIPOVCALIBRATION) return false
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

public data class DIPROPCAL(
    public var diph: DIPROPHEADER = DIPROPHEADER(),
    public var lMin: Int = 0,
    public var lCenter: Int = 0,
    public var lMax: Int = 0,
)

public data class DIPROPCALPOV(
    public var diph: DIPROPHEADER = DIPROPHEADER(),
    public var lMin: IntArray = IntArray(5),
    public var lMax: IntArray = IntArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DIPROPCALPOV) return false
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

public data class DIPROPCPOINTS(
    public var diph: DIPROPHEADER = DIPROPHEADER(),
    public var dwCPointsNum: UInt = 0u,
    public var cp: List<CPOINT> = List(8) { CPOINT() },
)

public data class DIPROPDWORD(public var diph: DIPROPHEADER = DIPROPHEADER(), public var dwData: UInt = 0u)

public data class DIPROPGUIDANDPATH(
    public var diph: DIPROPHEADER = DIPROPHEADER(),
    public var guidClass: GUID = GUID(),
    public var wszPath: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DIPROPGUIDANDPATH) return false
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

public data class DIPROPHEADER(
    public var dwSize: UInt = 0u,
    public var dwHeaderSize: UInt = 0u,
    public var dwObj: UInt = 0u,
    public var dwHow: UInt = 0u,
)

public data class DIPROPPOINTER(public var diph: DIPROPHEADER = DIPROPHEADER(), public var uData: ULong = 0uL)

public data class DIPROPRANGE(
    public var diph: DIPROPHEADER = DIPROPHEADER(),
    public var lMin: Int = 0,
    public var lMax: Int = 0,
)

public data class DIPROPSTRING(public var diph: DIPROPHEADER = DIPROPHEADER(), public var wsz: UShortArray = UShortArray(260)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DIPROPSTRING) return false
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

public data class DIRAMPFORCE(public var lStart: Int = 0, public var lEnd: Int = 0)

public data class HIDD_ATTRIBUTES(
    public var Size: UInt = 0u,
    public var VendorID: UShort = 0u,
    public var ProductID: UShort = 0u,
    public var VersionNumber: UShort = 0u,
)

public data class HIDD_CONFIGURATION(
    public var cookie: Long = 0L,
    public var size: UInt = 0u,
    public var RingBufferSize: UInt = 0u,
)

public data class HIDP_BUTTON_ARRAY_DATA(public var ArrayIndex: UShort = 0u, public var On: Boolean = false)

public data class HIDP_BUTTON_CAPS(
    public var UsagePage: UShort = 0u,
    public var ReportID: UByte = 0u,
    public var IsAlias: Boolean = false,
    public var BitField: UShort = 0u,
    public var LinkCollection: UShort = 0u,
    public var LinkUsage: UShort = 0u,
    public var LinkUsagePage: UShort = 0u,
    public var IsRange: Boolean = false,
    public var IsStringRange: Boolean = false,
    public var IsDesignatorRange: Boolean = false,
    public var IsAbsolute: Boolean = false,
    public var ReportCount: UShort = 0u,
    public var Reserved2: UShort = 0u,
    public var Reserved: UIntArray = UIntArray(9),
    public var Anonymous: HIDP_BUTTON_CAPS_0 = HIDP_BUTTON_CAPS_0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HIDP_BUTTON_CAPS) return false
        if (this.UsagePage != other.UsagePage) return false
        if (this.ReportID != other.ReportID) return false
        if (this.IsAlias != other.IsAlias) return false
        if (this.BitField != other.BitField) return false
        if (this.LinkCollection != other.LinkCollection) return false
        if (this.LinkUsage != other.LinkUsage) return false
        if (this.LinkUsagePage != other.LinkUsagePage) return false
        if (this.IsRange != other.IsRange) return false
        if (this.IsStringRange != other.IsStringRange) return false
        if (this.IsDesignatorRange != other.IsDesignatorRange) return false
        if (this.IsAbsolute != other.IsAbsolute) return false
        if (this.ReportCount != other.ReportCount) return false
        if (this.Reserved2 != other.Reserved2) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.Anonymous != other.Anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.UsagePage.hashCode()
        result = 31 * result + this.ReportID.hashCode()
        result = 31 * result + this.IsAlias.hashCode()
        result = 31 * result + this.BitField.hashCode()
        result = 31 * result + this.LinkCollection.hashCode()
        result = 31 * result + this.LinkUsage.hashCode()
        result = 31 * result + this.LinkUsagePage.hashCode()
        result = 31 * result + this.IsRange.hashCode()
        result = 31 * result + this.IsStringRange.hashCode()
        result = 31 * result + this.IsDesignatorRange.hashCode()
        result = 31 * result + this.IsAbsolute.hashCode()
        result = 31 * result + this.ReportCount.hashCode()
        result = 31 * result + this.Reserved2.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.Anonymous.hashCode()
        return result
    }
}

public data class HIDP_BUTTON_CAPS_0(public var Range: HIDP_BUTTON_CAPS_0_0 = HIDP_BUTTON_CAPS_0_0(), public var NotRange: HIDP_BUTTON_CAPS_0_1 = HIDP_BUTTON_CAPS_0_1())

public data class HIDP_BUTTON_CAPS_0_1(
    public var Usage: UShort = 0u,
    public var Reserved1: UShort = 0u,
    public var StringIndex: UShort = 0u,
    public var Reserved2: UShort = 0u,
    public var DesignatorIndex: UShort = 0u,
    public var Reserved3: UShort = 0u,
    public var DataIndex: UShort = 0u,
    public var Reserved4: UShort = 0u,
)

public data class HIDP_BUTTON_CAPS_0_0(
    public var UsageMin: UShort = 0u,
    public var UsageMax: UShort = 0u,
    public var StringMin: UShort = 0u,
    public var StringMax: UShort = 0u,
    public var DesignatorMin: UShort = 0u,
    public var DesignatorMax: UShort = 0u,
    public var DataIndexMin: UShort = 0u,
    public var DataIndexMax: UShort = 0u,
)

public data class HIDP_CAPS(
    public var Usage: UShort = 0u,
    public var UsagePage: UShort = 0u,
    public var InputReportByteLength: UShort = 0u,
    public var OutputReportByteLength: UShort = 0u,
    public var FeatureReportByteLength: UShort = 0u,
    public var Reserved: UShortArray = UShortArray(17),
    public var NumberLinkCollectionNodes: UShort = 0u,
    public var NumberInputButtonCaps: UShort = 0u,
    public var NumberInputValueCaps: UShort = 0u,
    public var NumberInputDataIndices: UShort = 0u,
    public var NumberOutputButtonCaps: UShort = 0u,
    public var NumberOutputValueCaps: UShort = 0u,
    public var NumberOutputDataIndices: UShort = 0u,
    public var NumberFeatureButtonCaps: UShort = 0u,
    public var NumberFeatureValueCaps: UShort = 0u,
    public var NumberFeatureDataIndices: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HIDP_CAPS) return false
        if (this.Usage != other.Usage) return false
        if (this.UsagePage != other.UsagePage) return false
        if (this.InputReportByteLength != other.InputReportByteLength) return false
        if (this.OutputReportByteLength != other.OutputReportByteLength) return false
        if (this.FeatureReportByteLength != other.FeatureReportByteLength) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.NumberLinkCollectionNodes != other.NumberLinkCollectionNodes) return false
        if (this.NumberInputButtonCaps != other.NumberInputButtonCaps) return false
        if (this.NumberInputValueCaps != other.NumberInputValueCaps) return false
        if (this.NumberInputDataIndices != other.NumberInputDataIndices) return false
        if (this.NumberOutputButtonCaps != other.NumberOutputButtonCaps) return false
        if (this.NumberOutputValueCaps != other.NumberOutputValueCaps) return false
        if (this.NumberOutputDataIndices != other.NumberOutputDataIndices) return false
        if (this.NumberFeatureButtonCaps != other.NumberFeatureButtonCaps) return false
        if (this.NumberFeatureValueCaps != other.NumberFeatureValueCaps) return false
        if (this.NumberFeatureDataIndices != other.NumberFeatureDataIndices) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Usage.hashCode()
        result = 31 * result + this.UsagePage.hashCode()
        result = 31 * result + this.InputReportByteLength.hashCode()
        result = 31 * result + this.OutputReportByteLength.hashCode()
        result = 31 * result + this.FeatureReportByteLength.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.NumberLinkCollectionNodes.hashCode()
        result = 31 * result + this.NumberInputButtonCaps.hashCode()
        result = 31 * result + this.NumberInputValueCaps.hashCode()
        result = 31 * result + this.NumberInputDataIndices.hashCode()
        result = 31 * result + this.NumberOutputButtonCaps.hashCode()
        result = 31 * result + this.NumberOutputValueCaps.hashCode()
        result = 31 * result + this.NumberOutputDataIndices.hashCode()
        result = 31 * result + this.NumberFeatureButtonCaps.hashCode()
        result = 31 * result + this.NumberFeatureValueCaps.hashCode()
        result = 31 * result + this.NumberFeatureDataIndices.hashCode()
        return result
    }
}

public data class HIDP_DATA(
    public var DataIndex: UShort = 0u,
    public var Reserved: UShort = 0u,
    public var Anonymous: HIDP_DATA_0 = HIDP_DATA_0(),
)

public data class HIDP_DATA_0(public var RawValue: UInt = 0u, public var On: Boolean = false)

public data class HIDP_EXTENDED_ATTRIBUTES(
    public var NumGlobalUnknowns: UByte = 0u,
    public var Reserved: UByteArray = UByteArray(3),
    public var GlobalUnknowns: Long = 0L,
    public var Data: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HIDP_EXTENDED_ATTRIBUTES) return false
        if (this.NumGlobalUnknowns != other.NumGlobalUnknowns) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.GlobalUnknowns != other.GlobalUnknowns) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.NumGlobalUnknowns.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.GlobalUnknowns.hashCode()
        result = 31 * result + this.Data.contentHashCode()
        return result
    }
}

public data class HIDP_KEYBOARD_MODIFIER_STATE(public var Anonymous: HIDP_KEYBOARD_MODIFIER_STATE_0 = HIDP_KEYBOARD_MODIFIER_STATE_0())

public data class HIDP_KEYBOARD_MODIFIER_STATE_0(public var Anonymous: HIDP_KEYBOARD_MODIFIER_STATE_0_0 = HIDP_KEYBOARD_MODIFIER_STATE_0_0(), public var ul: UInt = 0u)

public data class HIDP_KEYBOARD_MODIFIER_STATE_0_0(public var _bitfield: UInt = 0u)

public data class HIDP_LINK_COLLECTION_NODE(
    public var LinkUsage: UShort = 0u,
    public var LinkUsagePage: UShort = 0u,
    public var Parent: UShort = 0u,
    public var NumberOfChildren: UShort = 0u,
    public var NextSibling: UShort = 0u,
    public var FirstChild: UShort = 0u,
    public var _bitfield: UInt = 0u,
    public var UserContext: Long = 0L,
)

public data class HIDP_UNKNOWN_TOKEN(
    public var Token: UByte = 0u,
    public var Reserved: UByteArray = UByteArray(3),
    public var BitField: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HIDP_UNKNOWN_TOKEN) return false
        if (this.Token != other.Token) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.BitField != other.BitField) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Token.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.BitField.hashCode()
        return result
    }
}

public class HIDP_VALUE_CAPS(
    public var UsagePage: UShort = 0u,
    public var ReportID: UByte = 0u,
    public var IsAlias: Boolean = false,
    public var BitField: UShort = 0u,
    public var LinkCollection: UShort = 0u,
    public var LinkUsage: UShort = 0u,
    public var LinkUsagePage: UShort = 0u,
    public var IsRange: Boolean = false,
    public var IsStringRange: Boolean = false,
    public var IsDesignatorRange: Boolean = false,
    public var IsAbsolute: Boolean = false,
    public var HasNull: Boolean = false,
    public var Reserved: UByte = 0u,
    public var BitSize: UShort = 0u,
    public var ReportCount: UShort = 0u,
    public var Reserved2: UShortArray = UShortArray(5),
    public var UnitsExp: UInt = 0u,
    public var Units: UInt = 0u,
    public var LogicalMin: Int = 0,
    public var LogicalMax: Int = 0,
    public var PhysicalMin: Int = 0,
    public var PhysicalMax: Int = 0,
    public var Anonymous: HIDP_VALUE_CAPS_0 = HIDP_VALUE_CAPS_0(),
)

public data class HIDP_VALUE_CAPS_0(public var Range: HIDP_VALUE_CAPS_0_0 = HIDP_VALUE_CAPS_0_0(), public var NotRange: HIDP_VALUE_CAPS_0_1 = HIDP_VALUE_CAPS_0_1())

public data class HIDP_VALUE_CAPS_0_1(
    public var Usage: UShort = 0u,
    public var Reserved1: UShort = 0u,
    public var StringIndex: UShort = 0u,
    public var Reserved2: UShort = 0u,
    public var DesignatorIndex: UShort = 0u,
    public var Reserved3: UShort = 0u,
    public var DataIndex: UShort = 0u,
    public var Reserved4: UShort = 0u,
)

public data class HIDP_VALUE_CAPS_0_0(
    public var UsageMin: UShort = 0u,
    public var UsageMax: UShort = 0u,
    public var StringMin: UShort = 0u,
    public var StringMax: UShort = 0u,
    public var DesignatorMin: UShort = 0u,
    public var DesignatorMax: UShort = 0u,
    public var DataIndexMin: UShort = 0u,
    public var DataIndexMax: UShort = 0u,
)

public data class HID_COLLECTION_INFORMATION(
    public var DescriptorSize: UInt = 0u,
    public var Polled: Boolean = false,
    public var Reserved1: UByteArray = UByteArray(1),
    public var VendorID: UShort = 0u,
    public var ProductID: UShort = 0u,
    public var VersionNumber: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HID_COLLECTION_INFORMATION) return false
        if (this.DescriptorSize != other.DescriptorSize) return false
        if (this.Polled != other.Polled) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        if (this.VendorID != other.VendorID) return false
        if (this.ProductID != other.ProductID) return false
        if (this.VersionNumber != other.VersionNumber) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.DescriptorSize.hashCode()
        result = 31 * result + this.Polled.hashCode()
        result = 31 * result + this.Reserved1.contentHashCode()
        result = 31 * result + this.VendorID.hashCode()
        result = 31 * result + this.ProductID.hashCode()
        result = 31 * result + this.VersionNumber.hashCode()
        return result
    }
}

public data class HID_DRIVER_CONFIG(public var Size: UInt = 0u, public var RingBufferSize: UInt = 0u)

public data class HID_XFER_PACKET(
    public var reportBuffer: Long = 0L,
    public var reportBufferLen: UInt = 0u,
    public var reportId: UByte = 0u,
)

public data class INDICATOR_LIST(public var MakeCode: UShort = 0u, public var IndicatorFlags: UShort = 0u)

public data class INPUT_BUTTON_ENABLE_INFO(public var ButtonType: GPIOBUTTONS_BUTTON_TYPE = 0, public var Enabled: Boolean = false)

public data class JOYCALIBRATE(
    public var wXbase: UInt = 0u,
    public var wXdelta: UInt = 0u,
    public var wYbase: UInt = 0u,
    public var wYdelta: UInt = 0u,
    public var wZbase: UInt = 0u,
    public var wZdelta: UInt = 0u,
)

public data class JOYPOS(
    public var dwX: UInt = 0u,
    public var dwY: UInt = 0u,
    public var dwZ: UInt = 0u,
    public var dwR: UInt = 0u,
    public var dwU: UInt = 0u,
    public var dwV: UInt = 0u,
)

public data class JOYRANGE(
    public var jpMin: JOYPOS = JOYPOS(),
    public var jpMax: JOYPOS = JOYPOS(),
    public var jpCenter: JOYPOS = JOYPOS(),
)

public data class JOYREGHWCONFIG(
    public var hws: JOYREGHWSETTINGS = JOYREGHWSETTINGS(),
    public var dwUsageSettings: UInt = 0u,
    public var hwv: JOYREGHWVALUES = JOYREGHWVALUES(),
    public var dwType: UInt = 0u,
    public var dwReserved: UInt = 0u,
)

public data class JOYREGHWSETTINGS(public var dwFlags: UInt = 0u, public var dwNumButtons: UInt = 0u)

public data class JOYREGHWVALUES(
    public var jrvHardware: JOYRANGE = JOYRANGE(),
    public var dwPOVValues: UIntArray = UIntArray(4),
    public var dwCalFlags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JOYREGHWVALUES) return false
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

public data class JOYREGUSERVALUES(
    public var dwTimeOut: UInt = 0u,
    public var jrvRanges: JOYRANGE = JOYRANGE(),
    public var jpDeadZone: JOYPOS = JOYPOS(),
)

public data class KEYBOARD_ATTRIBUTES(
    public var KeyboardIdentifier: KEYBOARD_ID = KEYBOARD_ID(),
    public var KeyboardMode: UShort = 0u,
    public var NumberOfFunctionKeys: UShort = 0u,
    public var NumberOfIndicators: UShort = 0u,
    public var NumberOfKeysTotal: UShort = 0u,
    public var InputDataQueueLength: UInt = 0u,
    public var KeyRepeatMinimum: KEYBOARD_TYPEMATIC_PARAMETERS = KEYBOARD_TYPEMATIC_PARAMETERS(),
    public var KeyRepeatMaximum: KEYBOARD_TYPEMATIC_PARAMETERS = KEYBOARD_TYPEMATIC_PARAMETERS(),
)

public data class KEYBOARD_EXTENDED_ATTRIBUTES(
    public var Version: UByte = 0u,
    public var FormFactor: UByte = 0u,
    public var KeyType: UByte = 0u,
    public var PhysicalLayout: UByte = 0u,
    public var VendorSpecificPhysicalLayout: UByte = 0u,
    public var IETFLanguageTagIndex: UByte = 0u,
    public var ImplementedInputAssistControls: UByte = 0u,
)

public data class KEYBOARD_ID(public var Type: UByte = 0u, public var Subtype: UByte = 0u)

public data class KEYBOARD_IME_STATUS(
    public var UnitId: UShort = 0u,
    public var ImeOpen: UInt = 0u,
    public var ImeConvMode: UInt = 0u,
)

public data class KEYBOARD_INDICATOR_PARAMETERS(public var UnitId: UShort = 0u, public var LedFlags: UShort = 0u)

public data class KEYBOARD_INDICATOR_TRANSLATION(public var NumberOfIndicatorKeys: UShort = 0u, public var IndicatorList: List<INDICATOR_LIST> = List(1) { INDICATOR_LIST() })

public data class KEYBOARD_INPUT_DATA(
    public var UnitId: UShort = 0u,
    public var MakeCode: UShort = 0u,
    public var Flags: UShort = 0u,
    public var Reserved: UShort = 0u,
    public var ExtraInformation: UInt = 0u,
)

public data class KEYBOARD_TYPEMATIC_PARAMETERS(
    public var UnitId: UShort = 0u,
    public var Rate: UShort = 0u,
    public var Delay: UShort = 0u,
)

public data class KEYBOARD_UNIT_ID_PARAMETER(public var UnitId: UShort = 0u)

public data class MOUSE_ATTRIBUTES(
    public var MouseIdentifier: UShort = 0u,
    public var NumberOfButtons: UShort = 0u,
    public var SampleRate: UShort = 0u,
    public var InputDataQueueLength: UInt = 0u,
)

public data class MOUSE_INPUT_DATA(
    public var UnitId: UShort = 0u,
    public var Flags: UShort = 0u,
    public var Anonymous: MOUSE_INPUT_DATA_0 = MOUSE_INPUT_DATA_0(),
    public var RawButtons: UInt = 0u,
    public var LastX: Int = 0,
    public var LastY: Int = 0,
    public var ExtraInformation: UInt = 0u,
)

public data class MOUSE_INPUT_DATA_0(public var Buttons: UInt = 0u, public var Anonymous: MOUSE_INPUT_DATA_0_0 = MOUSE_INPUT_DATA_0_0())

public data class MOUSE_INPUT_DATA_0_0(public var ButtonFlags: UShort = 0u, public var ButtonData: UShort = 0u)

public data class MOUSE_UNIT_ID_PARAMETER(public var UnitId: UShort = 0u)

public data class USAGE_AND_PAGE(public var Usage: UShort = 0u, public var UsagePage: UShort = 0u)
