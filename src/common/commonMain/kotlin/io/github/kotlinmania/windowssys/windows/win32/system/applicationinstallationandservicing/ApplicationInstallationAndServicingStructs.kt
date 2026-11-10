@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hmodule
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.AlgId
import io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.ActctxSectionKeyedDataAssemblyMetadata

public data class Actctxa(
    public var cbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var lpSource: Pcstr = null,
    public var wProcessorArchitecture: UShort = 0u,
    public var wLangId: UShort = 0u,
    public var lpAssemblyDirectory: Pcstr = null,
    public var lpResourceName: Pcstr = null,
    public var lpApplicationName: Pcstr = null,
    public var hModule: Hmodule = null,
)

public data class Actctxw(
    public var cbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var lpSource: Pcwstr = null,
    public var wProcessorArchitecture: UShort = 0u,
    public var wLangId: UShort = 0u,
    public var lpAssemblyDirectory: Pcwstr = null,
    public var lpResourceName: Pcwstr = null,
    public var lpApplicationName: Pcwstr = null,
    public var hModule: Hmodule = null,
)

public data class ActctxSectionKeyedData(
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
    public var ulFlags: UInt = 0u,
    public var assemblyMetadata: ActctxSectionKeyedDataAssemblyMetadata = ActctxSectionKeyedDataAssemblyMetadata(),
)

public class ActivationContextAssemblyDetailedInformation(
    public var ulFlags: UInt = 0u,
    public var ulEncodedAssemblyIdentityLength: UInt = 0u,
    public var ulManifestPathType: UInt = 0u,
    public var ulManifestPathLength: UInt = 0u,
    public var liManifestLastWriteTime: Long = 0L,
    public var ulPolicyPathType: UInt = 0u,
    public var ulPolicyPathLength: UInt = 0u,
    public var liPolicyLastWriteTime: Long = 0L,
    public var ulMetadataSatelliteRosterIndex: UInt = 0u,
    public var ulManifestVersionMajor: UInt = 0u,
    public var ulManifestVersionMinor: UInt = 0u,
    public var ulPolicyVersionMajor: UInt = 0u,
    public var ulPolicyVersionMinor: UInt = 0u,
    public var ulAssemblyDirectoryNameLength: UInt = 0u,
    public var lpAssemblyEncodedAssemblyIdentity: Pcwstr = null,
    public var lpAssemblyManifestPath: Pcwstr = null,
    public var lpAssemblyPolicyPath: Pcwstr = null,
    public var lpAssemblyDirectoryName: Pcwstr = null,
    public var ulFileCount: UInt = 0u,
)

public data class ActivationContextCompatibilityInformation(
    public var elementCount: UInt = 0u,
    public var elements: List<CompatibilityContextElement> = List(1) { CompatibilityContextElement() },
)

public data class ActivationContextDetailedInformation(
    public var dwFlags: UInt = 0u,
    public var ulFormatVersion: UInt = 0u,
    public var ulAssemblyCount: UInt = 0u,
    public var ulRootManifestPathType: UInt = 0u,
    public var ulRootManifestPathChars: UInt = 0u,
    public var ulRootConfigurationPathType: UInt = 0u,
    public var ulRootConfigurationPathChars: UInt = 0u,
    public var ulAppDirPathType: UInt = 0u,
    public var ulAppDirPathChars: UInt = 0u,
    public var lpRootManifestPath: Pcwstr = null,
    public var lpRootConfigurationPath: Pcwstr = null,
    public var lpAppDirPath: Pcwstr = null,
)

public data class ActivationContextQueryIndex(
    public var ulAssemblyIndex: UInt = 0u,
    public var ulFileIndexInAssembly: UInt = 0u,
)

public data class ActivationContextRunLevelInformation(
    public var ulFlags: UInt = 0u,
    public var runLevel: ActctxRequestedRunLevel = 0,
    public var uiAccess: UInt = 0u,
)

