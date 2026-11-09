package io.github.kotlinmania.windowssys.windows.wdk.system.systemservices

import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PEPROCESS
import io.github.kotlinmania.windowssys.windows.wdk.foundation.POOL_TYPE
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FILE_INFORMATION_CLASS
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.LUID
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR
import io.github.kotlinmania.windowssys.windows.win32.security.PSID
import io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.SE_ADT_PARAMETER_TYPE
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.WHEA_ERROR_SOURCE_STATE
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.WHEA_ERROR_SOURCE_TYPE
import io.github.kotlinmania.windowssys.windows.win32.system.io.PIO_APC_ROUTINE
import io.github.kotlinmania.windowssys.windows.win32.system.power.POWER_INFORMATION_LEVEL
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.RTL_SYSTEM_GLOBAL_DATA_ID
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.ENLISTMENT_INFORMATION_CLASS
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.KTMOBJECT_TYPE
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.RESOURCEMANAGER_INFORMATION_CLASS
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.TRANSACTIONMANAGER_INFORMATION_CLASS
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.TRANSACTION_INFORMATION_CLASS

public expect fun RtlSetSystemGlobalData(dataid: RTL_SYSTEM_GLOBAL_DATA_ID, buffer: Long, size: UInt): NTSTATUS

public expect fun RtlSplay(links: Long): Long

public expect fun RtlStringFromGUID(guid: Long, guidstring: Long): NTSTATUS

public expect fun RtlStronglyEnumerateEntryHashTable(hashtable: Long, enumerator: Long): Long

public expect fun RtlSubtreePredecessor(links: Long): Long

public expect fun RtlSubtreeSuccessor(links: Long): Long

public expect fun RtlSuffixUnicodeString(string1: Long, string2: Long, caseinsensitive: Boolean): Boolean

public expect fun RtlTestBit(bitmapheader: Long, bitnumber: UInt): Boolean

public expect fun RtlTimeFieldsToTime(timefields: Long, time: Long): Boolean

public expect fun RtlTimeToTimeFields(time: Long, timefields: Long)

public expect fun RtlUTF8StringToUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS

public expect fun RtlUTF8ToUnicodeN(unicodestringdestination: PWSTR, unicodestringmaxbytecount: UInt, unicodestringactualbytecount: Long, utf8stringsource: PCSTR, utf8stringbytecount: UInt): NTSTATUS

public expect fun RtlUnicodeStringToInt64(string: Long, base: UInt, number: Long, endpointer: Long): NTSTATUS

public expect fun RtlUnicodeStringToInteger(string: Long, base: UInt, value: Long): NTSTATUS

public expect fun RtlUnicodeStringToUTF8String(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS

public expect fun RtlUnicodeToUTF8N(utf8stringdestination: PSTR, utf8stringmaxbytecount: UInt, utf8stringactualbytecount: Long, unicodestringsource: Long, unicodestringbytecount: UInt): NTSTATUS

public expect fun RtlUpcaseUnicodeChar(sourcecharacter: UShort): UShort

public expect fun RtlUpcaseUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS

public expect fun RtlUpperChar(character: Byte): Byte

public expect fun RtlUpperString(destinationstring: Long, sourcestring: Long)

public expect fun RtlValidRelativeSecurityDescriptor(securitydescriptorinput: PSECURITY_DESCRIPTOR, securitydescriptorlength: UInt, requiredinformation: UInt): Boolean

public expect fun RtlValidSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR): Boolean

public expect fun RtlVerifyVersionInfo(versioninfo: Long, typemask: UInt, conditionmask: ULong): NTSTATUS

public expect fun RtlVolumeDeviceToDosName(volumedeviceobject: Long, dosname: Long): NTSTATUS

public expect fun RtlWalkFrameChain(callers: Long, count: UInt, flags: UInt): UInt

public expect fun RtlWeaklyEnumerateEntryHashTable(hashtable: Long, enumerator: Long): Long

public expect fun RtlWriteRegistryValue(relativeto: UInt, path: PCWSTR, valuename: PCWSTR, valuetype: UInt, valuedata: Long, valuelength: UInt): NTSTATUS

public expect fun RtlxAnsiStringToUnicodeSize(ansistring: Long): UInt

public expect fun RtlxUnicodeStringToAnsiSize(unicodestring: Long): UInt

public expect fun SeAccessCheck(securitydescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long, subjectcontextlocked: Boolean, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: Long, genericmapping: Long, accessmode: Byte, grantedaccess: Long, accessstatus: Long): Boolean

