package io.github.kotlinmania.windowssys.windows.wdk.system.systemservices

import io.github.kotlinmania.windowssys.Win32DynamicFfi
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

public fun interface FnCallbackPart3 {
    public operator fun invoke()
}

public fun interface FnCallback1Part3 {
    public operator fun invoke(enlistmentobject: Long, rmcontext: Long, transactioncontext: Long, transactionnotification: UInt, tmvirtualclock: Long, argumentlength: UInt, argument: Long): NTSTATUS
}

public fun interface FnCallback2Part3 {
    public operator fun invoke(context: Long, osselrecord: Long): NTSTATUS
}

public fun interface FnCallback3Part3 {
    public operator fun invoke(page: UInt, flags: Boolean, poisoned: Boolean, context: Long): Boolean
}

public fun RtlSetSystemGlobalData(dataid: RTL_SYSTEM_GLOBAL_DATA_ID, buffer: Long, size: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "RtlSetSystemGlobalData", longArrayOf(dataid.toLong(), buffer, size.toLong())).toInt()
}

public fun RtlSplay(links: Long): Long {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlSplay", longArrayOf(links))
}

public fun RtlStringFromGUID(guid: Long, guidstring: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlStringFromGUID", longArrayOf(guid, guidstring)).toInt()
}

public fun RtlStronglyEnumerateEntryHashTable(hashtable: Long, enumerator: Long): Long {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlStronglyEnumerateEntryHashTable", longArrayOf(hashtable, enumerator))
}

public fun RtlSubtreePredecessor(links: Long): Long {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlSubtreePredecessor", longArrayOf(links))
}

public fun RtlSubtreeSuccessor(links: Long): Long {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlSubtreeSuccessor", longArrayOf(links))
}

public fun RtlSuffixUnicodeString(string1: Long, string2: Long, caseinsensitive: Boolean): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "RtlSuffixUnicodeString", longArrayOf(string1, string2, if (caseinsensitive) 1L else 0L))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlTestBit(bitmapheader: Long, bitnumber: UInt): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "RtlTestBit", longArrayOf(bitmapheader, bitnumber.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlTimeFieldsToTime(timefields: Long, time: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "RtlTimeFieldsToTime", longArrayOf(timefields, time))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlTimeToTimeFields(time: Long, timefields: Long) {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlTimeToTimeFields", longArrayOf(time, timefields))
}

public fun RtlUTF8StringToUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlUTF8StringToUnicodeString", longArrayOf(destinationstring, sourcestring, if (allocatedestinationstring) 1L else 0L)).toInt()
}

public fun RtlUTF8ToUnicodeN(unicodestringdestination: PWSTR, unicodestringmaxbytecount: UInt, unicodestringactualbytecount: Long, utf8stringsource: PCSTR, utf8stringbytecount: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlUTF8ToUnicodeN", longArrayOf(unicodestringdestination, unicodestringmaxbytecount.toLong(), unicodestringactualbytecount, utf8stringsource, utf8stringbytecount.toLong())).toInt()
}

public fun RtlUnicodeStringToInt64(string: Long, base: UInt, number: Long, endpointer: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "RtlUnicodeStringToInt64", longArrayOf(string, base.toLong(), number, endpointer)).toInt()
}

public fun RtlUnicodeStringToInteger(string: Long, base: UInt, value: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlUnicodeStringToInteger", longArrayOf(string, base.toLong(), value)).toInt()
}

public fun RtlUnicodeStringToUTF8String(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlUnicodeStringToUTF8String", longArrayOf(destinationstring, sourcestring, if (allocatedestinationstring) 1L else 0L)).toInt()
}

public fun RtlUnicodeToUTF8N(utf8stringdestination: PSTR, utf8stringmaxbytecount: UInt, utf8stringactualbytecount: Long, unicodestringsource: Long, unicodestringbytecount: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlUnicodeToUTF8N", longArrayOf(utf8stringdestination, utf8stringmaxbytecount.toLong(), utf8stringactualbytecount, unicodestringsource, unicodestringbytecount.toLong())).toInt()
}

public fun RtlUpcaseUnicodeChar(sourcecharacter: UShort): UShort {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlUpcaseUnicodeChar", longArrayOf(sourcecharacter.toLong())).toUShort()
}

public fun RtlUpcaseUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlUpcaseUnicodeString", longArrayOf(destinationstring, sourcestring, if (allocatedestinationstring) 1L else 0L)).toInt()
}

public fun RtlUpperChar(character: Byte): Byte {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlUpperChar", longArrayOf(character.toLong())).toByte()
}

public fun RtlUpperString(destinationstring: Long, sourcestring: Long) {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlUpperString", longArrayOf(destinationstring, sourcestring))
}

