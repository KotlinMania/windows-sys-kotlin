package io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public data class WsmanAuthenticationCredentials(
    public var authenticationMechanism: UInt = 0u,
    public var anonymous: WsmanAuthenticationCredentials0 = WsmanAuthenticationCredentials0(),
)

public class WsmanAuthenticationCredentials0 internal constructor(
    public var userAccount: WsmanUsernamePasswordCreds,
    certificateThumbprintCtorArg: Pcwstr,
) {
    public var certificateThumbprint: Pcwstr = certificateThumbprintCtorArg
        internal set

    public constructor() : this(
        userAccount = WsmanUsernamePasswordCreds(),
        certificateThumbprintCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): WsmanUsernamePasswordCreds = this.userAccount

    public operator fun component2(): Pcwstr = this.certificateThumbprint

    public fun copy(userAccount: WsmanUsernamePasswordCreds = this.userAccount, certificateThumbprint: Pcwstr = this.certificateThumbprint): WsmanAuthenticationCredentials0 = WsmanAuthenticationCredentials0(userAccount = userAccount, certificateThumbprintCtorArg = certificateThumbprint)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsmanAuthenticationCredentials0) return false
        if (this.userAccount != other.userAccount) return false
        if (this.certificateThumbprint != other.certificateThumbprint) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.userAccount.hashCode()
        result = 31 * result + this.certificateThumbprint.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            userAccount: WsmanUsernamePasswordCreds = WsmanUsernamePasswordCreds(),
            certificateThumbprint: Pcwstr = ConstPtr(0L),
        ): WsmanAuthenticationCredentials0 =
            WsmanAuthenticationCredentials0(
                userAccount = userAccount,
                certificateThumbprintCtorArg = certificateThumbprint,
            )
    }
}

public data class WsmanAuthzQuota(
    public var maxAllowedConcurrentShells: UInt = 0u,
    public var maxAllowedConcurrentOperations: UInt = 0u,
    public var timeslotSize: UInt = 0u,
    public var maxAllowedOperationsPerTimeslot: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsmanAuthzQuota> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsmanAuthzQuota> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WsmanAuthzQuota =
                    WsmanAuthzQuota(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: WsmanAuthzQuota) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.maxAllowedConcurrentShells)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maxAllowedConcurrentOperations)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.timeslotSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.maxAllowedOperationsPerTimeslot)
                }
            }
    }
}

public class WsmanCertificateDetails internal constructor(
    subjectCtorArg: Pcwstr,
    issuerNameCtorArg: Pcwstr,
    issuerThumbprintCtorArg: Pcwstr,
    subjectNameCtorArg: Pcwstr,
) {
    public var subject: Pcwstr = subjectCtorArg
        internal set

    public var issuerName: Pcwstr = issuerNameCtorArg
        internal set

    public var issuerThumbprint: Pcwstr = issuerThumbprintCtorArg
        internal set

    public var subjectName: Pcwstr = subjectNameCtorArg
        internal set

    public constructor() : this(
        subjectCtorArg = ConstPtr(0L),
        issuerNameCtorArg = ConstPtr(0L),
        issuerThumbprintCtorArg = ConstPtr(0L),
        subjectNameCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Pcwstr = this.subject

    public operator fun component2(): Pcwstr = this.issuerName

    public operator fun component3(): Pcwstr = this.issuerThumbprint

    public operator fun component4(): Pcwstr = this.subjectName

    public fun copy(subject: Pcwstr = this.subject, issuerName: Pcwstr = this.issuerName, issuerThumbprint: Pcwstr = this.issuerThumbprint, subjectName: Pcwstr = this.subjectName): WsmanCertificateDetails = WsmanCertificateDetails(subjectCtorArg = subject, issuerNameCtorArg = issuerName, issuerThumbprintCtorArg = issuerThumbprint, subjectNameCtorArg = subjectName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsmanCertificateDetails) return false
        if (this.subject != other.subject) return false
        if (this.issuerName != other.issuerName) return false
        if (this.issuerThumbprint != other.issuerThumbprint) return false
        if (this.subjectName != other.subjectName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.subject.hashCode()
        result = 31 * result + this.issuerName.hashCode()
        result = 31 * result + this.issuerThumbprint.hashCode()
        result = 31 * result + this.subjectName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            subject: Pcwstr = ConstPtr(0L),
            issuerName: Pcwstr = ConstPtr(0L),
            issuerThumbprint: Pcwstr = ConstPtr(0L),
            subjectName: Pcwstr = ConstPtr(0L),
        ): WsmanCertificateDetails =
            WsmanCertificateDetails(
                subjectCtorArg = subject,
                issuerNameCtorArg = issuerName,
                issuerThumbprintCtorArg = issuerThumbprint,
                subjectNameCtorArg = subjectName,
            )
    }
}

public class WsmanCommandArgSet internal constructor(
    public var argsCount: UInt,
    argsCtorArg: ConstPtr<Pcwstr>,
) {
    public var args: ConstPtr<Pcwstr> = argsCtorArg
        internal set

    public constructor() : this(
        argsCount = 0u,
        argsCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.argsCount

    public operator fun component2(): ConstPtr<Pcwstr> = this.args

    public fun copy(argsCount: UInt = this.argsCount, args: ConstPtr<Pcwstr> = this.args): WsmanCommandArgSet = WsmanCommandArgSet(argsCount = argsCount, argsCtorArg = args)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsmanCommandArgSet) return false
        if (this.argsCount != other.argsCount) return false
        if (this.args != other.args) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.argsCount.hashCode()
        result = 31 * result + this.args.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsmanCommandArgSet> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsmanCommandArgSet> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsmanCommandArgSet =
                    WsmanCommandArgSet(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<Pcwstr>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsmanCommandArgSet) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.argsCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<Pcwstr>(64)
                    ).writeNative(addr + 8L, value.args)
                }
            }

        public operator fun invoke(
            argsCount: UInt = 0u,
            args: ConstPtr<Pcwstr> = ConstPtr(0L),
        ): WsmanCommandArgSet =
            WsmanCommandArgSet(
                argsCount = argsCount,
                argsCtorArg = args,
            )
    }
}

