@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.BSTR
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public data class ACTCTXA(
    public var cbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var lpSource: PCSTR = 0L,
    public var wProcessorArchitecture: UShort = 0u,
    public var wLangId: UShort = 0u,
    public var lpAssemblyDirectory: PCSTR = 0L,
    public var lpResourceName: PCSTR = 0L,
    public var lpApplicationName: PCSTR = 0L,
    public var hModule: Foundation.HMODULE = Foundation.HMODULE(),
)

public data class ACTCTXW(
    public var cbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var lpSource: PCWSTR = 0L,
    public var wProcessorArchitecture: UShort = 0u,
    public var wLangId: UShort = 0u,
    public var lpAssemblyDirectory: PCWSTR = 0L,
    public var lpResourceName: PCWSTR = 0L,
    public var lpApplicationName: PCWSTR = 0L,
    public var hModule: Foundation.HMODULE = Foundation.HMODULE(),
)

public data class ACTCTX_SECTION_KEYED_DATA(
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
    public var ulFlags: UInt = 0u,
    public var AssemblyMetadata: WindowsProgramming.ACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA = WindowsProgramming.ACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA(),
)

public class ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION(
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
    public var lpAssemblyEncodedAssemblyIdentity: PCWSTR = 0L,
    public var lpAssemblyManifestPath: PCWSTR = 0L,
    public var lpAssemblyPolicyPath: PCWSTR = 0L,
    public var lpAssemblyDirectoryName: PCWSTR = 0L,
    public var ulFileCount: UInt = 0u,
)

public data class ACTIVATION_CONTEXT_COMPATIBILITY_INFORMATION(public var ElementCount: UInt = 0u, public var Elements: List<COMPATIBILITY_CONTEXT_ELEMENT> = List(1) { COMPATIBILITY_CONTEXT_ELEMENT() })

public data class ACTIVATION_CONTEXT_DETAILED_INFORMATION(
    public var dwFlags: UInt = 0u,
    public var ulFormatVersion: UInt = 0u,
    public var ulAssemblyCount: UInt = 0u,
    public var ulRootManifestPathType: UInt = 0u,
    public var ulRootManifestPathChars: UInt = 0u,
    public var ulRootConfigurationPathType: UInt = 0u,
    public var ulRootConfigurationPathChars: UInt = 0u,
    public var ulAppDirPathType: UInt = 0u,
    public var ulAppDirPathChars: UInt = 0u,
    public var lpRootManifestPath: PCWSTR = 0L,
    public var lpRootConfigurationPath: PCWSTR = 0L,
    public var lpAppDirPath: PCWSTR = 0L,
)

public data class ACTIVATION_CONTEXT_QUERY_INDEX(public var ulAssemblyIndex: UInt = 0u, public var ulFileIndexInAssembly: UInt = 0u)

public data class ACTIVATION_CONTEXT_RUN_LEVEL_INFORMATION(
    public var ulFlags: UInt = 0u,
    public var RunLevel: ACTCTX_REQUESTED_RUN_LEVEL = 0,
    public var UiAccess: UInt = 0u,
)

public data class ASSEMBLY_FILE_DETAILED_INFORMATION(
    public var ulFlags: UInt = 0u,
    public var ulFilenameLength: UInt = 0u,
    public var ulPathLength: UInt = 0u,
    public var lpFileName: PCWSTR = 0L,
    public var lpFilePath: PCWSTR = 0L,
)

public data class ASSEMBLY_INFO(
    public var cbAssemblyInfo: UInt = 0u,
    public var dwAssemblyFlags: UInt = 0u,
    public var uliAssemblySizeInKB: ULong = 0uL,
    public var pszCurrentAssemblyPathBuf: PWSTR = 0L,
    public var cchBuf: UInt = 0u,
)

public data class COMPATIBILITY_CONTEXT_ELEMENT(
    public var Id: GUID = GUID(),
    public var Type: ACTCTX_COMPATIBILITY_ELEMENT_TYPE = 0,
    public var MaxVersionTested: ULong = 0uL,
)

