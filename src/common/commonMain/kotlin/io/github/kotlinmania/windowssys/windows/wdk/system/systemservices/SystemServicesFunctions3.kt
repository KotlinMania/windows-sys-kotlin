package io.github.kotlinmania.windowssys.windows.wdk.system.systemservices

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Peprocess
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PoolType
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FileInformationClass
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.SeAdtParameterType
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.WheaErrorSourceState
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.WheaErrorSourceType
import io.github.kotlinmania.windowssys.windows.win32.system.io.PioApcRoutine
import io.github.kotlinmania.windowssys.windows.win32.system.power.PowerInformationLevel
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.RtlSystemGlobalDataId
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.EnlistmentInformationClass
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.KtmobjectType
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.ResourcemanagerInformationClass
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.TransactionInformationClass
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.TransactionmanagerInformationClass

public expect fun rtlSetSystemGlobalData(dataid: RtlSystemGlobalDataId, buffer: ConstPtr, size: UInt): Ntstatus

public expect fun rtlSplay(links: MutPtr): MutPtr

public expect fun rtlStringFromGUID(guid: ConstPtr, guidstring: MutPtr): Ntstatus

public expect fun rtlStronglyEnumerateEntryHashTable(hashtable: ConstPtr, enumerator: MutPtr): MutPtr

public expect fun rtlSubtreePredecessor(links: ConstPtr): MutPtr

public expect fun rtlSubtreeSuccessor(links: ConstPtr): MutPtr

public expect fun rtlSuffixUnicodeString(string1: ConstPtr, string2: ConstPtr, caseinsensitive: Boolean): Boolean

public expect fun rtlTestBit(bitmapheader: ConstPtr, bitnumber: UInt): Boolean

public expect fun rtlTimeFieldsToTime(timefields: ConstPtr, time: MutPtr): Boolean

public expect fun rtlTimeToTimeFields(time: ConstPtr, timefields: MutPtr)

public expect fun rtlUTF8StringToUnicodeString(destinationstring: MutPtr, sourcestring: ConstPtr, allocatedestinationstring: Boolean): Ntstatus

public expect fun rtlUTF8ToUnicodeN(unicodestringdestination: Pwstr, unicodestringmaxbytecount: UInt, unicodestringactualbytecount: MutPtr, utf8stringsource: Pcstr, utf8stringbytecount: UInt): Ntstatus

public expect fun rtlUnicodeStringToInt64(string: ConstPtr, base: UInt, number: MutPtr, endpointer: MutPtr): Ntstatus

public expect fun rtlUnicodeStringToInteger(string: ConstPtr, base: UInt, value: MutPtr): Ntstatus

public expect fun rtlUnicodeStringToUTF8String(destinationstring: MutPtr, sourcestring: ConstPtr, allocatedestinationstring: Boolean): Ntstatus

public expect fun rtlUnicodeToUTF8N(utf8stringdestination: Pstr, utf8stringmaxbytecount: UInt, utf8stringactualbytecount: MutPtr, unicodestringsource: ConstPtr, unicodestringbytecount: UInt): Ntstatus

public expect fun rtlUpcaseUnicodeChar(sourcecharacter: UShort): UShort

public expect fun rtlUpcaseUnicodeString(destinationstring: MutPtr, sourcestring: ConstPtr, allocatedestinationstring: Boolean): Ntstatus

public expect fun rtlUpperChar(character: Byte): Byte

public expect fun rtlUpperString(destinationstring: MutPtr, sourcestring: ConstPtr)

public expect fun rtlValidRelativeSecurityDescriptor(securitydescriptorinput: PsecurityDescriptor, securitydescriptorlength: UInt, requiredinformation: UInt): Boolean

public expect fun rtlValidSecurityDescriptor(securitydescriptor: PsecurityDescriptor): Boolean

public expect fun rtlVerifyVersionInfo(versioninfo: ConstPtr, typemask: UInt, conditionmask: ULong): Ntstatus

