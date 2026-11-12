@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.applicationinstallationandservicing

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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

public class Actctxa internal constructor(
    public var cbSize: UInt,
    public var dwFlags: UInt,
    lpSourceCtorArg: Pcstr,
    public var wProcessorArchitecture: UShort,
    public var wLangId: UShort,
    lpAssemblyDirectoryCtorArg: Pcstr,
    lpResourceNameCtorArg: Pcstr,
    lpApplicationNameCtorArg: Pcstr,
    hModuleCtorArg: Hmodule,
) {
    public var lpSource: Pcstr = lpSourceCtorArg
        internal set

    public var lpAssemblyDirectory: Pcstr = lpAssemblyDirectoryCtorArg
        internal set

    public var lpResourceName: Pcstr = lpResourceNameCtorArg
        internal set

    public var lpApplicationName: Pcstr = lpApplicationNameCtorArg
        internal set

    public var hModule: Hmodule = hModuleCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        dwFlags = 0u,
        lpSourceCtorArg = ConstPtr(0L),
        wProcessorArchitecture = 0u,
        wLangId = 0u,
        lpAssemblyDirectoryCtorArg = ConstPtr(0L),
        lpResourceNameCtorArg = ConstPtr(0L),
        lpApplicationNameCtorArg = ConstPtr(0L),
        hModuleCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): Pcstr = this.lpSource

    public operator fun component4(): UShort = this.wProcessorArchitecture

    public operator fun component5(): UShort = this.wLangId

    public operator fun component6(): Pcstr = this.lpAssemblyDirectory

    public operator fun component7(): Pcstr = this.lpResourceName

    public operator fun component8(): Pcstr = this.lpApplicationName

    public operator fun component9(): Hmodule = this.hModule

    public fun copy(cbSize: UInt = this.cbSize, dwFlags: UInt = this.dwFlags, lpSource: Pcstr = this.lpSource, wProcessorArchitecture: UShort = this.wProcessorArchitecture, wLangId: UShort = this.wLangId, lpAssemblyDirectory: Pcstr = this.lpAssemblyDirectory, lpResourceName: Pcstr = this.lpResourceName, lpApplicationName: Pcstr = this.lpApplicationName, hModule: Hmodule = this.hModule): Actctxa = Actctxa(cbSize = cbSize, dwFlags = dwFlags, lpSourceCtorArg = lpSource, wProcessorArchitecture = wProcessorArchitecture, wLangId = wLangId, lpAssemblyDirectoryCtorArg = lpAssemblyDirectory, lpResourceNameCtorArg = lpResourceName, lpApplicationNameCtorArg = lpApplicationName, hModuleCtorArg = hModule)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Actctxa) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.lpSource != other.lpSource) return false
        if (this.wProcessorArchitecture != other.wProcessorArchitecture) return false
        if (this.wLangId != other.wLangId) return false
        if (this.lpAssemblyDirectory != other.lpAssemblyDirectory) return false
        if (this.lpResourceName != other.lpResourceName) return false
        if (this.lpApplicationName != other.lpApplicationName) return false
        if (this.hModule != other.hModule) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.lpSource.hashCode()
        result = 31 * result + this.wProcessorArchitecture.hashCode()
        result = 31 * result + this.wLangId.hashCode()
        result = 31 * result + this.lpAssemblyDirectory.hashCode()
        result = 31 * result + this.lpResourceName.hashCode()
        result = 31 * result + this.lpApplicationName.hashCode()
        result = 31 * result + this.hModule.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            dwFlags: UInt = 0u,
            lpSource: Pcstr = ConstPtr(0L),
            wProcessorArchitecture: UShort = 0u,
            wLangId: UShort = 0u,
            lpAssemblyDirectory: Pcstr = ConstPtr(0L),
            lpResourceName: Pcstr = ConstPtr(0L),
            lpApplicationName: Pcstr = ConstPtr(0L),
            hModule: Hmodule = MutPtr(0L),
        ): Actctxa =
            Actctxa(
                cbSize = cbSize,
                dwFlags = dwFlags,
                lpSourceCtorArg = lpSource,
                wProcessorArchitecture = wProcessorArchitecture,
                wLangId = wLangId,
                lpAssemblyDirectoryCtorArg = lpAssemblyDirectory,
                lpResourceNameCtorArg = lpResourceName,
                lpApplicationNameCtorArg = lpApplicationName,
                hModuleCtorArg = hModule,
            )
    }
}

public class Actctxw internal constructor(
    public var cbSize: UInt,
    public var dwFlags: UInt,
    lpSourceCtorArg: Pcwstr,
    public var wProcessorArchitecture: UShort,
    public var wLangId: UShort,
    lpAssemblyDirectoryCtorArg: Pcwstr,
    lpResourceNameCtorArg: Pcwstr,
    lpApplicationNameCtorArg: Pcwstr,
    hModuleCtorArg: Hmodule,
) {
    public var lpSource: Pcwstr = lpSourceCtorArg
        internal set

    public var lpAssemblyDirectory: Pcwstr = lpAssemblyDirectoryCtorArg
        internal set

    public var lpResourceName: Pcwstr = lpResourceNameCtorArg
        internal set

    public var lpApplicationName: Pcwstr = lpApplicationNameCtorArg
        internal set

    public var hModule: Hmodule = hModuleCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        dwFlags = 0u,
        lpSourceCtorArg = ConstPtr(0L),
        wProcessorArchitecture = 0u,
        wLangId = 0u,
        lpAssemblyDirectoryCtorArg = ConstPtr(0L),
        lpResourceNameCtorArg = ConstPtr(0L),
        lpApplicationNameCtorArg = ConstPtr(0L),
        hModuleCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): Pcwstr = this.lpSource

    public operator fun component4(): UShort = this.wProcessorArchitecture

    public operator fun component5(): UShort = this.wLangId

    public operator fun component6(): Pcwstr = this.lpAssemblyDirectory

    public operator fun component7(): Pcwstr = this.lpResourceName

    public operator fun component8(): Pcwstr = this.lpApplicationName

    public operator fun component9(): Hmodule = this.hModule

    public fun copy(cbSize: UInt = this.cbSize, dwFlags: UInt = this.dwFlags, lpSource: Pcwstr = this.lpSource, wProcessorArchitecture: UShort = this.wProcessorArchitecture, wLangId: UShort = this.wLangId, lpAssemblyDirectory: Pcwstr = this.lpAssemblyDirectory, lpResourceName: Pcwstr = this.lpResourceName, lpApplicationName: Pcwstr = this.lpApplicationName, hModule: Hmodule = this.hModule): Actctxw = Actctxw(cbSize = cbSize, dwFlags = dwFlags, lpSourceCtorArg = lpSource, wProcessorArchitecture = wProcessorArchitecture, wLangId = wLangId, lpAssemblyDirectoryCtorArg = lpAssemblyDirectory, lpResourceNameCtorArg = lpResourceName, lpApplicationNameCtorArg = lpApplicationName, hModuleCtorArg = hModule)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Actctxw) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.lpSource != other.lpSource) return false
        if (this.wProcessorArchitecture != other.wProcessorArchitecture) return false
        if (this.wLangId != other.wLangId) return false
        if (this.lpAssemblyDirectory != other.lpAssemblyDirectory) return false
        if (this.lpResourceName != other.lpResourceName) return false
        if (this.lpApplicationName != other.lpApplicationName) return false
        if (this.hModule != other.hModule) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.lpSource.hashCode()
        result = 31 * result + this.wProcessorArchitecture.hashCode()
        result = 31 * result + this.wLangId.hashCode()
        result = 31 * result + this.lpAssemblyDirectory.hashCode()
        result = 31 * result + this.lpResourceName.hashCode()
        result = 31 * result + this.lpApplicationName.hashCode()
        result = 31 * result + this.hModule.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            dwFlags: UInt = 0u,
            lpSource: Pcwstr = ConstPtr(0L),
            wProcessorArchitecture: UShort = 0u,
            wLangId: UShort = 0u,
            lpAssemblyDirectory: Pcwstr = ConstPtr(0L),
            lpResourceName: Pcwstr = ConstPtr(0L),
            lpApplicationName: Pcwstr = ConstPtr(0L),
            hModule: Hmodule = MutPtr(0L),
        ): Actctxw =
            Actctxw(
                cbSize = cbSize,
                dwFlags = dwFlags,
                lpSourceCtorArg = lpSource,
                wProcessorArchitecture = wProcessorArchitecture,
                wLangId = wLangId,
                lpAssemblyDirectoryCtorArg = lpAssemblyDirectory,
                lpResourceNameCtorArg = lpResourceName,
                lpApplicationNameCtorArg = lpApplicationName,
                hModuleCtorArg = hModule,
            )
    }
}

