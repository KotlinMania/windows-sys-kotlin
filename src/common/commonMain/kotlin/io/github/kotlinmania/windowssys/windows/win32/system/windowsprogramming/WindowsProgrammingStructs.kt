@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.ListEntry

public data class ActctxSectionKeyedData2600(
    public var cbSize: UInt = 0u,
    public var ulDataFormatVersion: UInt = 0u,
    public var lpData: COpaquePointer? = null,
    public var ulLength: UInt = 0u,
    public var lpSectionGlobalData: COpaquePointer? = null,
    public var ulSectionGlobalDataLength: UInt = 0u,
    public var lpSectionBase: COpaquePointer? = null,
    public var ulSectionTotalLength: UInt = 0u,
    public var hActCtx: Handle = null,
    public var ulAssemblyRosterIndex: UInt = 0u,
)

public data class ActctxSectionKeyedDataAssemblyMetadata(
    public var lpInformation: COpaquePointer? = null,
    public var lpSectionBase: COpaquePointer? = null,
    public var ulSectionLength: UInt = 0u,
    public var lpSectionGlobalDataBase: COpaquePointer? = null,
    public var ulSectionGlobalDataLength: UInt = 0u,
)

public data class ActivationContextBasicInformation(
    public var hActCtx: Handle = null,
    public var dwFlags: UInt = 0u,
)

public data class Cabinfoa(
    public var pszCab: Pstr = null,
    public var pszInf: Pstr = null,
    public var pszSection: Pstr = null,
    public var szSrcPath: ByteArray = ByteArray(260),
    public var dwFlags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Cabinfoa) return false
        if (this.pszCab != other.pszCab) return false
        if (this.pszInf != other.pszInf) return false
        if (this.pszSection != other.pszSection) return false
        if (!this.szSrcPath.contentEquals(other.szSrcPath)) return false
        if (this.dwFlags != other.dwFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszCab.hashCode()
        result = 31 * result + this.pszInf.hashCode()
        result = 31 * result + this.pszSection.hashCode()
        result = 31 * result + this.szSrcPath.contentHashCode()
        result = 31 * result + this.dwFlags.hashCode()
        return result
    }
}

public data class Cabinfow(
    public var pszCab: Pwstr = null,
    public var pszInf: Pwstr = null,
    public var pszSection: Pwstr = null,
    public var szSrcPath: UShortArray = UShortArray(260),
    public var dwFlags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Cabinfow) return false
        if (this.pszCab != other.pszCab) return false
        if (this.pszInf != other.pszInf) return false
        if (this.pszSection != other.pszSection) return false
        if (!this.szSrcPath.contentEquals(other.szSrcPath)) return false
        if (this.dwFlags != other.dwFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszCab.hashCode()
        result = 31 * result + this.pszInf.hashCode()
        result = 31 * result + this.pszSection.hashCode()
        result = 31 * result + this.szSrcPath.contentHashCode()
        result = 31 * result + this.dwFlags.hashCode()
        return result
    }
}

public data class ClientId(
    public var uniqueProcess: Handle = null,
    public var uniqueThread: Handle = null,
)

public data class CustomSystemEventTriggerConfig(
    public var size: UInt = 0u,
    public var triggerId: Pcwstr = null,
)

public data class CameraUIControlCaptureMode(
    public var value: Int = 0,
) {
    public var field0: Int
        get() = value
        set(v) {
            value = v
        }

    public companion object {
        public val PHOTO_OR_VIDEO: CameraUIControlCaptureMode = CameraUIControlCaptureMode(0)

        public val PHOTO: CameraUIControlCaptureMode = CameraUIControlCaptureMode(1)

        public val VIDEO: CameraUIControlCaptureMode = CameraUIControlCaptureMode(2)
    }
}

public data class CameraUIControlLinearSelectionMode(
    public var value: Int = 0,
) {
    public var field0: Int
        get() = value
        set(v) {
            value = v
        }

    public companion object {
        public val SINGLE: CameraUIControlLinearSelectionMode = CameraUIControlLinearSelectionMode(0)

        public val MULTIPLE: CameraUIControlLinearSelectionMode = CameraUIControlLinearSelectionMode(1)
    }
}

