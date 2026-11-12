package io.github.kotlinmania.windowssys.windows.win32.system.wmi

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

public class MiApplication internal constructor(
    public var reserved1: ULong,
    public var reserved2: Int,
    ftCtorArg: ConstPtr<MiApplicationFt>,
) {
    public var ft: ConstPtr<MiApplicationFt> = ftCtorArg
        internal set

    public constructor() : this(
        reserved1 = 0uL,
        reserved2 = 0,
        ftCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): ULong = this.reserved1

    public operator fun component2(): Int = this.reserved2

    public operator fun component3(): ConstPtr<MiApplicationFt> = this.ft

    public fun copy(reserved1: ULong = this.reserved1, reserved2: Int = this.reserved2, ft: ConstPtr<MiApplicationFt> = this.ft): MiApplication = MiApplication(reserved1 = reserved1, reserved2 = reserved2, ftCtorArg = ft)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiApplication) return false
        if (this.reserved1 != other.reserved1) return false
        if (this.reserved2 != other.reserved2) return false
        if (this.ft != other.ft) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved1.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.ft.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiApplication> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiApplication> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MiApplication =
                    MiApplication(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<MiApplicationFt>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: MiApplication) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.reserved2)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<MiApplicationFt>(64)
                    ).writeNative(addr + 16L, value.ft)
                }
            }

        public operator fun invoke(
            reserved1: ULong = 0uL,
            reserved2: Int = 0,
            ft: ConstPtr<MiApplicationFt> = ConstPtr(0L),
        ): MiApplication =
            MiApplication(
                reserved1 = reserved1,
                reserved2 = reserved2,
                ftCtorArg = ft,
            )
    }
}

public data class MiApplicationFt(
    public var close: Int = 0,
    public var newSession: Int = 0,
    public var newHostedProvider: Int = 0,
    public var newInstance: Int = 0,
    public var newDestinationOptions: Int = 0,
    public var newOperationOptions: Int = 0,
    public var newSubscriptionDeliveryOptions: Int = 0,
    public var newSerializer: Int = 0,
    public var newDeserializer: Int = 0,
    public var newInstanceFromClass: Int = 0,
    public var newClass: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiApplicationFt> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiApplicationFt> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 88L
                override fun readNative(addr: Long): MiApplicationFt =
                    MiApplicationFt(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 80L),
                    )
                override fun writeNative(addr: Long, value: MiApplicationFt) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr, value.close)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.newSession)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 16L, value.newHostedProvider)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 24L, value.newInstance)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 32L, value.newDestinationOptions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 40L, value.newOperationOptions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 48L, value.newSubscriptionDeliveryOptions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 56L, value.newSerializer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 64L, value.newDeserializer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 72L, value.newInstanceFromClass)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 80L, value.newClass)
                }
            }
    }
}

public class MiArray internal constructor(
    dataCtorArg: MutPtr<CVoid>,
    public var size: UInt,
) {
    public var data: MutPtr<CVoid> = dataCtorArg
        internal set

    public constructor() : this(
        dataCtorArg = MutPtr(0L),
        size = 0u,
    )

    public operator fun component1(): MutPtr<CVoid> = this.data

    public operator fun component2(): UInt = this.size

    public fun copy(data: MutPtr<CVoid> = this.data, size: UInt = this.size): MiArray = MiArray(dataCtorArg = data, size = size)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiArray) return false
        if (this.data != other.data) return false
        if (this.size != other.size) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.data.hashCode()
        result = 31 * result + this.size.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiArray> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MiArray =
                    MiArray(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MiArray) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.data)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.size)
                }
            }

        public operator fun invoke(
            data: MutPtr<CVoid> = MutPtr(0L),
            size: UInt = 0u,
        ): MiArray =
            MiArray(
                dataCtorArg = data,
                size = size,
            )
    }
}

public data class MiArrayField(
    public var value: MiArray = MiArray(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiArrayField> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiArrayField> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MiArrayField =
                    MiArrayField(
                        (MiArray.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 17L),
                    )
                override fun writeNative(addr: Long, value: MiArrayField) {
                    (MiArray.typeLayout()).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 17L, value.flags)
                }
            }
    }
}

public class MiBooleanA internal constructor(
    dataCtorArg: MutPtr<UByte>,
    public var size: UInt,
) {
    public var data: MutPtr<UByte> = dataCtorArg
        internal set

    public constructor() : this(
        dataCtorArg = MutPtr(0L),
        size = 0u,
    )

    public operator fun component1(): MutPtr<UByte> = this.data

    public operator fun component2(): UInt = this.size

    public fun copy(data: MutPtr<UByte> = this.data, size: UInt = this.size): MiBooleanA = MiBooleanA(dataCtorArg = data, size = size)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiBooleanA) return false
        if (this.data != other.data) return false
        if (this.size != other.size) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.data.hashCode()
        result = 31 * result + this.size.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiBooleanA> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiBooleanA> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MiBooleanA =
                    MiBooleanA(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MiBooleanA) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr, value.data)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.size)
                }
            }

        public operator fun invoke(
            data: MutPtr<UByte> = MutPtr(0L),
            size: UInt = 0u,
        ): MiBooleanA =
            MiBooleanA(
                dataCtorArg = data,
                size = size,
            )
    }
}

public data class MiBooleanAfield(
    public var value: MiBooleanA = MiBooleanA(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiBooleanAfield> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiBooleanAfield> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MiBooleanAfield =
                    MiBooleanAfield(
                        (MiBooleanA.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 17L),
                    )
                override fun writeNative(addr: Long, value: MiBooleanAfield) {
                    (MiBooleanA.typeLayout()).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 17L, value.flags)
                }
            }
    }
}

public data class MiBooleanField(
    public var value: UByte = 0u,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiBooleanField> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiBooleanField> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 3L
                override fun readNative(addr: Long): MiBooleanField =
                    MiBooleanField(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: MiBooleanField) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.flags)
                }
            }
    }
}

public class MiChar16A internal constructor(
    dataCtorArg: MutPtr<UShort>,
    public var size: UInt,
) {
    public var data: MutPtr<UShort> = dataCtorArg
        internal set

    public constructor() : this(
        dataCtorArg = MutPtr(0L),
        size = 0u,
    )

    public operator fun component1(): MutPtr<UShort> = this.data

    public operator fun component2(): UInt = this.size

    public fun copy(data: MutPtr<UShort> = this.data, size: UInt = this.size): MiChar16A = MiChar16A(dataCtorArg = data, size = size)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiChar16A) return false
        if (this.data != other.data) return false
        if (this.size != other.size) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.data.hashCode()
        result = 31 * result + this.size.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiChar16A> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiChar16A> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MiChar16A =
                    MiChar16A(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UShort>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MiChar16A) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UShort>(64)
                    ).writeNative(addr, value.data)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.size)
                }
            }

        public operator fun invoke(
            data: MutPtr<UShort> = MutPtr(0L),
            size: UInt = 0u,
        ): MiChar16A =
            MiChar16A(
                dataCtorArg = data,
                size = size,
            )
    }
}

public data class MiChar16Afield(
    public var value: MiChar16A = MiChar16A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiChar16Afield> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiChar16Afield> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MiChar16Afield =
                    MiChar16Afield(
                        (MiChar16A.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 17L),
                    )
                override fun writeNative(addr: Long, value: MiChar16Afield) {
                    (MiChar16A.typeLayout()).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 17L, value.flags)
                }
            }
    }
}

public data class MiChar16Field(
    public var value: UShort = 0u,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiChar16Field> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiChar16Field> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): MiChar16Field =
                    MiChar16Field(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: MiChar16Field) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.flags)
                }
            }
    }
}

public class MiClass internal constructor(
    ftCtorArg: ConstPtr<MiClassFt>,
    classDeclCtorArg: ConstPtr<MiClassDecl>,
    namespaceNameCtorArg: ConstPtr<UShort>,
    serverNameCtorArg: ConstPtr<UShort>,
    public var reserved: IntArray,
) {
    public var ft: ConstPtr<MiClassFt> = ftCtorArg
        internal set

    public var classDecl: ConstPtr<MiClassDecl> = classDeclCtorArg
        internal set

    public var namespaceName: ConstPtr<UShort> = namespaceNameCtorArg
        internal set

    public var serverName: ConstPtr<UShort> = serverNameCtorArg
        internal set

    public constructor() : this(
        ftCtorArg = ConstPtr(0L),
        classDeclCtorArg = ConstPtr(0L),
        namespaceNameCtorArg = ConstPtr(0L),
        serverNameCtorArg = ConstPtr(0L),
        reserved = IntArray(4),
    )

    public operator fun component1(): ConstPtr<MiClassFt> = this.ft

    public operator fun component2(): ConstPtr<MiClassDecl> = this.classDecl

    public operator fun component3(): ConstPtr<UShort> = this.namespaceName

    public operator fun component4(): ConstPtr<UShort> = this.serverName

    public operator fun component5(): IntArray = this.reserved

    public fun copy(ft: ConstPtr<MiClassFt> = this.ft, classDecl: ConstPtr<MiClassDecl> = this.classDecl, namespaceName: ConstPtr<UShort> = this.namespaceName, serverName: ConstPtr<UShort> = this.serverName, reserved: IntArray = this.reserved): MiClass = MiClass(ftCtorArg = ft, classDeclCtorArg = classDecl, namespaceNameCtorArg = namespaceName, serverNameCtorArg = serverName, reserved = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiClass) return false
        if (this.ft != other.ft) return false
        if (this.classDecl != other.classDecl) return false
        if (this.namespaceName != other.namespaceName) return false
        if (this.serverName != other.serverName) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ft.hashCode()
        result = 31 * result + this.classDecl.hashCode()
        result = 31 * result + this.namespaceName.hashCode()
        result = 31 * result + this.serverName.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiClass> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiClass> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): MiClass =
                    MiClass(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<MiClassFt>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<MiClassDecl>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<UShort>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<UShort>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64, (4).toInt())
                        ).readNative(addr + 32L).toIntArray(),
                    )
                override fun writeNative(addr: Long, value: MiClass) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<MiClassFt>(64)
                    ).writeNative(addr, value.ft)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<MiClassDecl>(64)
                    ).writeNative(addr + 8L, value.classDecl)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<UShort>(64)
                    ).writeNative(addr + 16L, value.namespaceName)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<UShort>(64)
                    ).writeNative(addr + 24L, value.serverName)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64, (4).toInt())
                    ).writeNative(addr + 32L, value.reserved.toList())
                }
            }

        public operator fun invoke(
            ft: ConstPtr<MiClassFt> = ConstPtr(0L),
            classDecl: ConstPtr<MiClassDecl> = ConstPtr(0L),
            namespaceName: ConstPtr<UShort> = ConstPtr(0L),
            serverName: ConstPtr<UShort> = ConstPtr(0L),
            reserved: IntArray = IntArray(4),
        ): MiClass =
            MiClass(
                ftCtorArg = ft,
                classDeclCtorArg = classDecl,
                namespaceNameCtorArg = namespaceName,
                serverNameCtorArg = serverName,
                reserved = reserved,
            )
    }
}

public class MiClassDecl internal constructor(
    public var flags: UInt,
    public var code: UInt,
    nameCtorArg: ConstPtr<UShort>,
    qualifiersCtorArg: ConstPtr<ConstPtr<MiQualifier>>,
    public var numQualifiers: UInt,
    propertiesCtorArg: ConstPtr<ConstPtr<MiPropertyDecl>>,
    public var numProperties: UInt,
    public var size: UInt,
    superClassCtorArg: ConstPtr<UShort>,
    superClassDeclCtorArg: ConstPtr<MiClassDecl>,
    methodsCtorArg: ConstPtr<ConstPtr<MiMethodDecl>>,
    public var numMethods: UInt,
    schemaCtorArg: ConstPtr<MiSchemaDecl>,
    providerFTCtorArg: ConstPtr<MiProviderFt>,
    owningClassCtorArg: MutPtr<MiClass>,
) {
    public var name: ConstPtr<UShort> = nameCtorArg
        internal set

    public var qualifiers: ConstPtr<ConstPtr<MiQualifier>> = qualifiersCtorArg
        internal set

    public var properties: ConstPtr<ConstPtr<MiPropertyDecl>> = propertiesCtorArg
        internal set

    public var superClass: ConstPtr<UShort> = superClassCtorArg
        internal set

    public var superClassDecl: ConstPtr<MiClassDecl> = superClassDeclCtorArg
        internal set

    public var methods: ConstPtr<ConstPtr<MiMethodDecl>> = methodsCtorArg
        internal set

    public var schema: ConstPtr<MiSchemaDecl> = schemaCtorArg
        internal set

    public var providerFT: ConstPtr<MiProviderFt> = providerFTCtorArg
        internal set

    public var owningClass: MutPtr<MiClass> = owningClassCtorArg
        internal set

    public constructor() : this(
        flags = 0u,
        code = 0u,
        nameCtorArg = ConstPtr(0L),
        qualifiersCtorArg = ConstPtr(0L),
        numQualifiers = 0u,
        propertiesCtorArg = ConstPtr(0L),
        numProperties = 0u,
        size = 0u,
        superClassCtorArg = ConstPtr(0L),
        superClassDeclCtorArg = ConstPtr(0L),
        methodsCtorArg = ConstPtr(0L),
        numMethods = 0u,
        schemaCtorArg = ConstPtr(0L),
        providerFTCtorArg = ConstPtr(0L),
        owningClassCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.flags

    public operator fun component2(): UInt = this.code

    public operator fun component3(): ConstPtr<UShort> = this.name

    public operator fun component4(): ConstPtr<ConstPtr<MiQualifier>> = this.qualifiers

    public operator fun component5(): UInt = this.numQualifiers

    public operator fun component6(): ConstPtr<ConstPtr<MiPropertyDecl>> = this.properties

    public operator fun component7(): UInt = this.numProperties

    public operator fun component8(): UInt = this.size

    public operator fun component9(): ConstPtr<UShort> = this.superClass

    public operator fun component10(): ConstPtr<MiClassDecl> = this.superClassDecl

    public operator fun component11(): ConstPtr<ConstPtr<MiMethodDecl>> = this.methods

    public operator fun component12(): UInt = this.numMethods

    public operator fun component13(): ConstPtr<MiSchemaDecl> = this.schema

    public operator fun component14(): ConstPtr<MiProviderFt> = this.providerFT

    public operator fun component15(): MutPtr<MiClass> = this.owningClass

    public fun copy(flags: UInt = this.flags, code: UInt = this.code, name: ConstPtr<UShort> = this.name, qualifiers: ConstPtr<ConstPtr<MiQualifier>> = this.qualifiers, numQualifiers: UInt = this.numQualifiers, properties: ConstPtr<ConstPtr<MiPropertyDecl>> = this.properties, numProperties: UInt = this.numProperties, size: UInt = this.size, superClass: ConstPtr<UShort> = this.superClass, superClassDecl: ConstPtr<MiClassDecl> = this.superClassDecl, methods: ConstPtr<ConstPtr<MiMethodDecl>> = this.methods, numMethods: UInt = this.numMethods, schema: ConstPtr<MiSchemaDecl> = this.schema, providerFT: ConstPtr<MiProviderFt> = this.providerFT, owningClass: MutPtr<MiClass> = this.owningClass): MiClassDecl = MiClassDecl(flags = flags, code = code, nameCtorArg = name, qualifiersCtorArg = qualifiers, numQualifiers = numQualifiers, propertiesCtorArg = properties, numProperties = numProperties, size = size, superClassCtorArg = superClass, superClassDeclCtorArg = superClassDecl, methodsCtorArg = methods, numMethods = numMethods, schemaCtorArg = schema, providerFTCtorArg = providerFT, owningClassCtorArg = owningClass)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiClassDecl) return false
        if (this.flags != other.flags) return false
        if (this.code != other.code) return false
        if (this.name != other.name) return false
        if (this.qualifiers != other.qualifiers) return false
        if (this.numQualifiers != other.numQualifiers) return false
        if (this.properties != other.properties) return false
        if (this.numProperties != other.numProperties) return false
        if (this.size != other.size) return false
        if (this.superClass != other.superClass) return false
        if (this.superClassDecl != other.superClassDecl) return false
        if (this.methods != other.methods) return false
        if (this.numMethods != other.numMethods) return false
        if (this.schema != other.schema) return false
        if (this.providerFT != other.providerFT) return false
        if (this.owningClass != other.owningClass) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.code.hashCode()
        result = 31 * result + this.name.hashCode()
        result = 31 * result + this.qualifiers.hashCode()
        result = 31 * result + this.numQualifiers.hashCode()
        result = 31 * result + this.properties.hashCode()
        result = 31 * result + this.numProperties.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.superClass.hashCode()
        result = 31 * result + this.superClassDecl.hashCode()
        result = 31 * result + this.methods.hashCode()
        result = 31 * result + this.numMethods.hashCode()
        result = 31 * result + this.schema.hashCode()
        result = 31 * result + this.providerFT.hashCode()
        result = 31 * result + this.owningClass.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiClassDecl> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiClassDecl> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 104L
                override fun readNative(addr: Long): MiClassDecl =
                    MiClassDecl(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<UShort>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<ConstPtr<MiQualifier>>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<ConstPtr<MiPropertyDecl>>(64)
                        ).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<UShort>(64)
                        ).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<MiClassDecl>(64)
                        ).readNative(addr + 56L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<ConstPtr<MiMethodDecl>>(64)
                        ).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<MiSchemaDecl>(64)
                        ).readNative(addr + 80L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<MiProviderFt>(64)
                        ).readNative(addr + 88L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MiClass>(64)
                        ).readNative(addr + 96L),
                    )
                override fun writeNative(addr: Long, value: MiClassDecl) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.code)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<UShort>(64)
                    ).writeNative(addr + 8L, value.name)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<ConstPtr<MiQualifier>>(64)
                    ).writeNative(addr + 16L, value.qualifiers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.numQualifiers)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<ConstPtr<MiPropertyDecl>>(64)
                    ).writeNative(addr + 32L, value.properties)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.numProperties)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.size)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<UShort>(64)
                    ).writeNative(addr + 48L, value.superClass)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<MiClassDecl>(64)
                    ).writeNative(addr + 56L, value.superClassDecl)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<ConstPtr<MiMethodDecl>>(64)
                    ).writeNative(addr + 64L, value.methods)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.numMethods)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<MiSchemaDecl>(64)
                    ).writeNative(addr + 80L, value.schema)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<MiProviderFt>(64)
                    ).writeNative(addr + 88L, value.providerFT)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MiClass>(64)
                    ).writeNative(addr + 96L, value.owningClass)
                }
            }

        public operator fun invoke(
            flags: UInt = 0u,
            code: UInt = 0u,
            name: ConstPtr<UShort> = ConstPtr(0L),
            qualifiers: ConstPtr<ConstPtr<MiQualifier>> = ConstPtr(0L),
            numQualifiers: UInt = 0u,
            properties: ConstPtr<ConstPtr<MiPropertyDecl>> = ConstPtr(0L),
            numProperties: UInt = 0u,
            size: UInt = 0u,
            superClass: ConstPtr<UShort> = ConstPtr(0L),
            superClassDecl: ConstPtr<MiClassDecl> = ConstPtr(0L),
            methods: ConstPtr<ConstPtr<MiMethodDecl>> = ConstPtr(0L),
            numMethods: UInt = 0u,
            schema: ConstPtr<MiSchemaDecl> = ConstPtr(0L),
            providerFT: ConstPtr<MiProviderFt> = ConstPtr(0L),
            owningClass: MutPtr<MiClass> = MutPtr(0L),
        ): MiClassDecl =
            MiClassDecl(
                flags = flags,
                code = code,
                nameCtorArg = name,
                qualifiersCtorArg = qualifiers,
                numQualifiers = numQualifiers,
                propertiesCtorArg = properties,
                numProperties = numProperties,
                size = size,
                superClassCtorArg = superClass,
                superClassDeclCtorArg = superClassDecl,
                methodsCtorArg = methods,
                numMethods = numMethods,
                schemaCtorArg = schema,
                providerFTCtorArg = providerFT,
                owningClassCtorArg = owningClass,
            )
    }
}

public data class MiClassFt(
    public var getClassNameA: Int = 0,
    public var getNameSpace: Int = 0,
    public var getServerName: Int = 0,
    public var getElementCount: Int = 0,
    public var getElement: Int = 0,
    public var getElementAt: Int = 0,
    public var getClassQualifierSet: Int = 0,
    public var getMethodCount: Int = 0,
    public var getMethodAt: Int = 0,
    public var getMethod: Int = 0,
    public var getParentClassName: Int = 0,
    public var getParentClass: Int = 0,
    public var delete: Int = 0,
    public var clone: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiClassFt> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiClassFt> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 112L
                override fun readNative(addr: Long): MiClassFt =
                    MiClassFt(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 104L),
                    )
                override fun writeNative(addr: Long, value: MiClassFt) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr, value.getClassNameA)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.getNameSpace)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 16L, value.getServerName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 24L, value.getElementCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 32L, value.getElement)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 40L, value.getElementAt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 48L, value.getClassQualifierSet)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 56L, value.getMethodCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 64L, value.getMethodAt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 72L, value.getMethod)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 80L, value.getParentClassName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 88L, value.getParentClass)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 96L, value.delete)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 104L, value.clone)
                }
            }
    }
}

public class MiClientFtV1 internal constructor(
    applicationFTCtorArg: ConstPtr<MiApplicationFt>,
    sessionFTCtorArg: ConstPtr<MiSessionFt>,
    operationFTCtorArg: ConstPtr<MiOperationFt>,
    hostedProviderFTCtorArg: ConstPtr<MiHostedProviderFt>,
    serializerFTCtorArg: ConstPtr<MiSerializerFt>,
    deserializerFTCtorArg: ConstPtr<MiDeserializerFt>,
    subscribeDeliveryOptionsFTCtorArg: ConstPtr<MiSubscriptionDeliveryOptionsFt>,
    destinationOptionsFTCtorArg: ConstPtr<MiDestinationOptionsFt>,
    operationOptionsFTCtorArg: ConstPtr<MiOperationOptionsFt>,
    utilitiesFTCtorArg: ConstPtr<MiUtilitiesFt>,
) {
    public var applicationFT: ConstPtr<MiApplicationFt> = applicationFTCtorArg
        internal set

    public var sessionFT: ConstPtr<MiSessionFt> = sessionFTCtorArg
        internal set

    public var operationFT: ConstPtr<MiOperationFt> = operationFTCtorArg
        internal set

    public var hostedProviderFT: ConstPtr<MiHostedProviderFt> = hostedProviderFTCtorArg
        internal set

    public var serializerFT: ConstPtr<MiSerializerFt> = serializerFTCtorArg
        internal set

    public var deserializerFT: ConstPtr<MiDeserializerFt> = deserializerFTCtorArg
        internal set

    public var subscribeDeliveryOptionsFT: ConstPtr<MiSubscriptionDeliveryOptionsFt> = subscribeDeliveryOptionsFTCtorArg
        internal set

    public var destinationOptionsFT: ConstPtr<MiDestinationOptionsFt> = destinationOptionsFTCtorArg
        internal set

    public var operationOptionsFT: ConstPtr<MiOperationOptionsFt> = operationOptionsFTCtorArg
        internal set

    public var utilitiesFT: ConstPtr<MiUtilitiesFt> = utilitiesFTCtorArg
        internal set

    public constructor() : this(
        applicationFTCtorArg = ConstPtr(0L),
        sessionFTCtorArg = ConstPtr(0L),
        operationFTCtorArg = ConstPtr(0L),
        hostedProviderFTCtorArg = ConstPtr(0L),
        serializerFTCtorArg = ConstPtr(0L),
        deserializerFTCtorArg = ConstPtr(0L),
        subscribeDeliveryOptionsFTCtorArg = ConstPtr(0L),
        destinationOptionsFTCtorArg = ConstPtr(0L),
        operationOptionsFTCtorArg = ConstPtr(0L),
        utilitiesFTCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): ConstPtr<MiApplicationFt> = this.applicationFT

    public operator fun component2(): ConstPtr<MiSessionFt> = this.sessionFT

    public operator fun component3(): ConstPtr<MiOperationFt> = this.operationFT

    public operator fun component4(): ConstPtr<MiHostedProviderFt> = this.hostedProviderFT

    public operator fun component5(): ConstPtr<MiSerializerFt> = this.serializerFT

    public operator fun component6(): ConstPtr<MiDeserializerFt> = this.deserializerFT

    public operator fun component7(): ConstPtr<MiSubscriptionDeliveryOptionsFt> = this.subscribeDeliveryOptionsFT

    public operator fun component8(): ConstPtr<MiDestinationOptionsFt> = this.destinationOptionsFT

    public operator fun component9(): ConstPtr<MiOperationOptionsFt> = this.operationOptionsFT

    public operator fun component10(): ConstPtr<MiUtilitiesFt> = this.utilitiesFT

    public fun copy(applicationFT: ConstPtr<MiApplicationFt> = this.applicationFT, sessionFT: ConstPtr<MiSessionFt> = this.sessionFT, operationFT: ConstPtr<MiOperationFt> = this.operationFT, hostedProviderFT: ConstPtr<MiHostedProviderFt> = this.hostedProviderFT, serializerFT: ConstPtr<MiSerializerFt> = this.serializerFT, deserializerFT: ConstPtr<MiDeserializerFt> = this.deserializerFT, subscribeDeliveryOptionsFT: ConstPtr<MiSubscriptionDeliveryOptionsFt> = this.subscribeDeliveryOptionsFT, destinationOptionsFT: ConstPtr<MiDestinationOptionsFt> = this.destinationOptionsFT, operationOptionsFT: ConstPtr<MiOperationOptionsFt> = this.operationOptionsFT, utilitiesFT: ConstPtr<MiUtilitiesFt> = this.utilitiesFT): MiClientFtV1 = MiClientFtV1(applicationFTCtorArg = applicationFT, sessionFTCtorArg = sessionFT, operationFTCtorArg = operationFT, hostedProviderFTCtorArg = hostedProviderFT, serializerFTCtorArg = serializerFT, deserializerFTCtorArg = deserializerFT, subscribeDeliveryOptionsFTCtorArg = subscribeDeliveryOptionsFT, destinationOptionsFTCtorArg = destinationOptionsFT, operationOptionsFTCtorArg = operationOptionsFT, utilitiesFTCtorArg = utilitiesFT)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiClientFtV1) return false
        if (this.applicationFT != other.applicationFT) return false
        if (this.sessionFT != other.sessionFT) return false
        if (this.operationFT != other.operationFT) return false
        if (this.hostedProviderFT != other.hostedProviderFT) return false
        if (this.serializerFT != other.serializerFT) return false
        if (this.deserializerFT != other.deserializerFT) return false
        if (this.subscribeDeliveryOptionsFT != other.subscribeDeliveryOptionsFT) return false
        if (this.destinationOptionsFT != other.destinationOptionsFT) return false
        if (this.operationOptionsFT != other.operationOptionsFT) return false
        if (this.utilitiesFT != other.utilitiesFT) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.applicationFT.hashCode()
        result = 31 * result + this.sessionFT.hashCode()
        result = 31 * result + this.operationFT.hashCode()
        result = 31 * result + this.hostedProviderFT.hashCode()
        result = 31 * result + this.serializerFT.hashCode()
        result = 31 * result + this.deserializerFT.hashCode()
        result = 31 * result + this.subscribeDeliveryOptionsFT.hashCode()
        result = 31 * result + this.destinationOptionsFT.hashCode()
        result = 31 * result + this.operationOptionsFT.hashCode()
        result = 31 * result + this.utilitiesFT.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiClientFtV1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiClientFtV1> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 80L
                override fun readNative(addr: Long): MiClientFtV1 =
                    MiClientFtV1(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<MiApplicationFt>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<MiSessionFt>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<MiOperationFt>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<MiHostedProviderFt>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<MiSerializerFt>(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<MiDeserializerFt>(64)
                        ).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<MiSubscriptionDeliveryOptionsFt>(64)
                        ).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<MiDestinationOptionsFt>(64)
                        ).readNative(addr + 56L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<MiOperationOptionsFt>(64)
                        ).readNative(addr + 64L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<MiUtilitiesFt>(64)
                        ).readNative(addr + 72L),
                    )
                override fun writeNative(addr: Long, value: MiClientFtV1) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<MiApplicationFt>(64)
                    ).writeNative(addr, value.applicationFT)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<MiSessionFt>(64)
                    ).writeNative(addr + 8L, value.sessionFT)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<MiOperationFt>(64)
                    ).writeNative(addr + 16L, value.operationFT)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<MiHostedProviderFt>(64)
                    ).writeNative(addr + 24L, value.hostedProviderFT)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<MiSerializerFt>(64)
                    ).writeNative(addr + 32L, value.serializerFT)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<MiDeserializerFt>(64)
                    ).writeNative(addr + 40L, value.deserializerFT)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<MiSubscriptionDeliveryOptionsFt>(64)
                    ).writeNative(addr + 48L, value.subscribeDeliveryOptionsFT)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<MiDestinationOptionsFt>(64)
                    ).writeNative(addr + 56L, value.destinationOptionsFT)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<MiOperationOptionsFt>(64)
                    ).writeNative(addr + 64L, value.operationOptionsFT)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<MiUtilitiesFt>(64)
                    ).writeNative(addr + 72L, value.utilitiesFT)
                }
            }

        public operator fun invoke(
            applicationFT: ConstPtr<MiApplicationFt> = ConstPtr(0L),
            sessionFT: ConstPtr<MiSessionFt> = ConstPtr(0L),
            operationFT: ConstPtr<MiOperationFt> = ConstPtr(0L),
            hostedProviderFT: ConstPtr<MiHostedProviderFt> = ConstPtr(0L),
            serializerFT: ConstPtr<MiSerializerFt> = ConstPtr(0L),
            deserializerFT: ConstPtr<MiDeserializerFt> = ConstPtr(0L),
            subscribeDeliveryOptionsFT: ConstPtr<MiSubscriptionDeliveryOptionsFt> = ConstPtr(0L),
            destinationOptionsFT: ConstPtr<MiDestinationOptionsFt> = ConstPtr(0L),
            operationOptionsFT: ConstPtr<MiOperationOptionsFt> = ConstPtr(0L),
            utilitiesFT: ConstPtr<MiUtilitiesFt> = ConstPtr(0L),
        ): MiClientFtV1 =
            MiClientFtV1(
                applicationFTCtorArg = applicationFT,
                sessionFTCtorArg = sessionFT,
                operationFTCtorArg = operationFT,
                hostedProviderFTCtorArg = hostedProviderFT,
                serializerFTCtorArg = serializerFT,
                deserializerFTCtorArg = deserializerFT,
                subscribeDeliveryOptionsFTCtorArg = subscribeDeliveryOptionsFT,
                destinationOptionsFTCtorArg = destinationOptionsFT,
                operationOptionsFTCtorArg = operationOptionsFT,
                utilitiesFTCtorArg = utilitiesFT,
            )
    }
}

