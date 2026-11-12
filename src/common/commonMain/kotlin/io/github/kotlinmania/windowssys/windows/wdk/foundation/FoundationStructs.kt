@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.foundation

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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

public class AccessState internal constructor(
    public var operationID: Luid,
    public var securityEvaluated: Boolean,
    public var generateAudit: Boolean,
    public var generateOnClose: Boolean,
    public var privilegesAllocated: Boolean,
    public var flags: UInt,
    public var remainingDesiredAccess: UInt,
    public var previouslyGrantedAccess: UInt,
    public var originalDesiredAccess: UInt,
    public var subjectSecurityContext: SecuritySubjectContext,
    securityDescriptorCtorArg: PsecurityDescriptor,
    auxDataCtorArg: MutPtr<CVoid>,
    public var privileges: AccessState0,
    public var auditPrivileges: Boolean,
    public var objectName: UnicodeString,
    public var objectTypeName: UnicodeString,
) {
    public var securityDescriptor: PsecurityDescriptor = securityDescriptorCtorArg
        internal set

    public var auxData: MutPtr<CVoid> = auxDataCtorArg
        internal set

    public constructor() : this(
        operationID = Luid(),
        securityEvaluated = false,
        generateAudit = false,
        generateOnClose = false,
        privilegesAllocated = false,
        flags = 0u,
        remainingDesiredAccess = 0u,
        previouslyGrantedAccess = 0u,
        originalDesiredAccess = 0u,
        subjectSecurityContext = SecuritySubjectContext(),
        securityDescriptorCtorArg = MutPtr(0L),
        auxDataCtorArg = MutPtr(0L),
        privileges = AccessState0(),
        auditPrivileges = false,
        objectName = UnicodeString(),
        objectTypeName = UnicodeString(),
    )

    public operator fun component1(): Luid = this.operationID

    public operator fun component2(): Boolean = this.securityEvaluated

    public operator fun component3(): Boolean = this.generateAudit

    public operator fun component4(): Boolean = this.generateOnClose

    public operator fun component5(): Boolean = this.privilegesAllocated

    public operator fun component6(): UInt = this.flags

    public operator fun component7(): UInt = this.remainingDesiredAccess

    public operator fun component8(): UInt = this.previouslyGrantedAccess

    public operator fun component9(): UInt = this.originalDesiredAccess

    public operator fun component10(): SecuritySubjectContext = this.subjectSecurityContext

    public operator fun component11(): PsecurityDescriptor = this.securityDescriptor

    public operator fun component12(): MutPtr<CVoid> = this.auxData

    public operator fun component13(): AccessState0 = this.privileges

    public operator fun component14(): Boolean = this.auditPrivileges

    public operator fun component15(): UnicodeString = this.objectName

    public operator fun component16(): UnicodeString = this.objectTypeName

    public fun copy(operationID: Luid = this.operationID, securityEvaluated: Boolean = this.securityEvaluated, generateAudit: Boolean = this.generateAudit, generateOnClose: Boolean = this.generateOnClose, privilegesAllocated: Boolean = this.privilegesAllocated, flags: UInt = this.flags, remainingDesiredAccess: UInt = this.remainingDesiredAccess, previouslyGrantedAccess: UInt = this.previouslyGrantedAccess, originalDesiredAccess: UInt = this.originalDesiredAccess, subjectSecurityContext: SecuritySubjectContext = this.subjectSecurityContext, securityDescriptor: PsecurityDescriptor = this.securityDescriptor, auxData: MutPtr<CVoid> = this.auxData, privileges: AccessState0 = this.privileges, auditPrivileges: Boolean = this.auditPrivileges, objectName: UnicodeString = this.objectName, objectTypeName: UnicodeString = this.objectTypeName): AccessState = AccessState(operationID = operationID, securityEvaluated = securityEvaluated, generateAudit = generateAudit, generateOnClose = generateOnClose, privilegesAllocated = privilegesAllocated, flags = flags, remainingDesiredAccess = remainingDesiredAccess, previouslyGrantedAccess = previouslyGrantedAccess, originalDesiredAccess = originalDesiredAccess, subjectSecurityContext = subjectSecurityContext, securityDescriptorCtorArg = securityDescriptor, auxDataCtorArg = auxData, privileges = privileges, auditPrivileges = auditPrivileges, objectName = objectName, objectTypeName = objectTypeName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AccessState) return false
        if (this.operationID != other.operationID) return false
        if (this.securityEvaluated != other.securityEvaluated) return false
        if (this.generateAudit != other.generateAudit) return false
        if (this.generateOnClose != other.generateOnClose) return false
        if (this.privilegesAllocated != other.privilegesAllocated) return false
        if (this.flags != other.flags) return false
        if (this.remainingDesiredAccess != other.remainingDesiredAccess) return false
        if (this.previouslyGrantedAccess != other.previouslyGrantedAccess) return false
        if (this.originalDesiredAccess != other.originalDesiredAccess) return false
        if (this.subjectSecurityContext != other.subjectSecurityContext) return false
        if (this.securityDescriptor != other.securityDescriptor) return false
        if (this.auxData != other.auxData) return false
        if (this.privileges != other.privileges) return false
        if (this.auditPrivileges != other.auditPrivileges) return false
        if (this.objectName != other.objectName) return false
        if (this.objectTypeName != other.objectTypeName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.operationID.hashCode()
        result = 31 * result + this.securityEvaluated.hashCode()
        result = 31 * result + this.generateAudit.hashCode()
        result = 31 * result + this.generateOnClose.hashCode()
        result = 31 * result + this.privilegesAllocated.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.remainingDesiredAccess.hashCode()
        result = 31 * result + this.previouslyGrantedAccess.hashCode()
        result = 31 * result + this.originalDesiredAccess.hashCode()
        result = 31 * result + this.subjectSecurityContext.hashCode()
        result = 31 * result + this.securityDescriptor.hashCode()
        result = 31 * result + this.auxData.hashCode()
        result = 31 * result + this.privileges.hashCode()
        result = 31 * result + this.auditPrivileges.hashCode()
        result = 31 * result + this.objectName.hashCode()
        result = 31 * result + this.objectTypeName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            operationID: Luid = Luid(),
            securityEvaluated: Boolean = false,
            generateAudit: Boolean = false,
            generateOnClose: Boolean = false,
            privilegesAllocated: Boolean = false,
            flags: UInt = 0u,
            remainingDesiredAccess: UInt = 0u,
            previouslyGrantedAccess: UInt = 0u,
            originalDesiredAccess: UInt = 0u,
            subjectSecurityContext: SecuritySubjectContext = SecuritySubjectContext(),
            securityDescriptor: PsecurityDescriptor = MutPtr(0L),
            auxData: MutPtr<CVoid> = MutPtr(0L),
            privileges: AccessState0 = AccessState0(),
            auditPrivileges: Boolean = false,
            objectName: UnicodeString = UnicodeString(),
            objectTypeName: UnicodeString = UnicodeString(),
        ): AccessState =
            AccessState(
                operationID = operationID,
                securityEvaluated = securityEvaluated,
                generateAudit = generateAudit,
                generateOnClose = generateOnClose,
                privilegesAllocated = privilegesAllocated,
                flags = flags,
                remainingDesiredAccess = remainingDesiredAccess,
                previouslyGrantedAccess = previouslyGrantedAccess,
                originalDesiredAccess = originalDesiredAccess,
                subjectSecurityContext = subjectSecurityContext,
                securityDescriptorCtorArg = securityDescriptor,
                auxDataCtorArg = auxData,
                privileges = privileges,
                auditPrivileges = auditPrivileges,
                objectName = objectName,
                objectTypeName = objectTypeName,
            )
    }
}

public data class AccessState0(
    public var initialPrivilegeSet: InitialPrivilegeSet = InitialPrivilegeSet(),
    public var privilegeSet: PrivilegeSet = PrivilegeSet(),
)

public class DeviceObject internal constructor(
    public var type: Short,
    public var size: UShort,
    public var referenceCount: Int,
    driverObjectCtorArg: MutPtr<DriverObject>,
    nextDeviceCtorArg: MutPtr<DeviceObject>,
    attachedDeviceCtorArg: MutPtr<DeviceObject>,
    currentIrpCtorArg: MutPtr<Irp>,
    public var timer: PioTimer,
    public var flags: UInt,
    public var characteristics: UInt,
    vpbCtorArg: MutPtr<Vpb>,
    deviceExtensionCtorArg: MutPtr<CVoid>,
    public var deviceType: UInt,
    public var stackSize: Byte,
    public var queue: DeviceObject0,
    public var alignmentRequirement: UInt,
    public var deviceQueue: KdeviceQueue,
    public var dpc: Kdpc,
    public var activeThreadCount: UInt,
    securityDescriptorCtorArg: PsecurityDescriptor,
    public var deviceLock: Kevent,
    public var sectorSize: UShort,
    public var spare1: UShort,
    deviceObjectExtensionCtorArg: MutPtr<DevobjExtension>,
    reservedCtorArg: MutPtr<CVoid>,
) {
    public var driverObject: MutPtr<DriverObject> = driverObjectCtorArg
        internal set

    public var nextDevice: MutPtr<DeviceObject> = nextDeviceCtorArg
        internal set

    public var attachedDevice: MutPtr<DeviceObject> = attachedDeviceCtorArg
        internal set

    public var currentIrp: MutPtr<Irp> = currentIrpCtorArg
        internal set

    public var vpb: MutPtr<Vpb> = vpbCtorArg
        internal set

    public var deviceExtension: MutPtr<CVoid> = deviceExtensionCtorArg
        internal set

    public var securityDescriptor: PsecurityDescriptor = securityDescriptorCtorArg
        internal set

    public var deviceObjectExtension: MutPtr<DevobjExtension> = deviceObjectExtensionCtorArg
        internal set

    public var reserved: MutPtr<CVoid> = reservedCtorArg
        internal set

    public constructor() : this(
        type = 0,
        size = 0u,
        referenceCount = 0,
        driverObjectCtorArg = MutPtr(0L),
        nextDeviceCtorArg = MutPtr(0L),
        attachedDeviceCtorArg = MutPtr(0L),
        currentIrpCtorArg = MutPtr(0L),
        timer = 0,
        flags = 0u,
        characteristics = 0u,
        vpbCtorArg = MutPtr(0L),
        deviceExtensionCtorArg = MutPtr(0L),
        deviceType = 0u,
        stackSize = 0,
        queue = DeviceObject0(),
        alignmentRequirement = 0u,
        deviceQueue = KdeviceQueue(),
        dpc = Kdpc(),
        activeThreadCount = 0u,
        securityDescriptorCtorArg = MutPtr(0L),
        deviceLock = Kevent(),
        sectorSize = 0u,
        spare1 = 0u,
        deviceObjectExtensionCtorArg = MutPtr(0L),
        reservedCtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            type: Short = 0,
            size: UShort = 0u,
            referenceCount: Int = 0,
            driverObject: MutPtr<DriverObject> = MutPtr(0L),
            nextDevice: MutPtr<DeviceObject> = MutPtr(0L),
            attachedDevice: MutPtr<DeviceObject> = MutPtr(0L),
            currentIrp: MutPtr<Irp> = MutPtr(0L),
            timer: PioTimer = 0,
            flags: UInt = 0u,
            characteristics: UInt = 0u,
            vpb: MutPtr<Vpb> = MutPtr(0L),
            deviceExtension: MutPtr<CVoid> = MutPtr(0L),
            deviceType: UInt = 0u,
            stackSize: Byte = 0,
            queue: DeviceObject0 = DeviceObject0(),
            alignmentRequirement: UInt = 0u,
            deviceQueue: KdeviceQueue = KdeviceQueue(),
            dpc: Kdpc = Kdpc(),
            activeThreadCount: UInt = 0u,
            securityDescriptor: PsecurityDescriptor = MutPtr(0L),
            deviceLock: Kevent = Kevent(),
            sectorSize: UShort = 0u,
            spare1: UShort = 0u,
            deviceObjectExtension: MutPtr<DevobjExtension> = MutPtr(0L),
            reserved: MutPtr<CVoid> = MutPtr(0L),
        ): DeviceObject =
            DeviceObject(
                type = type,
                size = size,
                referenceCount = referenceCount,
                driverObjectCtorArg = driverObject,
                nextDeviceCtorArg = nextDevice,
                attachedDeviceCtorArg = attachedDevice,
                currentIrpCtorArg = currentIrp,
                timer = timer,
                flags = flags,
                characteristics = characteristics,
                vpbCtorArg = vpb,
                deviceExtensionCtorArg = deviceExtension,
                deviceType = deviceType,
                stackSize = stackSize,
                queue = queue,
                alignmentRequirement = alignmentRequirement,
                deviceQueue = deviceQueue,
                dpc = dpc,
                activeThreadCount = activeThreadCount,
                securityDescriptorCtorArg = securityDescriptor,
                deviceLock = deviceLock,
                sectorSize = sectorSize,
                spare1 = spare1,
                deviceObjectExtensionCtorArg = deviceObjectExtension,
                reservedCtorArg = reserved,
            )
    }
}

public data class DeviceObject0(
    public var listEntry: ListEntry = ListEntry(),
    public var wcb: WaitContextBlock = WaitContextBlock(),
)

public class DevobjExtension internal constructor(
    public var type: Short,
    public var size: UShort,
    deviceObjectCtorArg: MutPtr<DeviceObject>,
    public var powerFlags: UInt,
    dopeCtorArg: MutPtr<DeviceObjectPowerExtension>,
    public var extensionFlags: UInt,
    deviceNodeCtorArg: MutPtr<CVoid>,
    attachedToCtorArg: MutPtr<DeviceObject>,
    public var startIoCount: Int,
    public var startIoKey: Int,
    public var startIoFlags: UInt,
    vpbCtorArg: MutPtr<Vpb>,
    dependencyNodeCtorArg: MutPtr<CVoid>,
    interruptContextCtorArg: MutPtr<CVoid>,
    public var interruptCount: Int,
    verifierContextCtorArg: MutPtr<CVoid>,
) {
    public var deviceObject: MutPtr<DeviceObject> = deviceObjectCtorArg
        internal set

    public var dope: MutPtr<DeviceObjectPowerExtension> = dopeCtorArg
        internal set

    public var deviceNode: MutPtr<CVoid> = deviceNodeCtorArg
        internal set

    public var attachedTo: MutPtr<DeviceObject> = attachedToCtorArg
        internal set

    public var vpb: MutPtr<Vpb> = vpbCtorArg
        internal set

    public var dependencyNode: MutPtr<CVoid> = dependencyNodeCtorArg
        internal set

    public var interruptContext: MutPtr<CVoid> = interruptContextCtorArg
        internal set

    public var verifierContext: MutPtr<CVoid> = verifierContextCtorArg
        internal set

    public constructor() : this(
        type = 0,
        size = 0u,
        deviceObjectCtorArg = MutPtr(0L),
        powerFlags = 0u,
        dopeCtorArg = MutPtr(0L),
        extensionFlags = 0u,
        deviceNodeCtorArg = MutPtr(0L),
        attachedToCtorArg = MutPtr(0L),
        startIoCount = 0,
        startIoKey = 0,
        startIoFlags = 0u,
        vpbCtorArg = MutPtr(0L),
        dependencyNodeCtorArg = MutPtr(0L),
        interruptContextCtorArg = MutPtr(0L),
        interruptCount = 0,
        verifierContextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Short = this.type

    public operator fun component2(): UShort = this.size

    public operator fun component3(): MutPtr<DeviceObject> = this.deviceObject

    public operator fun component4(): UInt = this.powerFlags

    public operator fun component5(): MutPtr<DeviceObjectPowerExtension> = this.dope

    public operator fun component6(): UInt = this.extensionFlags

    public operator fun component7(): MutPtr<CVoid> = this.deviceNode

    public operator fun component8(): MutPtr<DeviceObject> = this.attachedTo

    public operator fun component9(): Int = this.startIoCount

    public operator fun component10(): Int = this.startIoKey

    public operator fun component11(): UInt = this.startIoFlags

    public operator fun component12(): MutPtr<Vpb> = this.vpb

    public operator fun component13(): MutPtr<CVoid> = this.dependencyNode

    public operator fun component14(): MutPtr<CVoid> = this.interruptContext

    public operator fun component15(): Int = this.interruptCount

    public operator fun component16(): MutPtr<CVoid> = this.verifierContext

    public fun copy(type: Short = this.type, size: UShort = this.size, deviceObject: MutPtr<DeviceObject> = this.deviceObject, powerFlags: UInt = this.powerFlags, dope: MutPtr<DeviceObjectPowerExtension> = this.dope, extensionFlags: UInt = this.extensionFlags, deviceNode: MutPtr<CVoid> = this.deviceNode, attachedTo: MutPtr<DeviceObject> = this.attachedTo, startIoCount: Int = this.startIoCount, startIoKey: Int = this.startIoKey, startIoFlags: UInt = this.startIoFlags, vpb: MutPtr<Vpb> = this.vpb, dependencyNode: MutPtr<CVoid> = this.dependencyNode, interruptContext: MutPtr<CVoid> = this.interruptContext, interruptCount: Int = this.interruptCount, verifierContext: MutPtr<CVoid> = this.verifierContext): DevobjExtension = DevobjExtension(type = type, size = size, deviceObjectCtorArg = deviceObject, powerFlags = powerFlags, dopeCtorArg = dope, extensionFlags = extensionFlags, deviceNodeCtorArg = deviceNode, attachedToCtorArg = attachedTo, startIoCount = startIoCount, startIoKey = startIoKey, startIoFlags = startIoFlags, vpbCtorArg = vpb, dependencyNodeCtorArg = dependencyNode, interruptContextCtorArg = interruptContext, interruptCount = interruptCount, verifierContextCtorArg = verifierContext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DevobjExtension) return false
        if (this.type != other.type) return false
        if (this.size != other.size) return false
        if (this.deviceObject != other.deviceObject) return false
        if (this.powerFlags != other.powerFlags) return false
        if (this.dope != other.dope) return false
        if (this.extensionFlags != other.extensionFlags) return false
        if (this.deviceNode != other.deviceNode) return false
        if (this.attachedTo != other.attachedTo) return false
        if (this.startIoCount != other.startIoCount) return false
        if (this.startIoKey != other.startIoKey) return false
        if (this.startIoFlags != other.startIoFlags) return false
        if (this.vpb != other.vpb) return false
        if (this.dependencyNode != other.dependencyNode) return false
        if (this.interruptContext != other.interruptContext) return false
        if (this.interruptCount != other.interruptCount) return false
        if (this.verifierContext != other.verifierContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.deviceObject.hashCode()
        result = 31 * result + this.powerFlags.hashCode()
        result = 31 * result + this.dope.hashCode()
        result = 31 * result + this.extensionFlags.hashCode()
        result = 31 * result + this.deviceNode.hashCode()
        result = 31 * result + this.attachedTo.hashCode()
        result = 31 * result + this.startIoCount.hashCode()
        result = 31 * result + this.startIoKey.hashCode()
        result = 31 * result + this.startIoFlags.hashCode()
        result = 31 * result + this.vpb.hashCode()
        result = 31 * result + this.dependencyNode.hashCode()
        result = 31 * result + this.interruptContext.hashCode()
        result = 31 * result + this.interruptCount.hashCode()
        result = 31 * result + this.verifierContext.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DevobjExtension> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DevobjExtension> {
                override val sizeBytes: Long = 112L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DevobjExtension =
                    DevobjExtension(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<DeviceObject>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<DeviceObjectPowerExtension>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<DeviceObject>(64)
                        ).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Vpb>(64)
                        ).readNative(addr + 72L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 80L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 96L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 104L),
                    )
                override fun writeNative(addr: Long, value: DevobjExtension) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.size)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<DeviceObject>(64)
                    ).writeNative(addr + 8L, value.deviceObject)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.powerFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<DeviceObjectPowerExtension>(64)
                    ).writeNative(addr + 24L, value.dope)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.extensionFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 40L, value.deviceNode)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<DeviceObject>(64)
                    ).writeNative(addr + 48L, value.attachedTo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 56L, value.startIoCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 60L, value.startIoKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.startIoFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Vpb>(64)
                    ).writeNative(addr + 72L, value.vpb)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 80L, value.dependencyNode)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 88L, value.interruptContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 96L, value.interruptCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 104L, value.verifierContext)
                }
            }

        public operator fun invoke(
            type: Short = 0,
            size: UShort = 0u,
            deviceObject: MutPtr<DeviceObject> = MutPtr(0L),
            powerFlags: UInt = 0u,
            dope: MutPtr<DeviceObjectPowerExtension> = MutPtr(0L),
            extensionFlags: UInt = 0u,
            deviceNode: MutPtr<CVoid> = MutPtr(0L),
            attachedTo: MutPtr<DeviceObject> = MutPtr(0L),
            startIoCount: Int = 0,
            startIoKey: Int = 0,
            startIoFlags: UInt = 0u,
            vpb: MutPtr<Vpb> = MutPtr(0L),
            dependencyNode: MutPtr<CVoid> = MutPtr(0L),
            interruptContext: MutPtr<CVoid> = MutPtr(0L),
            interruptCount: Int = 0,
            verifierContext: MutPtr<CVoid> = MutPtr(0L),
        ): DevobjExtension =
            DevobjExtension(
                type = type,
                size = size,
                deviceObjectCtorArg = deviceObject,
                powerFlags = powerFlags,
                dopeCtorArg = dope,
                extensionFlags = extensionFlags,
                deviceNodeCtorArg = deviceNode,
                attachedToCtorArg = attachedTo,
                startIoCount = startIoCount,
                startIoKey = startIoKey,
                startIoFlags = startIoFlags,
                vpbCtorArg = vpb,
                dependencyNodeCtorArg = dependencyNode,
                interruptContextCtorArg = interruptContext,
                interruptCount = interruptCount,
                verifierContextCtorArg = verifierContext,
            )
    }
}

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

