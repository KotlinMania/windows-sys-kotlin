@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr

public data class DateTime(
    public var dwLowDateTime: UInt = 0u,
    public var dwHighDateTime: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DateTime> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DateTime> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): DateTime =
                    DateTime(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: DateTime) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwLowDateTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwHighDateTime)
                }
            }
    }
}

public class DhcpapiParams internal constructor(
    public var flags: UInt,
    public var optionId: UInt,
    public var isVendor: Bool,
    dataCtorArg: MutPtr<UByte>,
    public var nBytesData: UInt,
) {
    public var data: MutPtr<UByte> = dataCtorArg
        internal set

    public constructor() : this(
        flags = 0u,
        optionId = 0u,
        isVendor = 0,
        dataCtorArg = MutPtr(0L),
        nBytesData = 0u,
    )

    public operator fun component1(): UInt = this.flags

    public operator fun component2(): UInt = this.optionId

    public operator fun component3(): Bool = this.isVendor

    public operator fun component4(): MutPtr<UByte> = this.data

    public operator fun component5(): UInt = this.nBytesData

    public fun copy(flags: UInt = this.flags, optionId: UInt = this.optionId, isVendor: Bool = this.isVendor, data: MutPtr<UByte> = this.data, nBytesData: UInt = this.nBytesData): DhcpapiParams = DhcpapiParams(flags = flags, optionId = optionId, isVendor = isVendor, dataCtorArg = data, nBytesData = nBytesData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpapiParams) return false
        if (this.flags != other.flags) return false
        if (this.optionId != other.optionId) return false
        if (this.isVendor != other.isVendor) return false
        if (this.data != other.data) return false
        if (this.nBytesData != other.nBytesData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.optionId.hashCode()
        result = 31 * result + this.isVendor.hashCode()
        result = 31 * result + this.data.hashCode()
        result = 31 * result + this.nBytesData.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            flags: UInt = 0u,
            optionId: UInt = 0u,
            isVendor: Bool = 0,
            data: MutPtr<UByte> = MutPtr(0L),
            nBytesData: UInt = 0u,
        ): DhcpapiParams =
            DhcpapiParams(
                flags = flags,
                optionId = optionId,
                isVendor = isVendor,
                dataCtorArg = data,
                nBytesData = nBytesData,
            )
    }
}

public class DhcpcapiClassid internal constructor(
    public var flags: UInt,
    dataCtorArg: MutPtr<UByte>,
    public var nBytesData: UInt,
) {
    public var data: MutPtr<UByte> = dataCtorArg
        internal set

    public constructor() : this(
        flags = 0u,
        dataCtorArg = MutPtr(0L),
        nBytesData = 0u,
    )

    public operator fun component1(): UInt = this.flags

    public operator fun component2(): MutPtr<UByte> = this.data

    public operator fun component3(): UInt = this.nBytesData

    public fun copy(flags: UInt = this.flags, data: MutPtr<UByte> = this.data, nBytesData: UInt = this.nBytesData): DhcpcapiClassid = DhcpcapiClassid(flags = flags, dataCtorArg = data, nBytesData = nBytesData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpcapiClassid) return false
        if (this.flags != other.flags) return false
        if (this.data != other.data) return false
        if (this.nBytesData != other.nBytesData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.data.hashCode()
        result = 31 * result + this.nBytesData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpcapiClassid> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpcapiClassid> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DhcpcapiClassid =
                    DhcpcapiClassid(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: DhcpcapiClassid) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.data)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.nBytesData)
                }
            }

        public operator fun invoke(
            flags: UInt = 0u,
            data: MutPtr<UByte> = MutPtr(0L),
            nBytesData: UInt = 0u,
        ): DhcpcapiClassid =
            DhcpcapiClassid(
                flags = flags,
                dataCtorArg = data,
                nBytesData = nBytesData,
            )
    }
}

public class DhcpcapiParamsArray internal constructor(
    public var nParams: UInt,
    paramsCtorArg: MutPtr<DhcpapiParams>,
) {
    public var params: MutPtr<DhcpapiParams> = paramsCtorArg
        internal set

    public constructor() : this(
        nParams = 0u,
        paramsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.nParams

    public operator fun component2(): MutPtr<DhcpapiParams> = this.params

    public fun copy(nParams: UInt = this.nParams, params: MutPtr<DhcpapiParams> = this.params): DhcpcapiParamsArray = DhcpcapiParamsArray(nParams = nParams, paramsCtorArg = params)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpcapiParamsArray) return false
        if (this.nParams != other.nParams) return false
        if (this.params != other.params) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nParams.hashCode()
        result = 31 * result + this.params.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpcapiParamsArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpcapiParamsArray> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DhcpcapiParamsArray =
                    DhcpcapiParamsArray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<DhcpapiParams>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DhcpcapiParamsArray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nParams)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<DhcpapiParams>(64)
                    ).writeNative(addr + 8L, value.params)
                }
            }

        public operator fun invoke(
            nParams: UInt = 0u,
            params: MutPtr<DhcpapiParams> = MutPtr(0L),
        ): DhcpcapiParamsArray =
            DhcpcapiParamsArray(
                nParams = nParams,
                paramsCtorArg = params,
            )
    }
}

public class DhcpdsServer internal constructor(
    public var version: UInt,
    serverNameCtorArg: Pwstr,
    public var serverAddress: UInt,
    public var flags: UInt,
    public var state: UInt,
    dsLocationCtorArg: Pwstr,
    public var dsLocType: UInt,
) {
    public var serverName: Pwstr = serverNameCtorArg
        internal set

    public var dsLocation: Pwstr = dsLocationCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        serverNameCtorArg = MutPtr(0L),
        serverAddress = 0u,
        flags = 0u,
        state = 0u,
        dsLocationCtorArg = MutPtr(0L),
        dsLocType = 0u,
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): Pwstr = this.serverName

    public operator fun component3(): UInt = this.serverAddress

    public operator fun component4(): UInt = this.flags

    public operator fun component5(): UInt = this.state

    public operator fun component6(): Pwstr = this.dsLocation

    public operator fun component7(): UInt = this.dsLocType

    public fun copy(version: UInt = this.version, serverName: Pwstr = this.serverName, serverAddress: UInt = this.serverAddress, flags: UInt = this.flags, state: UInt = this.state, dsLocation: Pwstr = this.dsLocation, dsLocType: UInt = this.dsLocType): DhcpdsServer = DhcpdsServer(version = version, serverNameCtorArg = serverName, serverAddress = serverAddress, flags = flags, state = state, dsLocationCtorArg = dsLocation, dsLocType = dsLocType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpdsServer) return false
        if (this.version != other.version) return false
        if (this.serverName != other.serverName) return false
        if (this.serverAddress != other.serverAddress) return false
        if (this.flags != other.flags) return false
        if (this.state != other.state) return false
        if (this.dsLocation != other.dsLocation) return false
        if (this.dsLocType != other.dsLocType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.serverName.hashCode()
        result = 31 * result + this.serverAddress.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.dsLocation.hashCode()
        result = 31 * result + this.dsLocType.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: UInt = 0u,
            serverName: Pwstr = MutPtr(0L),
            serverAddress: UInt = 0u,
            flags: UInt = 0u,
            state: UInt = 0u,
            dsLocation: Pwstr = MutPtr(0L),
            dsLocType: UInt = 0u,
        ): DhcpdsServer =
            DhcpdsServer(
                version = version,
                serverNameCtorArg = serverName,
                serverAddress = serverAddress,
                flags = flags,
                state = state,
                dsLocationCtorArg = dsLocation,
                dsLocType = dsLocType,
            )
    }
}

public class DhcpdsServers internal constructor(
    public var flags: UInt,
    public var numElements: UInt,
    serversCtorArg: MutPtr<DhcpdsServer>,
) {
    public var servers: MutPtr<DhcpdsServer> = serversCtorArg
        internal set

    public constructor() : this(
        flags = 0u,
        numElements = 0u,
        serversCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.flags

    public operator fun component2(): UInt = this.numElements

    public operator fun component3(): MutPtr<DhcpdsServer> = this.servers

    public fun copy(flags: UInt = this.flags, numElements: UInt = this.numElements, servers: MutPtr<DhcpdsServer> = this.servers): DhcpdsServers = DhcpdsServers(flags = flags, numElements = numElements, serversCtorArg = servers)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpdsServers) return false
        if (this.flags != other.flags) return false
        if (this.numElements != other.numElements) return false
        if (this.servers != other.servers) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.numElements.hashCode()
        result = 31 * result + this.servers.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpdsServers> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpdsServers> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DhcpdsServers =
                    DhcpdsServers(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<DhcpdsServer>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DhcpdsServers) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.numElements)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<DhcpdsServer>(64)
                    ).writeNative(addr + 8L, value.servers)
                }
            }

        public operator fun invoke(
            flags: UInt = 0u,
            numElements: UInt = 0u,
            servers: MutPtr<DhcpdsServer> = MutPtr(0L),
        ): DhcpdsServers =
            DhcpdsServers(
                flags = flags,
                numElements = numElements,
                serversCtorArg = servers,
            )
    }
}

public class Dhcpv4FailoverClientInfo internal constructor(
    public var clientIpAddress: UInt,
    public var subnetMask: UInt,
    public var clientHardwareAddress: DhcpBinaryData,
    clientNameCtorArg: Pwstr,
    clientCommentCtorArg: Pwstr,
    public var clientLeaseExpires: DateTime,
    public var ownerHost: DhcpHostInfo,
    public var bClientType: UByte,
    public var addressState: UByte,
    public var status: QuarantineStatus,
    public var probationEnds: DateTime,
    public var quarantineCapable: Bool,
    public var sentPotExpTime: UInt,
    public var ackPotExpTime: UInt,
    public var recvPotExpTime: UInt,
    public var startTime: UInt,
    public var cltLastTransTime: UInt,
    public var lastBndUpdTime: UInt,
    public var bndMsgStatus: UInt,
    policyNameCtorArg: Pwstr,
    public var flags: UByte,
) {
    public var clientName: Pwstr = clientNameCtorArg
        internal set

    public var clientComment: Pwstr = clientCommentCtorArg
        internal set

    public var policyName: Pwstr = policyNameCtorArg
        internal set

    public constructor() : this(
        clientIpAddress = 0u,
        subnetMask = 0u,
        clientHardwareAddress = DhcpBinaryData(),
        clientNameCtorArg = MutPtr(0L),
        clientCommentCtorArg = MutPtr(0L),
        clientLeaseExpires = DateTime(),
        ownerHost = DhcpHostInfo(),
        bClientType = 0u,
        addressState = 0u,
        status = 0,
        probationEnds = DateTime(),
        quarantineCapable = 0,
        sentPotExpTime = 0u,
        ackPotExpTime = 0u,
        recvPotExpTime = 0u,
        startTime = 0u,
        cltLastTransTime = 0u,
        lastBndUpdTime = 0u,
        bndMsgStatus = 0u,
        policyNameCtorArg = MutPtr(0L),
        flags = 0u,
    )

    public companion object {
        public operator fun invoke(
            clientIpAddress: UInt = 0u,
            subnetMask: UInt = 0u,
            clientHardwareAddress: DhcpBinaryData = DhcpBinaryData(),
            clientName: Pwstr = MutPtr(0L),
            clientComment: Pwstr = MutPtr(0L),
            clientLeaseExpires: DateTime = DateTime(),
            ownerHost: DhcpHostInfo = DhcpHostInfo(),
            bClientType: UByte = 0u,
            addressState: UByte = 0u,
            status: QuarantineStatus = 0,
            probationEnds: DateTime = DateTime(),
            quarantineCapable: Bool = 0,
            sentPotExpTime: UInt = 0u,
            ackPotExpTime: UInt = 0u,
            recvPotExpTime: UInt = 0u,
            startTime: UInt = 0u,
            cltLastTransTime: UInt = 0u,
            lastBndUpdTime: UInt = 0u,
            bndMsgStatus: UInt = 0u,
            policyName: Pwstr = MutPtr(0L),
            flags: UByte = 0u,
        ): Dhcpv4FailoverClientInfo =
            Dhcpv4FailoverClientInfo(
                clientIpAddress = clientIpAddress,
                subnetMask = subnetMask,
                clientHardwareAddress = clientHardwareAddress,
                clientNameCtorArg = clientName,
                clientCommentCtorArg = clientComment,
                clientLeaseExpires = clientLeaseExpires,
                ownerHost = ownerHost,
                bClientType = bClientType,
                addressState = addressState,
                status = status,
                probationEnds = probationEnds,
                quarantineCapable = quarantineCapable,
                sentPotExpTime = sentPotExpTime,
                ackPotExpTime = ackPotExpTime,
                recvPotExpTime = recvPotExpTime,
                startTime = startTime,
                cltLastTransTime = cltLastTransTime,
                lastBndUpdTime = lastBndUpdTime,
                bndMsgStatus = bndMsgStatus,
                policyNameCtorArg = policyName,
                flags = flags,
            )
    }
}

public class Dhcpv4FailoverClientInfoArray internal constructor(
    public var numElements: UInt,
    clientsCtorArg: MutPtr<MutPtr<Dhcpv4FailoverClientInfo>>,
) {
    public var clients: MutPtr<MutPtr<Dhcpv4FailoverClientInfo>> = clientsCtorArg
        internal set

    public constructor() : this(
        numElements = 0u,
        clientsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numElements

    public operator fun component2(): MutPtr<MutPtr<Dhcpv4FailoverClientInfo>> = this.clients

    public fun copy(numElements: UInt = this.numElements, clients: MutPtr<MutPtr<Dhcpv4FailoverClientInfo>> = this.clients): Dhcpv4FailoverClientInfoArray = Dhcpv4FailoverClientInfoArray(numElements = numElements, clientsCtorArg = clients)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dhcpv4FailoverClientInfoArray) return false
        if (this.numElements != other.numElements) return false
        if (this.clients != other.clients) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numElements.hashCode()
        result = 31 * result + this.clients.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dhcpv4FailoverClientInfoArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dhcpv4FailoverClientInfoArray> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Dhcpv4FailoverClientInfoArray =
                    Dhcpv4FailoverClientInfoArray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<Dhcpv4FailoverClientInfo>>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Dhcpv4FailoverClientInfoArray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numElements)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<Dhcpv4FailoverClientInfo>>(64)
                    ).writeNative(addr + 8L, value.clients)
                }
            }

        public operator fun invoke(
            numElements: UInt = 0u,
            clients: MutPtr<MutPtr<Dhcpv4FailoverClientInfo>> = MutPtr(0L),
        ): Dhcpv4FailoverClientInfoArray =
            Dhcpv4FailoverClientInfoArray(
                numElements = numElements,
                clientsCtorArg = clients,
            )
    }
}

public class Dhcpv4FailoverClientInfoEx internal constructor(
    public var clientIpAddress: UInt,
    public var subnetMask: UInt,
    public var clientHardwareAddress: DhcpBinaryData,
    clientNameCtorArg: Pwstr,
    clientCommentCtorArg: Pwstr,
    public var clientLeaseExpires: DateTime,
    public var ownerHost: DhcpHostInfo,
    public var bClientType: UByte,
    public var addressState: UByte,
    public var status: QuarantineStatus,
    public var probationEnds: DateTime,
    public var quarantineCapable: Bool,
    public var sentPotExpTime: UInt,
    public var ackPotExpTime: UInt,
    public var recvPotExpTime: UInt,
    public var startTime: UInt,
    public var cltLastTransTime: UInt,
    public var lastBndUpdTime: UInt,
    public var bndMsgStatus: UInt,
    policyNameCtorArg: Pwstr,
    public var flags: UByte,
    public var addressStateEx: UInt,
) {
    public var clientName: Pwstr = clientNameCtorArg
        internal set

    public var clientComment: Pwstr = clientCommentCtorArg
        internal set

    public var policyName: Pwstr = policyNameCtorArg
        internal set

    public constructor() : this(
        clientIpAddress = 0u,
        subnetMask = 0u,
        clientHardwareAddress = DhcpBinaryData(),
        clientNameCtorArg = MutPtr(0L),
        clientCommentCtorArg = MutPtr(0L),
        clientLeaseExpires = DateTime(),
        ownerHost = DhcpHostInfo(),
        bClientType = 0u,
        addressState = 0u,
        status = 0,
        probationEnds = DateTime(),
        quarantineCapable = 0,
        sentPotExpTime = 0u,
        ackPotExpTime = 0u,
        recvPotExpTime = 0u,
        startTime = 0u,
        cltLastTransTime = 0u,
        lastBndUpdTime = 0u,
        bndMsgStatus = 0u,
        policyNameCtorArg = MutPtr(0L),
        flags = 0u,
        addressStateEx = 0u,
    )

    public companion object {
        public operator fun invoke(
            clientIpAddress: UInt = 0u,
            subnetMask: UInt = 0u,
            clientHardwareAddress: DhcpBinaryData = DhcpBinaryData(),
            clientName: Pwstr = MutPtr(0L),
            clientComment: Pwstr = MutPtr(0L),
            clientLeaseExpires: DateTime = DateTime(),
            ownerHost: DhcpHostInfo = DhcpHostInfo(),
            bClientType: UByte = 0u,
            addressState: UByte = 0u,
            status: QuarantineStatus = 0,
            probationEnds: DateTime = DateTime(),
            quarantineCapable: Bool = 0,
            sentPotExpTime: UInt = 0u,
            ackPotExpTime: UInt = 0u,
            recvPotExpTime: UInt = 0u,
            startTime: UInt = 0u,
            cltLastTransTime: UInt = 0u,
            lastBndUpdTime: UInt = 0u,
            bndMsgStatus: UInt = 0u,
            policyName: Pwstr = MutPtr(0L),
            flags: UByte = 0u,
            addressStateEx: UInt = 0u,
        ): Dhcpv4FailoverClientInfoEx =
            Dhcpv4FailoverClientInfoEx(
                clientIpAddress = clientIpAddress,
                subnetMask = subnetMask,
                clientHardwareAddress = clientHardwareAddress,
                clientNameCtorArg = clientName,
                clientCommentCtorArg = clientComment,
                clientLeaseExpires = clientLeaseExpires,
                ownerHost = ownerHost,
                bClientType = bClientType,
                addressState = addressState,
                status = status,
                probationEnds = probationEnds,
                quarantineCapable = quarantineCapable,
                sentPotExpTime = sentPotExpTime,
                ackPotExpTime = ackPotExpTime,
                recvPotExpTime = recvPotExpTime,
                startTime = startTime,
                cltLastTransTime = cltLastTransTime,
                lastBndUpdTime = lastBndUpdTime,
                bndMsgStatus = bndMsgStatus,
                policyNameCtorArg = policyName,
                flags = flags,
                addressStateEx = addressStateEx,
            )
    }
}

public class Dhcpv6capiClassid internal constructor(
    public var flags: UInt,
    dataCtorArg: MutPtr<UByte>,
    public var nBytesData: UInt,
) {
    public var data: MutPtr<UByte> = dataCtorArg
        internal set

    public constructor() : this(
        flags = 0u,
        dataCtorArg = MutPtr(0L),
        nBytesData = 0u,
    )

    public operator fun component1(): UInt = this.flags

    public operator fun component2(): MutPtr<UByte> = this.data

    public operator fun component3(): UInt = this.nBytesData

    public fun copy(flags: UInt = this.flags, data: MutPtr<UByte> = this.data, nBytesData: UInt = this.nBytesData): Dhcpv6capiClassid = Dhcpv6capiClassid(flags = flags, dataCtorArg = data, nBytesData = nBytesData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dhcpv6capiClassid) return false
        if (this.flags != other.flags) return false
        if (this.data != other.data) return false
        if (this.nBytesData != other.nBytesData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.data.hashCode()
        result = 31 * result + this.nBytesData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dhcpv6capiClassid> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dhcpv6capiClassid> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Dhcpv6capiClassid =
                    Dhcpv6capiClassid(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Dhcpv6capiClassid) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.data)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.nBytesData)
                }
            }

        public operator fun invoke(
            flags: UInt = 0u,
            data: MutPtr<UByte> = MutPtr(0L),
            nBytesData: UInt = 0u,
        ): Dhcpv6capiClassid =
            Dhcpv6capiClassid(
                flags = flags,
                dataCtorArg = data,
                nBytesData = nBytesData,
            )
    }
}

public class Dhcpv6capiParams internal constructor(
    public var flags: UInt,
    public var optionId: UInt,
    public var isVendor: Bool,
    dataCtorArg: MutPtr<UByte>,
    public var nBytesData: UInt,
) {
    public var data: MutPtr<UByte> = dataCtorArg
        internal set

    public constructor() : this(
        flags = 0u,
        optionId = 0u,
        isVendor = 0,
        dataCtorArg = MutPtr(0L),
        nBytesData = 0u,
    )

    public operator fun component1(): UInt = this.flags

    public operator fun component2(): UInt = this.optionId

    public operator fun component3(): Bool = this.isVendor

    public operator fun component4(): MutPtr<UByte> = this.data

    public operator fun component5(): UInt = this.nBytesData

    public fun copy(flags: UInt = this.flags, optionId: UInt = this.optionId, isVendor: Bool = this.isVendor, data: MutPtr<UByte> = this.data, nBytesData: UInt = this.nBytesData): Dhcpv6capiParams = Dhcpv6capiParams(flags = flags, optionId = optionId, isVendor = isVendor, dataCtorArg = data, nBytesData = nBytesData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dhcpv6capiParams) return false
        if (this.flags != other.flags) return false
        if (this.optionId != other.optionId) return false
        if (this.isVendor != other.isVendor) return false
        if (this.data != other.data) return false
        if (this.nBytesData != other.nBytesData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.optionId.hashCode()
        result = 31 * result + this.isVendor.hashCode()
        result = 31 * result + this.data.hashCode()
        result = 31 * result + this.nBytesData.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            flags: UInt = 0u,
            optionId: UInt = 0u,
            isVendor: Bool = 0,
            data: MutPtr<UByte> = MutPtr(0L),
            nBytesData: UInt = 0u,
        ): Dhcpv6capiParams =
            Dhcpv6capiParams(
                flags = flags,
                optionId = optionId,
                isVendor = isVendor,
                dataCtorArg = data,
                nBytesData = nBytesData,
            )
    }
}

public class Dhcpv6capiParamsArray internal constructor(
    public var nParams: UInt,
    paramsCtorArg: MutPtr<Dhcpv6capiParams>,
) {
    public var params: MutPtr<Dhcpv6capiParams> = paramsCtorArg
        internal set

    public constructor() : this(
        nParams = 0u,
        paramsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.nParams

    public operator fun component2(): MutPtr<Dhcpv6capiParams> = this.params

    public fun copy(nParams: UInt = this.nParams, params: MutPtr<Dhcpv6capiParams> = this.params): Dhcpv6capiParamsArray = Dhcpv6capiParamsArray(nParams = nParams, paramsCtorArg = params)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dhcpv6capiParamsArray) return false
        if (this.nParams != other.nParams) return false
        if (this.params != other.params) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nParams.hashCode()
        result = 31 * result + this.params.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dhcpv6capiParamsArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dhcpv6capiParamsArray> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Dhcpv6capiParamsArray =
                    Dhcpv6capiParamsArray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Dhcpv6capiParams>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Dhcpv6capiParamsArray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nParams)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Dhcpv6capiParams>(64)
                    ).writeNative(addr + 8L, value.params)
                }
            }

        public operator fun invoke(
            nParams: UInt = 0u,
            params: MutPtr<Dhcpv6capiParams> = MutPtr(0L),
        ): Dhcpv6capiParamsArray =
            Dhcpv6capiParamsArray(
                nParams = nParams,
                paramsCtorArg = params,
            )
    }
}

public data class DHCPV6Prefix(
    public var prefix: UByteArray = UByteArray(16),
    public var prefixLength: UInt = 0u,
    public var preferredLifeTime: UInt = 0u,
    public var validLifeTime: UInt = 0u,
    public var status: StatusCode = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DHCPV6Prefix) return false
        if (!this.prefix.contentEquals(other.prefix)) return false
        if (this.prefixLength != other.prefixLength) return false
        if (this.preferredLifeTime != other.preferredLifeTime) return false
        if (this.validLifeTime != other.validLifeTime) return false
        if (this.status != other.status) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.prefix.contentHashCode()
        result = 31 * result + this.prefixLength.hashCode()
        result = 31 * result + this.preferredLifeTime.hashCode()
        result = 31 * result + this.validLifeTime.hashCode()
        result = 31 * result + this.status.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DHCPV6Prefix> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DHCPV6Prefix> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): DHCPV6Prefix =
                    DHCPV6Prefix(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: DHCPV6Prefix) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.prefix)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.prefixLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.preferredLifeTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.validLifeTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.status)
                }
            }
    }
}

public class DHCPV6PrefixLeaseInformation internal constructor(
    public var nPrefixes: UInt,
    prefixArrayCtorArg: MutPtr<DHCPV6Prefix>,
    public var iaid: UInt,
    public var t1: Long,
    public var t2: Long,
    public var maxLeaseExpirationTime: Long,
    public var lastRenewalTime: Long,
    public var status: StatusCode,
    serverIdCtorArg: MutPtr<UByte>,
    public var serverIdLen: UInt,
) {
    public var prefixArray: MutPtr<DHCPV6Prefix> = prefixArrayCtorArg
        internal set

    public var serverId: MutPtr<UByte> = serverIdCtorArg
        internal set

    public constructor() : this(
        nPrefixes = 0u,
        prefixArrayCtorArg = MutPtr(0L),
        iaid = 0u,
        t1 = 0L,
        t2 = 0L,
        maxLeaseExpirationTime = 0L,
        lastRenewalTime = 0L,
        status = 0,
        serverIdCtorArg = MutPtr(0L),
        serverIdLen = 0u,
    )

    public operator fun component1(): UInt = this.nPrefixes

    public operator fun component2(): MutPtr<DHCPV6Prefix> = this.prefixArray

    public operator fun component3(): UInt = this.iaid

    public operator fun component4(): Long = this.t1

    public operator fun component5(): Long = this.t2

    public operator fun component6(): Long = this.maxLeaseExpirationTime

    public operator fun component7(): Long = this.lastRenewalTime

    public operator fun component8(): StatusCode = this.status

    public operator fun component9(): MutPtr<UByte> = this.serverId

    public operator fun component10(): UInt = this.serverIdLen

    public fun copy(nPrefixes: UInt = this.nPrefixes, prefixArray: MutPtr<DHCPV6Prefix> = this.prefixArray, iaid: UInt = this.iaid, t1: Long = this.t1, t2: Long = this.t2, maxLeaseExpirationTime: Long = this.maxLeaseExpirationTime, lastRenewalTime: Long = this.lastRenewalTime, status: StatusCode = this.status, serverId: MutPtr<UByte> = this.serverId, serverIdLen: UInt = this.serverIdLen): DHCPV6PrefixLeaseInformation = DHCPV6PrefixLeaseInformation(nPrefixes = nPrefixes, prefixArrayCtorArg = prefixArray, iaid = iaid, t1 = t1, t2 = t2, maxLeaseExpirationTime = maxLeaseExpirationTime, lastRenewalTime = lastRenewalTime, status = status, serverIdCtorArg = serverId, serverIdLen = serverIdLen)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DHCPV6PrefixLeaseInformation) return false
        if (this.nPrefixes != other.nPrefixes) return false
        if (this.prefixArray != other.prefixArray) return false
        if (this.iaid != other.iaid) return false
        if (this.t1 != other.t1) return false
        if (this.t2 != other.t2) return false
        if (this.maxLeaseExpirationTime != other.maxLeaseExpirationTime) return false
        if (this.lastRenewalTime != other.lastRenewalTime) return false
        if (this.status != other.status) return false
        if (this.serverId != other.serverId) return false
        if (this.serverIdLen != other.serverIdLen) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nPrefixes.hashCode()
        result = 31 * result + this.prefixArray.hashCode()
        result = 31 * result + this.iaid.hashCode()
        result = 31 * result + this.t1.hashCode()
        result = 31 * result + this.t2.hashCode()
        result = 31 * result + this.maxLeaseExpirationTime.hashCode()
        result = 31 * result + this.lastRenewalTime.hashCode()
        result = 31 * result + this.status.hashCode()
        result = 31 * result + this.serverId.hashCode()
        result = 31 * result + this.serverIdLen.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DHCPV6PrefixLeaseInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DHCPV6PrefixLeaseInformation> {
                override val sizeBytes: Long = 80L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DHCPV6PrefixLeaseInformation =
                    DHCPV6PrefixLeaseInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<DHCPV6Prefix>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 56L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                    )
                override fun writeNative(addr: Long, value: DHCPV6PrefixLeaseInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nPrefixes)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<DHCPV6Prefix>(64)
                    ).writeNative(addr + 8L, value.prefixArray)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.iaid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.t1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.t2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.maxLeaseExpirationTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 48L, value.lastRenewalTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 56L, value.status)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 64L, value.serverId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.serverIdLen)
                }
            }

        public operator fun invoke(
            nPrefixes: UInt = 0u,
            prefixArray: MutPtr<DHCPV6Prefix> = MutPtr(0L),
            iaid: UInt = 0u,
            t1: Long = 0L,
            t2: Long = 0L,
            maxLeaseExpirationTime: Long = 0L,
            lastRenewalTime: Long = 0L,
            status: StatusCode = 0,
            serverId: MutPtr<UByte> = MutPtr(0L),
            serverIdLen: UInt = 0u,
        ): DHCPV6PrefixLeaseInformation =
            DHCPV6PrefixLeaseInformation(
                nPrefixes = nPrefixes,
                prefixArrayCtorArg = prefixArray,
                iaid = iaid,
                t1 = t1,
                t2 = t2,
                maxLeaseExpirationTime = maxLeaseExpirationTime,
                lastRenewalTime = lastRenewalTime,
                status = status,
                serverIdCtorArg = serverId,
                serverIdLen = serverIdLen,
            )
    }
}

public class Dhcpv6BindElement internal constructor(
    public var flags: UInt,
    public var fBoundToDHCPServer: Bool,
    public var adapterPrimaryAddress: DhcpIpv6Address,
    public var adapterSubnetAddress: DhcpIpv6Address,
    ifDescriptionCtorArg: Pwstr,
    public var ipV6IfIndex: UInt,
    public var ifIdSize: UInt,
    ifIdCtorArg: MutPtr<UByte>,
) {
    public var ifDescription: Pwstr = ifDescriptionCtorArg
        internal set

    public var ifId: MutPtr<UByte> = ifIdCtorArg
        internal set

    public constructor() : this(
        flags = 0u,
        fBoundToDHCPServer = 0,
        adapterPrimaryAddress = DhcpIpv6Address(),
        adapterSubnetAddress = DhcpIpv6Address(),
        ifDescriptionCtorArg = MutPtr(0L),
        ipV6IfIndex = 0u,
        ifIdSize = 0u,
        ifIdCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.flags

    public operator fun component2(): Bool = this.fBoundToDHCPServer

    public operator fun component3(): DhcpIpv6Address = this.adapterPrimaryAddress

    public operator fun component4(): DhcpIpv6Address = this.adapterSubnetAddress

    public operator fun component5(): Pwstr = this.ifDescription

    public operator fun component6(): UInt = this.ipV6IfIndex

    public operator fun component7(): UInt = this.ifIdSize

    public operator fun component8(): MutPtr<UByte> = this.ifId

    public fun copy(flags: UInt = this.flags, fBoundToDHCPServer: Bool = this.fBoundToDHCPServer, adapterPrimaryAddress: DhcpIpv6Address = this.adapterPrimaryAddress, adapterSubnetAddress: DhcpIpv6Address = this.adapterSubnetAddress, ifDescription: Pwstr = this.ifDescription, ipV6IfIndex: UInt = this.ipV6IfIndex, ifIdSize: UInt = this.ifIdSize, ifId: MutPtr<UByte> = this.ifId): Dhcpv6BindElement = Dhcpv6BindElement(flags = flags, fBoundToDHCPServer = fBoundToDHCPServer, adapterPrimaryAddress = adapterPrimaryAddress, adapterSubnetAddress = adapterSubnetAddress, ifDescriptionCtorArg = ifDescription, ipV6IfIndex = ipV6IfIndex, ifIdSize = ifIdSize, ifIdCtorArg = ifId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dhcpv6BindElement) return false
        if (this.flags != other.flags) return false
        if (this.fBoundToDHCPServer != other.fBoundToDHCPServer) return false
        if (this.adapterPrimaryAddress != other.adapterPrimaryAddress) return false
        if (this.adapterSubnetAddress != other.adapterSubnetAddress) return false
        if (this.ifDescription != other.ifDescription) return false
        if (this.ipV6IfIndex != other.ipV6IfIndex) return false
        if (this.ifIdSize != other.ifIdSize) return false
        if (this.ifId != other.ifId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.fBoundToDHCPServer.hashCode()
        result = 31 * result + this.adapterPrimaryAddress.hashCode()
        result = 31 * result + this.adapterSubnetAddress.hashCode()
        result = 31 * result + this.ifDescription.hashCode()
        result = 31 * result + this.ipV6IfIndex.hashCode()
        result = 31 * result + this.ifIdSize.hashCode()
        result = 31 * result + this.ifId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            flags: UInt = 0u,
            fBoundToDHCPServer: Bool = 0,
            adapterPrimaryAddress: DhcpIpv6Address = DhcpIpv6Address(),
            adapterSubnetAddress: DhcpIpv6Address = DhcpIpv6Address(),
            ifDescription: Pwstr = MutPtr(0L),
            ipV6IfIndex: UInt = 0u,
            ifIdSize: UInt = 0u,
            ifId: MutPtr<UByte> = MutPtr(0L),
        ): Dhcpv6BindElement =
            Dhcpv6BindElement(
                flags = flags,
                fBoundToDHCPServer = fBoundToDHCPServer,
                adapterPrimaryAddress = adapterPrimaryAddress,
                adapterSubnetAddress = adapterSubnetAddress,
                ifDescriptionCtorArg = ifDescription,
                ipV6IfIndex = ipV6IfIndex,
                ifIdSize = ifIdSize,
                ifIdCtorArg = ifId,
            )
    }
}

public class Dhcpv6BindElementArray internal constructor(
    public var numElements: UInt,
    elementsCtorArg: MutPtr<Dhcpv6BindElement>,
) {
    public var elements: MutPtr<Dhcpv6BindElement> = elementsCtorArg
        internal set

    public constructor() : this(
        numElements = 0u,
        elementsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numElements

    public operator fun component2(): MutPtr<Dhcpv6BindElement> = this.elements

    public fun copy(numElements: UInt = this.numElements, elements: MutPtr<Dhcpv6BindElement> = this.elements): Dhcpv6BindElementArray = Dhcpv6BindElementArray(numElements = numElements, elementsCtorArg = elements)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dhcpv6BindElementArray) return false
        if (this.numElements != other.numElements) return false
        if (this.elements != other.elements) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numElements.hashCode()
        result = 31 * result + this.elements.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dhcpv6BindElementArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dhcpv6BindElementArray> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Dhcpv6BindElementArray =
                    Dhcpv6BindElementArray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Dhcpv6BindElement>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Dhcpv6BindElementArray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numElements)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Dhcpv6BindElement>(64)
                    ).writeNative(addr + 8L, value.elements)
                }
            }

        public operator fun invoke(
            numElements: UInt = 0u,
            elements: MutPtr<Dhcpv6BindElement> = MutPtr(0L),
        ): Dhcpv6BindElementArray =
            Dhcpv6BindElementArray(
                numElements = numElements,
                elementsCtorArg = elements,
            )
    }
}

public class Dhcpv6IpArray internal constructor(
    public var numElements: UInt,
    elementsCtorArg: MutPtr<DhcpIpv6Address>,
) {
    public var elements: MutPtr<DhcpIpv6Address> = elementsCtorArg
        internal set

    public constructor() : this(
        numElements = 0u,
        elementsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numElements

    public operator fun component2(): MutPtr<DhcpIpv6Address> = this.elements

    public fun copy(numElements: UInt = this.numElements, elements: MutPtr<DhcpIpv6Address> = this.elements): Dhcpv6IpArray = Dhcpv6IpArray(numElements = numElements, elementsCtorArg = elements)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dhcpv6IpArray) return false
        if (this.numElements != other.numElements) return false
        if (this.elements != other.elements) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numElements.hashCode()
        result = 31 * result + this.elements.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dhcpv6IpArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dhcpv6IpArray> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Dhcpv6IpArray =
                    Dhcpv6IpArray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<DhcpIpv6Address>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Dhcpv6IpArray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numElements)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<DhcpIpv6Address>(64)
                    ).writeNative(addr + 8L, value.elements)
                }
            }

        public operator fun invoke(
            numElements: UInt = 0u,
            elements: MutPtr<DhcpIpv6Address> = MutPtr(0L),
        ): Dhcpv6IpArray =
            Dhcpv6IpArray(
                numElements = numElements,
                elementsCtorArg = elements,
            )
    }
}

