@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.eventlog

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.security.Psid

public data class Eventlogrecord(
    public var length: UInt = 0u,
    public var reserved: UInt = 0u,
    public var recordNumber: UInt = 0u,
    public var timeGenerated: UInt = 0u,
    public var timeWritten: UInt = 0u,
    public var eventID: UInt = 0u,
    public var eventType: ReportEventType = 0u,
    public var numStrings: UShort = 0u,
    public var eventCategory: UShort = 0u,
    public var reservedFlags: UShort = 0u,
    public var closingRecordNumber: UInt = 0u,
    public var stringOffset: UInt = 0u,
    public var userSidLength: UInt = 0u,
    public var userSidOffset: UInt = 0u,
    public var dataLength: UInt = 0u,
    public var dataOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Eventlogrecord> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Eventlogrecord> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): Eventlogrecord =
                    Eventlogrecord(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 26L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 30L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                    )
                override fun writeNative(addr: Long, value: Eventlogrecord) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.recordNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.timeGenerated)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.timeWritten)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.eventID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 24L, value.eventType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 26L, value.numStrings)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 28L, value.eventCategory)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 30L, value.reservedFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.closingRecordNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.stringOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.userSidLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.userSidOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.dataLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.dataOffset)
                }
            }
    }
}

public data class EventlogFullInformation(
    public var dwFull: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventlogFullInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EventlogFullInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): EventlogFullInformation =
                    EventlogFullInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: EventlogFullInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwFull)
                }
            }
    }
}

public data class Eventsforlogfile(
    public var ulSize: UInt = 0u,
    public var szLogicalLogFile: UShortArray = UShortArray(256),
    public var ulNumRecords: UInt = 0u,
    public var pEventLogRecords: List<Eventlogrecord> = List(1) { Eventlogrecord() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Eventsforlogfile) return false
        if (this.ulSize != other.ulSize) return false
        if (!this.szLogicalLogFile.contentEquals(other.szLogicalLogFile)) return false
        if (this.ulNumRecords != other.ulNumRecords) return false
        if (this.pEventLogRecords != other.pEventLogRecords) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ulSize.hashCode()
        result = 31 * result + this.szLogicalLogFile.contentHashCode()
        result = 31 * result + this.ulNumRecords.hashCode()
        result = 31 * result + this.pEventLogRecords.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Eventsforlogfile> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Eventsforlogfile> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 576L
                override fun readNative(addr: Long): Eventsforlogfile =
                    Eventsforlogfile(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 516L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(Eventlogrecord.typeLayout(), (1).toInt())
                        ).readNative(addr + 520L),
                    )
                override fun writeNative(addr: Long, value: Eventsforlogfile) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 4L, value.szLogicalLogFile.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 516L, value.ulNumRecords)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(Eventlogrecord.typeLayout(), (1).toInt())
                    ).writeNative(addr + 520L, value.pEventLogRecords)
                }
            }
    }
}

public class EvtRpcLogin internal constructor(
    serverCtorArg: Pwstr,
    userCtorArg: Pwstr,
    domainCtorArg: Pwstr,
    passwordCtorArg: Pwstr,
    public var flags: UInt,
) {
    public var server: Pwstr = serverCtorArg
        internal set

    public var user: Pwstr = userCtorArg
        internal set

    public var domain: Pwstr = domainCtorArg
        internal set

    public var password: Pwstr = passwordCtorArg
        internal set

    public constructor() : this(
        serverCtorArg = MutPtr(0L),
        userCtorArg = MutPtr(0L),
        domainCtorArg = MutPtr(0L),
        passwordCtorArg = MutPtr(0L),
        flags = 0u,
    )

    public operator fun component1(): Pwstr = this.server

    public operator fun component2(): Pwstr = this.user

    public operator fun component3(): Pwstr = this.domain

    public operator fun component4(): Pwstr = this.password

    public operator fun component5(): UInt = this.flags

    public fun copy(server: Pwstr = this.server, user: Pwstr = this.user, domain: Pwstr = this.domain, password: Pwstr = this.password, flags: UInt = this.flags): EvtRpcLogin = EvtRpcLogin(serverCtorArg = server, userCtorArg = user, domainCtorArg = domain, passwordCtorArg = password, flags = flags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EvtRpcLogin) return false
        if (this.server != other.server) return false
        if (this.user != other.user) return false
        if (this.domain != other.domain) return false
        if (this.password != other.password) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.server.hashCode()
        result = 31 * result + this.user.hashCode()
        result = 31 * result + this.domain.hashCode()
        result = 31 * result + this.password.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            server: Pwstr = MutPtr(0L),
            user: Pwstr = MutPtr(0L),
            domain: Pwstr = MutPtr(0L),
            password: Pwstr = MutPtr(0L),
            flags: UInt = 0u,
        ): EvtRpcLogin =
            EvtRpcLogin(
                serverCtorArg = server,
                userCtorArg = user,
                domainCtorArg = domain,
                passwordCtorArg = password,
                flags = flags,
            )
    }
}

