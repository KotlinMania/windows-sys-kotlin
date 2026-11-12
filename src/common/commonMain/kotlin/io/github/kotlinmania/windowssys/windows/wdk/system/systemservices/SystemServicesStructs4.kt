@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.systemservices

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DriverControl
import io.github.kotlinmania.windowssys.windows.wdk.foundation.FileObject
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Kdpc
import io.github.kotlinmania.windowssys.windows.wdk.foundation.ObjectNameInformation
import io.github.kotlinmania.windowssys.windows.wdk.foundation.RtlSplayLinks
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.WheaErrorSourceDescriptor
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.WheaErrorSourceType
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.WheaNotificationDescriptor
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.ListEntry

public class RegLoadKeyInformation internal constructor(
    objCtorArg: MutPtr<CVoid>,
    keyNameCtorArg: MutPtr<UnicodeString>,
    sourceFileCtorArg: MutPtr<UnicodeString>,
    public var flags: UInt,
    trustClassObjectCtorArg: MutPtr<CVoid>,
    userEventCtorArg: MutPtr<CVoid>,
    public var desiredAccess: UInt,
    rootHandleCtorArg: MutPtr<Handle>,
    callContextCtorArg: MutPtr<CVoid>,
    objectContextCtorArg: MutPtr<CVoid>,
    reservedCtorArg: MutPtr<CVoid>,
) {
    public var obj: MutPtr<CVoid> = objCtorArg
        internal set

    public var keyName: MutPtr<UnicodeString> = keyNameCtorArg
        internal set

    public var sourceFile: MutPtr<UnicodeString> = sourceFileCtorArg
        internal set

    public var trustClassObject: MutPtr<CVoid> = trustClassObjectCtorArg
        internal set

    public var userEvent: MutPtr<CVoid> = userEventCtorArg
        internal set

    public var rootHandle: MutPtr<Handle> = rootHandleCtorArg
        internal set

    public var callContext: MutPtr<CVoid> = callContextCtorArg
        internal set

    public var objectContext: MutPtr<CVoid> = objectContextCtorArg
        internal set

    public var reserved: MutPtr<CVoid> = reservedCtorArg
        internal set

    public constructor() : this(
        objCtorArg = MutPtr(0L),
        keyNameCtorArg = MutPtr(0L),
        sourceFileCtorArg = MutPtr(0L),
        flags = 0u,
        trustClassObjectCtorArg = MutPtr(0L),
        userEventCtorArg = MutPtr(0L),
        desiredAccess = 0u,
        rootHandleCtorArg = MutPtr(0L),
        callContextCtorArg = MutPtr(0L),
        objectContextCtorArg = MutPtr(0L),
        reservedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.obj

    public operator fun component2(): MutPtr<UnicodeString> = this.keyName

    public operator fun component3(): MutPtr<UnicodeString> = this.sourceFile

    public operator fun component4(): UInt = this.flags

    public operator fun component5(): MutPtr<CVoid> = this.trustClassObject

    public operator fun component6(): MutPtr<CVoid> = this.userEvent

    public operator fun component7(): UInt = this.desiredAccess

    public operator fun component8(): MutPtr<Handle> = this.rootHandle

    public operator fun component9(): MutPtr<CVoid> = this.callContext

    public operator fun component10(): MutPtr<CVoid> = this.objectContext

    public operator fun component11(): MutPtr<CVoid> = this.reserved

    public fun copy(obj: MutPtr<CVoid> = this.obj, keyName: MutPtr<UnicodeString> = this.keyName, sourceFile: MutPtr<UnicodeString> = this.sourceFile, flags: UInt = this.flags, trustClassObject: MutPtr<CVoid> = this.trustClassObject, userEvent: MutPtr<CVoid> = this.userEvent, desiredAccess: UInt = this.desiredAccess, rootHandle: MutPtr<Handle> = this.rootHandle, callContext: MutPtr<CVoid> = this.callContext, objectContext: MutPtr<CVoid> = this.objectContext, reserved: MutPtr<CVoid> = this.reserved): RegLoadKeyInformation = RegLoadKeyInformation(objCtorArg = obj, keyNameCtorArg = keyName, sourceFileCtorArg = sourceFile, flags = flags, trustClassObjectCtorArg = trustClassObject, userEventCtorArg = userEvent, desiredAccess = desiredAccess, rootHandleCtorArg = rootHandle, callContextCtorArg = callContext, objectContextCtorArg = objectContext, reservedCtorArg = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RegLoadKeyInformation) return false
        if (this.obj != other.obj) return false
        if (this.keyName != other.keyName) return false
        if (this.sourceFile != other.sourceFile) return false
        if (this.flags != other.flags) return false
        if (this.trustClassObject != other.trustClassObject) return false
        if (this.userEvent != other.userEvent) return false
        if (this.desiredAccess != other.desiredAccess) return false
        if (this.rootHandle != other.rootHandle) return false
        if (this.callContext != other.callContext) return false
        if (this.objectContext != other.objectContext) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.obj.hashCode()
        result = 31 * result + this.keyName.hashCode()
        result = 31 * result + this.sourceFile.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.trustClassObject.hashCode()
        result = 31 * result + this.userEvent.hashCode()
        result = 31 * result + this.desiredAccess.hashCode()
        result = 31 * result + this.rootHandle.hashCode()
        result = 31 * result + this.callContext.hashCode()
        result = 31 * result + this.objectContext.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegLoadKeyInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegLoadKeyInformation> {
                override val sizeBytes: Long = 88L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): RegLoadKeyInformation =
                    RegLoadKeyInformation(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UnicodeString>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UnicodeString>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Handle>(64)
                        ).readNative(addr + 56L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 64L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 72L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 80L),
                    )
                override fun writeNative(addr: Long, value: RegLoadKeyInformation) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.obj)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UnicodeString>(64)
                    ).writeNative(addr + 8L, value.keyName)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UnicodeString>(64)
                    ).writeNative(addr + 16L, value.sourceFile)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.flags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 32L, value.trustClassObject)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 40L, value.userEvent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.desiredAccess)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Handle>(64)
                    ).writeNative(addr + 56L, value.rootHandle)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 64L, value.callContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 72L, value.objectContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 80L, value.reserved)
                }
            }

        public operator fun invoke(
            obj: MutPtr<CVoid> = MutPtr(0L),
            keyName: MutPtr<UnicodeString> = MutPtr(0L),
            sourceFile: MutPtr<UnicodeString> = MutPtr(0L),
            flags: UInt = 0u,
            trustClassObject: MutPtr<CVoid> = MutPtr(0L),
            userEvent: MutPtr<CVoid> = MutPtr(0L),
            desiredAccess: UInt = 0u,
            rootHandle: MutPtr<Handle> = MutPtr(0L),
            callContext: MutPtr<CVoid> = MutPtr(0L),
            objectContext: MutPtr<CVoid> = MutPtr(0L),
            reserved: MutPtr<CVoid> = MutPtr(0L),
        ): RegLoadKeyInformation =
            RegLoadKeyInformation(
                objCtorArg = obj,
                keyNameCtorArg = keyName,
                sourceFileCtorArg = sourceFile,
                flags = flags,
                trustClassObjectCtorArg = trustClassObject,
                userEventCtorArg = userEvent,
                desiredAccess = desiredAccess,
                rootHandleCtorArg = rootHandle,
                callContextCtorArg = callContext,
                objectContextCtorArg = objectContext,
                reservedCtorArg = reserved,
            )
    }
}

public class RegLoadKeyInformationV2 internal constructor(
    objCtorArg: MutPtr<CVoid>,
    keyNameCtorArg: MutPtr<UnicodeString>,
    sourceFileCtorArg: MutPtr<UnicodeString>,
    public var flags: UInt,
    trustClassObjectCtorArg: MutPtr<CVoid>,
    userEventCtorArg: MutPtr<CVoid>,
    public var desiredAccess: UInt,
    rootHandleCtorArg: MutPtr<Handle>,
    callContextCtorArg: MutPtr<CVoid>,
    objectContextCtorArg: MutPtr<CVoid>,
    public var version: Int,
    fileAccessTokenCtorArg: MutPtr<CVoid>,
) {
    public var obj: MutPtr<CVoid> = objCtorArg
        internal set

    public var keyName: MutPtr<UnicodeString> = keyNameCtorArg
        internal set

    public var sourceFile: MutPtr<UnicodeString> = sourceFileCtorArg
        internal set

    public var trustClassObject: MutPtr<CVoid> = trustClassObjectCtorArg
        internal set

    public var userEvent: MutPtr<CVoid> = userEventCtorArg
        internal set

    public var rootHandle: MutPtr<Handle> = rootHandleCtorArg
        internal set

    public var callContext: MutPtr<CVoid> = callContextCtorArg
        internal set

    public var objectContext: MutPtr<CVoid> = objectContextCtorArg
        internal set

    public var fileAccessToken: MutPtr<CVoid> = fileAccessTokenCtorArg
        internal set

    public constructor() : this(
        objCtorArg = MutPtr(0L),
        keyNameCtorArg = MutPtr(0L),
        sourceFileCtorArg = MutPtr(0L),
        flags = 0u,
        trustClassObjectCtorArg = MutPtr(0L),
        userEventCtorArg = MutPtr(0L),
        desiredAccess = 0u,
        rootHandleCtorArg = MutPtr(0L),
        callContextCtorArg = MutPtr(0L),
        objectContextCtorArg = MutPtr(0L),
        version = 0,
        fileAccessTokenCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.obj

    public operator fun component2(): MutPtr<UnicodeString> = this.keyName

    public operator fun component3(): MutPtr<UnicodeString> = this.sourceFile

    public operator fun component4(): UInt = this.flags

    public operator fun component5(): MutPtr<CVoid> = this.trustClassObject

    public operator fun component6(): MutPtr<CVoid> = this.userEvent

    public operator fun component7(): UInt = this.desiredAccess

    public operator fun component8(): MutPtr<Handle> = this.rootHandle

    public operator fun component9(): MutPtr<CVoid> = this.callContext

    public operator fun component10(): MutPtr<CVoid> = this.objectContext

    public operator fun component11(): Int = this.version

    public operator fun component12(): MutPtr<CVoid> = this.fileAccessToken

    public fun copy(obj: MutPtr<CVoid> = this.obj, keyName: MutPtr<UnicodeString> = this.keyName, sourceFile: MutPtr<UnicodeString> = this.sourceFile, flags: UInt = this.flags, trustClassObject: MutPtr<CVoid> = this.trustClassObject, userEvent: MutPtr<CVoid> = this.userEvent, desiredAccess: UInt = this.desiredAccess, rootHandle: MutPtr<Handle> = this.rootHandle, callContext: MutPtr<CVoid> = this.callContext, objectContext: MutPtr<CVoid> = this.objectContext, version: Int = this.version, fileAccessToken: MutPtr<CVoid> = this.fileAccessToken): RegLoadKeyInformationV2 = RegLoadKeyInformationV2(objCtorArg = obj, keyNameCtorArg = keyName, sourceFileCtorArg = sourceFile, flags = flags, trustClassObjectCtorArg = trustClassObject, userEventCtorArg = userEvent, desiredAccess = desiredAccess, rootHandleCtorArg = rootHandle, callContextCtorArg = callContext, objectContextCtorArg = objectContext, version = version, fileAccessTokenCtorArg = fileAccessToken)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RegLoadKeyInformationV2) return false
        if (this.obj != other.obj) return false
        if (this.keyName != other.keyName) return false
        if (this.sourceFile != other.sourceFile) return false
        if (this.flags != other.flags) return false
        if (this.trustClassObject != other.trustClassObject) return false
        if (this.userEvent != other.userEvent) return false
        if (this.desiredAccess != other.desiredAccess) return false
        if (this.rootHandle != other.rootHandle) return false
        if (this.callContext != other.callContext) return false
        if (this.objectContext != other.objectContext) return false
        if (this.version != other.version) return false
        if (this.fileAccessToken != other.fileAccessToken) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.obj.hashCode()
        result = 31 * result + this.keyName.hashCode()
        result = 31 * result + this.sourceFile.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.trustClassObject.hashCode()
        result = 31 * result + this.userEvent.hashCode()
        result = 31 * result + this.desiredAccess.hashCode()
        result = 31 * result + this.rootHandle.hashCode()
        result = 31 * result + this.callContext.hashCode()
        result = 31 * result + this.objectContext.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.fileAccessToken.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegLoadKeyInformationV2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegLoadKeyInformationV2> {
                override val sizeBytes: Long = 96L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): RegLoadKeyInformationV2 =
                    RegLoadKeyInformationV2(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UnicodeString>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UnicodeString>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Handle>(64)
                        ).readNative(addr + 56L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 64L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 80L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 88L),
                    )
                override fun writeNative(addr: Long, value: RegLoadKeyInformationV2) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.obj)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UnicodeString>(64)
                    ).writeNative(addr + 8L, value.keyName)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UnicodeString>(64)
                    ).writeNative(addr + 16L, value.sourceFile)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.flags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 32L, value.trustClassObject)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 40L, value.userEvent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.desiredAccess)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Handle>(64)
                    ).writeNative(addr + 56L, value.rootHandle)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 64L, value.callContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 72L, value.objectContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 80L, value.version)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 88L, value.fileAccessToken)
                }
            }

        public operator fun invoke(
            obj: MutPtr<CVoid> = MutPtr(0L),
            keyName: MutPtr<UnicodeString> = MutPtr(0L),
            sourceFile: MutPtr<UnicodeString> = MutPtr(0L),
            flags: UInt = 0u,
            trustClassObject: MutPtr<CVoid> = MutPtr(0L),
            userEvent: MutPtr<CVoid> = MutPtr(0L),
            desiredAccess: UInt = 0u,
            rootHandle: MutPtr<Handle> = MutPtr(0L),
            callContext: MutPtr<CVoid> = MutPtr(0L),
            objectContext: MutPtr<CVoid> = MutPtr(0L),
            version: Int = 0,
            fileAccessToken: MutPtr<CVoid> = MutPtr(0L),
        ): RegLoadKeyInformationV2 =
            RegLoadKeyInformationV2(
                objCtorArg = obj,
                keyNameCtorArg = keyName,
                sourceFileCtorArg = sourceFile,
                flags = flags,
                trustClassObjectCtorArg = trustClassObject,
                userEventCtorArg = userEvent,
                desiredAccess = desiredAccess,
                rootHandleCtorArg = rootHandle,
                callContextCtorArg = callContext,
                objectContextCtorArg = objectContext,
                version = version,
                fileAccessTokenCtorArg = fileAccessToken,
            )
    }
}

public class RegPostCreateKeyInformation internal constructor(
    completeNameCtorArg: MutPtr<UnicodeString>,
    objCtorArg: MutPtr<CVoid>,
    public var status: Ntstatus,
) {
    public var completeName: MutPtr<UnicodeString> = completeNameCtorArg
        internal set

    public var obj: MutPtr<CVoid> = objCtorArg
        internal set

    public constructor() : this(
        completeNameCtorArg = MutPtr(0L),
        objCtorArg = MutPtr(0L),
        status = 0,
    )

    public operator fun component1(): MutPtr<UnicodeString> = this.completeName

    public operator fun component2(): MutPtr<CVoid> = this.obj

    public operator fun component3(): Ntstatus = this.status

    public fun copy(completeName: MutPtr<UnicodeString> = this.completeName, obj: MutPtr<CVoid> = this.obj, status: Ntstatus = this.status): RegPostCreateKeyInformation = RegPostCreateKeyInformation(completeNameCtorArg = completeName, objCtorArg = obj, status = status)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RegPostCreateKeyInformation) return false
        if (this.completeName != other.completeName) return false
        if (this.obj != other.obj) return false
        if (this.status != other.status) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.completeName.hashCode()
        result = 31 * result + this.obj.hashCode()
        result = 31 * result + this.status.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            completeName: MutPtr<UnicodeString> = MutPtr(0L),
            obj: MutPtr<CVoid> = MutPtr(0L),
            status: Ntstatus = 0,
        ): RegPostCreateKeyInformation =
            RegPostCreateKeyInformation(
                completeNameCtorArg = completeName,
                objCtorArg = obj,
                status = status,
            )
    }
}

public class RegPostOperationInformation internal constructor(
    objCtorArg: MutPtr<CVoid>,
    public var status: Ntstatus,
    preInformationCtorArg: MutPtr<CVoid>,
    public var returnStatus: Ntstatus,
    callContextCtorArg: MutPtr<CVoid>,
    objectContextCtorArg: MutPtr<CVoid>,
    reservedCtorArg: MutPtr<CVoid>,
) {
    public var obj: MutPtr<CVoid> = objCtorArg
        internal set

    public var preInformation: MutPtr<CVoid> = preInformationCtorArg
        internal set

    public var callContext: MutPtr<CVoid> = callContextCtorArg
        internal set

    public var objectContext: MutPtr<CVoid> = objectContextCtorArg
        internal set

    public var reserved: MutPtr<CVoid> = reservedCtorArg
        internal set

    public constructor() : this(
        objCtorArg = MutPtr(0L),
        status = 0,
        preInformationCtorArg = MutPtr(0L),
        returnStatus = 0,
        callContextCtorArg = MutPtr(0L),
        objectContextCtorArg = MutPtr(0L),
        reservedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.obj

    public operator fun component2(): Ntstatus = this.status

    public operator fun component3(): MutPtr<CVoid> = this.preInformation

    public operator fun component4(): Ntstatus = this.returnStatus

    public operator fun component5(): MutPtr<CVoid> = this.callContext

    public operator fun component6(): MutPtr<CVoid> = this.objectContext

    public operator fun component7(): MutPtr<CVoid> = this.reserved

    public fun copy(obj: MutPtr<CVoid> = this.obj, status: Ntstatus = this.status, preInformation: MutPtr<CVoid> = this.preInformation, returnStatus: Ntstatus = this.returnStatus, callContext: MutPtr<CVoid> = this.callContext, objectContext: MutPtr<CVoid> = this.objectContext, reserved: MutPtr<CVoid> = this.reserved): RegPostOperationInformation = RegPostOperationInformation(objCtorArg = obj, status = status, preInformationCtorArg = preInformation, returnStatus = returnStatus, callContextCtorArg = callContext, objectContextCtorArg = objectContext, reservedCtorArg = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RegPostOperationInformation) return false
        if (this.obj != other.obj) return false
        if (this.status != other.status) return false
        if (this.preInformation != other.preInformation) return false
        if (this.returnStatus != other.returnStatus) return false
        if (this.callContext != other.callContext) return false
        if (this.objectContext != other.objectContext) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.obj.hashCode()
        result = 31 * result + this.status.hashCode()
        result = 31 * result + this.preInformation.hashCode()
        result = 31 * result + this.returnStatus.hashCode()
        result = 31 * result + this.callContext.hashCode()
        result = 31 * result + this.objectContext.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            obj: MutPtr<CVoid> = MutPtr(0L),
            status: Ntstatus = 0,
            preInformation: MutPtr<CVoid> = MutPtr(0L),
            returnStatus: Ntstatus = 0,
            callContext: MutPtr<CVoid> = MutPtr(0L),
            objectContext: MutPtr<CVoid> = MutPtr(0L),
            reserved: MutPtr<CVoid> = MutPtr(0L),
        ): RegPostOperationInformation =
            RegPostOperationInformation(
                objCtorArg = obj,
                status = status,
                preInformationCtorArg = preInformation,
                returnStatus = returnStatus,
                callContextCtorArg = callContext,
                objectContextCtorArg = objectContext,
                reservedCtorArg = reserved,
            )
    }
}

public class RegPreCreateKeyInformation internal constructor(
    completeNameCtorArg: MutPtr<UnicodeString>,
) {
    public var completeName: MutPtr<UnicodeString> = completeNameCtorArg
        internal set

    public constructor() : this(
        completeNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<UnicodeString> = this.completeName

    public fun copy(completeName: MutPtr<UnicodeString> = this.completeName): RegPreCreateKeyInformation = RegPreCreateKeyInformation(completeNameCtorArg = completeName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RegPreCreateKeyInformation) return false
        if (this.completeName != other.completeName) return false
        return true
    }

    override fun hashCode(): Int = this.completeName.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegPreCreateKeyInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegPreCreateKeyInformation> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): RegPreCreateKeyInformation =
                    RegPreCreateKeyInformation(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UnicodeString>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: RegPreCreateKeyInformation) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UnicodeString>(64)
                    ).writeNative(addr, value.completeName)
                }
            }

        public operator fun invoke(
            completeName: MutPtr<UnicodeString> = MutPtr(0L),
        ): RegPreCreateKeyInformation =
            RegPreCreateKeyInformation(
                completeNameCtorArg = completeName,
            )
    }
}

public class RegQueryKeyName internal constructor(
    objCtorArg: MutPtr<CVoid>,
    objectNameInfoCtorArg: MutPtr<ObjectNameInformation>,
    public var length: UInt,
    returnLengthCtorArg: MutPtr<UInt>,
    callContextCtorArg: MutPtr<CVoid>,
    objectContextCtorArg: MutPtr<CVoid>,
    reservedCtorArg: MutPtr<CVoid>,
) {
    public var obj: MutPtr<CVoid> = objCtorArg
        internal set

    public var objectNameInfo: MutPtr<ObjectNameInformation> = objectNameInfoCtorArg
        internal set

    public var returnLength: MutPtr<UInt> = returnLengthCtorArg
        internal set

    public var callContext: MutPtr<CVoid> = callContextCtorArg
        internal set

    public var objectContext: MutPtr<CVoid> = objectContextCtorArg
        internal set

    public var reserved: MutPtr<CVoid> = reservedCtorArg
        internal set

    public constructor() : this(
        objCtorArg = MutPtr(0L),
        objectNameInfoCtorArg = MutPtr(0L),
        length = 0u,
        returnLengthCtorArg = MutPtr(0L),
        callContextCtorArg = MutPtr(0L),
        objectContextCtorArg = MutPtr(0L),
        reservedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.obj

    public operator fun component2(): MutPtr<ObjectNameInformation> = this.objectNameInfo

    public operator fun component3(): UInt = this.length

    public operator fun component4(): MutPtr<UInt> = this.returnLength

    public operator fun component5(): MutPtr<CVoid> = this.callContext

    public operator fun component6(): MutPtr<CVoid> = this.objectContext

    public operator fun component7(): MutPtr<CVoid> = this.reserved

    public fun copy(obj: MutPtr<CVoid> = this.obj, objectNameInfo: MutPtr<ObjectNameInformation> = this.objectNameInfo, length: UInt = this.length, returnLength: MutPtr<UInt> = this.returnLength, callContext: MutPtr<CVoid> = this.callContext, objectContext: MutPtr<CVoid> = this.objectContext, reserved: MutPtr<CVoid> = this.reserved): RegQueryKeyName = RegQueryKeyName(objCtorArg = obj, objectNameInfoCtorArg = objectNameInfo, length = length, returnLengthCtorArg = returnLength, callContextCtorArg = callContext, objectContextCtorArg = objectContext, reservedCtorArg = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RegQueryKeyName) return false
        if (this.obj != other.obj) return false
        if (this.objectNameInfo != other.objectNameInfo) return false
        if (this.length != other.length) return false
        if (this.returnLength != other.returnLength) return false
        if (this.callContext != other.callContext) return false
        if (this.objectContext != other.objectContext) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.obj.hashCode()
        result = 31 * result + this.objectNameInfo.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.returnLength.hashCode()
        result = 31 * result + this.callContext.hashCode()
        result = 31 * result + this.objectContext.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegQueryKeyName> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegQueryKeyName> {
                override val sizeBytes: Long = 56L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): RegQueryKeyName =
                    RegQueryKeyName(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<ObjectNameInformation>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UInt>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: RegQueryKeyName) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.obj)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<ObjectNameInformation>(64)
                    ).writeNative(addr + 8L, value.objectNameInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UInt>(64)
                    ).writeNative(addr + 24L, value.returnLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 32L, value.callContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 40L, value.objectContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 48L, value.reserved)
                }
            }

        public operator fun invoke(
            obj: MutPtr<CVoid> = MutPtr(0L),
            objectNameInfo: MutPtr<ObjectNameInformation> = MutPtr(0L),
            length: UInt = 0u,
            returnLength: MutPtr<UInt> = MutPtr(0L),
            callContext: MutPtr<CVoid> = MutPtr(0L),
            objectContext: MutPtr<CVoid> = MutPtr(0L),
            reserved: MutPtr<CVoid> = MutPtr(0L),
        ): RegQueryKeyName =
            RegQueryKeyName(
                objCtorArg = obj,
                objectNameInfoCtorArg = objectNameInfo,
                length = length,
                returnLengthCtorArg = returnLength,
                callContextCtorArg = callContext,
                objectContextCtorArg = objectContext,
                reservedCtorArg = reserved,
            )
    }
}

public class RegQueryKeySecurityInformation internal constructor(
    objCtorArg: MutPtr<CVoid>,
    securityInformationCtorArg: MutPtr<UInt>,
    securityDescriptorCtorArg: PsecurityDescriptor,
    lengthCtorArg: MutPtr<UInt>,
    callContextCtorArg: MutPtr<CVoid>,
    objectContextCtorArg: MutPtr<CVoid>,
    reservedCtorArg: MutPtr<CVoid>,
) {
    public var obj: MutPtr<CVoid> = objCtorArg
        internal set

    public var securityInformation: MutPtr<UInt> = securityInformationCtorArg
        internal set

    public var securityDescriptor: PsecurityDescriptor = securityDescriptorCtorArg
        internal set

    public var length: MutPtr<UInt> = lengthCtorArg
        internal set

    public var callContext: MutPtr<CVoid> = callContextCtorArg
        internal set

    public var objectContext: MutPtr<CVoid> = objectContextCtorArg
        internal set

    public var reserved: MutPtr<CVoid> = reservedCtorArg
        internal set

    public constructor() : this(
        objCtorArg = MutPtr(0L),
        securityInformationCtorArg = MutPtr(0L),
        securityDescriptorCtorArg = MutPtr(0L),
        lengthCtorArg = MutPtr(0L),
        callContextCtorArg = MutPtr(0L),
        objectContextCtorArg = MutPtr(0L),
        reservedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.obj

    public operator fun component2(): MutPtr<UInt> = this.securityInformation

    public operator fun component3(): PsecurityDescriptor = this.securityDescriptor

    public operator fun component4(): MutPtr<UInt> = this.length

    public operator fun component5(): MutPtr<CVoid> = this.callContext

    public operator fun component6(): MutPtr<CVoid> = this.objectContext

    public operator fun component7(): MutPtr<CVoid> = this.reserved

    public fun copy(obj: MutPtr<CVoid> = this.obj, securityInformation: MutPtr<UInt> = this.securityInformation, securityDescriptor: PsecurityDescriptor = this.securityDescriptor, length: MutPtr<UInt> = this.length, callContext: MutPtr<CVoid> = this.callContext, objectContext: MutPtr<CVoid> = this.objectContext, reserved: MutPtr<CVoid> = this.reserved): RegQueryKeySecurityInformation = RegQueryKeySecurityInformation(objCtorArg = obj, securityInformationCtorArg = securityInformation, securityDescriptorCtorArg = securityDescriptor, lengthCtorArg = length, callContextCtorArg = callContext, objectContextCtorArg = objectContext, reservedCtorArg = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RegQueryKeySecurityInformation) return false
        if (this.obj != other.obj) return false
        if (this.securityInformation != other.securityInformation) return false
        if (this.securityDescriptor != other.securityDescriptor) return false
        if (this.length != other.length) return false
        if (this.callContext != other.callContext) return false
        if (this.objectContext != other.objectContext) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.obj.hashCode()
        result = 31 * result + this.securityInformation.hashCode()
        result = 31 * result + this.securityDescriptor.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.callContext.hashCode()
        result = 31 * result + this.objectContext.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            obj: MutPtr<CVoid> = MutPtr(0L),
            securityInformation: MutPtr<UInt> = MutPtr(0L),
            securityDescriptor: PsecurityDescriptor = MutPtr(0L),
            length: MutPtr<UInt> = MutPtr(0L),
            callContext: MutPtr<CVoid> = MutPtr(0L),
            objectContext: MutPtr<CVoid> = MutPtr(0L),
            reserved: MutPtr<CVoid> = MutPtr(0L),
        ): RegQueryKeySecurityInformation =
            RegQueryKeySecurityInformation(
                objCtorArg = obj,
                securityInformationCtorArg = securityInformation,
                securityDescriptorCtorArg = securityDescriptor,
                lengthCtorArg = length,
                callContextCtorArg = callContext,
                objectContextCtorArg = objectContext,
                reservedCtorArg = reserved,
            )
    }
}