public fun RtlValidRelativeSecurityDescriptor(securitydescriptorinput: PSECURITY_DESCRIPTOR, securitydescriptorlength: UInt, requiredinformation: UInt): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "RtlValidRelativeSecurityDescriptor", longArrayOf(securitydescriptorinput, securitydescriptorlength.toLong(), requiredinformation.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlValidSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "RtlValidSecurityDescriptor", longArrayOf(securitydescriptor))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlVerifyVersionInfo(versioninfo: Long, typemask: UInt, conditionmask: ULong): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlVerifyVersionInfo", longArrayOf(versioninfo, typemask.toLong(), conditionmask.toLong())).toInt()
}

public fun RtlVolumeDeviceToDosName(volumedeviceobject: Long, dosname: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "RtlVolumeDeviceToDosName", longArrayOf(volumedeviceobject, dosname)).toInt()
}

public fun RtlWalkFrameChain(callers: Long, count: UInt, flags: UInt): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlWalkFrameChain", longArrayOf(callers, count.toLong(), flags.toLong())).toUInt()
}

public fun RtlWeaklyEnumerateEntryHashTable(hashtable: Long, enumerator: Long): Long {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlWeaklyEnumerateEntryHashTable", longArrayOf(hashtable, enumerator))
}

public fun RtlWriteRegistryValue(relativeto: UInt, path: PCWSTR, valuename: PCWSTR, valuetype: UInt, valuedata: Long, valuelength: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlWriteRegistryValue", longArrayOf(relativeto.toLong(), path, valuename, valuetype.toLong(), valuedata, valuelength.toLong())).toInt()
}

public fun RtlxAnsiStringToUnicodeSize(ansistring: Long): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlxAnsiStringToUnicodeSize", longArrayOf(ansistring)).toUInt()
}

public fun RtlxUnicodeStringToAnsiSize(unicodestring: Long): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlxUnicodeStringToAnsiSize", longArrayOf(unicodestring)).toUInt()
}

public fun SeAccessCheck(securitydescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long, subjectcontextlocked: Boolean, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: Long, genericmapping: Long, accessmode: Byte, grantedaccess: Long, accessstatus: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "SeAccessCheck", longArrayOf(securitydescriptor, subjectsecuritycontext, if (subjectcontextlocked) 1L else 0L, desiredaccess.toLong(), previouslygrantedaccess.toLong(), privileges, genericmapping, accessmode.toLong(), grantedaccess, accessstatus))
    return (rawRet and 0xFFL) != 0L
}

public fun SeAssignSecurity(parentdescriptor: PSECURITY_DESCRIPTOR, explicitdescriptor: PSECURITY_DESCRIPTOR, newdescriptor: Long, isdirectoryobject: Boolean, subjectcontext: Long, genericmapping: Long, pooltype: POOL_TYPE): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "SeAssignSecurity", longArrayOf(parentdescriptor, explicitdescriptor, newdescriptor, if (isdirectoryobject) 1L else 0L, subjectcontext, genericmapping, pooltype.toLong())).toInt()
}

public fun SeAssignSecurityEx(parentdescriptor: PSECURITY_DESCRIPTOR, explicitdescriptor: PSECURITY_DESCRIPTOR, newdescriptor: Long, objecttype: Long, isdirectoryobject: Boolean, autoinheritflags: UInt, subjectcontext: Long, genericmapping: Long, pooltype: POOL_TYPE): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "SeAssignSecurityEx", longArrayOf(parentdescriptor, explicitdescriptor, newdescriptor, objecttype, if (isdirectoryobject) 1L else 0L, autoinheritflags.toLong(), subjectcontext, genericmapping, pooltype.toLong())).toInt()
}

public fun SeCaptureSubjectContext(subjectcontext: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeCaptureSubjectContext", longArrayOf(subjectcontext))
}

public fun SeComputeAutoInheritByObjectType(objecttype: Long, securitydescriptor: PSECURITY_DESCRIPTOR, parentsecuritydescriptor: PSECURITY_DESCRIPTOR): UInt {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "SeComputeAutoInheritByObjectType", longArrayOf(objecttype, securitydescriptor, parentsecuritydescriptor)).toUInt()
}

public fun SeDeassignSecurity(securitydescriptor: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "SeDeassignSecurity", longArrayOf(securitydescriptor)).toInt()
}

public fun SeEtwWriteKMCveEvent(cveid: Long, additionaldetails: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "SeEtwWriteKMCveEvent", longArrayOf(cveid, additionaldetails)).toInt()
}

public fun SeLockSubjectContext(subjectcontext: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeLockSubjectContext", longArrayOf(subjectcontext))
}

public fun SeRegisterImageVerificationCallback(imagetype: SE_IMAGE_TYPE, callbacktype: SE_IMAGE_VERIFICATION_CALLBACK_TYPE, callbackfunction: PSE_IMAGE_VERIFICATION_CALLBACK_FUNCTION, callbackcontext: Long, token: Long, callbackhandle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "SeRegisterImageVerificationCallback", longArrayOf(imagetype.toLong(), callbacktype.toLong(), Win32DynamicFfi.objectSlot(callbackfunction), callbackcontext, token, callbackhandle)).toInt()
}

