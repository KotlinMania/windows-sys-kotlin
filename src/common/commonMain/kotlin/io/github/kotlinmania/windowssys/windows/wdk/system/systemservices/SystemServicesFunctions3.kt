package io.github.kotlinmania.windowssys.windows.wdk.system.systemservices

import io.github.kotlinmania.windowssys.COpaquePointer
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

public expect fun rtlSetSystemGlobalData(dataid: RtlSystemGlobalDataId, buffer: COpaquePointer?, size: UInt): Ntstatus

public expect fun rtlSplay(links: COpaquePointer?): COpaquePointer?

public expect fun rtlStringFromGUID(guid: COpaquePointer?, guidstring: COpaquePointer?): Ntstatus

public expect fun rtlStronglyEnumerateEntryHashTable(hashtable: COpaquePointer?, enumerator: COpaquePointer?): COpaquePointer?

public expect fun rtlSubtreePredecessor(links: COpaquePointer?): COpaquePointer?

public expect fun rtlSubtreeSuccessor(links: COpaquePointer?): COpaquePointer?

public expect fun rtlSuffixUnicodeString(string1: COpaquePointer?, string2: COpaquePointer?, caseinsensitive: Boolean): Boolean

public expect fun rtlTestBit(bitmapheader: COpaquePointer?, bitnumber: UInt): Boolean

public expect fun rtlTimeFieldsToTime(timefields: COpaquePointer?, time: COpaquePointer?): Boolean

public expect fun rtlTimeToTimeFields(time: COpaquePointer?, timefields: COpaquePointer?)

public expect fun rtlUTF8StringToUnicodeString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?, allocatedestinationstring: Boolean): Ntstatus

public expect fun rtlUTF8ToUnicodeN(unicodestringdestination: Pwstr, unicodestringmaxbytecount: UInt, unicodestringactualbytecount: COpaquePointer?, utf8stringsource: Pcstr, utf8stringbytecount: UInt): Ntstatus

public expect fun rtlUnicodeStringToInt64(string: COpaquePointer?, base: UInt, number: COpaquePointer?, endpointer: COpaquePointer?): Ntstatus

public expect fun rtlUnicodeStringToInteger(string: COpaquePointer?, base: UInt, value: COpaquePointer?): Ntstatus

public expect fun rtlUnicodeStringToUTF8String(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?, allocatedestinationstring: Boolean): Ntstatus

public expect fun rtlUnicodeToUTF8N(utf8stringdestination: Pstr, utf8stringmaxbytecount: UInt, utf8stringactualbytecount: COpaquePointer?, unicodestringsource: COpaquePointer?, unicodestringbytecount: UInt): Ntstatus

public expect fun rtlUpcaseUnicodeChar(sourcecharacter: UShort): UShort

public expect fun rtlUpcaseUnicodeString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?, allocatedestinationstring: Boolean): Ntstatus

public expect fun rtlUpperChar(character: Byte): Byte

public expect fun rtlUpperString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?)

public expect fun rtlValidRelativeSecurityDescriptor(securitydescriptorinput: PsecurityDescriptor, securitydescriptorlength: UInt, requiredinformation: UInt): Boolean

public expect fun rtlValidSecurityDescriptor(securitydescriptor: PsecurityDescriptor): Boolean

public expect fun rtlVerifyVersionInfo(versioninfo: COpaquePointer?, typemask: UInt, conditionmask: ULong): Ntstatus

public expect fun rtlVolumeDeviceToDosName(volumedeviceobject: COpaquePointer?, dosname: COpaquePointer?): Ntstatus

public expect fun rtlWalkFrameChain(callers: COpaquePointer?, count: UInt, flags: UInt): UInt

public expect fun rtlWeaklyEnumerateEntryHashTable(hashtable: COpaquePointer?, enumerator: COpaquePointer?): COpaquePointer?

public expect fun rtlWriteRegistryValue(relativeto: UInt, path: Pcwstr, valuename: Pcwstr, valuetype: UInt, valuedata: COpaquePointer?, valuelength: UInt): Ntstatus

public expect fun rtlxAnsiStringToUnicodeSize(ansistring: COpaquePointer?): UInt

public expect fun rtlxUnicodeStringToAnsiSize(unicodestring: COpaquePointer?): UInt