public data class CameraUIControlMode(
    public var value: Int = 0,
) {
    public var field0: Int
        get() = value
        set(v) {
            value = v
        }

    public companion object {
        public val BROWSE: CameraUIControlMode = CameraUIControlMode(0)

        public val LINEAR: CameraUIControlMode = CameraUIControlMode(1)
    }
}

public data class CameraUIControlPhotoFormat(
    public var value: Int = 0,
) {
    public var field0: Int
        get() = value
        set(v) {
            value = v
        }

    public companion object {
        public val JPEG: CameraUIControlPhotoFormat = CameraUIControlPhotoFormat(0)

        public val PNG: CameraUIControlPhotoFormat = CameraUIControlPhotoFormat(1)

        public val JPEG_XR: CameraUIControlPhotoFormat = CameraUIControlPhotoFormat(2)
    }
}

public data class CameraUIControlVideoFormat(
    public var value: Int = 0,
) {
    public var field0: Int
        get() = value
        set(v) {
            value = v
        }

    public companion object {
        public val MP4: CameraUIControlVideoFormat = CameraUIControlVideoFormat(0)

        public val WMV: CameraUIControlVideoFormat = CameraUIControlVideoFormat(1)
    }
}

public data class CameraUIControlViewType(
    public var value: Int = 0,
) {
    public var field0: Int
        get() = value
        set(v) {
            value = v
        }

    public companion object {
        public val SINGLE_ITEM: CameraUIControlViewType = CameraUIControlViewType(0)

        public val ITEM_LIST: CameraUIControlViewType = CameraUIControlViewType(1)
    }
}

public data class Datetime(
    public var year: UShort = 0u,
    public var month: UShort = 0u,
    public var day: UShort = 0u,
    public var hour: UShort = 0u,
    public var min: UShort = 0u,
    public var sec: UShort = 0u,
)

public data class Dcicmd(
    public var dwCommand: UInt = 0u,
    public var dwParam1: UInt = 0u,
    public var dwParam2: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var dwReserved: UInt = 0u,
)

public data class Dcicreateinput(
    public var cmd: Dcicmd = Dcicmd(),
    public var dwCompression: UInt = 0u,
    public var dwMask: UIntArray = UIntArray(3),
    public var dwWidth: UInt = 0u,
    public var dwHeight: UInt = 0u,
    public var dwDCICaps: UInt = 0u,
    public var dwBitCount: UInt = 0u,
    public var lpSurface: COpaquePointer? = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dcicreateinput) return false
        if (this.cmd != other.cmd) return false
        if (this.dwCompression != other.dwCompression) return false
        if (!this.dwMask.contentEquals(other.dwMask)) return false
        if (this.dwWidth != other.dwWidth) return false
        if (this.dwHeight != other.dwHeight) return false
        if (this.dwDCICaps != other.dwDCICaps) return false
        if (this.dwBitCount != other.dwBitCount) return false
        if (this.lpSurface != other.lpSurface) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cmd.hashCode()
        result = 31 * result + this.dwCompression.hashCode()
        result = 31 * result + this.dwMask.contentHashCode()
        result = 31 * result + this.dwWidth.hashCode()
        result = 31 * result + this.dwHeight.hashCode()
        result = 31 * result + this.dwDCICaps.hashCode()
        result = 31 * result + this.dwBitCount.hashCode()
        result = 31 * result + this.lpSurface.hashCode()
        return result
    }
}

public data class Dcienuminput(
    public var cmd: Dcicmd = Dcicmd(),
    public var rSrc: Rect = Rect(),
    public var rDst: Rect = Rect(),
    public var enumCallback: Int = 0,
    public var lpContext: COpaquePointer? = null,
)

public data class Dcioffscreen(
    public var dciInfo: Dcisurfaceinfo = Dcisurfaceinfo(),
    public var draw: Int = 0,
    public var setClipList: Int = 0,
    public var setDestination: Int = 0,
)

public data class Dcioverlay(
    public var dciInfo: Dcisurfaceinfo = Dcisurfaceinfo(),
    public var dwChromakeyValue: UInt = 0u,
    public var dwChromakeyMask: UInt = 0u,
)

