@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.wdk.foundation

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FileGetQuotaInformation
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FileInformationClass
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FsInformationClass
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.BusQueryIdType
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.CmResourceList
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.DeviceCapabilities
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.DeviceRelationType
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.DeviceTextType
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.DeviceUsageNotificationType
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.DirectoryNotifyInformationClass
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.InitialPrivilegeSet
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.Interface
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.IoResourceRequirementsList
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.Kapc
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.KdeviceQueueEntry
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.MailslotCreateParameters
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.NamedPipeCreateParameters
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.PowerSequence
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.PowerState
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.PowerStateType
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.SystemPowerStateContext
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.WaitContextBlock
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.foundation.ObjectAttributeFlags
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString
import io.github.kotlinmania.windowssys.windows.win32.security.PrivilegeSet
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityImpersonationLevel
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityQualityOfService
import io.github.kotlinmania.windowssys.windows.win32.system.io.IoStatusBlock
import io.github.kotlinmania.windowssys.windows.win32.system.io.PioApcRoutine
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.ListEntry
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.SingleListEntry
import io.github.kotlinmania.windowssys.windows.win32.system.power.PowerAction
import io.github.kotlinmania.windowssys.windows.win32.system.power.SystemPowerState

public data class AccessState(
    public var operationID: Luid = Luid(),
    public var securityEvaluated: Boolean = false,
    public var generateAudit: Boolean = false,
    public var generateOnClose: Boolean = false,
    public var privilegesAllocated: Boolean = false,
    public var flags: UInt = 0u,
    public var remainingDesiredAccess: UInt = 0u,
    public var previouslyGrantedAccess: UInt = 0u,
    public var originalDesiredAccess: UInt = 0u,
    public var subjectSecurityContext: SecuritySubjectContext = SecuritySubjectContext(),
    public var securityDescriptor: PsecurityDescriptor = null,
    public var auxData: COpaquePointer? = null,
    public var privileges: AccessState0 = AccessState0(),
    public var auditPrivileges: Boolean = false,
    public var objectName: UnicodeString = UnicodeString(),
    public var objectTypeName: UnicodeString = UnicodeString(),
)

public data class AccessState0(public var initialPrivilegeSet: InitialPrivilegeSet = InitialPrivilegeSet(), public var privilegeSet: PrivilegeSet = PrivilegeSet())

public class DeviceObject(
    public var type: Short = 0,
    public var size: UShort = 0u,
    public var referenceCount: Int = 0,
    public var driverObject: DriverObject? = null,
    public var nextDevice: DeviceObject? = null,
    public var attachedDevice: DeviceObject? = null,
    public var currentIrp: Irp? = null,
    public var timer: PioTimer = 0,
    public var flags: UInt = 0u,
    public var characteristics: UInt = 0u,
    public var vpb: Vpb? = null,
    public var deviceExtension: COpaquePointer? = null,
    public var deviceType: UInt = 0u,
    public var stackSize: Byte = 0,
    public var queue: DeviceObject0 = DeviceObject0(),
    public var alignmentRequirement: UInt = 0u,
    public var deviceQueue: KdeviceQueue = KdeviceQueue(),
    public var dpc: Kdpc = Kdpc(),
    public var activeThreadCount: UInt = 0u,
    public var securityDescriptor: PsecurityDescriptor = null,
    public var deviceLock: Kevent = Kevent(),
    public var sectorSize: UShort = 0u,
    public var spare1: UShort = 0u,
    public var deviceObjectExtension: DevobjExtension? = null,
    public var reserved: COpaquePointer? = null,
)

public data class DeviceObject0(public var listEntry: ListEntry = ListEntry(), public var wcb: WaitContextBlock = WaitContextBlock())

public data class DevobjExtension(
    public var type: Short = 0,
    public var size: UShort = 0u,
    public var deviceObject: DeviceObject? = null,
    public var powerFlags: UInt = 0u,
    public var dope: Int? = null,
    public var extensionFlags: UInt = 0u,
    public var deviceNode: COpaquePointer? = null,
    public var attachedTo: DeviceObject? = null,
    public var startIoCount: Int = 0,
    public var startIoKey: Int = 0,
    public var startIoFlags: UInt = 0u,
    public var vpb: Vpb? = null,
    public var dependencyNode: COpaquePointer? = null,
    public var interruptContext: COpaquePointer? = null,
    public var interruptCount: Int = 0,
    public var verifierContext: COpaquePointer? = null,
)

