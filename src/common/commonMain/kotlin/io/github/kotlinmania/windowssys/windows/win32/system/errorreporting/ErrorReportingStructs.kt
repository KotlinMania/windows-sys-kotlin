@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.errorreporting

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.FILETIME
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.CONTEXT
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.EXCEPTION_RECORD

public data class WER_DUMP_CUSTOM_OPTIONS(
    public var dwSize: UInt = 0u,
    public var dwMask: UInt = 0u,
    public var dwDumpFlags: UInt = 0u,
    public var bOnlyThisThread: BOOL = 0,
    public var dwExceptionThreadFlags: UInt = 0u,
    public var dwOtherThreadFlags: UInt = 0u,
    public var dwExceptionThreadExFlags: UInt = 0u,
    public var dwOtherThreadExFlags: UInt = 0u,
    public var dwPreferredModuleFlags: UInt = 0u,
    public var dwOtherModuleFlags: UInt = 0u,
    public var wzPreferredModuleList: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WER_DUMP_CUSTOM_OPTIONS) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwMask != other.dwMask) return false
        if (this.dwDumpFlags != other.dwDumpFlags) return false
        if (this.bOnlyThisThread != other.bOnlyThisThread) return false
        if (this.dwExceptionThreadFlags != other.dwExceptionThreadFlags) return false
        if (this.dwOtherThreadFlags != other.dwOtherThreadFlags) return false
        if (this.dwExceptionThreadExFlags != other.dwExceptionThreadExFlags) return false
        if (this.dwOtherThreadExFlags != other.dwOtherThreadExFlags) return false
        if (this.dwPreferredModuleFlags != other.dwPreferredModuleFlags) return false
        if (this.dwOtherModuleFlags != other.dwOtherModuleFlags) return false
        if (!this.wzPreferredModuleList.contentEquals(other.wzPreferredModuleList)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwMask.hashCode()
        result = 31 * result + this.dwDumpFlags.hashCode()
        result = 31 * result + this.bOnlyThisThread.hashCode()
        result = 31 * result + this.dwExceptionThreadFlags.hashCode()
        result = 31 * result + this.dwOtherThreadFlags.hashCode()
        result = 31 * result + this.dwExceptionThreadExFlags.hashCode()
        result = 31 * result + this.dwOtherThreadExFlags.hashCode()
        result = 31 * result + this.dwPreferredModuleFlags.hashCode()
        result = 31 * result + this.dwOtherModuleFlags.hashCode()
        result = 31 * result + this.wzPreferredModuleList.contentHashCode()
        return result
    }
}

public data class WER_DUMP_CUSTOM_OPTIONS_V2(
    public var dwSize: UInt = 0u,
    public var dwMask: UInt = 0u,
    public var dwDumpFlags: UInt = 0u,
    public var bOnlyThisThread: BOOL = 0,
    public var dwExceptionThreadFlags: UInt = 0u,
    public var dwOtherThreadFlags: UInt = 0u,
    public var dwExceptionThreadExFlags: UInt = 0u,
    public var dwOtherThreadExFlags: UInt = 0u,
    public var dwPreferredModuleFlags: UInt = 0u,
    public var dwOtherModuleFlags: UInt = 0u,
    public var wzPreferredModuleList: UShortArray = UShortArray(256),
    public var dwPreferredModuleResetFlags: UInt = 0u,
    public var dwOtherModuleResetFlags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WER_DUMP_CUSTOM_OPTIONS_V2) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwMask != other.dwMask) return false
        if (this.dwDumpFlags != other.dwDumpFlags) return false
        if (this.bOnlyThisThread != other.bOnlyThisThread) return false
        if (this.dwExceptionThreadFlags != other.dwExceptionThreadFlags) return false
        if (this.dwOtherThreadFlags != other.dwOtherThreadFlags) return false
        if (this.dwExceptionThreadExFlags != other.dwExceptionThreadExFlags) return false
        if (this.dwOtherThreadExFlags != other.dwOtherThreadExFlags) return false
        if (this.dwPreferredModuleFlags != other.dwPreferredModuleFlags) return false
        if (this.dwOtherModuleFlags != other.dwOtherModuleFlags) return false
        if (!this.wzPreferredModuleList.contentEquals(other.wzPreferredModuleList)) return false
        if (this.dwPreferredModuleResetFlags != other.dwPreferredModuleResetFlags) return false
        if (this.dwOtherModuleResetFlags != other.dwOtherModuleResetFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwMask.hashCode()
        result = 31 * result + this.dwDumpFlags.hashCode()
        result = 31 * result + this.bOnlyThisThread.hashCode()
        result = 31 * result + this.dwExceptionThreadFlags.hashCode()
        result = 31 * result + this.dwOtherThreadFlags.hashCode()
        result = 31 * result + this.dwExceptionThreadExFlags.hashCode()
        result = 31 * result + this.dwOtherThreadExFlags.hashCode()
        result = 31 * result + this.dwPreferredModuleFlags.hashCode()
        result = 31 * result + this.dwOtherModuleFlags.hashCode()
        result = 31 * result + this.wzPreferredModuleList.contentHashCode()
        result = 31 * result + this.dwPreferredModuleResetFlags.hashCode()
        result = 31 * result + this.dwOtherModuleResetFlags.hashCode()
        return result
    }
}