public data class DELTA_HASH(public var HashSize: UInt = 0u, public var HashValue: UByteArray = UByteArray(32)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DELTA_HASH) return false
        if (this.HashSize != other.HashSize) return false
        if (!this.HashValue.contentEquals(other.HashValue)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.HashSize.hashCode()
        result = 31 * result + this.HashValue.contentHashCode()
        return result
    }
}

public data class DELTA_HEADER_INFO(
    public var FileTypeSet: Long = 0L,
    public var FileType: Long = 0L,
    public var Flags: Long = 0L,
    public var TargetSize: ULong = 0uL,
    public var TargetFileTime: Foundation.FILETIME = Foundation.FILETIME(),
    public var TargetHashAlgId: Security.Cryptography.ALG_ID = Security.Cryptography.ALG_ID(),
    public var TargetHash: DELTA_HASH = DELTA_HASH(),
)

public data class DELTA_INPUT(
    public var Anonymous: DELTA_INPUT_0 = DELTA_INPUT_0(),
    public var uSize: ULong = 0uL,
    public var Editable: BOOL = 0,
)

public data class DELTA_INPUT_0(public var lpcStart: Long = 0L, public var lpStart: Long = 0L)

public data class DELTA_OUTPUT(public var lpStart: Long = 0L, public var uSize: ULong = 0uL)

public data class FUSION_INSTALL_REFERENCE(
    public var cbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var guidScheme: GUID = GUID(),
    public var szIdentifier: PCWSTR = 0L,
    public var szNonCannonicalData: PCWSTR = 0L,
)

public data class MSIFILEHASHINFO(public var dwFileHashInfoSize: UInt = 0u, public var dwData: UIntArray = UIntArray(4)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MSIFILEHASHINFO) return false
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

public data class MSIPATCHSEQUENCEINFOA(
    public var szPatchData: PCSTR = 0L,
    public var ePatchDataType: MSIPATCHDATATYPE = 0,
    public var dwOrder: UInt = 0u,
    public var uStatus: UInt = 0u,
)

public data class MSIPATCHSEQUENCEINFOW(
    public var szPatchData: PCWSTR = 0L,
    public var ePatchDataType: MSIPATCHDATATYPE = 0,
    public var dwOrder: UInt = 0u,
    public var uStatus: UInt = 0u,
)

public data class PATCH_IGNORE_RANGE(public var OffsetInOldFile: UInt = 0u, public var LengthInBytes: UInt = 0u)

public data class PATCH_INTERLEAVE_MAP(public var CountRanges: UInt = 0u, public var Range: List<PATCH_INTERLEAVE_MAP_0> = List(1) { PATCH_INTERLEAVE_MAP_0() })

public data class PATCH_INTERLEAVE_MAP_0(
    public var OldOffset: UInt = 0u,
    public var OldLength: UInt = 0u,
    public var NewLength: UInt = 0u,
)

public data class PATCH_OLD_FILE_INFO(
    public var SizeOfThisStruct: UInt = 0u,
    public var Anonymous: PATCH_OLD_FILE_INFO_0 = PATCH_OLD_FILE_INFO_0(),
    public var IgnoreRangeCount: UInt = 0u,
    public var IgnoreRangeArray: Long = 0L,
    public var RetainRangeCount: UInt = 0u,
    public var RetainRangeArray: Long = 0L,
)

public data class PATCH_OLD_FILE_INFO_0(
    public var OldFileNameA: PCSTR = 0L,
    public var OldFileNameW: PCWSTR = 0L,
    public var OldFileHandle: Foundation.HANDLE = Foundation.HANDLE(),
)

public data class PATCH_OLD_FILE_INFO_A(
    public var SizeOfThisStruct: UInt = 0u,
    public var OldFileName: PCSTR = 0L,
    public var IgnoreRangeCount: UInt = 0u,
    public var IgnoreRangeArray: Long = 0L,
    public var RetainRangeCount: UInt = 0u,
    public var RetainRangeArray: Long = 0L,
)

