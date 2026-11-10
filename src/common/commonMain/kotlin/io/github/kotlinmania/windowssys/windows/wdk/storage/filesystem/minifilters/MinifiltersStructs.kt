@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DeviceObject
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Eresource
import io.github.kotlinmania.windowssys.windows.wdk.foundation.FileObject
import io.github.kotlinmania.windowssys.windows.wdk.foundation.IoSecurityContext
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Irp
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Ktransaction
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Mdl
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Peprocess
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pethread
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Vpb
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FileGetQuotaInformation
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FileInformationClass
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FileNetworkOpenInformation
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FsFilterSectionSyncOutput
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FsFilterSectionSyncType
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FsInformationClass
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.BusQueryIdType
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.CmResourceList
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.DeviceCapabilities
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.DeviceRelationType
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.DeviceTextType
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.DeviceUsageNotificationType
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.DirectoryNotifyInformationClass
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.Interface
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.IoCsq
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.IoResourceRequirementsList
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.system.io.IoStatusBlock
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.ListEntry

public data class FltCallbackData(
    public var flags: UInt = 0u,
    public var thread: Pethread = 0L,
    public var iopb: FltIoParameterBlock? = null,
    public var ioStatus: IoStatusBlock = IoStatusBlock(),
    public var tagData: FltTagDataBuffer? = null,
    public var anonymous: FltCallbackData0 = FltCallbackData0(),
    public var requestorMode: Byte = 0,
)

public data class FltCallbackData0(public var anonymous: FltCallbackData00 = FltCallbackData00(), public var filterContext: List<COpaquePointer> = List(4) { COpaquePointer(0L) })

public data class FltCallbackData00(public var queueLinks: ListEntry = ListEntry(), public var queueContext: List<COpaquePointer> = List(2) { COpaquePointer(0L) })

public data class FltCallbackDataQueue(
    public var csq: IoCsq = IoCsq(),
    public var flags: FltCallbackDataQueueFlags = 0,
    public var instance: PfltInstance = 0L,
    public var insertIo: PfltCallbackDataQueueInsertIo = null,
    public var removeIo: PfltCallbackDataQueueRemoveIo = null,
    public var peekNextIo: PfltCallbackDataQueuePeekNextIo = null,
    public var acquire: PfltCallbackDataQueueAcquire = null,
    public var release: PfltCallbackDataQueueRelease = null,
    public var completeCanceledIo: PfltCallbackDataQueueCompleteCanceledIo = null,
)

public data class FltContextRegistration(
    public var contextType: UShort = 0u,
    public var flags: UShort = 0u,
    public var contextCleanupCallback: PfltContextCleanupCallback = null,
    public var size: Int = 0,
    public var poolTag: UInt = 0u,
    public var contextAllocateCallback: PfltContextAllocateCallback = null,
    public var contextFreeCallback: PfltContextFreeCallback = null,
    public var reserved1: COpaquePointer? = null,
)

public data class FltCreatefileTargetEcpContext(
    public var instance: PfltInstance = 0L,
    public var volume: PfltVolume = 0L,
    public var fileNameInformation: FltFileNameInformation? = null,
    public var flags: UShort = 0u,
)

public data class FltFileNameInformation(
    public var size: UShort = 0u,
    public var namesParsed: UShort = 0u,
    public var format: UInt = 0u,
    public var name: UnicodeString = UnicodeString(),
    public var volume: UnicodeString = UnicodeString(),
    public var share: UnicodeString = UnicodeString(),
    public var extension: UnicodeString = UnicodeString(),
    public var stream: UnicodeString = UnicodeString(),
    public var finalComponent: UnicodeString = UnicodeString(),
    public var parentDir: UnicodeString = UnicodeString(),
)

public data class FltIoParameterBlock(
    public var irpFlags: UInt = 0u,
    public var majorFunction: UByte = 0u,
    public var minorFunction: UByte = 0u,
    public var operationFlags: UByte = 0u,
    public var reserved: UByte = 0u,
    public var targetFileObject: FileObject? = null,
    public var targetInstance: PfltInstance = 0L,
    public var parameters: FltParameters = FltParameters(),
)

public data class FltNameControl(public var name: UnicodeString = UnicodeString())

