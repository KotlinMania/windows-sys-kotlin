package io.github.kotlinmania.windowssys.windows.win32.devices.devicequery

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.devices.properties.Devproperty
import io.github.kotlinmania.windowssys.windows.win32.devices.properties.Devproptype
import io.github.kotlinmania.windowssys.windows.win32.foundation.Devpropkey

public data class DevpropFilterExpression(
    public var operator: DevpropOperator = 0u,
    public var property: Devproperty = Devproperty(),
)

public class DevObject internal constructor(
    public var objectType: DevObjectType,
    pszObjectIdCtorArg: Pcwstr,
    public var cPropertyCount: UInt,
    pPropertiesCtorArg: ConstPtr,
) {
    public var pszObjectId: Pcwstr = pszObjectIdCtorArg
        internal set

    public var pProperties: ConstPtr = pPropertiesCtorArg
        internal set

    public constructor() : this(
        objectType = 0,
        pszObjectIdCtorArg = ConstPtr(0L),
        cPropertyCount = 0u,
        pPropertiesCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): DevObjectType = this.objectType

    public operator fun component2(): Pcwstr = this.pszObjectId

    public operator fun component3(): UInt = this.cPropertyCount

    public operator fun component4(): ConstPtr = this.pProperties

    public fun copy(objectType: DevObjectType = this.objectType, pszObjectId: Pcwstr = this.pszObjectId, cPropertyCount: UInt = this.cPropertyCount, pProperties: ConstPtr = this.pProperties): DevObject = DevObject(objectType = objectType, pszObjectIdCtorArg = pszObjectId, cPropertyCount = cPropertyCount, pPropertiesCtorArg = pProperties)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DevObject) return false
        if (this.objectType != other.objectType) return false
        if (this.pszObjectId != other.pszObjectId) return false
        if (this.cPropertyCount != other.cPropertyCount) return false
        if (this.pProperties != other.pProperties) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.objectType.hashCode()
        result = 31 * result + this.pszObjectId.hashCode()
        result = 31 * result + this.cPropertyCount.hashCode()
        result = 31 * result + this.pProperties.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            objectType: DevObjectType = 0,
            pszObjectId: Pcwstr = ConstPtr(0L),
            cPropertyCount: UInt = 0u,
            pProperties: ConstPtr = ConstPtr(0L),
        ): DevObject =
            DevObject(
                objectType = objectType,
                pszObjectIdCtorArg = pszObjectId,
                cPropertyCount = cPropertyCount,
                pPropertiesCtorArg = pProperties,
            )
    }
}

public class DevQueryParameter internal constructor(
    public var key: Devpropkey,
    public var type: Devproptype,
    public var bufferSize: UInt,
    bufferCtorArg: MutPtr,
) {
    public var buffer: MutPtr = bufferCtorArg
        internal set

    public constructor() : this(
        key = Devpropkey(),
        type = 0u,
        bufferSize = 0u,
        bufferCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Devpropkey = this.key

    public operator fun component2(): Devproptype = this.type

    public operator fun component3(): UInt = this.bufferSize

    public operator fun component4(): MutPtr = this.buffer

    public fun copy(key: Devpropkey = this.key, type: Devproptype = this.type, bufferSize: UInt = this.bufferSize, buffer: MutPtr = this.buffer): DevQueryParameter = DevQueryParameter(key = key, type = type, bufferSize = bufferSize, bufferCtorArg = buffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DevQueryParameter) return false
        if (this.key != other.key) return false
        if (this.type != other.type) return false
        if (this.bufferSize != other.bufferSize) return false
        if (this.buffer != other.buffer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.key.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.bufferSize.hashCode()
        result = 31 * result + this.buffer.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            key: Devpropkey = Devpropkey(),
            type: Devproptype = 0u,
            bufferSize: UInt = 0u,
            buffer: MutPtr = MutPtr(0L),
        ): DevQueryParameter =
            DevQueryParameter(
                key = key,
                type = type,
                bufferSize = bufferSize,
                bufferCtorArg = buffer,
            )
    }
}

public data class DevQueryResultActionData(
    public var action: DevQueryResultAction = 0,
    public var data: DevQueryResultActionData0 = DevQueryResultActionData0(),
)

public data class DevQueryResultActionData0(
    public var state: DevQueryState = 0,
    public var deviceObject: DevObject = DevObject(),
)