public fun SeReleaseSubjectContext(subjectcontext: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeReleaseSubjectContext", longArrayOf(subjectcontext))
}

public fun SeReportSecurityEvent(flags: UInt, sourcename: Long, usersid: PSID, auditparameters: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "SeReportSecurityEvent", longArrayOf(flags.toLong(), sourcename, usersid, auditparameters)).toInt()
}

public fun SeSetAuditParameter(auditparameters: Long, type: SE_ADT_PARAMETER_TYPE, index: UInt, data: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "SeSetAuditParameter", longArrayOf(auditparameters, type.toLong(), index.toLong(), data)).toInt()
}

public fun SeSinglePrivilegeCheck(privilegevalue: LUID, previousmode: Byte): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "SeSinglePrivilegeCheck", longArrayOf(((privilegevalue.LowPart.toLong() and 0xFFFF_FFFFL) or ((privilegevalue.HighPart.toLong() and 0xFFFF_FFFFL) shl 32)), previousmode.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun SeUnlockSubjectContext(subjectcontext: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeUnlockSubjectContext", longArrayOf(subjectcontext))
}

public fun SeUnregisterImageVerificationCallback(callbackhandle: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeUnregisterImageVerificationCallback", longArrayOf(callbackhandle))
}

public fun SeValidSecurityDescriptor(length: UInt, securitydescriptor: PSECURITY_DESCRIPTOR): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "SeValidSecurityDescriptor", longArrayOf(length.toLong(), securitydescriptor))
    return (rawRet and 0xFFL) != 0L
}

public fun TmCommitComplete(enlistment: Long, tmvirtualclock: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "TmCommitComplete", longArrayOf(enlistment, tmvirtualclock)).toInt()
}

public fun TmCommitEnlistment(enlistment: Long, tmvirtualclock: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "TmCommitEnlistment", longArrayOf(enlistment, tmvirtualclock)).toInt()
}

public fun TmCommitTransaction(transaction: Long, wait: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "TmCommitTransaction", longArrayOf(transaction, if (wait) 1L else 0L)).toInt()
}

public fun TmCreateEnlistment(enlistmenthandle: Long, previousmode: Byte, desiredaccess: UInt, objectattributes: Long, resourcemanager: Long, transaction: Long, createoptions: UInt, notificationmask: UInt, enlistmentkey: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "TmCreateEnlistment", longArrayOf(enlistmenthandle, previousmode.toLong(), desiredaccess.toLong(), objectattributes, resourcemanager, transaction, createoptions.toLong(), notificationmask.toLong(), enlistmentkey)).toInt()
}

public fun TmDereferenceEnlistmentKey(enlistment: Long, lastreference: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "TmDereferenceEnlistmentKey", longArrayOf(enlistment, lastreference)).toInt()
}

public fun TmEnableCallbacks(resourcemanager: Long, callbackroutine: PTM_RM_NOTIFICATION, rmkey: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "TmEnableCallbacks", longArrayOf(resourcemanager, Win32DynamicFfi.objectSlot(callbackroutine), rmkey)).toInt()
}

public fun TmGetTransactionId(transaction: Long, transactionid: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "TmGetTransactionId", longArrayOf(transaction, transactionid))
}

public fun TmInitializeTransactionManager(transactionmanager: Long, logfilename: Long, tmid: Long, createoptions: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "TmInitializeTransactionManager", longArrayOf(transactionmanager, logfilename, tmid, createoptions.toLong())).toInt()
}

public fun TmIsTransactionActive(transaction: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "TmIsTransactionActive", longArrayOf(transaction))
    return (rawRet and 0xFFL) != 0L
}

public fun TmPrePrepareComplete(enlistment: Long, tmvirtualclock: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "TmPrePrepareComplete", longArrayOf(enlistment, tmvirtualclock)).toInt()
}

public fun TmPrePrepareEnlistment(enlistment: Long, tmvirtualclock: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "TmPrePrepareEnlistment", longArrayOf(enlistment, tmvirtualclock)).toInt()
}

public fun TmPrepareComplete(enlistment: Long, tmvirtualclock: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "TmPrepareComplete", longArrayOf(enlistment, tmvirtualclock)).toInt()
}

public fun TmPrepareEnlistment(enlistment: Long, tmvirtualclock: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "TmPrepareEnlistment", longArrayOf(enlistment, tmvirtualclock)).toInt()
}

public fun TmPropagationComplete(resourcemanager: Long, requestcookie: UInt, bufferlength: UInt, buffer: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "TmPropagationComplete", longArrayOf(resourcemanager, requestcookie.toLong(), bufferlength.toLong(), buffer)).toInt()
}