public data class Dhcpv6StatelessParams(
    public var status: Bool = 0,
    public var purgeInterval: UInt = 0u,
)

public data class Dhcpv6StatelessScopeStats(
    public var subnetAddress: DhcpIpv6Address = DhcpIpv6Address(),
    public var numStatelessClientsAdded: ULong = 0uL,
    public var numStatelessClientsRemoved: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dhcpv6StatelessScopeStats> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dhcpv6StatelessScopeStats> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Dhcpv6StatelessScopeStats =
                    Dhcpv6StatelessScopeStats(
                        (DhcpIpv6Address.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Dhcpv6StatelessScopeStats) {
                    (DhcpIpv6Address.typeLayout()).writeNative(addr, value.subnetAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.numStatelessClientsAdded)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.numStatelessClientsRemoved)
                }
            }
    }
}

public class Dhcpv6StatelessStats internal constructor(
    public var numScopes: UInt,
    scopeStatsCtorArg: MutPtr<Dhcpv6StatelessScopeStats>,
) {
    public var scopeStats: MutPtr<Dhcpv6StatelessScopeStats> = scopeStatsCtorArg
        internal set

    public constructor() : this(
        numScopes = 0u,
        scopeStatsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numScopes

    public operator fun component2(): MutPtr<Dhcpv6StatelessScopeStats> = this.scopeStats

    public fun copy(numScopes: UInt = this.numScopes, scopeStats: MutPtr<Dhcpv6StatelessScopeStats> = this.scopeStats): Dhcpv6StatelessStats = Dhcpv6StatelessStats(numScopes = numScopes, scopeStatsCtorArg = scopeStats)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dhcpv6StatelessStats) return false
        if (this.numScopes != other.numScopes) return false
        if (this.scopeStats != other.scopeStats) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numScopes.hashCode()
        result = 31 * result + this.scopeStats.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dhcpv6StatelessStats> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dhcpv6StatelessStats> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Dhcpv6StatelessStats =
                    Dhcpv6StatelessStats(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Dhcpv6StatelessScopeStats>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Dhcpv6StatelessStats) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numScopes)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Dhcpv6StatelessScopeStats>(64)
                    ).writeNative(addr + 8L, value.scopeStats)
                }
            }

        public operator fun invoke(
            numScopes: UInt = 0u,
            scopeStats: MutPtr<Dhcpv6StatelessScopeStats> = MutPtr(0L),
        ): Dhcpv6StatelessStats =
            Dhcpv6StatelessStats(
                numScopes = numScopes,
                scopeStatsCtorArg = scopeStats,
            )
    }
}

public data class DhcpAddrPattern(
    public var matchHWType: Bool = 0,
    public var hWType: UByte = 0u,
    public var isWildcard: Bool = 0,
    public var length: UByte = 0u,
    public var pattern: UByteArray = UByteArray(255),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpAddrPattern) return false
        if (this.matchHWType != other.matchHWType) return false
        if (this.hWType != other.hWType) return false
        if (this.isWildcard != other.isWildcard) return false
        if (this.length != other.length) return false
        if (!this.pattern.contentEquals(other.pattern)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.matchHWType.hashCode()
        result = 31 * result + this.hWType.hashCode()
        result = 31 * result + this.isWildcard.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.pattern.contentHashCode()
        return result
    }
}

public class DhcpAllOptions internal constructor(
    public var flags: UInt,
    nonVendorOptionsCtorArg: MutPtr<DhcpOptionArray>,
    public var numVendorOptions: UInt,
    vendorOptionsCtorArg: MutPtr<DhcpAllOptions0>,
) {
    public var nonVendorOptions: MutPtr<DhcpOptionArray> = nonVendorOptionsCtorArg
        internal set

    public var vendorOptions: MutPtr<DhcpAllOptions0> = vendorOptionsCtorArg
        internal set

    public constructor() : this(
        flags = 0u,
        nonVendorOptionsCtorArg = MutPtr(0L),
        numVendorOptions = 0u,
        vendorOptionsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.flags

    public operator fun component2(): MutPtr<DhcpOptionArray> = this.nonVendorOptions

    public operator fun component3(): UInt = this.numVendorOptions

    public operator fun component4(): MutPtr<DhcpAllOptions0> = this.vendorOptions

    public fun copy(flags: UInt = this.flags, nonVendorOptions: MutPtr<DhcpOptionArray> = this.nonVendorOptions, numVendorOptions: UInt = this.numVendorOptions, vendorOptions: MutPtr<DhcpAllOptions0> = this.vendorOptions): DhcpAllOptions = DhcpAllOptions(flags = flags, nonVendorOptionsCtorArg = nonVendorOptions, numVendorOptions = numVendorOptions, vendorOptionsCtorArg = vendorOptions)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpAllOptions) return false
        if (this.flags != other.flags) return false
        if (this.nonVendorOptions != other.nonVendorOptions) return false
        if (this.numVendorOptions != other.numVendorOptions) return false
        if (this.vendorOptions != other.vendorOptions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.nonVendorOptions.hashCode()
        result = 31 * result + this.numVendorOptions.hashCode()
        result = 31 * result + this.vendorOptions.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpAllOptions> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpAllOptions> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DhcpAllOptions =
                    DhcpAllOptions(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<DhcpOptionArray>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<DhcpAllOptions0>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: DhcpAllOptions) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<DhcpOptionArray>(64)
                    ).writeNative(addr + 8L, value.nonVendorOptions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.numVendorOptions)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<DhcpAllOptions0>(64)
                    ).writeNative(addr + 24L, value.vendorOptions)
                }
            }

        public operator fun invoke(
            flags: UInt = 0u,
            nonVendorOptions: MutPtr<DhcpOptionArray> = MutPtr(0L),
            numVendorOptions: UInt = 0u,
            vendorOptions: MutPtr<DhcpAllOptions0> = MutPtr(0L),
        ): DhcpAllOptions =
            DhcpAllOptions(
                flags = flags,
                nonVendorOptionsCtorArg = nonVendorOptions,
                numVendorOptions = numVendorOptions,
                vendorOptionsCtorArg = vendorOptions,
            )
    }
}

public class DhcpAllOptions0 internal constructor(
    public var option: DhcpOption,
    vendorNameCtorArg: Pwstr,
    clsNameCtorArg: Pwstr,
) {
    public var vendorName: Pwstr = vendorNameCtorArg
        internal set

    public var clsName: Pwstr = clsNameCtorArg
        internal set

    public constructor() : this(
        option = DhcpOption(),
        vendorNameCtorArg = MutPtr(0L),
        clsNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): DhcpOption = this.option

    public operator fun component2(): Pwstr = this.vendorName

    public operator fun component3(): Pwstr = this.clsName

    public fun copy(option: DhcpOption = this.option, vendorName: Pwstr = this.vendorName, clsName: Pwstr = this.clsName): DhcpAllOptions0 = DhcpAllOptions0(option = option, vendorNameCtorArg = vendorName, clsNameCtorArg = clsName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpAllOptions0) return false
        if (this.option != other.option) return false
        if (this.vendorName != other.vendorName) return false
        if (this.clsName != other.clsName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.option.hashCode()
        result = 31 * result + this.vendorName.hashCode()
        result = 31 * result + this.clsName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            option: DhcpOption = DhcpOption(),
            vendorName: Pwstr = MutPtr(0L),
            clsName: Pwstr = MutPtr(0L),
        ): DhcpAllOptions0 =
            DhcpAllOptions0(
                option = option,
                vendorNameCtorArg = vendorName,
                clsNameCtorArg = clsName,
            )
    }
}

public class DhcpAllOptionValues internal constructor(
    public var flags: UInt,
    public var numElements: UInt,
    optionsCtorArg: MutPtr<DhcpAllOptionValues0>,
) {
    public var options: MutPtr<DhcpAllOptionValues0> = optionsCtorArg
        internal set

    public constructor() : this(
        flags = 0u,
        numElements = 0u,
        optionsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.flags

    public operator fun component2(): UInt = this.numElements

    public operator fun component3(): MutPtr<DhcpAllOptionValues0> = this.options

    public fun copy(flags: UInt = this.flags, numElements: UInt = this.numElements, options: MutPtr<DhcpAllOptionValues0> = this.options): DhcpAllOptionValues = DhcpAllOptionValues(flags = flags, numElements = numElements, optionsCtorArg = options)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpAllOptionValues) return false
        if (this.flags != other.flags) return false
        if (this.numElements != other.numElements) return false
        if (this.options != other.options) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.numElements.hashCode()
        result = 31 * result + this.options.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpAllOptionValues> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpAllOptionValues> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DhcpAllOptionValues =
                    DhcpAllOptionValues(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<DhcpAllOptionValues0>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DhcpAllOptionValues) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.numElements)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<DhcpAllOptionValues0>(64)
                    ).writeNative(addr + 8L, value.options)
                }
            }

        public operator fun invoke(
            flags: UInt = 0u,
            numElements: UInt = 0u,
            options: MutPtr<DhcpAllOptionValues0> = MutPtr(0L),
        ): DhcpAllOptionValues =
            DhcpAllOptionValues(
                flags = flags,
                numElements = numElements,
                optionsCtorArg = options,
            )
    }
}

public class DhcpAllOptionValues0 internal constructor(
    clsNameCtorArg: Pwstr,
    vendorNameCtorArg: Pwstr,
    public var isVendor: Bool,
    optionsArrayCtorArg: MutPtr<DhcpOptionValueArray>,
) {
    public var clsName: Pwstr = clsNameCtorArg
        internal set

    public var vendorName: Pwstr = vendorNameCtorArg
        internal set

    public var optionsArray: MutPtr<DhcpOptionValueArray> = optionsArrayCtorArg
        internal set

    public constructor() : this(
        clsNameCtorArg = MutPtr(0L),
        vendorNameCtorArg = MutPtr(0L),
        isVendor = 0,
        optionsArrayCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.clsName

    public operator fun component2(): Pwstr = this.vendorName

    public operator fun component3(): Bool = this.isVendor

    public operator fun component4(): MutPtr<DhcpOptionValueArray> = this.optionsArray

    public fun copy(clsName: Pwstr = this.clsName, vendorName: Pwstr = this.vendorName, isVendor: Bool = this.isVendor, optionsArray: MutPtr<DhcpOptionValueArray> = this.optionsArray): DhcpAllOptionValues0 = DhcpAllOptionValues0(clsNameCtorArg = clsName, vendorNameCtorArg = vendorName, isVendor = isVendor, optionsArrayCtorArg = optionsArray)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpAllOptionValues0) return false
        if (this.clsName != other.clsName) return false
        if (this.vendorName != other.vendorName) return false
        if (this.isVendor != other.isVendor) return false
        if (this.optionsArray != other.optionsArray) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.clsName.hashCode()
        result = 31 * result + this.vendorName.hashCode()
        result = 31 * result + this.isVendor.hashCode()
        result = 31 * result + this.optionsArray.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            clsName: Pwstr = MutPtr(0L),
            vendorName: Pwstr = MutPtr(0L),
            isVendor: Bool = 0,
            optionsArray: MutPtr<DhcpOptionValueArray> = MutPtr(0L),
        ): DhcpAllOptionValues0 =
            DhcpAllOptionValues0(
                clsNameCtorArg = clsName,
                vendorNameCtorArg = vendorName,
                isVendor = isVendor,
                optionsArrayCtorArg = optionsArray,
            )
    }
}

public class DhcpAllOptionValuesPb internal constructor(
    public var flags: UInt,
    public var numElements: UInt,
    optionsCtorArg: MutPtr<DhcpAllOptionValuesPb0>,
) {
    public var options: MutPtr<DhcpAllOptionValuesPb0> = optionsCtorArg
        internal set

    public constructor() : this(
        flags = 0u,
        numElements = 0u,
        optionsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.flags

    public operator fun component2(): UInt = this.numElements

    public operator fun component3(): MutPtr<DhcpAllOptionValuesPb0> = this.options

    public fun copy(flags: UInt = this.flags, numElements: UInt = this.numElements, options: MutPtr<DhcpAllOptionValuesPb0> = this.options): DhcpAllOptionValuesPb = DhcpAllOptionValuesPb(flags = flags, numElements = numElements, optionsCtorArg = options)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpAllOptionValuesPb) return false
        if (this.flags != other.flags) return false
        if (this.numElements != other.numElements) return false
        if (this.options != other.options) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.numElements.hashCode()
        result = 31 * result + this.options.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpAllOptionValuesPb> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpAllOptionValuesPb> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DhcpAllOptionValuesPb =
                    DhcpAllOptionValuesPb(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<DhcpAllOptionValuesPb0>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DhcpAllOptionValuesPb) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.numElements)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<DhcpAllOptionValuesPb0>(64)
                    ).writeNative(addr + 8L, value.options)
                }
            }

        public operator fun invoke(
            flags: UInt = 0u,
            numElements: UInt = 0u,
            options: MutPtr<DhcpAllOptionValuesPb0> = MutPtr(0L),
        ): DhcpAllOptionValuesPb =
            DhcpAllOptionValuesPb(
                flags = flags,
                numElements = numElements,
                optionsCtorArg = options,
            )
    }
}

public class DhcpAllOptionValuesPb0 internal constructor(
    policyNameCtorArg: Pwstr,
    vendorNameCtorArg: Pwstr,
    public var isVendor: Bool,
    optionsArrayCtorArg: MutPtr<DhcpOptionValueArray>,
) {
    public var policyName: Pwstr = policyNameCtorArg
        internal set

    public var vendorName: Pwstr = vendorNameCtorArg
        internal set

    public var optionsArray: MutPtr<DhcpOptionValueArray> = optionsArrayCtorArg
        internal set

    public constructor() : this(
        policyNameCtorArg = MutPtr(0L),
        vendorNameCtorArg = MutPtr(0L),
        isVendor = 0,
        optionsArrayCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.policyName

    public operator fun component2(): Pwstr = this.vendorName

    public operator fun component3(): Bool = this.isVendor

    public operator fun component4(): MutPtr<DhcpOptionValueArray> = this.optionsArray

    public fun copy(policyName: Pwstr = this.policyName, vendorName: Pwstr = this.vendorName, isVendor: Bool = this.isVendor, optionsArray: MutPtr<DhcpOptionValueArray> = this.optionsArray): DhcpAllOptionValuesPb0 = DhcpAllOptionValuesPb0(policyNameCtorArg = policyName, vendorNameCtorArg = vendorName, isVendor = isVendor, optionsArrayCtorArg = optionsArray)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpAllOptionValuesPb0) return false
        if (this.policyName != other.policyName) return false
        if (this.vendorName != other.vendorName) return false
        if (this.isVendor != other.isVendor) return false
        if (this.optionsArray != other.optionsArray) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.policyName.hashCode()
        result = 31 * result + this.vendorName.hashCode()
        result = 31 * result + this.isVendor.hashCode()
        result = 31 * result + this.optionsArray.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            policyName: Pwstr = MutPtr(0L),
            vendorName: Pwstr = MutPtr(0L),
            isVendor: Bool = 0,
            optionsArray: MutPtr<DhcpOptionValueArray> = MutPtr(0L),
        ): DhcpAllOptionValuesPb0 =
            DhcpAllOptionValuesPb0(
                policyNameCtorArg = policyName,
                vendorNameCtorArg = vendorName,
                isVendor = isVendor,
                optionsArrayCtorArg = optionsArray,
            )
    }
}

public data class DhcpAttrib(
    public var dhcpAttribId: UInt = 0u,
    public var dhcpAttribType: UInt = 0u,
    public var anonymous: DhcpAttrib0 = DhcpAttrib0(),
)

public data class DhcpAttrib0(
    public var dhcpAttribBool: Bool = 0,
    public var dhcpAttribUlong: UInt = 0u,
)

public class DhcpAttribArray internal constructor(
    public var numElements: UInt,
    dhcpAttribsCtorArg: MutPtr<DhcpAttrib>,
) {
    public var dhcpAttribs: MutPtr<DhcpAttrib> = dhcpAttribsCtorArg
        internal set

    public constructor() : this(
        numElements = 0u,
        dhcpAttribsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numElements

    public operator fun component2(): MutPtr<DhcpAttrib> = this.dhcpAttribs

    public fun copy(numElements: UInt = this.numElements, dhcpAttribs: MutPtr<DhcpAttrib> = this.dhcpAttribs): DhcpAttribArray = DhcpAttribArray(numElements = numElements, dhcpAttribsCtorArg = dhcpAttribs)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpAttribArray) return false
        if (this.numElements != other.numElements) return false
        if (this.dhcpAttribs != other.dhcpAttribs) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numElements.hashCode()
        result = 31 * result + this.dhcpAttribs.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpAttribArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpAttribArray> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DhcpAttribArray =
                    DhcpAttribArray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<DhcpAttrib>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DhcpAttribArray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numElements)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<DhcpAttrib>(64)
                    ).writeNative(addr + 8L, value.dhcpAttribs)
                }
            }

        public operator fun invoke(
            numElements: UInt = 0u,
            dhcpAttribs: MutPtr<DhcpAttrib> = MutPtr(0L),
        ): DhcpAttribArray =
            DhcpAttribArray(
                numElements = numElements,
                dhcpAttribsCtorArg = dhcpAttribs,
            )
    }
}

public class DhcpBinaryData internal constructor(
    public var dataLength: UInt,
    dataCtorArg: MutPtr<UByte>,
) {
    public var data: MutPtr<UByte> = dataCtorArg
        internal set

    public constructor() : this(
        dataLength = 0u,
        dataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dataLength

    public operator fun component2(): MutPtr<UByte> = this.data

    public fun copy(dataLength: UInt = this.dataLength, data: MutPtr<UByte> = this.data): DhcpBinaryData = DhcpBinaryData(dataLength = dataLength, dataCtorArg = data)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpBinaryData) return false
        if (this.dataLength != other.dataLength) return false
        if (this.data != other.data) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dataLength.hashCode()
        result = 31 * result + this.data.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpBinaryData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpBinaryData> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DhcpBinaryData =
                    DhcpBinaryData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DhcpBinaryData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dataLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.data)
                }
            }

        public operator fun invoke(
            dataLength: UInt = 0u,
            data: MutPtr<UByte> = MutPtr(0L),
        ): DhcpBinaryData =
            DhcpBinaryData(
                dataLength = dataLength,
                dataCtorArg = data,
            )
    }
}

public class DhcpBindElement internal constructor(
    public var flags: UInt,
    public var fBoundToDHCPServer: Bool,
    public var adapterPrimaryAddress: UInt,
    public var adapterSubnetAddress: UInt,
    ifDescriptionCtorArg: Pwstr,
    public var ifIdSize: UInt,
    ifIdCtorArg: MutPtr<UByte>,
) {
    public var ifDescription: Pwstr = ifDescriptionCtorArg
        internal set

    public var ifId: MutPtr<UByte> = ifIdCtorArg
        internal set

    public constructor() : this(
        flags = 0u,
        fBoundToDHCPServer = 0,
        adapterPrimaryAddress = 0u,
        adapterSubnetAddress = 0u,
        ifDescriptionCtorArg = MutPtr(0L),
        ifIdSize = 0u,
        ifIdCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.flags

    public operator fun component2(): Bool = this.fBoundToDHCPServer

    public operator fun component3(): UInt = this.adapterPrimaryAddress

    public operator fun component4(): UInt = this.adapterSubnetAddress

    public operator fun component5(): Pwstr = this.ifDescription

    public operator fun component6(): UInt = this.ifIdSize

    public operator fun component7(): MutPtr<UByte> = this.ifId

    public fun copy(flags: UInt = this.flags, fBoundToDHCPServer: Bool = this.fBoundToDHCPServer, adapterPrimaryAddress: UInt = this.adapterPrimaryAddress, adapterSubnetAddress: UInt = this.adapterSubnetAddress, ifDescription: Pwstr = this.ifDescription, ifIdSize: UInt = this.ifIdSize, ifId: MutPtr<UByte> = this.ifId): DhcpBindElement = DhcpBindElement(flags = flags, fBoundToDHCPServer = fBoundToDHCPServer, adapterPrimaryAddress = adapterPrimaryAddress, adapterSubnetAddress = adapterSubnetAddress, ifDescriptionCtorArg = ifDescription, ifIdSize = ifIdSize, ifIdCtorArg = ifId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpBindElement) return false
        if (this.flags != other.flags) return false
        if (this.fBoundToDHCPServer != other.fBoundToDHCPServer) return false
        if (this.adapterPrimaryAddress != other.adapterPrimaryAddress) return false
        if (this.adapterSubnetAddress != other.adapterSubnetAddress) return false
        if (this.ifDescription != other.ifDescription) return false
        if (this.ifIdSize != other.ifIdSize) return false
        if (this.ifId != other.ifId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.fBoundToDHCPServer.hashCode()
        result = 31 * result + this.adapterPrimaryAddress.hashCode()
        result = 31 * result + this.adapterSubnetAddress.hashCode()
        result = 31 * result + this.ifDescription.hashCode()
        result = 31 * result + this.ifIdSize.hashCode()
        result = 31 * result + this.ifId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            flags: UInt = 0u,
            fBoundToDHCPServer: Bool = 0,
            adapterPrimaryAddress: UInt = 0u,
            adapterSubnetAddress: UInt = 0u,
            ifDescription: Pwstr = MutPtr(0L),
            ifIdSize: UInt = 0u,
            ifId: MutPtr<UByte> = MutPtr(0L),
        ): DhcpBindElement =
            DhcpBindElement(
                flags = flags,
                fBoundToDHCPServer = fBoundToDHCPServer,
                adapterPrimaryAddress = adapterPrimaryAddress,
                adapterSubnetAddress = adapterSubnetAddress,
                ifDescriptionCtorArg = ifDescription,
                ifIdSize = ifIdSize,
                ifIdCtorArg = ifId,
            )
    }
}

public class DhcpBindElementArray internal constructor(
    public var numElements: UInt,
    elementsCtorArg: MutPtr<DhcpBindElement>,
) {
    public var elements: MutPtr<DhcpBindElement> = elementsCtorArg
        internal set

    public constructor() : this(
        numElements = 0u,
        elementsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numElements

    public operator fun component2(): MutPtr<DhcpBindElement> = this.elements

    public fun copy(numElements: UInt = this.numElements, elements: MutPtr<DhcpBindElement> = this.elements): DhcpBindElementArray = DhcpBindElementArray(numElements = numElements, elementsCtorArg = elements)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpBindElementArray) return false
        if (this.numElements != other.numElements) return false
        if (this.elements != other.elements) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numElements.hashCode()
        result = 31 * result + this.elements.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpBindElementArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpBindElementArray> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DhcpBindElementArray =
                    DhcpBindElementArray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<DhcpBindElement>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DhcpBindElementArray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numElements)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<DhcpBindElement>(64)
                    ).writeNative(addr + 8L, value.elements)
                }
            }

        public operator fun invoke(
            numElements: UInt = 0u,
            elements: MutPtr<DhcpBindElement> = MutPtr(0L),
        ): DhcpBindElementArray =
            DhcpBindElementArray(
                numElements = numElements,
                elementsCtorArg = elements,
            )
    }
}

public data class DhcpBootpIpRange(
    public var startAddress: UInt = 0u,
    public var endAddress: UInt = 0u,
    public var bootpAllocated: UInt = 0u,
    public var maxBootpAllowed: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpBootpIpRange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpBootpIpRange> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): DhcpBootpIpRange =
                    DhcpBootpIpRange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: DhcpBootpIpRange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.startAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.endAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.bootpAllocated)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.maxBootpAllowed)
                }
            }
    }
}

public class DhcpCalloutTable internal constructor(
    public var dhcpControlHook: LpdhcpControl,
    public var dhcpNewPktHook: LpdhcpNewpkt,
    public var dhcpPktDropHook: LpdhcpDropSend,
    public var dhcpPktSendHook: LpdhcpDropSend,
    public var dhcpAddressDelHook: LpdhcpProb,
    public var dhcpAddressOfferHook: LpdhcpGiveAddress,
    public var dhcpHandleOptionsHook: LpdhcpHandleOptions,
    public var dhcpDeleteClientHook: LpdhcpDeleteClient,
    dhcpExtensionHookCtorArg: MutPtr<CVoid>,
    dhcpReservedHookCtorArg: MutPtr<CVoid>,
) {
    public var dhcpExtensionHook: MutPtr<CVoid> = dhcpExtensionHookCtorArg
        internal set

    public var dhcpReservedHook: MutPtr<CVoid> = dhcpReservedHookCtorArg
        internal set

    public constructor() : this(
        dhcpControlHook = null,
        dhcpNewPktHook = null,
        dhcpPktDropHook = null,
        dhcpPktSendHook = null,
        dhcpAddressDelHook = null,
        dhcpAddressOfferHook = null,
        dhcpHandleOptionsHook = null,
        dhcpDeleteClientHook = null,
        dhcpExtensionHookCtorArg = MutPtr(0L),
        dhcpReservedHookCtorArg = MutPtr(0L),
    )

    public operator fun component1(): LpdhcpControl = this.dhcpControlHook

    public operator fun component2(): LpdhcpNewpkt = this.dhcpNewPktHook

    public operator fun component3(): LpdhcpDropSend = this.dhcpPktDropHook

    public operator fun component4(): LpdhcpDropSend = this.dhcpPktSendHook

    public operator fun component5(): LpdhcpProb = this.dhcpAddressDelHook

    public operator fun component6(): LpdhcpGiveAddress = this.dhcpAddressOfferHook

    public operator fun component7(): LpdhcpHandleOptions = this.dhcpHandleOptionsHook

    public operator fun component8(): LpdhcpDeleteClient = this.dhcpDeleteClientHook

    public operator fun component9(): MutPtr<CVoid> = this.dhcpExtensionHook

    public operator fun component10(): MutPtr<CVoid> = this.dhcpReservedHook

    public fun copy(dhcpControlHook: LpdhcpControl = this.dhcpControlHook, dhcpNewPktHook: LpdhcpNewpkt = this.dhcpNewPktHook, dhcpPktDropHook: LpdhcpDropSend = this.dhcpPktDropHook, dhcpPktSendHook: LpdhcpDropSend = this.dhcpPktSendHook, dhcpAddressDelHook: LpdhcpProb = this.dhcpAddressDelHook, dhcpAddressOfferHook: LpdhcpGiveAddress = this.dhcpAddressOfferHook, dhcpHandleOptionsHook: LpdhcpHandleOptions = this.dhcpHandleOptionsHook, dhcpDeleteClientHook: LpdhcpDeleteClient = this.dhcpDeleteClientHook, dhcpExtensionHook: MutPtr<CVoid> = this.dhcpExtensionHook, dhcpReservedHook: MutPtr<CVoid> = this.dhcpReservedHook): DhcpCalloutTable = DhcpCalloutTable(dhcpControlHook = dhcpControlHook, dhcpNewPktHook = dhcpNewPktHook, dhcpPktDropHook = dhcpPktDropHook, dhcpPktSendHook = dhcpPktSendHook, dhcpAddressDelHook = dhcpAddressDelHook, dhcpAddressOfferHook = dhcpAddressOfferHook, dhcpHandleOptionsHook = dhcpHandleOptionsHook, dhcpDeleteClientHook = dhcpDeleteClientHook, dhcpExtensionHookCtorArg = dhcpExtensionHook, dhcpReservedHookCtorArg = dhcpReservedHook)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpCalloutTable) return false
        if (this.dhcpControlHook != other.dhcpControlHook) return false
        if (this.dhcpNewPktHook != other.dhcpNewPktHook) return false
        if (this.dhcpPktDropHook != other.dhcpPktDropHook) return false
        if (this.dhcpPktSendHook != other.dhcpPktSendHook) return false
        if (this.dhcpAddressDelHook != other.dhcpAddressDelHook) return false
        if (this.dhcpAddressOfferHook != other.dhcpAddressOfferHook) return false
        if (this.dhcpHandleOptionsHook != other.dhcpHandleOptionsHook) return false
        if (this.dhcpDeleteClientHook != other.dhcpDeleteClientHook) return false
        if (this.dhcpExtensionHook != other.dhcpExtensionHook) return false
        if (this.dhcpReservedHook != other.dhcpReservedHook) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dhcpControlHook.hashCode()
        result = 31 * result + this.dhcpNewPktHook.hashCode()
        result = 31 * result + this.dhcpPktDropHook.hashCode()
        result = 31 * result + this.dhcpPktSendHook.hashCode()
        result = 31 * result + this.dhcpAddressDelHook.hashCode()
        result = 31 * result + this.dhcpAddressOfferHook.hashCode()
        result = 31 * result + this.dhcpHandleOptionsHook.hashCode()
        result = 31 * result + this.dhcpDeleteClientHook.hashCode()
        result = 31 * result + this.dhcpExtensionHook.hashCode()
        result = 31 * result + this.dhcpReservedHook.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dhcpControlHook: LpdhcpControl = null,
            dhcpNewPktHook: LpdhcpNewpkt = null,
            dhcpPktDropHook: LpdhcpDropSend = null,
            dhcpPktSendHook: LpdhcpDropSend = null,
            dhcpAddressDelHook: LpdhcpProb = null,
            dhcpAddressOfferHook: LpdhcpGiveAddress = null,
            dhcpHandleOptionsHook: LpdhcpHandleOptions = null,
            dhcpDeleteClientHook: LpdhcpDeleteClient = null,
            dhcpExtensionHook: MutPtr<CVoid> = MutPtr(0L),
            dhcpReservedHook: MutPtr<CVoid> = MutPtr(0L),
        ): DhcpCalloutTable =
            DhcpCalloutTable(
                dhcpControlHook = dhcpControlHook,
                dhcpNewPktHook = dhcpNewPktHook,
                dhcpPktDropHook = dhcpPktDropHook,
                dhcpPktSendHook = dhcpPktSendHook,
                dhcpAddressDelHook = dhcpAddressDelHook,
                dhcpAddressOfferHook = dhcpAddressOfferHook,
                dhcpHandleOptionsHook = dhcpHandleOptionsHook,
                dhcpDeleteClientHook = dhcpDeleteClientHook,
                dhcpExtensionHookCtorArg = dhcpExtensionHook,
                dhcpReservedHookCtorArg = dhcpReservedHook,
            )
    }
}

public class DhcpClassInfo internal constructor(
    clsNameCtorArg: Pwstr,
    classCommentCtorArg: Pwstr,
    public var classDataLength: UInt,
    public var isVendor: Bool,
    public var flags: UInt,
    classDataCtorArg: MutPtr<UByte>,
) {
    public var clsName: Pwstr = clsNameCtorArg
        internal set

    public var classComment: Pwstr = classCommentCtorArg
        internal set

    public var classData: MutPtr<UByte> = classDataCtorArg
        internal set

    public constructor() : this(
        clsNameCtorArg = MutPtr(0L),
        classCommentCtorArg = MutPtr(0L),
        classDataLength = 0u,
        isVendor = 0,
        flags = 0u,
        classDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.clsName

    public operator fun component2(): Pwstr = this.classComment

    public operator fun component3(): UInt = this.classDataLength

    public operator fun component4(): Bool = this.isVendor

    public operator fun component5(): UInt = this.flags

    public operator fun component6(): MutPtr<UByte> = this.classData

    public fun copy(clsName: Pwstr = this.clsName, classComment: Pwstr = this.classComment, classDataLength: UInt = this.classDataLength, isVendor: Bool = this.isVendor, flags: UInt = this.flags, classData: MutPtr<UByte> = this.classData): DhcpClassInfo = DhcpClassInfo(clsNameCtorArg = clsName, classCommentCtorArg = classComment, classDataLength = classDataLength, isVendor = isVendor, flags = flags, classDataCtorArg = classData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpClassInfo) return false
        if (this.clsName != other.clsName) return false
        if (this.classComment != other.classComment) return false
        if (this.classDataLength != other.classDataLength) return false
        if (this.isVendor != other.isVendor) return false
        if (this.flags != other.flags) return false
        if (this.classData != other.classData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.clsName.hashCode()
        result = 31 * result + this.classComment.hashCode()
        result = 31 * result + this.classDataLength.hashCode()
        result = 31 * result + this.isVendor.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.classData.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            clsName: Pwstr = MutPtr(0L),
            classComment: Pwstr = MutPtr(0L),
            classDataLength: UInt = 0u,
            isVendor: Bool = 0,
            flags: UInt = 0u,
            classData: MutPtr<UByte> = MutPtr(0L),
        ): DhcpClassInfo =
            DhcpClassInfo(
                clsNameCtorArg = clsName,
                classCommentCtorArg = classComment,
                classDataLength = classDataLength,
                isVendor = isVendor,
                flags = flags,
                classDataCtorArg = classData,
            )
    }
}

public class DhcpClassInfoArray internal constructor(
    public var numElements: UInt,
    classesCtorArg: MutPtr<DhcpClassInfo>,
) {
    public var classes: MutPtr<DhcpClassInfo> = classesCtorArg
        internal set

    public constructor() : this(
        numElements = 0u,
        classesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numElements

    public operator fun component2(): MutPtr<DhcpClassInfo> = this.classes

    public fun copy(numElements: UInt = this.numElements, classes: MutPtr<DhcpClassInfo> = this.classes): DhcpClassInfoArray = DhcpClassInfoArray(numElements = numElements, classesCtorArg = classes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpClassInfoArray) return false
        if (this.numElements != other.numElements) return false
        if (this.classes != other.classes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numElements.hashCode()
        result = 31 * result + this.classes.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpClassInfoArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpClassInfoArray> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DhcpClassInfoArray =
                    DhcpClassInfoArray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<DhcpClassInfo>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DhcpClassInfoArray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numElements)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<DhcpClassInfo>(64)
                    ).writeNative(addr + 8L, value.classes)
                }
            }

        public operator fun invoke(
            numElements: UInt = 0u,
            classes: MutPtr<DhcpClassInfo> = MutPtr(0L),
        ): DhcpClassInfoArray =
            DhcpClassInfoArray(
                numElements = numElements,
                classesCtorArg = classes,
            )
    }
}

public class DhcpClassInfoArrayV6 internal constructor(
    public var numElements: UInt,
    classesCtorArg: MutPtr<DhcpClassInfoV6>,
) {
    public var classes: MutPtr<DhcpClassInfoV6> = classesCtorArg
        internal set

    public constructor() : this(
        numElements = 0u,
        classesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numElements

    public operator fun component2(): MutPtr<DhcpClassInfoV6> = this.classes

    public fun copy(numElements: UInt = this.numElements, classes: MutPtr<DhcpClassInfoV6> = this.classes): DhcpClassInfoArrayV6 = DhcpClassInfoArrayV6(numElements = numElements, classesCtorArg = classes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpClassInfoArrayV6) return false
        if (this.numElements != other.numElements) return false
        if (this.classes != other.classes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numElements.hashCode()
        result = 31 * result + this.classes.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpClassInfoArrayV6> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpClassInfoArrayV6> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DhcpClassInfoArrayV6 =
                    DhcpClassInfoArrayV6(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<DhcpClassInfoV6>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DhcpClassInfoArrayV6) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numElements)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<DhcpClassInfoV6>(64)
                    ).writeNative(addr + 8L, value.classes)
                }
            }

        public operator fun invoke(
            numElements: UInt = 0u,
            classes: MutPtr<DhcpClassInfoV6> = MutPtr(0L),
        ): DhcpClassInfoArrayV6 =
            DhcpClassInfoArrayV6(
                numElements = numElements,
                classesCtorArg = classes,
            )
    }
}