public expect fun SeAssignSecurity(parentdescriptor: PSECURITY_DESCRIPTOR, explicitdescriptor: PSECURITY_DESCRIPTOR, newdescriptor: Long, isdirectoryobject: Boolean, subjectcontext: Long, genericmapping: Long, pooltype: POOL_TYPE): NTSTATUS

public expect fun SeAssignSecurityEx(parentdescriptor: PSECURITY_DESCRIPTOR, explicitdescriptor: PSECURITY_DESCRIPTOR, newdescriptor: Long, objecttype: Long, isdirectoryobject: Boolean, autoinheritflags: UInt, subjectcontext: Long, genericmapping: Long, pooltype: POOL_TYPE): NTSTATUS

public expect fun SeCaptureSubjectContext(subjectcontext: Long)

public expect fun SeComputeAutoInheritByObjectType(objecttype: Long, securitydescriptor: PSECURITY_DESCRIPTOR, parentsecuritydescriptor: PSECURITY_DESCRIPTOR): UInt

public expect fun SeDeassignSecurity(securitydescriptor: Long): NTSTATUS

public expect fun SeEtwWriteKMCveEvent(cveid: Long, additionaldetails: Long): NTSTATUS

public expect fun SeLockSubjectContext(subjectcontext: Long)

public expect fun SeRegisterImageVerificationCallback(imagetype: SE_IMAGE_TYPE, callbacktype: SE_IMAGE_VERIFICATION_CALLBACK_TYPE, callbackfunction: PSE_IMAGE_VERIFICATION_CALLBACK_FUNCTION, callbackcontext: Long, token: Long, callbackhandle: Long): NTSTATUS

public expect fun SeReleaseSubjectContext(subjectcontext: Long)

public expect fun SeReportSecurityEvent(flags: UInt, sourcename: Long, usersid: PSID, auditparameters: Long): NTSTATUS

public expect fun SeSetAuditParameter(auditparameters: Long, type: SE_ADT_PARAMETER_TYPE, index: UInt, data: Long): NTSTATUS

public expect fun SeSinglePrivilegeCheck(privilegevalue: LUID, previousmode: Byte): Boolean

public expect fun SeUnlockSubjectContext(subjectcontext: Long)

public expect fun SeUnregisterImageVerificationCallback(callbackhandle: Long)

public expect fun SeValidSecurityDescriptor(length: UInt, securitydescriptor: PSECURITY_DESCRIPTOR): Boolean

public expect fun TmCommitComplete(enlistment: Long, tmvirtualclock: Long): NTSTATUS

public expect fun TmCommitEnlistment(enlistment: Long, tmvirtualclock: Long): NTSTATUS

public expect fun TmCommitTransaction(transaction: Long, wait: Boolean): NTSTATUS

public expect fun TmCreateEnlistment(enlistmenthandle: Long, previousmode: Byte, desiredaccess: UInt, objectattributes: Long, resourcemanager: Long, transaction: Long, createoptions: UInt, notificationmask: UInt, enlistmentkey: Long): NTSTATUS

public expect fun TmDereferenceEnlistmentKey(enlistment: Long, lastreference: Long): NTSTATUS

public expect fun TmEnableCallbacks(resourcemanager: Long, callbackroutine: PTM_RM_NOTIFICATION, rmkey: Long): NTSTATUS

public expect fun TmGetTransactionId(transaction: Long, transactionid: Long)

public expect fun TmInitializeTransactionManager(transactionmanager: Long, logfilename: Long, tmid: Long, createoptions: UInt): NTSTATUS

public expect fun TmIsTransactionActive(transaction: Long): Boolean

public expect fun TmPrePrepareComplete(enlistment: Long, tmvirtualclock: Long): NTSTATUS

public expect fun TmPrePrepareEnlistment(enlistment: Long, tmvirtualclock: Long): NTSTATUS

public expect fun TmPrepareComplete(enlistment: Long, tmvirtualclock: Long): NTSTATUS

public expect fun TmPrepareEnlistment(enlistment: Long, tmvirtualclock: Long): NTSTATUS

public expect fun TmPropagationComplete(resourcemanager: Long, requestcookie: UInt, bufferlength: UInt, buffer: Long): NTSTATUS

public expect fun TmPropagationFailed(resourcemanager: Long, requestcookie: UInt, status: NTSTATUS): NTSTATUS