public fun TmPropagationFailed(resourcemanager: Long, requestcookie: UInt, status: NTSTATUS): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "TmPropagationFailed", longArrayOf(resourcemanager, requestcookie.toLong(), status.toLong())).toInt()
}

public fun TmReadOnlyEnlistment(enlistment: Long, tmvirtualclock: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "TmReadOnlyEnlistment", longArrayOf(enlistment, tmvirtualclock)).toInt()
}

public fun TmRecoverEnlistment(enlistment: Long, enlistmentkey: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "TmRecoverEnlistment", longArrayOf(enlistment, enlistmentkey)).toInt()
}

public fun TmRecoverResourceManager(resourcemanager: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "TmRecoverResourceManager", longArrayOf(resourcemanager)).toInt()
}

public fun TmRecoverTransactionManager(tm: Long, targetvirtualclock: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "TmRecoverTransactionManager", longArrayOf(tm, targetvirtualclock)).toInt()
}

public fun TmReferenceEnlistmentKey(enlistment: Long, key: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "TmReferenceEnlistmentKey", longArrayOf(enlistment, key)).toInt()
}

public fun TmRenameTransactionManager(logfilename: Long, existingtransactionmanagerguid: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "TmRenameTransactionManager", longArrayOf(logfilename, existingtransactionmanagerguid)).toInt()
}

public fun TmRequestOutcomeEnlistment(enlistment: Long, tmvirtualclock: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "TmRequestOutcomeEnlistment", longArrayOf(enlistment, tmvirtualclock)).toInt()
}

public fun TmRollbackComplete(enlistment: Long, tmvirtualclock: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "TmRollbackComplete", longArrayOf(enlistment, tmvirtualclock)).toInt()
}

public fun TmRollbackEnlistment(enlistment: Long, tmvirtualclock: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "TmRollbackEnlistment", longArrayOf(enlistment, tmvirtualclock)).toInt()
}

public fun TmRollbackTransaction(transaction: Long, wait: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "TmRollbackTransaction", longArrayOf(transaction, if (wait) 1L else 0L)).toInt()
}

public fun TmSinglePhaseReject(enlistment: Long, tmvirtualclock: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "TmSinglePhaseReject", longArrayOf(enlistment, tmvirtualclock)).toInt()
}

public fun VslCreateSecureSection(handle: Long, targetprocess: PEPROCESS, mdl: Long, devicepageprotection: UInt, attributes: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "VslCreateSecureSection", longArrayOf(handle, targetprocess, mdl, devicepageprotection.toLong(), attributes.toLong())).toInt()
}

public fun VslDeleteSecureSection(globalhandle: HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "VslDeleteSecureSection", longArrayOf(globalhandle)).toInt()
}

public fun WheaAddErrorSource(errorsource: Long, context: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "WheaAddErrorSource", longArrayOf(errorsource, context)).toInt()
}

public fun WheaAddErrorSourceDeviceDriver(context: Long, configuration: Long, numberpreallocatederrorreports: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "WheaAddErrorSourceDeviceDriver", longArrayOf(context, configuration, numberpreallocatederrorreports.toLong())).toInt()
}

public fun WheaAddErrorSourceDeviceDriverV1(context: Long, configuration: Long, numbufferstopreallocate: UInt, maxdatalength: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "WheaAddErrorSourceDeviceDriverV1", longArrayOf(context, configuration, numbufferstopreallocate.toLong(), maxdatalength.toLong())).toInt()
}

public fun WheaAddHwErrorReportSectionDeviceDriver(errorhandle: Long, sectiondatalength: UInt, bufferset: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "WheaAddHwErrorReportSectionDeviceDriver", longArrayOf(errorhandle, sectiondatalength.toLong(), bufferset)).toInt()
}

public fun WheaConfigureErrorSource(sourcetype: WHEA_ERROR_SOURCE_TYPE, configuration: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "WheaConfigureErrorSource", longArrayOf(sourcetype.toLong(), configuration)).toInt()
}

public fun WheaCreateHwErrorReportDeviceDriver(errorsourceid: UInt, deviceobject: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "WheaCreateHwErrorReportDeviceDriver", longArrayOf(errorsourceid.toLong(), deviceobject))
}

public fun WheaErrorSourceGetState(errorsourceid: UInt): WHEA_ERROR_SOURCE_STATE {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "WheaErrorSourceGetState", longArrayOf(errorsourceid.toLong())).toInt()
}

public fun WheaGetNotifyAllOfflinesPolicy(): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "WheaGetNotifyAllOfflinesPolicy", longArrayOf())
    return (rawRet and 0xFFL) != 0L
}

public fun WheaHighIrqlLogSelEventHandlerRegister(handler: PFN_WHEA_HIGH_IRQL_LOG_SEL_EVENT_HANDLER, context: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "WheaHighIrqlLogSelEventHandlerRegister", longArrayOf(Win32DynamicFfi.objectSlot(handler), context))
    return (rawRet and 0xFFL) != 0L
}