public class DhcpClassInfoV6 internal constructor(
    clsNameCtorArg: Pwstr,
    classCommentCtorArg: Pwstr,
    public var classDataLength: UInt,
    public var isVendor: Bool,
    public var enterpriseNumber: UInt,
    public var flags: UInt,
    classDataCtorArg: MutPtr<UByte>,
) {
    public var clsName: Pwstr = clsNameCtorArg
        internal set

    public var classComment: Pwstr = classCommentCtorArg
        internal set

    public var classData: MutPtr<UByte> = classDataCtorArg
        internal set

    public constructor() : this(
        clsNameCtorArg = MutPtr(0L),
        classCommentCtorArg = MutPtr(0L),
        classDataLength = 0u,
        isVendor = 0,
        enterpriseNumber = 0u,
        flags = 0u,
        classDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.clsName

    public operator fun component2(): Pwstr = this.classComment

    public operator fun component3(): UInt = this.classDataLength

    public operator fun component4(): Bool = this.isVendor

    public operator fun component5(): UInt = this.enterpriseNumber

    public operator fun component6(): UInt = this.flags

    public operator fun component7(): MutPtr<UByte> = this.classData

    public fun copy(clsName: Pwstr = this.clsName, classComment: Pwstr = this.classComment, classDataLength: UInt = this.classDataLength, isVendor: Bool = this.isVendor, enterpriseNumber: UInt = this.enterpriseNumber, flags: UInt = this.flags, classData: MutPtr<UByte> = this.classData): DhcpClassInfoV6 = DhcpClassInfoV6(clsNameCtorArg = clsName, classCommentCtorArg = classComment, classDataLength = classDataLength, isVendor = isVendor, enterpriseNumber = enterpriseNumber, flags = flags, classDataCtorArg = classData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpClassInfoV6) return false
        if (this.clsName != other.clsName) return false
        if (this.classComment != other.classComment) return false
        if (this.classDataLength != other.classDataLength) return false
        if (this.isVendor != other.isVendor) return false
        if (this.enterpriseNumber != other.enterpriseNumber) return false
        if (this.flags != other.flags) return false
        if (this.classData != other.classData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.clsName.hashCode()
        result = 31 * result + this.classComment.hashCode()
        result = 31 * result + this.classDataLength.hashCode()
        result = 31 * result + this.isVendor.hashCode()
        result = 31 * result + this.enterpriseNumber.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.classData.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            clsName: Pwstr = MutPtr(0L),
            classComment: Pwstr = MutPtr(0L),
            classDataLength: UInt = 0u,
            isVendor: Bool = 0,
            enterpriseNumber: UInt = 0u,
            flags: UInt = 0u,
            classData: MutPtr<UByte> = MutPtr(0L),
        ): DhcpClassInfoV6 =
            DhcpClassInfoV6(
                clsNameCtorArg = clsName,
                classCommentCtorArg = classComment,
                classDataLength = classDataLength,
                isVendor = isVendor,
                enterpriseNumber = enterpriseNumber,
                flags = flags,
                classDataCtorArg = classData,
            )
    }
}

public class DhcpClientFilterStatusInfo internal constructor(
    public var clientIpAddress: UInt,
    public var subnetMask: UInt,
    public var clientHardwareAddress: DhcpBinaryData,
    clientNameCtorArg: Pwstr,
    clientCommentCtorArg: Pwstr,
    public var clientLeaseExpires: DateTime,
    public var ownerHost: DhcpHostInfo,
    public var bClientType: UByte,
    public var addressState: UByte,
    public var status: QuarantineStatus,
    public var probationEnds: DateTime,
    public var quarantineCapable: Bool,
    public var filterStatus: UInt,
) {
    public var clientName: Pwstr = clientNameCtorArg
        internal set

    public var clientComment: Pwstr = clientCommentCtorArg
        internal set

    public constructor() : this(
        clientIpAddress = 0u,
        subnetMask = 0u,
        clientHardwareAddress = DhcpBinaryData(),
        clientNameCtorArg = MutPtr(0L),
        clientCommentCtorArg = MutPtr(0L),
        clientLeaseExpires = DateTime(),
        ownerHost = DhcpHostInfo(),
        bClientType = 0u,
        addressState = 0u,
        status = 0,
        probationEnds = DateTime(),
        quarantineCapable = 0,
        filterStatus = 0u,
    )

    public operator fun component1(): UInt = this.clientIpAddress

    public operator fun component2(): UInt = this.subnetMask

    public operator fun component3(): DhcpBinaryData = this.clientHardwareAddress

    public operator fun component4(): Pwstr = this.clientName

    public operator fun component5(): Pwstr = this.clientComment

    public operator fun component6(): DateTime = this.clientLeaseExpires

    public operator fun component7(): DhcpHostInfo = this.ownerHost

    public operator fun component8(): UByte = this.bClientType

    public operator fun component9(): UByte = this.addressState

    public operator fun component10(): QuarantineStatus = this.status

    public operator fun component11(): DateTime = this.probationEnds

    public operator fun component12(): Bool = this.quarantineCapable

    public operator fun component13(): UInt = this.filterStatus

    public fun copy(clientIpAddress: UInt = this.clientIpAddress, subnetMask: UInt = this.subnetMask, clientHardwareAddress: DhcpBinaryData = this.clientHardwareAddress, clientName: Pwstr = this.clientName, clientComment: Pwstr = this.clientComment, clientLeaseExpires: DateTime = this.clientLeaseExpires, ownerHost: DhcpHostInfo = this.ownerHost, bClientType: UByte = this.bClientType, addressState: UByte = this.addressState, status: QuarantineStatus = this.status, probationEnds: DateTime = this.probationEnds, quarantineCapable: Bool = this.quarantineCapable, filterStatus: UInt = this.filterStatus): DhcpClientFilterStatusInfo = DhcpClientFilterStatusInfo(clientIpAddress = clientIpAddress, subnetMask = subnetMask, clientHardwareAddress = clientHardwareAddress, clientNameCtorArg = clientName, clientCommentCtorArg = clientComment, clientLeaseExpires = clientLeaseExpires, ownerHost = ownerHost, bClientType = bClientType, addressState = addressState, status = status, probationEnds = probationEnds, quarantineCapable = quarantineCapable, filterStatus = filterStatus)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpClientFilterStatusInfo) return false
        if (this.clientIpAddress != other.clientIpAddress) return false
        if (this.subnetMask != other.subnetMask) return false
        if (this.clientHardwareAddress != other.clientHardwareAddress) return false
        if (this.clientName != other.clientName) return false
        if (this.clientComment != other.clientComment) return false
        if (this.clientLeaseExpires != other.clientLeaseExpires) return false
        if (this.ownerHost != other.ownerHost) return false
        if (this.bClientType != other.bClientType) return false
        if (this.addressState != other.addressState) return false
        if (this.status != other.status) return false
        if (this.probationEnds != other.probationEnds) return false
        if (this.quarantineCapable != other.quarantineCapable) return false
        if (this.filterStatus != other.filterStatus) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.clientIpAddress.hashCode()
        result = 31 * result + this.subnetMask.hashCode()
        result = 31 * result + this.clientHardwareAddress.hashCode()
        result = 31 * result + this.clientName.hashCode()
        result = 31 * result + this.clientComment.hashCode()
        result = 31 * result + this.clientLeaseExpires.hashCode()
        result = 31 * result + this.ownerHost.hashCode()
        result = 31 * result + this.bClientType.hashCode()
        result = 31 * result + this.addressState.hashCode()
        result = 31 * result + this.status.hashCode()
        result = 31 * result + this.probationEnds.hashCode()
        result = 31 * result + this.quarantineCapable.hashCode()
        result = 31 * result + this.filterStatus.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            clientIpAddress: UInt = 0u,
            subnetMask: UInt = 0u,
            clientHardwareAddress: DhcpBinaryData = DhcpBinaryData(),
            clientName: Pwstr = MutPtr(0L),
            clientComment: Pwstr = MutPtr(0L),
            clientLeaseExpires: DateTime = DateTime(),
            ownerHost: DhcpHostInfo = DhcpHostInfo(),
            bClientType: UByte = 0u,
            addressState: UByte = 0u,
            status: QuarantineStatus = 0,
            probationEnds: DateTime = DateTime(),
            quarantineCapable: Bool = 0,
            filterStatus: UInt = 0u,
        ): DhcpClientFilterStatusInfo =
            DhcpClientFilterStatusInfo(
                clientIpAddress = clientIpAddress,
                subnetMask = subnetMask,
                clientHardwareAddress = clientHardwareAddress,
                clientNameCtorArg = clientName,
                clientCommentCtorArg = clientComment,
                clientLeaseExpires = clientLeaseExpires,
                ownerHost = ownerHost,
                bClientType = bClientType,
                addressState = addressState,
                status = status,
                probationEnds = probationEnds,
                quarantineCapable = quarantineCapable,
                filterStatus = filterStatus,
            )
    }
}

public class DhcpClientFilterStatusInfoArray internal constructor(
    public var numElements: UInt,
    clientsCtorArg: MutPtr<MutPtr<DhcpClientFilterStatusInfo>>,
) {
    public var clients: MutPtr<MutPtr<DhcpClientFilterStatusInfo>> = clientsCtorArg
        internal set

    public constructor() : this(
        numElements = 0u,
        clientsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numElements

    public operator fun component2(): MutPtr<MutPtr<DhcpClientFilterStatusInfo>> = this.clients

    public fun copy(numElements: UInt = this.numElements, clients: MutPtr<MutPtr<DhcpClientFilterStatusInfo>> = this.clients): DhcpClientFilterStatusInfoArray = DhcpClientFilterStatusInfoArray(numElements = numElements, clientsCtorArg = clients)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpClientFilterStatusInfoArray) return false
        if (this.numElements != other.numElements) return false
        if (this.clients != other.clients) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numElements.hashCode()
        result = 31 * result + this.clients.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpClientFilterStatusInfoArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpClientFilterStatusInfoArray> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DhcpClientFilterStatusInfoArray =
                    DhcpClientFilterStatusInfoArray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<DhcpClientFilterStatusInfo>>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DhcpClientFilterStatusInfoArray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numElements)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<DhcpClientFilterStatusInfo>>(64)
                    ).writeNative(addr + 8L, value.clients)
                }
            }

        public operator fun invoke(
            numElements: UInt = 0u,
            clients: MutPtr<MutPtr<DhcpClientFilterStatusInfo>> = MutPtr(0L),
        ): DhcpClientFilterStatusInfoArray =
            DhcpClientFilterStatusInfoArray(
                numElements = numElements,
                clientsCtorArg = clients,
            )
    }
}

public class DhcpClientInfo internal constructor(
    public var clientIpAddress: UInt,
    public var subnetMask: UInt,
    public var clientHardwareAddress: DhcpBinaryData,
    clientNameCtorArg: Pwstr,
    clientCommentCtorArg: Pwstr,
    public var clientLeaseExpires: DateTime,
    public var ownerHost: DhcpHostInfo,
) {
    public var clientName: Pwstr = clientNameCtorArg
        internal set

    public var clientComment: Pwstr = clientCommentCtorArg
        internal set

    public constructor() : this(
        clientIpAddress = 0u,
        subnetMask = 0u,
        clientHardwareAddress = DhcpBinaryData(),
        clientNameCtorArg = MutPtr(0L),
        clientCommentCtorArg = MutPtr(0L),
        clientLeaseExpires = DateTime(),
        ownerHost = DhcpHostInfo(),
    )

    public operator fun component1(): UInt = this.clientIpAddress

    public operator fun component2(): UInt = this.subnetMask

    public operator fun component3(): DhcpBinaryData = this.clientHardwareAddress

    public operator fun component4(): Pwstr = this.clientName

    public operator fun component5(): Pwstr = this.clientComment

    public operator fun component6(): DateTime = this.clientLeaseExpires

    public operator fun component7(): DhcpHostInfo = this.ownerHost

    public fun copy(clientIpAddress: UInt = this.clientIpAddress, subnetMask: UInt = this.subnetMask, clientHardwareAddress: DhcpBinaryData = this.clientHardwareAddress, clientName: Pwstr = this.clientName, clientComment: Pwstr = this.clientComment, clientLeaseExpires: DateTime = this.clientLeaseExpires, ownerHost: DhcpHostInfo = this.ownerHost): DhcpClientInfo = DhcpClientInfo(clientIpAddress = clientIpAddress, subnetMask = subnetMask, clientHardwareAddress = clientHardwareAddress, clientNameCtorArg = clientName, clientCommentCtorArg = clientComment, clientLeaseExpires = clientLeaseExpires, ownerHost = ownerHost)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpClientInfo) return false
        if (this.clientIpAddress != other.clientIpAddress) return false
        if (this.subnetMask != other.subnetMask) return false
        if (this.clientHardwareAddress != other.clientHardwareAddress) return false
        if (this.clientName != other.clientName) return false
        if (this.clientComment != other.clientComment) return false
        if (this.clientLeaseExpires != other.clientLeaseExpires) return false
        if (this.ownerHost != other.ownerHost) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.clientIpAddress.hashCode()
        result = 31 * result + this.subnetMask.hashCode()
        result = 31 * result + this.clientHardwareAddress.hashCode()
        result = 31 * result + this.clientName.hashCode()
        result = 31 * result + this.clientComment.hashCode()
        result = 31 * result + this.clientLeaseExpires.hashCode()
        result = 31 * result + this.ownerHost.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            clientIpAddress: UInt = 0u,
            subnetMask: UInt = 0u,
            clientHardwareAddress: DhcpBinaryData = DhcpBinaryData(),
            clientName: Pwstr = MutPtr(0L),
            clientComment: Pwstr = MutPtr(0L),
            clientLeaseExpires: DateTime = DateTime(),
            ownerHost: DhcpHostInfo = DhcpHostInfo(),
        ): DhcpClientInfo =
            DhcpClientInfo(
                clientIpAddress = clientIpAddress,
                subnetMask = subnetMask,
                clientHardwareAddress = clientHardwareAddress,
                clientNameCtorArg = clientName,
                clientCommentCtorArg = clientComment,
                clientLeaseExpires = clientLeaseExpires,
                ownerHost = ownerHost,
            )
    }
}

public class DhcpClientInfoArray internal constructor(
    public var numElements: UInt,
    clientsCtorArg: MutPtr<MutPtr<DhcpClientInfo>>,
) {
    public var clients: MutPtr<MutPtr<DhcpClientInfo>> = clientsCtorArg
        internal set

    public constructor() : this(
        numElements = 0u,
        clientsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numElements

    public operator fun component2(): MutPtr<MutPtr<DhcpClientInfo>> = this.clients

    public fun copy(numElements: UInt = this.numElements, clients: MutPtr<MutPtr<DhcpClientInfo>> = this.clients): DhcpClientInfoArray = DhcpClientInfoArray(numElements = numElements, clientsCtorArg = clients)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpClientInfoArray) return false
        if (this.numElements != other.numElements) return false
        if (this.clients != other.clients) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numElements.hashCode()
        result = 31 * result + this.clients.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpClientInfoArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpClientInfoArray> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DhcpClientInfoArray =
                    DhcpClientInfoArray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<DhcpClientInfo>>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DhcpClientInfoArray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numElements)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<DhcpClientInfo>>(64)
                    ).writeNative(addr + 8L, value.clients)
                }
            }

        public operator fun invoke(
            numElements: UInt = 0u,
            clients: MutPtr<MutPtr<DhcpClientInfo>> = MutPtr(0L),
        ): DhcpClientInfoArray =
            DhcpClientInfoArray(
                numElements = numElements,
                clientsCtorArg = clients,
            )
    }
}

public class DhcpClientInfoArrayV4 internal constructor(
    public var numElements: UInt,
    clientsCtorArg: MutPtr<MutPtr<DhcpClientInfoV4>>,
) {
    public var clients: MutPtr<MutPtr<DhcpClientInfoV4>> = clientsCtorArg
        internal set

    public constructor() : this(
        numElements = 0u,
        clientsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numElements

    public operator fun component2(): MutPtr<MutPtr<DhcpClientInfoV4>> = this.clients

    public fun copy(numElements: UInt = this.numElements, clients: MutPtr<MutPtr<DhcpClientInfoV4>> = this.clients): DhcpClientInfoArrayV4 = DhcpClientInfoArrayV4(numElements = numElements, clientsCtorArg = clients)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpClientInfoArrayV4) return false
        if (this.numElements != other.numElements) return false
        if (this.clients != other.clients) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numElements.hashCode()
        result = 31 * result + this.clients.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpClientInfoArrayV4> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpClientInfoArrayV4> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DhcpClientInfoArrayV4 =
                    DhcpClientInfoArrayV4(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<DhcpClientInfoV4>>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DhcpClientInfoArrayV4) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numElements)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<DhcpClientInfoV4>>(64)
                    ).writeNative(addr + 8L, value.clients)
                }
            }

        public operator fun invoke(
            numElements: UInt = 0u,
            clients: MutPtr<MutPtr<DhcpClientInfoV4>> = MutPtr(0L),
        ): DhcpClientInfoArrayV4 =
            DhcpClientInfoArrayV4(
                numElements = numElements,
                clientsCtorArg = clients,
            )
    }
}

public class DhcpClientInfoArrayV5 internal constructor(
    public var numElements: UInt,
    clientsCtorArg: MutPtr<MutPtr<DhcpClientInfoV5>>,
) {
    public var clients: MutPtr<MutPtr<DhcpClientInfoV5>> = clientsCtorArg
        internal set

    public constructor() : this(
        numElements = 0u,
        clientsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numElements

    public operator fun component2(): MutPtr<MutPtr<DhcpClientInfoV5>> = this.clients

    public fun copy(numElements: UInt = this.numElements, clients: MutPtr<MutPtr<DhcpClientInfoV5>> = this.clients): DhcpClientInfoArrayV5 = DhcpClientInfoArrayV5(numElements = numElements, clientsCtorArg = clients)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpClientInfoArrayV5) return false
        if (this.numElements != other.numElements) return false
        if (this.clients != other.clients) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numElements.hashCode()
        result = 31 * result + this.clients.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpClientInfoArrayV5> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpClientInfoArrayV5> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DhcpClientInfoArrayV5 =
                    DhcpClientInfoArrayV5(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<DhcpClientInfoV5>>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DhcpClientInfoArrayV5) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numElements)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<DhcpClientInfoV5>>(64)
                    ).writeNative(addr + 8L, value.clients)
                }
            }

        public operator fun invoke(
            numElements: UInt = 0u,
            clients: MutPtr<MutPtr<DhcpClientInfoV5>> = MutPtr(0L),
        ): DhcpClientInfoArrayV5 =
            DhcpClientInfoArrayV5(
                numElements = numElements,
                clientsCtorArg = clients,
            )
    }
}

public class DhcpClientInfoArrayV6 internal constructor(
    public var numElements: UInt,
    clientsCtorArg: MutPtr<MutPtr<DhcpClientInfoV6>>,
) {
    public var clients: MutPtr<MutPtr<DhcpClientInfoV6>> = clientsCtorArg
        internal set

    public constructor() : this(
        numElements = 0u,
        clientsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numElements

    public operator fun component2(): MutPtr<MutPtr<DhcpClientInfoV6>> = this.clients

    public fun copy(numElements: UInt = this.numElements, clients: MutPtr<MutPtr<DhcpClientInfoV6>> = this.clients): DhcpClientInfoArrayV6 = DhcpClientInfoArrayV6(numElements = numElements, clientsCtorArg = clients)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpClientInfoArrayV6) return false
        if (this.numElements != other.numElements) return false
        if (this.clients != other.clients) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numElements.hashCode()
        result = 31 * result + this.clients.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpClientInfoArrayV6> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpClientInfoArrayV6> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DhcpClientInfoArrayV6 =
                    DhcpClientInfoArrayV6(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<DhcpClientInfoV6>>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DhcpClientInfoArrayV6) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numElements)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<DhcpClientInfoV6>>(64)
                    ).writeNative(addr + 8L, value.clients)
                }
            }

        public operator fun invoke(
            numElements: UInt = 0u,
            clients: MutPtr<MutPtr<DhcpClientInfoV6>> = MutPtr(0L),
        ): DhcpClientInfoArrayV6 =
            DhcpClientInfoArrayV6(
                numElements = numElements,
                clientsCtorArg = clients,
            )
    }
}

public class DhcpClientInfoArrayVq internal constructor(
    public var numElements: UInt,
    clientsCtorArg: MutPtr<MutPtr<DhcpClientInfoVq>>,
) {
    public var clients: MutPtr<MutPtr<DhcpClientInfoVq>> = clientsCtorArg
        internal set

    public constructor() : this(
        numElements = 0u,
        clientsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numElements

    public operator fun component2(): MutPtr<MutPtr<DhcpClientInfoVq>> = this.clients

    public fun copy(numElements: UInt = this.numElements, clients: MutPtr<MutPtr<DhcpClientInfoVq>> = this.clients): DhcpClientInfoArrayVq = DhcpClientInfoArrayVq(numElements = numElements, clientsCtorArg = clients)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpClientInfoArrayVq) return false
        if (this.numElements != other.numElements) return false
        if (this.clients != other.clients) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numElements.hashCode()
        result = 31 * result + this.clients.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpClientInfoArrayVq> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpClientInfoArrayVq> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DhcpClientInfoArrayVq =
                    DhcpClientInfoArrayVq(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<DhcpClientInfoVq>>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DhcpClientInfoArrayVq) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numElements)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<DhcpClientInfoVq>>(64)
                    ).writeNative(addr + 8L, value.clients)
                }
            }

        public operator fun invoke(
            numElements: UInt = 0u,
            clients: MutPtr<MutPtr<DhcpClientInfoVq>> = MutPtr(0L),
        ): DhcpClientInfoArrayVq =
            DhcpClientInfoArrayVq(
                numElements = numElements,
                clientsCtorArg = clients,
            )
    }
}

public class DhcpClientInfoEx internal constructor(
    public var clientIpAddress: UInt,
    public var subnetMask: UInt,
    public var clientHardwareAddress: DhcpBinaryData,
    clientNameCtorArg: Pwstr,
    clientCommentCtorArg: Pwstr,
    public var clientLeaseExpires: DateTime,
    public var ownerHost: DhcpHostInfo,
    public var bClientType: UByte,
    public var addressState: UByte,
    public var status: QuarantineStatus,
    public var probationEnds: DateTime,
    public var quarantineCapable: Bool,
    public var filterStatus: UInt,
    policyNameCtorArg: Pwstr,
    propertiesCtorArg: MutPtr<DhcpPropertyArray>,
) {
    public var clientName: Pwstr = clientNameCtorArg
        internal set

    public var clientComment: Pwstr = clientCommentCtorArg
        internal set

    public var policyName: Pwstr = policyNameCtorArg
        internal set

    public var properties: MutPtr<DhcpPropertyArray> = propertiesCtorArg
        internal set

    public constructor() : this(
        clientIpAddress = 0u,
        subnetMask = 0u,
        clientHardwareAddress = DhcpBinaryData(),
        clientNameCtorArg = MutPtr(0L),
        clientCommentCtorArg = MutPtr(0L),
        clientLeaseExpires = DateTime(),
        ownerHost = DhcpHostInfo(),
        bClientType = 0u,
        addressState = 0u,
        status = 0,
        probationEnds = DateTime(),
        quarantineCapable = 0,
        filterStatus = 0u,
        policyNameCtorArg = MutPtr(0L),
        propertiesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.clientIpAddress

    public operator fun component2(): UInt = this.subnetMask

    public operator fun component3(): DhcpBinaryData = this.clientHardwareAddress

    public operator fun component4(): Pwstr = this.clientName

    public operator fun component5(): Pwstr = this.clientComment

    public operator fun component6(): DateTime = this.clientLeaseExpires

    public operator fun component7(): DhcpHostInfo = this.ownerHost

    public operator fun component8(): UByte = this.bClientType

    public operator fun component9(): UByte = this.addressState

    public operator fun component10(): QuarantineStatus = this.status

    public operator fun component11(): DateTime = this.probationEnds

    public operator fun component12(): Bool = this.quarantineCapable

    public operator fun component13(): UInt = this.filterStatus

    public operator fun component14(): Pwstr = this.policyName

    public operator fun component15(): MutPtr<DhcpPropertyArray> = this.properties

    public fun copy(clientIpAddress: UInt = this.clientIpAddress, subnetMask: UInt = this.subnetMask, clientHardwareAddress: DhcpBinaryData = this.clientHardwareAddress, clientName: Pwstr = this.clientName, clientComment: Pwstr = this.clientComment, clientLeaseExpires: DateTime = this.clientLeaseExpires, ownerHost: DhcpHostInfo = this.ownerHost, bClientType: UByte = this.bClientType, addressState: UByte = this.addressState, status: QuarantineStatus = this.status, probationEnds: DateTime = this.probationEnds, quarantineCapable: Bool = this.quarantineCapable, filterStatus: UInt = this.filterStatus, policyName: Pwstr = this.policyName, properties: MutPtr<DhcpPropertyArray> = this.properties): DhcpClientInfoEx = DhcpClientInfoEx(clientIpAddress = clientIpAddress, subnetMask = subnetMask, clientHardwareAddress = clientHardwareAddress, clientNameCtorArg = clientName, clientCommentCtorArg = clientComment, clientLeaseExpires = clientLeaseExpires, ownerHost = ownerHost, bClientType = bClientType, addressState = addressState, status = status, probationEnds = probationEnds, quarantineCapable = quarantineCapable, filterStatus = filterStatus, policyNameCtorArg = policyName, propertiesCtorArg = properties)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpClientInfoEx) return false
        if (this.clientIpAddress != other.clientIpAddress) return false
        if (this.subnetMask != other.subnetMask) return false
        if (this.clientHardwareAddress != other.clientHardwareAddress) return false
        if (this.clientName != other.clientName) return false
        if (this.clientComment != other.clientComment) return false
        if (this.clientLeaseExpires != other.clientLeaseExpires) return false
        if (this.ownerHost != other.ownerHost) return false
        if (this.bClientType != other.bClientType) return false
        if (this.addressState != other.addressState) return false
        if (this.status != other.status) return false
        if (this.probationEnds != other.probationEnds) return false
        if (this.quarantineCapable != other.quarantineCapable) return false
        if (this.filterStatus != other.filterStatus) return false
        if (this.policyName != other.policyName) return false
        if (this.properties != other.properties) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.clientIpAddress.hashCode()
        result = 31 * result + this.subnetMask.hashCode()
        result = 31 * result + this.clientHardwareAddress.hashCode()
        result = 31 * result + this.clientName.hashCode()
        result = 31 * result + this.clientComment.hashCode()
        result = 31 * result + this.clientLeaseExpires.hashCode()
        result = 31 * result + this.ownerHost.hashCode()
        result = 31 * result + this.bClientType.hashCode()
        result = 31 * result + this.addressState.hashCode()
        result = 31 * result + this.status.hashCode()
        result = 31 * result + this.probationEnds.hashCode()
        result = 31 * result + this.quarantineCapable.hashCode()
        result = 31 * result + this.filterStatus.hashCode()
        result = 31 * result + this.policyName.hashCode()
        result = 31 * result + this.properties.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            clientIpAddress: UInt = 0u,
            subnetMask: UInt = 0u,
            clientHardwareAddress: DhcpBinaryData = DhcpBinaryData(),
            clientName: Pwstr = MutPtr(0L),
            clientComment: Pwstr = MutPtr(0L),
            clientLeaseExpires: DateTime = DateTime(),
            ownerHost: DhcpHostInfo = DhcpHostInfo(),
            bClientType: UByte = 0u,
            addressState: UByte = 0u,
            status: QuarantineStatus = 0,
            probationEnds: DateTime = DateTime(),
            quarantineCapable: Bool = 0,
            filterStatus: UInt = 0u,
            policyName: Pwstr = MutPtr(0L),
            properties: MutPtr<DhcpPropertyArray> = MutPtr(0L),
        ): DhcpClientInfoEx =
            DhcpClientInfoEx(
                clientIpAddress = clientIpAddress,
                subnetMask = subnetMask,
                clientHardwareAddress = clientHardwareAddress,
                clientNameCtorArg = clientName,
                clientCommentCtorArg = clientComment,
                clientLeaseExpires = clientLeaseExpires,
                ownerHost = ownerHost,
                bClientType = bClientType,
                addressState = addressState,
                status = status,
                probationEnds = probationEnds,
                quarantineCapable = quarantineCapable,
                filterStatus = filterStatus,
                policyNameCtorArg = policyName,
                propertiesCtorArg = properties,
            )
    }
}

public class DhcpClientInfoExArray internal constructor(
    public var numElements: UInt,
    clientsCtorArg: MutPtr<MutPtr<DhcpClientInfoEx>>,
) {
    public var clients: MutPtr<MutPtr<DhcpClientInfoEx>> = clientsCtorArg
        internal set

    public constructor() : this(
        numElements = 0u,
        clientsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numElements

    public operator fun component2(): MutPtr<MutPtr<DhcpClientInfoEx>> = this.clients

    public fun copy(numElements: UInt = this.numElements, clients: MutPtr<MutPtr<DhcpClientInfoEx>> = this.clients): DhcpClientInfoExArray = DhcpClientInfoExArray(numElements = numElements, clientsCtorArg = clients)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpClientInfoExArray) return false
        if (this.numElements != other.numElements) return false
        if (this.clients != other.clients) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numElements.hashCode()
        result = 31 * result + this.clients.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpClientInfoExArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpClientInfoExArray> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DhcpClientInfoExArray =
                    DhcpClientInfoExArray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<DhcpClientInfoEx>>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DhcpClientInfoExArray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numElements)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<DhcpClientInfoEx>>(64)
                    ).writeNative(addr + 8L, value.clients)
                }
            }

        public operator fun invoke(
            numElements: UInt = 0u,
            clients: MutPtr<MutPtr<DhcpClientInfoEx>> = MutPtr(0L),
        ): DhcpClientInfoExArray =
            DhcpClientInfoExArray(
                numElements = numElements,
                clientsCtorArg = clients,
            )
    }
}

public class DhcpClientInfoPb internal constructor(
    public var clientIpAddress: UInt,
    public var subnetMask: UInt,
    public var clientHardwareAddress: DhcpBinaryData,
    clientNameCtorArg: Pwstr,
    clientCommentCtorArg: Pwstr,
    public var clientLeaseExpires: DateTime,
    public var ownerHost: DhcpHostInfo,
    public var bClientType: UByte,
    public var addressState: UByte,
    public var status: QuarantineStatus,
    public var probationEnds: DateTime,
    public var quarantineCapable: Bool,
    public var filterStatus: UInt,
    policyNameCtorArg: Pwstr,
) {
    public var clientName: Pwstr = clientNameCtorArg
        internal set

    public var clientComment: Pwstr = clientCommentCtorArg
        internal set

    public var policyName: Pwstr = policyNameCtorArg
        internal set

    public constructor() : this(
        clientIpAddress = 0u,
        subnetMask = 0u,
        clientHardwareAddress = DhcpBinaryData(),
        clientNameCtorArg = MutPtr(0L),
        clientCommentCtorArg = MutPtr(0L),
        clientLeaseExpires = DateTime(),
        ownerHost = DhcpHostInfo(),
        bClientType = 0u,
        addressState = 0u,
        status = 0,
        probationEnds = DateTime(),
        quarantineCapable = 0,
        filterStatus = 0u,
        policyNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.clientIpAddress

    public operator fun component2(): UInt = this.subnetMask

    public operator fun component3(): DhcpBinaryData = this.clientHardwareAddress

    public operator fun component4(): Pwstr = this.clientName

    public operator fun component5(): Pwstr = this.clientComment

    public operator fun component6(): DateTime = this.clientLeaseExpires

    public operator fun component7(): DhcpHostInfo = this.ownerHost

    public operator fun component8(): UByte = this.bClientType

    public operator fun component9(): UByte = this.addressState

    public operator fun component10(): QuarantineStatus = this.status

    public operator fun component11(): DateTime = this.probationEnds

    public operator fun component12(): Bool = this.quarantineCapable

    public operator fun component13(): UInt = this.filterStatus

    public operator fun component14(): Pwstr = this.policyName

    public fun copy(clientIpAddress: UInt = this.clientIpAddress, subnetMask: UInt = this.subnetMask, clientHardwareAddress: DhcpBinaryData = this.clientHardwareAddress, clientName: Pwstr = this.clientName, clientComment: Pwstr = this.clientComment, clientLeaseExpires: DateTime = this.clientLeaseExpires, ownerHost: DhcpHostInfo = this.ownerHost, bClientType: UByte = this.bClientType, addressState: UByte = this.addressState, status: QuarantineStatus = this.status, probationEnds: DateTime = this.probationEnds, quarantineCapable: Bool = this.quarantineCapable, filterStatus: UInt = this.filterStatus, policyName: Pwstr = this.policyName): DhcpClientInfoPb = DhcpClientInfoPb(clientIpAddress = clientIpAddress, subnetMask = subnetMask, clientHardwareAddress = clientHardwareAddress, clientNameCtorArg = clientName, clientCommentCtorArg = clientComment, clientLeaseExpires = clientLeaseExpires, ownerHost = ownerHost, bClientType = bClientType, addressState = addressState, status = status, probationEnds = probationEnds, quarantineCapable = quarantineCapable, filterStatus = filterStatus, policyNameCtorArg = policyName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpClientInfoPb) return false
        if (this.clientIpAddress != other.clientIpAddress) return false
        if (this.subnetMask != other.subnetMask) return false
        if (this.clientHardwareAddress != other.clientHardwareAddress) return false
        if (this.clientName != other.clientName) return false
        if (this.clientComment != other.clientComment) return false
        if (this.clientLeaseExpires != other.clientLeaseExpires) return false
        if (this.ownerHost != other.ownerHost) return false
        if (this.bClientType != other.bClientType) return false
        if (this.addressState != other.addressState) return false
        if (this.status != other.status) return false
        if (this.probationEnds != other.probationEnds) return false
        if (this.quarantineCapable != other.quarantineCapable) return false
        if (this.filterStatus != other.filterStatus) return false
        if (this.policyName != other.policyName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.clientIpAddress.hashCode()
        result = 31 * result + this.subnetMask.hashCode()
        result = 31 * result + this.clientHardwareAddress.hashCode()
        result = 31 * result + this.clientName.hashCode()
        result = 31 * result + this.clientComment.hashCode()
        result = 31 * result + this.clientLeaseExpires.hashCode()
        result = 31 * result + this.ownerHost.hashCode()
        result = 31 * result + this.bClientType.hashCode()
        result = 31 * result + this.addressState.hashCode()
        result = 31 * result + this.status.hashCode()
        result = 31 * result + this.probationEnds.hashCode()
        result = 31 * result + this.quarantineCapable.hashCode()
        result = 31 * result + this.filterStatus.hashCode()
        result = 31 * result + this.policyName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            clientIpAddress: UInt = 0u,
            subnetMask: UInt = 0u,
            clientHardwareAddress: DhcpBinaryData = DhcpBinaryData(),
            clientName: Pwstr = MutPtr(0L),
            clientComment: Pwstr = MutPtr(0L),
            clientLeaseExpires: DateTime = DateTime(),
            ownerHost: DhcpHostInfo = DhcpHostInfo(),
            bClientType: UByte = 0u,
            addressState: UByte = 0u,
            status: QuarantineStatus = 0,
            probationEnds: DateTime = DateTime(),
            quarantineCapable: Bool = 0,
            filterStatus: UInt = 0u,
            policyName: Pwstr = MutPtr(0L),
        ): DhcpClientInfoPb =
            DhcpClientInfoPb(
                clientIpAddress = clientIpAddress,
                subnetMask = subnetMask,
                clientHardwareAddress = clientHardwareAddress,
                clientNameCtorArg = clientName,
                clientCommentCtorArg = clientComment,
                clientLeaseExpires = clientLeaseExpires,
                ownerHost = ownerHost,
                bClientType = bClientType,
                addressState = addressState,
                status = status,
                probationEnds = probationEnds,
                quarantineCapable = quarantineCapable,
                filterStatus = filterStatus,
                policyNameCtorArg = policyName,
            )
    }
}