public expect fun rtlVolumeDeviceToDosName(volumedeviceobject: ConstPtr, dosname: MutPtr): Ntstatus

public expect fun rtlWalkFrameChain(callers: MutPtr, count: UInt, flags: UInt): UInt

public expect fun rtlWeaklyEnumerateEntryHashTable(hashtable: ConstPtr, enumerator: MutPtr): MutPtr

public expect fun rtlWriteRegistryValue(relativeto: UInt, path: Pcwstr, valuename: Pcwstr, valuetype: UInt, valuedata: ConstPtr, valuelength: UInt): Ntstatus

public expect fun rtlxAnsiStringToUnicodeSize(ansistring: ConstPtr): UInt

public expect fun rtlxUnicodeStringToAnsiSize(unicodestring: ConstPtr): UInt

public expect fun seAccessCheck(securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr, subjectcontextlocked: Boolean, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: MutPtr, genericmapping: ConstPtr, accessmode: Byte, grantedaccess: MutPtr, accessstatus: MutPtr): Boolean

public expect fun seAssignSecurity(parentdescriptor: PsecurityDescriptor, explicitdescriptor: PsecurityDescriptor, newdescriptor: MutPtr, isdirectoryobject: Boolean, subjectcontext: ConstPtr, genericmapping: ConstPtr, pooltype: PoolType): Ntstatus

public expect fun seAssignSecurityEx(parentdescriptor: PsecurityDescriptor, explicitdescriptor: PsecurityDescriptor, newdescriptor: MutPtr, objecttype: ConstPtr, isdirectoryobject: Boolean, autoinheritflags: UInt, subjectcontext: ConstPtr, genericmapping: ConstPtr, pooltype: PoolType): Ntstatus

public expect fun seCaptureSubjectContext(subjectcontext: MutPtr)

public expect fun seComputeAutoInheritByObjectType(objecttype: ConstPtr, securitydescriptor: PsecurityDescriptor, parentsecuritydescriptor: PsecurityDescriptor): UInt

public expect fun seDeassignSecurity(securitydescriptor: MutPtr): Ntstatus

public expect fun seEtwWriteKMCveEvent(cveid: ConstPtr, additionaldetails: ConstPtr): Ntstatus

public expect fun seLockSubjectContext(subjectcontext: ConstPtr)

public expect fun seRegisterImageVerificationCallback(imagetype: SeImageType, callbacktype: SeImageVerificationCallbackType, callbackfunction: PseImageVerificationCallbackFunction, callbackcontext: ConstPtr, token: ConstPtr, callbackhandle: MutPtr): Ntstatus

public expect fun seReleaseSubjectContext(subjectcontext: MutPtr)

public expect fun seReportSecurityEvent(flags: UInt, sourcename: ConstPtr, usersid: Psid, auditparameters: ConstPtr): Ntstatus

public expect fun seSetAuditParameter(auditparameters: MutPtr, type: SeAdtParameterType, index: UInt, data: ConstPtr): Ntstatus

public expect fun seSinglePrivilegeCheck(privilegevalue: Luid, previousmode: Byte): Boolean

public expect fun seUnlockSubjectContext(subjectcontext: ConstPtr)

public expect fun seUnregisterImageVerificationCallback(callbackhandle: ConstPtr)

public expect fun seValidSecurityDescriptor(length: UInt, securitydescriptor: PsecurityDescriptor): Boolean

public expect fun tmCommitComplete(enlistment: ConstPtr, tmvirtualclock: ConstPtr): Ntstatus

public expect fun tmCommitEnlistment(enlistment: ConstPtr, tmvirtualclock: ConstPtr): Ntstatus

public expect fun tmCommitTransaction(transaction: ConstPtr, wait: Boolean): Ntstatus