public data class DispatcherHeader(
    public var anonymous: DispatcherHeader0 = DispatcherHeader0(),
    public var signalState: Int = 0,
    public var waitListHead: ListEntry = ListEntry(),
)

public data class DispatcherHeader0(
    public var anonymous1: DispatcherHeader00 = DispatcherHeader00(),
    public var anonymous2: DispatcherHeader01 = DispatcherHeader01(),
    public var anonymous3: DispatcherHeader02 = DispatcherHeader02(),
    public var anonymous4: DispatcherHeader03 = DispatcherHeader03(),
    public var anonymous5: DispatcherHeader04 = DispatcherHeader04(),
    public var anonymous6: DispatcherHeader05 = DispatcherHeader05(),
    public var anonymous7: DispatcherHeader06 = DispatcherHeader06(),
)

public data class DispatcherHeader00(public var lock: Int = 0, public var lockNV: Int = 0)

public data class DispatcherHeader01(
    public var type: UByte = 0u,
    public var signalling: UByte = 0u,
    public var size: UByte = 0u,
    public var reserved1: UByte = 0u,
)

public data class DispatcherHeader02(
    public var timerType: UByte = 0u,
    public var anonymous1: DispatcherHeader020 = DispatcherHeader020(),
    public var hand: UByte = 0u,
    public var anonymous2: DispatcherHeader021 = DispatcherHeader021(),
)

public data class DispatcherHeader020(public var timerControlFlags: UByte = 0u, public var anonymous: DispatcherHeader0200 = DispatcherHeader0200())

public data class DispatcherHeader0200(public var bitfield: UByte = 0u)

public data class DispatcherHeader021(public var timerMiscFlags: UByte = 0u, public var anonymous: DispatcherHeader0210 = DispatcherHeader0210())

public data class DispatcherHeader0210(public var bitfield: UByte = 0u)

public data class DispatcherHeader03(
    public var timer2Type: UByte = 0u,
    public var anonymous: DispatcherHeader030 = DispatcherHeader030(),
    public var timer2ComponentId: UByte = 0u,
    public var timer2RelativeId: UByte = 0u,
)

public data class DispatcherHeader030(public var timer2Flags: UByte = 0u, public var anonymous: DispatcherHeader0300 = DispatcherHeader0300())

public data class DispatcherHeader0300(public var bitfield: UByte = 0u)

public data class DispatcherHeader04(
    public var queueType: UByte = 0u,
    public var anonymous: DispatcherHeader040 = DispatcherHeader040(),
    public var queueSize: UByte = 0u,
    public var queueReserved: UByte = 0u,
)

public data class DispatcherHeader040(public var queueControlFlags: UByte = 0u, public var anonymous: DispatcherHeader0400 = DispatcherHeader0400())

public data class DispatcherHeader0400(public var bitfield: UByte = 0u)

public data class DispatcherHeader05(
    public var threadType: UByte = 0u,
    public var threadReserved: UByte = 0u,
    public var anonymous1: DispatcherHeader050 = DispatcherHeader050(),
    public var anonymous2: DispatcherHeader051 = DispatcherHeader051(),
)

public data class DispatcherHeader050(public var threadControlFlags: UByte = 0u, public var anonymous: DispatcherHeader0500 = DispatcherHeader0500())

public data class DispatcherHeader0500(public var bitfield: UByte = 0u)

public data class DispatcherHeader051(public var debugActive: UByte = 0u)

public data class DispatcherHeader06(
    public var mutantType: UByte = 0u,
    public var mutantSize: UByte = 0u,
    public var dpcActive: Boolean = false,
    public var mutantReserved: UByte = 0u,
)

public data class DriverExtension(
    public var driverObject: DriverObject? = null,
    public var addDevice: DriverAddDevice = null,
    public var count: UInt = 0u,
    public var serviceKeyName: UnicodeString = UnicodeString(),
)