public data class DispatcherHeader00(
    public var lock: Int = 0,
    public var lockNV: Int = 0,
)

public data class DispatcherHeader01(
    public var type: UByte = 0u,
    public var signalling: UByte = 0u,
    public var size: UByte = 0u,
    public var reserved1: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DispatcherHeader01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DispatcherHeader01> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DispatcherHeader01 =
                    DispatcherHeader01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: DispatcherHeader01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.signalling)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.reserved1)
                }
            }
    }
}

public data class DispatcherHeader02(
    public var timerType: UByte = 0u,
    public var anonymous1: DispatcherHeader020 = DispatcherHeader020(),
    public var hand: UByte = 0u,
    public var anonymous2: DispatcherHeader021 = DispatcherHeader021(),
)

public data class DispatcherHeader020(
    public var timerControlFlags: UByte = 0u,
    public var anonymous: DispatcherHeader0200 = DispatcherHeader0200(),
)

public data class DispatcherHeader0200(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DispatcherHeader0200> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DispatcherHeader0200> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DispatcherHeader0200 =
                    DispatcherHeader0200(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DispatcherHeader0200) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class DispatcherHeader021(
    public var timerMiscFlags: UByte = 0u,
    public var anonymous: DispatcherHeader0210 = DispatcherHeader0210(),
)

public data class DispatcherHeader0210(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DispatcherHeader0210> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DispatcherHeader0210> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DispatcherHeader0210 =
                    DispatcherHeader0210(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DispatcherHeader0210) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class DispatcherHeader03(
    public var timer2Type: UByte = 0u,
    public var anonymous: DispatcherHeader030 = DispatcherHeader030(),
    public var timer2ComponentId: UByte = 0u,
    public var timer2RelativeId: UByte = 0u,
)

public data class DispatcherHeader030(
    public var timer2Flags: UByte = 0u,
    public var anonymous: DispatcherHeader0300 = DispatcherHeader0300(),
)

public data class DispatcherHeader0300(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DispatcherHeader0300> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DispatcherHeader0300> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DispatcherHeader0300 =
                    DispatcherHeader0300(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DispatcherHeader0300) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class DispatcherHeader04(
    public var queueType: UByte = 0u,
    public var anonymous: DispatcherHeader040 = DispatcherHeader040(),
    public var queueSize: UByte = 0u,
    public var queueReserved: UByte = 0u,
)

public data class DispatcherHeader040(
    public var queueControlFlags: UByte = 0u,
    public var anonymous: DispatcherHeader0400 = DispatcherHeader0400(),
)

public data class DispatcherHeader0400(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DispatcherHeader0400> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DispatcherHeader0400> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DispatcherHeader0400 =
                    DispatcherHeader0400(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DispatcherHeader0400) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class DispatcherHeader05(
    public var threadType: UByte = 0u,
    public var threadReserved: UByte = 0u,
    public var anonymous1: DispatcherHeader050 = DispatcherHeader050(),
    public var anonymous2: DispatcherHeader051 = DispatcherHeader051(),
)

public data class DispatcherHeader050(
    public var threadControlFlags: UByte = 0u,
    public var anonymous: DispatcherHeader0500 = DispatcherHeader0500(),
)

public data class DispatcherHeader0500(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DispatcherHeader0500> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DispatcherHeader0500> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DispatcherHeader0500 =
                    DispatcherHeader0500(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DispatcherHeader0500) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class DispatcherHeader051(
    public var debugActive: UByte = 0u,
)

public data class DispatcherHeader06(
    public var mutantType: UByte = 0u,
    public var mutantSize: UByte = 0u,
    public var dpcActive: Boolean = false,
    public var mutantReserved: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DispatcherHeader06> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DispatcherHeader06> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DispatcherHeader06 =
                    DispatcherHeader06(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: DispatcherHeader06) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.mutantType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.mutantSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 2L, value.dpcActive)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.mutantReserved)
                }
            }
    }
}

public class DriverExtension internal constructor(
    driverObjectCtorArg: MutPtr<DriverObject>,
    public var addDevice: DriverAddDevice,
    public var count: UInt,
    public var serviceKeyName: UnicodeString,
) {
    public var driverObject: MutPtr<DriverObject> = driverObjectCtorArg
        internal set

    public constructor() : this(
        driverObjectCtorArg = MutPtr(0L),
        addDevice = null,
        count = 0u,
        serviceKeyName = UnicodeString(),
    )

    public operator fun component1(): MutPtr<DriverObject> = this.driverObject

    public operator fun component2(): DriverAddDevice = this.addDevice

    public operator fun component3(): UInt = this.count

    public operator fun component4(): UnicodeString = this.serviceKeyName

    public fun copy(driverObject: MutPtr<DriverObject> = this.driverObject, addDevice: DriverAddDevice = this.addDevice, count: UInt = this.count, serviceKeyName: UnicodeString = this.serviceKeyName): DriverExtension = DriverExtension(driverObjectCtorArg = driverObject, addDevice = addDevice, count = count, serviceKeyName = serviceKeyName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DriverExtension) return false
        if (this.driverObject != other.driverObject) return false
        if (this.addDevice != other.addDevice) return false
        if (this.count != other.count) return false
        if (this.serviceKeyName != other.serviceKeyName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.driverObject.hashCode()
        result = 31 * result + this.addDevice.hashCode()
        result = 31 * result + this.count.hashCode()
        result = 31 * result + this.serviceKeyName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            driverObject: MutPtr<DriverObject> = MutPtr(0L),
            addDevice: DriverAddDevice = null,
            count: UInt = 0u,
            serviceKeyName: UnicodeString = UnicodeString(),
        ): DriverExtension =
            DriverExtension(
                driverObjectCtorArg = driverObject,
                addDevice = addDevice,
                count = count,
                serviceKeyName = serviceKeyName,
            )
    }
}

public class DriverObject internal constructor(
    public var type: Short,
    public var size: Short,
    deviceObjectCtorArg: MutPtr<DeviceObject>,
    public var flags: UInt,
    driverStartCtorArg: MutPtr<CVoid>,
    public var driverSize: UInt,
    driverSectionCtorArg: MutPtr<CVoid>,
    driverExtensionCtorArg: MutPtr<DriverExtension>,
    public var driverName: UnicodeString,
    hardwareDatabaseCtorArg: MutPtr<UnicodeString>,
    fastIoDispatchCtorArg: MutPtr<FastIoDispatch>,
    public var driverInit: DriverInitialize,
    public var driverStartIo: DriverStartio,
    public var driverUnload: DriverUnload,
    public var majorFunction: List<DriverDispatchFn>,
) {
    public var deviceObject: MutPtr<DeviceObject> = deviceObjectCtorArg
        internal set

    public var driverStart: MutPtr<CVoid> = driverStartCtorArg
        internal set

    public var driverSection: MutPtr<CVoid> = driverSectionCtorArg
        internal set

    public var driverExtension: MutPtr<DriverExtension> = driverExtensionCtorArg
        internal set

    public var hardwareDatabase: MutPtr<UnicodeString> = hardwareDatabaseCtorArg
        internal set

    public var fastIoDispatch: MutPtr<FastIoDispatch> = fastIoDispatchCtorArg
        internal set

    public constructor() : this(
        type = 0,
        size = 0,
        deviceObjectCtorArg = MutPtr(0L),
        flags = 0u,
        driverStartCtorArg = MutPtr(0L),
        driverSize = 0u,
        driverSectionCtorArg = MutPtr(0L),
        driverExtensionCtorArg = MutPtr(0L),
        driverName = UnicodeString(),
        hardwareDatabaseCtorArg = MutPtr(0L),
        fastIoDispatchCtorArg = MutPtr(0L),
        driverInit = null,
        driverStartIo = null,
        driverUnload = null,
        majorFunction = emptyList(),
    )

    public operator fun component1(): Short = this.type

    public operator fun component2(): Short = this.size

    public operator fun component3(): MutPtr<DeviceObject> = this.deviceObject

    public operator fun component4(): UInt = this.flags

    public operator fun component5(): MutPtr<CVoid> = this.driverStart

    public operator fun component6(): UInt = this.driverSize

    public operator fun component7(): MutPtr<CVoid> = this.driverSection

    public operator fun component8(): MutPtr<DriverExtension> = this.driverExtension

    public operator fun component9(): UnicodeString = this.driverName

    public operator fun component10(): MutPtr<UnicodeString> = this.hardwareDatabase

    public operator fun component11(): MutPtr<FastIoDispatch> = this.fastIoDispatch

    public operator fun component12(): DriverInitialize = this.driverInit

    public operator fun component13(): DriverStartio = this.driverStartIo

    public operator fun component14(): DriverUnload = this.driverUnload

    public operator fun component15(): List<DriverDispatchFn> = this.majorFunction

    public fun copy(type: Short = this.type, size: Short = this.size, deviceObject: MutPtr<DeviceObject> = this.deviceObject, flags: UInt = this.flags, driverStart: MutPtr<CVoid> = this.driverStart, driverSize: UInt = this.driverSize, driverSection: MutPtr<CVoid> = this.driverSection, driverExtension: MutPtr<DriverExtension> = this.driverExtension, driverName: UnicodeString = this.driverName, hardwareDatabase: MutPtr<UnicodeString> = this.hardwareDatabase, fastIoDispatch: MutPtr<FastIoDispatch> = this.fastIoDispatch, driverInit: DriverInitialize = this.driverInit, driverStartIo: DriverStartio = this.driverStartIo, driverUnload: DriverUnload = this.driverUnload, majorFunction: List<DriverDispatchFn> = this.majorFunction): DriverObject = DriverObject(type = type, size = size, deviceObjectCtorArg = deviceObject, flags = flags, driverStartCtorArg = driverStart, driverSize = driverSize, driverSectionCtorArg = driverSection, driverExtensionCtorArg = driverExtension, driverName = driverName, hardwareDatabaseCtorArg = hardwareDatabase, fastIoDispatchCtorArg = fastIoDispatch, driverInit = driverInit, driverStartIo = driverStartIo, driverUnload = driverUnload, majorFunction = majorFunction)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DriverObject) return false
        if (this.type != other.type) return false
        if (this.size != other.size) return false
        if (this.deviceObject != other.deviceObject) return false
        if (this.flags != other.flags) return false
        if (this.driverStart != other.driverStart) return false
        if (this.driverSize != other.driverSize) return false
        if (this.driverSection != other.driverSection) return false
        if (this.driverExtension != other.driverExtension) return false
        if (this.driverName != other.driverName) return false
        if (this.hardwareDatabase != other.hardwareDatabase) return false
        if (this.fastIoDispatch != other.fastIoDispatch) return false
        if (this.driverInit != other.driverInit) return false
        if (this.driverStartIo != other.driverStartIo) return false
        if (this.driverUnload != other.driverUnload) return false
        if (this.majorFunction != other.majorFunction) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.deviceObject.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.driverStart.hashCode()
        result = 31 * result + this.driverSize.hashCode()
        result = 31 * result + this.driverSection.hashCode()
        result = 31 * result + this.driverExtension.hashCode()
        result = 31 * result + this.driverName.hashCode()
        result = 31 * result + this.hardwareDatabase.hashCode()
        result = 31 * result + this.fastIoDispatch.hashCode()
        result = 31 * result + this.driverInit.hashCode()
        result = 31 * result + this.driverStartIo.hashCode()
        result = 31 * result + this.driverUnload.hashCode()
        result = 31 * result + this.majorFunction.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            type: Short = 0,
            size: Short = 0,
            deviceObject: MutPtr<DeviceObject> = MutPtr(0L),
            flags: UInt = 0u,
            driverStart: MutPtr<CVoid> = MutPtr(0L),
            driverSize: UInt = 0u,
            driverSection: MutPtr<CVoid> = MutPtr(0L),
            driverExtension: MutPtr<DriverExtension> = MutPtr(0L),
            driverName: UnicodeString = UnicodeString(),
            hardwareDatabase: MutPtr<UnicodeString> = MutPtr(0L),
            fastIoDispatch: MutPtr<FastIoDispatch> = MutPtr(0L),
            driverInit: DriverInitialize = null,
            driverStartIo: DriverStartio = null,
            driverUnload: DriverUnload = null,
            majorFunction: List<DriverDispatchFn> = emptyList(),
        ): DriverObject =
            DriverObject(
                type = type,
                size = size,
                deviceObjectCtorArg = deviceObject,
                flags = flags,
                driverStartCtorArg = driverStart,
                driverSize = driverSize,
                driverSectionCtorArg = driverSection,
                driverExtensionCtorArg = driverExtension,
                driverName = driverName,
                hardwareDatabaseCtorArg = hardwareDatabase,
                fastIoDispatchCtorArg = fastIoDispatch,
                driverInit = driverInit,
                driverStartIo = driverStartIo,
                driverUnload = driverUnload,
                majorFunction = majorFunction,
            )
    }
}

public class Eresource internal constructor(
    public var systemResourcesList: ListEntry,
    ownerTableCtorArg: MutPtr<OwnerEntry>,
    public var activeCount: Short,
    public var anonymous1: Eresource0,
    sharedWaitersCtorArg: MutPtr<CVoid>,
    exclusiveWaitersCtorArg: MutPtr<CVoid>,
    public var ownerEntry: OwnerEntry,
    public var activeEntries: UInt,
    public var contentionCount: UInt,
    public var numberOfSharedWaiters: UInt,
    public var numberOfExclusiveWaiters: UInt,
    public var anonymous2: Eresource1,
    public var spinLock: Int,
) {
    public var ownerTable: MutPtr<OwnerEntry> = ownerTableCtorArg
        internal set

    public var sharedWaiters: MutPtr<CVoid> = sharedWaitersCtorArg
        internal set

    public var exclusiveWaiters: MutPtr<CVoid> = exclusiveWaitersCtorArg
        internal set

    public constructor() : this(
        systemResourcesList = ListEntry(),
        ownerTableCtorArg = MutPtr(0L),
        activeCount = 0,
        anonymous1 = Eresource0(),
        sharedWaitersCtorArg = MutPtr(0L),
        exclusiveWaitersCtorArg = MutPtr(0L),
        ownerEntry = OwnerEntry(),
        activeEntries = 0u,
        contentionCount = 0u,
        numberOfSharedWaiters = 0u,
        numberOfExclusiveWaiters = 0u,
        anonymous2 = Eresource1(),
        spinLock = 0,
    )

    public operator fun component1(): ListEntry = this.systemResourcesList

    public operator fun component2(): MutPtr<OwnerEntry> = this.ownerTable

    public operator fun component3(): Short = this.activeCount

    public operator fun component4(): Eresource0 = this.anonymous1

    public operator fun component5(): MutPtr<CVoid> = this.sharedWaiters

    public operator fun component6(): MutPtr<CVoid> = this.exclusiveWaiters

    public operator fun component7(): OwnerEntry = this.ownerEntry

    public operator fun component8(): UInt = this.activeEntries

    public operator fun component9(): UInt = this.contentionCount

    public operator fun component10(): UInt = this.numberOfSharedWaiters

    public operator fun component11(): UInt = this.numberOfExclusiveWaiters

    public operator fun component12(): Eresource1 = this.anonymous2

    public operator fun component13(): Int = this.spinLock

    public fun copy(systemResourcesList: ListEntry = this.systemResourcesList, ownerTable: MutPtr<OwnerEntry> = this.ownerTable, activeCount: Short = this.activeCount, anonymous1: Eresource0 = this.anonymous1, sharedWaiters: MutPtr<CVoid> = this.sharedWaiters, exclusiveWaiters: MutPtr<CVoid> = this.exclusiveWaiters, ownerEntry: OwnerEntry = this.ownerEntry, activeEntries: UInt = this.activeEntries, contentionCount: UInt = this.contentionCount, numberOfSharedWaiters: UInt = this.numberOfSharedWaiters, numberOfExclusiveWaiters: UInt = this.numberOfExclusiveWaiters, anonymous2: Eresource1 = this.anonymous2, spinLock: Int = this.spinLock): Eresource = Eresource(systemResourcesList = systemResourcesList, ownerTableCtorArg = ownerTable, activeCount = activeCount, anonymous1 = anonymous1, sharedWaitersCtorArg = sharedWaiters, exclusiveWaitersCtorArg = exclusiveWaiters, ownerEntry = ownerEntry, activeEntries = activeEntries, contentionCount = contentionCount, numberOfSharedWaiters = numberOfSharedWaiters, numberOfExclusiveWaiters = numberOfExclusiveWaiters, anonymous2 = anonymous2, spinLock = spinLock)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Eresource) return false
        if (this.systemResourcesList != other.systemResourcesList) return false
        if (this.ownerTable != other.ownerTable) return false
        if (this.activeCount != other.activeCount) return false
        if (this.anonymous1 != other.anonymous1) return false
        if (this.sharedWaiters != other.sharedWaiters) return false
        if (this.exclusiveWaiters != other.exclusiveWaiters) return false
        if (this.ownerEntry != other.ownerEntry) return false
        if (this.activeEntries != other.activeEntries) return false
        if (this.contentionCount != other.contentionCount) return false
        if (this.numberOfSharedWaiters != other.numberOfSharedWaiters) return false
        if (this.numberOfExclusiveWaiters != other.numberOfExclusiveWaiters) return false
        if (this.anonymous2 != other.anonymous2) return false
        if (this.spinLock != other.spinLock) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.systemResourcesList.hashCode()
        result = 31 * result + this.ownerTable.hashCode()
        result = 31 * result + this.activeCount.hashCode()
        result = 31 * result + this.anonymous1.hashCode()
        result = 31 * result + this.sharedWaiters.hashCode()
        result = 31 * result + this.exclusiveWaiters.hashCode()
        result = 31 * result + this.ownerEntry.hashCode()
        result = 31 * result + this.activeEntries.hashCode()
        result = 31 * result + this.contentionCount.hashCode()
        result = 31 * result + this.numberOfSharedWaiters.hashCode()
        result = 31 * result + this.numberOfExclusiveWaiters.hashCode()
        result = 31 * result + this.anonymous2.hashCode()
        result = 31 * result + this.spinLock.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            systemResourcesList: ListEntry = ListEntry(),
            ownerTable: MutPtr<OwnerEntry> = MutPtr(0L),
            activeCount: Short = 0,
            anonymous1: Eresource0 = Eresource0(),
            sharedWaiters: MutPtr<CVoid> = MutPtr(0L),
            exclusiveWaiters: MutPtr<CVoid> = MutPtr(0L),
            ownerEntry: OwnerEntry = OwnerEntry(),
            activeEntries: UInt = 0u,
            contentionCount: UInt = 0u,
            numberOfSharedWaiters: UInt = 0u,
            numberOfExclusiveWaiters: UInt = 0u,
            anonymous2: Eresource1 = Eresource1(),
            spinLock: Int = 0,
        ): Eresource =
            Eresource(
                systemResourcesList = systemResourcesList,
                ownerTableCtorArg = ownerTable,
                activeCount = activeCount,
                anonymous1 = anonymous1,
                sharedWaitersCtorArg = sharedWaiters,
                exclusiveWaitersCtorArg = exclusiveWaiters,
                ownerEntry = ownerEntry,
                activeEntries = activeEntries,
                contentionCount = contentionCount,
                numberOfSharedWaiters = numberOfSharedWaiters,
                numberOfExclusiveWaiters = numberOfExclusiveWaiters,
                anonymous2 = anonymous2,
                spinLock = spinLock,
            )
    }
}