public class MiConstBooleanA internal constructor(
    dataCtorArg: ConstPtr<UByte>,
    public var size: UInt,
) {
    public var data: ConstPtr<UByte> = dataCtorArg
        internal set

    public constructor() : this(
        dataCtorArg = ConstPtr(0L),
        size = 0u,
    )

    public operator fun component1(): ConstPtr<UByte> = this.data

    public operator fun component2(): UInt = this.size

    public fun copy(data: ConstPtr<UByte> = this.data, size: UInt = this.size): MiConstBooleanA = MiConstBooleanA(dataCtorArg = data, size = size)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiConstBooleanA) return false
        if (this.data != other.data) return false
        if (this.size != other.size) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.data.hashCode()
        result = 31 * result + this.size.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstBooleanA> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstBooleanA> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MiConstBooleanA =
                    MiConstBooleanA(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<UByte>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MiConstBooleanA) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<UByte>(64)
                    ).writeNative(addr, value.data)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.size)
                }
            }

        public operator fun invoke(
            data: ConstPtr<UByte> = ConstPtr(0L),
            size: UInt = 0u,
        ): MiConstBooleanA =
            MiConstBooleanA(
                dataCtorArg = data,
                size = size,
            )
    }
}

public data class MiConstBooleanAfield(
    public var value: MiConstBooleanA = MiConstBooleanA(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstBooleanAfield> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstBooleanAfield> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MiConstBooleanAfield =
                    MiConstBooleanAfield(
                        (MiConstBooleanA.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 17L),
                    )
                override fun writeNative(addr: Long, value: MiConstBooleanAfield) {
                    (MiConstBooleanA.typeLayout()).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 17L, value.flags)
                }
            }
    }
}

public data class MiConstBooleanField(
    public var value: UByte = 0u,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstBooleanField> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstBooleanField> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 3L
                override fun readNative(addr: Long): MiConstBooleanField =
                    MiConstBooleanField(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: MiConstBooleanField) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.flags)
                }
            }
    }
}

public class MiConstChar16A internal constructor(
    dataCtorArg: ConstPtr<UShort>,
    public var size: UInt,
) {
    public var data: ConstPtr<UShort> = dataCtorArg
        internal set

    public constructor() : this(
        dataCtorArg = ConstPtr(0L),
        size = 0u,
    )

    public operator fun component1(): ConstPtr<UShort> = this.data

    public operator fun component2(): UInt = this.size

    public fun copy(data: ConstPtr<UShort> = this.data, size: UInt = this.size): MiConstChar16A = MiConstChar16A(dataCtorArg = data, size = size)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiConstChar16A) return false
        if (this.data != other.data) return false
        if (this.size != other.size) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.data.hashCode()
        result = 31 * result + this.size.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstChar16A> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstChar16A> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MiConstChar16A =
                    MiConstChar16A(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<UShort>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MiConstChar16A) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<UShort>(64)
                    ).writeNative(addr, value.data)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.size)
                }
            }

        public operator fun invoke(
            data: ConstPtr<UShort> = ConstPtr(0L),
            size: UInt = 0u,
        ): MiConstChar16A =
            MiConstChar16A(
                dataCtorArg = data,
                size = size,
            )
    }
}

public data class MiConstChar16Afield(
    public var value: MiConstChar16A = MiConstChar16A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstChar16Afield> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstChar16Afield> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MiConstChar16Afield =
                    MiConstChar16Afield(
                        (MiConstChar16A.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 17L),
                    )
                override fun writeNative(addr: Long, value: MiConstChar16Afield) {
                    (MiConstChar16A.typeLayout()).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 17L, value.flags)
                }
            }
    }
}

public data class MiConstChar16Field(
    public var value: UShort = 0u,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstChar16Field> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstChar16Field> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): MiConstChar16Field =
                    MiConstChar16Field(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: MiConstChar16Field) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.flags)
                }
            }
    }
}

public class MiConstDatetimeA internal constructor(
    dataCtorArg: ConstPtr<MiDatetime>,
    public var size: UInt,
) {
    public var data: ConstPtr<MiDatetime> = dataCtorArg
        internal set

    public constructor() : this(
        dataCtorArg = ConstPtr(0L),
        size = 0u,
    )

    public operator fun component1(): ConstPtr<MiDatetime> = this.data

    public operator fun component2(): UInt = this.size

    public fun copy(data: ConstPtr<MiDatetime> = this.data, size: UInt = this.size): MiConstDatetimeA = MiConstDatetimeA(dataCtorArg = data, size = size)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiConstDatetimeA) return false
        if (this.data != other.data) return false
        if (this.size != other.size) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.data.hashCode()
        result = 31 * result + this.size.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstDatetimeA> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstDatetimeA> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MiConstDatetimeA =
                    MiConstDatetimeA(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<MiDatetime>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MiConstDatetimeA) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<MiDatetime>(64)
                    ).writeNative(addr, value.data)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.size)
                }
            }

        public operator fun invoke(
            data: ConstPtr<MiDatetime> = ConstPtr(0L),
            size: UInt = 0u,
        ): MiConstDatetimeA =
            MiConstDatetimeA(
                dataCtorArg = data,
                size = size,
            )
    }
}

public data class MiConstDatetimeAfield(
    public var value: MiConstDatetimeA = MiConstDatetimeA(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstDatetimeAfield> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstDatetimeAfield> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MiConstDatetimeAfield =
                    MiConstDatetimeAfield(
                        (MiConstDatetimeA.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 17L),
                    )
                override fun writeNative(addr: Long, value: MiConstDatetimeAfield) {
                    (MiConstDatetimeA.typeLayout()).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 17L, value.flags)
                }
            }
    }
}

public data class MiConstDatetimeField(
    public var value: MiDatetime = MiDatetime(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public class MiConstInstanceA internal constructor(
    dataCtorArg: ConstPtr<ConstPtr<MiInstance>>,
    public var size: UInt,
) {
    public var data: ConstPtr<ConstPtr<MiInstance>> = dataCtorArg
        internal set

    public constructor() : this(
        dataCtorArg = ConstPtr(0L),
        size = 0u,
    )

    public operator fun component1(): ConstPtr<ConstPtr<MiInstance>> = this.data

    public operator fun component2(): UInt = this.size

    public fun copy(data: ConstPtr<ConstPtr<MiInstance>> = this.data, size: UInt = this.size): MiConstInstanceA = MiConstInstanceA(dataCtorArg = data, size = size)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiConstInstanceA) return false
        if (this.data != other.data) return false
        if (this.size != other.size) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.data.hashCode()
        result = 31 * result + this.size.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstInstanceA> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstInstanceA> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MiConstInstanceA =
                    MiConstInstanceA(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<ConstPtr<MiInstance>>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MiConstInstanceA) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<ConstPtr<MiInstance>>(64)
                    ).writeNative(addr, value.data)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.size)
                }
            }

        public operator fun invoke(
            data: ConstPtr<ConstPtr<MiInstance>> = ConstPtr(0L),
            size: UInt = 0u,
        ): MiConstInstanceA =
            MiConstInstanceA(
                dataCtorArg = data,
                size = size,
            )
    }
}

public data class MiConstInstanceAfield(
    public var value: MiConstInstanceA = MiConstInstanceA(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstInstanceAfield> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstInstanceAfield> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MiConstInstanceAfield =
                    MiConstInstanceAfield(
                        (MiConstInstanceA.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 17L),
                    )
                override fun writeNative(addr: Long, value: MiConstInstanceAfield) {
                    (MiConstInstanceA.typeLayout()).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 17L, value.flags)
                }
            }
    }
}

public class MiConstInstanceField internal constructor(
    valueCtorArg: ConstPtr<MiInstance>,
    public var exists: UByte,
    public var flags: UByte,
) {
    public var value: ConstPtr<MiInstance> = valueCtorArg
        internal set

    public constructor() : this(
        valueCtorArg = ConstPtr(0L),
        exists = 0u,
        flags = 0u,
    )

    public operator fun component1(): ConstPtr<MiInstance> = this.value

    public operator fun component2(): UByte = this.exists

    public operator fun component3(): UByte = this.flags

    public fun copy(value: ConstPtr<MiInstance> = this.value, exists: UByte = this.exists, flags: UByte = this.flags): MiConstInstanceField = MiConstInstanceField(valueCtorArg = value, exists = exists, flags = flags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiConstInstanceField) return false
        if (this.value != other.value) return false
        if (this.exists != other.exists) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.value.hashCode()
        result = 31 * result + this.exists.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstInstanceField> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstInstanceField> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MiConstInstanceField =
                    MiConstInstanceField(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<MiInstance>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                    )
                override fun writeNative(addr: Long, value: MiConstInstanceField) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<MiInstance>(64)
                    ).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.flags)
                }
            }

        public operator fun invoke(
            value: ConstPtr<MiInstance> = ConstPtr(0L),
            exists: UByte = 0u,
            flags: UByte = 0u,
        ): MiConstInstanceField =
            MiConstInstanceField(
                valueCtorArg = value,
                exists = exists,
                flags = flags,
            )
    }
}

public class MiConstReal32A internal constructor(
    dataCtorArg: ConstPtr<Float>,
    public var size: UInt,
) {
    public var data: ConstPtr<Float> = dataCtorArg
        internal set

    public constructor() : this(
        dataCtorArg = ConstPtr(0L),
        size = 0u,
    )

    public operator fun component1(): ConstPtr<Float> = this.data

    public operator fun component2(): UInt = this.size

    public fun copy(data: ConstPtr<Float> = this.data, size: UInt = this.size): MiConstReal32A = MiConstReal32A(dataCtorArg = data, size = size)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiConstReal32A) return false
        if (this.data != other.data) return false
        if (this.size != other.size) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.data.hashCode()
        result = 31 * result + this.size.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstReal32A> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstReal32A> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MiConstReal32A =
                    MiConstReal32A(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<Float>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MiConstReal32A) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<Float>(64)
                    ).writeNative(addr, value.data)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.size)
                }
            }

        public operator fun invoke(
            data: ConstPtr<Float> = ConstPtr(0L),
            size: UInt = 0u,
        ): MiConstReal32A =
            MiConstReal32A(
                dataCtorArg = data,
                size = size,
            )
    }
}

public data class MiConstReal32Afield(
    public var value: MiConstReal32A = MiConstReal32A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstReal32Afield> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstReal32Afield> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MiConstReal32Afield =
                    MiConstReal32Afield(
                        (MiConstReal32A.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 17L),
                    )
                override fun writeNative(addr: Long, value: MiConstReal32Afield) {
                    (MiConstReal32A.typeLayout()).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 17L, value.flags)
                }
            }
    }
}

public data class MiConstReal32Field(
    public var value: Float = 0.0f,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstReal32Field> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstReal32Field> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): MiConstReal32Field =
                    MiConstReal32Field(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                    )
                override fun writeNative(addr: Long, value: MiConstReal32Field) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.flags)
                }
            }
    }
}

public class MiConstReal64A internal constructor(
    dataCtorArg: ConstPtr<Double>,
    public var size: UInt,
) {
    public var data: ConstPtr<Double> = dataCtorArg
        internal set

    public constructor() : this(
        dataCtorArg = ConstPtr(0L),
        size = 0u,
    )

    public operator fun component1(): ConstPtr<Double> = this.data

    public operator fun component2(): UInt = this.size

    public fun copy(data: ConstPtr<Double> = this.data, size: UInt = this.size): MiConstReal64A = MiConstReal64A(dataCtorArg = data, size = size)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiConstReal64A) return false
        if (this.data != other.data) return false
        if (this.size != other.size) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.data.hashCode()
        result = 31 * result + this.size.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstReal64A> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstReal64A> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MiConstReal64A =
                    MiConstReal64A(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<Double>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MiConstReal64A) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<Double>(64)
                    ).writeNative(addr, value.data)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.size)
                }
            }

        public operator fun invoke(
            data: ConstPtr<Double> = ConstPtr(0L),
            size: UInt = 0u,
        ): MiConstReal64A =
            MiConstReal64A(
                dataCtorArg = data,
                size = size,
            )
    }
}

public data class MiConstReal64Afield(
    public var value: MiConstReal64A = MiConstReal64A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstReal64Afield> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstReal64Afield> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MiConstReal64Afield =
                    MiConstReal64Afield(
                        (MiConstReal64A.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 17L),
                    )
                override fun writeNative(addr: Long, value: MiConstReal64Afield) {
                    (MiConstReal64A.typeLayout()).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 17L, value.flags)
                }
            }
    }
}

public data class MiConstReal64Field(
    public var value: Double = 0.0,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstReal64Field> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstReal64Field> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MiConstReal64Field =
                    MiConstReal64Field(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                    )
                override fun writeNative(addr: Long, value: MiConstReal64Field) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.flags)
                }
            }
    }
}

public class MiConstReferenceA internal constructor(
    dataCtorArg: ConstPtr<ConstPtr<MiInstance>>,
    public var size: UInt,
) {
    public var data: ConstPtr<ConstPtr<MiInstance>> = dataCtorArg
        internal set

    public constructor() : this(
        dataCtorArg = ConstPtr(0L),
        size = 0u,
    )

    public operator fun component1(): ConstPtr<ConstPtr<MiInstance>> = this.data

    public operator fun component2(): UInt = this.size

    public fun copy(data: ConstPtr<ConstPtr<MiInstance>> = this.data, size: UInt = this.size): MiConstReferenceA = MiConstReferenceA(dataCtorArg = data, size = size)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiConstReferenceA) return false
        if (this.data != other.data) return false
        if (this.size != other.size) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.data.hashCode()
        result = 31 * result + this.size.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstReferenceA> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstReferenceA> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MiConstReferenceA =
                    MiConstReferenceA(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<ConstPtr<MiInstance>>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MiConstReferenceA) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<ConstPtr<MiInstance>>(64)
                    ).writeNative(addr, value.data)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.size)
                }
            }

        public operator fun invoke(
            data: ConstPtr<ConstPtr<MiInstance>> = ConstPtr(0L),
            size: UInt = 0u,
        ): MiConstReferenceA =
            MiConstReferenceA(
                dataCtorArg = data,
                size = size,
            )
    }
}

public data class MiConstReferenceAfield(
    public var value: MiConstReferenceA = MiConstReferenceA(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstReferenceAfield> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstReferenceAfield> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MiConstReferenceAfield =
                    MiConstReferenceAfield(
                        (MiConstReferenceA.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 17L),
                    )
                override fun writeNative(addr: Long, value: MiConstReferenceAfield) {
                    (MiConstReferenceA.typeLayout()).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 17L, value.flags)
                }
            }
    }
}

public class MiConstReferenceField internal constructor(
    valueCtorArg: ConstPtr<MiInstance>,
    public var exists: UByte,
    public var flags: UByte,
) {
    public var value: ConstPtr<MiInstance> = valueCtorArg
        internal set

    public constructor() : this(
        valueCtorArg = ConstPtr(0L),
        exists = 0u,
        flags = 0u,
    )

    public operator fun component1(): ConstPtr<MiInstance> = this.value

    public operator fun component2(): UByte = this.exists

    public operator fun component3(): UByte = this.flags

    public fun copy(value: ConstPtr<MiInstance> = this.value, exists: UByte = this.exists, flags: UByte = this.flags): MiConstReferenceField = MiConstReferenceField(valueCtorArg = value, exists = exists, flags = flags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiConstReferenceField) return false
        if (this.value != other.value) return false
        if (this.exists != other.exists) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.value.hashCode()
        result = 31 * result + this.exists.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstReferenceField> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstReferenceField> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MiConstReferenceField =
                    MiConstReferenceField(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<MiInstance>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                    )
                override fun writeNative(addr: Long, value: MiConstReferenceField) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<MiInstance>(64)
                    ).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.flags)
                }
            }

        public operator fun invoke(
            value: ConstPtr<MiInstance> = ConstPtr(0L),
            exists: UByte = 0u,
            flags: UByte = 0u,
        ): MiConstReferenceField =
            MiConstReferenceField(
                valueCtorArg = value,
                exists = exists,
                flags = flags,
            )
    }
}

public class MiConstSint16A internal constructor(
    dataCtorArg: ConstPtr<Short>,
    public var size: UInt,
) {
    public var data: ConstPtr<Short> = dataCtorArg
        internal set

    public constructor() : this(
        dataCtorArg = ConstPtr(0L),
        size = 0u,
    )

    public operator fun component1(): ConstPtr<Short> = this.data

    public operator fun component2(): UInt = this.size

    public fun copy(data: ConstPtr<Short> = this.data, size: UInt = this.size): MiConstSint16A = MiConstSint16A(dataCtorArg = data, size = size)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiConstSint16A) return false
        if (this.data != other.data) return false
        if (this.size != other.size) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.data.hashCode()
        result = 31 * result + this.size.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstSint16A> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstSint16A> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MiConstSint16A =
                    MiConstSint16A(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<Short>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MiConstSint16A) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<Short>(64)
                    ).writeNative(addr, value.data)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.size)
                }
            }

        public operator fun invoke(
            data: ConstPtr<Short> = ConstPtr(0L),
            size: UInt = 0u,
        ): MiConstSint16A =
            MiConstSint16A(
                dataCtorArg = data,
                size = size,
            )
    }
}

public data class MiConstSint16Afield(
    public var value: MiConstSint16A = MiConstSint16A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstSint16Afield> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstSint16Afield> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MiConstSint16Afield =
                    MiConstSint16Afield(
                        (MiConstSint16A.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 17L),
                    )
                override fun writeNative(addr: Long, value: MiConstSint16Afield) {
                    (MiConstSint16A.typeLayout()).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 17L, value.flags)
                }
            }
    }
}

public data class MiConstSint16Field(
    public var value: Short = 0,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstSint16Field> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstSint16Field> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): MiConstSint16Field =
                    MiConstSint16Field(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: MiConstSint16Field) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.flags)
                }
            }
    }
}

public class MiConstSint32A internal constructor(
    dataCtorArg: ConstPtr<Int>,
    public var size: UInt,
) {
    public var data: ConstPtr<Int> = dataCtorArg
        internal set

    public constructor() : this(
        dataCtorArg = ConstPtr(0L),
        size = 0u,
    )

    public operator fun component1(): ConstPtr<Int> = this.data

    public operator fun component2(): UInt = this.size

    public fun copy(data: ConstPtr<Int> = this.data, size: UInt = this.size): MiConstSint32A = MiConstSint32A(dataCtorArg = data, size = size)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiConstSint32A) return false
        if (this.data != other.data) return false
        if (this.size != other.size) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.data.hashCode()
        result = 31 * result + this.size.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstSint32A> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstSint32A> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MiConstSint32A =
                    MiConstSint32A(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<Int>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MiConstSint32A) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<Int>(64)
                    ).writeNative(addr, value.data)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.size)
                }
            }

        public operator fun invoke(
            data: ConstPtr<Int> = ConstPtr(0L),
            size: UInt = 0u,
        ): MiConstSint32A =
            MiConstSint32A(
                dataCtorArg = data,
                size = size,
            )
    }
}

public data class MiConstSint32Afield(
    public var value: MiConstSint32A = MiConstSint32A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstSint32Afield> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstSint32Afield> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MiConstSint32Afield =
                    MiConstSint32Afield(
                        (MiConstSint32A.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 17L),
                    )
                override fun writeNative(addr: Long, value: MiConstSint32Afield) {
                    (MiConstSint32A.typeLayout()).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 17L, value.flags)
                }
            }
    }
}

public data class MiConstSint32Field(
    public var value: Int = 0,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstSint32Field> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstSint32Field> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): MiConstSint32Field =
                    MiConstSint32Field(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                    )
                override fun writeNative(addr: Long, value: MiConstSint32Field) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.flags)
                }
            }
    }
}

public class MiConstSint64A internal constructor(
    dataCtorArg: ConstPtr<Long>,
    public var size: UInt,
) {
    public var data: ConstPtr<Long> = dataCtorArg
        internal set

    public constructor() : this(
        dataCtorArg = ConstPtr(0L),
        size = 0u,
    )

    public operator fun component1(): ConstPtr<Long> = this.data

    public operator fun component2(): UInt = this.size

    public fun copy(data: ConstPtr<Long> = this.data, size: UInt = this.size): MiConstSint64A = MiConstSint64A(dataCtorArg = data, size = size)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiConstSint64A) return false
        if (this.data != other.data) return false
        if (this.size != other.size) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.data.hashCode()
        result = 31 * result + this.size.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstSint64A> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstSint64A> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MiConstSint64A =
                    MiConstSint64A(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<Long>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MiConstSint64A) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<Long>(64)
                    ).writeNative(addr, value.data)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.size)
                }
            }

        public operator fun invoke(
            data: ConstPtr<Long> = ConstPtr(0L),
            size: UInt = 0u,
        ): MiConstSint64A =
            MiConstSint64A(
                dataCtorArg = data,
                size = size,
            )
    }
}

public data class MiConstSint64Afield(
    public var value: MiConstSint64A = MiConstSint64A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstSint64Afield> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstSint64Afield> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MiConstSint64Afield =
                    MiConstSint64Afield(
                        (MiConstSint64A.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 17L),
                    )
                override fun writeNative(addr: Long, value: MiConstSint64Afield) {
                    (MiConstSint64A.typeLayout()).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 17L, value.flags)
                }
            }
    }
}

public data class MiConstSint64Field(
    public var value: Long = 0L,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstSint64Field> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstSint64Field> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MiConstSint64Field =
                    MiConstSint64Field(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                    )
                override fun writeNative(addr: Long, value: MiConstSint64Field) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.flags)
                }
            }
    }
}

public class MiConstSint8A internal constructor(
    dataCtorArg: ConstPtr<Byte>,
    public var size: UInt,
) {
    public var data: ConstPtr<Byte> = dataCtorArg
        internal set

    public constructor() : this(
        dataCtorArg = ConstPtr(0L),
        size = 0u,
    )

    public operator fun component1(): ConstPtr<Byte> = this.data

    public operator fun component2(): UInt = this.size

    public fun copy(data: ConstPtr<Byte> = this.data, size: UInt = this.size): MiConstSint8A = MiConstSint8A(dataCtorArg = data, size = size)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiConstSint8A) return false
        if (this.data != other.data) return false
        if (this.size != other.size) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.data.hashCode()
        result = 31 * result + this.size.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstSint8A> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstSint8A> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MiConstSint8A =
                    MiConstSint8A(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<Byte>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MiConstSint8A) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<Byte>(64)
                    ).writeNative(addr, value.data)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.size)
                }
            }

        public operator fun invoke(
            data: ConstPtr<Byte> = ConstPtr(0L),
            size: UInt = 0u,
        ): MiConstSint8A =
            MiConstSint8A(
                dataCtorArg = data,
                size = size,
            )
    }
}

public data class MiConstSint8Afield(
    public var value: MiConstSint8A = MiConstSint8A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstSint8Afield> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstSint8Afield> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MiConstSint8Afield =
                    MiConstSint8Afield(
                        (MiConstSint8A.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 17L),
                    )
                override fun writeNative(addr: Long, value: MiConstSint8Afield) {
                    (MiConstSint8A.typeLayout()).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 17L, value.flags)
                }
            }
    }
}

public data class MiConstSint8Field(
    public var value: Byte = 0,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstSint8Field> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstSint8Field> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 3L
                override fun readNative(addr: Long): MiConstSint8Field =
                    MiConstSint8Field(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: MiConstSint8Field) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.flags)
                }
            }
    }
}