public data class DriverObject(
    public var type: Short = 0,
    public var size: Short = 0,
    public var deviceObject: DeviceObject? = null,
    public var flags: UInt = 0u,
    public var driverStart: COpaquePointer? = null,
    public var driverSize: UInt = 0u,
    public var driverSection: COpaquePointer? = null,
    public var driverExtension: DriverExtension? = null,
    public var driverName: UnicodeString = UnicodeString(),
    public var hardwareDatabase: UnicodeString? = null,
    public var fastIoDispatch: FastIoDispatch? = null,
    public var driverInit: DriverInitialize = null,
    public var driverStartIo: DriverStartio = null,
    public var driverUnload: DriverUnload = null,
    public var majorFunction: List<DriverDispatch> = List(28) { null },
)

public data class Eresource(
    public var systemResourcesList: ListEntry = ListEntry(),
    public var ownerTable: OwnerEntry? = null,
    public var activeCount: Short = 0,
    public var anonymous1: Eresource0 = Eresource0(),
    public var sharedWaiters: COpaquePointer? = null,
    public var exclusiveWaiters: COpaquePointer? = null,
    public var ownerEntry: OwnerEntry = OwnerEntry(),
    public var activeEntries: UInt = 0u,
    public var contentionCount: UInt = 0u,
    public var numberOfSharedWaiters: UInt = 0u,
    public var numberOfExclusiveWaiters: UInt = 0u,
    public var anonymous2: Eresource1 = Eresource1(),
    public var spinLock: Int = 0,
)

public data class Eresource0(public var flag: UShort = 0u, public var anonymous: Eresource00 = Eresource00())

public data class Eresource00(public var reservedLowFlags: UByte = 0u, public var waiterPriority: UByte = 0u)

public data class Eresource1(public var address: COpaquePointer? = null, public var creatorBackTraceIndex: Int = 0)

public class FastIoDispatch(
    public var sizeOfFastIoDispatch: UInt = 0u,
    public var fastIoCheckIfPossible: FastIoCheckIfPossible = null,
    public var fastIoRead: FastIoRead = null,
    public var fastIoWrite: FastIoWrite = null,
    public var fastIoQueryBasicInfo: FastIoQueryBasicInfo = null,
    public var fastIoQueryStandardInfo: FastIoQueryStandardInfo = null,
    public var fastIoLock: FastIoLock = null,
    public var fastIoUnlockSingle: FastIoUnlockSingle = null,
    public var fastIoUnlockAll: FastIoUnlockAll = null,
    public var fastIoUnlockAllByKey: FastIoUnlockAllByKey = null,
    public var fastIoDeviceControl: FastIoDeviceControl = null,
    public var acquireFileForNtCreateSection: FastIoAcquireFile = null,
    public var releaseFileForNtCreateSection: FastIoReleaseFile = null,
    public var fastIoDetachDevice: FastIoDetachDevice = null,
    public var fastIoQueryNetworkOpenInfo: FastIoQueryNetworkOpenInfo = null,
    public var acquireForModWrite: FastIoAcquireForModWrite = null,
    public var mdlRead: FastIoMdlRead = null,
    public var mdlReadComplete: FastIoMdlReadComplete = null,
    public var prepareMdlWrite: FastIoPrepareMdlWrite = null,
    public var mdlWriteComplete: FastIoMdlWriteComplete = null,
    public var fastIoReadCompressed: FastIoReadCompressed = null,
    public var fastIoWriteCompressed: FastIoWriteCompressed = null,
    public var mdlReadCompleteCompressed: FastIoMdlReadCompleteCompressed = null,
    public var mdlWriteCompleteCompressed: FastIoMdlWriteCompleteCompressed = null,
    public var fastIoQueryOpen: FastIoQueryOpen = null,
    public var releaseForModWrite: FastIoReleaseForModWrite = null,
    public var acquireForCcFlush: FastIoAcquireForCcflush = null,
    public var releaseForCcFlush: FastIoReleaseForCcflush = null,
)

public data class FastMutex(
    public var count: Int = 0,
    public var owner: COpaquePointer? = null,
    public var contention: UInt = 0u,
    public var event: Kevent = Kevent(),
    public var oldIrql: UInt = 0u,
)

