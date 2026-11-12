@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.NcryptKeyHandle

public data class EaphostAuthInfo(
    public var status: EaphostAuthStatus = 0,
    public var dwErrorCode: UInt = 0u,
    public var dwReasonCode: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EaphostAuthInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EaphostAuthInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): EaphostAuthInfo =
                    EaphostAuthInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: EaphostAuthInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.status)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwErrorCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwReasonCode)
                }
            }
    }
}

public class EaphostIdentityUiParams internal constructor(
    public var eapMethodType: EapMethodType,
    public var dwFlags: UInt,
    public var dwSizeofConnectionData: UInt,
    pConnectionDataCtorArg: MutPtr<UByte>,
    public var dwSizeofUserData: UInt,
    pUserDataCtorArg: MutPtr<UByte>,
    public var dwSizeofUserDataOut: UInt,
    pUserDataOutCtorArg: MutPtr<UByte>,
    pwszIdentityCtorArg: Pwstr,
    public var dwError: UInt,
    pEapErrorCtorArg: MutPtr<EapError>,
) {
    public var pConnectionData: MutPtr<UByte> = pConnectionDataCtorArg
        internal set

    public var pUserData: MutPtr<UByte> = pUserDataCtorArg
        internal set

    public var pUserDataOut: MutPtr<UByte> = pUserDataOutCtorArg
        internal set

    public var pwszIdentity: Pwstr = pwszIdentityCtorArg
        internal set

    public var pEapError: MutPtr<EapError> = pEapErrorCtorArg
        internal set

    public constructor() : this(
        eapMethodType = EapMethodType(),
        dwFlags = 0u,
        dwSizeofConnectionData = 0u,
        pConnectionDataCtorArg = MutPtr(0L),
        dwSizeofUserData = 0u,
        pUserDataCtorArg = MutPtr(0L),
        dwSizeofUserDataOut = 0u,
        pUserDataOutCtorArg = MutPtr(0L),
        pwszIdentityCtorArg = MutPtr(0L),
        dwError = 0u,
        pEapErrorCtorArg = MutPtr(0L),
    )

    public operator fun component1(): EapMethodType = this.eapMethodType

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): UInt = this.dwSizeofConnectionData

    public operator fun component4(): MutPtr<UByte> = this.pConnectionData

    public operator fun component5(): UInt = this.dwSizeofUserData

    public operator fun component6(): MutPtr<UByte> = this.pUserData

    public operator fun component7(): UInt = this.dwSizeofUserDataOut

    public operator fun component8(): MutPtr<UByte> = this.pUserDataOut

    public operator fun component9(): Pwstr = this.pwszIdentity

    public operator fun component10(): UInt = this.dwError

    public operator fun component11(): MutPtr<EapError> = this.pEapError

    public fun copy(eapMethodType: EapMethodType = this.eapMethodType, dwFlags: UInt = this.dwFlags, dwSizeofConnectionData: UInt = this.dwSizeofConnectionData, pConnectionData: MutPtr<UByte> = this.pConnectionData, dwSizeofUserData: UInt = this.dwSizeofUserData, pUserData: MutPtr<UByte> = this.pUserData, dwSizeofUserDataOut: UInt = this.dwSizeofUserDataOut, pUserDataOut: MutPtr<UByte> = this.pUserDataOut, pwszIdentity: Pwstr = this.pwszIdentity, dwError: UInt = this.dwError, pEapError: MutPtr<EapError> = this.pEapError): EaphostIdentityUiParams = EaphostIdentityUiParams(eapMethodType = eapMethodType, dwFlags = dwFlags, dwSizeofConnectionData = dwSizeofConnectionData, pConnectionDataCtorArg = pConnectionData, dwSizeofUserData = dwSizeofUserData, pUserDataCtorArg = pUserData, dwSizeofUserDataOut = dwSizeofUserDataOut, pUserDataOutCtorArg = pUserDataOut, pwszIdentityCtorArg = pwszIdentity, dwError = dwError, pEapErrorCtorArg = pEapError)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EaphostIdentityUiParams) return false
        if (this.eapMethodType != other.eapMethodType) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwSizeofConnectionData != other.dwSizeofConnectionData) return false
        if (this.pConnectionData != other.pConnectionData) return false
        if (this.dwSizeofUserData != other.dwSizeofUserData) return false
        if (this.pUserData != other.pUserData) return false
        if (this.dwSizeofUserDataOut != other.dwSizeofUserDataOut) return false
        if (this.pUserDataOut != other.pUserDataOut) return false
        if (this.pwszIdentity != other.pwszIdentity) return false
        if (this.dwError != other.dwError) return false
        if (this.pEapError != other.pEapError) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.eapMethodType.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwSizeofConnectionData.hashCode()
        result = 31 * result + this.pConnectionData.hashCode()
        result = 31 * result + this.dwSizeofUserData.hashCode()
        result = 31 * result + this.pUserData.hashCode()
        result = 31 * result + this.dwSizeofUserDataOut.hashCode()
        result = 31 * result + this.pUserDataOut.hashCode()
        result = 31 * result + this.pwszIdentity.hashCode()
        result = 31 * result + this.dwError.hashCode()
        result = 31 * result + this.pEapError.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            eapMethodType: EapMethodType = EapMethodType(),
            dwFlags: UInt = 0u,
            dwSizeofConnectionData: UInt = 0u,
            pConnectionData: MutPtr<UByte> = MutPtr(0L),
            dwSizeofUserData: UInt = 0u,
            pUserData: MutPtr<UByte> = MutPtr(0L),
            dwSizeofUserDataOut: UInt = 0u,
            pUserDataOut: MutPtr<UByte> = MutPtr(0L),
            pwszIdentity: Pwstr = MutPtr(0L),
            dwError: UInt = 0u,
            pEapError: MutPtr<EapError> = MutPtr(0L),
        ): EaphostIdentityUiParams =
            EaphostIdentityUiParams(
                eapMethodType = eapMethodType,
                dwFlags = dwFlags,
                dwSizeofConnectionData = dwSizeofConnectionData,
                pConnectionDataCtorArg = pConnectionData,
                dwSizeofUserData = dwSizeofUserData,
                pUserDataCtorArg = pUserData,
                dwSizeofUserDataOut = dwSizeofUserDataOut,
                pUserDataOutCtorArg = pUserDataOut,
                pwszIdentityCtorArg = pwszIdentity,
                dwError = dwError,
                pEapErrorCtorArg = pEapError,
            )
    }
}

public class EaphostInteractiveUiParams internal constructor(
    public var dwSizeofContextData: UInt,
    pContextDataCtorArg: MutPtr<UByte>,
    public var dwSizeofInteractiveUIData: UInt,
    pInteractiveUIDataCtorArg: MutPtr<UByte>,
    public var dwError: UInt,
    pEapErrorCtorArg: MutPtr<EapError>,
) {
    public var pContextData: MutPtr<UByte> = pContextDataCtorArg
        internal set

    public var pInteractiveUIData: MutPtr<UByte> = pInteractiveUIDataCtorArg
        internal set

    public var pEapError: MutPtr<EapError> = pEapErrorCtorArg
        internal set

    public constructor() : this(
        dwSizeofContextData = 0u,
        pContextDataCtorArg = MutPtr(0L),
        dwSizeofInteractiveUIData = 0u,
        pInteractiveUIDataCtorArg = MutPtr(0L),
        dwError = 0u,
        pEapErrorCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSizeofContextData

    public operator fun component2(): MutPtr<UByte> = this.pContextData

    public operator fun component3(): UInt = this.dwSizeofInteractiveUIData

    public operator fun component4(): MutPtr<UByte> = this.pInteractiveUIData

    public operator fun component5(): UInt = this.dwError

    public operator fun component6(): MutPtr<EapError> = this.pEapError

    public fun copy(dwSizeofContextData: UInt = this.dwSizeofContextData, pContextData: MutPtr<UByte> = this.pContextData, dwSizeofInteractiveUIData: UInt = this.dwSizeofInteractiveUIData, pInteractiveUIData: MutPtr<UByte> = this.pInteractiveUIData, dwError: UInt = this.dwError, pEapError: MutPtr<EapError> = this.pEapError): EaphostInteractiveUiParams = EaphostInteractiveUiParams(dwSizeofContextData = dwSizeofContextData, pContextDataCtorArg = pContextData, dwSizeofInteractiveUIData = dwSizeofInteractiveUIData, pInteractiveUIDataCtorArg = pInteractiveUIData, dwError = dwError, pEapErrorCtorArg = pEapError)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EaphostInteractiveUiParams) return false
        if (this.dwSizeofContextData != other.dwSizeofContextData) return false
        if (this.pContextData != other.pContextData) return false
        if (this.dwSizeofInteractiveUIData != other.dwSizeofInteractiveUIData) return false
        if (this.pInteractiveUIData != other.pInteractiveUIData) return false
        if (this.dwError != other.dwError) return false
        if (this.pEapError != other.pEapError) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSizeofContextData.hashCode()
        result = 31 * result + this.pContextData.hashCode()
        result = 31 * result + this.dwSizeofInteractiveUIData.hashCode()
        result = 31 * result + this.pInteractiveUIData.hashCode()
        result = 31 * result + this.dwError.hashCode()
        result = 31 * result + this.pEapError.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EaphostInteractiveUiParams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EaphostInteractiveUiParams> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): EaphostInteractiveUiParams =
                    EaphostInteractiveUiParams(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<EapError>(64)
                        ).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: EaphostInteractiveUiParams) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSizeofContextData)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.pContextData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwSizeofInteractiveUIData)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 24L, value.pInteractiveUIData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwError)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<EapError>(64)
                    ).writeNative(addr + 40L, value.pEapError)
                }
            }

        public operator fun invoke(
            dwSizeofContextData: UInt = 0u,
            pContextData: MutPtr<UByte> = MutPtr(0L),
            dwSizeofInteractiveUIData: UInt = 0u,
            pInteractiveUIData: MutPtr<UByte> = MutPtr(0L),
            dwError: UInt = 0u,
            pEapError: MutPtr<EapError> = MutPtr(0L),
        ): EaphostInteractiveUiParams =
            EaphostInteractiveUiParams(
                dwSizeofContextData = dwSizeofContextData,
                pContextDataCtorArg = pContextData,
                dwSizeofInteractiveUIData = dwSizeofInteractiveUIData,
                pInteractiveUIDataCtorArg = pInteractiveUIData,
                dwError = dwError,
                pEapErrorCtorArg = pEapError,
            )
    }
}

public class EapAttribute internal constructor(
    public var eaType: EapAttributeType,
    public var dwLength: UInt,
    pValueCtorArg: MutPtr<UByte>,
) {
    public var pValue: MutPtr<UByte> = pValueCtorArg
        internal set

    public constructor() : this(
        eaType = 0,
        dwLength = 0u,
        pValueCtorArg = MutPtr(0L),
    )

    public operator fun component1(): EapAttributeType = this.eaType

    public operator fun component2(): UInt = this.dwLength

    public operator fun component3(): MutPtr<UByte> = this.pValue

    public fun copy(eaType: EapAttributeType = this.eaType, dwLength: UInt = this.dwLength, pValue: MutPtr<UByte> = this.pValue): EapAttribute = EapAttribute(eaType = eaType, dwLength = dwLength, pValueCtorArg = pValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EapAttribute) return false
        if (this.eaType != other.eaType) return false
        if (this.dwLength != other.dwLength) return false
        if (this.pValue != other.pValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.eaType.hashCode()
        result = 31 * result + this.dwLength.hashCode()
        result = 31 * result + this.pValue.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EapAttribute> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EapAttribute> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): EapAttribute =
                    EapAttribute(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: EapAttribute) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.eaType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.pValue)
                }
            }

        public operator fun invoke(
            eaType: EapAttributeType = 0,
            dwLength: UInt = 0u,
            pValue: MutPtr<UByte> = MutPtr(0L),
        ): EapAttribute =
            EapAttribute(
                eaType = eaType,
                dwLength = dwLength,
                pValueCtorArg = pValue,
            )
    }
}

public class EapAttributes internal constructor(
    public var dwNumberOfAttributes: UInt,
    pAttribsCtorArg: MutPtr<EapAttribute>,
) {
    public var pAttribs: MutPtr<EapAttribute> = pAttribsCtorArg
        internal set

    public constructor() : this(
        dwNumberOfAttributes = 0u,
        pAttribsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwNumberOfAttributes

    public operator fun component2(): MutPtr<EapAttribute> = this.pAttribs

    public fun copy(dwNumberOfAttributes: UInt = this.dwNumberOfAttributes, pAttribs: MutPtr<EapAttribute> = this.pAttribs): EapAttributes = EapAttributes(dwNumberOfAttributes = dwNumberOfAttributes, pAttribsCtorArg = pAttribs)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EapAttributes) return false
        if (this.dwNumberOfAttributes != other.dwNumberOfAttributes) return false
        if (this.pAttribs != other.pAttribs) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwNumberOfAttributes.hashCode()
        result = 31 * result + this.pAttribs.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EapAttributes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EapAttributes> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): EapAttributes =
                    EapAttributes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<EapAttribute>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: EapAttributes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwNumberOfAttributes)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<EapAttribute>(64)
                    ).writeNative(addr + 8L, value.pAttribs)
                }
            }

        public operator fun invoke(
            dwNumberOfAttributes: UInt = 0u,
            pAttribs: MutPtr<EapAttribute> = MutPtr(0L),
        ): EapAttributes =
            EapAttributes(
                dwNumberOfAttributes = dwNumberOfAttributes,
                pAttribsCtorArg = pAttribs,
            )
    }
}