public data class WsmanConnectData(
    public var data: WsmanData = WsmanData(),
)

public data class WsmanCreateShellData(
    public var data: WsmanData = WsmanData(),
)

public data class WsmanData(
    public var type: WSManDataType = 0,
    public var anonymous: WsmanData0 = WsmanData0(),
)

public data class WsmanData0(
    public var text: WsmanDataText = WsmanDataText(),
    public var binaryData: WsmanDataBinary = WsmanDataBinary(),
    public var number: UInt = 0u,
)

public class WsmanDataBinary internal constructor(
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

    public fun copy(dataLength: UInt = this.dataLength, data: MutPtr<UByte> = this.data): WsmanDataBinary = WsmanDataBinary(dataLength = dataLength, dataCtorArg = data)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsmanDataBinary) return false
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
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsmanDataBinary> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsmanDataBinary> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsmanDataBinary =
                    WsmanDataBinary(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsmanDataBinary) {
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
        ): WsmanDataBinary =
            WsmanDataBinary(
                dataLength = dataLength,
                dataCtorArg = data,
            )
    }
}

public class WsmanDataText internal constructor(
    public var bufferLength: UInt,
    bufferCtorArg: Pcwstr,
) {
    public var buffer: Pcwstr = bufferCtorArg
        internal set

    public constructor() : this(
        bufferLength = 0u,
        bufferCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.bufferLength

    public operator fun component2(): Pcwstr = this.buffer

    public fun copy(bufferLength: UInt = this.bufferLength, buffer: Pcwstr = this.buffer): WsmanDataText = WsmanDataText(bufferLength = bufferLength, bufferCtorArg = buffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsmanDataText) return false
        if (this.bufferLength != other.bufferLength) return false
        if (this.buffer != other.buffer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bufferLength.hashCode()
        result = 31 * result + this.buffer.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            bufferLength: UInt = 0u,
            buffer: Pcwstr = ConstPtr(0L),
        ): WsmanDataText =
            WsmanDataText(
                bufferLength = bufferLength,
                bufferCtorArg = buffer,
            )
    }
}

public class WsmanEnvironmentVariable internal constructor(
    nameCtorArg: Pcwstr,
    valueCtorArg: Pcwstr,
) {
    public var name: Pcwstr = nameCtorArg
        internal set

    public var value: Pcwstr = valueCtorArg
        internal set

    public constructor() : this(
        nameCtorArg = ConstPtr(0L),
        valueCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Pcwstr = this.name

    public operator fun component2(): Pcwstr = this.value

    public fun copy(name: Pcwstr = this.name, value: Pcwstr = this.value): WsmanEnvironmentVariable = WsmanEnvironmentVariable(nameCtorArg = name, valueCtorArg = value)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsmanEnvironmentVariable) return false
        if (this.name != other.name) return false
        if (this.value != other.value) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.name.hashCode()
        result = 31 * result + this.value.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            name: Pcwstr = ConstPtr(0L),
            value: Pcwstr = ConstPtr(0L),
        ): WsmanEnvironmentVariable =
            WsmanEnvironmentVariable(
                nameCtorArg = name,
                valueCtorArg = value,
            )
    }
}

public class WsmanEnvironmentVariableSet internal constructor(
    public var varsCount: UInt,
    varsCtorArg: MutPtr<WsmanEnvironmentVariable>,
) {
    public var vars: MutPtr<WsmanEnvironmentVariable> = varsCtorArg
        internal set

    public constructor() : this(
        varsCount = 0u,
        varsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.varsCount

    public operator fun component2(): MutPtr<WsmanEnvironmentVariable> = this.vars

    public fun copy(varsCount: UInt = this.varsCount, vars: MutPtr<WsmanEnvironmentVariable> = this.vars): WsmanEnvironmentVariableSet = WsmanEnvironmentVariableSet(varsCount = varsCount, varsCtorArg = vars)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsmanEnvironmentVariableSet) return false
        if (this.varsCount != other.varsCount) return false
        if (this.vars != other.vars) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.varsCount.hashCode()
        result = 31 * result + this.vars.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsmanEnvironmentVariableSet> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsmanEnvironmentVariableSet> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsmanEnvironmentVariableSet =
                    WsmanEnvironmentVariableSet(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsmanEnvironmentVariable>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsmanEnvironmentVariableSet) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.varsCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsmanEnvironmentVariable>(64)
                    ).writeNative(addr + 8L, value.vars)
                }
            }

        public operator fun invoke(
            varsCount: UInt = 0u,
            vars: MutPtr<WsmanEnvironmentVariable> = MutPtr(0L),
        ): WsmanEnvironmentVariableSet =
            WsmanEnvironmentVariableSet(
                varsCount = varsCount,
                varsCtorArg = vars,
            )
    }
}