public fun WheaHighIrqlLogSelEventHandlerUnregister() {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "WheaHighIrqlLogSelEventHandlerUnregister", longArrayOf())
}

public fun WheaHwErrorReportAbandonDeviceDriver(errorhandle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "WheaHwErrorReportAbandonDeviceDriver", longArrayOf(errorhandle)).toInt()
}

public fun WheaHwErrorReportSetSectionNameDeviceDriver(bufferset: Long, namelength: UInt, name: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "WheaHwErrorReportSetSectionNameDeviceDriver", longArrayOf(bufferset, namelength.toLong(), name)).toInt()
}

public fun WheaHwErrorReportSetSeverityDeviceDriver(errorhandle: Long, errorseverity: WHEA_ERROR_SEVERITY): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "WheaHwErrorReportSetSeverityDeviceDriver", longArrayOf(errorhandle, errorseverity.toLong())).toInt()
}

public fun WheaHwErrorReportSubmitDeviceDriver(errorhandle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "WheaHwErrorReportSubmitDeviceDriver", longArrayOf(errorhandle)).toInt()
}

public fun WheaInitializeRecordHeader(header: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "WheaInitializeRecordHeader", longArrayOf(header)).toInt()
}

public fun WheaIsCriticalState(): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "WheaIsCriticalState", longArrayOf())
    return (rawRet and 0xFFL) != 0L
}

public fun WheaLogInternalEvent(entry: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "WheaLogInternalEvent", longArrayOf(entry))
}

public fun WheaRegisterInUsePageOfflineNotification(callback: PFN_IN_USE_PAGE_OFFLINE_NOTIFY, context: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "WheaRegisterInUsePageOfflineNotification", longArrayOf(Win32DynamicFfi.objectSlot(callback), context)).toInt()
}

public fun WheaRemoveErrorSource(errorsourceid: UInt) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "WheaRemoveErrorSource", longArrayOf(errorsourceid.toLong()))
}

public fun WheaRemoveErrorSourceDeviceDriver(errorsourceid: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "WheaRemoveErrorSourceDeviceDriver", longArrayOf(errorsourceid.toLong())).toInt()
}

public fun WheaReportHwError(errorpacket: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "WheaReportHwError", longArrayOf(errorpacket)).toInt()
}

public fun WheaReportHwErrorDeviceDriver(errorsourceid: UInt, deviceobject: Long, errordata: Long, errordatalength: UInt, sectiontypeguid: Long, errorseverity: WHEA_ERROR_SEVERITY, devicefriendlyname: PCSTR): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "WheaReportHwErrorDeviceDriver", longArrayOf(errorsourceid.toLong(), deviceobject, errordata, errordatalength.toLong(), sectiontypeguid, errorseverity.toLong(), devicefriendlyname)).toInt()
}

public fun WheaUnconfigureErrorSource(sourcetype: WHEA_ERROR_SOURCE_TYPE): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "WheaUnconfigureErrorSource", longArrayOf(sourcetype.toLong())).toInt()
}

public fun WheaUnregisterInUsePageOfflineNotification(callback: PFN_IN_USE_PAGE_OFFLINE_NOTIFY): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "WheaUnregisterInUsePageOfflineNotification", longArrayOf(Win32DynamicFfi.objectSlot(callback))).toInt()
}

public fun WmiQueryTraceInformation(traceinformationclass: TRACE_INFORMATION_CLASS, traceinformation: Long, traceinformationlength: UInt, requiredlength: Long, buffer: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "WmiQueryTraceInformation", longArrayOf(traceinformationclass.toLong(), traceinformation, traceinformationlength.toLong(), requiredlength, buffer)).toInt()
}

public fun ZwAllocateLocallyUniqueId(luid: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwAllocateLocallyUniqueId", longArrayOf(luid)).toInt()
}

public fun ZwClose(handle: HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwClose", longArrayOf(handle)).toInt()
}

public fun ZwCommitComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwCommitComplete", longArrayOf(enlistmenthandle, tmvirtualclock)).toInt()
}

public fun ZwCommitEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwCommitEnlistment", longArrayOf(enlistmenthandle, tmvirtualclock)).toInt()
}

public fun ZwCommitTransaction(transactionhandle: HANDLE, wait: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwCommitTransaction", longArrayOf(transactionhandle, if (wait) 1L else 0L)).toInt()
}

public fun ZwCreateEnlistment(enlistmenthandle: Long, desiredaccess: UInt, resourcemanagerhandle: HANDLE, transactionhandle: HANDLE, objectattributes: Long, createoptions: UInt, notificationmask: UInt, enlistmentkey: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwCreateEnlistment", longArrayOf(enlistmenthandle, desiredaccess.toLong(), resourcemanagerhandle, transactionhandle, objectattributes, createoptions.toLong(), notificationmask.toLong(), enlistmentkey)).toInt()
}