public expect fun tmCreateEnlistment(enlistmenthandle: MutPtr, previousmode: Byte, desiredaccess: UInt, objectattributes: ConstPtr, resourcemanager: ConstPtr, transaction: ConstPtr, createoptions: UInt, notificationmask: UInt, enlistmentkey: ConstPtr): Ntstatus

public expect fun tmDereferenceEnlistmentKey(enlistment: ConstPtr, lastreference: MutPtr): Ntstatus

public expect fun tmEnableCallbacks(resourcemanager: ConstPtr, callbackroutine: PtmRmNotification, rmkey: ConstPtr): Ntstatus

public expect fun tmGetTransactionId(transaction: ConstPtr, transactionid: MutPtr)

public expect fun tmInitializeTransactionManager(transactionmanager: ConstPtr, logfilename: ConstPtr, tmid: ConstPtr, createoptions: UInt): Ntstatus

public expect fun tmIsTransactionActive(transaction: ConstPtr): Boolean

public expect fun tmPrePrepareComplete(enlistment: ConstPtr, tmvirtualclock: ConstPtr): Ntstatus

public expect fun tmPrePrepareEnlistment(enlistment: ConstPtr, tmvirtualclock: ConstPtr): Ntstatus

public expect fun tmPrepareComplete(enlistment: ConstPtr, tmvirtualclock: ConstPtr): Ntstatus

public expect fun tmPrepareEnlistment(enlistment: ConstPtr, tmvirtualclock: ConstPtr): Ntstatus

public expect fun tmPropagationComplete(resourcemanager: ConstPtr, requestcookie: UInt, bufferlength: UInt, buffer: ConstPtr): Ntstatus

public expect fun tmPropagationFailed(resourcemanager: ConstPtr, requestcookie: UInt, status: Ntstatus): Ntstatus

public expect fun tmReadOnlyEnlistment(enlistment: ConstPtr, tmvirtualclock: ConstPtr): Ntstatus

public expect fun tmRecoverEnlistment(enlistment: ConstPtr, enlistmentkey: ConstPtr): Ntstatus

public expect fun tmRecoverResourceManager(resourcemanager: ConstPtr): Ntstatus

public expect fun tmRecoverTransactionManager(tm: ConstPtr, targetvirtualclock: ConstPtr): Ntstatus

public expect fun tmReferenceEnlistmentKey(enlistment: ConstPtr, key: MutPtr): Ntstatus

public expect fun tmRenameTransactionManager(logfilename: ConstPtr, existingtransactionmanagerguid: ConstPtr): Ntstatus

public expect fun tmRequestOutcomeEnlistment(enlistment: ConstPtr, tmvirtualclock: ConstPtr): Ntstatus

public expect fun tmRollbackComplete(enlistment: ConstPtr, tmvirtualclock: ConstPtr): Ntstatus

public expect fun tmRollbackEnlistment(enlistment: ConstPtr, tmvirtualclock: ConstPtr): Ntstatus

public expect fun tmRollbackTransaction(transaction: ConstPtr, wait: Boolean): Ntstatus

public expect fun tmSinglePhaseReject(enlistment: ConstPtr, tmvirtualclock: ConstPtr): Ntstatus

public expect fun vslCreateSecureSection(handle: MutPtr, targetprocess: Peprocess, mdl: ConstPtr, devicepageprotection: UInt, attributes: UInt): Ntstatus

public expect fun vslDeleteSecureSection(globalhandle: Handle): Ntstatus

public expect fun wheaAddErrorSource(errorsource: ConstPtr, context: ConstPtr): Ntstatus

public expect fun wheaAddErrorSourceDeviceDriver(context: MutPtr, configuration: ConstPtr, numberpreallocatederrorreports: UInt): Ntstatus

public expect fun wheaAddErrorSourceDeviceDriverV1(context: MutPtr, configuration: ConstPtr, numbufferstopreallocate: UInt, maxdatalength: UInt): Ntstatus