public class FileObject(
    public var type: Short = 0,
    public var size: Short = 0,
    public var deviceObject: DeviceObject? = null,
    public var vpb: Vpb? = null,
    public var fsContext: COpaquePointer? = null,
    public var fsContext2: COpaquePointer? = null,
    public var sectionObjectPointer: SectionObjectPointers? = null,
    public var privateCacheMap: COpaquePointer? = null,
    public var finalStatus: Ntstatus = 0,
    public var relatedFileObject: FileObject? = null,
    public var lockOperation: Boolean = false,
    public var deletePending: Boolean = false,
    public var readAccess: Boolean = false,
    public var writeAccess: Boolean = false,
    public var deleteAccess: Boolean = false,
    public var sharedRead: Boolean = false,
    public var sharedWrite: Boolean = false,
    public var sharedDelete: Boolean = false,
    public var flags: UInt = 0u,
    public var fileName: UnicodeString = UnicodeString(),
    public var currentByteOffset: Long = 0L,
    public var waiters: UInt = 0u,
    public var busy: UInt = 0u,
    public var lastLock: COpaquePointer? = null,
    public var lock: Kevent = Kevent(),
    public var event: Kevent = Kevent(),
    public var completionContext: IoCompletionContext? = null,
    public var irpListLock: Int = 0,
    public var irpList: ListEntry = ListEntry(),
    public var fileObjectExtension: COpaquePointer? = null,
)

public data class IoCompletionContext(
    public var port: COpaquePointer? = null,
    public var key: COpaquePointer? = null,
    public var usageCount: Int = 0,
)

public data class IoSecurityContext(
    public var securityQos: SecurityQualityOfService? = null,
    public var accessState: AccessState? = null,
    public var desiredAccess: UInt = 0u,
    public var fullCreateOptions: UInt = 0u,
)

public data class IoStackLocation(
    public var majorFunction: UByte = 0u,
    public var minorFunction: UByte = 0u,
    public var flags: UByte = 0u,
    public var control: UByte = 0u,
    public var parameters: IoStackLocation0 = IoStackLocation0(),
    public var deviceObject: DeviceObject? = null,
    public var fileObject: FileObject? = null,
    public var completionRoutine: PioCompletionRoutine = null,
    public var context: COpaquePointer? = null,
)

public class IoStackLocation0(
    public var create: IoStackLocation00 = IoStackLocation00(),
    public var createPipe: IoStackLocation01 = IoStackLocation01(),
    public var createMailslot: IoStackLocation02 = IoStackLocation02(),
    public var read: IoStackLocation03 = IoStackLocation03(),
    public var write: IoStackLocation04 = IoStackLocation04(),
    public var queryDirectory: IoStackLocation05 = IoStackLocation05(),
    public var notifyDirectory: IoStackLocation06 = IoStackLocation06(),
    public var notifyDirectoryEx: IoStackLocation07 = IoStackLocation07(),
    public var queryFile: IoStackLocation08 = IoStackLocation08(),
    public var setFile: IoStackLocation09 = IoStackLocation09(),
    public var queryEa: IoStackLocation010 = IoStackLocation010(),
    public var setEa: IoStackLocation011 = IoStackLocation011(),
    public var queryVolume: IoStackLocation012 = IoStackLocation012(),
    public var setVolume: IoStackLocation013 = IoStackLocation013(),
    public var fileSystemControl: IoStackLocation014 = IoStackLocation014(),
    public var lockControl: IoStackLocation015 = IoStackLocation015(),
    public var deviceIoControl: IoStackLocation016 = IoStackLocation016(),
    public var querySecurity: IoStackLocation017 = IoStackLocation017(),
    public var setSecurity: IoStackLocation018 = IoStackLocation018(),
    public var mountVolume: IoStackLocation019 = IoStackLocation019(),
    public var verifyVolume: IoStackLocation020 = IoStackLocation020(),
    public var scsi: IoStackLocation021 = IoStackLocation021(),
    public var queryQuota: IoStackLocation022 = IoStackLocation022(),
    public var setQuota: IoStackLocation023 = IoStackLocation023(),
    public var queryDeviceRelations: IoStackLocation024 = IoStackLocation024(),
    public var queryInterface: IoStackLocation025 = IoStackLocation025(),
    public var deviceCapabilities: IoStackLocation026 = IoStackLocation026(),
    public var filterResourceRequirements: IoStackLocation027 = IoStackLocation027(),
    public var readWriteConfig: IoStackLocation028 = IoStackLocation028(),
    public var setLock: IoStackLocation029 = IoStackLocation029(),
    public var queryId: IoStackLocation030 = IoStackLocation030(),
    public var queryDeviceText: IoStackLocation031 = IoStackLocation031(),
    public var usageNotification: IoStackLocation032 = IoStackLocation032(),
    public var waitWake: IoStackLocation033 = IoStackLocation033(),
    public var powerSequence: IoStackLocation034 = IoStackLocation034(),
    public var power: IoStackLocation035 = IoStackLocation035(),
    public var startDevice: IoStackLocation036 = IoStackLocation036(),
    public var wmi: IoStackLocation037 = IoStackLocation037(),
    public var others: IoStackLocation038 = IoStackLocation038(),
)