public data class EvtVariant(
    public var anonymous: EvtVariant0 = EvtVariant0(),
    public var count: UInt = 0u,
    public var type: UInt = 0u,
)

public class EvtVariant0 internal constructor(
    public var booleanVal: Bool,
    public var sByteVal: Byte,
    public var int16Val: Short,
    public var int32Val: Int,
    public var int64Val: Long,
    public var byteVal: UByte,
    public var uInt16Val: UShort,
    public var uInt32Val: UInt,
    public var uInt64Val: ULong,
    public var singleVal: Float,
    public var doubleVal: Double,
    public var fileTimeVal: ULong,
    sysTimeValCtorArg: MutPtr,
    guidValCtorArg: MutPtr,
    stringValCtorArg: Pcwstr,
    ansiStringValCtorArg: Pcstr,
    binaryValCtorArg: MutPtr,
    sidValCtorArg: Psid,
    public var sizeTVal: Int,
    booleanArrCtorArg: MutPtr,
    sByteArrCtorArg: MutPtr,
    int16ArrCtorArg: MutPtr,
    int32ArrCtorArg: MutPtr,
    int64ArrCtorArg: MutPtr,
    byteArrCtorArg: MutPtr,
    uInt16ArrCtorArg: MutPtr,
    uInt32ArrCtorArg: MutPtr,
    uInt64ArrCtorArg: MutPtr,
    singleArrCtorArg: MutPtr,
    doubleArrCtorArg: MutPtr,
    fileTimeArrCtorArg: MutPtr,
    sysTimeArrCtorArg: MutPtr,
    guidArrCtorArg: MutPtr,
    stringArrCtorArg: MutPtr,
    ansiStringArrCtorArg: MutPtr,
    sidArrCtorArg: MutPtr,
    sizeTArrCtorArg: MutPtr,
    public var evtHandleVal: EvtHandle,
    xmlValCtorArg: Pcwstr,
    xmlValArrCtorArg: ConstPtr,
) {
    public var sysTimeVal: MutPtr = sysTimeValCtorArg
        internal set

    public var guidVal: MutPtr = guidValCtorArg
        internal set

    public var stringVal: Pcwstr = stringValCtorArg
        internal set

    public var ansiStringVal: Pcstr = ansiStringValCtorArg
        internal set

    public var binaryVal: MutPtr = binaryValCtorArg
        internal set

    public var sidVal: Psid = sidValCtorArg
        internal set

    public var booleanArr: MutPtr = booleanArrCtorArg
        internal set

    public var sByteArr: MutPtr = sByteArrCtorArg
        internal set

    public var int16Arr: MutPtr = int16ArrCtorArg
        internal set

    public var int32Arr: MutPtr = int32ArrCtorArg
        internal set

    public var int64Arr: MutPtr = int64ArrCtorArg
        internal set

    public var byteArr: MutPtr = byteArrCtorArg
        internal set

    public var uInt16Arr: MutPtr = uInt16ArrCtorArg
        internal set

    public var uInt32Arr: MutPtr = uInt32ArrCtorArg
        internal set

    public var uInt64Arr: MutPtr = uInt64ArrCtorArg
        internal set

    public var singleArr: MutPtr = singleArrCtorArg
        internal set

    public var doubleArr: MutPtr = doubleArrCtorArg
        internal set

    public var fileTimeArr: MutPtr = fileTimeArrCtorArg
        internal set

    public var sysTimeArr: MutPtr = sysTimeArrCtorArg
        internal set

    public var guidArr: MutPtr = guidArrCtorArg
        internal set

    public var stringArr: MutPtr = stringArrCtorArg
        internal set

    public var ansiStringArr: MutPtr = ansiStringArrCtorArg
        internal set

    public var sidArr: MutPtr = sidArrCtorArg
        internal set

    public var sizeTArr: MutPtr = sizeTArrCtorArg
        internal set

    public var xmlVal: Pcwstr = xmlValCtorArg
        internal set

    public var xmlValArr: ConstPtr = xmlValArrCtorArg
        internal set

    public constructor() : this(
        booleanVal = 0,
        sByteVal = 0,
        int16Val = 0,
        int32Val = 0,
        int64Val = 0L,
        byteVal = 0u,
        uInt16Val = 0u,
        uInt32Val = 0u,
        uInt64Val = 0uL,
        singleVal = 0.0f,
        doubleVal = 0.0,
        fileTimeVal = 0uL,
        sysTimeValCtorArg = MutPtr(0L),
        guidValCtorArg = MutPtr(0L),
        stringValCtorArg = ConstPtr(0L),
        ansiStringValCtorArg = ConstPtr(0L),
        binaryValCtorArg = MutPtr(0L),
        sidValCtorArg = MutPtr(0L),
        sizeTVal = 0,
        booleanArrCtorArg = MutPtr(0L),
        sByteArrCtorArg = MutPtr(0L),
        int16ArrCtorArg = MutPtr(0L),
        int32ArrCtorArg = MutPtr(0L),
        int64ArrCtorArg = MutPtr(0L),
        byteArrCtorArg = MutPtr(0L),
        uInt16ArrCtorArg = MutPtr(0L),
        uInt32ArrCtorArg = MutPtr(0L),
        uInt64ArrCtorArg = MutPtr(0L),
        singleArrCtorArg = MutPtr(0L),
        doubleArrCtorArg = MutPtr(0L),
        fileTimeArrCtorArg = MutPtr(0L),
        sysTimeArrCtorArg = MutPtr(0L),
        guidArrCtorArg = MutPtr(0L),
        stringArrCtorArg = MutPtr(0L),
        ansiStringArrCtorArg = MutPtr(0L),
        sidArrCtorArg = MutPtr(0L),
        sizeTArrCtorArg = MutPtr(0L),
        evtHandleVal = 0L,
        xmlValCtorArg = ConstPtr(0L),
        xmlValArrCtorArg = ConstPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            booleanVal: Bool = 0,
            sByteVal: Byte = 0,
            int16Val: Short = 0,
            int32Val: Int = 0,
            int64Val: Long = 0L,
            byteVal: UByte = 0u,
            uInt16Val: UShort = 0u,
            uInt32Val: UInt = 0u,
            uInt64Val: ULong = 0uL,
            singleVal: Float = 0.0f,
            doubleVal: Double = 0.0,
            fileTimeVal: ULong = 0uL,
            sysTimeVal: MutPtr = MutPtr(0L),
            guidVal: MutPtr = MutPtr(0L),
            stringVal: Pcwstr = ConstPtr(0L),
            ansiStringVal: Pcstr = ConstPtr(0L),
            binaryVal: MutPtr = MutPtr(0L),
            sidVal: Psid = MutPtr(0L),
            sizeTVal: Int = 0,
            booleanArr: MutPtr = MutPtr(0L),
            sByteArr: MutPtr = MutPtr(0L),
            int16Arr: MutPtr = MutPtr(0L),
            int32Arr: MutPtr = MutPtr(0L),
            int64Arr: MutPtr = MutPtr(0L),
            byteArr: MutPtr = MutPtr(0L),
            uInt16Arr: MutPtr = MutPtr(0L),
            uInt32Arr: MutPtr = MutPtr(0L),
            uInt64Arr: MutPtr = MutPtr(0L),
            singleArr: MutPtr = MutPtr(0L),
            doubleArr: MutPtr = MutPtr(0L),
            fileTimeArr: MutPtr = MutPtr(0L),
            sysTimeArr: MutPtr = MutPtr(0L),
            guidArr: MutPtr = MutPtr(0L),
            stringArr: MutPtr = MutPtr(0L),
            ansiStringArr: MutPtr = MutPtr(0L),
            sidArr: MutPtr = MutPtr(0L),
            sizeTArr: MutPtr = MutPtr(0L),
            evtHandleVal: EvtHandle = 0L,
            xmlVal: Pcwstr = ConstPtr(0L),
            xmlValArr: ConstPtr = ConstPtr(0L),
        ): EvtVariant0 =
            EvtVariant0(
                booleanVal = booleanVal,
                sByteVal = sByteVal,
                int16Val = int16Val,
                int32Val = int32Val,
                int64Val = int64Val,
                byteVal = byteVal,
                uInt16Val = uInt16Val,
                uInt32Val = uInt32Val,
                uInt64Val = uInt64Val,
                singleVal = singleVal,
                doubleVal = doubleVal,
                fileTimeVal = fileTimeVal,
                sysTimeValCtorArg = sysTimeVal,
                guidValCtorArg = guidVal,
                stringValCtorArg = stringVal,
                ansiStringValCtorArg = ansiStringVal,
                binaryValCtorArg = binaryVal,
                sidValCtorArg = sidVal,
                sizeTVal = sizeTVal,
                booleanArrCtorArg = booleanArr,
                sByteArrCtorArg = sByteArr,
                int16ArrCtorArg = int16Arr,
                int32ArrCtorArg = int32Arr,
                int64ArrCtorArg = int64Arr,
                byteArrCtorArg = byteArr,
                uInt16ArrCtorArg = uInt16Arr,
                uInt32ArrCtorArg = uInt32Arr,
                uInt64ArrCtorArg = uInt64Arr,
                singleArrCtorArg = singleArr,
                doubleArrCtorArg = doubleArr,
                fileTimeArrCtorArg = fileTimeArr,
                sysTimeArrCtorArg = sysTimeArr,
                guidArrCtorArg = guidArr,
                stringArrCtorArg = stringArr,
                ansiStringArrCtorArg = ansiStringArr,
                sidArrCtorArg = sidArr,
                sizeTArrCtorArg = sizeTArr,
                evtHandleVal = evtHandleVal,
                xmlValCtorArg = xmlVal,
                xmlValArrCtorArg = xmlValArr,
            )
    }
}