public fun ZwCreateFile(filehandle: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: Long, ealength: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwCreateFile", longArrayOf(filehandle, desiredaccess.toLong(), objectattributes, iostatusblock, allocationsize, fileattributes.toLong(), shareaccess.toLong(), createdisposition.toLong(), createoptions.toLong(), eabuffer, ealength.toLong())).toInt()
}

public fun ZwCreateResourceManager(resourcemanagerhandle: Long, desiredaccess: UInt, tmhandle: HANDLE, resourcemanagerguid: Long, objectattributes: Long, createoptions: UInt, description: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwCreateResourceManager", longArrayOf(resourcemanagerhandle, desiredaccess.toLong(), tmhandle, resourcemanagerguid, objectattributes, createoptions.toLong(), description)).toInt()
}

public fun ZwCreateSection(sectionhandle: Long, desiredaccess: UInt, objectattributes: Long, maximumsize: Long, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwCreateSection", longArrayOf(sectionhandle, desiredaccess.toLong(), objectattributes, maximumsize, sectionpageprotection.toLong(), allocationattributes.toLong(), filehandle)).toInt()
}

public fun ZwCreateTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long, uow: Long, tmhandle: HANDLE, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: Long, description: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwCreateTransaction", longArrayOf(transactionhandle, desiredaccess.toLong(), objectattributes, uow, tmhandle, createoptions.toLong(), isolationlevel.toLong(), isolationflags.toLong(), timeout, description)).toInt()
}

public fun ZwCreateTransactionManager(tmhandle: Long, desiredaccess: UInt, objectattributes: Long, logfilename: Long, createoptions: UInt, commitstrength: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwCreateTransactionManager", longArrayOf(tmhandle, desiredaccess.toLong(), objectattributes, logfilename, createoptions.toLong(), commitstrength.toLong())).toInt()
}

public fun ZwDeviceIoControlFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, iocontrolcode: UInt, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwDeviceIoControlFile", longArrayOf(filehandle, event, Win32DynamicFfi.objectSlot(apcroutine), apccontext, iostatusblock, iocontrolcode.toLong(), inputbuffer, inputbufferlength.toLong(), outputbuffer, outputbufferlength.toLong())).toInt()
}

public fun ZwDisplayString(string: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwDisplayString", longArrayOf(string)).toInt()
}

public fun ZwEnumerateTransactionObject(rootobjecthandle: HANDLE, querytype: KTMOBJECT_TYPE, objectcursor: Long, objectcursorlength: UInt, returnlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwEnumerateTransactionObject", longArrayOf(rootobjecthandle, querytype.toLong(), objectcursor, objectcursorlength.toLong(), returnlength)).toInt()
}

public fun ZwGetNotificationResourceManager(resourcemanagerhandle: HANDLE, transactionnotification: Long, notificationlength: UInt, timeout: Long, returnlength: Long, asynchronous: UInt, asynchronouscontext: ULong): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwGetNotificationResourceManager", longArrayOf(resourcemanagerhandle, transactionnotification, notificationlength.toLong(), timeout, returnlength, asynchronous.toLong(), asynchronouscontext.toLong())).toInt()
}

public fun ZwLoadDriver(driverservicename: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwLoadDriver", longArrayOf(driverservicename)).toInt()
}

public fun ZwMakeTemporaryObject(handle: HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwMakeTemporaryObject", longArrayOf(handle)).toInt()
}

public fun ZwManagePartition(targethandle: HANDLE, sourcehandle: HANDLE, partitioninformationclass: PARTITION_INFORMATION_CLASS, partitioninformation: Long, partitioninformationlength: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwManagePartition", longArrayOf(targethandle, sourcehandle, partitioninformationclass.toLong(), partitioninformation, partitioninformationlength.toLong())).toInt()
}

public fun ZwOpenEnlistment(enlistmenthandle: Long, desiredaccess: UInt, rmhandle: HANDLE, enlistmentguid: Long, objectattributes: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwOpenEnlistment", longArrayOf(enlistmenthandle, desiredaccess.toLong(), rmhandle, enlistmentguid, objectattributes)).toInt()
}

public fun ZwOpenFile(filehandle: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, shareaccess: UInt, openoptions: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwOpenFile", longArrayOf(filehandle, desiredaccess.toLong(), objectattributes, iostatusblock, shareaccess.toLong(), openoptions.toLong())).toInt()
}

public fun ZwOpenResourceManager(resourcemanagerhandle: Long, desiredaccess: UInt, tmhandle: HANDLE, resourcemanagerguid: Long, objectattributes: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwOpenResourceManager", longArrayOf(resourcemanagerhandle, desiredaccess.toLong(), tmhandle, resourcemanagerguid, objectattributes)).toInt()
}

public fun ZwOpenSymbolicLinkObject(linkhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwOpenSymbolicLinkObject", longArrayOf(linkhandle, desiredaccess.toLong(), objectattributes)).toInt()
}