public class ActctxSectionKeyedData internal constructor(
    public var cbSize: UInt,
    public var ulDataFormatVersion: UInt,
    lpDataCtorArg: MutPtr,
    public var ulLength: UInt,
    lpSectionGlobalDataCtorArg: MutPtr,
    public var ulSectionGlobalDataLength: UInt,
    lpSectionBaseCtorArg: MutPtr,
    public var ulSectionTotalLength: UInt,
    hActCtxCtorArg: Handle,
    public var ulAssemblyRosterIndex: UInt,
    public var ulFlags: UInt,
    public var assemblyMetadata: ActctxSectionKeyedDataAssemblyMetadata,
) {
    public var lpData: MutPtr = lpDataCtorArg
        internal set

    public var lpSectionGlobalData: MutPtr = lpSectionGlobalDataCtorArg
        internal set

    public var lpSectionBase: MutPtr = lpSectionBaseCtorArg
        internal set

    public var hActCtx: Handle = hActCtxCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        ulDataFormatVersion = 0u,
        lpDataCtorArg = MutPtr(0L),
        ulLength = 0u,
        lpSectionGlobalDataCtorArg = MutPtr(0L),
        ulSectionGlobalDataLength = 0u,
        lpSectionBaseCtorArg = MutPtr(0L),
        ulSectionTotalLength = 0u,
        hActCtxCtorArg = MutPtr(0L),
        ulAssemblyRosterIndex = 0u,
        ulFlags = 0u,
        assemblyMetadata = ActctxSectionKeyedDataAssemblyMetadata(),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.ulDataFormatVersion

    public operator fun component3(): MutPtr = this.lpData

    public operator fun component4(): UInt = this.ulLength

    public operator fun component5(): MutPtr = this.lpSectionGlobalData

    public operator fun component6(): UInt = this.ulSectionGlobalDataLength

    public operator fun component7(): MutPtr = this.lpSectionBase

    public operator fun component8(): UInt = this.ulSectionTotalLength

    public operator fun component9(): Handle = this.hActCtx

    public operator fun component10(): UInt = this.ulAssemblyRosterIndex

    public operator fun component11(): UInt = this.ulFlags

    public operator fun component12(): ActctxSectionKeyedDataAssemblyMetadata = this.assemblyMetadata

    public fun copy(cbSize: UInt = this.cbSize, ulDataFormatVersion: UInt = this.ulDataFormatVersion, lpData: MutPtr = this.lpData, ulLength: UInt = this.ulLength, lpSectionGlobalData: MutPtr = this.lpSectionGlobalData, ulSectionGlobalDataLength: UInt = this.ulSectionGlobalDataLength, lpSectionBase: MutPtr = this.lpSectionBase, ulSectionTotalLength: UInt = this.ulSectionTotalLength, hActCtx: Handle = this.hActCtx, ulAssemblyRosterIndex: UInt = this.ulAssemblyRosterIndex, ulFlags: UInt = this.ulFlags, assemblyMetadata: ActctxSectionKeyedDataAssemblyMetadata = this.assemblyMetadata): ActctxSectionKeyedData = ActctxSectionKeyedData(cbSize = cbSize, ulDataFormatVersion = ulDataFormatVersion, lpDataCtorArg = lpData, ulLength = ulLength, lpSectionGlobalDataCtorArg = lpSectionGlobalData, ulSectionGlobalDataLength = ulSectionGlobalDataLength, lpSectionBaseCtorArg = lpSectionBase, ulSectionTotalLength = ulSectionTotalLength, hActCtxCtorArg = hActCtx, ulAssemblyRosterIndex = ulAssemblyRosterIndex, ulFlags = ulFlags, assemblyMetadata = assemblyMetadata)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ActctxSectionKeyedData) return false
        if (this.cbSize != other.cbSize) return false
        if (this.ulDataFormatVersion != other.ulDataFormatVersion) return false
        if (this.lpData != other.lpData) return false
        if (this.ulLength != other.ulLength) return false
        if (this.lpSectionGlobalData != other.lpSectionGlobalData) return false
        if (this.ulSectionGlobalDataLength != other.ulSectionGlobalDataLength) return false
        if (this.lpSectionBase != other.lpSectionBase) return false
        if (this.ulSectionTotalLength != other.ulSectionTotalLength) return false
        if (this.hActCtx != other.hActCtx) return false
        if (this.ulAssemblyRosterIndex != other.ulAssemblyRosterIndex) return false
        if (this.ulFlags != other.ulFlags) return false
        if (this.assemblyMetadata != other.assemblyMetadata) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.ulDataFormatVersion.hashCode()
        result = 31 * result + this.lpData.hashCode()
        result = 31 * result + this.ulLength.hashCode()
        result = 31 * result + this.lpSectionGlobalData.hashCode()
        result = 31 * result + this.ulSectionGlobalDataLength.hashCode()
        result = 31 * result + this.lpSectionBase.hashCode()
        result = 31 * result + this.ulSectionTotalLength.hashCode()
        result = 31 * result + this.hActCtx.hashCode()
        result = 31 * result + this.ulAssemblyRosterIndex.hashCode()
        result = 31 * result + this.ulFlags.hashCode()
        result = 31 * result + this.assemblyMetadata.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            ulDataFormatVersion: UInt = 0u,
            lpData: MutPtr = MutPtr(0L),
            ulLength: UInt = 0u,
            lpSectionGlobalData: MutPtr = MutPtr(0L),
            ulSectionGlobalDataLength: UInt = 0u,
            lpSectionBase: MutPtr = MutPtr(0L),
            ulSectionTotalLength: UInt = 0u,
            hActCtx: Handle = MutPtr(0L),
            ulAssemblyRosterIndex: UInt = 0u,
            ulFlags: UInt = 0u,
            assemblyMetadata: ActctxSectionKeyedDataAssemblyMetadata = ActctxSectionKeyedDataAssemblyMetadata(),
        ): ActctxSectionKeyedData =
            ActctxSectionKeyedData(
                cbSize = cbSize,
                ulDataFormatVersion = ulDataFormatVersion,
                lpDataCtorArg = lpData,
                ulLength = ulLength,
                lpSectionGlobalDataCtorArg = lpSectionGlobalData,
                ulSectionGlobalDataLength = ulSectionGlobalDataLength,
                lpSectionBaseCtorArg = lpSectionBase,
                ulSectionTotalLength = ulSectionTotalLength,
                hActCtxCtorArg = hActCtx,
                ulAssemblyRosterIndex = ulAssemblyRosterIndex,
                ulFlags = ulFlags,
                assemblyMetadata = assemblyMetadata,
            )
    }
}

public class ActivationContextAssemblyDetailedInformation internal constructor(
    public var ulFlags: UInt,
    public var ulEncodedAssemblyIdentityLength: UInt,
    public var ulManifestPathType: UInt,
    public var ulManifestPathLength: UInt,
    public var liManifestLastWriteTime: Long,
    public var ulPolicyPathType: UInt,
    public var ulPolicyPathLength: UInt,
    public var liPolicyLastWriteTime: Long,
    public var ulMetadataSatelliteRosterIndex: UInt,
    public var ulManifestVersionMajor: UInt,
    public var ulManifestVersionMinor: UInt,
    public var ulPolicyVersionMajor: UInt,
    public var ulPolicyVersionMinor: UInt,
    public var ulAssemblyDirectoryNameLength: UInt,
    lpAssemblyEncodedAssemblyIdentityCtorArg: Pcwstr,
    lpAssemblyManifestPathCtorArg: Pcwstr,
    lpAssemblyPolicyPathCtorArg: Pcwstr,
    lpAssemblyDirectoryNameCtorArg: Pcwstr,
    public var ulFileCount: UInt,
) {
    public var lpAssemblyEncodedAssemblyIdentity: Pcwstr = lpAssemblyEncodedAssemblyIdentityCtorArg
        internal set

    public var lpAssemblyManifestPath: Pcwstr = lpAssemblyManifestPathCtorArg
        internal set

    public var lpAssemblyPolicyPath: Pcwstr = lpAssemblyPolicyPathCtorArg
        internal set

    public var lpAssemblyDirectoryName: Pcwstr = lpAssemblyDirectoryNameCtorArg
        internal set

    public constructor() : this(
        ulFlags = 0u,
        ulEncodedAssemblyIdentityLength = 0u,
        ulManifestPathType = 0u,
        ulManifestPathLength = 0u,
        liManifestLastWriteTime = 0L,
        ulPolicyPathType = 0u,
        ulPolicyPathLength = 0u,
        liPolicyLastWriteTime = 0L,
        ulMetadataSatelliteRosterIndex = 0u,
        ulManifestVersionMajor = 0u,
        ulManifestVersionMinor = 0u,
        ulPolicyVersionMajor = 0u,
        ulPolicyVersionMinor = 0u,
        ulAssemblyDirectoryNameLength = 0u,
        lpAssemblyEncodedAssemblyIdentityCtorArg = ConstPtr(0L),
        lpAssemblyManifestPathCtorArg = ConstPtr(0L),
        lpAssemblyPolicyPathCtorArg = ConstPtr(0L),
        lpAssemblyDirectoryNameCtorArg = ConstPtr(0L),
        ulFileCount = 0u,
    )

    public companion object {
        public operator fun invoke(
            ulFlags: UInt = 0u,
            ulEncodedAssemblyIdentityLength: UInt = 0u,
            ulManifestPathType: UInt = 0u,
            ulManifestPathLength: UInt = 0u,
            liManifestLastWriteTime: Long = 0L,
            ulPolicyPathType: UInt = 0u,
            ulPolicyPathLength: UInt = 0u,
            liPolicyLastWriteTime: Long = 0L,
            ulMetadataSatelliteRosterIndex: UInt = 0u,
            ulManifestVersionMajor: UInt = 0u,
            ulManifestVersionMinor: UInt = 0u,
            ulPolicyVersionMajor: UInt = 0u,
            ulPolicyVersionMinor: UInt = 0u,
            ulAssemblyDirectoryNameLength: UInt = 0u,
            lpAssemblyEncodedAssemblyIdentity: Pcwstr = ConstPtr(0L),
            lpAssemblyManifestPath: Pcwstr = ConstPtr(0L),
            lpAssemblyPolicyPath: Pcwstr = ConstPtr(0L),
            lpAssemblyDirectoryName: Pcwstr = ConstPtr(0L),
            ulFileCount: UInt = 0u,
        ): ActivationContextAssemblyDetailedInformation =
            ActivationContextAssemblyDetailedInformation(
                ulFlags = ulFlags,
                ulEncodedAssemblyIdentityLength = ulEncodedAssemblyIdentityLength,
                ulManifestPathType = ulManifestPathType,
                ulManifestPathLength = ulManifestPathLength,
                liManifestLastWriteTime = liManifestLastWriteTime,
                ulPolicyPathType = ulPolicyPathType,
                ulPolicyPathLength = ulPolicyPathLength,
                liPolicyLastWriteTime = liPolicyLastWriteTime,
                ulMetadataSatelliteRosterIndex = ulMetadataSatelliteRosterIndex,
                ulManifestVersionMajor = ulManifestVersionMajor,
                ulManifestVersionMinor = ulManifestVersionMinor,
                ulPolicyVersionMajor = ulPolicyVersionMajor,
                ulPolicyVersionMinor = ulPolicyVersionMinor,
                ulAssemblyDirectoryNameLength = ulAssemblyDirectoryNameLength,
                lpAssemblyEncodedAssemblyIdentityCtorArg = lpAssemblyEncodedAssemblyIdentity,
                lpAssemblyManifestPathCtorArg = lpAssemblyManifestPath,
                lpAssemblyPolicyPathCtorArg = lpAssemblyPolicyPath,
                lpAssemblyDirectoryNameCtorArg = lpAssemblyDirectoryName,
                ulFileCount = ulFileCount,
            )
    }
}

public data class ActivationContextCompatibilityInformation(
    public var elementCount: UInt = 0u,
    public var elements: List<CompatibilityContextElement> = List(1) { CompatibilityContextElement() },
)

