package io.github.kotlinmania.windowssys.windows.wdk.system.registry

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public class KeyValueEntry internal constructor(
    valueNameCtorArg: MutPtr,
    public var dataLength: UInt,
    public var dataOffset: UInt,
    public var type: UInt,
) {
    public var valueName: MutPtr = valueNameCtorArg
        internal set

    public constructor() : this(
        valueNameCtorArg = MutPtr(0L),
        dataLength = 0u,
        dataOffset = 0u,
        type = 0u,
    )

    public operator fun component1(): MutPtr = this.valueName

    public operator fun component2(): UInt = this.dataLength

    public operator fun component3(): UInt = this.dataOffset

    public operator fun component4(): UInt = this.type

    public fun copy(valueName: MutPtr = this.valueName, dataLength: UInt = this.dataLength, dataOffset: UInt = this.dataOffset, type: UInt = this.type): KeyValueEntry = KeyValueEntry(valueNameCtorArg = valueName, dataLength = dataLength, dataOffset = dataOffset, type = type)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KeyValueEntry) return false
        if (this.valueName != other.valueName) return false
        if (this.dataLength != other.dataLength) return false
        if (this.dataOffset != other.dataOffset) return false
        if (this.type != other.type) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.valueName.hashCode()
        result = 31 * result + this.dataLength.hashCode()
        result = 31 * result + this.dataOffset.hashCode()
        result = 31 * result + this.type.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyValueEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyValueEntry> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): KeyValueEntry =
                    KeyValueEntry(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: KeyValueEntry) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.valueName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dataLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dataOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.type)
                }
            }

        public operator fun invoke(
            valueName: MutPtr = MutPtr(0L),
            dataLength: UInt = 0u,
            dataOffset: UInt = 0u,
            type: UInt = 0u,
        ): KeyValueEntry =
            KeyValueEntry(
                valueNameCtorArg = valueName,
                dataLength = dataLength,
                dataOffset = dataOffset,
                type = type,
            )
    }
}

public class RegEnumerateKeyInformation internal constructor(
    objCtorArg: MutPtr,
    public var index: UInt,
    public var keyInformationClass: KeyInformationClass,
    keyInformationCtorArg: MutPtr,
    public var length: UInt,
    resultLengthCtorArg: MutPtr,
    callContextCtorArg: MutPtr,
    objectContextCtorArg: MutPtr,
    reservedCtorArg: MutPtr,
) {
    public var obj: MutPtr = objCtorArg
        internal set

    public var keyInformation: MutPtr = keyInformationCtorArg
        internal set

    public var resultLength: MutPtr = resultLengthCtorArg
        internal set

    public var callContext: MutPtr = callContextCtorArg
        internal set

    public var objectContext: MutPtr = objectContextCtorArg
        internal set

    public var reserved: MutPtr = reservedCtorArg
        internal set

    public constructor() : this(
        objCtorArg = MutPtr(0L),
        index = 0u,
        keyInformationClass = 0,
        keyInformationCtorArg = MutPtr(0L),
        length = 0u,
        resultLengthCtorArg = MutPtr(0L),
        callContextCtorArg = MutPtr(0L),
        objectContextCtorArg = MutPtr(0L),
        reservedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.obj

    public operator fun component2(): UInt = this.index

    public operator fun component3(): KeyInformationClass = this.keyInformationClass

    public operator fun component4(): MutPtr = this.keyInformation

    public operator fun component5(): UInt = this.length

    public operator fun component6(): MutPtr = this.resultLength

    public operator fun component7(): MutPtr = this.callContext

    public operator fun component8(): MutPtr = this.objectContext

    public operator fun component9(): MutPtr = this.reserved

    public fun copy(obj: MutPtr = this.obj, index: UInt = this.index, keyInformationClass: KeyInformationClass = this.keyInformationClass, keyInformation: MutPtr = this.keyInformation, length: UInt = this.length, resultLength: MutPtr = this.resultLength, callContext: MutPtr = this.callContext, objectContext: MutPtr = this.objectContext, reserved: MutPtr = this.reserved): RegEnumerateKeyInformation = RegEnumerateKeyInformation(objCtorArg = obj, index = index, keyInformationClass = keyInformationClass, keyInformationCtorArg = keyInformation, length = length, resultLengthCtorArg = resultLength, callContextCtorArg = callContext, objectContextCtorArg = objectContext, reservedCtorArg = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RegEnumerateKeyInformation) return false
        if (this.obj != other.obj) return false
        if (this.index != other.index) return false
        if (this.keyInformationClass != other.keyInformationClass) return false
        if (this.keyInformation != other.keyInformation) return false
        if (this.length != other.length) return false
        if (this.resultLength != other.resultLength) return false
        if (this.callContext != other.callContext) return false
        if (this.objectContext != other.objectContext) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.obj.hashCode()
        result = 31 * result + this.index.hashCode()
        result = 31 * result + this.keyInformationClass.hashCode()
        result = 31 * result + this.keyInformation.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.resultLength.hashCode()
        result = 31 * result + this.callContext.hashCode()
        result = 31 * result + this.objectContext.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegEnumerateKeyInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegEnumerateKeyInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): RegEnumerateKeyInformation =
                    RegEnumerateKeyInformation(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: RegEnumerateKeyInformation) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.obj)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.index)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.keyInformationClass)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.keyInformation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 32L, value.resultLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 40L, value.callContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 48L, value.objectContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 56L, value.reserved)
                }
            }

        public operator fun invoke(
            obj: MutPtr = MutPtr(0L),
            index: UInt = 0u,
            keyInformationClass: KeyInformationClass = 0,
            keyInformation: MutPtr = MutPtr(0L),
            length: UInt = 0u,
            resultLength: MutPtr = MutPtr(0L),
            callContext: MutPtr = MutPtr(0L),
            objectContext: MutPtr = MutPtr(0L),
            reserved: MutPtr = MutPtr(0L),
        ): RegEnumerateKeyInformation =
            RegEnumerateKeyInformation(
                objCtorArg = obj,
                index = index,
                keyInformationClass = keyInformationClass,
                keyInformationCtorArg = keyInformation,
                length = length,
                resultLengthCtorArg = resultLength,
                callContextCtorArg = callContext,
                objectContextCtorArg = objectContext,
                reservedCtorArg = reserved,
            )
    }
}