public data class IoStackLocation02(
    public var securityContext: IoSecurityContext? = null,
    public var options: UInt = 0u,
    public var reserved: UShort = 0u,
    public var shareAccess: UShort = 0u,
    public var parameters: MailslotCreateParameters? = null,
)

public data class IoStackLocation01(
    public var securityContext: IoSecurityContext? = null,
    public var options: UInt = 0u,
    public var reserved: UShort = 0u,
    public var shareAccess: UShort = 0u,
    public var parameters: NamedPipeCreateParameters? = null,
)

public data class IoStackLocation00(
    public var securityContext: IoSecurityContext? = null,
    public var options: UInt = 0u,
    public var fileAttributes: UShort = 0u,
    public var shareAccess: UShort = 0u,
    public var eaLength: UInt = 0u,
)

public data class IoStackLocation026(public var capabilities: DeviceCapabilities? = null)

public data class IoStackLocation016(
    public var outputBufferLength: UInt = 0u,
    public var inputBufferLength: UInt = 0u,
    public var ioControlCode: UInt = 0u,
    public var type3InputBuffer: COpaquePointer? = null,
)

public data class IoStackLocation014(
    public var outputBufferLength: UInt = 0u,
    public var inputBufferLength: UInt = 0u,
    public var fsControlCode: UInt = 0u,
    public var type3InputBuffer: COpaquePointer? = null,
)

public data class IoStackLocation027(public var ioResourceRequirementList: IoResourceRequirementsList? = null)

public data class IoStackLocation015(
    public var length: Long? = null,
    public var key: UInt = 0u,
    public var byteOffset: Long = 0L,
)

public data class IoStackLocation019(public var vpb: Vpb? = null, public var deviceObject: DeviceObject? = null)

public data class IoStackLocation07(
    public var length: UInt = 0u,
    public var completionFilter: UInt = 0u,
    public var directoryNotifyInformationClass: DirectoryNotifyInformationClass = 0,
)

public data class IoStackLocation06(public var length: UInt = 0u, public var completionFilter: UInt = 0u)

public data class IoStackLocation038(
    public var argument1: COpaquePointer? = null,
    public var argument2: COpaquePointer? = null,
    public var argument3: COpaquePointer? = null,
    public var argument4: COpaquePointer? = null,
)

public data class IoStackLocation034(public var powerSequence: PowerSequence? = null)

public data class IoStackLocation035(
    public var anonymous: IoStackLocation0350 = IoStackLocation0350(),
    public var type: PowerStateType = 0,
    public var state: PowerState = PowerState(),
    public var shutdownType: PowerAction = 0,
)

public data class IoStackLocation0350(public var systemContext: UInt = 0u, public var systemPowerStateContext: SystemPowerStateContext = SystemPowerStateContext())

public data class IoStackLocation024(public var type: DeviceRelationType = 0)

public data class IoStackLocation031(public var deviceTextType: DeviceTextType = 0, public var localeId: UInt = 0u)

public data class IoStackLocation05(
    public var length: UInt = 0u,
    public var fileName: UnicodeString? = null,
    public var fileInformationClass: FileInformationClass = 0,
    public var fileIndex: UInt = 0u,
)

public data class IoStackLocation010(
    public var length: UInt = 0u,
    public var eaList: COpaquePointer? = null,
    public var eaListLength: UInt = 0u,
    public var eaIndex: UInt = 0u,
)

public data class IoStackLocation08(public var length: UInt = 0u, public var fileInformationClass: FileInformationClass = 0)

public data class IoStackLocation030(public var idType: BusQueryIdType = 0)