public class ActivationContextDetailedInformation internal constructor(
    public var dwFlags: UInt,
    public var ulFormatVersion: UInt,
    public var ulAssemblyCount: UInt,
    public var ulRootManifestPathType: UInt,
    public var ulRootManifestPathChars: UInt,
    public var ulRootConfigurationPathType: UInt,
    public var ulRootConfigurationPathChars: UInt,
    public var ulAppDirPathType: UInt,
    public var ulAppDirPathChars: UInt,
    lpRootManifestPathCtorArg: Pcwstr,
    lpRootConfigurationPathCtorArg: Pcwstr,
    lpAppDirPathCtorArg: Pcwstr,
) {
    public var lpRootManifestPath: Pcwstr = lpRootManifestPathCtorArg
        internal set

    public var lpRootConfigurationPath: Pcwstr = lpRootConfigurationPathCtorArg
        internal set

    public var lpAppDirPath: Pcwstr = lpAppDirPathCtorArg
        internal set

    public constructor() : this(
        dwFlags = 0u,
        ulFormatVersion = 0u,
        ulAssemblyCount = 0u,
        ulRootManifestPathType = 0u,
        ulRootManifestPathChars = 0u,
        ulRootConfigurationPathType = 0u,
        ulRootConfigurationPathChars = 0u,
        ulAppDirPathType = 0u,
        ulAppDirPathChars = 0u,
        lpRootManifestPathCtorArg = ConstPtr(0L),
        lpRootConfigurationPathCtorArg = ConstPtr(0L),
        lpAppDirPathCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.dwFlags

    public operator fun component2(): UInt = this.ulFormatVersion

    public operator fun component3(): UInt = this.ulAssemblyCount

    public operator fun component4(): UInt = this.ulRootManifestPathType

    public operator fun component5(): UInt = this.ulRootManifestPathChars

    public operator fun component6(): UInt = this.ulRootConfigurationPathType

    public operator fun component7(): UInt = this.ulRootConfigurationPathChars

    public operator fun component8(): UInt = this.ulAppDirPathType

    public operator fun component9(): UInt = this.ulAppDirPathChars

    public operator fun component10(): Pcwstr = this.lpRootManifestPath

    public operator fun component11(): Pcwstr = this.lpRootConfigurationPath

    public operator fun component12(): Pcwstr = this.lpAppDirPath

    public fun copy(dwFlags: UInt = this.dwFlags, ulFormatVersion: UInt = this.ulFormatVersion, ulAssemblyCount: UInt = this.ulAssemblyCount, ulRootManifestPathType: UInt = this.ulRootManifestPathType, ulRootManifestPathChars: UInt = this.ulRootManifestPathChars, ulRootConfigurationPathType: UInt = this.ulRootConfigurationPathType, ulRootConfigurationPathChars: UInt = this.ulRootConfigurationPathChars, ulAppDirPathType: UInt = this.ulAppDirPathType, ulAppDirPathChars: UInt = this.ulAppDirPathChars, lpRootManifestPath: Pcwstr = this.lpRootManifestPath, lpRootConfigurationPath: Pcwstr = this.lpRootConfigurationPath, lpAppDirPath: Pcwstr = this.lpAppDirPath): ActivationContextDetailedInformation = ActivationContextDetailedInformation(dwFlags = dwFlags, ulFormatVersion = ulFormatVersion, ulAssemblyCount = ulAssemblyCount, ulRootManifestPathType = ulRootManifestPathType, ulRootManifestPathChars = ulRootManifestPathChars, ulRootConfigurationPathType = ulRootConfigurationPathType, ulRootConfigurationPathChars = ulRootConfigurationPathChars, ulAppDirPathType = ulAppDirPathType, ulAppDirPathChars = ulAppDirPathChars, lpRootManifestPathCtorArg = lpRootManifestPath, lpRootConfigurationPathCtorArg = lpRootConfigurationPath, lpAppDirPathCtorArg = lpAppDirPath)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ActivationContextDetailedInformation) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.ulFormatVersion != other.ulFormatVersion) return false
        if (this.ulAssemblyCount != other.ulAssemblyCount) return false
        if (this.ulRootManifestPathType != other.ulRootManifestPathType) return false
        if (this.ulRootManifestPathChars != other.ulRootManifestPathChars) return false
        if (this.ulRootConfigurationPathType != other.ulRootConfigurationPathType) return false
        if (this.ulRootConfigurationPathChars != other.ulRootConfigurationPathChars) return false
        if (this.ulAppDirPathType != other.ulAppDirPathType) return false
        if (this.ulAppDirPathChars != other.ulAppDirPathChars) return false
        if (this.lpRootManifestPath != other.lpRootManifestPath) return false
        if (this.lpRootConfigurationPath != other.lpRootConfigurationPath) return false
        if (this.lpAppDirPath != other.lpAppDirPath) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFlags.hashCode()
        result = 31 * result + this.ulFormatVersion.hashCode()
        result = 31 * result + this.ulAssemblyCount.hashCode()
        result = 31 * result + this.ulRootManifestPathType.hashCode()
        result = 31 * result + this.ulRootManifestPathChars.hashCode()
        result = 31 * result + this.ulRootConfigurationPathType.hashCode()
        result = 31 * result + this.ulRootConfigurationPathChars.hashCode()
        result = 31 * result + this.ulAppDirPathType.hashCode()
        result = 31 * result + this.ulAppDirPathChars.hashCode()
        result = 31 * result + this.lpRootManifestPath.hashCode()
        result = 31 * result + this.lpRootConfigurationPath.hashCode()
        result = 31 * result + this.lpAppDirPath.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwFlags: UInt = 0u,
            ulFormatVersion: UInt = 0u,
            ulAssemblyCount: UInt = 0u,
            ulRootManifestPathType: UInt = 0u,
            ulRootManifestPathChars: UInt = 0u,
            ulRootConfigurationPathType: UInt = 0u,
            ulRootConfigurationPathChars: UInt = 0u,
            ulAppDirPathType: UInt = 0u,
            ulAppDirPathChars: UInt = 0u,
            lpRootManifestPath: Pcwstr = ConstPtr(0L),
            lpRootConfigurationPath: Pcwstr = ConstPtr(0L),
            lpAppDirPath: Pcwstr = ConstPtr(0L),
        ): ActivationContextDetailedInformation =
            ActivationContextDetailedInformation(
                dwFlags = dwFlags,
                ulFormatVersion = ulFormatVersion,
                ulAssemblyCount = ulAssemblyCount,
                ulRootManifestPathType = ulRootManifestPathType,
                ulRootManifestPathChars = ulRootManifestPathChars,
                ulRootConfigurationPathType = ulRootConfigurationPathType,
                ulRootConfigurationPathChars = ulRootConfigurationPathChars,
                ulAppDirPathType = ulAppDirPathType,
                ulAppDirPathChars = ulAppDirPathChars,
                lpRootManifestPathCtorArg = lpRootManifestPath,
                lpRootConfigurationPathCtorArg = lpRootConfigurationPath,
                lpAppDirPathCtorArg = lpAppDirPath,
            )
    }
}

public data class ActivationContextQueryIndex(
    public var ulAssemblyIndex: UInt = 0u,
    public var ulFileIndexInAssembly: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ActivationContextQueryIndex> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ActivationContextQueryIndex> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ActivationContextQueryIndex =
                    ActivationContextQueryIndex(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ActivationContextQueryIndex) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulAssemblyIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ulFileIndexInAssembly)
                }
            }
    }
}

public data class ActivationContextRunLevelInformation(
    public var ulFlags: UInt = 0u,
    public var runLevel: ActctxRequestedRunLevel = 0,
    public var uiAccess: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ActivationContextRunLevelInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ActivationContextRunLevelInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): ActivationContextRunLevelInformation =
                    ActivationContextRunLevelInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ActivationContextRunLevelInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.runLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.uiAccess)
                }
            }
    }
}

public class AssemblyFileDetailedInformation internal constructor(
    public var ulFlags: UInt,
    public var ulFilenameLength: UInt,
    public var ulPathLength: UInt,
    lpFileNameCtorArg: Pcwstr,
    lpFilePathCtorArg: Pcwstr,
) {
    public var lpFileName: Pcwstr = lpFileNameCtorArg
        internal set

    public var lpFilePath: Pcwstr = lpFilePathCtorArg
        internal set

    public constructor() : this(
        ulFlags = 0u,
        ulFilenameLength = 0u,
        ulPathLength = 0u,
        lpFileNameCtorArg = ConstPtr(0L),
        lpFilePathCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.ulFlags

    public operator fun component2(): UInt = this.ulFilenameLength

    public operator fun component3(): UInt = this.ulPathLength

    public operator fun component4(): Pcwstr = this.lpFileName

    public operator fun component5(): Pcwstr = this.lpFilePath

    public fun copy(ulFlags: UInt = this.ulFlags, ulFilenameLength: UInt = this.ulFilenameLength, ulPathLength: UInt = this.ulPathLength, lpFileName: Pcwstr = this.lpFileName, lpFilePath: Pcwstr = this.lpFilePath): AssemblyFileDetailedInformation = AssemblyFileDetailedInformation(ulFlags = ulFlags, ulFilenameLength = ulFilenameLength, ulPathLength = ulPathLength, lpFileNameCtorArg = lpFileName, lpFilePathCtorArg = lpFilePath)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AssemblyFileDetailedInformation) return false
        if (this.ulFlags != other.ulFlags) return false
        if (this.ulFilenameLength != other.ulFilenameLength) return false
        if (this.ulPathLength != other.ulPathLength) return false
        if (this.lpFileName != other.lpFileName) return false
        if (this.lpFilePath != other.lpFilePath) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ulFlags.hashCode()
        result = 31 * result + this.ulFilenameLength.hashCode()
        result = 31 * result + this.ulPathLength.hashCode()
        result = 31 * result + this.lpFileName.hashCode()
        result = 31 * result + this.lpFilePath.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ulFlags: UInt = 0u,
            ulFilenameLength: UInt = 0u,
            ulPathLength: UInt = 0u,
            lpFileName: Pcwstr = ConstPtr(0L),
            lpFilePath: Pcwstr = ConstPtr(0L),
        ): AssemblyFileDetailedInformation =
            AssemblyFileDetailedInformation(
                ulFlags = ulFlags,
                ulFilenameLength = ulFilenameLength,
                ulPathLength = ulPathLength,
                lpFileNameCtorArg = lpFileName,
                lpFilePathCtorArg = lpFilePath,
            )
    }
}

public class AssemblyInfo internal constructor(
    public var cbAssemblyInfo: UInt,
    public var dwAssemblyFlags: UInt,
    public var uliAssemblySizeInKB: ULong,
    pszCurrentAssemblyPathBufCtorArg: Pwstr,
    public var cchBuf: UInt,
) {
    public var pszCurrentAssemblyPathBuf: Pwstr = pszCurrentAssemblyPathBufCtorArg
        internal set

    public constructor() : this(
        cbAssemblyInfo = 0u,
        dwAssemblyFlags = 0u,
        uliAssemblySizeInKB = 0uL,
        pszCurrentAssemblyPathBufCtorArg = MutPtr(0L),
        cchBuf = 0u,
    )

    public operator fun component1(): UInt = this.cbAssemblyInfo

    public operator fun component2(): UInt = this.dwAssemblyFlags

    public operator fun component3(): ULong = this.uliAssemblySizeInKB

    public operator fun component4(): Pwstr = this.pszCurrentAssemblyPathBuf

    public operator fun component5(): UInt = this.cchBuf

    public fun copy(cbAssemblyInfo: UInt = this.cbAssemblyInfo, dwAssemblyFlags: UInt = this.dwAssemblyFlags, uliAssemblySizeInKB: ULong = this.uliAssemblySizeInKB, pszCurrentAssemblyPathBuf: Pwstr = this.pszCurrentAssemblyPathBuf, cchBuf: UInt = this.cchBuf): AssemblyInfo = AssemblyInfo(cbAssemblyInfo = cbAssemblyInfo, dwAssemblyFlags = dwAssemblyFlags, uliAssemblySizeInKB = uliAssemblySizeInKB, pszCurrentAssemblyPathBufCtorArg = pszCurrentAssemblyPathBuf, cchBuf = cchBuf)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AssemblyInfo) return false
        if (this.cbAssemblyInfo != other.cbAssemblyInfo) return false
        if (this.dwAssemblyFlags != other.dwAssemblyFlags) return false
        if (this.uliAssemblySizeInKB != other.uliAssemblySizeInKB) return false
        if (this.pszCurrentAssemblyPathBuf != other.pszCurrentAssemblyPathBuf) return false
        if (this.cchBuf != other.cchBuf) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbAssemblyInfo.hashCode()
        result = 31 * result + this.dwAssemblyFlags.hashCode()
        result = 31 * result + this.uliAssemblySizeInKB.hashCode()
        result = 31 * result + this.pszCurrentAssemblyPathBuf.hashCode()
        result = 31 * result + this.cchBuf.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbAssemblyInfo: UInt = 0u,
            dwAssemblyFlags: UInt = 0u,
            uliAssemblySizeInKB: ULong = 0uL,
            pszCurrentAssemblyPathBuf: Pwstr = MutPtr(0L),
            cchBuf: UInt = 0u,
        ): AssemblyInfo =
            AssemblyInfo(
                cbAssemblyInfo = cbAssemblyInfo,
                dwAssemblyFlags = dwAssemblyFlags,
                uliAssemblySizeInKB = uliAssemblySizeInKB,
                pszCurrentAssemblyPathBufCtorArg = pszCurrentAssemblyPathBuf,
                cchBuf = cchBuf,
            )
    }
}

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeltaHash> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeltaHash> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 36L
                override fun readNative(addr: Long): DeltaHash =
                    DeltaHash(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: DeltaHash) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hashSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr + 4L, value.hashValue.toList())
                }
            }
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

public class DeltaInput0 internal constructor(
    lpcStartCtorArg: ConstPtr,
    lpStartCtorArg: MutPtr,
) {
    public var lpcStart: ConstPtr = lpcStartCtorArg
        internal set

    public var lpStart: MutPtr = lpStartCtorArg
        internal set

    public constructor() : this(
        lpcStartCtorArg = ConstPtr(0L),
        lpStartCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ConstPtr = this.lpcStart

    public operator fun component2(): MutPtr = this.lpStart

    public fun copy(lpcStart: ConstPtr = this.lpcStart, lpStart: MutPtr = this.lpStart): DeltaInput0 = DeltaInput0(lpcStartCtorArg = lpcStart, lpStartCtorArg = lpStart)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DeltaInput0) return false
        if (this.lpcStart != other.lpcStart) return false
        if (this.lpStart != other.lpStart) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpcStart.hashCode()
        result = 31 * result + this.lpStart.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpcStart: ConstPtr = ConstPtr(0L),
            lpStart: MutPtr = MutPtr(0L),
        ): DeltaInput0 =
            DeltaInput0(
                lpcStartCtorArg = lpcStart,
                lpStartCtorArg = lpStart,
            )
    }
}