public fun ZwOpenTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long, uow: Long, tmhandle: HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwOpenTransaction", longArrayOf(transactionhandle, desiredaccess.toLong(), objectattributes, uow, tmhandle)).toInt()
}

public fun ZwOpenTransactionManager(tmhandle: Long, desiredaccess: UInt, objectattributes: Long, logfilename: Long, tmidentity: Long, openoptions: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwOpenTransactionManager", longArrayOf(tmhandle, desiredaccess.toLong(), objectattributes, logfilename, tmidentity, openoptions.toLong())).toInt()
}

public fun ZwPowerInformation(informationlevel: POWER_INFORMATION_LEVEL, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwPowerInformation", longArrayOf(informationlevel.toLong(), inputbuffer, inputbufferlength.toLong(), outputbuffer, outputbufferlength.toLong())).toInt()
}

public fun ZwPrePrepareComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwPrePrepareComplete", longArrayOf(enlistmenthandle, tmvirtualclock)).toInt()
}

public fun ZwPrePrepareEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwPrePrepareEnlistment", longArrayOf(enlistmenthandle, tmvirtualclock)).toInt()
}

public fun ZwPrepareComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwPrepareComplete", longArrayOf(enlistmenthandle, tmvirtualclock)).toInt()
}

public fun ZwPrepareEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwPrepareEnlistment", longArrayOf(enlistmenthandle, tmvirtualclock)).toInt()
}

public fun ZwPropagationComplete(resourcemanagerhandle: HANDLE, requestcookie: UInt, bufferlength: UInt, buffer: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwPropagationComplete", longArrayOf(resourcemanagerhandle, requestcookie.toLong(), bufferlength.toLong(), buffer)).toInt()
}

public fun ZwPropagationFailed(resourcemanagerhandle: HANDLE, requestcookie: UInt, propstatus: NTSTATUS): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwPropagationFailed", longArrayOf(resourcemanagerhandle, requestcookie.toLong(), propstatus.toLong())).toInt()
}

public fun ZwQueryInformationByName(objectattributes: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwQueryInformationByName", longArrayOf(objectattributes, iostatusblock, fileinformation, length.toLong(), fileinformationclass.toLong())).toInt()
}

public fun ZwQueryInformationEnlistment(enlistmenthandle: HANDLE, enlistmentinformationclass: ENLISTMENT_INFORMATION_CLASS, enlistmentinformation: Long, enlistmentinformationlength: UInt, returnlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwQueryInformationEnlistment", longArrayOf(enlistmenthandle, enlistmentinformationclass.toLong(), enlistmentinformation, enlistmentinformationlength.toLong(), returnlength)).toInt()
}

public fun ZwQueryInformationFile(filehandle: HANDLE, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwQueryInformationFile", longArrayOf(filehandle, iostatusblock, fileinformation, length.toLong(), fileinformationclass.toLong())).toInt()
}

public fun ZwQueryInformationResourceManager(resourcemanagerhandle: HANDLE, resourcemanagerinformationclass: RESOURCEMANAGER_INFORMATION_CLASS, resourcemanagerinformation: Long, resourcemanagerinformationlength: UInt, returnlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwQueryInformationResourceManager", longArrayOf(resourcemanagerhandle, resourcemanagerinformationclass.toLong(), resourcemanagerinformation, resourcemanagerinformationlength.toLong(), returnlength)).toInt()
}

public fun ZwQueryInformationTransaction(transactionhandle: HANDLE, transactioninformationclass: TRANSACTION_INFORMATION_CLASS, transactioninformation: Long, transactioninformationlength: UInt, returnlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwQueryInformationTransaction", longArrayOf(transactionhandle, transactioninformationclass.toLong(), transactioninformation, transactioninformationlength.toLong(), returnlength)).toInt()
}

public fun ZwQueryInformationTransactionManager(transactionmanagerhandle: HANDLE, transactionmanagerinformationclass: TRANSACTIONMANAGER_INFORMATION_CLASS, transactionmanagerinformation: Long, transactionmanagerinformationlength: UInt, returnlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwQueryInformationTransactionManager", longArrayOf(transactionmanagerhandle, transactionmanagerinformationclass.toLong(), transactionmanagerinformation, transactionmanagerinformationlength.toLong(), returnlength)).toInt()
}

public fun ZwQuerySymbolicLinkObject(linkhandle: HANDLE, linktarget: Long, returnedlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwQuerySymbolicLinkObject", longArrayOf(linkhandle, linktarget, returnedlength)).toInt()
}

public fun ZwReadFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, buffer: Long, length: UInt, byteoffset: Long, key: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwReadFile", longArrayOf(filehandle, event, Win32DynamicFfi.objectSlot(apcroutine), apccontext, iostatusblock, buffer, length.toLong(), byteoffset, key)).toInt()
}

public fun ZwReadOnlyEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwReadOnlyEnlistment", longArrayOf(enlistmenthandle, tmvirtualclock)).toInt()
}