public data class IoStackLocation025(
    public var interfaceType: Guid? = null,
    public var size: UShort = 0u,
    public var version: UShort = 0u,
    public var iface: Interface? = null,
    public var interfaceSpecificData: COpaquePointer? = null,
)

public data class IoStackLocation022(
    public var length: UInt = 0u,
    public var startSid: Psid = null,
    public var sidList: FileGetQuotaInformation? = null,
    public var sidListLength: UInt = 0u,
)

public data class IoStackLocation017(public var securityInformation: UInt = 0u, public var length: UInt = 0u)

public data class IoStackLocation012(public var length: UInt = 0u, public var fsInformationClass: FsInformationClass = 0)

public data class IoStackLocation028(
    public var whichSpace: UInt = 0u,
    public var buffer: COpaquePointer? = null,
    public var offset: UInt = 0u,
    public var length: UInt = 0u,
)

public data class IoStackLocation03(
    public var length: UInt = 0u,
    public var key: UInt = 0u,
    public var byteOffset: Long = 0L,
)

public data class IoStackLocation021(public var srb: Int? = null)

public data class IoStackLocation011(public var length: UInt = 0u)

public data class IoStackLocation09(
    public var length: UInt = 0u,
    public var fileInformationClass: FileInformationClass = 0,
    public var fileObject: FileObject? = null,
    public var anonymous: IoStackLocation090 = IoStackLocation090(),
)

public data class IoStackLocation090(
    public var anonymous: IoStackLocation0900 = IoStackLocation0900(),
    public var clusterCount: UInt = 0u,
    public var deleteHandle: Handle = null,
)

public data class IoStackLocation0900(public var replaceIfExists: Boolean = false, public var advanceOnly: Boolean = false)

public data class IoStackLocation029(public var lock: Boolean = false)

public data class IoStackLocation023(public var length: UInt = 0u)

public data class IoStackLocation018(public var securityInformation: UInt = 0u, public var securityDescriptor: PsecurityDescriptor = null)

public data class IoStackLocation013(public var length: UInt = 0u, public var fsInformationClass: FsInformationClass = 0)

public data class IoStackLocation036(public var allocatedResources: CmResourceList? = null, public var allocatedResourcesTranslated: CmResourceList? = null)

public data class IoStackLocation032(
    public var inPath: Boolean = false,
    public var reserved: BooleanArray = BooleanArray(3),
    public var type: DeviceUsageNotificationType = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoStackLocation032) return false
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

public data class IoStackLocation020(public var vpb: Vpb? = null, public var deviceObject: DeviceObject? = null)

public data class IoStackLocation037(
    public var providerId: Int = 0,
    public var dataPath: COpaquePointer? = null,
    public var bufferSize: UInt = 0u,
    public var buffer: COpaquePointer? = null,
)

public data class IoStackLocation033(public var powerState: SystemPowerState = 0)

public data class IoStackLocation04(
    public var length: UInt = 0u,
    public var key: UInt = 0u,
    public var byteOffset: Long = 0L,
)

public class Irp(
    public var type: Short = 0,
    public var size: UShort = 0u,
    public var mdlAddress: Mdl? = null,
    public var flags: UInt = 0u,
    public var associatedIrp: Irp0 = Irp0(),
    public var threadListEntry: ListEntry = ListEntry(),
    public var ioStatus: IoStatusBlock = IoStatusBlock(),
    public var requestorMode: Byte = 0,
    public var pendingReturned: Boolean = false,
    public var stackCount: Byte = 0,
    public var currentLocation: Byte = 0,
    public var cancel: Boolean = false,
    public var cancelIrql: UByte = 0u,
    public var apcEnvironment: Byte = 0,
    public var allocationFlags: UByte = 0u,
    public var anonymous: Irp1 = Irp1(),
    public var userEvent: Kevent? = null,
    public var overlay: Irp2 = Irp2(),
    public var cancelRoutine: DriverCancel = null,
    public var userBuffer: COpaquePointer? = null,
    public var tail: Irp3 = Irp3(),
)

public data class Irp1(public var userIosb: IoStatusBlock? = null, public var ioRingContext: COpaquePointer? = null)

public data class Irp0(
    public var masterIrp: Irp? = null,
    public var irpCount: Int = 0,
    public var systemBuffer: COpaquePointer? = null,
)