public class Dcisurfaceinfo(
    public var dwSize: UInt = 0u,
    public var dwDCICaps: UInt = 0u,
    public var dwCompression: UInt = 0u,
    public var dwMask: UIntArray = UIntArray(3),
    public var dwWidth: UInt = 0u,
    public var dwHeight: UInt = 0u,
    public var lStride: Int = 0,
    public var dwBitCount: UInt = 0u,
    public var dwOffSurface: Int = 0,
    public var wSelSurface: UShort = 0u,
    public var wReserved: UShort = 0u,
    public var dwReserved1: UInt = 0u,
    public var dwReserved2: UInt = 0u,
    public var dwReserved3: UInt = 0u,
    public var beginAccess: Int = 0,
    public var endAccess: Int = 0,
    public var destroySurface: Int = 0,
)

public data class DelayloadInfo(
    public var size: UInt = 0u,
    public var delayloadDescriptor: ImageDelayloadDescriptor? = null,
    public var thunkAddress: ImageThunkData64? = null,
    public var targetDllName: Pcstr = null,
    public var targetApiDescriptor: DelayloadProcDescriptor = DelayloadProcDescriptor(),
    public var targetModuleBase: COpaquePointer? = null,
    public var unused: COpaquePointer? = null,
    public var lastError: UInt = 0u,
)

public data class DelayloadProcDescriptor(
    public var importDescribedByName: UInt = 0u,
    public var description: DelayloadProcDescriptor0 = DelayloadProcDescriptor0(),
)

public data class DelayloadProcDescriptor0(
    public var name: Pcstr = null,
    public var ordinal: UInt = 0u,
)

public data class FeatureError(
    public var hr: Hresult = 0,
    public var lineNumber: UShort = 0u,
    public var file: Pcstr = null,
    public var process: Pcstr = null,
    public var module: Pcstr = null,
    public var callerReturnAddressOffset: UInt = 0u,
    public var callerModule: Pcstr = null,
    public var message: Pcstr = null,
    public var originLineNumber: UShort = 0u,
    public var originFile: Pcstr = null,
    public var originModule: Pcstr = null,
    public var originCallerReturnAddressOffset: UInt = 0u,
    public var originCallerModule: Pcstr = null,
    public var originName: Pcstr = null,
)

public data class HwProfileInfoa(
    public var dwDockInfo: UInt = 0u,
    public var szHwProfileGuid: ByteArray = ByteArray(39),
    public var szHwProfileName: ByteArray = ByteArray(80),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HwProfileInfoa) return false
        if (this.dwDockInfo != other.dwDockInfo) return false
        if (!this.szHwProfileGuid.contentEquals(other.szHwProfileGuid)) return false
        if (!this.szHwProfileName.contentEquals(other.szHwProfileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwDockInfo.hashCode()
        result = 31 * result + this.szHwProfileGuid.contentHashCode()
        result = 31 * result + this.szHwProfileName.contentHashCode()
        return result
    }
}

public data class HwProfileInfow(
    public var dwDockInfo: UInt = 0u,
    public var szHwProfileGuid: UShortArray = UShortArray(39),
    public var szHwProfileName: UShortArray = UShortArray(80),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HwProfileInfow) return false
        if (this.dwDockInfo != other.dwDockInfo) return false
        if (!this.szHwProfileGuid.contentEquals(other.szHwProfileGuid)) return false
        if (!this.szHwProfileName.contentEquals(other.szHwProfileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwDockInfo.hashCode()
        result = 31 * result + this.szHwProfileGuid.contentHashCode()
        result = 31 * result + this.szHwProfileName.contentHashCode()
        return result
    }
}

public data class ImageDelayloadDescriptor(
    public var attributes: ImageDelayloadDescriptor0 = ImageDelayloadDescriptor0(),
    public var dllNameRVA: UInt = 0u,
    public var moduleHandleRVA: UInt = 0u,
    public var importAddressTableRVA: UInt = 0u,
    public var importNameTableRVA: UInt = 0u,
    public var boundImportAddressTableRVA: UInt = 0u,
    public var unloadInformationTableRVA: UInt = 0u,
    public var timeDateStamp: UInt = 0u,
)