public class WsmanError internal constructor(
    public var code: UInt,
    errorDetailCtorArg: Pcwstr,
    languageCtorArg: Pcwstr,
    machineNameCtorArg: Pcwstr,
    pluginNameCtorArg: Pcwstr,
) {
    public var errorDetail: Pcwstr = errorDetailCtorArg
        internal set

    public var language: Pcwstr = languageCtorArg
        internal set

    public var machineName: Pcwstr = machineNameCtorArg
        internal set

    public var pluginName: Pcwstr = pluginNameCtorArg
        internal set

    public constructor() : this(
        code = 0u,
        errorDetailCtorArg = ConstPtr(0L),
        languageCtorArg = ConstPtr(0L),
        machineNameCtorArg = ConstPtr(0L),
        pluginNameCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.code

    public operator fun component2(): Pcwstr = this.errorDetail

    public operator fun component3(): Pcwstr = this.language

    public operator fun component4(): Pcwstr = this.machineName

    public operator fun component5(): Pcwstr = this.pluginName

    public fun copy(code: UInt = this.code, errorDetail: Pcwstr = this.errorDetail, language: Pcwstr = this.language, machineName: Pcwstr = this.machineName, pluginName: Pcwstr = this.pluginName): WsmanError = WsmanError(code = code, errorDetailCtorArg = errorDetail, languageCtorArg = language, machineNameCtorArg = machineName, pluginNameCtorArg = pluginName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsmanError) return false
        if (this.code != other.code) return false
        if (this.errorDetail != other.errorDetail) return false
        if (this.language != other.language) return false
        if (this.machineName != other.machineName) return false
        if (this.pluginName != other.pluginName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.code.hashCode()
        result = 31 * result + this.errorDetail.hashCode()
        result = 31 * result + this.language.hashCode()
        result = 31 * result + this.machineName.hashCode()
        result = 31 * result + this.pluginName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            code: UInt = 0u,
            errorDetail: Pcwstr = ConstPtr(0L),
            language: Pcwstr = ConstPtr(0L),
            machineName: Pcwstr = ConstPtr(0L),
            pluginName: Pcwstr = ConstPtr(0L),
        ): WsmanError =
            WsmanError(
                code = code,
                errorDetailCtorArg = errorDetail,
                languageCtorArg = language,
                machineNameCtorArg = machineName,
                pluginNameCtorArg = pluginName,
            )
    }
}

public class WsmanFilter internal constructor(
    filterCtorArg: Pcwstr,
    dialectCtorArg: Pcwstr,
) {
    public var filter: Pcwstr = filterCtorArg
        internal set

    public var dialect: Pcwstr = dialectCtorArg
        internal set

    public constructor() : this(
        filterCtorArg = ConstPtr(0L),
        dialectCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Pcwstr = this.filter

    public operator fun component2(): Pcwstr = this.dialect

    public fun copy(filter: Pcwstr = this.filter, dialect: Pcwstr = this.dialect): WsmanFilter = WsmanFilter(filterCtorArg = filter, dialectCtorArg = dialect)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsmanFilter) return false
        if (this.filter != other.filter) return false
        if (this.dialect != other.dialect) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.filter.hashCode()
        result = 31 * result + this.dialect.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            filter: Pcwstr = ConstPtr(0L),
            dialect: Pcwstr = ConstPtr(0L),
        ): WsmanFilter =
            WsmanFilter(
                filterCtorArg = filter,
                dialectCtorArg = dialect,
            )
    }
}

public class WsmanFragment internal constructor(
    pathCtorArg: Pcwstr,
    dialectCtorArg: Pcwstr,
) {
    public var path: Pcwstr = pathCtorArg
        internal set

    public var dialect: Pcwstr = dialectCtorArg
        internal set

    public constructor() : this(
        pathCtorArg = ConstPtr(0L),
        dialectCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Pcwstr = this.path

    public operator fun component2(): Pcwstr = this.dialect

    public fun copy(path: Pcwstr = this.path, dialect: Pcwstr = this.dialect): WsmanFragment = WsmanFragment(pathCtorArg = path, dialectCtorArg = dialect)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsmanFragment) return false
        if (this.path != other.path) return false
        if (this.dialect != other.dialect) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.path.hashCode()
        result = 31 * result + this.dialect.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            path: Pcwstr = ConstPtr(0L),
            dialect: Pcwstr = ConstPtr(0L),
        ): WsmanFragment =
            WsmanFragment(
                pathCtorArg = path,
                dialectCtorArg = dialect,
            )
    }
}

public class WsmanKey internal constructor(
    keyCtorArg: Pcwstr,
    valueCtorArg: Pcwstr,
) {
    public var key: Pcwstr = keyCtorArg
        internal set

    public var value: Pcwstr = valueCtorArg
        internal set

    public constructor() : this(
        keyCtorArg = ConstPtr(0L),
        valueCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Pcwstr = this.key

    public operator fun component2(): Pcwstr = this.value

    public fun copy(key: Pcwstr = this.key, value: Pcwstr = this.value): WsmanKey = WsmanKey(keyCtorArg = key, valueCtorArg = value)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsmanKey) return false
        if (this.key != other.key) return false
        if (this.value != other.value) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.key.hashCode()
        result = 31 * result + this.value.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            key: Pcwstr = ConstPtr(0L),
            value: Pcwstr = ConstPtr(0L),
        ): WsmanKey =
            WsmanKey(
                keyCtorArg = key,
                valueCtorArg = value,
            )
    }
}

public class WsmanOperationInfo internal constructor(
    public var fragment: WsmanFragment,
    public var filter: WsmanFilter,
    public var selectorSet: WsmanSelectorSet,
    public var optionSet: WsmanOptionSet,
    reservedCtorArg: MutPtr<CVoid>,
    public var version: UInt,
) {
    public var reserved: MutPtr<CVoid> = reservedCtorArg
        internal set

    public constructor() : this(
        fragment = WsmanFragment(),
        filter = WsmanFilter(),
        selectorSet = WsmanSelectorSet(),
        optionSet = WsmanOptionSet(),
        reservedCtorArg = MutPtr(0L),
        version = 0u,
    )

    public operator fun component1(): WsmanFragment = this.fragment

    public operator fun component2(): WsmanFilter = this.filter

    public operator fun component3(): WsmanSelectorSet = this.selectorSet

    public operator fun component4(): WsmanOptionSet = this.optionSet

    public operator fun component5(): MutPtr<CVoid> = this.reserved

    public operator fun component6(): UInt = this.version

    public fun copy(fragment: WsmanFragment = this.fragment, filter: WsmanFilter = this.filter, selectorSet: WsmanSelectorSet = this.selectorSet, optionSet: WsmanOptionSet = this.optionSet, reserved: MutPtr<CVoid> = this.reserved, version: UInt = this.version): WsmanOperationInfo = WsmanOperationInfo(fragment = fragment, filter = filter, selectorSet = selectorSet, optionSet = optionSet, reservedCtorArg = reserved, version = version)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsmanOperationInfo) return false
        if (this.fragment != other.fragment) return false
        if (this.filter != other.filter) return false
        if (this.selectorSet != other.selectorSet) return false
        if (this.optionSet != other.optionSet) return false
        if (this.reserved != other.reserved) return false
        if (this.version != other.version) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fragment.hashCode()
        result = 31 * result + this.filter.hashCode()
        result = 31 * result + this.selectorSet.hashCode()
        result = 31 * result + this.optionSet.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.version.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            fragment: WsmanFragment = WsmanFragment(),
            filter: WsmanFilter = WsmanFilter(),
            selectorSet: WsmanSelectorSet = WsmanSelectorSet(),
            optionSet: WsmanOptionSet = WsmanOptionSet(),
            reserved: MutPtr<CVoid> = MutPtr(0L),
            version: UInt = 0u,
        ): WsmanOperationInfo =
            WsmanOperationInfo(
                fragment = fragment,
                filter = filter,
                selectorSet = selectorSet,
                optionSet = optionSet,
                reservedCtorArg = reserved,
                version = version,
            )
    }
}