public class EapAuthenticatorMethodRoutines internal constructor(
    public var dwSizeInBytes: UInt,
    pEapTypeCtorArg: MutPtr<EapMethodType>,
    public var eapMethodAuthenticatorInitialize: Int,
    public var eapMethodAuthenticatorBeginSession: Int,
    public var eapMethodAuthenticatorUpdateInnerMethodParams: Int,
    public var eapMethodAuthenticatorReceivePacket: Int,
    public var eapMethodAuthenticatorSendPacket: Int,
    public var eapMethodAuthenticatorGetAttributes: Int,
    public var eapMethodAuthenticatorSetAttributes: Int,
    public var eapMethodAuthenticatorGetResult: Int,
    public var eapMethodAuthenticatorEndSession: Int,
    public var eapMethodAuthenticatorShutdown: Int,
) {
    public var pEapType: MutPtr<EapMethodType> = pEapTypeCtorArg
        internal set

    public constructor() : this(
        dwSizeInBytes = 0u,
        pEapTypeCtorArg = MutPtr(0L),
        eapMethodAuthenticatorInitialize = 0,
        eapMethodAuthenticatorBeginSession = 0,
        eapMethodAuthenticatorUpdateInnerMethodParams = 0,
        eapMethodAuthenticatorReceivePacket = 0,
        eapMethodAuthenticatorSendPacket = 0,
        eapMethodAuthenticatorGetAttributes = 0,
        eapMethodAuthenticatorSetAttributes = 0,
        eapMethodAuthenticatorGetResult = 0,
        eapMethodAuthenticatorEndSession = 0,
        eapMethodAuthenticatorShutdown = 0,
    )

    public operator fun component1(): UInt = this.dwSizeInBytes

    public operator fun component2(): MutPtr<EapMethodType> = this.pEapType

    public operator fun component3(): Int = this.eapMethodAuthenticatorInitialize

    public operator fun component4(): Int = this.eapMethodAuthenticatorBeginSession

    public operator fun component5(): Int = this.eapMethodAuthenticatorUpdateInnerMethodParams

    public operator fun component6(): Int = this.eapMethodAuthenticatorReceivePacket

    public operator fun component7(): Int = this.eapMethodAuthenticatorSendPacket

    public operator fun component8(): Int = this.eapMethodAuthenticatorGetAttributes

    public operator fun component9(): Int = this.eapMethodAuthenticatorSetAttributes

    public operator fun component10(): Int = this.eapMethodAuthenticatorGetResult

    public operator fun component11(): Int = this.eapMethodAuthenticatorEndSession

    public operator fun component12(): Int = this.eapMethodAuthenticatorShutdown

    public fun copy(dwSizeInBytes: UInt = this.dwSizeInBytes, pEapType: MutPtr<EapMethodType> = this.pEapType, eapMethodAuthenticatorInitialize: Int = this.eapMethodAuthenticatorInitialize, eapMethodAuthenticatorBeginSession: Int = this.eapMethodAuthenticatorBeginSession, eapMethodAuthenticatorUpdateInnerMethodParams: Int = this.eapMethodAuthenticatorUpdateInnerMethodParams, eapMethodAuthenticatorReceivePacket: Int = this.eapMethodAuthenticatorReceivePacket, eapMethodAuthenticatorSendPacket: Int = this.eapMethodAuthenticatorSendPacket, eapMethodAuthenticatorGetAttributes: Int = this.eapMethodAuthenticatorGetAttributes, eapMethodAuthenticatorSetAttributes: Int = this.eapMethodAuthenticatorSetAttributes, eapMethodAuthenticatorGetResult: Int = this.eapMethodAuthenticatorGetResult, eapMethodAuthenticatorEndSession: Int = this.eapMethodAuthenticatorEndSession, eapMethodAuthenticatorShutdown: Int = this.eapMethodAuthenticatorShutdown): EapAuthenticatorMethodRoutines = EapAuthenticatorMethodRoutines(dwSizeInBytes = dwSizeInBytes, pEapTypeCtorArg = pEapType, eapMethodAuthenticatorInitialize = eapMethodAuthenticatorInitialize, eapMethodAuthenticatorBeginSession = eapMethodAuthenticatorBeginSession, eapMethodAuthenticatorUpdateInnerMethodParams = eapMethodAuthenticatorUpdateInnerMethodParams, eapMethodAuthenticatorReceivePacket = eapMethodAuthenticatorReceivePacket, eapMethodAuthenticatorSendPacket = eapMethodAuthenticatorSendPacket, eapMethodAuthenticatorGetAttributes = eapMethodAuthenticatorGetAttributes, eapMethodAuthenticatorSetAttributes = eapMethodAuthenticatorSetAttributes, eapMethodAuthenticatorGetResult = eapMethodAuthenticatorGetResult, eapMethodAuthenticatorEndSession = eapMethodAuthenticatorEndSession, eapMethodAuthenticatorShutdown = eapMethodAuthenticatorShutdown)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EapAuthenticatorMethodRoutines) return false
        if (this.dwSizeInBytes != other.dwSizeInBytes) return false
        if (this.pEapType != other.pEapType) return false
        if (this.eapMethodAuthenticatorInitialize != other.eapMethodAuthenticatorInitialize) return false
        if (this.eapMethodAuthenticatorBeginSession != other.eapMethodAuthenticatorBeginSession) return false
        if (this.eapMethodAuthenticatorUpdateInnerMethodParams != other.eapMethodAuthenticatorUpdateInnerMethodParams) return false
        if (this.eapMethodAuthenticatorReceivePacket != other.eapMethodAuthenticatorReceivePacket) return false
        if (this.eapMethodAuthenticatorSendPacket != other.eapMethodAuthenticatorSendPacket) return false
        if (this.eapMethodAuthenticatorGetAttributes != other.eapMethodAuthenticatorGetAttributes) return false
        if (this.eapMethodAuthenticatorSetAttributes != other.eapMethodAuthenticatorSetAttributes) return false
        if (this.eapMethodAuthenticatorGetResult != other.eapMethodAuthenticatorGetResult) return false
        if (this.eapMethodAuthenticatorEndSession != other.eapMethodAuthenticatorEndSession) return false
        if (this.eapMethodAuthenticatorShutdown != other.eapMethodAuthenticatorShutdown) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSizeInBytes.hashCode()
        result = 31 * result + this.pEapType.hashCode()
        result = 31 * result + this.eapMethodAuthenticatorInitialize.hashCode()
        result = 31 * result + this.eapMethodAuthenticatorBeginSession.hashCode()
        result = 31 * result + this.eapMethodAuthenticatorUpdateInnerMethodParams.hashCode()
        result = 31 * result + this.eapMethodAuthenticatorReceivePacket.hashCode()
        result = 31 * result + this.eapMethodAuthenticatorSendPacket.hashCode()
        result = 31 * result + this.eapMethodAuthenticatorGetAttributes.hashCode()
        result = 31 * result + this.eapMethodAuthenticatorSetAttributes.hashCode()
        result = 31 * result + this.eapMethodAuthenticatorGetResult.hashCode()
        result = 31 * result + this.eapMethodAuthenticatorEndSession.hashCode()
        result = 31 * result + this.eapMethodAuthenticatorShutdown.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EapAuthenticatorMethodRoutines> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EapAuthenticatorMethodRoutines> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 96L
                override fun readNative(addr: Long): EapAuthenticatorMethodRoutines =
                    EapAuthenticatorMethodRoutines(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<EapMethodType>(64)
                        ).readNative(addr + 8L),
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
                    )
                override fun writeNative(addr: Long, value: EapAuthenticatorMethodRoutines) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSizeInBytes)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<EapMethodType>(64)
                    ).writeNative(addr + 8L, value.pEapType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 16L, value.eapMethodAuthenticatorInitialize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 24L, value.eapMethodAuthenticatorBeginSession)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 32L, value.eapMethodAuthenticatorUpdateInnerMethodParams)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 40L, value.eapMethodAuthenticatorReceivePacket)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 48L, value.eapMethodAuthenticatorSendPacket)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 56L, value.eapMethodAuthenticatorGetAttributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 64L, value.eapMethodAuthenticatorSetAttributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 72L, value.eapMethodAuthenticatorGetResult)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 80L, value.eapMethodAuthenticatorEndSession)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 88L, value.eapMethodAuthenticatorShutdown)
                }
            }

        public operator fun invoke(
            dwSizeInBytes: UInt = 0u,
            pEapType: MutPtr<EapMethodType> = MutPtr(0L),
            eapMethodAuthenticatorInitialize: Int = 0,
            eapMethodAuthenticatorBeginSession: Int = 0,
            eapMethodAuthenticatorUpdateInnerMethodParams: Int = 0,
            eapMethodAuthenticatorReceivePacket: Int = 0,
            eapMethodAuthenticatorSendPacket: Int = 0,
            eapMethodAuthenticatorGetAttributes: Int = 0,
            eapMethodAuthenticatorSetAttributes: Int = 0,
            eapMethodAuthenticatorGetResult: Int = 0,
            eapMethodAuthenticatorEndSession: Int = 0,
            eapMethodAuthenticatorShutdown: Int = 0,
        ): EapAuthenticatorMethodRoutines =
            EapAuthenticatorMethodRoutines(
                dwSizeInBytes = dwSizeInBytes,
                pEapTypeCtorArg = pEapType,
                eapMethodAuthenticatorInitialize = eapMethodAuthenticatorInitialize,
                eapMethodAuthenticatorBeginSession = eapMethodAuthenticatorBeginSession,
                eapMethodAuthenticatorUpdateInnerMethodParams = eapMethodAuthenticatorUpdateInnerMethodParams,
                eapMethodAuthenticatorReceivePacket = eapMethodAuthenticatorReceivePacket,
                eapMethodAuthenticatorSendPacket = eapMethodAuthenticatorSendPacket,
                eapMethodAuthenticatorGetAttributes = eapMethodAuthenticatorGetAttributes,
                eapMethodAuthenticatorSetAttributes = eapMethodAuthenticatorSetAttributes,
                eapMethodAuthenticatorGetResult = eapMethodAuthenticatorGetResult,
                eapMethodAuthenticatorEndSession = eapMethodAuthenticatorEndSession,
                eapMethodAuthenticatorShutdown = eapMethodAuthenticatorShutdown,
            )
    }
}

public class EapConfigInputFieldArray internal constructor(
    public var dwVersion: UInt,
    public var dwNumberOfFields: UInt,
    pFieldsCtorArg: MutPtr<EapConfigInputFieldData>,
) {
    public var pFields: MutPtr<EapConfigInputFieldData> = pFieldsCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        dwNumberOfFields = 0u,
        pFieldsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): UInt = this.dwNumberOfFields

    public operator fun component3(): MutPtr<EapConfigInputFieldData> = this.pFields

    public fun copy(dwVersion: UInt = this.dwVersion, dwNumberOfFields: UInt = this.dwNumberOfFields, pFields: MutPtr<EapConfigInputFieldData> = this.pFields): EapConfigInputFieldArray = EapConfigInputFieldArray(dwVersion = dwVersion, dwNumberOfFields = dwNumberOfFields, pFieldsCtorArg = pFields)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EapConfigInputFieldArray) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.dwNumberOfFields != other.dwNumberOfFields) return false
        if (this.pFields != other.pFields) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.dwNumberOfFields.hashCode()
        result = 31 * result + this.pFields.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EapConfigInputFieldArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EapConfigInputFieldArray> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): EapConfigInputFieldArray =
                    EapConfigInputFieldArray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<EapConfigInputFieldData>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: EapConfigInputFieldArray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwNumberOfFields)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<EapConfigInputFieldData>(64)
                    ).writeNative(addr + 8L, value.pFields)
                }
            }

        public operator fun invoke(
            dwVersion: UInt = 0u,
            dwNumberOfFields: UInt = 0u,
            pFields: MutPtr<EapConfigInputFieldData> = MutPtr(0L),
        ): EapConfigInputFieldArray =
            EapConfigInputFieldArray(
                dwVersion = dwVersion,
                dwNumberOfFields = dwNumberOfFields,
                pFieldsCtorArg = pFields,
            )
    }
}

public class EapConfigInputFieldData internal constructor(
    public var dwSize: UInt,
    public var type: EapConfigInputFieldType,
    public var dwFlagProps: UInt,
    pwszLabelCtorArg: Pwstr,
    pwszDataCtorArg: Pwstr,
    public var dwMinDataLength: UInt,
    public var dwMaxDataLength: UInt,
) {
    public var pwszLabel: Pwstr = pwszLabelCtorArg
        internal set

    public var pwszData: Pwstr = pwszDataCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        type = 0,
        dwFlagProps = 0u,
        pwszLabelCtorArg = MutPtr(0L),
        pwszDataCtorArg = MutPtr(0L),
        dwMinDataLength = 0u,
        dwMaxDataLength = 0u,
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): EapConfigInputFieldType = this.type

    public operator fun component3(): UInt = this.dwFlagProps

    public operator fun component4(): Pwstr = this.pwszLabel

    public operator fun component5(): Pwstr = this.pwszData

    public operator fun component6(): UInt = this.dwMinDataLength

    public operator fun component7(): UInt = this.dwMaxDataLength

    public fun copy(dwSize: UInt = this.dwSize, type: EapConfigInputFieldType = this.type, dwFlagProps: UInt = this.dwFlagProps, pwszLabel: Pwstr = this.pwszLabel, pwszData: Pwstr = this.pwszData, dwMinDataLength: UInt = this.dwMinDataLength, dwMaxDataLength: UInt = this.dwMaxDataLength): EapConfigInputFieldData = EapConfigInputFieldData(dwSize = dwSize, type = type, dwFlagProps = dwFlagProps, pwszLabelCtorArg = pwszLabel, pwszDataCtorArg = pwszData, dwMinDataLength = dwMinDataLength, dwMaxDataLength = dwMaxDataLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EapConfigInputFieldData) return false
        if (this.dwSize != other.dwSize) return false
        if (this.type != other.type) return false
        if (this.dwFlagProps != other.dwFlagProps) return false
        if (this.pwszLabel != other.pwszLabel) return false
        if (this.pwszData != other.pwszData) return false
        if (this.dwMinDataLength != other.dwMinDataLength) return false
        if (this.dwMaxDataLength != other.dwMaxDataLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.dwFlagProps.hashCode()
        result = 31 * result + this.pwszLabel.hashCode()
        result = 31 * result + this.pwszData.hashCode()
        result = 31 * result + this.dwMinDataLength.hashCode()
        result = 31 * result + this.dwMaxDataLength.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            type: EapConfigInputFieldType = 0,
            dwFlagProps: UInt = 0u,
            pwszLabel: Pwstr = MutPtr(0L),
            pwszData: Pwstr = MutPtr(0L),
            dwMinDataLength: UInt = 0u,
            dwMaxDataLength: UInt = 0u,
        ): EapConfigInputFieldData =
            EapConfigInputFieldData(
                dwSize = dwSize,
                type = type,
                dwFlagProps = dwFlagProps,
                pwszLabelCtorArg = pwszLabel,
                pwszDataCtorArg = pwszData,
                dwMinDataLength = dwMinDataLength,
                dwMaxDataLength = dwMaxDataLength,
            )
    }
}