public data class Eresource0(
    public var flag: UShort = 0u,
    public var anonymous: Eresource00 = Eresource00(),
)

public data class Eresource00(
    public var reservedLowFlags: UByte = 0u,
    public var waiterPriority: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Eresource00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Eresource00> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Eresource00 =
                    Eresource00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: Eresource00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.reservedLowFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.waiterPriority)
                }
            }
    }
}

public class Eresource1 internal constructor(
    addressCtorArg: MutPtr<CVoid>,
    public var creatorBackTraceIndex: Int,
) {
    public var address: MutPtr<CVoid> = addressCtorArg
        internal set

    public constructor() : this(
        addressCtorArg = MutPtr(0L),
        creatorBackTraceIndex = 0,
    )

    public operator fun component1(): MutPtr<CVoid> = this.address

    public operator fun component2(): Int = this.creatorBackTraceIndex

    public fun copy(address: MutPtr<CVoid> = this.address, creatorBackTraceIndex: Int = this.creatorBackTraceIndex): Eresource1 = Eresource1(addressCtorArg = address, creatorBackTraceIndex = creatorBackTraceIndex)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Eresource1) return false
        if (this.address != other.address) return false
        if (this.creatorBackTraceIndex != other.creatorBackTraceIndex) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.address.hashCode()
        result = 31 * result + this.creatorBackTraceIndex.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            address: MutPtr<CVoid> = MutPtr(0L),
            creatorBackTraceIndex: Int = 0,
        ): Eresource1 =
            Eresource1(
                addressCtorArg = address,
                creatorBackTraceIndex = creatorBackTraceIndex,
            )
    }
}

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

public class FastMutex internal constructor(
    public var count: Int,
    ownerCtorArg: MutPtr<CVoid>,
    public var contention: UInt,
    public var event: Kevent,
    public var oldIrql: UInt,
) {
    public var owner: MutPtr<CVoid> = ownerCtorArg
        internal set

    public constructor() : this(
        count = 0,
        ownerCtorArg = MutPtr(0L),
        contention = 0u,
        event = Kevent(),
        oldIrql = 0u,
    )

    public operator fun component1(): Int = this.count

    public operator fun component2(): MutPtr<CVoid> = this.owner

    public operator fun component3(): UInt = this.contention

    public operator fun component4(): Kevent = this.event

    public operator fun component5(): UInt = this.oldIrql

    public fun copy(count: Int = this.count, owner: MutPtr<CVoid> = this.owner, contention: UInt = this.contention, event: Kevent = this.event, oldIrql: UInt = this.oldIrql): FastMutex = FastMutex(count = count, ownerCtorArg = owner, contention = contention, event = event, oldIrql = oldIrql)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FastMutex) return false
        if (this.count != other.count) return false
        if (this.owner != other.owner) return false
        if (this.contention != other.contention) return false
        if (this.event != other.event) return false
        if (this.oldIrql != other.oldIrql) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.count.hashCode()
        result = 31 * result + this.owner.hashCode()
        result = 31 * result + this.contention.hashCode()
        result = 31 * result + this.event.hashCode()
        result = 31 * result + this.oldIrql.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            count: Int = 0,
            owner: MutPtr<CVoid> = MutPtr(0L),
            contention: UInt = 0u,
            event: Kevent = Kevent(),
            oldIrql: UInt = 0u,
        ): FastMutex =
            FastMutex(
                count = count,
                ownerCtorArg = owner,
                contention = contention,
                event = event,
                oldIrql = oldIrql,
            )
    }
}

public class FileObject internal constructor(
    public var type: Short,
    public var size: Short,
    deviceObjectCtorArg: MutPtr<DeviceObject>,
    vpbCtorArg: MutPtr<Vpb>,
    fsContextCtorArg: MutPtr<CVoid>,
    fsContext2CtorArg: MutPtr<CVoid>,
    sectionObjectPointerCtorArg: MutPtr<SectionObjectPointers>,
    privateCacheMapCtorArg: MutPtr<CVoid>,
    public var finalStatus: Ntstatus,
    relatedFileObjectCtorArg: MutPtr<FileObject>,
    public var lockOperation: Boolean,
    public var deletePending: Boolean,
    public var readAccess: Boolean,
    public var writeAccess: Boolean,
    public var deleteAccess: Boolean,
    public var sharedRead: Boolean,
    public var sharedWrite: Boolean,
    public var sharedDelete: Boolean,
    public var flags: UInt,
    public var fileName: UnicodeString,
    public var currentByteOffset: Long,
    public var waiters: UInt,
    public var busy: UInt,
    lastLockCtorArg: MutPtr<CVoid>,
    public var lock: Kevent,
    public var event: Kevent,
    completionContextCtorArg: MutPtr<IoCompletionContext>,
    public var irpListLock: Int,
    public var irpList: ListEntry,
    fileObjectExtensionCtorArg: MutPtr<CVoid>,
) {
    public var deviceObject: MutPtr<DeviceObject> = deviceObjectCtorArg
        internal set

    public var vpb: MutPtr<Vpb> = vpbCtorArg
        internal set

    public var fsContext: MutPtr<CVoid> = fsContextCtorArg
        internal set

    public var fsContext2: MutPtr<CVoid> = fsContext2CtorArg
        internal set

    public var sectionObjectPointer: MutPtr<SectionObjectPointers> = sectionObjectPointerCtorArg
        internal set

    public var privateCacheMap: MutPtr<CVoid> = privateCacheMapCtorArg
        internal set

    public var relatedFileObject: MutPtr<FileObject> = relatedFileObjectCtorArg
        internal set

    public var lastLock: MutPtr<CVoid> = lastLockCtorArg
        internal set

    public var completionContext: MutPtr<IoCompletionContext> = completionContextCtorArg
        internal set

    public var fileObjectExtension: MutPtr<CVoid> = fileObjectExtensionCtorArg
        internal set

    public constructor() : this(
        type = 0,
        size = 0,
        deviceObjectCtorArg = MutPtr(0L),
        vpbCtorArg = MutPtr(0L),
        fsContextCtorArg = MutPtr(0L),
        fsContext2CtorArg = MutPtr(0L),
        sectionObjectPointerCtorArg = MutPtr(0L),
        privateCacheMapCtorArg = MutPtr(0L),
        finalStatus = 0,
        relatedFileObjectCtorArg = MutPtr(0L),
        lockOperation = false,
        deletePending = false,
        readAccess = false,
        writeAccess = false,
        deleteAccess = false,
        sharedRead = false,
        sharedWrite = false,
        sharedDelete = false,
        flags = 0u,
        fileName = UnicodeString(),
        currentByteOffset = 0L,
        waiters = 0u,
        busy = 0u,
        lastLockCtorArg = MutPtr(0L),
        lock = Kevent(),
        event = Kevent(),
        completionContextCtorArg = MutPtr(0L),
        irpListLock = 0,
        irpList = ListEntry(),
        fileObjectExtensionCtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            type: Short = 0,
            size: Short = 0,
            deviceObject: MutPtr<DeviceObject> = MutPtr(0L),
            vpb: MutPtr<Vpb> = MutPtr(0L),
            fsContext: MutPtr<CVoid> = MutPtr(0L),
            fsContext2: MutPtr<CVoid> = MutPtr(0L),
            sectionObjectPointer: MutPtr<SectionObjectPointers> = MutPtr(0L),
            privateCacheMap: MutPtr<CVoid> = MutPtr(0L),
            finalStatus: Ntstatus = 0,
            relatedFileObject: MutPtr<FileObject> = MutPtr(0L),
            lockOperation: Boolean = false,
            deletePending: Boolean = false,
            readAccess: Boolean = false,
            writeAccess: Boolean = false,
            deleteAccess: Boolean = false,
            sharedRead: Boolean = false,
            sharedWrite: Boolean = false,
            sharedDelete: Boolean = false,
            flags: UInt = 0u,
            fileName: UnicodeString = UnicodeString(),
            currentByteOffset: Long = 0L,
            waiters: UInt = 0u,
            busy: UInt = 0u,
            lastLock: MutPtr<CVoid> = MutPtr(0L),
            lock: Kevent = Kevent(),
            event: Kevent = Kevent(),
            completionContext: MutPtr<IoCompletionContext> = MutPtr(0L),
            irpListLock: Int = 0,
            irpList: ListEntry = ListEntry(),
            fileObjectExtension: MutPtr<CVoid> = MutPtr(0L),
        ): FileObject =
            FileObject(
                type = type,
                size = size,
                deviceObjectCtorArg = deviceObject,
                vpbCtorArg = vpb,
                fsContextCtorArg = fsContext,
                fsContext2CtorArg = fsContext2,
                sectionObjectPointerCtorArg = sectionObjectPointer,
                privateCacheMapCtorArg = privateCacheMap,
                finalStatus = finalStatus,
                relatedFileObjectCtorArg = relatedFileObject,
                lockOperation = lockOperation,
                deletePending = deletePending,
                readAccess = readAccess,
                writeAccess = writeAccess,
                deleteAccess = deleteAccess,
                sharedRead = sharedRead,
                sharedWrite = sharedWrite,
                sharedDelete = sharedDelete,
                flags = flags,
                fileName = fileName,
                currentByteOffset = currentByteOffset,
                waiters = waiters,
                busy = busy,
                lastLockCtorArg = lastLock,
                lock = lock,
                event = event,
                completionContextCtorArg = completionContext,
                irpListLock = irpListLock,
                irpList = irpList,
                fileObjectExtensionCtorArg = fileObjectExtension,
            )
    }
}

public class IoCompletionContext internal constructor(
    portCtorArg: MutPtr<CVoid>,
    keyCtorArg: MutPtr<CVoid>,
    public var usageCount: Int,
) {
    public var port: MutPtr<CVoid> = portCtorArg
        internal set

    public var key: MutPtr<CVoid> = keyCtorArg
        internal set

    public constructor() : this(
        portCtorArg = MutPtr(0L),
        keyCtorArg = MutPtr(0L),
        usageCount = 0,
    )

    public operator fun component1(): MutPtr<CVoid> = this.port

    public operator fun component2(): MutPtr<CVoid> = this.key

    public operator fun component3(): Int = this.usageCount

    public fun copy(port: MutPtr<CVoid> = this.port, key: MutPtr<CVoid> = this.key, usageCount: Int = this.usageCount): IoCompletionContext = IoCompletionContext(portCtorArg = port, keyCtorArg = key, usageCount = usageCount)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoCompletionContext) return false
        if (this.port != other.port) return false
        if (this.key != other.key) return false
        if (this.usageCount != other.usageCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.port.hashCode()
        result = 31 * result + this.key.hashCode()
        result = 31 * result + this.usageCount.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoCompletionContext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoCompletionContext> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IoCompletionContext =
                    IoCompletionContext(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: IoCompletionContext) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.port)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.key)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 16L, value.usageCount)
                }
            }

        public operator fun invoke(
            port: MutPtr<CVoid> = MutPtr(0L),
            key: MutPtr<CVoid> = MutPtr(0L),
            usageCount: Int = 0,
        ): IoCompletionContext =
            IoCompletionContext(
                portCtorArg = port,
                keyCtorArg = key,
                usageCount = usageCount,
            )
    }
}

public class IoSecurityContext internal constructor(
    securityQosCtorArg: MutPtr<SecurityQualityOfService>,
    accessStateCtorArg: MutPtr<AccessState>,
    public var desiredAccess: UInt,
    public var fullCreateOptions: UInt,
) {
    public var securityQos: MutPtr<SecurityQualityOfService> = securityQosCtorArg
        internal set

    public var accessState: MutPtr<AccessState> = accessStateCtorArg
        internal set

    public constructor() : this(
        securityQosCtorArg = MutPtr(0L),
        accessStateCtorArg = MutPtr(0L),
        desiredAccess = 0u,
        fullCreateOptions = 0u,
    )

    public operator fun component1(): MutPtr<SecurityQualityOfService> = this.securityQos

    public operator fun component2(): MutPtr<AccessState> = this.accessState

    public operator fun component3(): UInt = this.desiredAccess

    public operator fun component4(): UInt = this.fullCreateOptions

    public fun copy(securityQos: MutPtr<SecurityQualityOfService> = this.securityQos, accessState: MutPtr<AccessState> = this.accessState, desiredAccess: UInt = this.desiredAccess, fullCreateOptions: UInt = this.fullCreateOptions): IoSecurityContext = IoSecurityContext(securityQosCtorArg = securityQos, accessStateCtorArg = accessState, desiredAccess = desiredAccess, fullCreateOptions = fullCreateOptions)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoSecurityContext) return false
        if (this.securityQos != other.securityQos) return false
        if (this.accessState != other.accessState) return false
        if (this.desiredAccess != other.desiredAccess) return false
        if (this.fullCreateOptions != other.fullCreateOptions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.securityQos.hashCode()
        result = 31 * result + this.accessState.hashCode()
        result = 31 * result + this.desiredAccess.hashCode()
        result = 31 * result + this.fullCreateOptions.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoSecurityContext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoSecurityContext> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IoSecurityContext =
                    IoSecurityContext(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<SecurityQualityOfService>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<AccessState>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: IoSecurityContext) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<SecurityQualityOfService>(64)
                    ).writeNative(addr, value.securityQos)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<AccessState>(64)
                    ).writeNative(addr + 8L, value.accessState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.desiredAccess)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.fullCreateOptions)
                }
            }

        public operator fun invoke(
            securityQos: MutPtr<SecurityQualityOfService> = MutPtr(0L),
            accessState: MutPtr<AccessState> = MutPtr(0L),
            desiredAccess: UInt = 0u,
            fullCreateOptions: UInt = 0u,
        ): IoSecurityContext =
            IoSecurityContext(
                securityQosCtorArg = securityQos,
                accessStateCtorArg = accessState,
                desiredAccess = desiredAccess,
                fullCreateOptions = fullCreateOptions,
            )
    }
}

public class IoStackLocation internal constructor(
    public var majorFunction: UByte,
    public var minorFunction: UByte,
    public var flags: UByte,
    public var control: UByte,
    public var parameters: IoStackLocation0,
    deviceObjectCtorArg: MutPtr<DeviceObject>,
    fileObjectCtorArg: MutPtr<FileObject>,
    public var completionRoutine: PioCompletionRoutine,
    contextCtorArg: MutPtr<CVoid>,
) {
    public var deviceObject: MutPtr<DeviceObject> = deviceObjectCtorArg
        internal set

    public var fileObject: MutPtr<FileObject> = fileObjectCtorArg
        internal set

    public var context: MutPtr<CVoid> = contextCtorArg
        internal set

    public constructor() : this(
        majorFunction = 0u,
        minorFunction = 0u,
        flags = 0u,
        control = 0u,
        parameters = IoStackLocation0(),
        deviceObjectCtorArg = MutPtr(0L),
        fileObjectCtorArg = MutPtr(0L),
        completionRoutine = null,
        contextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UByte = this.majorFunction

    public operator fun component2(): UByte = this.minorFunction

    public operator fun component3(): UByte = this.flags

    public operator fun component4(): UByte = this.control

    public operator fun component5(): IoStackLocation0 = this.parameters

    public operator fun component6(): MutPtr<DeviceObject> = this.deviceObject

    public operator fun component7(): MutPtr<FileObject> = this.fileObject

    public operator fun component8(): PioCompletionRoutine = this.completionRoutine

    public operator fun component9(): MutPtr<CVoid> = this.context

    public fun copy(majorFunction: UByte = this.majorFunction, minorFunction: UByte = this.minorFunction, flags: UByte = this.flags, control: UByte = this.control, parameters: IoStackLocation0 = this.parameters, deviceObject: MutPtr<DeviceObject> = this.deviceObject, fileObject: MutPtr<FileObject> = this.fileObject, completionRoutine: PioCompletionRoutine = this.completionRoutine, context: MutPtr<CVoid> = this.context): IoStackLocation = IoStackLocation(majorFunction = majorFunction, minorFunction = minorFunction, flags = flags, control = control, parameters = parameters, deviceObjectCtorArg = deviceObject, fileObjectCtorArg = fileObject, completionRoutine = completionRoutine, contextCtorArg = context)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoStackLocation) return false
        if (this.majorFunction != other.majorFunction) return false
        if (this.minorFunction != other.minorFunction) return false
        if (this.flags != other.flags) return false
        if (this.control != other.control) return false
        if (this.parameters != other.parameters) return false
        if (this.deviceObject != other.deviceObject) return false
        if (this.fileObject != other.fileObject) return false
        if (this.completionRoutine != other.completionRoutine) return false
        if (this.context != other.context) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.majorFunction.hashCode()
        result = 31 * result + this.minorFunction.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.control.hashCode()
        result = 31 * result + this.parameters.hashCode()
        result = 31 * result + this.deviceObject.hashCode()
        result = 31 * result + this.fileObject.hashCode()
        result = 31 * result + this.completionRoutine.hashCode()
        result = 31 * result + this.context.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            majorFunction: UByte = 0u,
            minorFunction: UByte = 0u,
            flags: UByte = 0u,
            control: UByte = 0u,
            parameters: IoStackLocation0 = IoStackLocation0(),
            deviceObject: MutPtr<DeviceObject> = MutPtr(0L),
            fileObject: MutPtr<FileObject> = MutPtr(0L),
            completionRoutine: PioCompletionRoutine = null,
            context: MutPtr<CVoid> = MutPtr(0L),
        ): IoStackLocation =
            IoStackLocation(
                majorFunction = majorFunction,
                minorFunction = minorFunction,
                flags = flags,
                control = control,
                parameters = parameters,
                deviceObjectCtorArg = deviceObject,
                fileObjectCtorArg = fileObject,
                completionRoutine = completionRoutine,
                contextCtorArg = context,
            )
    }
}

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

public class IoStackLocation02 internal constructor(
    securityContextCtorArg: MutPtr<IoSecurityContext>,
    public var options: UInt,
    public var reserved: UShort,
    public var shareAccess: UShort,
    parametersCtorArg: MutPtr<MailslotCreateParameters>,
) {
    public var securityContext: MutPtr<IoSecurityContext> = securityContextCtorArg
        internal set

    public var parameters: MutPtr<MailslotCreateParameters> = parametersCtorArg
        internal set

    public constructor() : this(
        securityContextCtorArg = MutPtr(0L),
        options = 0u,
        reserved = 0u,
        shareAccess = 0u,
        parametersCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<IoSecurityContext> = this.securityContext

    public operator fun component2(): UInt = this.options

    public operator fun component3(): UShort = this.reserved

    public operator fun component4(): UShort = this.shareAccess

    public operator fun component5(): MutPtr<MailslotCreateParameters> = this.parameters

    public fun copy(securityContext: MutPtr<IoSecurityContext> = this.securityContext, options: UInt = this.options, reserved: UShort = this.reserved, shareAccess: UShort = this.shareAccess, parameters: MutPtr<MailslotCreateParameters> = this.parameters): IoStackLocation02 = IoStackLocation02(securityContextCtorArg = securityContext, options = options, reserved = reserved, shareAccess = shareAccess, parametersCtorArg = parameters)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoStackLocation02) return false
        if (this.securityContext != other.securityContext) return false
        if (this.options != other.options) return false
        if (this.reserved != other.reserved) return false
        if (this.shareAccess != other.shareAccess) return false
        if (this.parameters != other.parameters) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.securityContext.hashCode()
        result = 31 * result + this.options.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.shareAccess.hashCode()
        result = 31 * result + this.parameters.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation02> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation02> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IoStackLocation02 =
                    IoStackLocation02(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<IoSecurityContext>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MailslotCreateParameters>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: IoStackLocation02) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<IoSecurityContext>(64)
                    ).writeNative(addr, value.securityContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.options)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.shareAccess)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MailslotCreateParameters>(64)
                    ).writeNative(addr + 16L, value.parameters)
                }
            }

        public operator fun invoke(
            securityContext: MutPtr<IoSecurityContext> = MutPtr(0L),
            options: UInt = 0u,
            reserved: UShort = 0u,
            shareAccess: UShort = 0u,
            parameters: MutPtr<MailslotCreateParameters> = MutPtr(0L),
        ): IoStackLocation02 =
            IoStackLocation02(
                securityContextCtorArg = securityContext,
                options = options,
                reserved = reserved,
                shareAccess = shareAccess,
                parametersCtorArg = parameters,
            )
    }
}