public class DeltaOutput internal constructor(
    lpStartCtorArg: MutPtr,
    public var uSize: Int,
) {
    public var lpStart: MutPtr = lpStartCtorArg
        internal set

    public constructor() : this(
        lpStartCtorArg = MutPtr(0L),
        uSize = 0,
    )

    public operator fun component1(): MutPtr = this.lpStart

    public operator fun component2(): Int = this.uSize

    public fun copy(lpStart: MutPtr = this.lpStart, uSize: Int = this.uSize): DeltaOutput = DeltaOutput(lpStartCtorArg = lpStart, uSize = uSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DeltaOutput) return false
        if (this.lpStart != other.lpStart) return false
        if (this.uSize != other.uSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpStart.hashCode()
        result = 31 * result + this.uSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeltaOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeltaOutput> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DeltaOutput =
                    DeltaOutput(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DeltaOutput) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.lpStart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.uSize)
                }
            }

        public operator fun invoke(
            lpStart: MutPtr = MutPtr(0L),
            uSize: Int = 0,
        ): DeltaOutput =
            DeltaOutput(
                lpStartCtorArg = lpStart,
                uSize = uSize,
            )
    }
}

public class FusionInstallReference internal constructor(
    public var cbSize: UInt,
    public var dwFlags: UInt,
    public var guidScheme: Guid,
    szIdentifierCtorArg: Pcwstr,
    szNonCannonicalDataCtorArg: Pcwstr,
) {
    public var szIdentifier: Pcwstr = szIdentifierCtorArg
        internal set

    public var szNonCannonicalData: Pcwstr = szNonCannonicalDataCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        dwFlags = 0u,
        guidScheme = Guid(),
        szIdentifierCtorArg = ConstPtr(0L),
        szNonCannonicalDataCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): Guid = this.guidScheme

    public operator fun component4(): Pcwstr = this.szIdentifier

    public operator fun component5(): Pcwstr = this.szNonCannonicalData

    public fun copy(cbSize: UInt = this.cbSize, dwFlags: UInt = this.dwFlags, guidScheme: Guid = this.guidScheme, szIdentifier: Pcwstr = this.szIdentifier, szNonCannonicalData: Pcwstr = this.szNonCannonicalData): FusionInstallReference = FusionInstallReference(cbSize = cbSize, dwFlags = dwFlags, guidScheme = guidScheme, szIdentifierCtorArg = szIdentifier, szNonCannonicalDataCtorArg = szNonCannonicalData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FusionInstallReference) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.guidScheme != other.guidScheme) return false
        if (this.szIdentifier != other.szIdentifier) return false
        if (this.szNonCannonicalData != other.szNonCannonicalData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.guidScheme.hashCode()
        result = 31 * result + this.szIdentifier.hashCode()
        result = 31 * result + this.szNonCannonicalData.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            dwFlags: UInt = 0u,
            guidScheme: Guid = Guid(),
            szIdentifier: Pcwstr = ConstPtr(0L),
            szNonCannonicalData: Pcwstr = ConstPtr(0L),
        ): FusionInstallReference =
            FusionInstallReference(
                cbSize = cbSize,
                dwFlags = dwFlags,
                guidScheme = guidScheme,
                szIdentifierCtorArg = szIdentifier,
                szNonCannonicalDataCtorArg = szNonCannonicalData,
            )
    }
}

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Msifilehashinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Msifilehashinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): Msifilehashinfo =
                    Msifilehashinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                        ).readNative(addr + 4L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: Msifilehashinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwFileHashInfoSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                    ).writeNative(addr + 4L, value.dwData.toList())
                }
            }
    }
}

public class Msipatchsequenceinfoa internal constructor(
    szPatchDataCtorArg: Pcstr,
    public var ePatchDataType: Msipatchdatatype,
    public var dwOrder: UInt,
    public var uStatus: UInt,
) {
    public var szPatchData: Pcstr = szPatchDataCtorArg
        internal set

    public constructor() : this(
        szPatchDataCtorArg = ConstPtr(0L),
        ePatchDataType = 0,
        dwOrder = 0u,
        uStatus = 0u,
    )

    public operator fun component1(): Pcstr = this.szPatchData

    public operator fun component2(): Msipatchdatatype = this.ePatchDataType

    public operator fun component3(): UInt = this.dwOrder

    public operator fun component4(): UInt = this.uStatus

    public fun copy(szPatchData: Pcstr = this.szPatchData, ePatchDataType: Msipatchdatatype = this.ePatchDataType, dwOrder: UInt = this.dwOrder, uStatus: UInt = this.uStatus): Msipatchsequenceinfoa = Msipatchsequenceinfoa(szPatchDataCtorArg = szPatchData, ePatchDataType = ePatchDataType, dwOrder = dwOrder, uStatus = uStatus)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Msipatchsequenceinfoa) return false
        if (this.szPatchData != other.szPatchData) return false
        if (this.ePatchDataType != other.ePatchDataType) return false
        if (this.dwOrder != other.dwOrder) return false
        if (this.uStatus != other.uStatus) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szPatchData.hashCode()
        result = 31 * result + this.ePatchDataType.hashCode()
        result = 31 * result + this.dwOrder.hashCode()
        result = 31 * result + this.uStatus.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            szPatchData: Pcstr = ConstPtr(0L),
            ePatchDataType: Msipatchdatatype = 0,
            dwOrder: UInt = 0u,
            uStatus: UInt = 0u,
        ): Msipatchsequenceinfoa =
            Msipatchsequenceinfoa(
                szPatchDataCtorArg = szPatchData,
                ePatchDataType = ePatchDataType,
                dwOrder = dwOrder,
                uStatus = uStatus,
            )
    }
}

public class Msipatchsequenceinfow internal constructor(
    szPatchDataCtorArg: Pcwstr,
    public var ePatchDataType: Msipatchdatatype,
    public var dwOrder: UInt,
    public var uStatus: UInt,
) {
    public var szPatchData: Pcwstr = szPatchDataCtorArg
        internal set

    public constructor() : this(
        szPatchDataCtorArg = ConstPtr(0L),
        ePatchDataType = 0,
        dwOrder = 0u,
        uStatus = 0u,
    )

    public operator fun component1(): Pcwstr = this.szPatchData

    public operator fun component2(): Msipatchdatatype = this.ePatchDataType

    public operator fun component3(): UInt = this.dwOrder

    public operator fun component4(): UInt = this.uStatus

    public fun copy(szPatchData: Pcwstr = this.szPatchData, ePatchDataType: Msipatchdatatype = this.ePatchDataType, dwOrder: UInt = this.dwOrder, uStatus: UInt = this.uStatus): Msipatchsequenceinfow = Msipatchsequenceinfow(szPatchDataCtorArg = szPatchData, ePatchDataType = ePatchDataType, dwOrder = dwOrder, uStatus = uStatus)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Msipatchsequenceinfow) return false
        if (this.szPatchData != other.szPatchData) return false
        if (this.ePatchDataType != other.ePatchDataType) return false
        if (this.dwOrder != other.dwOrder) return false
        if (this.uStatus != other.uStatus) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szPatchData.hashCode()
        result = 31 * result + this.ePatchDataType.hashCode()
        result = 31 * result + this.dwOrder.hashCode()
        result = 31 * result + this.uStatus.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            szPatchData: Pcwstr = ConstPtr(0L),
            ePatchDataType: Msipatchdatatype = 0,
            dwOrder: UInt = 0u,
            uStatus: UInt = 0u,
        ): Msipatchsequenceinfow =
            Msipatchsequenceinfow(
                szPatchDataCtorArg = szPatchData,
                ePatchDataType = ePatchDataType,
                dwOrder = dwOrder,
                uStatus = uStatus,
            )
    }
}

public data class PatchIgnoreRange(
    public var offsetInOldFile: UInt = 0u,
    public var lengthInBytes: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PatchIgnoreRange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PatchIgnoreRange> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PatchIgnoreRange =
                    PatchIgnoreRange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: PatchIgnoreRange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.offsetInOldFile)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.lengthInBytes)
                }
            }
    }
}

public data class PatchInterleaveMap(
    public var countRanges: UInt = 0u,
    public var range: List<PatchInterleaveMap0> = List(1) { PatchInterleaveMap0() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PatchInterleaveMap> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PatchInterleaveMap> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): PatchInterleaveMap =
                    PatchInterleaveMap(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(PatchInterleaveMap0.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: PatchInterleaveMap) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.countRanges)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(PatchInterleaveMap0.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.range)
                }
            }
    }
}

public data class PatchInterleaveMap0(
    public var oldOffset: UInt = 0u,
    public var oldLength: UInt = 0u,
    public var newLength: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PatchInterleaveMap0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PatchInterleaveMap0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): PatchInterleaveMap0 =
                    PatchInterleaveMap0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PatchInterleaveMap0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.oldOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.oldLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.newLength)
                }
            }
    }
}

public class PatchOldFileInfo internal constructor(
    public var sizeOfThisStruct: UInt,
    public var anonymous: PatchOldFileInfo0,
    public var ignoreRangeCount: UInt,
    ignoreRangeArrayCtorArg: MutPtr,
    public var retainRangeCount: UInt,
    retainRangeArrayCtorArg: MutPtr,
) {
    public var ignoreRangeArray: MutPtr = ignoreRangeArrayCtorArg
        internal set

    public var retainRangeArray: MutPtr = retainRangeArrayCtorArg
        internal set

    public constructor() : this(
        sizeOfThisStruct = 0u,
        anonymous = PatchOldFileInfo0(),
        ignoreRangeCount = 0u,
        ignoreRangeArrayCtorArg = MutPtr(0L),
        retainRangeCount = 0u,
        retainRangeArrayCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.sizeOfThisStruct

    public operator fun component2(): PatchOldFileInfo0 = this.anonymous

    public operator fun component3(): UInt = this.ignoreRangeCount

    public operator fun component4(): MutPtr = this.ignoreRangeArray

    public operator fun component5(): UInt = this.retainRangeCount

    public operator fun component6(): MutPtr = this.retainRangeArray

    public fun copy(sizeOfThisStruct: UInt = this.sizeOfThisStruct, anonymous: PatchOldFileInfo0 = this.anonymous, ignoreRangeCount: UInt = this.ignoreRangeCount, ignoreRangeArray: MutPtr = this.ignoreRangeArray, retainRangeCount: UInt = this.retainRangeCount, retainRangeArray: MutPtr = this.retainRangeArray): PatchOldFileInfo = PatchOldFileInfo(sizeOfThisStruct = sizeOfThisStruct, anonymous = anonymous, ignoreRangeCount = ignoreRangeCount, ignoreRangeArrayCtorArg = ignoreRangeArray, retainRangeCount = retainRangeCount, retainRangeArrayCtorArg = retainRangeArray)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PatchOldFileInfo) return false
        if (this.sizeOfThisStruct != other.sizeOfThisStruct) return false
        if (this.anonymous != other.anonymous) return false
        if (this.ignoreRangeCount != other.ignoreRangeCount) return false
        if (this.ignoreRangeArray != other.ignoreRangeArray) return false
        if (this.retainRangeCount != other.retainRangeCount) return false
        if (this.retainRangeArray != other.retainRangeArray) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfThisStruct.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.ignoreRangeCount.hashCode()
        result = 31 * result + this.ignoreRangeArray.hashCode()
        result = 31 * result + this.retainRangeCount.hashCode()
        result = 31 * result + this.retainRangeArray.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sizeOfThisStruct: UInt = 0u,
            anonymous: PatchOldFileInfo0 = PatchOldFileInfo0(),
            ignoreRangeCount: UInt = 0u,
            ignoreRangeArray: MutPtr = MutPtr(0L),
            retainRangeCount: UInt = 0u,
            retainRangeArray: MutPtr = MutPtr(0L),
        ): PatchOldFileInfo =
            PatchOldFileInfo(
                sizeOfThisStruct = sizeOfThisStruct,
                anonymous = anonymous,
                ignoreRangeCount = ignoreRangeCount,
                ignoreRangeArrayCtorArg = ignoreRangeArray,
                retainRangeCount = retainRangeCount,
                retainRangeArrayCtorArg = retainRangeArray,
            )
    }
}