public data class Irp2(public var asynchronousParameters: Irp20 = Irp20(), public var allocationSize: Long = 0L)

public data class Irp20(public var anonymous1: Irp200 = Irp200(), public var anonymous2: Irp201 = Irp201())

public data class Irp200(public var userApcRoutine: PioApcRoutine = null, public var issuingProcess: COpaquePointer? = null)

public data class Irp201(public var userApcContext: COpaquePointer? = null, public var ioRing: Int? = null)

public data class Irp3(
    public var overlay: Irp30 = Irp30(),
    public var apc: Kapc = Kapc(),
    public var completionKey: COpaquePointer? = null,
)

public data class Irp30(
    public var anonymous1: Irp300 = Irp300(),
    public var thread: Pethread = 0L,
    public var auxiliaryBuffer: Pstr = null,
    public var anonymous2: Irp301 = Irp301(),
    public var originalFileObject: FileObject? = null,
)

public data class Irp300(public var deviceQueueEntry: KdeviceQueueEntry = KdeviceQueueEntry(), public var anonymous: Irp3000 = Irp3000())

public data class Irp3000(public var driverContext: List<COpaquePointer> = List(4) { COpaquePointer(0L) })

public data class Irp301(public var listEntry: ListEntry = ListEntry(), public var anonymous: Irp3010 = Irp3010())

public data class Irp3010(public var currentStackLocation: IoStackLocation? = null, public var packetType: UInt = 0u)

public data class KdeviceQueue(
    public var type: Short = 0,
    public var size: Short = 0,
    public var deviceListHead: ListEntry = ListEntry(),
    public var lock: Int = 0,
    public var busy: Boolean = false,
)

public data class Kdpc(
    public var anonymous: Kdpc0 = Kdpc0(),
    public var dpcListEntry: SingleListEntry = SingleListEntry(),
    public var processorHistory: Int = 0,
    public var deferredRoutine: PkdeferredRoutine = null,
    public var deferredContext: COpaquePointer? = null,
    public var systemArgument1: COpaquePointer? = null,
    public var systemArgument2: COpaquePointer? = null,
    public var dpcData: COpaquePointer? = null,
)

public data class Kdpc0(public var targetInfoAsUlong: UInt = 0u, public var anonymous: Kdpc00 = Kdpc00())

public data class Kdpc00(
    public var type: UByte = 0u,
    public var importance: UByte = 0u,
    public var number: UShort = 0u,
)

public data class Kevent(public var header: DispatcherHeader = DispatcherHeader())

public data class Kmutant(
    public var header: DispatcherHeader = DispatcherHeader(),
    public var mutantListEntry: ListEntry = ListEntry(),
    public var ownerThread: Int? = null,
    public var anonymous: Kmutant0 = Kmutant0(),
    public var apcDisable: UByte = 0u,
)

public data class Kmutant0(public var mutantFlags: UByte = 0u, public var anonymous: Kmutant00 = Kmutant00())

public data class Kmutant00(public var bitfield: UByte = 0u)

public data class Kqueue(
    public var header: DispatcherHeader = DispatcherHeader(),
    public var entryListHead: ListEntry = ListEntry(),
    public var currentCount: UInt = 0u,
    public var maximumCount: UInt = 0u,
    public var threadListHead: ListEntry = ListEntry(),
)

public data class KwaitBlock(
    public var waitListEntry: ListEntry = ListEntry(),
    public var waitType: UByte = 0u,
    public var blockState: UByte = 0u,
    public var waitKey: UShort = 0u,
    public var anonymous: KwaitBlock0 = KwaitBlock0(),
    public var obj: COpaquePointer? = null,
    public var sparePtr: COpaquePointer? = null,
)

public data class KwaitBlock0(
    public var thread: Int? = null,
    public var notificationQueue: Kqueue? = null,
    public var dpc: Kdpc? = null,
)

public data class Mdl(
    public var next: Mdl? = null,
    public var size: Short = 0,
    public var mdlFlags: Short = 0,
    public var process: Int? = null,
    public var mappedSystemVa: COpaquePointer? = null,
    public var startVa: COpaquePointer? = null,
    public var byteCount: UInt = 0u,
    public var byteOffset: UInt = 0u,
)