public class IoStackLocation01 internal constructor(
    securityContextCtorArg: MutPtr<IoSecurityContext>,
    public var options: UInt,
    public var reserved: UShort,
    public var shareAccess: UShort,
    parametersCtorArg: MutPtr<NamedPipeCreateParameters>,
) {
    public var securityContext: MutPtr<IoSecurityContext> = securityContextCtorArg
        internal set

    public var parameters: MutPtr<NamedPipeCreateParameters> = parametersCtorArg
        internal set

    public constructor() : this(
        securityContextCtorArg = MutPtr(0L),
        options = 0u,
        reserved = 0u,
        shareAccess = 0u,
        parametersCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<IoSecurityContext> = this.securityContext

    public operator fun component2(): UInt = this.options

    public operator fun component3(): UShort = this.reserved

    public operator fun component4(): UShort = this.shareAccess

    public operator fun component5(): MutPtr<NamedPipeCreateParameters> = this.parameters

    public fun copy(securityContext: MutPtr<IoSecurityContext> = this.securityContext, options: UInt = this.options, reserved: UShort = this.reserved, shareAccess: UShort = this.shareAccess, parameters: MutPtr<NamedPipeCreateParameters> = this.parameters): IoStackLocation01 = IoStackLocation01(securityContextCtorArg = securityContext, options = options, reserved = reserved, shareAccess = shareAccess, parametersCtorArg = parameters)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoStackLocation01) return false
        if (this.securityContext != other.securityContext) return false
        if (this.options != other.options) return false
        if (this.reserved != other.reserved) return false
        if (this.shareAccess != other.shareAccess) return false
        if (this.parameters != other.parameters) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.securityContext.hashCode()
        result = 31 * result + this.options.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.shareAccess.hashCode()
        result = 31 * result + this.parameters.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation01> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IoStackLocation01 =
                    IoStackLocation01(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<IoSecurityContext>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<NamedPipeCreateParameters>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: IoStackLocation01) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<IoSecurityContext>(64)
                    ).writeNative(addr, value.securityContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.options)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.shareAccess)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<NamedPipeCreateParameters>(64)
                    ).writeNative(addr + 16L, value.parameters)
                }
            }

        public operator fun invoke(
            securityContext: MutPtr<IoSecurityContext> = MutPtr(0L),
            options: UInt = 0u,
            reserved: UShort = 0u,
            shareAccess: UShort = 0u,
            parameters: MutPtr<NamedPipeCreateParameters> = MutPtr(0L),
        ): IoStackLocation01 =
            IoStackLocation01(
                securityContextCtorArg = securityContext,
                options = options,
                reserved = reserved,
                shareAccess = shareAccess,
                parametersCtorArg = parameters,
            )
    }
}

public class IoStackLocation00 internal constructor(
    securityContextCtorArg: MutPtr<IoSecurityContext>,
    public var options: UInt,
    public var fileAttributes: UShort,
    public var shareAccess: UShort,
    public var eaLength: UInt,
) {
    public var securityContext: MutPtr<IoSecurityContext> = securityContextCtorArg
        internal set

    public constructor() : this(
        securityContextCtorArg = MutPtr(0L),
        options = 0u,
        fileAttributes = 0u,
        shareAccess = 0u,
        eaLength = 0u,
    )

    public operator fun component1(): MutPtr<IoSecurityContext> = this.securityContext

    public operator fun component2(): UInt = this.options

    public operator fun component3(): UShort = this.fileAttributes

    public operator fun component4(): UShort = this.shareAccess

    public operator fun component5(): UInt = this.eaLength

    public fun copy(securityContext: MutPtr<IoSecurityContext> = this.securityContext, options: UInt = this.options, fileAttributes: UShort = this.fileAttributes, shareAccess: UShort = this.shareAccess, eaLength: UInt = this.eaLength): IoStackLocation00 = IoStackLocation00(securityContextCtorArg = securityContext, options = options, fileAttributes = fileAttributes, shareAccess = shareAccess, eaLength = eaLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoStackLocation00) return false
        if (this.securityContext != other.securityContext) return false
        if (this.options != other.options) return false
        if (this.fileAttributes != other.fileAttributes) return false
        if (this.shareAccess != other.shareAccess) return false
        if (this.eaLength != other.eaLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.securityContext.hashCode()
        result = 31 * result + this.options.hashCode()
        result = 31 * result + this.fileAttributes.hashCode()
        result = 31 * result + this.shareAccess.hashCode()
        result = 31 * result + this.eaLength.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation00> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IoStackLocation00 =
                    IoStackLocation00(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<IoSecurityContext>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: IoStackLocation00) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<IoSecurityContext>(64)
                    ).writeNative(addr, value.securityContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.options)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.fileAttributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.shareAccess)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.eaLength)
                }
            }

        public operator fun invoke(
            securityContext: MutPtr<IoSecurityContext> = MutPtr(0L),
            options: UInt = 0u,
            fileAttributes: UShort = 0u,
            shareAccess: UShort = 0u,
            eaLength: UInt = 0u,
        ): IoStackLocation00 =
            IoStackLocation00(
                securityContextCtorArg = securityContext,
                options = options,
                fileAttributes = fileAttributes,
                shareAccess = shareAccess,
                eaLength = eaLength,
            )
    }
}

public class IoStackLocation026 internal constructor(
    capabilitiesCtorArg: MutPtr<DeviceCapabilities>,
) {
    public var capabilities: MutPtr<DeviceCapabilities> = capabilitiesCtorArg
        internal set

    public constructor() : this(
        capabilitiesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<DeviceCapabilities> = this.capabilities

    public fun copy(capabilities: MutPtr<DeviceCapabilities> = this.capabilities): IoStackLocation026 = IoStackLocation026(capabilitiesCtorArg = capabilities)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoStackLocation026) return false
        if (this.capabilities != other.capabilities) return false
        return true
    }

    override fun hashCode(): Int = this.capabilities.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation026> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation026> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IoStackLocation026 =
                    IoStackLocation026(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<DeviceCapabilities>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: IoStackLocation026) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<DeviceCapabilities>(64)
                    ).writeNative(addr, value.capabilities)
                }
            }

        public operator fun invoke(
            capabilities: MutPtr<DeviceCapabilities> = MutPtr(0L),
        ): IoStackLocation026 =
            IoStackLocation026(
                capabilitiesCtorArg = capabilities,
            )
    }
}

public class IoStackLocation016 internal constructor(
    public var outputBufferLength: UInt,
    public var inputBufferLength: UInt,
    public var ioControlCode: UInt,
    type3InputBufferCtorArg: MutPtr<CVoid>,
) {
    public var type3InputBuffer: MutPtr<CVoid> = type3InputBufferCtorArg
        internal set

    public constructor() : this(
        outputBufferLength = 0u,
        inputBufferLength = 0u,
        ioControlCode = 0u,
        type3InputBufferCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.outputBufferLength

    public operator fun component2(): UInt = this.inputBufferLength

    public operator fun component3(): UInt = this.ioControlCode

    public operator fun component4(): MutPtr<CVoid> = this.type3InputBuffer

    public fun copy(outputBufferLength: UInt = this.outputBufferLength, inputBufferLength: UInt = this.inputBufferLength, ioControlCode: UInt = this.ioControlCode, type3InputBuffer: MutPtr<CVoid> = this.type3InputBuffer): IoStackLocation016 = IoStackLocation016(outputBufferLength = outputBufferLength, inputBufferLength = inputBufferLength, ioControlCode = ioControlCode, type3InputBufferCtorArg = type3InputBuffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoStackLocation016) return false
        if (this.outputBufferLength != other.outputBufferLength) return false
        if (this.inputBufferLength != other.inputBufferLength) return false
        if (this.ioControlCode != other.ioControlCode) return false
        if (this.type3InputBuffer != other.type3InputBuffer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.outputBufferLength.hashCode()
        result = 31 * result + this.inputBufferLength.hashCode()
        result = 31 * result + this.ioControlCode.hashCode()
        result = 31 * result + this.type3InputBuffer.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation016> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation016> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IoStackLocation016 =
                    IoStackLocation016(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: IoStackLocation016) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.outputBufferLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.inputBufferLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ioControlCode)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.type3InputBuffer)
                }
            }

        public operator fun invoke(
            outputBufferLength: UInt = 0u,
            inputBufferLength: UInt = 0u,
            ioControlCode: UInt = 0u,
            type3InputBuffer: MutPtr<CVoid> = MutPtr(0L),
        ): IoStackLocation016 =
            IoStackLocation016(
                outputBufferLength = outputBufferLength,
                inputBufferLength = inputBufferLength,
                ioControlCode = ioControlCode,
                type3InputBufferCtorArg = type3InputBuffer,
            )
    }
}

public class IoStackLocation014 internal constructor(
    public var outputBufferLength: UInt,
    public var inputBufferLength: UInt,
    public var fsControlCode: UInt,
    type3InputBufferCtorArg: MutPtr<CVoid>,
) {
    public var type3InputBuffer: MutPtr<CVoid> = type3InputBufferCtorArg
        internal set

    public constructor() : this(
        outputBufferLength = 0u,
        inputBufferLength = 0u,
        fsControlCode = 0u,
        type3InputBufferCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.outputBufferLength

    public operator fun component2(): UInt = this.inputBufferLength

    public operator fun component3(): UInt = this.fsControlCode

    public operator fun component4(): MutPtr<CVoid> = this.type3InputBuffer

    public fun copy(outputBufferLength: UInt = this.outputBufferLength, inputBufferLength: UInt = this.inputBufferLength, fsControlCode: UInt = this.fsControlCode, type3InputBuffer: MutPtr<CVoid> = this.type3InputBuffer): IoStackLocation014 = IoStackLocation014(outputBufferLength = outputBufferLength, inputBufferLength = inputBufferLength, fsControlCode = fsControlCode, type3InputBufferCtorArg = type3InputBuffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoStackLocation014) return false
        if (this.outputBufferLength != other.outputBufferLength) return false
        if (this.inputBufferLength != other.inputBufferLength) return false
        if (this.fsControlCode != other.fsControlCode) return false
        if (this.type3InputBuffer != other.type3InputBuffer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.outputBufferLength.hashCode()
        result = 31 * result + this.inputBufferLength.hashCode()
        result = 31 * result + this.fsControlCode.hashCode()
        result = 31 * result + this.type3InputBuffer.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation014> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation014> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IoStackLocation014 =
                    IoStackLocation014(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: IoStackLocation014) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.outputBufferLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.inputBufferLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.fsControlCode)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.type3InputBuffer)
                }
            }

        public operator fun invoke(
            outputBufferLength: UInt = 0u,
            inputBufferLength: UInt = 0u,
            fsControlCode: UInt = 0u,
            type3InputBuffer: MutPtr<CVoid> = MutPtr(0L),
        ): IoStackLocation014 =
            IoStackLocation014(
                outputBufferLength = outputBufferLength,
                inputBufferLength = inputBufferLength,
                fsControlCode = fsControlCode,
                type3InputBufferCtorArg = type3InputBuffer,
            )
    }
}

public class IoStackLocation027 internal constructor(
    ioResourceRequirementListCtorArg: MutPtr<IoResourceRequirementsList>,
) {
    public var ioResourceRequirementList: MutPtr<IoResourceRequirementsList> = ioResourceRequirementListCtorArg
        internal set

    public constructor() : this(
        ioResourceRequirementListCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<IoResourceRequirementsList> = this.ioResourceRequirementList

    public fun copy(ioResourceRequirementList: MutPtr<IoResourceRequirementsList> = this.ioResourceRequirementList): IoStackLocation027 = IoStackLocation027(ioResourceRequirementListCtorArg = ioResourceRequirementList)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoStackLocation027) return false
        if (this.ioResourceRequirementList != other.ioResourceRequirementList) return false
        return true
    }

    override fun hashCode(): Int = this.ioResourceRequirementList.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation027> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation027> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IoStackLocation027 =
                    IoStackLocation027(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<IoResourceRequirementsList>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: IoStackLocation027) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<IoResourceRequirementsList>(64)
                    ).writeNative(addr, value.ioResourceRequirementList)
                }
            }

        public operator fun invoke(
            ioResourceRequirementList: MutPtr<IoResourceRequirementsList> = MutPtr(0L),
        ): IoStackLocation027 =
            IoStackLocation027(
                ioResourceRequirementListCtorArg = ioResourceRequirementList,
            )
    }
}

public class IoStackLocation015 internal constructor(
    lengthCtorArg: MutPtr<Long>,
    public var key: UInt,
    public var byteOffset: Long,
) {
    public var length: MutPtr<Long> = lengthCtorArg
        internal set

    public constructor() : this(
        lengthCtorArg = MutPtr(0L),
        key = 0u,
        byteOffset = 0L,
    )

    public operator fun component1(): MutPtr<Long> = this.length

    public operator fun component2(): UInt = this.key

    public operator fun component3(): Long = this.byteOffset

    public fun copy(length: MutPtr<Long> = this.length, key: UInt = this.key, byteOffset: Long = this.byteOffset): IoStackLocation015 = IoStackLocation015(lengthCtorArg = length, key = key, byteOffset = byteOffset)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoStackLocation015) return false
        if (this.length != other.length) return false
        if (this.key != other.key) return false
        if (this.byteOffset != other.byteOffset) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.key.hashCode()
        result = 31 * result + this.byteOffset.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation015> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation015> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IoStackLocation015 =
                    IoStackLocation015(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Long>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: IoStackLocation015) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Long>(64)
                    ).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.key)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 12L, value.byteOffset)
                }
            }

        public operator fun invoke(
            length: MutPtr<Long> = MutPtr(0L),
            key: UInt = 0u,
            byteOffset: Long = 0L,
        ): IoStackLocation015 =
            IoStackLocation015(
                lengthCtorArg = length,
                key = key,
                byteOffset = byteOffset,
            )
    }
}

public class IoStackLocation019 internal constructor(
    vpbCtorArg: MutPtr<Vpb>,
    deviceObjectCtorArg: MutPtr<DeviceObject>,
) {
    public var vpb: MutPtr<Vpb> = vpbCtorArg
        internal set

    public var deviceObject: MutPtr<DeviceObject> = deviceObjectCtorArg
        internal set

    public constructor() : this(
        vpbCtorArg = MutPtr(0L),
        deviceObjectCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Vpb> = this.vpb

    public operator fun component2(): MutPtr<DeviceObject> = this.deviceObject

    public fun copy(vpb: MutPtr<Vpb> = this.vpb, deviceObject: MutPtr<DeviceObject> = this.deviceObject): IoStackLocation019 = IoStackLocation019(vpbCtorArg = vpb, deviceObjectCtorArg = deviceObject)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoStackLocation019) return false
        if (this.vpb != other.vpb) return false
        if (this.deviceObject != other.deviceObject) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.vpb.hashCode()
        result = 31 * result + this.deviceObject.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation019> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation019> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IoStackLocation019 =
                    IoStackLocation019(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Vpb>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<DeviceObject>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: IoStackLocation019) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Vpb>(64)
                    ).writeNative(addr, value.vpb)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<DeviceObject>(64)
                    ).writeNative(addr + 8L, value.deviceObject)
                }
            }

        public operator fun invoke(
            vpb: MutPtr<Vpb> = MutPtr(0L),
            deviceObject: MutPtr<DeviceObject> = MutPtr(0L),
        ): IoStackLocation019 =
            IoStackLocation019(
                vpbCtorArg = vpb,
                deviceObjectCtorArg = deviceObject,
            )
    }
}

public data class IoStackLocation07(
    public var length: UInt = 0u,
    public var completionFilter: UInt = 0u,
    public var directoryNotifyInformationClass: DirectoryNotifyInformationClass = 0,
)

public data class IoStackLocation06(
    public var length: UInt = 0u,
    public var completionFilter: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation06> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation06> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IoStackLocation06 =
                    IoStackLocation06(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: IoStackLocation06) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.completionFilter)
                }
            }
    }
}

public class IoStackLocation038 internal constructor(
    argument1CtorArg: MutPtr<CVoid>,
    argument2CtorArg: MutPtr<CVoid>,
    argument3CtorArg: MutPtr<CVoid>,
    argument4CtorArg: MutPtr<CVoid>,
) {
    public var argument1: MutPtr<CVoid> = argument1CtorArg
        internal set

    public var argument2: MutPtr<CVoid> = argument2CtorArg
        internal set

    public var argument3: MutPtr<CVoid> = argument3CtorArg
        internal set

    public var argument4: MutPtr<CVoid> = argument4CtorArg
        internal set

    public constructor() : this(
        argument1CtorArg = MutPtr(0L),
        argument2CtorArg = MutPtr(0L),
        argument3CtorArg = MutPtr(0L),
        argument4CtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.argument1

    public operator fun component2(): MutPtr<CVoid> = this.argument2

    public operator fun component3(): MutPtr<CVoid> = this.argument3

    public operator fun component4(): MutPtr<CVoid> = this.argument4

    public fun copy(argument1: MutPtr<CVoid> = this.argument1, argument2: MutPtr<CVoid> = this.argument2, argument3: MutPtr<CVoid> = this.argument3, argument4: MutPtr<CVoid> = this.argument4): IoStackLocation038 = IoStackLocation038(argument1CtorArg = argument1, argument2CtorArg = argument2, argument3CtorArg = argument3, argument4CtorArg = argument4)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoStackLocation038) return false
        if (this.argument1 != other.argument1) return false
        if (this.argument2 != other.argument2) return false
        if (this.argument3 != other.argument3) return false
        if (this.argument4 != other.argument4) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.argument1.hashCode()
        result = 31 * result + this.argument2.hashCode()
        result = 31 * result + this.argument3.hashCode()
        result = 31 * result + this.argument4.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation038> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation038> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IoStackLocation038 =
                    IoStackLocation038(
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
                    )
                override fun writeNative(addr: Long, value: IoStackLocation038) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.argument1)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.argument2)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.argument3)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.argument4)
                }
            }

        public operator fun invoke(
            argument1: MutPtr<CVoid> = MutPtr(0L),
            argument2: MutPtr<CVoid> = MutPtr(0L),
            argument3: MutPtr<CVoid> = MutPtr(0L),
            argument4: MutPtr<CVoid> = MutPtr(0L),
        ): IoStackLocation038 =
            IoStackLocation038(
                argument1CtorArg = argument1,
                argument2CtorArg = argument2,
                argument3CtorArg = argument3,
                argument4CtorArg = argument4,
            )
    }
}

public class IoStackLocation034 internal constructor(
    powerSequenceCtorArg: MutPtr<PowerSequence>,
) {
    public var powerSequence: MutPtr<PowerSequence> = powerSequenceCtorArg
        internal set

    public constructor() : this(
        powerSequenceCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<PowerSequence> = this.powerSequence

    public fun copy(powerSequence: MutPtr<PowerSequence> = this.powerSequence): IoStackLocation034 = IoStackLocation034(powerSequenceCtorArg = powerSequence)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoStackLocation034) return false
        if (this.powerSequence != other.powerSequence) return false
        return true
    }

    override fun hashCode(): Int = this.powerSequence.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation034> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation034> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IoStackLocation034 =
                    IoStackLocation034(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<PowerSequence>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: IoStackLocation034) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<PowerSequence>(64)
                    ).writeNative(addr, value.powerSequence)
                }
            }

        public operator fun invoke(
            powerSequence: MutPtr<PowerSequence> = MutPtr(0L),
        ): IoStackLocation034 =
            IoStackLocation034(
                powerSequenceCtorArg = powerSequence,
            )
    }
}