public class RegEnumerateValueKeyInformation internal constructor(
    objCtorArg: MutPtr,
    public var index: UInt,
    public var keyValueInformationClass: KeyValueInformationClass,
    keyValueInformationCtorArg: MutPtr,
    public var length: UInt,
    resultLengthCtorArg: MutPtr,
    callContextCtorArg: MutPtr,
    objectContextCtorArg: MutPtr,
    reservedCtorArg: MutPtr,
) {
    public var obj: MutPtr = objCtorArg
        internal set

    public var keyValueInformation: MutPtr = keyValueInformationCtorArg
        internal set

    public var resultLength: MutPtr = resultLengthCtorArg
        internal set

    public var callContext: MutPtr = callContextCtorArg
        internal set

    public var objectContext: MutPtr = objectContextCtorArg
        internal set

    public var reserved: MutPtr = reservedCtorArg
        internal set

    public constructor() : this(
        objCtorArg = MutPtr(0L),
        index = 0u,
        keyValueInformationClass = 0,
        keyValueInformationCtorArg = MutPtr(0L),
        length = 0u,
        resultLengthCtorArg = MutPtr(0L),
        callContextCtorArg = MutPtr(0L),
        objectContextCtorArg = MutPtr(0L),
        reservedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.obj

    public operator fun component2(): UInt = this.index

    public operator fun component3(): KeyValueInformationClass = this.keyValueInformationClass

    public operator fun component4(): MutPtr = this.keyValueInformation

    public operator fun component5(): UInt = this.length

    public operator fun component6(): MutPtr = this.resultLength

    public operator fun component7(): MutPtr = this.callContext

    public operator fun component8(): MutPtr = this.objectContext

    public operator fun component9(): MutPtr = this.reserved

    public fun copy(obj: MutPtr = this.obj, index: UInt = this.index, keyValueInformationClass: KeyValueInformationClass = this.keyValueInformationClass, keyValueInformation: MutPtr = this.keyValueInformation, length: UInt = this.length, resultLength: MutPtr = this.resultLength, callContext: MutPtr = this.callContext, objectContext: MutPtr = this.objectContext, reserved: MutPtr = this.reserved): RegEnumerateValueKeyInformation = RegEnumerateValueKeyInformation(objCtorArg = obj, index = index, keyValueInformationClass = keyValueInformationClass, keyValueInformationCtorArg = keyValueInformation, length = length, resultLengthCtorArg = resultLength, callContextCtorArg = callContext, objectContextCtorArg = objectContext, reservedCtorArg = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RegEnumerateValueKeyInformation) return false
        if (this.obj != other.obj) return false
        if (this.index != other.index) return false
        if (this.keyValueInformationClass != other.keyValueInformationClass) return false
        if (this.keyValueInformation != other.keyValueInformation) return false
        if (this.length != other.length) return false
        if (this.resultLength != other.resultLength) return false
        if (this.callContext != other.callContext) return false
        if (this.objectContext != other.objectContext) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.obj.hashCode()
        result = 31 * result + this.index.hashCode()
        result = 31 * result + this.keyValueInformationClass.hashCode()
        result = 31 * result + this.keyValueInformation.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.resultLength.hashCode()
        result = 31 * result + this.callContext.hashCode()
        result = 31 * result + this.objectContext.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegEnumerateValueKeyInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegEnumerateValueKeyInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): RegEnumerateValueKeyInformation =
                    RegEnumerateValueKeyInformation(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: RegEnumerateValueKeyInformation) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.obj)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.index)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.keyValueInformationClass)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.keyValueInformation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 32L, value.resultLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 40L, value.callContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 48L, value.objectContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 56L, value.reserved)
                }
            }

        public operator fun invoke(
            obj: MutPtr = MutPtr(0L),
            index: UInt = 0u,
            keyValueInformationClass: KeyValueInformationClass = 0,
            keyValueInformation: MutPtr = MutPtr(0L),
            length: UInt = 0u,
            resultLength: MutPtr = MutPtr(0L),
            callContext: MutPtr = MutPtr(0L),
            objectContext: MutPtr = MutPtr(0L),
            reserved: MutPtr = MutPtr(0L),
        ): RegEnumerateValueKeyInformation =
            RegEnumerateValueKeyInformation(
                objCtorArg = obj,
                index = index,
                keyValueInformationClass = keyValueInformationClass,
                keyValueInformationCtorArg = keyValueInformation,
                length = length,
                resultLengthCtorArg = resultLength,
                callContextCtorArg = callContext,
                objectContextCtorArg = objectContext,
                reservedCtorArg = reserved,
            )
    }
}

