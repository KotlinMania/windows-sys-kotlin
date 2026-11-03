@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public data class ACTCTX_SECTION_KEYED_DATA_2600(
    public var cbSize: UInt = 0u,
    public var ulDataFormatVersion: UInt = 0u,
    public var lpData: Long = 0L,
    public var ulLength: UInt = 0u,
    public var lpSectionGlobalData: Long = 0L,
    public var ulSectionGlobalDataLength: UInt = 0u,
    public var lpSectionBase: Long = 0L,
    public var ulSectionTotalLength: UInt = 0u,
    public var hActCtx: Foundation.HANDLE = Foundation.HANDLE(),
    public var ulAssemblyRosterIndex: UInt = 0u,
)

public data class ACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA(
    public var lpInformation: Long = 0L,
    public var lpSectionBase: Long = 0L,
    public var ulSectionLength: UInt = 0u,
    public var lpSectionGlobalDataBase: Long = 0L,
    public var ulSectionGlobalDataLength: UInt = 0u,
)

public data class ACTIVATION_CONTEXT_BASIC_INFORMATION(public var hActCtx: Foundation.HANDLE = Foundation.HANDLE(), public var dwFlags: UInt = 0u)

public data class CABINFOA(
    public var pszCab: PSTR = 0L,
    public var pszInf: PSTR = 0L,
    public var pszSection: PSTR = 0L,
    public var szSrcPath: ByteArray = ByteArray(260),
    public var dwFlags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CABINFOA) return false
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

public data class CABINFOW(
    public var pszCab: PWSTR = 0L,
    public var pszInf: PWSTR = 0L,
    public var pszSection: PWSTR = 0L,
    public var szSrcPath: UShortArray = UShortArray(260),
    public var dwFlags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CABINFOW) return false
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

public data class CLIENT_ID(public var UniqueProcess: Foundation.HANDLE = Foundation.HANDLE(), public var UniqueThread: Foundation.HANDLE = Foundation.HANDLE())

public data class CUSTOM_SYSTEM_EVENT_TRIGGER_CONFIG(public var Size: UInt = 0u, public var TriggerId: PCWSTR = 0L)

public data class CameraUIControlCaptureMode(public var value: Int = 0) {
    public var field0: Int
        get() = value
        set(v) { value = v }

    public companion object {
        public val PhotoOrVideo: CameraUIControlCaptureMode = CameraUIControlCaptureMode(0)

        public val Photo: CameraUIControlCaptureMode = CameraUIControlCaptureMode(1)

        public val Video: CameraUIControlCaptureMode = CameraUIControlCaptureMode(2)
    }
}

public data class CameraUIControlLinearSelectionMode(public var value: Int = 0) {
    public var field0: Int
        get() = value
        set(v) { value = v }

    public companion object {
        public val Single: CameraUIControlLinearSelectionMode = CameraUIControlLinearSelectionMode(0)

        public val Multiple: CameraUIControlLinearSelectionMode = CameraUIControlLinearSelectionMode(1)
    }
}

public data class CameraUIControlMode(public var value: Int = 0) {
    public var field0: Int
        get() = value
        set(v) { value = v }

    public companion object {
        public val Browse: CameraUIControlMode = CameraUIControlMode(0)

        public val Linear: CameraUIControlMode = CameraUIControlMode(1)
    }
}

public data class CameraUIControlPhotoFormat(public var value: Int = 0) {
    public var field0: Int
        get() = value
        set(v) { value = v }

    public companion object {
        public val Jpeg: CameraUIControlPhotoFormat = CameraUIControlPhotoFormat(0)

        public val Png: CameraUIControlPhotoFormat = CameraUIControlPhotoFormat(1)

        public val JpegXR: CameraUIControlPhotoFormat = CameraUIControlPhotoFormat(2)
    }
}

public data class CameraUIControlVideoFormat(public var value: Int = 0) {
    public var field0: Int
        get() = value
        set(v) { value = v }

    public companion object {
        public val Mp4: CameraUIControlVideoFormat = CameraUIControlVideoFormat(0)

        public val Wmv: CameraUIControlVideoFormat = CameraUIControlVideoFormat(1)
    }
}

public data class CameraUIControlViewType(public var value: Int = 0) {
    public var field0: Int
        get() = value
        set(v) { value = v }