public class PatchOldFileInfo0 internal constructor(
    oldFileNameACtorArg: Pcstr,
    oldFileNameWCtorArg: Pcwstr,
    oldFileHandleCtorArg: Handle,
) {
    public var oldFileNameA: Pcstr = oldFileNameACtorArg
        internal set

    public var oldFileNameW: Pcwstr = oldFileNameWCtorArg
        internal set

    public var oldFileHandle: Handle = oldFileHandleCtorArg
        internal set

    public constructor() : this(
        oldFileNameACtorArg = ConstPtr(0L),
        oldFileNameWCtorArg = ConstPtr(0L),
        oldFileHandleCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pcstr = this.oldFileNameA

    public operator fun component2(): Pcwstr = this.oldFileNameW

    public operator fun component3(): Handle = this.oldFileHandle

    public fun copy(oldFileNameA: Pcstr = this.oldFileNameA, oldFileNameW: Pcwstr = this.oldFileNameW, oldFileHandle: Handle = this.oldFileHandle): PatchOldFileInfo0 = PatchOldFileInfo0(oldFileNameACtorArg = oldFileNameA, oldFileNameWCtorArg = oldFileNameW, oldFileHandleCtorArg = oldFileHandle)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PatchOldFileInfo0) return false
        if (this.oldFileNameA != other.oldFileNameA) return false
        if (this.oldFileNameW != other.oldFileNameW) return false
        if (this.oldFileHandle != other.oldFileHandle) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.oldFileNameA.hashCode()
        result = 31 * result + this.oldFileNameW.hashCode()
        result = 31 * result + this.oldFileHandle.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            oldFileNameA: Pcstr = ConstPtr(0L),
            oldFileNameW: Pcwstr = ConstPtr(0L),
            oldFileHandle: Handle = MutPtr(0L),
        ): PatchOldFileInfo0 =
            PatchOldFileInfo0(
                oldFileNameACtorArg = oldFileNameA,
                oldFileNameWCtorArg = oldFileNameW,
                oldFileHandleCtorArg = oldFileHandle,
            )
    }
}

public class PatchOldFileInfoA internal constructor(
    public var sizeOfThisStruct: UInt,
    oldFileNameCtorArg: Pcstr,
    public var ignoreRangeCount: UInt,
    ignoreRangeArrayCtorArg: MutPtr,
    public var retainRangeCount: UInt,
    retainRangeArrayCtorArg: MutPtr,
) {
    public var oldFileName: Pcstr = oldFileNameCtorArg
        internal set

    public var ignoreRangeArray: MutPtr = ignoreRangeArrayCtorArg
        internal set

    public var retainRangeArray: MutPtr = retainRangeArrayCtorArg
        internal set

    public constructor() : this(
        sizeOfThisStruct = 0u,
        oldFileNameCtorArg = ConstPtr(0L),
        ignoreRangeCount = 0u,
        ignoreRangeArrayCtorArg = MutPtr(0L),
        retainRangeCount = 0u,
        retainRangeArrayCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.sizeOfThisStruct

    public operator fun component2(): Pcstr = this.oldFileName

    public operator fun component3(): UInt = this.ignoreRangeCount

    public operator fun component4(): MutPtr = this.ignoreRangeArray

    public operator fun component5(): UInt = this.retainRangeCount

    public operator fun component6(): MutPtr = this.retainRangeArray

    public fun copy(sizeOfThisStruct: UInt = this.sizeOfThisStruct, oldFileName: Pcstr = this.oldFileName, ignoreRangeCount: UInt = this.ignoreRangeCount, ignoreRangeArray: MutPtr = this.ignoreRangeArray, retainRangeCount: UInt = this.retainRangeCount, retainRangeArray: MutPtr = this.retainRangeArray): PatchOldFileInfoA = PatchOldFileInfoA(sizeOfThisStruct = sizeOfThisStruct, oldFileNameCtorArg = oldFileName, ignoreRangeCount = ignoreRangeCount, ignoreRangeArrayCtorArg = ignoreRangeArray, retainRangeCount = retainRangeCount, retainRangeArrayCtorArg = retainRangeArray)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PatchOldFileInfoA) return false
        if (this.sizeOfThisStruct != other.sizeOfThisStruct) return false
        if (this.oldFileName != other.oldFileName) return false
        if (this.ignoreRangeCount != other.ignoreRangeCount) return false
        if (this.ignoreRangeArray != other.ignoreRangeArray) return false
        if (this.retainRangeCount != other.retainRangeCount) return false
        if (this.retainRangeArray != other.retainRangeArray) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfThisStruct.hashCode()
        result = 31 * result + this.oldFileName.hashCode()
        result = 31 * result + this.ignoreRangeCount.hashCode()
        result = 31 * result + this.ignoreRangeArray.hashCode()
        result = 31 * result + this.retainRangeCount.hashCode()
        result = 31 * result + this.retainRangeArray.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sizeOfThisStruct: UInt = 0u,
            oldFileName: Pcstr = ConstPtr(0L),
            ignoreRangeCount: UInt = 0u,
            ignoreRangeArray: MutPtr = MutPtr(0L),
            retainRangeCount: UInt = 0u,
            retainRangeArray: MutPtr = MutPtr(0L),
        ): PatchOldFileInfoA =
            PatchOldFileInfoA(
                sizeOfThisStruct = sizeOfThisStruct,
                oldFileNameCtorArg = oldFileName,
                ignoreRangeCount = ignoreRangeCount,
                ignoreRangeArrayCtorArg = ignoreRangeArray,
                retainRangeCount = retainRangeCount,
                retainRangeArrayCtorArg = retainRangeArray,
            )
    }
}

public class PatchOldFileInfoH internal constructor(
    public var sizeOfThisStruct: UInt,
    oldFileHandleCtorArg: Handle,
    public var ignoreRangeCount: UInt,
    ignoreRangeArrayCtorArg: MutPtr,
    public var retainRangeCount: UInt,
    retainRangeArrayCtorArg: MutPtr,
) {
    public var oldFileHandle: Handle = oldFileHandleCtorArg
        internal set

    public var ignoreRangeArray: MutPtr = ignoreRangeArrayCtorArg
        internal set

    public var retainRangeArray: MutPtr = retainRangeArrayCtorArg
        internal set

    public constructor() : this(
        sizeOfThisStruct = 0u,
        oldFileHandleCtorArg = MutPtr(0L),
        ignoreRangeCount = 0u,
        ignoreRangeArrayCtorArg = MutPtr(0L),
        retainRangeCount = 0u,
        retainRangeArrayCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.sizeOfThisStruct

    public operator fun component2(): Handle = this.oldFileHandle

    public operator fun component3(): UInt = this.ignoreRangeCount

    public operator fun component4(): MutPtr = this.ignoreRangeArray

    public operator fun component5(): UInt = this.retainRangeCount

    public operator fun component6(): MutPtr = this.retainRangeArray

    public fun copy(sizeOfThisStruct: UInt = this.sizeOfThisStruct, oldFileHandle: Handle = this.oldFileHandle, ignoreRangeCount: UInt = this.ignoreRangeCount, ignoreRangeArray: MutPtr = this.ignoreRangeArray, retainRangeCount: UInt = this.retainRangeCount, retainRangeArray: MutPtr = this.retainRangeArray): PatchOldFileInfoH = PatchOldFileInfoH(sizeOfThisStruct = sizeOfThisStruct, oldFileHandleCtorArg = oldFileHandle, ignoreRangeCount = ignoreRangeCount, ignoreRangeArrayCtorArg = ignoreRangeArray, retainRangeCount = retainRangeCount, retainRangeArrayCtorArg = retainRangeArray)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PatchOldFileInfoH) return false
        if (this.sizeOfThisStruct != other.sizeOfThisStruct) return false
        if (this.oldFileHandle != other.oldFileHandle) return false
        if (this.ignoreRangeCount != other.ignoreRangeCount) return false
        if (this.ignoreRangeArray != other.ignoreRangeArray) return false
        if (this.retainRangeCount != other.retainRangeCount) return false
        if (this.retainRangeArray != other.retainRangeArray) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfThisStruct.hashCode()
        result = 31 * result + this.oldFileHandle.hashCode()
        result = 31 * result + this.ignoreRangeCount.hashCode()
        result = 31 * result + this.ignoreRangeArray.hashCode()
        result = 31 * result + this.retainRangeCount.hashCode()
        result = 31 * result + this.retainRangeArray.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sizeOfThisStruct: UInt = 0u,
            oldFileHandle: Handle = MutPtr(0L),
            ignoreRangeCount: UInt = 0u,
            ignoreRangeArray: MutPtr = MutPtr(0L),
            retainRangeCount: UInt = 0u,
            retainRangeArray: MutPtr = MutPtr(0L),
        ): PatchOldFileInfoH =
            PatchOldFileInfoH(
                sizeOfThisStruct = sizeOfThisStruct,
                oldFileHandleCtorArg = oldFileHandle,
                ignoreRangeCount = ignoreRangeCount,
                ignoreRangeArrayCtorArg = ignoreRangeArray,
                retainRangeCount = retainRangeCount,
                retainRangeArrayCtorArg = retainRangeArray,
            )
    }
}