public expect fun wheaAddHwErrorReportSectionDeviceDriver(errorhandle: ConstPtr, sectiondatalength: UInt, bufferset: MutPtr): Ntstatus

public expect fun wheaConfigureErrorSource(sourcetype: WheaErrorSourceType, configuration: ConstPtr): Ntstatus

public expect fun wheaCreateHwErrorReportDeviceDriver(errorsourceid: UInt, deviceobject: ConstPtr): MutPtr

public expect fun wheaErrorSourceGetState(errorsourceid: UInt): WheaErrorSourceState

public expect fun wheaGetNotifyAllOfflinesPolicy(): Boolean

public expect fun wheaHighIrqlLogSelEventHandlerRegister(handler: PfnWheaHighIrqlLogSelEventHandler, context: ConstPtr): Boolean

public expect fun wheaHighIrqlLogSelEventHandlerUnregister()

public expect fun wheaHwErrorReportAbandonDeviceDriver(errorhandle: ConstPtr): Ntstatus

public expect fun wheaHwErrorReportSetSectionNameDeviceDriver(bufferset: ConstPtr, namelength: UInt, name: ConstPtr): Ntstatus

public expect fun wheaHwErrorReportSetSeverityDeviceDriver(errorhandle: ConstPtr, errorseverity: WheaErrorSeverity): Ntstatus

public expect fun wheaHwErrorReportSubmitDeviceDriver(errorhandle: ConstPtr): Ntstatus

public expect fun wheaInitializeRecordHeader(header: MutPtr): Ntstatus

public expect fun wheaIsCriticalState(): Boolean

public expect fun wheaLogInternalEvent(entry: ConstPtr)

public expect fun wheaRegisterInUsePageOfflineNotification(callback: PfnInUsePageOfflineNotify, context: ConstPtr): Ntstatus

public expect fun wheaRemoveErrorSource(errorsourceid: UInt)

public expect fun wheaRemoveErrorSourceDeviceDriver(errorsourceid: UInt): Ntstatus

public expect fun wheaReportHwError(errorpacket: MutPtr): Ntstatus

public expect fun wheaReportHwErrorDeviceDriver(errorsourceid: UInt, deviceobject: ConstPtr, errordata: ConstPtr, errordatalength: UInt, sectiontypeguid: ConstPtr, errorseverity: WheaErrorSeverity, devicefriendlyname: Pcstr): Ntstatus

public expect fun wheaUnconfigureErrorSource(sourcetype: WheaErrorSourceType): Ntstatus

public expect fun wheaUnregisterInUsePageOfflineNotification(callback: PfnInUsePageOfflineNotify): Ntstatus

public expect fun wmiQueryTraceInformation(traceinformationclass: TraceInformationClass, traceinformation: MutPtr, traceinformationlength: UInt, requiredlength: MutPtr, buffer: ConstPtr): Ntstatus

public expect fun zwAllocateLocallyUniqueId(luid: MutPtr): Ntstatus

public expect fun zwClose(handle: Handle): Ntstatus

public expect fun zwCommitComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr): Ntstatus

public expect fun zwCommitEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr): Ntstatus

public expect fun zwCommitTransaction(transactionhandle: Handle, wait: Boolean): Ntstatus

public expect fun zwCreateEnlistment(enlistmenthandle: MutPtr, desiredaccess: UInt, resourcemanagerhandle: Handle, transactionhandle: Handle, objectattributes: ConstPtr, createoptions: UInt, notificationmask: UInt, enlistmentkey: ConstPtr): Ntstatus

public expect fun zwCreateFile(filehandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, iostatusblock: MutPtr, allocationsize: ConstPtr, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: ConstPtr, ealength: UInt): Ntstatus

public expect fun zwCreateResourceManager(resourcemanagerhandle: MutPtr, desiredaccess: UInt, tmhandle: Handle, resourcemanagerguid: ConstPtr, objectattributes: ConstPtr, createoptions: UInt, description: ConstPtr): Ntstatus

