package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.security.Sid
import io.github.kotlinmania.windowssys.windows.win32.security.SidAndAttributes

public class FwDynamicKeywordAddress0 internal constructor(
    public var id: Guid,
    keywordCtorArg: Pcwstr,
    public var flags: UInt,
    addressesCtorArg: Pcwstr,
) {
    public var keyword: Pcwstr = keywordCtorArg
        internal set

    public var addresses: Pcwstr = addressesCtorArg
        internal set

    public constructor() : this(
        id = Guid(),
        keywordCtorArg = ConstPtr(0L),
        flags = 0u,
        addressesCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Guid = this.id

    public operator fun component2(): Pcwstr = this.keyword

    public operator fun component3(): UInt = this.flags

    public operator fun component4(): Pcwstr = this.addresses

    public fun copy(id: Guid = this.id, keyword: Pcwstr = this.keyword, flags: UInt = this.flags, addresses: Pcwstr = this.addresses): FwDynamicKeywordAddress0 = FwDynamicKeywordAddress0(id = id, keywordCtorArg = keyword, flags = flags, addressesCtorArg = addresses)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwDynamicKeywordAddress0) return false
        if (this.id != other.id) return false
        if (this.keyword != other.keyword) return false
        if (this.flags != other.flags) return false
        if (this.addresses != other.addresses) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.id.hashCode()
        result = 31 * result + this.keyword.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.addresses.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            id: Guid = Guid(),
            keyword: Pcwstr = ConstPtr(0L),
            flags: UInt = 0u,
            addresses: Pcwstr = ConstPtr(0L),
        ): FwDynamicKeywordAddress0 =
            FwDynamicKeywordAddress0(
                id = id,
                keywordCtorArg = keyword,
                flags = flags,
                addressesCtorArg = addresses,
            )
    }
}

public class FwDynamicKeywordAddressData0 internal constructor(
    public var dynamicKeywordAddress: FwDynamicKeywordAddress0,
    nextCtorArg: MutPtr<FwDynamicKeywordAddressData0>,
    public var schemaVersion: UShort,
    public var originType: FwDynamicKeywordOriginType,
) {
    public var next: MutPtr<FwDynamicKeywordAddressData0> = nextCtorArg
        internal set

    public constructor() : this(
        dynamicKeywordAddress = FwDynamicKeywordAddress0(),
        nextCtorArg = MutPtr(0L),
        schemaVersion = 0u,
        originType = 0,
    )

    public operator fun component1(): FwDynamicKeywordAddress0 = this.dynamicKeywordAddress

    public operator fun component2(): MutPtr<FwDynamicKeywordAddressData0> = this.next

    public operator fun component3(): UShort = this.schemaVersion

    public operator fun component4(): FwDynamicKeywordOriginType = this.originType

    public fun copy(dynamicKeywordAddress: FwDynamicKeywordAddress0 = this.dynamicKeywordAddress, next: MutPtr<FwDynamicKeywordAddressData0> = this.next, schemaVersion: UShort = this.schemaVersion, originType: FwDynamicKeywordOriginType = this.originType): FwDynamicKeywordAddressData0 = FwDynamicKeywordAddressData0(dynamicKeywordAddress = dynamicKeywordAddress, nextCtorArg = next, schemaVersion = schemaVersion, originType = originType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwDynamicKeywordAddressData0) return false
        if (this.dynamicKeywordAddress != other.dynamicKeywordAddress) return false
        if (this.next != other.next) return false
        if (this.schemaVersion != other.schemaVersion) return false
        if (this.originType != other.originType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dynamicKeywordAddress.hashCode()
        result = 31 * result + this.next.hashCode()
        result = 31 * result + this.schemaVersion.hashCode()
        result = 31 * result + this.originType.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dynamicKeywordAddress: FwDynamicKeywordAddress0 = FwDynamicKeywordAddress0(),
            next: MutPtr<FwDynamicKeywordAddressData0> = MutPtr(0L),
            schemaVersion: UShort = 0u,
            originType: FwDynamicKeywordOriginType = 0,
        ): FwDynamicKeywordAddressData0 =
            FwDynamicKeywordAddressData0(
                dynamicKeywordAddress = dynamicKeywordAddress,
                nextCtorArg = next,
                schemaVersion = schemaVersion,
                originType = originType,
            )
    }
}