public data class FltOperationRegistration(
    public var majorFunction: UByte = 0u,
    public var flags: UInt = 0u,
    public var preOperation: PfltPreOperationCallback = null,
    public var postOperation: PfltPostOperationCallback = null,
    public var reserved1: COpaquePointer? = null,
)

public class FltParameters(
    public var create: FltParameters0 = FltParameters0(),
    public var createPipe: FltParameters1 = FltParameters1(),
    public var createMailslot: FltParameters2 = FltParameters2(),
    public var read: FltParameters3 = FltParameters3(),
    public var write: FltParameters4 = FltParameters4(),
    public var queryFileInformation: FltParameters5 = FltParameters5(),
    public var setFileInformation: FltParameters6 = FltParameters6(),
    public var queryEa: FltParameters7 = FltParameters7(),
    public var setEa: FltParameters8 = FltParameters8(),
    public var queryVolumeInformation: FltParameters9 = FltParameters9(),
    public var setVolumeInformation: FltParameters10 = FltParameters10(),
    public var directoryControl: FltParameters11 = FltParameters11(),
    public var fileSystemControl: FltParameters12 = FltParameters12(),
    public var deviceIoControl: FltParameters13 = FltParameters13(),
    public var lockControl: FltParameters14 = FltParameters14(),
    public var querySecurity: FltParameters15 = FltParameters15(),
    public var setSecurity: FltParameters16 = FltParameters16(),
    public var wmi: FltParameters17 = FltParameters17(),
    public var queryQuota: FltParameters18 = FltParameters18(),
    public var setQuota: FltParameters19 = FltParameters19(),
    public var pnp: FltParameters20 = FltParameters20(),
    public var acquireForSectionSynchronization: FltParameters21 = FltParameters21(),
    public var acquireForModifiedPageWriter: FltParameters22 = FltParameters22(),
    public var releaseForModifiedPageWriter: FltParameters23 = FltParameters23(),
    public var queryOpen: FltParameters24 = FltParameters24(),
    public var fastIoCheckIfPossible: FltParameters25 = FltParameters25(),
    public var networkQueryOpen: FltParameters26 = FltParameters26(),
    public var mdlRead: FltParameters27 = FltParameters27(),
    public var mdlReadComplete: FltParameters28 = FltParameters28(),
    public var prepareMdlWrite: FltParameters29 = FltParameters29(),
    public var mdlWriteComplete: FltParameters30 = FltParameters30(),
    public var mountVolume: FltParameters31 = FltParameters31(),
    public var others: FltParameters32 = FltParameters32(),
)

public data class FltParameters22(public var endingOffset: Long? = null, public var resourceToRelease: COpaquePointer? = null)

public data class FltParameters21(
    public var syncType: FsFilterSectionSyncType = 0,
    public var pageProtection: UInt = 0u,
    public var outputInformation: FsFilterSectionSyncOutput? = null,
    public var flags: UInt = 0u,
    public var allocationAttributes: UInt = 0u,
)

public data class FltParameters2(
    public var securityContext: IoSecurityContext? = null,
    public var options: UInt = 0u,
    public var reserved: UShort = 0u,
    public var shareAccess: UShort = 0u,
    public var parameters: COpaquePointer? = null,
)

public data class FltParameters1(
    public var securityContext: IoSecurityContext? = null,
    public var options: UInt = 0u,
    public var reserved: UShort = 0u,
    public var shareAccess: UShort = 0u,
    public var parameters: COpaquePointer? = null,
)

public data class FltParameters0(
    public var securityContext: IoSecurityContext? = null,
    public var options: UInt = 0u,
    public var fileAttributes: UShort = 0u,
    public var shareAccess: UShort = 0u,
    public var eaLength: UInt = 0u,
    public var eaBuffer: COpaquePointer? = null,
    public var allocationSize: Long = 0L,
)

public data class FltParameters13(
    public var common: FltParameters130 = FltParameters130(),
    public var neither: FltParameters131 = FltParameters131(),
    public var buffered: FltParameters132 = FltParameters132(),
    public var direct: FltParameters133 = FltParameters133(),
    public var fastIo: FltParameters134 = FltParameters134(),
)

public data class FltParameters132(
    public var outputBufferLength: UInt = 0u,
    public var inputBufferLength: UInt = 0u,
    public var ioControlCode: UInt = 0u,
    public var systemBuffer: COpaquePointer? = null,
)

