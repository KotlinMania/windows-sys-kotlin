@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.COpaquePointer

public data class EnclaveIdentity(
    public var ownerId: UByteArray = UByteArray(32),
    public var uniqueId: UByteArray = UByteArray(32),
    public var authorId: UByteArray = UByteArray(32),
    public var familyId: UByteArray = UByteArray(16),
    public var imageId: UByteArray = UByteArray(16),
    public var enclaveSvn: UInt = 0u,
    public var secureKernelSvn: UInt = 0u,
    public var platformSvn: UInt = 0u,
    public var flags: UInt = 0u,
    public var signingLevel: UInt = 0u,
    public var enclaveType: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EnclaveIdentity) return false
        if (!this.ownerId.contentEquals(other.ownerId)) return false
        if (!this.uniqueId.contentEquals(other.uniqueId)) return false
        if (!this.authorId.contentEquals(other.authorId)) return false
        if (!this.familyId.contentEquals(other.familyId)) return false
        if (!this.imageId.contentEquals(other.imageId)) return false
        if (this.enclaveSvn != other.enclaveSvn) return false
        if (this.secureKernelSvn != other.secureKernelSvn) return false
        if (this.platformSvn != other.platformSvn) return false
        if (this.flags != other.flags) return false
        if (this.signingLevel != other.signingLevel) return false
        if (this.enclaveType != other.enclaveType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ownerId.contentHashCode()
        result = 31 * result + this.uniqueId.contentHashCode()
        result = 31 * result + this.authorId.contentHashCode()
        result = 31 * result + this.familyId.contentHashCode()
        result = 31 * result + this.imageId.contentHashCode()
        result = 31 * result + this.enclaveSvn.hashCode()
        result = 31 * result + this.secureKernelSvn.hashCode()
        result = 31 * result + this.platformSvn.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.signingLevel.hashCode()
        result = 31 * result + this.enclaveType.hashCode()
        return result
    }
}

public data class EnclaveInformation(
    public var enclaveType: UInt = 0u,
    public var reserved: UInt = 0u,
    public var baseAddress: COpaquePointer? = null,
    public var size: Int = 0,
    public var identity: EnclaveIdentity = EnclaveIdentity(),
)

public data class EnclaveVbsBasicKeyRequest(
    public var requestSize: UInt = 0u,
    public var flags: UInt = 0u,
    public var enclaveSVN: UInt = 0u,
    public var systemKeyID: UInt = 0u,
    public var currentSystemKeyID: UInt = 0u,
)

public data class VbsBasicEnclaveExceptionAmd64(
    public var exceptionCode: UInt = 0u,
    public var numberParameters: UInt = 0u,
    public var exceptionInformation: IntArray = IntArray(3),
    public var exceptionRAX: Int = 0,
    public var exceptionRCX: Int = 0,
    public var exceptionRIP: Int = 0,
    public var exceptionRFLAGS: Int = 0,
    public var exceptionRSP: Int = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VbsBasicEnclaveExceptionAmd64) return false
        if (this.exceptionCode != other.exceptionCode) return false
        if (this.numberParameters != other.numberParameters) return false
        if (!this.exceptionInformation.contentEquals(other.exceptionInformation)) return false
        if (this.exceptionRAX != other.exceptionRAX) return false
        if (this.exceptionRCX != other.exceptionRCX) return false
        if (this.exceptionRIP != other.exceptionRIP) return false
        if (this.exceptionRFLAGS != other.exceptionRFLAGS) return false
        if (this.exceptionRSP != other.exceptionRSP) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.exceptionCode.hashCode()
        result = 31 * result + this.numberParameters.hashCode()
        result = 31 * result + this.exceptionInformation.contentHashCode()
        result = 31 * result + this.exceptionRAX.hashCode()
        result = 31 * result + this.exceptionRCX.hashCode()
        result = 31 * result + this.exceptionRIP.hashCode()
        result = 31 * result + this.exceptionRFLAGS.hashCode()
        result = 31 * result + this.exceptionRSP.hashCode()
        return result
    }
}

public data class VbsBasicEnclaveSyscallPage(
    public var returnFromEnclave: VbsBasicEnclaveBasicCallReturnFromEnclave = null,
    public var returnFromException: VbsBasicEnclaveBasicCallReturnFromException = null,
    public var terminateThread: VbsBasicEnclaveBasicCallTerminateThread = null,
    public var interruptThread: VbsBasicEnclaveBasicCallInterruptThread = null,
    public var commitPages: VbsBasicEnclaveBasicCallCommitPages = null,
    public var decommitPages: VbsBasicEnclaveBasicCallDecommitPages = null,
    public var protectPages: VbsBasicEnclaveBasicCallProtectPages = null,
    public var createThread: VbsBasicEnclaveBasicCallCreateThread = null,
    public var getEnclaveInformation: VbsBasicEnclaveBasicCallGetEnclaveInformation = null,
    public var generateKey: VbsBasicEnclaveBasicCallGenerateKey = null,
    public var generateReport: VbsBasicEnclaveBasicCallGenerateReport = null,
    public var verifyReport: VbsBasicEnclaveBasicCallVerifyReport = null,
    public var generateRandomData: VbsBasicEnclaveBasicCallGenerateRandomData = null,
)