public class PatchOldFileInfoW internal constructor(
    public var sizeOfThisStruct: UInt,
    oldFileNameCtorArg: Pcwstr,
    public var ignoreRangeCount: UInt,
    ignoreRangeArrayCtorArg: MutPtr,
    public var retainRangeCount: UInt,
    retainRangeArrayCtorArg: MutPtr,
) {
    public var oldFileName: Pcwstr = oldFileNameCtorArg
        internal set

    public var ignoreRangeArray: MutPtr = ignoreRangeArrayCtorArg
        internal set

    public var retainRangeArray: MutPtr = retainRangeArrayCtorArg
        internal set

    public constructor() : this(
        sizeOfThisStruct = 0u,
        oldFileNameCtorArg = ConstPtr(0L),
        ignoreRangeCount = 0u,
        ignoreRangeArrayCtorArg = MutPtr(0L),
        retainRangeCount = 0u,
        retainRangeArrayCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.sizeOfThisStruct

    public operator fun component2(): Pcwstr = this.oldFileName

    public operator fun component3(): UInt = this.ignoreRangeCount

    public operator fun component4(): MutPtr = this.ignoreRangeArray

    public operator fun component5(): UInt = this.retainRangeCount

    public operator fun component6(): MutPtr = this.retainRangeArray

    public fun copy(sizeOfThisStruct: UInt = this.sizeOfThisStruct, oldFileName: Pcwstr = this.oldFileName, ignoreRangeCount: UInt = this.ignoreRangeCount, ignoreRangeArray: MutPtr = this.ignoreRangeArray, retainRangeCount: UInt = this.retainRangeCount, retainRangeArray: MutPtr = this.retainRangeArray): PatchOldFileInfoW = PatchOldFileInfoW(sizeOfThisStruct = sizeOfThisStruct, oldFileNameCtorArg = oldFileName, ignoreRangeCount = ignoreRangeCount, ignoreRangeArrayCtorArg = ignoreRangeArray, retainRangeCount = retainRangeCount, retainRangeArrayCtorArg = retainRangeArray)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PatchOldFileInfoW) return false
        if (this.sizeOfThisStruct != other.sizeOfThisStruct) return false
        if (this.oldFileName != other.oldFileName) return false
        if (this.ignoreRangeCount != other.ignoreRangeCount) return false
        if (this.ignoreRangeArray != other.ignoreRangeArray) return false
        if (this.retainRangeCount != other.retainRangeCount) return false
        if (this.retainRangeArray != other.retainRangeArray) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfThisStruct.hashCode()
        result = 31 * result + this.oldFileName.hashCode()
        result = 31 * result + this.ignoreRangeCount.hashCode()
        result = 31 * result + this.ignoreRangeArray.hashCode()
        result = 31 * result + this.retainRangeCount.hashCode()
        result = 31 * result + this.retainRangeArray.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sizeOfThisStruct: UInt = 0u,
            oldFileName: Pcwstr = ConstPtr(0L),
            ignoreRangeCount: UInt = 0u,
            ignoreRangeArray: MutPtr = MutPtr(0L),
            retainRangeCount: UInt = 0u,
            retainRangeArray: MutPtr = MutPtr(0L),
        ): PatchOldFileInfoW =
            PatchOldFileInfoW(
                sizeOfThisStruct = sizeOfThisStruct,
                oldFileNameCtorArg = oldFileName,
                ignoreRangeCount = ignoreRangeCount,
                ignoreRangeArrayCtorArg = ignoreRangeArray,
                retainRangeCount = retainRangeCount,
                retainRangeArrayCtorArg = retainRangeArray,
            )
    }
}

public class PatchOptionData internal constructor(
    public var sizeOfThisStruct: UInt,
    public var symbolOptionFlags: UInt,
    newFileSymbolPathCtorArg: Pcstr,
    oldFileSymbolPathArrayCtorArg: ConstPtr,
    public var extendedOptionFlags: UInt,
    public var symLoadCallback: PpatchSymloadCallback,
    symLoadContextCtorArg: MutPtr,
    interleaveMapArrayCtorArg: MutPtr,
    public var maxLzxWindowSize: UInt,
) {
    public var newFileSymbolPath: Pcstr = newFileSymbolPathCtorArg
        internal set

    public var oldFileSymbolPathArray: ConstPtr = oldFileSymbolPathArrayCtorArg
        internal set

    public var symLoadContext: MutPtr = symLoadContextCtorArg
        internal set

    public var interleaveMapArray: MutPtr = interleaveMapArrayCtorArg
        internal set

    public constructor() : this(
        sizeOfThisStruct = 0u,
        symbolOptionFlags = 0u,
        newFileSymbolPathCtorArg = ConstPtr(0L),
        oldFileSymbolPathArrayCtorArg = ConstPtr(0L),
        extendedOptionFlags = 0u,
        symLoadCallback = null,
        symLoadContextCtorArg = MutPtr(0L),
        interleaveMapArrayCtorArg = MutPtr(0L),
        maxLzxWindowSize = 0u,
    )

    public operator fun component1(): UInt = this.sizeOfThisStruct

    public operator fun component2(): UInt = this.symbolOptionFlags

    public operator fun component3(): Pcstr = this.newFileSymbolPath

    public operator fun component4(): ConstPtr = this.oldFileSymbolPathArray

    public operator fun component5(): UInt = this.extendedOptionFlags

    public operator fun component6(): PpatchSymloadCallback = this.symLoadCallback

    public operator fun component7(): MutPtr = this.symLoadContext

    public operator fun component8(): MutPtr = this.interleaveMapArray

    public operator fun component9(): UInt = this.maxLzxWindowSize

    public fun copy(sizeOfThisStruct: UInt = this.sizeOfThisStruct, symbolOptionFlags: UInt = this.symbolOptionFlags, newFileSymbolPath: Pcstr = this.newFileSymbolPath, oldFileSymbolPathArray: ConstPtr = this.oldFileSymbolPathArray, extendedOptionFlags: UInt = this.extendedOptionFlags, symLoadCallback: PpatchSymloadCallback = this.symLoadCallback, symLoadContext: MutPtr = this.symLoadContext, interleaveMapArray: MutPtr = this.interleaveMapArray, maxLzxWindowSize: UInt = this.maxLzxWindowSize): PatchOptionData = PatchOptionData(sizeOfThisStruct = sizeOfThisStruct, symbolOptionFlags = symbolOptionFlags, newFileSymbolPathCtorArg = newFileSymbolPath, oldFileSymbolPathArrayCtorArg = oldFileSymbolPathArray, extendedOptionFlags = extendedOptionFlags, symLoadCallback = symLoadCallback, symLoadContextCtorArg = symLoadContext, interleaveMapArrayCtorArg = interleaveMapArray, maxLzxWindowSize = maxLzxWindowSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PatchOptionData) return false
        if (this.sizeOfThisStruct != other.sizeOfThisStruct) return false
        if (this.symbolOptionFlags != other.symbolOptionFlags) return false
        if (this.newFileSymbolPath != other.newFileSymbolPath) return false
        if (this.oldFileSymbolPathArray != other.oldFileSymbolPathArray) return false
        if (this.extendedOptionFlags != other.extendedOptionFlags) return false
        if (this.symLoadCallback != other.symLoadCallback) return false
        if (this.symLoadContext != other.symLoadContext) return false
        if (this.interleaveMapArray != other.interleaveMapArray) return false
        if (this.maxLzxWindowSize != other.maxLzxWindowSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfThisStruct.hashCode()
        result = 31 * result + this.symbolOptionFlags.hashCode()
        result = 31 * result + this.newFileSymbolPath.hashCode()
        result = 31 * result + this.oldFileSymbolPathArray.hashCode()
        result = 31 * result + this.extendedOptionFlags.hashCode()
        result = 31 * result + this.symLoadCallback.hashCode()
        result = 31 * result + this.symLoadContext.hashCode()
        result = 31 * result + this.interleaveMapArray.hashCode()
        result = 31 * result + this.maxLzxWindowSize.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sizeOfThisStruct: UInt = 0u,
            symbolOptionFlags: UInt = 0u,
            newFileSymbolPath: Pcstr = ConstPtr(0L),
            oldFileSymbolPathArray: ConstPtr = ConstPtr(0L),
            extendedOptionFlags: UInt = 0u,
            symLoadCallback: PpatchSymloadCallback = null,
            symLoadContext: MutPtr = MutPtr(0L),
            interleaveMapArray: MutPtr = MutPtr(0L),
            maxLzxWindowSize: UInt = 0u,
        ): PatchOptionData =
            PatchOptionData(
                sizeOfThisStruct = sizeOfThisStruct,
                symbolOptionFlags = symbolOptionFlags,
                newFileSymbolPathCtorArg = newFileSymbolPath,
                oldFileSymbolPathArrayCtorArg = oldFileSymbolPathArray,
                extendedOptionFlags = extendedOptionFlags,
                symLoadCallback = symLoadCallback,
                symLoadContextCtorArg = symLoadContext,
                interleaveMapArrayCtorArg = interleaveMapArray,
                maxLzxWindowSize = maxLzxWindowSize,
            )
    }
}

public data class PatchRetainRange(
    public var offsetInOldFile: UInt = 0u,
    public var lengthInBytes: UInt = 0u,
    public var offsetInNewFile: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PatchRetainRange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PatchRetainRange> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): PatchRetainRange =
                    PatchRetainRange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PatchRetainRange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.offsetInOldFile)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.lengthInBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.offsetInNewFile)
                }
            }
    }
}

public data class Pmsihandle(
    public var mH: Msihandle = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pmsihandle> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pmsihandle> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): Pmsihandle =
                    Pmsihandle(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Pmsihandle) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.mH)
                }
            }
    }
}

public data class PmApptasktype(
    public var productID: Guid = Guid(),
    public var taskType: PmTaskType = 0,
)

public class PmBsataskid internal constructor(
    public var productID: Guid,
    taskIDCtorArg: Bstr,
) {
    public var taskID: Bstr = taskIDCtorArg
        internal set

    public constructor() : this(
        productID = Guid(),
        taskIDCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Guid = this.productID

    public operator fun component2(): Bstr = this.taskID

    public fun copy(productID: Guid = this.productID, taskID: Bstr = this.taskID): PmBsataskid = PmBsataskid(productID = productID, taskIDCtorArg = taskID)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PmBsataskid) return false
        if (this.productID != other.productID) return false
        if (this.taskID != other.taskID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.productID.hashCode()
        result = 31 * result + this.taskID.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            productID: Guid = Guid(),
            taskID: Bstr = ConstPtr(0L),
        ): PmBsataskid =
            PmBsataskid(
                productID = productID,
                taskIDCtorArg = taskID,
            )
    }
}

public class PmBwtaskid internal constructor(
    public var productID: Guid,
    taskIDCtorArg: Bstr,
) {
    public var taskID: Bstr = taskIDCtorArg
        internal set

    public constructor() : this(
        productID = Guid(),
        taskIDCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Guid = this.productID

    public operator fun component2(): Bstr = this.taskID

    public fun copy(productID: Guid = this.productID, taskID: Bstr = this.taskID): PmBwtaskid = PmBwtaskid(productID = productID, taskIDCtorArg = taskID)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PmBwtaskid) return false
        if (this.productID != other.productID) return false
        if (this.taskID != other.taskID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.productID.hashCode()
        result = 31 * result + this.taskID.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            productID: Guid = Guid(),
            taskID: Bstr = ConstPtr(0L),
        ): PmBwtaskid =
            PmBwtaskid(
                productID = productID,
                taskIDCtorArg = taskID,
            )
    }
}

public data class PmEnumFilter(
    public var filterType: Int = 0,
    public var filterParameter: PmEnumFilter0 = PmEnumFilter0(),
)

public class PmEnumFilter0 internal constructor(
    public var dummy: Int,
    public var genre: PmAppGenre,
    public var appHubType: PmApplicationHubtype,
    public var hubType: PmTileHubtype,
    public var tasktype: PmTaskType,
    public var taskProductID: Guid,
    public var tileProductID: Guid,
    public var appTaskType: PmApptasktype,
    public var consumer: PmExtensionconsumer,
    public var bSATask: PmBsataskid,
    public var bSAProductID: Guid,
    public var bWTask: PmBwtaskid,
    protocolNameCtorArg: Bstr,
    fileTypeCtorArg: Bstr,
    contentTypeCtorArg: Bstr,
    public var appSupportedFileExtPID: Guid,
    shareTargetFileTypeCtorArg: Bstr,
) {
    public var protocolName: Bstr = protocolNameCtorArg
        internal set

    public var fileType: Bstr = fileTypeCtorArg
        internal set

    public var contentType: Bstr = contentTypeCtorArg
        internal set

    public var shareTargetFileType: Bstr = shareTargetFileTypeCtorArg
        internal set

    public constructor() : this(
        dummy = 0,
        genre = 0,
        appHubType = 0,
        hubType = 0,
        tasktype = 0,
        taskProductID = Guid(),
        tileProductID = Guid(),
        appTaskType = PmApptasktype(),
        consumer = PmExtensionconsumer(),
        bSATask = PmBsataskid(),
        bSAProductID = Guid(),
        bWTask = PmBwtaskid(),
        protocolNameCtorArg = ConstPtr(0L),
        fileTypeCtorArg = ConstPtr(0L),
        contentTypeCtorArg = ConstPtr(0L),
        appSupportedFileExtPID = Guid(),
        shareTargetFileTypeCtorArg = ConstPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            dummy: Int = 0,
            genre: PmAppGenre = 0,
            appHubType: PmApplicationHubtype = 0,
            hubType: PmTileHubtype = 0,
            tasktype: PmTaskType = 0,
            taskProductID: Guid = Guid(),
            tileProductID: Guid = Guid(),
            appTaskType: PmApptasktype = PmApptasktype(),
            consumer: PmExtensionconsumer = PmExtensionconsumer(),
            bSATask: PmBsataskid = PmBsataskid(),
            bSAProductID: Guid = Guid(),
            bWTask: PmBwtaskid = PmBwtaskid(),
            protocolName: Bstr = ConstPtr(0L),
            fileType: Bstr = ConstPtr(0L),
            contentType: Bstr = ConstPtr(0L),
            appSupportedFileExtPID: Guid = Guid(),
            shareTargetFileType: Bstr = ConstPtr(0L),
        ): PmEnumFilter0 =
            PmEnumFilter0(
                dummy = dummy,
                genre = genre,
                appHubType = appHubType,
                hubType = hubType,
                tasktype = tasktype,
                taskProductID = taskProductID,
                tileProductID = tileProductID,
                appTaskType = appTaskType,
                consumer = consumer,
                bSATask = bSATask,
                bSAProductID = bSAProductID,
                bWTask = bWTask,
                protocolNameCtorArg = protocolName,
                fileTypeCtorArg = fileType,
                contentTypeCtorArg = contentType,
                appSupportedFileExtPID = appSupportedFileExtPID,
                shareTargetFileTypeCtorArg = shareTargetFileType,
            )
    }
}