public class RegQueryKeyInformation internal constructor(
    objCtorArg: MutPtr,
    public var keyInformationClass: KeyInformationClass,
    keyInformationCtorArg: MutPtr,
    public var length: UInt,
    resultLengthCtorArg: MutPtr,
    callContextCtorArg: MutPtr,
    objectContextCtorArg: MutPtr,
    reservedCtorArg: MutPtr,
) {
    public var obj: MutPtr = objCtorArg
        internal set

    public var keyInformation: MutPtr = keyInformationCtorArg
        internal set

    public var resultLength: MutPtr = resultLengthCtorArg
        internal set

    public var callContext: MutPtr = callContextCtorArg
        internal set

    public var objectContext: MutPtr = objectContextCtorArg
        internal set

    public var reserved: MutPtr = reservedCtorArg
        internal set

    public constructor() : this(
        objCtorArg = MutPtr(0L),
        keyInformationClass = 0,
        keyInformationCtorArg = MutPtr(0L),
        length = 0u,
        resultLengthCtorArg = MutPtr(0L),
        callContextCtorArg = MutPtr(0L),
        objectContextCtorArg = MutPtr(0L),
        reservedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.obj

    public operator fun component2(): KeyInformationClass = this.keyInformationClass

    public operator fun component3(): MutPtr = this.keyInformation

    public operator fun component4(): UInt = this.length

    public operator fun component5(): MutPtr = this.resultLength

    public operator fun component6(): MutPtr = this.callContext

    public operator fun component7(): MutPtr = this.objectContext

    public operator fun component8(): MutPtr = this.reserved

    public fun copy(obj: MutPtr = this.obj, keyInformationClass: KeyInformationClass = this.keyInformationClass, keyInformation: MutPtr = this.keyInformation, length: UInt = this.length, resultLength: MutPtr = this.resultLength, callContext: MutPtr = this.callContext, objectContext: MutPtr = this.objectContext, reserved: MutPtr = this.reserved): RegQueryKeyInformation = RegQueryKeyInformation(objCtorArg = obj, keyInformationClass = keyInformationClass, keyInformationCtorArg = keyInformation, length = length, resultLengthCtorArg = resultLength, callContextCtorArg = callContext, objectContextCtorArg = objectContext, reservedCtorArg = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RegQueryKeyInformation) return false
        if (this.obj != other.obj) return false
        if (this.keyInformationClass != other.keyInformationClass) return false
        if (this.keyInformation != other.keyInformation) return false
        if (this.length != other.length) return false
        if (this.resultLength != other.resultLength) return false
        if (this.callContext != other.callContext) return false
        if (this.objectContext != other.objectContext) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.obj.hashCode()
        result = 31 * result + this.keyInformationClass.hashCode()
        result = 31 * result + this.keyInformation.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.resultLength.hashCode()
        result = 31 * result + this.callContext.hashCode()
        result = 31 * result + this.objectContext.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegQueryKeyInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegQueryKeyInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): RegQueryKeyInformation =
                    RegQueryKeyInformation(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: RegQueryKeyInformation) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.obj)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.keyInformationClass)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.keyInformation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 32L, value.resultLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 40L, value.callContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 48L, value.objectContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 56L, value.reserved)
                }
            }

        public operator fun invoke(
            obj: MutPtr = MutPtr(0L),
            keyInformationClass: KeyInformationClass = 0,
            keyInformation: MutPtr = MutPtr(0L),
            length: UInt = 0u,
            resultLength: MutPtr = MutPtr(0L),
            callContext: MutPtr = MutPtr(0L),
            objectContext: MutPtr = MutPtr(0L),
            reserved: MutPtr = MutPtr(0L),
        ): RegQueryKeyInformation =
            RegQueryKeyInformation(
                objCtorArg = obj,
                keyInformationClass = keyInformationClass,
                keyInformationCtorArg = keyInformation,
                length = length,
                resultLengthCtorArg = resultLength,
                callContextCtorArg = callContext,
                objectContextCtorArg = objectContext,
                reservedCtorArg = reserved,
            )
    }
}

