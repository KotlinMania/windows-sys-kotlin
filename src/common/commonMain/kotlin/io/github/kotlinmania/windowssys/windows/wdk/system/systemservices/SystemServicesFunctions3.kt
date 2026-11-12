package io.github.kotlinmania.windowssys.windows.wdk.system.systemservices

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DeviceObject
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Kenlistment
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Kresourcemanager
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Ktm
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Ktransaction
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Mdl
import io.github.kotlinmania.windowssys.windows.wdk.foundation.ObjectAttributes
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Peprocess
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PoolType
import io.github.kotlinmania.windowssys.windows.wdk.foundation.RtlSplayLinks
import io.github.kotlinmania.windowssys.windows.wdk.foundation.SecuritySubjectContext
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FileInformationClass
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString
import io.github.kotlinmania.windowssys.windows.win32.security.GenericMapping
import io.github.kotlinmania.windowssys.windows.win32.security.PrivilegeSet
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.SeAdtParameterArray
import io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.SeAdtParameterType
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.TransactionNotification
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.WheaDriverBufferSet
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.WheaErrorSourceConfigurationDeviceDriver
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.WheaErrorSourceDescriptor
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.WheaErrorSourceState
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.WheaErrorSourceType
import io.github.kotlinmania.windowssys.windows.win32.system.io.IoStatusBlock
import io.github.kotlinmania.windowssys.windows.win32.system.io.PioApcRoutine
import io.github.kotlinmania.windowssys.windows.win32.system.power.PowerInformationLevel
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.Osversioninfoexw
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.RtlSystemGlobalDataId
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.EnlistmentInformationClass
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.KtmobjectCursor
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.KtmobjectType
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.ResourcemanagerInformationClass
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.TransactionInformationClass
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.TransactionmanagerInformationClass

public expect fun rtlSetSystemGlobalData(dataid: RtlSystemGlobalDataId, buffer: ConstPtr<CVoid>, size: UInt): Ntstatus

public expect fun rtlSplay(links: MutPtr<RtlSplayLinks>): MutPtr<RtlSplayLinks>

public expect fun rtlStringFromGUID(guid: ConstPtr<Guid>, guidstring: MutPtr<UnicodeString>): Ntstatus

public expect fun rtlStronglyEnumerateEntryHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, enumerator: MutPtr<RtlDynamicHashTableEnumerator>): MutPtr<RtlDynamicHashTableEntry>

public expect fun rtlSubtreePredecessor(links: ConstPtr<RtlSplayLinks>): MutPtr<RtlSplayLinks>

public expect fun rtlSubtreeSuccessor(links: ConstPtr<RtlSplayLinks>): MutPtr<RtlSplayLinks>

public expect fun rtlSuffixUnicodeString(string1: ConstPtr<UnicodeString>, string2: ConstPtr<UnicodeString>, caseinsensitive: Boolean): Boolean

public expect fun rtlTestBit(bitmapheader: ConstPtr<RtlBitmap>, bitnumber: UInt): Boolean

public expect fun rtlTimeFieldsToTime(timefields: ConstPtr<TimeFields>, time: MutPtr<Long>): Boolean

public expect fun rtlTimeToTimeFields(time: ConstPtr<Long>, timefields: MutPtr<TimeFields>)

public expect fun rtlUTF8StringToUnicodeString(destinationstring: MutPtr<UnicodeString>, sourcestring: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, allocatedestinationstring: Boolean): Ntstatus

public expect fun rtlUTF8ToUnicodeN(unicodestringdestination: Pwstr, unicodestringmaxbytecount: UInt, unicodestringactualbytecount: MutPtr<UInt>, utf8stringsource: Pcstr, utf8stringbytecount: UInt): Ntstatus

public expect fun rtlUnicodeStringToInt64(string: ConstPtr<UnicodeString>, base: UInt, number: MutPtr<Long>, endpointer: MutPtr<Pwstr>): Ntstatus

public expect fun rtlUnicodeStringToInteger(string: ConstPtr<UnicodeString>, base: UInt, value: MutPtr<UInt>): Ntstatus

public expect fun rtlUnicodeStringToUTF8String(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: ConstPtr<UnicodeString>, allocatedestinationstring: Boolean): Ntstatus