public data class ImageDelayloadDescriptor0(
    public var allAttributes: UInt = 0u,
    public var anonymous: ImageDelayloadDescriptor00 = ImageDelayloadDescriptor00(),
)

public data class ImageDelayloadDescriptor00(
    public var bitfield: UInt = 0u,
)

public data class ImageThunkData32(
    public var u1: ImageThunkData320 = ImageThunkData320(),
)

public data class ImageThunkData320(
    public var forwarderString: UInt = 0u,
    public var function: UInt = 0u,
    public var ordinal: UInt = 0u,
    public var addressOfData: UInt = 0u,
)

public data class ImageThunkData64(
    public var u1: ImageThunkData640 = ImageThunkData640(),
)

public data class ImageThunkData640(
    public var forwarderString: ULong = 0uL,
    public var function: ULong = 0uL,
    public var ordinal: ULong = 0uL,
    public var addressOfData: ULong = 0uL,
)

public data class Imeproa(
    public var hWnd: Hwnd = null,
    public var instDate: Datetime = Datetime(),
    public var wVersion: UInt = 0u,
    public var szDescription: UByteArray = UByteArray(50),
    public var szName: UByteArray = UByteArray(80),
    public var szOptions: UByteArray = UByteArray(30),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Imeproa) return false
        if (this.hWnd != other.hWnd) return false
        if (this.instDate != other.instDate) return false
        if (this.wVersion != other.wVersion) return false
        if (!this.szDescription.contentEquals(other.szDescription)) return false
        if (!this.szName.contentEquals(other.szName)) return false
        if (!this.szOptions.contentEquals(other.szOptions)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hWnd.hashCode()
        result = 31 * result + this.instDate.hashCode()
        result = 31 * result + this.wVersion.hashCode()
        result = 31 * result + this.szDescription.contentHashCode()
        result = 31 * result + this.szName.contentHashCode()
        result = 31 * result + this.szOptions.contentHashCode()
        return result
    }
}

public data class Imeprow(
    public var hWnd: Hwnd = null,
    public var instDate: Datetime = Datetime(),
    public var wVersion: UInt = 0u,
    public var szDescription: UShortArray = UShortArray(50),
    public var szName: UShortArray = UShortArray(80),
    public var szOptions: UShortArray = UShortArray(30),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Imeprow) return false
        if (this.hWnd != other.hWnd) return false
        if (this.instDate != other.instDate) return false
        if (this.wVersion != other.wVersion) return false
        if (!this.szDescription.contentEquals(other.szDescription)) return false
        if (!this.szName.contentEquals(other.szName)) return false
        if (!this.szOptions.contentEquals(other.szOptions)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hWnd.hashCode()
        result = 31 * result + this.instDate.hashCode()
        result = 31 * result + this.wVersion.hashCode()
        result = 31 * result + this.szDescription.contentHashCode()
        result = 31 * result + this.szName.contentHashCode()
        result = 31 * result + this.szOptions.contentHashCode()
        return result
    }
}

public data class Imestruct(
    public var fnc: UInt = 0u,
    public var wParam: Wparam = 0uL,
    public var wCount: UInt = 0u,
    public var dchSource: UInt = 0u,
    public var dchDest: UInt = 0u,
    public var lParam1: Lparam = 0L,
    public var lParam2: Lparam = 0L,
    public var lParam3: Lparam = 0L,
)

public data class JavaTrust(
    public var cbSize: UInt = 0u,
    public var flag: UInt = 0u,
    public var fAllActiveXPermissions: Bool = 0,
    public var fAllPermissions: Bool = 0,
    public var dwEncodingType: UInt = 0u,
    public var pbJavaPermissions: COpaquePointer? = null,
    public var cbJavaPermissions: UInt = 0u,
    public var pbSigner: COpaquePointer? = null,
    public var cbSigner: UInt = 0u,
    public var pwszZone: Pcwstr = null,
    public var guidZone: Guid = Guid(),
    public var hVerify: Hresult = 0,
)