public data class IoStackLocation035(
    public var anonymous: IoStackLocation0350 = IoStackLocation0350(),
    public var type: PowerStateType = 0,
    public var state: PowerState = PowerState(),
    public var shutdownType: PowerAction = 0,
)

public data class IoStackLocation0350(
    public var systemContext: UInt = 0u,
    public var systemPowerStateContext: SystemPowerStateContext = SystemPowerStateContext(),
)

public data class IoStackLocation024(
    public var type: DeviceRelationType = 0,
)

public data class IoStackLocation031(
    public var deviceTextType: DeviceTextType = 0,
    public var localeId: UInt = 0u,
)

public class IoStackLocation05 internal constructor(
    public var length: UInt,
    fileNameCtorArg: MutPtr<UnicodeString>,
    public var fileInformationClass: FileInformationClass,
    public var fileIndex: UInt,
) {
    public var fileName: MutPtr<UnicodeString> = fileNameCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        fileNameCtorArg = MutPtr(0L),
        fileInformationClass = 0,
        fileIndex = 0u,
    )

    public operator fun component1(): UInt = this.length

    public operator fun component2(): MutPtr<UnicodeString> = this.fileName

    public operator fun component3(): FileInformationClass = this.fileInformationClass

    public operator fun component4(): UInt = this.fileIndex

    public fun copy(length: UInt = this.length, fileName: MutPtr<UnicodeString> = this.fileName, fileInformationClass: FileInformationClass = this.fileInformationClass, fileIndex: UInt = this.fileIndex): IoStackLocation05 = IoStackLocation05(length = length, fileNameCtorArg = fileName, fileInformationClass = fileInformationClass, fileIndex = fileIndex)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoStackLocation05) return false
        if (this.length != other.length) return false
        if (this.fileName != other.fileName) return false
        if (this.fileInformationClass != other.fileInformationClass) return false
        if (this.fileIndex != other.fileIndex) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.fileName.hashCode()
        result = 31 * result + this.fileInformationClass.hashCode()
        result = 31 * result + this.fileIndex.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            length: UInt = 0u,
            fileName: MutPtr<UnicodeString> = MutPtr(0L),
            fileInformationClass: FileInformationClass = 0,
            fileIndex: UInt = 0u,
        ): IoStackLocation05 =
            IoStackLocation05(
                length = length,
                fileNameCtorArg = fileName,
                fileInformationClass = fileInformationClass,
                fileIndex = fileIndex,
            )
    }
}

public class IoStackLocation010 internal constructor(
    public var length: UInt,
    eaListCtorArg: MutPtr<CVoid>,
    public var eaListLength: UInt,
    public var eaIndex: UInt,
) {
    public var eaList: MutPtr<CVoid> = eaListCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        eaListCtorArg = MutPtr(0L),
        eaListLength = 0u,
        eaIndex = 0u,
    )

    public operator fun component1(): UInt = this.length

    public operator fun component2(): MutPtr<CVoid> = this.eaList

    public operator fun component3(): UInt = this.eaListLength

    public operator fun component4(): UInt = this.eaIndex

    public fun copy(length: UInt = this.length, eaList: MutPtr<CVoid> = this.eaList, eaListLength: UInt = this.eaListLength, eaIndex: UInt = this.eaIndex): IoStackLocation010 = IoStackLocation010(length = length, eaListCtorArg = eaList, eaListLength = eaListLength, eaIndex = eaIndex)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoStackLocation010) return false
        if (this.length != other.length) return false
        if (this.eaList != other.eaList) return false
        if (this.eaListLength != other.eaListLength) return false
        if (this.eaIndex != other.eaIndex) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.eaList.hashCode()
        result = 31 * result + this.eaListLength.hashCode()
        result = 31 * result + this.eaIndex.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation010> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation010> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IoStackLocation010 =
                    IoStackLocation010(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: IoStackLocation010) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.eaList)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.eaListLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.eaIndex)
                }
            }

        public operator fun invoke(
            length: UInt = 0u,
            eaList: MutPtr<CVoid> = MutPtr(0L),
            eaListLength: UInt = 0u,
            eaIndex: UInt = 0u,
        ): IoStackLocation010 =
            IoStackLocation010(
                length = length,
                eaListCtorArg = eaList,
                eaListLength = eaListLength,
                eaIndex = eaIndex,
            )
    }
}

public data class IoStackLocation08(
    public var length: UInt = 0u,
    public var fileInformationClass: FileInformationClass = 0,
)

public data class IoStackLocation030(
    public var idType: BusQueryIdType = 0,
)

public class IoStackLocation025 internal constructor(
    interfaceTypeCtorArg: ConstPtr<Guid>,
    public var size: UShort,
    public var version: UShort,
    ifaceCtorArg: MutPtr<Interface>,
    interfaceSpecificDataCtorArg: MutPtr<CVoid>,
) {
    public var interfaceType: ConstPtr<Guid> = interfaceTypeCtorArg
        internal set

    public var iface: MutPtr<Interface> = ifaceCtorArg
        internal set

    public var interfaceSpecificData: MutPtr<CVoid> = interfaceSpecificDataCtorArg
        internal set

    public constructor() : this(
        interfaceTypeCtorArg = ConstPtr(0L),
        size = 0u,
        version = 0u,
        ifaceCtorArg = MutPtr(0L),
        interfaceSpecificDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ConstPtr<Guid> = this.interfaceType

    public operator fun component2(): UShort = this.size

    public operator fun component3(): UShort = this.version

    public operator fun component4(): MutPtr<Interface> = this.iface

    public operator fun component5(): MutPtr<CVoid> = this.interfaceSpecificData

    public fun copy(interfaceType: ConstPtr<Guid> = this.interfaceType, size: UShort = this.size, version: UShort = this.version, iface: MutPtr<Interface> = this.iface, interfaceSpecificData: MutPtr<CVoid> = this.interfaceSpecificData): IoStackLocation025 = IoStackLocation025(interfaceTypeCtorArg = interfaceType, size = size, version = version, ifaceCtorArg = iface, interfaceSpecificDataCtorArg = interfaceSpecificData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoStackLocation025) return false
        if (this.interfaceType != other.interfaceType) return false
        if (this.size != other.size) return false
        if (this.version != other.version) return false
        if (this.iface != other.iface) return false
        if (this.interfaceSpecificData != other.interfaceSpecificData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.interfaceType.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.iface.hashCode()
        result = 31 * result + this.interfaceSpecificData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation025> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation025> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IoStackLocation025 =
                    IoStackLocation025(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<Guid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Interface>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: IoStackLocation025) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<Guid>(64)
                    ).writeNative(addr, value.interfaceType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.version)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Interface>(64)
                    ).writeNative(addr + 16L, value.iface)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.interfaceSpecificData)
                }
            }

        public operator fun invoke(
            interfaceType: ConstPtr<Guid> = ConstPtr(0L),
            size: UShort = 0u,
            version: UShort = 0u,
            iface: MutPtr<Interface> = MutPtr(0L),
            interfaceSpecificData: MutPtr<CVoid> = MutPtr(0L),
        ): IoStackLocation025 =
            IoStackLocation025(
                interfaceTypeCtorArg = interfaceType,
                size = size,
                version = version,
                ifaceCtorArg = iface,
                interfaceSpecificDataCtorArg = interfaceSpecificData,
            )
    }
}

public class IoStackLocation022 internal constructor(
    public var length: UInt,
    startSidCtorArg: Psid,
    sidListCtorArg: MutPtr<FileGetQuotaInformation>,
    public var sidListLength: UInt,
) {
    public var startSid: Psid = startSidCtorArg
        internal set

    public var sidList: MutPtr<FileGetQuotaInformation> = sidListCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        startSidCtorArg = MutPtr(0L),
        sidListCtorArg = MutPtr(0L),
        sidListLength = 0u,
    )

    public operator fun component1(): UInt = this.length

    public operator fun component2(): Psid = this.startSid

    public operator fun component3(): MutPtr<FileGetQuotaInformation> = this.sidList

    public operator fun component4(): UInt = this.sidListLength

    public fun copy(length: UInt = this.length, startSid: Psid = this.startSid, sidList: MutPtr<FileGetQuotaInformation> = this.sidList, sidListLength: UInt = this.sidListLength): IoStackLocation022 = IoStackLocation022(length = length, startSidCtorArg = startSid, sidListCtorArg = sidList, sidListLength = sidListLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoStackLocation022) return false
        if (this.length != other.length) return false
        if (this.startSid != other.startSid) return false
        if (this.sidList != other.sidList) return false
        if (this.sidListLength != other.sidListLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.startSid.hashCode()
        result = 31 * result + this.sidList.hashCode()
        result = 31 * result + this.sidListLength.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            length: UInt = 0u,
            startSid: Psid = MutPtr(0L),
            sidList: MutPtr<FileGetQuotaInformation> = MutPtr(0L),
            sidListLength: UInt = 0u,
        ): IoStackLocation022 =
            IoStackLocation022(
                length = length,
                startSidCtorArg = startSid,
                sidListCtorArg = sidList,
                sidListLength = sidListLength,
            )
    }
}

public data class IoStackLocation017(
    public var securityInformation: UInt = 0u,
    public var length: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation017> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation017> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IoStackLocation017 =
                    IoStackLocation017(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: IoStackLocation017) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.securityInformation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.length)
                }
            }
    }
}

public data class IoStackLocation012(
    public var length: UInt = 0u,
    public var fsInformationClass: FsInformationClass = 0,
)

public class IoStackLocation028 internal constructor(
    public var whichSpace: UInt,
    bufferCtorArg: MutPtr<CVoid>,
    public var offset: UInt,
    public var length: UInt,
) {
    public var buffer: MutPtr<CVoid> = bufferCtorArg
        internal set

    public constructor() : this(
        whichSpace = 0u,
        bufferCtorArg = MutPtr(0L),
        offset = 0u,
        length = 0u,
    )

    public operator fun component1(): UInt = this.whichSpace

    public operator fun component2(): MutPtr<CVoid> = this.buffer

    public operator fun component3(): UInt = this.offset

    public operator fun component4(): UInt = this.length

    public fun copy(whichSpace: UInt = this.whichSpace, buffer: MutPtr<CVoid> = this.buffer, offset: UInt = this.offset, length: UInt = this.length): IoStackLocation028 = IoStackLocation028(whichSpace = whichSpace, bufferCtorArg = buffer, offset = offset, length = length)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoStackLocation028) return false
        if (this.whichSpace != other.whichSpace) return false
        if (this.buffer != other.buffer) return false
        if (this.offset != other.offset) return false
        if (this.length != other.length) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.whichSpace.hashCode()
        result = 31 * result + this.buffer.hashCode()
        result = 31 * result + this.offset.hashCode()
        result = 31 * result + this.length.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation028> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation028> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IoStackLocation028 =
                    IoStackLocation028(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: IoStackLocation028) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.whichSpace)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.buffer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.offset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.length)
                }
            }

        public operator fun invoke(
            whichSpace: UInt = 0u,
            buffer: MutPtr<CVoid> = MutPtr(0L),
            offset: UInt = 0u,
            length: UInt = 0u,
        ): IoStackLocation028 =
            IoStackLocation028(
                whichSpace = whichSpace,
                bufferCtorArg = buffer,
                offset = offset,
                length = length,
            )
    }
}

public data class IoStackLocation03(
    public var length: UInt = 0u,
    public var key: UInt = 0u,
    public var byteOffset: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation03> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation03> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IoStackLocation03 =
                    IoStackLocation03(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: IoStackLocation03) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.key)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.byteOffset)
                }
            }
    }
}

public class IoStackLocation021 internal constructor(
    srbCtorArg: MutPtr<ScsiRequestBlock>,
) {
    public var srb: MutPtr<ScsiRequestBlock> = srbCtorArg
        internal set

    public constructor() : this(
        srbCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<ScsiRequestBlock> = this.srb

    public fun copy(srb: MutPtr<ScsiRequestBlock> = this.srb): IoStackLocation021 = IoStackLocation021(srbCtorArg = srb)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoStackLocation021) return false
        if (this.srb != other.srb) return false
        return true
    }

    override fun hashCode(): Int = this.srb.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation021> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation021> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IoStackLocation021 =
                    IoStackLocation021(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<ScsiRequestBlock>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: IoStackLocation021) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<ScsiRequestBlock>(64)
                    ).writeNative(addr, value.srb)
                }
            }

        public operator fun invoke(
            srb: MutPtr<ScsiRequestBlock> = MutPtr(0L),
        ): IoStackLocation021 =
            IoStackLocation021(
                srbCtorArg = srb,
            )
    }
}

public data class IoStackLocation011(
    public var length: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation011> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation011> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IoStackLocation011 =
                    IoStackLocation011(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: IoStackLocation011) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                }
            }
    }
}

public class IoStackLocation09 internal constructor(
    public var length: UInt,
    public var fileInformationClass: FileInformationClass,
    fileObjectCtorArg: MutPtr<FileObject>,
    public var anonymous: IoStackLocation090,
) {
    public var fileObject: MutPtr<FileObject> = fileObjectCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        fileInformationClass = 0,
        fileObjectCtorArg = MutPtr(0L),
        anonymous = IoStackLocation090(),
    )

    public operator fun component1(): UInt = this.length

    public operator fun component2(): FileInformationClass = this.fileInformationClass

    public operator fun component3(): MutPtr<FileObject> = this.fileObject

    public operator fun component4(): IoStackLocation090 = this.anonymous

    public fun copy(length: UInt = this.length, fileInformationClass: FileInformationClass = this.fileInformationClass, fileObject: MutPtr<FileObject> = this.fileObject, anonymous: IoStackLocation090 = this.anonymous): IoStackLocation09 = IoStackLocation09(length = length, fileInformationClass = fileInformationClass, fileObjectCtorArg = fileObject, anonymous = anonymous)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoStackLocation09) return false
        if (this.length != other.length) return false
        if (this.fileInformationClass != other.fileInformationClass) return false
        if (this.fileObject != other.fileObject) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.fileInformationClass.hashCode()
        result = 31 * result + this.fileObject.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            length: UInt = 0u,
            fileInformationClass: FileInformationClass = 0,
            fileObject: MutPtr<FileObject> = MutPtr(0L),
            anonymous: IoStackLocation090 = IoStackLocation090(),
        ): IoStackLocation09 =
            IoStackLocation09(
                length = length,
                fileInformationClass = fileInformationClass,
                fileObjectCtorArg = fileObject,
                anonymous = anonymous,
            )
    }
}

public class IoStackLocation090 internal constructor(
    public var anonymous: IoStackLocation0900,
    public var clusterCount: UInt,
    deleteHandleCtorArg: Handle,
) {
    public var deleteHandle: Handle = deleteHandleCtorArg
        internal set

    public constructor() : this(
        anonymous = IoStackLocation0900(),
        clusterCount = 0u,
        deleteHandleCtorArg = MutPtr(0L),
    )

    public operator fun component1(): IoStackLocation0900 = this.anonymous

    public operator fun component2(): UInt = this.clusterCount

    public operator fun component3(): Handle = this.deleteHandle

    public fun copy(anonymous: IoStackLocation0900 = this.anonymous, clusterCount: UInt = this.clusterCount, deleteHandle: Handle = this.deleteHandle): IoStackLocation090 = IoStackLocation090(anonymous = anonymous, clusterCount = clusterCount, deleteHandleCtorArg = deleteHandle)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoStackLocation090) return false
        if (this.anonymous != other.anonymous) return false
        if (this.clusterCount != other.clusterCount) return false
        if (this.deleteHandle != other.deleteHandle) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.clusterCount.hashCode()
        result = 31 * result + this.deleteHandle.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            anonymous: IoStackLocation0900 = IoStackLocation0900(),
            clusterCount: UInt = 0u,
            deleteHandle: Handle = MutPtr(0L),
        ): IoStackLocation090 =
            IoStackLocation090(
                anonymous = anonymous,
                clusterCount = clusterCount,
                deleteHandleCtorArg = deleteHandle,
            )
    }
}

public data class IoStackLocation0900(
    public var replaceIfExists: Boolean = false,
    public var advanceOnly: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation0900> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation0900> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): IoStackLocation0900 =
                    IoStackLocation0900(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: IoStackLocation0900) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.replaceIfExists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 1L, value.advanceOnly)
                }
            }
    }
}

public data class IoStackLocation029(
    public var lock: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation029> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation029> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): IoStackLocation029 =
                    IoStackLocation029(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: IoStackLocation029) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.lock)
                }
            }
    }
}

public data class IoStackLocation023(
    public var length: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation023> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation023> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IoStackLocation023 =
                    IoStackLocation023(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: IoStackLocation023) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                }
            }
    }
}

public class IoStackLocation018 internal constructor(
    public var securityInformation: UInt,
    securityDescriptorCtorArg: PsecurityDescriptor,
) {
    public var securityDescriptor: PsecurityDescriptor = securityDescriptorCtorArg
        internal set

    public constructor() : this(
        securityInformation = 0u,
        securityDescriptorCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.securityInformation

    public operator fun component2(): PsecurityDescriptor = this.securityDescriptor

    public fun copy(securityInformation: UInt = this.securityInformation, securityDescriptor: PsecurityDescriptor = this.securityDescriptor): IoStackLocation018 = IoStackLocation018(securityInformation = securityInformation, securityDescriptorCtorArg = securityDescriptor)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoStackLocation018) return false
        if (this.securityInformation != other.securityInformation) return false
        if (this.securityDescriptor != other.securityDescriptor) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.securityInformation.hashCode()
        result = 31 * result + this.securityDescriptor.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            securityInformation: UInt = 0u,
            securityDescriptor: PsecurityDescriptor = MutPtr(0L),
        ): IoStackLocation018 =
            IoStackLocation018(
                securityInformation = securityInformation,
                securityDescriptorCtorArg = securityDescriptor,
            )
    }
}

public data class IoStackLocation013(
    public var length: UInt = 0u,
    public var fsInformationClass: FsInformationClass = 0,
)

public class IoStackLocation036 internal constructor(
    allocatedResourcesCtorArg: MutPtr<CmResourceList>,
    allocatedResourcesTranslatedCtorArg: MutPtr<CmResourceList>,
) {
    public var allocatedResources: MutPtr<CmResourceList> = allocatedResourcesCtorArg
        internal set

    public var allocatedResourcesTranslated: MutPtr<CmResourceList> = allocatedResourcesTranslatedCtorArg
        internal set

    public constructor() : this(
        allocatedResourcesCtorArg = MutPtr(0L),
        allocatedResourcesTranslatedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CmResourceList> = this.allocatedResources

    public operator fun component2(): MutPtr<CmResourceList> = this.allocatedResourcesTranslated

    public fun copy(allocatedResources: MutPtr<CmResourceList> = this.allocatedResources, allocatedResourcesTranslated: MutPtr<CmResourceList> = this.allocatedResourcesTranslated): IoStackLocation036 = IoStackLocation036(allocatedResourcesCtorArg = allocatedResources, allocatedResourcesTranslatedCtorArg = allocatedResourcesTranslated)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoStackLocation036) return false
        if (this.allocatedResources != other.allocatedResources) return false
        if (this.allocatedResourcesTranslated != other.allocatedResourcesTranslated) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.allocatedResources.hashCode()
        result = 31 * result + this.allocatedResourcesTranslated.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation036> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation036> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IoStackLocation036 =
                    IoStackLocation036(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CmResourceList>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CmResourceList>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: IoStackLocation036) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CmResourceList>(64)
                    ).writeNative(addr, value.allocatedResources)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CmResourceList>(64)
                    ).writeNative(addr + 8L, value.allocatedResourcesTranslated)
                }
            }

        public operator fun invoke(
            allocatedResources: MutPtr<CmResourceList> = MutPtr(0L),
            allocatedResourcesTranslated: MutPtr<CmResourceList> = MutPtr(0L),
        ): IoStackLocation036 =
            IoStackLocation036(
                allocatedResourcesCtorArg = allocatedResources,
                allocatedResourcesTranslatedCtorArg = allocatedResourcesTranslated,
            )
    }
}

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