public expect fun rtlUnicodeToUTF8N(utf8stringdestination: Pstr, utf8stringmaxbytecount: UInt, utf8stringactualbytecount: MutPtr<UInt>, unicodestringsource: ConstPtr<UShort>, unicodestringbytecount: UInt): Ntstatus

public expect fun rtlUpcaseUnicodeChar(sourcecharacter: UShort): UShort

public expect fun rtlUpcaseUnicodeString(destinationstring: MutPtr<UnicodeString>, sourcestring: ConstPtr<UnicodeString>, allocatedestinationstring: Boolean): Ntstatus

public expect fun rtlUpperChar(character: Byte): Byte

public expect fun rtlUpperString(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>)

public expect fun rtlValidRelativeSecurityDescriptor(securitydescriptorinput: PsecurityDescriptor, securitydescriptorlength: UInt, requiredinformation: UInt): Boolean

public expect fun rtlValidSecurityDescriptor(securitydescriptor: PsecurityDescriptor): Boolean

public expect fun rtlVerifyVersionInfo(versioninfo: ConstPtr<Osversioninfoexw>, typemask: UInt, conditionmask: ULong): Ntstatus

public expect fun rtlVolumeDeviceToDosName(volumedeviceobject: ConstPtr<CVoid>, dosname: MutPtr<UnicodeString>): Ntstatus

public expect fun rtlWalkFrameChain(callers: MutPtr<MutPtr<CVoid>>, count: UInt, flags: UInt): UInt

public expect fun rtlWeaklyEnumerateEntryHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, enumerator: MutPtr<RtlDynamicHashTableEnumerator>): MutPtr<RtlDynamicHashTableEntry>

public expect fun rtlWriteRegistryValue(relativeto: UInt, path: Pcwstr, valuename: Pcwstr, valuetype: UInt, valuedata: ConstPtr<CVoid>, valuelength: UInt): Ntstatus

public expect fun rtlxAnsiStringToUnicodeSize(ansistring: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>): UInt

public expect fun rtlxUnicodeStringToAnsiSize(unicodestring: ConstPtr<UnicodeString>): UInt

public expect fun seAccessCheck(securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr<SecuritySubjectContext>, subjectcontextlocked: Boolean, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: MutPtr<MutPtr<PrivilegeSet>>, genericmapping: ConstPtr<GenericMapping>, accessmode: Byte, grantedaccess: MutPtr<UInt>, accessstatus: MutPtr<Int>): Boolean

public expect fun seAssignSecurity(parentdescriptor: PsecurityDescriptor, explicitdescriptor: PsecurityDescriptor, newdescriptor: MutPtr<PsecurityDescriptor>, isdirectoryobject: Boolean, subjectcontext: ConstPtr<SecuritySubjectContext>, genericmapping: ConstPtr<GenericMapping>, pooltype: PoolType): Ntstatus

public expect fun seAssignSecurityEx(parentdescriptor: PsecurityDescriptor, explicitdescriptor: PsecurityDescriptor, newdescriptor: MutPtr<PsecurityDescriptor>, objecttype: ConstPtr<Guid>, isdirectoryobject: Boolean, autoinheritflags: UInt, subjectcontext: ConstPtr<SecuritySubjectContext>, genericmapping: ConstPtr<GenericMapping>, pooltype: PoolType): Ntstatus

public expect fun seCaptureSubjectContext(subjectcontext: MutPtr<SecuritySubjectContext>)

public expect fun seComputeAutoInheritByObjectType(objecttype: ConstPtr<CVoid>, securitydescriptor: PsecurityDescriptor, parentsecuritydescriptor: PsecurityDescriptor): UInt