public data class WER_DUMP_CUSTOM_OPTIONS_V3(
    public var dwSize: UInt = 0u,
    public var dwMask: UInt = 0u,
    public var dwDumpFlags: UInt = 0u,
    public var bOnlyThisThread: BOOL = 0,
    public var dwExceptionThreadFlags: UInt = 0u,
    public var dwOtherThreadFlags: UInt = 0u,
    public var dwExceptionThreadExFlags: UInt = 0u,
    public var dwOtherThreadExFlags: UInt = 0u,
    public var dwPreferredModuleFlags: UInt = 0u,
    public var dwOtherModuleFlags: UInt = 0u,
    public var wzPreferredModuleList: UShortArray = UShortArray(256),
    public var dwPreferredModuleResetFlags: UInt = 0u,
    public var dwOtherModuleResetFlags: UInt = 0u,
    public var pvDumpKey: Long = 0L,
    public var hSnapshot: HANDLE = 0L,
    public var dwThreadID: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WER_DUMP_CUSTOM_OPTIONS_V3) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwMask != other.dwMask) return false
        if (this.dwDumpFlags != other.dwDumpFlags) return false
        if (this.bOnlyThisThread != other.bOnlyThisThread) return false
        if (this.dwExceptionThreadFlags != other.dwExceptionThreadFlags) return false
        if (this.dwOtherThreadFlags != other.dwOtherThreadFlags) return false
        if (this.dwExceptionThreadExFlags != other.dwExceptionThreadExFlags) return false
        if (this.dwOtherThreadExFlags != other.dwOtherThreadExFlags) return false
        if (this.dwPreferredModuleFlags != other.dwPreferredModuleFlags) return false
        if (this.dwOtherModuleFlags != other.dwOtherModuleFlags) return false
        if (!this.wzPreferredModuleList.contentEquals(other.wzPreferredModuleList)) return false
        if (this.dwPreferredModuleResetFlags != other.dwPreferredModuleResetFlags) return false
        if (this.dwOtherModuleResetFlags != other.dwOtherModuleResetFlags) return false
        if (this.pvDumpKey != other.pvDumpKey) return false
        if (this.hSnapshot != other.hSnapshot) return false
        if (this.dwThreadID != other.dwThreadID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwMask.hashCode()
        result = 31 * result + this.dwDumpFlags.hashCode()
        result = 31 * result + this.bOnlyThisThread.hashCode()
        result = 31 * result + this.dwExceptionThreadFlags.hashCode()
        result = 31 * result + this.dwOtherThreadFlags.hashCode()
        result = 31 * result + this.dwExceptionThreadExFlags.hashCode()
        result = 31 * result + this.dwOtherThreadExFlags.hashCode()
        result = 31 * result + this.dwPreferredModuleFlags.hashCode()
        result = 31 * result + this.dwOtherModuleFlags.hashCode()
        result = 31 * result + this.wzPreferredModuleList.contentHashCode()
        result = 31 * result + this.dwPreferredModuleResetFlags.hashCode()
        result = 31 * result + this.dwOtherModuleResetFlags.hashCode()
        result = 31 * result + this.pvDumpKey.hashCode()
        result = 31 * result + this.hSnapshot.hashCode()
        result = 31 * result + this.dwThreadID.hashCode()
        return result
    }
}

public data class WER_EXCEPTION_INFORMATION(public var pExceptionPointers: Long = 0L, public var bClientPointers: BOOL = 0)