public class IoStackLocation020 internal constructor(
    vpbCtorArg: MutPtr<Vpb>,
    deviceObjectCtorArg: MutPtr<DeviceObject>,
) {
    public var vpb: MutPtr<Vpb> = vpbCtorArg
        internal set

    public var deviceObject: MutPtr<DeviceObject> = deviceObjectCtorArg
        internal set

    public constructor() : this(
        vpbCtorArg = MutPtr(0L),
        deviceObjectCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Vpb> = this.vpb

    public operator fun component2(): MutPtr<DeviceObject> = this.deviceObject

    public fun copy(vpb: MutPtr<Vpb> = this.vpb, deviceObject: MutPtr<DeviceObject> = this.deviceObject): IoStackLocation020 = IoStackLocation020(vpbCtorArg = vpb, deviceObjectCtorArg = deviceObject)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoStackLocation020) return false
        if (this.vpb != other.vpb) return false
        if (this.deviceObject != other.deviceObject) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.vpb.hashCode()
        result = 31 * result + this.deviceObject.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation020> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation020> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IoStackLocation020 =
                    IoStackLocation020(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Vpb>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<DeviceObject>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: IoStackLocation020) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Vpb>(64)
                    ).writeNative(addr, value.vpb)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<DeviceObject>(64)
                    ).writeNative(addr + 8L, value.deviceObject)
                }
            }

        public operator fun invoke(
            vpb: MutPtr<Vpb> = MutPtr(0L),
            deviceObject: MutPtr<DeviceObject> = MutPtr(0L),
        ): IoStackLocation020 =
            IoStackLocation020(
                vpbCtorArg = vpb,
                deviceObjectCtorArg = deviceObject,
            )
    }
}

public class IoStackLocation037 internal constructor(
    public var providerId: Int,
    dataPathCtorArg: MutPtr<CVoid>,
    public var bufferSize: UInt,
    bufferCtorArg: MutPtr<CVoid>,
) {
    public var dataPath: MutPtr<CVoid> = dataPathCtorArg
        internal set

    public var buffer: MutPtr<CVoid> = bufferCtorArg
        internal set

    public constructor() : this(
        providerId = 0,
        dataPathCtorArg = MutPtr(0L),
        bufferSize = 0u,
        bufferCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.providerId

    public operator fun component2(): MutPtr<CVoid> = this.dataPath

    public operator fun component3(): UInt = this.bufferSize

    public operator fun component4(): MutPtr<CVoid> = this.buffer

    public fun copy(providerId: Int = this.providerId, dataPath: MutPtr<CVoid> = this.dataPath, bufferSize: UInt = this.bufferSize, buffer: MutPtr<CVoid> = this.buffer): IoStackLocation037 = IoStackLocation037(providerId = providerId, dataPathCtorArg = dataPath, bufferSize = bufferSize, bufferCtorArg = buffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoStackLocation037) return false
        if (this.providerId != other.providerId) return false
        if (this.dataPath != other.dataPath) return false
        if (this.bufferSize != other.bufferSize) return false
        if (this.buffer != other.buffer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.providerId.hashCode()
        result = 31 * result + this.dataPath.hashCode()
        result = 31 * result + this.bufferSize.hashCode()
        result = 31 * result + this.buffer.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation037> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation037> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IoStackLocation037 =
                    IoStackLocation037(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: IoStackLocation037) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.providerId)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.dataPath)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.bufferSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.buffer)
                }
            }

        public operator fun invoke(
            providerId: Int = 0,
            dataPath: MutPtr<CVoid> = MutPtr(0L),
            bufferSize: UInt = 0u,
            buffer: MutPtr<CVoid> = MutPtr(0L),
        ): IoStackLocation037 =
            IoStackLocation037(
                providerId = providerId,
                dataPathCtorArg = dataPath,
                bufferSize = bufferSize,
                bufferCtorArg = buffer,
            )
    }
}

public data class IoStackLocation033(
    public var powerState: SystemPowerState = 0,
)

public data class IoStackLocation04(
    public var length: UInt = 0u,
    public var key: UInt = 0u,
    public var byteOffset: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation04> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStackLocation04> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IoStackLocation04 =
                    IoStackLocation04(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: IoStackLocation04) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.key)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.byteOffset)
                }
            }
    }
}

public class Irp internal constructor(
    public var type: Short,
    public var size: UShort,
    mdlAddressCtorArg: MutPtr<Mdl>,
    public var flags: UInt,
    public var associatedIrp: Irp0,
    public var threadListEntry: ListEntry,
    public var ioStatus: IoStatusBlock,
    public var requestorMode: Byte,
    public var pendingReturned: Boolean,
    public var stackCount: Byte,
    public var currentLocation: Byte,
    public var cancel: Boolean,
    public var cancelIrql: UByte,
    public var apcEnvironment: Byte,
    public var allocationFlags: UByte,
    public var anonymous: Irp1,
    userEventCtorArg: MutPtr<Kevent>,
    public var overlay: Irp2,
    public var cancelRoutine: DriverCancel,
    userBufferCtorArg: MutPtr<CVoid>,
    public var tail: Irp3,
) {
    public var mdlAddress: MutPtr<Mdl> = mdlAddressCtorArg
        internal set

    public var userEvent: MutPtr<Kevent> = userEventCtorArg
        internal set

    public var userBuffer: MutPtr<CVoid> = userBufferCtorArg
        internal set

    public constructor() : this(
        type = 0,
        size = 0u,
        mdlAddressCtorArg = MutPtr(0L),
        flags = 0u,
        associatedIrp = Irp0(),
        threadListEntry = ListEntry(),
        ioStatus = IoStatusBlock(),
        requestorMode = 0,
        pendingReturned = false,
        stackCount = 0,
        currentLocation = 0,
        cancel = false,
        cancelIrql = 0u,
        apcEnvironment = 0,
        allocationFlags = 0u,
        anonymous = Irp1(),
        userEventCtorArg = MutPtr(0L),
        overlay = Irp2(),
        cancelRoutine = null,
        userBufferCtorArg = MutPtr(0L),
        tail = Irp3(),
    )

    public companion object {
        public operator fun invoke(
            type: Short = 0,
            size: UShort = 0u,
            mdlAddress: MutPtr<Mdl> = MutPtr(0L),
            flags: UInt = 0u,
            associatedIrp: Irp0 = Irp0(),
            threadListEntry: ListEntry = ListEntry(),
            ioStatus: IoStatusBlock = IoStatusBlock(),
            requestorMode: Byte = 0,
            pendingReturned: Boolean = false,
            stackCount: Byte = 0,
            currentLocation: Byte = 0,
            cancel: Boolean = false,
            cancelIrql: UByte = 0u,
            apcEnvironment: Byte = 0,
            allocationFlags: UByte = 0u,
            anonymous: Irp1 = Irp1(),
            userEvent: MutPtr<Kevent> = MutPtr(0L),
            overlay: Irp2 = Irp2(),
            cancelRoutine: DriverCancel = null,
            userBuffer: MutPtr<CVoid> = MutPtr(0L),
            tail: Irp3 = Irp3(),
        ): Irp =
            Irp(
                type = type,
                size = size,
                mdlAddressCtorArg = mdlAddress,
                flags = flags,
                associatedIrp = associatedIrp,
                threadListEntry = threadListEntry,
                ioStatus = ioStatus,
                requestorMode = requestorMode,
                pendingReturned = pendingReturned,
                stackCount = stackCount,
                currentLocation = currentLocation,
                cancel = cancel,
                cancelIrql = cancelIrql,
                apcEnvironment = apcEnvironment,
                allocationFlags = allocationFlags,
                anonymous = anonymous,
                userEventCtorArg = userEvent,
                overlay = overlay,
                cancelRoutine = cancelRoutine,
                userBufferCtorArg = userBuffer,
                tail = tail,
            )
    }
}

public class Irp1 internal constructor(
    userIosbCtorArg: MutPtr<IoStatusBlock>,
    ioRingContextCtorArg: MutPtr<CVoid>,
) {
    public var userIosb: MutPtr<IoStatusBlock> = userIosbCtorArg
        internal set

    public var ioRingContext: MutPtr<CVoid> = ioRingContextCtorArg
        internal set

    public constructor() : this(
        userIosbCtorArg = MutPtr(0L),
        ioRingContextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<IoStatusBlock> = this.userIosb

    public operator fun component2(): MutPtr<CVoid> = this.ioRingContext

    public fun copy(userIosb: MutPtr<IoStatusBlock> = this.userIosb, ioRingContext: MutPtr<CVoid> = this.ioRingContext): Irp1 = Irp1(userIosbCtorArg = userIosb, ioRingContextCtorArg = ioRingContext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Irp1) return false
        if (this.userIosb != other.userIosb) return false
        if (this.ioRingContext != other.ioRingContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.userIosb.hashCode()
        result = 31 * result + this.ioRingContext.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            userIosb: MutPtr<IoStatusBlock> = MutPtr(0L),
            ioRingContext: MutPtr<CVoid> = MutPtr(0L),
        ): Irp1 =
            Irp1(
                userIosbCtorArg = userIosb,
                ioRingContextCtorArg = ioRingContext,
            )
    }
}

public class Irp0 internal constructor(
    masterIrpCtorArg: MutPtr<Irp>,
    public var irpCount: Int,
    systemBufferCtorArg: MutPtr<CVoid>,
) {
    public var masterIrp: MutPtr<Irp> = masterIrpCtorArg
        internal set

    public var systemBuffer: MutPtr<CVoid> = systemBufferCtorArg
        internal set

    public constructor() : this(
        masterIrpCtorArg = MutPtr(0L),
        irpCount = 0,
        systemBufferCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Irp> = this.masterIrp

    public operator fun component2(): Int = this.irpCount

    public operator fun component3(): MutPtr<CVoid> = this.systemBuffer

    public fun copy(masterIrp: MutPtr<Irp> = this.masterIrp, irpCount: Int = this.irpCount, systemBuffer: MutPtr<CVoid> = this.systemBuffer): Irp0 = Irp0(masterIrpCtorArg = masterIrp, irpCount = irpCount, systemBufferCtorArg = systemBuffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Irp0) return false
        if (this.masterIrp != other.masterIrp) return false
        if (this.irpCount != other.irpCount) return false
        if (this.systemBuffer != other.systemBuffer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.masterIrp.hashCode()
        result = 31 * result + this.irpCount.hashCode()
        result = 31 * result + this.systemBuffer.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            masterIrp: MutPtr<Irp> = MutPtr(0L),
            irpCount: Int = 0,
            systemBuffer: MutPtr<CVoid> = MutPtr(0L),
        ): Irp0 =
            Irp0(
                masterIrpCtorArg = masterIrp,
                irpCount = irpCount,
                systemBufferCtorArg = systemBuffer,
            )
    }
}

public data class Irp2(
    public var asynchronousParameters: Irp20 = Irp20(),
    public var allocationSize: Long = 0L,
)

public data class Irp20(
    public var anonymous1: Irp200 = Irp200(),
    public var anonymous2: Irp201 = Irp201(),
)

public class Irp200 internal constructor(
    public var userApcRoutine: PioApcRoutine,
    issuingProcessCtorArg: MutPtr<CVoid>,
) {
    public var issuingProcess: MutPtr<CVoid> = issuingProcessCtorArg
        internal set

    public constructor() : this(
        userApcRoutine = null,
        issuingProcessCtorArg = MutPtr(0L),
    )

    public operator fun component1(): PioApcRoutine = this.userApcRoutine

    public operator fun component2(): MutPtr<CVoid> = this.issuingProcess

    public fun copy(userApcRoutine: PioApcRoutine = this.userApcRoutine, issuingProcess: MutPtr<CVoid> = this.issuingProcess): Irp200 = Irp200(userApcRoutine = userApcRoutine, issuingProcessCtorArg = issuingProcess)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Irp200) return false
        if (this.userApcRoutine != other.userApcRoutine) return false
        if (this.issuingProcess != other.issuingProcess) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.userApcRoutine.hashCode()
        result = 31 * result + this.issuingProcess.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            userApcRoutine: PioApcRoutine = null,
            issuingProcess: MutPtr<CVoid> = MutPtr(0L),
        ): Irp200 =
            Irp200(
                userApcRoutine = userApcRoutine,
                issuingProcessCtorArg = issuingProcess,
            )
    }
}

public class Irp201 internal constructor(
    userApcContextCtorArg: MutPtr<CVoid>,
    ioRingCtorArg: MutPtr<IoringObject>,
) {
    public var userApcContext: MutPtr<CVoid> = userApcContextCtorArg
        internal set

    public var ioRing: MutPtr<IoringObject> = ioRingCtorArg
        internal set

    public constructor() : this(
        userApcContextCtorArg = MutPtr(0L),
        ioRingCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.userApcContext

    public operator fun component2(): MutPtr<IoringObject> = this.ioRing

    public fun copy(userApcContext: MutPtr<CVoid> = this.userApcContext, ioRing: MutPtr<IoringObject> = this.ioRing): Irp201 = Irp201(userApcContextCtorArg = userApcContext, ioRingCtorArg = ioRing)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Irp201) return false
        if (this.userApcContext != other.userApcContext) return false
        if (this.ioRing != other.ioRing) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.userApcContext.hashCode()
        result = 31 * result + this.ioRing.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            userApcContext: MutPtr<CVoid> = MutPtr(0L),
            ioRing: MutPtr<IoringObject> = MutPtr(0L),
        ): Irp201 =
            Irp201(
                userApcContextCtorArg = userApcContext,
                ioRingCtorArg = ioRing,
            )
    }
}

public class Irp3 internal constructor(
    public var overlay: Irp30,
    public var apc: Kapc,
    completionKeyCtorArg: MutPtr<CVoid>,
) {
    public var completionKey: MutPtr<CVoid> = completionKeyCtorArg
        internal set

    public constructor() : this(
        overlay = Irp30(),
        apc = Kapc(),
        completionKeyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Irp30 = this.overlay

    public operator fun component2(): Kapc = this.apc

    public operator fun component3(): MutPtr<CVoid> = this.completionKey

    public fun copy(overlay: Irp30 = this.overlay, apc: Kapc = this.apc, completionKey: MutPtr<CVoid> = this.completionKey): Irp3 = Irp3(overlay = overlay, apc = apc, completionKeyCtorArg = completionKey)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Irp3) return false
        if (this.overlay != other.overlay) return false
        if (this.apc != other.apc) return false
        if (this.completionKey != other.completionKey) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.overlay.hashCode()
        result = 31 * result + this.apc.hashCode()
        result = 31 * result + this.completionKey.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            overlay: Irp30 = Irp30(),
            apc: Kapc = Kapc(),
            completionKey: MutPtr<CVoid> = MutPtr(0L),
        ): Irp3 =
            Irp3(
                overlay = overlay,
                apc = apc,
                completionKeyCtorArg = completionKey,
            )
    }
}

public class Irp30 internal constructor(
    public var anonymous1: Irp300,
    public var thread: Pethread,
    auxiliaryBufferCtorArg: Pstr,
    public var anonymous2: Irp301,
    originalFileObjectCtorArg: MutPtr<FileObject>,
) {
    public var auxiliaryBuffer: Pstr = auxiliaryBufferCtorArg
        internal set

    public var originalFileObject: MutPtr<FileObject> = originalFileObjectCtorArg
        internal set

    public constructor() : this(
        anonymous1 = Irp300(),
        thread = 0L,
        auxiliaryBufferCtorArg = MutPtr(0L),
        anonymous2 = Irp301(),
        originalFileObjectCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Irp300 = this.anonymous1

    public operator fun component2(): Pethread = this.thread

    public operator fun component3(): Pstr = this.auxiliaryBuffer

    public operator fun component4(): Irp301 = this.anonymous2

    public operator fun component5(): MutPtr<FileObject> = this.originalFileObject

    public fun copy(anonymous1: Irp300 = this.anonymous1, thread: Pethread = this.thread, auxiliaryBuffer: Pstr = this.auxiliaryBuffer, anonymous2: Irp301 = this.anonymous2, originalFileObject: MutPtr<FileObject> = this.originalFileObject): Irp30 = Irp30(anonymous1 = anonymous1, thread = thread, auxiliaryBufferCtorArg = auxiliaryBuffer, anonymous2 = anonymous2, originalFileObjectCtorArg = originalFileObject)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Irp30) return false
        if (this.anonymous1 != other.anonymous1) return false
        if (this.thread != other.thread) return false
        if (this.auxiliaryBuffer != other.auxiliaryBuffer) return false
        if (this.anonymous2 != other.anonymous2) return false
        if (this.originalFileObject != other.originalFileObject) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous1.hashCode()
        result = 31 * result + this.thread.hashCode()
        result = 31 * result + this.auxiliaryBuffer.hashCode()
        result = 31 * result + this.anonymous2.hashCode()
        result = 31 * result + this.originalFileObject.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            anonymous1: Irp300 = Irp300(),
            thread: Pethread = 0L,
            auxiliaryBuffer: Pstr = MutPtr(0L),
            anonymous2: Irp301 = Irp301(),
            originalFileObject: MutPtr<FileObject> = MutPtr(0L),
        ): Irp30 =
            Irp30(
                anonymous1 = anonymous1,
                thread = thread,
                auxiliaryBufferCtorArg = auxiliaryBuffer,
                anonymous2 = anonymous2,
                originalFileObjectCtorArg = originalFileObject,
            )
    }
}

public data class Irp300(
    public var deviceQueueEntry: KdeviceQueueEntry = KdeviceQueueEntry(),
    public var anonymous: Irp3000 = Irp3000(),
)

public class Irp3000 internal constructor(
    driverContextCtorArg: List<MutPtr<CVoid>>,
) {
    public var driverContext: List<MutPtr<CVoid>> = driverContextCtorArg
        internal set

    public constructor() : this(
        driverContextCtorArg = List(4) { MutPtr(0L) },
    )

    public operator fun component1(): List<MutPtr<CVoid>> = this.driverContext

    public fun copy(driverContext: List<MutPtr<CVoid>> = this.driverContext): Irp3000 = Irp3000(driverContextCtorArg = driverContext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Irp3000) return false
        if (this.driverContext != other.driverContext) return false
        return true
    }

    override fun hashCode(): Int = this.driverContext.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Irp3000> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Irp3000> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Irp3000 =
                    Irp3000(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(
                                    io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                        .mutPtrLayout<CVoid>(64),
                                    (4).toInt(),
                                )
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Irp3000) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(
                                io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                    .mutPtrLayout<CVoid>(64),
                                (4).toInt(),
                            )
                    ).writeNative(addr, value.driverContext)
                }
            }

        public operator fun invoke(
            driverContext: List<MutPtr<CVoid>> = List(4) { MutPtr(0L) },
        ): Irp3000 =
            Irp3000(
                driverContextCtorArg = driverContext,
            )
    }
}

public data class Irp301(
    public var listEntry: ListEntry = ListEntry(),
    public var anonymous: Irp3010 = Irp3010(),
)

public class Irp3010 internal constructor(
    currentStackLocationCtorArg: MutPtr<IoStackLocation>,
    public var packetType: UInt,
) {
    public var currentStackLocation: MutPtr<IoStackLocation> = currentStackLocationCtorArg
        internal set

    public constructor() : this(
        currentStackLocationCtorArg = MutPtr(0L),
        packetType = 0u,
    )

    public operator fun component1(): MutPtr<IoStackLocation> = this.currentStackLocation

    public operator fun component2(): UInt = this.packetType

    public fun copy(currentStackLocation: MutPtr<IoStackLocation> = this.currentStackLocation, packetType: UInt = this.packetType): Irp3010 = Irp3010(currentStackLocationCtorArg = currentStackLocation, packetType = packetType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Irp3010) return false
        if (this.currentStackLocation != other.currentStackLocation) return false
        if (this.packetType != other.packetType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.currentStackLocation.hashCode()
        result = 31 * result + this.packetType.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            currentStackLocation: MutPtr<IoStackLocation> = MutPtr(0L),
            packetType: UInt = 0u,
        ): Irp3010 =
            Irp3010(
                currentStackLocationCtorArg = currentStackLocation,
                packetType = packetType,
            )
    }
}

public data class KdeviceQueue(
    public var type: Short = 0,
    public var size: Short = 0,
    public var deviceListHead: ListEntry = ListEntry(),
    public var lock: Int = 0,
    public var busy: Boolean = false,
)