public data class JitDebugInfo(
    public var dwSize: UInt = 0u,
    public var dwProcessorArchitecture: UInt = 0u,
    public var dwThreadID: UInt = 0u,
    public var dwReserved0: UInt = 0u,
    public var lpExceptionAddress: ULong = 0uL,
    public var lpExceptionRecord: ULong = 0uL,
    public var lpContextRecord: ULong = 0uL,
)

public data class LdrDataTableEntry(
    public var reserved1: List<COpaquePointer> = List(2) { COpaquePointer(0L) },
    public var inMemoryOrderLinks: ListEntry = ListEntry(),
    public var reserved2: List<COpaquePointer> = List(2) { COpaquePointer(0L) },
    public var dllBase: COpaquePointer? = null,
    public var reserved3: List<COpaquePointer> = List(2) { COpaquePointer(0L) },
    public var fullDllName: UnicodeString = UnicodeString(),
    public var reserved4: UByteArray = UByteArray(8),
    public var reserved5: List<COpaquePointer> = List(3) { COpaquePointer(0L) },
    public var anonymous: LdrDataTableEntry0 = LdrDataTableEntry0(),
    public var timeDateStamp: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LdrDataTableEntry) return false
        if (this.reserved1 != other.reserved1) return false
        if (this.inMemoryOrderLinks != other.inMemoryOrderLinks) return false
        if (this.reserved2 != other.reserved2) return false
        if (this.dllBase != other.dllBase) return false
        if (this.reserved3 != other.reserved3) return false
        if (this.fullDllName != other.fullDllName) return false
        if (!this.reserved4.contentEquals(other.reserved4)) return false
        if (this.reserved5 != other.reserved5) return false
        if (this.anonymous != other.anonymous) return false
        if (this.timeDateStamp != other.timeDateStamp) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved1.hashCode()
        result = 31 * result + this.inMemoryOrderLinks.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.dllBase.hashCode()
        result = 31 * result + this.reserved3.hashCode()
        result = 31 * result + this.fullDllName.hashCode()
        result = 31 * result + this.reserved4.contentHashCode()
        result = 31 * result + this.reserved5.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.timeDateStamp.hashCode()
        return result
    }
}

public data class LdrDataTableEntry0(
    public var checkSum: UInt = 0u,
    public var reserved6: COpaquePointer? = null,
)

public data class Perusersectiona(
    public var szGUID: ByteArray = ByteArray(59),
    public var szDispName: ByteArray = ByteArray(128),
    public var szLocale: ByteArray = ByteArray(10),
    public var szStub: ByteArray = ByteArray(1040),
    public var szVersion: ByteArray = ByteArray(32),
    public var szCompID: ByteArray = ByteArray(128),
    public var dwIsInstalled: UInt = 0u,
    public var bRollback: Bool = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Perusersectiona) return false
        if (!this.szGUID.contentEquals(other.szGUID)) return false
        if (!this.szDispName.contentEquals(other.szDispName)) return false
        if (!this.szLocale.contentEquals(other.szLocale)) return false
        if (!this.szStub.contentEquals(other.szStub)) return false
        if (!this.szVersion.contentEquals(other.szVersion)) return false
        if (!this.szCompID.contentEquals(other.szCompID)) return false
        if (this.dwIsInstalled != other.dwIsInstalled) return false
        if (this.bRollback != other.bRollback) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szGUID.contentHashCode()
        result = 31 * result + this.szDispName.contentHashCode()
        result = 31 * result + this.szLocale.contentHashCode()
        result = 31 * result + this.szStub.contentHashCode()
        result = 31 * result + this.szVersion.contentHashCode()
        result = 31 * result + this.szCompID.contentHashCode()
        result = 31 * result + this.dwIsInstalled.hashCode()
        result = 31 * result + this.bRollback.hashCode()
        return result
    }
}