public class DhcpClientInfoPbArray internal constructor(
    public var numElements: UInt,
    clientsCtorArg: MutPtr<MutPtr<DhcpClientInfoPb>>,
) {
    public var clients: MutPtr<MutPtr<DhcpClientInfoPb>> = clientsCtorArg
        internal set

    public constructor() : this(
        numElements = 0u,
        clientsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numElements

    public operator fun component2(): MutPtr<MutPtr<DhcpClientInfoPb>> = this.clients

    public fun copy(numElements: UInt = this.numElements, clients: MutPtr<MutPtr<DhcpClientInfoPb>> = this.clients): DhcpClientInfoPbArray = DhcpClientInfoPbArray(numElements = numElements, clientsCtorArg = clients)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpClientInfoPbArray) return false
        if (this.numElements != other.numElements) return false
        if (this.clients != other.clients) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numElements.hashCode()
        result = 31 * result + this.clients.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpClientInfoPbArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpClientInfoPbArray> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DhcpClientInfoPbArray =
                    DhcpClientInfoPbArray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<DhcpClientInfoPb>>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DhcpClientInfoPbArray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numElements)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<DhcpClientInfoPb>>(64)
                    ).writeNative(addr + 8L, value.clients)
                }
            }

        public operator fun invoke(
            numElements: UInt = 0u,
            clients: MutPtr<MutPtr<DhcpClientInfoPb>> = MutPtr(0L),
        ): DhcpClientInfoPbArray =
            DhcpClientInfoPbArray(
                numElements = numElements,
                clientsCtorArg = clients,
            )
    }
}

public class DhcpClientInfoV4 internal constructor(
    public var clientIpAddress: UInt,
    public var subnetMask: UInt,
    public var clientHardwareAddress: DhcpBinaryData,
    clientNameCtorArg: Pwstr,
    clientCommentCtorArg: Pwstr,
    public var clientLeaseExpires: DateTime,
    public var ownerHost: DhcpHostInfo,
    public var bClientType: UByte,
) {
    public var clientName: Pwstr = clientNameCtorArg
        internal set

    public var clientComment: Pwstr = clientCommentCtorArg
        internal set

    public constructor() : this(
        clientIpAddress = 0u,
        subnetMask = 0u,
        clientHardwareAddress = DhcpBinaryData(),
        clientNameCtorArg = MutPtr(0L),
        clientCommentCtorArg = MutPtr(0L),
        clientLeaseExpires = DateTime(),
        ownerHost = DhcpHostInfo(),
        bClientType = 0u,
    )

    public operator fun component1(): UInt = this.clientIpAddress

    public operator fun component2(): UInt = this.subnetMask

    public operator fun component3(): DhcpBinaryData = this.clientHardwareAddress

    public operator fun component4(): Pwstr = this.clientName

    public operator fun component5(): Pwstr = this.clientComment

    public operator fun component6(): DateTime = this.clientLeaseExpires

    public operator fun component7(): DhcpHostInfo = this.ownerHost

    public operator fun component8(): UByte = this.bClientType

    public fun copy(clientIpAddress: UInt = this.clientIpAddress, subnetMask: UInt = this.subnetMask, clientHardwareAddress: DhcpBinaryData = this.clientHardwareAddress, clientName: Pwstr = this.clientName, clientComment: Pwstr = this.clientComment, clientLeaseExpires: DateTime = this.clientLeaseExpires, ownerHost: DhcpHostInfo = this.ownerHost, bClientType: UByte = this.bClientType): DhcpClientInfoV4 = DhcpClientInfoV4(clientIpAddress = clientIpAddress, subnetMask = subnetMask, clientHardwareAddress = clientHardwareAddress, clientNameCtorArg = clientName, clientCommentCtorArg = clientComment, clientLeaseExpires = clientLeaseExpires, ownerHost = ownerHost, bClientType = bClientType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpClientInfoV4) return false
        if (this.clientIpAddress != other.clientIpAddress) return false
        if (this.subnetMask != other.subnetMask) return false
        if (this.clientHardwareAddress != other.clientHardwareAddress) return false
        if (this.clientName != other.clientName) return false
        if (this.clientComment != other.clientComment) return false
        if (this.clientLeaseExpires != other.clientLeaseExpires) return false
        if (this.ownerHost != other.ownerHost) return false
        if (this.bClientType != other.bClientType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.clientIpAddress.hashCode()
        result = 31 * result + this.subnetMask.hashCode()
        result = 31 * result + this.clientHardwareAddress.hashCode()
        result = 31 * result + this.clientName.hashCode()
        result = 31 * result + this.clientComment.hashCode()
        result = 31 * result + this.clientLeaseExpires.hashCode()
        result = 31 * result + this.ownerHost.hashCode()
        result = 31 * result + this.bClientType.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            clientIpAddress: UInt = 0u,
            subnetMask: UInt = 0u,
            clientHardwareAddress: DhcpBinaryData = DhcpBinaryData(),
            clientName: Pwstr = MutPtr(0L),
            clientComment: Pwstr = MutPtr(0L),
            clientLeaseExpires: DateTime = DateTime(),
            ownerHost: DhcpHostInfo = DhcpHostInfo(),
            bClientType: UByte = 0u,
        ): DhcpClientInfoV4 =
            DhcpClientInfoV4(
                clientIpAddress = clientIpAddress,
                subnetMask = subnetMask,
                clientHardwareAddress = clientHardwareAddress,
                clientNameCtorArg = clientName,
                clientCommentCtorArg = clientComment,
                clientLeaseExpires = clientLeaseExpires,
                ownerHost = ownerHost,
                bClientType = bClientType,
            )
    }
}

public class DhcpClientInfoV5 internal constructor(
    public var clientIpAddress: UInt,
    public var subnetMask: UInt,
    public var clientHardwareAddress: DhcpBinaryData,
    clientNameCtorArg: Pwstr,
    clientCommentCtorArg: Pwstr,
    public var clientLeaseExpires: DateTime,
    public var ownerHost: DhcpHostInfo,
    public var bClientType: UByte,
    public var addressState: UByte,
) {
    public var clientName: Pwstr = clientNameCtorArg
        internal set

    public var clientComment: Pwstr = clientCommentCtorArg
        internal set

    public constructor() : this(
        clientIpAddress = 0u,
        subnetMask = 0u,
        clientHardwareAddress = DhcpBinaryData(),
        clientNameCtorArg = MutPtr(0L),
        clientCommentCtorArg = MutPtr(0L),
        clientLeaseExpires = DateTime(),
        ownerHost = DhcpHostInfo(),
        bClientType = 0u,
        addressState = 0u,
    )

    public operator fun component1(): UInt = this.clientIpAddress

    public operator fun component2(): UInt = this.subnetMask

    public operator fun component3(): DhcpBinaryData = this.clientHardwareAddress

    public operator fun component4(): Pwstr = this.clientName

    public operator fun component5(): Pwstr = this.clientComment

    public operator fun component6(): DateTime = this.clientLeaseExpires

    public operator fun component7(): DhcpHostInfo = this.ownerHost

    public operator fun component8(): UByte = this.bClientType

    public operator fun component9(): UByte = this.addressState

    public fun copy(clientIpAddress: UInt = this.clientIpAddress, subnetMask: UInt = this.subnetMask, clientHardwareAddress: DhcpBinaryData = this.clientHardwareAddress, clientName: Pwstr = this.clientName, clientComment: Pwstr = this.clientComment, clientLeaseExpires: DateTime = this.clientLeaseExpires, ownerHost: DhcpHostInfo = this.ownerHost, bClientType: UByte = this.bClientType, addressState: UByte = this.addressState): DhcpClientInfoV5 = DhcpClientInfoV5(clientIpAddress = clientIpAddress, subnetMask = subnetMask, clientHardwareAddress = clientHardwareAddress, clientNameCtorArg = clientName, clientCommentCtorArg = clientComment, clientLeaseExpires = clientLeaseExpires, ownerHost = ownerHost, bClientType = bClientType, addressState = addressState)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpClientInfoV5) return false
        if (this.clientIpAddress != other.clientIpAddress) return false
        if (this.subnetMask != other.subnetMask) return false
        if (this.clientHardwareAddress != other.clientHardwareAddress) return false
        if (this.clientName != other.clientName) return false
        if (this.clientComment != other.clientComment) return false
        if (this.clientLeaseExpires != other.clientLeaseExpires) return false
        if (this.ownerHost != other.ownerHost) return false
        if (this.bClientType != other.bClientType) return false
        if (this.addressState != other.addressState) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.clientIpAddress.hashCode()
        result = 31 * result + this.subnetMask.hashCode()
        result = 31 * result + this.clientHardwareAddress.hashCode()
        result = 31 * result + this.clientName.hashCode()
        result = 31 * result + this.clientComment.hashCode()
        result = 31 * result + this.clientLeaseExpires.hashCode()
        result = 31 * result + this.ownerHost.hashCode()
        result = 31 * result + this.bClientType.hashCode()
        result = 31 * result + this.addressState.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            clientIpAddress: UInt = 0u,
            subnetMask: UInt = 0u,
            clientHardwareAddress: DhcpBinaryData = DhcpBinaryData(),
            clientName: Pwstr = MutPtr(0L),
            clientComment: Pwstr = MutPtr(0L),
            clientLeaseExpires: DateTime = DateTime(),
            ownerHost: DhcpHostInfo = DhcpHostInfo(),
            bClientType: UByte = 0u,
            addressState: UByte = 0u,
        ): DhcpClientInfoV5 =
            DhcpClientInfoV5(
                clientIpAddress = clientIpAddress,
                subnetMask = subnetMask,
                clientHardwareAddress = clientHardwareAddress,
                clientNameCtorArg = clientName,
                clientCommentCtorArg = clientComment,
                clientLeaseExpires = clientLeaseExpires,
                ownerHost = ownerHost,
                bClientType = bClientType,
                addressState = addressState,
            )
    }
}

public class DhcpClientInfoV6 internal constructor(
    public var clientIpAddress: DhcpIpv6Address,
    public var clientDUID: DhcpBinaryData,
    public var addressType: UInt,
    public var iaid: UInt,
    clientNameCtorArg: Pwstr,
    clientCommentCtorArg: Pwstr,
    public var clientValidLeaseExpires: DateTime,
    public var clientPrefLeaseExpires: DateTime,
    public var ownerHost: DhcpHostInfoV6,
) {
    public var clientName: Pwstr = clientNameCtorArg
        internal set

    public var clientComment: Pwstr = clientCommentCtorArg
        internal set

    public constructor() : this(
        clientIpAddress = DhcpIpv6Address(),
        clientDUID = DhcpBinaryData(),
        addressType = 0u,
        iaid = 0u,
        clientNameCtorArg = MutPtr(0L),
        clientCommentCtorArg = MutPtr(0L),
        clientValidLeaseExpires = DateTime(),
        clientPrefLeaseExpires = DateTime(),
        ownerHost = DhcpHostInfoV6(),
    )

    public operator fun component1(): DhcpIpv6Address = this.clientIpAddress

    public operator fun component2(): DhcpBinaryData = this.clientDUID

    public operator fun component3(): UInt = this.addressType

    public operator fun component4(): UInt = this.iaid

    public operator fun component5(): Pwstr = this.clientName

    public operator fun component6(): Pwstr = this.clientComment

    public operator fun component7(): DateTime = this.clientValidLeaseExpires

    public operator fun component8(): DateTime = this.clientPrefLeaseExpires

    public operator fun component9(): DhcpHostInfoV6 = this.ownerHost

    public fun copy(clientIpAddress: DhcpIpv6Address = this.clientIpAddress, clientDUID: DhcpBinaryData = this.clientDUID, addressType: UInt = this.addressType, iaid: UInt = this.iaid, clientName: Pwstr = this.clientName, clientComment: Pwstr = this.clientComment, clientValidLeaseExpires: DateTime = this.clientValidLeaseExpires, clientPrefLeaseExpires: DateTime = this.clientPrefLeaseExpires, ownerHost: DhcpHostInfoV6 = this.ownerHost): DhcpClientInfoV6 = DhcpClientInfoV6(clientIpAddress = clientIpAddress, clientDUID = clientDUID, addressType = addressType, iaid = iaid, clientNameCtorArg = clientName, clientCommentCtorArg = clientComment, clientValidLeaseExpires = clientValidLeaseExpires, clientPrefLeaseExpires = clientPrefLeaseExpires, ownerHost = ownerHost)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpClientInfoV6) return false
        if (this.clientIpAddress != other.clientIpAddress) return false
        if (this.clientDUID != other.clientDUID) return false
        if (this.addressType != other.addressType) return false
        if (this.iaid != other.iaid) return false
        if (this.clientName != other.clientName) return false
        if (this.clientComment != other.clientComment) return false
        if (this.clientValidLeaseExpires != other.clientValidLeaseExpires) return false
        if (this.clientPrefLeaseExpires != other.clientPrefLeaseExpires) return false
        if (this.ownerHost != other.ownerHost) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.clientIpAddress.hashCode()
        result = 31 * result + this.clientDUID.hashCode()
        result = 31 * result + this.addressType.hashCode()
        result = 31 * result + this.iaid.hashCode()
        result = 31 * result + this.clientName.hashCode()
        result = 31 * result + this.clientComment.hashCode()
        result = 31 * result + this.clientValidLeaseExpires.hashCode()
        result = 31 * result + this.clientPrefLeaseExpires.hashCode()
        result = 31 * result + this.ownerHost.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            clientIpAddress: DhcpIpv6Address = DhcpIpv6Address(),
            clientDUID: DhcpBinaryData = DhcpBinaryData(),
            addressType: UInt = 0u,
            iaid: UInt = 0u,
            clientName: Pwstr = MutPtr(0L),
            clientComment: Pwstr = MutPtr(0L),
            clientValidLeaseExpires: DateTime = DateTime(),
            clientPrefLeaseExpires: DateTime = DateTime(),
            ownerHost: DhcpHostInfoV6 = DhcpHostInfoV6(),
        ): DhcpClientInfoV6 =
            DhcpClientInfoV6(
                clientIpAddress = clientIpAddress,
                clientDUID = clientDUID,
                addressType = addressType,
                iaid = iaid,
                clientNameCtorArg = clientName,
                clientCommentCtorArg = clientComment,
                clientValidLeaseExpires = clientValidLeaseExpires,
                clientPrefLeaseExpires = clientPrefLeaseExpires,
                ownerHost = ownerHost,
            )
    }
}

public class DhcpClientInfoVq internal constructor(
    public var clientIpAddress: UInt,
    public var subnetMask: UInt,
    public var clientHardwareAddress: DhcpBinaryData,
    clientNameCtorArg: Pwstr,
    clientCommentCtorArg: Pwstr,
    public var clientLeaseExpires: DateTime,
    public var ownerHost: DhcpHostInfo,
    public var bClientType: UByte,
    public var addressState: UByte,
    public var status: QuarantineStatus,
    public var probationEnds: DateTime,
    public var quarantineCapable: Bool,
) {
    public var clientName: Pwstr = clientNameCtorArg
        internal set

    public var clientComment: Pwstr = clientCommentCtorArg
        internal set

    public constructor() : this(
        clientIpAddress = 0u,
        subnetMask = 0u,
        clientHardwareAddress = DhcpBinaryData(),
        clientNameCtorArg = MutPtr(0L),
        clientCommentCtorArg = MutPtr(0L),
        clientLeaseExpires = DateTime(),
        ownerHost = DhcpHostInfo(),
        bClientType = 0u,
        addressState = 0u,
        status = 0,
        probationEnds = DateTime(),
        quarantineCapable = 0,
    )

    public operator fun component1(): UInt = this.clientIpAddress

    public operator fun component2(): UInt = this.subnetMask

    public operator fun component3(): DhcpBinaryData = this.clientHardwareAddress

    public operator fun component4(): Pwstr = this.clientName

    public operator fun component5(): Pwstr = this.clientComment

    public operator fun component6(): DateTime = this.clientLeaseExpires

    public operator fun component7(): DhcpHostInfo = this.ownerHost

    public operator fun component8(): UByte = this.bClientType

    public operator fun component9(): UByte = this.addressState

    public operator fun component10(): QuarantineStatus = this.status

    public operator fun component11(): DateTime = this.probationEnds

    public operator fun component12(): Bool = this.quarantineCapable

    public fun copy(clientIpAddress: UInt = this.clientIpAddress, subnetMask: UInt = this.subnetMask, clientHardwareAddress: DhcpBinaryData = this.clientHardwareAddress, clientName: Pwstr = this.clientName, clientComment: Pwstr = this.clientComment, clientLeaseExpires: DateTime = this.clientLeaseExpires, ownerHost: DhcpHostInfo = this.ownerHost, bClientType: UByte = this.bClientType, addressState: UByte = this.addressState, status: QuarantineStatus = this.status, probationEnds: DateTime = this.probationEnds, quarantineCapable: Bool = this.quarantineCapable): DhcpClientInfoVq = DhcpClientInfoVq(clientIpAddress = clientIpAddress, subnetMask = subnetMask, clientHardwareAddress = clientHardwareAddress, clientNameCtorArg = clientName, clientCommentCtorArg = clientComment, clientLeaseExpires = clientLeaseExpires, ownerHost = ownerHost, bClientType = bClientType, addressState = addressState, status = status, probationEnds = probationEnds, quarantineCapable = quarantineCapable)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpClientInfoVq) return false
        if (this.clientIpAddress != other.clientIpAddress) return false
        if (this.subnetMask != other.subnetMask) return false
        if (this.clientHardwareAddress != other.clientHardwareAddress) return false
        if (this.clientName != other.clientName) return false
        if (this.clientComment != other.clientComment) return false
        if (this.clientLeaseExpires != other.clientLeaseExpires) return false
        if (this.ownerHost != other.ownerHost) return false
        if (this.bClientType != other.bClientType) return false
        if (this.addressState != other.addressState) return false
        if (this.status != other.status) return false
        if (this.probationEnds != other.probationEnds) return false
        if (this.quarantineCapable != other.quarantineCapable) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.clientIpAddress.hashCode()
        result = 31 * result + this.subnetMask.hashCode()
        result = 31 * result + this.clientHardwareAddress.hashCode()
        result = 31 * result + this.clientName.hashCode()
        result = 31 * result + this.clientComment.hashCode()
        result = 31 * result + this.clientLeaseExpires.hashCode()
        result = 31 * result + this.ownerHost.hashCode()
        result = 31 * result + this.bClientType.hashCode()
        result = 31 * result + this.addressState.hashCode()
        result = 31 * result + this.status.hashCode()
        result = 31 * result + this.probationEnds.hashCode()
        result = 31 * result + this.quarantineCapable.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            clientIpAddress: UInt = 0u,
            subnetMask: UInt = 0u,
            clientHardwareAddress: DhcpBinaryData = DhcpBinaryData(),
            clientName: Pwstr = MutPtr(0L),
            clientComment: Pwstr = MutPtr(0L),
            clientLeaseExpires: DateTime = DateTime(),
            ownerHost: DhcpHostInfo = DhcpHostInfo(),
            bClientType: UByte = 0u,
            addressState: UByte = 0u,
            status: QuarantineStatus = 0,
            probationEnds: DateTime = DateTime(),
            quarantineCapable: Bool = 0,
        ): DhcpClientInfoVq =
            DhcpClientInfoVq(
                clientIpAddress = clientIpAddress,
                subnetMask = subnetMask,
                clientHardwareAddress = clientHardwareAddress,
                clientNameCtorArg = clientName,
                clientCommentCtorArg = clientComment,
                clientLeaseExpires = clientLeaseExpires,
                ownerHost = ownerHost,
                bClientType = bClientType,
                addressState = addressState,
                status = status,
                probationEnds = probationEnds,
                quarantineCapable = quarantineCapable,
            )
    }
}

public class DhcpFailoverRelationship internal constructor(
    public var primaryServer: UInt,
    public var secondaryServer: UInt,
    public var mode: DhcpFailoverMode,
    public var serverType: DhcpFailoverServer,
    public var state: FsmState,
    public var prevState: FsmState,
    public var mclt: UInt,
    public var safePeriod: UInt,
    relationshipNameCtorArg: Pwstr,
    primaryServerNameCtorArg: Pwstr,
    secondaryServerNameCtorArg: Pwstr,
    pScopesCtorArg: MutPtr<DhcpIpArray>,
    public var percentage: UByte,
    sharedSecretCtorArg: Pwstr,
) {
    public var relationshipName: Pwstr = relationshipNameCtorArg
        internal set

    public var primaryServerName: Pwstr = primaryServerNameCtorArg
        internal set

    public var secondaryServerName: Pwstr = secondaryServerNameCtorArg
        internal set

    public var pScopes: MutPtr<DhcpIpArray> = pScopesCtorArg
        internal set

    public var sharedSecret: Pwstr = sharedSecretCtorArg
        internal set

    public constructor() : this(
        primaryServer = 0u,
        secondaryServer = 0u,
        mode = 0,
        serverType = 0,
        state = 0,
        prevState = 0,
        mclt = 0u,
        safePeriod = 0u,
        relationshipNameCtorArg = MutPtr(0L),
        primaryServerNameCtorArg = MutPtr(0L),
        secondaryServerNameCtorArg = MutPtr(0L),
        pScopesCtorArg = MutPtr(0L),
        percentage = 0u,
        sharedSecretCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.primaryServer

    public operator fun component2(): UInt = this.secondaryServer

    public operator fun component3(): DhcpFailoverMode = this.mode

    public operator fun component4(): DhcpFailoverServer = this.serverType

    public operator fun component5(): FsmState = this.state

    public operator fun component6(): FsmState = this.prevState

    public operator fun component7(): UInt = this.mclt

    public operator fun component8(): UInt = this.safePeriod

    public operator fun component9(): Pwstr = this.relationshipName

    public operator fun component10(): Pwstr = this.primaryServerName

    public operator fun component11(): Pwstr = this.secondaryServerName

    public operator fun component12(): MutPtr<DhcpIpArray> = this.pScopes

    public operator fun component13(): UByte = this.percentage

    public operator fun component14(): Pwstr = this.sharedSecret

    public fun copy(primaryServer: UInt = this.primaryServer, secondaryServer: UInt = this.secondaryServer, mode: DhcpFailoverMode = this.mode, serverType: DhcpFailoverServer = this.serverType, state: FsmState = this.state, prevState: FsmState = this.prevState, mclt: UInt = this.mclt, safePeriod: UInt = this.safePeriod, relationshipName: Pwstr = this.relationshipName, primaryServerName: Pwstr = this.primaryServerName, secondaryServerName: Pwstr = this.secondaryServerName, pScopes: MutPtr<DhcpIpArray> = this.pScopes, percentage: UByte = this.percentage, sharedSecret: Pwstr = this.sharedSecret): DhcpFailoverRelationship = DhcpFailoverRelationship(primaryServer = primaryServer, secondaryServer = secondaryServer, mode = mode, serverType = serverType, state = state, prevState = prevState, mclt = mclt, safePeriod = safePeriod, relationshipNameCtorArg = relationshipName, primaryServerNameCtorArg = primaryServerName, secondaryServerNameCtorArg = secondaryServerName, pScopesCtorArg = pScopes, percentage = percentage, sharedSecretCtorArg = sharedSecret)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpFailoverRelationship) return false
        if (this.primaryServer != other.primaryServer) return false
        if (this.secondaryServer != other.secondaryServer) return false
        if (this.mode != other.mode) return false
        if (this.serverType != other.serverType) return false
        if (this.state != other.state) return false
        if (this.prevState != other.prevState) return false
        if (this.mclt != other.mclt) return false
        if (this.safePeriod != other.safePeriod) return false
        if (this.relationshipName != other.relationshipName) return false
        if (this.primaryServerName != other.primaryServerName) return false
        if (this.secondaryServerName != other.secondaryServerName) return false
        if (this.pScopes != other.pScopes) return false
        if (this.percentage != other.percentage) return false
        if (this.sharedSecret != other.sharedSecret) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.primaryServer.hashCode()
        result = 31 * result + this.secondaryServer.hashCode()
        result = 31 * result + this.mode.hashCode()
        result = 31 * result + this.serverType.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.prevState.hashCode()
        result = 31 * result + this.mclt.hashCode()
        result = 31 * result + this.safePeriod.hashCode()
        result = 31 * result + this.relationshipName.hashCode()
        result = 31 * result + this.primaryServerName.hashCode()
        result = 31 * result + this.secondaryServerName.hashCode()
        result = 31 * result + this.pScopes.hashCode()
        result = 31 * result + this.percentage.hashCode()
        result = 31 * result + this.sharedSecret.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            primaryServer: UInt = 0u,
            secondaryServer: UInt = 0u,
            mode: DhcpFailoverMode = 0,
            serverType: DhcpFailoverServer = 0,
            state: FsmState = 0,
            prevState: FsmState = 0,
            mclt: UInt = 0u,
            safePeriod: UInt = 0u,
            relationshipName: Pwstr = MutPtr(0L),
            primaryServerName: Pwstr = MutPtr(0L),
            secondaryServerName: Pwstr = MutPtr(0L),
            pScopes: MutPtr<DhcpIpArray> = MutPtr(0L),
            percentage: UByte = 0u,
            sharedSecret: Pwstr = MutPtr(0L),
        ): DhcpFailoverRelationship =
            DhcpFailoverRelationship(
                primaryServer = primaryServer,
                secondaryServer = secondaryServer,
                mode = mode,
                serverType = serverType,
                state = state,
                prevState = prevState,
                mclt = mclt,
                safePeriod = safePeriod,
                relationshipNameCtorArg = relationshipName,
                primaryServerNameCtorArg = primaryServerName,
                secondaryServerNameCtorArg = secondaryServerName,
                pScopesCtorArg = pScopes,
                percentage = percentage,
                sharedSecretCtorArg = sharedSecret,
            )
    }
}

public class DhcpFailoverRelationshipArray internal constructor(
    public var numElements: UInt,
    pRelationshipsCtorArg: MutPtr<DhcpFailoverRelationship>,
) {
    public var pRelationships: MutPtr<DhcpFailoverRelationship> = pRelationshipsCtorArg
        internal set

    public constructor() : this(
        numElements = 0u,
        pRelationshipsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numElements

    public operator fun component2(): MutPtr<DhcpFailoverRelationship> = this.pRelationships

    public fun copy(numElements: UInt = this.numElements, pRelationships: MutPtr<DhcpFailoverRelationship> = this.pRelationships): DhcpFailoverRelationshipArray = DhcpFailoverRelationshipArray(numElements = numElements, pRelationshipsCtorArg = pRelationships)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpFailoverRelationshipArray) return false
        if (this.numElements != other.numElements) return false
        if (this.pRelationships != other.pRelationships) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numElements.hashCode()
        result = 31 * result + this.pRelationships.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpFailoverRelationshipArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpFailoverRelationshipArray> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DhcpFailoverRelationshipArray =
                    DhcpFailoverRelationshipArray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<DhcpFailoverRelationship>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DhcpFailoverRelationshipArray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numElements)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<DhcpFailoverRelationship>(64)
                    ).writeNative(addr + 8L, value.pRelationships)
                }
            }

        public operator fun invoke(
            numElements: UInt = 0u,
            pRelationships: MutPtr<DhcpFailoverRelationship> = MutPtr(0L),
        ): DhcpFailoverRelationshipArray =
            DhcpFailoverRelationshipArray(
                numElements = numElements,
                pRelationshipsCtorArg = pRelationships,
            )
    }
}

public data class DhcpFailoverStatistics(
    public var numAddr: UInt = 0u,
    public var addrFree: UInt = 0u,
    public var addrInUse: UInt = 0u,
    public var partnerAddrFree: UInt = 0u,
    public var thisAddrFree: UInt = 0u,
    public var partnerAddrInUse: UInt = 0u,
    public var thisAddrInUse: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpFailoverStatistics> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpFailoverStatistics> {
                override val sizeBytes: Long = 28L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): DhcpFailoverStatistics =
                    DhcpFailoverStatistics(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: DhcpFailoverStatistics) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.addrFree)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.addrInUse)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.partnerAddrFree)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.thisAddrFree)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.partnerAddrInUse)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.thisAddrInUse)
                }
            }
    }
}

public class DhcpFilterAddInfo internal constructor(
    public var addrPatt: DhcpAddrPattern,
    commentCtorArg: Pwstr,
    public var listType: DhcpFilterListType,
) {
    public var comment: Pwstr = commentCtorArg
        internal set

    public constructor() : this(
        addrPatt = DhcpAddrPattern(),
        commentCtorArg = MutPtr(0L),
        listType = 0,
    )

    public operator fun component1(): DhcpAddrPattern = this.addrPatt

    public operator fun component2(): Pwstr = this.comment

    public operator fun component3(): DhcpFilterListType = this.listType

    public fun copy(addrPatt: DhcpAddrPattern = this.addrPatt, comment: Pwstr = this.comment, listType: DhcpFilterListType = this.listType): DhcpFilterAddInfo = DhcpFilterAddInfo(addrPatt = addrPatt, commentCtorArg = comment, listType = listType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpFilterAddInfo) return false
        if (this.addrPatt != other.addrPatt) return false
        if (this.comment != other.comment) return false
        if (this.listType != other.listType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.addrPatt.hashCode()
        result = 31 * result + this.comment.hashCode()
        result = 31 * result + this.listType.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            addrPatt: DhcpAddrPattern = DhcpAddrPattern(),
            comment: Pwstr = MutPtr(0L),
            listType: DhcpFilterListType = 0,
        ): DhcpFilterAddInfo =
            DhcpFilterAddInfo(
                addrPatt = addrPatt,
                commentCtorArg = comment,
                listType = listType,
            )
    }
}

public class DhcpFilterEnumInfo internal constructor(
    public var numElements: UInt,
    pEnumRecordsCtorArg: MutPtr<DhcpFilterRecord>,
) {
    public var pEnumRecords: MutPtr<DhcpFilterRecord> = pEnumRecordsCtorArg
        internal set

    public constructor() : this(
        numElements = 0u,
        pEnumRecordsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numElements

    public operator fun component2(): MutPtr<DhcpFilterRecord> = this.pEnumRecords

    public fun copy(numElements: UInt = this.numElements, pEnumRecords: MutPtr<DhcpFilterRecord> = this.pEnumRecords): DhcpFilterEnumInfo = DhcpFilterEnumInfo(numElements = numElements, pEnumRecordsCtorArg = pEnumRecords)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpFilterEnumInfo) return false
        if (this.numElements != other.numElements) return false
        if (this.pEnumRecords != other.pEnumRecords) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numElements.hashCode()
        result = 31 * result + this.pEnumRecords.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpFilterEnumInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpFilterEnumInfo> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DhcpFilterEnumInfo =
                    DhcpFilterEnumInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<DhcpFilterRecord>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DhcpFilterEnumInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numElements)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<DhcpFilterRecord>(64)
                    ).writeNative(addr + 8L, value.pEnumRecords)
                }
            }

        public operator fun invoke(
            numElements: UInt = 0u,
            pEnumRecords: MutPtr<DhcpFilterRecord> = MutPtr(0L),
        ): DhcpFilterEnumInfo =
            DhcpFilterEnumInfo(
                numElements = numElements,
                pEnumRecordsCtorArg = pEnumRecords,
            )
    }
}

public data class DhcpFilterGlobalInfo(
    public var enforceAllowList: Bool = 0,
    public var enforceDenyList: Bool = 0,
)

public class DhcpFilterRecord internal constructor(
    public var addrPatt: DhcpAddrPattern,
    commentCtorArg: Pwstr,
) {
    public var comment: Pwstr = commentCtorArg
        internal set

    public constructor() : this(
        addrPatt = DhcpAddrPattern(),
        commentCtorArg = MutPtr(0L),
    )

    public operator fun component1(): DhcpAddrPattern = this.addrPatt

    public operator fun component2(): Pwstr = this.comment

    public fun copy(addrPatt: DhcpAddrPattern = this.addrPatt, comment: Pwstr = this.comment): DhcpFilterRecord = DhcpFilterRecord(addrPatt = addrPatt, commentCtorArg = comment)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpFilterRecord) return false
        if (this.addrPatt != other.addrPatt) return false
        if (this.comment != other.comment) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.addrPatt.hashCode()
        result = 31 * result + this.comment.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            addrPatt: DhcpAddrPattern = DhcpAddrPattern(),
            comment: Pwstr = MutPtr(0L),
        ): DhcpFilterRecord =
            DhcpFilterRecord(
                addrPatt = addrPatt,
                commentCtorArg = comment,
            )
    }
}

public class DhcpHostInfo internal constructor(
    public var ipAddress: UInt,
    netBiosNameCtorArg: Pwstr,
    hostNameCtorArg: Pwstr,
) {
    public var netBiosName: Pwstr = netBiosNameCtorArg
        internal set

    public var hostName: Pwstr = hostNameCtorArg
        internal set

    public constructor() : this(
        ipAddress = 0u,
        netBiosNameCtorArg = MutPtr(0L),
        hostNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.ipAddress

    public operator fun component2(): Pwstr = this.netBiosName

    public operator fun component3(): Pwstr = this.hostName

    public fun copy(ipAddress: UInt = this.ipAddress, netBiosName: Pwstr = this.netBiosName, hostName: Pwstr = this.hostName): DhcpHostInfo = DhcpHostInfo(ipAddress = ipAddress, netBiosNameCtorArg = netBiosName, hostNameCtorArg = hostName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpHostInfo) return false
        if (this.ipAddress != other.ipAddress) return false
        if (this.netBiosName != other.netBiosName) return false
        if (this.hostName != other.hostName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ipAddress.hashCode()
        result = 31 * result + this.netBiosName.hashCode()
        result = 31 * result + this.hostName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ipAddress: UInt = 0u,
            netBiosName: Pwstr = MutPtr(0L),
            hostName: Pwstr = MutPtr(0L),
        ): DhcpHostInfo =
            DhcpHostInfo(
                ipAddress = ipAddress,
                netBiosNameCtorArg = netBiosName,
                hostNameCtorArg = hostName,
            )
    }
}

public class DhcpHostInfoV6 internal constructor(
    public var ipAddress: DhcpIpv6Address,
    netBiosNameCtorArg: Pwstr,
    hostNameCtorArg: Pwstr,
) {
    public var netBiosName: Pwstr = netBiosNameCtorArg
        internal set

    public var hostName: Pwstr = hostNameCtorArg
        internal set

    public constructor() : this(
        ipAddress = DhcpIpv6Address(),
        netBiosNameCtorArg = MutPtr(0L),
        hostNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): DhcpIpv6Address = this.ipAddress

    public operator fun component2(): Pwstr = this.netBiosName

    public operator fun component3(): Pwstr = this.hostName

    public fun copy(ipAddress: DhcpIpv6Address = this.ipAddress, netBiosName: Pwstr = this.netBiosName, hostName: Pwstr = this.hostName): DhcpHostInfoV6 = DhcpHostInfoV6(ipAddress = ipAddress, netBiosNameCtorArg = netBiosName, hostNameCtorArg = hostName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpHostInfoV6) return false
        if (this.ipAddress != other.ipAddress) return false
        if (this.netBiosName != other.netBiosName) return false
        if (this.hostName != other.hostName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ipAddress.hashCode()
        result = 31 * result + this.netBiosName.hashCode()
        result = 31 * result + this.hostName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ipAddress: DhcpIpv6Address = DhcpIpv6Address(),
            netBiosName: Pwstr = MutPtr(0L),
            hostName: Pwstr = MutPtr(0L),
        ): DhcpHostInfoV6 =
            DhcpHostInfoV6(
                ipAddress = ipAddress,
                netBiosNameCtorArg = netBiosName,
                hostNameCtorArg = hostName,
            )
    }
}

public data class DhcpIpv6Address(
    public var highOrderBits: ULong = 0uL,
    public var lowOrderBits: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpIpv6Address> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpIpv6Address> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DhcpIpv6Address =
                    DhcpIpv6Address(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DhcpIpv6Address) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.highOrderBits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.lowOrderBits)
                }
            }
    }
}

public class DhcpIpArray internal constructor(
    public var numElements: UInt,
    elementsCtorArg: MutPtr<UInt>,
) {
    public var elements: MutPtr<UInt> = elementsCtorArg
        internal set

    public constructor() : this(
        numElements = 0u,
        elementsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numElements

    public operator fun component2(): MutPtr<UInt> = this.elements

    public fun copy(numElements: UInt = this.numElements, elements: MutPtr<UInt> = this.elements): DhcpIpArray = DhcpIpArray(numElements = numElements, elementsCtorArg = elements)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpIpArray) return false
        if (this.numElements != other.numElements) return false
        if (this.elements != other.elements) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numElements.hashCode()
        result = 31 * result + this.elements.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpIpArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpIpArray> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DhcpIpArray =
                    DhcpIpArray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UInt>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DhcpIpArray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numElements)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UInt>(64)
                    ).writeNative(addr + 8L, value.elements)
                }
            }

        public operator fun invoke(
            numElements: UInt = 0u,
            elements: MutPtr<UInt> = MutPtr(0L),
        ): DhcpIpArray =
            DhcpIpArray(
                numElements = numElements,
                elementsCtorArg = elements,
            )
    }
}