public class RegQueryMultipleValueKeyInformation internal constructor(
    objCtorArg: MutPtr,
    valueEntriesCtorArg: MutPtr,
    public var entryCount: UInt,
    valueBufferCtorArg: MutPtr,
    bufferLengthCtorArg: MutPtr,
    requiredBufferLengthCtorArg: MutPtr,
    callContextCtorArg: MutPtr,
    objectContextCtorArg: MutPtr,
    reservedCtorArg: MutPtr,
) {
    public var obj: MutPtr = objCtorArg
        internal set

    public var valueEntries: MutPtr = valueEntriesCtorArg
        internal set

    public var valueBuffer: MutPtr = valueBufferCtorArg
        internal set

    public var bufferLength: MutPtr = bufferLengthCtorArg
        internal set

    public var requiredBufferLength: MutPtr = requiredBufferLengthCtorArg
        internal set

    public var callContext: MutPtr = callContextCtorArg
        internal set

    public var objectContext: MutPtr = objectContextCtorArg
        internal set

    public var reserved: MutPtr = reservedCtorArg
        internal set

    public constructor() : this(
        objCtorArg = MutPtr(0L),
        valueEntriesCtorArg = MutPtr(0L),
        entryCount = 0u,
        valueBufferCtorArg = MutPtr(0L),
        bufferLengthCtorArg = MutPtr(0L),
        requiredBufferLengthCtorArg = MutPtr(0L),
        callContextCtorArg = MutPtr(0L),
        objectContextCtorArg = MutPtr(0L),
        reservedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.obj

    public operator fun component2(): MutPtr = this.valueEntries

    public operator fun component3(): UInt = this.entryCount

    public operator fun component4(): MutPtr = this.valueBuffer

    public operator fun component5(): MutPtr = this.bufferLength

    public operator fun component6(): MutPtr = this.requiredBufferLength

    public operator fun component7(): MutPtr = this.callContext

    public operator fun component8(): MutPtr = this.objectContext

    public operator fun component9(): MutPtr = this.reserved

    public fun copy(obj: MutPtr = this.obj, valueEntries: MutPtr = this.valueEntries, entryCount: UInt = this.entryCount, valueBuffer: MutPtr = this.valueBuffer, bufferLength: MutPtr = this.bufferLength, requiredBufferLength: MutPtr = this.requiredBufferLength, callContext: MutPtr = this.callContext, objectContext: MutPtr = this.objectContext, reserved: MutPtr = this.reserved): RegQueryMultipleValueKeyInformation = RegQueryMultipleValueKeyInformation(objCtorArg = obj, valueEntriesCtorArg = valueEntries, entryCount = entryCount, valueBufferCtorArg = valueBuffer, bufferLengthCtorArg = bufferLength, requiredBufferLengthCtorArg = requiredBufferLength, callContextCtorArg = callContext, objectContextCtorArg = objectContext, reservedCtorArg = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RegQueryMultipleValueKeyInformation) return false
        if (this.obj != other.obj) return false
        if (this.valueEntries != other.valueEntries) return false
        if (this.entryCount != other.entryCount) return false
        if (this.valueBuffer != other.valueBuffer) return false
        if (this.bufferLength != other.bufferLength) return false
        if (this.requiredBufferLength != other.requiredBufferLength) return false
        if (this.callContext != other.callContext) return false
        if (this.objectContext != other.objectContext) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.obj.hashCode()
        result = 31 * result + this.valueEntries.hashCode()
        result = 31 * result + this.entryCount.hashCode()
        result = 31 * result + this.valueBuffer.hashCode()
        result = 31 * result + this.bufferLength.hashCode()
        result = 31 * result + this.requiredBufferLength.hashCode()
        result = 31 * result + this.callContext.hashCode()
        result = 31 * result + this.objectContext.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegQueryMultipleValueKeyInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegQueryMultipleValueKeyInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): RegQueryMultipleValueKeyInformation =
                    RegQueryMultipleValueKeyInformation(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 56L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 64L),
                    )
                override fun writeNative(addr: Long, value: RegQueryMultipleValueKeyInformation) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.obj)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.valueEntries)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.entryCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.valueBuffer)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 32L, value.bufferLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 40L, value.requiredBufferLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 48L, value.callContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 56L, value.objectContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 64L, value.reserved)
                }
            }

        public operator fun invoke(
            obj: MutPtr = MutPtr(0L),
            valueEntries: MutPtr = MutPtr(0L),
            entryCount: UInt = 0u,
            valueBuffer: MutPtr = MutPtr(0L),
            bufferLength: MutPtr = MutPtr(0L),
            requiredBufferLength: MutPtr = MutPtr(0L),
            callContext: MutPtr = MutPtr(0L),
            objectContext: MutPtr = MutPtr(0L),
            reserved: MutPtr = MutPtr(0L),
        ): RegQueryMultipleValueKeyInformation =
            RegQueryMultipleValueKeyInformation(
                objCtorArg = obj,
                valueEntriesCtorArg = valueEntries,
                entryCount = entryCount,
                valueBufferCtorArg = valueBuffer,
                bufferLengthCtorArg = bufferLength,
                requiredBufferLengthCtorArg = requiredBufferLength,
                callContextCtorArg = callContext,
                objectContextCtorArg = objectContext,
                reservedCtorArg = reserved,
            )
    }
}