    public companion object {
        public val SingleItem: CameraUIControlViewType = CameraUIControlViewType(0)

        public val ItemList: CameraUIControlViewType = CameraUIControlViewType(1)
    }
}

public data class DATETIME(
    public var year: UShort = 0u,
    public var month: UShort = 0u,
    public var day: UShort = 0u,
    public var hour: UShort = 0u,
    public var min: UShort = 0u,
    public var sec: UShort = 0u,
)

public data class DCICMD(
    public var dwCommand: UInt = 0u,
    public var dwParam1: UInt = 0u,
    public var dwParam2: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var dwReserved: UInt = 0u,
)

public data class DCICREATEINPUT(
    public var cmd: DCICMD = DCICMD(),
    public var dwCompression: UInt = 0u,
    public var dwMask: UIntArray = UIntArray(3),
    public var dwWidth: UInt = 0u,
    public var dwHeight: UInt = 0u,
    public var dwDCICaps: UInt = 0u,
    public var dwBitCount: UInt = 0u,
    public var lpSurface: Long = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DCICREATEINPUT) return false
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

public data class DCIENUMINPUT(
    public var cmd: DCICMD = DCICMD(),
    public var rSrc: Foundation.RECT = Foundation.RECT(),
    public var rDst: Foundation.RECT = Foundation.RECT(),
    public var EnumCallback: Long = 0L,
    public var lpContext: Long = 0L,
)

public data class DCIOFFSCREEN(
    public var dciInfo: DCISURFACEINFO = DCISURFACEINFO(),
    public var Draw: Long = 0L,
    public var SetClipList: Long = 0L,
    public var SetDestination: Long = 0L,
)

public data class DCIOVERLAY(
    public var dciInfo: DCISURFACEINFO = DCISURFACEINFO(),
    public var dwChromakeyValue: UInt = 0u,
    public var dwChromakeyMask: UInt = 0u,
)

public class DCISURFACEINFO(
    public var dwSize: UInt = 0u,
    public var dwDCICaps: UInt = 0u,
    public var dwCompression: UInt = 0u,
    public var dwMask: UIntArray = UIntArray(3),
    public var dwWidth: UInt = 0u,
    public var dwHeight: UInt = 0u,
    public var lStride: Int = 0,
    public var dwBitCount: UInt = 0u,
    public var dwOffSurface: ULong = 0uL,
    public var wSelSurface: UShort = 0u,
    public var wReserved: UShort = 0u,
    public var dwReserved1: UInt = 0u,
    public var dwReserved2: UInt = 0u,
    public var dwReserved3: UInt = 0u,
    public var BeginAccess: Long = 0L,
    public var EndAccess: Long = 0L,
    public var DestroySurface: Long = 0L,
)

public data class DELAYLOAD_INFO(
    public var Size: UInt = 0u,
    public var DelayloadDescriptor: Long = 0L,
    public var ThunkAddress: Long = 0L,
    public var TargetDllName: PCSTR = 0L,
    public var TargetApiDescriptor: DELAYLOAD_PROC_DESCRIPTOR = DELAYLOAD_PROC_DESCRIPTOR(),
    public var TargetModuleBase: Long = 0L,
    public var Unused: Long = 0L,
    public var LastError: UInt = 0u,
)

public data class DELAYLOAD_PROC_DESCRIPTOR(public var ImportDescribedByName: UInt = 0u, public var Description: DELAYLOAD_PROC_DESCRIPTOR_0 = DELAYLOAD_PROC_DESCRIPTOR_0())

public data class DELAYLOAD_PROC_DESCRIPTOR_0(public var Name: PCSTR = 0L, public var Ordinal: UInt = 0u)

public data class FEATURE_ERROR(
    public var hr: HRESULT = 0,
    public var lineNumber: UShort = 0u,
    public var file: PCSTR = 0L,
    public var process: PCSTR = 0L,
    public var module: PCSTR = 0L,
    public var callerReturnAddressOffset: UInt = 0u,
    public var callerModule: PCSTR = 0L,
    public var message: PCSTR = 0L,
    public var originLineNumber: UShort = 0u,
    public var originFile: PCSTR = 0L,
    public var originModule: PCSTR = 0L,
    public var originCallerReturnAddressOffset: UInt = 0u,
    public var originCallerModule: PCSTR = 0L,
    public var originName: PCSTR = 0L,
)