public data class Perusersectionw(
    public var szGUID: UShortArray = UShortArray(59),
    public var szDispName: UShortArray = UShortArray(128),
    public var szLocale: UShortArray = UShortArray(10),
    public var szStub: UShortArray = UShortArray(1040),
    public var szVersion: UShortArray = UShortArray(32),
    public var szCompID: UShortArray = UShortArray(128),
    public var dwIsInstalled: UInt = 0u,
    public var bRollback: Bool = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Perusersectionw) return false
        if (!this.szGUID.contentEquals(other.szGUID)) return false
        if (!this.szDispName.contentEquals(other.szDispName)) return false
        if (!this.szLocale.contentEquals(other.szLocale)) return false
        if (!this.szStub.contentEquals(other.szStub)) return false
        if (!this.szVersion.contentEquals(other.szVersion)) return false
        if (!this.szCompID.contentEquals(other.szCompID)) return false
        if (this.dwIsInstalled != other.dwIsInstalled) return false
        if (this.bRollback != other.bRollback) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szGUID.contentHashCode()
        result = 31 * result + this.szDispName.contentHashCode()
        result = 31 * result + this.szLocale.contentHashCode()
        result = 31 * result + this.szStub.contentHashCode()
        result = 31 * result + this.szVersion.contentHashCode()
        result = 31 * result + this.szCompID.contentHashCode()
        result = 31 * result + this.dwIsInstalled.hashCode()
        result = 31 * result + this.bRollback.hashCode()
        return result
    }
}

public data class PublicObjectBasicInformation(
    public var attributes: UInt = 0u,
    public var grantedAccess: UInt = 0u,
    public var handleCount: UInt = 0u,
    public var pointerCount: UInt = 0u,
    public var reserved: UIntArray = UIntArray(10),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PublicObjectBasicInformation) return false
        if (this.attributes != other.attributes) return false
        if (this.grantedAccess != other.grantedAccess) return false
        if (this.handleCount != other.handleCount) return false
        if (this.pointerCount != other.pointerCount) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.attributes.hashCode()
        result = 31 * result + this.grantedAccess.hashCode()
        result = 31 * result + this.handleCount.hashCode()
        result = 31 * result + this.pointerCount.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class PublicObjectTypeInformation(
    public var typeName: UnicodeString = UnicodeString(),
    public var reserved: UIntArray = UIntArray(22),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PublicObjectTypeInformation) return false
        if (this.typeName != other.typeName) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.typeName.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class Strentrya(
    public var pszName: Pstr = null,
    public var pszValue: Pstr = null,
)

public data class Strentryw(
    public var pszName: Pwstr = null,
    public var pszValue: Pwstr = null,
)

public data class Stringexstruct(
    public var dwSize: UInt = 0u,
    public var uDeterminePos: UInt = 0u,
    public var uDetermineDelimPos: UInt = 0u,
    public var uYomiPos: UInt = 0u,
    public var uYomiDelimPos: UInt = 0u,
)

public data class Strtablea(
    public var cEntries: UInt = 0u,
    public var pse: Strentrya? = null,
)

public data class Strtablew(
    public var cEntries: UInt = 0u,
    public var pse: Strentryw? = null,
)

public data class SystemBasicInformation(
    public var reserved1: UByteArray = UByteArray(24),
    public var reserved2: List<COpaquePointer> = List(4) { COpaquePointer(0L) },
    public var numberOfProcessors: Byte = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SystemBasicInformation) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (this.reserved2 != other.reserved2) return false
        if (this.numberOfProcessors != other.numberOfProcessors) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved1.contentHashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.numberOfProcessors.hashCode()
        return result
    }
}

public data class SystemCodeintegrityInformation(
    public var length: UInt = 0u,
    public var codeIntegrityOptions: UInt = 0u,
)

public data class SystemExceptionInformation(
    public var reserved1: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SystemExceptionInformation) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        return true
    }

    override fun hashCode(): Int = this.reserved1.contentHashCode()
}

public data class SystemInterruptInformation(
    public var reserved1: UByteArray = UByteArray(24),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SystemInterruptInformation) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        return true
    }

    override fun hashCode(): Int = this.reserved1.contentHashCode()
}

public data class SystemLookasideInformation(
    public var reserved1: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SystemLookasideInformation) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        return true
    }

    override fun hashCode(): Int = this.reserved1.contentHashCode()
}

public data class SystemPerformanceInformation(
    public var reserved1: UByteArray = UByteArray(312),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SystemPerformanceInformation) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        return true
    }

    override fun hashCode(): Int = this.reserved1.contentHashCode()
}