public data class ObjectAttributes(
    public var length: UInt = 0u,
    public var rootDirectory: Handle = null,
    public var objectName: UnicodeString? = null,
    public var attributes: ObjectAttributeFlags = 0u,
    public var securityDescriptor: SecurityDescriptor? = null,
    public var securityQualityOfService: SecurityQualityOfService? = null,
)

public data class ObjectAttributes32(
    public var length: UInt = 0u,
    public var rootDirectory: UInt = 0u,
    public var objectName: UInt = 0u,
    public var attributes: ObjectAttributeFlags = 0u,
    public var securityDescriptor: SecurityDescriptor? = null,
    public var securityQualityOfService: SecurityQualityOfService? = null,
)

public data class ObjectAttributes64(
    public var length: UInt = 0u,
    public var rootDirectory: ULong = 0uL,
    public var objectName: ULong = 0uL,
    public var attributes: ObjectAttributeFlags = 0u,
    public var securityDescriptor: SecurityDescriptor? = null,
    public var securityQualityOfService: SecurityQualityOfService? = null,
)

public data class ObjectNameInformation(public var name: UnicodeString = UnicodeString())

public data class OwnerEntry(public var ownerThread: Int = 0, public var anonymous: OwnerEntry0 = OwnerEntry0())

public data class OwnerEntry0(public var anonymous: OwnerEntry00 = OwnerEntry00(), public var tableSize: UInt = 0u)

public data class OwnerEntry00(public var bitfield: UInt = 0u)

public data class RtlSplayLinks(
    public var parent: RtlSplayLinks? = null,
    public var leftChild: RtlSplayLinks? = null,
    public var rightChild: RtlSplayLinks? = null,
)

public data class SectionObjectPointers(
    public var dataSectionObject: COpaquePointer? = null,
    public var sharedCacheMap: COpaquePointer? = null,
    public var imageSectionObject: COpaquePointer? = null,
)

public data class SecuritySubjectContext(
    public var clientToken: COpaquePointer? = null,
    public var impersonationLevel: SecurityImpersonationLevel = 0,
    public var primaryToken: COpaquePointer? = null,
    public var processAuditId: COpaquePointer? = null,
)

public data class TargetDeviceCustomNotification(
    public var version: UShort = 0u,
    public var size: UShort = 0u,
    public var event: Guid = Guid(),
    public var fileObject: FileObject? = null,
    public var nameBufferOffset: Int = 0,
    public var customDataBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TargetDeviceCustomNotification) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.event != other.event) return false
        if (this.fileObject != other.fileObject) return false
        if (this.nameBufferOffset != other.nameBufferOffset) return false
        if (!this.customDataBuffer.contentEquals(other.customDataBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.event.hashCode()
        result = 31 * result + this.fileObject.hashCode()
        result = 31 * result + this.nameBufferOffset.hashCode()
        result = 31 * result + this.customDataBuffer.contentHashCode()
        return result
    }
}

public data class Vpb(
    public var type: Short = 0,
    public var size: Short = 0,
    public var flags: UShort = 0u,
    public var volumeLabelLength: UShort = 0u,
    public var deviceObject: DeviceObject? = null,
    public var realDevice: DeviceObject? = null,
    public var serialNumber: UInt = 0u,
    public var referenceCount: UInt = 0u,
    public var volumeLabel: UShortArray = UShortArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Vpb) return false
        if (this.type != other.type) return false
        if (this.size != other.size) return false
        if (this.flags != other.flags) return false
        if (this.volumeLabelLength != other.volumeLabelLength) return false
        if (this.deviceObject != other.deviceObject) return false
        if (this.realDevice != other.realDevice) return false
        if (this.serialNumber != other.serialNumber) return false
        if (this.referenceCount != other.referenceCount) return false
        if (!this.volumeLabel.contentEquals(other.volumeLabel)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.volumeLabelLength.hashCode()
        result = 31 * result + this.deviceObject.hashCode()
        result = 31 * result + this.realDevice.hashCode()
        result = 31 * result + this.serialNumber.hashCode()
        result = 31 * result + this.referenceCount.hashCode()
        result = 31 * result + this.volumeLabel.contentHashCode()
        return result
    }
}

public data class WorkQueueItem(
    public var list: ListEntry = ListEntry(),
    public var workerRoutine: PworkerThreadRoutine = null,
    public var parameter: COpaquePointer? = null,
)