public expect fun TmReadOnlyEnlistment(enlistment: Long, tmvirtualclock: Long): NTSTATUS

public expect fun TmRecoverEnlistment(enlistment: Long, enlistmentkey: Long): NTSTATUS

public expect fun TmRecoverResourceManager(resourcemanager: Long): NTSTATUS

public expect fun TmRecoverTransactionManager(tm: Long, targetvirtualclock: Long): NTSTATUS

public expect fun TmReferenceEnlistmentKey(enlistment: Long, key: Long): NTSTATUS

public expect fun TmRenameTransactionManager(logfilename: Long, existingtransactionmanagerguid: Long): NTSTATUS

public expect fun TmRequestOutcomeEnlistment(enlistment: Long, tmvirtualclock: Long): NTSTATUS

public expect fun TmRollbackComplete(enlistment: Long, tmvirtualclock: Long): NTSTATUS

public expect fun TmRollbackEnlistment(enlistment: Long, tmvirtualclock: Long): NTSTATUS

public expect fun TmRollbackTransaction(transaction: Long, wait: Boolean): NTSTATUS

public expect fun TmSinglePhaseReject(enlistment: Long, tmvirtualclock: Long): NTSTATUS

public expect fun VslCreateSecureSection(handle: Long, targetprocess: PEPROCESS, mdl: Long, devicepageprotection: UInt, attributes: UInt): NTSTATUS

public expect fun VslDeleteSecureSection(globalhandle: HANDLE): NTSTATUS

public expect fun WheaAddErrorSource(errorsource: Long, context: Long): NTSTATUS

public expect fun WheaAddErrorSourceDeviceDriver(context: Long, configuration: Long, numberpreallocatederrorreports: UInt): NTSTATUS

public expect fun WheaAddErrorSourceDeviceDriverV1(context: Long, configuration: Long, numbufferstopreallocate: UInt, maxdatalength: UInt): NTSTATUS

public expect fun WheaAddHwErrorReportSectionDeviceDriver(errorhandle: Long, sectiondatalength: UInt, bufferset: Long): NTSTATUS

public expect fun WheaConfigureErrorSource(sourcetype: WHEA_ERROR_SOURCE_TYPE, configuration: Long): NTSTATUS

public expect fun WheaCreateHwErrorReportDeviceDriver(errorsourceid: UInt, deviceobject: Long): Long

public expect fun WheaErrorSourceGetState(errorsourceid: UInt): WHEA_ERROR_SOURCE_STATE

public expect fun WheaGetNotifyAllOfflinesPolicy(): Boolean

public expect fun WheaHighIrqlLogSelEventHandlerRegister(handler: PFN_WHEA_HIGH_IRQL_LOG_SEL_EVENT_HANDLER, context: Long): Boolean

public expect fun WheaHighIrqlLogSelEventHandlerUnregister()

public expect fun WheaHwErrorReportAbandonDeviceDriver(errorhandle: Long): NTSTATUS

public expect fun WheaHwErrorReportSetSectionNameDeviceDriver(bufferset: Long, namelength: UInt, name: Long): NTSTATUS

public expect fun WheaHwErrorReportSetSeverityDeviceDriver(errorhandle: Long, errorseverity: WHEA_ERROR_SEVERITY): NTSTATUS

public expect fun WheaHwErrorReportSubmitDeviceDriver(errorhandle: Long): NTSTATUS

public expect fun WheaInitializeRecordHeader(header: Long): NTSTATUS

public expect fun WheaIsCriticalState(): Boolean

public expect fun WheaLogInternalEvent(entry: Long)

public expect fun WheaRegisterInUsePageOfflineNotification(callback: PFN_IN_USE_PAGE_OFFLINE_NOTIFY, context: Long): NTSTATUS

public expect fun WheaRemoveErrorSource(errorsourceid: UInt)

public expect fun WheaRemoveErrorSourceDeviceDriver(errorsourceid: UInt): NTSTATUS

public expect fun WheaReportHwError(errorpacket: Long): NTSTATUS

public expect fun WheaReportHwErrorDeviceDriver(errorsourceid: UInt, deviceobject: Long, errordata: Long, errordatalength: UInt, sectiontypeguid: Long, errorseverity: WHEA_ERROR_SEVERITY, devicefriendlyname: PCSTR): NTSTATUS

public expect fun WheaUnconfigureErrorSource(sourcetype: WHEA_ERROR_SOURCE_TYPE): NTSTATUS