public data class PATCH_OLD_FILE_INFO_H(
    public var SizeOfThisStruct: UInt = 0u,
    public var OldFileHandle: Foundation.HANDLE = Foundation.HANDLE(),
    public var IgnoreRangeCount: UInt = 0u,
    public var IgnoreRangeArray: Long = 0L,
    public var RetainRangeCount: UInt = 0u,
    public var RetainRangeArray: Long = 0L,
)

public data class PATCH_OLD_FILE_INFO_W(
    public var SizeOfThisStruct: UInt = 0u,
    public var OldFileName: PCWSTR = 0L,
    public var IgnoreRangeCount: UInt = 0u,
    public var IgnoreRangeArray: Long = 0L,
    public var RetainRangeCount: UInt = 0u,
    public var RetainRangeArray: Long = 0L,
)

public data class PATCH_OPTION_DATA(
    public var SizeOfThisStruct: UInt = 0u,
    public var SymbolOptionFlags: UInt = 0u,
    public var NewFileSymbolPath: PCSTR = 0L,
    public var OldFileSymbolPathArray: Long = 0L,
    public var ExtendedOptionFlags: UInt = 0u,
    public var SymLoadCallback: PPATCH_SYMLOAD_CALLBACK = null,
    public var SymLoadContext: Long = 0L,
    public var InterleaveMapArray: Long = 0L,
    public var MaxLzxWindowSize: UInt = 0u,
)

public data class PATCH_RETAIN_RANGE(
    public var OffsetInOldFile: UInt = 0u,
    public var LengthInBytes: UInt = 0u,
    public var OffsetInNewFile: UInt = 0u,
)

public data class PMSIHANDLE(public var m_h: MSIHANDLE = 0u)

public data class PM_APPTASKTYPE(public var ProductID: GUID = GUID(), public var TaskType: PM_TASK_TYPE = 0)

public data class PM_BSATASKID(public var ProductID: GUID = GUID(), public var TaskID: BSTR = 0L)

public data class PM_BWTASKID(public var ProductID: GUID = GUID(), public var TaskID: BSTR = 0L)

public data class PM_ENUM_FILTER(public var FilterType: Int = 0, public var FilterParameter: PM_ENUM_FILTER_0 = PM_ENUM_FILTER_0())

public class PM_ENUM_FILTER_0(
    public var Dummy: Int = 0,
    public var Genre: PM_APP_GENRE = 0,
    public var AppHubType: PM_APPLICATION_HUBTYPE = 0,
    public var HubType: PM_TILE_HUBTYPE = 0,
    public var Tasktype: PM_TASK_TYPE = 0,
    public var TaskProductID: GUID = GUID(),
    public var TileProductID: GUID = GUID(),
    public var AppTaskType: PM_APPTASKTYPE = PM_APPTASKTYPE(),
    public var Consumer: PM_EXTENSIONCONSUMER = PM_EXTENSIONCONSUMER(),
    public var BSATask: PM_BSATASKID = PM_BSATASKID(),
    public var BSAProductID: GUID = GUID(),
    public var BWTask: PM_BWTASKID = PM_BWTASKID(),
    public var ProtocolName: BSTR = 0L,
    public var FileType: BSTR = 0L,
    public var ContentType: BSTR = 0L,
    public var AppSupportedFileExtPID: GUID = GUID(),
    public var ShareTargetFileType: BSTR = 0L,
)

public data class PM_EXTENSIONCONSUMER(public var ConsumerPID: GUID = GUID(), public var ExtensionID: BSTR = 0L)

public data class PM_INSTALLINFO(
    public var ProductID: GUID = GUID(),
    public var PackagePath: BSTR = 0L,
    public var InstanceID: GUID = GUID(),
    public var pbLicense: Long = 0L,
    public var cbLicense: UInt = 0u,
    public var IsUninstallDisabled: BOOL = 0,
    public var DeploymentOptions: UInt = 0u,
    public var OfferID: GUID = GUID(),
    public var MarketplaceAppVersion: BSTR = 0L,
)

public data class PM_INVOCATIONINFO(public var URIBaseOrAUMID: BSTR = 0L, public var URIFragmentOrArgs: BSTR = 0L)