public class RegRenameKeyInformation internal constructor(
    objCtorArg: MutPtr<CVoid>,
    newNameCtorArg: MutPtr<UnicodeString>,
    callContextCtorArg: MutPtr<CVoid>,
    objectContextCtorArg: MutPtr<CVoid>,
    reservedCtorArg: MutPtr<CVoid>,
) {
    public var obj: MutPtr<CVoid> = objCtorArg
        internal set

    public var newName: MutPtr<UnicodeString> = newNameCtorArg
        internal set

    public var callContext: MutPtr<CVoid> = callContextCtorArg
        internal set

    public var objectContext: MutPtr<CVoid> = objectContextCtorArg
        internal set

    public var reserved: MutPtr<CVoid> = reservedCtorArg
        internal set

    public constructor() : this(
        objCtorArg = MutPtr(0L),
        newNameCtorArg = MutPtr(0L),
        callContextCtorArg = MutPtr(0L),
        objectContextCtorArg = MutPtr(0L),
        reservedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.obj

    public operator fun component2(): MutPtr<UnicodeString> = this.newName

    public operator fun component3(): MutPtr<CVoid> = this.callContext

    public operator fun component4(): MutPtr<CVoid> = this.objectContext

    public operator fun component5(): MutPtr<CVoid> = this.reserved

    public fun copy(obj: MutPtr<CVoid> = this.obj, newName: MutPtr<UnicodeString> = this.newName, callContext: MutPtr<CVoid> = this.callContext, objectContext: MutPtr<CVoid> = this.objectContext, reserved: MutPtr<CVoid> = this.reserved): RegRenameKeyInformation = RegRenameKeyInformation(objCtorArg = obj, newNameCtorArg = newName, callContextCtorArg = callContext, objectContextCtorArg = objectContext, reservedCtorArg = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RegRenameKeyInformation) return false
        if (this.obj != other.obj) return false
        if (this.newName != other.newName) return false
        if (this.callContext != other.callContext) return false
        if (this.objectContext != other.objectContext) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.obj.hashCode()
        result = 31 * result + this.newName.hashCode()
        result = 31 * result + this.callContext.hashCode()
        result = 31 * result + this.objectContext.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegRenameKeyInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegRenameKeyInformation> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): RegRenameKeyInformation =
                    RegRenameKeyInformation(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UnicodeString>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: RegRenameKeyInformation) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.obj)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UnicodeString>(64)
                    ).writeNative(addr + 8L, value.newName)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.callContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.objectContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 32L, value.reserved)
                }
            }

        public operator fun invoke(
            obj: MutPtr<CVoid> = MutPtr(0L),
            newName: MutPtr<UnicodeString> = MutPtr(0L),
            callContext: MutPtr<CVoid> = MutPtr(0L),
            objectContext: MutPtr<CVoid> = MutPtr(0L),
            reserved: MutPtr<CVoid> = MutPtr(0L),
        ): RegRenameKeyInformation =
            RegRenameKeyInformation(
                objCtorArg = obj,
                newNameCtorArg = newName,
                callContextCtorArg = callContext,
                objectContextCtorArg = objectContext,
                reservedCtorArg = reserved,
            )
    }
}

public class RegReplaceKeyInformation internal constructor(
    objCtorArg: MutPtr<CVoid>,
    oldFileNameCtorArg: MutPtr<UnicodeString>,
    newFileNameCtorArg: MutPtr<UnicodeString>,
    callContextCtorArg: MutPtr<CVoid>,
    objectContextCtorArg: MutPtr<CVoid>,
    reservedCtorArg: MutPtr<CVoid>,
) {
    public var obj: MutPtr<CVoid> = objCtorArg
        internal set

    public var oldFileName: MutPtr<UnicodeString> = oldFileNameCtorArg
        internal set

    public var newFileName: MutPtr<UnicodeString> = newFileNameCtorArg
        internal set

    public var callContext: MutPtr<CVoid> = callContextCtorArg
        internal set

    public var objectContext: MutPtr<CVoid> = objectContextCtorArg
        internal set

    public var reserved: MutPtr<CVoid> = reservedCtorArg
        internal set

    public constructor() : this(
        objCtorArg = MutPtr(0L),
        oldFileNameCtorArg = MutPtr(0L),
        newFileNameCtorArg = MutPtr(0L),
        callContextCtorArg = MutPtr(0L),
        objectContextCtorArg = MutPtr(0L),
        reservedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.obj

    public operator fun component2(): MutPtr<UnicodeString> = this.oldFileName

    public operator fun component3(): MutPtr<UnicodeString> = this.newFileName

    public operator fun component4(): MutPtr<CVoid> = this.callContext

    public operator fun component5(): MutPtr<CVoid> = this.objectContext

    public operator fun component6(): MutPtr<CVoid> = this.reserved

    public fun copy(obj: MutPtr<CVoid> = this.obj, oldFileName: MutPtr<UnicodeString> = this.oldFileName, newFileName: MutPtr<UnicodeString> = this.newFileName, callContext: MutPtr<CVoid> = this.callContext, objectContext: MutPtr<CVoid> = this.objectContext, reserved: MutPtr<CVoid> = this.reserved): RegReplaceKeyInformation = RegReplaceKeyInformation(objCtorArg = obj, oldFileNameCtorArg = oldFileName, newFileNameCtorArg = newFileName, callContextCtorArg = callContext, objectContextCtorArg = objectContext, reservedCtorArg = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RegReplaceKeyInformation) return false
        if (this.obj != other.obj) return false
        if (this.oldFileName != other.oldFileName) return false
        if (this.newFileName != other.newFileName) return false
        if (this.callContext != other.callContext) return false
        if (this.objectContext != other.objectContext) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.obj.hashCode()
        result = 31 * result + this.oldFileName.hashCode()
        result = 31 * result + this.newFileName.hashCode()
        result = 31 * result + this.callContext.hashCode()
        result = 31 * result + this.objectContext.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegReplaceKeyInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegReplaceKeyInformation> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): RegReplaceKeyInformation =
                    RegReplaceKeyInformation(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UnicodeString>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UnicodeString>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: RegReplaceKeyInformation) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.obj)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UnicodeString>(64)
                    ).writeNative(addr + 8L, value.oldFileName)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UnicodeString>(64)
                    ).writeNative(addr + 16L, value.newFileName)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.callContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 32L, value.objectContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 40L, value.reserved)
                }
            }

        public operator fun invoke(
            obj: MutPtr<CVoid> = MutPtr(0L),
            oldFileName: MutPtr<UnicodeString> = MutPtr(0L),
            newFileName: MutPtr<UnicodeString> = MutPtr(0L),
            callContext: MutPtr<CVoid> = MutPtr(0L),
            objectContext: MutPtr<CVoid> = MutPtr(0L),
            reserved: MutPtr<CVoid> = MutPtr(0L),
        ): RegReplaceKeyInformation =
            RegReplaceKeyInformation(
                objCtorArg = obj,
                oldFileNameCtorArg = oldFileName,
                newFileNameCtorArg = newFileName,
                callContextCtorArg = callContext,
                objectContextCtorArg = objectContext,
                reservedCtorArg = reserved,
            )
    }
}

public class RegRestoreKeyInformation internal constructor(
    objCtorArg: MutPtr<CVoid>,
    fileHandleCtorArg: Handle,
    public var flags: UInt,
    callContextCtorArg: MutPtr<CVoid>,
    objectContextCtorArg: MutPtr<CVoid>,
    reservedCtorArg: MutPtr<CVoid>,
) {
    public var obj: MutPtr<CVoid> = objCtorArg
        internal set

    public var fileHandle: Handle = fileHandleCtorArg
        internal set

    public var callContext: MutPtr<CVoid> = callContextCtorArg
        internal set

    public var objectContext: MutPtr<CVoid> = objectContextCtorArg
        internal set

    public var reserved: MutPtr<CVoid> = reservedCtorArg
        internal set

    public constructor() : this(
        objCtorArg = MutPtr(0L),
        fileHandleCtorArg = MutPtr(0L),
        flags = 0u,
        callContextCtorArg = MutPtr(0L),
        objectContextCtorArg = MutPtr(0L),
        reservedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.obj

    public operator fun component2(): Handle = this.fileHandle

    public operator fun component3(): UInt = this.flags

    public operator fun component4(): MutPtr<CVoid> = this.callContext

    public operator fun component5(): MutPtr<CVoid> = this.objectContext

    public operator fun component6(): MutPtr<CVoid> = this.reserved

    public fun copy(obj: MutPtr<CVoid> = this.obj, fileHandle: Handle = this.fileHandle, flags: UInt = this.flags, callContext: MutPtr<CVoid> = this.callContext, objectContext: MutPtr<CVoid> = this.objectContext, reserved: MutPtr<CVoid> = this.reserved): RegRestoreKeyInformation = RegRestoreKeyInformation(objCtorArg = obj, fileHandleCtorArg = fileHandle, flags = flags, callContextCtorArg = callContext, objectContextCtorArg = objectContext, reservedCtorArg = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RegRestoreKeyInformation) return false
        if (this.obj != other.obj) return false
        if (this.fileHandle != other.fileHandle) return false
        if (this.flags != other.flags) return false
        if (this.callContext != other.callContext) return false
        if (this.objectContext != other.objectContext) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.obj.hashCode()
        result = 31 * result + this.fileHandle.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.callContext.hashCode()
        result = 31 * result + this.objectContext.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            obj: MutPtr<CVoid> = MutPtr(0L),
            fileHandle: Handle = MutPtr(0L),
            flags: UInt = 0u,
            callContext: MutPtr<CVoid> = MutPtr(0L),
            objectContext: MutPtr<CVoid> = MutPtr(0L),
            reserved: MutPtr<CVoid> = MutPtr(0L),
        ): RegRestoreKeyInformation =
            RegRestoreKeyInformation(
                objCtorArg = obj,
                fileHandleCtorArg = fileHandle,
                flags = flags,
                callContextCtorArg = callContext,
                objectContextCtorArg = objectContext,
                reservedCtorArg = reserved,
            )
    }
}

public class RegSaveKeyInformation internal constructor(
    objCtorArg: MutPtr<CVoid>,
    fileHandleCtorArg: Handle,
    public var format: UInt,
    callContextCtorArg: MutPtr<CVoid>,
    objectContextCtorArg: MutPtr<CVoid>,
    reservedCtorArg: MutPtr<CVoid>,
) {
    public var obj: MutPtr<CVoid> = objCtorArg
        internal set

    public var fileHandle: Handle = fileHandleCtorArg
        internal set

    public var callContext: MutPtr<CVoid> = callContextCtorArg
        internal set

    public var objectContext: MutPtr<CVoid> = objectContextCtorArg
        internal set

    public var reserved: MutPtr<CVoid> = reservedCtorArg
        internal set

    public constructor() : this(
        objCtorArg = MutPtr(0L),
        fileHandleCtorArg = MutPtr(0L),
        format = 0u,
        callContextCtorArg = MutPtr(0L),
        objectContextCtorArg = MutPtr(0L),
        reservedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.obj

    public operator fun component2(): Handle = this.fileHandle

    public operator fun component3(): UInt = this.format

    public operator fun component4(): MutPtr<CVoid> = this.callContext

    public operator fun component5(): MutPtr<CVoid> = this.objectContext

    public operator fun component6(): MutPtr<CVoid> = this.reserved

    public fun copy(obj: MutPtr<CVoid> = this.obj, fileHandle: Handle = this.fileHandle, format: UInt = this.format, callContext: MutPtr<CVoid> = this.callContext, objectContext: MutPtr<CVoid> = this.objectContext, reserved: MutPtr<CVoid> = this.reserved): RegSaveKeyInformation = RegSaveKeyInformation(objCtorArg = obj, fileHandleCtorArg = fileHandle, format = format, callContextCtorArg = callContext, objectContextCtorArg = objectContext, reservedCtorArg = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RegSaveKeyInformation) return false
        if (this.obj != other.obj) return false
        if (this.fileHandle != other.fileHandle) return false
        if (this.format != other.format) return false
        if (this.callContext != other.callContext) return false
        if (this.objectContext != other.objectContext) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.obj.hashCode()
        result = 31 * result + this.fileHandle.hashCode()
        result = 31 * result + this.format.hashCode()
        result = 31 * result + this.callContext.hashCode()
        result = 31 * result + this.objectContext.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            obj: MutPtr<CVoid> = MutPtr(0L),
            fileHandle: Handle = MutPtr(0L),
            format: UInt = 0u,
            callContext: MutPtr<CVoid> = MutPtr(0L),
            objectContext: MutPtr<CVoid> = MutPtr(0L),
            reserved: MutPtr<CVoid> = MutPtr(0L),
        ): RegSaveKeyInformation =
            RegSaveKeyInformation(
                objCtorArg = obj,
                fileHandleCtorArg = fileHandle,
                format = format,
                callContextCtorArg = callContext,
                objectContextCtorArg = objectContext,
                reservedCtorArg = reserved,
            )
    }
}

public class RegSaveMergedKeyInformation internal constructor(
    objCtorArg: MutPtr<CVoid>,
    fileHandleCtorArg: Handle,
    highKeyObjectCtorArg: MutPtr<CVoid>,
    lowKeyObjectCtorArg: MutPtr<CVoid>,
    callContextCtorArg: MutPtr<CVoid>,
    objectContextCtorArg: MutPtr<CVoid>,
    reservedCtorArg: MutPtr<CVoid>,
) {
    public var obj: MutPtr<CVoid> = objCtorArg
        internal set

    public var fileHandle: Handle = fileHandleCtorArg
        internal set

    public var highKeyObject: MutPtr<CVoid> = highKeyObjectCtorArg
        internal set

    public var lowKeyObject: MutPtr<CVoid> = lowKeyObjectCtorArg
        internal set

    public var callContext: MutPtr<CVoid> = callContextCtorArg
        internal set

    public var objectContext: MutPtr<CVoid> = objectContextCtorArg
        internal set

    public var reserved: MutPtr<CVoid> = reservedCtorArg
        internal set

    public constructor() : this(
        objCtorArg = MutPtr(0L),
        fileHandleCtorArg = MutPtr(0L),
        highKeyObjectCtorArg = MutPtr(0L),
        lowKeyObjectCtorArg = MutPtr(0L),
        callContextCtorArg = MutPtr(0L),
        objectContextCtorArg = MutPtr(0L),
        reservedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.obj

    public operator fun component2(): Handle = this.fileHandle

    public operator fun component3(): MutPtr<CVoid> = this.highKeyObject

    public operator fun component4(): MutPtr<CVoid> = this.lowKeyObject

    public operator fun component5(): MutPtr<CVoid> = this.callContext

    public operator fun component6(): MutPtr<CVoid> = this.objectContext

    public operator fun component7(): MutPtr<CVoid> = this.reserved

    public fun copy(obj: MutPtr<CVoid> = this.obj, fileHandle: Handle = this.fileHandle, highKeyObject: MutPtr<CVoid> = this.highKeyObject, lowKeyObject: MutPtr<CVoid> = this.lowKeyObject, callContext: MutPtr<CVoid> = this.callContext, objectContext: MutPtr<CVoid> = this.objectContext, reserved: MutPtr<CVoid> = this.reserved): RegSaveMergedKeyInformation = RegSaveMergedKeyInformation(objCtorArg = obj, fileHandleCtorArg = fileHandle, highKeyObjectCtorArg = highKeyObject, lowKeyObjectCtorArg = lowKeyObject, callContextCtorArg = callContext, objectContextCtorArg = objectContext, reservedCtorArg = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RegSaveMergedKeyInformation) return false
        if (this.obj != other.obj) return false
        if (this.fileHandle != other.fileHandle) return false
        if (this.highKeyObject != other.highKeyObject) return false
        if (this.lowKeyObject != other.lowKeyObject) return false
        if (this.callContext != other.callContext) return false
        if (this.objectContext != other.objectContext) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.obj.hashCode()
        result = 31 * result + this.fileHandle.hashCode()
        result = 31 * result + this.highKeyObject.hashCode()
        result = 31 * result + this.lowKeyObject.hashCode()
        result = 31 * result + this.callContext.hashCode()
        result = 31 * result + this.objectContext.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            obj: MutPtr<CVoid> = MutPtr(0L),
            fileHandle: Handle = MutPtr(0L),
            highKeyObject: MutPtr<CVoid> = MutPtr(0L),
            lowKeyObject: MutPtr<CVoid> = MutPtr(0L),
            callContext: MutPtr<CVoid> = MutPtr(0L),
            objectContext: MutPtr<CVoid> = MutPtr(0L),
            reserved: MutPtr<CVoid> = MutPtr(0L),
        ): RegSaveMergedKeyInformation =
            RegSaveMergedKeyInformation(
                objCtorArg = obj,
                fileHandleCtorArg = fileHandle,
                highKeyObjectCtorArg = highKeyObject,
                lowKeyObjectCtorArg = lowKeyObject,
                callContextCtorArg = callContext,
                objectContextCtorArg = objectContext,
                reservedCtorArg = reserved,
            )
    }
}

public class RegSetKeySecurityInformation internal constructor(
    objCtorArg: MutPtr<CVoid>,
    securityInformationCtorArg: MutPtr<UInt>,
    securityDescriptorCtorArg: PsecurityDescriptor,
    callContextCtorArg: MutPtr<CVoid>,
    objectContextCtorArg: MutPtr<CVoid>,
    reservedCtorArg: MutPtr<CVoid>,
) {
    public var obj: MutPtr<CVoid> = objCtorArg
        internal set

    public var securityInformation: MutPtr<UInt> = securityInformationCtorArg
        internal set

    public var securityDescriptor: PsecurityDescriptor = securityDescriptorCtorArg
        internal set

    public var callContext: MutPtr<CVoid> = callContextCtorArg
        internal set

    public var objectContext: MutPtr<CVoid> = objectContextCtorArg
        internal set

    public var reserved: MutPtr<CVoid> = reservedCtorArg
        internal set

    public constructor() : this(
        objCtorArg = MutPtr(0L),
        securityInformationCtorArg = MutPtr(0L),
        securityDescriptorCtorArg = MutPtr(0L),
        callContextCtorArg = MutPtr(0L),
        objectContextCtorArg = MutPtr(0L),
        reservedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.obj

    public operator fun component2(): MutPtr<UInt> = this.securityInformation

    public operator fun component3(): PsecurityDescriptor = this.securityDescriptor

    public operator fun component4(): MutPtr<CVoid> = this.callContext

    public operator fun component5(): MutPtr<CVoid> = this.objectContext

    public operator fun component6(): MutPtr<CVoid> = this.reserved

    public fun copy(obj: MutPtr<CVoid> = this.obj, securityInformation: MutPtr<UInt> = this.securityInformation, securityDescriptor: PsecurityDescriptor = this.securityDescriptor, callContext: MutPtr<CVoid> = this.callContext, objectContext: MutPtr<CVoid> = this.objectContext, reserved: MutPtr<CVoid> = this.reserved): RegSetKeySecurityInformation = RegSetKeySecurityInformation(objCtorArg = obj, securityInformationCtorArg = securityInformation, securityDescriptorCtorArg = securityDescriptor, callContextCtorArg = callContext, objectContextCtorArg = objectContext, reservedCtorArg = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RegSetKeySecurityInformation) return false
        if (this.obj != other.obj) return false
        if (this.securityInformation != other.securityInformation) return false
        if (this.securityDescriptor != other.securityDescriptor) return false
        if (this.callContext != other.callContext) return false
        if (this.objectContext != other.objectContext) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.obj.hashCode()
        result = 31 * result + this.securityInformation.hashCode()
        result = 31 * result + this.securityDescriptor.hashCode()
        result = 31 * result + this.callContext.hashCode()
        result = 31 * result + this.objectContext.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            obj: MutPtr<CVoid> = MutPtr(0L),
            securityInformation: MutPtr<UInt> = MutPtr(0L),
            securityDescriptor: PsecurityDescriptor = MutPtr(0L),
            callContext: MutPtr<CVoid> = MutPtr(0L),
            objectContext: MutPtr<CVoid> = MutPtr(0L),
            reserved: MutPtr<CVoid> = MutPtr(0L),
        ): RegSetKeySecurityInformation =
            RegSetKeySecurityInformation(
                objCtorArg = obj,
                securityInformationCtorArg = securityInformation,
                securityDescriptorCtorArg = securityDescriptor,
                callContextCtorArg = callContext,
                objectContextCtorArg = objectContext,
                reservedCtorArg = reserved,
            )
    }
}

public class RegSetValueKeyInformation internal constructor(
    objCtorArg: MutPtr<CVoid>,
    valueNameCtorArg: MutPtr<UnicodeString>,
    public var titleIndex: UInt,
    public var type: UInt,
    dataCtorArg: MutPtr<CVoid>,
    public var dataSize: UInt,
    callContextCtorArg: MutPtr<CVoid>,
    objectContextCtorArg: MutPtr<CVoid>,
    reservedCtorArg: MutPtr<CVoid>,
) {
    public var obj: MutPtr<CVoid> = objCtorArg
        internal set

    public var valueName: MutPtr<UnicodeString> = valueNameCtorArg
        internal set

    public var data: MutPtr<CVoid> = dataCtorArg
        internal set

    public var callContext: MutPtr<CVoid> = callContextCtorArg
        internal set

    public var objectContext: MutPtr<CVoid> = objectContextCtorArg
        internal set

    public var reserved: MutPtr<CVoid> = reservedCtorArg
        internal set

    public constructor() : this(
        objCtorArg = MutPtr(0L),
        valueNameCtorArg = MutPtr(0L),
        titleIndex = 0u,
        type = 0u,
        dataCtorArg = MutPtr(0L),
        dataSize = 0u,
        callContextCtorArg = MutPtr(0L),
        objectContextCtorArg = MutPtr(0L),
        reservedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.obj

    public operator fun component2(): MutPtr<UnicodeString> = this.valueName

    public operator fun component3(): UInt = this.titleIndex

    public operator fun component4(): UInt = this.type

    public operator fun component5(): MutPtr<CVoid> = this.data

    public operator fun component6(): UInt = this.dataSize

    public operator fun component7(): MutPtr<CVoid> = this.callContext

    public operator fun component8(): MutPtr<CVoid> = this.objectContext

    public operator fun component9(): MutPtr<CVoid> = this.reserved

    public fun copy(obj: MutPtr<CVoid> = this.obj, valueName: MutPtr<UnicodeString> = this.valueName, titleIndex: UInt = this.titleIndex, type: UInt = this.type, data: MutPtr<CVoid> = this.data, dataSize: UInt = this.dataSize, callContext: MutPtr<CVoid> = this.callContext, objectContext: MutPtr<CVoid> = this.objectContext, reserved: MutPtr<CVoid> = this.reserved): RegSetValueKeyInformation = RegSetValueKeyInformation(objCtorArg = obj, valueNameCtorArg = valueName, titleIndex = titleIndex, type = type, dataCtorArg = data, dataSize = dataSize, callContextCtorArg = callContext, objectContextCtorArg = objectContext, reservedCtorArg = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RegSetValueKeyInformation) return false
        if (this.obj != other.obj) return false
        if (this.valueName != other.valueName) return false
        if (this.titleIndex != other.titleIndex) return false
        if (this.type != other.type) return false
        if (this.data != other.data) return false
        if (this.dataSize != other.dataSize) return false
        if (this.callContext != other.callContext) return false
        if (this.objectContext != other.objectContext) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.obj.hashCode()
        result = 31 * result + this.valueName.hashCode()
        result = 31 * result + this.titleIndex.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.data.hashCode()
        result = 31 * result + this.dataSize.hashCode()
        result = 31 * result + this.callContext.hashCode()
        result = 31 * result + this.objectContext.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegSetValueKeyInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegSetValueKeyInformation> {
                override val sizeBytes: Long = 64L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): RegSetValueKeyInformation =
                    RegSetValueKeyInformation(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UnicodeString>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: RegSetValueKeyInformation) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.obj)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UnicodeString>(64)
                    ).writeNative(addr + 8L, value.valueName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.titleIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.type)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.data)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dataSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 40L, value.callContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 48L, value.objectContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 56L, value.reserved)
                }
            }

        public operator fun invoke(
            obj: MutPtr<CVoid> = MutPtr(0L),
            valueName: MutPtr<UnicodeString> = MutPtr(0L),
            titleIndex: UInt = 0u,
            type: UInt = 0u,
            data: MutPtr<CVoid> = MutPtr(0L),
            dataSize: UInt = 0u,
            callContext: MutPtr<CVoid> = MutPtr(0L),
            objectContext: MutPtr<CVoid> = MutPtr(0L),
            reserved: MutPtr<CVoid> = MutPtr(0L),
        ): RegSetValueKeyInformation =
            RegSetValueKeyInformation(
                objCtorArg = obj,
                valueNameCtorArg = valueName,
                titleIndex = titleIndex,
                type = type,
                dataCtorArg = data,
                dataSize = dataSize,
                callContextCtorArg = callContext,
                objectContextCtorArg = objectContext,
                reservedCtorArg = reserved,
            )
    }
}