public data class SystemPolicyInformation(
    public var reserved1: List<COpaquePointer> = List(2) { COpaquePointer(0L) },
    public var reserved2: UIntArray = UIntArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SystemPolicyInformation) return false
        if (this.reserved1 != other.reserved1) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved1.hashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        return result
    }
}

public data class SystemProcessorPerformanceInformation(
    public var idleTime: Long = 0L,
    public var kernelTime: Long = 0L,
    public var userTime: Long = 0L,
    public var reserved1: LongArray = LongArray(2),
    public var reserved2: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SystemProcessorPerformanceInformation) return false
        if (this.idleTime != other.idleTime) return false
        if (this.kernelTime != other.kernelTime) return false
        if (this.userTime != other.userTime) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (this.reserved2 != other.reserved2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.idleTime.hashCode()
        result = 31 * result + this.kernelTime.hashCode()
        result = 31 * result + this.userTime.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.reserved2.hashCode()
        return result
    }
}

public class SystemProcessInformation(
    public var nextEntryOffset: UInt = 0u,
    public var numberOfThreads: UInt = 0u,
    public var reserved1: UByteArray = UByteArray(48),
    public var imageName: UnicodeString = UnicodeString(),
    public var basePriority: Int = 0,
    public var uniqueProcessId: Handle = null,
    public var reserved2: COpaquePointer? = null,
    public var handleCount: UInt = 0u,
    public var sessionId: UInt = 0u,
    public var reserved3: COpaquePointer? = null,
    public var peakVirtualSize: Int = 0,
    public var virtualSize: Int = 0,
    public var reserved4: UInt = 0u,
    public var peakWorkingSetSize: Int = 0,
    public var workingSetSize: Int = 0,
    public var reserved5: COpaquePointer? = null,
    public var quotaPagedPoolUsage: Int = 0,
    public var reserved6: COpaquePointer? = null,
    public var quotaNonPagedPoolUsage: Int = 0,
    public var pagefileUsage: Int = 0,
    public var peakPagefileUsage: Int = 0,
    public var privatePageCount: Int = 0,
    public var reserved7: LongArray = LongArray(6),
)

public data class SystemRegistryQuotaInformation(
    public var registryQuotaAllowed: UInt = 0u,
    public var registryQuotaUsed: UInt = 0u,
    public var reserved1: COpaquePointer? = null,
)

public data class SystemThreadInformation(
    public var reserved1: LongArray = LongArray(3),
    public var reserved2: UInt = 0u,
    public var startAddress: COpaquePointer? = null,
    public var clientId: ClientId = ClientId(),
    public var priority: Int = 0,
    public var basePriority: Int = 0,
    public var reserved3: UInt = 0u,
    public var threadState: UInt = 0u,
    public var waitReason: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SystemThreadInformation) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (this.reserved2 != other.reserved2) return false
        if (this.startAddress != other.startAddress) return false
        if (this.clientId != other.clientId) return false
        if (this.priority != other.priority) return false
        if (this.basePriority != other.basePriority) return false
        if (this.reserved3 != other.reserved3) return false
        if (this.threadState != other.threadState) return false
        if (this.waitReason != other.waitReason) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved1.contentHashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.startAddress.hashCode()
        result = 31 * result + this.clientId.hashCode()
        result = 31 * result + this.priority.hashCode()
        result = 31 * result + this.basePriority.hashCode()
        result = 31 * result + this.reserved3.hashCode()
        result = 31 * result + this.threadState.hashCode()
        result = 31 * result + this.waitReason.hashCode()
        return result
    }
}

public data class SystemTimeofdayInformation(
    public var reserved1: UByteArray = UByteArray(48),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SystemTimeofdayInformation) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        return true
    }

    override fun hashCode(): Int = this.reserved1.contentHashCode()
}

public data class TcpRequestQueryInformationEx32Xp(
    public var id: TDIObjectID = TDIObjectID(),
    public var context: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TcpRequestQueryInformationEx32Xp) return false
        if (this.id != other.id) return false
        if (!this.context.contentEquals(other.context)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.id.hashCode()
        result = 31 * result + this.context.contentHashCode()
        return result
    }
}