public data class FltParameters130(
    public var outputBufferLength: UInt = 0u,
    public var inputBufferLength: UInt = 0u,
    public var ioControlCode: UInt = 0u,
)

public data class FltParameters133(
    public var outputBufferLength: UInt = 0u,
    public var inputBufferLength: UInt = 0u,
    public var ioControlCode: UInt = 0u,
    public var inputSystemBuffer: COpaquePointer? = null,
    public var outputBuffer: COpaquePointer? = null,
    public var outputMdlAddress: Mdl? = null,
)

public data class FltParameters134(
    public var outputBufferLength: UInt = 0u,
    public var inputBufferLength: UInt = 0u,
    public var ioControlCode: UInt = 0u,
    public var inputBuffer: COpaquePointer? = null,
    public var outputBuffer: COpaquePointer? = null,
)

public data class FltParameters131(
    public var outputBufferLength: UInt = 0u,
    public var inputBufferLength: UInt = 0u,
    public var ioControlCode: UInt = 0u,
    public var inputBuffer: COpaquePointer? = null,
    public var outputBuffer: COpaquePointer? = null,
    public var outputMdlAddress: Mdl? = null,
)

public data class FltParameters11(
    public var queryDirectory: FltParameters110 = FltParameters110(),
    public var notifyDirectory: FltParameters111 = FltParameters111(),
    public var notifyDirectoryEx: FltParameters112 = FltParameters112(),
)

public data class FltParameters112(
    public var length: UInt = 0u,
    public var completionFilter: UInt = 0u,
    public var directoryNotifyInformationClass: DirectoryNotifyInformationClass = 0,
    public var spare2: UInt = 0u,
    public var directoryBuffer: COpaquePointer? = null,
    public var mdlAddress: Mdl? = null,
)

public data class FltParameters111(
    public var length: UInt = 0u,
    public var completionFilter: UInt = 0u,
    public var spare1: UInt = 0u,
    public var spare2: UInt = 0u,
    public var directoryBuffer: COpaquePointer? = null,
    public var mdlAddress: Mdl? = null,
)

public data class FltParameters110(
    public var length: UInt = 0u,
    public var fileName: UnicodeString? = null,
    public var fileInformationClass: FileInformationClass = 0,
    public var fileIndex: UInt = 0u,
    public var directoryBuffer: COpaquePointer? = null,
    public var mdlAddress: Mdl? = null,
)

public data class FltParameters25(
    public var fileOffset: Long = 0L,
    public var length: UInt = 0u,
    public var lockKey: UInt = 0u,
    public var checkForReadOperation: Boolean = false,
)

public data class FltParameters12(
    public var verifyVolume: FltParameters120 = FltParameters120(),
    public var common: FltParameters121 = FltParameters121(),
    public var neither: FltParameters122 = FltParameters122(),
    public var buffered: FltParameters123 = FltParameters123(),
    public var direct: FltParameters124 = FltParameters124(),
)

public data class FltParameters123(
    public var outputBufferLength: UInt = 0u,
    public var inputBufferLength: UInt = 0u,
    public var fsControlCode: UInt = 0u,
    public var systemBuffer: COpaquePointer? = null,
)

public data class FltParameters121(
    public var outputBufferLength: UInt = 0u,
    public var inputBufferLength: UInt = 0u,
    public var fsControlCode: UInt = 0u,
)

public data class FltParameters124(
    public var outputBufferLength: UInt = 0u,
    public var inputBufferLength: UInt = 0u,
    public var fsControlCode: UInt = 0u,
    public var inputSystemBuffer: COpaquePointer? = null,
    public var outputBuffer: COpaquePointer? = null,
    public var outputMdlAddress: Mdl? = null,
)

public data class FltParameters122(
    public var outputBufferLength: UInt = 0u,
    public var inputBufferLength: UInt = 0u,
    public var fsControlCode: UInt = 0u,
    public var inputBuffer: COpaquePointer? = null,
    public var outputBuffer: COpaquePointer? = null,
    public var outputMdlAddress: Mdl? = null,
)

public data class FltParameters120(public var vpb: Vpb? = null, public var deviceObject: DeviceObject? = null)