public data class EapCredExpiryReq(
    public var curCreds: EapConfigInputFieldArray = EapConfigInputFieldArray(),
    public var newCreds: EapConfigInputFieldArray = EapConfigInputFieldArray(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EapCredExpiryReq> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EapCredExpiryReq> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): EapCredExpiryReq =
                    EapCredExpiryReq(
                        (EapConfigInputFieldArray.typeLayout()).readNative(addr),
                        (EapConfigInputFieldArray.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: EapCredExpiryReq) {
                    (EapConfigInputFieldArray.typeLayout()).writeNative(addr, value.curCreds)
                    (EapConfigInputFieldArray.typeLayout()).writeNative(addr + 16L, value.newCreds)
                }
            }
    }
}

public class EapError internal constructor(
    public var dwWinError: UInt,
    public var type: EapMethodType,
    public var dwReasonCode: UInt,
    public var rootCauseGuid: Guid,
    public var repairGuid: Guid,
    public var helpLinkGuid: Guid,
    pRootCauseStringCtorArg: Pwstr,
    pRepairStringCtorArg: Pwstr,
) {
    public var pRootCauseString: Pwstr = pRootCauseStringCtorArg
        internal set

    public var pRepairString: Pwstr = pRepairStringCtorArg
        internal set

    public constructor() : this(
        dwWinError = 0u,
        type = EapMethodType(),
        dwReasonCode = 0u,
        rootCauseGuid = Guid(),
        repairGuid = Guid(),
        helpLinkGuid = Guid(),
        pRootCauseStringCtorArg = MutPtr(0L),
        pRepairStringCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwWinError

    public operator fun component2(): EapMethodType = this.type

    public operator fun component3(): UInt = this.dwReasonCode

    public operator fun component4(): Guid = this.rootCauseGuid

    public operator fun component5(): Guid = this.repairGuid

    public operator fun component6(): Guid = this.helpLinkGuid

    public operator fun component7(): Pwstr = this.pRootCauseString

    public operator fun component8(): Pwstr = this.pRepairString

    public fun copy(dwWinError: UInt = this.dwWinError, type: EapMethodType = this.type, dwReasonCode: UInt = this.dwReasonCode, rootCauseGuid: Guid = this.rootCauseGuid, repairGuid: Guid = this.repairGuid, helpLinkGuid: Guid = this.helpLinkGuid, pRootCauseString: Pwstr = this.pRootCauseString, pRepairString: Pwstr = this.pRepairString): EapError = EapError(dwWinError = dwWinError, type = type, dwReasonCode = dwReasonCode, rootCauseGuid = rootCauseGuid, repairGuid = repairGuid, helpLinkGuid = helpLinkGuid, pRootCauseStringCtorArg = pRootCauseString, pRepairStringCtorArg = pRepairString)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EapError) return false
        if (this.dwWinError != other.dwWinError) return false
        if (this.type != other.type) return false
        if (this.dwReasonCode != other.dwReasonCode) return false
        if (this.rootCauseGuid != other.rootCauseGuid) return false
        if (this.repairGuid != other.repairGuid) return false
        if (this.helpLinkGuid != other.helpLinkGuid) return false
        if (this.pRootCauseString != other.pRootCauseString) return false
        if (this.pRepairString != other.pRepairString) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwWinError.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.dwReasonCode.hashCode()
        result = 31 * result + this.rootCauseGuid.hashCode()
        result = 31 * result + this.repairGuid.hashCode()
        result = 31 * result + this.helpLinkGuid.hashCode()
        result = 31 * result + this.pRootCauseString.hashCode()
        result = 31 * result + this.pRepairString.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwWinError: UInt = 0u,
            type: EapMethodType = EapMethodType(),
            dwReasonCode: UInt = 0u,
            rootCauseGuid: Guid = Guid(),
            repairGuid: Guid = Guid(),
            helpLinkGuid: Guid = Guid(),
            pRootCauseString: Pwstr = MutPtr(0L),
            pRepairString: Pwstr = MutPtr(0L),
        ): EapError =
            EapError(
                dwWinError = dwWinError,
                type = type,
                dwReasonCode = dwReasonCode,
                rootCauseGuid = rootCauseGuid,
                repairGuid = repairGuid,
                helpLinkGuid = helpLinkGuid,
                pRootCauseStringCtorArg = pRootCauseString,
                pRepairStringCtorArg = pRepairString,
            )
    }
}

public data class EapInteractiveUiData(
    public var dwVersion: UInt = 0u,
    public var dwSize: UInt = 0u,
    public var dwDataType: EapInteractiveUiDataType = 0,
    public var cbUiData: UInt = 0u,
    public var pbUiData: EapUiDataFormat = EapUiDataFormat(),
)

public class EapMethodAuthenticatorResult internal constructor(
    public var fIsSuccess: Bool,
    public var dwFailureReason: UInt,
    pAuthAttribsCtorArg: MutPtr<EapAttributes>,
) {
    public var pAuthAttribs: MutPtr<EapAttributes> = pAuthAttribsCtorArg
        internal set

    public constructor() : this(
        fIsSuccess = 0,
        dwFailureReason = 0u,
        pAuthAttribsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Bool = this.fIsSuccess

    public operator fun component2(): UInt = this.dwFailureReason

    public operator fun component3(): MutPtr<EapAttributes> = this.pAuthAttribs

    public fun copy(fIsSuccess: Bool = this.fIsSuccess, dwFailureReason: UInt = this.dwFailureReason, pAuthAttribs: MutPtr<EapAttributes> = this.pAuthAttribs): EapMethodAuthenticatorResult = EapMethodAuthenticatorResult(fIsSuccess = fIsSuccess, dwFailureReason = dwFailureReason, pAuthAttribsCtorArg = pAuthAttribs)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EapMethodAuthenticatorResult) return false
        if (this.fIsSuccess != other.fIsSuccess) return false
        if (this.dwFailureReason != other.dwFailureReason) return false
        if (this.pAuthAttribs != other.pAuthAttribs) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fIsSuccess.hashCode()
        result = 31 * result + this.dwFailureReason.hashCode()
        result = 31 * result + this.pAuthAttribs.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EapMethodAuthenticatorResult> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EapMethodAuthenticatorResult> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): EapMethodAuthenticatorResult =
                    EapMethodAuthenticatorResult(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<EapAttributes>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: EapMethodAuthenticatorResult) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.fIsSuccess)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFailureReason)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<EapAttributes>(64)
                    ).writeNative(addr + 8L, value.pAuthAttribs)
                }
            }

        public operator fun invoke(
            fIsSuccess: Bool = 0,
            dwFailureReason: UInt = 0u,
            pAuthAttribs: MutPtr<EapAttributes> = MutPtr(0L),
        ): EapMethodAuthenticatorResult =
            EapMethodAuthenticatorResult(
                fIsSuccess = fIsSuccess,
                dwFailureReason = dwFailureReason,
                pAuthAttribsCtorArg = pAuthAttribs,
            )
    }
}

public class EapMethodInfo internal constructor(
    public var eaptype: EapMethodType,
    pwszAuthorNameCtorArg: Pwstr,
    pwszFriendlyNameCtorArg: Pwstr,
    public var eapProperties: UInt,
    pInnerMethodInfoCtorArg: MutPtr<EapMethodInfo>,
) {
    public var pwszAuthorName: Pwstr = pwszAuthorNameCtorArg
        internal set

    public var pwszFriendlyName: Pwstr = pwszFriendlyNameCtorArg
        internal set

    public var pInnerMethodInfo: MutPtr<EapMethodInfo> = pInnerMethodInfoCtorArg
        internal set

    public constructor() : this(
        eaptype = EapMethodType(),
        pwszAuthorNameCtorArg = MutPtr(0L),
        pwszFriendlyNameCtorArg = MutPtr(0L),
        eapProperties = 0u,
        pInnerMethodInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): EapMethodType = this.eaptype

    public operator fun component2(): Pwstr = this.pwszAuthorName

    public operator fun component3(): Pwstr = this.pwszFriendlyName

    public operator fun component4(): UInt = this.eapProperties

    public operator fun component5(): MutPtr<EapMethodInfo> = this.pInnerMethodInfo

    public fun copy(eaptype: EapMethodType = this.eaptype, pwszAuthorName: Pwstr = this.pwszAuthorName, pwszFriendlyName: Pwstr = this.pwszFriendlyName, eapProperties: UInt = this.eapProperties, pInnerMethodInfo: MutPtr<EapMethodInfo> = this.pInnerMethodInfo): EapMethodInfo = EapMethodInfo(eaptype = eaptype, pwszAuthorNameCtorArg = pwszAuthorName, pwszFriendlyNameCtorArg = pwszFriendlyName, eapProperties = eapProperties, pInnerMethodInfoCtorArg = pInnerMethodInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EapMethodInfo) return false
        if (this.eaptype != other.eaptype) return false
        if (this.pwszAuthorName != other.pwszAuthorName) return false
        if (this.pwszFriendlyName != other.pwszFriendlyName) return false
        if (this.eapProperties != other.eapProperties) return false
        if (this.pInnerMethodInfo != other.pInnerMethodInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.eaptype.hashCode()
        result = 31 * result + this.pwszAuthorName.hashCode()
        result = 31 * result + this.pwszFriendlyName.hashCode()
        result = 31 * result + this.eapProperties.hashCode()
        result = 31 * result + this.pInnerMethodInfo.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            eaptype: EapMethodType = EapMethodType(),
            pwszAuthorName: Pwstr = MutPtr(0L),
            pwszFriendlyName: Pwstr = MutPtr(0L),
            eapProperties: UInt = 0u,
            pInnerMethodInfo: MutPtr<EapMethodInfo> = MutPtr(0L),
        ): EapMethodInfo =
            EapMethodInfo(
                eaptype = eaptype,
                pwszAuthorNameCtorArg = pwszAuthorName,
                pwszFriendlyNameCtorArg = pwszFriendlyName,
                eapProperties = eapProperties,
                pInnerMethodInfoCtorArg = pInnerMethodInfo,
            )
    }
}

public class EapMethodInfoArray internal constructor(
    public var dwNumberOfMethods: UInt,
    pEapMethodsCtorArg: MutPtr<EapMethodInfo>,
) {
    public var pEapMethods: MutPtr<EapMethodInfo> = pEapMethodsCtorArg
        internal set

    public constructor() : this(
        dwNumberOfMethods = 0u,
        pEapMethodsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwNumberOfMethods

    public operator fun component2(): MutPtr<EapMethodInfo> = this.pEapMethods

    public fun copy(dwNumberOfMethods: UInt = this.dwNumberOfMethods, pEapMethods: MutPtr<EapMethodInfo> = this.pEapMethods): EapMethodInfoArray = EapMethodInfoArray(dwNumberOfMethods = dwNumberOfMethods, pEapMethodsCtorArg = pEapMethods)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EapMethodInfoArray) return false
        if (this.dwNumberOfMethods != other.dwNumberOfMethods) return false
        if (this.pEapMethods != other.pEapMethods) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwNumberOfMethods.hashCode()
        result = 31 * result + this.pEapMethods.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EapMethodInfoArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EapMethodInfoArray> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): EapMethodInfoArray =
                    EapMethodInfoArray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<EapMethodInfo>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: EapMethodInfoArray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwNumberOfMethods)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<EapMethodInfo>(64)
                    ).writeNative(addr + 8L, value.pEapMethods)
                }
            }

        public operator fun invoke(
            dwNumberOfMethods: UInt = 0u,
            pEapMethods: MutPtr<EapMethodInfo> = MutPtr(0L),
        ): EapMethodInfoArray =
            EapMethodInfoArray(
                dwNumberOfMethods = dwNumberOfMethods,
                pEapMethodsCtorArg = pEapMethods,
            )
    }
}