public expect fun seAccessCheck(securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: COpaquePointer?, subjectcontextlocked: Boolean, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: COpaquePointer?, genericmapping: COpaquePointer?, accessmode: Byte, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?): Boolean

public expect fun seAssignSecurity(parentdescriptor: PsecurityDescriptor, explicitdescriptor: PsecurityDescriptor, newdescriptor: COpaquePointer?, isdirectoryobject: Boolean, subjectcontext: COpaquePointer?, genericmapping: COpaquePointer?, pooltype: PoolType): Ntstatus

public expect fun seAssignSecurityEx(parentdescriptor: PsecurityDescriptor, explicitdescriptor: PsecurityDescriptor, newdescriptor: COpaquePointer?, objecttype: COpaquePointer?, isdirectoryobject: Boolean, autoinheritflags: UInt, subjectcontext: COpaquePointer?, genericmapping: COpaquePointer?, pooltype: PoolType): Ntstatus

public expect fun seCaptureSubjectContext(subjectcontext: COpaquePointer?)

public expect fun seComputeAutoInheritByObjectType(objecttype: COpaquePointer?, securitydescriptor: PsecurityDescriptor, parentsecuritydescriptor: PsecurityDescriptor): UInt

public expect fun seDeassignSecurity(securitydescriptor: COpaquePointer?): Ntstatus

public expect fun seEtwWriteKMCveEvent(cveid: COpaquePointer?, additionaldetails: COpaquePointer?): Ntstatus

public expect fun seLockSubjectContext(subjectcontext: COpaquePointer?)

public expect fun seRegisterImageVerificationCallback(imagetype: SeImageType, callbacktype: SeImageVerificationCallbackType, callbackfunction: PseImageVerificationCallbackFunction, callbackcontext: COpaquePointer?, token: COpaquePointer?, callbackhandle: COpaquePointer?): Ntstatus

public expect fun seReleaseSubjectContext(subjectcontext: COpaquePointer?)

public expect fun seReportSecurityEvent(flags: UInt, sourcename: COpaquePointer?, usersid: Psid, auditparameters: COpaquePointer?): Ntstatus

public expect fun seSetAuditParameter(auditparameters: COpaquePointer?, type: SeAdtParameterType, index: UInt, data: COpaquePointer?): Ntstatus

public expect fun seSinglePrivilegeCheck(privilegevalue: Luid, previousmode: Byte): Boolean

public expect fun seUnlockSubjectContext(subjectcontext: COpaquePointer?)

public expect fun seUnregisterImageVerificationCallback(callbackhandle: COpaquePointer?)

public expect fun seValidSecurityDescriptor(length: UInt, securitydescriptor: PsecurityDescriptor): Boolean