public class Kdpc internal constructor(
    public var anonymous: Kdpc0,
    public var dpcListEntry: SingleListEntry,
    public var processorHistory: Int,
    public var deferredRoutine: PkdeferredRoutine,
    deferredContextCtorArg: MutPtr<CVoid>,
    systemArgument1CtorArg: MutPtr<CVoid>,
    systemArgument2CtorArg: MutPtr<CVoid>,
    dpcDataCtorArg: MutPtr<CVoid>,
) {
    public var deferredContext: MutPtr<CVoid> = deferredContextCtorArg
        internal set

    public var systemArgument1: MutPtr<CVoid> = systemArgument1CtorArg
        internal set

    public var systemArgument2: MutPtr<CVoid> = systemArgument2CtorArg
        internal set

    public var dpcData: MutPtr<CVoid> = dpcDataCtorArg
        internal set

    public constructor() : this(
        anonymous = Kdpc0(),
        dpcListEntry = SingleListEntry(),
        processorHistory = 0,
        deferredRoutine = null,
        deferredContextCtorArg = MutPtr(0L),
        systemArgument1CtorArg = MutPtr(0L),
        systemArgument2CtorArg = MutPtr(0L),
        dpcDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Kdpc0 = this.anonymous

    public operator fun component2(): SingleListEntry = this.dpcListEntry

    public operator fun component3(): Int = this.processorHistory

    public operator fun component4(): PkdeferredRoutine = this.deferredRoutine

    public operator fun component5(): MutPtr<CVoid> = this.deferredContext

    public operator fun component6(): MutPtr<CVoid> = this.systemArgument1

    public operator fun component7(): MutPtr<CVoid> = this.systemArgument2

    public operator fun component8(): MutPtr<CVoid> = this.dpcData

    public fun copy(anonymous: Kdpc0 = this.anonymous, dpcListEntry: SingleListEntry = this.dpcListEntry, processorHistory: Int = this.processorHistory, deferredRoutine: PkdeferredRoutine = this.deferredRoutine, deferredContext: MutPtr<CVoid> = this.deferredContext, systemArgument1: MutPtr<CVoid> = this.systemArgument1, systemArgument2: MutPtr<CVoid> = this.systemArgument2, dpcData: MutPtr<CVoid> = this.dpcData): Kdpc = Kdpc(anonymous = anonymous, dpcListEntry = dpcListEntry, processorHistory = processorHistory, deferredRoutine = deferredRoutine, deferredContextCtorArg = deferredContext, systemArgument1CtorArg = systemArgument1, systemArgument2CtorArg = systemArgument2, dpcDataCtorArg = dpcData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Kdpc) return false
        if (this.anonymous != other.anonymous) return false
        if (this.dpcListEntry != other.dpcListEntry) return false
        if (this.processorHistory != other.processorHistory) return false
        if (this.deferredRoutine != other.deferredRoutine) return false
        if (this.deferredContext != other.deferredContext) return false
        if (this.systemArgument1 != other.systemArgument1) return false
        if (this.systemArgument2 != other.systemArgument2) return false
        if (this.dpcData != other.dpcData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.dpcListEntry.hashCode()
        result = 31 * result + this.processorHistory.hashCode()
        result = 31 * result + this.deferredRoutine.hashCode()
        result = 31 * result + this.deferredContext.hashCode()
        result = 31 * result + this.systemArgument1.hashCode()
        result = 31 * result + this.systemArgument2.hashCode()
        result = 31 * result + this.dpcData.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            anonymous: Kdpc0 = Kdpc0(),
            dpcListEntry: SingleListEntry = SingleListEntry(),
            processorHistory: Int = 0,
            deferredRoutine: PkdeferredRoutine = null,
            deferredContext: MutPtr<CVoid> = MutPtr(0L),
            systemArgument1: MutPtr<CVoid> = MutPtr(0L),
            systemArgument2: MutPtr<CVoid> = MutPtr(0L),
            dpcData: MutPtr<CVoid> = MutPtr(0L),
        ): Kdpc =
            Kdpc(
                anonymous = anonymous,
                dpcListEntry = dpcListEntry,
                processorHistory = processorHistory,
                deferredRoutine = deferredRoutine,
                deferredContextCtorArg = deferredContext,
                systemArgument1CtorArg = systemArgument1,
                systemArgument2CtorArg = systemArgument2,
                dpcDataCtorArg = dpcData,
            )
    }
}

public data class Kdpc0(
    public var targetInfoAsUlong: UInt = 0u,
    public var anonymous: Kdpc00 = Kdpc00(),
)

public data class Kdpc00(
    public var type: UByte = 0u,
    public var importance: UByte = 0u,
    public var number: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Kdpc00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Kdpc00> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): Kdpc00 =
                    Kdpc00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: Kdpc00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.importance)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.number)
                }
            }
    }
}

public data class Kevent(
    public var header: DispatcherHeader = DispatcherHeader(),
)

public class Kmutant internal constructor(
    public var header: DispatcherHeader,
    public var mutantListEntry: ListEntry,
    ownerThreadCtorArg: MutPtr<Int>,
    public var anonymous: Kmutant0,
    public var apcDisable: UByte,
) {
    public var ownerThread: MutPtr<Int> = ownerThreadCtorArg
        internal set

    public constructor() : this(
        header = DispatcherHeader(),
        mutantListEntry = ListEntry(),
        ownerThreadCtorArg = MutPtr(0L),
        anonymous = Kmutant0(),
        apcDisable = 0u,
    )

    public operator fun component1(): DispatcherHeader = this.header

    public operator fun component2(): ListEntry = this.mutantListEntry

    public operator fun component3(): MutPtr<Int> = this.ownerThread

    public operator fun component4(): Kmutant0 = this.anonymous

    public operator fun component5(): UByte = this.apcDisable

    public fun copy(header: DispatcherHeader = this.header, mutantListEntry: ListEntry = this.mutantListEntry, ownerThread: MutPtr<Int> = this.ownerThread, anonymous: Kmutant0 = this.anonymous, apcDisable: UByte = this.apcDisable): Kmutant = Kmutant(header = header, mutantListEntry = mutantListEntry, ownerThreadCtorArg = ownerThread, anonymous = anonymous, apcDisable = apcDisable)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Kmutant) return false
        if (this.header != other.header) return false
        if (this.mutantListEntry != other.mutantListEntry) return false
        if (this.ownerThread != other.ownerThread) return false
        if (this.anonymous != other.anonymous) return false
        if (this.apcDisable != other.apcDisable) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.mutantListEntry.hashCode()
        result = 31 * result + this.ownerThread.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.apcDisable.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            header: DispatcherHeader = DispatcherHeader(),
            mutantListEntry: ListEntry = ListEntry(),
            ownerThread: MutPtr<Int> = MutPtr(0L),
            anonymous: Kmutant0 = Kmutant0(),
            apcDisable: UByte = 0u,
        ): Kmutant =
            Kmutant(
                header = header,
                mutantListEntry = mutantListEntry,
                ownerThreadCtorArg = ownerThread,
                anonymous = anonymous,
                apcDisable = apcDisable,
            )
    }
}

public data class Kmutant0(
    public var mutantFlags: UByte = 0u,
    public var anonymous: Kmutant00 = Kmutant00(),
)

public data class Kmutant00(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Kmutant00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Kmutant00> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Kmutant00 =
                    Kmutant00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Kmutant00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class Kqueue(
    public var header: DispatcherHeader = DispatcherHeader(),
    public var entryListHead: ListEntry = ListEntry(),
    public var currentCount: UInt = 0u,
    public var maximumCount: UInt = 0u,
    public var threadListHead: ListEntry = ListEntry(),
)

public class KwaitBlock internal constructor(
    public var waitListEntry: ListEntry,
    public var waitType: UByte,
    public var blockState: UByte,
    public var waitKey: UShort,
    public var anonymous: KwaitBlock0,
    objCtorArg: MutPtr<CVoid>,
    sparePtrCtorArg: MutPtr<CVoid>,
) {
    public var obj: MutPtr<CVoid> = objCtorArg
        internal set

    public var sparePtr: MutPtr<CVoid> = sparePtrCtorArg
        internal set

    public constructor() : this(
        waitListEntry = ListEntry(),
        waitType = 0u,
        blockState = 0u,
        waitKey = 0u,
        anonymous = KwaitBlock0(),
        objCtorArg = MutPtr(0L),
        sparePtrCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ListEntry = this.waitListEntry

    public operator fun component2(): UByte = this.waitType

    public operator fun component3(): UByte = this.blockState

    public operator fun component4(): UShort = this.waitKey

    public operator fun component5(): KwaitBlock0 = this.anonymous

    public operator fun component6(): MutPtr<CVoid> = this.obj

    public operator fun component7(): MutPtr<CVoid> = this.sparePtr

    public fun copy(waitListEntry: ListEntry = this.waitListEntry, waitType: UByte = this.waitType, blockState: UByte = this.blockState, waitKey: UShort = this.waitKey, anonymous: KwaitBlock0 = this.anonymous, obj: MutPtr<CVoid> = this.obj, sparePtr: MutPtr<CVoid> = this.sparePtr): KwaitBlock = KwaitBlock(waitListEntry = waitListEntry, waitType = waitType, blockState = blockState, waitKey = waitKey, anonymous = anonymous, objCtorArg = obj, sparePtrCtorArg = sparePtr)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KwaitBlock) return false
        if (this.waitListEntry != other.waitListEntry) return false
        if (this.waitType != other.waitType) return false
        if (this.blockState != other.blockState) return false
        if (this.waitKey != other.waitKey) return false
        if (this.anonymous != other.anonymous) return false
        if (this.obj != other.obj) return false
        if (this.sparePtr != other.sparePtr) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.waitListEntry.hashCode()
        result = 31 * result + this.waitType.hashCode()
        result = 31 * result + this.blockState.hashCode()
        result = 31 * result + this.waitKey.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.obj.hashCode()
        result = 31 * result + this.sparePtr.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            waitListEntry: ListEntry = ListEntry(),
            waitType: UByte = 0u,
            blockState: UByte = 0u,
            waitKey: UShort = 0u,
            anonymous: KwaitBlock0 = KwaitBlock0(),
            obj: MutPtr<CVoid> = MutPtr(0L),
            sparePtr: MutPtr<CVoid> = MutPtr(0L),
        ): KwaitBlock =
            KwaitBlock(
                waitListEntry = waitListEntry,
                waitType = waitType,
                blockState = blockState,
                waitKey = waitKey,
                anonymous = anonymous,
                objCtorArg = obj,
                sparePtrCtorArg = sparePtr,
            )
    }
}

public class KwaitBlock0 internal constructor(
    threadCtorArg: MutPtr<Int>,
    notificationQueueCtorArg: MutPtr<Kqueue>,
    dpcCtorArg: MutPtr<Kdpc>,
) {
    public var thread: MutPtr<Int> = threadCtorArg
        internal set

    public var notificationQueue: MutPtr<Kqueue> = notificationQueueCtorArg
        internal set

    public var dpc: MutPtr<Kdpc> = dpcCtorArg
        internal set

    public constructor() : this(
        threadCtorArg = MutPtr(0L),
        notificationQueueCtorArg = MutPtr(0L),
        dpcCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Int> = this.thread

    public operator fun component2(): MutPtr<Kqueue> = this.notificationQueue

    public operator fun component3(): MutPtr<Kdpc> = this.dpc

    public fun copy(thread: MutPtr<Int> = this.thread, notificationQueue: MutPtr<Kqueue> = this.notificationQueue, dpc: MutPtr<Kdpc> = this.dpc): KwaitBlock0 = KwaitBlock0(threadCtorArg = thread, notificationQueueCtorArg = notificationQueue, dpcCtorArg = dpc)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KwaitBlock0) return false
        if (this.thread != other.thread) return false
        if (this.notificationQueue != other.notificationQueue) return false
        if (this.dpc != other.dpc) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.thread.hashCode()
        result = 31 * result + this.notificationQueue.hashCode()
        result = 31 * result + this.dpc.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            thread: MutPtr<Int> = MutPtr(0L),
            notificationQueue: MutPtr<Kqueue> = MutPtr(0L),
            dpc: MutPtr<Kdpc> = MutPtr(0L),
        ): KwaitBlock0 =
            KwaitBlock0(
                threadCtorArg = thread,
                notificationQueueCtorArg = notificationQueue,
                dpcCtorArg = dpc,
            )
    }
}

public class Mdl internal constructor(
    nextCtorArg: MutPtr<Mdl>,
    public var size: Short,
    public var mdlFlags: Short,
    processCtorArg: MutPtr<Int>,
    mappedSystemVaCtorArg: MutPtr<CVoid>,
    startVaCtorArg: MutPtr<CVoid>,
    public var byteCount: UInt,
    public var byteOffset: UInt,
) {
    public var next: MutPtr<Mdl> = nextCtorArg
        internal set

    public var process: MutPtr<Int> = processCtorArg
        internal set

    public var mappedSystemVa: MutPtr<CVoid> = mappedSystemVaCtorArg
        internal set

    public var startVa: MutPtr<CVoid> = startVaCtorArg
        internal set

    public constructor() : this(
        nextCtorArg = MutPtr(0L),
        size = 0,
        mdlFlags = 0,
        processCtorArg = MutPtr(0L),
        mappedSystemVaCtorArg = MutPtr(0L),
        startVaCtorArg = MutPtr(0L),
        byteCount = 0u,
        byteOffset = 0u,
    )

    public operator fun component1(): MutPtr<Mdl> = this.next

    public operator fun component2(): Short = this.size

    public operator fun component3(): Short = this.mdlFlags

    public operator fun component4(): MutPtr<Int> = this.process

    public operator fun component5(): MutPtr<CVoid> = this.mappedSystemVa

    public operator fun component6(): MutPtr<CVoid> = this.startVa

    public operator fun component7(): UInt = this.byteCount

    public operator fun component8(): UInt = this.byteOffset

    public fun copy(next: MutPtr<Mdl> = this.next, size: Short = this.size, mdlFlags: Short = this.mdlFlags, process: MutPtr<Int> = this.process, mappedSystemVa: MutPtr<CVoid> = this.mappedSystemVa, startVa: MutPtr<CVoid> = this.startVa, byteCount: UInt = this.byteCount, byteOffset: UInt = this.byteOffset): Mdl = Mdl(nextCtorArg = next, size = size, mdlFlags = mdlFlags, processCtorArg = process, mappedSystemVaCtorArg = mappedSystemVa, startVaCtorArg = startVa, byteCount = byteCount, byteOffset = byteOffset)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Mdl) return false
        if (this.next != other.next) return false
        if (this.size != other.size) return false
        if (this.mdlFlags != other.mdlFlags) return false
        if (this.process != other.process) return false
        if (this.mappedSystemVa != other.mappedSystemVa) return false
        if (this.startVa != other.startVa) return false
        if (this.byteCount != other.byteCount) return false
        if (this.byteOffset != other.byteOffset) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.next.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.mdlFlags.hashCode()
        result = 31 * result + this.process.hashCode()
        result = 31 * result + this.mappedSystemVa.hashCode()
        result = 31 * result + this.startVa.hashCode()
        result = 31 * result + this.byteCount.hashCode()
        result = 31 * result + this.byteOffset.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mdl> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mdl> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Mdl =
                    Mdl(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Mdl>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 10L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Int>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                    )
                override fun writeNative(addr: Long, value: Mdl) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Mdl>(64)
                    ).writeNative(addr, value.next)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 8L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 10L, value.mdlFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Int>(64)
                    ).writeNative(addr + 16L, value.process)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.mappedSystemVa)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 32L, value.startVa)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.byteCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.byteOffset)
                }
            }

        public operator fun invoke(
            next: MutPtr<Mdl> = MutPtr(0L),
            size: Short = 0,
            mdlFlags: Short = 0,
            process: MutPtr<Int> = MutPtr(0L),
            mappedSystemVa: MutPtr<CVoid> = MutPtr(0L),
            startVa: MutPtr<CVoid> = MutPtr(0L),
            byteCount: UInt = 0u,
            byteOffset: UInt = 0u,
        ): Mdl =
            Mdl(
                nextCtorArg = next,
                size = size,
                mdlFlags = mdlFlags,
                processCtorArg = process,
                mappedSystemVaCtorArg = mappedSystemVa,
                startVaCtorArg = startVa,
                byteCount = byteCount,
                byteOffset = byteOffset,
            )
    }
}

public class ObjectAttributes internal constructor(
    public var length: UInt,
    rootDirectoryCtorArg: Handle,
    objectNameCtorArg: ConstPtr<UnicodeString>,
    public var attributes: ObjectAttributeFlags,
    securityDescriptorCtorArg: ConstPtr<SecurityDescriptor>,
    securityQualityOfServiceCtorArg: ConstPtr<SecurityQualityOfService>,
) {
    public var rootDirectory: Handle = rootDirectoryCtorArg
        internal set

    public var objectName: ConstPtr<UnicodeString> = objectNameCtorArg
        internal set

    public var securityDescriptor: ConstPtr<SecurityDescriptor> = securityDescriptorCtorArg
        internal set

    public var securityQualityOfService: ConstPtr<SecurityQualityOfService> = securityQualityOfServiceCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        rootDirectoryCtorArg = MutPtr(0L),
        objectNameCtorArg = ConstPtr(0L),
        attributes = 0u,
        securityDescriptorCtorArg = ConstPtr(0L),
        securityQualityOfServiceCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.length

    public operator fun component2(): Handle = this.rootDirectory

    public operator fun component3(): ConstPtr<UnicodeString> = this.objectName

    public operator fun component4(): ObjectAttributeFlags = this.attributes

    public operator fun component5(): ConstPtr<SecurityDescriptor> = this.securityDescriptor

    public operator fun component6(): ConstPtr<SecurityQualityOfService> = this.securityQualityOfService

    public fun copy(length: UInt = this.length, rootDirectory: Handle = this.rootDirectory, objectName: ConstPtr<UnicodeString> = this.objectName, attributes: ObjectAttributeFlags = this.attributes, securityDescriptor: ConstPtr<SecurityDescriptor> = this.securityDescriptor, securityQualityOfService: ConstPtr<SecurityQualityOfService> = this.securityQualityOfService): ObjectAttributes = ObjectAttributes(length = length, rootDirectoryCtorArg = rootDirectory, objectNameCtorArg = objectName, attributes = attributes, securityDescriptorCtorArg = securityDescriptor, securityQualityOfServiceCtorArg = securityQualityOfService)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ObjectAttributes) return false
        if (this.length != other.length) return false
        if (this.rootDirectory != other.rootDirectory) return false
        if (this.objectName != other.objectName) return false
        if (this.attributes != other.attributes) return false
        if (this.securityDescriptor != other.securityDescriptor) return false
        if (this.securityQualityOfService != other.securityQualityOfService) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.rootDirectory.hashCode()
        result = 31 * result + this.objectName.hashCode()
        result = 31 * result + this.attributes.hashCode()
        result = 31 * result + this.securityDescriptor.hashCode()
        result = 31 * result + this.securityQualityOfService.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            length: UInt = 0u,
            rootDirectory: Handle = MutPtr(0L),
            objectName: ConstPtr<UnicodeString> = ConstPtr(0L),
            attributes: ObjectAttributeFlags = 0u,
            securityDescriptor: ConstPtr<SecurityDescriptor> = ConstPtr(0L),
            securityQualityOfService: ConstPtr<SecurityQualityOfService> = ConstPtr(0L),
        ): ObjectAttributes =
            ObjectAttributes(
                length = length,
                rootDirectoryCtorArg = rootDirectory,
                objectNameCtorArg = objectName,
                attributes = attributes,
                securityDescriptorCtorArg = securityDescriptor,
                securityQualityOfServiceCtorArg = securityQualityOfService,
            )
    }
}