public data class AssemblyFileDetailedInformation(
    public var ulFlags: UInt = 0u,
    public var ulFilenameLength: UInt = 0u,
    public var ulPathLength: UInt = 0u,
    public var lpFileName: Pcwstr = null,
    public var lpFilePath: Pcwstr = null,
)

public data class AssemblyInfo(
    public var cbAssemblyInfo: UInt = 0u,
    public var dwAssemblyFlags: UInt = 0u,
    public var uliAssemblySizeInKB: ULong = 0uL,
    public var pszCurrentAssemblyPathBuf: Pwstr = null,
    public var cchBuf: UInt = 0u,
)

public data class CompatibilityContextElement(
    public var id: Guid = Guid(),
    public var type: ActctxCompatibilityElementType = 0,
    public var maxVersionTested: ULong = 0uL,
)

public data class DeltaHash(
    public var hashSize: UInt = 0u,
    public var hashValue: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DeltaHash) return false
        if (this.hashSize != other.hashSize) return false
        if (!this.hashValue.contentEquals(other.hashValue)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hashSize.hashCode()
        result = 31 * result + this.hashValue.contentHashCode()
        return result
    }
}

public data class DeltaHeaderInfo(
    public var fileTypeSet: Long = 0L,
    public var fileType: Long = 0L,
    public var flags: Long = 0L,
    public var targetSize: Int = 0,
    public var targetFileTime: Filetime = Filetime(),
    public var targetHashAlgId: AlgId = 0u,
    public var targetHash: DeltaHash = DeltaHash(),
)

public data class DeltaInput(
    public var anonymous: DeltaInput0 = DeltaInput0(),
    public var uSize: Int = 0,
    public var editable: Bool = 0,
)

public data class DeltaInput0(
    public var lpcStart: COpaquePointer? = null,
    public var lpStart: COpaquePointer? = null,
)

public data class DeltaOutput(
    public var lpStart: COpaquePointer? = null,
    public var uSize: Int = 0,
)

public data class FusionInstallReference(
    public var cbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var guidScheme: Guid = Guid(),
    public var szIdentifier: Pcwstr = null,
    public var szNonCannonicalData: Pcwstr = null,
)

public data class Msifilehashinfo(
    public var dwFileHashInfoSize: UInt = 0u,
    public var dwData: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Msifilehashinfo) return false
        if (this.dwFileHashInfoSize != other.dwFileHashInfoSize) return false
        if (!this.dwData.contentEquals(other.dwData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFileHashInfoSize.hashCode()
        result = 31 * result + this.dwData.contentHashCode()
        return result
    }
}

public data class Msipatchsequenceinfoa(
    public var szPatchData: Pcstr = null,
    public var ePatchDataType: Msipatchdatatype = 0,
    public var dwOrder: UInt = 0u,
    public var uStatus: UInt = 0u,
)

public data class Msipatchsequenceinfow(
    public var szPatchData: Pcwstr = null,
    public var ePatchDataType: Msipatchdatatype = 0,
    public var dwOrder: UInt = 0u,
    public var uStatus: UInt = 0u,
)

public data class PatchIgnoreRange(
    public var offsetInOldFile: UInt = 0u,
    public var lengthInBytes: UInt = 0u,
)

public data class PatchInterleaveMap(
    public var countRanges: UInt = 0u,
    public var range: List<PatchInterleaveMap0> = List(1) { PatchInterleaveMap0() },
)

public data class PatchInterleaveMap0(
    public var oldOffset: UInt = 0u,
    public var oldLength: UInt = 0u,
    public var newLength: UInt = 0u,
)

public data class PatchOldFileInfo(
    public var sizeOfThisStruct: UInt = 0u,
    public var anonymous: PatchOldFileInfo0 = PatchOldFileInfo0(),
    public var ignoreRangeCount: UInt = 0u,
    public var ignoreRangeArray: PatchIgnoreRange? = null,
    public var retainRangeCount: UInt = 0u,
    public var retainRangeArray: PatchRetainRange? = null,
)