public class InetFirewallAcBinaries internal constructor(
    public var count: UInt,
    binariesCtorArg: MutPtr<Pwstr>,
) {
    public var binaries: MutPtr<Pwstr> = binariesCtorArg
        internal set

    public constructor() : this(
        count = 0u,
        binariesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.count

    public operator fun component2(): MutPtr<Pwstr> = this.binaries

    public fun copy(count: UInt = this.count, binaries: MutPtr<Pwstr> = this.binaries): InetFirewallAcBinaries = InetFirewallAcBinaries(count = count, binariesCtorArg = binaries)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InetFirewallAcBinaries) return false
        if (this.count != other.count) return false
        if (this.binaries != other.binaries) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.count.hashCode()
        result = 31 * result + this.binaries.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InetFirewallAcBinaries> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InetFirewallAcBinaries> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): InetFirewallAcBinaries =
                    InetFirewallAcBinaries(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Pwstr>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: InetFirewallAcBinaries) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.count)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Pwstr>(64)
                    ).writeNative(addr + 8L, value.binaries)
                }
            }

        public operator fun invoke(
            count: UInt = 0u,
            binaries: MutPtr<Pwstr> = MutPtr(0L),
        ): InetFirewallAcBinaries =
            InetFirewallAcBinaries(
                count = count,
                binariesCtorArg = binaries,
            )
    }
}

public class InetFirewallAcCapabilities internal constructor(
    public var count: UInt,
    capabilitiesCtorArg: MutPtr<SidAndAttributes>,
) {
    public var capabilities: MutPtr<SidAndAttributes> = capabilitiesCtorArg
        internal set

    public constructor() : this(
        count = 0u,
        capabilitiesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.count

    public operator fun component2(): MutPtr<SidAndAttributes> = this.capabilities

    public fun copy(count: UInt = this.count, capabilities: MutPtr<SidAndAttributes> = this.capabilities): InetFirewallAcCapabilities = InetFirewallAcCapabilities(count = count, capabilitiesCtorArg = capabilities)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InetFirewallAcCapabilities) return false
        if (this.count != other.count) return false
        if (this.capabilities != other.capabilities) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.count.hashCode()
        result = 31 * result + this.capabilities.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InetFirewallAcCapabilities> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InetFirewallAcCapabilities> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): InetFirewallAcCapabilities =
                    InetFirewallAcCapabilities(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<SidAndAttributes>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: InetFirewallAcCapabilities) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.count)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<SidAndAttributes>(64)
                    ).writeNative(addr + 8L, value.capabilities)
                }
            }

        public operator fun invoke(
            count: UInt = 0u,
            capabilities: MutPtr<SidAndAttributes> = MutPtr(0L),
        ): InetFirewallAcCapabilities =
            InetFirewallAcCapabilities(
                count = count,
                capabilitiesCtorArg = capabilities,
            )
    }
}

public class InetFirewallAcChange internal constructor(
    public var changeType: InetFirewallAcChangeType,
    public var createType: InetFirewallAcCreationType,
    appContainerSidCtorArg: MutPtr<Sid>,
    userSidCtorArg: MutPtr<Sid>,
    displayNameCtorArg: Pwstr,
    public var anonymous: InetFirewallAcChange0,
) {
    public var appContainerSid: MutPtr<Sid> = appContainerSidCtorArg
        internal set

    public var userSid: MutPtr<Sid> = userSidCtorArg
        internal set

    public var displayName: Pwstr = displayNameCtorArg
        internal set

    public constructor() : this(
        changeType = 0,
        createType = 0,
        appContainerSidCtorArg = MutPtr(0L),
        userSidCtorArg = MutPtr(0L),
        displayNameCtorArg = MutPtr(0L),
        anonymous = InetFirewallAcChange0(),
    )

    public operator fun component1(): InetFirewallAcChangeType = this.changeType

    public operator fun component2(): InetFirewallAcCreationType = this.createType

    public operator fun component3(): MutPtr<Sid> = this.appContainerSid

    public operator fun component4(): MutPtr<Sid> = this.userSid

    public operator fun component5(): Pwstr = this.displayName

    public operator fun component6(): InetFirewallAcChange0 = this.anonymous

    public fun copy(changeType: InetFirewallAcChangeType = this.changeType, createType: InetFirewallAcCreationType = this.createType, appContainerSid: MutPtr<Sid> = this.appContainerSid, userSid: MutPtr<Sid> = this.userSid, displayName: Pwstr = this.displayName, anonymous: InetFirewallAcChange0 = this.anonymous): InetFirewallAcChange = InetFirewallAcChange(changeType = changeType, createType = createType, appContainerSidCtorArg = appContainerSid, userSidCtorArg = userSid, displayNameCtorArg = displayName, anonymous = anonymous)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InetFirewallAcChange) return false
        if (this.changeType != other.changeType) return false
        if (this.createType != other.createType) return false
        if (this.appContainerSid != other.appContainerSid) return false
        if (this.userSid != other.userSid) return false
        if (this.displayName != other.displayName) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.changeType.hashCode()
        result = 31 * result + this.createType.hashCode()
        result = 31 * result + this.appContainerSid.hashCode()
        result = 31 * result + this.userSid.hashCode()
        result = 31 * result + this.displayName.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            changeType: InetFirewallAcChangeType = 0,
            createType: InetFirewallAcCreationType = 0,
            appContainerSid: MutPtr<Sid> = MutPtr(0L),
            userSid: MutPtr<Sid> = MutPtr(0L),
            displayName: Pwstr = MutPtr(0L),
            anonymous: InetFirewallAcChange0 = InetFirewallAcChange0(),
        ): InetFirewallAcChange =
            InetFirewallAcChange(
                changeType = changeType,
                createType = createType,
                appContainerSidCtorArg = appContainerSid,
                userSidCtorArg = userSid,
                displayNameCtorArg = displayName,
                anonymous = anonymous,
            )
    }
}