public class RegUnloadKeyInformation internal constructor(
    objCtorArg: MutPtr<CVoid>,
    userEventCtorArg: MutPtr<CVoid>,
    callContextCtorArg: MutPtr<CVoid>,
    objectContextCtorArg: MutPtr<CVoid>,
    reservedCtorArg: MutPtr<CVoid>,
) {
    public var obj: MutPtr<CVoid> = objCtorArg
        internal set

    public var userEvent: MutPtr<CVoid> = userEventCtorArg
        internal set

    public var callContext: MutPtr<CVoid> = callContextCtorArg
        internal set

    public var objectContext: MutPtr<CVoid> = objectContextCtorArg
        internal set

    public var reserved: MutPtr<CVoid> = reservedCtorArg
        internal set

    public constructor() : this(
        objCtorArg = MutPtr(0L),
        userEventCtorArg = MutPtr(0L),
        callContextCtorArg = MutPtr(0L),
        objectContextCtorArg = MutPtr(0L),
        reservedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.obj

    public operator fun component2(): MutPtr<CVoid> = this.userEvent

    public operator fun component3(): MutPtr<CVoid> = this.callContext

    public operator fun component4(): MutPtr<CVoid> = this.objectContext

    public operator fun component5(): MutPtr<CVoid> = this.reserved

    public fun copy(obj: MutPtr<CVoid> = this.obj, userEvent: MutPtr<CVoid> = this.userEvent, callContext: MutPtr<CVoid> = this.callContext, objectContext: MutPtr<CVoid> = this.objectContext, reserved: MutPtr<CVoid> = this.reserved): RegUnloadKeyInformation = RegUnloadKeyInformation(objCtorArg = obj, userEventCtorArg = userEvent, callContextCtorArg = callContext, objectContextCtorArg = objectContext, reservedCtorArg = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RegUnloadKeyInformation) return false
        if (this.obj != other.obj) return false
        if (this.userEvent != other.userEvent) return false
        if (this.callContext != other.callContext) return false
        if (this.objectContext != other.objectContext) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.obj.hashCode()
        result = 31 * result + this.userEvent.hashCode()
        result = 31 * result + this.callContext.hashCode()
        result = 31 * result + this.objectContext.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegUnloadKeyInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegUnloadKeyInformation> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): RegUnloadKeyInformation =
                    RegUnloadKeyInformation(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: RegUnloadKeyInformation) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.obj)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.userEvent)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.callContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.objectContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 32L, value.reserved)
                }
            }

        public operator fun invoke(
            obj: MutPtr<CVoid> = MutPtr(0L),
            userEvent: MutPtr<CVoid> = MutPtr(0L),
            callContext: MutPtr<CVoid> = MutPtr(0L),
            objectContext: MutPtr<CVoid> = MutPtr(0L),
            reserved: MutPtr<CVoid> = MutPtr(0L),
        ): RegUnloadKeyInformation =
            RegUnloadKeyInformation(
                objCtorArg = obj,
                userEventCtorArg = userEvent,
                callContextCtorArg = callContext,
                objectContextCtorArg = objectContext,
                reservedCtorArg = reserved,
            )
    }
}

public class ResourceHashEntry internal constructor(
    public var listEntry: ListEntry,
    addressCtorArg: MutPtr<CVoid>,
    public var contentionCount: UInt,
    public var number: UInt,
) {
    public var address: MutPtr<CVoid> = addressCtorArg
        internal set

    public constructor() : this(
        listEntry = ListEntry(),
        addressCtorArg = MutPtr(0L),
        contentionCount = 0u,
        number = 0u,
    )

    public operator fun component1(): ListEntry = this.listEntry

    public operator fun component2(): MutPtr<CVoid> = this.address

    public operator fun component3(): UInt = this.contentionCount

    public operator fun component4(): UInt = this.number

    public fun copy(listEntry: ListEntry = this.listEntry, address: MutPtr<CVoid> = this.address, contentionCount: UInt = this.contentionCount, number: UInt = this.number): ResourceHashEntry = ResourceHashEntry(listEntry = listEntry, addressCtorArg = address, contentionCount = contentionCount, number = number)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ResourceHashEntry) return false
        if (this.listEntry != other.listEntry) return false
        if (this.address != other.address) return false
        if (this.contentionCount != other.contentionCount) return false
        if (this.number != other.number) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.listEntry.hashCode()
        result = 31 * result + this.address.hashCode()
        result = 31 * result + this.contentionCount.hashCode()
        result = 31 * result + this.number.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            listEntry: ListEntry = ListEntry(),
            address: MutPtr<CVoid> = MutPtr(0L),
            contentionCount: UInt = 0u,
            number: UInt = 0u,
        ): ResourceHashEntry =
            ResourceHashEntry(
                listEntry = listEntry,
                addressCtorArg = address,
                contentionCount = contentionCount,
                number = number,
            )
    }
}

public data class ResourcePerformanceData(
    public var activeResourceCount: UInt = 0u,
    public var totalResourceCount: UInt = 0u,
    public var exclusiveAcquire: UInt = 0u,
    public var sharedFirstLevel: UInt = 0u,
    public var sharedSecondLevel: UInt = 0u,
    public var starveFirstLevel: UInt = 0u,
    public var starveSecondLevel: UInt = 0u,
    public var waitForExclusive: UInt = 0u,
    public var ownerTableExpands: UInt = 0u,
    public var maximumTableExpand: UInt = 0u,
    public var hashTable: List<ListEntry> = List(64) { ListEntry() },
)

public class RtlAvlTable internal constructor(
    public var balancedRoot: RtlBalancedLinks,
    orderedPointerCtorArg: MutPtr<CVoid>,
    public var whichOrderedElement: UInt,
    public var numberGenericTableElements: UInt,
    public var depthOfTree: UInt,
    restartKeyCtorArg: MutPtr<RtlBalancedLinks>,
    public var deleteCount: UInt,
    public var compareRoutine: PrtlAvlCompareRoutine,
    public var allocateRoutine: PrtlAvlAllocateRoutine,
    public var freeRoutine: PrtlAvlFreeRoutine,
    tableContextCtorArg: MutPtr<CVoid>,
) {
    public var orderedPointer: MutPtr<CVoid> = orderedPointerCtorArg
        internal set

    public var restartKey: MutPtr<RtlBalancedLinks> = restartKeyCtorArg
        internal set

    public var tableContext: MutPtr<CVoid> = tableContextCtorArg
        internal set

    public constructor() : this(
        balancedRoot = RtlBalancedLinks(),
        orderedPointerCtorArg = MutPtr(0L),
        whichOrderedElement = 0u,
        numberGenericTableElements = 0u,
        depthOfTree = 0u,
        restartKeyCtorArg = MutPtr(0L),
        deleteCount = 0u,
        compareRoutine = null,
        allocateRoutine = null,
        freeRoutine = null,
        tableContextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): RtlBalancedLinks = this.balancedRoot

    public operator fun component2(): MutPtr<CVoid> = this.orderedPointer

    public operator fun component3(): UInt = this.whichOrderedElement

    public operator fun component4(): UInt = this.numberGenericTableElements

    public operator fun component5(): UInt = this.depthOfTree

    public operator fun component6(): MutPtr<RtlBalancedLinks> = this.restartKey

    public operator fun component7(): UInt = this.deleteCount

    public operator fun component8(): PrtlAvlCompareRoutine = this.compareRoutine

    public operator fun component9(): PrtlAvlAllocateRoutine = this.allocateRoutine

    public operator fun component10(): PrtlAvlFreeRoutine = this.freeRoutine

    public operator fun component11(): MutPtr<CVoid> = this.tableContext

    public fun copy(balancedRoot: RtlBalancedLinks = this.balancedRoot, orderedPointer: MutPtr<CVoid> = this.orderedPointer, whichOrderedElement: UInt = this.whichOrderedElement, numberGenericTableElements: UInt = this.numberGenericTableElements, depthOfTree: UInt = this.depthOfTree, restartKey: MutPtr<RtlBalancedLinks> = this.restartKey, deleteCount: UInt = this.deleteCount, compareRoutine: PrtlAvlCompareRoutine = this.compareRoutine, allocateRoutine: PrtlAvlAllocateRoutine = this.allocateRoutine, freeRoutine: PrtlAvlFreeRoutine = this.freeRoutine, tableContext: MutPtr<CVoid> = this.tableContext): RtlAvlTable = RtlAvlTable(balancedRoot = balancedRoot, orderedPointerCtorArg = orderedPointer, whichOrderedElement = whichOrderedElement, numberGenericTableElements = numberGenericTableElements, depthOfTree = depthOfTree, restartKeyCtorArg = restartKey, deleteCount = deleteCount, compareRoutine = compareRoutine, allocateRoutine = allocateRoutine, freeRoutine = freeRoutine, tableContextCtorArg = tableContext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RtlAvlTable) return false
        if (this.balancedRoot != other.balancedRoot) return false
        if (this.orderedPointer != other.orderedPointer) return false
        if (this.whichOrderedElement != other.whichOrderedElement) return false
        if (this.numberGenericTableElements != other.numberGenericTableElements) return false
        if (this.depthOfTree != other.depthOfTree) return false
        if (this.restartKey != other.restartKey) return false
        if (this.deleteCount != other.deleteCount) return false
        if (this.compareRoutine != other.compareRoutine) return false
        if (this.allocateRoutine != other.allocateRoutine) return false
        if (this.freeRoutine != other.freeRoutine) return false
        if (this.tableContext != other.tableContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.balancedRoot.hashCode()
        result = 31 * result + this.orderedPointer.hashCode()
        result = 31 * result + this.whichOrderedElement.hashCode()
        result = 31 * result + this.numberGenericTableElements.hashCode()
        result = 31 * result + this.depthOfTree.hashCode()
        result = 31 * result + this.restartKey.hashCode()
        result = 31 * result + this.deleteCount.hashCode()
        result = 31 * result + this.compareRoutine.hashCode()
        result = 31 * result + this.allocateRoutine.hashCode()
        result = 31 * result + this.freeRoutine.hashCode()
        result = 31 * result + this.tableContext.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            balancedRoot: RtlBalancedLinks = RtlBalancedLinks(),
            orderedPointer: MutPtr<CVoid> = MutPtr(0L),
            whichOrderedElement: UInt = 0u,
            numberGenericTableElements: UInt = 0u,
            depthOfTree: UInt = 0u,
            restartKey: MutPtr<RtlBalancedLinks> = MutPtr(0L),
            deleteCount: UInt = 0u,
            compareRoutine: PrtlAvlCompareRoutine = null,
            allocateRoutine: PrtlAvlAllocateRoutine = null,
            freeRoutine: PrtlAvlFreeRoutine = null,
            tableContext: MutPtr<CVoid> = MutPtr(0L),
        ): RtlAvlTable =
            RtlAvlTable(
                balancedRoot = balancedRoot,
                orderedPointerCtorArg = orderedPointer,
                whichOrderedElement = whichOrderedElement,
                numberGenericTableElements = numberGenericTableElements,
                depthOfTree = depthOfTree,
                restartKeyCtorArg = restartKey,
                deleteCount = deleteCount,
                compareRoutine = compareRoutine,
                allocateRoutine = allocateRoutine,
                freeRoutine = freeRoutine,
                tableContextCtorArg = tableContext,
            )
    }
}

public class RtlBalancedLinks internal constructor(
    parentCtorArg: MutPtr<RtlBalancedLinks>,
    leftChildCtorArg: MutPtr<RtlBalancedLinks>,
    rightChildCtorArg: MutPtr<RtlBalancedLinks>,
    public var balance: Byte,
    public var reserved: UByteArray,
) {
    public var parent: MutPtr<RtlBalancedLinks> = parentCtorArg
        internal set

    public var leftChild: MutPtr<RtlBalancedLinks> = leftChildCtorArg
        internal set

    public var rightChild: MutPtr<RtlBalancedLinks> = rightChildCtorArg
        internal set

    public constructor() : this(
        parentCtorArg = MutPtr(0L),
        leftChildCtorArg = MutPtr(0L),
        rightChildCtorArg = MutPtr(0L),
        balance = 0,
        reserved = UByteArray(3),
    )

    public operator fun component1(): MutPtr<RtlBalancedLinks> = this.parent

    public operator fun component2(): MutPtr<RtlBalancedLinks> = this.leftChild

    public operator fun component3(): MutPtr<RtlBalancedLinks> = this.rightChild

    public operator fun component4(): Byte = this.balance

    public operator fun component5(): UByteArray = this.reserved

    public fun copy(parent: MutPtr<RtlBalancedLinks> = this.parent, leftChild: MutPtr<RtlBalancedLinks> = this.leftChild, rightChild: MutPtr<RtlBalancedLinks> = this.rightChild, balance: Byte = this.balance, reserved: UByteArray = this.reserved): RtlBalancedLinks = RtlBalancedLinks(parentCtorArg = parent, leftChildCtorArg = leftChild, rightChildCtorArg = rightChild, balance = balance, reserved = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RtlBalancedLinks) return false
        if (this.parent != other.parent) return false
        if (this.leftChild != other.leftChild) return false
        if (this.rightChild != other.rightChild) return false
        if (this.balance != other.balance) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.parent.hashCode()
        result = 31 * result + this.leftChild.hashCode()
        result = 31 * result + this.rightChild.hashCode()
        result = 31 * result + this.balance.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RtlBalancedLinks> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RtlBalancedLinks> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): RtlBalancedLinks =
                    RtlBalancedLinks(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<RtlBalancedLinks>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<RtlBalancedLinks>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<RtlBalancedLinks>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 25L),
                    )
                override fun writeNative(addr: Long, value: RtlBalancedLinks) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<RtlBalancedLinks>(64)
                    ).writeNative(addr, value.parent)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<RtlBalancedLinks>(64)
                    ).writeNative(addr + 8L, value.leftChild)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<RtlBalancedLinks>(64)
                    ).writeNative(addr + 16L, value.rightChild)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 24L, value.balance)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 25L, value.reserved)
                }
            }

        public operator fun invoke(
            parent: MutPtr<RtlBalancedLinks> = MutPtr(0L),
            leftChild: MutPtr<RtlBalancedLinks> = MutPtr(0L),
            rightChild: MutPtr<RtlBalancedLinks> = MutPtr(0L),
            balance: Byte = 0,
            reserved: UByteArray = UByteArray(3),
        ): RtlBalancedLinks =
            RtlBalancedLinks(
                parentCtorArg = parent,
                leftChildCtorArg = leftChild,
                rightChildCtorArg = rightChild,
                balance = balance,
                reserved = reserved,
            )
    }
}

public class RtlBitmap internal constructor(
    public var sizeOfBitMap: UInt,
    bufferCtorArg: MutPtr<UInt>,
) {
    public var buffer: MutPtr<UInt> = bufferCtorArg
        internal set

    public constructor() : this(
        sizeOfBitMap = 0u,
        bufferCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.sizeOfBitMap

    public operator fun component2(): MutPtr<UInt> = this.buffer

    public fun copy(sizeOfBitMap: UInt = this.sizeOfBitMap, buffer: MutPtr<UInt> = this.buffer): RtlBitmap = RtlBitmap(sizeOfBitMap = sizeOfBitMap, bufferCtorArg = buffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RtlBitmap) return false
        if (this.sizeOfBitMap != other.sizeOfBitMap) return false
        if (this.buffer != other.buffer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfBitMap.hashCode()
        result = 31 * result + this.buffer.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RtlBitmap> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RtlBitmap> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): RtlBitmap =
                    RtlBitmap(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UInt>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: RtlBitmap) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sizeOfBitMap)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UInt>(64)
                    ).writeNative(addr + 8L, value.buffer)
                }
            }

        public operator fun invoke(
            sizeOfBitMap: UInt = 0u,
            buffer: MutPtr<UInt> = MutPtr(0L),
        ): RtlBitmap =
            RtlBitmap(
                sizeOfBitMap = sizeOfBitMap,
                bufferCtorArg = buffer,
            )
    }
}

public data class RtlBitmapRun(
    public var startingIndex: UInt = 0u,
    public var numberOfBits: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RtlBitmapRun> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RtlBitmapRun> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): RtlBitmapRun =
                    RtlBitmapRun(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: RtlBitmapRun) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.startingIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.numberOfBits)
                }
            }
    }
}

public class RtlDynamicHashTable internal constructor(
    public var flags: UInt,
    public var shift: UInt,
    public var tableSize: UInt,
    public var pivot: UInt,
    public var divisorMask: UInt,
    public var numEntries: UInt,
    public var nonEmptyBuckets: UInt,
    public var numEnumerators: UInt,
    directoryCtorArg: MutPtr<CVoid>,
) {
    public var directory: MutPtr<CVoid> = directoryCtorArg
        internal set

    public constructor() : this(
        flags = 0u,
        shift = 0u,
        tableSize = 0u,
        pivot = 0u,
        divisorMask = 0u,
        numEntries = 0u,
        nonEmptyBuckets = 0u,
        numEnumerators = 0u,
        directoryCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.flags

    public operator fun component2(): UInt = this.shift

    public operator fun component3(): UInt = this.tableSize

    public operator fun component4(): UInt = this.pivot

    public operator fun component5(): UInt = this.divisorMask

    public operator fun component6(): UInt = this.numEntries

    public operator fun component7(): UInt = this.nonEmptyBuckets

    public operator fun component8(): UInt = this.numEnumerators

    public operator fun component9(): MutPtr<CVoid> = this.directory

    public fun copy(flags: UInt = this.flags, shift: UInt = this.shift, tableSize: UInt = this.tableSize, pivot: UInt = this.pivot, divisorMask: UInt = this.divisorMask, numEntries: UInt = this.numEntries, nonEmptyBuckets: UInt = this.nonEmptyBuckets, numEnumerators: UInt = this.numEnumerators, directory: MutPtr<CVoid> = this.directory): RtlDynamicHashTable = RtlDynamicHashTable(flags = flags, shift = shift, tableSize = tableSize, pivot = pivot, divisorMask = divisorMask, numEntries = numEntries, nonEmptyBuckets = nonEmptyBuckets, numEnumerators = numEnumerators, directoryCtorArg = directory)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RtlDynamicHashTable) return false
        if (this.flags != other.flags) return false
        if (this.shift != other.shift) return false
        if (this.tableSize != other.tableSize) return false
        if (this.pivot != other.pivot) return false
        if (this.divisorMask != other.divisorMask) return false
        if (this.numEntries != other.numEntries) return false
        if (this.nonEmptyBuckets != other.nonEmptyBuckets) return false
        if (this.numEnumerators != other.numEnumerators) return false
        if (this.directory != other.directory) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.shift.hashCode()
        result = 31 * result + this.tableSize.hashCode()
        result = 31 * result + this.pivot.hashCode()
        result = 31 * result + this.divisorMask.hashCode()
        result = 31 * result + this.numEntries.hashCode()
        result = 31 * result + this.nonEmptyBuckets.hashCode()
        result = 31 * result + this.numEnumerators.hashCode()
        result = 31 * result + this.directory.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RtlDynamicHashTable> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RtlDynamicHashTable> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): RtlDynamicHashTable =
                    RtlDynamicHashTable(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: RtlDynamicHashTable) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.shift)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.tableSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.pivot)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.divisorMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.numEntries)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.nonEmptyBuckets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.numEnumerators)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 32L, value.directory)
                }
            }

        public operator fun invoke(
            flags: UInt = 0u,
            shift: UInt = 0u,
            tableSize: UInt = 0u,
            pivot: UInt = 0u,
            divisorMask: UInt = 0u,
            numEntries: UInt = 0u,
            nonEmptyBuckets: UInt = 0u,
            numEnumerators: UInt = 0u,
            directory: MutPtr<CVoid> = MutPtr(0L),
        ): RtlDynamicHashTable =
            RtlDynamicHashTable(
                flags = flags,
                shift = shift,
                tableSize = tableSize,
                pivot = pivot,
                divisorMask = divisorMask,
                numEntries = numEntries,
                nonEmptyBuckets = nonEmptyBuckets,
                numEnumerators = numEnumerators,
                directoryCtorArg = directory,
            )
    }
}

public class RtlDynamicHashTableContext internal constructor(
    chainHeadCtorArg: MutPtr<ListEntry>,
    prevLinkageCtorArg: MutPtr<ListEntry>,
    public var signature: Int,
) {
    public var chainHead: MutPtr<ListEntry> = chainHeadCtorArg
        internal set

    public var prevLinkage: MutPtr<ListEntry> = prevLinkageCtorArg
        internal set

    public constructor() : this(
        chainHeadCtorArg = MutPtr(0L),
        prevLinkageCtorArg = MutPtr(0L),
        signature = 0,
    )

    public operator fun component1(): MutPtr<ListEntry> = this.chainHead

    public operator fun component2(): MutPtr<ListEntry> = this.prevLinkage

    public operator fun component3(): Int = this.signature

    public fun copy(chainHead: MutPtr<ListEntry> = this.chainHead, prevLinkage: MutPtr<ListEntry> = this.prevLinkage, signature: Int = this.signature): RtlDynamicHashTableContext = RtlDynamicHashTableContext(chainHeadCtorArg = chainHead, prevLinkageCtorArg = prevLinkage, signature = signature)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RtlDynamicHashTableContext) return false
        if (this.chainHead != other.chainHead) return false
        if (this.prevLinkage != other.prevLinkage) return false
        if (this.signature != other.signature) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.chainHead.hashCode()
        result = 31 * result + this.prevLinkage.hashCode()
        result = 31 * result + this.signature.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RtlDynamicHashTableContext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RtlDynamicHashTableContext> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): RtlDynamicHashTableContext =
                    RtlDynamicHashTableContext(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<ListEntry>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<ListEntry>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: RtlDynamicHashTableContext) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<ListEntry>(64)
                    ).writeNative(addr, value.chainHead)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<ListEntry>(64)
                    ).writeNative(addr + 8L, value.prevLinkage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.signature)
                }
            }

        public operator fun invoke(
            chainHead: MutPtr<ListEntry> = MutPtr(0L),
            prevLinkage: MutPtr<ListEntry> = MutPtr(0L),
            signature: Int = 0,
        ): RtlDynamicHashTableContext =
            RtlDynamicHashTableContext(
                chainHeadCtorArg = chainHead,
                prevLinkageCtorArg = prevLinkage,
                signature = signature,
            )
    }
}

public data class RtlDynamicHashTableEntry(
    public var linkage: ListEntry = ListEntry(),
    public var signature: Int = 0,
)

public class RtlDynamicHashTableEnumerator internal constructor(
    public var anonymous: RtlDynamicHashTableEnumerator0,
    chainHeadCtorArg: MutPtr<ListEntry>,
    public var bucketIndex: UInt,
) {
    public var chainHead: MutPtr<ListEntry> = chainHeadCtorArg
        internal set

    public constructor() : this(
        anonymous = RtlDynamicHashTableEnumerator0(),
        chainHeadCtorArg = MutPtr(0L),
        bucketIndex = 0u,
    )

    public operator fun component1(): RtlDynamicHashTableEnumerator0 = this.anonymous

    public operator fun component2(): MutPtr<ListEntry> = this.chainHead

    public operator fun component3(): UInt = this.bucketIndex

    public fun copy(anonymous: RtlDynamicHashTableEnumerator0 = this.anonymous, chainHead: MutPtr<ListEntry> = this.chainHead, bucketIndex: UInt = this.bucketIndex): RtlDynamicHashTableEnumerator = RtlDynamicHashTableEnumerator(anonymous = anonymous, chainHeadCtorArg = chainHead, bucketIndex = bucketIndex)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RtlDynamicHashTableEnumerator) return false
        if (this.anonymous != other.anonymous) return false
        if (this.chainHead != other.chainHead) return false
        if (this.bucketIndex != other.bucketIndex) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.chainHead.hashCode()
        result = 31 * result + this.bucketIndex.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            anonymous: RtlDynamicHashTableEnumerator0 = RtlDynamicHashTableEnumerator0(),
            chainHead: MutPtr<ListEntry> = MutPtr(0L),
            bucketIndex: UInt = 0u,
        ): RtlDynamicHashTableEnumerator =
            RtlDynamicHashTableEnumerator(
                anonymous = anonymous,
                chainHeadCtorArg = chainHead,
                bucketIndex = bucketIndex,
            )
    }
}

public class RtlDynamicHashTableEnumerator0 internal constructor(
    public var hashEntry: RtlDynamicHashTableEntry,
    curEntryCtorArg: MutPtr<ListEntry>,
) {
    public var curEntry: MutPtr<ListEntry> = curEntryCtorArg
        internal set

    public constructor() : this(
        hashEntry = RtlDynamicHashTableEntry(),
        curEntryCtorArg = MutPtr(0L),
    )

    public operator fun component1(): RtlDynamicHashTableEntry = this.hashEntry

    public operator fun component2(): MutPtr<ListEntry> = this.curEntry

    public fun copy(hashEntry: RtlDynamicHashTableEntry = this.hashEntry, curEntry: MutPtr<ListEntry> = this.curEntry): RtlDynamicHashTableEnumerator0 = RtlDynamicHashTableEnumerator0(hashEntry = hashEntry, curEntryCtorArg = curEntry)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RtlDynamicHashTableEnumerator0) return false
        if (this.hashEntry != other.hashEntry) return false
        if (this.curEntry != other.curEntry) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hashEntry.hashCode()
        result = 31 * result + this.curEntry.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hashEntry: RtlDynamicHashTableEntry = RtlDynamicHashTableEntry(),
            curEntry: MutPtr<ListEntry> = MutPtr(0L),
        ): RtlDynamicHashTableEnumerator0 =
            RtlDynamicHashTableEnumerator0(
                hashEntry = hashEntry,
                curEntryCtorArg = curEntry,
            )
    }
}

public class RtlGenericTable internal constructor(
    tableRootCtorArg: MutPtr<RtlSplayLinks>,
    public var insertOrderList: ListEntry,
    orderedPointerCtorArg: MutPtr<ListEntry>,
    public var whichOrderedElement: UInt,
    public var numberGenericTableElements: UInt,
    public var compareRoutine: PrtlGenericCompareRoutine,
    public var allocateRoutine: PrtlGenericAllocateRoutine,
    public var freeRoutine: PrtlGenericFreeRoutine,
    tableContextCtorArg: MutPtr<CVoid>,
) {
    public var tableRoot: MutPtr<RtlSplayLinks> = tableRootCtorArg
        internal set

    public var orderedPointer: MutPtr<ListEntry> = orderedPointerCtorArg
        internal set

    public var tableContext: MutPtr<CVoid> = tableContextCtorArg
        internal set

    public constructor() : this(
        tableRootCtorArg = MutPtr(0L),
        insertOrderList = ListEntry(),
        orderedPointerCtorArg = MutPtr(0L),
        whichOrderedElement = 0u,
        numberGenericTableElements = 0u,
        compareRoutine = null,
        allocateRoutine = null,
        freeRoutine = null,
        tableContextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<RtlSplayLinks> = this.tableRoot

    public operator fun component2(): ListEntry = this.insertOrderList

    public operator fun component3(): MutPtr<ListEntry> = this.orderedPointer

    public operator fun component4(): UInt = this.whichOrderedElement

    public operator fun component5(): UInt = this.numberGenericTableElements

    public operator fun component6(): PrtlGenericCompareRoutine = this.compareRoutine

    public operator fun component7(): PrtlGenericAllocateRoutine = this.allocateRoutine

    public operator fun component8(): PrtlGenericFreeRoutine = this.freeRoutine

    public operator fun component9(): MutPtr<CVoid> = this.tableContext

    public fun copy(tableRoot: MutPtr<RtlSplayLinks> = this.tableRoot, insertOrderList: ListEntry = this.insertOrderList, orderedPointer: MutPtr<ListEntry> = this.orderedPointer, whichOrderedElement: UInt = this.whichOrderedElement, numberGenericTableElements: UInt = this.numberGenericTableElements, compareRoutine: PrtlGenericCompareRoutine = this.compareRoutine, allocateRoutine: PrtlGenericAllocateRoutine = this.allocateRoutine, freeRoutine: PrtlGenericFreeRoutine = this.freeRoutine, tableContext: MutPtr<CVoid> = this.tableContext): RtlGenericTable = RtlGenericTable(tableRootCtorArg = tableRoot, insertOrderList = insertOrderList, orderedPointerCtorArg = orderedPointer, whichOrderedElement = whichOrderedElement, numberGenericTableElements = numberGenericTableElements, compareRoutine = compareRoutine, allocateRoutine = allocateRoutine, freeRoutine = freeRoutine, tableContextCtorArg = tableContext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RtlGenericTable) return false
        if (this.tableRoot != other.tableRoot) return false
        if (this.insertOrderList != other.insertOrderList) return false
        if (this.orderedPointer != other.orderedPointer) return false
        if (this.whichOrderedElement != other.whichOrderedElement) return false
        if (this.numberGenericTableElements != other.numberGenericTableElements) return false
        if (this.compareRoutine != other.compareRoutine) return false
        if (this.allocateRoutine != other.allocateRoutine) return false
        if (this.freeRoutine != other.freeRoutine) return false
        if (this.tableContext != other.tableContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.tableRoot.hashCode()
        result = 31 * result + this.insertOrderList.hashCode()
        result = 31 * result + this.orderedPointer.hashCode()
        result = 31 * result + this.whichOrderedElement.hashCode()
        result = 31 * result + this.numberGenericTableElements.hashCode()
        result = 31 * result + this.compareRoutine.hashCode()
        result = 31 * result + this.allocateRoutine.hashCode()
        result = 31 * result + this.freeRoutine.hashCode()
        result = 31 * result + this.tableContext.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            tableRoot: MutPtr<RtlSplayLinks> = MutPtr(0L),
            insertOrderList: ListEntry = ListEntry(),
            orderedPointer: MutPtr<ListEntry> = MutPtr(0L),
            whichOrderedElement: UInt = 0u,
            numberGenericTableElements: UInt = 0u,
            compareRoutine: PrtlGenericCompareRoutine = null,
            allocateRoutine: PrtlGenericAllocateRoutine = null,
            freeRoutine: PrtlGenericFreeRoutine = null,
            tableContext: MutPtr<CVoid> = MutPtr(0L),
        ): RtlGenericTable =
            RtlGenericTable(
                tableRootCtorArg = tableRoot,
                insertOrderList = insertOrderList,
                orderedPointerCtorArg = orderedPointer,
                whichOrderedElement = whichOrderedElement,
                numberGenericTableElements = numberGenericTableElements,
                compareRoutine = compareRoutine,
                allocateRoutine = allocateRoutine,
                freeRoutine = freeRoutine,
                tableContextCtorArg = tableContext,
            )
    }
}