public data class PatchOldFileInfo0(
    public var oldFileNameA: Pcstr = null,
    public var oldFileNameW: Pcwstr = null,
    public var oldFileHandle: Handle = null,
)

public data class PatchOldFileInfoA(
    public var sizeOfThisStruct: UInt = 0u,
    public var oldFileName: Pcstr = null,
    public var ignoreRangeCount: UInt = 0u,
    public var ignoreRangeArray: PatchIgnoreRange? = null,
    public var retainRangeCount: UInt = 0u,
    public var retainRangeArray: PatchRetainRange? = null,
)

public data class PatchOldFileInfoH(
    public var sizeOfThisStruct: UInt = 0u,
    public var oldFileHandle: Handle = null,
    public var ignoreRangeCount: UInt = 0u,
    public var ignoreRangeArray: PatchIgnoreRange? = null,
    public var retainRangeCount: UInt = 0u,
    public var retainRangeArray: PatchRetainRange? = null,
)

public data class PatchOldFileInfoW(
    public var sizeOfThisStruct: UInt = 0u,
    public var oldFileName: Pcwstr = null,
    public var ignoreRangeCount: UInt = 0u,
    public var ignoreRangeArray: PatchIgnoreRange? = null,
    public var retainRangeCount: UInt = 0u,
    public var retainRangeArray: PatchRetainRange? = null,
)

public data class PatchOptionData(
    public var sizeOfThisStruct: UInt = 0u,
    public var symbolOptionFlags: UInt = 0u,
    public var newFileSymbolPath: Pcstr = null,
    public var oldFileSymbolPathArray: Pcstr? = null,
    public var extendedOptionFlags: UInt = 0u,
    public var symLoadCallback: PpatchSymloadCallback = null,
    public var symLoadContext: COpaquePointer? = null,
    public var interleaveMapArray: COpaquePointer? = null,
    public var maxLzxWindowSize: UInt = 0u,
)

public data class PatchRetainRange(
    public var offsetInOldFile: UInt = 0u,
    public var lengthInBytes: UInt = 0u,
    public var offsetInNewFile: UInt = 0u,
)

public data class Pmsihandle(
    public var mH: Msihandle = 0u,
)

public data class PmApptasktype(
    public var productID: Guid = Guid(),
    public var taskType: PmTaskType = 0,
)

public data class PmBsataskid(
    public var productID: Guid = Guid(),
    public var taskID: Bstr = null,
)

public data class PmBwtaskid(
    public var productID: Guid = Guid(),
    public var taskID: Bstr = null,
)

public data class PmEnumFilter(
    public var filterType: Int = 0,
    public var filterParameter: PmEnumFilter0 = PmEnumFilter0(),
)

public class PmEnumFilter0(
    public var dummy: Int = 0,
    public var genre: PmAppGenre = 0,
    public var appHubType: PmApplicationHubtype = 0,
    public var hubType: PmTileHubtype = 0,
    public var tasktype: PmTaskType = 0,
    public var taskProductID: Guid = Guid(),
    public var tileProductID: Guid = Guid(),
    public var appTaskType: PmApptasktype = PmApptasktype(),
    public var consumer: PmExtensionconsumer = PmExtensionconsumer(),
    public var bSATask: PmBsataskid = PmBsataskid(),
    public var bSAProductID: Guid = Guid(),
    public var bWTask: PmBwtaskid = PmBwtaskid(),
    public var protocolName: Bstr = null,
    public var fileType: Bstr = null,
    public var contentType: Bstr = null,
    public var appSupportedFileExtPID: Guid = Guid(),
    public var shareTargetFileType: Bstr = null,
)

public data class PmExtensionconsumer(
    public var consumerPID: Guid = Guid(),
    public var extensionID: Bstr = null,
)

public data class PmInstallinfo(
    public var productID: Guid = Guid(),
    public var packagePath: Bstr = null,
    public var instanceID: Guid = Guid(),
    public var pbLicense: COpaquePointer? = null,
    public var cbLicense: UInt = 0u,
    public var isUninstallDisabled: Bool = 0,
    public var deploymentOptions: UInt = 0u,
    public var offerID: Guid = Guid(),
    public var marketplaceAppVersion: Bstr = null,
)