public expect fun zwCreateSection(sectionhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, maximumsize: ConstPtr, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: Handle): Ntstatus

public expect fun zwCreateTransaction(transactionhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, uow: ConstPtr, tmhandle: Handle, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: ConstPtr, description: ConstPtr): Ntstatus

public expect fun zwCreateTransactionManager(tmhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, logfilename: ConstPtr, createoptions: UInt, commitstrength: UInt): Ntstatus

public expect fun zwDeviceIoControlFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, iocontrolcode: UInt, inputbuffer: ConstPtr, inputbufferlength: UInt, outputbuffer: MutPtr, outputbufferlength: UInt): Ntstatus

public expect fun zwDisplayString(string: ConstPtr): Ntstatus

public expect fun zwEnumerateTransactionObject(rootobjecthandle: Handle, querytype: KtmobjectType, objectcursor: MutPtr, objectcursorlength: UInt, returnlength: MutPtr): Ntstatus

public expect fun zwGetNotificationResourceManager(resourcemanagerhandle: Handle, transactionnotification: MutPtr, notificationlength: UInt, timeout: ConstPtr, returnlength: MutPtr, asynchronous: UInt, asynchronouscontext: ULong): Ntstatus

public expect fun zwLoadDriver(driverservicename: ConstPtr): Ntstatus

public expect fun zwMakeTemporaryObject(handle: Handle): Ntstatus

public expect fun zwManagePartition(targethandle: Handle, sourcehandle: Handle, partitioninformationclass: PartitionInformationClass, partitioninformation: MutPtr, partitioninformationlength: UInt): Ntstatus

public expect fun zwOpenEnlistment(enlistmenthandle: MutPtr, desiredaccess: UInt, rmhandle: Handle, enlistmentguid: ConstPtr, objectattributes: ConstPtr): Ntstatus

public expect fun zwOpenFile(filehandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, iostatusblock: MutPtr, shareaccess: UInt, openoptions: UInt): Ntstatus

public expect fun zwOpenResourceManager(resourcemanagerhandle: MutPtr, desiredaccess: UInt, tmhandle: Handle, resourcemanagerguid: ConstPtr, objectattributes: ConstPtr): Ntstatus

public expect fun zwOpenSymbolicLinkObject(linkhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus

public expect fun zwOpenTransaction(transactionhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, uow: ConstPtr, tmhandle: Handle): Ntstatus

public expect fun zwOpenTransactionManager(tmhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, logfilename: ConstPtr, tmidentity: ConstPtr, openoptions: UInt): Ntstatus

public expect fun zwPowerInformation(informationlevel: PowerInformationLevel, inputbuffer: ConstPtr, inputbufferlength: UInt, outputbuffer: MutPtr, outputbufferlength: UInt): Ntstatus

public expect fun zwPrePrepareComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr): Ntstatus

public expect fun zwPrePrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr): Ntstatus

public expect fun zwPrepareComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr): Ntstatus

public expect fun zwPrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr): Ntstatus

public expect fun zwPropagationComplete(resourcemanagerhandle: Handle, requestcookie: UInt, bufferlength: UInt, buffer: ConstPtr): Ntstatus

public expect fun zwPropagationFailed(resourcemanagerhandle: Handle, requestcookie: UInt, propstatus: Ntstatus): Ntstatus

public expect fun zwQueryInformationByName(objectattributes: ConstPtr, iostatusblock: MutPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass): Ntstatus

public expect fun zwQueryInformationEnlistment(enlistmenthandle: Handle, enlistmentinformationclass: EnlistmentInformationClass, enlistmentinformation: MutPtr, enlistmentinformationlength: UInt, returnlength: MutPtr): Ntstatus

public expect fun zwQueryInformationFile(filehandle: Handle, iostatusblock: MutPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass): Ntstatus