public class EapMethodInfoArrayEx internal constructor(
    public var dwNumberOfMethods: UInt,
    pEapMethodsCtorArg: MutPtr<EapMethodInfoEx>,
) {
    public var pEapMethods: MutPtr<EapMethodInfoEx> = pEapMethodsCtorArg
        internal set

    public constructor() : this(
        dwNumberOfMethods = 0u,
        pEapMethodsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwNumberOfMethods

    public operator fun component2(): MutPtr<EapMethodInfoEx> = this.pEapMethods

    public fun copy(dwNumberOfMethods: UInt = this.dwNumberOfMethods, pEapMethods: MutPtr<EapMethodInfoEx> = this.pEapMethods): EapMethodInfoArrayEx = EapMethodInfoArrayEx(dwNumberOfMethods = dwNumberOfMethods, pEapMethodsCtorArg = pEapMethods)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EapMethodInfoArrayEx) return false
        if (this.dwNumberOfMethods != other.dwNumberOfMethods) return false
        if (this.pEapMethods != other.pEapMethods) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwNumberOfMethods.hashCode()
        result = 31 * result + this.pEapMethods.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EapMethodInfoArrayEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EapMethodInfoArrayEx> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): EapMethodInfoArrayEx =
                    EapMethodInfoArrayEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<EapMethodInfoEx>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: EapMethodInfoArrayEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwNumberOfMethods)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<EapMethodInfoEx>(64)
                    ).writeNative(addr + 8L, value.pEapMethods)
                }
            }

        public operator fun invoke(
            dwNumberOfMethods: UInt = 0u,
            pEapMethods: MutPtr<EapMethodInfoEx> = MutPtr(0L),
        ): EapMethodInfoArrayEx =
            EapMethodInfoArrayEx(
                dwNumberOfMethods = dwNumberOfMethods,
                pEapMethodsCtorArg = pEapMethods,
            )
    }
}

public class EapMethodInfoEx internal constructor(
    public var eaptype: EapMethodType,
    pwszAuthorNameCtorArg: Pwstr,
    pwszFriendlyNameCtorArg: Pwstr,
    public var eapProperties: UInt,
    pInnerMethodInfoArrayCtorArg: MutPtr<EapMethodInfoArrayEx>,
) {
    public var pwszAuthorName: Pwstr = pwszAuthorNameCtorArg
        internal set

    public var pwszFriendlyName: Pwstr = pwszFriendlyNameCtorArg
        internal set

    public var pInnerMethodInfoArray: MutPtr<EapMethodInfoArrayEx> = pInnerMethodInfoArrayCtorArg
        internal set

    public constructor() : this(
        eaptype = EapMethodType(),
        pwszAuthorNameCtorArg = MutPtr(0L),
        pwszFriendlyNameCtorArg = MutPtr(0L),
        eapProperties = 0u,
        pInnerMethodInfoArrayCtorArg = MutPtr(0L),
    )

    public operator fun component1(): EapMethodType = this.eaptype

    public operator fun component2(): Pwstr = this.pwszAuthorName

    public operator fun component3(): Pwstr = this.pwszFriendlyName

    public operator fun component4(): UInt = this.eapProperties

    public operator fun component5(): MutPtr<EapMethodInfoArrayEx> = this.pInnerMethodInfoArray

    public fun copy(eaptype: EapMethodType = this.eaptype, pwszAuthorName: Pwstr = this.pwszAuthorName, pwszFriendlyName: Pwstr = this.pwszFriendlyName, eapProperties: UInt = this.eapProperties, pInnerMethodInfoArray: MutPtr<EapMethodInfoArrayEx> = this.pInnerMethodInfoArray): EapMethodInfoEx = EapMethodInfoEx(eaptype = eaptype, pwszAuthorNameCtorArg = pwszAuthorName, pwszFriendlyNameCtorArg = pwszFriendlyName, eapProperties = eapProperties, pInnerMethodInfoArrayCtorArg = pInnerMethodInfoArray)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EapMethodInfoEx) return false
        if (this.eaptype != other.eaptype) return false
        if (this.pwszAuthorName != other.pwszAuthorName) return false
        if (this.pwszFriendlyName != other.pwszFriendlyName) return false
        if (this.eapProperties != other.eapProperties) return false
        if (this.pInnerMethodInfoArray != other.pInnerMethodInfoArray) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.eaptype.hashCode()
        result = 31 * result + this.pwszAuthorName.hashCode()
        result = 31 * result + this.pwszFriendlyName.hashCode()
        result = 31 * result + this.eapProperties.hashCode()
        result = 31 * result + this.pInnerMethodInfoArray.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            eaptype: EapMethodType = EapMethodType(),
            pwszAuthorName: Pwstr = MutPtr(0L),
            pwszFriendlyName: Pwstr = MutPtr(0L),
            eapProperties: UInt = 0u,
            pInnerMethodInfoArray: MutPtr<EapMethodInfoArrayEx> = MutPtr(0L),
        ): EapMethodInfoEx =
            EapMethodInfoEx(
                eaptype = eaptype,
                pwszAuthorNameCtorArg = pwszAuthorName,
                pwszFriendlyNameCtorArg = pwszFriendlyName,
                eapProperties = eapProperties,
                pInnerMethodInfoArrayCtorArg = pInnerMethodInfoArray,
            )
    }
}

public data class EapMethodProperty(
    public var eapMethodPropertyType: EapMethodPropertyType = 0,
    public var eapMethodPropertyValueType: EapMethodPropertyValueType = 0,
    public var eapMethodPropertyValue: EapMethodPropertyValue = EapMethodPropertyValue(),
)

public class EapMethodPropertyArray internal constructor(
    public var dwNumberOfProperties: UInt,
    pMethodPropertyCtorArg: MutPtr<EapMethodProperty>,
) {
    public var pMethodProperty: MutPtr<EapMethodProperty> = pMethodPropertyCtorArg
        internal set

    public constructor() : this(
        dwNumberOfProperties = 0u,
        pMethodPropertyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwNumberOfProperties

    public operator fun component2(): MutPtr<EapMethodProperty> = this.pMethodProperty

    public fun copy(dwNumberOfProperties: UInt = this.dwNumberOfProperties, pMethodProperty: MutPtr<EapMethodProperty> = this.pMethodProperty): EapMethodPropertyArray = EapMethodPropertyArray(dwNumberOfProperties = dwNumberOfProperties, pMethodPropertyCtorArg = pMethodProperty)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EapMethodPropertyArray) return false
        if (this.dwNumberOfProperties != other.dwNumberOfProperties) return false
        if (this.pMethodProperty != other.pMethodProperty) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwNumberOfProperties.hashCode()
        result = 31 * result + this.pMethodProperty.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EapMethodPropertyArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EapMethodPropertyArray> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): EapMethodPropertyArray =
                    EapMethodPropertyArray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<EapMethodProperty>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: EapMethodPropertyArray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwNumberOfProperties)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<EapMethodProperty>(64)
                    ).writeNative(addr + 8L, value.pMethodProperty)
                }
            }

        public operator fun invoke(
            dwNumberOfProperties: UInt = 0u,
            pMethodProperty: MutPtr<EapMethodProperty> = MutPtr(0L),
        ): EapMethodPropertyArray =
            EapMethodPropertyArray(
                dwNumberOfProperties = dwNumberOfProperties,
                pMethodPropertyCtorArg = pMethodProperty,
            )
    }
}

public data class EapMethodPropertyValue(
    public var empvBool: EapMethodPropertyValueBool = EapMethodPropertyValueBool(),
    public var empvDword: EapMethodPropertyValueDword = EapMethodPropertyValueDword(),
    public var empvString: EapMethodPropertyValueString = EapMethodPropertyValueString(),
)

public data class EapMethodPropertyValueBool(
    public var length: UInt = 0u,
    public var value: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EapMethodPropertyValueBool> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EapMethodPropertyValueBool> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): EapMethodPropertyValueBool =
                    EapMethodPropertyValueBool(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: EapMethodPropertyValueBool) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.value)
                }
            }
    }
}

public data class EapMethodPropertyValueDword(
    public var length: UInt = 0u,
    public var value: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EapMethodPropertyValueDword> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EapMethodPropertyValueDword> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): EapMethodPropertyValueDword =
                    EapMethodPropertyValueDword(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: EapMethodPropertyValueDword) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.value)
                }
            }
    }
}

public class EapMethodPropertyValueString internal constructor(
    public var length: UInt,
    valueCtorArg: MutPtr<UByte>,
) {
    public var value: MutPtr<UByte> = valueCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        valueCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.length

    public operator fun component2(): MutPtr<UByte> = this.value

    public fun copy(length: UInt = this.length, value: MutPtr<UByte> = this.value): EapMethodPropertyValueString = EapMethodPropertyValueString(length = length, valueCtorArg = value)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EapMethodPropertyValueString) return false
        if (this.length != other.length) return false
        if (this.value != other.value) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.value.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EapMethodPropertyValueString> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EapMethodPropertyValueString> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): EapMethodPropertyValueString =
                    EapMethodPropertyValueString(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: EapMethodPropertyValueString) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.value)
                }
            }

        public operator fun invoke(
            length: UInt = 0u,
            value: MutPtr<UByte> = MutPtr(0L),
        ): EapMethodPropertyValueString =
            EapMethodPropertyValueString(
                length = length,
                valueCtorArg = value,
            )
    }
}

public data class EapMethodType(
    public var eapType: EapType = EapType(),
    public var dwAuthorId: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EapMethodType> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EapMethodType> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): EapMethodType =
                    EapMethodType(
                        (EapType.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: EapMethodType) {
                    (EapType.typeLayout()).writeNative(addr, value.eapType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwAuthorId)
                }
            }
    }
}

public class EapPeerMethodRoutines internal constructor(
    public var dwVersion: UInt,
    pEapTypeCtorArg: MutPtr<EapType>,
    public var eapPeerInitialize: Int,
    public var eapPeerGetIdentity: Int,
    public var eapPeerBeginSession: Int,
    public var eapPeerSetCredentials: Int,
    public var eapPeerProcessRequestPacket: Int,
    public var eapPeerGetResponsePacket: Int,
    public var eapPeerGetResult: Int,
    public var eapPeerGetUIContext: Int,
    public var eapPeerSetUIContext: Int,
    public var eapPeerGetResponseAttributes: Int,
    public var eapPeerSetResponseAttributes: Int,
    public var eapPeerEndSession: Int,
    public var eapPeerShutdown: Int,
) {
    public var pEapType: MutPtr<EapType> = pEapTypeCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        pEapTypeCtorArg = MutPtr(0L),
        eapPeerInitialize = 0,
        eapPeerGetIdentity = 0,
        eapPeerBeginSession = 0,
        eapPeerSetCredentials = 0,
        eapPeerProcessRequestPacket = 0,
        eapPeerGetResponsePacket = 0,
        eapPeerGetResult = 0,
        eapPeerGetUIContext = 0,
        eapPeerSetUIContext = 0,
        eapPeerGetResponseAttributes = 0,
        eapPeerSetResponseAttributes = 0,
        eapPeerEndSession = 0,
        eapPeerShutdown = 0,
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): MutPtr<EapType> = this.pEapType

    public operator fun component3(): Int = this.eapPeerInitialize

    public operator fun component4(): Int = this.eapPeerGetIdentity

    public operator fun component5(): Int = this.eapPeerBeginSession

    public operator fun component6(): Int = this.eapPeerSetCredentials

    public operator fun component7(): Int = this.eapPeerProcessRequestPacket

    public operator fun component8(): Int = this.eapPeerGetResponsePacket

    public operator fun component9(): Int = this.eapPeerGetResult

    public operator fun component10(): Int = this.eapPeerGetUIContext

    public operator fun component11(): Int = this.eapPeerSetUIContext

    public operator fun component12(): Int = this.eapPeerGetResponseAttributes

    public operator fun component13(): Int = this.eapPeerSetResponseAttributes

    public operator fun component14(): Int = this.eapPeerEndSession

    public operator fun component15(): Int = this.eapPeerShutdown

    public fun copy(dwVersion: UInt = this.dwVersion, pEapType: MutPtr<EapType> = this.pEapType, eapPeerInitialize: Int = this.eapPeerInitialize, eapPeerGetIdentity: Int = this.eapPeerGetIdentity, eapPeerBeginSession: Int = this.eapPeerBeginSession, eapPeerSetCredentials: Int = this.eapPeerSetCredentials, eapPeerProcessRequestPacket: Int = this.eapPeerProcessRequestPacket, eapPeerGetResponsePacket: Int = this.eapPeerGetResponsePacket, eapPeerGetResult: Int = this.eapPeerGetResult, eapPeerGetUIContext: Int = this.eapPeerGetUIContext, eapPeerSetUIContext: Int = this.eapPeerSetUIContext, eapPeerGetResponseAttributes: Int = this.eapPeerGetResponseAttributes, eapPeerSetResponseAttributes: Int = this.eapPeerSetResponseAttributes, eapPeerEndSession: Int = this.eapPeerEndSession, eapPeerShutdown: Int = this.eapPeerShutdown): EapPeerMethodRoutines = EapPeerMethodRoutines(dwVersion = dwVersion, pEapTypeCtorArg = pEapType, eapPeerInitialize = eapPeerInitialize, eapPeerGetIdentity = eapPeerGetIdentity, eapPeerBeginSession = eapPeerBeginSession, eapPeerSetCredentials = eapPeerSetCredentials, eapPeerProcessRequestPacket = eapPeerProcessRequestPacket, eapPeerGetResponsePacket = eapPeerGetResponsePacket, eapPeerGetResult = eapPeerGetResult, eapPeerGetUIContext = eapPeerGetUIContext, eapPeerSetUIContext = eapPeerSetUIContext, eapPeerGetResponseAttributes = eapPeerGetResponseAttributes, eapPeerSetResponseAttributes = eapPeerSetResponseAttributes, eapPeerEndSession = eapPeerEndSession, eapPeerShutdown = eapPeerShutdown)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EapPeerMethodRoutines) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.pEapType != other.pEapType) return false
        if (this.eapPeerInitialize != other.eapPeerInitialize) return false
        if (this.eapPeerGetIdentity != other.eapPeerGetIdentity) return false
        if (this.eapPeerBeginSession != other.eapPeerBeginSession) return false
        if (this.eapPeerSetCredentials != other.eapPeerSetCredentials) return false
        if (this.eapPeerProcessRequestPacket != other.eapPeerProcessRequestPacket) return false
        if (this.eapPeerGetResponsePacket != other.eapPeerGetResponsePacket) return false
        if (this.eapPeerGetResult != other.eapPeerGetResult) return false
        if (this.eapPeerGetUIContext != other.eapPeerGetUIContext) return false
        if (this.eapPeerSetUIContext != other.eapPeerSetUIContext) return false
        if (this.eapPeerGetResponseAttributes != other.eapPeerGetResponseAttributes) return false
        if (this.eapPeerSetResponseAttributes != other.eapPeerSetResponseAttributes) return false
        if (this.eapPeerEndSession != other.eapPeerEndSession) return false
        if (this.eapPeerShutdown != other.eapPeerShutdown) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.pEapType.hashCode()
        result = 31 * result + this.eapPeerInitialize.hashCode()
        result = 31 * result + this.eapPeerGetIdentity.hashCode()
        result = 31 * result + this.eapPeerBeginSession.hashCode()
        result = 31 * result + this.eapPeerSetCredentials.hashCode()
        result = 31 * result + this.eapPeerProcessRequestPacket.hashCode()
        result = 31 * result + this.eapPeerGetResponsePacket.hashCode()
        result = 31 * result + this.eapPeerGetResult.hashCode()
        result = 31 * result + this.eapPeerGetUIContext.hashCode()
        result = 31 * result + this.eapPeerSetUIContext.hashCode()
        result = 31 * result + this.eapPeerGetResponseAttributes.hashCode()
        result = 31 * result + this.eapPeerSetResponseAttributes.hashCode()
        result = 31 * result + this.eapPeerEndSession.hashCode()
        result = 31 * result + this.eapPeerShutdown.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EapPeerMethodRoutines> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EapPeerMethodRoutines> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 120L
                override fun readNative(addr: Long): EapPeerMethodRoutines =
                    EapPeerMethodRoutines(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<EapType>(64)
                        ).readNative(addr + 8L),
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
                override fun writeNative(addr: Long, value: EapPeerMethodRoutines) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersion)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<EapType>(64)
                    ).writeNative(addr + 8L, value.pEapType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 16L, value.eapPeerInitialize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 24L, value.eapPeerGetIdentity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 32L, value.eapPeerBeginSession)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 40L, value.eapPeerSetCredentials)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 48L, value.eapPeerProcessRequestPacket)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 56L, value.eapPeerGetResponsePacket)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 64L, value.eapPeerGetResult)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 72L, value.eapPeerGetUIContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 80L, value.eapPeerSetUIContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 88L, value.eapPeerGetResponseAttributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 96L, value.eapPeerSetResponseAttributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 104L, value.eapPeerEndSession)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 112L, value.eapPeerShutdown)
                }
            }

        public operator fun invoke(
            dwVersion: UInt = 0u,
            pEapType: MutPtr<EapType> = MutPtr(0L),
            eapPeerInitialize: Int = 0,
            eapPeerGetIdentity: Int = 0,
            eapPeerBeginSession: Int = 0,
            eapPeerSetCredentials: Int = 0,
            eapPeerProcessRequestPacket: Int = 0,
            eapPeerGetResponsePacket: Int = 0,
            eapPeerGetResult: Int = 0,
            eapPeerGetUIContext: Int = 0,
            eapPeerSetUIContext: Int = 0,
            eapPeerGetResponseAttributes: Int = 0,
            eapPeerSetResponseAttributes: Int = 0,
            eapPeerEndSession: Int = 0,
            eapPeerShutdown: Int = 0,
        ): EapPeerMethodRoutines =
            EapPeerMethodRoutines(
                dwVersion = dwVersion,
                pEapTypeCtorArg = pEapType,
                eapPeerInitialize = eapPeerInitialize,
                eapPeerGetIdentity = eapPeerGetIdentity,
                eapPeerBeginSession = eapPeerBeginSession,
                eapPeerSetCredentials = eapPeerSetCredentials,
                eapPeerProcessRequestPacket = eapPeerProcessRequestPacket,
                eapPeerGetResponsePacket = eapPeerGetResponsePacket,
                eapPeerGetResult = eapPeerGetResult,
                eapPeerGetUIContext = eapPeerGetUIContext,
                eapPeerSetUIContext = eapPeerSetUIContext,
                eapPeerGetResponseAttributes = eapPeerGetResponseAttributes,
                eapPeerSetResponseAttributes = eapPeerSetResponseAttributes,
                eapPeerEndSession = eapPeerEndSession,
                eapPeerShutdown = eapPeerShutdown,
            )
    }
}