public data class InetFirewallAcChange0(
    public var capabilities: InetFirewallAcCapabilities = InetFirewallAcCapabilities(),
    public var binaries: InetFirewallAcBinaries = InetFirewallAcBinaries(),
)

public class InetFirewallAppContainer internal constructor(
    appContainerSidCtorArg: MutPtr<Sid>,
    userSidCtorArg: MutPtr<Sid>,
    appContainerNameCtorArg: Pwstr,
    displayNameCtorArg: Pwstr,
    descriptionCtorArg: Pwstr,
    public var capabilities: InetFirewallAcCapabilities,
    public var binaries: InetFirewallAcBinaries,
    workingDirectoryCtorArg: Pwstr,
    packageFullNameCtorArg: Pwstr,
) {
    public var appContainerSid: MutPtr<Sid> = appContainerSidCtorArg
        internal set

    public var userSid: MutPtr<Sid> = userSidCtorArg
        internal set

    public var appContainerName: Pwstr = appContainerNameCtorArg
        internal set

    public var displayName: Pwstr = displayNameCtorArg
        internal set

    public var description: Pwstr = descriptionCtorArg
        internal set

    public var workingDirectory: Pwstr = workingDirectoryCtorArg
        internal set

    public var packageFullName: Pwstr = packageFullNameCtorArg
        internal set

    public constructor() : this(
        appContainerSidCtorArg = MutPtr(0L),
        userSidCtorArg = MutPtr(0L),
        appContainerNameCtorArg = MutPtr(0L),
        displayNameCtorArg = MutPtr(0L),
        descriptionCtorArg = MutPtr(0L),
        capabilities = InetFirewallAcCapabilities(),
        binaries = InetFirewallAcBinaries(),
        workingDirectoryCtorArg = MutPtr(0L),
        packageFullNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Sid> = this.appContainerSid

    public operator fun component2(): MutPtr<Sid> = this.userSid

    public operator fun component3(): Pwstr = this.appContainerName

    public operator fun component4(): Pwstr = this.displayName

    public operator fun component5(): Pwstr = this.description

    public operator fun component6(): InetFirewallAcCapabilities = this.capabilities

    public operator fun component7(): InetFirewallAcBinaries = this.binaries

    public operator fun component8(): Pwstr = this.workingDirectory

    public operator fun component9(): Pwstr = this.packageFullName

    public fun copy(appContainerSid: MutPtr<Sid> = this.appContainerSid, userSid: MutPtr<Sid> = this.userSid, appContainerName: Pwstr = this.appContainerName, displayName: Pwstr = this.displayName, description: Pwstr = this.description, capabilities: InetFirewallAcCapabilities = this.capabilities, binaries: InetFirewallAcBinaries = this.binaries, workingDirectory: Pwstr = this.workingDirectory, packageFullName: Pwstr = this.packageFullName): InetFirewallAppContainer = InetFirewallAppContainer(appContainerSidCtorArg = appContainerSid, userSidCtorArg = userSid, appContainerNameCtorArg = appContainerName, displayNameCtorArg = displayName, descriptionCtorArg = description, capabilities = capabilities, binaries = binaries, workingDirectoryCtorArg = workingDirectory, packageFullNameCtorArg = packageFullName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InetFirewallAppContainer) return false
        if (this.appContainerSid != other.appContainerSid) return false
        if (this.userSid != other.userSid) return false
        if (this.appContainerName != other.appContainerName) return false
        if (this.displayName != other.displayName) return false
        if (this.description != other.description) return false
        if (this.capabilities != other.capabilities) return false
        if (this.binaries != other.binaries) return false
        if (this.workingDirectory != other.workingDirectory) return false
        if (this.packageFullName != other.packageFullName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.appContainerSid.hashCode()
        result = 31 * result + this.userSid.hashCode()
        result = 31 * result + this.appContainerName.hashCode()
        result = 31 * result + this.displayName.hashCode()
        result = 31 * result + this.description.hashCode()
        result = 31 * result + this.capabilities.hashCode()
        result = 31 * result + this.binaries.hashCode()
        result = 31 * result + this.workingDirectory.hashCode()
        result = 31 * result + this.packageFullName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            appContainerSid: MutPtr<Sid> = MutPtr(0L),
            userSid: MutPtr<Sid> = MutPtr(0L),
            appContainerName: Pwstr = MutPtr(0L),
            displayName: Pwstr = MutPtr(0L),
            description: Pwstr = MutPtr(0L),
            capabilities: InetFirewallAcCapabilities = InetFirewallAcCapabilities(),
            binaries: InetFirewallAcBinaries = InetFirewallAcBinaries(),
            workingDirectory: Pwstr = MutPtr(0L),
            packageFullName: Pwstr = MutPtr(0L),
        ): InetFirewallAppContainer =
            InetFirewallAppContainer(
                appContainerSidCtorArg = appContainerSid,
                userSidCtorArg = userSid,
                appContainerNameCtorArg = appContainerName,
                displayNameCtorArg = displayName,
                descriptionCtorArg = description,
                capabilities = capabilities,
                binaries = binaries,
                workingDirectoryCtorArg = workingDirectory,
                packageFullNameCtorArg = packageFullName,
            )
    }
}