public class MiConstStringA internal constructor(
    dataCtorArg: ConstPtr<ConstPtr<UShort>>,
    public var size: UInt,
) {
    public var data: ConstPtr<ConstPtr<UShort>> = dataCtorArg
        internal set

    public constructor() : this(
        dataCtorArg = ConstPtr(0L),
        size = 0u,
    )

    public operator fun component1(): ConstPtr<ConstPtr<UShort>> = this.data

    public operator fun component2(): UInt = this.size

    public fun copy(data: ConstPtr<ConstPtr<UShort>> = this.data, size: UInt = this.size): MiConstStringA = MiConstStringA(dataCtorArg = data, size = size)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiConstStringA) return false
        if (this.data != other.data) return false
        if (this.size != other.size) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.data.hashCode()
        result = 31 * result + this.size.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstStringA> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstStringA> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MiConstStringA =
                    MiConstStringA(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<ConstPtr<UShort>>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MiConstStringA) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<ConstPtr<UShort>>(64)
                    ).writeNative(addr, value.data)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.size)
                }
            }

        public operator fun invoke(
            data: ConstPtr<ConstPtr<UShort>> = ConstPtr(0L),
            size: UInt = 0u,
        ): MiConstStringA =
            MiConstStringA(
                dataCtorArg = data,
                size = size,
            )
    }
}

public data class MiConstStringAfield(
    public var value: MiConstStringA = MiConstStringA(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstStringAfield> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstStringAfield> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MiConstStringAfield =
                    MiConstStringAfield(
                        (MiConstStringA.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 17L),
                    )
                override fun writeNative(addr: Long, value: MiConstStringAfield) {
                    (MiConstStringA.typeLayout()).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 17L, value.flags)
                }
            }
    }
}

public class MiConstStringField internal constructor(
    valueCtorArg: ConstPtr<UShort>,
    public var exists: UByte,
    public var flags: UByte,
) {
    public var value: ConstPtr<UShort> = valueCtorArg
        internal set

    public constructor() : this(
        valueCtorArg = ConstPtr(0L),
        exists = 0u,
        flags = 0u,
    )

    public operator fun component1(): ConstPtr<UShort> = this.value

    public operator fun component2(): UByte = this.exists

    public operator fun component3(): UByte = this.flags

    public fun copy(value: ConstPtr<UShort> = this.value, exists: UByte = this.exists, flags: UByte = this.flags): MiConstStringField = MiConstStringField(valueCtorArg = value, exists = exists, flags = flags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiConstStringField) return false
        if (this.value != other.value) return false
        if (this.exists != other.exists) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.value.hashCode()
        result = 31 * result + this.exists.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstStringField> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstStringField> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MiConstStringField =
                    MiConstStringField(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<UShort>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                    )
                override fun writeNative(addr: Long, value: MiConstStringField) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<UShort>(64)
                    ).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.flags)
                }
            }

        public operator fun invoke(
            value: ConstPtr<UShort> = ConstPtr(0L),
            exists: UByte = 0u,
            flags: UByte = 0u,
        ): MiConstStringField =
            MiConstStringField(
                valueCtorArg = value,
                exists = exists,
                flags = flags,
            )
    }
}

public class MiConstUint16A internal constructor(
    dataCtorArg: ConstPtr<UShort>,
    public var size: UInt,
) {
    public var data: ConstPtr<UShort> = dataCtorArg
        internal set

    public constructor() : this(
        dataCtorArg = ConstPtr(0L),
        size = 0u,
    )

    public operator fun component1(): ConstPtr<UShort> = this.data

    public operator fun component2(): UInt = this.size

    public fun copy(data: ConstPtr<UShort> = this.data, size: UInt = this.size): MiConstUint16A = MiConstUint16A(dataCtorArg = data, size = size)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiConstUint16A) return false
        if (this.data != other.data) return false
        if (this.size != other.size) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.data.hashCode()
        result = 31 * result + this.size.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstUint16A> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstUint16A> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MiConstUint16A =
                    MiConstUint16A(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<UShort>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MiConstUint16A) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<UShort>(64)
                    ).writeNative(addr, value.data)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.size)
                }
            }

        public operator fun invoke(
            data: ConstPtr<UShort> = ConstPtr(0L),
            size: UInt = 0u,
        ): MiConstUint16A =
            MiConstUint16A(
                dataCtorArg = data,
                size = size,
            )
    }
}

public data class MiConstUint16Afield(
    public var value: MiConstUint16A = MiConstUint16A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstUint16Afield> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstUint16Afield> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MiConstUint16Afield =
                    MiConstUint16Afield(
                        (MiConstUint16A.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 17L),
                    )
                override fun writeNative(addr: Long, value: MiConstUint16Afield) {
                    (MiConstUint16A.typeLayout()).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 17L, value.flags)
                }
            }
    }
}

public data class MiConstUint16Field(
    public var value: UShort = 0u,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstUint16Field> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstUint16Field> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): MiConstUint16Field =
                    MiConstUint16Field(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: MiConstUint16Field) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.flags)
                }
            }
    }
}

public class MiConstUint32A internal constructor(
    dataCtorArg: ConstPtr<UInt>,
    public var size: UInt,
) {
    public var data: ConstPtr<UInt> = dataCtorArg
        internal set

    public constructor() : this(
        dataCtorArg = ConstPtr(0L),
        size = 0u,
    )

    public operator fun component1(): ConstPtr<UInt> = this.data

    public operator fun component2(): UInt = this.size

    public fun copy(data: ConstPtr<UInt> = this.data, size: UInt = this.size): MiConstUint32A = MiConstUint32A(dataCtorArg = data, size = size)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiConstUint32A) return false
        if (this.data != other.data) return false
        if (this.size != other.size) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.data.hashCode()
        result = 31 * result + this.size.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstUint32A> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstUint32A> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MiConstUint32A =
                    MiConstUint32A(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<UInt>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MiConstUint32A) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<UInt>(64)
                    ).writeNative(addr, value.data)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.size)
                }
            }

        public operator fun invoke(
            data: ConstPtr<UInt> = ConstPtr(0L),
            size: UInt = 0u,
        ): MiConstUint32A =
            MiConstUint32A(
                dataCtorArg = data,
                size = size,
            )
    }
}

public data class MiConstUint32Afield(
    public var value: MiConstUint32A = MiConstUint32A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstUint32Afield> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstUint32Afield> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MiConstUint32Afield =
                    MiConstUint32Afield(
                        (MiConstUint32A.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 17L),
                    )
                override fun writeNative(addr: Long, value: MiConstUint32Afield) {
                    (MiConstUint32A.typeLayout()).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 17L, value.flags)
                }
            }
    }
}

public data class MiConstUint32Field(
    public var value: UInt = 0u,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstUint32Field> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstUint32Field> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): MiConstUint32Field =
                    MiConstUint32Field(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                    )
                override fun writeNative(addr: Long, value: MiConstUint32Field) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.flags)
                }
            }
    }
}

public class MiConstUint64A internal constructor(
    dataCtorArg: ConstPtr<ULong>,
    public var size: UInt,
) {
    public var data: ConstPtr<ULong> = dataCtorArg
        internal set

    public constructor() : this(
        dataCtorArg = ConstPtr(0L),
        size = 0u,
    )

    public operator fun component1(): ConstPtr<ULong> = this.data

    public operator fun component2(): UInt = this.size

    public fun copy(data: ConstPtr<ULong> = this.data, size: UInt = this.size): MiConstUint64A = MiConstUint64A(dataCtorArg = data, size = size)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiConstUint64A) return false
        if (this.data != other.data) return false
        if (this.size != other.size) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.data.hashCode()
        result = 31 * result + this.size.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstUint64A> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstUint64A> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MiConstUint64A =
                    MiConstUint64A(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<ULong>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MiConstUint64A) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<ULong>(64)
                    ).writeNative(addr, value.data)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.size)
                }
            }

        public operator fun invoke(
            data: ConstPtr<ULong> = ConstPtr(0L),
            size: UInt = 0u,
        ): MiConstUint64A =
            MiConstUint64A(
                dataCtorArg = data,
                size = size,
            )
    }
}

public data class MiConstUint64Afield(
    public var value: MiConstUint64A = MiConstUint64A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstUint64Afield> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstUint64Afield> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MiConstUint64Afield =
                    MiConstUint64Afield(
                        (MiConstUint64A.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 17L),
                    )
                override fun writeNative(addr: Long, value: MiConstUint64Afield) {
                    (MiConstUint64A.typeLayout()).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 17L, value.flags)
                }
            }
    }
}

public data class MiConstUint64Field(
    public var value: ULong = 0uL,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstUint64Field> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstUint64Field> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MiConstUint64Field =
                    MiConstUint64Field(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                    )
                override fun writeNative(addr: Long, value: MiConstUint64Field) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.flags)
                }
            }
    }
}

public class MiConstUint8A internal constructor(
    dataCtorArg: ConstPtr<UByte>,
    public var size: UInt,
) {
    public var data: ConstPtr<UByte> = dataCtorArg
        internal set

    public constructor() : this(
        dataCtorArg = ConstPtr(0L),
        size = 0u,
    )

    public operator fun component1(): ConstPtr<UByte> = this.data

    public operator fun component2(): UInt = this.size

    public fun copy(data: ConstPtr<UByte> = this.data, size: UInt = this.size): MiConstUint8A = MiConstUint8A(dataCtorArg = data, size = size)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiConstUint8A) return false
        if (this.data != other.data) return false
        if (this.size != other.size) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.data.hashCode()
        result = 31 * result + this.size.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstUint8A> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstUint8A> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MiConstUint8A =
                    MiConstUint8A(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<UByte>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MiConstUint8A) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<UByte>(64)
                    ).writeNative(addr, value.data)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.size)
                }
            }

        public operator fun invoke(
            data: ConstPtr<UByte> = ConstPtr(0L),
            size: UInt = 0u,
        ): MiConstUint8A =
            MiConstUint8A(
                dataCtorArg = data,
                size = size,
            )
    }
}

public data class MiConstUint8Afield(
    public var value: MiConstUint8A = MiConstUint8A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstUint8Afield> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstUint8Afield> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MiConstUint8Afield =
                    MiConstUint8Afield(
                        (MiConstUint8A.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 17L),
                    )
                override fun writeNative(addr: Long, value: MiConstUint8Afield) {
                    (MiConstUint8A.typeLayout()).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 17L, value.flags)
                }
            }
    }
}

public data class MiConstUint8Field(
    public var value: UByte = 0u,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstUint8Field> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiConstUint8Field> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 3L
                override fun readNative(addr: Long): MiConstUint8Field =
                    MiConstUint8Field(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: MiConstUint8Field) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.flags)
                }
            }
    }
}

public class MiContext internal constructor(
    ftCtorArg: ConstPtr<MiContextFt>,
    public var reserved: IntArray,
) {
    public var ft: ConstPtr<MiContextFt> = ftCtorArg
        internal set

    public constructor() : this(
        ftCtorArg = ConstPtr(0L),
        reserved = IntArray(3),
    )

    public operator fun component1(): ConstPtr<MiContextFt> = this.ft

    public operator fun component2(): IntArray = this.reserved

    public fun copy(ft: ConstPtr<MiContextFt> = this.ft, reserved: IntArray = this.reserved): MiContext = MiContext(ftCtorArg = ft, reserved = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiContext) return false
        if (this.ft != other.ft) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ft.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiContext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiContext> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): MiContext =
                    MiContext(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<MiContextFt>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64, (3).toInt())
                        ).readNative(addr + 8L).toIntArray(),
                    )
                override fun writeNative(addr: Long, value: MiContext) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<MiContextFt>(64)
                    ).writeNative(addr, value.ft)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64, (3).toInt())
                    ).writeNative(addr + 8L, value.reserved.toList())
                }
            }

        public operator fun invoke(
            ft: ConstPtr<MiContextFt> = ConstPtr(0L),
            reserved: IntArray = IntArray(3),
        ): MiContext =
            MiContext(
                ftCtorArg = ft,
                reserved = reserved,
            )
    }
}

public class MiContextFt(
    public var postResult: Int = 0,
    public var postInstance: Int = 0,
    public var postIndication: Int = 0,
    public var constructInstance: Int = 0,
    public var constructParameters: Int = 0,
    public var newInstance: Int = 0,
    public var newDynamicInstance: Int = 0,
    public var newParameters: Int = 0,
    public var canceled: Int = 0,
    public var getLocale: Int = 0,
    public var registerCancel: Int = 0,
    public var requestUnload: Int = 0,
    public var refuseUnload: Int = 0,
    public var getLocalSession: Int = 0,
    public var setStringOption: Int = 0,
    public var getStringOption: Int = 0,
    public var getNumberOption: Int = 0,
    public var getCustomOption: Int = 0,
    public var getCustomOptionCount: Int = 0,
    public var getCustomOptionAt: Int = 0,
    public var writeMessage: Int = 0,
    public var writeProgress: Int = 0,
    public var writeStreamParameter: Int = 0,
    public var writeCimError: Int = 0,
    public var promptUser: Int = 0,
    public var shouldProcess: Int = 0,
    public var shouldContinue: Int = 0,
    public var postError: Int = 0,
    public var postCimError: Int = 0,
    public var writeError: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiContextFt> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiContextFt> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 240L
                override fun readNative(addr: Long): MiContextFt =
                    MiContextFt(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 144L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 152L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 160L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 168L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 176L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 184L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 192L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 200L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 208L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 216L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 224L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 232L),
                    )
                override fun writeNative(addr: Long, value: MiContextFt) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr, value.postResult)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.postInstance)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 16L, value.postIndication)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 24L, value.constructInstance)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 32L, value.constructParameters)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 40L, value.newInstance)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 48L, value.newDynamicInstance)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 56L, value.newParameters)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 64L, value.canceled)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 72L, value.getLocale)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 80L, value.registerCancel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 88L, value.requestUnload)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 96L, value.refuseUnload)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 104L, value.getLocalSession)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 112L, value.setStringOption)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 120L, value.getStringOption)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 128L, value.getNumberOption)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 136L, value.getCustomOption)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 144L, value.getCustomOptionCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 152L, value.getCustomOptionAt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 160L, value.writeMessage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 168L, value.writeProgress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 176L, value.writeStreamParameter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 184L, value.writeCimError)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 192L, value.promptUser)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 200L, value.shouldProcess)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 208L, value.shouldContinue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 216L, value.postError)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 224L, value.postCimError)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 232L, value.writeError)
                }
            }
    }
}

public data class MiDatetime(
    public var isTimestamp: UInt = 0u,
    public var u: MiDatetime0 = MiDatetime0(),
)

public data class MiDatetime0(
    public var timestamp: MiTimestamp = MiTimestamp(),
    public var interval: MiInterval = MiInterval(),
)

public class MiDatetimeA internal constructor(
    dataCtorArg: MutPtr<MiDatetime>,
    public var size: UInt,
) {
    public var data: MutPtr<MiDatetime> = dataCtorArg
        internal set

    public constructor() : this(
        dataCtorArg = MutPtr(0L),
        size = 0u,
    )

    public operator fun component1(): MutPtr<MiDatetime> = this.data

    public operator fun component2(): UInt = this.size

    public fun copy(data: MutPtr<MiDatetime> = this.data, size: UInt = this.size): MiDatetimeA = MiDatetimeA(dataCtorArg = data, size = size)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiDatetimeA) return false
        if (this.data != other.data) return false
        if (this.size != other.size) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.data.hashCode()
        result = 31 * result + this.size.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiDatetimeA> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiDatetimeA> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MiDatetimeA =
                    MiDatetimeA(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MiDatetime>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MiDatetimeA) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MiDatetime>(64)
                    ).writeNative(addr, value.data)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.size)
                }
            }

        public operator fun invoke(
            data: MutPtr<MiDatetime> = MutPtr(0L),
            size: UInt = 0u,
        ): MiDatetimeA =
            MiDatetimeA(
                dataCtorArg = data,
                size = size,
            )
    }
}

public data class MiDatetimeAfield(
    public var value: MiDatetimeA = MiDatetimeA(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiDatetimeAfield> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiDatetimeAfield> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MiDatetimeAfield =
                    MiDatetimeAfield(
                        (MiDatetimeA.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 17L),
                    )
                override fun writeNative(addr: Long, value: MiDatetimeAfield) {
                    (MiDatetimeA.typeLayout()).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 17L, value.flags)
                }
            }
    }
}

public data class MiDatetimeField(
    public var value: MiDatetime = MiDatetime(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiDeserializer(
    public var reserved1: ULong = 0uL,
    public var reserved2: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiDeserializer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiDeserializer> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MiDeserializer =
                    MiDeserializer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MiDeserializer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.reserved2)
                }
            }
    }
}

public data class MiDeserializerFt(
    public var close: Int = 0,
    public var deserializeClass: Int = 0,
    public var classGetClassName: Int = 0,
    public var classGetParentClassName: Int = 0,
    public var deserializeInstance: Int = 0,
    public var instanceGetClassName: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiDeserializerFt> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiDeserializerFt> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): MiDeserializerFt =
                    MiDeserializerFt(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: MiDeserializerFt) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr, value.close)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.deserializeClass)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 16L, value.classGetClassName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 24L, value.classGetParentClassName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 32L, value.deserializeInstance)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 40L, value.instanceGetClassName)
                }
            }
    }
}

public class MiDestinationOptions internal constructor(
    public var reserved1: ULong,
    public var reserved2: Int,
    ftCtorArg: ConstPtr<MiDestinationOptionsFt>,
) {
    public var ft: ConstPtr<MiDestinationOptionsFt> = ftCtorArg
        internal set

    public constructor() : this(
        reserved1 = 0uL,
        reserved2 = 0,
        ftCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): ULong = this.reserved1

    public operator fun component2(): Int = this.reserved2

    public operator fun component3(): ConstPtr<MiDestinationOptionsFt> = this.ft

    public fun copy(reserved1: ULong = this.reserved1, reserved2: Int = this.reserved2, ft: ConstPtr<MiDestinationOptionsFt> = this.ft): MiDestinationOptions = MiDestinationOptions(reserved1 = reserved1, reserved2 = reserved2, ftCtorArg = ft)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiDestinationOptions) return false
        if (this.reserved1 != other.reserved1) return false
        if (this.reserved2 != other.reserved2) return false
        if (this.ft != other.ft) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved1.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.ft.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiDestinationOptions> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiDestinationOptions> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MiDestinationOptions =
                    MiDestinationOptions(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<MiDestinationOptionsFt>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: MiDestinationOptions) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.reserved2)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<MiDestinationOptionsFt>(64)
                    ).writeNative(addr + 16L, value.ft)
                }
            }

        public operator fun invoke(
            reserved1: ULong = 0uL,
            reserved2: Int = 0,
            ft: ConstPtr<MiDestinationOptionsFt> = ConstPtr(0L),
        ): MiDestinationOptions =
            MiDestinationOptions(
                reserved1 = reserved1,
                reserved2 = reserved2,
                ftCtorArg = ft,
            )
    }
}

public data class MiDestinationOptionsFt(
    public var delete: Int = 0,
    public var setString: Int = 0,
    public var setNumber: Int = 0,
    public var addCredentials: Int = 0,
    public var getString: Int = 0,
    public var getNumber: Int = 0,
    public var getOptionCount: Int = 0,
    public var getOptionAt: Int = 0,
    public var getOption: Int = 0,
    public var getCredentialsCount: Int = 0,
    public var getCredentialsAt: Int = 0,
    public var getCredentialsPasswordAt: Int = 0,
    public var clone: Int = 0,
    public var setInterval: Int = 0,
    public var getInterval: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiDestinationOptionsFt> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiDestinationOptionsFt> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 120L
                override fun readNative(addr: Long): MiDestinationOptionsFt =
                    MiDestinationOptionsFt(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 112L),
                    )
                override fun writeNative(addr: Long, value: MiDestinationOptionsFt) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr, value.delete)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.setString)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 16L, value.setNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 24L, value.addCredentials)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 32L, value.getString)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 40L, value.getNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 48L, value.getOptionCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 56L, value.getOptionAt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 64L, value.getOption)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 72L, value.getCredentialsCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 80L, value.getCredentialsAt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 88L, value.getCredentialsPasswordAt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 96L, value.clone)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 104L, value.setInterval)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 112L, value.getInterval)
                }
            }
    }
}

public class MiFeatureDecl internal constructor(
    public var flags: UInt,
    public var code: UInt,
    nameCtorArg: ConstPtr<UShort>,
    qualifiersCtorArg: ConstPtr<ConstPtr<MiQualifier>>,
    public var numQualifiers: UInt,
) {
    public var name: ConstPtr<UShort> = nameCtorArg
        internal set

    public var qualifiers: ConstPtr<ConstPtr<MiQualifier>> = qualifiersCtorArg
        internal set

    public constructor() : this(
        flags = 0u,
        code = 0u,
        nameCtorArg = ConstPtr(0L),
        qualifiersCtorArg = ConstPtr(0L),
        numQualifiers = 0u,
    )

    public operator fun component1(): UInt = this.flags

    public operator fun component2(): UInt = this.code

    public operator fun component3(): ConstPtr<UShort> = this.name

    public operator fun component4(): ConstPtr<ConstPtr<MiQualifier>> = this.qualifiers

    public operator fun component5(): UInt = this.numQualifiers

    public fun copy(flags: UInt = this.flags, code: UInt = this.code, name: ConstPtr<UShort> = this.name, qualifiers: ConstPtr<ConstPtr<MiQualifier>> = this.qualifiers, numQualifiers: UInt = this.numQualifiers): MiFeatureDecl = MiFeatureDecl(flags = flags, code = code, nameCtorArg = name, qualifiersCtorArg = qualifiers, numQualifiers = numQualifiers)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiFeatureDecl) return false
        if (this.flags != other.flags) return false
        if (this.code != other.code) return false
        if (this.name != other.name) return false
        if (this.qualifiers != other.qualifiers) return false
        if (this.numQualifiers != other.numQualifiers) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.code.hashCode()
        result = 31 * result + this.name.hashCode()
        result = 31 * result + this.qualifiers.hashCode()
        result = 31 * result + this.numQualifiers.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiFeatureDecl> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiFeatureDecl> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): MiFeatureDecl =
                    MiFeatureDecl(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<UShort>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<ConstPtr<MiQualifier>>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: MiFeatureDecl) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.code)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<UShort>(64)
                    ).writeNative(addr + 8L, value.name)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<ConstPtr<MiQualifier>>(64)
                    ).writeNative(addr + 16L, value.qualifiers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.numQualifiers)
                }
            }

        public operator fun invoke(
            flags: UInt = 0u,
            code: UInt = 0u,
            name: ConstPtr<UShort> = ConstPtr(0L),
            qualifiers: ConstPtr<ConstPtr<MiQualifier>> = ConstPtr(0L),
            numQualifiers: UInt = 0u,
        ): MiFeatureDecl =
            MiFeatureDecl(
                flags = flags,
                code = code,
                nameCtorArg = name,
                qualifiersCtorArg = qualifiers,
                numQualifiers = numQualifiers,
            )
    }
}

public class MiFilter internal constructor(
    ftCtorArg: ConstPtr<MiFilterFt>,
    public var reserved: IntArray,
) {
    public var ft: ConstPtr<MiFilterFt> = ftCtorArg
        internal set

    public constructor() : this(
        ftCtorArg = ConstPtr(0L),
        reserved = IntArray(3),
    )

    public operator fun component1(): ConstPtr<MiFilterFt> = this.ft

    public operator fun component2(): IntArray = this.reserved

    public fun copy(ft: ConstPtr<MiFilterFt> = this.ft, reserved: IntArray = this.reserved): MiFilter = MiFilter(ftCtorArg = ft, reserved = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiFilter) return false
        if (this.ft != other.ft) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ft.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiFilter> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiFilter> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): MiFilter =
                    MiFilter(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<MiFilterFt>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64, (3).toInt())
                        ).readNative(addr + 8L).toIntArray(),
                    )
                override fun writeNative(addr: Long, value: MiFilter) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<MiFilterFt>(64)
                    ).writeNative(addr, value.ft)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64, (3).toInt())
                    ).writeNative(addr + 8L, value.reserved.toList())
                }
            }

        public operator fun invoke(
            ft: ConstPtr<MiFilterFt> = ConstPtr(0L),
            reserved: IntArray = IntArray(3),
        ): MiFilter =
            MiFilter(
                ftCtorArg = ft,
                reserved = reserved,
            )
    }
}

public data class MiFilterFt(
    public var evaluate: Int = 0,
    public var getExpression: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiFilterFt> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiFilterFt> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MiFilterFt =
                    MiFilterFt(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MiFilterFt) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr, value.evaluate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.getExpression)
                }
            }
    }
}

public class MiHostedProvider internal constructor(
    public var reserved1: ULong,
    public var reserved2: Int,
    ftCtorArg: ConstPtr<MiHostedProviderFt>,
) {
    public var ft: ConstPtr<MiHostedProviderFt> = ftCtorArg
        internal set

    public constructor() : this(
        reserved1 = 0uL,
        reserved2 = 0,
        ftCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): ULong = this.reserved1

    public operator fun component2(): Int = this.reserved2

    public operator fun component3(): ConstPtr<MiHostedProviderFt> = this.ft

    public fun copy(reserved1: ULong = this.reserved1, reserved2: Int = this.reserved2, ft: ConstPtr<MiHostedProviderFt> = this.ft): MiHostedProvider = MiHostedProvider(reserved1 = reserved1, reserved2 = reserved2, ftCtorArg = ft)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiHostedProvider) return false
        if (this.reserved1 != other.reserved1) return false
        if (this.reserved2 != other.reserved2) return false
        if (this.ft != other.ft) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved1.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.ft.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiHostedProvider> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiHostedProvider> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MiHostedProvider =
                    MiHostedProvider(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<MiHostedProviderFt>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: MiHostedProvider) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.reserved2)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<MiHostedProviderFt>(64)
                    ).writeNative(addr + 16L, value.ft)
                }
            }

        public operator fun invoke(
            reserved1: ULong = 0uL,
            reserved2: Int = 0,
            ft: ConstPtr<MiHostedProviderFt> = ConstPtr(0L),
        ): MiHostedProvider =
            MiHostedProvider(
                reserved1 = reserved1,
                reserved2 = reserved2,
                ftCtorArg = ft,
            )
    }
}

public data class MiHostedProviderFt(
    public var close: Int = 0,
    public var getApplication: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiHostedProviderFt> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiHostedProviderFt> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MiHostedProviderFt =
                    MiHostedProviderFt(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MiHostedProviderFt) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr, value.close)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.getApplication)
                }
            }
    }
}