public class RtlQueryRegistryTable internal constructor(
    public var queryRoutine: PrtlQueryRegistryRoutine,
    public var flags: UInt,
    nameCtorArg: Pwstr,
    entryContextCtorArg: MutPtr<CVoid>,
    public var defaultType: UInt,
    defaultDataCtorArg: MutPtr<CVoid>,
    public var defaultLength: UInt,
) {
    public var name: Pwstr = nameCtorArg
        internal set

    public var entryContext: MutPtr<CVoid> = entryContextCtorArg
        internal set

    public var defaultData: MutPtr<CVoid> = defaultDataCtorArg
        internal set

    public constructor() : this(
        queryRoutine = null,
        flags = 0u,
        nameCtorArg = MutPtr(0L),
        entryContextCtorArg = MutPtr(0L),
        defaultType = 0u,
        defaultDataCtorArg = MutPtr(0L),
        defaultLength = 0u,
    )

    public operator fun component1(): PrtlQueryRegistryRoutine = this.queryRoutine

    public operator fun component2(): UInt = this.flags

    public operator fun component3(): Pwstr = this.name

    public operator fun component4(): MutPtr<CVoid> = this.entryContext

    public operator fun component5(): UInt = this.defaultType

    public operator fun component6(): MutPtr<CVoid> = this.defaultData

    public operator fun component7(): UInt = this.defaultLength

    public fun copy(queryRoutine: PrtlQueryRegistryRoutine = this.queryRoutine, flags: UInt = this.flags, name: Pwstr = this.name, entryContext: MutPtr<CVoid> = this.entryContext, defaultType: UInt = this.defaultType, defaultData: MutPtr<CVoid> = this.defaultData, defaultLength: UInt = this.defaultLength): RtlQueryRegistryTable = RtlQueryRegistryTable(queryRoutine = queryRoutine, flags = flags, nameCtorArg = name, entryContextCtorArg = entryContext, defaultType = defaultType, defaultDataCtorArg = defaultData, defaultLength = defaultLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RtlQueryRegistryTable) return false
        if (this.queryRoutine != other.queryRoutine) return false
        if (this.flags != other.flags) return false
        if (this.name != other.name) return false
        if (this.entryContext != other.entryContext) return false
        if (this.defaultType != other.defaultType) return false
        if (this.defaultData != other.defaultData) return false
        if (this.defaultLength != other.defaultLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.queryRoutine.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.name.hashCode()
        result = 31 * result + this.entryContext.hashCode()
        result = 31 * result + this.defaultType.hashCode()
        result = 31 * result + this.defaultData.hashCode()
        result = 31 * result + this.defaultLength.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            queryRoutine: PrtlQueryRegistryRoutine = null,
            flags: UInt = 0u,
            name: Pwstr = MutPtr(0L),
            entryContext: MutPtr<CVoid> = MutPtr(0L),
            defaultType: UInt = 0u,
            defaultData: MutPtr<CVoid> = MutPtr(0L),
            defaultLength: UInt = 0u,
        ): RtlQueryRegistryTable =
            RtlQueryRegistryTable(
                queryRoutine = queryRoutine,
                flags = flags,
                nameCtorArg = name,
                entryContextCtorArg = entryContext,
                defaultType = defaultType,
                defaultDataCtorArg = defaultData,
                defaultLength = defaultLength,
            )
    }
}

public data class ScatterGatherElement(
    public var address: Long = 0L,
    public var length: UInt = 0u,
    public var reserved: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScatterGatherElement> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScatterGatherElement> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): ScatterGatherElement =
                    ScatterGatherElement(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: ScatterGatherElement) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.address)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.reserved)
                }
            }
    }
}

public data class ScatterGatherList(
    public var numberOfElements: UInt = 0u,
    public var reserved: Int = 0,
    public var elements: List<ScatterGatherElement> = List(1) { ScatterGatherElement() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScatterGatherList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScatterGatherList> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): ScatterGatherList =
                    ScatterGatherList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(ScatterGatherElement.typeLayout(), (1).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: ScatterGatherList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numberOfElements)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.reserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(ScatterGatherElement.typeLayout(), (1).toInt())
                    ).writeNative(addr + 16L, value.elements)
                }
            }
    }
}

public data class SdevIdentifierInterface(
    public var interfaceHeader: Interface = Interface(),
    public var getIdentifier: PgetSdevIdentifier = null,
)

public data class SecureDriverInterface(
    public var interfaceHeader: Interface = Interface(),
    public var processReference: PsecureDriverProcessReference = null,
    public var processDereference: PsecureDriverProcessDereference = null,
    public var reserved: UInt = 0u,
)

public data class ShareAccess(
    public var openCount: UInt = 0u,
    public var readers: UInt = 0u,
    public var writers: UInt = 0u,
    public var deleters: UInt = 0u,
    public var sharedRead: UInt = 0u,
    public var sharedWrite: UInt = 0u,
    public var sharedDelete: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ShareAccess> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ShareAccess> {
                override val sizeBytes: Long = 28L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ShareAccess =
                    ShareAccess(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: ShareAccess) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.openCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.readers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.writers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.deleters)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.sharedRead)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.sharedWrite)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.sharedDelete)
                }
            }
    }
}

public data class SignalRegValue(
    public var regName: UByteArray = UByteArray(32),
    public var msrAddr: UInt = 0u,
    public var value: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SignalRegValue) return false
        if (!this.regName.contentEquals(other.regName)) return false
        if (this.msrAddr != other.msrAddr) return false
        if (this.value != other.value) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.regName.contentHashCode()
        result = 31 * result + this.msrAddr.hashCode()
        result = 31 * result + this.value.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SignalRegValue> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SignalRegValue> {
                override val sizeBytes: Long = 44L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): SignalRegValue =
                    SignalRegValue(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: SignalRegValue) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr, value.regName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.msrAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 36L, value.value)
                }
            }
    }
}

public data class SiloMonitorRegistration(
    public var version: UByte = 0u,
    public var monitorHost: Boolean = false,
    public var monitorExistingSilos: Boolean = false,
    public var reserved: UByteArray = UByteArray(5),
    public var anonymous: SiloMonitorRegistration0 = SiloMonitorRegistration0(),
    public var createCallback: SiloMonitorCreateCallback = null,
    public var terminateCallback: SiloMonitorTerminateCallback = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SiloMonitorRegistration) return false
        if (this.version != other.version) return false
        if (this.monitorHost != other.monitorHost) return false
        if (this.monitorExistingSilos != other.monitorExistingSilos) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.anonymous != other.anonymous) return false
        if (this.createCallback != other.createCallback) return false
        if (this.terminateCallback != other.terminateCallback) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.monitorHost.hashCode()
        result = 31 * result + this.monitorExistingSilos.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.createCallback.hashCode()
        result = 31 * result + this.terminateCallback.hashCode()
        return result
    }
}

public class SiloMonitorRegistration0 internal constructor(
    driverObjectNameCtorArg: MutPtr<UnicodeString>,
    componentNameCtorArg: MutPtr<UnicodeString>,
) {
    public var driverObjectName: MutPtr<UnicodeString> = driverObjectNameCtorArg
        internal set

    public var componentName: MutPtr<UnicodeString> = componentNameCtorArg
        internal set

    public constructor() : this(
        driverObjectNameCtorArg = MutPtr(0L),
        componentNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<UnicodeString> = this.driverObjectName

    public operator fun component2(): MutPtr<UnicodeString> = this.componentName

    public fun copy(driverObjectName: MutPtr<UnicodeString> = this.driverObjectName, componentName: MutPtr<UnicodeString> = this.componentName): SiloMonitorRegistration0 = SiloMonitorRegistration0(driverObjectNameCtorArg = driverObjectName, componentNameCtorArg = componentName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SiloMonitorRegistration0) return false
        if (this.driverObjectName != other.driverObjectName) return false
        if (this.componentName != other.componentName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.driverObjectName.hashCode()
        result = 31 * result + this.componentName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            driverObjectName: MutPtr<UnicodeString> = MutPtr(0L),
            componentName: MutPtr<UnicodeString> = MutPtr(0L),
        ): SiloMonitorRegistration0 =
            SiloMonitorRegistration0(
                driverObjectNameCtorArg = driverObjectName,
                componentNameCtorArg = componentName,
            )
    }
}

public data class SocSubsystemFailureDetails(
    public var subsysType: SocSubsystemType = 0,
    public var firmwareVersion: ULong = 0uL,
    public var hardwareVersion: ULong = 0uL,
    public var unifiedFailureRegionSize: UInt = 0u,
    public var unifiedFailureRegion: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SocSubsystemFailureDetails) return false
        if (this.subsysType != other.subsysType) return false
        if (this.firmwareVersion != other.firmwareVersion) return false
        if (this.hardwareVersion != other.hardwareVersion) return false
        if (this.unifiedFailureRegionSize != other.unifiedFailureRegionSize) return false
        if (!this.unifiedFailureRegion.contentEquals(other.unifiedFailureRegion)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.subsysType.hashCode()
        result = 31 * result + this.firmwareVersion.hashCode()
        result = 31 * result + this.hardwareVersion.hashCode()
        result = 31 * result + this.unifiedFailureRegionSize.hashCode()
        result = 31 * result + this.unifiedFailureRegion.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SocSubsystemFailureDetails> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SocSubsystemFailureDetails> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SocSubsystemFailureDetails =
                    SocSubsystemFailureDetails(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (1).toInt())
                        ).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: SocSubsystemFailureDetails) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.subsysType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.firmwareVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.hardwareVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.unifiedFailureRegionSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (1).toInt())
                    ).writeNative(addr + 28L, value.unifiedFailureRegion)
                }
            }
    }
}

public class SystemFirmwareTableHandler internal constructor(
    public var providerSignature: UInt,
    public var register: Boolean,
    public var firmwareTableHandler: Pfnfth,
    driverObjectCtorArg: MutPtr<CVoid>,
) {
    public var driverObject: MutPtr<CVoid> = driverObjectCtorArg
        internal set

    public constructor() : this(
        providerSignature = 0u,
        register = false,
        firmwareTableHandler = null,
        driverObjectCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.providerSignature

    public operator fun component2(): Boolean = this.register

    public operator fun component3(): Pfnfth = this.firmwareTableHandler

    public operator fun component4(): MutPtr<CVoid> = this.driverObject

    public fun copy(providerSignature: UInt = this.providerSignature, register: Boolean = this.register, firmwareTableHandler: Pfnfth = this.firmwareTableHandler, driverObject: MutPtr<CVoid> = this.driverObject): SystemFirmwareTableHandler = SystemFirmwareTableHandler(providerSignature = providerSignature, register = register, firmwareTableHandler = firmwareTableHandler, driverObjectCtorArg = driverObject)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SystemFirmwareTableHandler) return false
        if (this.providerSignature != other.providerSignature) return false
        if (this.register != other.register) return false
        if (this.firmwareTableHandler != other.firmwareTableHandler) return false
        if (this.driverObject != other.driverObject) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.providerSignature.hashCode()
        result = 31 * result + this.register.hashCode()
        result = 31 * result + this.firmwareTableHandler.hashCode()
        result = 31 * result + this.driverObject.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            providerSignature: UInt = 0u,
            register: Boolean = false,
            firmwareTableHandler: Pfnfth = null,
            driverObject: MutPtr<CVoid> = MutPtr(0L),
        ): SystemFirmwareTableHandler =
            SystemFirmwareTableHandler(
                providerSignature = providerSignature,
                register = register,
                firmwareTableHandler = firmwareTableHandler,
                driverObjectCtorArg = driverObject,
            )
    }
}

public data class SystemFirmwareTableInformation(
    public var providerSignature: UInt = 0u,
    public var action: SystemFirmwareTableAction = 0,
    public var tableID: UInt = 0u,
    public var tableBufferLength: UInt = 0u,
    public var tableBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SystemFirmwareTableInformation) return false
        if (this.providerSignature != other.providerSignature) return false
        if (this.action != other.action) return false
        if (this.tableID != other.tableID) return false
        if (this.tableBufferLength != other.tableBufferLength) return false
        if (!this.tableBuffer.contentEquals(other.tableBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.providerSignature.hashCode()
        result = 31 * result + this.action.hashCode()
        result = 31 * result + this.tableID.hashCode()
        result = 31 * result + this.tableBufferLength.hashCode()
        result = 31 * result + this.tableBuffer.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemFirmwareTableInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemFirmwareTableInformation> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SystemFirmwareTableInformation =
                    SystemFirmwareTableInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: SystemFirmwareTableInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.providerSignature)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.action)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.tableID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.tableBufferLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 16L, value.tableBuffer)
                }
            }
    }
}

public data class SystemPowerStateContext(
    public var anonymous: SystemPowerStateContext0 = SystemPowerStateContext0(),
)

public data class SystemPowerStateContext0(
    public var anonymous: SystemPowerStateContext00 = SystemPowerStateContext00(),
    public var contextAsUlong: UInt = 0u,
)

public data class SystemPowerStateContext00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemPowerStateContext00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemPowerStateContext00> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SystemPowerStateContext00 =
                    SystemPowerStateContext00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SystemPowerStateContext00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class TargetDeviceRemovalNotification internal constructor(
    public var version: UShort,
    public var size: UShort,
    public var event: Guid,
    fileObjectCtorArg: MutPtr<FileObject>,
) {
    public var fileObject: MutPtr<FileObject> = fileObjectCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        size = 0u,
        event = Guid(),
        fileObjectCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.version

    public operator fun component2(): UShort = this.size

    public operator fun component3(): Guid = this.event

    public operator fun component4(): MutPtr<FileObject> = this.fileObject

    public fun copy(version: UShort = this.version, size: UShort = this.size, event: Guid = this.event, fileObject: MutPtr<FileObject> = this.fileObject): TargetDeviceRemovalNotification = TargetDeviceRemovalNotification(version = version, size = size, event = event, fileObjectCtorArg = fileObject)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TargetDeviceRemovalNotification) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.event != other.event) return false
        if (this.fileObject != other.fileObject) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.event.hashCode()
        result = 31 * result + this.fileObject.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: UShort = 0u,
            size: UShort = 0u,
            event: Guid = Guid(),
            fileObject: MutPtr<FileObject> = MutPtr(0L),
        ): TargetDeviceRemovalNotification =
            TargetDeviceRemovalNotification(
                version = version,
                size = size,
                event = event,
                fileObjectCtorArg = fileObject,
            )
    }
}

public class TimerSetCoalescableTimerInfo internal constructor(
    public var dueTime: Long,
    public var timerApcRoutine: PtimerApcRoutine,
    timerContextCtorArg: MutPtr<CVoid>,
    wakeContextCtorArg: MutPtr<CountedReasonContext>,
    public var period: UInt,
    public var tolerableDelay: UInt,
    previousStateCtorArg: MutPtr<Boolean>,
) {
    public var timerContext: MutPtr<CVoid> = timerContextCtorArg
        internal set

    public var wakeContext: MutPtr<CountedReasonContext> = wakeContextCtorArg
        internal set

    public var previousState: MutPtr<Boolean> = previousStateCtorArg
        internal set

    public constructor() : this(
        dueTime = 0L,
        timerApcRoutine = null,
        timerContextCtorArg = MutPtr(0L),
        wakeContextCtorArg = MutPtr(0L),
        period = 0u,
        tolerableDelay = 0u,
        previousStateCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Long = this.dueTime

    public operator fun component2(): PtimerApcRoutine = this.timerApcRoutine

    public operator fun component3(): MutPtr<CVoid> = this.timerContext

    public operator fun component4(): MutPtr<CountedReasonContext> = this.wakeContext

    public operator fun component5(): UInt = this.period

    public operator fun component6(): UInt = this.tolerableDelay

    public operator fun component7(): MutPtr<Boolean> = this.previousState

    public fun copy(dueTime: Long = this.dueTime, timerApcRoutine: PtimerApcRoutine = this.timerApcRoutine, timerContext: MutPtr<CVoid> = this.timerContext, wakeContext: MutPtr<CountedReasonContext> = this.wakeContext, period: UInt = this.period, tolerableDelay: UInt = this.tolerableDelay, previousState: MutPtr<Boolean> = this.previousState): TimerSetCoalescableTimerInfo = TimerSetCoalescableTimerInfo(dueTime = dueTime, timerApcRoutine = timerApcRoutine, timerContextCtorArg = timerContext, wakeContextCtorArg = wakeContext, period = period, tolerableDelay = tolerableDelay, previousStateCtorArg = previousState)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TimerSetCoalescableTimerInfo) return false
        if (this.dueTime != other.dueTime) return false
        if (this.timerApcRoutine != other.timerApcRoutine) return false
        if (this.timerContext != other.timerContext) return false
        if (this.wakeContext != other.wakeContext) return false
        if (this.period != other.period) return false
        if (this.tolerableDelay != other.tolerableDelay) return false
        if (this.previousState != other.previousState) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dueTime.hashCode()
        result = 31 * result + this.timerApcRoutine.hashCode()
        result = 31 * result + this.timerContext.hashCode()
        result = 31 * result + this.wakeContext.hashCode()
        result = 31 * result + this.period.hashCode()
        result = 31 * result + this.tolerableDelay.hashCode()
        result = 31 * result + this.previousState.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dueTime: Long = 0L,
            timerApcRoutine: PtimerApcRoutine = null,
            timerContext: MutPtr<CVoid> = MutPtr(0L),
            wakeContext: MutPtr<CountedReasonContext> = MutPtr(0L),
            period: UInt = 0u,
            tolerableDelay: UInt = 0u,
            previousState: MutPtr<Boolean> = MutPtr(0L),
        ): TimerSetCoalescableTimerInfo =
            TimerSetCoalescableTimerInfo(
                dueTime = dueTime,
                timerApcRoutine = timerApcRoutine,
                timerContextCtorArg = timerContext,
                wakeContextCtorArg = wakeContext,
                period = period,
                tolerableDelay = tolerableDelay,
                previousStateCtorArg = previousState,
            )
    }
}

public data class TimeFields(
    public var year: Short = 0,
    public var month: Short = 0,
    public var day: Short = 0,
    public var hour: Short = 0,
    public var minute: Short = 0,
    public var second: Short = 0,
    public var milliseconds: Short = 0,
    public var weekday: Short = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TimeFields> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TimeFields> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): TimeFields =
                    TimeFields(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 14L),
                    )
                override fun writeNative(addr: Long, value: TimeFields) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.year)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.month)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 4L, value.day)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 6L, value.hour)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 8L, value.minute)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 10L, value.second)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 12L, value.milliseconds)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 14L, value.weekday)
                }
            }
    }
}

public class TranslatorInterface internal constructor(
    public var size: UShort,
    public var version: UShort,
    contextCtorArg: MutPtr<CVoid>,
    public var interfaceReference: PinterfaceReference,
    public var interfaceDereference: PinterfaceDereference,
    public var translateResources: PtranslateResourceHandler,
    public var translateResourceRequirements: PtranslateResourceRequirementsHandler,
) {
    public var context: MutPtr<CVoid> = contextCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        version = 0u,
        contextCtorArg = MutPtr(0L),
        interfaceReference = null,
        interfaceDereference = null,
        translateResources = null,
        translateResourceRequirements = null,
    )

    public operator fun component1(): UShort = this.size

    public operator fun component2(): UShort = this.version

    public operator fun component3(): MutPtr<CVoid> = this.context

    public operator fun component4(): PinterfaceReference = this.interfaceReference

    public operator fun component5(): PinterfaceDereference = this.interfaceDereference

    public operator fun component6(): PtranslateResourceHandler = this.translateResources

    public operator fun component7(): PtranslateResourceRequirementsHandler = this.translateResourceRequirements

    public fun copy(size: UShort = this.size, version: UShort = this.version, context: MutPtr<CVoid> = this.context, interfaceReference: PinterfaceReference = this.interfaceReference, interfaceDereference: PinterfaceDereference = this.interfaceDereference, translateResources: PtranslateResourceHandler = this.translateResources, translateResourceRequirements: PtranslateResourceRequirementsHandler = this.translateResourceRequirements): TranslatorInterface = TranslatorInterface(size = size, version = version, contextCtorArg = context, interfaceReference = interfaceReference, interfaceDereference = interfaceDereference, translateResources = translateResources, translateResourceRequirements = translateResourceRequirements)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TranslatorInterface) return false
        if (this.size != other.size) return false
        if (this.version != other.version) return false
        if (this.context != other.context) return false
        if (this.interfaceReference != other.interfaceReference) return false
        if (this.interfaceDereference != other.interfaceDereference) return false
        if (this.translateResources != other.translateResources) return false
        if (this.translateResourceRequirements != other.translateResourceRequirements) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.context.hashCode()
        result = 31 * result + this.interfaceReference.hashCode()
        result = 31 * result + this.interfaceDereference.hashCode()
        result = 31 * result + this.translateResources.hashCode()
        result = 31 * result + this.translateResourceRequirements.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: UShort = 0u,
            version: UShort = 0u,
            context: MutPtr<CVoid> = MutPtr(0L),
            interfaceReference: PinterfaceReference = null,
            interfaceDereference: PinterfaceDereference = null,
            translateResources: PtranslateResourceHandler = null,
            translateResourceRequirements: PtranslateResourceRequirementsHandler = null,
        ): TranslatorInterface =
            TranslatorInterface(
                size = size,
                version = version,
                contextCtorArg = context,
                interfaceReference = interfaceReference,
                interfaceDereference = interfaceDereference,
                translateResources = translateResources,
                translateResourceRequirements = translateResourceRequirements,
            )
    }
}

public class TxnParameterBlock internal constructor(
    public var length: UShort,
    public var txFsContext: UShort,
    transactionObjectCtorArg: MutPtr<CVoid>,
) {
    public var transactionObject: MutPtr<CVoid> = transactionObjectCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        txFsContext = 0u,
        transactionObjectCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.length

    public operator fun component2(): UShort = this.txFsContext

    public operator fun component3(): MutPtr<CVoid> = this.transactionObject

    public fun copy(length: UShort = this.length, txFsContext: UShort = this.txFsContext, transactionObject: MutPtr<CVoid> = this.transactionObject): TxnParameterBlock = TxnParameterBlock(length = length, txFsContext = txFsContext, transactionObjectCtorArg = transactionObject)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TxnParameterBlock) return false
        if (this.length != other.length) return false
        if (this.txFsContext != other.txFsContext) return false
        if (this.transactionObject != other.transactionObject) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.txFsContext.hashCode()
        result = 31 * result + this.transactionObject.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TxnParameterBlock> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TxnParameterBlock> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): TxnParameterBlock =
                    TxnParameterBlock(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: TxnParameterBlock) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.txFsContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.transactionObject)
                }
            }

        public operator fun invoke(
            length: UShort = 0u,
            txFsContext: UShort = 0u,
            transactionObject: MutPtr<CVoid> = MutPtr(0L),
        ): TxnParameterBlock =
            TxnParameterBlock(
                length = length,
                txFsContext = txFsContext,
                transactionObjectCtorArg = transactionObject,
            )
    }
}

public data class VirtualChannelCapabilities1(
    public var anonymous: VirtualChannelCapabilities10 = VirtualChannelCapabilities10(),
    public var asULONG: UInt = 0u,
)

public data class VirtualChannelCapabilities10(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VirtualChannelCapabilities10> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VirtualChannelCapabilities10> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): VirtualChannelCapabilities10 =
                    VirtualChannelCapabilities10(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: VirtualChannelCapabilities10) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class VirtualChannelCapabilities2(
    public var anonymous: VirtualChannelCapabilities20 = VirtualChannelCapabilities20(),
    public var asULONG: UInt = 0u,
)

public data class VirtualChannelCapabilities20(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VirtualChannelCapabilities20> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VirtualChannelCapabilities20> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): VirtualChannelCapabilities20 =
                    VirtualChannelCapabilities20(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: VirtualChannelCapabilities20) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class VirtualChannelControl(
    public var anonymous: VirtualChannelControl0 = VirtualChannelControl0(),
    public var asUSHORT: UShort = 0u,
)

public data class VirtualChannelControl0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VirtualChannelControl0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VirtualChannelControl0> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): VirtualChannelControl0 =
                    VirtualChannelControl0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: VirtualChannelControl0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class VirtualChannelStatus(
    public var anonymous: VirtualChannelStatus0 = VirtualChannelStatus0(),
    public var asUSHORT: UShort = 0u,
)

public data class VirtualChannelStatus0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VirtualChannelStatus0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VirtualChannelStatus0> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): VirtualChannelStatus0 =
                    VirtualChannelStatus0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: VirtualChannelStatus0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class VirtualResource(
    public var capability: VirtualResourceCapability = VirtualResourceCapability(),
    public var control: VirtualResourceControl = VirtualResourceControl(),
    public var rsvdP: UShort = 0u,
    public var status: VirtualResourceStatus = VirtualResourceStatus(),
)

public data class VirtualResourceCapability(
    public var anonymous: VirtualResourceCapability0 = VirtualResourceCapability0(),
    public var asULONG: UInt = 0u,
)

public data class VirtualResourceCapability0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VirtualResourceCapability0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VirtualResourceCapability0> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): VirtualResourceCapability0 =
                    VirtualResourceCapability0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: VirtualResourceCapability0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class VirtualResourceControl(
    public var anonymous: VirtualResourceControl0 = VirtualResourceControl0(),
    public var asULONG: UInt = 0u,
)

public data class VirtualResourceControl0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VirtualResourceControl0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VirtualResourceControl0> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): VirtualResourceControl0 =
                    VirtualResourceControl0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: VirtualResourceControl0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class VirtualResourceStatus(
    public var anonymous: VirtualResourceStatus0 = VirtualResourceStatus0(),
    public var asUSHORT: UShort = 0u,
)