public data class HW_PROFILE_INFOA(
    public var dwDockInfo: UInt = 0u,
    public var szHwProfileGuid: ByteArray = ByteArray(39),
    public var szHwProfileName: ByteArray = ByteArray(80),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HW_PROFILE_INFOA) return false
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

public data class HW_PROFILE_INFOW(
    public var dwDockInfo: UInt = 0u,
    public var szHwProfileGuid: UShortArray = UShortArray(39),
    public var szHwProfileName: UShortArray = UShortArray(80),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HW_PROFILE_INFOW) return false
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

public data class IMAGE_DELAYLOAD_DESCRIPTOR(
    public var Attributes: IMAGE_DELAYLOAD_DESCRIPTOR_0 = IMAGE_DELAYLOAD_DESCRIPTOR_0(),
    public var DllNameRVA: UInt = 0u,
    public var ModuleHandleRVA: UInt = 0u,
    public var ImportAddressTableRVA: UInt = 0u,
    public var ImportNameTableRVA: UInt = 0u,
    public var BoundImportAddressTableRVA: UInt = 0u,
    public var UnloadInformationTableRVA: UInt = 0u,
    public var TimeDateStamp: UInt = 0u,
)

public data class IMAGE_DELAYLOAD_DESCRIPTOR_0(public var AllAttributes: UInt = 0u, public var Anonymous: IMAGE_DELAYLOAD_DESCRIPTOR_0_0 = IMAGE_DELAYLOAD_DESCRIPTOR_0_0())

public data class IMAGE_DELAYLOAD_DESCRIPTOR_0_0(public var _bitfield: UInt = 0u)

public data class IMAGE_THUNK_DATA32(public var u1: IMAGE_THUNK_DATA32_0 = IMAGE_THUNK_DATA32_0())

public data class IMAGE_THUNK_DATA32_0(
    public var ForwarderString: UInt = 0u,
    public var Function: UInt = 0u,
    public var Ordinal: UInt = 0u,
    public var AddressOfData: UInt = 0u,
)

public data class IMAGE_THUNK_DATA64(public var u1: IMAGE_THUNK_DATA64_0 = IMAGE_THUNK_DATA64_0())

public data class IMAGE_THUNK_DATA64_0(
    public var ForwarderString: ULong = 0uL,
    public var Function: ULong = 0uL,
    public var Ordinal: ULong = 0uL,
    public var AddressOfData: ULong = 0uL,
)

public data class IMEPROA(
    public var hWnd: Foundation.HWND = Foundation.HWND(),
    public var InstDate: DATETIME = DATETIME(),
    public var wVersion: UInt = 0u,
    public var szDescription: UByteArray = UByteArray(50),
    public var szName: UByteArray = UByteArray(80),
    public var szOptions: UByteArray = UByteArray(30),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IMEPROA) return false
        if (this.hWnd != other.hWnd) return false
        if (this.InstDate != other.InstDate) return false
        if (this.wVersion != other.wVersion) return false
        if (!this.szDescription.contentEquals(other.szDescription)) return false
        if (!this.szName.contentEquals(other.szName)) return false
        if (!this.szOptions.contentEquals(other.szOptions)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hWnd.hashCode()
        result = 31 * result + this.InstDate.hashCode()
        result = 31 * result + this.wVersion.hashCode()
        result = 31 * result + this.szDescription.contentHashCode()
        result = 31 * result + this.szName.contentHashCode()
        result = 31 * result + this.szOptions.contentHashCode()
        return result
    }
}

public data class IMEPROW(
    public var hWnd: Foundation.HWND = Foundation.HWND(),
    public var InstDate: DATETIME = DATETIME(),
    public var wVersion: UInt = 0u,
    public var szDescription: UShortArray = UShortArray(50),
    public var szName: UShortArray = UShortArray(80),
    public var szOptions: UShortArray = UShortArray(30),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IMEPROW) return false
        if (this.hWnd != other.hWnd) return false
        if (this.InstDate != other.InstDate) return false
        if (this.wVersion != other.wVersion) return false
        if (!this.szDescription.contentEquals(other.szDescription)) return false
        if (!this.szName.contentEquals(other.szName)) return false
        if (!this.szOptions.contentEquals(other.szOptions)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hWnd.hashCode()
        result = 31 * result + this.InstDate.hashCode()
        result = 31 * result + this.wVersion.hashCode()
        result = 31 * result + this.szDescription.contentHashCode()
        result = 31 * result + this.szName.contentHashCode()
        result = 31 * result + this.szOptions.contentHashCode()
        return result
    }
}