public data class EapType(
    public var type: UByte = 0u,
    public var dwVendorId: UInt = 0u,
    public var dwVendorType: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EapType> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EapType> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): EapType =
                    EapType(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: EapType) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwVendorId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwVendorType)
                }
            }
    }
}

public class EapUiDataFormat internal constructor(
    credDataCtorArg: MutPtr<EapConfigInputFieldArray>,
    credExpiryDataCtorArg: MutPtr<EapCredExpiryReq>,
    credLogonDataCtorArg: MutPtr<EapConfigInputFieldArray>,
) {
    public var credData: MutPtr<EapConfigInputFieldArray> = credDataCtorArg
        internal set

    public var credExpiryData: MutPtr<EapCredExpiryReq> = credExpiryDataCtorArg
        internal set

    public var credLogonData: MutPtr<EapConfigInputFieldArray> = credLogonDataCtorArg
        internal set

    public constructor() : this(
        credDataCtorArg = MutPtr(0L),
        credExpiryDataCtorArg = MutPtr(0L),
        credLogonDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<EapConfigInputFieldArray> = this.credData

    public operator fun component2(): MutPtr<EapCredExpiryReq> = this.credExpiryData

    public operator fun component3(): MutPtr<EapConfigInputFieldArray> = this.credLogonData

    public fun copy(credData: MutPtr<EapConfigInputFieldArray> = this.credData, credExpiryData: MutPtr<EapCredExpiryReq> = this.credExpiryData, credLogonData: MutPtr<EapConfigInputFieldArray> = this.credLogonData): EapUiDataFormat = EapUiDataFormat(credDataCtorArg = credData, credExpiryDataCtorArg = credExpiryData, credLogonDataCtorArg = credLogonData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EapUiDataFormat) return false
        if (this.credData != other.credData) return false
        if (this.credExpiryData != other.credExpiryData) return false
        if (this.credLogonData != other.credLogonData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.credData.hashCode()
        result = 31 * result + this.credExpiryData.hashCode()
        result = 31 * result + this.credLogonData.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            credData: MutPtr<EapConfigInputFieldArray> = MutPtr(0L),
            credExpiryData: MutPtr<EapCredExpiryReq> = MutPtr(0L),
            credLogonData: MutPtr<EapConfigInputFieldArray> = MutPtr(0L),
        ): EapUiDataFormat =
            EapUiDataFormat(
                credDataCtorArg = credData,
                credExpiryDataCtorArg = credExpiryData,
                credLogonDataCtorArg = credLogonData,
            )
    }
}

public class EapCertificateCredential internal constructor(
    public var certHash: UByteArray,
    passwordCtorArg: Pwstr,
) {
    public var password: Pwstr = passwordCtorArg
        internal set

    public constructor() : this(
        certHash = UByteArray(20),
        passwordCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UByteArray = this.certHash

    public operator fun component2(): Pwstr = this.password

    public fun copy(certHash: UByteArray = this.certHash, password: Pwstr = this.password): EapCertificateCredential = EapCertificateCredential(certHash = certHash, passwordCtorArg = password)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EapCertificateCredential) return false
        if (!this.certHash.contentEquals(other.certHash)) return false
        if (this.password != other.password) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.certHash.contentHashCode()
        result = 31 * result + this.password.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            certHash: UByteArray = UByteArray(20),
            password: Pwstr = MutPtr(0L),
        ): EapCertificateCredential =
            EapCertificateCredential(
                certHash = certHash,
                passwordCtorArg = password,
            )
    }
}

public data class EapCredential(
    public var credType: EapCredentialType = 0,
    public var credData: EapCredentialTypeData = EapCredentialTypeData(),
)

public data class EapCredentialTypeData(
    public var usernamePassword: EapUsernamePasswordCredential = EapUsernamePasswordCredential(),
    public var certificate: EapCertificateCredential = EapCertificateCredential(),
    public var sim: EapSimCredential = EapSimCredential(),
)

public class EapHostPeerMethodResult internal constructor(
    public var fIsSuccess: Bool,
    public var dwFailureReasonCode: UInt,
    public var fSaveConnectionData: Bool,
    public var dwSizeofConnectionData: UInt,
    pConnectionDataCtorArg: MutPtr<UByte>,
    public var fSaveUserData: Bool,
    public var dwSizeofUserData: UInt,
    pUserDataCtorArg: MutPtr<UByte>,
    pAttribArrayCtorArg: MutPtr<EapAttributes>,
    public var isolationState: IsolationState,
    pEapMethodInfoCtorArg: MutPtr<EapMethodInfo>,
    pEapErrorCtorArg: MutPtr<EapError>,
) {
    public var pConnectionData: MutPtr<UByte> = pConnectionDataCtorArg
        internal set

    public var pUserData: MutPtr<UByte> = pUserDataCtorArg
        internal set

    public var pAttribArray: MutPtr<EapAttributes> = pAttribArrayCtorArg
        internal set

    public var pEapMethodInfo: MutPtr<EapMethodInfo> = pEapMethodInfoCtorArg
        internal set

    public var pEapError: MutPtr<EapError> = pEapErrorCtorArg
        internal set

    public constructor() : this(
        fIsSuccess = 0,
        dwFailureReasonCode = 0u,
        fSaveConnectionData = 0,
        dwSizeofConnectionData = 0u,
        pConnectionDataCtorArg = MutPtr(0L),
        fSaveUserData = 0,
        dwSizeofUserData = 0u,
        pUserDataCtorArg = MutPtr(0L),
        pAttribArrayCtorArg = MutPtr(0L),
        isolationState = 0,
        pEapMethodInfoCtorArg = MutPtr(0L),
        pEapErrorCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Bool = this.fIsSuccess

    public operator fun component2(): UInt = this.dwFailureReasonCode

    public operator fun component3(): Bool = this.fSaveConnectionData

    public operator fun component4(): UInt = this.dwSizeofConnectionData

    public operator fun component5(): MutPtr<UByte> = this.pConnectionData

    public operator fun component6(): Bool = this.fSaveUserData

    public operator fun component7(): UInt = this.dwSizeofUserData

    public operator fun component8(): MutPtr<UByte> = this.pUserData

    public operator fun component9(): MutPtr<EapAttributes> = this.pAttribArray

    public operator fun component10(): IsolationState = this.isolationState

    public operator fun component11(): MutPtr<EapMethodInfo> = this.pEapMethodInfo

    public operator fun component12(): MutPtr<EapError> = this.pEapError

    public fun copy(fIsSuccess: Bool = this.fIsSuccess, dwFailureReasonCode: UInt = this.dwFailureReasonCode, fSaveConnectionData: Bool = this.fSaveConnectionData, dwSizeofConnectionData: UInt = this.dwSizeofConnectionData, pConnectionData: MutPtr<UByte> = this.pConnectionData, fSaveUserData: Bool = this.fSaveUserData, dwSizeofUserData: UInt = this.dwSizeofUserData, pUserData: MutPtr<UByte> = this.pUserData, pAttribArray: MutPtr<EapAttributes> = this.pAttribArray, isolationState: IsolationState = this.isolationState, pEapMethodInfo: MutPtr<EapMethodInfo> = this.pEapMethodInfo, pEapError: MutPtr<EapError> = this.pEapError): EapHostPeerMethodResult = EapHostPeerMethodResult(fIsSuccess = fIsSuccess, dwFailureReasonCode = dwFailureReasonCode, fSaveConnectionData = fSaveConnectionData, dwSizeofConnectionData = dwSizeofConnectionData, pConnectionDataCtorArg = pConnectionData, fSaveUserData = fSaveUserData, dwSizeofUserData = dwSizeofUserData, pUserDataCtorArg = pUserData, pAttribArrayCtorArg = pAttribArray, isolationState = isolationState, pEapMethodInfoCtorArg = pEapMethodInfo, pEapErrorCtorArg = pEapError)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EapHostPeerMethodResult) return false
        if (this.fIsSuccess != other.fIsSuccess) return false
        if (this.dwFailureReasonCode != other.dwFailureReasonCode) return false
        if (this.fSaveConnectionData != other.fSaveConnectionData) return false
        if (this.dwSizeofConnectionData != other.dwSizeofConnectionData) return false
        if (this.pConnectionData != other.pConnectionData) return false
        if (this.fSaveUserData != other.fSaveUserData) return false
        if (this.dwSizeofUserData != other.dwSizeofUserData) return false
        if (this.pUserData != other.pUserData) return false
        if (this.pAttribArray != other.pAttribArray) return false
        if (this.isolationState != other.isolationState) return false
        if (this.pEapMethodInfo != other.pEapMethodInfo) return false
        if (this.pEapError != other.pEapError) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fIsSuccess.hashCode()
        result = 31 * result + this.dwFailureReasonCode.hashCode()
        result = 31 * result + this.fSaveConnectionData.hashCode()
        result = 31 * result + this.dwSizeofConnectionData.hashCode()
        result = 31 * result + this.pConnectionData.hashCode()
        result = 31 * result + this.fSaveUserData.hashCode()
        result = 31 * result + this.dwSizeofUserData.hashCode()
        result = 31 * result + this.pUserData.hashCode()
        result = 31 * result + this.pAttribArray.hashCode()
        result = 31 * result + this.isolationState.hashCode()
        result = 31 * result + this.pEapMethodInfo.hashCode()
        result = 31 * result + this.pEapError.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EapHostPeerMethodResult> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EapHostPeerMethodResult> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): EapHostPeerMethodResult =
                    EapHostPeerMethodResult(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<EapAttributes>(64)
                        ).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<EapMethodInfo>(64)
                        ).readNative(addr + 56L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<EapError>(64)
                        ).readNative(addr + 64L),
                    )
                override fun writeNative(addr: Long, value: EapHostPeerMethodResult) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.fIsSuccess)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFailureReasonCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.fSaveConnectionData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwSizeofConnectionData)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 16L, value.pConnectionData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.fSaveUserData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwSizeofUserData)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 32L, value.pUserData)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<EapAttributes>(64)
                    ).writeNative(addr + 40L, value.pAttribArray)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 48L, value.isolationState)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<EapMethodInfo>(64)
                    ).writeNative(addr + 56L, value.pEapMethodInfo)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<EapError>(64)
                    ).writeNative(addr + 64L, value.pEapError)
                }
            }

        public operator fun invoke(
            fIsSuccess: Bool = 0,
            dwFailureReasonCode: UInt = 0u,
            fSaveConnectionData: Bool = 0,
            dwSizeofConnectionData: UInt = 0u,
            pConnectionData: MutPtr<UByte> = MutPtr(0L),
            fSaveUserData: Bool = 0,
            dwSizeofUserData: UInt = 0u,
            pUserData: MutPtr<UByte> = MutPtr(0L),
            pAttribArray: MutPtr<EapAttributes> = MutPtr(0L),
            isolationState: IsolationState = 0,
            pEapMethodInfo: MutPtr<EapMethodInfo> = MutPtr(0L),
            pEapError: MutPtr<EapError> = MutPtr(0L),
        ): EapHostPeerMethodResult =
            EapHostPeerMethodResult(
                fIsSuccess = fIsSuccess,
                dwFailureReasonCode = dwFailureReasonCode,
                fSaveConnectionData = fSaveConnectionData,
                dwSizeofConnectionData = dwSizeofConnectionData,
                pConnectionDataCtorArg = pConnectionData,
                fSaveUserData = fSaveUserData,
                dwSizeofUserData = dwSizeofUserData,
                pUserDataCtorArg = pUserData,
                pAttribArrayCtorArg = pAttribArray,
                isolationState = isolationState,
                pEapMethodInfoCtorArg = pEapMethodInfo,
                pEapErrorCtorArg = pEapError,
            )
    }
}