public class PmExtensionconsumer internal constructor(
    public var consumerPID: Guid,
    extensionIDCtorArg: Bstr,
) {
    public var extensionID: Bstr = extensionIDCtorArg
        internal set

    public constructor() : this(
        consumerPID = Guid(),
        extensionIDCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Guid = this.consumerPID

    public operator fun component2(): Bstr = this.extensionID

    public fun copy(consumerPID: Guid = this.consumerPID, extensionID: Bstr = this.extensionID): PmExtensionconsumer = PmExtensionconsumer(consumerPID = consumerPID, extensionIDCtorArg = extensionID)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PmExtensionconsumer) return false
        if (this.consumerPID != other.consumerPID) return false
        if (this.extensionID != other.extensionID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.consumerPID.hashCode()
        result = 31 * result + this.extensionID.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            consumerPID: Guid = Guid(),
            extensionID: Bstr = ConstPtr(0L),
        ): PmExtensionconsumer =
            PmExtensionconsumer(
                consumerPID = consumerPID,
                extensionIDCtorArg = extensionID,
            )
    }
}

public class PmInstallinfo internal constructor(
    public var productID: Guid,
    packagePathCtorArg: Bstr,
    public var instanceID: Guid,
    pbLicenseCtorArg: MutPtr,
    public var cbLicense: UInt,
    public var isUninstallDisabled: Bool,
    public var deploymentOptions: UInt,
    public var offerID: Guid,
    marketplaceAppVersionCtorArg: Bstr,
) {
    public var packagePath: Bstr = packagePathCtorArg
        internal set

    public var pbLicense: MutPtr = pbLicenseCtorArg
        internal set

    public var marketplaceAppVersion: Bstr = marketplaceAppVersionCtorArg
        internal set

    public constructor() : this(
        productID = Guid(),
        packagePathCtorArg = ConstPtr(0L),
        instanceID = Guid(),
        pbLicenseCtorArg = MutPtr(0L),
        cbLicense = 0u,
        isUninstallDisabled = 0,
        deploymentOptions = 0u,
        offerID = Guid(),
        marketplaceAppVersionCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Guid = this.productID

    public operator fun component2(): Bstr = this.packagePath

    public operator fun component3(): Guid = this.instanceID

    public operator fun component4(): MutPtr = this.pbLicense

    public operator fun component5(): UInt = this.cbLicense

    public operator fun component6(): Bool = this.isUninstallDisabled

    public operator fun component7(): UInt = this.deploymentOptions

    public operator fun component8(): Guid = this.offerID

    public operator fun component9(): Bstr = this.marketplaceAppVersion

    public fun copy(productID: Guid = this.productID, packagePath: Bstr = this.packagePath, instanceID: Guid = this.instanceID, pbLicense: MutPtr = this.pbLicense, cbLicense: UInt = this.cbLicense, isUninstallDisabled: Bool = this.isUninstallDisabled, deploymentOptions: UInt = this.deploymentOptions, offerID: Guid = this.offerID, marketplaceAppVersion: Bstr = this.marketplaceAppVersion): PmInstallinfo = PmInstallinfo(productID = productID, packagePathCtorArg = packagePath, instanceID = instanceID, pbLicenseCtorArg = pbLicense, cbLicense = cbLicense, isUninstallDisabled = isUninstallDisabled, deploymentOptions = deploymentOptions, offerID = offerID, marketplaceAppVersionCtorArg = marketplaceAppVersion)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PmInstallinfo) return false
        if (this.productID != other.productID) return false
        if (this.packagePath != other.packagePath) return false
        if (this.instanceID != other.instanceID) return false
        if (this.pbLicense != other.pbLicense) return false
        if (this.cbLicense != other.cbLicense) return false
        if (this.isUninstallDisabled != other.isUninstallDisabled) return false
        if (this.deploymentOptions != other.deploymentOptions) return false
        if (this.offerID != other.offerID) return false
        if (this.marketplaceAppVersion != other.marketplaceAppVersion) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.productID.hashCode()
        result = 31 * result + this.packagePath.hashCode()
        result = 31 * result + this.instanceID.hashCode()
        result = 31 * result + this.pbLicense.hashCode()
        result = 31 * result + this.cbLicense.hashCode()
        result = 31 * result + this.isUninstallDisabled.hashCode()
        result = 31 * result + this.deploymentOptions.hashCode()
        result = 31 * result + this.offerID.hashCode()
        result = 31 * result + this.marketplaceAppVersion.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            productID: Guid = Guid(),
            packagePath: Bstr = ConstPtr(0L),
            instanceID: Guid = Guid(),
            pbLicense: MutPtr = MutPtr(0L),
            cbLicense: UInt = 0u,
            isUninstallDisabled: Bool = 0,
            deploymentOptions: UInt = 0u,
            offerID: Guid = Guid(),
            marketplaceAppVersion: Bstr = ConstPtr(0L),
        ): PmInstallinfo =
            PmInstallinfo(
                productID = productID,
                packagePathCtorArg = packagePath,
                instanceID = instanceID,
                pbLicenseCtorArg = pbLicense,
                cbLicense = cbLicense,
                isUninstallDisabled = isUninstallDisabled,
                deploymentOptions = deploymentOptions,
                offerID = offerID,
                marketplaceAppVersionCtorArg = marketplaceAppVersion,
            )
    }
}

public class PmInvocationinfo internal constructor(
    uRIBaseOrAUMIDCtorArg: Bstr,
    uRIFragmentOrArgsCtorArg: Bstr,
) {
    public var uRIBaseOrAUMID: Bstr = uRIBaseOrAUMIDCtorArg
        internal set

    public var uRIFragmentOrArgs: Bstr = uRIFragmentOrArgsCtorArg
        internal set

    public constructor() : this(
        uRIBaseOrAUMIDCtorArg = ConstPtr(0L),
        uRIFragmentOrArgsCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Bstr = this.uRIBaseOrAUMID

    public operator fun component2(): Bstr = this.uRIFragmentOrArgs

    public fun copy(uRIBaseOrAUMID: Bstr = this.uRIBaseOrAUMID, uRIFragmentOrArgs: Bstr = this.uRIFragmentOrArgs): PmInvocationinfo = PmInvocationinfo(uRIBaseOrAUMIDCtorArg = uRIBaseOrAUMID, uRIFragmentOrArgsCtorArg = uRIFragmentOrArgs)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PmInvocationinfo) return false
        if (this.uRIBaseOrAUMID != other.uRIBaseOrAUMID) return false
        if (this.uRIFragmentOrArgs != other.uRIFragmentOrArgs) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uRIBaseOrAUMID.hashCode()
        result = 31 * result + this.uRIFragmentOrArgs.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            uRIBaseOrAUMID: Bstr = ConstPtr(0L),
            uRIFragmentOrArgs: Bstr = ConstPtr(0L),
        ): PmInvocationinfo =
            PmInvocationinfo(
                uRIBaseOrAUMIDCtorArg = uRIBaseOrAUMID,
                uRIFragmentOrArgsCtorArg = uRIFragmentOrArgs,
            )
    }
}

public class PmStartappblob internal constructor(
    public var cbSize: UInt,
    public var productID: Guid,
    appTitleCtorArg: Bstr,
    iconPathCtorArg: Bstr,
    public var isUninstallable: Bool,
    public var appInstallType: PmApplicationInstallType,
    public var instanceID: Guid,
    public var state: PmApplicationState,
    public var isModern: Bool,
    public var isModernLightUp: Bool,
    public var lightUpSupportMask: UShort,
) {
    public var appTitle: Bstr = appTitleCtorArg
        internal set

    public var iconPath: Bstr = iconPathCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        productID = Guid(),
        appTitleCtorArg = ConstPtr(0L),
        iconPathCtorArg = ConstPtr(0L),
        isUninstallable = 0,
        appInstallType = 0,
        instanceID = Guid(),
        state = 0,
        isModern = 0,
        isModernLightUp = 0,
        lightUpSupportMask = 0u,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Guid = this.productID

    public operator fun component3(): Bstr = this.appTitle

    public operator fun component4(): Bstr = this.iconPath

    public operator fun component5(): Bool = this.isUninstallable

    public operator fun component6(): PmApplicationInstallType = this.appInstallType

    public operator fun component7(): Guid = this.instanceID

    public operator fun component8(): PmApplicationState = this.state

    public operator fun component9(): Bool = this.isModern

    public operator fun component10(): Bool = this.isModernLightUp

    public operator fun component11(): UShort = this.lightUpSupportMask

    public fun copy(cbSize: UInt = this.cbSize, productID: Guid = this.productID, appTitle: Bstr = this.appTitle, iconPath: Bstr = this.iconPath, isUninstallable: Bool = this.isUninstallable, appInstallType: PmApplicationInstallType = this.appInstallType, instanceID: Guid = this.instanceID, state: PmApplicationState = this.state, isModern: Bool = this.isModern, isModernLightUp: Bool = this.isModernLightUp, lightUpSupportMask: UShort = this.lightUpSupportMask): PmStartappblob = PmStartappblob(cbSize = cbSize, productID = productID, appTitleCtorArg = appTitle, iconPathCtorArg = iconPath, isUninstallable = isUninstallable, appInstallType = appInstallType, instanceID = instanceID, state = state, isModern = isModern, isModernLightUp = isModernLightUp, lightUpSupportMask = lightUpSupportMask)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PmStartappblob) return false
        if (this.cbSize != other.cbSize) return false
        if (this.productID != other.productID) return false
        if (this.appTitle != other.appTitle) return false
        if (this.iconPath != other.iconPath) return false
        if (this.isUninstallable != other.isUninstallable) return false
        if (this.appInstallType != other.appInstallType) return false
        if (this.instanceID != other.instanceID) return false
        if (this.state != other.state) return false
        if (this.isModern != other.isModern) return false
        if (this.isModernLightUp != other.isModernLightUp) return false
        if (this.lightUpSupportMask != other.lightUpSupportMask) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.productID.hashCode()
        result = 31 * result + this.appTitle.hashCode()
        result = 31 * result + this.iconPath.hashCode()
        result = 31 * result + this.isUninstallable.hashCode()
        result = 31 * result + this.appInstallType.hashCode()
        result = 31 * result + this.instanceID.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.isModern.hashCode()
        result = 31 * result + this.isModernLightUp.hashCode()
        result = 31 * result + this.lightUpSupportMask.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            productID: Guid = Guid(),
            appTitle: Bstr = ConstPtr(0L),
            iconPath: Bstr = ConstPtr(0L),
            isUninstallable: Bool = 0,
            appInstallType: PmApplicationInstallType = 0,
            instanceID: Guid = Guid(),
            state: PmApplicationState = 0,
            isModern: Bool = 0,
            isModernLightUp: Bool = 0,
            lightUpSupportMask: UShort = 0u,
        ): PmStartappblob =
            PmStartappblob(
                cbSize = cbSize,
                productID = productID,
                appTitleCtorArg = appTitle,
                iconPathCtorArg = iconPath,
                isUninstallable = isUninstallable,
                appInstallType = appInstallType,
                instanceID = instanceID,
                state = state,
                isModern = isModern,
                isModernLightUp = isModernLightUp,
                lightUpSupportMask = lightUpSupportMask,
            )
    }
}