public class ObjectAttributes32 internal constructor(
    public var length: UInt,
    public var rootDirectory: UInt,
    public var objectName: UInt,
    public var attributes: ObjectAttributeFlags,
    securityDescriptorCtorArg: ConstPtr<SecurityDescriptor>,
    securityQualityOfServiceCtorArg: ConstPtr<SecurityQualityOfService>,
) {
    public var securityDescriptor: ConstPtr<SecurityDescriptor> = securityDescriptorCtorArg
        internal set

    public var securityQualityOfService: ConstPtr<SecurityQualityOfService> = securityQualityOfServiceCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        rootDirectory = 0u,
        objectName = 0u,
        attributes = 0u,
        securityDescriptorCtorArg = ConstPtr(0L),
        securityQualityOfServiceCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.length

    public operator fun component2(): UInt = this.rootDirectory

    public operator fun component3(): UInt = this.objectName

    public operator fun component4(): ObjectAttributeFlags = this.attributes

    public operator fun component5(): ConstPtr<SecurityDescriptor> = this.securityDescriptor

    public operator fun component6(): ConstPtr<SecurityQualityOfService> = this.securityQualityOfService

    public fun copy(length: UInt = this.length, rootDirectory: UInt = this.rootDirectory, objectName: UInt = this.objectName, attributes: ObjectAttributeFlags = this.attributes, securityDescriptor: ConstPtr<SecurityDescriptor> = this.securityDescriptor, securityQualityOfService: ConstPtr<SecurityQualityOfService> = this.securityQualityOfService): ObjectAttributes32 = ObjectAttributes32(length = length, rootDirectory = rootDirectory, objectName = objectName, attributes = attributes, securityDescriptorCtorArg = securityDescriptor, securityQualityOfServiceCtorArg = securityQualityOfService)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ObjectAttributes32) return false
        if (this.length != other.length) return false
        if (this.rootDirectory != other.rootDirectory) return false
        if (this.objectName != other.objectName) return false
        if (this.attributes != other.attributes) return false
        if (this.securityDescriptor != other.securityDescriptor) return false
        if (this.securityQualityOfService != other.securityQualityOfService) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.rootDirectory.hashCode()
        result = 31 * result + this.objectName.hashCode()
        result = 31 * result + this.attributes.hashCode()
        result = 31 * result + this.securityDescriptor.hashCode()
        result = 31 * result + this.securityQualityOfService.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            length: UInt = 0u,
            rootDirectory: UInt = 0u,
            objectName: UInt = 0u,
            attributes: ObjectAttributeFlags = 0u,
            securityDescriptor: ConstPtr<SecurityDescriptor> = ConstPtr(0L),
            securityQualityOfService: ConstPtr<SecurityQualityOfService> = ConstPtr(0L),
        ): ObjectAttributes32 =
            ObjectAttributes32(
                length = length,
                rootDirectory = rootDirectory,
                objectName = objectName,
                attributes = attributes,
                securityDescriptorCtorArg = securityDescriptor,
                securityQualityOfServiceCtorArg = securityQualityOfService,
            )
    }
}

public class ObjectAttributes64 internal constructor(
    public var length: UInt,
    public var rootDirectory: ULong,
    public var objectName: ULong,
    public var attributes: ObjectAttributeFlags,
    securityDescriptorCtorArg: ConstPtr<SecurityDescriptor>,
    securityQualityOfServiceCtorArg: ConstPtr<SecurityQualityOfService>,
) {
    public var securityDescriptor: ConstPtr<SecurityDescriptor> = securityDescriptorCtorArg
        internal set

    public var securityQualityOfService: ConstPtr<SecurityQualityOfService> = securityQualityOfServiceCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        rootDirectory = 0uL,
        objectName = 0uL,
        attributes = 0u,
        securityDescriptorCtorArg = ConstPtr(0L),
        securityQualityOfServiceCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.length

    public operator fun component2(): ULong = this.rootDirectory

    public operator fun component3(): ULong = this.objectName

    public operator fun component4(): ObjectAttributeFlags = this.attributes

    public operator fun component5(): ConstPtr<SecurityDescriptor> = this.securityDescriptor

    public operator fun component6(): ConstPtr<SecurityQualityOfService> = this.securityQualityOfService

    public fun copy(length: UInt = this.length, rootDirectory: ULong = this.rootDirectory, objectName: ULong = this.objectName, attributes: ObjectAttributeFlags = this.attributes, securityDescriptor: ConstPtr<SecurityDescriptor> = this.securityDescriptor, securityQualityOfService: ConstPtr<SecurityQualityOfService> = this.securityQualityOfService): ObjectAttributes64 = ObjectAttributes64(length = length, rootDirectory = rootDirectory, objectName = objectName, attributes = attributes, securityDescriptorCtorArg = securityDescriptor, securityQualityOfServiceCtorArg = securityQualityOfService)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ObjectAttributes64) return false
        if (this.length != other.length) return false
        if (this.rootDirectory != other.rootDirectory) return false
        if (this.objectName != other.objectName) return false
        if (this.attributes != other.attributes) return false
        if (this.securityDescriptor != other.securityDescriptor) return false
        if (this.securityQualityOfService != other.securityQualityOfService) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.rootDirectory.hashCode()
        result = 31 * result + this.objectName.hashCode()
        result = 31 * result + this.attributes.hashCode()
        result = 31 * result + this.securityDescriptor.hashCode()
        result = 31 * result + this.securityQualityOfService.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            length: UInt = 0u,
            rootDirectory: ULong = 0uL,
            objectName: ULong = 0uL,
            attributes: ObjectAttributeFlags = 0u,
            securityDescriptor: ConstPtr<SecurityDescriptor> = ConstPtr(0L),
            securityQualityOfService: ConstPtr<SecurityQualityOfService> = ConstPtr(0L),
        ): ObjectAttributes64 =
            ObjectAttributes64(
                length = length,
                rootDirectory = rootDirectory,
                objectName = objectName,
                attributes = attributes,
                securityDescriptorCtorArg = securityDescriptor,
                securityQualityOfServiceCtorArg = securityQualityOfService,
            )
    }
}

public data class ObjectNameInformation(
    public var name: UnicodeString = UnicodeString(),
)

public data class OwnerEntry(
    public var ownerThread: Int = 0,
    public var anonymous: OwnerEntry0 = OwnerEntry0(),
)

public data class OwnerEntry0(
    public var anonymous: OwnerEntry00 = OwnerEntry00(),
    public var tableSize: UInt = 0u,
)

public data class OwnerEntry00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<OwnerEntry00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<OwnerEntry00> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): OwnerEntry00 =
                    OwnerEntry00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: OwnerEntry00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class RtlSplayLinks internal constructor(
    parentCtorArg: MutPtr<RtlSplayLinks>,
    leftChildCtorArg: MutPtr<RtlSplayLinks>,
    rightChildCtorArg: MutPtr<RtlSplayLinks>,
) {
    public var parent: MutPtr<RtlSplayLinks> = parentCtorArg
        internal set

    public var leftChild: MutPtr<RtlSplayLinks> = leftChildCtorArg
        internal set

    public var rightChild: MutPtr<RtlSplayLinks> = rightChildCtorArg
        internal set

    public constructor() : this(
        parentCtorArg = MutPtr(0L),
        leftChildCtorArg = MutPtr(0L),
        rightChildCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<RtlSplayLinks> = this.parent

    public operator fun component2(): MutPtr<RtlSplayLinks> = this.leftChild

    public operator fun component3(): MutPtr<RtlSplayLinks> = this.rightChild

    public fun copy(parent: MutPtr<RtlSplayLinks> = this.parent, leftChild: MutPtr<RtlSplayLinks> = this.leftChild, rightChild: MutPtr<RtlSplayLinks> = this.rightChild): RtlSplayLinks = RtlSplayLinks(parentCtorArg = parent, leftChildCtorArg = leftChild, rightChildCtorArg = rightChild)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RtlSplayLinks) return false
        if (this.parent != other.parent) return false
        if (this.leftChild != other.leftChild) return false
        if (this.rightChild != other.rightChild) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.parent.hashCode()
        result = 31 * result + this.leftChild.hashCode()
        result = 31 * result + this.rightChild.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RtlSplayLinks> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RtlSplayLinks> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): RtlSplayLinks =
                    RtlSplayLinks(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<RtlSplayLinks>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<RtlSplayLinks>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<RtlSplayLinks>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: RtlSplayLinks) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<RtlSplayLinks>(64)
                    ).writeNative(addr, value.parent)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<RtlSplayLinks>(64)
                    ).writeNative(addr + 8L, value.leftChild)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<RtlSplayLinks>(64)
                    ).writeNative(addr + 16L, value.rightChild)
                }
            }

        public operator fun invoke(
            parent: MutPtr<RtlSplayLinks> = MutPtr(0L),
            leftChild: MutPtr<RtlSplayLinks> = MutPtr(0L),
            rightChild: MutPtr<RtlSplayLinks> = MutPtr(0L),
        ): RtlSplayLinks =
            RtlSplayLinks(
                parentCtorArg = parent,
                leftChildCtorArg = leftChild,
                rightChildCtorArg = rightChild,
            )
    }
}

public class SectionObjectPointers internal constructor(
    dataSectionObjectCtorArg: MutPtr<CVoid>,
    sharedCacheMapCtorArg: MutPtr<CVoid>,
    imageSectionObjectCtorArg: MutPtr<CVoid>,
) {
    public var dataSectionObject: MutPtr<CVoid> = dataSectionObjectCtorArg
        internal set

    public var sharedCacheMap: MutPtr<CVoid> = sharedCacheMapCtorArg
        internal set

    public var imageSectionObject: MutPtr<CVoid> = imageSectionObjectCtorArg
        internal set

    public constructor() : this(
        dataSectionObjectCtorArg = MutPtr(0L),
        sharedCacheMapCtorArg = MutPtr(0L),
        imageSectionObjectCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.dataSectionObject

    public operator fun component2(): MutPtr<CVoid> = this.sharedCacheMap

    public operator fun component3(): MutPtr<CVoid> = this.imageSectionObject

    public fun copy(dataSectionObject: MutPtr<CVoid> = this.dataSectionObject, sharedCacheMap: MutPtr<CVoid> = this.sharedCacheMap, imageSectionObject: MutPtr<CVoid> = this.imageSectionObject): SectionObjectPointers = SectionObjectPointers(dataSectionObjectCtorArg = dataSectionObject, sharedCacheMapCtorArg = sharedCacheMap, imageSectionObjectCtorArg = imageSectionObject)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SectionObjectPointers) return false
        if (this.dataSectionObject != other.dataSectionObject) return false
        if (this.sharedCacheMap != other.sharedCacheMap) return false
        if (this.imageSectionObject != other.imageSectionObject) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dataSectionObject.hashCode()
        result = 31 * result + this.sharedCacheMap.hashCode()
        result = 31 * result + this.imageSectionObject.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SectionObjectPointers> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SectionObjectPointers> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SectionObjectPointers =
                    SectionObjectPointers(
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
                    )
                override fun writeNative(addr: Long, value: SectionObjectPointers) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.dataSectionObject)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.sharedCacheMap)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.imageSectionObject)
                }
            }

        public operator fun invoke(
            dataSectionObject: MutPtr<CVoid> = MutPtr(0L),
            sharedCacheMap: MutPtr<CVoid> = MutPtr(0L),
            imageSectionObject: MutPtr<CVoid> = MutPtr(0L),
        ): SectionObjectPointers =
            SectionObjectPointers(
                dataSectionObjectCtorArg = dataSectionObject,
                sharedCacheMapCtorArg = sharedCacheMap,
                imageSectionObjectCtorArg = imageSectionObject,
            )
    }
}

public class SecuritySubjectContext internal constructor(
    clientTokenCtorArg: MutPtr<CVoid>,
    public var impersonationLevel: SecurityImpersonationLevel,
    primaryTokenCtorArg: MutPtr<CVoid>,
    processAuditIdCtorArg: MutPtr<CVoid>,
) {
    public var clientToken: MutPtr<CVoid> = clientTokenCtorArg
        internal set

    public var primaryToken: MutPtr<CVoid> = primaryTokenCtorArg
        internal set

    public var processAuditId: MutPtr<CVoid> = processAuditIdCtorArg
        internal set

    public constructor() : this(
        clientTokenCtorArg = MutPtr(0L),
        impersonationLevel = 0,
        primaryTokenCtorArg = MutPtr(0L),
        processAuditIdCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.clientToken

    public operator fun component2(): SecurityImpersonationLevel = this.impersonationLevel

    public operator fun component3(): MutPtr<CVoid> = this.primaryToken

    public operator fun component4(): MutPtr<CVoid> = this.processAuditId

    public fun copy(clientToken: MutPtr<CVoid> = this.clientToken, impersonationLevel: SecurityImpersonationLevel = this.impersonationLevel, primaryToken: MutPtr<CVoid> = this.primaryToken, processAuditId: MutPtr<CVoid> = this.processAuditId): SecuritySubjectContext = SecuritySubjectContext(clientTokenCtorArg = clientToken, impersonationLevel = impersonationLevel, primaryTokenCtorArg = primaryToken, processAuditIdCtorArg = processAuditId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecuritySubjectContext) return false
        if (this.clientToken != other.clientToken) return false
        if (this.impersonationLevel != other.impersonationLevel) return false
        if (this.primaryToken != other.primaryToken) return false
        if (this.processAuditId != other.processAuditId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.clientToken.hashCode()
        result = 31 * result + this.impersonationLevel.hashCode()
        result = 31 * result + this.primaryToken.hashCode()
        result = 31 * result + this.processAuditId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            clientToken: MutPtr<CVoid> = MutPtr(0L),
            impersonationLevel: SecurityImpersonationLevel = 0,
            primaryToken: MutPtr<CVoid> = MutPtr(0L),
            processAuditId: MutPtr<CVoid> = MutPtr(0L),
        ): SecuritySubjectContext =
            SecuritySubjectContext(
                clientTokenCtorArg = clientToken,
                impersonationLevel = impersonationLevel,
                primaryTokenCtorArg = primaryToken,
                processAuditIdCtorArg = processAuditId,
            )
    }
}

public class TargetDeviceCustomNotification internal constructor(
    public var version: UShort,
    public var size: UShort,
    public var event: Guid,
    fileObjectCtorArg: MutPtr<FileObject>,
    public var nameBufferOffset: Int,
    public var customDataBuffer: UByteArray,
) {
    public var fileObject: MutPtr<FileObject> = fileObjectCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        size = 0u,
        event = Guid(),
        fileObjectCtorArg = MutPtr(0L),
        nameBufferOffset = 0,
        customDataBuffer = UByteArray(1),
    )

    public operator fun component1(): UShort = this.version

    public operator fun component2(): UShort = this.size

    public operator fun component3(): Guid = this.event

    public operator fun component4(): MutPtr<FileObject> = this.fileObject

    public operator fun component5(): Int = this.nameBufferOffset

    public operator fun component6(): UByteArray = this.customDataBuffer

    public fun copy(version: UShort = this.version, size: UShort = this.size, event: Guid = this.event, fileObject: MutPtr<FileObject> = this.fileObject, nameBufferOffset: Int = this.nameBufferOffset, customDataBuffer: UByteArray = this.customDataBuffer): TargetDeviceCustomNotification = TargetDeviceCustomNotification(version = version, size = size, event = event, fileObjectCtorArg = fileObject, nameBufferOffset = nameBufferOffset, customDataBuffer = customDataBuffer)

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

    public companion object {
        public operator fun invoke(
            version: UShort = 0u,
            size: UShort = 0u,
            event: Guid = Guid(),
            fileObject: MutPtr<FileObject> = MutPtr(0L),
            nameBufferOffset: Int = 0,
            customDataBuffer: UByteArray = UByteArray(1),
        ): TargetDeviceCustomNotification =
            TargetDeviceCustomNotification(
                version = version,
                size = size,
                event = event,
                fileObjectCtorArg = fileObject,
                nameBufferOffset = nameBufferOffset,
                customDataBuffer = customDataBuffer,
            )
    }
}

public class Vpb internal constructor(
    public var type: Short,
    public var size: Short,
    public var flags: UShort,
    public var volumeLabelLength: UShort,
    deviceObjectCtorArg: MutPtr<DeviceObject>,
    realDeviceCtorArg: MutPtr<DeviceObject>,
    public var serialNumber: UInt,
    public var referenceCount: UInt,
    public var volumeLabel: UShortArray,
) {
    public var deviceObject: MutPtr<DeviceObject> = deviceObjectCtorArg
        internal set

    public var realDevice: MutPtr<DeviceObject> = realDeviceCtorArg
        internal set

    public constructor() : this(
        type = 0,
        size = 0,
        flags = 0u,
        volumeLabelLength = 0u,
        deviceObjectCtorArg = MutPtr(0L),
        realDeviceCtorArg = MutPtr(0L),
        serialNumber = 0u,
        referenceCount = 0u,
        volumeLabel = UShortArray(32),
    )

    public operator fun component1(): Short = this.type

    public operator fun component2(): Short = this.size

    public operator fun component3(): UShort = this.flags

    public operator fun component4(): UShort = this.volumeLabelLength

    public operator fun component5(): MutPtr<DeviceObject> = this.deviceObject

    public operator fun component6(): MutPtr<DeviceObject> = this.realDevice

    public operator fun component7(): UInt = this.serialNumber

    public operator fun component8(): UInt = this.referenceCount

    public operator fun component9(): UShortArray = this.volumeLabel

    public fun copy(type: Short = this.type, size: Short = this.size, flags: UShort = this.flags, volumeLabelLength: UShort = this.volumeLabelLength, deviceObject: MutPtr<DeviceObject> = this.deviceObject, realDevice: MutPtr<DeviceObject> = this.realDevice, serialNumber: UInt = this.serialNumber, referenceCount: UInt = this.referenceCount, volumeLabel: UShortArray = this.volumeLabel): Vpb = Vpb(type = type, size = size, flags = flags, volumeLabelLength = volumeLabelLength, deviceObjectCtorArg = deviceObject, realDeviceCtorArg = realDevice, serialNumber = serialNumber, referenceCount = referenceCount, volumeLabel = volumeLabel)

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Vpb> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Vpb> {
                override val sizeBytes: Long = 96L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Vpb =
                    Vpb(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<DeviceObject>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<DeviceObject>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: Vpb) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.volumeLabelLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<DeviceObject>(64)
                    ).writeNative(addr + 8L, value.deviceObject)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<DeviceObject>(64)
                    ).writeNative(addr + 16L, value.realDevice)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.serialNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.referenceCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                    ).writeNative(addr + 32L, value.volumeLabel)
                }
            }

        public operator fun invoke(
            type: Short = 0,
            size: Short = 0,
            flags: UShort = 0u,
            volumeLabelLength: UShort = 0u,
            deviceObject: MutPtr<DeviceObject> = MutPtr(0L),
            realDevice: MutPtr<DeviceObject> = MutPtr(0L),
            serialNumber: UInt = 0u,
            referenceCount: UInt = 0u,
            volumeLabel: UShortArray = UShortArray(32),
        ): Vpb =
            Vpb(
                type = type,
                size = size,
                flags = flags,
                volumeLabelLength = volumeLabelLength,
                deviceObjectCtorArg = deviceObject,
                realDeviceCtorArg = realDevice,
                serialNumber = serialNumber,
                referenceCount = referenceCount,
                volumeLabel = volumeLabel,
            )
    }
}

public class WorkQueueItem internal constructor(
    public var list: ListEntry,
    public var workerRoutine: PworkerThreadRoutine,
    parameterCtorArg: MutPtr<CVoid>,
) {
    public var parameter: MutPtr<CVoid> = parameterCtorArg
        internal set

    public constructor() : this(
        list = ListEntry(),
        workerRoutine = null,
        parameterCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ListEntry = this.list

    public operator fun component2(): PworkerThreadRoutine = this.workerRoutine

    public operator fun component3(): MutPtr<CVoid> = this.parameter

    public fun copy(list: ListEntry = this.list, workerRoutine: PworkerThreadRoutine = this.workerRoutine, parameter: MutPtr<CVoid> = this.parameter): WorkQueueItem = WorkQueueItem(list = list, workerRoutine = workerRoutine, parameterCtorArg = parameter)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WorkQueueItem) return false
        if (this.list != other.list) return false
        if (this.workerRoutine != other.workerRoutine) return false
        if (this.parameter != other.parameter) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.list.hashCode()
        result = 31 * result + this.workerRoutine.hashCode()
        result = 31 * result + this.parameter.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            list: ListEntry = ListEntry(),
            workerRoutine: PworkerThreadRoutine = null,
            parameter: MutPtr<CVoid> = MutPtr(0L),
        ): WorkQueueItem =
            WorkQueueItem(
                list = list,
                workerRoutine = workerRoutine,
                parameterCtorArg = parameter,
            )
    }
}