public class NetconProperties internal constructor(
    public var guidId: Guid,
    pszwNameCtorArg: Pwstr,
    pszwDeviceNameCtorArg: Pwstr,
    public var status: NetconStatus,
    public var mediaType: NetconMediatype,
    public var dwCharacter: UInt,
    public var clsidThisObject: Guid,
    public var clsidUiObject: Guid,
) {
    public var pszwName: Pwstr = pszwNameCtorArg
        internal set

    public var pszwDeviceName: Pwstr = pszwDeviceNameCtorArg
        internal set

    public constructor() : this(
        guidId = Guid(),
        pszwNameCtorArg = MutPtr(0L),
        pszwDeviceNameCtorArg = MutPtr(0L),
        status = 0,
        mediaType = 0,
        dwCharacter = 0u,
        clsidThisObject = Guid(),
        clsidUiObject = Guid(),
    )

    public operator fun component1(): Guid = this.guidId

    public operator fun component2(): Pwstr = this.pszwName

    public operator fun component3(): Pwstr = this.pszwDeviceName

    public operator fun component4(): NetconStatus = this.status

    public operator fun component5(): NetconMediatype = this.mediaType

    public operator fun component6(): UInt = this.dwCharacter

    public operator fun component7(): Guid = this.clsidThisObject

    public operator fun component8(): Guid = this.clsidUiObject

    public fun copy(guidId: Guid = this.guidId, pszwName: Pwstr = this.pszwName, pszwDeviceName: Pwstr = this.pszwDeviceName, status: NetconStatus = this.status, mediaType: NetconMediatype = this.mediaType, dwCharacter: UInt = this.dwCharacter, clsidThisObject: Guid = this.clsidThisObject, clsidUiObject: Guid = this.clsidUiObject): NetconProperties = NetconProperties(guidId = guidId, pszwNameCtorArg = pszwName, pszwDeviceNameCtorArg = pszwDeviceName, status = status, mediaType = mediaType, dwCharacter = dwCharacter, clsidThisObject = clsidThisObject, clsidUiObject = clsidUiObject)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NetconProperties) return false
        if (this.guidId != other.guidId) return false
        if (this.pszwName != other.pszwName) return false
        if (this.pszwDeviceName != other.pszwDeviceName) return false
        if (this.status != other.status) return false
        if (this.mediaType != other.mediaType) return false
        if (this.dwCharacter != other.dwCharacter) return false
        if (this.clsidThisObject != other.clsidThisObject) return false
        if (this.clsidUiObject != other.clsidUiObject) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.guidId.hashCode()
        result = 31 * result + this.pszwName.hashCode()
        result = 31 * result + this.pszwDeviceName.hashCode()
        result = 31 * result + this.status.hashCode()
        result = 31 * result + this.mediaType.hashCode()
        result = 31 * result + this.dwCharacter.hashCode()
        result = 31 * result + this.clsidThisObject.hashCode()
        result = 31 * result + this.clsidUiObject.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            guidId: Guid = Guid(),
            pszwName: Pwstr = MutPtr(0L),
            pszwDeviceName: Pwstr = MutPtr(0L),
            status: NetconStatus = 0,
            mediaType: NetconMediatype = 0,
            dwCharacter: UInt = 0u,
            clsidThisObject: Guid = Guid(),
            clsidUiObject: Guid = Guid(),
        ): NetconProperties =
            NetconProperties(
                guidId = guidId,
                pszwNameCtorArg = pszwName,
                pszwDeviceNameCtorArg = pszwDeviceName,
                status = status,
                mediaType = mediaType,
                dwCharacter = dwCharacter,
                clsidThisObject = clsidThisObject,
                clsidUiObject = clsidUiObject,
            )
    }
}