public class WsmanOperationInfoex internal constructor(
    public var fragment: WsmanFragment,
    public var filter: WsmanFilter,
    public var selectorSet: WsmanSelectorSet,
    public var optionSet: WsmanOptionSetex,
    public var version: UInt,
    uiLocaleCtorArg: Pcwstr,
    dataLocaleCtorArg: Pcwstr,
) {
    public var uiLocale: Pcwstr = uiLocaleCtorArg
        internal set

    public var dataLocale: Pcwstr = dataLocaleCtorArg
        internal set

    public constructor() : this(
        fragment = WsmanFragment(),
        filter = WsmanFilter(),
        selectorSet = WsmanSelectorSet(),
        optionSet = WsmanOptionSetex(),
        version = 0u,
        uiLocaleCtorArg = ConstPtr(0L),
        dataLocaleCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): WsmanFragment = this.fragment

    public operator fun component2(): WsmanFilter = this.filter

    public operator fun component3(): WsmanSelectorSet = this.selectorSet

    public operator fun component4(): WsmanOptionSetex = this.optionSet

    public operator fun component5(): UInt = this.version

    public operator fun component6(): Pcwstr = this.uiLocale

    public operator fun component7(): Pcwstr = this.dataLocale

    public fun copy(fragment: WsmanFragment = this.fragment, filter: WsmanFilter = this.filter, selectorSet: WsmanSelectorSet = this.selectorSet, optionSet: WsmanOptionSetex = this.optionSet, version: UInt = this.version, uiLocale: Pcwstr = this.uiLocale, dataLocale: Pcwstr = this.dataLocale): WsmanOperationInfoex = WsmanOperationInfoex(fragment = fragment, filter = filter, selectorSet = selectorSet, optionSet = optionSet, version = version, uiLocaleCtorArg = uiLocale, dataLocaleCtorArg = dataLocale)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsmanOperationInfoex) return false
        if (this.fragment != other.fragment) return false
        if (this.filter != other.filter) return false
        if (this.selectorSet != other.selectorSet) return false
        if (this.optionSet != other.optionSet) return false
        if (this.version != other.version) return false
        if (this.uiLocale != other.uiLocale) return false
        if (this.dataLocale != other.dataLocale) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fragment.hashCode()
        result = 31 * result + this.filter.hashCode()
        result = 31 * result + this.selectorSet.hashCode()
        result = 31 * result + this.optionSet.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.uiLocale.hashCode()
        result = 31 * result + this.dataLocale.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            fragment: WsmanFragment = WsmanFragment(),
            filter: WsmanFilter = WsmanFilter(),
            selectorSet: WsmanSelectorSet = WsmanSelectorSet(),
            optionSet: WsmanOptionSetex = WsmanOptionSetex(),
            version: UInt = 0u,
            uiLocale: Pcwstr = ConstPtr(0L),
            dataLocale: Pcwstr = ConstPtr(0L),
        ): WsmanOperationInfoex =
            WsmanOperationInfoex(
                fragment = fragment,
                filter = filter,
                selectorSet = selectorSet,
                optionSet = optionSet,
                version = version,
                uiLocaleCtorArg = uiLocale,
                dataLocaleCtorArg = dataLocale,
            )
    }
}

public class WsmanOption internal constructor(
    nameCtorArg: Pcwstr,
    valueCtorArg: Pcwstr,
    public var mustComply: Bool,
) {
    public var name: Pcwstr = nameCtorArg
        internal set

    public var value: Pcwstr = valueCtorArg
        internal set

    public constructor() : this(
        nameCtorArg = ConstPtr(0L),
        valueCtorArg = ConstPtr(0L),
        mustComply = 0,
    )

    public operator fun component1(): Pcwstr = this.name

    public operator fun component2(): Pcwstr = this.value

    public operator fun component3(): Bool = this.mustComply

    public fun copy(name: Pcwstr = this.name, value: Pcwstr = this.value, mustComply: Bool = this.mustComply): WsmanOption = WsmanOption(nameCtorArg = name, valueCtorArg = value, mustComply = mustComply)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsmanOption) return false
        if (this.name != other.name) return false
        if (this.value != other.value) return false
        if (this.mustComply != other.mustComply) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.name.hashCode()
        result = 31 * result + this.value.hashCode()
        result = 31 * result + this.mustComply.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            name: Pcwstr = ConstPtr(0L),
            value: Pcwstr = ConstPtr(0L),
            mustComply: Bool = 0,
        ): WsmanOption =
            WsmanOption(
                nameCtorArg = name,
                valueCtorArg = value,
                mustComply = mustComply,
            )
    }
}