public data class EapPacket(
    public var code: UByte = 0u,
    public var id: UByte = 0u,
    public var length: UByteArray = UByteArray(2),
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EapPacket) return false
        if (this.code != other.code) return false
        if (this.id != other.id) return false
        if (!this.length.contentEquals(other.length)) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.code.hashCode()
        result = 31 * result + this.id.hashCode()
        result = 31 * result + this.length.contentHashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EapPacket> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EapPacket> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 5L
                override fun readNative(addr: Long): EapPacket =
                    EapPacket(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 2L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: EapPacket) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.code)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.id)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 2L, value.length.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 4L, value.data.toList())
                }
            }
    }
}

public data class EapPeerMethodOutput(
    public var action: EapPeerMethodResponseAction = 0,
    public var fAllowNotifications: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EapPeerMethodOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EapPeerMethodOutput> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): EapPeerMethodOutput =
                    EapPeerMethodOutput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: EapPeerMethodOutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.action)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.fAllowNotifications)
                }
            }
    }
}

public class EapPeerMethodResult internal constructor(
    public var fIsSuccess: Bool,
    public var dwFailureReasonCode: UInt,
    public var fSaveConnectionData: Bool,
    public var dwSizeofConnectionData: UInt,
    pConnectionDataCtorArg: MutPtr<UByte>,
    public var fSaveUserData: Bool,
    public var dwSizeofUserData: UInt,
    pUserDataCtorArg: MutPtr<UByte>,
    pAttribArrayCtorArg: MutPtr<EapAttributes>,
    pEapErrorCtorArg: MutPtr<EapError>,
    pNgcKerbTicketCtorArg: MutPtr<NgcTicketContext>,
    public var fSaveToCredMan: Bool,
) {
    public var pConnectionData: MutPtr<UByte> = pConnectionDataCtorArg
        internal set

    public var pUserData: MutPtr<UByte> = pUserDataCtorArg
        internal set

    public var pAttribArray: MutPtr<EapAttributes> = pAttribArrayCtorArg
        internal set

    public var pEapError: MutPtr<EapError> = pEapErrorCtorArg
        internal set

    public var pNgcKerbTicket: MutPtr<NgcTicketContext> = pNgcKerbTicketCtorArg
        internal set

    public constructor() : this(
        fIsSuccess = 0,
        dwFailureReasonCode = 0u,
        fSaveConnectionData = 0,
        dwSizeofConnectionData = 0u,
        pConnectionDataCtorArg = MutPtr(0L),
        fSaveUserData = 0,
        dwSizeofUserData = 0u,
        pUserDataCtorArg = MutPtr(0L),
        pAttribArrayCtorArg = MutPtr(0L),
        pEapErrorCtorArg = MutPtr(0L),
        pNgcKerbTicketCtorArg = MutPtr(0L),
        fSaveToCredMan = 0,
    )

    public operator fun component1(): Bool = this.fIsSuccess

    public operator fun component2(): UInt = this.dwFailureReasonCode

    public operator fun component3(): Bool = this.fSaveConnectionData

    public operator fun component4(): UInt = this.dwSizeofConnectionData

    public operator fun component5(): MutPtr<UByte> = this.pConnectionData

    public operator fun component6(): Bool = this.fSaveUserData

    public operator fun component7(): UInt = this.dwSizeofUserData

    public operator fun component8(): MutPtr<UByte> = this.pUserData

    public operator fun component9(): MutPtr<EapAttributes> = this.pAttribArray

    public operator fun component10(): MutPtr<EapError> = this.pEapError

    public operator fun component11(): MutPtr<NgcTicketContext> = this.pNgcKerbTicket

    public operator fun component12(): Bool = this.fSaveToCredMan

    public fun copy(fIsSuccess: Bool = this.fIsSuccess, dwFailureReasonCode: UInt = this.dwFailureReasonCode, fSaveConnectionData: Bool = this.fSaveConnectionData, dwSizeofConnectionData: UInt = this.dwSizeofConnectionData, pConnectionData: MutPtr<UByte> = this.pConnectionData, fSaveUserData: Bool = this.fSaveUserData, dwSizeofUserData: UInt = this.dwSizeofUserData, pUserData: MutPtr<UByte> = this.pUserData, pAttribArray: MutPtr<EapAttributes> = this.pAttribArray, pEapError: MutPtr<EapError> = this.pEapError, pNgcKerbTicket: MutPtr<NgcTicketContext> = this.pNgcKerbTicket, fSaveToCredMan: Bool = this.fSaveToCredMan): EapPeerMethodResult = EapPeerMethodResult(fIsSuccess = fIsSuccess, dwFailureReasonCode = dwFailureReasonCode, fSaveConnectionData = fSaveConnectionData, dwSizeofConnectionData = dwSizeofConnectionData, pConnectionDataCtorArg = pConnectionData, fSaveUserData = fSaveUserData, dwSizeofUserData = dwSizeofUserData, pUserDataCtorArg = pUserData, pAttribArrayCtorArg = pAttribArray, pEapErrorCtorArg = pEapError, pNgcKerbTicketCtorArg = pNgcKerbTicket, fSaveToCredMan = fSaveToCredMan)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EapPeerMethodResult) return false
        if (this.fIsSuccess != other.fIsSuccess) return false
        if (this.dwFailureReasonCode != other.dwFailureReasonCode) return false
        if (this.fSaveConnectionData != other.fSaveConnectionData) return false
        if (this.dwSizeofConnectionData != other.dwSizeofConnectionData) return false
        if (this.pConnectionData != other.pConnectionData) return false
        if (this.fSaveUserData != other.fSaveUserData) return false
        if (this.dwSizeofUserData != other.dwSizeofUserData) return false
        if (this.pUserData != other.pUserData) return false
        if (this.pAttribArray != other.pAttribArray) return false
        if (this.pEapError != other.pEapError) return false
        if (this.pNgcKerbTicket != other.pNgcKerbTicket) return false
        if (this.fSaveToCredMan != other.fSaveToCredMan) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fIsSuccess.hashCode()
        result = 31 * result + this.dwFailureReasonCode.hashCode()
        result = 31 * result + this.fSaveConnectionData.hashCode()
        result = 31 * result + this.dwSizeofConnectionData.hashCode()
        result = 31 * result + this.pConnectionData.hashCode()
        result = 31 * result + this.fSaveUserData.hashCode()
        result = 31 * result + this.dwSizeofUserData.hashCode()
        result = 31 * result + this.pUserData.hashCode()
        result = 31 * result + this.pAttribArray.hashCode()
        result = 31 * result + this.pEapError.hashCode()
        result = 31 * result + this.pNgcKerbTicket.hashCode()
        result = 31 * result + this.fSaveToCredMan.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EapPeerMethodResult> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EapPeerMethodResult> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): EapPeerMethodResult =
                    EapPeerMethodResult(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<EapAttributes>(64)
                        ).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<EapError>(64)
                        ).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<NgcTicketContext>(64)
                        ).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 64L),
                    )
                override fun writeNative(addr: Long, value: EapPeerMethodResult) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.fIsSuccess)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFailureReasonCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.fSaveConnectionData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwSizeofConnectionData)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 16L, value.pConnectionData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.fSaveUserData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwSizeofUserData)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 32L, value.pUserData)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<EapAttributes>(64)
                    ).writeNative(addr + 40L, value.pAttribArray)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<EapError>(64)
                    ).writeNative(addr + 48L, value.pEapError)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<NgcTicketContext>(64)
                    ).writeNative(addr + 56L, value.pNgcKerbTicket)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 64L, value.fSaveToCredMan)
                }
            }

        public operator fun invoke(
            fIsSuccess: Bool = 0,
            dwFailureReasonCode: UInt = 0u,
            fSaveConnectionData: Bool = 0,
            dwSizeofConnectionData: UInt = 0u,
            pConnectionData: MutPtr<UByte> = MutPtr(0L),
            fSaveUserData: Bool = 0,
            dwSizeofUserData: UInt = 0u,
            pUserData: MutPtr<UByte> = MutPtr(0L),
            pAttribArray: MutPtr<EapAttributes> = MutPtr(0L),
            pEapError: MutPtr<EapError> = MutPtr(0L),
            pNgcKerbTicket: MutPtr<NgcTicketContext> = MutPtr(0L),
            fSaveToCredMan: Bool = 0,
        ): EapPeerMethodResult =
            EapPeerMethodResult(
                fIsSuccess = fIsSuccess,
                dwFailureReasonCode = dwFailureReasonCode,
                fSaveConnectionData = fSaveConnectionData,
                dwSizeofConnectionData = dwSizeofConnectionData,
                pConnectionDataCtorArg = pConnectionData,
                fSaveUserData = fSaveUserData,
                dwSizeofUserData = dwSizeofUserData,
                pUserDataCtorArg = pUserData,
                pAttribArrayCtorArg = pAttribArray,
                pEapErrorCtorArg = pEapError,
                pNgcKerbTicketCtorArg = pNgcKerbTicket,
                fSaveToCredMan = fSaveToCredMan,
            )
    }
}

public class EapSimCredential internal constructor(
    iccIDCtorArg: Pwstr,
) {
    public var iccID: Pwstr = iccIDCtorArg
        internal set

    public constructor() : this(
        iccIDCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.iccID

    public fun copy(iccID: Pwstr = this.iccID): EapSimCredential = EapSimCredential(iccIDCtorArg = iccID)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EapSimCredential) return false
        if (this.iccID != other.iccID) return false
        return true
    }

    override fun hashCode(): Int = this.iccID.hashCode()

    public companion object {
        public operator fun invoke(
            iccID: Pwstr = MutPtr(0L),
        ): EapSimCredential =
            EapSimCredential(
                iccIDCtorArg = iccID,
            )
    }
}

public class EapUsernamePasswordCredential internal constructor(
    usernameCtorArg: Pwstr,
    passwordCtorArg: Pwstr,
) {
    public var username: Pwstr = usernameCtorArg
        internal set

    public var password: Pwstr = passwordCtorArg
        internal set

    public constructor() : this(
        usernameCtorArg = MutPtr(0L),
        passwordCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.username

    public operator fun component2(): Pwstr = this.password

    public fun copy(username: Pwstr = this.username, password: Pwstr = this.password): EapUsernamePasswordCredential = EapUsernamePasswordCredential(usernameCtorArg = username, passwordCtorArg = password)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EapUsernamePasswordCredential) return false
        if (this.username != other.username) return false
        if (this.password != other.password) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.username.hashCode()
        result = 31 * result + this.password.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            username: Pwstr = MutPtr(0L),
            password: Pwstr = MutPtr(0L),
        ): EapUsernamePasswordCredential =
            EapUsernamePasswordCredential(
                usernameCtorArg = username,
                passwordCtorArg = password,
            )
    }
}

