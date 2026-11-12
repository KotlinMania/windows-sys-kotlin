package io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityDescriptor

public class HcsCreateOptions1 internal constructor(
    public var version: HcsCreateOptions,
    userTokenCtorArg: Handle,
    securityDescriptorCtorArg: MutPtr<SecurityDescriptor>,
    public var callbackOptions: HcsEventOptions,
    callbackContextCtorArg: MutPtr<CVoid>,
    public var callback: HcsEventCallback,
) {
    public var userToken: Handle = userTokenCtorArg
        internal set

    public var securityDescriptor: MutPtr<SecurityDescriptor> = securityDescriptorCtorArg
        internal set

    public var callbackContext: MutPtr<CVoid> = callbackContextCtorArg
        internal set

    public constructor() : this(
        version = 0,
        userTokenCtorArg = MutPtr(0L),
        securityDescriptorCtorArg = MutPtr(0L),
        callbackOptions = 0,
        callbackContextCtorArg = MutPtr(0L),
        callback = null,
    )

    public operator fun component1(): HcsCreateOptions = this.version

    public operator fun component2(): Handle = this.userToken

    public operator fun component3(): MutPtr<SecurityDescriptor> = this.securityDescriptor

    public operator fun component4(): HcsEventOptions = this.callbackOptions

    public operator fun component5(): MutPtr<CVoid> = this.callbackContext

    public operator fun component6(): HcsEventCallback = this.callback

    public fun copy(version: HcsCreateOptions = this.version, userToken: Handle = this.userToken, securityDescriptor: MutPtr<SecurityDescriptor> = this.securityDescriptor, callbackOptions: HcsEventOptions = this.callbackOptions, callbackContext: MutPtr<CVoid> = this.callbackContext, callback: HcsEventCallback = this.callback): HcsCreateOptions1 = HcsCreateOptions1(version = version, userTokenCtorArg = userToken, securityDescriptorCtorArg = securityDescriptor, callbackOptions = callbackOptions, callbackContextCtorArg = callbackContext, callback = callback)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HcsCreateOptions1) return false
        if (this.version != other.version) return false
        if (this.userToken != other.userToken) return false
        if (this.securityDescriptor != other.securityDescriptor) return false
        if (this.callbackOptions != other.callbackOptions) return false
        if (this.callbackContext != other.callbackContext) return false
        if (this.callback != other.callback) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.userToken.hashCode()
        result = 31 * result + this.securityDescriptor.hashCode()
        result = 31 * result + this.callbackOptions.hashCode()
        result = 31 * result + this.callbackContext.hashCode()
        result = 31 * result + this.callback.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: HcsCreateOptions = 0,
            userToken: Handle = MutPtr(0L),
            securityDescriptor: MutPtr<SecurityDescriptor> = MutPtr(0L),
            callbackOptions: HcsEventOptions = 0,
            callbackContext: MutPtr<CVoid> = MutPtr(0L),
            callback: HcsEventCallback = null,
        ): HcsCreateOptions1 =
            HcsCreateOptions1(
                version = version,
                userTokenCtorArg = userToken,
                securityDescriptorCtorArg = securityDescriptor,
                callbackOptions = callbackOptions,
                callbackContextCtorArg = callbackContext,
                callback = callback,
            )
    }
}

public class HcsEvent internal constructor(
    public var type: HcsEventType,
    eventDataCtorArg: Pcwstr,
    operationCtorArg: HcsOperation,
) {
    public var eventData: Pcwstr = eventDataCtorArg
        internal set

    public var operation: HcsOperation = operationCtorArg
        internal set

    public constructor() : this(
        type = 0,
        eventDataCtorArg = ConstPtr(0L),
        operationCtorArg = MutPtr(0L),
    )

    public operator fun component1(): HcsEventType = this.type

    public operator fun component2(): Pcwstr = this.eventData

    public operator fun component3(): HcsOperation = this.operation

    public fun copy(type: HcsEventType = this.type, eventData: Pcwstr = this.eventData, operation: HcsOperation = this.operation): HcsEvent = HcsEvent(type = type, eventDataCtorArg = eventData, operationCtorArg = operation)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HcsEvent) return false
        if (this.type != other.type) return false
        if (this.eventData != other.eventData) return false
        if (this.operation != other.operation) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.eventData.hashCode()
        result = 31 * result + this.operation.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            type: HcsEventType = 0,
            eventData: Pcwstr = ConstPtr(0L),
            operation: HcsOperation = MutPtr(0L),
        ): HcsEvent =
            HcsEvent(
                type = type,
                eventDataCtorArg = eventData,
                operationCtorArg = operation,
            )
    }
}

public class HcsProcessInformation internal constructor(
    public var processId: UInt,
    public var reserved: UInt,
    stdInputCtorArg: Handle,
    stdOutputCtorArg: Handle,
    stdErrorCtorArg: Handle,
) {
    public var stdInput: Handle = stdInputCtorArg
        internal set

    public var stdOutput: Handle = stdOutputCtorArg
        internal set

    public var stdError: Handle = stdErrorCtorArg
        internal set

    public constructor() : this(
        processId = 0u,
        reserved = 0u,
        stdInputCtorArg = MutPtr(0L),
        stdOutputCtorArg = MutPtr(0L),
        stdErrorCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.processId

    public operator fun component2(): UInt = this.reserved

    public operator fun component3(): Handle = this.stdInput

    public operator fun component4(): Handle = this.stdOutput

    public operator fun component5(): Handle = this.stdError

    public fun copy(processId: UInt = this.processId, reserved: UInt = this.reserved, stdInput: Handle = this.stdInput, stdOutput: Handle = this.stdOutput, stdError: Handle = this.stdError): HcsProcessInformation = HcsProcessInformation(processId = processId, reserved = reserved, stdInputCtorArg = stdInput, stdOutputCtorArg = stdOutput, stdErrorCtorArg = stdError)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HcsProcessInformation) return false
        if (this.processId != other.processId) return false
        if (this.reserved != other.reserved) return false
        if (this.stdInput != other.stdInput) return false
        if (this.stdOutput != other.stdOutput) return false
        if (this.stdError != other.stdError) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.processId.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.stdInput.hashCode()
        result = 31 * result + this.stdOutput.hashCode()
        result = 31 * result + this.stdError.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            processId: UInt = 0u,
            reserved: UInt = 0u,
            stdInput: Handle = MutPtr(0L),
            stdOutput: Handle = MutPtr(0L),
            stdError: Handle = MutPtr(0L),
        ): HcsProcessInformation =
            HcsProcessInformation(
                processId = processId,
                reserved = reserved,
                stdInputCtorArg = stdInput,
                stdOutputCtorArg = stdOutput,
                stdErrorCtorArg = stdError,
            )
    }
}