public class WsmanOptionSet internal constructor(
    public var optionsCount: UInt,
    optionsCtorArg: MutPtr<WsmanOption>,
    public var optionsMustUnderstand: Bool,
) {
    public var options: MutPtr<WsmanOption> = optionsCtorArg
        internal set

    public constructor() : this(
        optionsCount = 0u,
        optionsCtorArg = MutPtr(0L),
        optionsMustUnderstand = 0,
    )

    public operator fun component1(): UInt = this.optionsCount

    public operator fun component2(): MutPtr<WsmanOption> = this.options

    public operator fun component3(): Bool = this.optionsMustUnderstand

    public fun copy(optionsCount: UInt = this.optionsCount, options: MutPtr<WsmanOption> = this.options, optionsMustUnderstand: Bool = this.optionsMustUnderstand): WsmanOptionSet = WsmanOptionSet(optionsCount = optionsCount, optionsCtorArg = options, optionsMustUnderstand = optionsMustUnderstand)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsmanOptionSet) return false
        if (this.optionsCount != other.optionsCount) return false
        if (this.options != other.options) return false
        if (this.optionsMustUnderstand != other.optionsMustUnderstand) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.optionsCount.hashCode()
        result = 31 * result + this.options.hashCode()
        result = 31 * result + this.optionsMustUnderstand.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            optionsCount: UInt = 0u,
            options: MutPtr<WsmanOption> = MutPtr(0L),
            optionsMustUnderstand: Bool = 0,
        ): WsmanOptionSet =
            WsmanOptionSet(
                optionsCount = optionsCount,
                optionsCtorArg = options,
                optionsMustUnderstand = optionsMustUnderstand,
            )
    }
}

public class WsmanOptionSetex internal constructor(
    public var optionsCount: UInt,
    optionsCtorArg: MutPtr<WsmanOption>,
    public var optionsMustUnderstand: Bool,
    optionTypesCtorArg: ConstPtr<Pcwstr>,
) {
    public var options: MutPtr<WsmanOption> = optionsCtorArg
        internal set

    public var optionTypes: ConstPtr<Pcwstr> = optionTypesCtorArg
        internal set

    public constructor() : this(
        optionsCount = 0u,
        optionsCtorArg = MutPtr(0L),
        optionsMustUnderstand = 0,
        optionTypesCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.optionsCount

    public operator fun component2(): MutPtr<WsmanOption> = this.options

    public operator fun component3(): Bool = this.optionsMustUnderstand

    public operator fun component4(): ConstPtr<Pcwstr> = this.optionTypes

    public fun copy(optionsCount: UInt = this.optionsCount, options: MutPtr<WsmanOption> = this.options, optionsMustUnderstand: Bool = this.optionsMustUnderstand, optionTypes: ConstPtr<Pcwstr> = this.optionTypes): WsmanOptionSetex = WsmanOptionSetex(optionsCount = optionsCount, optionsCtorArg = options, optionsMustUnderstand = optionsMustUnderstand, optionTypesCtorArg = optionTypes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsmanOptionSetex) return false
        if (this.optionsCount != other.optionsCount) return false
        if (this.options != other.options) return false
        if (this.optionsMustUnderstand != other.optionsMustUnderstand) return false
        if (this.optionTypes != other.optionTypes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.optionsCount.hashCode()
        result = 31 * result + this.options.hashCode()
        result = 31 * result + this.optionsMustUnderstand.hashCode()
        result = 31 * result + this.optionTypes.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            optionsCount: UInt = 0u,
            options: MutPtr<WsmanOption> = MutPtr(0L),
            optionsMustUnderstand: Bool = 0,
            optionTypes: ConstPtr<Pcwstr> = ConstPtr(0L),
        ): WsmanOptionSetex =
            WsmanOptionSetex(
                optionsCount = optionsCount,
                optionsCtorArg = options,
                optionsMustUnderstand = optionsMustUnderstand,
                optionTypesCtorArg = optionTypes,
            )
    }
}

public class WsmanPluginRequest internal constructor(
    senderDetailsCtorArg: MutPtr<WsmanSenderDetails>,
    localeCtorArg: Pcwstr,
    resourceUriCtorArg: Pcwstr,
    operationInfoCtorArg: MutPtr<WsmanOperationInfo>,
    public var shutdownNotification: Bool,
    shutdownNotificationHandleCtorArg: Handle,
    dataLocaleCtorArg: Pcwstr,
) {
    public var senderDetails: MutPtr<WsmanSenderDetails> = senderDetailsCtorArg
        internal set

    public var locale: Pcwstr = localeCtorArg
        internal set

    public var resourceUri: Pcwstr = resourceUriCtorArg
        internal set

    public var operationInfo: MutPtr<WsmanOperationInfo> = operationInfoCtorArg
        internal set

    public var shutdownNotificationHandle: Handle = shutdownNotificationHandleCtorArg
        internal set

    public var dataLocale: Pcwstr = dataLocaleCtorArg
        internal set

    public constructor() : this(
        senderDetailsCtorArg = MutPtr(0L),
        localeCtorArg = ConstPtr(0L),
        resourceUriCtorArg = ConstPtr(0L),
        operationInfoCtorArg = MutPtr(0L),
        shutdownNotification = 0,
        shutdownNotificationHandleCtorArg = MutPtr(0L),
        dataLocaleCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): MutPtr<WsmanSenderDetails> = this.senderDetails

    public operator fun component2(): Pcwstr = this.locale

    public operator fun component3(): Pcwstr = this.resourceUri

    public operator fun component4(): MutPtr<WsmanOperationInfo> = this.operationInfo

    public operator fun component5(): Bool = this.shutdownNotification

    public operator fun component6(): Handle = this.shutdownNotificationHandle

    public operator fun component7(): Pcwstr = this.dataLocale

    public fun copy(senderDetails: MutPtr<WsmanSenderDetails> = this.senderDetails, locale: Pcwstr = this.locale, resourceUri: Pcwstr = this.resourceUri, operationInfo: MutPtr<WsmanOperationInfo> = this.operationInfo, shutdownNotification: Bool = this.shutdownNotification, shutdownNotificationHandle: Handle = this.shutdownNotificationHandle, dataLocale: Pcwstr = this.dataLocale): WsmanPluginRequest = WsmanPluginRequest(senderDetailsCtorArg = senderDetails, localeCtorArg = locale, resourceUriCtorArg = resourceUri, operationInfoCtorArg = operationInfo, shutdownNotification = shutdownNotification, shutdownNotificationHandleCtorArg = shutdownNotificationHandle, dataLocaleCtorArg = dataLocale)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsmanPluginRequest) return false
        if (this.senderDetails != other.senderDetails) return false
        if (this.locale != other.locale) return false
        if (this.resourceUri != other.resourceUri) return false
        if (this.operationInfo != other.operationInfo) return false
        if (this.shutdownNotification != other.shutdownNotification) return false
        if (this.shutdownNotificationHandle != other.shutdownNotificationHandle) return false
        if (this.dataLocale != other.dataLocale) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.senderDetails.hashCode()
        result = 31 * result + this.locale.hashCode()
        result = 31 * result + this.resourceUri.hashCode()
        result = 31 * result + this.operationInfo.hashCode()
        result = 31 * result + this.shutdownNotification.hashCode()
        result = 31 * result + this.shutdownNotificationHandle.hashCode()
        result = 31 * result + this.dataLocale.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            senderDetails: MutPtr<WsmanSenderDetails> = MutPtr(0L),
            locale: Pcwstr = ConstPtr(0L),
            resourceUri: Pcwstr = ConstPtr(0L),
            operationInfo: MutPtr<WsmanOperationInfo> = MutPtr(0L),
            shutdownNotification: Bool = 0,
            shutdownNotificationHandle: Handle = MutPtr(0L),
            dataLocale: Pcwstr = ConstPtr(0L),
        ): WsmanPluginRequest =
            WsmanPluginRequest(
                senderDetailsCtorArg = senderDetails,
                localeCtorArg = locale,
                resourceUriCtorArg = resourceUri,
                operationInfoCtorArg = operationInfo,
                shutdownNotification = shutdownNotification,
                shutdownNotificationHandleCtorArg = shutdownNotificationHandle,
                dataLocaleCtorArg = dataLocale,
            )
    }
}