public data class PmInvocationinfo(
    public var uRIBaseOrAUMID: Bstr = null,
    public var uRIFragmentOrArgs: Bstr = null,
)

public data class PmStartappblob(
    public var cbSize: UInt = 0u,
    public var productID: Guid = Guid(),
    public var appTitle: Bstr = null,
    public var iconPath: Bstr = null,
    public var isUninstallable: Bool = 0,
    public var appInstallType: PmApplicationInstallType = 0,
    public var instanceID: Guid = Guid(),
    public var state: PmApplicationState = 0,
    public var isModern: Bool = 0,
    public var isModernLightUp: Bool = 0,
    public var lightUpSupportMask: UShort = 0u,
)

public data class PmStarttileblob(
    public var cbSize: UInt = 0u,
    public var productID: Guid = Guid(),
    public var tileID: Bstr = null,
    public var templateType: TileTemplateType = 0,
    public var hubPosition: UIntArray = UIntArray(32),
    public var hubVisibilityBitmask: UInt = 0u,
    public var isDefault: Bool = 0,
    public var tileType: PmStarttileType = 0,
    public var pbPropBlob: COpaquePointer? = null,
    public var cbPropBlob: UInt = 0u,
    public var isRestoring: Bool = 0,
    public var isModern: Bool = 0,
    public var invocationInfo: PmInvocationinfo = PmInvocationinfo(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PmStarttileblob) return false
        if (this.cbSize != other.cbSize) return false
        if (this.productID != other.productID) return false
        if (this.tileID != other.tileID) return false
        if (this.templateType != other.templateType) return false
        if (!this.hubPosition.contentEquals(other.hubPosition)) return false
        if (this.hubVisibilityBitmask != other.hubVisibilityBitmask) return false
        if (this.isDefault != other.isDefault) return false
        if (this.tileType != other.tileType) return false
        if (this.pbPropBlob != other.pbPropBlob) return false
        if (this.cbPropBlob != other.cbPropBlob) return false
        if (this.isRestoring != other.isRestoring) return false
        if (this.isModern != other.isModern) return false
        if (this.invocationInfo != other.invocationInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.productID.hashCode()
        result = 31 * result + this.tileID.hashCode()
        result = 31 * result + this.templateType.hashCode()
        result = 31 * result + this.hubPosition.contentHashCode()
        result = 31 * result + this.hubVisibilityBitmask.hashCode()
        result = 31 * result + this.isDefault.hashCode()
        result = 31 * result + this.tileType.hashCode()
        result = 31 * result + this.pbPropBlob.hashCode()
        result = 31 * result + this.cbPropBlob.hashCode()
        result = 31 * result + this.isRestoring.hashCode()
        result = 31 * result + this.isModern.hashCode()
        result = 31 * result + this.invocationInfo.hashCode()
        return result
    }
}

public data class PmUpdateinfo(
    public var productID: Guid = Guid(),
    public var packagePath: Bstr = null,
    public var instanceID: Guid = Guid(),
    public var pbLicense: COpaquePointer? = null,
    public var cbLicense: UInt = 0u,
    public var marketplaceAppVersion: Bstr = null,
    public var deploymentOptions: UInt = 0u,
)

public data class PmUpdateinfoLegacy(
    public var productID: Guid = Guid(),
    public var packagePath: Bstr = null,
    public var instanceID: Guid = Guid(),
    public var pbLicense: COpaquePointer? = null,
    public var cbLicense: UInt = 0u,
    public var marketplaceAppVersion: Bstr = null,
)

public data class ProtectedFileData(
    public var fileName: UShortArray = UShortArray(260),
    public var fileNumber: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProtectedFileData) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        if (this.fileNumber != other.fileNumber) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fileName.contentHashCode()
        result = 31 * result + this.fileNumber.hashCode()
        return result
    }
}