public data class DhcpIpCluster(
    public var clusterAddress: UInt = 0u,
    public var clusterMask: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpIpCluster> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpIpCluster> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): DhcpIpCluster =
                    DhcpIpCluster(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: DhcpIpCluster) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.clusterAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.clusterMask)
                }
            }
    }
}

public data class DhcpIpRange(
    public var startAddress: UInt = 0u,
    public var endAddress: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpIpRange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpIpRange> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): DhcpIpRange =
                    DhcpIpRange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: DhcpIpRange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.startAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.endAddress)
                }
            }
    }
}

public class DhcpIpRangeArray internal constructor(
    public var numElements: UInt,
    elementsCtorArg: MutPtr<DhcpIpRange>,
) {
    public var elements: MutPtr<DhcpIpRange> = elementsCtorArg
        internal set

    public constructor() : this(
        numElements = 0u,
        elementsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numElements

    public operator fun component2(): MutPtr<DhcpIpRange> = this.elements

    public fun copy(numElements: UInt = this.numElements, elements: MutPtr<DhcpIpRange> = this.elements): DhcpIpRangeArray = DhcpIpRangeArray(numElements = numElements, elementsCtorArg = elements)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpIpRangeArray) return false
        if (this.numElements != other.numElements) return false
        if (this.elements != other.elements) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numElements.hashCode()
        result = 31 * result + this.elements.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpIpRangeArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpIpRangeArray> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DhcpIpRangeArray =
                    DhcpIpRangeArray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<DhcpIpRange>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DhcpIpRangeArray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numElements)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<DhcpIpRange>(64)
                    ).writeNative(addr + 8L, value.elements)
                }
            }

        public operator fun invoke(
            numElements: UInt = 0u,
            elements: MutPtr<DhcpIpRange> = MutPtr(0L),
        ): DhcpIpRangeArray =
            DhcpIpRangeArray(
                numElements = numElements,
                elementsCtorArg = elements,
            )
    }
}

public data class DhcpIpRangeV6(
    public var startAddress: DhcpIpv6Address = DhcpIpv6Address(),
    public var endAddress: DhcpIpv6Address = DhcpIpv6Address(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpIpRangeV6> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpIpRangeV6> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DhcpIpRangeV6 =
                    DhcpIpRangeV6(
                        (DhcpIpv6Address.typeLayout()).readNative(addr),
                        (DhcpIpv6Address.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: DhcpIpRangeV6) {
                    (DhcpIpv6Address.typeLayout()).writeNative(addr, value.startAddress)
                    (DhcpIpv6Address.typeLayout()).writeNative(addr + 16L, value.endAddress)
                }
            }
    }
}

public class DhcpIpReservation internal constructor(
    public var reservedIpAddress: UInt,
    reservedForClientCtorArg: MutPtr<DhcpBinaryData>,
) {
    public var reservedForClient: MutPtr<DhcpBinaryData> = reservedForClientCtorArg
        internal set

    public constructor() : this(
        reservedIpAddress = 0u,
        reservedForClientCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.reservedIpAddress

    public operator fun component2(): MutPtr<DhcpBinaryData> = this.reservedForClient

    public fun copy(reservedIpAddress: UInt = this.reservedIpAddress, reservedForClient: MutPtr<DhcpBinaryData> = this.reservedForClient): DhcpIpReservation = DhcpIpReservation(reservedIpAddress = reservedIpAddress, reservedForClientCtorArg = reservedForClient)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpIpReservation) return false
        if (this.reservedIpAddress != other.reservedIpAddress) return false
        if (this.reservedForClient != other.reservedForClient) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reservedIpAddress.hashCode()
        result = 31 * result + this.reservedForClient.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpIpReservation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpIpReservation> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DhcpIpReservation =
                    DhcpIpReservation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<DhcpBinaryData>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DhcpIpReservation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.reservedIpAddress)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<DhcpBinaryData>(64)
                    ).writeNative(addr + 8L, value.reservedForClient)
                }
            }

        public operator fun invoke(
            reservedIpAddress: UInt = 0u,
            reservedForClient: MutPtr<DhcpBinaryData> = MutPtr(0L),
        ): DhcpIpReservation =
            DhcpIpReservation(
                reservedIpAddress = reservedIpAddress,
                reservedForClientCtorArg = reservedForClient,
            )
    }
}

public class DhcpIpReservationInfo internal constructor(
    public var reservedIpAddress: UInt,
    public var reservedForClient: DhcpBinaryData,
    reservedClientNameCtorArg: Pwstr,
    reservedClientDescCtorArg: Pwstr,
    public var bAllowedClientTypes: UByte,
    public var fOptionsPresent: UByte,
) {
    public var reservedClientName: Pwstr = reservedClientNameCtorArg
        internal set

    public var reservedClientDesc: Pwstr = reservedClientDescCtorArg
        internal set

    public constructor() : this(
        reservedIpAddress = 0u,
        reservedForClient = DhcpBinaryData(),
        reservedClientNameCtorArg = MutPtr(0L),
        reservedClientDescCtorArg = MutPtr(0L),
        bAllowedClientTypes = 0u,
        fOptionsPresent = 0u,
    )

    public operator fun component1(): UInt = this.reservedIpAddress

    public operator fun component2(): DhcpBinaryData = this.reservedForClient

    public operator fun component3(): Pwstr = this.reservedClientName

    public operator fun component4(): Pwstr = this.reservedClientDesc

    public operator fun component5(): UByte = this.bAllowedClientTypes

    public operator fun component6(): UByte = this.fOptionsPresent

    public fun copy(reservedIpAddress: UInt = this.reservedIpAddress, reservedForClient: DhcpBinaryData = this.reservedForClient, reservedClientName: Pwstr = this.reservedClientName, reservedClientDesc: Pwstr = this.reservedClientDesc, bAllowedClientTypes: UByte = this.bAllowedClientTypes, fOptionsPresent: UByte = this.fOptionsPresent): DhcpIpReservationInfo = DhcpIpReservationInfo(reservedIpAddress = reservedIpAddress, reservedForClient = reservedForClient, reservedClientNameCtorArg = reservedClientName, reservedClientDescCtorArg = reservedClientDesc, bAllowedClientTypes = bAllowedClientTypes, fOptionsPresent = fOptionsPresent)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpIpReservationInfo) return false
        if (this.reservedIpAddress != other.reservedIpAddress) return false
        if (this.reservedForClient != other.reservedForClient) return false
        if (this.reservedClientName != other.reservedClientName) return false
        if (this.reservedClientDesc != other.reservedClientDesc) return false
        if (this.bAllowedClientTypes != other.bAllowedClientTypes) return false
        if (this.fOptionsPresent != other.fOptionsPresent) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reservedIpAddress.hashCode()
        result = 31 * result + this.reservedForClient.hashCode()
        result = 31 * result + this.reservedClientName.hashCode()
        result = 31 * result + this.reservedClientDesc.hashCode()
        result = 31 * result + this.bAllowedClientTypes.hashCode()
        result = 31 * result + this.fOptionsPresent.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            reservedIpAddress: UInt = 0u,
            reservedForClient: DhcpBinaryData = DhcpBinaryData(),
            reservedClientName: Pwstr = MutPtr(0L),
            reservedClientDesc: Pwstr = MutPtr(0L),
            bAllowedClientTypes: UByte = 0u,
            fOptionsPresent: UByte = 0u,
        ): DhcpIpReservationInfo =
            DhcpIpReservationInfo(
                reservedIpAddress = reservedIpAddress,
                reservedForClient = reservedForClient,
                reservedClientNameCtorArg = reservedClientName,
                reservedClientDescCtorArg = reservedClientDesc,
                bAllowedClientTypes = bAllowedClientTypes,
                fOptionsPresent = fOptionsPresent,
            )
    }
}

public class DhcpIpReservationV4 internal constructor(
    public var reservedIpAddress: UInt,
    reservedForClientCtorArg: MutPtr<DhcpBinaryData>,
    public var bAllowedClientTypes: UByte,
) {
    public var reservedForClient: MutPtr<DhcpBinaryData> = reservedForClientCtorArg
        internal set

    public constructor() : this(
        reservedIpAddress = 0u,
        reservedForClientCtorArg = MutPtr(0L),
        bAllowedClientTypes = 0u,
    )

    public operator fun component1(): UInt = this.reservedIpAddress

    public operator fun component2(): MutPtr<DhcpBinaryData> = this.reservedForClient

    public operator fun component3(): UByte = this.bAllowedClientTypes

    public fun copy(reservedIpAddress: UInt = this.reservedIpAddress, reservedForClient: MutPtr<DhcpBinaryData> = this.reservedForClient, bAllowedClientTypes: UByte = this.bAllowedClientTypes): DhcpIpReservationV4 = DhcpIpReservationV4(reservedIpAddress = reservedIpAddress, reservedForClientCtorArg = reservedForClient, bAllowedClientTypes = bAllowedClientTypes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpIpReservationV4) return false
        if (this.reservedIpAddress != other.reservedIpAddress) return false
        if (this.reservedForClient != other.reservedForClient) return false
        if (this.bAllowedClientTypes != other.bAllowedClientTypes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reservedIpAddress.hashCode()
        result = 31 * result + this.reservedForClient.hashCode()
        result = 31 * result + this.bAllowedClientTypes.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpIpReservationV4> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpIpReservationV4> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DhcpIpReservationV4 =
                    DhcpIpReservationV4(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<DhcpBinaryData>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: DhcpIpReservationV4) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.reservedIpAddress)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<DhcpBinaryData>(64)
                    ).writeNative(addr + 8L, value.reservedForClient)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.bAllowedClientTypes)
                }
            }

        public operator fun invoke(
            reservedIpAddress: UInt = 0u,
            reservedForClient: MutPtr<DhcpBinaryData> = MutPtr(0L),
            bAllowedClientTypes: UByte = 0u,
        ): DhcpIpReservationV4 =
            DhcpIpReservationV4(
                reservedIpAddress = reservedIpAddress,
                reservedForClientCtorArg = reservedForClient,
                bAllowedClientTypes = bAllowedClientTypes,
            )
    }
}

public class DhcpIpReservationV6 internal constructor(
    public var reservedIpAddress: DhcpIpv6Address,
    reservedForClientCtorArg: MutPtr<DhcpBinaryData>,
    public var interfaceId: UInt,
) {
    public var reservedForClient: MutPtr<DhcpBinaryData> = reservedForClientCtorArg
        internal set

    public constructor() : this(
        reservedIpAddress = DhcpIpv6Address(),
        reservedForClientCtorArg = MutPtr(0L),
        interfaceId = 0u,
    )

    public operator fun component1(): DhcpIpv6Address = this.reservedIpAddress

    public operator fun component2(): MutPtr<DhcpBinaryData> = this.reservedForClient

    public operator fun component3(): UInt = this.interfaceId

    public fun copy(reservedIpAddress: DhcpIpv6Address = this.reservedIpAddress, reservedForClient: MutPtr<DhcpBinaryData> = this.reservedForClient, interfaceId: UInt = this.interfaceId): DhcpIpReservationV6 = DhcpIpReservationV6(reservedIpAddress = reservedIpAddress, reservedForClientCtorArg = reservedForClient, interfaceId = interfaceId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpIpReservationV6) return false
        if (this.reservedIpAddress != other.reservedIpAddress) return false
        if (this.reservedForClient != other.reservedForClient) return false
        if (this.interfaceId != other.interfaceId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reservedIpAddress.hashCode()
        result = 31 * result + this.reservedForClient.hashCode()
        result = 31 * result + this.interfaceId.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpIpReservationV6> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpIpReservationV6> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DhcpIpReservationV6 =
                    DhcpIpReservationV6(
                        (DhcpIpv6Address.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<DhcpBinaryData>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: DhcpIpReservationV6) {
                    (DhcpIpv6Address.typeLayout()).writeNative(addr, value.reservedIpAddress)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<DhcpBinaryData>(64)
                    ).writeNative(addr + 16L, value.reservedForClient)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.interfaceId)
                }
            }

        public operator fun invoke(
            reservedIpAddress: DhcpIpv6Address = DhcpIpv6Address(),
            reservedForClient: MutPtr<DhcpBinaryData> = MutPtr(0L),
            interfaceId: UInt = 0u,
        ): DhcpIpReservationV6 =
            DhcpIpReservationV6(
                reservedIpAddress = reservedIpAddress,
                reservedForClientCtorArg = reservedForClient,
                interfaceId = interfaceId,
            )
    }
}

public class DhcpMibInfo internal constructor(
    public var discovers: UInt,
    public var offers: UInt,
    public var requests: UInt,
    public var acks: UInt,
    public var naks: UInt,
    public var declines: UInt,
    public var releases: UInt,
    public var serverStartTime: DateTime,
    public var scopes: UInt,
    scopeInfoCtorArg: MutPtr<ScopeMibInfo>,
) {
    public var scopeInfo: MutPtr<ScopeMibInfo> = scopeInfoCtorArg
        internal set

    public constructor() : this(
        discovers = 0u,
        offers = 0u,
        requests = 0u,
        acks = 0u,
        naks = 0u,
        declines = 0u,
        releases = 0u,
        serverStartTime = DateTime(),
        scopes = 0u,
        scopeInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.discovers

    public operator fun component2(): UInt = this.offers

    public operator fun component3(): UInt = this.requests

    public operator fun component4(): UInt = this.acks

    public operator fun component5(): UInt = this.naks

    public operator fun component6(): UInt = this.declines

    public operator fun component7(): UInt = this.releases

    public operator fun component8(): DateTime = this.serverStartTime

    public operator fun component9(): UInt = this.scopes

    public operator fun component10(): MutPtr<ScopeMibInfo> = this.scopeInfo

    public fun copy(discovers: UInt = this.discovers, offers: UInt = this.offers, requests: UInt = this.requests, acks: UInt = this.acks, naks: UInt = this.naks, declines: UInt = this.declines, releases: UInt = this.releases, serverStartTime: DateTime = this.serverStartTime, scopes: UInt = this.scopes, scopeInfo: MutPtr<ScopeMibInfo> = this.scopeInfo): DhcpMibInfo = DhcpMibInfo(discovers = discovers, offers = offers, requests = requests, acks = acks, naks = naks, declines = declines, releases = releases, serverStartTime = serverStartTime, scopes = scopes, scopeInfoCtorArg = scopeInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpMibInfo) return false
        if (this.discovers != other.discovers) return false
        if (this.offers != other.offers) return false
        if (this.requests != other.requests) return false
        if (this.acks != other.acks) return false
        if (this.naks != other.naks) return false
        if (this.declines != other.declines) return false
        if (this.releases != other.releases) return false
        if (this.serverStartTime != other.serverStartTime) return false
        if (this.scopes != other.scopes) return false
        if (this.scopeInfo != other.scopeInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.discovers.hashCode()
        result = 31 * result + this.offers.hashCode()
        result = 31 * result + this.requests.hashCode()
        result = 31 * result + this.acks.hashCode()
        result = 31 * result + this.naks.hashCode()
        result = 31 * result + this.declines.hashCode()
        result = 31 * result + this.releases.hashCode()
        result = 31 * result + this.serverStartTime.hashCode()
        result = 31 * result + this.scopes.hashCode()
        result = 31 * result + this.scopeInfo.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpMibInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpMibInfo> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DhcpMibInfo =
                    DhcpMibInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (DateTime.typeLayout()).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<ScopeMibInfo>(64)
                        ).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: DhcpMibInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.discovers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.offers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.requests)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.acks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.naks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.declines)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.releases)
                    (DateTime.typeLayout()).writeNative(addr + 28L, value.serverStartTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.scopes)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<ScopeMibInfo>(64)
                    ).writeNative(addr + 40L, value.scopeInfo)
                }
            }

        public operator fun invoke(
            discovers: UInt = 0u,
            offers: UInt = 0u,
            requests: UInt = 0u,
            acks: UInt = 0u,
            naks: UInt = 0u,
            declines: UInt = 0u,
            releases: UInt = 0u,
            serverStartTime: DateTime = DateTime(),
            scopes: UInt = 0u,
            scopeInfo: MutPtr<ScopeMibInfo> = MutPtr(0L),
        ): DhcpMibInfo =
            DhcpMibInfo(
                discovers = discovers,
                offers = offers,
                requests = requests,
                acks = acks,
                naks = naks,
                declines = declines,
                releases = releases,
                serverStartTime = serverStartTime,
                scopes = scopes,
                scopeInfoCtorArg = scopeInfo,
            )
    }
}

public class DhcpMibInfoV5 internal constructor(
    public var discovers: UInt,
    public var offers: UInt,
    public var requests: UInt,
    public var acks: UInt,
    public var naks: UInt,
    public var declines: UInt,
    public var releases: UInt,
    public var serverStartTime: DateTime,
    public var qtnNumLeases: UInt,
    public var qtnPctQtnLeases: UInt,
    public var qtnProbationLeases: UInt,
    public var qtnNonQtnLeases: UInt,
    public var qtnExemptLeases: UInt,
    public var qtnCapableClients: UInt,
    public var qtnIASErrors: UInt,
    public var delayedOffers: UInt,
    public var scopesWithDelayedOffers: UInt,
    public var scopes: UInt,
    scopeInfoCtorArg: MutPtr<ScopeMibInfoV5>,
) {
    public var scopeInfo: MutPtr<ScopeMibInfoV5> = scopeInfoCtorArg
        internal set

    public constructor() : this(
        discovers = 0u,
        offers = 0u,
        requests = 0u,
        acks = 0u,
        naks = 0u,
        declines = 0u,
        releases = 0u,
        serverStartTime = DateTime(),
        qtnNumLeases = 0u,
        qtnPctQtnLeases = 0u,
        qtnProbationLeases = 0u,
        qtnNonQtnLeases = 0u,
        qtnExemptLeases = 0u,
        qtnCapableClients = 0u,
        qtnIASErrors = 0u,
        delayedOffers = 0u,
        scopesWithDelayedOffers = 0u,
        scopes = 0u,
        scopeInfoCtorArg = MutPtr(0L),
    )

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpMibInfoV5> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpMibInfoV5> {
                override val sizeBytes: Long = 88L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DhcpMibInfoV5 =
                    DhcpMibInfoV5(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (DateTime.typeLayout()).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<ScopeMibInfoV5>(64)
                        ).readNative(addr + 80L),
                    )
                override fun writeNative(addr: Long, value: DhcpMibInfoV5) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.discovers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.offers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.requests)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.acks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.naks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.declines)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.releases)
                    (DateTime.typeLayout()).writeNative(addr + 28L, value.serverStartTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.qtnNumLeases)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.qtnPctQtnLeases)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.qtnProbationLeases)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.qtnNonQtnLeases)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.qtnExemptLeases)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.qtnCapableClients)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.qtnIASErrors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.delayedOffers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.scopesWithDelayedOffers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.scopes)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<ScopeMibInfoV5>(64)
                    ).writeNative(addr + 80L, value.scopeInfo)
                }
            }

        public operator fun invoke(
            discovers: UInt = 0u,
            offers: UInt = 0u,
            requests: UInt = 0u,
            acks: UInt = 0u,
            naks: UInt = 0u,
            declines: UInt = 0u,
            releases: UInt = 0u,
            serverStartTime: DateTime = DateTime(),
            qtnNumLeases: UInt = 0u,
            qtnPctQtnLeases: UInt = 0u,
            qtnProbationLeases: UInt = 0u,
            qtnNonQtnLeases: UInt = 0u,
            qtnExemptLeases: UInt = 0u,
            qtnCapableClients: UInt = 0u,
            qtnIASErrors: UInt = 0u,
            delayedOffers: UInt = 0u,
            scopesWithDelayedOffers: UInt = 0u,
            scopes: UInt = 0u,
            scopeInfo: MutPtr<ScopeMibInfoV5> = MutPtr(0L),
        ): DhcpMibInfoV5 =
            DhcpMibInfoV5(
                discovers = discovers,
                offers = offers,
                requests = requests,
                acks = acks,
                naks = naks,
                declines = declines,
                releases = releases,
                serverStartTime = serverStartTime,
                qtnNumLeases = qtnNumLeases,
                qtnPctQtnLeases = qtnPctQtnLeases,
                qtnProbationLeases = qtnProbationLeases,
                qtnNonQtnLeases = qtnNonQtnLeases,
                qtnExemptLeases = qtnExemptLeases,
                qtnCapableClients = qtnCapableClients,
                qtnIASErrors = qtnIASErrors,
                delayedOffers = delayedOffers,
                scopesWithDelayedOffers = scopesWithDelayedOffers,
                scopes = scopes,
                scopeInfoCtorArg = scopeInfo,
            )
    }
}

public class DhcpMibInfoV6 internal constructor(
    public var solicits: UInt,
    public var advertises: UInt,
    public var requests: UInt,
    public var renews: UInt,
    public var rebinds: UInt,
    public var replies: UInt,
    public var confirms: UInt,
    public var declines: UInt,
    public var releases: UInt,
    public var informs: UInt,
    public var serverStartTime: DateTime,
    public var scopes: UInt,
    scopeInfoCtorArg: MutPtr<ScopeMibInfoV6>,
) {
    public var scopeInfo: MutPtr<ScopeMibInfoV6> = scopeInfoCtorArg
        internal set

    public constructor() : this(
        solicits = 0u,
        advertises = 0u,
        requests = 0u,
        renews = 0u,
        rebinds = 0u,
        replies = 0u,
        confirms = 0u,
        declines = 0u,
        releases = 0u,
        informs = 0u,
        serverStartTime = DateTime(),
        scopes = 0u,
        scopeInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.solicits

    public operator fun component2(): UInt = this.advertises

    public operator fun component3(): UInt = this.requests

    public operator fun component4(): UInt = this.renews

    public operator fun component5(): UInt = this.rebinds

    public operator fun component6(): UInt = this.replies

    public operator fun component7(): UInt = this.confirms

    public operator fun component8(): UInt = this.declines

    public operator fun component9(): UInt = this.releases

    public operator fun component10(): UInt = this.informs

    public operator fun component11(): DateTime = this.serverStartTime

    public operator fun component12(): UInt = this.scopes

    public operator fun component13(): MutPtr<ScopeMibInfoV6> = this.scopeInfo

    public fun copy(solicits: UInt = this.solicits, advertises: UInt = this.advertises, requests: UInt = this.requests, renews: UInt = this.renews, rebinds: UInt = this.rebinds, replies: UInt = this.replies, confirms: UInt = this.confirms, declines: UInt = this.declines, releases: UInt = this.releases, informs: UInt = this.informs, serverStartTime: DateTime = this.serverStartTime, scopes: UInt = this.scopes, scopeInfo: MutPtr<ScopeMibInfoV6> = this.scopeInfo): DhcpMibInfoV6 = DhcpMibInfoV6(solicits = solicits, advertises = advertises, requests = requests, renews = renews, rebinds = rebinds, replies = replies, confirms = confirms, declines = declines, releases = releases, informs = informs, serverStartTime = serverStartTime, scopes = scopes, scopeInfoCtorArg = scopeInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpMibInfoV6) return false
        if (this.solicits != other.solicits) return false
        if (this.advertises != other.advertises) return false
        if (this.requests != other.requests) return false
        if (this.renews != other.renews) return false
        if (this.rebinds != other.rebinds) return false
        if (this.replies != other.replies) return false
        if (this.confirms != other.confirms) return false
        if (this.declines != other.declines) return false
        if (this.releases != other.releases) return false
        if (this.informs != other.informs) return false
        if (this.serverStartTime != other.serverStartTime) return false
        if (this.scopes != other.scopes) return false
        if (this.scopeInfo != other.scopeInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.solicits.hashCode()
        result = 31 * result + this.advertises.hashCode()
        result = 31 * result + this.requests.hashCode()
        result = 31 * result + this.renews.hashCode()
        result = 31 * result + this.rebinds.hashCode()
        result = 31 * result + this.replies.hashCode()
        result = 31 * result + this.confirms.hashCode()
        result = 31 * result + this.declines.hashCode()
        result = 31 * result + this.releases.hashCode()
        result = 31 * result + this.informs.hashCode()
        result = 31 * result + this.serverStartTime.hashCode()
        result = 31 * result + this.scopes.hashCode()
        result = 31 * result + this.scopeInfo.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpMibInfoV6> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpMibInfoV6> {
                override val sizeBytes: Long = 64L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DhcpMibInfoV6 =
                    DhcpMibInfoV6(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (DateTime.typeLayout()).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<ScopeMibInfoV6>(64)
                        ).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: DhcpMibInfoV6) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.solicits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.advertises)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.requests)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.renews)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.rebinds)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.replies)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.confirms)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.declines)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.releases)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.informs)
                    (DateTime.typeLayout()).writeNative(addr + 40L, value.serverStartTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.scopes)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<ScopeMibInfoV6>(64)
                    ).writeNative(addr + 56L, value.scopeInfo)
                }
            }

        public operator fun invoke(
            solicits: UInt = 0u,
            advertises: UInt = 0u,
            requests: UInt = 0u,
            renews: UInt = 0u,
            rebinds: UInt = 0u,
            replies: UInt = 0u,
            confirms: UInt = 0u,
            declines: UInt = 0u,
            releases: UInt = 0u,
            informs: UInt = 0u,
            serverStartTime: DateTime = DateTime(),
            scopes: UInt = 0u,
            scopeInfo: MutPtr<ScopeMibInfoV6> = MutPtr(0L),
        ): DhcpMibInfoV6 =
            DhcpMibInfoV6(
                solicits = solicits,
                advertises = advertises,
                requests = requests,
                renews = renews,
                rebinds = rebinds,
                replies = replies,
                confirms = confirms,
                declines = declines,
                releases = releases,
                informs = informs,
                serverStartTime = serverStartTime,
                scopes = scopes,
                scopeInfoCtorArg = scopeInfo,
            )
    }
}

public class DhcpMibInfoVq internal constructor(
    public var discovers: UInt,
    public var offers: UInt,
    public var requests: UInt,
    public var acks: UInt,
    public var naks: UInt,
    public var declines: UInt,
    public var releases: UInt,
    public var serverStartTime: DateTime,
    public var qtnNumLeases: UInt,
    public var qtnPctQtnLeases: UInt,
    public var qtnProbationLeases: UInt,
    public var qtnNonQtnLeases: UInt,
    public var qtnExemptLeases: UInt,
    public var qtnCapableClients: UInt,
    public var qtnIASErrors: UInt,
    public var scopes: UInt,
    scopeInfoCtorArg: MutPtr<ScopeMibInfoVq>,
) {
    public var scopeInfo: MutPtr<ScopeMibInfoVq> = scopeInfoCtorArg
        internal set

    public constructor() : this(
        discovers = 0u,
        offers = 0u,
        requests = 0u,
        acks = 0u,
        naks = 0u,
        declines = 0u,
        releases = 0u,
        serverStartTime = DateTime(),
        qtnNumLeases = 0u,
        qtnPctQtnLeases = 0u,
        qtnProbationLeases = 0u,
        qtnNonQtnLeases = 0u,
        qtnExemptLeases = 0u,
        qtnCapableClients = 0u,
        qtnIASErrors = 0u,
        scopes = 0u,
        scopeInfoCtorArg = MutPtr(0L),
    )

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpMibInfoVq> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpMibInfoVq> {
                override val sizeBytes: Long = 80L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DhcpMibInfoVq =
                    DhcpMibInfoVq(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (DateTime.typeLayout()).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<ScopeMibInfoVq>(64)
                        ).readNative(addr + 72L),
                    )
                override fun writeNative(addr: Long, value: DhcpMibInfoVq) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.discovers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.offers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.requests)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.acks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.naks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.declines)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.releases)
                    (DateTime.typeLayout()).writeNative(addr + 28L, value.serverStartTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.qtnNumLeases)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.qtnPctQtnLeases)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.qtnProbationLeases)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.qtnNonQtnLeases)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.qtnExemptLeases)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.qtnCapableClients)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.qtnIASErrors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.scopes)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<ScopeMibInfoVq>(64)
                    ).writeNative(addr + 72L, value.scopeInfo)
                }
            }

        public operator fun invoke(
            discovers: UInt = 0u,
            offers: UInt = 0u,
            requests: UInt = 0u,
            acks: UInt = 0u,
            naks: UInt = 0u,
            declines: UInt = 0u,
            releases: UInt = 0u,
            serverStartTime: DateTime = DateTime(),
            qtnNumLeases: UInt = 0u,
            qtnPctQtnLeases: UInt = 0u,
            qtnProbationLeases: UInt = 0u,
            qtnNonQtnLeases: UInt = 0u,
            qtnExemptLeases: UInt = 0u,
            qtnCapableClients: UInt = 0u,
            qtnIASErrors: UInt = 0u,
            scopes: UInt = 0u,
            scopeInfo: MutPtr<ScopeMibInfoVq> = MutPtr(0L),
        ): DhcpMibInfoVq =
            DhcpMibInfoVq(
                discovers = discovers,
                offers = offers,
                requests = requests,
                acks = acks,
                naks = naks,
                declines = declines,
                releases = releases,
                serverStartTime = serverStartTime,
                qtnNumLeases = qtnNumLeases,
                qtnPctQtnLeases = qtnPctQtnLeases,
                qtnProbationLeases = qtnProbationLeases,
                qtnNonQtnLeases = qtnNonQtnLeases,
                qtnExemptLeases = qtnExemptLeases,
                qtnCapableClients = qtnCapableClients,
                qtnIASErrors = qtnIASErrors,
                scopes = scopes,
                scopeInfoCtorArg = scopeInfo,
            )
    }
}

public class DhcpOption internal constructor(
    public var optionID: UInt,
    optionNameCtorArg: Pwstr,
    optionCommentCtorArg: Pwstr,
    public var defaultValue: DhcpOptionData,
    public var optionType: DhcpOptionType,
) {
    public var optionName: Pwstr = optionNameCtorArg
        internal set

    public var optionComment: Pwstr = optionCommentCtorArg
        internal set

    public constructor() : this(
        optionID = 0u,
        optionNameCtorArg = MutPtr(0L),
        optionCommentCtorArg = MutPtr(0L),
        defaultValue = DhcpOptionData(),
        optionType = 0,
    )

    public operator fun component1(): UInt = this.optionID

    public operator fun component2(): Pwstr = this.optionName

    public operator fun component3(): Pwstr = this.optionComment

    public operator fun component4(): DhcpOptionData = this.defaultValue

    public operator fun component5(): DhcpOptionType = this.optionType

    public fun copy(optionID: UInt = this.optionID, optionName: Pwstr = this.optionName, optionComment: Pwstr = this.optionComment, defaultValue: DhcpOptionData = this.defaultValue, optionType: DhcpOptionType = this.optionType): DhcpOption = DhcpOption(optionID = optionID, optionNameCtorArg = optionName, optionCommentCtorArg = optionComment, defaultValue = defaultValue, optionType = optionType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpOption) return false
        if (this.optionID != other.optionID) return false
        if (this.optionName != other.optionName) return false
        if (this.optionComment != other.optionComment) return false
        if (this.defaultValue != other.defaultValue) return false
        if (this.optionType != other.optionType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.optionID.hashCode()
        result = 31 * result + this.optionName.hashCode()
        result = 31 * result + this.optionComment.hashCode()
        result = 31 * result + this.defaultValue.hashCode()
        result = 31 * result + this.optionType.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            optionID: UInt = 0u,
            optionName: Pwstr = MutPtr(0L),
            optionComment: Pwstr = MutPtr(0L),
            defaultValue: DhcpOptionData = DhcpOptionData(),
            optionType: DhcpOptionType = 0,
        ): DhcpOption =
            DhcpOption(
                optionID = optionID,
                optionNameCtorArg = optionName,
                optionCommentCtorArg = optionComment,
                defaultValue = defaultValue,
                optionType = optionType,
            )
    }
}

public class DhcpOptionArray internal constructor(
    public var numElements: UInt,
    optionsCtorArg: MutPtr<DhcpOption>,
) {
    public var options: MutPtr<DhcpOption> = optionsCtorArg
        internal set

    public constructor() : this(
        numElements = 0u,
        optionsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numElements

    public operator fun component2(): MutPtr<DhcpOption> = this.options

    public fun copy(numElements: UInt = this.numElements, options: MutPtr<DhcpOption> = this.options): DhcpOptionArray = DhcpOptionArray(numElements = numElements, optionsCtorArg = options)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpOptionArray) return false
        if (this.numElements != other.numElements) return false
        if (this.options != other.options) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numElements.hashCode()
        result = 31 * result + this.options.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpOptionArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpOptionArray> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DhcpOptionArray =
                    DhcpOptionArray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<DhcpOption>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DhcpOptionArray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numElements)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<DhcpOption>(64)
                    ).writeNative(addr + 8L, value.options)
                }
            }

        public operator fun invoke(
            numElements: UInt = 0u,
            options: MutPtr<DhcpOption> = MutPtr(0L),
        ): DhcpOptionArray =
            DhcpOptionArray(
                numElements = numElements,
                optionsCtorArg = options,
            )
    }
}

public class DhcpOptionData internal constructor(
    public var numElements: UInt,
    elementsCtorArg: MutPtr<DhcpOptionDataElement>,
) {
    public var elements: MutPtr<DhcpOptionDataElement> = elementsCtorArg
        internal set

    public constructor() : this(
        numElements = 0u,
        elementsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numElements

    public operator fun component2(): MutPtr<DhcpOptionDataElement> = this.elements

    public fun copy(numElements: UInt = this.numElements, elements: MutPtr<DhcpOptionDataElement> = this.elements): DhcpOptionData = DhcpOptionData(numElements = numElements, elementsCtorArg = elements)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpOptionData) return false
        if (this.numElements != other.numElements) return false
        if (this.elements != other.elements) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numElements.hashCode()
        result = 31 * result + this.elements.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpOptionData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpOptionData> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DhcpOptionData =
                    DhcpOptionData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<DhcpOptionDataElement>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DhcpOptionData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numElements)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<DhcpOptionDataElement>(64)
                    ).writeNative(addr + 8L, value.elements)
                }
            }

        public operator fun invoke(
            numElements: UInt = 0u,
            elements: MutPtr<DhcpOptionDataElement> = MutPtr(0L),
        ): DhcpOptionData =
            DhcpOptionData(
                numElements = numElements,
                elementsCtorArg = elements,
            )
    }
}

public data class DhcpOptionDataElement(
    public var optionType: DhcpOptionDataType = 0,
    public var element: DhcpOptionDataElement0 = DhcpOptionDataElement0(),
)