public class RegQueryValueKeyInformation internal constructor(
    objCtorArg: MutPtr,
    valueNameCtorArg: MutPtr,
    public var keyValueInformationClass: KeyValueInformationClass,
    keyValueInformationCtorArg: MutPtr,
    public var length: UInt,
    resultLengthCtorArg: MutPtr,
    callContextCtorArg: MutPtr,
    objectContextCtorArg: MutPtr,
    reservedCtorArg: MutPtr,
) {
    public var obj: MutPtr = objCtorArg
        internal set

    public var valueName: MutPtr = valueNameCtorArg
        internal set

    public var keyValueInformation: MutPtr = keyValueInformationCtorArg
        internal set

    public var resultLength: MutPtr = resultLengthCtorArg
        internal set

    public var callContext: MutPtr = callContextCtorArg
        internal set

    public var objectContext: MutPtr = objectContextCtorArg
        internal set

    public var reserved: MutPtr = reservedCtorArg
        internal set

    public constructor() : this(
        objCtorArg = MutPtr(0L),
        valueNameCtorArg = MutPtr(0L),
        keyValueInformationClass = 0,
        keyValueInformationCtorArg = MutPtr(0L),
        length = 0u,
        resultLengthCtorArg = MutPtr(0L),
        callContextCtorArg = MutPtr(0L),
        objectContextCtorArg = MutPtr(0L),
        reservedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.obj

    public operator fun component2(): MutPtr = this.valueName

    public operator fun component3(): KeyValueInformationClass = this.keyValueInformationClass

    public operator fun component4(): MutPtr = this.keyValueInformation

    public operator fun component5(): UInt = this.length

    public operator fun component6(): MutPtr = this.resultLength

    public operator fun component7(): MutPtr = this.callContext

    public operator fun component8(): MutPtr = this.objectContext

    public operator fun component9(): MutPtr = this.reserved

    public fun copy(obj: MutPtr = this.obj, valueName: MutPtr = this.valueName, keyValueInformationClass: KeyValueInformationClass = this.keyValueInformationClass, keyValueInformation: MutPtr = this.keyValueInformation, length: UInt = this.length, resultLength: MutPtr = this.resultLength, callContext: MutPtr = this.callContext, objectContext: MutPtr = this.objectContext, reserved: MutPtr = this.reserved): RegQueryValueKeyInformation = RegQueryValueKeyInformation(objCtorArg = obj, valueNameCtorArg = valueName, keyValueInformationClass = keyValueInformationClass, keyValueInformationCtorArg = keyValueInformation, length = length, resultLengthCtorArg = resultLength, callContextCtorArg = callContext, objectContextCtorArg = objectContext, reservedCtorArg = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RegQueryValueKeyInformation) return false
        if (this.obj != other.obj) return false
        if (this.valueName != other.valueName) return false
        if (this.keyValueInformationClass != other.keyValueInformationClass) return false
        if (this.keyValueInformation != other.keyValueInformation) return false
        if (this.length != other.length) return false
        if (this.resultLength != other.resultLength) return false
        if (this.callContext != other.callContext) return false
        if (this.objectContext != other.objectContext) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.obj.hashCode()
        result = 31 * result + this.valueName.hashCode()
        result = 31 * result + this.keyValueInformationClass.hashCode()
        result = 31 * result + this.keyValueInformation.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.resultLength.hashCode()
        result = 31 * result + this.callContext.hashCode()
        result = 31 * result + this.objectContext.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegQueryValueKeyInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegQueryValueKeyInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): RegQueryValueKeyInformation =
                    RegQueryValueKeyInformation(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 56L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 64L),
                    )
                override fun writeNative(addr: Long, value: RegQueryValueKeyInformation) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.obj)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.valueName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.keyValueInformationClass)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.keyValueInformation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 40L, value.resultLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 48L, value.callContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 56L, value.objectContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 64L, value.reserved)
                }
            }

        public operator fun invoke(
            obj: MutPtr = MutPtr(0L),
            valueName: MutPtr = MutPtr(0L),
            keyValueInformationClass: KeyValueInformationClass = 0,
            keyValueInformation: MutPtr = MutPtr(0L),
            length: UInt = 0u,
            resultLength: MutPtr = MutPtr(0L),
            callContext: MutPtr = MutPtr(0L),
            objectContext: MutPtr = MutPtr(0L),
            reserved: MutPtr = MutPtr(0L),
        ): RegQueryValueKeyInformation =
            RegQueryValueKeyInformation(
                objCtorArg = obj,
                valueNameCtorArg = valueName,
                keyValueInformationClass = keyValueInformationClass,
                keyValueInformationCtorArg = keyValueInformation,
                length = length,
                resultLengthCtorArg = resultLength,
                callContextCtorArg = callContext,
                objectContextCtorArg = objectContext,
                reservedCtorArg = reserved,
            )
    }
}