public class MiInstance internal constructor(
    ftCtorArg: ConstPtr<MiInstanceFt>,
    classDeclCtorArg: ConstPtr<MiClassDecl>,
    serverNameCtorArg: ConstPtr<UShort>,
    nameSpaceCtorArg: ConstPtr<UShort>,
    public var reserved: IntArray,
) {
    public var ft: ConstPtr<MiInstanceFt> = ftCtorArg
        internal set

    public var classDecl: ConstPtr<MiClassDecl> = classDeclCtorArg
        internal set

    public var serverName: ConstPtr<UShort> = serverNameCtorArg
        internal set

    public var nameSpace: ConstPtr<UShort> = nameSpaceCtorArg
        internal set

    public constructor() : this(
        ftCtorArg = ConstPtr(0L),
        classDeclCtorArg = ConstPtr(0L),
        serverNameCtorArg = ConstPtr(0L),
        nameSpaceCtorArg = ConstPtr(0L),
        reserved = IntArray(4),
    )

    public operator fun component1(): ConstPtr<MiInstanceFt> = this.ft

    public operator fun component2(): ConstPtr<MiClassDecl> = this.classDecl

    public operator fun component3(): ConstPtr<UShort> = this.serverName

    public operator fun component4(): ConstPtr<UShort> = this.nameSpace

    public operator fun component5(): IntArray = this.reserved

    public fun copy(ft: ConstPtr<MiInstanceFt> = this.ft, classDecl: ConstPtr<MiClassDecl> = this.classDecl, serverName: ConstPtr<UShort> = this.serverName, nameSpace: ConstPtr<UShort> = this.nameSpace, reserved: IntArray = this.reserved): MiInstance = MiInstance(ftCtorArg = ft, classDeclCtorArg = classDecl, serverNameCtorArg = serverName, nameSpaceCtorArg = nameSpace, reserved = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiInstance) return false
        if (this.ft != other.ft) return false
        if (this.classDecl != other.classDecl) return false
        if (this.serverName != other.serverName) return false
        if (this.nameSpace != other.nameSpace) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ft.hashCode()
        result = 31 * result + this.classDecl.hashCode()
        result = 31 * result + this.serverName.hashCode()
        result = 31 * result + this.nameSpace.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiInstance> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiInstance> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): MiInstance =
                    MiInstance(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<MiInstanceFt>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<MiClassDecl>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<UShort>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<UShort>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64, (4).toInt())
                        ).readNative(addr + 32L).toIntArray(),
                    )
                override fun writeNative(addr: Long, value: MiInstance) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<MiInstanceFt>(64)
                    ).writeNative(addr, value.ft)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<MiClassDecl>(64)
                    ).writeNative(addr + 8L, value.classDecl)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<UShort>(64)
                    ).writeNative(addr + 16L, value.serverName)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<UShort>(64)
                    ).writeNative(addr + 24L, value.nameSpace)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64, (4).toInt())
                    ).writeNative(addr + 32L, value.reserved.toList())
                }
            }

        public operator fun invoke(
            ft: ConstPtr<MiInstanceFt> = ConstPtr(0L),
            classDecl: ConstPtr<MiClassDecl> = ConstPtr(0L),
            serverName: ConstPtr<UShort> = ConstPtr(0L),
            nameSpace: ConstPtr<UShort> = ConstPtr(0L),
            reserved: IntArray = IntArray(4),
        ): MiInstance =
            MiInstance(
                ftCtorArg = ft,
                classDeclCtorArg = classDecl,
                serverNameCtorArg = serverName,
                nameSpaceCtorArg = nameSpace,
                reserved = reserved,
            )
    }
}

public class MiInstanceA internal constructor(
    dataCtorArg: MutPtr<MutPtr<MiInstance>>,
    public var size: UInt,
) {
    public var data: MutPtr<MutPtr<MiInstance>> = dataCtorArg
        internal set

    public constructor() : this(
        dataCtorArg = MutPtr(0L),
        size = 0u,
    )

    public operator fun component1(): MutPtr<MutPtr<MiInstance>> = this.data

    public operator fun component2(): UInt = this.size

    public fun copy(data: MutPtr<MutPtr<MiInstance>> = this.data, size: UInt = this.size): MiInstanceA = MiInstanceA(dataCtorArg = data, size = size)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiInstanceA) return false
        if (this.data != other.data) return false
        if (this.size != other.size) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.data.hashCode()
        result = 31 * result + this.size.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiInstanceA> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiInstanceA> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MiInstanceA =
                    MiInstanceA(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<MiInstance>>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MiInstanceA) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<MiInstance>>(64)
                    ).writeNative(addr, value.data)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.size)
                }
            }

        public operator fun invoke(
            data: MutPtr<MutPtr<MiInstance>> = MutPtr(0L),
            size: UInt = 0u,
        ): MiInstanceA =
            MiInstanceA(
                dataCtorArg = data,
                size = size,
            )
    }
}

public data class MiInstanceAfield(
    public var value: MiInstanceA = MiInstanceA(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiInstanceAfield> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiInstanceAfield> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MiInstanceAfield =
                    MiInstanceAfield(
                        (MiInstanceA.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 17L),
                    )
                override fun writeNative(addr: Long, value: MiInstanceAfield) {
                    (MiInstanceA.typeLayout()).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 17L, value.flags)
                }
            }
    }
}

public data class MiInstanceExFt(
    public var parent: MiInstanceFt = MiInstanceFt(),
    public var normalize: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiInstanceExFt> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiInstanceExFt> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 152L
                override fun readNative(addr: Long): MiInstanceExFt =
                    MiInstanceExFt(
                        (MiInstanceFt.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 144L),
                    )
                override fun writeNative(addr: Long, value: MiInstanceExFt) {
                    (MiInstanceFt.typeLayout()).writeNative(addr, value.parent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 144L, value.normalize)
                }
            }
    }
}

public class MiInstanceFt(
    public var clone: Int = 0,
    public var destruct: Int = 0,
    public var delete: Int = 0,
    public var isA: Int = 0,
    public var getClassNameA: Int = 0,
    public var setNameSpace: Int = 0,
    public var getNameSpace: Int = 0,
    public var getElementCount: Int = 0,
    public var addElement: Int = 0,
    public var setElement: Int = 0,
    public var setElementAt: Int = 0,
    public var getElement: Int = 0,
    public var getElementAt: Int = 0,
    public var clearElement: Int = 0,
    public var clearElementAt: Int = 0,
    public var getServerName: Int = 0,
    public var setServerName: Int = 0,
    public var getClass: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiInstanceFt> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiInstanceFt> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 144L
                override fun readNative(addr: Long): MiInstanceFt =
                    MiInstanceFt(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 136L),
                    )
                override fun writeNative(addr: Long, value: MiInstanceFt) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr, value.clone)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.destruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 16L, value.delete)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 24L, value.isA)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 32L, value.getClassNameA)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 40L, value.setNameSpace)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 48L, value.getNameSpace)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 56L, value.getElementCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 64L, value.addElement)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 72L, value.setElement)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 80L, value.setElementAt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 88L, value.getElement)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 96L, value.getElementAt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 104L, value.clearElement)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 112L, value.clearElementAt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 120L, value.getServerName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 128L, value.setServerName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 136L, value.getClass)
                }
            }
    }
}

public class MiInstanceField internal constructor(
    valueCtorArg: MutPtr<MiInstance>,
    public var exists: UByte,
    public var flags: UByte,
) {
    public var value: MutPtr<MiInstance> = valueCtorArg
        internal set

    public constructor() : this(
        valueCtorArg = MutPtr(0L),
        exists = 0u,
        flags = 0u,
    )

    public operator fun component1(): MutPtr<MiInstance> = this.value

    public operator fun component2(): UByte = this.exists

    public operator fun component3(): UByte = this.flags

    public fun copy(value: MutPtr<MiInstance> = this.value, exists: UByte = this.exists, flags: UByte = this.flags): MiInstanceField = MiInstanceField(valueCtorArg = value, exists = exists, flags = flags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiInstanceField) return false
        if (this.value != other.value) return false
        if (this.exists != other.exists) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.value.hashCode()
        result = 31 * result + this.exists.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiInstanceField> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiInstanceField> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MiInstanceField =
                    MiInstanceField(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MiInstance>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                    )
                override fun writeNative(addr: Long, value: MiInstanceField) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MiInstance>(64)
                    ).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.flags)
                }
            }

        public operator fun invoke(
            value: MutPtr<MiInstance> = MutPtr(0L),
            exists: UByte = 0u,
            flags: UByte = 0u,
        ): MiInstanceField =
            MiInstanceField(
                valueCtorArg = value,
                exists = exists,
                flags = flags,
            )
    }
}

public data class MiInterval(
    public var days: UInt = 0u,
    public var hours: UInt = 0u,
    public var minutes: UInt = 0u,
    public var seconds: UInt = 0u,
    public var microseconds: UInt = 0u,
    public var padding1: UInt = 0u,
    public var padding2: UInt = 0u,
    public var padding3: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiInterval> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiInterval> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): MiInterval =
                    MiInterval(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: MiInterval) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.days)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.hours)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.minutes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.seconds)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.microseconds)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.padding1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.padding2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.padding3)
                }
            }
    }
}

public class MiMethodDecl internal constructor(
    public var flags: UInt,
    public var code: UInt,
    nameCtorArg: ConstPtr<UShort>,
    qualifiersCtorArg: ConstPtr<ConstPtr<MiQualifier>>,
    public var numQualifiers: UInt,
    parametersCtorArg: ConstPtr<ConstPtr<MiParameterDecl>>,
    public var numParameters: UInt,
    public var size: UInt,
    public var returnType: UInt,
    originCtorArg: ConstPtr<UShort>,
    propagatorCtorArg: ConstPtr<UShort>,
    schemaCtorArg: ConstPtr<MiSchemaDecl>,
    public var function: MiMethodDeclInvoke,
) {
    public var name: ConstPtr<UShort> = nameCtorArg
        internal set

    public var qualifiers: ConstPtr<ConstPtr<MiQualifier>> = qualifiersCtorArg
        internal set

    public var parameters: ConstPtr<ConstPtr<MiParameterDecl>> = parametersCtorArg
        internal set

    public var origin: ConstPtr<UShort> = originCtorArg
        internal set

    public var propagator: ConstPtr<UShort> = propagatorCtorArg
        internal set

    public var schema: ConstPtr<MiSchemaDecl> = schemaCtorArg
        internal set

    public constructor() : this(
        flags = 0u,
        code = 0u,
        nameCtorArg = ConstPtr(0L),
        qualifiersCtorArg = ConstPtr(0L),
        numQualifiers = 0u,
        parametersCtorArg = ConstPtr(0L),
        numParameters = 0u,
        size = 0u,
        returnType = 0u,
        originCtorArg = ConstPtr(0L),
        propagatorCtorArg = ConstPtr(0L),
        schemaCtorArg = ConstPtr(0L),
        function = null,
    )

    public operator fun component1(): UInt = this.flags

    public operator fun component2(): UInt = this.code

    public operator fun component3(): ConstPtr<UShort> = this.name

    public operator fun component4(): ConstPtr<ConstPtr<MiQualifier>> = this.qualifiers

    public operator fun component5(): UInt = this.numQualifiers

    public operator fun component6(): ConstPtr<ConstPtr<MiParameterDecl>> = this.parameters

    public operator fun component7(): UInt = this.numParameters

    public operator fun component8(): UInt = this.size

    public operator fun component9(): UInt = this.returnType

    public operator fun component10(): ConstPtr<UShort> = this.origin

    public operator fun component11(): ConstPtr<UShort> = this.propagator

    public operator fun component12(): ConstPtr<MiSchemaDecl> = this.schema

    public operator fun component13(): MiMethodDeclInvoke = this.function

    public fun copy(flags: UInt = this.flags, code: UInt = this.code, name: ConstPtr<UShort> = this.name, qualifiers: ConstPtr<ConstPtr<MiQualifier>> = this.qualifiers, numQualifiers: UInt = this.numQualifiers, parameters: ConstPtr<ConstPtr<MiParameterDecl>> = this.parameters, numParameters: UInt = this.numParameters, size: UInt = this.size, returnType: UInt = this.returnType, origin: ConstPtr<UShort> = this.origin, propagator: ConstPtr<UShort> = this.propagator, schema: ConstPtr<MiSchemaDecl> = this.schema, function: MiMethodDeclInvoke = this.function): MiMethodDecl = MiMethodDecl(flags = flags, code = code, nameCtorArg = name, qualifiersCtorArg = qualifiers, numQualifiers = numQualifiers, parametersCtorArg = parameters, numParameters = numParameters, size = size, returnType = returnType, originCtorArg = origin, propagatorCtorArg = propagator, schemaCtorArg = schema, function = function)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiMethodDecl) return false
        if (this.flags != other.flags) return false
        if (this.code != other.code) return false
        if (this.name != other.name) return false
        if (this.qualifiers != other.qualifiers) return false
        if (this.numQualifiers != other.numQualifiers) return false
        if (this.parameters != other.parameters) return false
        if (this.numParameters != other.numParameters) return false
        if (this.size != other.size) return false
        if (this.returnType != other.returnType) return false
        if (this.origin != other.origin) return false
        if (this.propagator != other.propagator) return false
        if (this.schema != other.schema) return false
        if (this.function != other.function) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.code.hashCode()
        result = 31 * result + this.name.hashCode()
        result = 31 * result + this.qualifiers.hashCode()
        result = 31 * result + this.numQualifiers.hashCode()
        result = 31 * result + this.parameters.hashCode()
        result = 31 * result + this.numParameters.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.returnType.hashCode()
        result = 31 * result + this.origin.hashCode()
        result = 31 * result + this.propagator.hashCode()
        result = 31 * result + this.schema.hashCode()
        result = 31 * result + this.function.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            flags: UInt = 0u,
            code: UInt = 0u,
            name: ConstPtr<UShort> = ConstPtr(0L),
            qualifiers: ConstPtr<ConstPtr<MiQualifier>> = ConstPtr(0L),
            numQualifiers: UInt = 0u,
            parameters: ConstPtr<ConstPtr<MiParameterDecl>> = ConstPtr(0L),
            numParameters: UInt = 0u,
            size: UInt = 0u,
            returnType: UInt = 0u,
            origin: ConstPtr<UShort> = ConstPtr(0L),
            propagator: ConstPtr<UShort> = ConstPtr(0L),
            schema: ConstPtr<MiSchemaDecl> = ConstPtr(0L),
            function: MiMethodDeclInvoke = null,
        ): MiMethodDecl =
            MiMethodDecl(
                flags = flags,
                code = code,
                nameCtorArg = name,
                qualifiersCtorArg = qualifiers,
                numQualifiers = numQualifiers,
                parametersCtorArg = parameters,
                numParameters = numParameters,
                size = size,
                returnType = returnType,
                originCtorArg = origin,
                propagatorCtorArg = propagator,
                schemaCtorArg = schema,
                function = function,
            )
    }
}

public class MiModule internal constructor(
    public var version: UInt,
    public var generatorVersion: UInt,
    public var flags: UInt,
    public var charSize: UInt,
    schemaDeclCtorArg: MutPtr<MiSchemaDecl>,
    public var load: MiModuleLoad,
    public var unload: MiModuleUnload,
    dynamicProviderFTCtorArg: ConstPtr<MiProviderFt>,
) {
    public var schemaDecl: MutPtr<MiSchemaDecl> = schemaDeclCtorArg
        internal set

    public var dynamicProviderFT: ConstPtr<MiProviderFt> = dynamicProviderFTCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        generatorVersion = 0u,
        flags = 0u,
        charSize = 0u,
        schemaDeclCtorArg = MutPtr(0L),
        load = null,
        unload = null,
        dynamicProviderFTCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): UInt = this.generatorVersion

    public operator fun component3(): UInt = this.flags

    public operator fun component4(): UInt = this.charSize

    public operator fun component5(): MutPtr<MiSchemaDecl> = this.schemaDecl

    public operator fun component6(): MiModuleLoad = this.load

    public operator fun component7(): MiModuleUnload = this.unload

    public operator fun component8(): ConstPtr<MiProviderFt> = this.dynamicProviderFT

    public fun copy(version: UInt = this.version, generatorVersion: UInt = this.generatorVersion, flags: UInt = this.flags, charSize: UInt = this.charSize, schemaDecl: MutPtr<MiSchemaDecl> = this.schemaDecl, load: MiModuleLoad = this.load, unload: MiModuleUnload = this.unload, dynamicProviderFT: ConstPtr<MiProviderFt> = this.dynamicProviderFT): MiModule = MiModule(version = version, generatorVersion = generatorVersion, flags = flags, charSize = charSize, schemaDeclCtorArg = schemaDecl, load = load, unload = unload, dynamicProviderFTCtorArg = dynamicProviderFT)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiModule) return false
        if (this.version != other.version) return false
        if (this.generatorVersion != other.generatorVersion) return false
        if (this.flags != other.flags) return false
        if (this.charSize != other.charSize) return false
        if (this.schemaDecl != other.schemaDecl) return false
        if (this.load != other.load) return false
        if (this.unload != other.unload) return false
        if (this.dynamicProviderFT != other.dynamicProviderFT) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.generatorVersion.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.charSize.hashCode()
        result = 31 * result + this.schemaDecl.hashCode()
        result = 31 * result + this.load.hashCode()
        result = 31 * result + this.unload.hashCode()
        result = 31 * result + this.dynamicProviderFT.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: UInt = 0u,
            generatorVersion: UInt = 0u,
            flags: UInt = 0u,
            charSize: UInt = 0u,
            schemaDecl: MutPtr<MiSchemaDecl> = MutPtr(0L),
            load: MiModuleLoad = null,
            unload: MiModuleUnload = null,
            dynamicProviderFT: ConstPtr<MiProviderFt> = ConstPtr(0L),
        ): MiModule =
            MiModule(
                version = version,
                generatorVersion = generatorVersion,
                flags = flags,
                charSize = charSize,
                schemaDeclCtorArg = schemaDecl,
                load = load,
                unload = unload,
                dynamicProviderFTCtorArg = dynamicProviderFT,
            )
    }
}

public class MiObjectDecl internal constructor(
    public var flags: UInt,
    public var code: UInt,
    nameCtorArg: ConstPtr<UShort>,
    qualifiersCtorArg: ConstPtr<ConstPtr<MiQualifier>>,
    public var numQualifiers: UInt,
    propertiesCtorArg: ConstPtr<ConstPtr<MiPropertyDecl>>,
    public var numProperties: UInt,
    public var size: UInt,
) {
    public var name: ConstPtr<UShort> = nameCtorArg
        internal set

    public var qualifiers: ConstPtr<ConstPtr<MiQualifier>> = qualifiersCtorArg
        internal set

    public var properties: ConstPtr<ConstPtr<MiPropertyDecl>> = propertiesCtorArg
        internal set

    public constructor() : this(
        flags = 0u,
        code = 0u,
        nameCtorArg = ConstPtr(0L),
        qualifiersCtorArg = ConstPtr(0L),
        numQualifiers = 0u,
        propertiesCtorArg = ConstPtr(0L),
        numProperties = 0u,
        size = 0u,
    )

    public operator fun component1(): UInt = this.flags

    public operator fun component2(): UInt = this.code

    public operator fun component3(): ConstPtr<UShort> = this.name

    public operator fun component4(): ConstPtr<ConstPtr<MiQualifier>> = this.qualifiers

    public operator fun component5(): UInt = this.numQualifiers

    public operator fun component6(): ConstPtr<ConstPtr<MiPropertyDecl>> = this.properties

    public operator fun component7(): UInt = this.numProperties

    public operator fun component8(): UInt = this.size

    public fun copy(flags: UInt = this.flags, code: UInt = this.code, name: ConstPtr<UShort> = this.name, qualifiers: ConstPtr<ConstPtr<MiQualifier>> = this.qualifiers, numQualifiers: UInt = this.numQualifiers, properties: ConstPtr<ConstPtr<MiPropertyDecl>> = this.properties, numProperties: UInt = this.numProperties, size: UInt = this.size): MiObjectDecl = MiObjectDecl(flags = flags, code = code, nameCtorArg = name, qualifiersCtorArg = qualifiers, numQualifiers = numQualifiers, propertiesCtorArg = properties, numProperties = numProperties, size = size)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiObjectDecl) return false
        if (this.flags != other.flags) return false
        if (this.code != other.code) return false
        if (this.name != other.name) return false
        if (this.qualifiers != other.qualifiers) return false
        if (this.numQualifiers != other.numQualifiers) return false
        if (this.properties != other.properties) return false
        if (this.numProperties != other.numProperties) return false
        if (this.size != other.size) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.code.hashCode()
        result = 31 * result + this.name.hashCode()
        result = 31 * result + this.qualifiers.hashCode()
        result = 31 * result + this.numQualifiers.hashCode()
        result = 31 * result + this.properties.hashCode()
        result = 31 * result + this.numProperties.hashCode()
        result = 31 * result + this.size.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiObjectDecl> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiObjectDecl> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): MiObjectDecl =
                    MiObjectDecl(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<UShort>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<ConstPtr<MiQualifier>>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<ConstPtr<MiPropertyDecl>>(64)
                        ).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                    )
                override fun writeNative(addr: Long, value: MiObjectDecl) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.code)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<UShort>(64)
                    ).writeNative(addr + 8L, value.name)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<ConstPtr<MiQualifier>>(64)
                    ).writeNative(addr + 16L, value.qualifiers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.numQualifiers)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<ConstPtr<MiPropertyDecl>>(64)
                    ).writeNative(addr + 32L, value.properties)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.numProperties)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.size)
                }
            }

        public operator fun invoke(
            flags: UInt = 0u,
            code: UInt = 0u,
            name: ConstPtr<UShort> = ConstPtr(0L),
            qualifiers: ConstPtr<ConstPtr<MiQualifier>> = ConstPtr(0L),
            numQualifiers: UInt = 0u,
            properties: ConstPtr<ConstPtr<MiPropertyDecl>> = ConstPtr(0L),
            numProperties: UInt = 0u,
            size: UInt = 0u,
        ): MiObjectDecl =
            MiObjectDecl(
                flags = flags,
                code = code,
                nameCtorArg = name,
                qualifiersCtorArg = qualifiers,
                numQualifiers = numQualifiers,
                propertiesCtorArg = properties,
                numProperties = numProperties,
                size = size,
            )
    }
}

public class MiOperation internal constructor(
    public var reserved1: ULong,
    public var reserved2: Int,
    ftCtorArg: ConstPtr<MiOperationFt>,
) {
    public var ft: ConstPtr<MiOperationFt> = ftCtorArg
        internal set

    public constructor() : this(
        reserved1 = 0uL,
        reserved2 = 0,
        ftCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): ULong = this.reserved1

    public operator fun component2(): Int = this.reserved2

    public operator fun component3(): ConstPtr<MiOperationFt> = this.ft

    public fun copy(reserved1: ULong = this.reserved1, reserved2: Int = this.reserved2, ft: ConstPtr<MiOperationFt> = this.ft): MiOperation = MiOperation(reserved1 = reserved1, reserved2 = reserved2, ftCtorArg = ft)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiOperation) return false
        if (this.reserved1 != other.reserved1) return false
        if (this.reserved2 != other.reserved2) return false
        if (this.ft != other.ft) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved1.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.ft.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiOperation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiOperation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MiOperation =
                    MiOperation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<MiOperationFt>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: MiOperation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.reserved2)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<MiOperationFt>(64)
                    ).writeNative(addr + 16L, value.ft)
                }
            }

        public operator fun invoke(
            reserved1: ULong = 0uL,
            reserved2: Int = 0,
            ft: ConstPtr<MiOperationFt> = ConstPtr(0L),
        ): MiOperation =
            MiOperation(
                reserved1 = reserved1,
                reserved2 = reserved2,
                ftCtorArg = ft,
            )
    }
}

public class MiOperationCallbacks internal constructor(
    callbackContextCtorArg: MutPtr<CVoid>,
    public var promptUser: MiOperationCallbackPromptUser,
    public var writeError: MiOperationCallbackWriteError,
    public var writeMessage: MiOperationCallbackWriteMessage,
    public var writeProgress: MiOperationCallbackWriteProgress,
    public var instanceResult: MiOperationCallbackInstance,
    public var indicationResult: MiOperationCallbackIndication,
    public var classResult: MiOperationCallbackClass,
    public var streamedParameterResult: MiOperationCallbackStreamedParameter,
) {
    public var callbackContext: MutPtr<CVoid> = callbackContextCtorArg
        internal set

    public constructor() : this(
        callbackContextCtorArg = MutPtr(0L),
        promptUser = null,
        writeError = null,
        writeMessage = null,
        writeProgress = null,
        instanceResult = null,
        indicationResult = null,
        classResult = null,
        streamedParameterResult = null,
    )

    public operator fun component1(): MutPtr<CVoid> = this.callbackContext

    public operator fun component2(): MiOperationCallbackPromptUser = this.promptUser

    public operator fun component3(): MiOperationCallbackWriteError = this.writeError

    public operator fun component4(): MiOperationCallbackWriteMessage = this.writeMessage

    public operator fun component5(): MiOperationCallbackWriteProgress = this.writeProgress

    public operator fun component6(): MiOperationCallbackInstance = this.instanceResult

    public operator fun component7(): MiOperationCallbackIndication = this.indicationResult

    public operator fun component8(): MiOperationCallbackClass = this.classResult

    public operator fun component9(): MiOperationCallbackStreamedParameter = this.streamedParameterResult

    public fun copy(callbackContext: MutPtr<CVoid> = this.callbackContext, promptUser: MiOperationCallbackPromptUser = this.promptUser, writeError: MiOperationCallbackWriteError = this.writeError, writeMessage: MiOperationCallbackWriteMessage = this.writeMessage, writeProgress: MiOperationCallbackWriteProgress = this.writeProgress, instanceResult: MiOperationCallbackInstance = this.instanceResult, indicationResult: MiOperationCallbackIndication = this.indicationResult, classResult: MiOperationCallbackClass = this.classResult, streamedParameterResult: MiOperationCallbackStreamedParameter = this.streamedParameterResult): MiOperationCallbacks = MiOperationCallbacks(callbackContextCtorArg = callbackContext, promptUser = promptUser, writeError = writeError, writeMessage = writeMessage, writeProgress = writeProgress, instanceResult = instanceResult, indicationResult = indicationResult, classResult = classResult, streamedParameterResult = streamedParameterResult)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiOperationCallbacks) return false
        if (this.callbackContext != other.callbackContext) return false
        if (this.promptUser != other.promptUser) return false
        if (this.writeError != other.writeError) return false
        if (this.writeMessage != other.writeMessage) return false
        if (this.writeProgress != other.writeProgress) return false
        if (this.instanceResult != other.instanceResult) return false
        if (this.indicationResult != other.indicationResult) return false
        if (this.classResult != other.classResult) return false
        if (this.streamedParameterResult != other.streamedParameterResult) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.callbackContext.hashCode()
        result = 31 * result + this.promptUser.hashCode()
        result = 31 * result + this.writeError.hashCode()
        result = 31 * result + this.writeMessage.hashCode()
        result = 31 * result + this.writeProgress.hashCode()
        result = 31 * result + this.instanceResult.hashCode()
        result = 31 * result + this.indicationResult.hashCode()
        result = 31 * result + this.classResult.hashCode()
        result = 31 * result + this.streamedParameterResult.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            callbackContext: MutPtr<CVoid> = MutPtr(0L),
            promptUser: MiOperationCallbackPromptUser = null,
            writeError: MiOperationCallbackWriteError = null,
            writeMessage: MiOperationCallbackWriteMessage = null,
            writeProgress: MiOperationCallbackWriteProgress = null,
            instanceResult: MiOperationCallbackInstance = null,
            indicationResult: MiOperationCallbackIndication = null,
            classResult: MiOperationCallbackClass = null,
            streamedParameterResult: MiOperationCallbackStreamedParameter = null,
        ): MiOperationCallbacks =
            MiOperationCallbacks(
                callbackContextCtorArg = callbackContext,
                promptUser = promptUser,
                writeError = writeError,
                writeMessage = writeMessage,
                writeProgress = writeProgress,
                instanceResult = instanceResult,
                indicationResult = indicationResult,
                classResult = classResult,
                streamedParameterResult = streamedParameterResult,
            )
    }
}

public data class MiOperationFt(
    public var close: Int = 0,
    public var cancel: Int = 0,
    public var getSession: Int = 0,
    public var getInstance: Int = 0,
    public var getIndication: Int = 0,
    public var getClass: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiOperationFt> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiOperationFt> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): MiOperationFt =
                    MiOperationFt(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: MiOperationFt) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr, value.close)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.cancel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 16L, value.getSession)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 24L, value.getInstance)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 32L, value.getIndication)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 40L, value.getClass)
                }
            }
    }
}