public data class WsmanProxyInfo(
    public var accessType: UInt = 0u,
    public var authenticationCredentials: WsmanAuthenticationCredentials = WsmanAuthenticationCredentials(),
)

public class WsmanReceiveDataResult internal constructor(
    streamIdCtorArg: Pcwstr,
    public var streamData: WsmanData,
    commandStateCtorArg: Pcwstr,
    public var exitCode: UInt,
) {
    public var streamId: Pcwstr = streamIdCtorArg
        internal set

    public var commandState: Pcwstr = commandStateCtorArg
        internal set

    public constructor() : this(
        streamIdCtorArg = ConstPtr(0L),
        streamData = WsmanData(),
        commandStateCtorArg = ConstPtr(0L),
        exitCode = 0u,
    )

    public operator fun component1(): Pcwstr = this.streamId

    public operator fun component2(): WsmanData = this.streamData

    public operator fun component3(): Pcwstr = this.commandState

    public operator fun component4(): UInt = this.exitCode

    public fun copy(streamId: Pcwstr = this.streamId, streamData: WsmanData = this.streamData, commandState: Pcwstr = this.commandState, exitCode: UInt = this.exitCode): WsmanReceiveDataResult = WsmanReceiveDataResult(streamIdCtorArg = streamId, streamData = streamData, commandStateCtorArg = commandState, exitCode = exitCode)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsmanReceiveDataResult) return false
        if (this.streamId != other.streamId) return false
        if (this.streamData != other.streamData) return false
        if (this.commandState != other.commandState) return false
        if (this.exitCode != other.exitCode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.streamId.hashCode()
        result = 31 * result + this.streamData.hashCode()
        result = 31 * result + this.commandState.hashCode()
        result = 31 * result + this.exitCode.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            streamId: Pcwstr = ConstPtr(0L),
            streamData: WsmanData = WsmanData(),
            commandState: Pcwstr = ConstPtr(0L),
            exitCode: UInt = 0u,
        ): WsmanReceiveDataResult =
            WsmanReceiveDataResult(
                streamIdCtorArg = streamId,
                streamData = streamData,
                commandStateCtorArg = commandState,
                exitCode = exitCode,
            )
    }
}

public data class WsmanResponseData(
    public var receiveData: WsmanReceiveDataResult = WsmanReceiveDataResult(),
    public var connectData: WsmanConnectData = WsmanConnectData(),
    public var createData: WsmanCreateShellData = WsmanCreateShellData(),
)

public class WsmanSelectorSet internal constructor(
    public var numberKeys: UInt,
    keysCtorArg: MutPtr<WsmanKey>,
) {
    public var keys: MutPtr<WsmanKey> = keysCtorArg
        internal set

    public constructor() : this(
        numberKeys = 0u,
        keysCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numberKeys

    public operator fun component2(): MutPtr<WsmanKey> = this.keys

    public fun copy(numberKeys: UInt = this.numberKeys, keys: MutPtr<WsmanKey> = this.keys): WsmanSelectorSet = WsmanSelectorSet(numberKeys = numberKeys, keysCtorArg = keys)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsmanSelectorSet) return false
        if (this.numberKeys != other.numberKeys) return false
        if (this.keys != other.keys) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numberKeys.hashCode()
        result = 31 * result + this.keys.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsmanSelectorSet> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsmanSelectorSet> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsmanSelectorSet =
                    WsmanSelectorSet(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsmanKey>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsmanSelectorSet) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numberKeys)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsmanKey>(64)
                    ).writeNative(addr + 8L, value.keys)
                }
            }

        public operator fun invoke(
            numberKeys: UInt = 0u,
            keys: MutPtr<WsmanKey> = MutPtr(0L),
        ): WsmanSelectorSet =
            WsmanSelectorSet(
                numberKeys = numberKeys,
                keysCtorArg = keys,
            )
    }
}