public expect fun zwQueryInformationResourceManager(resourcemanagerhandle: Handle, resourcemanagerinformationclass: ResourcemanagerInformationClass, resourcemanagerinformation: MutPtr, resourcemanagerinformationlength: UInt, returnlength: MutPtr): Ntstatus

public expect fun zwQueryInformationTransaction(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: MutPtr, transactioninformationlength: UInt, returnlength: MutPtr): Ntstatus

public expect fun zwQueryInformationTransactionManager(transactionmanagerhandle: Handle, transactionmanagerinformationclass: TransactionmanagerInformationClass, transactionmanagerinformation: MutPtr, transactionmanagerinformationlength: UInt, returnlength: MutPtr): Ntstatus

public expect fun zwQuerySymbolicLinkObject(linkhandle: Handle, linktarget: MutPtr, returnedlength: MutPtr): Ntstatus

public expect fun zwReadFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, buffer: MutPtr, length: UInt, byteoffset: ConstPtr, key: ConstPtr): Ntstatus

public expect fun zwReadOnlyEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr): Ntstatus

public expect fun zwRecoverEnlistment(enlistmenthandle: Handle, enlistmentkey: ConstPtr): Ntstatus

public expect fun zwRecoverResourceManager(resourcemanagerhandle: Handle): Ntstatus

public expect fun zwRecoverTransactionManager(transactionmanagerhandle: Handle): Ntstatus

public expect fun zwRegisterProtocolAddressInformation(resourcemanager: Handle, protocolid: ConstPtr, protocolinformationsize: UInt, protocolinformation: ConstPtr, createoptions: UInt): Ntstatus

public expect fun zwRenameTransactionManager(logfilename: ConstPtr, existingtransactionmanagerguid: ConstPtr): Ntstatus

public expect fun zwRollbackComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr): Ntstatus

public expect fun zwRollbackEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr): Ntstatus

public expect fun zwRollbackTransaction(transactionhandle: Handle, wait: Boolean): Ntstatus

public expect fun zwRollforwardTransactionManager(transactionmanagerhandle: Handle, tmvirtualclock: ConstPtr): Ntstatus

public expect fun zwSetInformationEnlistment(enlistmenthandle: Handle, enlistmentinformationclass: EnlistmentInformationClass, enlistmentinformation: ConstPtr, enlistmentinformationlength: UInt): Ntstatus

public expect fun zwSetInformationFile(filehandle: Handle, iostatusblock: MutPtr, fileinformation: ConstPtr, length: UInt, fileinformationclass: FileInformationClass): Ntstatus

public expect fun zwSetInformationResourceManager(resourcemanagerhandle: Handle, resourcemanagerinformationclass: ResourcemanagerInformationClass, resourcemanagerinformation: ConstPtr, resourcemanagerinformationlength: UInt): Ntstatus

public expect fun zwSetInformationTransaction(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: ConstPtr, transactioninformationlength: UInt): Ntstatus

public expect fun zwSetInformationTransactionManager(tmhandle: Handle, transactionmanagerinformationclass: TransactionmanagerInformationClass, transactionmanagerinformation: ConstPtr, transactionmanagerinformationlength: UInt): Ntstatus

public expect fun zwSinglePhaseReject(enlistmenthandle: Handle, tmvirtualclock: ConstPtr): Ntstatus

public expect fun zwUnloadDriver(driverservicename: ConstPtr): Ntstatus

public expect fun zwWriteFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, buffer: ConstPtr, length: UInt, byteoffset: ConstPtr, key: ConstPtr): Ntstatus

public expect fun vDbgPrintEx(componentid: UInt, level: UInt, format: Pcstr, arglist: ConstPtr): UInt

public expect fun vDbgPrintExWithPrefix(prefix: Pcstr, componentid: UInt, level: UInt, format: Pcstr, arglist: ConstPtr): UInt