public class DhcpOptionDataElement0 internal constructor(
    public var byteOption: UByte,
    public var wordOption: UShort,
    public var dWordOption: UInt,
    public var dWordDWordOption: DwordDword,
    public var ipAddressOption: UInt,
    stringDataOptionCtorArg: Pwstr,
    public var binaryDataOption: DhcpBinaryData,
    public var encapsulatedDataOption: DhcpBinaryData,
    ipv6AddressDataOptionCtorArg: Pwstr,
) {
    public var stringDataOption: Pwstr = stringDataOptionCtorArg
        internal set

    public var ipv6AddressDataOption: Pwstr = ipv6AddressDataOptionCtorArg
        internal set

    public constructor() : this(
        byteOption = 0u,
        wordOption = 0u,
        dWordOption = 0u,
        dWordDWordOption = DwordDword(),
        ipAddressOption = 0u,
        stringDataOptionCtorArg = MutPtr(0L),
        binaryDataOption = DhcpBinaryData(),
        encapsulatedDataOption = DhcpBinaryData(),
        ipv6AddressDataOptionCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UByte = this.byteOption

    public operator fun component2(): UShort = this.wordOption

    public operator fun component3(): UInt = this.dWordOption

    public operator fun component4(): DwordDword = this.dWordDWordOption

    public operator fun component5(): UInt = this.ipAddressOption

    public operator fun component6(): Pwstr = this.stringDataOption

    public operator fun component7(): DhcpBinaryData = this.binaryDataOption

    public operator fun component8(): DhcpBinaryData = this.encapsulatedDataOption

    public operator fun component9(): Pwstr = this.ipv6AddressDataOption

    public fun copy(byteOption: UByte = this.byteOption, wordOption: UShort = this.wordOption, dWordOption: UInt = this.dWordOption, dWordDWordOption: DwordDword = this.dWordDWordOption, ipAddressOption: UInt = this.ipAddressOption, stringDataOption: Pwstr = this.stringDataOption, binaryDataOption: DhcpBinaryData = this.binaryDataOption, encapsulatedDataOption: DhcpBinaryData = this.encapsulatedDataOption, ipv6AddressDataOption: Pwstr = this.ipv6AddressDataOption): DhcpOptionDataElement0 = DhcpOptionDataElement0(byteOption = byteOption, wordOption = wordOption, dWordOption = dWordOption, dWordDWordOption = dWordDWordOption, ipAddressOption = ipAddressOption, stringDataOptionCtorArg = stringDataOption, binaryDataOption = binaryDataOption, encapsulatedDataOption = encapsulatedDataOption, ipv6AddressDataOptionCtorArg = ipv6AddressDataOption)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpOptionDataElement0) return false
        if (this.byteOption != other.byteOption) return false
        if (this.wordOption != other.wordOption) return false
        if (this.dWordOption != other.dWordOption) return false
        if (this.dWordDWordOption != other.dWordDWordOption) return false
        if (this.ipAddressOption != other.ipAddressOption) return false
        if (this.stringDataOption != other.stringDataOption) return false
        if (this.binaryDataOption != other.binaryDataOption) return false
        if (this.encapsulatedDataOption != other.encapsulatedDataOption) return false
        if (this.ipv6AddressDataOption != other.ipv6AddressDataOption) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.byteOption.hashCode()
        result = 31 * result + this.wordOption.hashCode()
        result = 31 * result + this.dWordOption.hashCode()
        result = 31 * result + this.dWordDWordOption.hashCode()
        result = 31 * result + this.ipAddressOption.hashCode()
        result = 31 * result + this.stringDataOption.hashCode()
        result = 31 * result + this.binaryDataOption.hashCode()
        result = 31 * result + this.encapsulatedDataOption.hashCode()
        result = 31 * result + this.ipv6AddressDataOption.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            byteOption: UByte = 0u,
            wordOption: UShort = 0u,
            dWordOption: UInt = 0u,
            dWordDWordOption: DwordDword = DwordDword(),
            ipAddressOption: UInt = 0u,
            stringDataOption: Pwstr = MutPtr(0L),
            binaryDataOption: DhcpBinaryData = DhcpBinaryData(),
            encapsulatedDataOption: DhcpBinaryData = DhcpBinaryData(),
            ipv6AddressDataOption: Pwstr = MutPtr(0L),
        ): DhcpOptionDataElement0 =
            DhcpOptionDataElement0(
                byteOption = byteOption,
                wordOption = wordOption,
                dWordOption = dWordOption,
                dWordDWordOption = dWordDWordOption,
                ipAddressOption = ipAddressOption,
                stringDataOptionCtorArg = stringDataOption,
                binaryDataOption = binaryDataOption,
                encapsulatedDataOption = encapsulatedDataOption,
                ipv6AddressDataOptionCtorArg = ipv6AddressDataOption,
            )
    }
}

public class DhcpOptionList internal constructor(
    public var numOptions: UInt,
    optionsCtorArg: MutPtr<DhcpOptionValue>,
) {
    public var options: MutPtr<DhcpOptionValue> = optionsCtorArg
        internal set

    public constructor() : this(
        numOptions = 0u,
        optionsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numOptions

    public operator fun component2(): MutPtr<DhcpOptionValue> = this.options

    public fun copy(numOptions: UInt = this.numOptions, options: MutPtr<DhcpOptionValue> = this.options): DhcpOptionList = DhcpOptionList(numOptions = numOptions, optionsCtorArg = options)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpOptionList) return false
        if (this.numOptions != other.numOptions) return false
        if (this.options != other.options) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numOptions.hashCode()
        result = 31 * result + this.options.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpOptionList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpOptionList> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DhcpOptionList =
                    DhcpOptionList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<DhcpOptionValue>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DhcpOptionList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numOptions)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<DhcpOptionValue>(64)
                    ).writeNative(addr + 8L, value.options)
                }
            }

        public operator fun invoke(
            numOptions: UInt = 0u,
            options: MutPtr<DhcpOptionValue> = MutPtr(0L),
        ): DhcpOptionList =
            DhcpOptionList(
                numOptions = numOptions,
                optionsCtorArg = options,
            )
    }
}

public data class DhcpOptionScopeInfo(
    public var scopeType: DhcpOptionScopeType = 0,
    public var scopeInfo: DhcpOptionScopeInfo0 = DhcpOptionScopeInfo0(),
)

public class DhcpOptionScopeInfo0 internal constructor(
    defaultScopeInfoCtorArg: MutPtr<CVoid>,
    globalScopeInfoCtorArg: MutPtr<CVoid>,
    public var subnetScopeInfo: UInt,
    public var reservedScopeInfo: DhcpReservedScope,
    mScopeInfoCtorArg: Pwstr,
) {
    public var defaultScopeInfo: MutPtr<CVoid> = defaultScopeInfoCtorArg
        internal set

    public var globalScopeInfo: MutPtr<CVoid> = globalScopeInfoCtorArg
        internal set

    public var mScopeInfo: Pwstr = mScopeInfoCtorArg
        internal set

    public constructor() : this(
        defaultScopeInfoCtorArg = MutPtr(0L),
        globalScopeInfoCtorArg = MutPtr(0L),
        subnetScopeInfo = 0u,
        reservedScopeInfo = DhcpReservedScope(),
        mScopeInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.defaultScopeInfo

    public operator fun component2(): MutPtr<CVoid> = this.globalScopeInfo

    public operator fun component3(): UInt = this.subnetScopeInfo

    public operator fun component4(): DhcpReservedScope = this.reservedScopeInfo

    public operator fun component5(): Pwstr = this.mScopeInfo

    public fun copy(defaultScopeInfo: MutPtr<CVoid> = this.defaultScopeInfo, globalScopeInfo: MutPtr<CVoid> = this.globalScopeInfo, subnetScopeInfo: UInt = this.subnetScopeInfo, reservedScopeInfo: DhcpReservedScope = this.reservedScopeInfo, mScopeInfo: Pwstr = this.mScopeInfo): DhcpOptionScopeInfo0 = DhcpOptionScopeInfo0(defaultScopeInfoCtorArg = defaultScopeInfo, globalScopeInfoCtorArg = globalScopeInfo, subnetScopeInfo = subnetScopeInfo, reservedScopeInfo = reservedScopeInfo, mScopeInfoCtorArg = mScopeInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpOptionScopeInfo0) return false
        if (this.defaultScopeInfo != other.defaultScopeInfo) return false
        if (this.globalScopeInfo != other.globalScopeInfo) return false
        if (this.subnetScopeInfo != other.subnetScopeInfo) return false
        if (this.reservedScopeInfo != other.reservedScopeInfo) return false
        if (this.mScopeInfo != other.mScopeInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.defaultScopeInfo.hashCode()
        result = 31 * result + this.globalScopeInfo.hashCode()
        result = 31 * result + this.subnetScopeInfo.hashCode()
        result = 31 * result + this.reservedScopeInfo.hashCode()
        result = 31 * result + this.mScopeInfo.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            defaultScopeInfo: MutPtr<CVoid> = MutPtr(0L),
            globalScopeInfo: MutPtr<CVoid> = MutPtr(0L),
            subnetScopeInfo: UInt = 0u,
            reservedScopeInfo: DhcpReservedScope = DhcpReservedScope(),
            mScopeInfo: Pwstr = MutPtr(0L),
        ): DhcpOptionScopeInfo0 =
            DhcpOptionScopeInfo0(
                defaultScopeInfoCtorArg = defaultScopeInfo,
                globalScopeInfoCtorArg = globalScopeInfo,
                subnetScopeInfo = subnetScopeInfo,
                reservedScopeInfo = reservedScopeInfo,
                mScopeInfoCtorArg = mScopeInfo,
            )
    }
}

public data class DhcpOptionScopeInfo6(
    public var scopeType: DhcpOptionScopeType6 = 0,
    public var scopeInfo: DhcpOptionScopeInfo60 = DhcpOptionScopeInfo60(),
)

public class DhcpOptionScopeInfo60 internal constructor(
    defaultScopeInfoCtorArg: MutPtr<CVoid>,
    public var subnetScopeInfo: DhcpIpv6Address,
    public var reservedScopeInfo: DhcpReservedScope6,
) {
    public var defaultScopeInfo: MutPtr<CVoid> = defaultScopeInfoCtorArg
        internal set

    public constructor() : this(
        defaultScopeInfoCtorArg = MutPtr(0L),
        subnetScopeInfo = DhcpIpv6Address(),
        reservedScopeInfo = DhcpReservedScope6(),
    )

    public operator fun component1(): MutPtr<CVoid> = this.defaultScopeInfo

    public operator fun component2(): DhcpIpv6Address = this.subnetScopeInfo

    public operator fun component3(): DhcpReservedScope6 = this.reservedScopeInfo

    public fun copy(defaultScopeInfo: MutPtr<CVoid> = this.defaultScopeInfo, subnetScopeInfo: DhcpIpv6Address = this.subnetScopeInfo, reservedScopeInfo: DhcpReservedScope6 = this.reservedScopeInfo): DhcpOptionScopeInfo60 = DhcpOptionScopeInfo60(defaultScopeInfoCtorArg = defaultScopeInfo, subnetScopeInfo = subnetScopeInfo, reservedScopeInfo = reservedScopeInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpOptionScopeInfo60) return false
        if (this.defaultScopeInfo != other.defaultScopeInfo) return false
        if (this.subnetScopeInfo != other.subnetScopeInfo) return false
        if (this.reservedScopeInfo != other.reservedScopeInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.defaultScopeInfo.hashCode()
        result = 31 * result + this.subnetScopeInfo.hashCode()
        result = 31 * result + this.reservedScopeInfo.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            defaultScopeInfo: MutPtr<CVoid> = MutPtr(0L),
            subnetScopeInfo: DhcpIpv6Address = DhcpIpv6Address(),
            reservedScopeInfo: DhcpReservedScope6 = DhcpReservedScope6(),
        ): DhcpOptionScopeInfo60 =
            DhcpOptionScopeInfo60(
                defaultScopeInfoCtorArg = defaultScopeInfo,
                subnetScopeInfo = subnetScopeInfo,
                reservedScopeInfo = reservedScopeInfo,
            )
    }
}

public data class DhcpOptionValue(
    public var optionID: UInt = 0u,
    public var value: DhcpOptionData = DhcpOptionData(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpOptionValue> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpOptionValue> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DhcpOptionValue =
                    DhcpOptionValue(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (DhcpOptionData.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DhcpOptionValue) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.optionID)
                    (DhcpOptionData.typeLayout()).writeNative(addr + 8L, value.value)
                }
            }
    }
}

public class DhcpOptionValueArray internal constructor(
    public var numElements: UInt,
    valuesCtorArg: MutPtr<DhcpOptionValue>,
) {
    public var values: MutPtr<DhcpOptionValue> = valuesCtorArg
        internal set

    public constructor() : this(
        numElements = 0u,
        valuesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numElements

    public operator fun component2(): MutPtr<DhcpOptionValue> = this.values

    public fun copy(numElements: UInt = this.numElements, values: MutPtr<DhcpOptionValue> = this.values): DhcpOptionValueArray = DhcpOptionValueArray(numElements = numElements, valuesCtorArg = values)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpOptionValueArray) return false
        if (this.numElements != other.numElements) return false
        if (this.values != other.values) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numElements.hashCode()
        result = 31 * result + this.values.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpOptionValueArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpOptionValueArray> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DhcpOptionValueArray =
                    DhcpOptionValueArray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<DhcpOptionValue>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DhcpOptionValueArray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numElements)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<DhcpOptionValue>(64)
                    ).writeNative(addr + 8L, value.values)
                }
            }

        public operator fun invoke(
            numElements: UInt = 0u,
            values: MutPtr<DhcpOptionValue> = MutPtr(0L),
        ): DhcpOptionValueArray =
            DhcpOptionValueArray(
                numElements = numElements,
                valuesCtorArg = values,
            )
    }
}

public class DhcpPerfStats(
    public var dwNumPacketsReceived: UInt = 0u,
    public var dwNumPacketsDuplicate: UInt = 0u,
    public var dwNumPacketsExpired: UInt = 0u,
    public var dwNumMilliSecondsProcessed: UInt = 0u,
    public var dwNumPacketsInActiveQueue: UInt = 0u,
    public var dwNumPacketsInPingQueue: UInt = 0u,
    public var dwNumDiscoversReceived: UInt = 0u,
    public var dwNumOffersSent: UInt = 0u,
    public var dwNumRequestsReceived: UInt = 0u,
    public var dwNumInformsReceived: UInt = 0u,
    public var dwNumAcksSent: UInt = 0u,
    public var dwNumNacksSent: UInt = 0u,
    public var dwNumDeclinesReceived: UInt = 0u,
    public var dwNumReleasesReceived: UInt = 0u,
    public var dwNumDelayedOfferInQueue: UInt = 0u,
    public var dwNumPacketsProcessed: UInt = 0u,
    public var dwNumPacketsInQuarWaitingQueue: UInt = 0u,
    public var dwNumPacketsInQuarReadyQueue: UInt = 0u,
    public var dwNumPacketsInQuarDecisionQueue: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpPerfStats> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpPerfStats> {
                override val sizeBytes: Long = 76L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): DhcpPerfStats =
                    DhcpPerfStats(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                    )
                override fun writeNative(addr: Long, value: DhcpPerfStats) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwNumPacketsReceived)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwNumPacketsDuplicate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwNumPacketsExpired)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwNumMilliSecondsProcessed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwNumPacketsInActiveQueue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwNumPacketsInPingQueue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwNumDiscoversReceived)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwNumOffersSent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwNumRequestsReceived)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dwNumInformsReceived)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.dwNumAcksSent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.dwNumNacksSent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.dwNumDeclinesReceived)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.dwNumReleasesReceived)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.dwNumDelayedOfferInQueue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.dwNumPacketsProcessed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.dwNumPacketsInQuarWaitingQueue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.dwNumPacketsInQuarReadyQueue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.dwNumPacketsInQuarDecisionQueue)
                }
            }
    }
}

public class DhcpPolicy internal constructor(
    policyNameCtorArg: Pwstr,
    public var isGlobalPolicy: Bool,
    public var subnet: UInt,
    public var processingOrder: UInt,
    conditionsCtorArg: MutPtr<DhcpPolCondArray>,
    expressionsCtorArg: MutPtr<DhcpPolExprArray>,
    rangesCtorArg: MutPtr<DhcpIpRangeArray>,
    descriptionCtorArg: Pwstr,
    public var enabled: Bool,
) {
    public var policyName: Pwstr = policyNameCtorArg
        internal set

    public var conditions: MutPtr<DhcpPolCondArray> = conditionsCtorArg
        internal set

    public var expressions: MutPtr<DhcpPolExprArray> = expressionsCtorArg
        internal set

    public var ranges: MutPtr<DhcpIpRangeArray> = rangesCtorArg
        internal set

    public var description: Pwstr = descriptionCtorArg
        internal set

    public constructor() : this(
        policyNameCtorArg = MutPtr(0L),
        isGlobalPolicy = 0,
        subnet = 0u,
        processingOrder = 0u,
        conditionsCtorArg = MutPtr(0L),
        expressionsCtorArg = MutPtr(0L),
        rangesCtorArg = MutPtr(0L),
        descriptionCtorArg = MutPtr(0L),
        enabled = 0,
    )

    public operator fun component1(): Pwstr = this.policyName

    public operator fun component2(): Bool = this.isGlobalPolicy

    public operator fun component3(): UInt = this.subnet

    public operator fun component4(): UInt = this.processingOrder

    public operator fun component5(): MutPtr<DhcpPolCondArray> = this.conditions

    public operator fun component6(): MutPtr<DhcpPolExprArray> = this.expressions

    public operator fun component7(): MutPtr<DhcpIpRangeArray> = this.ranges

    public operator fun component8(): Pwstr = this.description

    public operator fun component9(): Bool = this.enabled

    public fun copy(policyName: Pwstr = this.policyName, isGlobalPolicy: Bool = this.isGlobalPolicy, subnet: UInt = this.subnet, processingOrder: UInt = this.processingOrder, conditions: MutPtr<DhcpPolCondArray> = this.conditions, expressions: MutPtr<DhcpPolExprArray> = this.expressions, ranges: MutPtr<DhcpIpRangeArray> = this.ranges, description: Pwstr = this.description, enabled: Bool = this.enabled): DhcpPolicy = DhcpPolicy(policyNameCtorArg = policyName, isGlobalPolicy = isGlobalPolicy, subnet = subnet, processingOrder = processingOrder, conditionsCtorArg = conditions, expressionsCtorArg = expressions, rangesCtorArg = ranges, descriptionCtorArg = description, enabled = enabled)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpPolicy) return false
        if (this.policyName != other.policyName) return false
        if (this.isGlobalPolicy != other.isGlobalPolicy) return false
        if (this.subnet != other.subnet) return false
        if (this.processingOrder != other.processingOrder) return false
        if (this.conditions != other.conditions) return false
        if (this.expressions != other.expressions) return false
        if (this.ranges != other.ranges) return false
        if (this.description != other.description) return false
        if (this.enabled != other.enabled) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.policyName.hashCode()
        result = 31 * result + this.isGlobalPolicy.hashCode()
        result = 31 * result + this.subnet.hashCode()
        result = 31 * result + this.processingOrder.hashCode()
        result = 31 * result + this.conditions.hashCode()
        result = 31 * result + this.expressions.hashCode()
        result = 31 * result + this.ranges.hashCode()
        result = 31 * result + this.description.hashCode()
        result = 31 * result + this.enabled.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            policyName: Pwstr = MutPtr(0L),
            isGlobalPolicy: Bool = 0,
            subnet: UInt = 0u,
            processingOrder: UInt = 0u,
            conditions: MutPtr<DhcpPolCondArray> = MutPtr(0L),
            expressions: MutPtr<DhcpPolExprArray> = MutPtr(0L),
            ranges: MutPtr<DhcpIpRangeArray> = MutPtr(0L),
            description: Pwstr = MutPtr(0L),
            enabled: Bool = 0,
        ): DhcpPolicy =
            DhcpPolicy(
                policyNameCtorArg = policyName,
                isGlobalPolicy = isGlobalPolicy,
                subnet = subnet,
                processingOrder = processingOrder,
                conditionsCtorArg = conditions,
                expressionsCtorArg = expressions,
                rangesCtorArg = ranges,
                descriptionCtorArg = description,
                enabled = enabled,
            )
    }
}

public class DhcpPolicyArray internal constructor(
    public var numElements: UInt,
    elementsCtorArg: MutPtr<DhcpPolicy>,
) {
    public var elements: MutPtr<DhcpPolicy> = elementsCtorArg
        internal set

    public constructor() : this(
        numElements = 0u,
        elementsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numElements

    public operator fun component2(): MutPtr<DhcpPolicy> = this.elements

    public fun copy(numElements: UInt = this.numElements, elements: MutPtr<DhcpPolicy> = this.elements): DhcpPolicyArray = DhcpPolicyArray(numElements = numElements, elementsCtorArg = elements)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpPolicyArray) return false
        if (this.numElements != other.numElements) return false
        if (this.elements != other.elements) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numElements.hashCode()
        result = 31 * result + this.elements.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpPolicyArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpPolicyArray> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DhcpPolicyArray =
                    DhcpPolicyArray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<DhcpPolicy>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DhcpPolicyArray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numElements)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<DhcpPolicy>(64)
                    ).writeNative(addr + 8L, value.elements)
                }
            }

        public operator fun invoke(
            numElements: UInt = 0u,
            elements: MutPtr<DhcpPolicy> = MutPtr(0L),
        ): DhcpPolicyArray =
            DhcpPolicyArray(
                numElements = numElements,
                elementsCtorArg = elements,
            )
    }
}

public class DhcpPolicyEx internal constructor(
    policyNameCtorArg: Pwstr,
    public var isGlobalPolicy: Bool,
    public var subnet: UInt,
    public var processingOrder: UInt,
    conditionsCtorArg: MutPtr<DhcpPolCondArray>,
    expressionsCtorArg: MutPtr<DhcpPolExprArray>,
    rangesCtorArg: MutPtr<DhcpIpRangeArray>,
    descriptionCtorArg: Pwstr,
    public var enabled: Bool,
    propertiesCtorArg: MutPtr<DhcpPropertyArray>,
) {
    public var policyName: Pwstr = policyNameCtorArg
        internal set

    public var conditions: MutPtr<DhcpPolCondArray> = conditionsCtorArg
        internal set

    public var expressions: MutPtr<DhcpPolExprArray> = expressionsCtorArg
        internal set

    public var ranges: MutPtr<DhcpIpRangeArray> = rangesCtorArg
        internal set

    public var description: Pwstr = descriptionCtorArg
        internal set

    public var properties: MutPtr<DhcpPropertyArray> = propertiesCtorArg
        internal set

    public constructor() : this(
        policyNameCtorArg = MutPtr(0L),
        isGlobalPolicy = 0,
        subnet = 0u,
        processingOrder = 0u,
        conditionsCtorArg = MutPtr(0L),
        expressionsCtorArg = MutPtr(0L),
        rangesCtorArg = MutPtr(0L),
        descriptionCtorArg = MutPtr(0L),
        enabled = 0,
        propertiesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.policyName

    public operator fun component2(): Bool = this.isGlobalPolicy

    public operator fun component3(): UInt = this.subnet

    public operator fun component4(): UInt = this.processingOrder

    public operator fun component5(): MutPtr<DhcpPolCondArray> = this.conditions

    public operator fun component6(): MutPtr<DhcpPolExprArray> = this.expressions

    public operator fun component7(): MutPtr<DhcpIpRangeArray> = this.ranges

    public operator fun component8(): Pwstr = this.description

    public operator fun component9(): Bool = this.enabled

    public operator fun component10(): MutPtr<DhcpPropertyArray> = this.properties

    public fun copy(policyName: Pwstr = this.policyName, isGlobalPolicy: Bool = this.isGlobalPolicy, subnet: UInt = this.subnet, processingOrder: UInt = this.processingOrder, conditions: MutPtr<DhcpPolCondArray> = this.conditions, expressions: MutPtr<DhcpPolExprArray> = this.expressions, ranges: MutPtr<DhcpIpRangeArray> = this.ranges, description: Pwstr = this.description, enabled: Bool = this.enabled, properties: MutPtr<DhcpPropertyArray> = this.properties): DhcpPolicyEx = DhcpPolicyEx(policyNameCtorArg = policyName, isGlobalPolicy = isGlobalPolicy, subnet = subnet, processingOrder = processingOrder, conditionsCtorArg = conditions, expressionsCtorArg = expressions, rangesCtorArg = ranges, descriptionCtorArg = description, enabled = enabled, propertiesCtorArg = properties)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpPolicyEx) return false
        if (this.policyName != other.policyName) return false
        if (this.isGlobalPolicy != other.isGlobalPolicy) return false
        if (this.subnet != other.subnet) return false
        if (this.processingOrder != other.processingOrder) return false
        if (this.conditions != other.conditions) return false
        if (this.expressions != other.expressions) return false
        if (this.ranges != other.ranges) return false
        if (this.description != other.description) return false
        if (this.enabled != other.enabled) return false
        if (this.properties != other.properties) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.policyName.hashCode()
        result = 31 * result + this.isGlobalPolicy.hashCode()
        result = 31 * result + this.subnet.hashCode()
        result = 31 * result + this.processingOrder.hashCode()
        result = 31 * result + this.conditions.hashCode()
        result = 31 * result + this.expressions.hashCode()
        result = 31 * result + this.ranges.hashCode()
        result = 31 * result + this.description.hashCode()
        result = 31 * result + this.enabled.hashCode()
        result = 31 * result + this.properties.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            policyName: Pwstr = MutPtr(0L),
            isGlobalPolicy: Bool = 0,
            subnet: UInt = 0u,
            processingOrder: UInt = 0u,
            conditions: MutPtr<DhcpPolCondArray> = MutPtr(0L),
            expressions: MutPtr<DhcpPolExprArray> = MutPtr(0L),
            ranges: MutPtr<DhcpIpRangeArray> = MutPtr(0L),
            description: Pwstr = MutPtr(0L),
            enabled: Bool = 0,
            properties: MutPtr<DhcpPropertyArray> = MutPtr(0L),
        ): DhcpPolicyEx =
            DhcpPolicyEx(
                policyNameCtorArg = policyName,
                isGlobalPolicy = isGlobalPolicy,
                subnet = subnet,
                processingOrder = processingOrder,
                conditionsCtorArg = conditions,
                expressionsCtorArg = expressions,
                rangesCtorArg = ranges,
                descriptionCtorArg = description,
                enabled = enabled,
                propertiesCtorArg = properties,
            )
    }
}

public class DhcpPolicyExArray internal constructor(
    public var numElements: UInt,
    elementsCtorArg: MutPtr<DhcpPolicyEx>,
) {
    public var elements: MutPtr<DhcpPolicyEx> = elementsCtorArg
        internal set

    public constructor() : this(
        numElements = 0u,
        elementsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numElements

    public operator fun component2(): MutPtr<DhcpPolicyEx> = this.elements

    public fun copy(numElements: UInt = this.numElements, elements: MutPtr<DhcpPolicyEx> = this.elements): DhcpPolicyExArray = DhcpPolicyExArray(numElements = numElements, elementsCtorArg = elements)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpPolicyExArray) return false
        if (this.numElements != other.numElements) return false
        if (this.elements != other.elements) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numElements.hashCode()
        result = 31 * result + this.elements.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpPolicyExArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpPolicyExArray> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DhcpPolicyExArray =
                    DhcpPolicyExArray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<DhcpPolicyEx>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DhcpPolicyExArray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numElements)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<DhcpPolicyEx>(64)
                    ).writeNative(addr + 8L, value.elements)
                }
            }

        public operator fun invoke(
            numElements: UInt = 0u,
            elements: MutPtr<DhcpPolicyEx> = MutPtr(0L),
        ): DhcpPolicyExArray =
            DhcpPolicyExArray(
                numElements = numElements,
                elementsCtorArg = elements,
            )
    }
}

public class DhcpPolCond internal constructor(
    public var parentExpr: UInt,
    public var type: DhcpPolAttrType,
    public var optionID: UInt,
    public var subOptionID: UInt,
    vendorNameCtorArg: Pwstr,
    public var operator: DhcpPolComparator,
    valueCtorArg: MutPtr<UByte>,
    public var valueLength: UInt,
) {
    public var vendorName: Pwstr = vendorNameCtorArg
        internal set

    public var value: MutPtr<UByte> = valueCtorArg
        internal set

    public constructor() : this(
        parentExpr = 0u,
        type = 0,
        optionID = 0u,
        subOptionID = 0u,
        vendorNameCtorArg = MutPtr(0L),
        operator = 0,
        valueCtorArg = MutPtr(0L),
        valueLength = 0u,
    )

    public operator fun component1(): UInt = this.parentExpr

    public operator fun component2(): DhcpPolAttrType = this.type

    public operator fun component3(): UInt = this.optionID

    public operator fun component4(): UInt = this.subOptionID

    public operator fun component5(): Pwstr = this.vendorName

    public operator fun component6(): DhcpPolComparator = this.operator

    public operator fun component7(): MutPtr<UByte> = this.value

    public operator fun component8(): UInt = this.valueLength

    public fun copy(parentExpr: UInt = this.parentExpr, type: DhcpPolAttrType = this.type, optionID: UInt = this.optionID, subOptionID: UInt = this.subOptionID, vendorName: Pwstr = this.vendorName, operator: DhcpPolComparator = this.operator, value: MutPtr<UByte> = this.value, valueLength: UInt = this.valueLength): DhcpPolCond = DhcpPolCond(parentExpr = parentExpr, type = type, optionID = optionID, subOptionID = subOptionID, vendorNameCtorArg = vendorName, operator = operator, valueCtorArg = value, valueLength = valueLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpPolCond) return false
        if (this.parentExpr != other.parentExpr) return false
        if (this.type != other.type) return false
        if (this.optionID != other.optionID) return false
        if (this.subOptionID != other.subOptionID) return false
        if (this.vendorName != other.vendorName) return false
        if (this.operator != other.operator) return false
        if (this.value != other.value) return false
        if (this.valueLength != other.valueLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.parentExpr.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.optionID.hashCode()
        result = 31 * result + this.subOptionID.hashCode()
        result = 31 * result + this.vendorName.hashCode()
        result = 31 * result + this.operator.hashCode()
        result = 31 * result + this.value.hashCode()
        result = 31 * result + this.valueLength.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            parentExpr: UInt = 0u,
            type: DhcpPolAttrType = 0,
            optionID: UInt = 0u,
            subOptionID: UInt = 0u,
            vendorName: Pwstr = MutPtr(0L),
            operator: DhcpPolComparator = 0,
            value: MutPtr<UByte> = MutPtr(0L),
            valueLength: UInt = 0u,
        ): DhcpPolCond =
            DhcpPolCond(
                parentExpr = parentExpr,
                type = type,
                optionID = optionID,
                subOptionID = subOptionID,
                vendorNameCtorArg = vendorName,
                operator = operator,
                valueCtorArg = value,
                valueLength = valueLength,
            )
    }
}

public class DhcpPolCondArray internal constructor(
    public var numElements: UInt,
    elementsCtorArg: MutPtr<DhcpPolCond>,
) {
    public var elements: MutPtr<DhcpPolCond> = elementsCtorArg
        internal set

    public constructor() : this(
        numElements = 0u,
        elementsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numElements

    public operator fun component2(): MutPtr<DhcpPolCond> = this.elements

    public fun copy(numElements: UInt = this.numElements, elements: MutPtr<DhcpPolCond> = this.elements): DhcpPolCondArray = DhcpPolCondArray(numElements = numElements, elementsCtorArg = elements)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpPolCondArray) return false
        if (this.numElements != other.numElements) return false
        if (this.elements != other.elements) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numElements.hashCode()
        result = 31 * result + this.elements.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpPolCondArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpPolCondArray> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DhcpPolCondArray =
                    DhcpPolCondArray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<DhcpPolCond>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DhcpPolCondArray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numElements)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<DhcpPolCond>(64)
                    ).writeNative(addr + 8L, value.elements)
                }
            }

        public operator fun invoke(
            numElements: UInt = 0u,
            elements: MutPtr<DhcpPolCond> = MutPtr(0L),
        ): DhcpPolCondArray =
            DhcpPolCondArray(
                numElements = numElements,
                elementsCtorArg = elements,
            )
    }
}

public data class DhcpPolExpr(
    public var parentExpr: UInt = 0u,
    public var operator: DhcpPolLogicOper = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpPolExpr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpPolExpr> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): DhcpPolExpr =
                    DhcpPolExpr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: DhcpPolExpr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.parentExpr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.operator)
                }
            }
    }
}

public class DhcpPolExprArray internal constructor(
    public var numElements: UInt,
    elementsCtorArg: MutPtr<DhcpPolExpr>,
) {
    public var elements: MutPtr<DhcpPolExpr> = elementsCtorArg
        internal set

    public constructor() : this(
        numElements = 0u,
        elementsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numElements

    public operator fun component2(): MutPtr<DhcpPolExpr> = this.elements

    public fun copy(numElements: UInt = this.numElements, elements: MutPtr<DhcpPolExpr> = this.elements): DhcpPolExprArray = DhcpPolExprArray(numElements = numElements, elementsCtorArg = elements)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpPolExprArray) return false
        if (this.numElements != other.numElements) return false
        if (this.elements != other.elements) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numElements.hashCode()
        result = 31 * result + this.elements.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpPolExprArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpPolExprArray> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DhcpPolExprArray =
                    DhcpPolExprArray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<DhcpPolExpr>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DhcpPolExprArray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numElements)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<DhcpPolExpr>(64)
                    ).writeNative(addr + 8L, value.elements)
                }
            }

        public operator fun invoke(
            numElements: UInt = 0u,
            elements: MutPtr<DhcpPolExpr> = MutPtr(0L),
        ): DhcpPolExprArray =
            DhcpPolExprArray(
                numElements = numElements,
                elementsCtorArg = elements,
            )
    }
}

public data class DhcpProperty(
    public var id: DhcpPropertyId = 0,
    public var type: DhcpPropertyType = 0,
    public var value: DhcpProperty0 = DhcpProperty0(),
)

public class DhcpProperty0 internal constructor(
    public var byteValue: UByte,
    public var wordValue: UShort,
    public var dWordValue: UInt,
    stringValueCtorArg: Pwstr,
    public var binaryValue: DhcpBinaryData,
) {
    public var stringValue: Pwstr = stringValueCtorArg
        internal set

    public constructor() : this(
        byteValue = 0u,
        wordValue = 0u,
        dWordValue = 0u,
        stringValueCtorArg = MutPtr(0L),
        binaryValue = DhcpBinaryData(),
    )

    public operator fun component1(): UByte = this.byteValue

    public operator fun component2(): UShort = this.wordValue

    public operator fun component3(): UInt = this.dWordValue

    public operator fun component4(): Pwstr = this.stringValue

    public operator fun component5(): DhcpBinaryData = this.binaryValue

    public fun copy(byteValue: UByte = this.byteValue, wordValue: UShort = this.wordValue, dWordValue: UInt = this.dWordValue, stringValue: Pwstr = this.stringValue, binaryValue: DhcpBinaryData = this.binaryValue): DhcpProperty0 = DhcpProperty0(byteValue = byteValue, wordValue = wordValue, dWordValue = dWordValue, stringValueCtorArg = stringValue, binaryValue = binaryValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpProperty0) return false
        if (this.byteValue != other.byteValue) return false
        if (this.wordValue != other.wordValue) return false
        if (this.dWordValue != other.dWordValue) return false
        if (this.stringValue != other.stringValue) return false
        if (this.binaryValue != other.binaryValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.byteValue.hashCode()
        result = 31 * result + this.wordValue.hashCode()
        result = 31 * result + this.dWordValue.hashCode()
        result = 31 * result + this.stringValue.hashCode()
        result = 31 * result + this.binaryValue.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            byteValue: UByte = 0u,
            wordValue: UShort = 0u,
            dWordValue: UInt = 0u,
            stringValue: Pwstr = MutPtr(0L),
            binaryValue: DhcpBinaryData = DhcpBinaryData(),
        ): DhcpProperty0 =
            DhcpProperty0(
                byteValue = byteValue,
                wordValue = wordValue,
                dWordValue = dWordValue,
                stringValueCtorArg = stringValue,
                binaryValue = binaryValue,
            )
    }
}

public class DhcpPropertyArray internal constructor(
    public var numElements: UInt,
    elementsCtorArg: MutPtr<DhcpProperty>,
) {
    public var elements: MutPtr<DhcpProperty> = elementsCtorArg
        internal set

    public constructor() : this(
        numElements = 0u,
        elementsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numElements

    public operator fun component2(): MutPtr<DhcpProperty> = this.elements

    public fun copy(numElements: UInt = this.numElements, elements: MutPtr<DhcpProperty> = this.elements): DhcpPropertyArray = DhcpPropertyArray(numElements = numElements, elementsCtorArg = elements)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpPropertyArray) return false
        if (this.numElements != other.numElements) return false
        if (this.elements != other.elements) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numElements.hashCode()
        result = 31 * result + this.elements.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpPropertyArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpPropertyArray> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DhcpPropertyArray =
                    DhcpPropertyArray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<DhcpProperty>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DhcpPropertyArray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numElements)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<DhcpProperty>(64)
                    ).writeNative(addr + 8L, value.elements)
                }
            }

        public operator fun invoke(
            numElements: UInt = 0u,
            elements: MutPtr<DhcpProperty> = MutPtr(0L),
        ): DhcpPropertyArray =
            DhcpPropertyArray(
                numElements = numElements,
                elementsCtorArg = elements,
            )
    }
}