public class WsmanSenderDetails internal constructor(
    senderNameCtorArg: Pcwstr,
    authenticationMechanismCtorArg: Pcwstr,
    certificateDetailsCtorArg: MutPtr<WsmanCertificateDetails>,
    clientTokenCtorArg: Handle,
    httpURLCtorArg: Pcwstr,
) {
    public var senderName: Pcwstr = senderNameCtorArg
        internal set

    public var authenticationMechanism: Pcwstr = authenticationMechanismCtorArg
        internal set

    public var certificateDetails: MutPtr<WsmanCertificateDetails> = certificateDetailsCtorArg
        internal set

    public var clientToken: Handle = clientTokenCtorArg
        internal set

    public var httpURL: Pcwstr = httpURLCtorArg
        internal set

    public constructor() : this(
        senderNameCtorArg = ConstPtr(0L),
        authenticationMechanismCtorArg = ConstPtr(0L),
        certificateDetailsCtorArg = MutPtr(0L),
        clientTokenCtorArg = MutPtr(0L),
        httpURLCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Pcwstr = this.senderName

    public operator fun component2(): Pcwstr = this.authenticationMechanism

    public operator fun component3(): MutPtr<WsmanCertificateDetails> = this.certificateDetails

    public operator fun component4(): Handle = this.clientToken

    public operator fun component5(): Pcwstr = this.httpURL

    public fun copy(senderName: Pcwstr = this.senderName, authenticationMechanism: Pcwstr = this.authenticationMechanism, certificateDetails: MutPtr<WsmanCertificateDetails> = this.certificateDetails, clientToken: Handle = this.clientToken, httpURL: Pcwstr = this.httpURL): WsmanSenderDetails = WsmanSenderDetails(senderNameCtorArg = senderName, authenticationMechanismCtorArg = authenticationMechanism, certificateDetailsCtorArg = certificateDetails, clientTokenCtorArg = clientToken, httpURLCtorArg = httpURL)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsmanSenderDetails) return false
        if (this.senderName != other.senderName) return false
        if (this.authenticationMechanism != other.authenticationMechanism) return false
        if (this.certificateDetails != other.certificateDetails) return false
        if (this.clientToken != other.clientToken) return false
        if (this.httpURL != other.httpURL) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.senderName.hashCode()
        result = 31 * result + this.authenticationMechanism.hashCode()
        result = 31 * result + this.certificateDetails.hashCode()
        result = 31 * result + this.clientToken.hashCode()
        result = 31 * result + this.httpURL.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            senderName: Pcwstr = ConstPtr(0L),
            authenticationMechanism: Pcwstr = ConstPtr(0L),
            certificateDetails: MutPtr<WsmanCertificateDetails> = MutPtr(0L),
            clientToken: Handle = MutPtr(0L),
            httpURL: Pcwstr = ConstPtr(0L),
        ): WsmanSenderDetails =
            WsmanSenderDetails(
                senderNameCtorArg = senderName,
                authenticationMechanismCtorArg = authenticationMechanism,
                certificateDetailsCtorArg = certificateDetails,
                clientTokenCtorArg = clientToken,
                httpURLCtorArg = httpURL,
            )
    }
}

public class WsmanShellAsync internal constructor(
    operationContextCtorArg: MutPtr<CVoid>,
    public var completionFunction: WsmanShellCompletionFunction,
) {
    public var operationContext: MutPtr<CVoid> = operationContextCtorArg
        internal set

    public constructor() : this(
        operationContextCtorArg = MutPtr(0L),
        completionFunction = null,
    )

    public operator fun component1(): MutPtr<CVoid> = this.operationContext

    public operator fun component2(): WsmanShellCompletionFunction = this.completionFunction

    public fun copy(operationContext: MutPtr<CVoid> = this.operationContext, completionFunction: WsmanShellCompletionFunction = this.completionFunction): WsmanShellAsync = WsmanShellAsync(operationContextCtorArg = operationContext, completionFunction = completionFunction)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsmanShellAsync) return false
        if (this.operationContext != other.operationContext) return false
        if (this.completionFunction != other.completionFunction) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.operationContext.hashCode()
        result = 31 * result + this.completionFunction.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            operationContext: MutPtr<CVoid> = MutPtr(0L),
            completionFunction: WsmanShellCompletionFunction = null,
        ): WsmanShellAsync =
            WsmanShellAsync(
                operationContextCtorArg = operationContext,
                completionFunction = completionFunction,
            )
    }
}

public data class WsmanShellDisconnectInfo(
    public var idleTimeoutMs: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsmanShellDisconnectInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsmanShellDisconnectInfo> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WsmanShellDisconnectInfo =
                    WsmanShellDisconnectInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WsmanShellDisconnectInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.idleTimeoutMs)
                }
            }
    }
}