public expect fun WheaUnregisterInUsePageOfflineNotification(callback: PFN_IN_USE_PAGE_OFFLINE_NOTIFY): NTSTATUS

public expect fun WmiQueryTraceInformation(traceinformationclass: TRACE_INFORMATION_CLASS, traceinformation: Long, traceinformationlength: UInt, requiredlength: Long, buffer: Long): NTSTATUS

public expect fun ZwAllocateLocallyUniqueId(luid: Long): NTSTATUS

public expect fun ZwClose(handle: HANDLE): NTSTATUS

public expect fun ZwCommitComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS

public expect fun ZwCommitEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS

public expect fun ZwCommitTransaction(transactionhandle: HANDLE, wait: Boolean): NTSTATUS

public expect fun ZwCreateEnlistment(enlistmenthandle: Long, desiredaccess: UInt, resourcemanagerhandle: HANDLE, transactionhandle: HANDLE, objectattributes: Long, createoptions: UInt, notificationmask: UInt, enlistmentkey: Long): NTSTATUS

public expect fun ZwCreateFile(filehandle: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: Long, ealength: UInt): NTSTATUS

public expect fun ZwCreateResourceManager(resourcemanagerhandle: Long, desiredaccess: UInt, tmhandle: HANDLE, resourcemanagerguid: Long, objectattributes: Long, createoptions: UInt, description: Long): NTSTATUS

public expect fun ZwCreateSection(sectionhandle: Long, desiredaccess: UInt, objectattributes: Long, maximumsize: Long, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: HANDLE): NTSTATUS

public expect fun ZwCreateTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long, uow: Long, tmhandle: HANDLE, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: Long, description: Long): NTSTATUS

public expect fun ZwCreateTransactionManager(tmhandle: Long, desiredaccess: UInt, objectattributes: Long, logfilename: Long, createoptions: UInt, commitstrength: UInt): NTSTATUS

public expect fun ZwDeviceIoControlFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, iocontrolcode: UInt, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt): NTSTATUS

public expect fun ZwDisplayString(string: Long): NTSTATUS

public expect fun ZwEnumerateTransactionObject(rootobjecthandle: HANDLE, querytype: KTMOBJECT_TYPE, objectcursor: Long, objectcursorlength: UInt, returnlength: Long): NTSTATUS

public expect fun ZwGetNotificationResourceManager(resourcemanagerhandle: HANDLE, transactionnotification: Long, notificationlength: UInt, timeout: Long, returnlength: Long, asynchronous: UInt, asynchronouscontext: ULong): NTSTATUS

public expect fun ZwLoadDriver(driverservicename: Long): NTSTATUS

public expect fun ZwMakeTemporaryObject(handle: HANDLE): NTSTATUS

public expect fun ZwManagePartition(targethandle: HANDLE, sourcehandle: HANDLE, partitioninformationclass: PARTITION_INFORMATION_CLASS, partitioninformation: Long, partitioninformationlength: UInt): NTSTATUS

public expect fun ZwOpenEnlistment(enlistmenthandle: Long, desiredaccess: UInt, rmhandle: HANDLE, enlistmentguid: Long, objectattributes: Long): NTSTATUS

public expect fun ZwOpenFile(filehandle: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, shareaccess: UInt, openoptions: UInt): NTSTATUS

public expect fun ZwOpenResourceManager(resourcemanagerhandle: Long, desiredaccess: UInt, tmhandle: HANDLE, resourcemanagerguid: Long, objectattributes: Long): NTSTATUS

public expect fun ZwOpenSymbolicLinkObject(linkhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS

public expect fun ZwOpenTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long, uow: Long, tmhandle: HANDLE): NTSTATUS

public expect fun ZwOpenTransactionManager(tmhandle: Long, desiredaccess: UInt, objectattributes: Long, logfilename: Long, tmidentity: Long, openoptions: UInt): NTSTATUS

public expect fun ZwPowerInformation(informationlevel: POWER_INFORMATION_LEVEL, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt): NTSTATUS

public expect fun ZwPrePrepareComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS

public expect fun ZwPrePrepareEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS

public expect fun ZwPrepareComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS

public expect fun ZwPrepareEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS

public expect fun ZwPropagationComplete(resourcemanagerhandle: HANDLE, requestcookie: UInt, bufferlength: UInt, buffer: Long): NTSTATUS

