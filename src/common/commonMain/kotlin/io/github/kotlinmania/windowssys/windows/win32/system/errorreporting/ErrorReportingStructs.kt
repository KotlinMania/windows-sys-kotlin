@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.errorreporting

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.Context
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.ExceptionPointers
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.ExceptionRecord

public data class WerDumpCustomOptions(
    public var dwSize: UInt = 0u,
    public var dwMask: UInt = 0u,
    public var dwDumpFlags: UInt = 0u,
    public var bOnlyThisThread: Bool = 0,
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
        if (other !is WerDumpCustomOptions) return false
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

public data class WerDumpCustomOptionsV2(
    public var dwSize: UInt = 0u,
    public var dwMask: UInt = 0u,
    public var dwDumpFlags: UInt = 0u,
    public var bOnlyThisThread: Bool = 0,
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
        if (other !is WerDumpCustomOptionsV2) return false
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

public data class WerDumpCustomOptionsV3(
    public var dwSize: UInt = 0u,
    public var dwMask: UInt = 0u,
    public var dwDumpFlags: UInt = 0u,
    public var bOnlyThisThread: Bool = 0,
    public var dwExceptionThreadFlags: UInt = 0u,
    public var dwOtherThreadFlags: UInt = 0u,
    public var dwExceptionThreadExFlags: UInt = 0u,
    public var dwOtherThreadExFlags: UInt = 0u,
    public var dwPreferredModuleFlags: UInt = 0u,
    public var dwOtherModuleFlags: UInt = 0u,
    public var wzPreferredModuleList: UShortArray = UShortArray(256),
    public var dwPreferredModuleResetFlags: UInt = 0u,
    public var dwOtherModuleResetFlags: UInt = 0u,
    public var pvDumpKey: COpaquePointer? = null,
    public var hSnapshot: Handle = null,
    public var dwThreadID: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WerDumpCustomOptionsV3) return false
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

public data class WerExceptionInformation(public var pExceptionPointers: ExceptionPointers? = null, public var bClientPointers: Bool = 0)

public data class WerReportInformation(
    public var dwSize: UInt = 0u,
    public var hProcess: Handle = null,
    public var wzConsentKey: UShortArray = UShortArray(64),
    public var wzFriendlyEventName: UShortArray = UShortArray(128),
    public var wzApplicationName: UShortArray = UShortArray(128),
    public var wzApplicationPath: UShortArray = UShortArray(260),
    public var wzDescription: UShortArray = UShortArray(512),
    public var hwndParent: Hwnd = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WerReportInformation) return false
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

public data class WerReportInformationV3(
    public var dwSize: UInt = 0u,
    public var hProcess: Handle = null,
    public var wzConsentKey: UShortArray = UShortArray(64),
    public var wzFriendlyEventName: UShortArray = UShortArray(128),
    public var wzApplicationName: UShortArray = UShortArray(128),
    public var wzApplicationPath: UShortArray = UShortArray(260),
    public var wzDescription: UShortArray = UShortArray(512),
    public var hwndParent: Hwnd = null,
    public var wzNamespacePartner: UShortArray = UShortArray(64),
    public var wzNamespaceGroup: UShortArray = UShortArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WerReportInformationV3) return false
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

public data class WerReportInformationV4(
    public var dwSize: UInt = 0u,
    public var hProcess: Handle = null,
    public var wzConsentKey: UShortArray = UShortArray(64),
    public var wzFriendlyEventName: UShortArray = UShortArray(128),
    public var wzApplicationName: UShortArray = UShortArray(128),
    public var wzApplicationPath: UShortArray = UShortArray(260),
    public var wzDescription: UShortArray = UShortArray(512),
    public var hwndParent: Hwnd = null,
    public var wzNamespacePartner: UShortArray = UShortArray(64),
    public var wzNamespaceGroup: UShortArray = UShortArray(64),
    public var rgbApplicationIdentity: UByteArray = UByteArray(16),
    public var hSnapshot: Handle = null,
    public var hDeleteFilesImpersonationToken: Handle = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WerReportInformationV4) return false
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

public data class WerReportInformationV5(
    public var dwSize: UInt = 0u,
    public var hProcess: Handle = null,
    public var wzConsentKey: UShortArray = UShortArray(64),
    public var wzFriendlyEventName: UShortArray = UShortArray(128),
    public var wzApplicationName: UShortArray = UShortArray(128),
    public var wzApplicationPath: UShortArray = UShortArray(260),
    public var wzDescription: UShortArray = UShortArray(512),
    public var hwndParent: Hwnd = null,
    public var wzNamespacePartner: UShortArray = UShortArray(64),
    public var wzNamespaceGroup: UShortArray = UShortArray(64),
    public var rgbApplicationIdentity: UByteArray = UByteArray(16),
    public var hSnapshot: Handle = null,
    public var hDeleteFilesImpersonationToken: Handle = null,
    public var submitResultMax: WerSubmitResult = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WerReportInformationV5) return false
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

public data class WerReportMetadataV1(
    public var signature: WerReportSignature = WerReportSignature(),
    public var bucketId: Guid = Guid(),
    public var reportId: Guid = Guid(),
    public var creationTime: Filetime = Filetime(),
    public var sizeInBytes: ULong = 0uL,
)

public data class WerReportMetadataV2(
    public var signature: WerReportSignature = WerReportSignature(),
    public var bucketId: Guid = Guid(),
    public var reportId: Guid = Guid(),
    public var creationTime: Filetime = Filetime(),
    public var sizeInBytes: ULong = 0uL,
    public var cabId: UShortArray = UShortArray(260),
    public var reportStatus: UInt = 0u,
    public var reportIntegratorId: Guid = Guid(),
    public var numberOfFiles: UInt = 0u,
    public var sizeOfFileNames: UInt = 0u,
    public var fileNames: Pwstr = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WerReportMetadataV2) return false
        if (this.signature != other.signature) return false
        if (this.bucketId != other.bucketId) return false
        if (this.reportId != other.reportId) return false
        if (this.creationTime != other.creationTime) return false
        if (this.sizeInBytes != other.sizeInBytes) return false
        if (!this.cabId.contentEquals(other.cabId)) return false
        if (this.reportStatus != other.reportStatus) return false
        if (this.reportIntegratorId != other.reportIntegratorId) return false
        if (this.numberOfFiles != other.numberOfFiles) return false
        if (this.sizeOfFileNames != other.sizeOfFileNames) return false
        if (this.fileNames != other.fileNames) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.signature.hashCode()
        result = 31 * result + this.bucketId.hashCode()
        result = 31 * result + this.reportId.hashCode()
        result = 31 * result + this.creationTime.hashCode()
        result = 31 * result + this.sizeInBytes.hashCode()
        result = 31 * result + this.cabId.contentHashCode()
        result = 31 * result + this.reportStatus.hashCode()
        result = 31 * result + this.reportIntegratorId.hashCode()
        result = 31 * result + this.numberOfFiles.hashCode()
        result = 31 * result + this.sizeOfFileNames.hashCode()
        result = 31 * result + this.fileNames.hashCode()
        return result
    }
}