public class MiOperationOptions internal constructor(
    public var reserved1: ULong,
    public var reserved2: Int,
    ftCtorArg: ConstPtr<MiOperationOptionsFt>,
) {
    public var ft: ConstPtr<MiOperationOptionsFt> = ftCtorArg
        internal set

    public constructor() : this(
        reserved1 = 0uL,
        reserved2 = 0,
        ftCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): ULong = this.reserved1

    public operator fun component2(): Int = this.reserved2

    public operator fun component3(): ConstPtr<MiOperationOptionsFt> = this.ft

    public fun copy(reserved1: ULong = this.reserved1, reserved2: Int = this.reserved2, ft: ConstPtr<MiOperationOptionsFt> = this.ft): MiOperationOptions = MiOperationOptions(reserved1 = reserved1, reserved2 = reserved2, ftCtorArg = ft)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiOperationOptions) return false
        if (this.reserved1 != other.reserved1) return false
        if (this.reserved2 != other.reserved2) return false
        if (this.ft != other.ft) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved1.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.ft.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiOperationOptions> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiOperationOptions> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MiOperationOptions =
                    MiOperationOptions(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<MiOperationOptionsFt>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: MiOperationOptions) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.reserved2)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<MiOperationOptionsFt>(64)
                    ).writeNative(addr + 16L, value.ft)
                }
            }

        public operator fun invoke(
            reserved1: ULong = 0uL,
            reserved2: Int = 0,
            ft: ConstPtr<MiOperationOptionsFt> = ConstPtr(0L),
        ): MiOperationOptions =
            MiOperationOptions(
                reserved1 = reserved1,
                reserved2 = reserved2,
                ftCtorArg = ft,
            )
    }
}

public data class MiOperationOptionsFt(
    public var delete: Int = 0,
    public var setString: Int = 0,
    public var setNumber: Int = 0,
    public var setCustomOption: Int = 0,
    public var getString: Int = 0,
    public var getNumber: Int = 0,
    public var getOptionCount: Int = 0,
    public var getOptionAt: Int = 0,
    public var getOption: Int = 0,
    public var getEnabledChannels: Int = 0,
    public var clone: Int = 0,
    public var setInterval: Int = 0,
    public var getInterval: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiOperationOptionsFt> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiOperationOptionsFt> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 104L
                override fun readNative(addr: Long): MiOperationOptionsFt =
                    MiOperationOptionsFt(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 96L),
                    )
                override fun writeNative(addr: Long, value: MiOperationOptionsFt) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr, value.delete)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.setString)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 16L, value.setNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 24L, value.setCustomOption)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 32L, value.getString)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 40L, value.getNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 48L, value.getOptionCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 56L, value.getOptionAt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 64L, value.getOption)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 72L, value.getEnabledChannels)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 80L, value.clone)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 88L, value.setInterval)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 96L, value.getInterval)
                }
            }
    }
}

public class MiParameterDecl internal constructor(
    public var flags: UInt,
    public var code: UInt,
    nameCtorArg: ConstPtr<UShort>,
    qualifiersCtorArg: ConstPtr<ConstPtr<MiQualifier>>,
    public var numQualifiers: UInt,
    public var type: UInt,
    clsNameCtorArg: ConstPtr<UShort>,
    public var subscript: UInt,
    public var offset: UInt,
) {
    public var name: ConstPtr<UShort> = nameCtorArg
        internal set

    public var qualifiers: ConstPtr<ConstPtr<MiQualifier>> = qualifiersCtorArg
        internal set

    public var clsName: ConstPtr<UShort> = clsNameCtorArg
        internal set

    public constructor() : this(
        flags = 0u,
        code = 0u,
        nameCtorArg = ConstPtr(0L),
        qualifiersCtorArg = ConstPtr(0L),
        numQualifiers = 0u,
        type = 0u,
        clsNameCtorArg = ConstPtr(0L),
        subscript = 0u,
        offset = 0u,
    )

    public operator fun component1(): UInt = this.flags

    public operator fun component2(): UInt = this.code

    public operator fun component3(): ConstPtr<UShort> = this.name

    public operator fun component4(): ConstPtr<ConstPtr<MiQualifier>> = this.qualifiers

    public operator fun component5(): UInt = this.numQualifiers

    public operator fun component6(): UInt = this.type

    public operator fun component7(): ConstPtr<UShort> = this.clsName

    public operator fun component8(): UInt = this.subscript

    public operator fun component9(): UInt = this.offset

    public fun copy(flags: UInt = this.flags, code: UInt = this.code, name: ConstPtr<UShort> = this.name, qualifiers: ConstPtr<ConstPtr<MiQualifier>> = this.qualifiers, numQualifiers: UInt = this.numQualifiers, type: UInt = this.type, clsName: ConstPtr<UShort> = this.clsName, subscript: UInt = this.subscript, offset: UInt = this.offset): MiParameterDecl = MiParameterDecl(flags = flags, code = code, nameCtorArg = name, qualifiersCtorArg = qualifiers, numQualifiers = numQualifiers, type = type, clsNameCtorArg = clsName, subscript = subscript, offset = offset)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiParameterDecl) return false
        if (this.flags != other.flags) return false
        if (this.code != other.code) return false
        if (this.name != other.name) return false
        if (this.qualifiers != other.qualifiers) return false
        if (this.numQualifiers != other.numQualifiers) return false
        if (this.type != other.type) return false
        if (this.clsName != other.clsName) return false
        if (this.subscript != other.subscript) return false
        if (this.offset != other.offset) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.code.hashCode()
        result = 31 * result + this.name.hashCode()
        result = 31 * result + this.qualifiers.hashCode()
        result = 31 * result + this.numQualifiers.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.clsName.hashCode()
        result = 31 * result + this.subscript.hashCode()
        result = 31 * result + this.offset.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiParameterDecl> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiParameterDecl> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): MiParameterDecl =
                    MiParameterDecl(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<UShort>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<ConstPtr<MiQualifier>>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<UShort>(64)
                        ).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                    )
                override fun writeNative(addr: Long, value: MiParameterDecl) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.code)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<UShort>(64)
                    ).writeNative(addr + 8L, value.name)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<ConstPtr<MiQualifier>>(64)
                    ).writeNative(addr + 16L, value.qualifiers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.numQualifiers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.type)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<UShort>(64)
                    ).writeNative(addr + 32L, value.clsName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.subscript)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.offset)
                }
            }

        public operator fun invoke(
            flags: UInt = 0u,
            code: UInt = 0u,
            name: ConstPtr<UShort> = ConstPtr(0L),
            qualifiers: ConstPtr<ConstPtr<MiQualifier>> = ConstPtr(0L),
            numQualifiers: UInt = 0u,
            type: UInt = 0u,
            clsName: ConstPtr<UShort> = ConstPtr(0L),
            subscript: UInt = 0u,
            offset: UInt = 0u,
        ): MiParameterDecl =
            MiParameterDecl(
                flags = flags,
                code = code,
                nameCtorArg = name,
                qualifiersCtorArg = qualifiers,
                numQualifiers = numQualifiers,
                type = type,
                clsNameCtorArg = clsName,
                subscript = subscript,
                offset = offset,
            )
    }
}

public class MiParameterSet internal constructor(
    public var reserved1: ULong,
    public var reserved2: Int,
    ftCtorArg: ConstPtr<MiParameterSetFt>,
) {
    public var ft: ConstPtr<MiParameterSetFt> = ftCtorArg
        internal set

    public constructor() : this(
        reserved1 = 0uL,
        reserved2 = 0,
        ftCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): ULong = this.reserved1

    public operator fun component2(): Int = this.reserved2

    public operator fun component3(): ConstPtr<MiParameterSetFt> = this.ft

    public fun copy(reserved1: ULong = this.reserved1, reserved2: Int = this.reserved2, ft: ConstPtr<MiParameterSetFt> = this.ft): MiParameterSet = MiParameterSet(reserved1 = reserved1, reserved2 = reserved2, ftCtorArg = ft)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiParameterSet) return false
        if (this.reserved1 != other.reserved1) return false
        if (this.reserved2 != other.reserved2) return false
        if (this.ft != other.ft) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved1.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.ft.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiParameterSet> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiParameterSet> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MiParameterSet =
                    MiParameterSet(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<MiParameterSetFt>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: MiParameterSet) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.reserved2)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<MiParameterSetFt>(64)
                    ).writeNative(addr + 16L, value.ft)
                }
            }

        public operator fun invoke(
            reserved1: ULong = 0uL,
            reserved2: Int = 0,
            ft: ConstPtr<MiParameterSetFt> = ConstPtr(0L),
        ): MiParameterSet =
            MiParameterSet(
                reserved1 = reserved1,
                reserved2 = reserved2,
                ftCtorArg = ft,
            )
    }
}

public data class MiParameterSetFt(
    public var getMethodReturnType: Int = 0,
    public var getParameterCount: Int = 0,
    public var getParameterAt: Int = 0,
    public var getParameter: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiParameterSetFt> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiParameterSetFt> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): MiParameterSetFt =
                    MiParameterSetFt(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: MiParameterSetFt) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr, value.getMethodReturnType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.getParameterCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 16L, value.getParameterAt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 24L, value.getParameter)
                }
            }
    }
}

public class MiPropertyDecl internal constructor(
    public var flags: UInt,
    public var code: UInt,
    nameCtorArg: ConstPtr<UShort>,
    qualifiersCtorArg: ConstPtr<ConstPtr<MiQualifier>>,
    public var numQualifiers: UInt,
    public var type: UInt,
    clsNameCtorArg: ConstPtr<UShort>,
    public var subscript: UInt,
    public var offset: UInt,
    originCtorArg: ConstPtr<UShort>,
    propagatorCtorArg: ConstPtr<UShort>,
    valueCtorArg: ConstPtr<CVoid>,
) {
    public var name: ConstPtr<UShort> = nameCtorArg
        internal set

    public var qualifiers: ConstPtr<ConstPtr<MiQualifier>> = qualifiersCtorArg
        internal set

    public var clsName: ConstPtr<UShort> = clsNameCtorArg
        internal set

    public var origin: ConstPtr<UShort> = originCtorArg
        internal set

    public var propagator: ConstPtr<UShort> = propagatorCtorArg
        internal set

    public var value: ConstPtr<CVoid> = valueCtorArg
        internal set

    public constructor() : this(
        flags = 0u,
        code = 0u,
        nameCtorArg = ConstPtr(0L),
        qualifiersCtorArg = ConstPtr(0L),
        numQualifiers = 0u,
        type = 0u,
        clsNameCtorArg = ConstPtr(0L),
        subscript = 0u,
        offset = 0u,
        originCtorArg = ConstPtr(0L),
        propagatorCtorArg = ConstPtr(0L),
        valueCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.flags

    public operator fun component2(): UInt = this.code

    public operator fun component3(): ConstPtr<UShort> = this.name

    public operator fun component4(): ConstPtr<ConstPtr<MiQualifier>> = this.qualifiers

    public operator fun component5(): UInt = this.numQualifiers

    public operator fun component6(): UInt = this.type

    public operator fun component7(): ConstPtr<UShort> = this.clsName

    public operator fun component8(): UInt = this.subscript

    public operator fun component9(): UInt = this.offset

    public operator fun component10(): ConstPtr<UShort> = this.origin

    public operator fun component11(): ConstPtr<UShort> = this.propagator

    public operator fun component12(): ConstPtr<CVoid> = this.value

    public fun copy(flags: UInt = this.flags, code: UInt = this.code, name: ConstPtr<UShort> = this.name, qualifiers: ConstPtr<ConstPtr<MiQualifier>> = this.qualifiers, numQualifiers: UInt = this.numQualifiers, type: UInt = this.type, clsName: ConstPtr<UShort> = this.clsName, subscript: UInt = this.subscript, offset: UInt = this.offset, origin: ConstPtr<UShort> = this.origin, propagator: ConstPtr<UShort> = this.propagator, value: ConstPtr<CVoid> = this.value): MiPropertyDecl = MiPropertyDecl(flags = flags, code = code, nameCtorArg = name, qualifiersCtorArg = qualifiers, numQualifiers = numQualifiers, type = type, clsNameCtorArg = clsName, subscript = subscript, offset = offset, originCtorArg = origin, propagatorCtorArg = propagator, valueCtorArg = value)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiPropertyDecl) return false
        if (this.flags != other.flags) return false
        if (this.code != other.code) return false
        if (this.name != other.name) return false
        if (this.qualifiers != other.qualifiers) return false
        if (this.numQualifiers != other.numQualifiers) return false
        if (this.type != other.type) return false
        if (this.clsName != other.clsName) return false
        if (this.subscript != other.subscript) return false
        if (this.offset != other.offset) return false
        if (this.origin != other.origin) return false
        if (this.propagator != other.propagator) return false
        if (this.value != other.value) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.code.hashCode()
        result = 31 * result + this.name.hashCode()
        result = 31 * result + this.qualifiers.hashCode()
        result = 31 * result + this.numQualifiers.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.clsName.hashCode()
        result = 31 * result + this.subscript.hashCode()
        result = 31 * result + this.offset.hashCode()
        result = 31 * result + this.origin.hashCode()
        result = 31 * result + this.propagator.hashCode()
        result = 31 * result + this.value.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiPropertyDecl> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiPropertyDecl> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): MiPropertyDecl =
                    MiPropertyDecl(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<UShort>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<ConstPtr<MiQualifier>>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<UShort>(64)
                        ).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<UShort>(64)
                        ).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<UShort>(64)
                        ).readNative(addr + 56L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<CVoid>(64)
                        ).readNative(addr + 64L),
                    )
                override fun writeNative(addr: Long, value: MiPropertyDecl) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.code)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<UShort>(64)
                    ).writeNative(addr + 8L, value.name)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<ConstPtr<MiQualifier>>(64)
                    ).writeNative(addr + 16L, value.qualifiers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.numQualifiers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.type)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<UShort>(64)
                    ).writeNative(addr + 32L, value.clsName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.subscript)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.offset)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<UShort>(64)
                    ).writeNative(addr + 48L, value.origin)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<UShort>(64)
                    ).writeNative(addr + 56L, value.propagator)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<CVoid>(64)
                    ).writeNative(addr + 64L, value.value)
                }
            }

        public operator fun invoke(
            flags: UInt = 0u,
            code: UInt = 0u,
            name: ConstPtr<UShort> = ConstPtr(0L),
            qualifiers: ConstPtr<ConstPtr<MiQualifier>> = ConstPtr(0L),
            numQualifiers: UInt = 0u,
            type: UInt = 0u,
            clsName: ConstPtr<UShort> = ConstPtr(0L),
            subscript: UInt = 0u,
            offset: UInt = 0u,
            origin: ConstPtr<UShort> = ConstPtr(0L),
            propagator: ConstPtr<UShort> = ConstPtr(0L),
            value: ConstPtr<CVoid> = ConstPtr(0L),
        ): MiPropertyDecl =
            MiPropertyDecl(
                flags = flags,
                code = code,
                nameCtorArg = name,
                qualifiersCtorArg = qualifiers,
                numQualifiers = numQualifiers,
                type = type,
                clsNameCtorArg = clsName,
                subscript = subscript,
                offset = offset,
                originCtorArg = origin,
                propagatorCtorArg = propagator,
                valueCtorArg = value,
            )
    }
}

public class MiPropertySet internal constructor(
    ftCtorArg: ConstPtr<MiPropertySetFt>,
    public var reserved: IntArray,
) {
    public var ft: ConstPtr<MiPropertySetFt> = ftCtorArg
        internal set

    public constructor() : this(
        ftCtorArg = ConstPtr(0L),
        reserved = IntArray(3),
    )

    public operator fun component1(): ConstPtr<MiPropertySetFt> = this.ft

    public operator fun component2(): IntArray = this.reserved

    public fun copy(ft: ConstPtr<MiPropertySetFt> = this.ft, reserved: IntArray = this.reserved): MiPropertySet = MiPropertySet(ftCtorArg = ft, reserved = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiPropertySet) return false
        if (this.ft != other.ft) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ft.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiPropertySet> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiPropertySet> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): MiPropertySet =
                    MiPropertySet(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<MiPropertySetFt>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64, (3).toInt())
                        ).readNative(addr + 8L).toIntArray(),
                    )
                override fun writeNative(addr: Long, value: MiPropertySet) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<MiPropertySetFt>(64)
                    ).writeNative(addr, value.ft)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64, (3).toInt())
                    ).writeNative(addr + 8L, value.reserved.toList())
                }
            }

        public operator fun invoke(
            ft: ConstPtr<MiPropertySetFt> = ConstPtr(0L),
            reserved: IntArray = IntArray(3),
        ): MiPropertySet =
            MiPropertySet(
                ftCtorArg = ft,
                reserved = reserved,
            )
    }
}

public data class MiPropertySetFt(
    public var getElementCount: Int = 0,
    public var containsElement: Int = 0,
    public var addElement: Int = 0,
    public var getElementAt: Int = 0,
    public var clear: Int = 0,
    public var destruct: Int = 0,
    public var delete: Int = 0,
    public var clone: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiPropertySetFt> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiPropertySetFt> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): MiPropertySetFt =
                    MiPropertySetFt(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: MiPropertySetFt) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr, value.getElementCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.containsElement)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 16L, value.addElement)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 24L, value.getElementAt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 32L, value.clear)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 40L, value.destruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 48L, value.delete)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 56L, value.clone)
                }
            }
    }
}

public data class MiProviderFt(
    public var load: MiProviderFtLoad = null,
    public var unload: MiProviderFtUnload = null,
    public var getInstance: MiProviderFtGetInstance = null,
    public var enumerateInstances: MiProviderFtEnumerateInstances = null,
    public var createInstance: MiProviderFtCreateInstance = null,
    public var modifyInstance: MiProviderFtModifyInstance = null,
    public var deleteInstance: MiProviderFtDeleteInstance = null,
    public var associatorInstances: MiProviderFtAssociatorInstances = null,
    public var referenceInstances: MiProviderFtReferenceInstances = null,
    public var enableIndications: MiProviderFtEnableIndications = null,
    public var disableIndications: MiProviderFtDisableIndications = null,
    public var subscribe: MiProviderFtSubscribe = null,
    public var unsubscribe: MiProviderFtUnsubscribe = null,
    public var invoke: MiProviderFtInvoke = null,
)

public class MiQualifier internal constructor(
    nameCtorArg: ConstPtr<UShort>,
    public var type: UInt,
    public var flavor: UInt,
    valueCtorArg: ConstPtr<CVoid>,
) {
    public var name: ConstPtr<UShort> = nameCtorArg
        internal set

    public var value: ConstPtr<CVoid> = valueCtorArg
        internal set

    public constructor() : this(
        nameCtorArg = ConstPtr(0L),
        type = 0u,
        flavor = 0u,
        valueCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): ConstPtr<UShort> = this.name

    public operator fun component2(): UInt = this.type

    public operator fun component3(): UInt = this.flavor

    public operator fun component4(): ConstPtr<CVoid> = this.value

    public fun copy(name: ConstPtr<UShort> = this.name, type: UInt = this.type, flavor: UInt = this.flavor, value: ConstPtr<CVoid> = this.value): MiQualifier = MiQualifier(nameCtorArg = name, type = type, flavor = flavor, valueCtorArg = value)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiQualifier) return false
        if (this.name != other.name) return false
        if (this.type != other.type) return false
        if (this.flavor != other.flavor) return false
        if (this.value != other.value) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.name.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.flavor.hashCode()
        result = 31 * result + this.value.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiQualifier> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiQualifier> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MiQualifier =
                    MiQualifier(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<UShort>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: MiQualifier) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<UShort>(64)
                    ).writeNative(addr, value.name)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.flavor)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.value)
                }
            }

        public operator fun invoke(
            name: ConstPtr<UShort> = ConstPtr(0L),
            type: UInt = 0u,
            flavor: UInt = 0u,
            value: ConstPtr<CVoid> = ConstPtr(0L),
        ): MiQualifier =
            MiQualifier(
                nameCtorArg = name,
                type = type,
                flavor = flavor,
                valueCtorArg = value,
            )
    }
}

public class MiQualifierDecl internal constructor(
    nameCtorArg: ConstPtr<UShort>,
    public var type: UInt,
    public var scope: UInt,
    public var flavor: UInt,
    public var subscript: UInt,
    valueCtorArg: ConstPtr<CVoid>,
) {
    public var name: ConstPtr<UShort> = nameCtorArg
        internal set

    public var value: ConstPtr<CVoid> = valueCtorArg
        internal set

    public constructor() : this(
        nameCtorArg = ConstPtr(0L),
        type = 0u,
        scope = 0u,
        flavor = 0u,
        subscript = 0u,
        valueCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): ConstPtr<UShort> = this.name

    public operator fun component2(): UInt = this.type

    public operator fun component3(): UInt = this.scope

    public operator fun component4(): UInt = this.flavor

    public operator fun component5(): UInt = this.subscript

    public operator fun component6(): ConstPtr<CVoid> = this.value

    public fun copy(name: ConstPtr<UShort> = this.name, type: UInt = this.type, scope: UInt = this.scope, flavor: UInt = this.flavor, subscript: UInt = this.subscript, value: ConstPtr<CVoid> = this.value): MiQualifierDecl = MiQualifierDecl(nameCtorArg = name, type = type, scope = scope, flavor = flavor, subscript = subscript, valueCtorArg = value)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiQualifierDecl) return false
        if (this.name != other.name) return false
        if (this.type != other.type) return false
        if (this.scope != other.scope) return false
        if (this.flavor != other.flavor) return false
        if (this.subscript != other.subscript) return false
        if (this.value != other.value) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.name.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.scope.hashCode()
        result = 31 * result + this.flavor.hashCode()
        result = 31 * result + this.subscript.hashCode()
        result = 31 * result + this.value.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiQualifierDecl> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiQualifierDecl> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): MiQualifierDecl =
                    MiQualifierDecl(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<UShort>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: MiQualifierDecl) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<UShort>(64)
                    ).writeNative(addr, value.name)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.scope)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.flavor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.subscript)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.value)
                }
            }

        public operator fun invoke(
            name: ConstPtr<UShort> = ConstPtr(0L),
            type: UInt = 0u,
            scope: UInt = 0u,
            flavor: UInt = 0u,
            subscript: UInt = 0u,
            value: ConstPtr<CVoid> = ConstPtr(0L),
        ): MiQualifierDecl =
            MiQualifierDecl(
                nameCtorArg = name,
                type = type,
                scope = scope,
                flavor = flavor,
                subscript = subscript,
                valueCtorArg = value,
            )
    }
}

public class MiQualifierSet internal constructor(
    public var reserved1: ULong,
    public var reserved2: Int,
    ftCtorArg: ConstPtr<MiQualifierSetFt>,
) {
    public var ft: ConstPtr<MiQualifierSetFt> = ftCtorArg
        internal set

    public constructor() : this(
        reserved1 = 0uL,
        reserved2 = 0,
        ftCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): ULong = this.reserved1

    public operator fun component2(): Int = this.reserved2

    public operator fun component3(): ConstPtr<MiQualifierSetFt> = this.ft

    public fun copy(reserved1: ULong = this.reserved1, reserved2: Int = this.reserved2, ft: ConstPtr<MiQualifierSetFt> = this.ft): MiQualifierSet = MiQualifierSet(reserved1 = reserved1, reserved2 = reserved2, ftCtorArg = ft)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiQualifierSet) return false
        if (this.reserved1 != other.reserved1) return false
        if (this.reserved2 != other.reserved2) return false
        if (this.ft != other.ft) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved1.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.ft.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiQualifierSet> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiQualifierSet> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MiQualifierSet =
                    MiQualifierSet(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<MiQualifierSetFt>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: MiQualifierSet) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.reserved2)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<MiQualifierSetFt>(64)
                    ).writeNative(addr + 16L, value.ft)
                }
            }

        public operator fun invoke(
            reserved1: ULong = 0uL,
            reserved2: Int = 0,
            ft: ConstPtr<MiQualifierSetFt> = ConstPtr(0L),
        ): MiQualifierSet =
            MiQualifierSet(
                reserved1 = reserved1,
                reserved2 = reserved2,
                ftCtorArg = ft,
            )
    }
}

public data class MiQualifierSetFt(
    public var getQualifierCount: Int = 0,
    public var getQualifierAt: Int = 0,
    public var getQualifier: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiQualifierSetFt> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiQualifierSetFt> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MiQualifierSetFt =
                    MiQualifierSetFt(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: MiQualifierSetFt) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr, value.getQualifierCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.getQualifierAt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 16L, value.getQualifier)
                }
            }
    }
}

public class MiReal32A internal constructor(
    dataCtorArg: MutPtr<Float>,
    public var size: UInt,
) {
    public var data: MutPtr<Float> = dataCtorArg
        internal set

    public constructor() : this(
        dataCtorArg = MutPtr(0L),
        size = 0u,
    )

    public operator fun component1(): MutPtr<Float> = this.data

    public operator fun component2(): UInt = this.size

    public fun copy(data: MutPtr<Float> = this.data, size: UInt = this.size): MiReal32A = MiReal32A(dataCtorArg = data, size = size)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiReal32A) return false
        if (this.data != other.data) return false
        if (this.size != other.size) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.data.hashCode()
        result = 31 * result + this.size.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiReal32A> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiReal32A> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MiReal32A =
                    MiReal32A(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Float>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MiReal32A) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Float>(64)
                    ).writeNative(addr, value.data)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.size)
                }
            }

        public operator fun invoke(
            data: MutPtr<Float> = MutPtr(0L),
            size: UInt = 0u,
        ): MiReal32A =
            MiReal32A(
                dataCtorArg = data,
                size = size,
            )
    }
}

public data class MiReal32Afield(
    public var value: MiReal32A = MiReal32A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiReal32Afield> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiReal32Afield> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MiReal32Afield =
                    MiReal32Afield(
                        (MiReal32A.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 17L),
                    )
                override fun writeNative(addr: Long, value: MiReal32Afield) {
                    (MiReal32A.typeLayout()).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 17L, value.flags)
                }
            }
    }
}

public data class MiReal32Field(
    public var value: Float = 0.0f,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiReal32Field> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiReal32Field> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): MiReal32Field =
                    MiReal32Field(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                    )
                override fun writeNative(addr: Long, value: MiReal32Field) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.flags)
                }
            }
    }
}

public class MiReal64A internal constructor(
    dataCtorArg: MutPtr<Double>,
    public var size: UInt,
) {
    public var data: MutPtr<Double> = dataCtorArg
        internal set

    public constructor() : this(
        dataCtorArg = MutPtr(0L),
        size = 0u,
    )

    public operator fun component1(): MutPtr<Double> = this.data

    public operator fun component2(): UInt = this.size

    public fun copy(data: MutPtr<Double> = this.data, size: UInt = this.size): MiReal64A = MiReal64A(dataCtorArg = data, size = size)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiReal64A) return false
        if (this.data != other.data) return false
        if (this.size != other.size) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.data.hashCode()
        result = 31 * result + this.size.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiReal64A> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiReal64A> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MiReal64A =
                    MiReal64A(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Double>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MiReal64A) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Double>(64)
                    ).writeNative(addr, value.data)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.size)
                }
            }

        public operator fun invoke(
            data: MutPtr<Double> = MutPtr(0L),
            size: UInt = 0u,
        ): MiReal64A =
            MiReal64A(
                dataCtorArg = data,
                size = size,
            )
    }
}