public class DhcpReservationInfoArray internal constructor(
    public var numElements: UInt,
    elementsCtorArg: MutPtr<MutPtr<DhcpIpReservationInfo>>,
) {
    public var elements: MutPtr<MutPtr<DhcpIpReservationInfo>> = elementsCtorArg
        internal set

    public constructor() : this(
        numElements = 0u,
        elementsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numElements

    public operator fun component2(): MutPtr<MutPtr<DhcpIpReservationInfo>> = this.elements

    public fun copy(numElements: UInt = this.numElements, elements: MutPtr<MutPtr<DhcpIpReservationInfo>> = this.elements): DhcpReservationInfoArray = DhcpReservationInfoArray(numElements = numElements, elementsCtorArg = elements)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpReservationInfoArray) return false
        if (this.numElements != other.numElements) return false
        if (this.elements != other.elements) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numElements.hashCode()
        result = 31 * result + this.elements.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpReservationInfoArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpReservationInfoArray> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DhcpReservationInfoArray =
                    DhcpReservationInfoArray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<DhcpIpReservationInfo>>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DhcpReservationInfoArray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numElements)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<DhcpIpReservationInfo>>(64)
                    ).writeNative(addr + 8L, value.elements)
                }
            }

        public operator fun invoke(
            numElements: UInt = 0u,
            elements: MutPtr<MutPtr<DhcpIpReservationInfo>> = MutPtr(0L),
        ): DhcpReservationInfoArray =
            DhcpReservationInfoArray(
                numElements = numElements,
                elementsCtorArg = elements,
            )
    }
}

public data class DhcpReservedScope(
    public var reservedIpAddress: UInt = 0u,
    public var reservedIpSubnetAddress: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpReservedScope> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpReservedScope> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): DhcpReservedScope =
                    DhcpReservedScope(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: DhcpReservedScope) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.reservedIpAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reservedIpSubnetAddress)
                }
            }
    }
}

public data class DhcpReservedScope6(
    public var reservedIpAddress: DhcpIpv6Address = DhcpIpv6Address(),
    public var reservedIpSubnetAddress: DhcpIpv6Address = DhcpIpv6Address(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpReservedScope6> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpReservedScope6> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DhcpReservedScope6 =
                    DhcpReservedScope6(
                        (DhcpIpv6Address.typeLayout()).readNative(addr),
                        (DhcpIpv6Address.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: DhcpReservedScope6) {
                    (DhcpIpv6Address.typeLayout()).writeNative(addr, value.reservedIpAddress)
                    (DhcpIpv6Address.typeLayout()).writeNative(addr + 16L, value.reservedIpSubnetAddress)
                }
            }
    }
}

public data class DhcpScanItem(
    public var ipAddress: UInt = 0u,
    public var scanFlag: DhcpScanFlag = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpScanItem> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpScanItem> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): DhcpScanItem =
                    DhcpScanItem(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: DhcpScanItem) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ipAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.scanFlag)
                }
            }
    }
}

public class DhcpScanList internal constructor(
    public var numScanItems: UInt,
    scanItemsCtorArg: MutPtr<DhcpScanItem>,
) {
    public var scanItems: MutPtr<DhcpScanItem> = scanItemsCtorArg
        internal set

    public constructor() : this(
        numScanItems = 0u,
        scanItemsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numScanItems

    public operator fun component2(): MutPtr<DhcpScanItem> = this.scanItems

    public fun copy(numScanItems: UInt = this.numScanItems, scanItems: MutPtr<DhcpScanItem> = this.scanItems): DhcpScanList = DhcpScanList(numScanItems = numScanItems, scanItemsCtorArg = scanItems)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpScanList) return false
        if (this.numScanItems != other.numScanItems) return false
        if (this.scanItems != other.scanItems) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numScanItems.hashCode()
        result = 31 * result + this.scanItems.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpScanList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpScanList> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DhcpScanList =
                    DhcpScanList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<DhcpScanItem>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DhcpScanList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numScanItems)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<DhcpScanItem>(64)
                    ).writeNative(addr + 8L, value.scanItems)
                }
            }

        public operator fun invoke(
            numScanItems: UInt = 0u,
            scanItems: MutPtr<DhcpScanItem> = MutPtr(0L),
        ): DhcpScanList =
            DhcpScanList(
                numScanItems = numScanItems,
                scanItemsCtorArg = scanItems,
            )
    }
}

public data class DhcpSearchInfo(
    public var searchType: DhcpSearchInfoType = 0,
    public var searchInfo: DhcpSearchInfo0 = DhcpSearchInfo0(),
)

public class DhcpSearchInfo0 internal constructor(
    public var clientIpAddress: UInt,
    public var clientHardwareAddress: DhcpBinaryData,
    clientNameCtorArg: Pwstr,
) {
    public var clientName: Pwstr = clientNameCtorArg
        internal set

    public constructor() : this(
        clientIpAddress = 0u,
        clientHardwareAddress = DhcpBinaryData(),
        clientNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.clientIpAddress

    public operator fun component2(): DhcpBinaryData = this.clientHardwareAddress

    public operator fun component3(): Pwstr = this.clientName

    public fun copy(clientIpAddress: UInt = this.clientIpAddress, clientHardwareAddress: DhcpBinaryData = this.clientHardwareAddress, clientName: Pwstr = this.clientName): DhcpSearchInfo0 = DhcpSearchInfo0(clientIpAddress = clientIpAddress, clientHardwareAddress = clientHardwareAddress, clientNameCtorArg = clientName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpSearchInfo0) return false
        if (this.clientIpAddress != other.clientIpAddress) return false
        if (this.clientHardwareAddress != other.clientHardwareAddress) return false
        if (this.clientName != other.clientName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.clientIpAddress.hashCode()
        result = 31 * result + this.clientHardwareAddress.hashCode()
        result = 31 * result + this.clientName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            clientIpAddress: UInt = 0u,
            clientHardwareAddress: DhcpBinaryData = DhcpBinaryData(),
            clientName: Pwstr = MutPtr(0L),
        ): DhcpSearchInfo0 =
            DhcpSearchInfo0(
                clientIpAddress = clientIpAddress,
                clientHardwareAddress = clientHardwareAddress,
                clientNameCtorArg = clientName,
            )
    }
}

public data class DhcpSearchInfoV6(
    public var searchType: DhcpSearchInfoTypeV6 = 0,
    public var searchInfo: DhcpSearchInfoV60 = DhcpSearchInfoV60(),
)

public class DhcpSearchInfoV60 internal constructor(
    public var clientIpAddress: DhcpIpv6Address,
    public var clientDUID: DhcpBinaryData,
    clientNameCtorArg: Pwstr,
) {
    public var clientName: Pwstr = clientNameCtorArg
        internal set

    public constructor() : this(
        clientIpAddress = DhcpIpv6Address(),
        clientDUID = DhcpBinaryData(),
        clientNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): DhcpIpv6Address = this.clientIpAddress

    public operator fun component2(): DhcpBinaryData = this.clientDUID

    public operator fun component3(): Pwstr = this.clientName

    public fun copy(clientIpAddress: DhcpIpv6Address = this.clientIpAddress, clientDUID: DhcpBinaryData = this.clientDUID, clientName: Pwstr = this.clientName): DhcpSearchInfoV60 = DhcpSearchInfoV60(clientIpAddress = clientIpAddress, clientDUID = clientDUID, clientNameCtorArg = clientName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpSearchInfoV60) return false
        if (this.clientIpAddress != other.clientIpAddress) return false
        if (this.clientDUID != other.clientDUID) return false
        if (this.clientName != other.clientName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.clientIpAddress.hashCode()
        result = 31 * result + this.clientDUID.hashCode()
        result = 31 * result + this.clientName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            clientIpAddress: DhcpIpv6Address = DhcpIpv6Address(),
            clientDUID: DhcpBinaryData = DhcpBinaryData(),
            clientName: Pwstr = MutPtr(0L),
        ): DhcpSearchInfoV60 =
            DhcpSearchInfoV60(
                clientIpAddress = clientIpAddress,
                clientDUID = clientDUID,
                clientNameCtorArg = clientName,
            )
    }
}

public class DhcpServerConfigInfo internal constructor(
    public var aPIProtocolSupport: UInt,
    databaseNameCtorArg: Pwstr,
    databasePathCtorArg: Pwstr,
    backupPathCtorArg: Pwstr,
    public var backupInterval: UInt,
    public var databaseLoggingFlag: UInt,
    public var restoreFlag: UInt,
    public var databaseCleanupInterval: UInt,
    public var debugFlag: UInt,
) {
    public var databaseName: Pwstr = databaseNameCtorArg
        internal set

    public var databasePath: Pwstr = databasePathCtorArg
        internal set

    public var backupPath: Pwstr = backupPathCtorArg
        internal set

    public constructor() : this(
        aPIProtocolSupport = 0u,
        databaseNameCtorArg = MutPtr(0L),
        databasePathCtorArg = MutPtr(0L),
        backupPathCtorArg = MutPtr(0L),
        backupInterval = 0u,
        databaseLoggingFlag = 0u,
        restoreFlag = 0u,
        databaseCleanupInterval = 0u,
        debugFlag = 0u,
    )

    public operator fun component1(): UInt = this.aPIProtocolSupport

    public operator fun component2(): Pwstr = this.databaseName

    public operator fun component3(): Pwstr = this.databasePath

    public operator fun component4(): Pwstr = this.backupPath

    public operator fun component5(): UInt = this.backupInterval

    public operator fun component6(): UInt = this.databaseLoggingFlag

    public operator fun component7(): UInt = this.restoreFlag

    public operator fun component8(): UInt = this.databaseCleanupInterval

    public operator fun component9(): UInt = this.debugFlag

    public fun copy(aPIProtocolSupport: UInt = this.aPIProtocolSupport, databaseName: Pwstr = this.databaseName, databasePath: Pwstr = this.databasePath, backupPath: Pwstr = this.backupPath, backupInterval: UInt = this.backupInterval, databaseLoggingFlag: UInt = this.databaseLoggingFlag, restoreFlag: UInt = this.restoreFlag, databaseCleanupInterval: UInt = this.databaseCleanupInterval, debugFlag: UInt = this.debugFlag): DhcpServerConfigInfo = DhcpServerConfigInfo(aPIProtocolSupport = aPIProtocolSupport, databaseNameCtorArg = databaseName, databasePathCtorArg = databasePath, backupPathCtorArg = backupPath, backupInterval = backupInterval, databaseLoggingFlag = databaseLoggingFlag, restoreFlag = restoreFlag, databaseCleanupInterval = databaseCleanupInterval, debugFlag = debugFlag)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpServerConfigInfo) return false
        if (this.aPIProtocolSupport != other.aPIProtocolSupport) return false
        if (this.databaseName != other.databaseName) return false
        if (this.databasePath != other.databasePath) return false
        if (this.backupPath != other.backupPath) return false
        if (this.backupInterval != other.backupInterval) return false
        if (this.databaseLoggingFlag != other.databaseLoggingFlag) return false
        if (this.restoreFlag != other.restoreFlag) return false
        if (this.databaseCleanupInterval != other.databaseCleanupInterval) return false
        if (this.debugFlag != other.debugFlag) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.aPIProtocolSupport.hashCode()
        result = 31 * result + this.databaseName.hashCode()
        result = 31 * result + this.databasePath.hashCode()
        result = 31 * result + this.backupPath.hashCode()
        result = 31 * result + this.backupInterval.hashCode()
        result = 31 * result + this.databaseLoggingFlag.hashCode()
        result = 31 * result + this.restoreFlag.hashCode()
        result = 31 * result + this.databaseCleanupInterval.hashCode()
        result = 31 * result + this.debugFlag.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            aPIProtocolSupport: UInt = 0u,
            databaseName: Pwstr = MutPtr(0L),
            databasePath: Pwstr = MutPtr(0L),
            backupPath: Pwstr = MutPtr(0L),
            backupInterval: UInt = 0u,
            databaseLoggingFlag: UInt = 0u,
            restoreFlag: UInt = 0u,
            databaseCleanupInterval: UInt = 0u,
            debugFlag: UInt = 0u,
        ): DhcpServerConfigInfo =
            DhcpServerConfigInfo(
                aPIProtocolSupport = aPIProtocolSupport,
                databaseNameCtorArg = databaseName,
                databasePathCtorArg = databasePath,
                backupPathCtorArg = backupPath,
                backupInterval = backupInterval,
                databaseLoggingFlag = databaseLoggingFlag,
                restoreFlag = restoreFlag,
                databaseCleanupInterval = databaseCleanupInterval,
                debugFlag = debugFlag,
            )
    }
}

public class DhcpServerConfigInfoV4 internal constructor(
    public var aPIProtocolSupport: UInt,
    databaseNameCtorArg: Pwstr,
    databasePathCtorArg: Pwstr,
    backupPathCtorArg: Pwstr,
    public var backupInterval: UInt,
    public var databaseLoggingFlag: UInt,
    public var restoreFlag: UInt,
    public var databaseCleanupInterval: UInt,
    public var debugFlag: UInt,
    public var dwPingRetries: UInt,
    public var cbBootTableString: UInt,
    wszBootTableStringCtorArg: Pwstr,
    public var fAuditLog: Bool,
) {
    public var databaseName: Pwstr = databaseNameCtorArg
        internal set

    public var databasePath: Pwstr = databasePathCtorArg
        internal set

    public var backupPath: Pwstr = backupPathCtorArg
        internal set

    public var wszBootTableString: Pwstr = wszBootTableStringCtorArg
        internal set

    public constructor() : this(
        aPIProtocolSupport = 0u,
        databaseNameCtorArg = MutPtr(0L),
        databasePathCtorArg = MutPtr(0L),
        backupPathCtorArg = MutPtr(0L),
        backupInterval = 0u,
        databaseLoggingFlag = 0u,
        restoreFlag = 0u,
        databaseCleanupInterval = 0u,
        debugFlag = 0u,
        dwPingRetries = 0u,
        cbBootTableString = 0u,
        wszBootTableStringCtorArg = MutPtr(0L),
        fAuditLog = 0,
    )

    public operator fun component1(): UInt = this.aPIProtocolSupport

    public operator fun component2(): Pwstr = this.databaseName

    public operator fun component3(): Pwstr = this.databasePath

    public operator fun component4(): Pwstr = this.backupPath

    public operator fun component5(): UInt = this.backupInterval

    public operator fun component6(): UInt = this.databaseLoggingFlag

    public operator fun component7(): UInt = this.restoreFlag

    public operator fun component8(): UInt = this.databaseCleanupInterval

    public operator fun component9(): UInt = this.debugFlag

    public operator fun component10(): UInt = this.dwPingRetries

    public operator fun component11(): UInt = this.cbBootTableString

    public operator fun component12(): Pwstr = this.wszBootTableString

    public operator fun component13(): Bool = this.fAuditLog

    public fun copy(aPIProtocolSupport: UInt = this.aPIProtocolSupport, databaseName: Pwstr = this.databaseName, databasePath: Pwstr = this.databasePath, backupPath: Pwstr = this.backupPath, backupInterval: UInt = this.backupInterval, databaseLoggingFlag: UInt = this.databaseLoggingFlag, restoreFlag: UInt = this.restoreFlag, databaseCleanupInterval: UInt = this.databaseCleanupInterval, debugFlag: UInt = this.debugFlag, dwPingRetries: UInt = this.dwPingRetries, cbBootTableString: UInt = this.cbBootTableString, wszBootTableString: Pwstr = this.wszBootTableString, fAuditLog: Bool = this.fAuditLog): DhcpServerConfigInfoV4 = DhcpServerConfigInfoV4(aPIProtocolSupport = aPIProtocolSupport, databaseNameCtorArg = databaseName, databasePathCtorArg = databasePath, backupPathCtorArg = backupPath, backupInterval = backupInterval, databaseLoggingFlag = databaseLoggingFlag, restoreFlag = restoreFlag, databaseCleanupInterval = databaseCleanupInterval, debugFlag = debugFlag, dwPingRetries = dwPingRetries, cbBootTableString = cbBootTableString, wszBootTableStringCtorArg = wszBootTableString, fAuditLog = fAuditLog)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpServerConfigInfoV4) return false
        if (this.aPIProtocolSupport != other.aPIProtocolSupport) return false
        if (this.databaseName != other.databaseName) return false
        if (this.databasePath != other.databasePath) return false
        if (this.backupPath != other.backupPath) return false
        if (this.backupInterval != other.backupInterval) return false
        if (this.databaseLoggingFlag != other.databaseLoggingFlag) return false
        if (this.restoreFlag != other.restoreFlag) return false
        if (this.databaseCleanupInterval != other.databaseCleanupInterval) return false
        if (this.debugFlag != other.debugFlag) return false
        if (this.dwPingRetries != other.dwPingRetries) return false
        if (this.cbBootTableString != other.cbBootTableString) return false
        if (this.wszBootTableString != other.wszBootTableString) return false
        if (this.fAuditLog != other.fAuditLog) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.aPIProtocolSupport.hashCode()
        result = 31 * result + this.databaseName.hashCode()
        result = 31 * result + this.databasePath.hashCode()
        result = 31 * result + this.backupPath.hashCode()
        result = 31 * result + this.backupInterval.hashCode()
        result = 31 * result + this.databaseLoggingFlag.hashCode()
        result = 31 * result + this.restoreFlag.hashCode()
        result = 31 * result + this.databaseCleanupInterval.hashCode()
        result = 31 * result + this.debugFlag.hashCode()
        result = 31 * result + this.dwPingRetries.hashCode()
        result = 31 * result + this.cbBootTableString.hashCode()
        result = 31 * result + this.wszBootTableString.hashCode()
        result = 31 * result + this.fAuditLog.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            aPIProtocolSupport: UInt = 0u,
            databaseName: Pwstr = MutPtr(0L),
            databasePath: Pwstr = MutPtr(0L),
            backupPath: Pwstr = MutPtr(0L),
            backupInterval: UInt = 0u,
            databaseLoggingFlag: UInt = 0u,
            restoreFlag: UInt = 0u,
            databaseCleanupInterval: UInt = 0u,
            debugFlag: UInt = 0u,
            dwPingRetries: UInt = 0u,
            cbBootTableString: UInt = 0u,
            wszBootTableString: Pwstr = MutPtr(0L),
            fAuditLog: Bool = 0,
        ): DhcpServerConfigInfoV4 =
            DhcpServerConfigInfoV4(
                aPIProtocolSupport = aPIProtocolSupport,
                databaseNameCtorArg = databaseName,
                databasePathCtorArg = databasePath,
                backupPathCtorArg = backupPath,
                backupInterval = backupInterval,
                databaseLoggingFlag = databaseLoggingFlag,
                restoreFlag = restoreFlag,
                databaseCleanupInterval = databaseCleanupInterval,
                debugFlag = debugFlag,
                dwPingRetries = dwPingRetries,
                cbBootTableString = cbBootTableString,
                wszBootTableStringCtorArg = wszBootTableString,
                fAuditLog = fAuditLog,
            )
    }
}

public data class DhcpServerConfigInfoV6(
    public var unicastFlag: Bool = 0,
    public var rapidCommitFlag: Bool = 0,
    public var preferredLifetime: UInt = 0u,
    public var validLifetime: UInt = 0u,
    public var t1: UInt = 0u,
    public var t2: UInt = 0u,
    public var preferredLifetimeIATA: UInt = 0u,
    public var validLifetimeIATA: UInt = 0u,
    public var fAuditLog: Bool = 0,
)

public class DhcpServerConfigInfoVq internal constructor(
    public var aPIProtocolSupport: UInt,
    databaseNameCtorArg: Pwstr,
    databasePathCtorArg: Pwstr,
    backupPathCtorArg: Pwstr,
    public var backupInterval: UInt,
    public var databaseLoggingFlag: UInt,
    public var restoreFlag: UInt,
    public var databaseCleanupInterval: UInt,
    public var debugFlag: UInt,
    public var dwPingRetries: UInt,
    public var cbBootTableString: UInt,
    wszBootTableStringCtorArg: Pwstr,
    public var fAuditLog: Bool,
    public var quarantineOn: Bool,
    public var quarDefFail: UInt,
    public var quarRuntimeStatus: Bool,
) {
    public var databaseName: Pwstr = databaseNameCtorArg
        internal set

    public var databasePath: Pwstr = databasePathCtorArg
        internal set

    public var backupPath: Pwstr = backupPathCtorArg
        internal set

    public var wszBootTableString: Pwstr = wszBootTableStringCtorArg
        internal set

    public constructor() : this(
        aPIProtocolSupport = 0u,
        databaseNameCtorArg = MutPtr(0L),
        databasePathCtorArg = MutPtr(0L),
        backupPathCtorArg = MutPtr(0L),
        backupInterval = 0u,
        databaseLoggingFlag = 0u,
        restoreFlag = 0u,
        databaseCleanupInterval = 0u,
        debugFlag = 0u,
        dwPingRetries = 0u,
        cbBootTableString = 0u,
        wszBootTableStringCtorArg = MutPtr(0L),
        fAuditLog = 0,
        quarantineOn = 0,
        quarDefFail = 0u,
        quarRuntimeStatus = 0,
    )

    public operator fun component1(): UInt = this.aPIProtocolSupport

    public operator fun component2(): Pwstr = this.databaseName

    public operator fun component3(): Pwstr = this.databasePath

    public operator fun component4(): Pwstr = this.backupPath

    public operator fun component5(): UInt = this.backupInterval

    public operator fun component6(): UInt = this.databaseLoggingFlag

    public operator fun component7(): UInt = this.restoreFlag

    public operator fun component8(): UInt = this.databaseCleanupInterval

    public operator fun component9(): UInt = this.debugFlag

    public operator fun component10(): UInt = this.dwPingRetries

    public operator fun component11(): UInt = this.cbBootTableString

    public operator fun component12(): Pwstr = this.wszBootTableString

    public operator fun component13(): Bool = this.fAuditLog

    public operator fun component14(): Bool = this.quarantineOn

    public operator fun component15(): UInt = this.quarDefFail

    public operator fun component16(): Bool = this.quarRuntimeStatus

    public fun copy(aPIProtocolSupport: UInt = this.aPIProtocolSupport, databaseName: Pwstr = this.databaseName, databasePath: Pwstr = this.databasePath, backupPath: Pwstr = this.backupPath, backupInterval: UInt = this.backupInterval, databaseLoggingFlag: UInt = this.databaseLoggingFlag, restoreFlag: UInt = this.restoreFlag, databaseCleanupInterval: UInt = this.databaseCleanupInterval, debugFlag: UInt = this.debugFlag, dwPingRetries: UInt = this.dwPingRetries, cbBootTableString: UInt = this.cbBootTableString, wszBootTableString: Pwstr = this.wszBootTableString, fAuditLog: Bool = this.fAuditLog, quarantineOn: Bool = this.quarantineOn, quarDefFail: UInt = this.quarDefFail, quarRuntimeStatus: Bool = this.quarRuntimeStatus): DhcpServerConfigInfoVq = DhcpServerConfigInfoVq(aPIProtocolSupport = aPIProtocolSupport, databaseNameCtorArg = databaseName, databasePathCtorArg = databasePath, backupPathCtorArg = backupPath, backupInterval = backupInterval, databaseLoggingFlag = databaseLoggingFlag, restoreFlag = restoreFlag, databaseCleanupInterval = databaseCleanupInterval, debugFlag = debugFlag, dwPingRetries = dwPingRetries, cbBootTableString = cbBootTableString, wszBootTableStringCtorArg = wszBootTableString, fAuditLog = fAuditLog, quarantineOn = quarantineOn, quarDefFail = quarDefFail, quarRuntimeStatus = quarRuntimeStatus)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpServerConfigInfoVq) return false
        if (this.aPIProtocolSupport != other.aPIProtocolSupport) return false
        if (this.databaseName != other.databaseName) return false
        if (this.databasePath != other.databasePath) return false
        if (this.backupPath != other.backupPath) return false
        if (this.backupInterval != other.backupInterval) return false
        if (this.databaseLoggingFlag != other.databaseLoggingFlag) return false
        if (this.restoreFlag != other.restoreFlag) return false
        if (this.databaseCleanupInterval != other.databaseCleanupInterval) return false
        if (this.debugFlag != other.debugFlag) return false
        if (this.dwPingRetries != other.dwPingRetries) return false
        if (this.cbBootTableString != other.cbBootTableString) return false
        if (this.wszBootTableString != other.wszBootTableString) return false
        if (this.fAuditLog != other.fAuditLog) return false
        if (this.quarantineOn != other.quarantineOn) return false
        if (this.quarDefFail != other.quarDefFail) return false
        if (this.quarRuntimeStatus != other.quarRuntimeStatus) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.aPIProtocolSupport.hashCode()
        result = 31 * result + this.databaseName.hashCode()
        result = 31 * result + this.databasePath.hashCode()
        result = 31 * result + this.backupPath.hashCode()
        result = 31 * result + this.backupInterval.hashCode()
        result = 31 * result + this.databaseLoggingFlag.hashCode()
        result = 31 * result + this.restoreFlag.hashCode()
        result = 31 * result + this.databaseCleanupInterval.hashCode()
        result = 31 * result + this.debugFlag.hashCode()
        result = 31 * result + this.dwPingRetries.hashCode()
        result = 31 * result + this.cbBootTableString.hashCode()
        result = 31 * result + this.wszBootTableString.hashCode()
        result = 31 * result + this.fAuditLog.hashCode()
        result = 31 * result + this.quarantineOn.hashCode()
        result = 31 * result + this.quarDefFail.hashCode()
        result = 31 * result + this.quarRuntimeStatus.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            aPIProtocolSupport: UInt = 0u,
            databaseName: Pwstr = MutPtr(0L),
            databasePath: Pwstr = MutPtr(0L),
            backupPath: Pwstr = MutPtr(0L),
            backupInterval: UInt = 0u,
            databaseLoggingFlag: UInt = 0u,
            restoreFlag: UInt = 0u,
            databaseCleanupInterval: UInt = 0u,
            debugFlag: UInt = 0u,
            dwPingRetries: UInt = 0u,
            cbBootTableString: UInt = 0u,
            wszBootTableString: Pwstr = MutPtr(0L),
            fAuditLog: Bool = 0,
            quarantineOn: Bool = 0,
            quarDefFail: UInt = 0u,
            quarRuntimeStatus: Bool = 0,
        ): DhcpServerConfigInfoVq =
            DhcpServerConfigInfoVq(
                aPIProtocolSupport = aPIProtocolSupport,
                databaseNameCtorArg = databaseName,
                databasePathCtorArg = databasePath,
                backupPathCtorArg = backupPath,
                backupInterval = backupInterval,
                databaseLoggingFlag = databaseLoggingFlag,
                restoreFlag = restoreFlag,
                databaseCleanupInterval = databaseCleanupInterval,
                debugFlag = debugFlag,
                dwPingRetries = dwPingRetries,
                cbBootTableString = cbBootTableString,
                wszBootTableStringCtorArg = wszBootTableString,
                fAuditLog = fAuditLog,
                quarantineOn = quarantineOn,
                quarDefFail = quarDefFail,
                quarRuntimeStatus = quarRuntimeStatus,
            )
    }
}

public class DhcpServerOptions internal constructor(
    messageTypeCtorArg: MutPtr<UByte>,
    subnetMaskCtorArg: MutPtr<UInt>,
    requestedAddressCtorArg: MutPtr<UInt>,
    requestLeaseTimeCtorArg: MutPtr<UInt>,
    overlayFieldsCtorArg: MutPtr<UByte>,
    routerAddressCtorArg: MutPtr<UInt>,
    serverCtorArg: MutPtr<UInt>,
    parameterRequestListCtorArg: MutPtr<UByte>,
    public var parameterRequestListLength: UInt,
    machineNameCtorArg: Pstr,
    public var machineNameLength: UInt,
    public var clientHardwareAddressType: UByte,
    public var clientHardwareAddressLength: UByte,
    clientHardwareAddressCtorArg: MutPtr<UByte>,
    classIdentifierCtorArg: Pstr,
    public var classIdentifierLength: UInt,
    vendorClassCtorArg: MutPtr<UByte>,
    public var vendorClassLength: UInt,
    public var dNSFlags: UInt,
    public var dNSNameLength: UInt,
    dNSNameCtorArg: MutPtr<UByte>,
    public var dSDomainNameRequested: Boolean,
    dSDomainNameCtorArg: Pstr,
    public var dSDomainNameLen: UInt,
    scopeIdCtorArg: MutPtr<UInt>,
) {
    public var messageType: MutPtr<UByte> = messageTypeCtorArg
        internal set

    public var subnetMask: MutPtr<UInt> = subnetMaskCtorArg
        internal set

    public var requestedAddress: MutPtr<UInt> = requestedAddressCtorArg
        internal set

    public var requestLeaseTime: MutPtr<UInt> = requestLeaseTimeCtorArg
        internal set

    public var overlayFields: MutPtr<UByte> = overlayFieldsCtorArg
        internal set

    public var routerAddress: MutPtr<UInt> = routerAddressCtorArg
        internal set

    public var server: MutPtr<UInt> = serverCtorArg
        internal set

    public var parameterRequestList: MutPtr<UByte> = parameterRequestListCtorArg
        internal set

    public var machineName: Pstr = machineNameCtorArg
        internal set

    public var clientHardwareAddress: MutPtr<UByte> = clientHardwareAddressCtorArg
        internal set

    public var classIdentifier: Pstr = classIdentifierCtorArg
        internal set

    public var vendorClass: MutPtr<UByte> = vendorClassCtorArg
        internal set

    public var dNSName: MutPtr<UByte> = dNSNameCtorArg
        internal set

    public var dSDomainName: Pstr = dSDomainNameCtorArg
        internal set

    public var scopeId: MutPtr<UInt> = scopeIdCtorArg
        internal set

    public constructor() : this(
        messageTypeCtorArg = MutPtr(0L),
        subnetMaskCtorArg = MutPtr(0L),
        requestedAddressCtorArg = MutPtr(0L),
        requestLeaseTimeCtorArg = MutPtr(0L),
        overlayFieldsCtorArg = MutPtr(0L),
        routerAddressCtorArg = MutPtr(0L),
        serverCtorArg = MutPtr(0L),
        parameterRequestListCtorArg = MutPtr(0L),
        parameterRequestListLength = 0u,
        machineNameCtorArg = MutPtr(0L),
        machineNameLength = 0u,
        clientHardwareAddressType = 0u,
        clientHardwareAddressLength = 0u,
        clientHardwareAddressCtorArg = MutPtr(0L),
        classIdentifierCtorArg = MutPtr(0L),
        classIdentifierLength = 0u,
        vendorClassCtorArg = MutPtr(0L),
        vendorClassLength = 0u,
        dNSFlags = 0u,
        dNSNameLength = 0u,
        dNSNameCtorArg = MutPtr(0L),
        dSDomainNameRequested = false,
        dSDomainNameCtorArg = MutPtr(0L),
        dSDomainNameLen = 0u,
        scopeIdCtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            messageType: MutPtr<UByte> = MutPtr(0L),
            subnetMask: MutPtr<UInt> = MutPtr(0L),
            requestedAddress: MutPtr<UInt> = MutPtr(0L),
            requestLeaseTime: MutPtr<UInt> = MutPtr(0L),
            overlayFields: MutPtr<UByte> = MutPtr(0L),
            routerAddress: MutPtr<UInt> = MutPtr(0L),
            server: MutPtr<UInt> = MutPtr(0L),
            parameterRequestList: MutPtr<UByte> = MutPtr(0L),
            parameterRequestListLength: UInt = 0u,
            machineName: Pstr = MutPtr(0L),
            machineNameLength: UInt = 0u,
            clientHardwareAddressType: UByte = 0u,
            clientHardwareAddressLength: UByte = 0u,
            clientHardwareAddress: MutPtr<UByte> = MutPtr(0L),
            classIdentifier: Pstr = MutPtr(0L),
            classIdentifierLength: UInt = 0u,
            vendorClass: MutPtr<UByte> = MutPtr(0L),
            vendorClassLength: UInt = 0u,
            dNSFlags: UInt = 0u,
            dNSNameLength: UInt = 0u,
            dNSName: MutPtr<UByte> = MutPtr(0L),
            dSDomainNameRequested: Boolean = false,
            dSDomainName: Pstr = MutPtr(0L),
            dSDomainNameLen: UInt = 0u,
            scopeId: MutPtr<UInt> = MutPtr(0L),
        ): DhcpServerOptions =
            DhcpServerOptions(
                messageTypeCtorArg = messageType,
                subnetMaskCtorArg = subnetMask,
                requestedAddressCtorArg = requestedAddress,
                requestLeaseTimeCtorArg = requestLeaseTime,
                overlayFieldsCtorArg = overlayFields,
                routerAddressCtorArg = routerAddress,
                serverCtorArg = server,
                parameterRequestListCtorArg = parameterRequestList,
                parameterRequestListLength = parameterRequestListLength,
                machineNameCtorArg = machineName,
                machineNameLength = machineNameLength,
                clientHardwareAddressType = clientHardwareAddressType,
                clientHardwareAddressLength = clientHardwareAddressLength,
                clientHardwareAddressCtorArg = clientHardwareAddress,
                classIdentifierCtorArg = classIdentifier,
                classIdentifierLength = classIdentifierLength,
                vendorClassCtorArg = vendorClass,
                vendorClassLength = vendorClassLength,
                dNSFlags = dNSFlags,
                dNSNameLength = dNSNameLength,
                dNSNameCtorArg = dNSName,
                dSDomainNameRequested = dSDomainNameRequested,
                dSDomainNameCtorArg = dSDomainName,
                dSDomainNameLen = dSDomainNameLen,
                scopeIdCtorArg = scopeId,
            )
    }
}

public class DhcpServerSpecificStrings internal constructor(
    defaultVendorClassNameCtorArg: Pwstr,
    defaultUserClassNameCtorArg: Pwstr,
) {
    public var defaultVendorClassName: Pwstr = defaultVendorClassNameCtorArg
        internal set

    public var defaultUserClassName: Pwstr = defaultUserClassNameCtorArg
        internal set

    public constructor() : this(
        defaultVendorClassNameCtorArg = MutPtr(0L),
        defaultUserClassNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.defaultVendorClassName

    public operator fun component2(): Pwstr = this.defaultUserClassName

    public fun copy(defaultVendorClassName: Pwstr = this.defaultVendorClassName, defaultUserClassName: Pwstr = this.defaultUserClassName): DhcpServerSpecificStrings = DhcpServerSpecificStrings(defaultVendorClassNameCtorArg = defaultVendorClassName, defaultUserClassNameCtorArg = defaultUserClassName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpServerSpecificStrings) return false
        if (this.defaultVendorClassName != other.defaultVendorClassName) return false
        if (this.defaultUserClassName != other.defaultUserClassName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.defaultVendorClassName.hashCode()
        result = 31 * result + this.defaultUserClassName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            defaultVendorClassName: Pwstr = MutPtr(0L),
            defaultUserClassName: Pwstr = MutPtr(0L),
        ): DhcpServerSpecificStrings =
            DhcpServerSpecificStrings(
                defaultVendorClassNameCtorArg = defaultVendorClassName,
                defaultUserClassNameCtorArg = defaultUserClassName,
            )
    }
}

public data class DhcpSubnetElementData(
    public var elementType: DhcpSubnetElementType = 0,
    public var element: DhcpSubnetElementData0 = DhcpSubnetElementData0(),
)