public data class PM_STARTAPPBLOB(
    public var cbSize: UInt = 0u,
    public var ProductID: GUID = GUID(),
    public var AppTitle: BSTR = 0L,
    public var IconPath: BSTR = 0L,
    public var IsUninstallable: BOOL = 0,
    public var AppInstallType: PM_APPLICATION_INSTALL_TYPE = 0,
    public var InstanceID: GUID = GUID(),
    public var State: PM_APPLICATION_STATE = 0,
    public var IsModern: BOOL = 0,
    public var IsModernLightUp: BOOL = 0,
    public var LightUpSupportMask: UShort = 0u,
)

public data class PM_STARTTILEBLOB(
    public var cbSize: UInt = 0u,
    public var ProductID: GUID = GUID(),
    public var TileID: BSTR = 0L,
    public var TemplateType: TILE_TEMPLATE_TYPE = 0,
    public var HubPosition: UIntArray = UIntArray(32),
    public var HubVisibilityBitmask: UInt = 0u,
    public var IsDefault: BOOL = 0,
    public var TileType: PM_STARTTILE_TYPE = 0,
    public var pbPropBlob: Long = 0L,
    public var cbPropBlob: UInt = 0u,
    public var IsRestoring: BOOL = 0,
    public var IsModern: BOOL = 0,
    public var InvocationInfo: PM_INVOCATIONINFO = PM_INVOCATIONINFO(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PM_STARTTILEBLOB) return false
        if (this.cbSize != other.cbSize) return false
        if (this.ProductID != other.ProductID) return false
        if (this.TileID != other.TileID) return false
        if (this.TemplateType != other.TemplateType) return false
        if (!this.HubPosition.contentEquals(other.HubPosition)) return false
        if (this.HubVisibilityBitmask != other.HubVisibilityBitmask) return false
        if (this.IsDefault != other.IsDefault) return false
        if (this.TileType != other.TileType) return false
        if (this.pbPropBlob != other.pbPropBlob) return false
        if (this.cbPropBlob != other.cbPropBlob) return false
        if (this.IsRestoring != other.IsRestoring) return false
        if (this.IsModern != other.IsModern) return false
        if (this.InvocationInfo != other.InvocationInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.ProductID.hashCode()
        result = 31 * result + this.TileID.hashCode()
        result = 31 * result + this.TemplateType.hashCode()
        result = 31 * result + this.HubPosition.contentHashCode()
        result = 31 * result + this.HubVisibilityBitmask.hashCode()
        result = 31 * result + this.IsDefault.hashCode()
        result = 31 * result + this.TileType.hashCode()
        result = 31 * result + this.pbPropBlob.hashCode()
        result = 31 * result + this.cbPropBlob.hashCode()
        result = 31 * result + this.IsRestoring.hashCode()
        result = 31 * result + this.IsModern.hashCode()
        result = 31 * result + this.InvocationInfo.hashCode()
        return result
    }
}

public data class PM_UPDATEINFO(
    public var ProductID: GUID = GUID(),
    public var PackagePath: BSTR = 0L,
    public var InstanceID: GUID = GUID(),
    public var pbLicense: Long = 0L,
    public var cbLicense: UInt = 0u,
    public var MarketplaceAppVersion: BSTR = 0L,
    public var DeploymentOptions: UInt = 0u,
)

public data class PM_UPDATEINFO_LEGACY(
    public var ProductID: GUID = GUID(),
    public var PackagePath: BSTR = 0L,
    public var InstanceID: GUID = GUID(),
    public var pbLicense: Long = 0L,
    public var cbLicense: UInt = 0u,
    public var MarketplaceAppVersion: BSTR = 0L,
)

public data class PROTECTED_FILE_DATA(public var FileName: UShortArray = UShortArray(260), public var FileNumber: UInt = 0u) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PROTECTED_FILE_DATA) return false
        if (!this.FileName.contentEquals(other.FileName)) return false
        if (this.FileNumber != other.FileNumber) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.FileName.contentHashCode()
        result = 31 * result + this.FileNumber.hashCode()
        return result
    }
}