public data class MiReal64Afield(
    public var value: MiReal64A = MiReal64A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiReal64Afield> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiReal64Afield> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MiReal64Afield =
                    MiReal64Afield(
                        (MiReal64A.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 17L),
                    )
                override fun writeNative(addr: Long, value: MiReal64Afield) {
                    (MiReal64A.typeLayout()).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 17L, value.flags)
                }
            }
    }
}

public data class MiReal64Field(
    public var value: Double = 0.0,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiReal64Field> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiReal64Field> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MiReal64Field =
                    MiReal64Field(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                    )
                override fun writeNative(addr: Long, value: MiReal64Field) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.flags)
                }
            }
    }
}

public class MiReferenceA internal constructor(
    dataCtorArg: MutPtr<MutPtr<MiInstance>>,
    public var size: UInt,
) {
    public var data: MutPtr<MutPtr<MiInstance>> = dataCtorArg
        internal set

    public constructor() : this(
        dataCtorArg = MutPtr(0L),
        size = 0u,
    )

    public operator fun component1(): MutPtr<MutPtr<MiInstance>> = this.data

    public operator fun component2(): UInt = this.size

    public fun copy(data: MutPtr<MutPtr<MiInstance>> = this.data, size: UInt = this.size): MiReferenceA = MiReferenceA(dataCtorArg = data, size = size)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiReferenceA) return false
        if (this.data != other.data) return false
        if (this.size != other.size) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.data.hashCode()
        result = 31 * result + this.size.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiReferenceA> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiReferenceA> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MiReferenceA =
                    MiReferenceA(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<MiInstance>>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MiReferenceA) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<MiInstance>>(64)
                    ).writeNative(addr, value.data)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.size)
                }
            }

        public operator fun invoke(
            data: MutPtr<MutPtr<MiInstance>> = MutPtr(0L),
            size: UInt = 0u,
        ): MiReferenceA =
            MiReferenceA(
                dataCtorArg = data,
                size = size,
            )
    }
}

public data class MiReferenceAfield(
    public var value: MiReferenceA = MiReferenceA(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiReferenceAfield> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiReferenceAfield> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MiReferenceAfield =
                    MiReferenceAfield(
                        (MiReferenceA.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 17L),
                    )
                override fun writeNative(addr: Long, value: MiReferenceAfield) {
                    (MiReferenceA.typeLayout()).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 17L, value.flags)
                }
            }
    }
}

public class MiReferenceField internal constructor(
    valueCtorArg: MutPtr<MiInstance>,
    public var exists: UByte,
    public var flags: UByte,
) {
    public var value: MutPtr<MiInstance> = valueCtorArg
        internal set

    public constructor() : this(
        valueCtorArg = MutPtr(0L),
        exists = 0u,
        flags = 0u,
    )

    public operator fun component1(): MutPtr<MiInstance> = this.value

    public operator fun component2(): UByte = this.exists

    public operator fun component3(): UByte = this.flags

    public fun copy(value: MutPtr<MiInstance> = this.value, exists: UByte = this.exists, flags: UByte = this.flags): MiReferenceField = MiReferenceField(valueCtorArg = value, exists = exists, flags = flags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiReferenceField) return false
        if (this.value != other.value) return false
        if (this.exists != other.exists) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.value.hashCode()
        result = 31 * result + this.exists.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiReferenceField> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiReferenceField> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MiReferenceField =
                    MiReferenceField(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MiInstance>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                    )
                override fun writeNative(addr: Long, value: MiReferenceField) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MiInstance>(64)
                    ).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.flags)
                }
            }

        public operator fun invoke(
            value: MutPtr<MiInstance> = MutPtr(0L),
            exists: UByte = 0u,
            flags: UByte = 0u,
        ): MiReferenceField =
            MiReferenceField(
                valueCtorArg = value,
                exists = exists,
                flags = flags,
            )
    }
}

public class MiSchemaDecl internal constructor(
    qualifierDeclsCtorArg: ConstPtr<ConstPtr<MiQualifierDecl>>,
    public var numQualifierDecls: UInt,
    classDeclsCtorArg: ConstPtr<ConstPtr<MiClassDecl>>,
    public var numClassDecls: UInt,
) {
    public var qualifierDecls: ConstPtr<ConstPtr<MiQualifierDecl>> = qualifierDeclsCtorArg
        internal set

    public var classDecls: ConstPtr<ConstPtr<MiClassDecl>> = classDeclsCtorArg
        internal set

    public constructor() : this(
        qualifierDeclsCtorArg = ConstPtr(0L),
        numQualifierDecls = 0u,
        classDeclsCtorArg = ConstPtr(0L),
        numClassDecls = 0u,
    )

    public operator fun component1(): ConstPtr<ConstPtr<MiQualifierDecl>> = this.qualifierDecls

    public operator fun component2(): UInt = this.numQualifierDecls

    public operator fun component3(): ConstPtr<ConstPtr<MiClassDecl>> = this.classDecls

    public operator fun component4(): UInt = this.numClassDecls

    public fun copy(qualifierDecls: ConstPtr<ConstPtr<MiQualifierDecl>> = this.qualifierDecls, numQualifierDecls: UInt = this.numQualifierDecls, classDecls: ConstPtr<ConstPtr<MiClassDecl>> = this.classDecls, numClassDecls: UInt = this.numClassDecls): MiSchemaDecl = MiSchemaDecl(qualifierDeclsCtorArg = qualifierDecls, numQualifierDecls = numQualifierDecls, classDeclsCtorArg = classDecls, numClassDecls = numClassDecls)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiSchemaDecl) return false
        if (this.qualifierDecls != other.qualifierDecls) return false
        if (this.numQualifierDecls != other.numQualifierDecls) return false
        if (this.classDecls != other.classDecls) return false
        if (this.numClassDecls != other.numClassDecls) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.qualifierDecls.hashCode()
        result = 31 * result + this.numQualifierDecls.hashCode()
        result = 31 * result + this.classDecls.hashCode()
        result = 31 * result + this.numClassDecls.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiSchemaDecl> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiSchemaDecl> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): MiSchemaDecl =
                    MiSchemaDecl(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<ConstPtr<MiQualifierDecl>>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<ConstPtr<MiClassDecl>>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: MiSchemaDecl) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<ConstPtr<MiQualifierDecl>>(64)
                    ).writeNative(addr, value.qualifierDecls)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.numQualifierDecls)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<ConstPtr<MiClassDecl>>(64)
                    ).writeNative(addr + 16L, value.classDecls)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.numClassDecls)
                }
            }

        public operator fun invoke(
            qualifierDecls: ConstPtr<ConstPtr<MiQualifierDecl>> = ConstPtr(0L),
            numQualifierDecls: UInt = 0u,
            classDecls: ConstPtr<ConstPtr<MiClassDecl>> = ConstPtr(0L),
            numClassDecls: UInt = 0u,
        ): MiSchemaDecl =
            MiSchemaDecl(
                qualifierDeclsCtorArg = qualifierDecls,
                numQualifierDecls = numQualifierDecls,
                classDeclsCtorArg = classDecls,
                numClassDecls = numClassDecls,
            )
    }
}

public data class MiSerializer(
    public var reserved1: ULong = 0uL,
    public var reserved2: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiSerializer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiSerializer> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MiSerializer =
                    MiSerializer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MiSerializer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.reserved2)
                }
            }
    }
}

public data class MiSerializerFt(
    public var close: Int = 0,
    public var serializeClass: Int = 0,
    public var serializeInstance: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiSerializerFt> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiSerializerFt> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MiSerializerFt =
                    MiSerializerFt(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: MiSerializerFt) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr, value.close)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.serializeClass)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 16L, value.serializeInstance)
                }
            }
    }
}

public class MiServer internal constructor(
    serverFTCtorArg: ConstPtr<MiServerFt>,
    contextFTCtorArg: ConstPtr<MiContextFt>,
    instanceFTCtorArg: ConstPtr<MiInstanceFt>,
    propertySetFTCtorArg: ConstPtr<MiPropertySetFt>,
    filterFTCtorArg: ConstPtr<MiFilterFt>,
) {
    public var serverFT: ConstPtr<MiServerFt> = serverFTCtorArg
        internal set

    public var contextFT: ConstPtr<MiContextFt> = contextFTCtorArg
        internal set

    public var instanceFT: ConstPtr<MiInstanceFt> = instanceFTCtorArg
        internal set

    public var propertySetFT: ConstPtr<MiPropertySetFt> = propertySetFTCtorArg
        internal set

    public var filterFT: ConstPtr<MiFilterFt> = filterFTCtorArg
        internal set

    public constructor() : this(
        serverFTCtorArg = ConstPtr(0L),
        contextFTCtorArg = ConstPtr(0L),
        instanceFTCtorArg = ConstPtr(0L),
        propertySetFTCtorArg = ConstPtr(0L),
        filterFTCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): ConstPtr<MiServerFt> = this.serverFT

    public operator fun component2(): ConstPtr<MiContextFt> = this.contextFT

    public operator fun component3(): ConstPtr<MiInstanceFt> = this.instanceFT

    public operator fun component4(): ConstPtr<MiPropertySetFt> = this.propertySetFT

    public operator fun component5(): ConstPtr<MiFilterFt> = this.filterFT

    public fun copy(serverFT: ConstPtr<MiServerFt> = this.serverFT, contextFT: ConstPtr<MiContextFt> = this.contextFT, instanceFT: ConstPtr<MiInstanceFt> = this.instanceFT, propertySetFT: ConstPtr<MiPropertySetFt> = this.propertySetFT, filterFT: ConstPtr<MiFilterFt> = this.filterFT): MiServer = MiServer(serverFTCtorArg = serverFT, contextFTCtorArg = contextFT, instanceFTCtorArg = instanceFT, propertySetFTCtorArg = propertySetFT, filterFTCtorArg = filterFT)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiServer) return false
        if (this.serverFT != other.serverFT) return false
        if (this.contextFT != other.contextFT) return false
        if (this.instanceFT != other.instanceFT) return false
        if (this.propertySetFT != other.propertySetFT) return false
        if (this.filterFT != other.filterFT) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.serverFT.hashCode()
        result = 31 * result + this.contextFT.hashCode()
        result = 31 * result + this.instanceFT.hashCode()
        result = 31 * result + this.propertySetFT.hashCode()
        result = 31 * result + this.filterFT.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiServer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiServer> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): MiServer =
                    MiServer(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<MiServerFt>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<MiContextFt>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<MiInstanceFt>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<MiPropertySetFt>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<MiFilterFt>(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: MiServer) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<MiServerFt>(64)
                    ).writeNative(addr, value.serverFT)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<MiContextFt>(64)
                    ).writeNative(addr + 8L, value.contextFT)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<MiInstanceFt>(64)
                    ).writeNative(addr + 16L, value.instanceFT)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<MiPropertySetFt>(64)
                    ).writeNative(addr + 24L, value.propertySetFT)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<MiFilterFt>(64)
                    ).writeNative(addr + 32L, value.filterFT)
                }
            }

        public operator fun invoke(
            serverFT: ConstPtr<MiServerFt> = ConstPtr(0L),
            contextFT: ConstPtr<MiContextFt> = ConstPtr(0L),
            instanceFT: ConstPtr<MiInstanceFt> = ConstPtr(0L),
            propertySetFT: ConstPtr<MiPropertySetFt> = ConstPtr(0L),
            filterFT: ConstPtr<MiFilterFt> = ConstPtr(0L),
        ): MiServer =
            MiServer(
                serverFTCtorArg = serverFT,
                contextFTCtorArg = contextFT,
                instanceFTCtorArg = instanceFT,
                propertySetFTCtorArg = propertySetFT,
                filterFTCtorArg = filterFT,
            )
    }
}

public data class MiServerFt(
    public var getVersion: Int = 0,
    public var getSystemName: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiServerFt> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiServerFt> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MiServerFt =
                    MiServerFt(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MiServerFt) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr, value.getVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.getSystemName)
                }
            }
    }
}

public class MiSession internal constructor(
    public var reserved1: ULong,
    public var reserved2: Int,
    ftCtorArg: ConstPtr<MiSessionFt>,
) {
    public var ft: ConstPtr<MiSessionFt> = ftCtorArg
        internal set

    public constructor() : this(
        reserved1 = 0uL,
        reserved2 = 0,
        ftCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): ULong = this.reserved1

    public operator fun component2(): Int = this.reserved2

    public operator fun component3(): ConstPtr<MiSessionFt> = this.ft

    public fun copy(reserved1: ULong = this.reserved1, reserved2: Int = this.reserved2, ft: ConstPtr<MiSessionFt> = this.ft): MiSession = MiSession(reserved1 = reserved1, reserved2 = reserved2, ftCtorArg = ft)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiSession) return false
        if (this.reserved1 != other.reserved1) return false
        if (this.reserved2 != other.reserved2) return false
        if (this.ft != other.ft) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved1.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.ft.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiSession> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiSession> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MiSession =
                    MiSession(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<MiSessionFt>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: MiSession) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.reserved2)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<MiSessionFt>(64)
                    ).writeNative(addr + 16L, value.ft)
                }
            }

        public operator fun invoke(
            reserved1: ULong = 0uL,
            reserved2: Int = 0,
            ft: ConstPtr<MiSessionFt> = ConstPtr(0L),
        ): MiSession =
            MiSession(
                reserved1 = reserved1,
                reserved2 = reserved2,
                ftCtorArg = ft,
            )
    }
}

public class MiSessionCallbacks internal constructor(
    callbackContextCtorArg: MutPtr<CVoid>,
    public var writeMessage: Int,
    public var writeError: Int,
) {
    public var callbackContext: MutPtr<CVoid> = callbackContextCtorArg
        internal set

    public constructor() : this(
        callbackContextCtorArg = MutPtr(0L),
        writeMessage = 0,
        writeError = 0,
    )

    public operator fun component1(): MutPtr<CVoid> = this.callbackContext

    public operator fun component2(): Int = this.writeMessage

    public operator fun component3(): Int = this.writeError

    public fun copy(callbackContext: MutPtr<CVoid> = this.callbackContext, writeMessage: Int = this.writeMessage, writeError: Int = this.writeError): MiSessionCallbacks = MiSessionCallbacks(callbackContextCtorArg = callbackContext, writeMessage = writeMessage, writeError = writeError)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiSessionCallbacks) return false
        if (this.callbackContext != other.callbackContext) return false
        if (this.writeMessage != other.writeMessage) return false
        if (this.writeError != other.writeError) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.callbackContext.hashCode()
        result = 31 * result + this.writeMessage.hashCode()
        result = 31 * result + this.writeError.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiSessionCallbacks> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiSessionCallbacks> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MiSessionCallbacks =
                    MiSessionCallbacks(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: MiSessionCallbacks) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.callbackContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.writeMessage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 16L, value.writeError)
                }
            }

        public operator fun invoke(
            callbackContext: MutPtr<CVoid> = MutPtr(0L),
            writeMessage: Int = 0,
            writeError: Int = 0,
        ): MiSessionCallbacks =
            MiSessionCallbacks(
                callbackContextCtorArg = callbackContext,
                writeMessage = writeMessage,
                writeError = writeError,
            )
    }
}

public data class MiSessionFt(
    public var close: Int = 0,
    public var getApplication: Int = 0,
    public var getInstance: Int = 0,
    public var modifyInstance: Int = 0,
    public var createInstance: Int = 0,
    public var deleteInstance: Int = 0,
    public var invoke: Int = 0,
    public var enumerateInstances: Int = 0,
    public var queryInstances: Int = 0,
    public var associatorInstances: Int = 0,
    public var referenceInstances: Int = 0,
    public var subscribe: Int = 0,
    public var getClass: Int = 0,
    public var enumerateClasses: Int = 0,
    public var testConnection: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiSessionFt> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiSessionFt> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 120L
                override fun readNative(addr: Long): MiSessionFt =
                    MiSessionFt(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 112L),
                    )
                override fun writeNative(addr: Long, value: MiSessionFt) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr, value.close)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.getApplication)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 16L, value.getInstance)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 24L, value.modifyInstance)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 32L, value.createInstance)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 40L, value.deleteInstance)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 48L, value.invoke)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 56L, value.enumerateInstances)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 64L, value.queryInstances)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 72L, value.associatorInstances)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 80L, value.referenceInstances)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 88L, value.subscribe)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 96L, value.getClass)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 104L, value.enumerateClasses)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 112L, value.testConnection)
                }
            }
    }
}

public class MiSint16A internal constructor(
    dataCtorArg: MutPtr<Short>,
    public var size: UInt,
) {
    public var data: MutPtr<Short> = dataCtorArg
        internal set

    public constructor() : this(
        dataCtorArg = MutPtr(0L),
        size = 0u,
    )

    public operator fun component1(): MutPtr<Short> = this.data

    public operator fun component2(): UInt = this.size

    public fun copy(data: MutPtr<Short> = this.data, size: UInt = this.size): MiSint16A = MiSint16A(dataCtorArg = data, size = size)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiSint16A) return false
        if (this.data != other.data) return false
        if (this.size != other.size) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.data.hashCode()
        result = 31 * result + this.size.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiSint16A> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiSint16A> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MiSint16A =
                    MiSint16A(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Short>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MiSint16A) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Short>(64)
                    ).writeNative(addr, value.data)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.size)
                }
            }

        public operator fun invoke(
            data: MutPtr<Short> = MutPtr(0L),
            size: UInt = 0u,
        ): MiSint16A =
            MiSint16A(
                dataCtorArg = data,
                size = size,
            )
    }
}

public data class MiSint16Afield(
    public var value: MiSint16A = MiSint16A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiSint16Afield> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiSint16Afield> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MiSint16Afield =
                    MiSint16Afield(
                        (MiSint16A.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 17L),
                    )
                override fun writeNative(addr: Long, value: MiSint16Afield) {
                    (MiSint16A.typeLayout()).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 17L, value.flags)
                }
            }
    }
}

public data class MiSint16Field(
    public var value: Short = 0,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiSint16Field> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiSint16Field> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): MiSint16Field =
                    MiSint16Field(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: MiSint16Field) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.flags)
                }
            }
    }
}

public class MiSint32A internal constructor(
    dataCtorArg: MutPtr<Int>,
    public var size: UInt,
) {
    public var data: MutPtr<Int> = dataCtorArg
        internal set

    public constructor() : this(
        dataCtorArg = MutPtr(0L),
        size = 0u,
    )

    public operator fun component1(): MutPtr<Int> = this.data

    public operator fun component2(): UInt = this.size

    public fun copy(data: MutPtr<Int> = this.data, size: UInt = this.size): MiSint32A = MiSint32A(dataCtorArg = data, size = size)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiSint32A) return false
        if (this.data != other.data) return false
        if (this.size != other.size) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.data.hashCode()
        result = 31 * result + this.size.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiSint32A> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiSint32A> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MiSint32A =
                    MiSint32A(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Int>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MiSint32A) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Int>(64)
                    ).writeNative(addr, value.data)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.size)
                }
            }

        public operator fun invoke(
            data: MutPtr<Int> = MutPtr(0L),
            size: UInt = 0u,
        ): MiSint32A =
            MiSint32A(
                dataCtorArg = data,
                size = size,
            )
    }
}

public data class MiSint32Afield(
    public var value: MiSint32A = MiSint32A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiSint32Afield> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiSint32Afield> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MiSint32Afield =
                    MiSint32Afield(
                        (MiSint32A.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 17L),
                    )
                override fun writeNative(addr: Long, value: MiSint32Afield) {
                    (MiSint32A.typeLayout()).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 17L, value.flags)
                }
            }
    }
}

public data class MiSint32Field(
    public var value: Int = 0,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiSint32Field> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiSint32Field> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): MiSint32Field =
                    MiSint32Field(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                    )
                override fun writeNative(addr: Long, value: MiSint32Field) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.flags)
                }
            }
    }
}

public class MiSint64A internal constructor(
    dataCtorArg: MutPtr<Long>,
    public var size: UInt,
) {
    public var data: MutPtr<Long> = dataCtorArg
        internal set

    public constructor() : this(
        dataCtorArg = MutPtr(0L),
        size = 0u,
    )

    public operator fun component1(): MutPtr<Long> = this.data

    public operator fun component2(): UInt = this.size

    public fun copy(data: MutPtr<Long> = this.data, size: UInt = this.size): MiSint64A = MiSint64A(dataCtorArg = data, size = size)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiSint64A) return false
        if (this.data != other.data) return false
        if (this.size != other.size) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.data.hashCode()
        result = 31 * result + this.size.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiSint64A> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiSint64A> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MiSint64A =
                    MiSint64A(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Long>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MiSint64A) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Long>(64)
                    ).writeNative(addr, value.data)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.size)
                }
            }

        public operator fun invoke(
            data: MutPtr<Long> = MutPtr(0L),
            size: UInt = 0u,
        ): MiSint64A =
            MiSint64A(
                dataCtorArg = data,
                size = size,
            )
    }
}

public data class MiSint64Afield(
    public var value: MiSint64A = MiSint64A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiSint64Afield> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiSint64Afield> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MiSint64Afield =
                    MiSint64Afield(
                        (MiSint64A.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 17L),
                    )
                override fun writeNative(addr: Long, value: MiSint64Afield) {
                    (MiSint64A.typeLayout()).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 17L, value.flags)
                }
            }
    }
}

public data class MiSint64Field(
    public var value: Long = 0L,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiSint64Field> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiSint64Field> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MiSint64Field =
                    MiSint64Field(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                    )
                override fun writeNative(addr: Long, value: MiSint64Field) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.flags)
                }
            }
    }
}

public class MiSint8A internal constructor(
    dataCtorArg: MutPtr<Byte>,
    public var size: UInt,
) {
    public var data: MutPtr<Byte> = dataCtorArg
        internal set

    public constructor() : this(
        dataCtorArg = MutPtr(0L),
        size = 0u,
    )

    public operator fun component1(): MutPtr<Byte> = this.data

    public operator fun component2(): UInt = this.size

    public fun copy(data: MutPtr<Byte> = this.data, size: UInt = this.size): MiSint8A = MiSint8A(dataCtorArg = data, size = size)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiSint8A) return false
        if (this.data != other.data) return false
        if (this.size != other.size) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.data.hashCode()
        result = 31 * result + this.size.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiSint8A> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiSint8A> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MiSint8A =
                    MiSint8A(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Byte>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MiSint8A) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Byte>(64)
                    ).writeNative(addr, value.data)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.size)
                }
            }

        public operator fun invoke(
            data: MutPtr<Byte> = MutPtr(0L),
            size: UInt = 0u,
        ): MiSint8A =
            MiSint8A(
                dataCtorArg = data,
                size = size,
            )
    }
}

public data class MiSint8Afield(
    public var value: MiSint8A = MiSint8A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiSint8Afield> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiSint8Afield> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MiSint8Afield =
                    MiSint8Afield(
                        (MiSint8A.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 17L),
                    )
                override fun writeNative(addr: Long, value: MiSint8Afield) {
                    (MiSint8A.typeLayout()).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 17L, value.flags)
                }
            }
    }
}

public data class MiSint8Field(
    public var value: Byte = 0,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiSint8Field> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiSint8Field> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 3L
                override fun readNative(addr: Long): MiSint8Field =
                    MiSint8Field(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: MiSint8Field) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.flags)
                }
            }
    }
}

public class MiStringA internal constructor(
    dataCtorArg: MutPtr<MutPtr<UShort>>,
    public var size: UInt,
) {
    public var data: MutPtr<MutPtr<UShort>> = dataCtorArg
        internal set

    public constructor() : this(
        dataCtorArg = MutPtr(0L),
        size = 0u,
    )

    public operator fun component1(): MutPtr<MutPtr<UShort>> = this.data

    public operator fun component2(): UInt = this.size

    public fun copy(data: MutPtr<MutPtr<UShort>> = this.data, size: UInt = this.size): MiStringA = MiStringA(dataCtorArg = data, size = size)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiStringA) return false
        if (this.data != other.data) return false
        if (this.size != other.size) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.data.hashCode()
        result = 31 * result + this.size.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiStringA> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiStringA> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MiStringA =
                    MiStringA(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<UShort>>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MiStringA) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<UShort>>(64)
                    ).writeNative(addr, value.data)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.size)
                }
            }

        public operator fun invoke(
            data: MutPtr<MutPtr<UShort>> = MutPtr(0L),
            size: UInt = 0u,
        ): MiStringA =
            MiStringA(
                dataCtorArg = data,
                size = size,
            )
    }
}

public data class MiStringAfield(
    public var value: MiStringA = MiStringA(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiStringAfield> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiStringAfield> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MiStringAfield =
                    MiStringAfield(
                        (MiStringA.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 17L),
                    )
                override fun writeNative(addr: Long, value: MiStringAfield) {
                    (MiStringA.typeLayout()).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 17L, value.flags)
                }
            }
    }
}

public class MiStringField internal constructor(
    valueCtorArg: MutPtr<UShort>,
    public var exists: UByte,
    public var flags: UByte,
) {
    public var value: MutPtr<UShort> = valueCtorArg
        internal set

    public constructor() : this(
        valueCtorArg = MutPtr(0L),
        exists = 0u,
        flags = 0u,
    )

    public operator fun component1(): MutPtr<UShort> = this.value

    public operator fun component2(): UByte = this.exists

    public operator fun component3(): UByte = this.flags

    public fun copy(value: MutPtr<UShort> = this.value, exists: UByte = this.exists, flags: UByte = this.flags): MiStringField = MiStringField(valueCtorArg = value, exists = exists, flags = flags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiStringField) return false
        if (this.value != other.value) return false
        if (this.exists != other.exists) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.value.hashCode()
        result = 31 * result + this.exists.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiStringField> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiStringField> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MiStringField =
                    MiStringField(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UShort>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                    )
                override fun writeNative(addr: Long, value: MiStringField) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UShort>(64)
                    ).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.flags)
                }
            }

        public operator fun invoke(
            value: MutPtr<UShort> = MutPtr(0L),
            exists: UByte = 0u,
            flags: UByte = 0u,
        ): MiStringField =
            MiStringField(
                valueCtorArg = value,
                exists = exists,
                flags = flags,
            )
    }
}

public class MiSubscriptionDeliveryOptions internal constructor(
    public var reserved1: ULong,
    public var reserved2: Int,
    ftCtorArg: ConstPtr<MiSubscriptionDeliveryOptionsFt>,
) {
    public var ft: ConstPtr<MiSubscriptionDeliveryOptionsFt> = ftCtorArg
        internal set

    public constructor() : this(
        reserved1 = 0uL,
        reserved2 = 0,
        ftCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): ULong = this.reserved1

    public operator fun component2(): Int = this.reserved2

    public operator fun component3(): ConstPtr<MiSubscriptionDeliveryOptionsFt> = this.ft

    public fun copy(reserved1: ULong = this.reserved1, reserved2: Int = this.reserved2, ft: ConstPtr<MiSubscriptionDeliveryOptionsFt> = this.ft): MiSubscriptionDeliveryOptions = MiSubscriptionDeliveryOptions(reserved1 = reserved1, reserved2 = reserved2, ftCtorArg = ft)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiSubscriptionDeliveryOptions) return false
        if (this.reserved1 != other.reserved1) return false
        if (this.reserved2 != other.reserved2) return false
        if (this.ft != other.ft) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved1.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.ft.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiSubscriptionDeliveryOptions> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiSubscriptionDeliveryOptions> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MiSubscriptionDeliveryOptions =
                    MiSubscriptionDeliveryOptions(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<MiSubscriptionDeliveryOptionsFt>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: MiSubscriptionDeliveryOptions) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.reserved2)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<MiSubscriptionDeliveryOptionsFt>(64)
                    ).writeNative(addr + 16L, value.ft)
                }
            }

        public operator fun invoke(
            reserved1: ULong = 0uL,
            reserved2: Int = 0,
            ft: ConstPtr<MiSubscriptionDeliveryOptionsFt> = ConstPtr(0L),
        ): MiSubscriptionDeliveryOptions =
            MiSubscriptionDeliveryOptions(
                reserved1 = reserved1,
                reserved2 = reserved2,
                ftCtorArg = ft,
            )
    }
}