public expect fun seDeassignSecurity(securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus

public expect fun seEtwWriteKMCveEvent(cveid: ConstPtr<UnicodeString>, additionaldetails: ConstPtr<UnicodeString>): Ntstatus

public expect fun seLockSubjectContext(subjectcontext: ConstPtr<SecuritySubjectContext>)

public expect fun seRegisterImageVerificationCallback(imagetype: SeImageType, callbacktype: SeImageVerificationCallbackType, callbackfunction: PseImageVerificationCallbackFunction, callbackcontext: ConstPtr<CVoid>, token: ConstPtr<CVoid>, callbackhandle: MutPtr<MutPtr<CVoid>>): Ntstatus

public expect fun seReleaseSubjectContext(subjectcontext: MutPtr<SecuritySubjectContext>)

public expect fun seReportSecurityEvent(flags: UInt, sourcename: ConstPtr<UnicodeString>, usersid: Psid, auditparameters: ConstPtr<SeAdtParameterArray>): Ntstatus

public expect fun seSetAuditParameter(auditparameters: MutPtr<SeAdtParameterArray>, type: SeAdtParameterType, index: UInt, data: ConstPtr<CVoid>): Ntstatus

public expect fun seSinglePrivilegeCheck(privilegevalue: Luid, previousmode: Byte): Boolean

public expect fun seUnlockSubjectContext(subjectcontext: ConstPtr<SecuritySubjectContext>)

public expect fun seUnregisterImageVerificationCallback(callbackhandle: ConstPtr<CVoid>)

public expect fun seValidSecurityDescriptor(length: UInt, securitydescriptor: PsecurityDescriptor): Boolean

public expect fun tmCommitComplete(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus

public expect fun tmCommitEnlistment(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus

public expect fun tmCommitTransaction(transaction: ConstPtr<Ktransaction>, wait: Boolean): Ntstatus

public expect fun tmCreateEnlistment(enlistmenthandle: MutPtr<Handle>, previousmode: Byte, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, resourcemanager: ConstPtr<Long>, transaction: ConstPtr<Ktransaction>, createoptions: UInt, notificationmask: UInt, enlistmentkey: ConstPtr<CVoid>): Ntstatus

public expect fun tmDereferenceEnlistmentKey(enlistment: ConstPtr<Kenlistment>, lastreference: MutPtr<Boolean>): Ntstatus

public expect fun tmEnableCallbacks(resourcemanager: ConstPtr<Kresourcemanager>, callbackroutine: PtmRmNotification, rmkey: ConstPtr<CVoid>): Ntstatus

public expect fun tmGetTransactionId(transaction: ConstPtr<Ktransaction>, transactionid: MutPtr<Guid>)

public expect fun tmInitializeTransactionManager(transactionmanager: ConstPtr<Long>, logfilename: ConstPtr<UnicodeString>, tmid: ConstPtr<Guid>, createoptions: UInt): Ntstatus

public expect fun tmIsTransactionActive(transaction: ConstPtr<Ktransaction>): Boolean

public expect fun tmPrePrepareComplete(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus

public expect fun tmPrePrepareEnlistment(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus

public expect fun tmPrepareComplete(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus

public expect fun tmPrepareEnlistment(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus

public expect fun tmPropagationComplete(resourcemanager: ConstPtr<Kresourcemanager>, requestcookie: UInt, bufferlength: UInt, buffer: ConstPtr<CVoid>): Ntstatus

public expect fun tmPropagationFailed(resourcemanager: ConstPtr<Kresourcemanager>, requestcookie: UInt, status: Ntstatus): Ntstatus

public expect fun tmReadOnlyEnlistment(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus

public expect fun tmRecoverEnlistment(enlistment: ConstPtr<Kenlistment>, enlistmentkey: ConstPtr<CVoid>): Ntstatus

public expect fun tmRecoverResourceManager(resourcemanager: ConstPtr<Kresourcemanager>): Ntstatus

public expect fun tmRecoverTransactionManager(tm: ConstPtr<Ktm>, targetvirtualclock: ConstPtr<Long>): Ntstatus

public expect fun tmReferenceEnlistmentKey(enlistment: ConstPtr<Kenlistment>, key: MutPtr<MutPtr<CVoid>>): Ntstatus

public expect fun tmRenameTransactionManager(logfilename: ConstPtr<UnicodeString>, existingtransactionmanagerguid: ConstPtr<Guid>): Ntstatus

public expect fun tmRequestOutcomeEnlistment(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus

public expect fun tmRollbackComplete(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus

public expect fun tmRollbackEnlistment(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus

public expect fun tmRollbackTransaction(transaction: ConstPtr<Ktransaction>, wait: Boolean): Ntstatus

public expect fun tmSinglePhaseReject(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus

public expect fun vslCreateSecureSection(handle: MutPtr<Handle>, targetprocess: Peprocess, mdl: ConstPtr<Mdl>, devicepageprotection: UInt, attributes: UInt): Ntstatus

public expect fun vslDeleteSecureSection(globalhandle: Handle): Ntstatus

public expect fun wheaAddErrorSource(errorsource: ConstPtr<WheaErrorSourceDescriptor>, context: ConstPtr<CVoid>): Ntstatus

public expect fun wheaAddErrorSourceDeviceDriver(context: MutPtr<CVoid>, configuration: ConstPtr<WheaErrorSourceConfigurationDeviceDriver>, numberpreallocatederrorreports: UInt): Ntstatus

public expect fun wheaAddErrorSourceDeviceDriverV1(context: MutPtr<CVoid>, configuration: ConstPtr<WheaErrorSourceConfigurationDeviceDriver>, numbufferstopreallocate: UInt, maxdatalength: UInt): Ntstatus

public expect fun wheaAddHwErrorReportSectionDeviceDriver(errorhandle: ConstPtr<CVoid>, sectiondatalength: UInt, bufferset: MutPtr<WheaDriverBufferSet>): Ntstatus

public expect fun wheaConfigureErrorSource(sourcetype: WheaErrorSourceType, configuration: ConstPtr<WheaErrorSourceConfiguration>): Ntstatus

public expect fun wheaCreateHwErrorReportDeviceDriver(errorsourceid: UInt, deviceobject: ConstPtr<DeviceObject>): MutPtr<CVoid>

public expect fun wheaErrorSourceGetState(errorsourceid: UInt): WheaErrorSourceState

public expect fun wheaGetNotifyAllOfflinesPolicy(): Boolean

public expect fun wheaHighIrqlLogSelEventHandlerRegister(handler: PfnWheaHighIrqlLogSelEventHandler, context: ConstPtr<CVoid>): Boolean

public expect fun wheaHighIrqlLogSelEventHandlerUnregister()

public expect fun wheaHwErrorReportAbandonDeviceDriver(errorhandle: ConstPtr<CVoid>): Ntstatus

public expect fun wheaHwErrorReportSetSectionNameDeviceDriver(bufferset: ConstPtr<WheaDriverBufferSet>, namelength: UInt, name: ConstPtr<UByte>): Ntstatus

public expect fun wheaHwErrorReportSetSeverityDeviceDriver(errorhandle: ConstPtr<CVoid>, errorseverity: WheaErrorSeverity): Ntstatus

public expect fun wheaHwErrorReportSubmitDeviceDriver(errorhandle: ConstPtr<CVoid>): Ntstatus

public expect fun wheaInitializeRecordHeader(header: MutPtr<WheaErrorRecordHeader>): Ntstatus

public expect fun wheaIsCriticalState(): Boolean

public expect fun wheaLogInternalEvent(entry: ConstPtr<WheaEventLogEntry>)

public expect fun wheaRegisterInUsePageOfflineNotification(callback: PfnInUsePageOfflineNotify, context: ConstPtr<CVoid>): Ntstatus

public expect fun wheaRemoveErrorSource(errorsourceid: UInt)

public expect fun wheaRemoveErrorSourceDeviceDriver(errorsourceid: UInt): Ntstatus

public expect fun wheaReportHwError(errorpacket: MutPtr<WheaErrorPacketV2>): Ntstatus

public expect fun wheaReportHwErrorDeviceDriver(errorsourceid: UInt, deviceobject: ConstPtr<DeviceObject>, errordata: ConstPtr<UByte>, errordatalength: UInt, sectiontypeguid: ConstPtr<Guid>, errorseverity: WheaErrorSeverity, devicefriendlyname: Pcstr): Ntstatus

public expect fun wheaUnconfigureErrorSource(sourcetype: WheaErrorSourceType): Ntstatus

public expect fun wheaUnregisterInUsePageOfflineNotification(callback: PfnInUsePageOfflineNotify): Ntstatus

public expect fun wmiQueryTraceInformation(traceinformationclass: TraceInformationClass, traceinformation: MutPtr<CVoid>, traceinformationlength: UInt, requiredlength: MutPtr<UInt>, buffer: ConstPtr<CVoid>): Ntstatus

public expect fun zwAllocateLocallyUniqueId(luid: MutPtr<Luid>): Ntstatus

public expect fun zwClose(handle: Handle): Ntstatus

public expect fun zwCommitComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus

public expect fun zwCommitEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus

public expect fun zwCommitTransaction(transactionhandle: Handle, wait: Boolean): Ntstatus

public expect fun zwCreateEnlistment(enlistmenthandle: MutPtr<Handle>, desiredaccess: UInt, resourcemanagerhandle: Handle, transactionhandle: Handle, objectattributes: ConstPtr<ObjectAttributes>, createoptions: UInt, notificationmask: UInt, enlistmentkey: ConstPtr<CVoid>): Ntstatus

public expect fun zwCreateFile(filehandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, allocationsize: ConstPtr<Long>, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: ConstPtr<CVoid>, ealength: UInt): Ntstatus

public expect fun zwCreateResourceManager(resourcemanagerhandle: MutPtr<Handle>, desiredaccess: UInt, tmhandle: Handle, resourcemanagerguid: ConstPtr<Guid>, objectattributes: ConstPtr<ObjectAttributes>, createoptions: UInt, description: ConstPtr<UnicodeString>): Ntstatus

public expect fun zwCreateSection(sectionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, maximumsize: ConstPtr<Long>, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: Handle): Ntstatus

public expect fun zwCreateTransaction(transactionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, uow: ConstPtr<Guid>, tmhandle: Handle, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: ConstPtr<Long>, description: ConstPtr<UnicodeString>): Ntstatus

public expect fun zwCreateTransactionManager(tmhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, logfilename: ConstPtr<UnicodeString>, createoptions: UInt, commitstrength: UInt): Ntstatus

public expect fun zwDeviceIoControlFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, iocontrolcode: UInt, inputbuffer: ConstPtr<CVoid>, inputbufferlength: UInt, outputbuffer: MutPtr<CVoid>, outputbufferlength: UInt): Ntstatus

public expect fun zwDisplayString(string: ConstPtr<UnicodeString>): Ntstatus

public expect fun zwEnumerateTransactionObject(rootobjecthandle: Handle, querytype: KtmobjectType, objectcursor: MutPtr<KtmobjectCursor>, objectcursorlength: UInt, returnlength: MutPtr<UInt>): Ntstatus

public expect fun zwGetNotificationResourceManager(resourcemanagerhandle: Handle, transactionnotification: MutPtr<TransactionNotification>, notificationlength: UInt, timeout: ConstPtr<Long>, returnlength: MutPtr<UInt>, asynchronous: UInt, asynchronouscontext: ULong): Ntstatus

public expect fun zwLoadDriver(driverservicename: ConstPtr<UnicodeString>): Ntstatus

public expect fun zwMakeTemporaryObject(handle: Handle): Ntstatus

public expect fun zwManagePartition(targethandle: Handle, sourcehandle: Handle, partitioninformationclass: PartitionInformationClass, partitioninformation: MutPtr<CVoid>, partitioninformationlength: UInt): Ntstatus

public expect fun zwOpenEnlistment(enlistmenthandle: MutPtr<Handle>, desiredaccess: UInt, rmhandle: Handle, enlistmentguid: ConstPtr<Guid>, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus

public expect fun zwOpenFile(filehandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, shareaccess: UInt, openoptions: UInt): Ntstatus

public expect fun zwOpenResourceManager(resourcemanagerhandle: MutPtr<Handle>, desiredaccess: UInt, tmhandle: Handle, resourcemanagerguid: ConstPtr<Guid>, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus

public expect fun zwOpenSymbolicLinkObject(linkhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus

public expect fun zwOpenTransaction(transactionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, uow: ConstPtr<Guid>, tmhandle: Handle): Ntstatus

public expect fun zwOpenTransactionManager(tmhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, logfilename: ConstPtr<UnicodeString>, tmidentity: ConstPtr<Guid>, openoptions: UInt): Ntstatus

public expect fun zwPowerInformation(informationlevel: PowerInformationLevel, inputbuffer: ConstPtr<CVoid>, inputbufferlength: UInt, outputbuffer: MutPtr<CVoid>, outputbufferlength: UInt): Ntstatus

public expect fun zwPrePrepareComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus

public expect fun zwPrePrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus

public expect fun zwPrepareComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus

public expect fun zwPrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus

public expect fun zwPropagationComplete(resourcemanagerhandle: Handle, requestcookie: UInt, bufferlength: UInt, buffer: ConstPtr<CVoid>): Ntstatus

public expect fun zwPropagationFailed(resourcemanagerhandle: Handle, requestcookie: UInt, propstatus: Ntstatus): Ntstatus

public expect fun zwQueryInformationByName(objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, fileinformation: MutPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass): Ntstatus

public expect fun zwQueryInformationEnlistment(enlistmenthandle: Handle, enlistmentinformationclass: EnlistmentInformationClass, enlistmentinformation: MutPtr<CVoid>, enlistmentinformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus

public expect fun zwQueryInformationFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, fileinformation: MutPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass): Ntstatus

public expect fun zwQueryInformationResourceManager(resourcemanagerhandle: Handle, resourcemanagerinformationclass: ResourcemanagerInformationClass, resourcemanagerinformation: MutPtr<CVoid>, resourcemanagerinformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus

public expect fun zwQueryInformationTransaction(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: MutPtr<CVoid>, transactioninformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus

public expect fun zwQueryInformationTransactionManager(transactionmanagerhandle: Handle, transactionmanagerinformationclass: TransactionmanagerInformationClass, transactionmanagerinformation: MutPtr<CVoid>, transactionmanagerinformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus

public expect fun zwQuerySymbolicLinkObject(linkhandle: Handle, linktarget: MutPtr<UnicodeString>, returnedlength: MutPtr<UInt>): Ntstatus

public expect fun zwReadFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, buffer: MutPtr<CVoid>, length: UInt, byteoffset: ConstPtr<Long>, key: ConstPtr<UInt>): Ntstatus

public expect fun zwReadOnlyEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus

public expect fun zwRecoverEnlistment(enlistmenthandle: Handle, enlistmentkey: ConstPtr<CVoid>): Ntstatus

public expect fun zwRecoverResourceManager(resourcemanagerhandle: Handle): Ntstatus

public expect fun zwRecoverTransactionManager(transactionmanagerhandle: Handle): Ntstatus

public expect fun zwRegisterProtocolAddressInformation(resourcemanager: Handle, protocolid: ConstPtr<Guid>, protocolinformationsize: UInt, protocolinformation: ConstPtr<CVoid>, createoptions: UInt): Ntstatus

public expect fun zwRenameTransactionManager(logfilename: ConstPtr<UnicodeString>, existingtransactionmanagerguid: ConstPtr<Guid>): Ntstatus

public expect fun zwRollbackComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus

public expect fun zwRollbackEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus

public expect fun zwRollbackTransaction(transactionhandle: Handle, wait: Boolean): Ntstatus

public expect fun zwRollforwardTransactionManager(transactionmanagerhandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus

public expect fun zwSetInformationEnlistment(enlistmenthandle: Handle, enlistmentinformationclass: EnlistmentInformationClass, enlistmentinformation: ConstPtr<CVoid>, enlistmentinformationlength: UInt): Ntstatus

public expect fun zwSetInformationFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, fileinformation: ConstPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass): Ntstatus

public expect fun zwSetInformationResourceManager(resourcemanagerhandle: Handle, resourcemanagerinformationclass: ResourcemanagerInformationClass, resourcemanagerinformation: ConstPtr<CVoid>, resourcemanagerinformationlength: UInt): Ntstatus

public expect fun zwSetInformationTransaction(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: ConstPtr<CVoid>, transactioninformationlength: UInt): Ntstatus

public expect fun zwSetInformationTransactionManager(tmhandle: Handle, transactionmanagerinformationclass: TransactionmanagerInformationClass, transactionmanagerinformation: ConstPtr<CVoid>, transactionmanagerinformationlength: UInt): Ntstatus

public expect fun zwSinglePhaseReject(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus

public expect fun zwUnloadDriver(driverservicename: ConstPtr<UnicodeString>): Ntstatus

public expect fun zwWriteFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, buffer: ConstPtr<CVoid>, length: UInt, byteoffset: ConstPtr<Long>, key: ConstPtr<UInt>): Ntstatus

public expect fun vDbgPrintEx(componentid: UInt, level: UInt, format: Pcstr, arglist: ConstPtr<Byte>): UInt

public expect fun vDbgPrintExWithPrefix(prefix: Pcstr, componentid: UInt, level: UInt, format: Pcstr, arglist: ConstPtr<Byte>): UInt