public data class VirtualResourceStatus0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VirtualResourceStatus0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VirtualResourceStatus0> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): VirtualResourceStatus0 =
                    VirtualResourceStatus0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: VirtualResourceStatus0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class VmCounters(
    public var peakVirtualSize: Int = 0,
    public var virtualSize: Int = 0,
    public var pageFaultCount: UInt = 0u,
    public var peakWorkingSetSize: Int = 0,
    public var workingSetSize: Int = 0,
    public var quotaPeakPagedPoolUsage: Int = 0,
    public var quotaPagedPoolUsage: Int = 0,
    public var quotaPeakNonPagedPoolUsage: Int = 0,
    public var quotaNonPagedPoolUsage: Int = 0,
    public var pagefileUsage: Int = 0,
    public var peakPagefileUsage: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VmCounters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VmCounters> {
                override val sizeBytes: Long = 88L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): VmCounters =
                    VmCounters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 80L),
                    )
                override fun writeNative(addr: Long, value: VmCounters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.peakVirtualSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.virtualSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.pageFaultCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 24L, value.peakWorkingSetSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 32L, value.workingSetSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 40L, value.quotaPeakPagedPoolUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 48L, value.quotaPagedPoolUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 56L, value.quotaPeakNonPagedPoolUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 64L, value.quotaNonPagedPoolUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 72L, value.pagefileUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 80L, value.peakPagefileUsage)
                }
            }
    }
}

public data class VmCountersEx(
    public var peakVirtualSize: Int = 0,
    public var virtualSize: Int = 0,
    public var pageFaultCount: UInt = 0u,
    public var peakWorkingSetSize: Int = 0,
    public var workingSetSize: Int = 0,
    public var quotaPeakPagedPoolUsage: Int = 0,
    public var quotaPagedPoolUsage: Int = 0,
    public var quotaPeakNonPagedPoolUsage: Int = 0,
    public var quotaNonPagedPoolUsage: Int = 0,
    public var pagefileUsage: Int = 0,
    public var peakPagefileUsage: Int = 0,
    public var privateUsage: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VmCountersEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VmCountersEx> {
                override val sizeBytes: Long = 96L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): VmCountersEx =
                    VmCountersEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 88L),
                    )
                override fun writeNative(addr: Long, value: VmCountersEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.peakVirtualSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.virtualSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.pageFaultCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 24L, value.peakWorkingSetSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 32L, value.workingSetSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 40L, value.quotaPeakPagedPoolUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 48L, value.quotaPagedPoolUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 56L, value.quotaPeakNonPagedPoolUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 64L, value.quotaNonPagedPoolUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 72L, value.pagefileUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 80L, value.peakPagefileUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 88L, value.privateUsage)
                }
            }
    }
}

public data class VmCountersEx2(
    public var countersEx: VmCountersEx = VmCountersEx(),
    public var privateWorkingSetSize: Int = 0,
    public var sharedCommitUsage: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VmCountersEx2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VmCountersEx2> {
                override val sizeBytes: Long = 112L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): VmCountersEx2 =
                    VmCountersEx2(
                        (VmCountersEx.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 104L),
                    )
                override fun writeNative(addr: Long, value: VmCountersEx2) {
                    (VmCountersEx.typeLayout()).writeNative(addr, value.countersEx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 96L, value.privateWorkingSetSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 104L, value.sharedCommitUsage)
                }
            }
    }
}

public class WaitContextBlock internal constructor(
    public var anonymous: WaitContextBlock0,
    public var deviceRoutine: DriverControl,
    deviceContextCtorArg: MutPtr<CVoid>,
    public var numberOfMapRegisters: UInt,
    deviceObjectCtorArg: MutPtr<CVoid>,
    currentIrpCtorArg: MutPtr<CVoid>,
    bufferChainingDpcCtorArg: MutPtr<Kdpc>,
) {
    public var deviceContext: MutPtr<CVoid> = deviceContextCtorArg
        internal set

    public var deviceObject: MutPtr<CVoid> = deviceObjectCtorArg
        internal set

    public var currentIrp: MutPtr<CVoid> = currentIrpCtorArg
        internal set

    public var bufferChainingDpc: MutPtr<Kdpc> = bufferChainingDpcCtorArg
        internal set

    public constructor() : this(
        anonymous = WaitContextBlock0(),
        deviceRoutine = null,
        deviceContextCtorArg = MutPtr(0L),
        numberOfMapRegisters = 0u,
        deviceObjectCtorArg = MutPtr(0L),
        currentIrpCtorArg = MutPtr(0L),
        bufferChainingDpcCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WaitContextBlock0 = this.anonymous

    public operator fun component2(): DriverControl = this.deviceRoutine

    public operator fun component3(): MutPtr<CVoid> = this.deviceContext

    public operator fun component4(): UInt = this.numberOfMapRegisters

    public operator fun component5(): MutPtr<CVoid> = this.deviceObject

    public operator fun component6(): MutPtr<CVoid> = this.currentIrp

    public operator fun component7(): MutPtr<Kdpc> = this.bufferChainingDpc

    public fun copy(anonymous: WaitContextBlock0 = this.anonymous, deviceRoutine: DriverControl = this.deviceRoutine, deviceContext: MutPtr<CVoid> = this.deviceContext, numberOfMapRegisters: UInt = this.numberOfMapRegisters, deviceObject: MutPtr<CVoid> = this.deviceObject, currentIrp: MutPtr<CVoid> = this.currentIrp, bufferChainingDpc: MutPtr<Kdpc> = this.bufferChainingDpc): WaitContextBlock = WaitContextBlock(anonymous = anonymous, deviceRoutine = deviceRoutine, deviceContextCtorArg = deviceContext, numberOfMapRegisters = numberOfMapRegisters, deviceObjectCtorArg = deviceObject, currentIrpCtorArg = currentIrp, bufferChainingDpcCtorArg = bufferChainingDpc)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WaitContextBlock) return false
        if (this.anonymous != other.anonymous) return false
        if (this.deviceRoutine != other.deviceRoutine) return false
        if (this.deviceContext != other.deviceContext) return false
        if (this.numberOfMapRegisters != other.numberOfMapRegisters) return false
        if (this.deviceObject != other.deviceObject) return false
        if (this.currentIrp != other.currentIrp) return false
        if (this.bufferChainingDpc != other.bufferChainingDpc) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.deviceRoutine.hashCode()
        result = 31 * result + this.deviceContext.hashCode()
        result = 31 * result + this.numberOfMapRegisters.hashCode()
        result = 31 * result + this.deviceObject.hashCode()
        result = 31 * result + this.currentIrp.hashCode()
        result = 31 * result + this.bufferChainingDpc.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            anonymous: WaitContextBlock0 = WaitContextBlock0(),
            deviceRoutine: DriverControl = null,
            deviceContext: MutPtr<CVoid> = MutPtr(0L),
            numberOfMapRegisters: UInt = 0u,
            deviceObject: MutPtr<CVoid> = MutPtr(0L),
            currentIrp: MutPtr<CVoid> = MutPtr(0L),
            bufferChainingDpc: MutPtr<Kdpc> = MutPtr(0L),
        ): WaitContextBlock =
            WaitContextBlock(
                anonymous = anonymous,
                deviceRoutine = deviceRoutine,
                deviceContextCtorArg = deviceContext,
                numberOfMapRegisters = numberOfMapRegisters,
                deviceObjectCtorArg = deviceObject,
                currentIrpCtorArg = currentIrp,
                bufferChainingDpcCtorArg = bufferChainingDpc,
            )
    }
}

public data class WaitContextBlock0(
    public var waitQueueEntry: KdeviceQueueEntry = KdeviceQueueEntry(),
    public var anonymous: WaitContextBlock00 = WaitContextBlock00(),
)

public data class WaitContextBlock00(
    public var dmaWaitEntry: ListEntry = ListEntry(),
    public var numberOfChannels: UInt = 0u,
    public var bitfield: UInt = 0u,
)

public data class Whea128a(
    public var low: ULong = 0uL,
    public var high: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Whea128a> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Whea128a> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Whea128a =
                    Whea128a(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Whea128a) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.low)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.high)
                }
            }
    }
}

public data class WheapAcpiTimeoutEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var tableType: ByteArray = ByteArray(32),
    public var tableRequest: ByteArray = ByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheapAcpiTimeoutEvent) return false
        if (this.wheaEventLogEntry != other.wheaEventLogEntry) return false
        if (!this.tableType.contentEquals(other.tableType)) return false
        if (!this.tableRequest.contentEquals(other.tableRequest)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wheaEventLogEntry.hashCode()
        result = 31 * result + this.tableType.contentHashCode()
        result = 31 * result + this.tableRequest.contentHashCode()
        return result
    }
}

public data class WheapAddRemoveErrorSourceEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var descriptor: WheaErrorSourceDescriptor = WheaErrorSourceDescriptor(),
    public var status: Ntstatus = 0,
    public var isRemove: Boolean = false,
)

public data class WheapAttemptRecoveryEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var errorHeader: WheaErrorRecordHeader = WheaErrorRecordHeader(),
    public var architecturalRecovery: Boolean = false,
    public var pshedRecovery: Boolean = false,
    public var status: Ntstatus = 0,
)

public data class WheapBadHestNotifyDataEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var sourceId: UShort = 0u,
    public var reserved: UShort = 0u,
    public var notifyDesc: WheaNotificationDescriptor = WheaNotificationDescriptor(),
)

public data class WheapClearedPoisonEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var physicalAddress: ULong = 0uL,
)

public data class WheapCmciImplementedEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var cmciAvailable: Boolean = false,
)

public data class WheapCmciIniterrEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var msr: ULong = 0uL,
    public var type: UInt = 0u,
    public var bank: UInt = 0u,
    public var epIndex: UInt = 0u,
)

public data class WheapCmciRestartEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var cmciRestoreAttempts: UInt = 0u,
    public var maxCmciRestoreLimit: UInt = 0u,
    public var maxCorrectedErrorsFound: UInt = 0u,
    public var maxCorrectedErrorLimit: UInt = 0u,
)

public data class WheapCreateGenericRecordEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var error: ByteArray = ByteArray(32),
    public var entryCount: UInt = 0u,
    public var status: Ntstatus = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheapCreateGenericRecordEvent) return false
        if (this.wheaEventLogEntry != other.wheaEventLogEntry) return false
        if (!this.error.contentEquals(other.error)) return false
        if (this.entryCount != other.entryCount) return false
        if (this.status != other.status) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wheaEventLogEntry.hashCode()
        result = 31 * result + this.error.contentHashCode()
        result = 31 * result + this.entryCount.hashCode()
        result = 31 * result + this.status.hashCode()
        return result
    }
}

public data class WheapDeferredEvent(
    public var listEntry: ListEntry = ListEntry(),
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
)

public data class WheapDeviceDrvEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var function: ByteArray = ByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheapDeviceDrvEvent) return false
        if (this.wheaEventLogEntry != other.wheaEventLogEntry) return false
        if (!this.function.contentEquals(other.function)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wheaEventLogEntry.hashCode()
        result = 31 * result + this.function.contentHashCode()
        return result
    }
}

public data class WheapDpcErrorEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var errType: WheapDpcErrorEventType = 0,
    public var bus: UInt = 0u,
    public var device: UInt = 0u,
    public var function: UInt = 0u,
    public var deviceId: UShort = 0u,
    public var vendorId: UShort = 0u,
)

public data class WheapDroppedCorrectedErrorEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var errorSourceType: WheaErrorSourceType = 0,
    public var errorSourceId: UInt = 0u,
)

public data class WheapEdpcEnabledEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var eDPCEnabled: Boolean = false,
    public var eDPCRecovEnabled: Boolean = false,
)

public data class WheapErrorClearedEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var epIndex: UInt = 0u,
    public var bank: UInt = 0u,
)

public class WheapErrorRecordEvent internal constructor(
    public var wheaEventLogEntry: WheaEventLogEntry,
    recordCtorArg: MutPtr<WheaErrorRecord>,
) {
    public var record: MutPtr<WheaErrorRecord> = recordCtorArg
        internal set

    public constructor() : this(
        wheaEventLogEntry = WheaEventLogEntry(),
        recordCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WheaEventLogEntry = this.wheaEventLogEntry

    public operator fun component2(): MutPtr<WheaErrorRecord> = this.record

    public fun copy(wheaEventLogEntry: WheaEventLogEntry = this.wheaEventLogEntry, record: MutPtr<WheaErrorRecord> = this.record): WheapErrorRecordEvent = WheapErrorRecordEvent(wheaEventLogEntry = wheaEventLogEntry, recordCtorArg = record)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheapErrorRecordEvent) return false
        if (this.wheaEventLogEntry != other.wheaEventLogEntry) return false
        if (this.record != other.record) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wheaEventLogEntry.hashCode()
        result = 31 * result + this.record.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
            record: MutPtr<WheaErrorRecord> = MutPtr(0L),
        ): WheapErrorRecordEvent =
            WheapErrorRecordEvent(
                wheaEventLogEntry = wheaEventLogEntry,
                recordCtorArg = record,
            )
    }
}

public data class WheapErrSrcArrayInvalidEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var errorSourceCount: UInt = 0u,
    public var reportedLength: UInt = 0u,
    public var expectedLength: UInt = 0u,
)

public data class WheapErrSrcInvalidEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var errDescriptor: WheaErrorSourceDescriptor = WheaErrorSourceDescriptor(),
    public var error: ByteArray = ByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheapErrSrcInvalidEvent) return false
        if (this.wheaEventLogEntry != other.wheaEventLogEntry) return false
        if (this.errDescriptor != other.errDescriptor) return false
        if (!this.error.contentEquals(other.error)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wheaEventLogEntry.hashCode()
        result = 31 * result + this.errDescriptor.hashCode()
        result = 31 * result + this.error.contentHashCode()
        return result
    }
}

public data class WheapFoundErrorInBankEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var epIndex: UInt = 0u,
    public var bank: UInt = 0u,
    public var mciStatus: ULong = 0uL,
    public var errorType: UInt = 0u,
)

public data class WheapGenericErrMemMapEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var mapReason: ByteArray = ByteArray(32),
    public var physicalAddress: ULong = 0uL,
    public var length: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheapGenericErrMemMapEvent) return false
        if (this.wheaEventLogEntry != other.wheaEventLogEntry) return false
        if (!this.mapReason.contentEquals(other.mapReason)) return false
        if (this.physicalAddress != other.physicalAddress) return false
        if (this.length != other.length) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wheaEventLogEntry.hashCode()
        result = 31 * result + this.mapReason.contentHashCode()
        result = 31 * result + this.physicalAddress.hashCode()
        result = 31 * result + this.length.hashCode()
        return result
    }
}

public data class WheapOscImplemented(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var oscImplemented: Boolean = false,
    public var debugChecked: Boolean = false,
)

public data class WheapPcieConfigInfo(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var segment: UInt = 0u,
    public var bus: UInt = 0u,
    public var device: UInt = 0u,
    public var function: UInt = 0u,
    public var offset: UInt = 0u,
    public var length: UInt = 0u,
    public var value: ULong = 0uL,
    public var succeeded: UByte = 0u,
    public var reserved: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheapPcieConfigInfo) return false
        if (this.wheaEventLogEntry != other.wheaEventLogEntry) return false
        if (this.segment != other.segment) return false
        if (this.bus != other.bus) return false
        if (this.device != other.device) return false
        if (this.function != other.function) return false
        if (this.offset != other.offset) return false
        if (this.length != other.length) return false
        if (this.value != other.value) return false
        if (this.succeeded != other.succeeded) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wheaEventLogEntry.hashCode()
        result = 31 * result + this.segment.hashCode()
        result = 31 * result + this.bus.hashCode()
        result = 31 * result + this.device.hashCode()
        result = 31 * result + this.function.hashCode()
        result = 31 * result + this.offset.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.value.hashCode()
        result = 31 * result + this.succeeded.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class WheapPcieOverrideInfo(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var segment: UInt = 0u,
    public var bus: UInt = 0u,
    public var device: UInt = 0u,
    public var function: UInt = 0u,
    public var validBits: UByte = 0u,
    public var reserved: UByteArray = UByteArray(3),
    public var uncorrectableErrorMask: UInt = 0u,
    public var uncorrectableErrorSeverity: UInt = 0u,
    public var correctableErrorMask: UInt = 0u,
    public var capAndControl: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheapPcieOverrideInfo) return false
        if (this.wheaEventLogEntry != other.wheaEventLogEntry) return false
        if (this.segment != other.segment) return false
        if (this.bus != other.bus) return false
        if (this.device != other.device) return false
        if (this.function != other.function) return false
        if (this.validBits != other.validBits) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.uncorrectableErrorMask != other.uncorrectableErrorMask) return false
        if (this.uncorrectableErrorSeverity != other.uncorrectableErrorSeverity) return false
        if (this.correctableErrorMask != other.correctableErrorMask) return false
        if (this.capAndControl != other.capAndControl) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wheaEventLogEntry.hashCode()
        result = 31 * result + this.segment.hashCode()
        result = 31 * result + this.bus.hashCode()
        result = 31 * result + this.device.hashCode()
        result = 31 * result + this.function.hashCode()
        result = 31 * result + this.validBits.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.uncorrectableErrorMask.hashCode()
        result = 31 * result + this.uncorrectableErrorSeverity.hashCode()
        result = 31 * result + this.correctableErrorMask.hashCode()
        result = 31 * result + this.capAndControl.hashCode()
        return result
    }
}

public data class WheapPcieReadOverridesErr(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var failureReason: UInt = 0u,
    public var failureStatus: Ntstatus = 0,
)

public data class WheapPfaMemoryOfflined(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var decisionType: WheapPfaOfflineDecisionType = 0,
    public var immediateSuccess: Boolean = false,
    public var page: UInt = 0u,
)

public data class WheapPfaMemoryPolicy(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var registryKeysPresent: UInt = 0u,
    public var disableOffline: Boolean = false,
    public var persistOffline: Boolean = false,
    public var pfaDisabled: Boolean = false,
    public var pageCount: UInt = 0u,
    public var errorThreshold: UInt = 0u,
    public var timeOut: UInt = 0u,
)

public data class WheapPfaMemoryRemoveMonitor(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var removeTrigger: WheaPfaRemoveTrigger = 0,
    public var timeInList: UInt = 0u,
    public var errorCount: UInt = 0u,
    public var page: UInt = 0u,
)

public data class WheapPluginDefectListCorrupt(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
)

public data class WheapPluginDefectListFullEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
)

public data class WheapPluginDefectListUefiVarFailed(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
)

public data class WheapPluginPfaEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var noFurtherPfa: Boolean = false,
)

public data class WheapProcessEinjEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var error: ByteArray = ByteArray(32),
    public var injectionActionTableValid: Boolean = false,
    public var beginInjectionInstructionCount: UInt = 0u,
    public var getTriggerErrorActionTableInstructionCount: UInt = 0u,
    public var setErrorTypeInstructionCount: UInt = 0u,
    public var getErrorTypeInstructionCount: UInt = 0u,
    public var endOperationInstructionCount: UInt = 0u,
    public var executeOperationInstructionCount: UInt = 0u,
    public var checkBusyStatusInstructionCount: UInt = 0u,
    public var getCommandStatusInstructionCount: UInt = 0u,
    public var setErrorTypeWithAddressInstructionCount: UInt = 0u,
    public var getExecuteOperationTimingsInstructionCount: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheapProcessEinjEvent) return false
        if (this.wheaEventLogEntry != other.wheaEventLogEntry) return false
        if (!this.error.contentEquals(other.error)) return false
        if (this.injectionActionTableValid != other.injectionActionTableValid) return false
        if (this.beginInjectionInstructionCount != other.beginInjectionInstructionCount) return false
        if (this.getTriggerErrorActionTableInstructionCount != other.getTriggerErrorActionTableInstructionCount) return false
        if (this.setErrorTypeInstructionCount != other.setErrorTypeInstructionCount) return false
        if (this.getErrorTypeInstructionCount != other.getErrorTypeInstructionCount) return false
        if (this.endOperationInstructionCount != other.endOperationInstructionCount) return false
        if (this.executeOperationInstructionCount != other.executeOperationInstructionCount) return false
        if (this.checkBusyStatusInstructionCount != other.checkBusyStatusInstructionCount) return false
        if (this.getCommandStatusInstructionCount != other.getCommandStatusInstructionCount) return false
        if (this.setErrorTypeWithAddressInstructionCount != other.setErrorTypeWithAddressInstructionCount) return false
        if (this.getExecuteOperationTimingsInstructionCount != other.getExecuteOperationTimingsInstructionCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wheaEventLogEntry.hashCode()
        result = 31 * result + this.error.contentHashCode()
        result = 31 * result + this.injectionActionTableValid.hashCode()
        result = 31 * result + this.beginInjectionInstructionCount.hashCode()
        result = 31 * result + this.getTriggerErrorActionTableInstructionCount.hashCode()
        result = 31 * result + this.setErrorTypeInstructionCount.hashCode()
        result = 31 * result + this.getErrorTypeInstructionCount.hashCode()
        result = 31 * result + this.endOperationInstructionCount.hashCode()
        result = 31 * result + this.executeOperationInstructionCount.hashCode()
        result = 31 * result + this.checkBusyStatusInstructionCount.hashCode()
        result = 31 * result + this.getCommandStatusInstructionCount.hashCode()
        result = 31 * result + this.setErrorTypeWithAddressInstructionCount.hashCode()
        result = 31 * result + this.getExecuteOperationTimingsInstructionCount.hashCode()
        return result
    }
}

public data class WheapProcessHestEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var error: ByteArray = ByteArray(32),
    public var entryType: ByteArray = ByteArray(32),
    public var entryIndex: UInt = 0u,
    public var hestValid: Boolean = false,
    public var cmcCount: UInt = 0u,
    public var mceCount: UInt = 0u,
    public var nmiCount: UInt = 0u,
    public var aerRootCount: UInt = 0u,
    public var aerBridgeCount: UInt = 0u,
    public var aerEndPointCount: UInt = 0u,
    public var genericV1Count: UInt = 0u,
    public var genericV2Count: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheapProcessHestEvent) return false
        if (this.wheaEventLogEntry != other.wheaEventLogEntry) return false
        if (!this.error.contentEquals(other.error)) return false
        if (!this.entryType.contentEquals(other.entryType)) return false
        if (this.entryIndex != other.entryIndex) return false
        if (this.hestValid != other.hestValid) return false
        if (this.cmcCount != other.cmcCount) return false
        if (this.mceCount != other.mceCount) return false
        if (this.nmiCount != other.nmiCount) return false
        if (this.aerRootCount != other.aerRootCount) return false
        if (this.aerBridgeCount != other.aerBridgeCount) return false
        if (this.aerEndPointCount != other.aerEndPointCount) return false
        if (this.genericV1Count != other.genericV1Count) return false
        if (this.genericV2Count != other.genericV2Count) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wheaEventLogEntry.hashCode()
        result = 31 * result + this.error.contentHashCode()
        result = 31 * result + this.entryType.contentHashCode()
        result = 31 * result + this.entryIndex.hashCode()
        result = 31 * result + this.hestValid.hashCode()
        result = 31 * result + this.cmcCount.hashCode()
        result = 31 * result + this.mceCount.hashCode()
        result = 31 * result + this.nmiCount.hashCode()
        result = 31 * result + this.aerRootCount.hashCode()
        result = 31 * result + this.aerBridgeCount.hashCode()
        result = 31 * result + this.aerEndPointCount.hashCode()
        result = 31 * result + this.genericV1Count.hashCode()
        result = 31 * result + this.genericV2Count.hashCode()
        return result
    }
}

public data class WheapPshedInjectError(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var errorType: UInt = 0u,
    public var parameter1: ULong = 0uL,
    public var parameter2: ULong = 0uL,
    public var parameter3: ULong = 0uL,
    public var parameter4: ULong = 0uL,
    public var injectionStatus: Ntstatus = 0,
    public var injectionAttempted: Boolean = false,
    public var injectionByPlugin: Boolean = false,
)

public data class WheapPshedPluginRegister(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var version: UInt = 0u,
    public var length: UInt = 0u,
    public var functionalAreaMask: UInt = 0u,
    public var status: Ntstatus = 0,
)

public data class WheapRowFailureEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var lowOrderPage: UInt = 0u,
    public var highOrderPage: UInt = 0u,
)

public data class WheapSpuriousAerEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var errorSeverity: WheaErrorSeverity = 0,
    public var errorHandlerType: UInt = 0u,
    public var spuriousErrorSourceId: UInt = 0u,
    public var rootErrorCommand: UInt = 0u,
    public var rootErrorStatus: UInt = 0u,
    public var deviceAssociationBitmap: UInt = 0u,
)

public class WheapStartedReportHwError internal constructor(
    public var wheaEventLogEntry: WheaEventLogEntry,
    errorPacketCtorArg: MutPtr<WheaErrorPacketV2>,
) {
    public var errorPacket: MutPtr<WheaErrorPacketV2> = errorPacketCtorArg
        internal set

    public constructor() : this(
        wheaEventLogEntry = WheaEventLogEntry(),
        errorPacketCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WheaEventLogEntry = this.wheaEventLogEntry

    public operator fun component2(): MutPtr<WheaErrorPacketV2> = this.errorPacket

    public fun copy(wheaEventLogEntry: WheaEventLogEntry = this.wheaEventLogEntry, errorPacket: MutPtr<WheaErrorPacketV2> = this.errorPacket): WheapStartedReportHwError = WheapStartedReportHwError(wheaEventLogEntry = wheaEventLogEntry, errorPacketCtorArg = errorPacket)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheapStartedReportHwError) return false
        if (this.wheaEventLogEntry != other.wheaEventLogEntry) return false
        if (this.errorPacket != other.errorPacket) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wheaEventLogEntry.hashCode()
        result = 31 * result + this.errorPacket.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
            errorPacket: MutPtr<WheaErrorPacketV2> = MutPtr(0L),
        ): WheapStartedReportHwError =
            WheapStartedReportHwError(
                wheaEventLogEntry = wheaEventLogEntry,
                errorPacketCtorArg = errorPacket,
            )
    }
}

public data class WheapStuckErrorEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var epIndex: UInt = 0u,
    public var bank: UInt = 0u,
    public var mciStatus: ULong = 0uL,
)

public data class WheaAcpiHeader(
    public var signature: UInt = 0u,
    public var length: UInt = 0u,
    public var revision: UByte = 0u,
    public var checksum: UByte = 0u,
    public var oemId: UByteArray = UByteArray(6),
    public var oemTableId: ULong = 0uL,
    public var oemRevision: UInt = 0u,
    public var creatorId: UInt = 0u,
    public var creatorRevision: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaAcpiHeader) return false
        if (this.signature != other.signature) return false
        if (this.length != other.length) return false
        if (this.revision != other.revision) return false
        if (this.checksum != other.checksum) return false
        if (!this.oemId.contentEquals(other.oemId)) return false
        if (this.oemTableId != other.oemTableId) return false
        if (this.oemRevision != other.oemRevision) return false
        if (this.creatorId != other.creatorId) return false
        if (this.creatorRevision != other.creatorRevision) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.signature.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.revision.hashCode()
        result = 31 * result + this.checksum.hashCode()
        result = 31 * result + this.oemId.contentHashCode()
        result = 31 * result + this.oemTableId.hashCode()
        result = 31 * result + this.oemRevision.hashCode()
        result = 31 * result + this.creatorId.hashCode()
        result = 31 * result + this.creatorRevision.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaAcpiHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaAcpiHeader> {
                override val sizeBytes: Long = 36L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaAcpiHeader =
                    WheaAcpiHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: WheaAcpiHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.signature)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.revision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.checksum)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 10L, value.oemId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.oemTableId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.oemRevision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.creatorId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.creatorRevision)
                }
            }
    }
}