public data class FltParameters14(
    public var length: Long? = null,
    public var key: UInt = 0u,
    public var byteOffset: Long = 0L,
    public var processId: Peprocess = 0L,
    public var failImmediately: Boolean = false,
    public var exclusiveLock: Boolean = false,
)

public data class FltParameters28(public var mdlChain: Mdl? = null)

public data class FltParameters27(
    public var fileOffset: Long = 0L,
    public var length: UInt = 0u,
    public var key: UInt = 0u,
    public var mdlChain: COpaquePointer? = null,
)

public data class FltParameters30(public var fileOffset: Long = 0L, public var mdlChain: Mdl? = null)

public data class FltParameters31(public var deviceType: UInt = 0u)

public data class FltParameters26(public var irp: Irp? = null, public var networkInformation: FileNetworkOpenInformation? = null)

public data class FltParameters32(
    public var argument1: COpaquePointer? = null,
    public var argument2: COpaquePointer? = null,
    public var argument3: COpaquePointer? = null,
    public var argument4: COpaquePointer? = null,
    public var argument5: COpaquePointer? = null,
    public var argument6: Long = 0L,
)

public data class FltParameters20(
    public var startDevice: FltParameters200 = FltParameters200(),
    public var queryDeviceRelations: FltParameters201 = FltParameters201(),
    public var queryInterface: FltParameters202 = FltParameters202(),
    public var deviceCapabilities: FltParameters203 = FltParameters203(),
    public var filterResourceRequirements: FltParameters204 = FltParameters204(),
    public var readWriteConfig: FltParameters205 = FltParameters205(),
    public var setLock: FltParameters206 = FltParameters206(),
    public var queryId: FltParameters207 = FltParameters207(),
    public var queryDeviceText: FltParameters208 = FltParameters208(),
    public var usageNotification: FltParameters209 = FltParameters209(),
)

public data class FltParameters203(public var capabilities: DeviceCapabilities? = null)

public data class FltParameters204(public var ioResourceRequirementList: IoResourceRequirementsList? = null)

public data class FltParameters201(public var type: DeviceRelationType = 0)

public data class FltParameters208(public var deviceTextType: DeviceTextType = 0, public var localeId: UInt = 0u)

public data class FltParameters207(public var idType: BusQueryIdType = 0)

public data class FltParameters202(
    public var interfaceType: Guid? = null,
    public var size: UShort = 0u,
    public var version: UShort = 0u,
    public var iface: Interface? = null,
    public var interfaceSpecificData: COpaquePointer? = null,
)

public data class FltParameters205(
    public var whichSpace: UInt = 0u,
    public var buffer: COpaquePointer? = null,
    public var offset: UInt = 0u,
    public var length: UInt = 0u,
)

public data class FltParameters206(public var lock: Boolean = false)

public data class FltParameters200(public var allocatedResources: CmResourceList? = null, public var allocatedResourcesTranslated: CmResourceList? = null)

public data class FltParameters209(
    public var inPath: Boolean = false,
    public var reserved: BooleanArray = BooleanArray(3),
    public var type: DeviceUsageNotificationType = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltParameters209) return false
        if (this.inPath != other.inPath) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.type != other.type) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.inPath.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.type.hashCode()
        return result
    }
}

public data class FltParameters29(
    public var fileOffset: Long = 0L,
    public var length: UInt = 0u,
    public var key: UInt = 0u,
    public var mdlChain: COpaquePointer? = null,
)

public data class FltParameters7(
    public var length: UInt = 0u,
    public var eaList: COpaquePointer? = null,
    public var eaListLength: UInt = 0u,
    public var eaIndex: UInt = 0u,
    public var eaBuffer: COpaquePointer? = null,
    public var mdlAddress: Mdl? = null,
)

public data class FltParameters5(
    public var length: UInt = 0u,
    public var fileInformationClass: FileInformationClass = 0,
    public var infoBuffer: COpaquePointer? = null,
)

public data class FltParameters24(
    public var irp: Irp? = null,
    public var fileInformation: COpaquePointer? = null,
    public var length: UInt? = null,
    public var fileInformationClass: FileInformationClass = 0,
)

public data class FltParameters18(
    public var length: UInt = 0u,
    public var startSid: Psid = null,
    public var sidList: FileGetQuotaInformation? = null,
    public var sidListLength: UInt = 0u,
    public var quotaBuffer: COpaquePointer? = null,
    public var mdlAddress: Mdl? = null,
)