public class LegacyIdentityUiParams internal constructor(
    public var eapType: UInt,
    public var dwFlags: UInt,
    public var dwSizeofConnectionData: UInt,
    pConnectionDataCtorArg: MutPtr<UByte>,
    public var dwSizeofUserData: UInt,
    pUserDataCtorArg: MutPtr<UByte>,
    public var dwSizeofUserDataOut: UInt,
    pUserDataOutCtorArg: MutPtr<UByte>,
    pwszIdentityCtorArg: Pwstr,
    public var dwError: UInt,
) {
    public var pConnectionData: MutPtr<UByte> = pConnectionDataCtorArg
        internal set

    public var pUserData: MutPtr<UByte> = pUserDataCtorArg
        internal set

    public var pUserDataOut: MutPtr<UByte> = pUserDataOutCtorArg
        internal set

    public var pwszIdentity: Pwstr = pwszIdentityCtorArg
        internal set

    public constructor() : this(
        eapType = 0u,
        dwFlags = 0u,
        dwSizeofConnectionData = 0u,
        pConnectionDataCtorArg = MutPtr(0L),
        dwSizeofUserData = 0u,
        pUserDataCtorArg = MutPtr(0L),
        dwSizeofUserDataOut = 0u,
        pUserDataOutCtorArg = MutPtr(0L),
        pwszIdentityCtorArg = MutPtr(0L),
        dwError = 0u,
    )

    public operator fun component1(): UInt = this.eapType

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): UInt = this.dwSizeofConnectionData

    public operator fun component4(): MutPtr<UByte> = this.pConnectionData

    public operator fun component5(): UInt = this.dwSizeofUserData

    public operator fun component6(): MutPtr<UByte> = this.pUserData

    public operator fun component7(): UInt = this.dwSizeofUserDataOut

    public operator fun component8(): MutPtr<UByte> = this.pUserDataOut

    public operator fun component9(): Pwstr = this.pwszIdentity

    public operator fun component10(): UInt = this.dwError

    public fun copy(eapType: UInt = this.eapType, dwFlags: UInt = this.dwFlags, dwSizeofConnectionData: UInt = this.dwSizeofConnectionData, pConnectionData: MutPtr<UByte> = this.pConnectionData, dwSizeofUserData: UInt = this.dwSizeofUserData, pUserData: MutPtr<UByte> = this.pUserData, dwSizeofUserDataOut: UInt = this.dwSizeofUserDataOut, pUserDataOut: MutPtr<UByte> = this.pUserDataOut, pwszIdentity: Pwstr = this.pwszIdentity, dwError: UInt = this.dwError): LegacyIdentityUiParams = LegacyIdentityUiParams(eapType = eapType, dwFlags = dwFlags, dwSizeofConnectionData = dwSizeofConnectionData, pConnectionDataCtorArg = pConnectionData, dwSizeofUserData = dwSizeofUserData, pUserDataCtorArg = pUserData, dwSizeofUserDataOut = dwSizeofUserDataOut, pUserDataOutCtorArg = pUserDataOut, pwszIdentityCtorArg = pwszIdentity, dwError = dwError)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LegacyIdentityUiParams) return false
        if (this.eapType != other.eapType) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwSizeofConnectionData != other.dwSizeofConnectionData) return false
        if (this.pConnectionData != other.pConnectionData) return false
        if (this.dwSizeofUserData != other.dwSizeofUserData) return false
        if (this.pUserData != other.pUserData) return false
        if (this.dwSizeofUserDataOut != other.dwSizeofUserDataOut) return false
        if (this.pUserDataOut != other.pUserDataOut) return false
        if (this.pwszIdentity != other.pwszIdentity) return false
        if (this.dwError != other.dwError) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.eapType.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwSizeofConnectionData.hashCode()
        result = 31 * result + this.pConnectionData.hashCode()
        result = 31 * result + this.dwSizeofUserData.hashCode()
        result = 31 * result + this.pUserData.hashCode()
        result = 31 * result + this.dwSizeofUserDataOut.hashCode()
        result = 31 * result + this.pUserDataOut.hashCode()
        result = 31 * result + this.pwszIdentity.hashCode()
        result = 31 * result + this.dwError.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            eapType: UInt = 0u,
            dwFlags: UInt = 0u,
            dwSizeofConnectionData: UInt = 0u,
            pConnectionData: MutPtr<UByte> = MutPtr(0L),
            dwSizeofUserData: UInt = 0u,
            pUserData: MutPtr<UByte> = MutPtr(0L),
            dwSizeofUserDataOut: UInt = 0u,
            pUserDataOut: MutPtr<UByte> = MutPtr(0L),
            pwszIdentity: Pwstr = MutPtr(0L),
            dwError: UInt = 0u,
        ): LegacyIdentityUiParams =
            LegacyIdentityUiParams(
                eapType = eapType,
                dwFlags = dwFlags,
                dwSizeofConnectionData = dwSizeofConnectionData,
                pConnectionDataCtorArg = pConnectionData,
                dwSizeofUserData = dwSizeofUserData,
                pUserDataCtorArg = pUserData,
                dwSizeofUserDataOut = dwSizeofUserDataOut,
                pUserDataOutCtorArg = pUserDataOut,
                pwszIdentityCtorArg = pwszIdentity,
                dwError = dwError,
            )
    }
}

public class LegacyInteractiveUiParams internal constructor(
    public var eapType: UInt,
    public var dwSizeofContextData: UInt,
    pContextDataCtorArg: MutPtr<UByte>,
    public var dwSizeofInteractiveUIData: UInt,
    pInteractiveUIDataCtorArg: MutPtr<UByte>,
    public var dwError: UInt,
) {
    public var pContextData: MutPtr<UByte> = pContextDataCtorArg
        internal set

    public var pInteractiveUIData: MutPtr<UByte> = pInteractiveUIDataCtorArg
        internal set

    public constructor() : this(
        eapType = 0u,
        dwSizeofContextData = 0u,
        pContextDataCtorArg = MutPtr(0L),
        dwSizeofInteractiveUIData = 0u,
        pInteractiveUIDataCtorArg = MutPtr(0L),
        dwError = 0u,
    )

    public operator fun component1(): UInt = this.eapType

    public operator fun component2(): UInt = this.dwSizeofContextData

    public operator fun component3(): MutPtr<UByte> = this.pContextData

    public operator fun component4(): UInt = this.dwSizeofInteractiveUIData

    public operator fun component5(): MutPtr<UByte> = this.pInteractiveUIData

    public operator fun component6(): UInt = this.dwError

    public fun copy(eapType: UInt = this.eapType, dwSizeofContextData: UInt = this.dwSizeofContextData, pContextData: MutPtr<UByte> = this.pContextData, dwSizeofInteractiveUIData: UInt = this.dwSizeofInteractiveUIData, pInteractiveUIData: MutPtr<UByte> = this.pInteractiveUIData, dwError: UInt = this.dwError): LegacyInteractiveUiParams = LegacyInteractiveUiParams(eapType = eapType, dwSizeofContextData = dwSizeofContextData, pContextDataCtorArg = pContextData, dwSizeofInteractiveUIData = dwSizeofInteractiveUIData, pInteractiveUIDataCtorArg = pInteractiveUIData, dwError = dwError)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LegacyInteractiveUiParams) return false
        if (this.eapType != other.eapType) return false
        if (this.dwSizeofContextData != other.dwSizeofContextData) return false
        if (this.pContextData != other.pContextData) return false
        if (this.dwSizeofInteractiveUIData != other.dwSizeofInteractiveUIData) return false
        if (this.pInteractiveUIData != other.pInteractiveUIData) return false
        if (this.dwError != other.dwError) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.eapType.hashCode()
        result = 31 * result + this.dwSizeofContextData.hashCode()
        result = 31 * result + this.pContextData.hashCode()
        result = 31 * result + this.dwSizeofInteractiveUIData.hashCode()
        result = 31 * result + this.pInteractiveUIData.hashCode()
        result = 31 * result + this.dwError.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<LegacyInteractiveUiParams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<LegacyInteractiveUiParams> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): LegacyInteractiveUiParams =
                    LegacyInteractiveUiParams(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: LegacyInteractiveUiParams) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.eapType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwSizeofContextData)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.pContextData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwSizeofInteractiveUIData)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 24L, value.pInteractiveUIData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwError)
                }
            }

        public operator fun invoke(
            eapType: UInt = 0u,
            dwSizeofContextData: UInt = 0u,
            pContextData: MutPtr<UByte> = MutPtr(0L),
            dwSizeofInteractiveUIData: UInt = 0u,
            pInteractiveUIData: MutPtr<UByte> = MutPtr(0L),
            dwError: UInt = 0u,
        ): LegacyInteractiveUiParams =
            LegacyInteractiveUiParams(
                eapType = eapType,
                dwSizeofContextData = dwSizeofContextData,
                pContextDataCtorArg = pContextData,
                dwSizeofInteractiveUIData = dwSizeofInteractiveUIData,
                pInteractiveUIDataCtorArg = pInteractiveUIData,
                dwError = dwError,
            )
    }
}

public class NgcTicketContext internal constructor(
    public var wszTicket: UShortArray,
    public var hKey: NcryptKeyHandle,
    hImpersonateTokenCtorArg: Handle,
) {
    public var hImpersonateToken: Handle = hImpersonateTokenCtorArg
        internal set

    public constructor() : this(
        wszTicket = UShortArray(45),
        hKey = 0uL,
        hImpersonateTokenCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShortArray = this.wszTicket

    public operator fun component2(): NcryptKeyHandle = this.hKey

    public operator fun component3(): Handle = this.hImpersonateToken

    public fun copy(wszTicket: UShortArray = this.wszTicket, hKey: NcryptKeyHandle = this.hKey, hImpersonateToken: Handle = this.hImpersonateToken): NgcTicketContext = NgcTicketContext(wszTicket = wszTicket, hKey = hKey, hImpersonateTokenCtorArg = hImpersonateToken)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NgcTicketContext) return false
        if (!this.wszTicket.contentEquals(other.wszTicket)) return false
        if (this.hKey != other.hKey) return false
        if (this.hImpersonateToken != other.hImpersonateToken) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wszTicket.contentHashCode()
        result = 31 * result + this.hKey.hashCode()
        result = 31 * result + this.hImpersonateToken.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            wszTicket: UShortArray = UShortArray(45),
            hKey: NcryptKeyHandle = 0uL,
            hImpersonateToken: Handle = MutPtr(0L),
        ): NgcTicketContext =
            NgcTicketContext(
                wszTicket = wszTicket,
                hKey = hKey,
                hImpersonateTokenCtorArg = hImpersonateToken,
            )
    }
}

public data class PppEapInfo(
    public var dwSizeInBytes: UInt = 0u,
    public var dwEapTypeId: UInt = 0u,
    public var rasEapInitialize: Int = 0,
    public var rasEapBegin: Int = 0,
    public var rasEapEnd: Int = 0,
    public var rasEapMakeMessage: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PppEapInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PppEapInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): PppEapInfo =
                    PppEapInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: PppEapInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSizeInBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwEapTypeId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.rasEapInitialize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 16L, value.rasEapBegin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 24L, value.rasEapEnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 32L, value.rasEapMakeMessage)
                }
            }
    }
}

public class PppEapInput internal constructor(
    public var dwSizeInBytes: UInt,
    public var fFlags: UInt,
    public var fAuthenticator: Bool,
    pwszIdentityCtorArg: Pwstr,
    pwszPasswordCtorArg: Pwstr,
    public var bInitialId: UByte,
    pUserAttributesCtorArg: MutPtr<RasAuthAttribute>,
    public var fAuthenticationComplete: Bool,
    public var dwAuthResultCode: UInt,
    hTokenImpersonateUserCtorArg: Handle,
    public var fSuccessPacketReceived: Bool,
    public var fDataReceivedFromInteractiveUI: Bool,
    pDataFromInteractiveUICtorArg: MutPtr<UByte>,
    public var dwSizeOfDataFromInteractiveUI: UInt,
    pConnectionDataCtorArg: MutPtr<UByte>,
    public var dwSizeOfConnectionData: UInt,
    pUserDataCtorArg: MutPtr<UByte>,
    public var dwSizeOfUserData: UInt,
    hReservedCtorArg: Handle,
    public var guidConnectionId: Guid,
    public var isVpn: Bool,
) {
    public var pwszIdentity: Pwstr = pwszIdentityCtorArg
        internal set

    public var pwszPassword: Pwstr = pwszPasswordCtorArg
        internal set

    public var pUserAttributes: MutPtr<RasAuthAttribute> = pUserAttributesCtorArg
        internal set

    public var hTokenImpersonateUser: Handle = hTokenImpersonateUserCtorArg
        internal set

    public var pDataFromInteractiveUI: MutPtr<UByte> = pDataFromInteractiveUICtorArg
        internal set

    public var pConnectionData: MutPtr<UByte> = pConnectionDataCtorArg
        internal set

    public var pUserData: MutPtr<UByte> = pUserDataCtorArg
        internal set

    public var hReserved: Handle = hReservedCtorArg
        internal set

    public constructor() : this(
        dwSizeInBytes = 0u,
        fFlags = 0u,
        fAuthenticator = 0,
        pwszIdentityCtorArg = MutPtr(0L),
        pwszPasswordCtorArg = MutPtr(0L),
        bInitialId = 0u,
        pUserAttributesCtorArg = MutPtr(0L),
        fAuthenticationComplete = 0,
        dwAuthResultCode = 0u,
        hTokenImpersonateUserCtorArg = MutPtr(0L),
        fSuccessPacketReceived = 0,
        fDataReceivedFromInteractiveUI = 0,
        pDataFromInteractiveUICtorArg = MutPtr(0L),
        dwSizeOfDataFromInteractiveUI = 0u,
        pConnectionDataCtorArg = MutPtr(0L),
        dwSizeOfConnectionData = 0u,
        pUserDataCtorArg = MutPtr(0L),
        dwSizeOfUserData = 0u,
        hReservedCtorArg = MutPtr(0L),
        guidConnectionId = Guid(),
        isVpn = 0,
    )

    public companion object {
        public operator fun invoke(
            dwSizeInBytes: UInt = 0u,
            fFlags: UInt = 0u,
            fAuthenticator: Bool = 0,
            pwszIdentity: Pwstr = MutPtr(0L),
            pwszPassword: Pwstr = MutPtr(0L),
            bInitialId: UByte = 0u,
            pUserAttributes: MutPtr<RasAuthAttribute> = MutPtr(0L),
            fAuthenticationComplete: Bool = 0,
            dwAuthResultCode: UInt = 0u,
            hTokenImpersonateUser: Handle = MutPtr(0L),
            fSuccessPacketReceived: Bool = 0,
            fDataReceivedFromInteractiveUI: Bool = 0,
            pDataFromInteractiveUI: MutPtr<UByte> = MutPtr(0L),
            dwSizeOfDataFromInteractiveUI: UInt = 0u,
            pConnectionData: MutPtr<UByte> = MutPtr(0L),
            dwSizeOfConnectionData: UInt = 0u,
            pUserData: MutPtr<UByte> = MutPtr(0L),
            dwSizeOfUserData: UInt = 0u,
            hReserved: Handle = MutPtr(0L),
            guidConnectionId: Guid = Guid(),
            isVpn: Bool = 0,
        ): PppEapInput =
            PppEapInput(
                dwSizeInBytes = dwSizeInBytes,
                fFlags = fFlags,
                fAuthenticator = fAuthenticator,
                pwszIdentityCtorArg = pwszIdentity,
                pwszPasswordCtorArg = pwszPassword,
                bInitialId = bInitialId,
                pUserAttributesCtorArg = pUserAttributes,
                fAuthenticationComplete = fAuthenticationComplete,
                dwAuthResultCode = dwAuthResultCode,
                hTokenImpersonateUserCtorArg = hTokenImpersonateUser,
                fSuccessPacketReceived = fSuccessPacketReceived,
                fDataReceivedFromInteractiveUI = fDataReceivedFromInteractiveUI,
                pDataFromInteractiveUICtorArg = pDataFromInteractiveUI,
                dwSizeOfDataFromInteractiveUI = dwSizeOfDataFromInteractiveUI,
                pConnectionDataCtorArg = pConnectionData,
                dwSizeOfConnectionData = dwSizeOfConnectionData,
                pUserDataCtorArg = pUserData,
                dwSizeOfUserData = dwSizeOfUserData,
                hReservedCtorArg = hReserved,
                guidConnectionId = guidConnectionId,
                isVpn = isVpn,
            )
    }
}