public data class WheaAmdExtendedRegisters(
    public var ipid: ULong = 0uL,
    public var synd: ULong = 0uL,
    public var config: ULong = 0uL,
    public var destat: ULong = 0uL,
    public var deaddr: ULong = 0uL,
    public var misc1: ULong = 0uL,
    public var misc2: ULong = 0uL,
    public var misc3: ULong = 0uL,
    public var misc4: ULong = 0uL,
    public var rasCap: ULong = 0uL,
    public var reserved: ULongArray = ULongArray(14),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaAmdExtendedRegisters) return false
        if (this.ipid != other.ipid) return false
        if (this.synd != other.synd) return false
        if (this.config != other.config) return false
        if (this.destat != other.destat) return false
        if (this.deaddr != other.deaddr) return false
        if (this.misc1 != other.misc1) return false
        if (this.misc2 != other.misc2) return false
        if (this.misc3 != other.misc3) return false
        if (this.misc4 != other.misc4) return false
        if (this.rasCap != other.rasCap) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ipid.hashCode()
        result = 31 * result + this.synd.hashCode()
        result = 31 * result + this.config.hashCode()
        result = 31 * result + this.destat.hashCode()
        result = 31 * result + this.deaddr.hashCode()
        result = 31 * result + this.misc1.hashCode()
        result = 31 * result + this.misc2.hashCode()
        result = 31 * result + this.misc3.hashCode()
        result = 31 * result + this.misc4.hashCode()
        result = 31 * result + this.rasCap.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaAmdExtendedRegisters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaAmdExtendedRegisters> {
                override val sizeBytes: Long = 192L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaAmdExtendedRegisters =
                    WheaAmdExtendedRegisters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (14).toInt())
                        ).readNative(addr + 80L),
                    )
                override fun writeNative(addr: Long, value: WheaAmdExtendedRegisters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.ipid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.synd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.config)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.destat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.deaddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.misc1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.misc2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.misc3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.misc4)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.rasCap)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (14).toInt())
                    ).writeNative(addr + 80L, value.reserved)
                }
            }
    }
}

public data class WheaArmv8Aarch32Gprs(
    public var r0: UInt = 0u,
    public var r1: UInt = 0u,
    public var r2: UInt = 0u,
    public var r3: UInt = 0u,
    public var r4: UInt = 0u,
    public var r5: UInt = 0u,
    public var r6: UInt = 0u,
    public var r7: UInt = 0u,
    public var r8: UInt = 0u,
    public var r9: UInt = 0u,
    public var r10: UInt = 0u,
    public var r11: UInt = 0u,
    public var r12: UInt = 0u,
    public var r13: UInt = 0u,
    public var r14: UInt = 0u,
    public var r15: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaArmv8Aarch32Gprs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaArmv8Aarch32Gprs> {
                override val sizeBytes: Long = 64L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaArmv8Aarch32Gprs =
                    WheaArmv8Aarch32Gprs(
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
                    )
                override fun writeNative(addr: Long, value: WheaArmv8Aarch32Gprs) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.r0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.r1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.r2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.r3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.r4)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.r5)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.r6)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.r7)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.r8)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.r9)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.r10)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.r11)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.r12)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.r13)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.r14)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.r15)
                }
            }
    }
}

public data class WheaArmv8Aarch64El3Csr(
    public var elrEl3: ULong = 0uL,
    public var esrEl3: ULong = 0uL,
    public var farEl3: ULong = 0uL,
    public var mairEl3: ULong = 0uL,
    public var sctlrEl3: ULong = 0uL,
    public var spEl3: ULong = 0uL,
    public var spsrEl3: ULong = 0uL,
    public var tcrEl3: ULong = 0uL,
    public var tpidrEl3: ULong = 0uL,
    public var ttbr0El3: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaArmv8Aarch64El3Csr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaArmv8Aarch64El3Csr> {
                override val sizeBytes: Long = 80L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaArmv8Aarch64El3Csr =
                    WheaArmv8Aarch64El3Csr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                    )
                override fun writeNative(addr: Long, value: WheaArmv8Aarch64El3Csr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.elrEl3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.esrEl3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.farEl3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.mairEl3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.sctlrEl3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.spEl3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.spsrEl3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.tcrEl3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.tpidrEl3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.ttbr0El3)
                }
            }
    }
}

public class WheaArmv8Aarch64Gprs(
    public var x0: ULong = 0uL,
    public var x1: ULong = 0uL,
    public var x2: ULong = 0uL,
    public var x3: ULong = 0uL,
    public var x4: ULong = 0uL,
    public var x5: ULong = 0uL,
    public var x6: ULong = 0uL,
    public var x7: ULong = 0uL,
    public var x8: ULong = 0uL,
    public var x9: ULong = 0uL,
    public var x10: ULong = 0uL,
    public var x11: ULong = 0uL,
    public var x12: ULong = 0uL,
    public var x13: ULong = 0uL,
    public var x14: ULong = 0uL,
    public var x15: ULong = 0uL,
    public var x16: ULong = 0uL,
    public var x17: ULong = 0uL,
    public var x18: ULong = 0uL,
    public var x19: ULong = 0uL,
    public var x20: ULong = 0uL,
    public var x21: ULong = 0uL,
    public var x22: ULong = 0uL,
    public var x23: ULong = 0uL,
    public var x24: ULong = 0uL,
    public var x25: ULong = 0uL,
    public var x26: ULong = 0uL,
    public var x27: ULong = 0uL,
    public var x28: ULong = 0uL,
    public var x29: ULong = 0uL,
    public var x30: ULong = 0uL,
    public var sp: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaArmv8Aarch64Gprs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaArmv8Aarch64Gprs> {
                override val sizeBytes: Long = 256L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaArmv8Aarch64Gprs =
                    WheaArmv8Aarch64Gprs(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 144L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 152L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 160L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 168L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 176L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 184L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 192L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 200L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 208L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 216L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 224L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 232L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 240L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 248L),
                    )
                override fun writeNative(addr: Long, value: WheaArmv8Aarch64Gprs) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.x0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.x1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.x2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.x3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.x4)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.x5)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.x6)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.x7)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.x8)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.x9)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.x10)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.x11)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 96L, value.x12)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 104L, value.x13)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 112L, value.x14)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 120L, value.x15)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 128L, value.x16)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 136L, value.x17)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 144L, value.x18)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 152L, value.x19)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 160L, value.x20)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 168L, value.x21)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 176L, value.x22)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 184L, value.x23)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 192L, value.x24)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 200L, value.x25)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 208L, value.x26)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 216L, value.x27)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 224L, value.x28)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 232L, value.x29)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 240L, value.x30)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 248L, value.sp)
                }
            }
    }
}

public class WheaArmAarch32El1Csr(
    public var dfar: UInt = 0u,
    public var dfsr: UInt = 0u,
    public var ifar: UInt = 0u,
    public var isr: UInt = 0u,
    public var mair0: UInt = 0u,
    public var mair1: UInt = 0u,
    public var midr: UInt = 0u,
    public var mpidr: UInt = 0u,
    public var nmrr: UInt = 0u,
    public var prrr: UInt = 0u,
    public var sctlr: UInt = 0u,
    public var spsr: UInt = 0u,
    public var spsrAbt: UInt = 0u,
    public var spsrFiq: UInt = 0u,
    public var spsrIrq: UInt = 0u,
    public var spsrSvc: UInt = 0u,
    public var spsrUnd: UInt = 0u,
    public var tpidrprw: UInt = 0u,
    public var tpidruro: UInt = 0u,
    public var tpidrurw: UInt = 0u,
    public var ttbcr: UInt = 0u,
    public var ttbr0: UInt = 0u,
    public var ttbr1: UInt = 0u,
    public var dacr: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaArmAarch32El1Csr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaArmAarch32El1Csr> {
                override val sizeBytes: Long = 96L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaArmAarch32El1Csr =
                    WheaArmAarch32El1Csr(
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 84L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 92L),
                    )
                override fun writeNative(addr: Long, value: WheaArmAarch32El1Csr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dfar)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dfsr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ifar)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.isr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.mair0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.mair1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.midr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.mpidr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.nmrr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.prrr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.sctlr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.spsr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.spsrAbt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.spsrFiq)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.spsrIrq)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.spsrSvc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.spsrUnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.tpidrprw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.tpidruro)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.tpidrurw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.ttbcr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 84L, value.ttbr0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 88L, value.ttbr1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 92L, value.dacr)
                }
            }
    }
}

public data class WheaArmAarch32El2Csr(
    public var elrHyp: UInt = 0u,
    public var hamair0: UInt = 0u,
    public var hamair1: UInt = 0u,
    public var hcr: UInt = 0u,
    public var hcr2: UInt = 0u,
    public var hdfar: UInt = 0u,
    public var hifar: UInt = 0u,
    public var hpfar: UInt = 0u,
    public var hsr: UInt = 0u,
    public var htcr: UInt = 0u,
    public var htpidr: UInt = 0u,
    public var httbr: UInt = 0u,
    public var spsrHyp: UInt = 0u,
    public var vtcr: UInt = 0u,
    public var vttbr: UInt = 0u,
    public var dacr32El2: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaArmAarch32El2Csr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaArmAarch32El2Csr> {
                override val sizeBytes: Long = 64L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaArmAarch32El2Csr =
                    WheaArmAarch32El2Csr(
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
                    )
                override fun writeNative(addr: Long, value: WheaArmAarch32El2Csr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.elrHyp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.hamair0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.hamair1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.hcr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.hcr2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.hdfar)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.hifar)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.hpfar)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.hsr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.htcr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.htpidr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.httbr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.spsrHyp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.vtcr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.vttbr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.dacr32El2)
                }
            }
    }
}

public data class WheaArmAarch32SecureCsr(
    public var sctlr: UInt = 0u,
    public var spsrMon: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaArmAarch32SecureCsr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaArmAarch32SecureCsr> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaArmAarch32SecureCsr =
                    WheaArmAarch32SecureCsr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WheaArmAarch32SecureCsr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sctlr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.spsrMon)
                }
            }
    }
}

public class WheaArmAarch64El1Csr(
    public var elrEl1: ULong = 0uL,
    public var esrEl2: ULong = 0uL,
    public var farEl1: ULong = 0uL,
    public var isrEl1: ULong = 0uL,
    public var mairEl1: ULong = 0uL,
    public var midrEl1: ULong = 0uL,
    public var mpidrEl1: ULong = 0uL,
    public var sctlrEl1: ULong = 0uL,
    public var spEl0: ULong = 0uL,
    public var spEl1: ULong = 0uL,
    public var spsrEl1: ULong = 0uL,
    public var tcrEl1: ULong = 0uL,
    public var tpidrEl0: ULong = 0uL,
    public var tpidrEl1: ULong = 0uL,
    public var tpidrroEl0: ULong = 0uL,
    public var ttbr0El1: ULong = 0uL,
    public var ttbr1El1: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaArmAarch64El1Csr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaArmAarch64El1Csr> {
                override val sizeBytes: Long = 136L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaArmAarch64El1Csr =
                    WheaArmAarch64El1Csr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 128L),
                    )
                override fun writeNative(addr: Long, value: WheaArmAarch64El1Csr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.elrEl1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.esrEl2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.farEl1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.isrEl1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.mairEl1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.midrEl1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.mpidrEl1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.sctlrEl1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.spEl0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.spEl1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.spsrEl1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.tcrEl1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 96L, value.tpidrEl0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 104L, value.tpidrEl1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 112L, value.tpidrroEl0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 120L, value.ttbr0El1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 128L, value.ttbr1El1)
                }
            }
    }
}

public data class WheaArmAarch64El2Csr(
    public var elrEl2: ULong = 0uL,
    public var esrEl2: ULong = 0uL,
    public var farEl2: ULong = 0uL,
    public var hacrEl2: ULong = 0uL,
    public var hcrEl2: ULong = 0uL,
    public var hpfarEl2: ULong = 0uL,
    public var mairEl2: ULong = 0uL,
    public var sctlrEl2: ULong = 0uL,
    public var spEl2: ULong = 0uL,
    public var spsrEl2: ULong = 0uL,
    public var tcrEl2: ULong = 0uL,
    public var tpidrEl2: ULong = 0uL,
    public var ttbr0El2: ULong = 0uL,
    public var vtcrEl2: ULong = 0uL,
    public var vttbrEl2: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaArmAarch64El2Csr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaArmAarch64El2Csr> {
                override val sizeBytes: Long = 120L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaArmAarch64El2Csr =
                    WheaArmAarch64El2Csr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 112L),
                    )
                override fun writeNative(addr: Long, value: WheaArmAarch64El2Csr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.elrEl2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.esrEl2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.farEl2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.hacrEl2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.hcrEl2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.hpfarEl2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.mairEl2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.sctlrEl2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.spEl2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.spsrEl2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.tcrEl2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.tpidrEl2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 96L, value.ttbr0El2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 104L, value.vtcrEl2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 112L, value.vttbrEl2)
                }
            }
    }
}

public data class WheaArmBusError(
    public var validationBit: WheaArmBusErrorValidBits = WheaArmBusErrorValidBits(),
    public var bitfield1: UByte = 0u,
    public var bitfield2: UByte = 0u,
    public var bitfield3: UByte = 0u,
    public var bitfield4: UShort = 0u,
    public var bitfield5: UByte = 0u,
    public var bitfield6: UInt = 0u,
)

public data class WheaArmBusErrorValidBits(
    public var anonymous: WheaArmBusErrorValidBits0 = WheaArmBusErrorValidBits0(),
    public var asUSHORT: UShort = 0u,
)

public data class WheaArmBusErrorValidBits0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaArmBusErrorValidBits0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaArmBusErrorValidBits0> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaArmBusErrorValidBits0 =
                    WheaArmBusErrorValidBits0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WheaArmBusErrorValidBits0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WheaArmCacheError(
    public var validationBit: WheaArmCacheErrorValidBits = WheaArmCacheErrorValidBits(),
    public var bitfield1: UByte = 0u,
    public var bitfield2: UByte = 0u,
    public var bitfield3: ULong = 0uL,
)

public data class WheaArmCacheErrorValidBits(
    public var anonymous: WheaArmCacheErrorValidBits0 = WheaArmCacheErrorValidBits0(),
    public var asUSHORT: UShort = 0u,
)

public data class WheaArmCacheErrorValidBits0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaArmCacheErrorValidBits0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaArmCacheErrorValidBits0> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaArmCacheErrorValidBits0 =
                    WheaArmCacheErrorValidBits0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WheaArmCacheErrorValidBits0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WheaArmMiscCsr(
    public var mRSEncoding: UShort = 0u,
    public var value: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaArmMiscCsr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaArmMiscCsr> {
                override val sizeBytes: Long = 10L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaArmMiscCsr =
                    WheaArmMiscCsr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: WheaArmMiscCsr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.mRSEncoding)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 2L, value.value)
                }
            }
    }
}

public data class WheaArmProcessorError(
    public var cacheError: WheaArmCacheError = WheaArmCacheError(),
    public var tlbError: WheaArmTlbError = WheaArmTlbError(),
    public var busError: WheaArmBusError = WheaArmBusError(),
    public var asULONGLONG: ULong = 0uL,
)

public data class WheaArmProcessorErrorContextInformationHeader(
    public var version: UShort = 0u,
    public var registerContextType: UShort = 0u,
    public var registerArraySize: UInt = 0u,
    public var registerArray: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaArmProcessorErrorContextInformationHeader) return false
        if (this.version != other.version) return false
        if (this.registerContextType != other.registerContextType) return false
        if (this.registerArraySize != other.registerArraySize) return false
        if (!this.registerArray.contentEquals(other.registerArray)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.registerContextType.hashCode()
        result = 31 * result + this.registerArraySize.hashCode()
        result = 31 * result + this.registerArray.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaArmProcessorErrorContextInformationHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaArmProcessorErrorContextInformationHeader> {
                override val sizeBytes: Long = 9L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaArmProcessorErrorContextInformationHeader =
                    WheaArmProcessorErrorContextInformationHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WheaArmProcessorErrorContextInformationHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.registerContextType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.registerArraySize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 8L, value.registerArray)
                }
            }
    }
}

public data class WheaArmProcessorErrorContextInformationHeaderFlags(
    public var anonymous: WheaArmProcessorErrorContextInformationHeaderFlags0 = WheaArmProcessorErrorContextInformationHeaderFlags0(),
    public var asULONG: UInt = 0u,
)

public data class WheaArmProcessorErrorContextInformationHeaderFlags0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaArmProcessorErrorContextInformationHeaderFlags0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaArmProcessorErrorContextInformationHeaderFlags0> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaArmProcessorErrorContextInformationHeaderFlags0 =
                    WheaArmProcessorErrorContextInformationHeaderFlags0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WheaArmProcessorErrorContextInformationHeaderFlags0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WheaArmProcessorErrorInformation(
    public var version: UByte = 0u,
    public var length: UByte = 0u,
    public var validationBit: WheaArmProcessorErrorInformationValidBits = WheaArmProcessorErrorInformationValidBits(),
    public var type: UByte = 0u,
    public var multipleError: UShort = 0u,
    public var flags: UByte = 0u,
    public var errorInformation: ULong = 0uL,
    public var virtualFaultAddress: ULong = 0uL,
    public var physicalFaultAddress: ULong = 0uL,
)

public data class WheaArmProcessorErrorInformationValidBits(
    public var anonymous: WheaArmProcessorErrorInformationValidBits0 = WheaArmProcessorErrorInformationValidBits0(),
    public var asUSHORT: UShort = 0u,
)

public data class WheaArmProcessorErrorInformationValidBits0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaArmProcessorErrorInformationValidBits0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaArmProcessorErrorInformationValidBits0> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaArmProcessorErrorInformationValidBits0 =
                    WheaArmProcessorErrorInformationValidBits0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WheaArmProcessorErrorInformationValidBits0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WheaArmProcessorErrorSection(
    public var validBits: WheaArmProcessorErrorSectionValidBits = WheaArmProcessorErrorSectionValidBits(),
    public var errorInformationStructures: UShort = 0u,
    public var contextInformationStructures: UShort = 0u,
    public var sectionLength: UInt = 0u,
    public var errorAffinityLevel: UByte = 0u,
    public var reserved: UByteArray = UByteArray(3),
    public var mpidrEl1: ULong = 0uL,
    public var midrEl1: ULong = 0uL,
    public var runningState: UInt = 0u,
    public var pSCIState: UInt = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaArmProcessorErrorSection) return false
        if (this.validBits != other.validBits) return false
        if (this.errorInformationStructures != other.errorInformationStructures) return false
        if (this.contextInformationStructures != other.contextInformationStructures) return false
        if (this.sectionLength != other.sectionLength) return false
        if (this.errorAffinityLevel != other.errorAffinityLevel) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.mpidrEl1 != other.mpidrEl1) return false
        if (this.midrEl1 != other.midrEl1) return false
        if (this.runningState != other.runningState) return false
        if (this.pSCIState != other.pSCIState) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.validBits.hashCode()
        result = 31 * result + this.errorInformationStructures.hashCode()
        result = 31 * result + this.contextInformationStructures.hashCode()
        result = 31 * result + this.sectionLength.hashCode()
        result = 31 * result + this.errorAffinityLevel.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.mpidrEl1.hashCode()
        result = 31 * result + this.midrEl1.hashCode()
        result = 31 * result + this.runningState.hashCode()
        result = 31 * result + this.pSCIState.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class WheaArmProcessorErrorSectionValidBits(
    public var anonymous: WheaArmProcessorErrorSectionValidBits0 = WheaArmProcessorErrorSectionValidBits0(),
    public var asULONG: UInt = 0u,
)

public data class WheaArmProcessorErrorSectionValidBits0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaArmProcessorErrorSectionValidBits0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaArmProcessorErrorSectionValidBits0> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaArmProcessorErrorSectionValidBits0 =
                    WheaArmProcessorErrorSectionValidBits0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WheaArmProcessorErrorSectionValidBits0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WheaArmTlbError(
    public var validationBit: WheaArmTlbErrorValidBits = WheaArmTlbErrorValidBits(),
    public var bitfield1: UByte = 0u,
    public var bitfield2: UByte = 0u,
    public var bitfield3: ULong = 0uL,
)

public data class WheaArmTlbErrorValidBits(
    public var anonymous: WheaArmTlbErrorValidBits0 = WheaArmTlbErrorValidBits0(),
    public var asUSHORT: UShort = 0u,
)

public data class WheaArmTlbErrorValidBits0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaArmTlbErrorValidBits0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaArmTlbErrorValidBits0> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaArmTlbErrorValidBits0 =
                    WheaArmTlbErrorValidBits0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WheaArmTlbErrorValidBits0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WheaAzccRootBusErrEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var maxBusCountPassed: Boolean = false,
    public var invalidBusMSR: Boolean = false,
)

public data class WheaAzccRootBusListEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var rootBusCount: UInt = 0u,
    public var rootBuses: UIntArray = UIntArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaAzccRootBusListEvent) return false
        if (this.wheaEventLogEntry != other.wheaEventLogEntry) return false
        if (this.rootBusCount != other.rootBusCount) return false
        if (!this.rootBuses.contentEquals(other.rootBuses)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wheaEventLogEntry.hashCode()
        result = 31 * result + this.rootBusCount.hashCode()
        result = 31 * result + this.rootBuses.contentHashCode()
        return result
    }
}

public data class WheaAzccSetPoisonEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var bus: UInt = 0u,
    public var readSuccess: Boolean = false,
    public var writeSuccess: Boolean = false,
    public var isEnable: Boolean = false,
)

public data class WheaErrorInjectionCapabilities(
    public var anonymous: WheaErrorInjectionCapabilities0 = WheaErrorInjectionCapabilities0(),
    public var asULONG: UInt = 0u,
)

public data class WheaErrorInjectionCapabilities0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaErrorInjectionCapabilities0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaErrorInjectionCapabilities0> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WheaErrorInjectionCapabilities0 =
                    WheaErrorInjectionCapabilities0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WheaErrorInjectionCapabilities0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WheaErrorPacketFlags(
    public var anonymous: WheaErrorPacketFlags0 = WheaErrorPacketFlags0(),
    public var asULONG: UInt = 0u,
)

public data class WheaErrorPacketFlags0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaErrorPacketFlags0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaErrorPacketFlags0> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaErrorPacketFlags0 =
                    WheaErrorPacketFlags0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WheaErrorPacketFlags0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class WheaErrorPacketV1(
    public var signature: UInt = 0u,
    public var flags: WheaErrorPacketFlags = WheaErrorPacketFlags(),
    public var size: UInt = 0u,
    public var rawDataLength: UInt = 0u,
    public var reserved1: ULong = 0uL,
    public var context: ULong = 0uL,
    public var errorType: WheaErrorType = 0,
    public var errorSeverity: WheaErrorSeverity = 0,
    public var errorSourceId: UInt = 0u,
    public var errorSourceType: WheaErrorSourceType = 0,
    public var reserved2: UInt = 0u,
    public var version: UInt = 0u,
    public var cpu: ULong = 0uL,
    public var u: WheaErrorPacketV10 = WheaErrorPacketV10(),
    public var rawDataFormat: WheaRawDataFormat = 0,
    public var rawDataOffset: UInt = 0u,
    public var rawData: UByteArray = UByteArray(1),
)

public data class WheaErrorPacketV10(
    public var processorError: WheaProcessorGenericErrorSection = WheaProcessorGenericErrorSection(),
    public var memoryError: WheaMemoryErrorSection = WheaMemoryErrorSection(),
    public var nmiError: WheaNmiErrorSection = WheaNmiErrorSection(),
    public var pciExpressError: WheaPciexpressErrorSection = WheaPciexpressErrorSection(),
    public var pciXBusError: WheaPcixbusErrorSection = WheaPcixbusErrorSection(),
    public var pciXDeviceError: WheaPcixdeviceErrorSection = WheaPcixdeviceErrorSection(),
    public var pmemError: WheaPmemErrorSection = WheaPmemErrorSection(),
)

public data class WheaErrorPacketV2(
    public var signature: UInt = 0u,
    public var version: UInt = 0u,
    public var length: UInt = 0u,
    public var flags: WheaErrorPacketFlags = WheaErrorPacketFlags(),
    public var errorType: WheaErrorType = 0,
    public var errorSeverity: WheaErrorSeverity = 0,
    public var errorSourceId: UInt = 0u,
    public var errorSourceType: WheaErrorSourceType = 0,
    public var notifyType: Guid = Guid(),
    public var context: ULong = 0uL,
    public var dataFormat: WheaErrorPacketDataFormat = 0,
    public var reserved1: UInt = 0u,
    public var dataOffset: UInt = 0u,
    public var dataLength: UInt = 0u,
    public var pshedDataOffset: UInt = 0u,
    public var pshedDataLength: UInt = 0u,
)

public data class WheaErrorRecord(
    public var header: WheaErrorRecordHeader = WheaErrorRecordHeader(),
    public var sectionDescriptor: List<WheaErrorRecordSectionDescriptor> = List(1) { WheaErrorRecordSectionDescriptor() },
)

public data class WheaErrorRecordHeader(
    public var signature: UInt = 0u,
    public var revision: WheaRevision = WheaRevision(),
    public var signatureEnd: UInt = 0u,
    public var sectionCount: UShort = 0u,
    public var severity: WheaErrorSeverity = 0,
    public var validBits: WheaErrorRecordHeaderValidbits = WheaErrorRecordHeaderValidbits(),
    public var length: UInt = 0u,
    public var timestamp: WheaTimestamp = WheaTimestamp(),
    public var platformId: Guid = Guid(),
    public var partitionId: Guid = Guid(),
    public var creatorId: Guid = Guid(),
    public var notifyType: Guid = Guid(),
    public var recordId: ULong = 0uL,
    public var flags: WheaErrorRecordHeaderFlags = WheaErrorRecordHeaderFlags(),
    public var persistenceInfo: WheaPersistenceInfo = WheaPersistenceInfo(),
    public var anonymous: WheaErrorRecordHeader0 = WheaErrorRecordHeader0(),
)

public data class WheaErrorRecordHeader0(
    public var anonymous: WheaErrorRecordHeader00 = WheaErrorRecordHeader00(),
    public var reserved: UByteArray = UByteArray(12),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaErrorRecordHeader0) return false
        if (this.anonymous != other.anonymous) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class WheaErrorRecordHeader00(
    public var osBuildNumber: UInt = 0u,
    public var reserved2: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaErrorRecordHeader00) return false
        if (this.osBuildNumber != other.osBuildNumber) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.osBuildNumber.hashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaErrorRecordHeader00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaErrorRecordHeader00> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaErrorRecordHeader00 =
                    WheaErrorRecordHeader00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WheaErrorRecordHeader00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.osBuildNumber)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 4L, value.reserved2)
                }
            }
    }
}

public data class WheaErrorRecordHeaderFlags(
    public var anonymous: WheaErrorRecordHeaderFlags0 = WheaErrorRecordHeaderFlags0(),
    public var asULONG: UInt = 0u,
)