public data class WER_REPORT_INFORMATION(
    public var dwSize: UInt = 0u,
    public var hProcess: HANDLE = 0L,
    public var wzConsentKey: UShortArray = UShortArray(64),
    public var wzFriendlyEventName: UShortArray = UShortArray(128),
    public var wzApplicationName: UShortArray = UShortArray(128),
    public var wzApplicationPath: UShortArray = UShortArray(260),
    public var wzDescription: UShortArray = UShortArray(512),
    public var hwndParent: HWND = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WER_REPORT_INFORMATION) return false
        if (this.dwSize != other.dwSize) return false
        if (this.hProcess != other.hProcess) return false
        if (!this.wzConsentKey.contentEquals(other.wzConsentKey)) return false
        if (!this.wzFriendlyEventName.contentEquals(other.wzFriendlyEventName)) return false
        if (!this.wzApplicationName.contentEquals(other.wzApplicationName)) return false
        if (!this.wzApplicationPath.contentEquals(other.wzApplicationPath)) return false
        if (!this.wzDescription.contentEquals(other.wzDescription)) return false
        if (this.hwndParent != other.hwndParent) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.hProcess.hashCode()
        result = 31 * result + this.wzConsentKey.contentHashCode()
        result = 31 * result + this.wzFriendlyEventName.contentHashCode()
        result = 31 * result + this.wzApplicationName.contentHashCode()
        result = 31 * result + this.wzApplicationPath.contentHashCode()
        result = 31 * result + this.wzDescription.contentHashCode()
        result = 31 * result + this.hwndParent.hashCode()
        return result
    }
}

public data class WER_REPORT_INFORMATION_V3(
    public var dwSize: UInt = 0u,
    public var hProcess: HANDLE = 0L,
    public var wzConsentKey: UShortArray = UShortArray(64),
    public var wzFriendlyEventName: UShortArray = UShortArray(128),
    public var wzApplicationName: UShortArray = UShortArray(128),
    public var wzApplicationPath: UShortArray = UShortArray(260),
    public var wzDescription: UShortArray = UShortArray(512),
    public var hwndParent: HWND = 0L,
    public var wzNamespacePartner: UShortArray = UShortArray(64),
    public var wzNamespaceGroup: UShortArray = UShortArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WER_REPORT_INFORMATION_V3) return false
        if (this.dwSize != other.dwSize) return false
        if (this.hProcess != other.hProcess) return false
        if (!this.wzConsentKey.contentEquals(other.wzConsentKey)) return false
        if (!this.wzFriendlyEventName.contentEquals(other.wzFriendlyEventName)) return false
        if (!this.wzApplicationName.contentEquals(other.wzApplicationName)) return false
        if (!this.wzApplicationPath.contentEquals(other.wzApplicationPath)) return false
        if (!this.wzDescription.contentEquals(other.wzDescription)) return false
        if (this.hwndParent != other.hwndParent) return false
        if (!this.wzNamespacePartner.contentEquals(other.wzNamespacePartner)) return false
        if (!this.wzNamespaceGroup.contentEquals(other.wzNamespaceGroup)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.hProcess.hashCode()
        result = 31 * result + this.wzConsentKey.contentHashCode()
        result = 31 * result + this.wzFriendlyEventName.contentHashCode()
        result = 31 * result + this.wzApplicationName.contentHashCode()
        result = 31 * result + this.wzApplicationPath.contentHashCode()
        result = 31 * result + this.wzDescription.contentHashCode()
        result = 31 * result + this.hwndParent.hashCode()
        result = 31 * result + this.wzNamespacePartner.contentHashCode()
        result = 31 * result + this.wzNamespaceGroup.contentHashCode()
        return result
    }
}