public class MiSubscriptionDeliveryOptionsFt(
    public var setString: Int = 0,
    public var setNumber: Int = 0,
    public var setDateTime: Int = 0,
    public var setInterval: Int = 0,
    public var addCredentials: Int = 0,
    public var delete: Int = 0,
    public var getString: Int = 0,
    public var getNumber: Int = 0,
    public var getDateTime: Int = 0,
    public var getInterval: Int = 0,
    public var getOptionCount: Int = 0,
    public var getOptionAt: Int = 0,
    public var getOption: Int = 0,
    public var getCredentialsCount: Int = 0,
    public var getCredentialsAt: Int = 0,
    public var getCredentialsPasswordAt: Int = 0,
    public var clone: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiSubscriptionDeliveryOptionsFt> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiSubscriptionDeliveryOptionsFt> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 136L
                override fun readNative(addr: Long): MiSubscriptionDeliveryOptionsFt =
                    MiSubscriptionDeliveryOptionsFt(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 128L),
                    )
                override fun writeNative(addr: Long, value: MiSubscriptionDeliveryOptionsFt) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr, value.setString)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.setNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 16L, value.setDateTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 24L, value.setInterval)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 32L, value.addCredentials)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 40L, value.delete)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 48L, value.getString)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 56L, value.getNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 64L, value.getDateTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 72L, value.getInterval)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 80L, value.getOptionCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 88L, value.getOptionAt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 96L, value.getOption)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 104L, value.getCredentialsCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 112L, value.getCredentialsAt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 120L, value.getCredentialsPasswordAt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 128L, value.clone)
                }
            }
    }
}

public data class MiTimestamp(
    public var year: UInt = 0u,
    public var month: UInt = 0u,
    public var day: UInt = 0u,
    public var hour: UInt = 0u,
    public var minute: UInt = 0u,
    public var second: UInt = 0u,
    public var microseconds: UInt = 0u,
    public var utc: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiTimestamp> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiTimestamp> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): MiTimestamp =
                    MiTimestamp(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: MiTimestamp) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.year)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.month)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.day)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.hour)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.minute)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.second)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.microseconds)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.utc)
                }
            }
    }
}

public class MiUint16A internal constructor(
    dataCtorArg: MutPtr<UShort>,
    public var size: UInt,
) {
    public var data: MutPtr<UShort> = dataCtorArg
        internal set

    public constructor() : this(
        dataCtorArg = MutPtr(0L),
        size = 0u,
    )

    public operator fun component1(): MutPtr<UShort> = this.data

    public operator fun component2(): UInt = this.size

    public fun copy(data: MutPtr<UShort> = this.data, size: UInt = this.size): MiUint16A = MiUint16A(dataCtorArg = data, size = size)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiUint16A) return false
        if (this.data != other.data) return false
        if (this.size != other.size) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.data.hashCode()
        result = 31 * result + this.size.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiUint16A> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiUint16A> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MiUint16A =
                    MiUint16A(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UShort>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MiUint16A) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UShort>(64)
                    ).writeNative(addr, value.data)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.size)
                }
            }

        public operator fun invoke(
            data: MutPtr<UShort> = MutPtr(0L),
            size: UInt = 0u,
        ): MiUint16A =
            MiUint16A(
                dataCtorArg = data,
                size = size,
            )
    }
}

public data class MiUint16Afield(
    public var value: MiUint16A = MiUint16A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiUint16Afield> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiUint16Afield> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MiUint16Afield =
                    MiUint16Afield(
                        (MiUint16A.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 17L),
                    )
                override fun writeNative(addr: Long, value: MiUint16Afield) {
                    (MiUint16A.typeLayout()).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 17L, value.flags)
                }
            }
    }
}

public data class MiUint16Field(
    public var value: UShort = 0u,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiUint16Field> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiUint16Field> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): MiUint16Field =
                    MiUint16Field(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: MiUint16Field) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.flags)
                }
            }
    }
}

public class MiUint32A internal constructor(
    dataCtorArg: MutPtr<UInt>,
    public var size: UInt,
) {
    public var data: MutPtr<UInt> = dataCtorArg
        internal set

    public constructor() : this(
        dataCtorArg = MutPtr(0L),
        size = 0u,
    )

    public operator fun component1(): MutPtr<UInt> = this.data

    public operator fun component2(): UInt = this.size

    public fun copy(data: MutPtr<UInt> = this.data, size: UInt = this.size): MiUint32A = MiUint32A(dataCtorArg = data, size = size)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiUint32A) return false
        if (this.data != other.data) return false
        if (this.size != other.size) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.data.hashCode()
        result = 31 * result + this.size.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiUint32A> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiUint32A> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MiUint32A =
                    MiUint32A(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UInt>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MiUint32A) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UInt>(64)
                    ).writeNative(addr, value.data)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.size)
                }
            }

        public operator fun invoke(
            data: MutPtr<UInt> = MutPtr(0L),
            size: UInt = 0u,
        ): MiUint32A =
            MiUint32A(
                dataCtorArg = data,
                size = size,
            )
    }
}

public data class MiUint32Afield(
    public var value: MiUint32A = MiUint32A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiUint32Afield> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiUint32Afield> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MiUint32Afield =
                    MiUint32Afield(
                        (MiUint32A.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 17L),
                    )
                override fun writeNative(addr: Long, value: MiUint32Afield) {
                    (MiUint32A.typeLayout()).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 17L, value.flags)
                }
            }
    }
}

public data class MiUint32Field(
    public var value: UInt = 0u,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiUint32Field> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiUint32Field> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): MiUint32Field =
                    MiUint32Field(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                    )
                override fun writeNative(addr: Long, value: MiUint32Field) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.flags)
                }
            }
    }
}

public class MiUint64A internal constructor(
    dataCtorArg: MutPtr<ULong>,
    public var size: UInt,
) {
    public var data: MutPtr<ULong> = dataCtorArg
        internal set

    public constructor() : this(
        dataCtorArg = MutPtr(0L),
        size = 0u,
    )

    public operator fun component1(): MutPtr<ULong> = this.data

    public operator fun component2(): UInt = this.size

    public fun copy(data: MutPtr<ULong> = this.data, size: UInt = this.size): MiUint64A = MiUint64A(dataCtorArg = data, size = size)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiUint64A) return false
        if (this.data != other.data) return false
        if (this.size != other.size) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.data.hashCode()
        result = 31 * result + this.size.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiUint64A> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiUint64A> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MiUint64A =
                    MiUint64A(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<ULong>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MiUint64A) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<ULong>(64)
                    ).writeNative(addr, value.data)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.size)
                }
            }

        public operator fun invoke(
            data: MutPtr<ULong> = MutPtr(0L),
            size: UInt = 0u,
        ): MiUint64A =
            MiUint64A(
                dataCtorArg = data,
                size = size,
            )
    }
}

public data class MiUint64Afield(
    public var value: MiUint64A = MiUint64A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiUint64Afield> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiUint64Afield> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MiUint64Afield =
                    MiUint64Afield(
                        (MiUint64A.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 17L),
                    )
                override fun writeNative(addr: Long, value: MiUint64Afield) {
                    (MiUint64A.typeLayout()).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 17L, value.flags)
                }
            }
    }
}

public data class MiUint64Field(
    public var value: ULong = 0uL,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiUint64Field> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiUint64Field> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MiUint64Field =
                    MiUint64Field(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                    )
                override fun writeNative(addr: Long, value: MiUint64Field) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.flags)
                }
            }
    }
}

public class MiUint8A internal constructor(
    dataCtorArg: MutPtr<UByte>,
    public var size: UInt,
) {
    public var data: MutPtr<UByte> = dataCtorArg
        internal set

    public constructor() : this(
        dataCtorArg = MutPtr(0L),
        size = 0u,
    )

    public operator fun component1(): MutPtr<UByte> = this.data

    public operator fun component2(): UInt = this.size

    public fun copy(data: MutPtr<UByte> = this.data, size: UInt = this.size): MiUint8A = MiUint8A(dataCtorArg = data, size = size)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiUint8A) return false
        if (this.data != other.data) return false
        if (this.size != other.size) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.data.hashCode()
        result = 31 * result + this.size.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiUint8A> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiUint8A> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MiUint8A =
                    MiUint8A(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MiUint8A) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr, value.data)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.size)
                }
            }

        public operator fun invoke(
            data: MutPtr<UByte> = MutPtr(0L),
            size: UInt = 0u,
        ): MiUint8A =
            MiUint8A(
                dataCtorArg = data,
                size = size,
            )
    }
}

public data class MiUint8Afield(
    public var value: MiUint8A = MiUint8A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiUint8Afield> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiUint8Afield> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MiUint8Afield =
                    MiUint8Afield(
                        (MiUint8A.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 17L),
                    )
                override fun writeNative(addr: Long, value: MiUint8Afield) {
                    (MiUint8A.typeLayout()).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 17L, value.flags)
                }
            }
    }
}

public data class MiUint8Field(
    public var value: UByte = 0u,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiUint8Field> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiUint8Field> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 3L
                override fun readNative(addr: Long): MiUint8Field =
                    MiUint8Field(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: MiUint8Field) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.exists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.flags)
                }
            }
    }
}

public class MiUserCredentials internal constructor(
    authenticationTypeCtorArg: ConstPtr<UShort>,
    public var credentials: MiUserCredentials0,
) {
    public var authenticationType: ConstPtr<UShort> = authenticationTypeCtorArg
        internal set

    public constructor() : this(
        authenticationTypeCtorArg = ConstPtr(0L),
        credentials = MiUserCredentials0(),
    )

    public operator fun component1(): ConstPtr<UShort> = this.authenticationType

    public operator fun component2(): MiUserCredentials0 = this.credentials

    public fun copy(authenticationType: ConstPtr<UShort> = this.authenticationType, credentials: MiUserCredentials0 = this.credentials): MiUserCredentials = MiUserCredentials(authenticationTypeCtorArg = authenticationType, credentials = credentials)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiUserCredentials) return false
        if (this.authenticationType != other.authenticationType) return false
        if (this.credentials != other.credentials) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.authenticationType.hashCode()
        result = 31 * result + this.credentials.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            authenticationType: ConstPtr<UShort> = ConstPtr(0L),
            credentials: MiUserCredentials0 = MiUserCredentials0(),
        ): MiUserCredentials =
            MiUserCredentials(
                authenticationTypeCtorArg = authenticationType,
                credentials = credentials,
            )
    }
}

public class MiUserCredentials0 internal constructor(
    public var usernamePassword: MiUsernamePasswordCreds,
    certificateThumbprintCtorArg: ConstPtr<UShort>,
) {
    public var certificateThumbprint: ConstPtr<UShort> = certificateThumbprintCtorArg
        internal set

    public constructor() : this(
        usernamePassword = MiUsernamePasswordCreds(),
        certificateThumbprintCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): MiUsernamePasswordCreds = this.usernamePassword

    public operator fun component2(): ConstPtr<UShort> = this.certificateThumbprint

    public fun copy(usernamePassword: MiUsernamePasswordCreds = this.usernamePassword, certificateThumbprint: ConstPtr<UShort> = this.certificateThumbprint): MiUserCredentials0 = MiUserCredentials0(usernamePassword = usernamePassword, certificateThumbprintCtorArg = certificateThumbprint)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiUserCredentials0) return false
        if (this.usernamePassword != other.usernamePassword) return false
        if (this.certificateThumbprint != other.certificateThumbprint) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.usernamePassword.hashCode()
        result = 31 * result + this.certificateThumbprint.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            usernamePassword: MiUsernamePasswordCreds = MiUsernamePasswordCreds(),
            certificateThumbprint: ConstPtr<UShort> = ConstPtr(0L),
        ): MiUserCredentials0 =
            MiUserCredentials0(
                usernamePassword = usernamePassword,
                certificateThumbprintCtorArg = certificateThumbprint,
            )
    }
}

public class MiUsernamePasswordCreds internal constructor(
    domainCtorArg: ConstPtr<UShort>,
    usernameCtorArg: ConstPtr<UShort>,
    passwordCtorArg: ConstPtr<UShort>,
) {
    public var domain: ConstPtr<UShort> = domainCtorArg
        internal set

    public var username: ConstPtr<UShort> = usernameCtorArg
        internal set

    public var password: ConstPtr<UShort> = passwordCtorArg
        internal set

    public constructor() : this(
        domainCtorArg = ConstPtr(0L),
        usernameCtorArg = ConstPtr(0L),
        passwordCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): ConstPtr<UShort> = this.domain

    public operator fun component2(): ConstPtr<UShort> = this.username

    public operator fun component3(): ConstPtr<UShort> = this.password

    public fun copy(domain: ConstPtr<UShort> = this.domain, username: ConstPtr<UShort> = this.username, password: ConstPtr<UShort> = this.password): MiUsernamePasswordCreds = MiUsernamePasswordCreds(domainCtorArg = domain, usernameCtorArg = username, passwordCtorArg = password)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiUsernamePasswordCreds) return false
        if (this.domain != other.domain) return false
        if (this.username != other.username) return false
        if (this.password != other.password) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.domain.hashCode()
        result = 31 * result + this.username.hashCode()
        result = 31 * result + this.password.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiUsernamePasswordCreds> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiUsernamePasswordCreds> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MiUsernamePasswordCreds =
                    MiUsernamePasswordCreds(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<UShort>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<UShort>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<UShort>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: MiUsernamePasswordCreds) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<UShort>(64)
                    ).writeNative(addr, value.domain)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<UShort>(64)
                    ).writeNative(addr + 8L, value.username)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<UShort>(64)
                    ).writeNative(addr + 16L, value.password)
                }
            }

        public operator fun invoke(
            domain: ConstPtr<UShort> = ConstPtr(0L),
            username: ConstPtr<UShort> = ConstPtr(0L),
            password: ConstPtr<UShort> = ConstPtr(0L),
        ): MiUsernamePasswordCreds =
            MiUsernamePasswordCreds(
                domainCtorArg = domain,
                usernameCtorArg = username,
                passwordCtorArg = password,
            )
    }
}

public data class MiUtilitiesFt(
    public var mapErrorToMiErrorCategory: Int = 0,
    public var cimErrorFromErrorCode: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiUtilitiesFt> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MiUtilitiesFt> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MiUtilitiesFt =
                    MiUtilitiesFt(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MiUtilitiesFt) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr, value.mapErrorToMiErrorCategory)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.cimErrorFromErrorCode)
                }
            }
    }
}

public class MiValue internal constructor(
    public var boolean: UByte,
    public var uint8: UByte,
    public var sint8: Byte,
    public var uint16: UShort,
    public var sint16: Short,
    public var uint32: UInt,
    public var sint32: Int,
    public var uint64: ULong,
    public var sint64: Long,
    public var real32: Float,
    public var real64: Double,
    public var char16: UShort,
    public var datetime: MiDatetime,
    stringCtorArg: MutPtr<UShort>,
    instanceCtorArg: MutPtr<MiInstance>,
    referenceCtorArg: MutPtr<MiInstance>,
    public var booleana: MiBooleanA,
    public var uint8a: MiUint8A,
    public var sint8a: MiSint8A,
    public var uint16a: MiUint16A,
    public var sint16a: MiSint16A,
    public var uint32a: MiUint32A,
    public var sint32a: MiSint32A,
    public var uint64a: MiUint64A,
    public var sint64a: MiSint64A,
    public var real32a: MiReal32A,
    public var real64a: MiReal64A,
    public var char16a: MiChar16A,
    public var datetimea: MiDatetimeA,
    public var stringa: MiStringA,
    public var referencea: MiReferenceA,
    public var instancea: MiInstanceA,
    public var array: MiArray,
) {
    public var string: MutPtr<UShort> = stringCtorArg
        internal set

    public var instance: MutPtr<MiInstance> = instanceCtorArg
        internal set

    public var reference: MutPtr<MiInstance> = referenceCtorArg
        internal set

    public constructor() : this(
        boolean = 0u,
        uint8 = 0u,
        sint8 = 0,
        uint16 = 0u,
        sint16 = 0,
        uint32 = 0u,
        sint32 = 0,
        uint64 = 0uL,
        sint64 = 0L,
        real32 = 0.0f,
        real64 = 0.0,
        char16 = 0u,
        datetime = MiDatetime(),
        stringCtorArg = MutPtr(0L),
        instanceCtorArg = MutPtr(0L),
        referenceCtorArg = MutPtr(0L),
        booleana = MiBooleanA(),
        uint8a = MiUint8A(),
        sint8a = MiSint8A(),
        uint16a = MiUint16A(),
        sint16a = MiSint16A(),
        uint32a = MiUint32A(),
        sint32a = MiSint32A(),
        uint64a = MiUint64A(),
        sint64a = MiSint64A(),
        real32a = MiReal32A(),
        real64a = MiReal64A(),
        char16a = MiChar16A(),
        datetimea = MiDatetimeA(),
        stringa = MiStringA(),
        referencea = MiReferenceA(),
        instancea = MiInstanceA(),
        array = MiArray(),
    )

    public companion object {
        public operator fun invoke(
            boolean: UByte = 0u,
            uint8: UByte = 0u,
            sint8: Byte = 0,
            uint16: UShort = 0u,
            sint16: Short = 0,
            uint32: UInt = 0u,
            sint32: Int = 0,
            uint64: ULong = 0uL,
            sint64: Long = 0L,
            real32: Float = 0.0f,
            real64: Double = 0.0,
            char16: UShort = 0u,
            datetime: MiDatetime = MiDatetime(),
            string: MutPtr<UShort> = MutPtr(0L),
            instance: MutPtr<MiInstance> = MutPtr(0L),
            reference: MutPtr<MiInstance> = MutPtr(0L),
            booleana: MiBooleanA = MiBooleanA(),
            uint8a: MiUint8A = MiUint8A(),
            sint8a: MiSint8A = MiSint8A(),
            uint16a: MiUint16A = MiUint16A(),
            sint16a: MiSint16A = MiSint16A(),
            uint32a: MiUint32A = MiUint32A(),
            sint32a: MiSint32A = MiSint32A(),
            uint64a: MiUint64A = MiUint64A(),
            sint64a: MiSint64A = MiSint64A(),
            real32a: MiReal32A = MiReal32A(),
            real64a: MiReal64A = MiReal64A(),
            char16a: MiChar16A = MiChar16A(),
            datetimea: MiDatetimeA = MiDatetimeA(),
            stringa: MiStringA = MiStringA(),
            referencea: MiReferenceA = MiReferenceA(),
            instancea: MiInstanceA = MiInstanceA(),
            array: MiArray = MiArray(),
        ): MiValue =
            MiValue(
                boolean = boolean,
                uint8 = uint8,
                sint8 = sint8,
                uint16 = uint16,
                sint16 = sint16,
                uint32 = uint32,
                sint32 = sint32,
                uint64 = uint64,
                sint64 = sint64,
                real32 = real32,
                real64 = real64,
                char16 = char16,
                datetime = datetime,
                stringCtorArg = string,
                instanceCtorArg = instance,
                referenceCtorArg = reference,
                booleana = booleana,
                uint8a = uint8a,
                sint8a = sint8a,
                uint16a = uint16a,
                sint16a = sint16a,
                uint32a = uint32a,
                sint32a = sint32a,
                uint64a = uint64a,
                sint64a = sint64a,
                real32a = real32a,
                real64a = real64a,
                char16a = char16a,
                datetimea = datetimea,
                stringa = stringa,
                referencea = referencea,
                instancea = instancea,
                array = array,
            )
    }
}

public class SWbemAnalysisMatrix internal constructor(
    public var mUVersion: UInt,
    public var mUMatrixType: UInt,
    mPszPropertyCtorArg: Pcwstr,
    public var mUPropertyType: UInt,
    public var mUEntries: UInt,
    mPValuesCtorArg: MutPtr<MutPtr<CVoid>>,
    mPbTruthTableCtorArg: MutPtr<Bool>,
) {
    public var mPszProperty: Pcwstr = mPszPropertyCtorArg
        internal set

    public var mPValues: MutPtr<MutPtr<CVoid>> = mPValuesCtorArg
        internal set

    public var mPbTruthTable: MutPtr<Bool> = mPbTruthTableCtorArg
        internal set

    public constructor() : this(
        mUVersion = 0u,
        mUMatrixType = 0u,
        mPszPropertyCtorArg = ConstPtr(0L),
        mUPropertyType = 0u,
        mUEntries = 0u,
        mPValuesCtorArg = MutPtr(0L),
        mPbTruthTableCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.mUVersion

    public operator fun component2(): UInt = this.mUMatrixType

    public operator fun component3(): Pcwstr = this.mPszProperty

    public operator fun component4(): UInt = this.mUPropertyType

    public operator fun component5(): UInt = this.mUEntries

    public operator fun component6(): MutPtr<MutPtr<CVoid>> = this.mPValues

    public operator fun component7(): MutPtr<Bool> = this.mPbTruthTable

    public fun copy(mUVersion: UInt = this.mUVersion, mUMatrixType: UInt = this.mUMatrixType, mPszProperty: Pcwstr = this.mPszProperty, mUPropertyType: UInt = this.mUPropertyType, mUEntries: UInt = this.mUEntries, mPValues: MutPtr<MutPtr<CVoid>> = this.mPValues, mPbTruthTable: MutPtr<Bool> = this.mPbTruthTable): SWbemAnalysisMatrix = SWbemAnalysisMatrix(mUVersion = mUVersion, mUMatrixType = mUMatrixType, mPszPropertyCtorArg = mPszProperty, mUPropertyType = mUPropertyType, mUEntries = mUEntries, mPValuesCtorArg = mPValues, mPbTruthTableCtorArg = mPbTruthTable)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SWbemAnalysisMatrix) return false
        if (this.mUVersion != other.mUVersion) return false
        if (this.mUMatrixType != other.mUMatrixType) return false
        if (this.mPszProperty != other.mPszProperty) return false
        if (this.mUPropertyType != other.mUPropertyType) return false
        if (this.mUEntries != other.mUEntries) return false
        if (this.mPValues != other.mPValues) return false
        if (this.mPbTruthTable != other.mPbTruthTable) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mUVersion.hashCode()
        result = 31 * result + this.mUMatrixType.hashCode()
        result = 31 * result + this.mPszProperty.hashCode()
        result = 31 * result + this.mUPropertyType.hashCode()
        result = 31 * result + this.mUEntries.hashCode()
        result = 31 * result + this.mPValues.hashCode()
        result = 31 * result + this.mPbTruthTable.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            mUVersion: UInt = 0u,
            mUMatrixType: UInt = 0u,
            mPszProperty: Pcwstr = ConstPtr(0L),
            mUPropertyType: UInt = 0u,
            mUEntries: UInt = 0u,
            mPValues: MutPtr<MutPtr<CVoid>> = MutPtr(0L),
            mPbTruthTable: MutPtr<Bool> = MutPtr(0L),
        ): SWbemAnalysisMatrix =
            SWbemAnalysisMatrix(
                mUVersion = mUVersion,
                mUMatrixType = mUMatrixType,
                mPszPropertyCtorArg = mPszProperty,
                mUPropertyType = mUPropertyType,
                mUEntries = mUEntries,
                mPValuesCtorArg = mPValues,
                mPbTruthTableCtorArg = mPbTruthTable,
            )
    }
}

public class SWbemAnalysisMatrixList internal constructor(
    public var mUVersion: UInt,
    public var mUMatrixType: UInt,
    public var mUNumMatrices: UInt,
    mPMatricesCtorArg: MutPtr<SWbemAnalysisMatrix>,
) {
    public var mPMatrices: MutPtr<SWbemAnalysisMatrix> = mPMatricesCtorArg
        internal set

    public constructor() : this(
        mUVersion = 0u,
        mUMatrixType = 0u,
        mUNumMatrices = 0u,
        mPMatricesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.mUVersion

    public operator fun component2(): UInt = this.mUMatrixType

    public operator fun component3(): UInt = this.mUNumMatrices

    public operator fun component4(): MutPtr<SWbemAnalysisMatrix> = this.mPMatrices

    public fun copy(mUVersion: UInt = this.mUVersion, mUMatrixType: UInt = this.mUMatrixType, mUNumMatrices: UInt = this.mUNumMatrices, mPMatrices: MutPtr<SWbemAnalysisMatrix> = this.mPMatrices): SWbemAnalysisMatrixList = SWbemAnalysisMatrixList(mUVersion = mUVersion, mUMatrixType = mUMatrixType, mUNumMatrices = mUNumMatrices, mPMatricesCtorArg = mPMatrices)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SWbemAnalysisMatrixList) return false
        if (this.mUVersion != other.mUVersion) return false
        if (this.mUMatrixType != other.mUMatrixType) return false
        if (this.mUNumMatrices != other.mUNumMatrices) return false
        if (this.mPMatrices != other.mPMatrices) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mUVersion.hashCode()
        result = 31 * result + this.mUMatrixType.hashCode()
        result = 31 * result + this.mUNumMatrices.hashCode()
        result = 31 * result + this.mPMatrices.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SWbemAnalysisMatrixList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SWbemAnalysisMatrixList> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): SWbemAnalysisMatrixList =
                    SWbemAnalysisMatrixList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<SWbemAnalysisMatrix>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: SWbemAnalysisMatrixList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.mUVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.mUMatrixType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.mUNumMatrices)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<SWbemAnalysisMatrix>(64)
                    ).writeNative(addr + 16L, value.mPMatrices)
                }
            }

        public operator fun invoke(
            mUVersion: UInt = 0u,
            mUMatrixType: UInt = 0u,
            mUNumMatrices: UInt = 0u,
            mPMatrices: MutPtr<SWbemAnalysisMatrix> = MutPtr(0L),
        ): SWbemAnalysisMatrixList =
            SWbemAnalysisMatrixList(
                mUVersion = mUVersion,
                mUMatrixType = mUMatrixType,
                mUNumMatrices = mUNumMatrices,
                mPMatricesCtorArg = mPMatrices,
            )
    }
}