public data class WheaErrorRecordHeaderFlags0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaErrorRecordHeaderFlags0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaErrorRecordHeaderFlags0> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaErrorRecordHeaderFlags0 =
                    WheaErrorRecordHeaderFlags0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WheaErrorRecordHeaderFlags0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WheaErrorRecordHeaderValidbits(
    public var anonymous: WheaErrorRecordHeaderValidbits0 = WheaErrorRecordHeaderValidbits0(),
    public var asULONG: UInt = 0u,
)

public data class WheaErrorRecordHeaderValidbits0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaErrorRecordHeaderValidbits0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaErrorRecordHeaderValidbits0> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaErrorRecordHeaderValidbits0 =
                    WheaErrorRecordHeaderValidbits0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WheaErrorRecordHeaderValidbits0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WheaErrorRecordSectionDescriptor(
    public var sectionOffset: UInt = 0u,
    public var sectionLength: UInt = 0u,
    public var revision: WheaRevision = WheaRevision(),
    public var validBits: WheaErrorRecordSectionDescriptorValidbits = WheaErrorRecordSectionDescriptorValidbits(),
    public var reserved: UByte = 0u,
    public var flags: WheaErrorRecordSectionDescriptorFlags = WheaErrorRecordSectionDescriptorFlags(),
    public var sectionType: Guid = Guid(),
    public var fRUId: Guid = Guid(),
    public var sectionSeverity: WheaErrorSeverity = 0,
    public var fRUText: ByteArray = ByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaErrorRecordSectionDescriptor) return false
        if (this.sectionOffset != other.sectionOffset) return false
        if (this.sectionLength != other.sectionLength) return false
        if (this.revision != other.revision) return false
        if (this.validBits != other.validBits) return false
        if (this.reserved != other.reserved) return false
        if (this.flags != other.flags) return false
        if (this.sectionType != other.sectionType) return false
        if (this.fRUId != other.fRUId) return false
        if (this.sectionSeverity != other.sectionSeverity) return false
        if (!this.fRUText.contentEquals(other.fRUText)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sectionOffset.hashCode()
        result = 31 * result + this.sectionLength.hashCode()
        result = 31 * result + this.revision.hashCode()
        result = 31 * result + this.validBits.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.sectionType.hashCode()
        result = 31 * result + this.fRUId.hashCode()
        result = 31 * result + this.sectionSeverity.hashCode()
        result = 31 * result + this.fRUText.contentHashCode()
        return result
    }
}

public data class WheaErrorRecordSectionDescriptorFlags(
    public var anonymous: WheaErrorRecordSectionDescriptorFlags0 = WheaErrorRecordSectionDescriptorFlags0(),
    public var asULONG: UInt = 0u,
)

public data class WheaErrorRecordSectionDescriptorFlags0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaErrorRecordSectionDescriptorFlags0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaErrorRecordSectionDescriptorFlags0> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaErrorRecordSectionDescriptorFlags0 =
                    WheaErrorRecordSectionDescriptorFlags0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WheaErrorRecordSectionDescriptorFlags0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WheaErrorRecordSectionDescriptorValidbits(
    public var anonymous: WheaErrorRecordSectionDescriptorValidbits0 = WheaErrorRecordSectionDescriptorValidbits0(),
    public var asUCHAR: UByte = 0u,
)

public data class WheaErrorRecordSectionDescriptorValidbits0(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaErrorRecordSectionDescriptorValidbits0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaErrorRecordSectionDescriptorValidbits0> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaErrorRecordSectionDescriptorValidbits0 =
                    WheaErrorRecordSectionDescriptorValidbits0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WheaErrorRecordSectionDescriptorValidbits0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WheaErrorRecoveryInfoSection(
    public var recoveryKernel: Boolean = false,
    public var recoveryAction: WheaRecoveryAction = WheaRecoveryAction(),
    public var recoveryType: WheaRecoveryType = 0,
    public var irql: UByte = 0u,
    public var recoverySucceeded: Boolean = false,
    public var failureReason: WheaRecoveryFailureReason = 0,
    public var processName: ByteArray = ByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaErrorRecoveryInfoSection) return false
        if (this.recoveryKernel != other.recoveryKernel) return false
        if (this.recoveryAction != other.recoveryAction) return false
        if (this.recoveryType != other.recoveryType) return false
        if (this.irql != other.irql) return false
        if (this.recoverySucceeded != other.recoverySucceeded) return false
        if (this.failureReason != other.failureReason) return false
        if (!this.processName.contentEquals(other.processName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.recoveryKernel.hashCode()
        result = 31 * result + this.recoveryAction.hashCode()
        result = 31 * result + this.recoveryType.hashCode()
        result = 31 * result + this.irql.hashCode()
        result = 31 * result + this.recoverySucceeded.hashCode()
        result = 31 * result + this.failureReason.hashCode()
        result = 31 * result + this.processName.contentHashCode()
        return result
    }
}

public class WheaErrorSourceConfiguration internal constructor(
    public var flags: UInt,
    public var correct: WheaErrorSourceCorrect,
    public var initialize: WheaErrorSourceInitialize,
    public var createRecord: WheaErrorSourceCreateRecord,
    public var recover: WheaErrorSourceRecover,
    public var uninitialize: WheaErrorSourceUninitialize,
    reservedCtorArg: MutPtr<CVoid>,
) {
    public var reserved: MutPtr<CVoid> = reservedCtorArg
        internal set

    public constructor() : this(
        flags = 0u,
        correct = null,
        initialize = null,
        createRecord = null,
        recover = null,
        uninitialize = null,
        reservedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.flags

    public operator fun component2(): WheaErrorSourceCorrect = this.correct

    public operator fun component3(): WheaErrorSourceInitialize = this.initialize

    public operator fun component4(): WheaErrorSourceCreateRecord = this.createRecord

    public operator fun component5(): WheaErrorSourceRecover = this.recover

    public operator fun component6(): WheaErrorSourceUninitialize = this.uninitialize

    public operator fun component7(): MutPtr<CVoid> = this.reserved

    public fun copy(flags: UInt = this.flags, correct: WheaErrorSourceCorrect = this.correct, initialize: WheaErrorSourceInitialize = this.initialize, createRecord: WheaErrorSourceCreateRecord = this.createRecord, recover: WheaErrorSourceRecover = this.recover, uninitialize: WheaErrorSourceUninitialize = this.uninitialize, reserved: MutPtr<CVoid> = this.reserved): WheaErrorSourceConfiguration = WheaErrorSourceConfiguration(flags = flags, correct = correct, initialize = initialize, createRecord = createRecord, recover = recover, uninitialize = uninitialize, reservedCtorArg = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaErrorSourceConfiguration) return false
        if (this.flags != other.flags) return false
        if (this.correct != other.correct) return false
        if (this.initialize != other.initialize) return false
        if (this.createRecord != other.createRecord) return false
        if (this.recover != other.recover) return false
        if (this.uninitialize != other.uninitialize) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.correct.hashCode()
        result = 31 * result + this.initialize.hashCode()
        result = 31 * result + this.createRecord.hashCode()
        result = 31 * result + this.recover.hashCode()
        result = 31 * result + this.uninitialize.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            flags: UInt = 0u,
            correct: WheaErrorSourceCorrect = null,
            initialize: WheaErrorSourceInitialize = null,
            createRecord: WheaErrorSourceCreateRecord = null,
            recover: WheaErrorSourceRecover = null,
            uninitialize: WheaErrorSourceUninitialize = null,
            reserved: MutPtr<CVoid> = MutPtr(0L),
        ): WheaErrorSourceConfiguration =
            WheaErrorSourceConfiguration(
                flags = flags,
                correct = correct,
                initialize = initialize,
                createRecord = createRecord,
                recover = recover,
                uninitialize = uninitialize,
                reservedCtorArg = reserved,
            )
    }
}

public data class WheaErrorSourceOverrideSettings(
    public var type: WheaErrorSourceType = 0,
    public var maxRawDataLength: UInt = 0u,
    public var numRecordsToPreallocate: UInt = 0u,
    public var maxSectionsPerRecord: UInt = 0u,
)

public data class WheaErrorStatus(
    public var errorStatus: ULong = 0uL,
    public var anonymous: WheaErrorStatus0 = WheaErrorStatus0(),
)

public data class WheaErrorStatus0(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaErrorStatus0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaErrorStatus0> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaErrorStatus0 =
                    WheaErrorStatus0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WheaErrorStatus0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WheaEtwOverflowEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var recordId: ULong = 0uL,
)

public data class WheaEventLogEntry(
    public var header: WheaEventLogEntryHeader = WheaEventLogEntryHeader(),
)

public data class WheaEventLogEntryFlags(
    public var anonymous: WheaEventLogEntryFlags0 = WheaEventLogEntryFlags0(),
    public var asULONG: UInt = 0u,
)

public data class WheaEventLogEntryFlags0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaEventLogEntryFlags0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaEventLogEntryFlags0> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaEventLogEntryFlags0 =
                    WheaEventLogEntryFlags0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WheaEventLogEntryFlags0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WheaEventLogEntryHeader(
    public var signature: UInt = 0u,
    public var version: UInt = 0u,
    public var length: UInt = 0u,
    public var type: WheaEventLogEntryType = 0,
    public var ownerTag: UInt = 0u,
    public var id: WheaEventLogEntryId = 0,
    public var flags: WheaEventLogEntryFlags = WheaEventLogEntryFlags(),
    public var payloadLength: UInt = 0u,
)

public data class WheaFailedAddDefectListEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
)

public data class WheaFirmwareErrorRecordReference(
    public var type: UByte = 0u,
    public var reserved: UByteArray = UByteArray(7),
    public var firmwareRecordId: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaFirmwareErrorRecordReference) return false
        if (this.type != other.type) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.firmwareRecordId != other.firmwareRecordId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.firmwareRecordId.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaFirmwareErrorRecordReference> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaFirmwareErrorRecordReference> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaFirmwareErrorRecordReference =
                    WheaFirmwareErrorRecordReference(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (7).toInt())
                        ).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WheaFirmwareErrorRecordReference) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.type)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (7).toInt())
                    ).writeNative(addr + 1L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.firmwareRecordId)
                }
            }
    }
}

public data class WheaGenericError(
    public var blockStatus: WheaGenericErrorBlockstatus = WheaGenericErrorBlockstatus(),
    public var rawDataOffset: UInt = 0u,
    public var rawDataLength: UInt = 0u,
    public var dataLength: UInt = 0u,
    public var errorSeverity: WheaErrorSeverity = 0,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaGenericError) return false
        if (this.blockStatus != other.blockStatus) return false
        if (this.rawDataOffset != other.rawDataOffset) return false
        if (this.rawDataLength != other.rawDataLength) return false
        if (this.dataLength != other.dataLength) return false
        if (this.errorSeverity != other.errorSeverity) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.blockStatus.hashCode()
        result = 31 * result + this.rawDataOffset.hashCode()
        result = 31 * result + this.rawDataLength.hashCode()
        result = 31 * result + this.dataLength.hashCode()
        result = 31 * result + this.errorSeverity.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class WheaGenericErrorBlockstatus(
    public var anonymous: WheaGenericErrorBlockstatus0 = WheaGenericErrorBlockstatus0(),
    public var asULONG: UInt = 0u,
)

public data class WheaGenericErrorBlockstatus0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaGenericErrorBlockstatus0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaGenericErrorBlockstatus0> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaGenericErrorBlockstatus0 =
                    WheaGenericErrorBlockstatus0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WheaGenericErrorBlockstatus0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WheaGenericErrorDataEntryV1(
    public var sectionType: Guid = Guid(),
    public var errorSeverity: WheaErrorSeverity = 0,
    public var revision: WheaRevision = WheaRevision(),
    public var validBits: UByte = 0u,
    public var flags: UByte = 0u,
    public var errorDataLength: UInt = 0u,
    public var fRUId: Guid = Guid(),
    public var fRUText: UByteArray = UByteArray(20),
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaGenericErrorDataEntryV1) return false
        if (this.sectionType != other.sectionType) return false
        if (this.errorSeverity != other.errorSeverity) return false
        if (this.revision != other.revision) return false
        if (this.validBits != other.validBits) return false
        if (this.flags != other.flags) return false
        if (this.errorDataLength != other.errorDataLength) return false
        if (this.fRUId != other.fRUId) return false
        if (!this.fRUText.contentEquals(other.fRUText)) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sectionType.hashCode()
        result = 31 * result + this.errorSeverity.hashCode()
        result = 31 * result + this.revision.hashCode()
        result = 31 * result + this.validBits.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.errorDataLength.hashCode()
        result = 31 * result + this.fRUId.hashCode()
        result = 31 * result + this.fRUText.contentHashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class WheaGenericErrorDataEntryV2(
    public var sectionType: Guid = Guid(),
    public var errorSeverity: WheaErrorSeverity = 0,
    public var revision: WheaRevision = WheaRevision(),
    public var validBits: UByte = 0u,
    public var flags: UByte = 0u,
    public var errorDataLength: UInt = 0u,
    public var fRUId: Guid = Guid(),
    public var fRUText: UByteArray = UByteArray(20),
    public var timestamp: WheaTimestamp = WheaTimestamp(),
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaGenericErrorDataEntryV2) return false
        if (this.sectionType != other.sectionType) return false
        if (this.errorSeverity != other.errorSeverity) return false
        if (this.revision != other.revision) return false
        if (this.validBits != other.validBits) return false
        if (this.flags != other.flags) return false
        if (this.errorDataLength != other.errorDataLength) return false
        if (this.fRUId != other.fRUId) return false
        if (!this.fRUText.contentEquals(other.fRUText)) return false
        if (this.timestamp != other.timestamp) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sectionType.hashCode()
        result = 31 * result + this.errorSeverity.hashCode()
        result = 31 * result + this.revision.hashCode()
        result = 31 * result + this.validBits.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.errorDataLength.hashCode()
        result = 31 * result + this.fRUId.hashCode()
        result = 31 * result + this.fRUText.contentHashCode()
        result = 31 * result + this.timestamp.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class WheaInUsePageNotifyFlags(
    public var bits: WheaInUsePageNotifyFlags0 = WheaInUsePageNotifyFlags0(),
    public var asUCHAR: UByte = 0u,
)

public data class WheaInUsePageNotifyFlags0(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaInUsePageNotifyFlags0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaInUsePageNotifyFlags0> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaInUsePageNotifyFlags0 =
                    WheaInUsePageNotifyFlags0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WheaInUsePageNotifyFlags0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WheaMemoryCorrectableErrorData(
    public var validBits: WheaMemoryCorrectableErrorSectionValidbits = WheaMemoryCorrectableErrorSectionValidbits(),
    public var socketId: UInt = 0u,
    public var channelId: UInt = 0u,
    public var dimmSlot: UInt = 0u,
    public var correctableErrorCount: UInt = 0u,
)

public data class WheaMemoryCorrectableErrorHeader(
    public var version: UShort = 0u,
    public var count: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaMemoryCorrectableErrorHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaMemoryCorrectableErrorHeader> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaMemoryCorrectableErrorHeader =
                    WheaMemoryCorrectableErrorHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: WheaMemoryCorrectableErrorHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.count)
                }
            }
    }
}

public data class WheaMemoryCorrectableErrorSection(
    public var header: WheaMemoryCorrectableErrorHeader = WheaMemoryCorrectableErrorHeader(),
    public var data: List<WheaMemoryCorrectableErrorData> = List(1) { WheaMemoryCorrectableErrorData() },
)

public data class WheaMemoryCorrectableErrorSectionValidbits(
    public var anonymous: WheaMemoryCorrectableErrorSectionValidbits0 = WheaMemoryCorrectableErrorSectionValidbits0(),
    public var validBits: ULong = 0uL,
)

public data class WheaMemoryCorrectableErrorSectionValidbits0(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaMemoryCorrectableErrorSectionValidbits0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaMemoryCorrectableErrorSectionValidbits0> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaMemoryCorrectableErrorSectionValidbits0 =
                    WheaMemoryCorrectableErrorSectionValidbits0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WheaMemoryCorrectableErrorSectionValidbits0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class WheaMemoryErrorSection(
    public var validBits: WheaMemoryErrorSectionValidbits = WheaMemoryErrorSectionValidbits(),
    public var errorStatus: WheaErrorStatus = WheaErrorStatus(),
    public var physicalAddress: ULong = 0uL,
    public var physicalAddressMask: ULong = 0uL,
    public var node: UShort = 0u,
    public var card: UShort = 0u,
    public var module: UShort = 0u,
    public var bank: UShort = 0u,
    public var device: UShort = 0u,
    public var row: UShort = 0u,
    public var column: UShort = 0u,
    public var bitPosition: UShort = 0u,
    public var requesterId: ULong = 0uL,
    public var responderId: ULong = 0uL,
    public var targetId: ULong = 0uL,
    public var errorType: UByte = 0u,
    public var extended: UByte = 0u,
    public var rankNumber: UShort = 0u,
    public var cardHandle: UShort = 0u,
    public var moduleHandle: UShort = 0u,
)

public data class WheaMemoryErrorSectionValidbits(
    public var anonymous: WheaMemoryErrorSectionValidbits0 = WheaMemoryErrorSectionValidbits0(),
    public var validBits: ULong = 0uL,
)

public data class WheaMemoryErrorSectionValidbits0(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaMemoryErrorSectionValidbits0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaMemoryErrorSectionValidbits0> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaMemoryErrorSectionValidbits0 =
                    WheaMemoryErrorSectionValidbits0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WheaMemoryErrorSectionValidbits0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WheaMemoryThrottleSummaryFailedEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var status: Ntstatus = 0,
)

public data class WheaMsrDumpSection(
    public var msrDumpBuffer: UByte = 0u,
    public var msrDumpLength: UInt = 0u,
    public var msrDumpData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaMsrDumpSection) return false
        if (this.msrDumpBuffer != other.msrDumpBuffer) return false
        if (this.msrDumpLength != other.msrDumpLength) return false
        if (!this.msrDumpData.contentEquals(other.msrDumpData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.msrDumpBuffer.hashCode()
        result = 31 * result + this.msrDumpLength.hashCode()
        result = 31 * result + this.msrDumpData.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaMsrDumpSection> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaMsrDumpSection> {
                override val sizeBytes: Long = 6L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaMsrDumpSection =
                    WheaMsrDumpSection(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 5L),
                    )
                override fun writeNative(addr: Long, value: WheaMsrDumpSection) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.msrDumpBuffer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 1L, value.msrDumpLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 5L, value.msrDumpData)
                }
            }
    }
}

public data class WheaNmiErrorSection(
    public var data: UByteArray = UByteArray(8),
    public var flags: WheaNmiErrorSectionFlags = WheaNmiErrorSectionFlags(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaNmiErrorSection) return false
        if (!this.data.contentEquals(other.data)) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.data.contentHashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }
}

public data class WheaNmiErrorSectionFlags(
    public var anonymous: WheaNmiErrorSectionFlags0 = WheaNmiErrorSectionFlags0(),
    public var asULONG: UInt = 0u,
)

public data class WheaNmiErrorSectionFlags0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaNmiErrorSectionFlags0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaNmiErrorSectionFlags0> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaNmiErrorSectionFlags0 =
                    WheaNmiErrorSectionFlags0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WheaNmiErrorSectionFlags0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WheaOfflineDoneEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var address: ULong = 0uL,
)

public data class WheaPacketLogData(
    public var logData: UByteArray = UByteArray(36),
    public var extraBytes: UByteArray = UByteArray(36),
    public var bcParam3: Int = 0,
    public var bcParam4: Int = 0,
    public var logDataLength: UInt = 0u,
    public var logTag: UShort = 0u,
    public var reserved: UShort = 0u,
    public var flags: WheaReportHwErrorDeviceDriverFlags = WheaReportHwErrorDeviceDriverFlags(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaPacketLogData) return false
        if (!this.logData.contentEquals(other.logData)) return false
        if (!this.extraBytes.contentEquals(other.extraBytes)) return false
        if (this.bcParam3 != other.bcParam3) return false
        if (this.bcParam4 != other.bcParam4) return false
        if (this.logDataLength != other.logDataLength) return false
        if (this.logTag != other.logTag) return false
        if (this.reserved != other.reserved) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.logData.contentHashCode()
        result = 31 * result + this.extraBytes.contentHashCode()
        result = 31 * result + this.bcParam3.hashCode()
        result = 31 * result + this.bcParam4.hashCode()
        result = 31 * result + this.logDataLength.hashCode()
        result = 31 * result + this.logTag.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }
}

public data class WheaPciexpressBridgeControlStatus(
    public var anonymous: WheaPciexpressBridgeControlStatus0 = WheaPciexpressBridgeControlStatus0(),
    public var asULONG: UInt = 0u,
)

public data class WheaPciexpressBridgeControlStatus0(
    public var bridgeSecondaryStatus: UShort = 0u,
    public var bridgeControl: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaPciexpressBridgeControlStatus0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaPciexpressBridgeControlStatus0> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaPciexpressBridgeControlStatus0 =
                    WheaPciexpressBridgeControlStatus0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: WheaPciexpressBridgeControlStatus0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bridgeSecondaryStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.bridgeControl)
                }
            }
    }
}

public data class WheaPciexpressCommandStatus(
    public var anonymous: WheaPciexpressCommandStatus0 = WheaPciexpressCommandStatus0(),
    public var asULONG: UInt = 0u,
)

public data class WheaPciexpressCommandStatus0(
    public var command: UShort = 0u,
    public var status: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaPciexpressCommandStatus0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaPciexpressCommandStatus0> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaPciexpressCommandStatus0 =
                    WheaPciexpressCommandStatus0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: WheaPciexpressCommandStatus0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.command)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.status)
                }
            }
    }
}

public data class WheaPciexpressDeviceId(
    public var vendorID: UShort = 0u,
    public var deviceID: UShort = 0u,
    public var bitfield1: UInt = 0u,
    public var bitfield2: UInt = 0u,
    public var bitfield3: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaPciexpressDeviceId> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaPciexpressDeviceId> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaPciexpressDeviceId =
                    WheaPciexpressDeviceId(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: WheaPciexpressDeviceId) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.vendorID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.deviceID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.bitfield1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.bitfield2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.bitfield3)
                }
            }
    }
}

public data class WheaPciexpressErrorSection(
    public var validBits: WheaPciexpressErrorSectionValidbits = WheaPciexpressErrorSectionValidbits(),
    public var portType: WheaPciexpressDeviceType = 0,
    public var version: WheaPciexpressVersion = WheaPciexpressVersion(),
    public var commandStatus: WheaPciexpressCommandStatus = WheaPciexpressCommandStatus(),
    public var reserved: UInt = 0u,
    public var deviceId: WheaPciexpressDeviceId = WheaPciexpressDeviceId(),
    public var deviceSerialNumber: ULong = 0uL,
    public var bridgeControlStatus: WheaPciexpressBridgeControlStatus = WheaPciexpressBridgeControlStatus(),
    public var expressCapability: UByteArray = UByteArray(60),
    public var aerInfo: UByteArray = UByteArray(96),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaPciexpressErrorSection) return false
        if (this.validBits != other.validBits) return false
        if (this.portType != other.portType) return false
        if (this.version != other.version) return false
        if (this.commandStatus != other.commandStatus) return false
        if (this.reserved != other.reserved) return false
        if (this.deviceId != other.deviceId) return false
        if (this.deviceSerialNumber != other.deviceSerialNumber) return false
        if (this.bridgeControlStatus != other.bridgeControlStatus) return false
        if (!this.expressCapability.contentEquals(other.expressCapability)) return false
        if (!this.aerInfo.contentEquals(other.aerInfo)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.validBits.hashCode()
        result = 31 * result + this.portType.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.commandStatus.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.deviceId.hashCode()
        result = 31 * result + this.deviceSerialNumber.hashCode()
        result = 31 * result + this.bridgeControlStatus.hashCode()
        result = 31 * result + this.expressCapability.contentHashCode()
        result = 31 * result + this.aerInfo.contentHashCode()
        return result
    }
}

public data class WheaPciexpressErrorSectionValidbits(
    public var anonymous: WheaPciexpressErrorSectionValidbits0 = WheaPciexpressErrorSectionValidbits0(),
    public var validBits: ULong = 0uL,
)

public data class WheaPciexpressErrorSectionValidbits0(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaPciexpressErrorSectionValidbits0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaPciexpressErrorSectionValidbits0> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaPciexpressErrorSectionValidbits0 =
                    WheaPciexpressErrorSectionValidbits0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WheaPciexpressErrorSectionValidbits0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WheaPciexpressVersion(
    public var anonymous: WheaPciexpressVersion0 = WheaPciexpressVersion0(),
    public var asULONG: UInt = 0u,
)

public data class WheaPciexpressVersion0(
    public var minorVersion: UByte = 0u,
    public var majorVersion: UByte = 0u,
    public var reserved: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaPciexpressVersion0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaPciexpressVersion0> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaPciexpressVersion0 =
                    WheaPciexpressVersion0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: WheaPciexpressVersion0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.minorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.majorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.reserved)
                }
            }
    }
}

public data class WheaPcieAddress(
    public var segment: UInt = 0u,
    public var bus: UInt = 0u,
    public var device: UInt = 0u,
    public var function: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaPcieAddress> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaPcieAddress> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaPcieAddress =
                    WheaPcieAddress(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: WheaPcieAddress) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.segment)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.bus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.device)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.function)
                }
            }
    }
}

public data class WheaPcieCorrectableErrorDevices(
    public var validBits: WheaPcieCorrectableErrorDevicesValidbits = WheaPcieCorrectableErrorDevicesValidbits(),
    public var address: WheaPcieAddress = WheaPcieAddress(),
    public var mask: UInt = 0u,
    public var correctableErrorCount: UIntArray = UIntArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaPcieCorrectableErrorDevices) return false
        if (this.validBits != other.validBits) return false
        if (this.address != other.address) return false
        if (this.mask != other.mask) return false
        if (!this.correctableErrorCount.contentEquals(other.correctableErrorCount)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.validBits.hashCode()
        result = 31 * result + this.address.hashCode()
        result = 31 * result + this.mask.hashCode()
        result = 31 * result + this.correctableErrorCount.contentHashCode()
        return result
    }
}

public data class WheaPcieCorrectableErrorDevicesValidbits(
    public var anonymous: WheaPcieCorrectableErrorDevicesValidbits0 = WheaPcieCorrectableErrorDevicesValidbits0(),
    public var validBits: ULong = 0uL,
)

public data class WheaPcieCorrectableErrorDevicesValidbits0(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaPcieCorrectableErrorDevicesValidbits0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaPcieCorrectableErrorDevicesValidbits0> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaPcieCorrectableErrorDevicesValidbits0 =
                    WheaPcieCorrectableErrorDevicesValidbits0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WheaPcieCorrectableErrorDevicesValidbits0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WheaPcieCorrectableErrorSection(
    public var header: WheaPcieCorrectableErrorSectionHeader = WheaPcieCorrectableErrorSectionHeader(),
    public var devices: List<WheaPcieCorrectableErrorDevices> = List(1) { WheaPcieCorrectableErrorDevices() },
)

public data class WheaPcieCorrectableErrorSectionHeader(
    public var version: UShort = 0u,
    public var count: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaPcieCorrectableErrorSectionHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaPcieCorrectableErrorSectionHeader> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaPcieCorrectableErrorSectionHeader =
                    WheaPcieCorrectableErrorSectionHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: WheaPcieCorrectableErrorSectionHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.count)
                }
            }
    }
}

public data class WheaPcixbusCommand(
    public var anonymous: WheaPcixbusCommand0 = WheaPcixbusCommand0(),
    public var asULONGLONG: ULong = 0uL,
)