public data class FltParameters15(
    public var securityInformation: UInt = 0u,
    public var length: UInt = 0u,
    public var securityBuffer: COpaquePointer? = null,
    public var mdlAddress: Mdl? = null,
)

public data class FltParameters9(
    public var length: UInt = 0u,
    public var fsInformationClass: FsInformationClass = 0,
    public var volumeBuffer: COpaquePointer? = null,
)

public data class FltParameters3(
    public var length: UInt = 0u,
    public var key: UInt = 0u,
    public var byteOffset: Long = 0L,
    public var readBuffer: COpaquePointer? = null,
    public var mdlAddress: Mdl? = null,
)

public data class FltParameters23(public var resourceToRelease: Eresource? = null)

public data class FltParameters8(
    public var length: UInt = 0u,
    public var eaBuffer: COpaquePointer? = null,
    public var mdlAddress: Mdl? = null,
)

public data class FltParameters6(
    public var length: UInt = 0u,
    public var fileInformationClass: FileInformationClass = 0,
    public var parentOfTarget: FileObject? = null,
    public var anonymous: FltParameters60 = FltParameters60(),
    public var infoBuffer: COpaquePointer? = null,
)

public data class FltParameters60(
    public var anonymous: FltParameters600 = FltParameters600(),
    public var clusterCount: UInt = 0u,
    public var deleteHandle: Handle = null,
)

public data class FltParameters600(public var replaceIfExists: Boolean = false, public var advanceOnly: Boolean = false)

public data class FltParameters19(
    public var length: UInt = 0u,
    public var quotaBuffer: COpaquePointer? = null,
    public var mdlAddress: Mdl? = null,
)

public data class FltParameters16(public var securityInformation: UInt = 0u, public var securityDescriptor: PsecurityDescriptor = null)

public data class FltParameters10(
    public var length: UInt = 0u,
    public var fsInformationClass: FsInformationClass = 0,
    public var volumeBuffer: COpaquePointer? = null,
)

public data class FltParameters17(
    public var providerId: Int = 0,
    public var dataPath: COpaquePointer? = null,
    public var bufferSize: UInt = 0u,
    public var buffer: COpaquePointer? = null,
)

public data class FltParameters4(
    public var length: UInt = 0u,
    public var key: UInt = 0u,
    public var byteOffset: Long = 0L,
    public var writeBuffer: COpaquePointer? = null,
    public var mdlAddress: Mdl? = null,
)

public data class FltRegistration(
    public var size: UShort = 0u,
    public var version: UShort = 0u,
    public var flags: UInt = 0u,
    public var contextRegistration: FltContextRegistration? = null,
    public var operationRegistration: FltOperationRegistration? = null,
    public var filterUnloadCallback: PfltFilterUnloadCallback = null,
    public var instanceSetupCallback: PfltInstanceSetupCallback = null,
    public var instanceQueryTeardownCallback: PfltInstanceQueryTeardownCallback = null,
    public var instanceTeardownStartCallback: PfltInstanceTeardownCallback = null,
    public var instanceTeardownCompleteCallback: PfltInstanceTeardownCallback = null,
    public var generateFileNameCallback: PfltGenerateFileName = null,
    public var normalizeNameComponentCallback: PfltNormalizeNameComponent = null,
    public var normalizeContextCleanupCallback: PfltNormalizeContextCleanup = null,
    public var transactionNotificationCallback: PfltTransactionNotificationCallback = null,
    public var normalizeNameComponentExCallback: PfltNormalizeNameComponentEx = null,
    public var sectionNotificationCallback: PfltSectionConflictNotificationCallback = null,
)

public data class FltRelatedContexts(
    public var volumeContext: PfltContext = null,
    public var instanceContext: PfltContext = null,
    public var fileContext: PfltContext = null,
    public var streamContext: PfltContext = null,
    public var streamHandleContext: PfltContext = null,
    public var transactionContext: PfltContext = null,
)

public data class FltRelatedContextsEx(
    public var volumeContext: PfltContext = null,
    public var instanceContext: PfltContext = null,
    public var fileContext: PfltContext = null,
    public var streamContext: PfltContext = null,
    public var streamHandleContext: PfltContext = null,
    public var transactionContext: PfltContext = null,
    public var sectionContext: PfltContext = null,
)