public class SWbemAssocQueryInf internal constructor(
    public var mUVersion: UInt,
    public var mUAnalysisType: UInt,
    public var mUFeatureMask: UInt,
    mPPathCtorArg: MutPtr<CVoid>,
    mPszPathCtorArg: Pwstr,
    mPszQueryTextCtorArg: Pwstr,
    mPszResultClassCtorArg: Pwstr,
    mPszAssocClassCtorArg: Pwstr,
    mPszRoleCtorArg: Pwstr,
    mPszResultRoleCtorArg: Pwstr,
    mPszRequiredQualifierCtorArg: Pwstr,
    mPszRequiredAssocQualifierCtorArg: Pwstr,
) {
    public var mPPath: MutPtr<CVoid> = mPPathCtorArg
        internal set

    public var mPszPath: Pwstr = mPszPathCtorArg
        internal set

    public var mPszQueryText: Pwstr = mPszQueryTextCtorArg
        internal set

    public var mPszResultClass: Pwstr = mPszResultClassCtorArg
        internal set

    public var mPszAssocClass: Pwstr = mPszAssocClassCtorArg
        internal set

    public var mPszRole: Pwstr = mPszRoleCtorArg
        internal set

    public var mPszResultRole: Pwstr = mPszResultRoleCtorArg
        internal set

    public var mPszRequiredQualifier: Pwstr = mPszRequiredQualifierCtorArg
        internal set

    public var mPszRequiredAssocQualifier: Pwstr = mPszRequiredAssocQualifierCtorArg
        internal set

    public constructor() : this(
        mUVersion = 0u,
        mUAnalysisType = 0u,
        mUFeatureMask = 0u,
        mPPathCtorArg = MutPtr(0L),
        mPszPathCtorArg = MutPtr(0L),
        mPszQueryTextCtorArg = MutPtr(0L),
        mPszResultClassCtorArg = MutPtr(0L),
        mPszAssocClassCtorArg = MutPtr(0L),
        mPszRoleCtorArg = MutPtr(0L),
        mPszResultRoleCtorArg = MutPtr(0L),
        mPszRequiredQualifierCtorArg = MutPtr(0L),
        mPszRequiredAssocQualifierCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.mUVersion

    public operator fun component2(): UInt = this.mUAnalysisType

    public operator fun component3(): UInt = this.mUFeatureMask

    public operator fun component4(): MutPtr<CVoid> = this.mPPath

    public operator fun component5(): Pwstr = this.mPszPath

    public operator fun component6(): Pwstr = this.mPszQueryText

    public operator fun component7(): Pwstr = this.mPszResultClass

    public operator fun component8(): Pwstr = this.mPszAssocClass

    public operator fun component9(): Pwstr = this.mPszRole

    public operator fun component10(): Pwstr = this.mPszResultRole

    public operator fun component11(): Pwstr = this.mPszRequiredQualifier

    public operator fun component12(): Pwstr = this.mPszRequiredAssocQualifier

    public fun copy(mUVersion: UInt = this.mUVersion, mUAnalysisType: UInt = this.mUAnalysisType, mUFeatureMask: UInt = this.mUFeatureMask, mPPath: MutPtr<CVoid> = this.mPPath, mPszPath: Pwstr = this.mPszPath, mPszQueryText: Pwstr = this.mPszQueryText, mPszResultClass: Pwstr = this.mPszResultClass, mPszAssocClass: Pwstr = this.mPszAssocClass, mPszRole: Pwstr = this.mPszRole, mPszResultRole: Pwstr = this.mPszResultRole, mPszRequiredQualifier: Pwstr = this.mPszRequiredQualifier, mPszRequiredAssocQualifier: Pwstr = this.mPszRequiredAssocQualifier): SWbemAssocQueryInf = SWbemAssocQueryInf(mUVersion = mUVersion, mUAnalysisType = mUAnalysisType, mUFeatureMask = mUFeatureMask, mPPathCtorArg = mPPath, mPszPathCtorArg = mPszPath, mPszQueryTextCtorArg = mPszQueryText, mPszResultClassCtorArg = mPszResultClass, mPszAssocClassCtorArg = mPszAssocClass, mPszRoleCtorArg = mPszRole, mPszResultRoleCtorArg = mPszResultRole, mPszRequiredQualifierCtorArg = mPszRequiredQualifier, mPszRequiredAssocQualifierCtorArg = mPszRequiredAssocQualifier)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SWbemAssocQueryInf) return false
        if (this.mUVersion != other.mUVersion) return false
        if (this.mUAnalysisType != other.mUAnalysisType) return false
        if (this.mUFeatureMask != other.mUFeatureMask) return false
        if (this.mPPath != other.mPPath) return false
        if (this.mPszPath != other.mPszPath) return false
        if (this.mPszQueryText != other.mPszQueryText) return false
        if (this.mPszResultClass != other.mPszResultClass) return false
        if (this.mPszAssocClass != other.mPszAssocClass) return false
        if (this.mPszRole != other.mPszRole) return false
        if (this.mPszResultRole != other.mPszResultRole) return false
        if (this.mPszRequiredQualifier != other.mPszRequiredQualifier) return false
        if (this.mPszRequiredAssocQualifier != other.mPszRequiredAssocQualifier) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mUVersion.hashCode()
        result = 31 * result + this.mUAnalysisType.hashCode()
        result = 31 * result + this.mUFeatureMask.hashCode()
        result = 31 * result + this.mPPath.hashCode()
        result = 31 * result + this.mPszPath.hashCode()
        result = 31 * result + this.mPszQueryText.hashCode()
        result = 31 * result + this.mPszResultClass.hashCode()
        result = 31 * result + this.mPszAssocClass.hashCode()
        result = 31 * result + this.mPszRole.hashCode()
        result = 31 * result + this.mPszResultRole.hashCode()
        result = 31 * result + this.mPszRequiredQualifier.hashCode()
        result = 31 * result + this.mPszRequiredAssocQualifier.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            mUVersion: UInt = 0u,
            mUAnalysisType: UInt = 0u,
            mUFeatureMask: UInt = 0u,
            mPPath: MutPtr<CVoid> = MutPtr(0L),
            mPszPath: Pwstr = MutPtr(0L),
            mPszQueryText: Pwstr = MutPtr(0L),
            mPszResultClass: Pwstr = MutPtr(0L),
            mPszAssocClass: Pwstr = MutPtr(0L),
            mPszRole: Pwstr = MutPtr(0L),
            mPszResultRole: Pwstr = MutPtr(0L),
            mPszRequiredQualifier: Pwstr = MutPtr(0L),
            mPszRequiredAssocQualifier: Pwstr = MutPtr(0L),
        ): SWbemAssocQueryInf =
            SWbemAssocQueryInf(
                mUVersion = mUVersion,
                mUAnalysisType = mUAnalysisType,
                mUFeatureMask = mUFeatureMask,
                mPPathCtorArg = mPPath,
                mPszPathCtorArg = mPszPath,
                mPszQueryTextCtorArg = mPszQueryText,
                mPszResultClassCtorArg = mPszResultClass,
                mPszAssocClassCtorArg = mPszAssocClass,
                mPszRoleCtorArg = mPszRole,
                mPszResultRoleCtorArg = mPszResultRole,
                mPszRequiredQualifierCtorArg = mPszRequiredQualifier,
                mPszRequiredAssocQualifierCtorArg = mPszRequiredAssocQualifier,
            )
    }
}

public class SWbemQueryQualifiedName internal constructor(
    public var mUVersion: UInt,
    public var mUTokenType: UInt,
    public var mUNameListSize: UInt,
    mPpszNameListCtorArg: ConstPtr<Pcwstr>,
    public var mBArraysUsed: Bool,
    mPbArrayElUsedCtorArg: MutPtr<Bool>,
    mPuArrayIndexCtorArg: MutPtr<UInt>,
) {
    public var mPpszNameList: ConstPtr<Pcwstr> = mPpszNameListCtorArg
        internal set

    public var mPbArrayElUsed: MutPtr<Bool> = mPbArrayElUsedCtorArg
        internal set

    public var mPuArrayIndex: MutPtr<UInt> = mPuArrayIndexCtorArg
        internal set

    public constructor() : this(
        mUVersion = 0u,
        mUTokenType = 0u,
        mUNameListSize = 0u,
        mPpszNameListCtorArg = ConstPtr(0L),
        mBArraysUsed = 0,
        mPbArrayElUsedCtorArg = MutPtr(0L),
        mPuArrayIndexCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.mUVersion

    public operator fun component2(): UInt = this.mUTokenType

    public operator fun component3(): UInt = this.mUNameListSize

    public operator fun component4(): ConstPtr<Pcwstr> = this.mPpszNameList

    public operator fun component5(): Bool = this.mBArraysUsed

    public operator fun component6(): MutPtr<Bool> = this.mPbArrayElUsed

    public operator fun component7(): MutPtr<UInt> = this.mPuArrayIndex

    public fun copy(mUVersion: UInt = this.mUVersion, mUTokenType: UInt = this.mUTokenType, mUNameListSize: UInt = this.mUNameListSize, mPpszNameList: ConstPtr<Pcwstr> = this.mPpszNameList, mBArraysUsed: Bool = this.mBArraysUsed, mPbArrayElUsed: MutPtr<Bool> = this.mPbArrayElUsed, mPuArrayIndex: MutPtr<UInt> = this.mPuArrayIndex): SWbemQueryQualifiedName = SWbemQueryQualifiedName(mUVersion = mUVersion, mUTokenType = mUTokenType, mUNameListSize = mUNameListSize, mPpszNameListCtorArg = mPpszNameList, mBArraysUsed = mBArraysUsed, mPbArrayElUsedCtorArg = mPbArrayElUsed, mPuArrayIndexCtorArg = mPuArrayIndex)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SWbemQueryQualifiedName) return false
        if (this.mUVersion != other.mUVersion) return false
        if (this.mUTokenType != other.mUTokenType) return false
        if (this.mUNameListSize != other.mUNameListSize) return false
        if (this.mPpszNameList != other.mPpszNameList) return false
        if (this.mBArraysUsed != other.mBArraysUsed) return false
        if (this.mPbArrayElUsed != other.mPbArrayElUsed) return false
        if (this.mPuArrayIndex != other.mPuArrayIndex) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mUVersion.hashCode()
        result = 31 * result + this.mUTokenType.hashCode()
        result = 31 * result + this.mUNameListSize.hashCode()
        result = 31 * result + this.mPpszNameList.hashCode()
        result = 31 * result + this.mBArraysUsed.hashCode()
        result = 31 * result + this.mPbArrayElUsed.hashCode()
        result = 31 * result + this.mPuArrayIndex.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SWbemQueryQualifiedName> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SWbemQueryQualifiedName> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): SWbemQueryQualifiedName =
                    SWbemQueryQualifiedName(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<Pcwstr>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Bool>(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UInt>(64)
                        ).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: SWbemQueryQualifiedName) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.mUVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.mUTokenType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.mUNameListSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<Pcwstr>(64)
                    ).writeNative(addr + 16L, value.mPpszNameList)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.mBArraysUsed)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Bool>(64)
                    ).writeNative(addr + 32L, value.mPbArrayElUsed)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UInt>(64)
                    ).writeNative(addr + 40L, value.mPuArrayIndex)
                }
            }

        public operator fun invoke(
            mUVersion: UInt = 0u,
            mUTokenType: UInt = 0u,
            mUNameListSize: UInt = 0u,
            mPpszNameList: ConstPtr<Pcwstr> = ConstPtr(0L),
            mBArraysUsed: Bool = 0,
            mPbArrayElUsed: MutPtr<Bool> = MutPtr(0L),
            mPuArrayIndex: MutPtr<UInt> = MutPtr(0L),
        ): SWbemQueryQualifiedName =
            SWbemQueryQualifiedName(
                mUVersion = mUVersion,
                mUTokenType = mUTokenType,
                mUNameListSize = mUNameListSize,
                mPpszNameListCtorArg = mPpszNameList,
                mBArraysUsed = mBArraysUsed,
                mPbArrayElUsedCtorArg = mPbArrayElUsed,
                mPuArrayIndexCtorArg = mPuArrayIndex,
            )
    }
}

public class SWbemRpnConst internal constructor(
    mPszStrValCtorArg: Pcwstr,
    public var mBBoolVal: Bool,
    public var mLLongVal: Int,
    public var mULongVal: UInt,
    public var mDblVal: Double,
    public var mLVal64: Long,
    public var mUVal64: Long,
) {
    public var mPszStrVal: Pcwstr = mPszStrValCtorArg
        internal set

    public constructor() : this(
        mPszStrValCtorArg = ConstPtr(0L),
        mBBoolVal = 0,
        mLLongVal = 0,
        mULongVal = 0u,
        mDblVal = 0.0,
        mLVal64 = 0L,
        mUVal64 = 0L,
    )

    public operator fun component1(): Pcwstr = this.mPszStrVal

    public operator fun component2(): Bool = this.mBBoolVal

    public operator fun component3(): Int = this.mLLongVal

    public operator fun component4(): UInt = this.mULongVal

    public operator fun component5(): Double = this.mDblVal

    public operator fun component6(): Long = this.mLVal64

    public operator fun component7(): Long = this.mUVal64

    public fun copy(mPszStrVal: Pcwstr = this.mPszStrVal, mBBoolVal: Bool = this.mBBoolVal, mLLongVal: Int = this.mLLongVal, mULongVal: UInt = this.mULongVal, mDblVal: Double = this.mDblVal, mLVal64: Long = this.mLVal64, mUVal64: Long = this.mUVal64): SWbemRpnConst = SWbemRpnConst(mPszStrValCtorArg = mPszStrVal, mBBoolVal = mBBoolVal, mLLongVal = mLLongVal, mULongVal = mULongVal, mDblVal = mDblVal, mLVal64 = mLVal64, mUVal64 = mUVal64)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SWbemRpnConst) return false
        if (this.mPszStrVal != other.mPszStrVal) return false
        if (this.mBBoolVal != other.mBBoolVal) return false
        if (this.mLLongVal != other.mLLongVal) return false
        if (this.mULongVal != other.mULongVal) return false
        if (this.mDblVal != other.mDblVal) return false
        if (this.mLVal64 != other.mLVal64) return false
        if (this.mUVal64 != other.mUVal64) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mPszStrVal.hashCode()
        result = 31 * result + this.mBBoolVal.hashCode()
        result = 31 * result + this.mLLongVal.hashCode()
        result = 31 * result + this.mULongVal.hashCode()
        result = 31 * result + this.mDblVal.hashCode()
        result = 31 * result + this.mLVal64.hashCode()
        result = 31 * result + this.mUVal64.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            mPszStrVal: Pcwstr = ConstPtr(0L),
            mBBoolVal: Bool = 0,
            mLLongVal: Int = 0,
            mULongVal: UInt = 0u,
            mDblVal: Double = 0.0,
            mLVal64: Long = 0L,
            mUVal64: Long = 0L,
        ): SWbemRpnConst =
            SWbemRpnConst(
                mPszStrValCtorArg = mPszStrVal,
                mBBoolVal = mBBoolVal,
                mLLongVal = mLLongVal,
                mULongVal = mULongVal,
                mDblVal = mDblVal,
                mLVal64 = mLVal64,
                mUVal64 = mUVal64,
            )
    }
}

public class SWbemRpnEncodedQuery internal constructor(
    public var mUVersion: UInt,
    public var mUTokenType: UInt,
    public var mUParsedFeatureMask: ULong,
    public var mUDetectedArraySize: UInt,
    mPuDetectedFeaturesCtorArg: MutPtr<UInt>,
    public var mUSelectListSize: UInt,
    mPpSelectListCtorArg: MutPtr<MutPtr<SWbemQueryQualifiedName>>,
    public var mUFromTargetType: UInt,
    mPszOptionalFromPathCtorArg: Pcwstr,
    public var mUFromListSize: UInt,
    mPpszFromListCtorArg: ConstPtr<Pcwstr>,
    public var mUWhereClauseSize: UInt,
    mPpRpnWhereClauseCtorArg: MutPtr<MutPtr<SWbemRpnQueryToken>>,
    public var mDblWithinPolling: Double,
    public var mDblWithinWindow: Double,
    public var mUOrderByListSize: UInt,
    mPpszOrderByListCtorArg: ConstPtr<Pcwstr>,
    mUOrderDirectionElCtorArg: MutPtr<UInt>,
) {
    public var mPuDetectedFeatures: MutPtr<UInt> = mPuDetectedFeaturesCtorArg
        internal set

    public var mPpSelectList: MutPtr<MutPtr<SWbemQueryQualifiedName>> = mPpSelectListCtorArg
        internal set

    public var mPszOptionalFromPath: Pcwstr = mPszOptionalFromPathCtorArg
        internal set

    public var mPpszFromList: ConstPtr<Pcwstr> = mPpszFromListCtorArg
        internal set

    public var mPpRpnWhereClause: MutPtr<MutPtr<SWbemRpnQueryToken>> = mPpRpnWhereClauseCtorArg
        internal set

    public var mPpszOrderByList: ConstPtr<Pcwstr> = mPpszOrderByListCtorArg
        internal set

    public var mUOrderDirectionEl: MutPtr<UInt> = mUOrderDirectionElCtorArg
        internal set

    public constructor() : this(
        mUVersion = 0u,
        mUTokenType = 0u,
        mUParsedFeatureMask = 0uL,
        mUDetectedArraySize = 0u,
        mPuDetectedFeaturesCtorArg = MutPtr(0L),
        mUSelectListSize = 0u,
        mPpSelectListCtorArg = MutPtr(0L),
        mUFromTargetType = 0u,
        mPszOptionalFromPathCtorArg = ConstPtr(0L),
        mUFromListSize = 0u,
        mPpszFromListCtorArg = ConstPtr(0L),
        mUWhereClauseSize = 0u,
        mPpRpnWhereClauseCtorArg = MutPtr(0L),
        mDblWithinPolling = 0.0,
        mDblWithinWindow = 0.0,
        mUOrderByListSize = 0u,
        mPpszOrderByListCtorArg = ConstPtr(0L),
        mUOrderDirectionElCtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            mUVersion: UInt = 0u,
            mUTokenType: UInt = 0u,
            mUParsedFeatureMask: ULong = 0uL,
            mUDetectedArraySize: UInt = 0u,
            mPuDetectedFeatures: MutPtr<UInt> = MutPtr(0L),
            mUSelectListSize: UInt = 0u,
            mPpSelectList: MutPtr<MutPtr<SWbemQueryQualifiedName>> = MutPtr(0L),
            mUFromTargetType: UInt = 0u,
            mPszOptionalFromPath: Pcwstr = ConstPtr(0L),
            mUFromListSize: UInt = 0u,
            mPpszFromList: ConstPtr<Pcwstr> = ConstPtr(0L),
            mUWhereClauseSize: UInt = 0u,
            mPpRpnWhereClause: MutPtr<MutPtr<SWbemRpnQueryToken>> = MutPtr(0L),
            mDblWithinPolling: Double = 0.0,
            mDblWithinWindow: Double = 0.0,
            mUOrderByListSize: UInt = 0u,
            mPpszOrderByList: ConstPtr<Pcwstr> = ConstPtr(0L),
            mUOrderDirectionEl: MutPtr<UInt> = MutPtr(0L),
        ): SWbemRpnEncodedQuery =
            SWbemRpnEncodedQuery(
                mUVersion = mUVersion,
                mUTokenType = mUTokenType,
                mUParsedFeatureMask = mUParsedFeatureMask,
                mUDetectedArraySize = mUDetectedArraySize,
                mPuDetectedFeaturesCtorArg = mPuDetectedFeatures,
                mUSelectListSize = mUSelectListSize,
                mPpSelectListCtorArg = mPpSelectList,
                mUFromTargetType = mUFromTargetType,
                mPszOptionalFromPathCtorArg = mPszOptionalFromPath,
                mUFromListSize = mUFromListSize,
                mPpszFromListCtorArg = mPpszFromList,
                mUWhereClauseSize = mUWhereClauseSize,
                mPpRpnWhereClauseCtorArg = mPpRpnWhereClause,
                mDblWithinPolling = mDblWithinPolling,
                mDblWithinWindow = mDblWithinWindow,
                mUOrderByListSize = mUOrderByListSize,
                mPpszOrderByListCtorArg = mPpszOrderByList,
                mUOrderDirectionElCtorArg = mUOrderDirectionEl,
            )
    }
}

public class SWbemRpnQueryToken internal constructor(
    public var mUVersion: UInt,
    public var mUTokenType: UInt,
    public var mUSubexpressionShape: UInt,
    public var mUOperator: UInt,
    mPRightIdentCtorArg: MutPtr<SWbemQueryQualifiedName>,
    mPLeftIdentCtorArg: MutPtr<SWbemQueryQualifiedName>,
    public var mUConstApparentType: UInt,
    public var mConst: SWbemRpnConst,
    public var mUConst2ApparentType: UInt,
    public var mConst2: SWbemRpnConst,
    mPszRightFuncCtorArg: Pcwstr,
    mPszLeftFuncCtorArg: Pcwstr,
) {
    public var mPRightIdent: MutPtr<SWbemQueryQualifiedName> = mPRightIdentCtorArg
        internal set

    public var mPLeftIdent: MutPtr<SWbemQueryQualifiedName> = mPLeftIdentCtorArg
        internal set

    public var mPszRightFunc: Pcwstr = mPszRightFuncCtorArg
        internal set

    public var mPszLeftFunc: Pcwstr = mPszLeftFuncCtorArg
        internal set

    public constructor() : this(
        mUVersion = 0u,
        mUTokenType = 0u,
        mUSubexpressionShape = 0u,
        mUOperator = 0u,
        mPRightIdentCtorArg = MutPtr(0L),
        mPLeftIdentCtorArg = MutPtr(0L),
        mUConstApparentType = 0u,
        mConst = SWbemRpnConst(),
        mUConst2ApparentType = 0u,
        mConst2 = SWbemRpnConst(),
        mPszRightFuncCtorArg = ConstPtr(0L),
        mPszLeftFuncCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.mUVersion

    public operator fun component2(): UInt = this.mUTokenType

    public operator fun component3(): UInt = this.mUSubexpressionShape

    public operator fun component4(): UInt = this.mUOperator

    public operator fun component5(): MutPtr<SWbemQueryQualifiedName> = this.mPRightIdent

    public operator fun component6(): MutPtr<SWbemQueryQualifiedName> = this.mPLeftIdent

    public operator fun component7(): UInt = this.mUConstApparentType

    public operator fun component8(): SWbemRpnConst = this.mConst

    public operator fun component9(): UInt = this.mUConst2ApparentType

    public operator fun component10(): SWbemRpnConst = this.mConst2

    public operator fun component11(): Pcwstr = this.mPszRightFunc

    public operator fun component12(): Pcwstr = this.mPszLeftFunc

    public fun copy(mUVersion: UInt = this.mUVersion, mUTokenType: UInt = this.mUTokenType, mUSubexpressionShape: UInt = this.mUSubexpressionShape, mUOperator: UInt = this.mUOperator, mPRightIdent: MutPtr<SWbemQueryQualifiedName> = this.mPRightIdent, mPLeftIdent: MutPtr<SWbemQueryQualifiedName> = this.mPLeftIdent, mUConstApparentType: UInt = this.mUConstApparentType, mConst: SWbemRpnConst = this.mConst, mUConst2ApparentType: UInt = this.mUConst2ApparentType, mConst2: SWbemRpnConst = this.mConst2, mPszRightFunc: Pcwstr = this.mPszRightFunc, mPszLeftFunc: Pcwstr = this.mPszLeftFunc): SWbemRpnQueryToken = SWbemRpnQueryToken(mUVersion = mUVersion, mUTokenType = mUTokenType, mUSubexpressionShape = mUSubexpressionShape, mUOperator = mUOperator, mPRightIdentCtorArg = mPRightIdent, mPLeftIdentCtorArg = mPLeftIdent, mUConstApparentType = mUConstApparentType, mConst = mConst, mUConst2ApparentType = mUConst2ApparentType, mConst2 = mConst2, mPszRightFuncCtorArg = mPszRightFunc, mPszLeftFuncCtorArg = mPszLeftFunc)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SWbemRpnQueryToken) return false
        if (this.mUVersion != other.mUVersion) return false
        if (this.mUTokenType != other.mUTokenType) return false
        if (this.mUSubexpressionShape != other.mUSubexpressionShape) return false
        if (this.mUOperator != other.mUOperator) return false
        if (this.mPRightIdent != other.mPRightIdent) return false
        if (this.mPLeftIdent != other.mPLeftIdent) return false
        if (this.mUConstApparentType != other.mUConstApparentType) return false
        if (this.mConst != other.mConst) return false
        if (this.mUConst2ApparentType != other.mUConst2ApparentType) return false
        if (this.mConst2 != other.mConst2) return false
        if (this.mPszRightFunc != other.mPszRightFunc) return false
        if (this.mPszLeftFunc != other.mPszLeftFunc) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mUVersion.hashCode()
        result = 31 * result + this.mUTokenType.hashCode()
        result = 31 * result + this.mUSubexpressionShape.hashCode()
        result = 31 * result + this.mUOperator.hashCode()
        result = 31 * result + this.mPRightIdent.hashCode()
        result = 31 * result + this.mPLeftIdent.hashCode()
        result = 31 * result + this.mUConstApparentType.hashCode()
        result = 31 * result + this.mConst.hashCode()
        result = 31 * result + this.mUConst2ApparentType.hashCode()
        result = 31 * result + this.mConst2.hashCode()
        result = 31 * result + this.mPszRightFunc.hashCode()
        result = 31 * result + this.mPszLeftFunc.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            mUVersion: UInt = 0u,
            mUTokenType: UInt = 0u,
            mUSubexpressionShape: UInt = 0u,
            mUOperator: UInt = 0u,
            mPRightIdent: MutPtr<SWbemQueryQualifiedName> = MutPtr(0L),
            mPLeftIdent: MutPtr<SWbemQueryQualifiedName> = MutPtr(0L),
            mUConstApparentType: UInt = 0u,
            mConst: SWbemRpnConst = SWbemRpnConst(),
            mUConst2ApparentType: UInt = 0u,
            mConst2: SWbemRpnConst = SWbemRpnConst(),
            mPszRightFunc: Pcwstr = ConstPtr(0L),
            mPszLeftFunc: Pcwstr = ConstPtr(0L),
        ): SWbemRpnQueryToken =
            SWbemRpnQueryToken(
                mUVersion = mUVersion,
                mUTokenType = mUTokenType,
                mUSubexpressionShape = mUSubexpressionShape,
                mUOperator = mUOperator,
                mPRightIdentCtorArg = mPRightIdent,
                mPLeftIdentCtorArg = mPLeftIdent,
                mUConstApparentType = mUConstApparentType,
                mConst = mConst,
                mUConst2ApparentType = mUConst2ApparentType,
                mConst2 = mConst2,
                mPszRightFuncCtorArg = mPszRightFunc,
                mPszLeftFuncCtorArg = mPszLeftFunc,
            )
    }
}

public data class SWbemRpnTokenList(
    public var mUVersion: UInt = 0u,
    public var mUTokenType: UInt = 0u,
    public var mUNumTokens: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SWbemRpnTokenList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SWbemRpnTokenList> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): SWbemRpnTokenList =
                    SWbemRpnTokenList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SWbemRpnTokenList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.mUVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.mUTokenType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.mUNumTokens)
                }
            }
    }
}

public data class WbemCompileStatusInfo(
    public var lPhaseError: Int = 0,
    public var hRes: Hresult = 0,
    public var objectNum: Int = 0,
    public var firstLine: Int = 0,
    public var lastLine: Int = 0,
    public var dwOutFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WbemCompileStatusInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WbemCompileStatusInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): WbemCompileStatusInfo =
                    WbemCompileStatusInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: WbemCompileStatusInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.lPhaseError)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.hRes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.objectNum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.firstLine)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.lastLine)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwOutFlags)
                }
            }
    }
}