public data class WheaPcixbusCommand0(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaPcixbusCommand0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaPcixbusCommand0> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaPcixbusCommand0 =
                    WheaPcixbusCommand0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WheaPcixbusCommand0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WheaPcixbusErrorSection(
    public var validBits: WheaPcixbusErrorSectionValidbits = WheaPcixbusErrorSectionValidbits(),
    public var errorStatus: WheaErrorStatus = WheaErrorStatus(),
    public var errorType: UShort = 0u,
    public var busId: WheaPcixbusId = WheaPcixbusId(),
    public var reserved: UInt = 0u,
    public var busAddress: ULong = 0uL,
    public var busData: ULong = 0uL,
    public var busCommand: WheaPcixbusCommand = WheaPcixbusCommand(),
    public var requesterId: ULong = 0uL,
    public var completerId: ULong = 0uL,
    public var targetId: ULong = 0uL,
)

public data class WheaPcixbusErrorSectionValidbits(
    public var anonymous: WheaPcixbusErrorSectionValidbits0 = WheaPcixbusErrorSectionValidbits0(),
    public var validBits: ULong = 0uL,
)

public data class WheaPcixbusErrorSectionValidbits0(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaPcixbusErrorSectionValidbits0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaPcixbusErrorSectionValidbits0> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaPcixbusErrorSectionValidbits0 =
                    WheaPcixbusErrorSectionValidbits0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WheaPcixbusErrorSectionValidbits0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WheaPcixbusId(
    public var anonymous: WheaPcixbusId0 = WheaPcixbusId0(),
    public var asUSHORT: UShort = 0u,
)

public data class WheaPcixbusId0(
    public var busNumber: UByte = 0u,
    public var busSegment: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaPcixbusId0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaPcixbusId0> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaPcixbusId0 =
                    WheaPcixbusId0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: WheaPcixbusId0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.busNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.busSegment)
                }
            }
    }
}

public data class WheaPcixdeviceErrorSection(
    public var validBits: WheaPcixdeviceErrorSectionValidbits = WheaPcixdeviceErrorSectionValidbits(),
    public var errorStatus: WheaErrorStatus = WheaErrorStatus(),
    public var idInfo: WheaPcixdeviceId = WheaPcixdeviceId(),
    public var memoryNumber: UInt = 0u,
    public var ioNumber: UInt = 0u,
    public var registerDataPairs: List<WheaPcixdeviceRegisterPair> = List(1) { WheaPcixdeviceRegisterPair() },
)

public data class WheaPcixdeviceErrorSectionValidbits(
    public var anonymous: WheaPcixdeviceErrorSectionValidbits0 = WheaPcixdeviceErrorSectionValidbits0(),
    public var validBits: ULong = 0uL,
)

public data class WheaPcixdeviceErrorSectionValidbits0(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaPcixdeviceErrorSectionValidbits0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaPcixdeviceErrorSectionValidbits0> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaPcixdeviceErrorSectionValidbits0 =
                    WheaPcixdeviceErrorSectionValidbits0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WheaPcixdeviceErrorSectionValidbits0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WheaPcixdeviceId(
    public var vendorId: UShort = 0u,
    public var deviceId: UShort = 0u,
    public var bitfield1: UInt = 0u,
    public var bitfield2: UInt = 0u,
    public var reserved2: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaPcixdeviceId> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaPcixdeviceId> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaPcixdeviceId =
                    WheaPcixdeviceId(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: WheaPcixdeviceId) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.vendorId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.deviceId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.bitfield1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.bitfield2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.reserved2)
                }
            }
    }
}

public data class WheaPcixdeviceRegisterPair(
    public var register: ULong = 0uL,
    public var data: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaPcixdeviceRegisterPair> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaPcixdeviceRegisterPair> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaPcixdeviceRegisterPair =
                    WheaPcixdeviceRegisterPair(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WheaPcixdeviceRegisterPair) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.register)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.data)
                }
            }
    }
}

public data class WheaPciRecoverySection(
    public var signalType: UByte = 0u,
    public var recoveryAttempted: Boolean = false,
    public var recoveryStatus: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaPciRecoverySection> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaPciRecoverySection> {
                override val sizeBytes: Long = 3L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaPciRecoverySection =
                    WheaPciRecoverySection(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: WheaPciRecoverySection) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.signalType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 1L, value.recoveryAttempted)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.recoveryStatus)
                }
            }
    }
}

public data class WheaPersistenceInfo(
    public var anonymous: WheaPersistenceInfo0 = WheaPersistenceInfo0(),
    public var asULONGLONG: ULong = 0uL,
)

public data class WheaPersistenceInfo0(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaPersistenceInfo0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaPersistenceInfo0> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaPersistenceInfo0 =
                    WheaPersistenceInfo0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WheaPersistenceInfo0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WheaPmemErrorSection(
    public var validBits: WheaPmemErrorSectionValidbits = WheaPmemErrorSectionValidbits(),
    public var locationInfo: UByteArray = UByteArray(64),
    public var errorStatus: WheaErrorStatus = WheaErrorStatus(),
    public var nFITHandle: UInt = 0u,
    public var pageRangeCount: UInt = 0u,
    public var pageRange: List<WheaPmemPageRange> = List(1) { WheaPmemPageRange() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaPmemErrorSection) return false
        if (this.validBits != other.validBits) return false
        if (!this.locationInfo.contentEquals(other.locationInfo)) return false
        if (this.errorStatus != other.errorStatus) return false
        if (this.nFITHandle != other.nFITHandle) return false
        if (this.pageRangeCount != other.pageRangeCount) return false
        if (this.pageRange != other.pageRange) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.validBits.hashCode()
        result = 31 * result + this.locationInfo.contentHashCode()
        result = 31 * result + this.errorStatus.hashCode()
        result = 31 * result + this.nFITHandle.hashCode()
        result = 31 * result + this.pageRangeCount.hashCode()
        result = 31 * result + this.pageRange.hashCode()
        return result
    }
}

public data class WheaPmemErrorSectionValidbits(
    public var anonymous: WheaPmemErrorSectionValidbits0 = WheaPmemErrorSectionValidbits0(),
    public var validBits: ULong = 0uL,
)

public data class WheaPmemErrorSectionValidbits0(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaPmemErrorSectionValidbits0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaPmemErrorSectionValidbits0> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaPmemErrorSectionValidbits0 =
                    WheaPmemErrorSectionValidbits0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WheaPmemErrorSectionValidbits0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WheaPmemPageRange(
    public var startingPfn: ULong = 0uL,
    public var pageCount: ULong = 0uL,
    public var markedBadBitmap: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaPmemPageRange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaPmemPageRange> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaPmemPageRange =
                    WheaPmemPageRange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WheaPmemPageRange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.startingPfn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.pageCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.markedBadBitmap)
                }
            }
    }
}

public data class WheaProcessorFamilyInfo(
    public var anonymous: WheaProcessorFamilyInfo0 = WheaProcessorFamilyInfo0(),
    public var asULONGLONG: ULong = 0uL,
)

public data class WheaProcessorFamilyInfo0(
    public var bitfield: UInt = 0u,
    public var nativeModelId: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaProcessorFamilyInfo0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaProcessorFamilyInfo0> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaProcessorFamilyInfo0 =
                    WheaProcessorFamilyInfo0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WheaProcessorFamilyInfo0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.nativeModelId)
                }
            }
    }
}

public data class WheaProcessorGenericErrorSection(
    public var validBits: WheaProcessorGenericErrorSectionValidbits = WheaProcessorGenericErrorSectionValidbits(),
    public var processorType: UByte = 0u,
    public var instructionSet: UByte = 0u,
    public var errorType: UByte = 0u,
    public var operation: UByte = 0u,
    public var flags: UByte = 0u,
    public var level: UByte = 0u,
    public var reserved: UShort = 0u,
    public var cPUVersion: ULong = 0uL,
    public var cPUBrandString: UByteArray = UByteArray(128),
    public var processorId: ULong = 0uL,
    public var targetAddress: ULong = 0uL,
    public var requesterId: ULong = 0uL,
    public var responderId: ULong = 0uL,
    public var instructionPointer: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaProcessorGenericErrorSection) return false
        if (this.validBits != other.validBits) return false
        if (this.processorType != other.processorType) return false
        if (this.instructionSet != other.instructionSet) return false
        if (this.errorType != other.errorType) return false
        if (this.operation != other.operation) return false
        if (this.flags != other.flags) return false
        if (this.level != other.level) return false
        if (this.reserved != other.reserved) return false
        if (this.cPUVersion != other.cPUVersion) return false
        if (!this.cPUBrandString.contentEquals(other.cPUBrandString)) return false
        if (this.processorId != other.processorId) return false
        if (this.targetAddress != other.targetAddress) return false
        if (this.requesterId != other.requesterId) return false
        if (this.responderId != other.responderId) return false
        if (this.instructionPointer != other.instructionPointer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.validBits.hashCode()
        result = 31 * result + this.processorType.hashCode()
        result = 31 * result + this.instructionSet.hashCode()
        result = 31 * result + this.errorType.hashCode()
        result = 31 * result + this.operation.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.level.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.cPUVersion.hashCode()
        result = 31 * result + this.cPUBrandString.contentHashCode()
        result = 31 * result + this.processorId.hashCode()
        result = 31 * result + this.targetAddress.hashCode()
        result = 31 * result + this.requesterId.hashCode()
        result = 31 * result + this.responderId.hashCode()
        result = 31 * result + this.instructionPointer.hashCode()
        return result
    }
}

public data class WheaProcessorGenericErrorSectionValidbits(
    public var anonymous: WheaProcessorGenericErrorSectionValidbits0 = WheaProcessorGenericErrorSectionValidbits0(),
    public var validBits: ULong = 0uL,
)

public data class WheaProcessorGenericErrorSectionValidbits0(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaProcessorGenericErrorSectionValidbits0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaProcessorGenericErrorSectionValidbits0> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaProcessorGenericErrorSectionValidbits0 =
                    WheaProcessorGenericErrorSectionValidbits0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WheaProcessorGenericErrorSectionValidbits0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WheaPshedPiCpuBusesInitFailedEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var status: Ntstatus = 0,
)

public data class WheaPshedPiTraceEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var buffer: ByteArray = ByteArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaPshedPiTraceEvent) return false
        if (this.wheaEventLogEntry != other.wheaEventLogEntry) return false
        if (!this.buffer.contentEquals(other.buffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wheaEventLogEntry.hashCode()
        result = 31 * result + this.buffer.contentHashCode()
        return result
    }
}

public class WheaPshedPluginCallbacks internal constructor(
    public var getAllErrorSources: PshedPiGetAllErrorSources,
    reservedCtorArg: MutPtr<CVoid>,
    public var getErrorSourceInfo: PshedPiGetErrorSourceInfo,
    public var setErrorSourceInfo: PshedPiSetErrorSourceInfo,
    public var enableErrorSource: PshedPiEnableErrorSource,
    public var disableErrorSource: PshedPiDisableErrorSource,
    public var writeErrorRecord: PshedPiWriteErrorRecord,
    public var readErrorRecord: PshedPiReadErrorRecord,
    public var clearErrorRecord: PshedPiClearErrorRecord,
    public var retrieveErrorInfo: PshedPiRetrieveErrorInfo,
    public var finalizeErrorRecord: PshedPiFinalizeErrorRecord,
    public var clearErrorStatus: PshedPiClearErrorStatus,
    public var attemptRecovery: PshedPiAttemptErrorRecovery,
    public var getInjectionCapabilities: PshedPiGetInjectionCapabilities,
    public var injectError: PshedPiInjectError,
) {
    public var reserved: MutPtr<CVoid> = reservedCtorArg
        internal set

    public constructor() : this(
        getAllErrorSources = null,
        reservedCtorArg = MutPtr(0L),
        getErrorSourceInfo = null,
        setErrorSourceInfo = null,
        enableErrorSource = null,
        disableErrorSource = null,
        writeErrorRecord = null,
        readErrorRecord = null,
        clearErrorRecord = null,
        retrieveErrorInfo = null,
        finalizeErrorRecord = null,
        clearErrorStatus = null,
        attemptRecovery = null,
        getInjectionCapabilities = null,
        injectError = null,
    )

    public operator fun component1(): PshedPiGetAllErrorSources = this.getAllErrorSources

    public operator fun component2(): MutPtr<CVoid> = this.reserved

    public operator fun component3(): PshedPiGetErrorSourceInfo = this.getErrorSourceInfo

    public operator fun component4(): PshedPiSetErrorSourceInfo = this.setErrorSourceInfo

    public operator fun component5(): PshedPiEnableErrorSource = this.enableErrorSource

    public operator fun component6(): PshedPiDisableErrorSource = this.disableErrorSource

    public operator fun component7(): PshedPiWriteErrorRecord = this.writeErrorRecord

    public operator fun component8(): PshedPiReadErrorRecord = this.readErrorRecord

    public operator fun component9(): PshedPiClearErrorRecord = this.clearErrorRecord

    public operator fun component10(): PshedPiRetrieveErrorInfo = this.retrieveErrorInfo

    public operator fun component11(): PshedPiFinalizeErrorRecord = this.finalizeErrorRecord

    public operator fun component12(): PshedPiClearErrorStatus = this.clearErrorStatus

    public operator fun component13(): PshedPiAttemptErrorRecovery = this.attemptRecovery

    public operator fun component14(): PshedPiGetInjectionCapabilities = this.getInjectionCapabilities

    public operator fun component15(): PshedPiInjectError = this.injectError

    public fun copy(getAllErrorSources: PshedPiGetAllErrorSources = this.getAllErrorSources, reserved: MutPtr<CVoid> = this.reserved, getErrorSourceInfo: PshedPiGetErrorSourceInfo = this.getErrorSourceInfo, setErrorSourceInfo: PshedPiSetErrorSourceInfo = this.setErrorSourceInfo, enableErrorSource: PshedPiEnableErrorSource = this.enableErrorSource, disableErrorSource: PshedPiDisableErrorSource = this.disableErrorSource, writeErrorRecord: PshedPiWriteErrorRecord = this.writeErrorRecord, readErrorRecord: PshedPiReadErrorRecord = this.readErrorRecord, clearErrorRecord: PshedPiClearErrorRecord = this.clearErrorRecord, retrieveErrorInfo: PshedPiRetrieveErrorInfo = this.retrieveErrorInfo, finalizeErrorRecord: PshedPiFinalizeErrorRecord = this.finalizeErrorRecord, clearErrorStatus: PshedPiClearErrorStatus = this.clearErrorStatus, attemptRecovery: PshedPiAttemptErrorRecovery = this.attemptRecovery, getInjectionCapabilities: PshedPiGetInjectionCapabilities = this.getInjectionCapabilities, injectError: PshedPiInjectError = this.injectError): WheaPshedPluginCallbacks = WheaPshedPluginCallbacks(getAllErrorSources = getAllErrorSources, reservedCtorArg = reserved, getErrorSourceInfo = getErrorSourceInfo, setErrorSourceInfo = setErrorSourceInfo, enableErrorSource = enableErrorSource, disableErrorSource = disableErrorSource, writeErrorRecord = writeErrorRecord, readErrorRecord = readErrorRecord, clearErrorRecord = clearErrorRecord, retrieveErrorInfo = retrieveErrorInfo, finalizeErrorRecord = finalizeErrorRecord, clearErrorStatus = clearErrorStatus, attemptRecovery = attemptRecovery, getInjectionCapabilities = getInjectionCapabilities, injectError = injectError)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaPshedPluginCallbacks) return false
        if (this.getAllErrorSources != other.getAllErrorSources) return false
        if (this.reserved != other.reserved) return false
        if (this.getErrorSourceInfo != other.getErrorSourceInfo) return false
        if (this.setErrorSourceInfo != other.setErrorSourceInfo) return false
        if (this.enableErrorSource != other.enableErrorSource) return false
        if (this.disableErrorSource != other.disableErrorSource) return false
        if (this.writeErrorRecord != other.writeErrorRecord) return false
        if (this.readErrorRecord != other.readErrorRecord) return false
        if (this.clearErrorRecord != other.clearErrorRecord) return false
        if (this.retrieveErrorInfo != other.retrieveErrorInfo) return false
        if (this.finalizeErrorRecord != other.finalizeErrorRecord) return false
        if (this.clearErrorStatus != other.clearErrorStatus) return false
        if (this.attemptRecovery != other.attemptRecovery) return false
        if (this.getInjectionCapabilities != other.getInjectionCapabilities) return false
        if (this.injectError != other.injectError) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.getAllErrorSources.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.getErrorSourceInfo.hashCode()
        result = 31 * result + this.setErrorSourceInfo.hashCode()
        result = 31 * result + this.enableErrorSource.hashCode()
        result = 31 * result + this.disableErrorSource.hashCode()
        result = 31 * result + this.writeErrorRecord.hashCode()
        result = 31 * result + this.readErrorRecord.hashCode()
        result = 31 * result + this.clearErrorRecord.hashCode()
        result = 31 * result + this.retrieveErrorInfo.hashCode()
        result = 31 * result + this.finalizeErrorRecord.hashCode()
        result = 31 * result + this.clearErrorStatus.hashCode()
        result = 31 * result + this.attemptRecovery.hashCode()
        result = 31 * result + this.getInjectionCapabilities.hashCode()
        result = 31 * result + this.injectError.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            getAllErrorSources: PshedPiGetAllErrorSources = null,
            reserved: MutPtr<CVoid> = MutPtr(0L),
            getErrorSourceInfo: PshedPiGetErrorSourceInfo = null,
            setErrorSourceInfo: PshedPiSetErrorSourceInfo = null,
            enableErrorSource: PshedPiEnableErrorSource = null,
            disableErrorSource: PshedPiDisableErrorSource = null,
            writeErrorRecord: PshedPiWriteErrorRecord = null,
            readErrorRecord: PshedPiReadErrorRecord = null,
            clearErrorRecord: PshedPiClearErrorRecord = null,
            retrieveErrorInfo: PshedPiRetrieveErrorInfo = null,
            finalizeErrorRecord: PshedPiFinalizeErrorRecord = null,
            clearErrorStatus: PshedPiClearErrorStatus = null,
            attemptRecovery: PshedPiAttemptErrorRecovery = null,
            getInjectionCapabilities: PshedPiGetInjectionCapabilities = null,
            injectError: PshedPiInjectError = null,
        ): WheaPshedPluginCallbacks =
            WheaPshedPluginCallbacks(
                getAllErrorSources = getAllErrorSources,
                reservedCtorArg = reserved,
                getErrorSourceInfo = getErrorSourceInfo,
                setErrorSourceInfo = setErrorSourceInfo,
                enableErrorSource = enableErrorSource,
                disableErrorSource = disableErrorSource,
                writeErrorRecord = writeErrorRecord,
                readErrorRecord = readErrorRecord,
                clearErrorRecord = clearErrorRecord,
                retrieveErrorInfo = retrieveErrorInfo,
                finalizeErrorRecord = finalizeErrorRecord,
                clearErrorStatus = clearErrorStatus,
                attemptRecovery = attemptRecovery,
                getInjectionCapabilities = getInjectionCapabilities,
                injectError = injectError,
            )
    }
}

public data class WheaPshedPluginDimmMismatch(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var firmwareBank: UShort = 0u,
    public var firmwareCol: UShort = 0u,
    public var firmwareRow: UShort = 0u,
    public var retryRdBank: UShort = 0u,
    public var retryRdCol: UShort = 0u,
    public var retryRdRow: UShort = 0u,
    public var taBank: UShort = 0u,
    public var taCol: UShort = 0u,
    public var taRow: UShort = 0u,
)

public data class WheaPshedPluginEnableNotifyFailedEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var enableError: WheaPshedPluginEnableNotifyErrors = 0,
)

public data class WheaPshedPluginHeartbeat(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
)

public data class WheaPshedPluginInitFailedEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var status: Ntstatus = 0,
)

public data class WheaPshedPluginLoadEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var pluginName: UShortArray = UShortArray(32),
    public var majorVersion: UInt = 0u,
    public var minorVersion: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaPshedPluginLoadEvent) return false
        if (this.wheaEventLogEntry != other.wheaEventLogEntry) return false
        if (!this.pluginName.contentEquals(other.pluginName)) return false
        if (this.majorVersion != other.majorVersion) return false
        if (this.minorVersion != other.minorVersion) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wheaEventLogEntry.hashCode()
        result = 31 * result + this.pluginName.contentHashCode()
        result = 31 * result + this.majorVersion.hashCode()
        result = 31 * result + this.minorVersion.hashCode()
        return result
    }
}

public data class WheaPshedPluginPlatformSupportEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var pluginName: UShortArray = UShortArray(32),
    public var supported: Boolean = false,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaPshedPluginPlatformSupportEvent) return false
        if (this.wheaEventLogEntry != other.wheaEventLogEntry) return false
        if (!this.pluginName.contentEquals(other.pluginName)) return false
        if (this.supported != other.supported) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wheaEventLogEntry.hashCode()
        result = 31 * result + this.pluginName.contentHashCode()
        result = 31 * result + this.supported.hashCode()
        return result
    }
}

public class WheaPshedPluginRegistrationPacketV1 internal constructor(
    public var length: UInt,
    public var version: UInt,
    contextCtorArg: MutPtr<CVoid>,
    public var functionalAreaMask: UInt,
    public var reserved: UInt,
    public var callbacks: WheaPshedPluginCallbacks,
) {
    public var context: MutPtr<CVoid> = contextCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        version = 0u,
        contextCtorArg = MutPtr(0L),
        functionalAreaMask = 0u,
        reserved = 0u,
        callbacks = WheaPshedPluginCallbacks(),
    )

    public operator fun component1(): UInt = this.length

    public operator fun component2(): UInt = this.version

    public operator fun component3(): MutPtr<CVoid> = this.context

    public operator fun component4(): UInt = this.functionalAreaMask

    public operator fun component5(): UInt = this.reserved

    public operator fun component6(): WheaPshedPluginCallbacks = this.callbacks

    public fun copy(length: UInt = this.length, version: UInt = this.version, context: MutPtr<CVoid> = this.context, functionalAreaMask: UInt = this.functionalAreaMask, reserved: UInt = this.reserved, callbacks: WheaPshedPluginCallbacks = this.callbacks): WheaPshedPluginRegistrationPacketV1 = WheaPshedPluginRegistrationPacketV1(length = length, version = version, contextCtorArg = context, functionalAreaMask = functionalAreaMask, reserved = reserved, callbacks = callbacks)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaPshedPluginRegistrationPacketV1) return false
        if (this.length != other.length) return false
        if (this.version != other.version) return false
        if (this.context != other.context) return false
        if (this.functionalAreaMask != other.functionalAreaMask) return false
        if (this.reserved != other.reserved) return false
        if (this.callbacks != other.callbacks) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.context.hashCode()
        result = 31 * result + this.functionalAreaMask.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.callbacks.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            length: UInt = 0u,
            version: UInt = 0u,
            context: MutPtr<CVoid> = MutPtr(0L),
            functionalAreaMask: UInt = 0u,
            reserved: UInt = 0u,
            callbacks: WheaPshedPluginCallbacks = WheaPshedPluginCallbacks(),
        ): WheaPshedPluginRegistrationPacketV1 =
            WheaPshedPluginRegistrationPacketV1(
                length = length,
                version = version,
                contextCtorArg = context,
                functionalAreaMask = functionalAreaMask,
                reserved = reserved,
                callbacks = callbacks,
            )
    }
}

public class WheaPshedPluginRegistrationPacketV2 internal constructor(
    public var length: UInt,
    public var version: UInt,
    contextCtorArg: MutPtr<CVoid>,
    public var functionalAreaMask: UInt,
    public var reserved: UInt,
    public var callbacks: WheaPshedPluginCallbacks,
    pluginHandleCtorArg: MutPtr<CVoid>,
) {
    public var context: MutPtr<CVoid> = contextCtorArg
        internal set

    public var pluginHandle: MutPtr<CVoid> = pluginHandleCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        version = 0u,
        contextCtorArg = MutPtr(0L),
        functionalAreaMask = 0u,
        reserved = 0u,
        callbacks = WheaPshedPluginCallbacks(),
        pluginHandleCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.length

    public operator fun component2(): UInt = this.version

    public operator fun component3(): MutPtr<CVoid> = this.context

    public operator fun component4(): UInt = this.functionalAreaMask

    public operator fun component5(): UInt = this.reserved

    public operator fun component6(): WheaPshedPluginCallbacks = this.callbacks

    public operator fun component7(): MutPtr<CVoid> = this.pluginHandle

    public fun copy(length: UInt = this.length, version: UInt = this.version, context: MutPtr<CVoid> = this.context, functionalAreaMask: UInt = this.functionalAreaMask, reserved: UInt = this.reserved, callbacks: WheaPshedPluginCallbacks = this.callbacks, pluginHandle: MutPtr<CVoid> = this.pluginHandle): WheaPshedPluginRegistrationPacketV2 = WheaPshedPluginRegistrationPacketV2(length = length, version = version, contextCtorArg = context, functionalAreaMask = functionalAreaMask, reserved = reserved, callbacks = callbacks, pluginHandleCtorArg = pluginHandle)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaPshedPluginRegistrationPacketV2) return false
        if (this.length != other.length) return false
        if (this.version != other.version) return false
        if (this.context != other.context) return false
        if (this.functionalAreaMask != other.functionalAreaMask) return false
        if (this.reserved != other.reserved) return false
        if (this.callbacks != other.callbacks) return false
        if (this.pluginHandle != other.pluginHandle) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.context.hashCode()
        result = 31 * result + this.functionalAreaMask.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.callbacks.hashCode()
        result = 31 * result + this.pluginHandle.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            length: UInt = 0u,
            version: UInt = 0u,
            context: MutPtr<CVoid> = MutPtr(0L),
            functionalAreaMask: UInt = 0u,
            reserved: UInt = 0u,
            callbacks: WheaPshedPluginCallbacks = WheaPshedPluginCallbacks(),
            pluginHandle: MutPtr<CVoid> = MutPtr(0L),
        ): WheaPshedPluginRegistrationPacketV2 =
            WheaPshedPluginRegistrationPacketV2(
                length = length,
                version = version,
                contextCtorArg = context,
                functionalAreaMask = functionalAreaMask,
                reserved = reserved,
                callbacks = callbacks,
                pluginHandleCtorArg = pluginHandle,
            )
    }
}

public data class WheaPshedPluginUnloadEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var pluginName: UShortArray = UShortArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaPshedPluginUnloadEvent) return false
        if (this.wheaEventLogEntry != other.wheaEventLogEntry) return false
        if (!this.pluginName.contentEquals(other.pluginName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wheaEventLogEntry.hashCode()
        result = 31 * result + this.pluginName.contentHashCode()
        return result
    }
}

public data class WheaRecoveryAction(
    public var anonymous: WheaRecoveryAction0 = WheaRecoveryAction0(),
    public var asULONG: UInt = 0u,
)

public data class WheaRecoveryAction0(
    public var bitfield1: UInt = 0u,
    public var bitfield2: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaRecoveryAction0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaRecoveryAction0> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaRecoveryAction0 =
                    WheaRecoveryAction0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WheaRecoveryAction0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.bitfield2)
                }
            }
    }
}

public data class WheaRecoveryContext(
    public var anonymous: WheaRecoveryContext0 = WheaRecoveryContext0(),
    public var partitionId: ULong = 0uL,
    public var vpIndex: UInt = 0u,
    public var errorType: WheaRecoveryContextErrorType = 0,
)