public data class IMESTRUCT(
    public var fnc: UInt = 0u,
    public var wParam: Foundation.WPARAM = Foundation.WPARAM(),
    public var wCount: UInt = 0u,
    public var dchSource: UInt = 0u,
    public var dchDest: UInt = 0u,
    public var lParam1: Foundation.LPARAM = Foundation.LPARAM(),
    public var lParam2: Foundation.LPARAM = Foundation.LPARAM(),
    public var lParam3: Foundation.LPARAM = Foundation.LPARAM(),
)

public data class JAVA_TRUST(
    public var cbSize: UInt = 0u,
    public var flag: UInt = 0u,
    public var fAllActiveXPermissions: BOOL = 0,
    public var fAllPermissions: BOOL = 0,
    public var dwEncodingType: UInt = 0u,
    public var pbJavaPermissions: Long = 0L,
    public var cbJavaPermissions: UInt = 0u,
    public var pbSigner: Long = 0L,
    public var cbSigner: UInt = 0u,
    public var pwszZone: PCWSTR = 0L,
    public var guidZone: GUID = GUID(),
    public var hVerify: HRESULT = 0,
)

public data class JIT_DEBUG_INFO(
    public var dwSize: UInt = 0u,
    public var dwProcessorArchitecture: UInt = 0u,
    public var dwThreadID: UInt = 0u,
    public var dwReserved0: UInt = 0u,
    public var lpExceptionAddress: ULong = 0uL,
    public var lpExceptionRecord: ULong = 0uL,
    public var lpContextRecord: ULong = 0uL,
)

public data class LDR_DATA_TABLE_ENTRY(
    public var Reserved1: LongArray = LongArray(2),
    public var InMemoryOrderLinks: Kernel.LIST_ENTRY = Kernel.LIST_ENTRY(),
    public var Reserved2: LongArray = LongArray(2),
    public var DllBase: Long = 0L,
    public var Reserved3: LongArray = LongArray(2),
    public var FullDllName: Foundation.UNICODE_STRING = Foundation.UNICODE_STRING(),
    public var Reserved4: UByteArray = UByteArray(8),
    public var Reserved5: LongArray = LongArray(3),
    public var Anonymous: LDR_DATA_TABLE_ENTRY_0 = LDR_DATA_TABLE_ENTRY_0(),
    public var TimeDateStamp: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LDR_DATA_TABLE_ENTRY) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        if (this.InMemoryOrderLinks != other.InMemoryOrderLinks) return false
        if (!this.Reserved2.contentEquals(other.Reserved2)) return false
        if (this.DllBase != other.DllBase) return false
        if (!this.Reserved3.contentEquals(other.Reserved3)) return false
        if (this.FullDllName != other.FullDllName) return false
        if (!this.Reserved4.contentEquals(other.Reserved4)) return false
        if (!this.Reserved5.contentEquals(other.Reserved5)) return false
        if (this.Anonymous != other.Anonymous) return false
        if (this.TimeDateStamp != other.TimeDateStamp) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Reserved1.contentHashCode()
        result = 31 * result + this.InMemoryOrderLinks.hashCode()
        result = 31 * result + this.Reserved2.contentHashCode()
        result = 31 * result + this.DllBase.hashCode()
        result = 31 * result + this.Reserved3.contentHashCode()
        result = 31 * result + this.FullDllName.hashCode()
        result = 31 * result + this.Reserved4.contentHashCode()
        result = 31 * result + this.Reserved5.contentHashCode()
        result = 31 * result + this.Anonymous.hashCode()
        result = 31 * result + this.TimeDateStamp.hashCode()
        return result
    }
}

public data class LDR_DATA_TABLE_ENTRY_0(public var CheckSum: UInt = 0u, public var Reserved6: Long = 0L)

public data class PERUSERSECTIONA(
    public var szGUID: ByteArray = ByteArray(59),
    public var szDispName: ByteArray = ByteArray(128),
    public var szLocale: ByteArray = ByteArray(10),
    public var szStub: ByteArray = ByteArray(1040),
    public var szVersion: ByteArray = ByteArray(32),
    public var szCompID: ByteArray = ByteArray(128),
    public var dwIsInstalled: UInt = 0u,
    public var bRollback: BOOL = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PERUSERSECTIONA) return false
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