public data class FltRelatedObjects(
    public var size: UShort = 0u,
    public var transactionContext: UShort = 0u,
    public var filter: PfltFilter = 0L,
    public var volume: PfltVolume = 0L,
    public var instance: PfltInstance = 0L,
    public var fileObject: FileObject? = null,
    public var transaction: Ktransaction? = null,
)

public data class FltTagDataBuffer(
    public var fileTag: UInt = 0u,
    public var tagDataLength: UShort = 0u,
    public var unparsedNameLength: UShort = 0u,
    public var anonymous: FltTagDataBuffer0 = FltTagDataBuffer0(),
)

public data class FltTagDataBuffer0(
    public var symbolicLinkReparseBuffer: FltTagDataBuffer00 = FltTagDataBuffer00(),
    public var mountPointReparseBuffer: FltTagDataBuffer01 = FltTagDataBuffer01(),
    public var genericReparseBuffer: FltTagDataBuffer02 = FltTagDataBuffer02(),
    public var genericGUIDReparseBuffer: FltTagDataBuffer03 = FltTagDataBuffer03(),
)

public data class FltTagDataBuffer03(public var tagGuid: Guid = Guid(), public var dataBuffer: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltTagDataBuffer03) return false
        if (this.tagGuid != other.tagGuid) return false
        if (!this.dataBuffer.contentEquals(other.dataBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.tagGuid.hashCode()
        result = 31 * result + this.dataBuffer.contentHashCode()
        return result
    }
}

public data class FltTagDataBuffer02(public var dataBuffer: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltTagDataBuffer02) return false
        if (!this.dataBuffer.contentEquals(other.dataBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.dataBuffer.contentHashCode()
    }
}

public data class FltTagDataBuffer01(
    public var substituteNameOffset: UShort = 0u,
    public var substituteNameLength: UShort = 0u,
    public var printNameOffset: UShort = 0u,
    public var printNameLength: UShort = 0u,
    public var pathBuffer: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltTagDataBuffer01) return false
        if (this.substituteNameOffset != other.substituteNameOffset) return false
        if (this.substituteNameLength != other.substituteNameLength) return false
        if (this.printNameOffset != other.printNameOffset) return false
        if (this.printNameLength != other.printNameLength) return false
        if (!this.pathBuffer.contentEquals(other.pathBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.substituteNameOffset.hashCode()
        result = 31 * result + this.substituteNameLength.hashCode()
        result = 31 * result + this.printNameOffset.hashCode()
        result = 31 * result + this.printNameLength.hashCode()
        result = 31 * result + this.pathBuffer.contentHashCode()
        return result
    }
}

public data class FltTagDataBuffer00(
    public var substituteNameOffset: UShort = 0u,
    public var substituteNameLength: UShort = 0u,
    public var printNameOffset: UShort = 0u,
    public var printNameLength: UShort = 0u,
    public var flags: UInt = 0u,
    public var pathBuffer: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltTagDataBuffer00) return false
        if (this.substituteNameOffset != other.substituteNameOffset) return false
        if (this.substituteNameLength != other.substituteNameLength) return false
        if (this.printNameOffset != other.printNameOffset) return false
        if (this.printNameLength != other.printNameLength) return false
        if (this.flags != other.flags) return false
        if (!this.pathBuffer.contentEquals(other.pathBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.substituteNameOffset.hashCode()
        result = 31 * result + this.substituteNameLength.hashCode()
        result = 31 * result + this.printNameOffset.hashCode()
        result = 31 * result + this.printNameLength.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.pathBuffer.contentHashCode()
        return result
    }
}

public data class FltVolumeProperties(
    public var deviceType: UInt = 0u,
    public var deviceCharacteristics: UInt = 0u,
    public var deviceObjectFlags: UInt = 0u,
    public var alignmentRequirement: UInt = 0u,
    public var sectorSize: UShort = 0u,
    public var flags: UShort = 0u,
    public var fileSystemDriverName: UnicodeString = UnicodeString(),
    public var fileSystemDeviceName: UnicodeString = UnicodeString(),
    public var realDeviceName: UnicodeString = UnicodeString(),
)