public class DhcpSubnetElementData0 internal constructor(
    ipRangeCtorArg: MutPtr<DhcpIpRange>,
    secondaryHostCtorArg: MutPtr<DhcpHostInfo>,
    reservedIpCtorArg: MutPtr<DhcpIpReservation>,
    excludeIpRangeCtorArg: MutPtr<DhcpIpRange>,
    ipUsedClusterCtorArg: MutPtr<DhcpIpCluster>,
) {
    public var ipRange: MutPtr<DhcpIpRange> = ipRangeCtorArg
        internal set

    public var secondaryHost: MutPtr<DhcpHostInfo> = secondaryHostCtorArg
        internal set

    public var reservedIp: MutPtr<DhcpIpReservation> = reservedIpCtorArg
        internal set

    public var excludeIpRange: MutPtr<DhcpIpRange> = excludeIpRangeCtorArg
        internal set

    public var ipUsedCluster: MutPtr<DhcpIpCluster> = ipUsedClusterCtorArg
        internal set

    public constructor() : this(
        ipRangeCtorArg = MutPtr(0L),
        secondaryHostCtorArg = MutPtr(0L),
        reservedIpCtorArg = MutPtr(0L),
        excludeIpRangeCtorArg = MutPtr(0L),
        ipUsedClusterCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<DhcpIpRange> = this.ipRange

    public operator fun component2(): MutPtr<DhcpHostInfo> = this.secondaryHost

    public operator fun component3(): MutPtr<DhcpIpReservation> = this.reservedIp

    public operator fun component4(): MutPtr<DhcpIpRange> = this.excludeIpRange

    public operator fun component5(): MutPtr<DhcpIpCluster> = this.ipUsedCluster

    public fun copy(ipRange: MutPtr<DhcpIpRange> = this.ipRange, secondaryHost: MutPtr<DhcpHostInfo> = this.secondaryHost, reservedIp: MutPtr<DhcpIpReservation> = this.reservedIp, excludeIpRange: MutPtr<DhcpIpRange> = this.excludeIpRange, ipUsedCluster: MutPtr<DhcpIpCluster> = this.ipUsedCluster): DhcpSubnetElementData0 = DhcpSubnetElementData0(ipRangeCtorArg = ipRange, secondaryHostCtorArg = secondaryHost, reservedIpCtorArg = reservedIp, excludeIpRangeCtorArg = excludeIpRange, ipUsedClusterCtorArg = ipUsedCluster)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpSubnetElementData0) return false
        if (this.ipRange != other.ipRange) return false
        if (this.secondaryHost != other.secondaryHost) return false
        if (this.reservedIp != other.reservedIp) return false
        if (this.excludeIpRange != other.excludeIpRange) return false
        if (this.ipUsedCluster != other.ipUsedCluster) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ipRange.hashCode()
        result = 31 * result + this.secondaryHost.hashCode()
        result = 31 * result + this.reservedIp.hashCode()
        result = 31 * result + this.excludeIpRange.hashCode()
        result = 31 * result + this.ipUsedCluster.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ipRange: MutPtr<DhcpIpRange> = MutPtr(0L),
            secondaryHost: MutPtr<DhcpHostInfo> = MutPtr(0L),
            reservedIp: MutPtr<DhcpIpReservation> = MutPtr(0L),
            excludeIpRange: MutPtr<DhcpIpRange> = MutPtr(0L),
            ipUsedCluster: MutPtr<DhcpIpCluster> = MutPtr(0L),
        ): DhcpSubnetElementData0 =
            DhcpSubnetElementData0(
                ipRangeCtorArg = ipRange,
                secondaryHostCtorArg = secondaryHost,
                reservedIpCtorArg = reservedIp,
                excludeIpRangeCtorArg = excludeIpRange,
                ipUsedClusterCtorArg = ipUsedCluster,
            )
    }
}

public data class DhcpSubnetElementDataV4(
    public var elementType: DhcpSubnetElementType = 0,
    public var element: DhcpSubnetElementDataV40 = DhcpSubnetElementDataV40(),
)

public class DhcpSubnetElementDataV40 internal constructor(
    ipRangeCtorArg: MutPtr<DhcpIpRange>,
    secondaryHostCtorArg: MutPtr<DhcpHostInfo>,
    reservedIpCtorArg: MutPtr<DhcpIpReservationV4>,
    excludeIpRangeCtorArg: MutPtr<DhcpIpRange>,
    ipUsedClusterCtorArg: MutPtr<DhcpIpCluster>,
) {
    public var ipRange: MutPtr<DhcpIpRange> = ipRangeCtorArg
        internal set

    public var secondaryHost: MutPtr<DhcpHostInfo> = secondaryHostCtorArg
        internal set

    public var reservedIp: MutPtr<DhcpIpReservationV4> = reservedIpCtorArg
        internal set

    public var excludeIpRange: MutPtr<DhcpIpRange> = excludeIpRangeCtorArg
        internal set

    public var ipUsedCluster: MutPtr<DhcpIpCluster> = ipUsedClusterCtorArg
        internal set

    public constructor() : this(
        ipRangeCtorArg = MutPtr(0L),
        secondaryHostCtorArg = MutPtr(0L),
        reservedIpCtorArg = MutPtr(0L),
        excludeIpRangeCtorArg = MutPtr(0L),
        ipUsedClusterCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<DhcpIpRange> = this.ipRange

    public operator fun component2(): MutPtr<DhcpHostInfo> = this.secondaryHost

    public operator fun component3(): MutPtr<DhcpIpReservationV4> = this.reservedIp

    public operator fun component4(): MutPtr<DhcpIpRange> = this.excludeIpRange

    public operator fun component5(): MutPtr<DhcpIpCluster> = this.ipUsedCluster

    public fun copy(ipRange: MutPtr<DhcpIpRange> = this.ipRange, secondaryHost: MutPtr<DhcpHostInfo> = this.secondaryHost, reservedIp: MutPtr<DhcpIpReservationV4> = this.reservedIp, excludeIpRange: MutPtr<DhcpIpRange> = this.excludeIpRange, ipUsedCluster: MutPtr<DhcpIpCluster> = this.ipUsedCluster): DhcpSubnetElementDataV40 = DhcpSubnetElementDataV40(ipRangeCtorArg = ipRange, secondaryHostCtorArg = secondaryHost, reservedIpCtorArg = reservedIp, excludeIpRangeCtorArg = excludeIpRange, ipUsedClusterCtorArg = ipUsedCluster)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpSubnetElementDataV40) return false
        if (this.ipRange != other.ipRange) return false
        if (this.secondaryHost != other.secondaryHost) return false
        if (this.reservedIp != other.reservedIp) return false
        if (this.excludeIpRange != other.excludeIpRange) return false
        if (this.ipUsedCluster != other.ipUsedCluster) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ipRange.hashCode()
        result = 31 * result + this.secondaryHost.hashCode()
        result = 31 * result + this.reservedIp.hashCode()
        result = 31 * result + this.excludeIpRange.hashCode()
        result = 31 * result + this.ipUsedCluster.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ipRange: MutPtr<DhcpIpRange> = MutPtr(0L),
            secondaryHost: MutPtr<DhcpHostInfo> = MutPtr(0L),
            reservedIp: MutPtr<DhcpIpReservationV4> = MutPtr(0L),
            excludeIpRange: MutPtr<DhcpIpRange> = MutPtr(0L),
            ipUsedCluster: MutPtr<DhcpIpCluster> = MutPtr(0L),
        ): DhcpSubnetElementDataV40 =
            DhcpSubnetElementDataV40(
                ipRangeCtorArg = ipRange,
                secondaryHostCtorArg = secondaryHost,
                reservedIpCtorArg = reservedIp,
                excludeIpRangeCtorArg = excludeIpRange,
                ipUsedClusterCtorArg = ipUsedCluster,
            )
    }
}

public data class DhcpSubnetElementDataV5(
    public var elementType: DhcpSubnetElementType = 0,
    public var element: DhcpSubnetElementDataV50 = DhcpSubnetElementDataV50(),
)

public class DhcpSubnetElementDataV50 internal constructor(
    ipRangeCtorArg: MutPtr<DhcpBootpIpRange>,
    secondaryHostCtorArg: MutPtr<DhcpHostInfo>,
    reservedIpCtorArg: MutPtr<DhcpIpReservationV4>,
    excludeIpRangeCtorArg: MutPtr<DhcpIpRange>,
    ipUsedClusterCtorArg: MutPtr<DhcpIpCluster>,
) {
    public var ipRange: MutPtr<DhcpBootpIpRange> = ipRangeCtorArg
        internal set

    public var secondaryHost: MutPtr<DhcpHostInfo> = secondaryHostCtorArg
        internal set

    public var reservedIp: MutPtr<DhcpIpReservationV4> = reservedIpCtorArg
        internal set

    public var excludeIpRange: MutPtr<DhcpIpRange> = excludeIpRangeCtorArg
        internal set

    public var ipUsedCluster: MutPtr<DhcpIpCluster> = ipUsedClusterCtorArg
        internal set

    public constructor() : this(
        ipRangeCtorArg = MutPtr(0L),
        secondaryHostCtorArg = MutPtr(0L),
        reservedIpCtorArg = MutPtr(0L),
        excludeIpRangeCtorArg = MutPtr(0L),
        ipUsedClusterCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<DhcpBootpIpRange> = this.ipRange

    public operator fun component2(): MutPtr<DhcpHostInfo> = this.secondaryHost

    public operator fun component3(): MutPtr<DhcpIpReservationV4> = this.reservedIp

    public operator fun component4(): MutPtr<DhcpIpRange> = this.excludeIpRange

    public operator fun component5(): MutPtr<DhcpIpCluster> = this.ipUsedCluster

    public fun copy(ipRange: MutPtr<DhcpBootpIpRange> = this.ipRange, secondaryHost: MutPtr<DhcpHostInfo> = this.secondaryHost, reservedIp: MutPtr<DhcpIpReservationV4> = this.reservedIp, excludeIpRange: MutPtr<DhcpIpRange> = this.excludeIpRange, ipUsedCluster: MutPtr<DhcpIpCluster> = this.ipUsedCluster): DhcpSubnetElementDataV50 = DhcpSubnetElementDataV50(ipRangeCtorArg = ipRange, secondaryHostCtorArg = secondaryHost, reservedIpCtorArg = reservedIp, excludeIpRangeCtorArg = excludeIpRange, ipUsedClusterCtorArg = ipUsedCluster)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpSubnetElementDataV50) return false
        if (this.ipRange != other.ipRange) return false
        if (this.secondaryHost != other.secondaryHost) return false
        if (this.reservedIp != other.reservedIp) return false
        if (this.excludeIpRange != other.excludeIpRange) return false
        if (this.ipUsedCluster != other.ipUsedCluster) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ipRange.hashCode()
        result = 31 * result + this.secondaryHost.hashCode()
        result = 31 * result + this.reservedIp.hashCode()
        result = 31 * result + this.excludeIpRange.hashCode()
        result = 31 * result + this.ipUsedCluster.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ipRange: MutPtr<DhcpBootpIpRange> = MutPtr(0L),
            secondaryHost: MutPtr<DhcpHostInfo> = MutPtr(0L),
            reservedIp: MutPtr<DhcpIpReservationV4> = MutPtr(0L),
            excludeIpRange: MutPtr<DhcpIpRange> = MutPtr(0L),
            ipUsedCluster: MutPtr<DhcpIpCluster> = MutPtr(0L),
        ): DhcpSubnetElementDataV50 =
            DhcpSubnetElementDataV50(
                ipRangeCtorArg = ipRange,
                secondaryHostCtorArg = secondaryHost,
                reservedIpCtorArg = reservedIp,
                excludeIpRangeCtorArg = excludeIpRange,
                ipUsedClusterCtorArg = ipUsedCluster,
            )
    }
}

public data class DhcpSubnetElementDataV6(
    public var elementType: DhcpSubnetElementTypeV6 = 0,
    public var element: DhcpSubnetElementDataV60 = DhcpSubnetElementDataV60(),
)

public class DhcpSubnetElementDataV60 internal constructor(
    ipRangeCtorArg: MutPtr<DhcpIpRangeV6>,
    reservedIpCtorArg: MutPtr<DhcpIpReservationV6>,
    excludeIpRangeCtorArg: MutPtr<DhcpIpRangeV6>,
) {
    public var ipRange: MutPtr<DhcpIpRangeV6> = ipRangeCtorArg
        internal set

    public var reservedIp: MutPtr<DhcpIpReservationV6> = reservedIpCtorArg
        internal set

    public var excludeIpRange: MutPtr<DhcpIpRangeV6> = excludeIpRangeCtorArg
        internal set

    public constructor() : this(
        ipRangeCtorArg = MutPtr(0L),
        reservedIpCtorArg = MutPtr(0L),
        excludeIpRangeCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<DhcpIpRangeV6> = this.ipRange

    public operator fun component2(): MutPtr<DhcpIpReservationV6> = this.reservedIp

    public operator fun component3(): MutPtr<DhcpIpRangeV6> = this.excludeIpRange

    public fun copy(ipRange: MutPtr<DhcpIpRangeV6> = this.ipRange, reservedIp: MutPtr<DhcpIpReservationV6> = this.reservedIp, excludeIpRange: MutPtr<DhcpIpRangeV6> = this.excludeIpRange): DhcpSubnetElementDataV60 = DhcpSubnetElementDataV60(ipRangeCtorArg = ipRange, reservedIpCtorArg = reservedIp, excludeIpRangeCtorArg = excludeIpRange)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpSubnetElementDataV60) return false
        if (this.ipRange != other.ipRange) return false
        if (this.reservedIp != other.reservedIp) return false
        if (this.excludeIpRange != other.excludeIpRange) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ipRange.hashCode()
        result = 31 * result + this.reservedIp.hashCode()
        result = 31 * result + this.excludeIpRange.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ipRange: MutPtr<DhcpIpRangeV6> = MutPtr(0L),
            reservedIp: MutPtr<DhcpIpReservationV6> = MutPtr(0L),
            excludeIpRange: MutPtr<DhcpIpRangeV6> = MutPtr(0L),
        ): DhcpSubnetElementDataV60 =
            DhcpSubnetElementDataV60(
                ipRangeCtorArg = ipRange,
                reservedIpCtorArg = reservedIp,
                excludeIpRangeCtorArg = excludeIpRange,
            )
    }
}

public class DhcpSubnetElementInfoArray internal constructor(
    public var numElements: UInt,
    elementsCtorArg: MutPtr<DhcpSubnetElementData>,
) {
    public var elements: MutPtr<DhcpSubnetElementData> = elementsCtorArg
        internal set

    public constructor() : this(
        numElements = 0u,
        elementsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numElements

    public operator fun component2(): MutPtr<DhcpSubnetElementData> = this.elements

    public fun copy(numElements: UInt = this.numElements, elements: MutPtr<DhcpSubnetElementData> = this.elements): DhcpSubnetElementInfoArray = DhcpSubnetElementInfoArray(numElements = numElements, elementsCtorArg = elements)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpSubnetElementInfoArray) return false
        if (this.numElements != other.numElements) return false
        if (this.elements != other.elements) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numElements.hashCode()
        result = 31 * result + this.elements.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpSubnetElementInfoArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpSubnetElementInfoArray> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DhcpSubnetElementInfoArray =
                    DhcpSubnetElementInfoArray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<DhcpSubnetElementData>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DhcpSubnetElementInfoArray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numElements)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<DhcpSubnetElementData>(64)
                    ).writeNative(addr + 8L, value.elements)
                }
            }

        public operator fun invoke(
            numElements: UInt = 0u,
            elements: MutPtr<DhcpSubnetElementData> = MutPtr(0L),
        ): DhcpSubnetElementInfoArray =
            DhcpSubnetElementInfoArray(
                numElements = numElements,
                elementsCtorArg = elements,
            )
    }
}

public class DhcpSubnetElementInfoArrayV4 internal constructor(
    public var numElements: UInt,
    elementsCtorArg: MutPtr<DhcpSubnetElementDataV4>,
) {
    public var elements: MutPtr<DhcpSubnetElementDataV4> = elementsCtorArg
        internal set

    public constructor() : this(
        numElements = 0u,
        elementsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numElements

    public operator fun component2(): MutPtr<DhcpSubnetElementDataV4> = this.elements

    public fun copy(numElements: UInt = this.numElements, elements: MutPtr<DhcpSubnetElementDataV4> = this.elements): DhcpSubnetElementInfoArrayV4 = DhcpSubnetElementInfoArrayV4(numElements = numElements, elementsCtorArg = elements)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpSubnetElementInfoArrayV4) return false
        if (this.numElements != other.numElements) return false
        if (this.elements != other.elements) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numElements.hashCode()
        result = 31 * result + this.elements.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpSubnetElementInfoArrayV4> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpSubnetElementInfoArrayV4> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DhcpSubnetElementInfoArrayV4 =
                    DhcpSubnetElementInfoArrayV4(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<DhcpSubnetElementDataV4>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DhcpSubnetElementInfoArrayV4) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numElements)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<DhcpSubnetElementDataV4>(64)
                    ).writeNative(addr + 8L, value.elements)
                }
            }

        public operator fun invoke(
            numElements: UInt = 0u,
            elements: MutPtr<DhcpSubnetElementDataV4> = MutPtr(0L),
        ): DhcpSubnetElementInfoArrayV4 =
            DhcpSubnetElementInfoArrayV4(
                numElements = numElements,
                elementsCtorArg = elements,
            )
    }
}

public class DhcpSubnetElementInfoArrayV5 internal constructor(
    public var numElements: UInt,
    elementsCtorArg: MutPtr<DhcpSubnetElementDataV5>,
) {
    public var elements: MutPtr<DhcpSubnetElementDataV5> = elementsCtorArg
        internal set

    public constructor() : this(
        numElements = 0u,
        elementsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numElements

    public operator fun component2(): MutPtr<DhcpSubnetElementDataV5> = this.elements

    public fun copy(numElements: UInt = this.numElements, elements: MutPtr<DhcpSubnetElementDataV5> = this.elements): DhcpSubnetElementInfoArrayV5 = DhcpSubnetElementInfoArrayV5(numElements = numElements, elementsCtorArg = elements)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpSubnetElementInfoArrayV5) return false
        if (this.numElements != other.numElements) return false
        if (this.elements != other.elements) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numElements.hashCode()
        result = 31 * result + this.elements.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpSubnetElementInfoArrayV5> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpSubnetElementInfoArrayV5> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DhcpSubnetElementInfoArrayV5 =
                    DhcpSubnetElementInfoArrayV5(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<DhcpSubnetElementDataV5>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DhcpSubnetElementInfoArrayV5) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numElements)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<DhcpSubnetElementDataV5>(64)
                    ).writeNative(addr + 8L, value.elements)
                }
            }

        public operator fun invoke(
            numElements: UInt = 0u,
            elements: MutPtr<DhcpSubnetElementDataV5> = MutPtr(0L),
        ): DhcpSubnetElementInfoArrayV5 =
            DhcpSubnetElementInfoArrayV5(
                numElements = numElements,
                elementsCtorArg = elements,
            )
    }
}

public class DhcpSubnetElementInfoArrayV6 internal constructor(
    public var numElements: UInt,
    elementsCtorArg: MutPtr<DhcpSubnetElementDataV6>,
) {
    public var elements: MutPtr<DhcpSubnetElementDataV6> = elementsCtorArg
        internal set

    public constructor() : this(
        numElements = 0u,
        elementsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numElements

    public operator fun component2(): MutPtr<DhcpSubnetElementDataV6> = this.elements

    public fun copy(numElements: UInt = this.numElements, elements: MutPtr<DhcpSubnetElementDataV6> = this.elements): DhcpSubnetElementInfoArrayV6 = DhcpSubnetElementInfoArrayV6(numElements = numElements, elementsCtorArg = elements)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpSubnetElementInfoArrayV6) return false
        if (this.numElements != other.numElements) return false
        if (this.elements != other.elements) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numElements.hashCode()
        result = 31 * result + this.elements.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpSubnetElementInfoArrayV6> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpSubnetElementInfoArrayV6> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DhcpSubnetElementInfoArrayV6 =
                    DhcpSubnetElementInfoArrayV6(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<DhcpSubnetElementDataV6>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DhcpSubnetElementInfoArrayV6) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numElements)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<DhcpSubnetElementDataV6>(64)
                    ).writeNative(addr + 8L, value.elements)
                }
            }

        public operator fun invoke(
            numElements: UInt = 0u,
            elements: MutPtr<DhcpSubnetElementDataV6> = MutPtr(0L),
        ): DhcpSubnetElementInfoArrayV6 =
            DhcpSubnetElementInfoArrayV6(
                numElements = numElements,
                elementsCtorArg = elements,
            )
    }
}

public class DhcpSubnetInfo internal constructor(
    public var subnetAddress: UInt,
    public var subnetMask: UInt,
    subnetNameCtorArg: Pwstr,
    subnetCommentCtorArg: Pwstr,
    public var primaryHost: DhcpHostInfo,
    public var subnetState: DhcpSubnetState,
) {
    public var subnetName: Pwstr = subnetNameCtorArg
        internal set

    public var subnetComment: Pwstr = subnetCommentCtorArg
        internal set

    public constructor() : this(
        subnetAddress = 0u,
        subnetMask = 0u,
        subnetNameCtorArg = MutPtr(0L),
        subnetCommentCtorArg = MutPtr(0L),
        primaryHost = DhcpHostInfo(),
        subnetState = 0,
    )

    public operator fun component1(): UInt = this.subnetAddress

    public operator fun component2(): UInt = this.subnetMask

    public operator fun component3(): Pwstr = this.subnetName

    public operator fun component4(): Pwstr = this.subnetComment

    public operator fun component5(): DhcpHostInfo = this.primaryHost

    public operator fun component6(): DhcpSubnetState = this.subnetState

    public fun copy(subnetAddress: UInt = this.subnetAddress, subnetMask: UInt = this.subnetMask, subnetName: Pwstr = this.subnetName, subnetComment: Pwstr = this.subnetComment, primaryHost: DhcpHostInfo = this.primaryHost, subnetState: DhcpSubnetState = this.subnetState): DhcpSubnetInfo = DhcpSubnetInfo(subnetAddress = subnetAddress, subnetMask = subnetMask, subnetNameCtorArg = subnetName, subnetCommentCtorArg = subnetComment, primaryHost = primaryHost, subnetState = subnetState)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpSubnetInfo) return false
        if (this.subnetAddress != other.subnetAddress) return false
        if (this.subnetMask != other.subnetMask) return false
        if (this.subnetName != other.subnetName) return false
        if (this.subnetComment != other.subnetComment) return false
        if (this.primaryHost != other.primaryHost) return false
        if (this.subnetState != other.subnetState) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.subnetAddress.hashCode()
        result = 31 * result + this.subnetMask.hashCode()
        result = 31 * result + this.subnetName.hashCode()
        result = 31 * result + this.subnetComment.hashCode()
        result = 31 * result + this.primaryHost.hashCode()
        result = 31 * result + this.subnetState.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            subnetAddress: UInt = 0u,
            subnetMask: UInt = 0u,
            subnetName: Pwstr = MutPtr(0L),
            subnetComment: Pwstr = MutPtr(0L),
            primaryHost: DhcpHostInfo = DhcpHostInfo(),
            subnetState: DhcpSubnetState = 0,
        ): DhcpSubnetInfo =
            DhcpSubnetInfo(
                subnetAddress = subnetAddress,
                subnetMask = subnetMask,
                subnetNameCtorArg = subnetName,
                subnetCommentCtorArg = subnetComment,
                primaryHost = primaryHost,
                subnetState = subnetState,
            )
    }
}

public class DhcpSubnetInfoV6 internal constructor(
    public var subnetAddress: DhcpIpv6Address,
    public var prefix: UInt,
    public var preference: UShort,
    subnetNameCtorArg: Pwstr,
    subnetCommentCtorArg: Pwstr,
    public var state: UInt,
    public var scopeId: UInt,
) {
    public var subnetName: Pwstr = subnetNameCtorArg
        internal set

    public var subnetComment: Pwstr = subnetCommentCtorArg
        internal set

    public constructor() : this(
        subnetAddress = DhcpIpv6Address(),
        prefix = 0u,
        preference = 0u,
        subnetNameCtorArg = MutPtr(0L),
        subnetCommentCtorArg = MutPtr(0L),
        state = 0u,
        scopeId = 0u,
    )

    public operator fun component1(): DhcpIpv6Address = this.subnetAddress

    public operator fun component2(): UInt = this.prefix

    public operator fun component3(): UShort = this.preference

    public operator fun component4(): Pwstr = this.subnetName

    public operator fun component5(): Pwstr = this.subnetComment

    public operator fun component6(): UInt = this.state

    public operator fun component7(): UInt = this.scopeId

    public fun copy(subnetAddress: DhcpIpv6Address = this.subnetAddress, prefix: UInt = this.prefix, preference: UShort = this.preference, subnetName: Pwstr = this.subnetName, subnetComment: Pwstr = this.subnetComment, state: UInt = this.state, scopeId: UInt = this.scopeId): DhcpSubnetInfoV6 = DhcpSubnetInfoV6(subnetAddress = subnetAddress, prefix = prefix, preference = preference, subnetNameCtorArg = subnetName, subnetCommentCtorArg = subnetComment, state = state, scopeId = scopeId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpSubnetInfoV6) return false
        if (this.subnetAddress != other.subnetAddress) return false
        if (this.prefix != other.prefix) return false
        if (this.preference != other.preference) return false
        if (this.subnetName != other.subnetName) return false
        if (this.subnetComment != other.subnetComment) return false
        if (this.state != other.state) return false
        if (this.scopeId != other.scopeId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.subnetAddress.hashCode()
        result = 31 * result + this.prefix.hashCode()
        result = 31 * result + this.preference.hashCode()
        result = 31 * result + this.subnetName.hashCode()
        result = 31 * result + this.subnetComment.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.scopeId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            subnetAddress: DhcpIpv6Address = DhcpIpv6Address(),
            prefix: UInt = 0u,
            preference: UShort = 0u,
            subnetName: Pwstr = MutPtr(0L),
            subnetComment: Pwstr = MutPtr(0L),
            state: UInt = 0u,
            scopeId: UInt = 0u,
        ): DhcpSubnetInfoV6 =
            DhcpSubnetInfoV6(
                subnetAddress = subnetAddress,
                prefix = prefix,
                preference = preference,
                subnetNameCtorArg = subnetName,
                subnetCommentCtorArg = subnetComment,
                state = state,
                scopeId = scopeId,
            )
    }
}

public class DhcpSubnetInfoVq internal constructor(
    public var subnetAddress: UInt,
    public var subnetMask: UInt,
    subnetNameCtorArg: Pwstr,
    subnetCommentCtorArg: Pwstr,
    public var primaryHost: DhcpHostInfo,
    public var subnetState: DhcpSubnetState,
    public var quarantineOn: UInt,
    public var reserved1: UInt,
    public var reserved2: UInt,
    public var reserved3: Long,
    public var reserved4: Long,
) {
    public var subnetName: Pwstr = subnetNameCtorArg
        internal set

    public var subnetComment: Pwstr = subnetCommentCtorArg
        internal set

    public constructor() : this(
        subnetAddress = 0u,
        subnetMask = 0u,
        subnetNameCtorArg = MutPtr(0L),
        subnetCommentCtorArg = MutPtr(0L),
        primaryHost = DhcpHostInfo(),
        subnetState = 0,
        quarantineOn = 0u,
        reserved1 = 0u,
        reserved2 = 0u,
        reserved3 = 0L,
        reserved4 = 0L,
    )

    public operator fun component1(): UInt = this.subnetAddress

    public operator fun component2(): UInt = this.subnetMask

    public operator fun component3(): Pwstr = this.subnetName

    public operator fun component4(): Pwstr = this.subnetComment

    public operator fun component5(): DhcpHostInfo = this.primaryHost

    public operator fun component6(): DhcpSubnetState = this.subnetState

    public operator fun component7(): UInt = this.quarantineOn

    public operator fun component8(): UInt = this.reserved1

    public operator fun component9(): UInt = this.reserved2

    public operator fun component10(): Long = this.reserved3

    public operator fun component11(): Long = this.reserved4

    public fun copy(subnetAddress: UInt = this.subnetAddress, subnetMask: UInt = this.subnetMask, subnetName: Pwstr = this.subnetName, subnetComment: Pwstr = this.subnetComment, primaryHost: DhcpHostInfo = this.primaryHost, subnetState: DhcpSubnetState = this.subnetState, quarantineOn: UInt = this.quarantineOn, reserved1: UInt = this.reserved1, reserved2: UInt = this.reserved2, reserved3: Long = this.reserved3, reserved4: Long = this.reserved4): DhcpSubnetInfoVq = DhcpSubnetInfoVq(subnetAddress = subnetAddress, subnetMask = subnetMask, subnetNameCtorArg = subnetName, subnetCommentCtorArg = subnetComment, primaryHost = primaryHost, subnetState = subnetState, quarantineOn = quarantineOn, reserved1 = reserved1, reserved2 = reserved2, reserved3 = reserved3, reserved4 = reserved4)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpSubnetInfoVq) return false
        if (this.subnetAddress != other.subnetAddress) return false
        if (this.subnetMask != other.subnetMask) return false
        if (this.subnetName != other.subnetName) return false
        if (this.subnetComment != other.subnetComment) return false
        if (this.primaryHost != other.primaryHost) return false
        if (this.subnetState != other.subnetState) return false
        if (this.quarantineOn != other.quarantineOn) return false
        if (this.reserved1 != other.reserved1) return false
        if (this.reserved2 != other.reserved2) return false
        if (this.reserved3 != other.reserved3) return false
        if (this.reserved4 != other.reserved4) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.subnetAddress.hashCode()
        result = 31 * result + this.subnetMask.hashCode()
        result = 31 * result + this.subnetName.hashCode()
        result = 31 * result + this.subnetComment.hashCode()
        result = 31 * result + this.primaryHost.hashCode()
        result = 31 * result + this.subnetState.hashCode()
        result = 31 * result + this.quarantineOn.hashCode()
        result = 31 * result + this.reserved1.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.reserved3.hashCode()
        result = 31 * result + this.reserved4.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            subnetAddress: UInt = 0u,
            subnetMask: UInt = 0u,
            subnetName: Pwstr = MutPtr(0L),
            subnetComment: Pwstr = MutPtr(0L),
            primaryHost: DhcpHostInfo = DhcpHostInfo(),
            subnetState: DhcpSubnetState = 0,
            quarantineOn: UInt = 0u,
            reserved1: UInt = 0u,
            reserved2: UInt = 0u,
            reserved3: Long = 0L,
            reserved4: Long = 0L,
        ): DhcpSubnetInfoVq =
            DhcpSubnetInfoVq(
                subnetAddress = subnetAddress,
                subnetMask = subnetMask,
                subnetNameCtorArg = subnetName,
                subnetCommentCtorArg = subnetComment,
                primaryHost = primaryHost,
                subnetState = subnetState,
                quarantineOn = quarantineOn,
                reserved1 = reserved1,
                reserved2 = reserved2,
                reserved3 = reserved3,
                reserved4 = reserved4,
            )
    }
}

public class DhcpSuperScopeTable internal constructor(
    public var cEntries: UInt,
    pEntriesCtorArg: MutPtr<DhcpSuperScopeTableEntry>,
) {
    public var pEntries: MutPtr<DhcpSuperScopeTableEntry> = pEntriesCtorArg
        internal set

    public constructor() : this(
        cEntries = 0u,
        pEntriesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cEntries

    public operator fun component2(): MutPtr<DhcpSuperScopeTableEntry> = this.pEntries

    public fun copy(cEntries: UInt = this.cEntries, pEntries: MutPtr<DhcpSuperScopeTableEntry> = this.pEntries): DhcpSuperScopeTable = DhcpSuperScopeTable(cEntries = cEntries, pEntriesCtorArg = pEntries)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpSuperScopeTable) return false
        if (this.cEntries != other.cEntries) return false
        if (this.pEntries != other.pEntries) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cEntries.hashCode()
        result = 31 * result + this.pEntries.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpSuperScopeTable> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DhcpSuperScopeTable> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DhcpSuperScopeTable =
                    DhcpSuperScopeTable(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<DhcpSuperScopeTableEntry>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DhcpSuperScopeTable) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<DhcpSuperScopeTableEntry>(64)
                    ).writeNative(addr + 8L, value.pEntries)
                }
            }

        public operator fun invoke(
            cEntries: UInt = 0u,
            pEntries: MutPtr<DhcpSuperScopeTableEntry> = MutPtr(0L),
        ): DhcpSuperScopeTable =
            DhcpSuperScopeTable(
                cEntries = cEntries,
                pEntriesCtorArg = pEntries,
            )
    }
}

public class DhcpSuperScopeTableEntry internal constructor(
    public var subnetAddress: UInt,
    public var superScopeNumber: UInt,
    public var nextInSuperScope: UInt,
    superScopeNameCtorArg: Pwstr,
) {
    public var superScopeName: Pwstr = superScopeNameCtorArg
        internal set

    public constructor() : this(
        subnetAddress = 0u,
        superScopeNumber = 0u,
        nextInSuperScope = 0u,
        superScopeNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.subnetAddress

    public operator fun component2(): UInt = this.superScopeNumber

    public operator fun component3(): UInt = this.nextInSuperScope

    public operator fun component4(): Pwstr = this.superScopeName

    public fun copy(subnetAddress: UInt = this.subnetAddress, superScopeNumber: UInt = this.superScopeNumber, nextInSuperScope: UInt = this.nextInSuperScope, superScopeName: Pwstr = this.superScopeName): DhcpSuperScopeTableEntry = DhcpSuperScopeTableEntry(subnetAddress = subnetAddress, superScopeNumber = superScopeNumber, nextInSuperScope = nextInSuperScope, superScopeNameCtorArg = superScopeName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DhcpSuperScopeTableEntry) return false
        if (this.subnetAddress != other.subnetAddress) return false
        if (this.superScopeNumber != other.superScopeNumber) return false
        if (this.nextInSuperScope != other.nextInSuperScope) return false
        if (this.superScopeName != other.superScopeName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.subnetAddress.hashCode()
        result = 31 * result + this.superScopeNumber.hashCode()
        result = 31 * result + this.nextInSuperScope.hashCode()
        result = 31 * result + this.superScopeName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            subnetAddress: UInt = 0u,
            superScopeNumber: UInt = 0u,
            nextInSuperScope: UInt = 0u,
            superScopeName: Pwstr = MutPtr(0L),
        ): DhcpSuperScopeTableEntry =
            DhcpSuperScopeTableEntry(
                subnetAddress = subnetAddress,
                superScopeNumber = superScopeNumber,
                nextInSuperScope = nextInSuperScope,
                superScopeNameCtorArg = superScopeName,
            )
    }
}

public data class DwordDword(
    public var dWord1: UInt = 0u,
    public var dWord2: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DwordDword> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DwordDword> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): DwordDword =
                    DwordDword(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: DwordDword) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dWord1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dWord2)
                }
            }
    }
}

public data class ScopeMibInfo(
    public var subnet: UInt = 0u,
    public var numAddressesInuse: UInt = 0u,
    public var numAddressesFree: UInt = 0u,
    public var numPendingOffers: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScopeMibInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScopeMibInfo> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ScopeMibInfo =
                    ScopeMibInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: ScopeMibInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.subnet)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.numAddressesInuse)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.numAddressesFree)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.numPendingOffers)
                }
            }
    }
}

public data class ScopeMibInfoV5(
    public var subnet: UInt = 0u,
    public var numAddressesInuse: UInt = 0u,
    public var numAddressesFree: UInt = 0u,
    public var numPendingOffers: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScopeMibInfoV5> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScopeMibInfoV5> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ScopeMibInfoV5 =
                    ScopeMibInfoV5(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: ScopeMibInfoV5) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.subnet)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.numAddressesInuse)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.numAddressesFree)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.numPendingOffers)
                }
            }
    }
}

public data class ScopeMibInfoV6(
    public var subnet: DhcpIpv6Address = DhcpIpv6Address(),
    public var numAddressesInuse: ULong = 0uL,
    public var numAddressesFree: ULong = 0uL,
    public var numPendingAdvertises: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScopeMibInfoV6> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScopeMibInfoV6> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): ScopeMibInfoV6 =
                    ScopeMibInfoV6(
                        (DhcpIpv6Address.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: ScopeMibInfoV6) {
                    (DhcpIpv6Address.typeLayout()).writeNative(addr, value.subnet)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.numAddressesInuse)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.numAddressesFree)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.numPendingAdvertises)
                }
            }
    }
}

public data class ScopeMibInfoVq(
    public var subnet: UInt = 0u,
    public var numAddressesInuse: UInt = 0u,
    public var numAddressesFree: UInt = 0u,
    public var numPendingOffers: UInt = 0u,
    public var qtnNumLeases: UInt = 0u,
    public var qtnPctQtnLeases: UInt = 0u,
    public var qtnProbationLeases: UInt = 0u,
    public var qtnNonQtnLeases: UInt = 0u,
    public var qtnExemptLeases: UInt = 0u,
    public var qtnCapableClients: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScopeMibInfoVq> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScopeMibInfoVq> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ScopeMibInfoVq =
                    ScopeMibInfoVq(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: ScopeMibInfoVq) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.subnet)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.numAddressesInuse)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.numAddressesFree)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.numPendingOffers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.qtnNumLeases)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.qtnPctQtnLeases)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.qtnProbationLeases)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.qtnNonQtnLeases)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.qtnExemptLeases)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.qtnCapableClients)
                }
            }
    }
}