public data class WER_REPORT_INFORMATION_V4(
    public var dwSize: UInt = 0u,
    public var hProcess: HANDLE = 0L,
    public var wzConsentKey: UShortArray = UShortArray(64),
    public var wzFriendlyEventName: UShortArray = UShortArray(128),
    public var wzApplicationName: UShortArray = UShortArray(128),
    public var wzApplicationPath: UShortArray = UShortArray(260),
    public var wzDescription: UShortArray = UShortArray(512),
    public var hwndParent: HWND = 0L,
    public var wzNamespacePartner: UShortArray = UShortArray(64),
    public var wzNamespaceGroup: UShortArray = UShortArray(64),
    public var rgbApplicationIdentity: UByteArray = UByteArray(16),
    public var hSnapshot: HANDLE = 0L,
    public var hDeleteFilesImpersonationToken: HANDLE = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WER_REPORT_INFORMATION_V4) return false
        if (this.dwSize != other.dwSize) return false
        if (this.hProcess != other.hProcess) return false
        if (!this.wzConsentKey.contentEquals(other.wzConsentKey)) return false
        if (!this.wzFriendlyEventName.contentEquals(other.wzFriendlyEventName)) return false
        if (!this.wzApplicationName.contentEquals(other.wzApplicationName)) return false
        if (!this.wzApplicationPath.contentEquals(other.wzApplicationPath)) return false
        if (!this.wzDescription.contentEquals(other.wzDescription)) return false
        if (this.hwndParent != other.hwndParent) return false
        if (!this.wzNamespacePartner.contentEquals(other.wzNamespacePartner)) return false
        if (!this.wzNamespaceGroup.contentEquals(other.wzNamespaceGroup)) return false
        if (!this.rgbApplicationIdentity.contentEquals(other.rgbApplicationIdentity)) return false
        if (this.hSnapshot != other.hSnapshot) return false
        if (this.hDeleteFilesImpersonationToken != other.hDeleteFilesImpersonationToken) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.hProcess.hashCode()
        result = 31 * result + this.wzConsentKey.contentHashCode()
        result = 31 * result + this.wzFriendlyEventName.contentHashCode()
        result = 31 * result + this.wzApplicationName.contentHashCode()
        result = 31 * result + this.wzApplicationPath.contentHashCode()
        result = 31 * result + this.wzDescription.contentHashCode()
        result = 31 * result + this.hwndParent.hashCode()
        result = 31 * result + this.wzNamespacePartner.contentHashCode()
        result = 31 * result + this.wzNamespaceGroup.contentHashCode()
        result = 31 * result + this.rgbApplicationIdentity.contentHashCode()
        result = 31 * result + this.hSnapshot.hashCode()
        result = 31 * result + this.hDeleteFilesImpersonationToken.hashCode()
        return result
    }
}

public data class WER_REPORT_INFORMATION_V5(
    public var dwSize: UInt = 0u,
    public var hProcess: HANDLE = 0L,
    public var wzConsentKey: UShortArray = UShortArray(64),
    public var wzFriendlyEventName: UShortArray = UShortArray(128),
    public var wzApplicationName: UShortArray = UShortArray(128),
    public var wzApplicationPath: UShortArray = UShortArray(260),
    public var wzDescription: UShortArray = UShortArray(512),
    public var hwndParent: HWND = 0L,
    public var wzNamespacePartner: UShortArray = UShortArray(64),
    public var wzNamespaceGroup: UShortArray = UShortArray(64),
    public var rgbApplicationIdentity: UByteArray = UByteArray(16),
    public var hSnapshot: HANDLE = 0L,
    public var hDeleteFilesImpersonationToken: HANDLE = 0L,
    public var submitResultMax: WER_SUBMIT_RESULT = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WER_REPORT_INFORMATION_V5) return false
        if (this.dwSize != other.dwSize) return false
        if (this.hProcess != other.hProcess) return false
        if (!this.wzConsentKey.contentEquals(other.wzConsentKey)) return false
        if (!this.wzFriendlyEventName.contentEquals(other.wzFriendlyEventName)) return false
        if (!this.wzApplicationName.contentEquals(other.wzApplicationName)) return false
        if (!this.wzApplicationPath.contentEquals(other.wzApplicationPath)) return false
        if (!this.wzDescription.contentEquals(other.wzDescription)) return false
        if (this.hwndParent != other.hwndParent) return false
        if (!this.wzNamespacePartner.contentEquals(other.wzNamespacePartner)) return false
        if (!this.wzNamespaceGroup.contentEquals(other.wzNamespaceGroup)) return false
        if (!this.rgbApplicationIdentity.contentEquals(other.rgbApplicationIdentity)) return false
        if (this.hSnapshot != other.hSnapshot) return false
        if (this.hDeleteFilesImpersonationToken != other.hDeleteFilesImpersonationToken) return false
        if (this.submitResultMax != other.submitResultMax) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.hProcess.hashCode()
        result = 31 * result + this.wzConsentKey.contentHashCode()
        result = 31 * result + this.wzFriendlyEventName.contentHashCode()
        result = 31 * result + this.wzApplicationName.contentHashCode()
        result = 31 * result + this.wzApplicationPath.contentHashCode()
        result = 31 * result + this.wzDescription.contentHashCode()
        result = 31 * result + this.hwndParent.hashCode()
        result = 31 * result + this.wzNamespacePartner.contentHashCode()
        result = 31 * result + this.wzNamespaceGroup.contentHashCode()
        result = 31 * result + this.rgbApplicationIdentity.contentHashCode()
        result = 31 * result + this.hSnapshot.hashCode()
        result = 31 * result + this.hDeleteFilesImpersonationToken.hashCode()
        result = 31 * result + this.submitResultMax.hashCode()
        return result
    }
}

public data class WER_REPORT_METADATA_V1(
    public var Signature: WER_REPORT_SIGNATURE = WER_REPORT_SIGNATURE(),
    public var BucketId: GUID = GUID(),
    public var ReportId: GUID = GUID(),
    public var CreationTime: FILETIME = FILETIME(),
    public var SizeInBytes: ULong = 0uL,
)