public fun ZwRecoverEnlistment(enlistmenthandle: HANDLE, enlistmentkey: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwRecoverEnlistment", longArrayOf(enlistmenthandle, enlistmentkey)).toInt()
}

public fun ZwRecoverResourceManager(resourcemanagerhandle: HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwRecoverResourceManager", longArrayOf(resourcemanagerhandle)).toInt()
}

public fun ZwRecoverTransactionManager(transactionmanagerhandle: HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwRecoverTransactionManager", longArrayOf(transactionmanagerhandle)).toInt()
}

public fun ZwRegisterProtocolAddressInformation(resourcemanager: HANDLE, protocolid: Long, protocolinformationsize: UInt, protocolinformation: Long, createoptions: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwRegisterProtocolAddressInformation", longArrayOf(resourcemanager, protocolid, protocolinformationsize.toLong(), protocolinformation, createoptions.toLong())).toInt()
}

public fun ZwRenameTransactionManager(logfilename: Long, existingtransactionmanagerguid: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwRenameTransactionManager", longArrayOf(logfilename, existingtransactionmanagerguid)).toInt()
}

public fun ZwRollbackComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwRollbackComplete", longArrayOf(enlistmenthandle, tmvirtualclock)).toInt()
}

public fun ZwRollbackEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwRollbackEnlistment", longArrayOf(enlistmenthandle, tmvirtualclock)).toInt()
}

public fun ZwRollbackTransaction(transactionhandle: HANDLE, wait: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwRollbackTransaction", longArrayOf(transactionhandle, if (wait) 1L else 0L)).toInt()
}

public fun ZwRollforwardTransactionManager(transactionmanagerhandle: HANDLE, tmvirtualclock: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwRollforwardTransactionManager", longArrayOf(transactionmanagerhandle, tmvirtualclock)).toInt()
}

public fun ZwSetInformationEnlistment(enlistmenthandle: HANDLE, enlistmentinformationclass: ENLISTMENT_INFORMATION_CLASS, enlistmentinformation: Long, enlistmentinformationlength: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwSetInformationEnlistment", longArrayOf(enlistmenthandle, enlistmentinformationclass.toLong(), enlistmentinformation, enlistmentinformationlength.toLong())).toInt()
}

public fun ZwSetInformationFile(filehandle: HANDLE, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwSetInformationFile", longArrayOf(filehandle, iostatusblock, fileinformation, length.toLong(), fileinformationclass.toLong())).toInt()
}

public fun ZwSetInformationResourceManager(resourcemanagerhandle: HANDLE, resourcemanagerinformationclass: RESOURCEMANAGER_INFORMATION_CLASS, resourcemanagerinformation: Long, resourcemanagerinformationlength: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwSetInformationResourceManager", longArrayOf(resourcemanagerhandle, resourcemanagerinformationclass.toLong(), resourcemanagerinformation, resourcemanagerinformationlength.toLong())).toInt()
}

public fun ZwSetInformationTransaction(transactionhandle: HANDLE, transactioninformationclass: TRANSACTION_INFORMATION_CLASS, transactioninformation: Long, transactioninformationlength: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwSetInformationTransaction", longArrayOf(transactionhandle, transactioninformationclass.toLong(), transactioninformation, transactioninformationlength.toLong())).toInt()
}

public fun ZwSetInformationTransactionManager(tmhandle: HANDLE, transactionmanagerinformationclass: TRANSACTIONMANAGER_INFORMATION_CLASS, transactionmanagerinformation: Long, transactionmanagerinformationlength: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwSetInformationTransactionManager", longArrayOf(tmhandle, transactionmanagerinformationclass.toLong(), transactionmanagerinformation, transactionmanagerinformationlength.toLong())).toInt()
}

public fun ZwSinglePhaseReject(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwSinglePhaseReject", longArrayOf(enlistmenthandle, tmvirtualclock)).toInt()
}

public fun ZwUnloadDriver(driverservicename: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwUnloadDriver", longArrayOf(driverservicename)).toInt()
}

public fun ZwWriteFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, buffer: Long, length: UInt, byteoffset: Long, key: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwWriteFile", longArrayOf(filehandle, event, Win32DynamicFfi.objectSlot(apcroutine), apccontext, iostatusblock, buffer, length.toLong(), byteoffset, key)).toInt()
}

public fun vDbgPrintEx(componentid: UInt, level: UInt, format: PCSTR, arglist: Long): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "vDbgPrintEx", longArrayOf(componentid.toLong(), level.toLong(), format, arglist)).toUInt()
}

public fun vDbgPrintExWithPrefix(prefix: PCSTR, componentid: UInt, level: UInt, format: PCSTR, arglist: Long): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "vDbgPrintExWithPrefix", longArrayOf(prefix, componentid.toLong(), level.toLong(), format, arglist)).toUInt()
}