public class WerReportMetadataV3(
    public var signature: WerReportSignature = WerReportSignature(),
    public var bucketId: Guid = Guid(),
    public var reportId: Guid = Guid(),
    public var creationTime: Filetime = Filetime(),
    public var sizeInBytes: ULong = 0uL,
    public var cabId: UShortArray = UShortArray(260),
    public var reportStatus: UInt = 0u,
    public var reportIntegratorId: Guid = Guid(),
    public var numberOfFiles: UInt = 0u,
    public var sizeOfFileNames: UInt = 0u,
    public var fileNames: Pwstr = null,
    public var friendlyEventName: UShortArray = UShortArray(128),
    public var applicationName: UShortArray = UShortArray(128),
    public var applicationPath: UShortArray = UShortArray(260),
    public var description: UShortArray = UShortArray(512),
    public var bucketIdString: UShortArray = UShortArray(260),
    public var legacyBucketId: ULong = 0uL,
)

public data class WerReportParameter(public var name: UShortArray = UShortArray(129), public var value: UShortArray = UShortArray(260)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WerReportParameter) return false
        if (!this.name.contentEquals(other.name)) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.name.contentHashCode()
        result = 31 * result + this.value.contentHashCode()
        return result
    }
}

public data class WerReportSignature(public var eventName: UShortArray = UShortArray(65), public var parameters: List<WerReportParameter> = List(10) { WerReportParameter() }) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WerReportSignature) return false
        if (!this.eventName.contentEquals(other.eventName)) return false
        if (this.parameters != other.parameters) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.eventName.contentHashCode()
        result = 31 * result + this.parameters.hashCode()
        return result
    }
}

public data class WerRuntimeExceptionInformation(
    public var dwSize: UInt = 0u,
    public var hProcess: Handle = null,
    public var hThread: Handle = null,
    public var exceptionRecord: ExceptionRecord = ExceptionRecord(),
    public var context: Context = Context(),
    public var pwszReportId: Pcwstr = null,
    public var bIsFatal: Bool = 0,
    public var dwReserved: UInt = 0u,
)