public data class WER_REPORT_METADATA_V2(
    public var Signature: WER_REPORT_SIGNATURE = WER_REPORT_SIGNATURE(),
    public var BucketId: GUID = GUID(),
    public var ReportId: GUID = GUID(),
    public var CreationTime: FILETIME = FILETIME(),
    public var SizeInBytes: ULong = 0uL,
    public var CabId: UShortArray = UShortArray(260),
    public var ReportStatus: UInt = 0u,
    public var ReportIntegratorId: GUID = GUID(),
    public var NumberOfFiles: UInt = 0u,
    public var SizeOfFileNames: UInt = 0u,
    public var FileNames: PWSTR = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WER_REPORT_METADATA_V2) return false
        if (this.Signature != other.Signature) return false
        if (this.BucketId != other.BucketId) return false
        if (this.ReportId != other.ReportId) return false
        if (this.CreationTime != other.CreationTime) return false
        if (this.SizeInBytes != other.SizeInBytes) return false
        if (!this.CabId.contentEquals(other.CabId)) return false
        if (this.ReportStatus != other.ReportStatus) return false
        if (this.ReportIntegratorId != other.ReportIntegratorId) return false
        if (this.NumberOfFiles != other.NumberOfFiles) return false
        if (this.SizeOfFileNames != other.SizeOfFileNames) return false
        if (this.FileNames != other.FileNames) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Signature.hashCode()
        result = 31 * result + this.BucketId.hashCode()
        result = 31 * result + this.ReportId.hashCode()
        result = 31 * result + this.CreationTime.hashCode()
        result = 31 * result + this.SizeInBytes.hashCode()
        result = 31 * result + this.CabId.contentHashCode()
        result = 31 * result + this.ReportStatus.hashCode()
        result = 31 * result + this.ReportIntegratorId.hashCode()
        result = 31 * result + this.NumberOfFiles.hashCode()
        result = 31 * result + this.SizeOfFileNames.hashCode()
        result = 31 * result + this.FileNames.hashCode()
        return result
    }
}

public class WER_REPORT_METADATA_V3(
    public var Signature: WER_REPORT_SIGNATURE = WER_REPORT_SIGNATURE(),
    public var BucketId: GUID = GUID(),
    public var ReportId: GUID = GUID(),
    public var CreationTime: FILETIME = FILETIME(),
    public var SizeInBytes: ULong = 0uL,
    public var CabId: UShortArray = UShortArray(260),
    public var ReportStatus: UInt = 0u,
    public var ReportIntegratorId: GUID = GUID(),
    public var NumberOfFiles: UInt = 0u,
    public var SizeOfFileNames: UInt = 0u,
    public var FileNames: PWSTR = 0L,
    public var FriendlyEventName: UShortArray = UShortArray(128),
    public var ApplicationName: UShortArray = UShortArray(128),
    public var ApplicationPath: UShortArray = UShortArray(260),
    public var Description: UShortArray = UShortArray(512),
    public var BucketIdString: UShortArray = UShortArray(260),
    public var LegacyBucketId: ULong = 0uL,
)

public data class WER_REPORT_PARAMETER(public var Name: UShortArray = UShortArray(129), public var Value: UShortArray = UShortArray(260)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WER_REPORT_PARAMETER) return false
        if (!this.Name.contentEquals(other.Name)) return false
        if (!this.Value.contentEquals(other.Value)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Name.contentHashCode()
        result = 31 * result + this.Value.contentHashCode()
        return result
    }
}

public data class WER_REPORT_SIGNATURE(public var EventName: UShortArray = UShortArray(65), public var Parameters: List<WER_REPORT_PARAMETER> = List(10) { WER_REPORT_PARAMETER() }) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WER_REPORT_SIGNATURE) return false
        if (!this.EventName.contentEquals(other.EventName)) return false
        if (this.Parameters != other.Parameters) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.EventName.contentHashCode()
        result = 31 * result + this.Parameters.hashCode()
        return result
    }
}

public data class WER_RUNTIME_EXCEPTION_INFORMATION(
    public var dwSize: UInt = 0u,
    public var hProcess: HANDLE = 0L,
    public var hThread: HANDLE = 0L,
    public var exceptionRecord: EXCEPTION_RECORD = EXCEPTION_RECORD(),
    public var context: CONTEXT = CONTEXT(),
    public var pwszReportId: PCWSTR = 0L,
    public var bIsFatal: BOOL = 0,
    public var dwReserved: UInt = 0u,
)