public class RegSetInformationKeyInformation internal constructor(
    objCtorArg: MutPtr,
    public var keySetInformationClass: KeySetInformationClass,
    keySetInformationCtorArg: MutPtr,
    public var keySetInformationLength: UInt,
    callContextCtorArg: MutPtr,
    objectContextCtorArg: MutPtr,
    reservedCtorArg: MutPtr,
) {
    public var obj: MutPtr = objCtorArg
        internal set

    public var keySetInformation: MutPtr = keySetInformationCtorArg
        internal set

    public var callContext: MutPtr = callContextCtorArg
        internal set

    public var objectContext: MutPtr = objectContextCtorArg
        internal set

    public var reserved: MutPtr = reservedCtorArg
        internal set

    public constructor() : this(
        objCtorArg = MutPtr(0L),
        keySetInformationClass = 0,
        keySetInformationCtorArg = MutPtr(0L),
        keySetInformationLength = 0u,
        callContextCtorArg = MutPtr(0L),
        objectContextCtorArg = MutPtr(0L),
        reservedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.obj

    public operator fun component2(): KeySetInformationClass = this.keySetInformationClass

    public operator fun component3(): MutPtr = this.keySetInformation

    public operator fun component4(): UInt = this.keySetInformationLength

    public operator fun component5(): MutPtr = this.callContext

    public operator fun component6(): MutPtr = this.objectContext

    public operator fun component7(): MutPtr = this.reserved

    public fun copy(obj: MutPtr = this.obj, keySetInformationClass: KeySetInformationClass = this.keySetInformationClass, keySetInformation: MutPtr = this.keySetInformation, keySetInformationLength: UInt = this.keySetInformationLength, callContext: MutPtr = this.callContext, objectContext: MutPtr = this.objectContext, reserved: MutPtr = this.reserved): RegSetInformationKeyInformation = RegSetInformationKeyInformation(objCtorArg = obj, keySetInformationClass = keySetInformationClass, keySetInformationCtorArg = keySetInformation, keySetInformationLength = keySetInformationLength, callContextCtorArg = callContext, objectContextCtorArg = objectContext, reservedCtorArg = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RegSetInformationKeyInformation) return false
        if (this.obj != other.obj) return false
        if (this.keySetInformationClass != other.keySetInformationClass) return false
        if (this.keySetInformation != other.keySetInformation) return false
        if (this.keySetInformationLength != other.keySetInformationLength) return false
        if (this.callContext != other.callContext) return false
        if (this.objectContext != other.objectContext) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.obj.hashCode()
        result = 31 * result + this.keySetInformationClass.hashCode()
        result = 31 * result + this.keySetInformation.hashCode()
        result = 31 * result + this.keySetInformationLength.hashCode()
        result = 31 * result + this.callContext.hashCode()
        result = 31 * result + this.objectContext.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegSetInformationKeyInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegSetInformationKeyInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): RegSetInformationKeyInformation =
                    RegSetInformationKeyInformation(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: RegSetInformationKeyInformation) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.obj)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.keySetInformationClass)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.keySetInformation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.keySetInformationLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 32L, value.callContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 40L, value.objectContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 48L, value.reserved)
                }
            }

        public operator fun invoke(
            obj: MutPtr = MutPtr(0L),
            keySetInformationClass: KeySetInformationClass = 0,
            keySetInformation: MutPtr = MutPtr(0L),
            keySetInformationLength: UInt = 0u,
            callContext: MutPtr = MutPtr(0L),
            objectContext: MutPtr = MutPtr(0L),
            reserved: MutPtr = MutPtr(0L),
        ): RegSetInformationKeyInformation =
            RegSetInformationKeyInformation(
                objCtorArg = obj,
                keySetInformationClass = keySetInformationClass,
                keySetInformationCtorArg = keySetInformation,
                keySetInformationLength = keySetInformationLength,
                callContextCtorArg = callContext,
                objectContextCtorArg = objectContext,
                reservedCtorArg = reserved,
            )
    }
}