public class PppEapOutput internal constructor(
    public var dwSizeInBytes: UInt,
    public var action: PppEapAction,
    public var dwAuthResultCode: UInt,
    pUserAttributesCtorArg: MutPtr<RasAuthAttribute>,
    public var fInvokeInteractiveUI: Bool,
    pUIContextDataCtorArg: MutPtr<UByte>,
    public var dwSizeOfUIContextData: UInt,
    public var fSaveConnectionData: Bool,
    pConnectionDataCtorArg: MutPtr<UByte>,
    public var dwSizeOfConnectionData: UInt,
    public var fSaveUserData: Bool,
    pUserDataCtorArg: MutPtr<UByte>,
    public var dwSizeOfUserData: UInt,
    pNgcKerbTicketCtorArg: MutPtr<NgcTicketContext>,
    public var fSaveToCredMan: Bool,
) {
    public var pUserAttributes: MutPtr<RasAuthAttribute> = pUserAttributesCtorArg
        internal set

    public var pUIContextData: MutPtr<UByte> = pUIContextDataCtorArg
        internal set

    public var pConnectionData: MutPtr<UByte> = pConnectionDataCtorArg
        internal set

    public var pUserData: MutPtr<UByte> = pUserDataCtorArg
        internal set

    public var pNgcKerbTicket: MutPtr<NgcTicketContext> = pNgcKerbTicketCtorArg
        internal set

    public constructor() : this(
        dwSizeInBytes = 0u,
        action = 0,
        dwAuthResultCode = 0u,
        pUserAttributesCtorArg = MutPtr(0L),
        fInvokeInteractiveUI = 0,
        pUIContextDataCtorArg = MutPtr(0L),
        dwSizeOfUIContextData = 0u,
        fSaveConnectionData = 0,
        pConnectionDataCtorArg = MutPtr(0L),
        dwSizeOfConnectionData = 0u,
        fSaveUserData = 0,
        pUserDataCtorArg = MutPtr(0L),
        dwSizeOfUserData = 0u,
        pNgcKerbTicketCtorArg = MutPtr(0L),
        fSaveToCredMan = 0,
    )

    public operator fun component1(): UInt = this.dwSizeInBytes

    public operator fun component2(): PppEapAction = this.action

    public operator fun component3(): UInt = this.dwAuthResultCode

    public operator fun component4(): MutPtr<RasAuthAttribute> = this.pUserAttributes

    public operator fun component5(): Bool = this.fInvokeInteractiveUI

    public operator fun component6(): MutPtr<UByte> = this.pUIContextData

    public operator fun component7(): UInt = this.dwSizeOfUIContextData

    public operator fun component8(): Bool = this.fSaveConnectionData

    public operator fun component9(): MutPtr<UByte> = this.pConnectionData

    public operator fun component10(): UInt = this.dwSizeOfConnectionData

    public operator fun component11(): Bool = this.fSaveUserData

    public operator fun component12(): MutPtr<UByte> = this.pUserData

    public operator fun component13(): UInt = this.dwSizeOfUserData

    public operator fun component14(): MutPtr<NgcTicketContext> = this.pNgcKerbTicket

    public operator fun component15(): Bool = this.fSaveToCredMan

    public fun copy(dwSizeInBytes: UInt = this.dwSizeInBytes, action: PppEapAction = this.action, dwAuthResultCode: UInt = this.dwAuthResultCode, pUserAttributes: MutPtr<RasAuthAttribute> = this.pUserAttributes, fInvokeInteractiveUI: Bool = this.fInvokeInteractiveUI, pUIContextData: MutPtr<UByte> = this.pUIContextData, dwSizeOfUIContextData: UInt = this.dwSizeOfUIContextData, fSaveConnectionData: Bool = this.fSaveConnectionData, pConnectionData: MutPtr<UByte> = this.pConnectionData, dwSizeOfConnectionData: UInt = this.dwSizeOfConnectionData, fSaveUserData: Bool = this.fSaveUserData, pUserData: MutPtr<UByte> = this.pUserData, dwSizeOfUserData: UInt = this.dwSizeOfUserData, pNgcKerbTicket: MutPtr<NgcTicketContext> = this.pNgcKerbTicket, fSaveToCredMan: Bool = this.fSaveToCredMan): PppEapOutput = PppEapOutput(dwSizeInBytes = dwSizeInBytes, action = action, dwAuthResultCode = dwAuthResultCode, pUserAttributesCtorArg = pUserAttributes, fInvokeInteractiveUI = fInvokeInteractiveUI, pUIContextDataCtorArg = pUIContextData, dwSizeOfUIContextData = dwSizeOfUIContextData, fSaveConnectionData = fSaveConnectionData, pConnectionDataCtorArg = pConnectionData, dwSizeOfConnectionData = dwSizeOfConnectionData, fSaveUserData = fSaveUserData, pUserDataCtorArg = pUserData, dwSizeOfUserData = dwSizeOfUserData, pNgcKerbTicketCtorArg = pNgcKerbTicket, fSaveToCredMan = fSaveToCredMan)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PppEapOutput) return false
        if (this.dwSizeInBytes != other.dwSizeInBytes) return false
        if (this.action != other.action) return false
        if (this.dwAuthResultCode != other.dwAuthResultCode) return false
        if (this.pUserAttributes != other.pUserAttributes) return false
        if (this.fInvokeInteractiveUI != other.fInvokeInteractiveUI) return false
        if (this.pUIContextData != other.pUIContextData) return false
        if (this.dwSizeOfUIContextData != other.dwSizeOfUIContextData) return false
        if (this.fSaveConnectionData != other.fSaveConnectionData) return false
        if (this.pConnectionData != other.pConnectionData) return false
        if (this.dwSizeOfConnectionData != other.dwSizeOfConnectionData) return false
        if (this.fSaveUserData != other.fSaveUserData) return false
        if (this.pUserData != other.pUserData) return false
        if (this.dwSizeOfUserData != other.dwSizeOfUserData) return false
        if (this.pNgcKerbTicket != other.pNgcKerbTicket) return false
        if (this.fSaveToCredMan != other.fSaveToCredMan) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSizeInBytes.hashCode()
        result = 31 * result + this.action.hashCode()
        result = 31 * result + this.dwAuthResultCode.hashCode()
        result = 31 * result + this.pUserAttributes.hashCode()
        result = 31 * result + this.fInvokeInteractiveUI.hashCode()
        result = 31 * result + this.pUIContextData.hashCode()
        result = 31 * result + this.dwSizeOfUIContextData.hashCode()
        result = 31 * result + this.fSaveConnectionData.hashCode()
        result = 31 * result + this.pConnectionData.hashCode()
        result = 31 * result + this.dwSizeOfConnectionData.hashCode()
        result = 31 * result + this.fSaveUserData.hashCode()
        result = 31 * result + this.pUserData.hashCode()
        result = 31 * result + this.dwSizeOfUserData.hashCode()
        result = 31 * result + this.pNgcKerbTicket.hashCode()
        result = 31 * result + this.fSaveToCredMan.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PppEapOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PppEapOutput> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 96L
                override fun readNative(addr: Long): PppEapOutput =
                    PppEapOutput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<RasAuthAttribute>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 44L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 60L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<NgcTicketContext>(64)
                        ).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 88L),
                    )
                override fun writeNative(addr: Long, value: PppEapOutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSizeInBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.action)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwAuthResultCode)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<RasAuthAttribute>(64)
                    ).writeNative(addr + 16L, value.pUserAttributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.fInvokeInteractiveUI)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 32L, value.pUIContextData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.dwSizeOfUIContextData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 44L, value.fSaveConnectionData)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 48L, value.pConnectionData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.dwSizeOfConnectionData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 60L, value.fSaveUserData)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 64L, value.pUserData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.dwSizeOfUserData)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<NgcTicketContext>(64)
                    ).writeNative(addr + 80L, value.pNgcKerbTicket)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 88L, value.fSaveToCredMan)
                }
            }

        public operator fun invoke(
            dwSizeInBytes: UInt = 0u,
            action: PppEapAction = 0,
            dwAuthResultCode: UInt = 0u,
            pUserAttributes: MutPtr<RasAuthAttribute> = MutPtr(0L),
            fInvokeInteractiveUI: Bool = 0,
            pUIContextData: MutPtr<UByte> = MutPtr(0L),
            dwSizeOfUIContextData: UInt = 0u,
            fSaveConnectionData: Bool = 0,
            pConnectionData: MutPtr<UByte> = MutPtr(0L),
            dwSizeOfConnectionData: UInt = 0u,
            fSaveUserData: Bool = 0,
            pUserData: MutPtr<UByte> = MutPtr(0L),
            dwSizeOfUserData: UInt = 0u,
            pNgcKerbTicket: MutPtr<NgcTicketContext> = MutPtr(0L),
            fSaveToCredMan: Bool = 0,
        ): PppEapOutput =
            PppEapOutput(
                dwSizeInBytes = dwSizeInBytes,
                action = action,
                dwAuthResultCode = dwAuthResultCode,
                pUserAttributesCtorArg = pUserAttributes,
                fInvokeInteractiveUI = fInvokeInteractiveUI,
                pUIContextDataCtorArg = pUIContextData,
                dwSizeOfUIContextData = dwSizeOfUIContextData,
                fSaveConnectionData = fSaveConnectionData,
                pConnectionDataCtorArg = pConnectionData,
                dwSizeOfConnectionData = dwSizeOfConnectionData,
                fSaveUserData = fSaveUserData,
                pUserDataCtorArg = pUserData,
                dwSizeOfUserData = dwSizeOfUserData,
                pNgcKerbTicketCtorArg = pNgcKerbTicket,
                fSaveToCredMan = fSaveToCredMan,
            )
    }
}

public data class PppEapPacket(
    public var code: UByte = 0u,
    public var id: UByte = 0u,
    public var length: UByteArray = UByteArray(2),
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PppEapPacket) return false
        if (this.code != other.code) return false
        if (this.id != other.id) return false
        if (!this.length.contentEquals(other.length)) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.code.hashCode()
        result = 31 * result + this.id.hashCode()
        result = 31 * result + this.length.contentHashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PppEapPacket> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PppEapPacket> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 5L
                override fun readNative(addr: Long): PppEapPacket =
                    PppEapPacket(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 2L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: PppEapPacket) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.code)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.id)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 2L, value.length.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 4L, value.data.toList())
                }
            }
    }
}

public class RasAuthAttribute internal constructor(
    public var raaType: RasAuthAttributeType,
    public var dwLength: UInt,
    valueCtorArg: MutPtr<CVoid>,
) {
    public var value: MutPtr<CVoid> = valueCtorArg
        internal set

    public constructor() : this(
        raaType = 0,
        dwLength = 0u,
        valueCtorArg = MutPtr(0L),
    )

    public operator fun component1(): RasAuthAttributeType = this.raaType

    public operator fun component2(): UInt = this.dwLength

    public operator fun component3(): MutPtr<CVoid> = this.value

    public fun copy(raaType: RasAuthAttributeType = this.raaType, dwLength: UInt = this.dwLength, value: MutPtr<CVoid> = this.value): RasAuthAttribute = RasAuthAttribute(raaType = raaType, dwLength = dwLength, valueCtorArg = value)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RasAuthAttribute) return false
        if (this.raaType != other.raaType) return false
        if (this.dwLength != other.dwLength) return false
        if (this.value != other.value) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.raaType.hashCode()
        result = 31 * result + this.dwLength.hashCode()
        result = 31 * result + this.value.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RasAuthAttribute> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RasAuthAttribute> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): RasAuthAttribute =
                    RasAuthAttribute(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: RasAuthAttribute) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.raaType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.value)
                }
            }

        public operator fun invoke(
            raaType: RasAuthAttributeType = 0,
            dwLength: UInt = 0u,
            value: MutPtr<CVoid> = MutPtr(0L),
        ): RasAuthAttribute =
            RasAuthAttribute(
                raaType = raaType,
                dwLength = dwLength,
                valueCtorArg = value,
            )
    }
}