public data class PERUSERSECTIONW(
    public var szGUID: UShortArray = UShortArray(59),
    public var szDispName: UShortArray = UShortArray(128),
    public var szLocale: UShortArray = UShortArray(10),
    public var szStub: UShortArray = UShortArray(1040),
    public var szVersion: UShortArray = UShortArray(32),
    public var szCompID: UShortArray = UShortArray(128),
    public var dwIsInstalled: UInt = 0u,
    public var bRollback: BOOL = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PERUSERSECTIONW) return false
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

public data class PUBLIC_OBJECT_BASIC_INFORMATION(
    public var Attributes: UInt = 0u,
    public var GrantedAccess: UInt = 0u,
    public var HandleCount: UInt = 0u,
    public var PointerCount: UInt = 0u,
    public var Reserved: UIntArray = UIntArray(10),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PUBLIC_OBJECT_BASIC_INFORMATION) return false
        if (this.Attributes != other.Attributes) return false
        if (this.GrantedAccess != other.GrantedAccess) return false
        if (this.HandleCount != other.HandleCount) return false
        if (this.PointerCount != other.PointerCount) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Attributes.hashCode()
        result = 31 * result + this.GrantedAccess.hashCode()
        result = 31 * result + this.HandleCount.hashCode()
        result = 31 * result + this.PointerCount.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class PUBLIC_OBJECT_TYPE_INFORMATION(public var TypeName: Foundation.UNICODE_STRING = Foundation.UNICODE_STRING(), public var Reserved: UIntArray = UIntArray(22)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PUBLIC_OBJECT_TYPE_INFORMATION) return false
        if (this.TypeName != other.TypeName) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.TypeName.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class STRENTRYA(public var pszName: PSTR = 0L, public var pszValue: PSTR = 0L)

public data class STRENTRYW(public var pszName: PWSTR = 0L, public var pszValue: PWSTR = 0L)

public data class STRINGEXSTRUCT(
    public var dwSize: UInt = 0u,
    public var uDeterminePos: UInt = 0u,
    public var uDetermineDelimPos: UInt = 0u,
    public var uYomiPos: UInt = 0u,
    public var uYomiDelimPos: UInt = 0u,
)

public data class STRTABLEA(public var cEntries: UInt = 0u, public var pse: Long = 0L)

public data class STRTABLEW(public var cEntries: UInt = 0u, public var pse: Long = 0L)

public data class SYSTEM_BASIC_INFORMATION(
    public var Reserved1: UByteArray = UByteArray(24),
    public var Reserved2: LongArray = LongArray(4),
    public var NumberOfProcessors: Byte = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SYSTEM_BASIC_INFORMATION) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        if (!this.Reserved2.contentEquals(other.Reserved2)) return false
        if (this.NumberOfProcessors != other.NumberOfProcessors) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Reserved1.contentHashCode()
        result = 31 * result + this.Reserved2.contentHashCode()
        result = 31 * result + this.NumberOfProcessors.hashCode()
        return result
    }
}

public data class SYSTEM_CODEINTEGRITY_INFORMATION(public var Length: UInt = 0u, public var CodeIntegrityOptions: UInt = 0u)

public data class SYSTEM_EXCEPTION_INFORMATION(public var Reserved1: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SYSTEM_EXCEPTION_INFORMATION) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.Reserved1.contentHashCode()
    }
}

public data class SYSTEM_INTERRUPT_INFORMATION(public var Reserved1: UByteArray = UByteArray(24)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SYSTEM_INTERRUPT_INFORMATION) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.Reserved1.contentHashCode()
    }
}

public data class SYSTEM_LOOKASIDE_INFORMATION(public var Reserved1: UByteArray = UByteArray(32)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SYSTEM_LOOKASIDE_INFORMATION) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.Reserved1.contentHashCode()
    }
}

public data class SYSTEM_PERFORMANCE_INFORMATION(public var Reserved1: UByteArray = UByteArray(312)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SYSTEM_PERFORMANCE_INFORMATION) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.Reserved1.contentHashCode()
    }
}

public data class SYSTEM_POLICY_INFORMATION(public var Reserved1: LongArray = LongArray(2), public var Reserved2: UIntArray = UIntArray(3)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SYSTEM_POLICY_INFORMATION) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        if (!this.Reserved2.contentEquals(other.Reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Reserved1.contentHashCode()
        result = 31 * result + this.Reserved2.contentHashCode()
        return result
    }
}