public class PmStarttileblob internal constructor(
    public var cbSize: UInt,
    public var productID: Guid,
    tileIDCtorArg: Bstr,
    public var templateType: TileTemplateType,
    public var hubPosition: UIntArray,
    public var hubVisibilityBitmask: UInt,
    public var isDefault: Bool,
    public var tileType: PmStarttileType,
    pbPropBlobCtorArg: MutPtr,
    public var cbPropBlob: UInt,
    public var isRestoring: Bool,
    public var isModern: Bool,
    public var invocationInfo: PmInvocationinfo,
) {
    public var tileID: Bstr = tileIDCtorArg
        internal set

    public var pbPropBlob: MutPtr = pbPropBlobCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        productID = Guid(),
        tileIDCtorArg = ConstPtr(0L),
        templateType = 0,
        hubPosition = UIntArray(32),
        hubVisibilityBitmask = 0u,
        isDefault = 0,
        tileType = 0,
        pbPropBlobCtorArg = MutPtr(0L),
        cbPropBlob = 0u,
        isRestoring = 0,
        isModern = 0,
        invocationInfo = PmInvocationinfo(),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Guid = this.productID

    public operator fun component3(): Bstr = this.tileID

    public operator fun component4(): TileTemplateType = this.templateType

    public operator fun component5(): UIntArray = this.hubPosition

    public operator fun component6(): UInt = this.hubVisibilityBitmask

    public operator fun component7(): Bool = this.isDefault

    public operator fun component8(): PmStarttileType = this.tileType

    public operator fun component9(): MutPtr = this.pbPropBlob

    public operator fun component10(): UInt = this.cbPropBlob

    public operator fun component11(): Bool = this.isRestoring

    public operator fun component12(): Bool = this.isModern

    public operator fun component13(): PmInvocationinfo = this.invocationInfo

    public fun copy(cbSize: UInt = this.cbSize, productID: Guid = this.productID, tileID: Bstr = this.tileID, templateType: TileTemplateType = this.templateType, hubPosition: UIntArray = this.hubPosition, hubVisibilityBitmask: UInt = this.hubVisibilityBitmask, isDefault: Bool = this.isDefault, tileType: PmStarttileType = this.tileType, pbPropBlob: MutPtr = this.pbPropBlob, cbPropBlob: UInt = this.cbPropBlob, isRestoring: Bool = this.isRestoring, isModern: Bool = this.isModern, invocationInfo: PmInvocationinfo = this.invocationInfo): PmStarttileblob = PmStarttileblob(cbSize = cbSize, productID = productID, tileIDCtorArg = tileID, templateType = templateType, hubPosition = hubPosition, hubVisibilityBitmask = hubVisibilityBitmask, isDefault = isDefault, tileType = tileType, pbPropBlobCtorArg = pbPropBlob, cbPropBlob = cbPropBlob, isRestoring = isRestoring, isModern = isModern, invocationInfo = invocationInfo)

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

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            productID: Guid = Guid(),
            tileID: Bstr = ConstPtr(0L),
            templateType: TileTemplateType = 0,
            hubPosition: UIntArray = UIntArray(32),
            hubVisibilityBitmask: UInt = 0u,
            isDefault: Bool = 0,
            tileType: PmStarttileType = 0,
            pbPropBlob: MutPtr = MutPtr(0L),
            cbPropBlob: UInt = 0u,
            isRestoring: Bool = 0,
            isModern: Bool = 0,
            invocationInfo: PmInvocationinfo = PmInvocationinfo(),
        ): PmStarttileblob =
            PmStarttileblob(
                cbSize = cbSize,
                productID = productID,
                tileIDCtorArg = tileID,
                templateType = templateType,
                hubPosition = hubPosition,
                hubVisibilityBitmask = hubVisibilityBitmask,
                isDefault = isDefault,
                tileType = tileType,
                pbPropBlobCtorArg = pbPropBlob,
                cbPropBlob = cbPropBlob,
                isRestoring = isRestoring,
                isModern = isModern,
                invocationInfo = invocationInfo,
            )
    }
}

public class PmUpdateinfo internal constructor(
    public var productID: Guid,
    packagePathCtorArg: Bstr,
    public var instanceID: Guid,
    pbLicenseCtorArg: MutPtr,
    public var cbLicense: UInt,
    marketplaceAppVersionCtorArg: Bstr,
    public var deploymentOptions: UInt,
) {
    public var packagePath: Bstr = packagePathCtorArg
        internal set

    public var pbLicense: MutPtr = pbLicenseCtorArg
        internal set

    public var marketplaceAppVersion: Bstr = marketplaceAppVersionCtorArg
        internal set

    public constructor() : this(
        productID = Guid(),
        packagePathCtorArg = ConstPtr(0L),
        instanceID = Guid(),
        pbLicenseCtorArg = MutPtr(0L),
        cbLicense = 0u,
        marketplaceAppVersionCtorArg = ConstPtr(0L),
        deploymentOptions = 0u,
    )

    public operator fun component1(): Guid = this.productID

    public operator fun component2(): Bstr = this.packagePath

    public operator fun component3(): Guid = this.instanceID

    public operator fun component4(): MutPtr = this.pbLicense

    public operator fun component5(): UInt = this.cbLicense

    public operator fun component6(): Bstr = this.marketplaceAppVersion

    public operator fun component7(): UInt = this.deploymentOptions

    public fun copy(productID: Guid = this.productID, packagePath: Bstr = this.packagePath, instanceID: Guid = this.instanceID, pbLicense: MutPtr = this.pbLicense, cbLicense: UInt = this.cbLicense, marketplaceAppVersion: Bstr = this.marketplaceAppVersion, deploymentOptions: UInt = this.deploymentOptions): PmUpdateinfo = PmUpdateinfo(productID = productID, packagePathCtorArg = packagePath, instanceID = instanceID, pbLicenseCtorArg = pbLicense, cbLicense = cbLicense, marketplaceAppVersionCtorArg = marketplaceAppVersion, deploymentOptions = deploymentOptions)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PmUpdateinfo) return false
        if (this.productID != other.productID) return false
        if (this.packagePath != other.packagePath) return false
        if (this.instanceID != other.instanceID) return false
        if (this.pbLicense != other.pbLicense) return false
        if (this.cbLicense != other.cbLicense) return false
        if (this.marketplaceAppVersion != other.marketplaceAppVersion) return false
        if (this.deploymentOptions != other.deploymentOptions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.productID.hashCode()
        result = 31 * result + this.packagePath.hashCode()
        result = 31 * result + this.instanceID.hashCode()
        result = 31 * result + this.pbLicense.hashCode()
        result = 31 * result + this.cbLicense.hashCode()
        result = 31 * result + this.marketplaceAppVersion.hashCode()
        result = 31 * result + this.deploymentOptions.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            productID: Guid = Guid(),
            packagePath: Bstr = ConstPtr(0L),
            instanceID: Guid = Guid(),
            pbLicense: MutPtr = MutPtr(0L),
            cbLicense: UInt = 0u,
            marketplaceAppVersion: Bstr = ConstPtr(0L),
            deploymentOptions: UInt = 0u,
        ): PmUpdateinfo =
            PmUpdateinfo(
                productID = productID,
                packagePathCtorArg = packagePath,
                instanceID = instanceID,
                pbLicenseCtorArg = pbLicense,
                cbLicense = cbLicense,
                marketplaceAppVersionCtorArg = marketplaceAppVersion,
                deploymentOptions = deploymentOptions,
            )
    }
}

public class PmUpdateinfoLegacy internal constructor(
    public var productID: Guid,
    packagePathCtorArg: Bstr,
    public var instanceID: Guid,
    pbLicenseCtorArg: MutPtr,
    public var cbLicense: UInt,
    marketplaceAppVersionCtorArg: Bstr,
) {
    public var packagePath: Bstr = packagePathCtorArg
        internal set

    public var pbLicense: MutPtr = pbLicenseCtorArg
        internal set

    public var marketplaceAppVersion: Bstr = marketplaceAppVersionCtorArg
        internal set

    public constructor() : this(
        productID = Guid(),
        packagePathCtorArg = ConstPtr(0L),
        instanceID = Guid(),
        pbLicenseCtorArg = MutPtr(0L),
        cbLicense = 0u,
        marketplaceAppVersionCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Guid = this.productID

    public operator fun component2(): Bstr = this.packagePath

    public operator fun component3(): Guid = this.instanceID

    public operator fun component4(): MutPtr = this.pbLicense

    public operator fun component5(): UInt = this.cbLicense

    public operator fun component6(): Bstr = this.marketplaceAppVersion

    public fun copy(productID: Guid = this.productID, packagePath: Bstr = this.packagePath, instanceID: Guid = this.instanceID, pbLicense: MutPtr = this.pbLicense, cbLicense: UInt = this.cbLicense, marketplaceAppVersion: Bstr = this.marketplaceAppVersion): PmUpdateinfoLegacy = PmUpdateinfoLegacy(productID = productID, packagePathCtorArg = packagePath, instanceID = instanceID, pbLicenseCtorArg = pbLicense, cbLicense = cbLicense, marketplaceAppVersionCtorArg = marketplaceAppVersion)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PmUpdateinfoLegacy) return false
        if (this.productID != other.productID) return false
        if (this.packagePath != other.packagePath) return false
        if (this.instanceID != other.instanceID) return false
        if (this.pbLicense != other.pbLicense) return false
        if (this.cbLicense != other.cbLicense) return false
        if (this.marketplaceAppVersion != other.marketplaceAppVersion) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.productID.hashCode()
        result = 31 * result + this.packagePath.hashCode()
        result = 31 * result + this.instanceID.hashCode()
        result = 31 * result + this.pbLicense.hashCode()
        result = 31 * result + this.cbLicense.hashCode()
        result = 31 * result + this.marketplaceAppVersion.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            productID: Guid = Guid(),
            packagePath: Bstr = ConstPtr(0L),
            instanceID: Guid = Guid(),
            pbLicense: MutPtr = MutPtr(0L),
            cbLicense: UInt = 0u,
            marketplaceAppVersion: Bstr = ConstPtr(0L),
        ): PmUpdateinfoLegacy =
            PmUpdateinfoLegacy(
                productID = productID,
                packagePathCtorArg = packagePath,
                instanceID = instanceID,
                pbLicenseCtorArg = pbLicense,
                cbLicense = cbLicense,
                marketplaceAppVersionCtorArg = marketplaceAppVersion,
            )
    }
}

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProtectedFileData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProtectedFileData> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 524L
                override fun readNative(addr: Long): ProtectedFileData =
                    ProtectedFileData(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 520L),
                    )
                override fun writeNative(addr: Long, value: ProtectedFileData) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr, value.fileName.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 520L, value.fileNumber)
                }
            }
    }
}