public data class VbsBasicEnclaveThreadDescriptor32(
    public var threadContext: UIntArray = UIntArray(4),
    public var entryPoint: UInt = 0u,
    public var stackPointer: UInt = 0u,
    public var exceptionEntryPoint: UInt = 0u,
    public var exceptionStack: UInt = 0u,
    public var exceptionActive: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VbsBasicEnclaveThreadDescriptor32) return false
        if (!this.threadContext.contentEquals(other.threadContext)) return false
        if (this.entryPoint != other.entryPoint) return false
        if (this.stackPointer != other.stackPointer) return false
        if (this.exceptionEntryPoint != other.exceptionEntryPoint) return false
        if (this.exceptionStack != other.exceptionStack) return false
        if (this.exceptionActive != other.exceptionActive) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.threadContext.contentHashCode()
        result = 31 * result + this.entryPoint.hashCode()
        result = 31 * result + this.stackPointer.hashCode()
        result = 31 * result + this.exceptionEntryPoint.hashCode()
        result = 31 * result + this.exceptionStack.hashCode()
        result = 31 * result + this.exceptionActive.hashCode()
        return result
    }
}

public data class VbsBasicEnclaveThreadDescriptor64(
    public var threadContext: ULongArray = ULongArray(4),
    public var entryPoint: ULong = 0uL,
    public var stackPointer: ULong = 0uL,
    public var exceptionEntryPoint: ULong = 0uL,
    public var exceptionStack: ULong = 0uL,
    public var exceptionActive: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VbsBasicEnclaveThreadDescriptor64) return false
        if (!this.threadContext.contentEquals(other.threadContext)) return false
        if (this.entryPoint != other.entryPoint) return false
        if (this.stackPointer != other.stackPointer) return false
        if (this.exceptionEntryPoint != other.exceptionEntryPoint) return false
        if (this.exceptionStack != other.exceptionStack) return false
        if (this.exceptionActive != other.exceptionActive) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.threadContext.contentHashCode()
        result = 31 * result + this.entryPoint.hashCode()
        result = 31 * result + this.stackPointer.hashCode()
        result = 31 * result + this.exceptionEntryPoint.hashCode()
        result = 31 * result + this.exceptionStack.hashCode()
        result = 31 * result + this.exceptionActive.hashCode()
        return result
    }
}

public data class VbsEnclaveReport(
    public var reportSize: UInt = 0u,
    public var reportVersion: UInt = 0u,
    public var enclaveData: UByteArray = UByteArray(64),
    public var enclaveIdentity: EnclaveIdentity = EnclaveIdentity(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VbsEnclaveReport) return false
        if (this.reportSize != other.reportSize) return false
        if (this.reportVersion != other.reportVersion) return false
        if (!this.enclaveData.contentEquals(other.enclaveData)) return false
        if (this.enclaveIdentity != other.enclaveIdentity) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reportSize.hashCode()
        result = 31 * result + this.reportVersion.hashCode()
        result = 31 * result + this.enclaveData.contentHashCode()
        result = 31 * result + this.enclaveIdentity.hashCode()
        return result
    }
}

public data class VbsEnclaveReportModule(
    public var header: VbsEnclaveReportVardataHeader = VbsEnclaveReportVardataHeader(),
    public var uniqueId: UByteArray = UByteArray(32),
    public var authorId: UByteArray = UByteArray(32),
    public var familyId: UByteArray = UByteArray(16),
    public var imageId: UByteArray = UByteArray(16),
    public var svn: UInt = 0u,
    public var moduleName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VbsEnclaveReportModule) return false
        if (this.header != other.header) return false
        if (!this.uniqueId.contentEquals(other.uniqueId)) return false
        if (!this.authorId.contentEquals(other.authorId)) return false
        if (!this.familyId.contentEquals(other.familyId)) return false
        if (!this.imageId.contentEquals(other.imageId)) return false
        if (this.svn != other.svn) return false
        if (!this.moduleName.contentEquals(other.moduleName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.uniqueId.contentHashCode()
        result = 31 * result + this.authorId.contentHashCode()
        result = 31 * result + this.familyId.contentHashCode()
        result = 31 * result + this.imageId.contentHashCode()
        result = 31 * result + this.svn.hashCode()
        result = 31 * result + this.moduleName.contentHashCode()
        return result
    }
}

public data class VbsEnclaveReportPkgHeader(
    public var packageSize: UInt = 0u,
    public var version: UInt = 0u,
    public var signatureScheme: UInt = 0u,
    public var signedStatementSize: UInt = 0u,
    public var signatureSize: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class VbsEnclaveReportVardataHeader(public var dataType: UInt = 0u, public var size: UInt = 0u)