public expect fun ZwPropagationFailed(resourcemanagerhandle: HANDLE, requestcookie: UInt, propstatus: NTSTATUS): NTSTATUS

public expect fun ZwQueryInformationByName(objectattributes: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS): NTSTATUS

public expect fun ZwQueryInformationEnlistment(enlistmenthandle: HANDLE, enlistmentinformationclass: ENLISTMENT_INFORMATION_CLASS, enlistmentinformation: Long, enlistmentinformationlength: UInt, returnlength: Long): NTSTATUS

public expect fun ZwQueryInformationFile(filehandle: HANDLE, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS): NTSTATUS

public expect fun ZwQueryInformationResourceManager(resourcemanagerhandle: HANDLE, resourcemanagerinformationclass: RESOURCEMANAGER_INFORMATION_CLASS, resourcemanagerinformation: Long, resourcemanagerinformationlength: UInt, returnlength: Long): NTSTATUS

public expect fun ZwQueryInformationTransaction(transactionhandle: HANDLE, transactioninformationclass: TRANSACTION_INFORMATION_CLASS, transactioninformation: Long, transactioninformationlength: UInt, returnlength: Long): NTSTATUS

public expect fun ZwQueryInformationTransactionManager(transactionmanagerhandle: HANDLE, transactionmanagerinformationclass: TRANSACTIONMANAGER_INFORMATION_CLASS, transactionmanagerinformation: Long, transactionmanagerinformationlength: UInt, returnlength: Long): NTSTATUS

public expect fun ZwQuerySymbolicLinkObject(linkhandle: HANDLE, linktarget: Long, returnedlength: Long): NTSTATUS

public expect fun ZwReadFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, buffer: Long, length: UInt, byteoffset: Long, key: Long): NTSTATUS

public expect fun ZwReadOnlyEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS

public expect fun ZwRecoverEnlistment(enlistmenthandle: HANDLE, enlistmentkey: Long): NTSTATUS

public expect fun ZwRecoverResourceManager(resourcemanagerhandle: HANDLE): NTSTATUS

public expect fun ZwRecoverTransactionManager(transactionmanagerhandle: HANDLE): NTSTATUS

public expect fun ZwRegisterProtocolAddressInformation(resourcemanager: HANDLE, protocolid: Long, protocolinformationsize: UInt, protocolinformation: Long, createoptions: UInt): NTSTATUS

public expect fun ZwRenameTransactionManager(logfilename: Long, existingtransactionmanagerguid: Long): NTSTATUS

public expect fun ZwRollbackComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS

public expect fun ZwRollbackEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS

public expect fun ZwRollbackTransaction(transactionhandle: HANDLE, wait: Boolean): NTSTATUS

public expect fun ZwRollforwardTransactionManager(transactionmanagerhandle: HANDLE, tmvirtualclock: Long): NTSTATUS

public expect fun ZwSetInformationEnlistment(enlistmenthandle: HANDLE, enlistmentinformationclass: ENLISTMENT_INFORMATION_CLASS, enlistmentinformation: Long, enlistmentinformationlength: UInt): NTSTATUS

public expect fun ZwSetInformationFile(filehandle: HANDLE, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS): NTSTATUS

public expect fun ZwSetInformationResourceManager(resourcemanagerhandle: HANDLE, resourcemanagerinformationclass: RESOURCEMANAGER_INFORMATION_CLASS, resourcemanagerinformation: Long, resourcemanagerinformationlength: UInt): NTSTATUS

public expect fun ZwSetInformationTransaction(transactionhandle: HANDLE, transactioninformationclass: TRANSACTION_INFORMATION_CLASS, transactioninformation: Long, transactioninformationlength: UInt): NTSTATUS

public expect fun ZwSetInformationTransactionManager(tmhandle: HANDLE, transactionmanagerinformationclass: TRANSACTIONMANAGER_INFORMATION_CLASS, transactionmanagerinformation: Long, transactionmanagerinformationlength: UInt): NTSTATUS

public expect fun ZwSinglePhaseReject(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS

public expect fun ZwUnloadDriver(driverservicename: Long): NTSTATUS

public expect fun ZwWriteFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, buffer: Long, length: UInt, byteoffset: Long, key: Long): NTSTATUS

public expect fun vDbgPrintEx(componentid: UInt, level: UInt, format: PCSTR, arglist: Long): UInt

public expect fun vDbgPrintExWithPrefix(prefix: PCSTR, componentid: UInt, level: UInt, format: PCSTR, arglist: Long): UInt