public data class SYSTEM_PROCESSOR_PERFORMANCE_INFORMATION(
    public var IdleTime: Long = 0L,
    public var KernelTime: Long = 0L,
    public var UserTime: Long = 0L,
    public var Reserved1: LongArray = LongArray(2),
    public var Reserved2: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SYSTEM_PROCESSOR_PERFORMANCE_INFORMATION) return false
        if (this.IdleTime != other.IdleTime) return false
        if (this.KernelTime != other.KernelTime) return false
        if (this.UserTime != other.UserTime) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        if (this.Reserved2 != other.Reserved2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.IdleTime.hashCode()
        result = 31 * result + this.KernelTime.hashCode()
        result = 31 * result + this.UserTime.hashCode()
        result = 31 * result + this.Reserved1.contentHashCode()
        result = 31 * result + this.Reserved2.hashCode()
        return result
    }
}

public class SYSTEM_PROCESS_INFORMATION(
    public var NextEntryOffset: UInt = 0u,
    public var NumberOfThreads: UInt = 0u,
    public var Reserved1: UByteArray = UByteArray(48),
    public var ImageName: Foundation.UNICODE_STRING = Foundation.UNICODE_STRING(),
    public var BasePriority: Int = 0,
    public var UniqueProcessId: Foundation.HANDLE = Foundation.HANDLE(),
    public var Reserved2: Long = 0L,
    public var HandleCount: UInt = 0u,
    public var SessionId: UInt = 0u,
    public var Reserved3: Long = 0L,
    public var PeakVirtualSize: ULong = 0uL,
    public var VirtualSize: ULong = 0uL,
    public var Reserved4: UInt = 0u,
    public var PeakWorkingSetSize: ULong = 0uL,
    public var WorkingSetSize: ULong = 0uL,
    public var Reserved5: Long = 0L,
    public var QuotaPagedPoolUsage: ULong = 0uL,
    public var Reserved6: Long = 0L,
    public var QuotaNonPagedPoolUsage: ULong = 0uL,
    public var PagefileUsage: ULong = 0uL,
    public var PeakPagefileUsage: ULong = 0uL,
    public var PrivatePageCount: ULong = 0uL,
    public var Reserved7: LongArray = LongArray(6),
)

public data class SYSTEM_REGISTRY_QUOTA_INFORMATION(
    public var RegistryQuotaAllowed: UInt = 0u,
    public var RegistryQuotaUsed: UInt = 0u,
    public var Reserved1: Long = 0L,
)

public data class SYSTEM_THREAD_INFORMATION(
    public var Reserved1: LongArray = LongArray(3),
    public var Reserved2: UInt = 0u,
    public var StartAddress: Long = 0L,
    public var ClientId: CLIENT_ID = CLIENT_ID(),
    public var Priority: Int = 0,
    public var BasePriority: Int = 0,
    public var Reserved3: UInt = 0u,
    public var ThreadState: UInt = 0u,
    public var WaitReason: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SYSTEM_THREAD_INFORMATION) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        if (this.Reserved2 != other.Reserved2) return false
        if (this.StartAddress != other.StartAddress) return false
        if (this.ClientId != other.ClientId) return false
        if (this.Priority != other.Priority) return false
        if (this.BasePriority != other.BasePriority) return false
        if (this.Reserved3 != other.Reserved3) return false
        if (this.ThreadState != other.ThreadState) return false
        if (this.WaitReason != other.WaitReason) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Reserved1.contentHashCode()
        result = 31 * result + this.Reserved2.hashCode()
        result = 31 * result + this.StartAddress.hashCode()
        result = 31 * result + this.ClientId.hashCode()
        result = 31 * result + this.Priority.hashCode()
        result = 31 * result + this.BasePriority.hashCode()
        result = 31 * result + this.Reserved3.hashCode()
        result = 31 * result + this.ThreadState.hashCode()
        result = 31 * result + this.WaitReason.hashCode()
        return result
    }
}

public data class SYSTEM_TIMEOFDAY_INFORMATION(public var Reserved1: UByteArray = UByteArray(48)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SYSTEM_TIMEOFDAY_INFORMATION) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.Reserved1.contentHashCode()
    }
}