public expect fun tmCommitComplete(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus

public expect fun tmCommitEnlistment(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus

public expect fun tmCommitTransaction(transaction: COpaquePointer?, wait: Boolean): Ntstatus

public expect fun tmCreateEnlistment(enlistmenthandle: COpaquePointer?, previousmode: Byte, desiredaccess: UInt, objectattributes: COpaquePointer?, resourcemanager: COpaquePointer?, transaction: COpaquePointer?, createoptions: UInt, notificationmask: UInt, enlistmentkey: COpaquePointer?): Ntstatus

public expect fun tmDereferenceEnlistmentKey(enlistment: COpaquePointer?, lastreference: COpaquePointer?): Ntstatus

public expect fun tmEnableCallbacks(resourcemanager: COpaquePointer?, callbackroutine: PtmRmNotification, rmkey: COpaquePointer?): Ntstatus

public expect fun tmGetTransactionId(transaction: COpaquePointer?, transactionid: COpaquePointer?)

public expect fun tmInitializeTransactionManager(transactionmanager: COpaquePointer?, logfilename: COpaquePointer?, tmid: COpaquePointer?, createoptions: UInt): Ntstatus

public expect fun tmIsTransactionActive(transaction: COpaquePointer?): Boolean

public expect fun tmPrePrepareComplete(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus

public expect fun tmPrePrepareEnlistment(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus

public expect fun tmPrepareComplete(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus

public expect fun tmPrepareEnlistment(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus

public expect fun tmPropagationComplete(resourcemanager: COpaquePointer?, requestcookie: UInt, bufferlength: UInt, buffer: COpaquePointer?): Ntstatus

public expect fun tmPropagationFailed(resourcemanager: COpaquePointer?, requestcookie: UInt, status: Ntstatus): Ntstatus

public expect fun tmReadOnlyEnlistment(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus

public expect fun tmRecoverEnlistment(enlistment: COpaquePointer?, enlistmentkey: COpaquePointer?): Ntstatus

public expect fun tmRecoverResourceManager(resourcemanager: COpaquePointer?): Ntstatus

public expect fun tmRecoverTransactionManager(tm: COpaquePointer?, targetvirtualclock: COpaquePointer?): Ntstatus

public expect fun tmReferenceEnlistmentKey(enlistment: COpaquePointer?, key: COpaquePointer?): Ntstatus

public expect fun tmRenameTransactionManager(logfilename: COpaquePointer?, existingtransactionmanagerguid: COpaquePointer?): Ntstatus

public expect fun tmRequestOutcomeEnlistment(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus

public expect fun tmRollbackComplete(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus

public expect fun tmRollbackEnlistment(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus

public expect fun tmRollbackTransaction(transaction: COpaquePointer?, wait: Boolean): Ntstatus

public expect fun tmSinglePhaseReject(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus

public expect fun vslCreateSecureSection(handle: COpaquePointer?, targetprocess: Peprocess, mdl: COpaquePointer?, devicepageprotection: UInt, attributes: UInt): Ntstatus

public expect fun vslDeleteSecureSection(globalhandle: Handle): Ntstatus

public expect fun wheaAddErrorSource(errorsource: COpaquePointer?, context: COpaquePointer?): Ntstatus

public expect fun wheaAddErrorSourceDeviceDriver(context: COpaquePointer?, configuration: COpaquePointer?, numberpreallocatederrorreports: UInt): Ntstatus

public expect fun wheaAddErrorSourceDeviceDriverV1(context: COpaquePointer?, configuration: COpaquePointer?, numbufferstopreallocate: UInt, maxdatalength: UInt): Ntstatus

public expect fun wheaAddHwErrorReportSectionDeviceDriver(errorhandle: COpaquePointer?, sectiondatalength: UInt, bufferset: COpaquePointer?): Ntstatus

public expect fun wheaConfigureErrorSource(sourcetype: WheaErrorSourceType, configuration: COpaquePointer?): Ntstatus

public expect fun wheaCreateHwErrorReportDeviceDriver(errorsourceid: UInt, deviceobject: COpaquePointer?): COpaquePointer?

public expect fun wheaErrorSourceGetState(errorsourceid: UInt): WheaErrorSourceState

public expect fun wheaGetNotifyAllOfflinesPolicy(): Boolean

public expect fun wheaHighIrqlLogSelEventHandlerRegister(handler: PfnWheaHighIrqlLogSelEventHandler, context: COpaquePointer?): Boolean

public expect fun wheaHighIrqlLogSelEventHandlerUnregister()

public expect fun wheaHwErrorReportAbandonDeviceDriver(errorhandle: COpaquePointer?): Ntstatus

public expect fun wheaHwErrorReportSetSectionNameDeviceDriver(bufferset: COpaquePointer?, namelength: UInt, name: COpaquePointer?): Ntstatus

public expect fun wheaHwErrorReportSetSeverityDeviceDriver(errorhandle: COpaquePointer?, errorseverity: WheaErrorSeverity): Ntstatus

public expect fun wheaHwErrorReportSubmitDeviceDriver(errorhandle: COpaquePointer?): Ntstatus

public expect fun wheaInitializeRecordHeader(header: COpaquePointer?): Ntstatus

public expect fun wheaIsCriticalState(): Boolean

public expect fun wheaLogInternalEvent(entry: COpaquePointer?)

public expect fun wheaRegisterInUsePageOfflineNotification(callback: PfnInUsePageOfflineNotify, context: COpaquePointer?): Ntstatus

public expect fun wheaRemoveErrorSource(errorsourceid: UInt)

public expect fun wheaRemoveErrorSourceDeviceDriver(errorsourceid: UInt): Ntstatus

public expect fun wheaReportHwError(errorpacket: COpaquePointer?): Ntstatus

public expect fun wheaReportHwErrorDeviceDriver(errorsourceid: UInt, deviceobject: COpaquePointer?, errordata: COpaquePointer?, errordatalength: UInt, sectiontypeguid: COpaquePointer?, errorseverity: WheaErrorSeverity, devicefriendlyname: Pcstr): Ntstatus

public expect fun wheaUnconfigureErrorSource(sourcetype: WheaErrorSourceType): Ntstatus

public expect fun wheaUnregisterInUsePageOfflineNotification(callback: PfnInUsePageOfflineNotify): Ntstatus

public expect fun wmiQueryTraceInformation(traceinformationclass: TraceInformationClass, traceinformation: COpaquePointer?, traceinformationlength: UInt, requiredlength: COpaquePointer?, buffer: COpaquePointer?): Ntstatus

public expect fun zwAllocateLocallyUniqueId(luid: COpaquePointer?): Ntstatus

public expect fun zwClose(handle: Handle): Ntstatus

public expect fun zwCommitComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus

public expect fun zwCommitEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus

public expect fun zwCommitTransaction(transactionhandle: Handle, wait: Boolean): Ntstatus

public expect fun zwCreateEnlistment(enlistmenthandle: COpaquePointer?, desiredaccess: UInt, resourcemanagerhandle: Handle, transactionhandle: Handle, objectattributes: COpaquePointer?, createoptions: UInt, notificationmask: UInt, enlistmentkey: COpaquePointer?): Ntstatus

public expect fun zwCreateFile(filehandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, allocationsize: COpaquePointer?, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: COpaquePointer?, ealength: UInt): Ntstatus

public expect fun zwCreateResourceManager(resourcemanagerhandle: COpaquePointer?, desiredaccess: UInt, tmhandle: Handle, resourcemanagerguid: COpaquePointer?, objectattributes: COpaquePointer?, createoptions: UInt, description: COpaquePointer?): Ntstatus

public expect fun zwCreateSection(sectionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, maximumsize: COpaquePointer?, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: Handle): Ntstatus

public expect fun zwCreateTransaction(transactionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, uow: COpaquePointer?, tmhandle: Handle, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: COpaquePointer?, description: COpaquePointer?): Ntstatus

public expect fun zwCreateTransactionManager(tmhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, logfilename: COpaquePointer?, createoptions: UInt, commitstrength: UInt): Ntstatus

public expect fun zwDeviceIoControlFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, iocontrolcode: UInt, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt): Ntstatus

public expect fun zwDisplayString(string: COpaquePointer?): Ntstatus

public expect fun zwEnumerateTransactionObject(rootobjecthandle: Handle, querytype: KtmobjectType, objectcursor: COpaquePointer?, objectcursorlength: UInt, returnlength: COpaquePointer?): Ntstatus

public expect fun zwGetNotificationResourceManager(resourcemanagerhandle: Handle, transactionnotification: COpaquePointer?, notificationlength: UInt, timeout: COpaquePointer?, returnlength: COpaquePointer?, asynchronous: UInt, asynchronouscontext: ULong): Ntstatus

public expect fun zwLoadDriver(driverservicename: COpaquePointer?): Ntstatus

public expect fun zwMakeTemporaryObject(handle: Handle): Ntstatus

public expect fun zwManagePartition(targethandle: Handle, sourcehandle: Handle, partitioninformationclass: PartitionInformationClass, partitioninformation: COpaquePointer?, partitioninformationlength: UInt): Ntstatus

public expect fun zwOpenEnlistment(enlistmenthandle: COpaquePointer?, desiredaccess: UInt, rmhandle: Handle, enlistmentguid: COpaquePointer?, objectattributes: COpaquePointer?): Ntstatus

public expect fun zwOpenFile(filehandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, shareaccess: UInt, openoptions: UInt): Ntstatus

public expect fun zwOpenResourceManager(resourcemanagerhandle: COpaquePointer?, desiredaccess: UInt, tmhandle: Handle, resourcemanagerguid: COpaquePointer?, objectattributes: COpaquePointer?): Ntstatus

public expect fun zwOpenSymbolicLinkObject(linkhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus

public expect fun zwOpenTransaction(transactionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, uow: COpaquePointer?, tmhandle: Handle): Ntstatus

public expect fun zwOpenTransactionManager(tmhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, logfilename: COpaquePointer?, tmidentity: COpaquePointer?, openoptions: UInt): Ntstatus

public expect fun zwPowerInformation(informationlevel: PowerInformationLevel, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt): Ntstatus

public expect fun zwPrePrepareComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus

public expect fun zwPrePrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus

public expect fun zwPrepareComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus

public expect fun zwPrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus

public expect fun zwPropagationComplete(resourcemanagerhandle: Handle, requestcookie: UInt, bufferlength: UInt, buffer: COpaquePointer?): Ntstatus

public expect fun zwPropagationFailed(resourcemanagerhandle: Handle, requestcookie: UInt, propstatus: Ntstatus): Ntstatus

public expect fun zwQueryInformationByName(objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass): Ntstatus

public expect fun zwQueryInformationEnlistment(enlistmenthandle: Handle, enlistmentinformationclass: EnlistmentInformationClass, enlistmentinformation: COpaquePointer?, enlistmentinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus

public expect fun zwQueryInformationFile(filehandle: Handle, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass): Ntstatus

public expect fun zwQueryInformationResourceManager(resourcemanagerhandle: Handle, resourcemanagerinformationclass: ResourcemanagerInformationClass, resourcemanagerinformation: COpaquePointer?, resourcemanagerinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus

public expect fun zwQueryInformationTransaction(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: COpaquePointer?, transactioninformationlength: UInt, returnlength: COpaquePointer?): Ntstatus

public expect fun zwQueryInformationTransactionManager(transactionmanagerhandle: Handle, transactionmanagerinformationclass: TransactionmanagerInformationClass, transactionmanagerinformation: COpaquePointer?, transactionmanagerinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus

public expect fun zwQuerySymbolicLinkObject(linkhandle: Handle, linktarget: COpaquePointer?, returnedlength: COpaquePointer?): Ntstatus

public expect fun zwReadFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt, byteoffset: COpaquePointer?, key: COpaquePointer?): Ntstatus

public expect fun zwReadOnlyEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus

public expect fun zwRecoverEnlistment(enlistmenthandle: Handle, enlistmentkey: COpaquePointer?): Ntstatus

public expect fun zwRecoverResourceManager(resourcemanagerhandle: Handle): Ntstatus

public expect fun zwRecoverTransactionManager(transactionmanagerhandle: Handle): Ntstatus

public expect fun zwRegisterProtocolAddressInformation(resourcemanager: Handle, protocolid: COpaquePointer?, protocolinformationsize: UInt, protocolinformation: COpaquePointer?, createoptions: UInt): Ntstatus

public expect fun zwRenameTransactionManager(logfilename: COpaquePointer?, existingtransactionmanagerguid: COpaquePointer?): Ntstatus

public expect fun zwRollbackComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus

public expect fun zwRollbackEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus

public expect fun zwRollbackTransaction(transactionhandle: Handle, wait: Boolean): Ntstatus

public expect fun zwRollforwardTransactionManager(transactionmanagerhandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus

public expect fun zwSetInformationEnlistment(enlistmenthandle: Handle, enlistmentinformationclass: EnlistmentInformationClass, enlistmentinformation: COpaquePointer?, enlistmentinformationlength: UInt): Ntstatus

public expect fun zwSetInformationFile(filehandle: Handle, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass): Ntstatus

public expect fun zwSetInformationResourceManager(resourcemanagerhandle: Handle, resourcemanagerinformationclass: ResourcemanagerInformationClass, resourcemanagerinformation: COpaquePointer?, resourcemanagerinformationlength: UInt): Ntstatus

public expect fun zwSetInformationTransaction(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: COpaquePointer?, transactioninformationlength: UInt): Ntstatus

public expect fun zwSetInformationTransactionManager(tmhandle: Handle, transactionmanagerinformationclass: TransactionmanagerInformationClass, transactionmanagerinformation: COpaquePointer?, transactionmanagerinformationlength: UInt): Ntstatus

public expect fun zwSinglePhaseReject(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus

public expect fun zwUnloadDriver(driverservicename: COpaquePointer?): Ntstatus

public expect fun zwWriteFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt, byteoffset: COpaquePointer?, key: COpaquePointer?): Ntstatus

public expect fun vDbgPrintEx(componentid: UInt, level: UInt, format: Pcstr, arglist: COpaquePointer?): UInt

public expect fun vDbgPrintExWithPrefix(prefix: Pcstr, componentid: UInt, level: UInt, format: Pcstr, arglist: COpaquePointer?): UInt