public class WsmanShellStartupInfoV10 internal constructor(
    inputStreamSetCtorArg: MutPtr<WsmanStreamIdSet>,
    outputStreamSetCtorArg: MutPtr<WsmanStreamIdSet>,
    public var idleTimeoutMs: UInt,
    workingDirectoryCtorArg: Pcwstr,
    variableSetCtorArg: MutPtr<WsmanEnvironmentVariableSet>,
) {
    public var inputStreamSet: MutPtr<WsmanStreamIdSet> = inputStreamSetCtorArg
        internal set

    public var outputStreamSet: MutPtr<WsmanStreamIdSet> = outputStreamSetCtorArg
        internal set

    public var workingDirectory: Pcwstr = workingDirectoryCtorArg
        internal set

    public var variableSet: MutPtr<WsmanEnvironmentVariableSet> = variableSetCtorArg
        internal set

    public constructor() : this(
        inputStreamSetCtorArg = MutPtr(0L),
        outputStreamSetCtorArg = MutPtr(0L),
        idleTimeoutMs = 0u,
        workingDirectoryCtorArg = ConstPtr(0L),
        variableSetCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsmanStreamIdSet> = this.inputStreamSet

    public operator fun component2(): MutPtr<WsmanStreamIdSet> = this.outputStreamSet

    public operator fun component3(): UInt = this.idleTimeoutMs

    public operator fun component4(): Pcwstr = this.workingDirectory

    public operator fun component5(): MutPtr<WsmanEnvironmentVariableSet> = this.variableSet

    public fun copy(inputStreamSet: MutPtr<WsmanStreamIdSet> = this.inputStreamSet, outputStreamSet: MutPtr<WsmanStreamIdSet> = this.outputStreamSet, idleTimeoutMs: UInt = this.idleTimeoutMs, workingDirectory: Pcwstr = this.workingDirectory, variableSet: MutPtr<WsmanEnvironmentVariableSet> = this.variableSet): WsmanShellStartupInfoV10 = WsmanShellStartupInfoV10(inputStreamSetCtorArg = inputStreamSet, outputStreamSetCtorArg = outputStreamSet, idleTimeoutMs = idleTimeoutMs, workingDirectoryCtorArg = workingDirectory, variableSetCtorArg = variableSet)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsmanShellStartupInfoV10) return false
        if (this.inputStreamSet != other.inputStreamSet) return false
        if (this.outputStreamSet != other.outputStreamSet) return false
        if (this.idleTimeoutMs != other.idleTimeoutMs) return false
        if (this.workingDirectory != other.workingDirectory) return false
        if (this.variableSet != other.variableSet) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.inputStreamSet.hashCode()
        result = 31 * result + this.outputStreamSet.hashCode()
        result = 31 * result + this.idleTimeoutMs.hashCode()
        result = 31 * result + this.workingDirectory.hashCode()
        result = 31 * result + this.variableSet.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            inputStreamSet: MutPtr<WsmanStreamIdSet> = MutPtr(0L),
            outputStreamSet: MutPtr<WsmanStreamIdSet> = MutPtr(0L),
            idleTimeoutMs: UInt = 0u,
            workingDirectory: Pcwstr = ConstPtr(0L),
            variableSet: MutPtr<WsmanEnvironmentVariableSet> = MutPtr(0L),
        ): WsmanShellStartupInfoV10 =
            WsmanShellStartupInfoV10(
                inputStreamSetCtorArg = inputStreamSet,
                outputStreamSetCtorArg = outputStreamSet,
                idleTimeoutMs = idleTimeoutMs,
                workingDirectoryCtorArg = workingDirectory,
                variableSetCtorArg = variableSet,
            )
    }
}

public class WsmanShellStartupInfoV11 internal constructor(
    public var base: WsmanShellStartupInfoV10,
    nameCtorArg: Pcwstr,
) {
    public var name: Pcwstr = nameCtorArg
        internal set

    public constructor() : this(
        base = WsmanShellStartupInfoV10(),
        nameCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): WsmanShellStartupInfoV10 = this.base

    public operator fun component2(): Pcwstr = this.name

    public fun copy(base: WsmanShellStartupInfoV10 = this.base, name: Pcwstr = this.name): WsmanShellStartupInfoV11 = WsmanShellStartupInfoV11(base = base, nameCtorArg = name)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsmanShellStartupInfoV11) return false
        if (this.base != other.base) return false
        if (this.name != other.name) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.base.hashCode()
        result = 31 * result + this.name.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            base: WsmanShellStartupInfoV10 = WsmanShellStartupInfoV10(),
            name: Pcwstr = ConstPtr(0L),
        ): WsmanShellStartupInfoV11 =
            WsmanShellStartupInfoV11(
                base = base,
                nameCtorArg = name,
            )
    }
}

public class WsmanStreamIdSet internal constructor(
    public var streamIDsCount: UInt,
    streamIDsCtorArg: ConstPtr<Pcwstr>,
) {
    public var streamIDs: ConstPtr<Pcwstr> = streamIDsCtorArg
        internal set

    public constructor() : this(
        streamIDsCount = 0u,
        streamIDsCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.streamIDsCount

    public operator fun component2(): ConstPtr<Pcwstr> = this.streamIDs

    public fun copy(streamIDsCount: UInt = this.streamIDsCount, streamIDs: ConstPtr<Pcwstr> = this.streamIDs): WsmanStreamIdSet = WsmanStreamIdSet(streamIDsCount = streamIDsCount, streamIDsCtorArg = streamIDs)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsmanStreamIdSet) return false
        if (this.streamIDsCount != other.streamIDsCount) return false
        if (this.streamIDs != other.streamIDs) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.streamIDsCount.hashCode()
        result = 31 * result + this.streamIDs.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsmanStreamIdSet> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsmanStreamIdSet> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WsmanStreamIdSet =
                    WsmanStreamIdSet(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<Pcwstr>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsmanStreamIdSet) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.streamIDsCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<Pcwstr>(64)
                    ).writeNative(addr + 8L, value.streamIDs)
                }
            }

        public operator fun invoke(
            streamIDsCount: UInt = 0u,
            streamIDs: ConstPtr<Pcwstr> = ConstPtr(0L),
        ): WsmanStreamIdSet =
            WsmanStreamIdSet(
                streamIDsCount = streamIDsCount,
                streamIDsCtorArg = streamIDs,
            )
    }
}

public class WsmanUsernamePasswordCreds internal constructor(
    usernameCtorArg: Pcwstr,
    passwordCtorArg: Pcwstr,
) {
    public var username: Pcwstr = usernameCtorArg
        internal set

    public var password: Pcwstr = passwordCtorArg
        internal set

    public constructor() : this(
        usernameCtorArg = ConstPtr(0L),
        passwordCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Pcwstr = this.username

    public operator fun component2(): Pcwstr = this.password

    public fun copy(username: Pcwstr = this.username, password: Pcwstr = this.password): WsmanUsernamePasswordCreds = WsmanUsernamePasswordCreds(usernameCtorArg = username, passwordCtorArg = password)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsmanUsernamePasswordCreds) return false
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
            username: Pcwstr = ConstPtr(0L),
            password: Pcwstr = ConstPtr(0L),
        ): WsmanUsernamePasswordCreds =
            WsmanUsernamePasswordCreds(
                usernameCtorArg = username,
                passwordCtorArg = password,
            )
    }
}