public data class TCP_REQUEST_QUERY_INFORMATION_EX32_XP(public var ID: TDIObjectID = TDIObjectID(), public var Context: UIntArray = UIntArray(4)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TCP_REQUEST_QUERY_INFORMATION_EX32_XP) return false
        if (this.ID != other.ID) return false
        if (!this.Context.contentEquals(other.Context)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ID.hashCode()
        result = 31 * result + this.Context.contentHashCode()
        return result
    }
}

public data class TCP_REQUEST_QUERY_INFORMATION_EX_W2K(public var ID: TDIObjectID = TDIObjectID(), public var Context: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TCP_REQUEST_QUERY_INFORMATION_EX_W2K) return false
        if (this.ID != other.ID) return false
        if (!this.Context.contentEquals(other.Context)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ID.hashCode()
        result = 31 * result + this.Context.contentHashCode()
        return result
    }
}

public data class TCP_REQUEST_QUERY_INFORMATION_EX_XP(public var ID: TDIObjectID = TDIObjectID(), public var Context: ULongArray = ULongArray(4)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TCP_REQUEST_QUERY_INFORMATION_EX_XP) return false
        if (this.ID != other.ID) return false
        if (!this.Context.contentEquals(other.Context)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ID.hashCode()
        result = 31 * result + this.Context.contentHashCode()
        return result
    }
}

public data class TCP_REQUEST_SET_INFORMATION_EX(
    public var ID: TDIObjectID = TDIObjectID(),
    public var BufferSize: UInt = 0u,
    public var Buffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TCP_REQUEST_SET_INFORMATION_EX) return false
        if (this.ID != other.ID) return false
        if (this.BufferSize != other.BufferSize) return false
        if (!this.Buffer.contentEquals(other.Buffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ID.hashCode()
        result = 31 * result + this.BufferSize.hashCode()
        result = 31 * result + this.Buffer.contentHashCode()
        return result
    }
}

public data class TDIEntityID(public var tei_entity: TDIENTITY_ENTITY_TYPE = 0u, public var tei_instance: UInt = 0u)

public data class TDIObjectID(
    public var toi_entity: TDIEntityID = TDIEntityID(),
    public var toi_class: UInt = 0u,
    public var toi_type: UInt = 0u,
    public var toi_id: UInt = 0u,
)

public data class TDI_TL_IO_CONTROL_ENDPOINT(
    public var Type: TDI_TL_IO_CONTROL_TYPE = 0,
    public var Level: UInt = 0u,
    public var Anonymous: TDI_TL_IO_CONTROL_ENDPOINT_0 = TDI_TL_IO_CONTROL_ENDPOINT_0(),
    public var InputBuffer: Long = 0L,
    public var InputBufferLength: UInt = 0u,
    public var OutputBuffer: Long = 0L,
    public var OutputBufferLength: UInt = 0u,
)

public data class TDI_TL_IO_CONTROL_ENDPOINT_0(public var IoControlCode: UInt = 0u, public var OptionName: UInt = 0u)

public data class THREAD_NAME_INFORMATION(public var ThreadName: Foundation.UNICODE_STRING = Foundation.UNICODE_STRING())

public data class UNDETERMINESTRUCT(
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

public data class WINSTATIONINFORMATIONW(
    public var Reserved2: UByteArray = UByteArray(70),
    public var LogonId: UInt = 0u,
    public var Reserved3: UByteArray = UByteArray(1140),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WINSTATIONINFORMATIONW) return false
        if (!this.Reserved2.contentEquals(other.Reserved2)) return false
        if (this.LogonId != other.LogonId) return false
        if (!this.Reserved3.contentEquals(other.Reserved3)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Reserved2.contentHashCode()
        result = 31 * result + this.LogonId.hashCode()
        result = 31 * result + this.Reserved3.contentHashCode()
        return result
    }
}

public data class WLDP_DEVICE_SECURITY_INFORMATION(
    public var UnlockIdSize: UInt = 0u,
    public var UnlockId: Long = 0L,
    public var ManufacturerIDLength: UInt = 0u,
    public var ManufacturerID: PWSTR = 0L,
)

public data class WLDP_HOST_INFORMATION(
    public var dwRevision: UInt = 0u,
    public var dwHostId: WLDP_HOST_ID = 0,
    public var szSource: PCWSTR = 0L,
    public var hSource: Foundation.HANDLE = Foundation.HANDLE(),
)