public data class TcpRequestQueryInformationExW2k(
    public var id: TDIObjectID = TDIObjectID(),
    public var context: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TcpRequestQueryInformationExW2k) return false
        if (this.id != other.id) return false
        if (!this.context.contentEquals(other.context)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.id.hashCode()
        result = 31 * result + this.context.contentHashCode()
        return result
    }
}

public data class TcpRequestQueryInformationExXp(
    public var id: TDIObjectID = TDIObjectID(),
    public var context: IntArray = IntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TcpRequestQueryInformationExXp) return false
        if (this.id != other.id) return false
        if (!this.context.contentEquals(other.context)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.id.hashCode()
        result = 31 * result + this.context.contentHashCode()
        return result
    }
}

public data class TcpRequestSetInformationEx(
    public var id: TDIObjectID = TDIObjectID(),
    public var bufferSize: UInt = 0u,
    public var buffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TcpRequestSetInformationEx) return false
        if (this.id != other.id) return false
        if (this.bufferSize != other.bufferSize) return false
        if (!this.buffer.contentEquals(other.buffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.id.hashCode()
        result = 31 * result + this.bufferSize.hashCode()
        result = 31 * result + this.buffer.contentHashCode()
        return result
    }
}

public data class TDIEntityID(
    public var teiEntity: TdientityEntityType = 0u,
    public var teiInstance: UInt = 0u,
)

public data class TDIObjectID(
    public var toiEntity: TDIEntityID = TDIEntityID(),
    public var toiClass: UInt = 0u,
    public var toiType: UInt = 0u,
    public var toiId: UInt = 0u,
)

public data class TdiTlIoControlEndpoint(
    public var type: TdiTlIoControlType = 0,
    public var level: UInt = 0u,
    public var anonymous: TdiTlIoControlEndpoint0 = TdiTlIoControlEndpoint0(),
    public var inputBuffer: COpaquePointer? = null,
    public var inputBufferLength: UInt = 0u,
    public var outputBuffer: COpaquePointer? = null,
    public var outputBufferLength: UInt = 0u,
)

public data class TdiTlIoControlEndpoint0(
    public var ioControlCode: UInt = 0u,
    public var optionName: UInt = 0u,
)

public data class ThreadNameInformation(
    public var threadName: UnicodeString = UnicodeString(),
)

public data class Undeterminestruct(
    public var dwSize: UInt = 0u,
    public var uDefIMESize: UInt = 0u,
    public var uDefIMEPos: UInt = 0u,
    public var uUndetTextLen: UInt = 0u,
    public var uUndetTextPos: UInt = 0u,
    public var uUndetAttrPos: UInt = 0u,
    public var uCursorPos: UInt = 0u,
    public var uDeltaStart: UInt = 0u,
    public var uDetermineTextLen: UInt = 0u,
    public var uDetermineTextPos: UInt = 0u,
    public var uDetermineDelimPos: UInt = 0u,
    public var uYomiTextLen: UInt = 0u,
    public var uYomiTextPos: UInt = 0u,
    public var uYomiDelimPos: UInt = 0u,
)

public data class Winstationinformationw(
    public var reserved2: UByteArray = UByteArray(70),
    public var logonId: UInt = 0u,
    public var reserved3: UByteArray = UByteArray(1140),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Winstationinformationw) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        if (this.logonId != other.logonId) return false
        if (!this.reserved3.contentEquals(other.reserved3)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved2.contentHashCode()
        result = 31 * result + this.logonId.hashCode()
        result = 31 * result + this.reserved3.contentHashCode()
        return result
    }
}

public data class WldpDeviceSecurityInformation(
    public var unlockIdSize: UInt = 0u,
    public var unlockId: COpaquePointer? = null,
    public var manufacturerIDLength: UInt = 0u,
    public var manufacturerID: Pwstr = null,
)

public data class WldpHostInformation(
    public var dwRevision: UInt = 0u,
    public var dwHostId: WldpHostId = 0,
    public var szSource: Pcwstr = null,
    public var hSource: Handle = null,
)
