package io.github.kotlinmania.windowssys.windows.wdk.system.systemservices

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun interface FnCallback {
    public operator fun invoke()
}

public fun interface FnCallback1 {
    public operator fun invoke(enlistmentobject: Long, rmcontext: Long, transactioncontext: Long, transactionnotification: UInt, tmvirtualclock: Long, argumentlength: UInt, argument: Long): Win32.Foundation.NTSTATUS
}

public fun interface FnCallback2 {
    public operator fun invoke(context: Long, osselrecord: Long): Win32.Foundation.NTSTATUS
}

public fun interface FnCallback3 {
    public operator fun invoke(page: UInt, flags: Boolean, poisoned: Boolean, context: Long): Boolean
}

public fun RtlSetSystemGlobalData(dataid: Win32.System.SystemInformation.RTL_SYSTEM_GLOBAL_DATA_ID, buffer: Long, size: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "RtlSetSystemGlobalData", longArrayOf(Win32DynamicFfi.objectSlot(dataid), buffer, size.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlSplay(links: Long): Long {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlSplay", longArrayOf(links))
}

public fun RtlStringFromGUID(guid: Long, guidstring: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlStringFromGUID", longArrayOf(guid, guidstring))
    return Win32.Foundation.NTSTATUS()
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

public fun RtlUTF8StringToUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlUTF8StringToUnicodeString", longArrayOf(destinationstring, sourcestring, if (allocatedestinationstring) 1L else 0L))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlUTF8ToUnicodeN(unicodestringdestination: PWSTR, unicodestringmaxbytecount: UInt, unicodestringactualbytecount: Long, utf8stringsource: PCSTR, utf8stringbytecount: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlUTF8ToUnicodeN", longArrayOf(unicodestringdestination, unicodestringmaxbytecount.toLong(), unicodestringactualbytecount, utf8stringsource, utf8stringbytecount.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlUnicodeStringToInt64(string: Long, base: UInt, number: Long, endpointer: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "RtlUnicodeStringToInt64", longArrayOf(string, base.toLong(), number, endpointer))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlUnicodeStringToInteger(string: Long, base: UInt, value: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlUnicodeStringToInteger", longArrayOf(string, base.toLong(), value))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlUnicodeStringToUTF8String(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlUnicodeStringToUTF8String", longArrayOf(destinationstring, sourcestring, if (allocatedestinationstring) 1L else 0L))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlUnicodeToUTF8N(utf8stringdestination: PSTR, utf8stringmaxbytecount: UInt, utf8stringactualbytecount: Long, unicodestringsource: Long, unicodestringbytecount: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlUnicodeToUTF8N", longArrayOf(utf8stringdestination, utf8stringmaxbytecount.toLong(), utf8stringactualbytecount, unicodestringsource, unicodestringbytecount.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlUpcaseUnicodeChar(sourcecharacter: UShort): UShort {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlUpcaseUnicodeChar", longArrayOf(sourcecharacter.toLong())).toUShort()
}

public fun RtlUpcaseUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlUpcaseUnicodeString", longArrayOf(destinationstring, sourcestring, if (allocatedestinationstring) 1L else 0L))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlUpperChar(character: Byte): Byte {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlUpperChar", longArrayOf(character.toLong())).toByte()
}

public fun RtlUpperString(destinationstring: Long, sourcestring: Long) {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlUpperString", longArrayOf(destinationstring, sourcestring))
}

public fun RtlValidRelativeSecurityDescriptor(securitydescriptorinput: Win32.Security.PSECURITY_DESCRIPTOR, securitydescriptorlength: UInt, requiredinformation: UInt): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "RtlValidRelativeSecurityDescriptor", longArrayOf(Win32DynamicFfi.objectSlot(securitydescriptorinput), securitydescriptorlength.toLong(), requiredinformation.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlValidSecurityDescriptor(securitydescriptor: Win32.Security.PSECURITY_DESCRIPTOR): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "RtlValidSecurityDescriptor", longArrayOf(Win32DynamicFfi.objectSlot(securitydescriptor)))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlVerifyVersionInfo(versioninfo: Long, typemask: UInt, conditionmask: ULong): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlVerifyVersionInfo", longArrayOf(versioninfo, typemask.toLong(), conditionmask.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlVolumeDeviceToDosName(volumedeviceobject: Long, dosname: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "RtlVolumeDeviceToDosName", longArrayOf(volumedeviceobject, dosname))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlWalkFrameChain(callers: Long, count: UInt, flags: UInt): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlWalkFrameChain", longArrayOf(callers, count.toLong(), flags.toLong())).toUInt()
}

public fun RtlWeaklyEnumerateEntryHashTable(hashtable: Long, enumerator: Long): Long {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlWeaklyEnumerateEntryHashTable", longArrayOf(hashtable, enumerator))
}

public fun RtlWriteRegistryValue(relativeto: UInt, path: PCWSTR, valuename: PCWSTR, valuetype: UInt, valuedata: Long, valuelength: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlWriteRegistryValue", longArrayOf(relativeto.toLong(), path, valuename, valuetype.toLong(), valuedata, valuelength.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun RtlxAnsiStringToUnicodeSize(ansistring: Long): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlxAnsiStringToUnicodeSize", longArrayOf(ansistring)).toUInt()
}

public fun RtlxUnicodeStringToAnsiSize(unicodestring: Long): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlxUnicodeStringToAnsiSize", longArrayOf(unicodestring)).toUInt()
}

public fun SeAccessCheck(securitydescriptor: Win32.Security.PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long, subjectcontextlocked: Boolean, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: Long, genericmapping: Long, accessmode: Byte, grantedaccess: Long, accessstatus: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "SeAccessCheck", longArrayOf(Win32DynamicFfi.objectSlot(securitydescriptor), subjectsecuritycontext, if (subjectcontextlocked) 1L else 0L, desiredaccess.toLong(), previouslygrantedaccess.toLong(), privileges, genericmapping, accessmode.toLong(), grantedaccess, accessstatus))
    return (rawRet and 0xFFL) != 0L
}

public fun SeAssignSecurity(parentdescriptor: Win32.Security.PSECURITY_DESCRIPTOR, explicitdescriptor: Win32.Security.PSECURITY_DESCRIPTOR, newdescriptor: Long, isdirectoryobject: Boolean, subjectcontext: Long, genericmapping: Long, pooltype: Foundation.POOL_TYPE): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeAssignSecurity", longArrayOf(Win32DynamicFfi.objectSlot(parentdescriptor), Win32DynamicFfi.objectSlot(explicitdescriptor), newdescriptor, if (isdirectoryobject) 1L else 0L, subjectcontext, genericmapping, Win32DynamicFfi.objectSlot(pooltype)))
    return Win32.Foundation.NTSTATUS()
}

public fun SeAssignSecurityEx(parentdescriptor: Win32.Security.PSECURITY_DESCRIPTOR, explicitdescriptor: Win32.Security.PSECURITY_DESCRIPTOR, newdescriptor: Long, objecttype: Long, isdirectoryobject: Boolean, autoinheritflags: UInt, subjectcontext: Long, genericmapping: Long, pooltype: Foundation.POOL_TYPE): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeAssignSecurityEx", longArrayOf(Win32DynamicFfi.objectSlot(parentdescriptor), Win32DynamicFfi.objectSlot(explicitdescriptor), newdescriptor, objecttype, if (isdirectoryobject) 1L else 0L, autoinheritflags.toLong(), subjectcontext, genericmapping, Win32DynamicFfi.objectSlot(pooltype)))
    return Win32.Foundation.NTSTATUS()
}

public fun SeCaptureSubjectContext(subjectcontext: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeCaptureSubjectContext", longArrayOf(subjectcontext))
}

public fun SeComputeAutoInheritByObjectType(objecttype: Long, securitydescriptor: Win32.Security.PSECURITY_DESCRIPTOR, parentsecuritydescriptor: Win32.Security.PSECURITY_DESCRIPTOR): UInt {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "SeComputeAutoInheritByObjectType", longArrayOf(objecttype, Win32DynamicFfi.objectSlot(securitydescriptor), Win32DynamicFfi.objectSlot(parentsecuritydescriptor))).toUInt()
}

public fun SeDeassignSecurity(securitydescriptor: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeDeassignSecurity", longArrayOf(securitydescriptor))
    return Win32.Foundation.NTSTATUS()
}

public fun SeEtwWriteKMCveEvent(cveid: Long, additionaldetails: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeEtwWriteKMCveEvent", longArrayOf(cveid, additionaldetails))
    return Win32.Foundation.NTSTATUS()
}

public fun SeLockSubjectContext(subjectcontext: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeLockSubjectContext", longArrayOf(subjectcontext))
}

public fun SeRegisterImageVerificationCallback(imagetype: SE_IMAGE_TYPE, callbacktype: SE_IMAGE_VERIFICATION_CALLBACK_TYPE, callbackfunction: PSE_IMAGE_VERIFICATION_CALLBACK_FUNCTION, callbackcontext: Long, token: Long, callbackhandle: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeRegisterImageVerificationCallback", longArrayOf(imagetype.toLong(), callbacktype.toLong(), Win32DynamicFfi.objectSlot(callbackfunction), callbackcontext, token, callbackhandle))
    return Win32.Foundation.NTSTATUS()
}

public fun SeReleaseSubjectContext(subjectcontext: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeReleaseSubjectContext", longArrayOf(subjectcontext))
}

public fun SeReportSecurityEvent(flags: UInt, sourcename: Long, usersid: Win32.Security.PSID, auditparameters: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeReportSecurityEvent", longArrayOf(flags.toLong(), sourcename, Win32DynamicFfi.objectSlot(usersid), auditparameters))
    return Win32.Foundation.NTSTATUS()
}

public fun SeSetAuditParameter(auditparameters: Long, type: Win32.Security.Authentication.Identity.SE_ADT_PARAMETER_TYPE, index: UInt, data: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeSetAuditParameter", longArrayOf(auditparameters, Win32DynamicFfi.objectSlot(type), index.toLong(), data))
    return Win32.Foundation.NTSTATUS()
}

public fun SeSinglePrivilegeCheck(privilegevalue: Win32.Foundation.LUID, previousmode: Byte): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "SeSinglePrivilegeCheck", longArrayOf(Win32DynamicFfi.objectSlot(privilegevalue), previousmode.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun SeUnlockSubjectContext(subjectcontext: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeUnlockSubjectContext", longArrayOf(subjectcontext))
}

public fun SeUnregisterImageVerificationCallback(callbackhandle: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeUnregisterImageVerificationCallback", longArrayOf(callbackhandle))
}

public fun SeValidSecurityDescriptor(length: UInt, securitydescriptor: Win32.Security.PSECURITY_DESCRIPTOR): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "SeValidSecurityDescriptor", longArrayOf(length.toLong(), Win32DynamicFfi.objectSlot(securitydescriptor)))
    return (rawRet and 0xFFL) != 0L
}

public fun TmCommitComplete(enlistment: Long, tmvirtualclock: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "TmCommitComplete", longArrayOf(enlistment, tmvirtualclock))
    return Win32.Foundation.NTSTATUS()
}

public fun TmCommitEnlistment(enlistment: Long, tmvirtualclock: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "TmCommitEnlistment", longArrayOf(enlistment, tmvirtualclock))
    return Win32.Foundation.NTSTATUS()
}

public fun TmCommitTransaction(transaction: Long, wait: Boolean): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "TmCommitTransaction", longArrayOf(transaction, if (wait) 1L else 0L))
    return Win32.Foundation.NTSTATUS()
}

public fun TmCreateEnlistment(enlistmenthandle: Long, previousmode: Byte, desiredaccess: UInt, objectattributes: Long, resourcemanager: Long, transaction: Long, createoptions: UInt, notificationmask: UInt, enlistmentkey: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "TmCreateEnlistment", longArrayOf(enlistmenthandle, previousmode.toLong(), desiredaccess.toLong(), objectattributes, resourcemanager, transaction, createoptions.toLong(), notificationmask.toLong(), enlistmentkey))
    return Win32.Foundation.NTSTATUS()
}

public fun TmDereferenceEnlistmentKey(enlistment: Long, lastreference: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "TmDereferenceEnlistmentKey", longArrayOf(enlistment, lastreference))
    return Win32.Foundation.NTSTATUS()
}

public fun TmEnableCallbacks(resourcemanager: Long, callbackroutine: PTM_RM_NOTIFICATION, rmkey: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "TmEnableCallbacks", longArrayOf(resourcemanager, Win32DynamicFfi.objectSlot(callbackroutine), rmkey))
    return Win32.Foundation.NTSTATUS()
}

public fun TmGetTransactionId(transaction: Long, transactionid: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "TmGetTransactionId", longArrayOf(transaction, transactionid))
}

public fun TmInitializeTransactionManager(transactionmanager: Long, logfilename: Long, tmid: Long, createoptions: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "TmInitializeTransactionManager", longArrayOf(transactionmanager, logfilename, tmid, createoptions.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun TmIsTransactionActive(transaction: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "TmIsTransactionActive", longArrayOf(transaction))
    return (rawRet and 0xFFL) != 0L
}

public fun TmPrePrepareComplete(enlistment: Long, tmvirtualclock: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "TmPrePrepareComplete", longArrayOf(enlistment, tmvirtualclock))
    return Win32.Foundation.NTSTATUS()
}

public fun TmPrePrepareEnlistment(enlistment: Long, tmvirtualclock: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "TmPrePrepareEnlistment", longArrayOf(enlistment, tmvirtualclock))
    return Win32.Foundation.NTSTATUS()
}

public fun TmPrepareComplete(enlistment: Long, tmvirtualclock: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "TmPrepareComplete", longArrayOf(enlistment, tmvirtualclock))
    return Win32.Foundation.NTSTATUS()
}

public fun TmPrepareEnlistment(enlistment: Long, tmvirtualclock: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "TmPrepareEnlistment", longArrayOf(enlistment, tmvirtualclock))
    return Win32.Foundation.NTSTATUS()
}

public fun TmPropagationComplete(resourcemanager: Long, requestcookie: UInt, bufferlength: UInt, buffer: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "TmPropagationComplete", longArrayOf(resourcemanager, requestcookie.toLong(), bufferlength.toLong(), buffer))
    return Win32.Foundation.NTSTATUS()
}

public fun TmPropagationFailed(resourcemanager: Long, requestcookie: UInt, status: Win32.Foundation.NTSTATUS): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "TmPropagationFailed", longArrayOf(resourcemanager, requestcookie.toLong(), Win32DynamicFfi.objectSlot(status)))
    return Win32.Foundation.NTSTATUS()
}

public fun TmReadOnlyEnlistment(enlistment: Long, tmvirtualclock: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "TmReadOnlyEnlistment", longArrayOf(enlistment, tmvirtualclock))
    return Win32.Foundation.NTSTATUS()
}

public fun TmRecoverEnlistment(enlistment: Long, enlistmentkey: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "TmRecoverEnlistment", longArrayOf(enlistment, enlistmentkey))
    return Win32.Foundation.NTSTATUS()
}

public fun TmRecoverResourceManager(resourcemanager: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "TmRecoverResourceManager", longArrayOf(resourcemanager))
    return Win32.Foundation.NTSTATUS()
}

public fun TmRecoverTransactionManager(tm: Long, targetvirtualclock: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "TmRecoverTransactionManager", longArrayOf(tm, targetvirtualclock))
    return Win32.Foundation.NTSTATUS()
}

public fun TmReferenceEnlistmentKey(enlistment: Long, key: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "TmReferenceEnlistmentKey", longArrayOf(enlistment, key))
    return Win32.Foundation.NTSTATUS()
}

public fun TmRenameTransactionManager(logfilename: Long, existingtransactionmanagerguid: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "TmRenameTransactionManager", longArrayOf(logfilename, existingtransactionmanagerguid))
    return Win32.Foundation.NTSTATUS()
}

public fun TmRequestOutcomeEnlistment(enlistment: Long, tmvirtualclock: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "TmRequestOutcomeEnlistment", longArrayOf(enlistment, tmvirtualclock))
    return Win32.Foundation.NTSTATUS()
}

public fun TmRollbackComplete(enlistment: Long, tmvirtualclock: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "TmRollbackComplete", longArrayOf(enlistment, tmvirtualclock))
    return Win32.Foundation.NTSTATUS()
}

public fun TmRollbackEnlistment(enlistment: Long, tmvirtualclock: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "TmRollbackEnlistment", longArrayOf(enlistment, tmvirtualclock))
    return Win32.Foundation.NTSTATUS()
}

public fun TmRollbackTransaction(transaction: Long, wait: Boolean): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "TmRollbackTransaction", longArrayOf(transaction, if (wait) 1L else 0L))
    return Win32.Foundation.NTSTATUS()
}

public fun TmSinglePhaseReject(enlistment: Long, tmvirtualclock: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "TmSinglePhaseReject", longArrayOf(enlistment, tmvirtualclock))
    return Win32.Foundation.NTSTATUS()
}

public fun VslCreateSecureSection(handle: Long, targetprocess: Foundation.PEPROCESS, mdl: Long, devicepageprotection: UInt, attributes: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "VslCreateSecureSection", longArrayOf(handle, Win32DynamicFfi.objectSlot(targetprocess), mdl, devicepageprotection.toLong(), attributes.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun VslDeleteSecureSection(globalhandle: Win32.Foundation.HANDLE): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "VslDeleteSecureSection", longArrayOf(Win32DynamicFfi.objectSlot(globalhandle)))
    return Win32.Foundation.NTSTATUS()
}

public fun WheaAddErrorSource(errorsource: Long, context: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "WheaAddErrorSource", longArrayOf(errorsource, context))
    return Win32.Foundation.NTSTATUS()
}

public fun WheaAddErrorSourceDeviceDriver(context: Long, configuration: Long, numberpreallocatederrorreports: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "WheaAddErrorSourceDeviceDriver", longArrayOf(context, configuration, numberpreallocatederrorreports.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun WheaAddErrorSourceDeviceDriverV1(context: Long, configuration: Long, numbufferstopreallocate: UInt, maxdatalength: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "WheaAddErrorSourceDeviceDriverV1", longArrayOf(context, configuration, numbufferstopreallocate.toLong(), maxdatalength.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun WheaAddHwErrorReportSectionDeviceDriver(errorhandle: Long, sectiondatalength: UInt, bufferset: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "WheaAddHwErrorReportSectionDeviceDriver", longArrayOf(errorhandle, sectiondatalength.toLong(), bufferset))
    return Win32.Foundation.NTSTATUS()
}

public fun WheaConfigureErrorSource(sourcetype: Win32.System.Diagnostics.Debug.WHEA_ERROR_SOURCE_TYPE, configuration: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "WheaConfigureErrorSource", longArrayOf(Win32DynamicFfi.objectSlot(sourcetype), configuration))
    return Win32.Foundation.NTSTATUS()
}

public fun WheaCreateHwErrorReportDeviceDriver(errorsourceid: UInt, deviceobject: Long): Long {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "WheaCreateHwErrorReportDeviceDriver", longArrayOf(errorsourceid.toLong(), deviceobject))
}

public fun WheaErrorSourceGetState(errorsourceid: UInt): Win32.System.Diagnostics.Debug.WHEA_ERROR_SOURCE_STATE {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "WheaErrorSourceGetState", longArrayOf(errorsourceid.toLong()))
    return Win32.System.Diagnostics.Debug.WHEA_ERROR_SOURCE_STATE()
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

public fun WheaHwErrorReportAbandonDeviceDriver(errorhandle: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "WheaHwErrorReportAbandonDeviceDriver", longArrayOf(errorhandle))
    return Win32.Foundation.NTSTATUS()
}

public fun WheaHwErrorReportSetSectionNameDeviceDriver(bufferset: Long, namelength: UInt, name: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "WheaHwErrorReportSetSectionNameDeviceDriver", longArrayOf(bufferset, namelength.toLong(), name))
    return Win32.Foundation.NTSTATUS()
}

public fun WheaHwErrorReportSetSeverityDeviceDriver(errorhandle: Long, errorseverity: WHEA_ERROR_SEVERITY): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "WheaHwErrorReportSetSeverityDeviceDriver", longArrayOf(errorhandle, errorseverity.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun WheaHwErrorReportSubmitDeviceDriver(errorhandle: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "WheaHwErrorReportSubmitDeviceDriver", longArrayOf(errorhandle))
    return Win32.Foundation.NTSTATUS()
}

public fun WheaInitializeRecordHeader(header: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "WheaInitializeRecordHeader", longArrayOf(header))
    return Win32.Foundation.NTSTATUS()
}

public fun WheaIsCriticalState(): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "WheaIsCriticalState", longArrayOf())
    return (rawRet and 0xFFL) != 0L
}

public fun WheaLogInternalEvent(entry: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "WheaLogInternalEvent", longArrayOf(entry))
}

public fun WheaRegisterInUsePageOfflineNotification(callback: PFN_IN_USE_PAGE_OFFLINE_NOTIFY, context: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "WheaRegisterInUsePageOfflineNotification", longArrayOf(Win32DynamicFfi.objectSlot(callback), context))
    return Win32.Foundation.NTSTATUS()
}

public fun WheaRemoveErrorSource(errorsourceid: UInt) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "WheaRemoveErrorSource", longArrayOf(errorsourceid.toLong()))
}

public fun WheaRemoveErrorSourceDeviceDriver(errorsourceid: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "WheaRemoveErrorSourceDeviceDriver", longArrayOf(errorsourceid.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun WheaReportHwError(errorpacket: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "WheaReportHwError", longArrayOf(errorpacket))
    return Win32.Foundation.NTSTATUS()
}

public fun WheaReportHwErrorDeviceDriver(errorsourceid: UInt, deviceobject: Long, errordata: Long, errordatalength: UInt, sectiontypeguid: Long, errorseverity: WHEA_ERROR_SEVERITY, devicefriendlyname: PCSTR): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "WheaReportHwErrorDeviceDriver", longArrayOf(errorsourceid.toLong(), deviceobject, errordata, errordatalength.toLong(), sectiontypeguid, errorseverity.toLong(), devicefriendlyname))
    return Win32.Foundation.NTSTATUS()
}

public fun WheaUnconfigureErrorSource(sourcetype: Win32.System.Diagnostics.Debug.WHEA_ERROR_SOURCE_TYPE): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "WheaUnconfigureErrorSource", longArrayOf(Win32DynamicFfi.objectSlot(sourcetype)))
    return Win32.Foundation.NTSTATUS()
}

public fun WheaUnregisterInUsePageOfflineNotification(callback: PFN_IN_USE_PAGE_OFFLINE_NOTIFY): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "WheaUnregisterInUsePageOfflineNotification", longArrayOf(Win32DynamicFfi.objectSlot(callback)))
    return Win32.Foundation.NTSTATUS()
}

public fun WmiQueryTraceInformation(traceinformationclass: TRACE_INFORMATION_CLASS, traceinformation: Long, traceinformationlength: UInt, requiredlength: Long, buffer: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "WmiQueryTraceInformation", longArrayOf(traceinformationclass.toLong(), traceinformation, traceinformationlength.toLong(), requiredlength, buffer))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwAllocateLocallyUniqueId(luid: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwAllocateLocallyUniqueId", longArrayOf(luid))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwClose(handle: Win32.Foundation.HANDLE): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwClose", longArrayOf(Win32DynamicFfi.objectSlot(handle)))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwCommitComplete(enlistmenthandle: Win32.Foundation.HANDLE, tmvirtualclock: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwCommitComplete", longArrayOf(Win32DynamicFfi.objectSlot(enlistmenthandle), tmvirtualclock))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwCommitEnlistment(enlistmenthandle: Win32.Foundation.HANDLE, tmvirtualclock: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwCommitEnlistment", longArrayOf(Win32DynamicFfi.objectSlot(enlistmenthandle), tmvirtualclock))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwCommitTransaction(transactionhandle: Win32.Foundation.HANDLE, wait: Boolean): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwCommitTransaction", longArrayOf(Win32DynamicFfi.objectSlot(transactionhandle), if (wait) 1L else 0L))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwCreateEnlistment(enlistmenthandle: Long, desiredaccess: UInt, resourcemanagerhandle: Win32.Foundation.HANDLE, transactionhandle: Win32.Foundation.HANDLE, objectattributes: Long, createoptions: UInt, notificationmask: UInt, enlistmentkey: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwCreateEnlistment", longArrayOf(enlistmenthandle, desiredaccess.toLong(), Win32DynamicFfi.objectSlot(resourcemanagerhandle), Win32DynamicFfi.objectSlot(transactionhandle), objectattributes, createoptions.toLong(), notificationmask.toLong(), enlistmentkey))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwCreateFile(filehandle: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: Long, ealength: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwCreateFile", longArrayOf(filehandle, desiredaccess.toLong(), objectattributes, iostatusblock, allocationsize, fileattributes.toLong(), shareaccess.toLong(), createdisposition.toLong(), createoptions.toLong(), eabuffer, ealength.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwCreateResourceManager(resourcemanagerhandle: Long, desiredaccess: UInt, tmhandle: Win32.Foundation.HANDLE, resourcemanagerguid: Long, objectattributes: Long, createoptions: UInt, description: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwCreateResourceManager", longArrayOf(resourcemanagerhandle, desiredaccess.toLong(), Win32DynamicFfi.objectSlot(tmhandle), resourcemanagerguid, objectattributes, createoptions.toLong(), description))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwCreateSection(sectionhandle: Long, desiredaccess: UInt, objectattributes: Long, maximumsize: Long, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: Win32.Foundation.HANDLE): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwCreateSection", longArrayOf(sectionhandle, desiredaccess.toLong(), objectattributes, maximumsize, sectionpageprotection.toLong(), allocationattributes.toLong(), Win32DynamicFfi.objectSlot(filehandle)))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwCreateTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long, uow: Long, tmhandle: Win32.Foundation.HANDLE, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: Long, description: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwCreateTransaction", longArrayOf(transactionhandle, desiredaccess.toLong(), objectattributes, uow, Win32DynamicFfi.objectSlot(tmhandle), createoptions.toLong(), isolationlevel.toLong(), isolationflags.toLong(), timeout, description))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwCreateTransactionManager(tmhandle: Long, desiredaccess: UInt, objectattributes: Long, logfilename: Long, createoptions: UInt, commitstrength: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwCreateTransactionManager", longArrayOf(tmhandle, desiredaccess.toLong(), objectattributes, logfilename, createoptions.toLong(), commitstrength.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwDeviceIoControlFile(filehandle: Win32.Foundation.HANDLE, event: Win32.Foundation.HANDLE, apcroutine: Win32.System.IO.PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, iocontrolcode: UInt, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwDeviceIoControlFile", longArrayOf(Win32DynamicFfi.objectSlot(filehandle), Win32DynamicFfi.objectSlot(event), Win32DynamicFfi.objectSlot(apcroutine), apccontext, iostatusblock, iocontrolcode.toLong(), inputbuffer, inputbufferlength.toLong(), outputbuffer, outputbufferlength.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwDisplayString(string: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwDisplayString", longArrayOf(string))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwEnumerateTransactionObject(rootobjecthandle: Win32.Foundation.HANDLE, querytype: Win32.System.SystemServices.KTMOBJECT_TYPE, objectcursor: Long, objectcursorlength: UInt, returnlength: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwEnumerateTransactionObject", longArrayOf(Win32DynamicFfi.objectSlot(rootobjecthandle), Win32DynamicFfi.objectSlot(querytype), objectcursor, objectcursorlength.toLong(), returnlength))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwGetNotificationResourceManager(resourcemanagerhandle: Win32.Foundation.HANDLE, transactionnotification: Long, notificationlength: UInt, timeout: Long, returnlength: Long, asynchronous: UInt, asynchronouscontext: ULong): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwGetNotificationResourceManager", longArrayOf(Win32DynamicFfi.objectSlot(resourcemanagerhandle), transactionnotification, notificationlength.toLong(), timeout, returnlength, asynchronous.toLong(), asynchronouscontext.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwLoadDriver(driverservicename: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwLoadDriver", longArrayOf(driverservicename))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwMakeTemporaryObject(handle: Win32.Foundation.HANDLE): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwMakeTemporaryObject", longArrayOf(Win32DynamicFfi.objectSlot(handle)))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwManagePartition(targethandle: Win32.Foundation.HANDLE, sourcehandle: Win32.Foundation.HANDLE, partitioninformationclass: PARTITION_INFORMATION_CLASS, partitioninformation: Long, partitioninformationlength: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwManagePartition", longArrayOf(Win32DynamicFfi.objectSlot(targethandle), Win32DynamicFfi.objectSlot(sourcehandle), partitioninformationclass.toLong(), partitioninformation, partitioninformationlength.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwOpenEnlistment(enlistmenthandle: Long, desiredaccess: UInt, rmhandle: Win32.Foundation.HANDLE, enlistmentguid: Long, objectattributes: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwOpenEnlistment", longArrayOf(enlistmenthandle, desiredaccess.toLong(), Win32DynamicFfi.objectSlot(rmhandle), enlistmentguid, objectattributes))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwOpenFile(filehandle: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, shareaccess: UInt, openoptions: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwOpenFile", longArrayOf(filehandle, desiredaccess.toLong(), objectattributes, iostatusblock, shareaccess.toLong(), openoptions.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwOpenResourceManager(resourcemanagerhandle: Long, desiredaccess: UInt, tmhandle: Win32.Foundation.HANDLE, resourcemanagerguid: Long, objectattributes: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwOpenResourceManager", longArrayOf(resourcemanagerhandle, desiredaccess.toLong(), Win32DynamicFfi.objectSlot(tmhandle), resourcemanagerguid, objectattributes))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwOpenSymbolicLinkObject(linkhandle: Long, desiredaccess: UInt, objectattributes: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwOpenSymbolicLinkObject", longArrayOf(linkhandle, desiredaccess.toLong(), objectattributes))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwOpenTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long, uow: Long, tmhandle: Win32.Foundation.HANDLE): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwOpenTransaction", longArrayOf(transactionhandle, desiredaccess.toLong(), objectattributes, uow, Win32DynamicFfi.objectSlot(tmhandle)))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwOpenTransactionManager(tmhandle: Long, desiredaccess: UInt, objectattributes: Long, logfilename: Long, tmidentity: Long, openoptions: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwOpenTransactionManager", longArrayOf(tmhandle, desiredaccess.toLong(), objectattributes, logfilename, tmidentity, openoptions.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwPowerInformation(informationlevel: Win32.System.Power.POWER_INFORMATION_LEVEL, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwPowerInformation", longArrayOf(Win32DynamicFfi.objectSlot(informationlevel), inputbuffer, inputbufferlength.toLong(), outputbuffer, outputbufferlength.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwPrePrepareComplete(enlistmenthandle: Win32.Foundation.HANDLE, tmvirtualclock: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwPrePrepareComplete", longArrayOf(Win32DynamicFfi.objectSlot(enlistmenthandle), tmvirtualclock))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwPrePrepareEnlistment(enlistmenthandle: Win32.Foundation.HANDLE, tmvirtualclock: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwPrePrepareEnlistment", longArrayOf(Win32DynamicFfi.objectSlot(enlistmenthandle), tmvirtualclock))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwPrepareComplete(enlistmenthandle: Win32.Foundation.HANDLE, tmvirtualclock: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwPrepareComplete", longArrayOf(Win32DynamicFfi.objectSlot(enlistmenthandle), tmvirtualclock))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwPrepareEnlistment(enlistmenthandle: Win32.Foundation.HANDLE, tmvirtualclock: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwPrepareEnlistment", longArrayOf(Win32DynamicFfi.objectSlot(enlistmenthandle), tmvirtualclock))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwPropagationComplete(resourcemanagerhandle: Win32.Foundation.HANDLE, requestcookie: UInt, bufferlength: UInt, buffer: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwPropagationComplete", longArrayOf(Win32DynamicFfi.objectSlot(resourcemanagerhandle), requestcookie.toLong(), bufferlength.toLong(), buffer))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwPropagationFailed(resourcemanagerhandle: Win32.Foundation.HANDLE, requestcookie: UInt, propstatus: Win32.Foundation.NTSTATUS): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwPropagationFailed", longArrayOf(Win32DynamicFfi.objectSlot(resourcemanagerhandle), requestcookie.toLong(), Win32DynamicFfi.objectSlot(propstatus)))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwQueryInformationByName(objectattributes: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: Storage.FileSystem.FILE_INFORMATION_CLASS): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwQueryInformationByName", longArrayOf(objectattributes, iostatusblock, fileinformation, length.toLong(), Win32DynamicFfi.objectSlot(fileinformationclass)))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwQueryInformationEnlistment(enlistmenthandle: Win32.Foundation.HANDLE, enlistmentinformationclass: Win32.System.SystemServices.ENLISTMENT_INFORMATION_CLASS, enlistmentinformation: Long, enlistmentinformationlength: UInt, returnlength: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwQueryInformationEnlistment", longArrayOf(Win32DynamicFfi.objectSlot(enlistmenthandle), Win32DynamicFfi.objectSlot(enlistmentinformationclass), enlistmentinformation, enlistmentinformationlength.toLong(), returnlength))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwQueryInformationFile(filehandle: Win32.Foundation.HANDLE, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: Storage.FileSystem.FILE_INFORMATION_CLASS): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwQueryInformationFile", longArrayOf(Win32DynamicFfi.objectSlot(filehandle), iostatusblock, fileinformation, length.toLong(), Win32DynamicFfi.objectSlot(fileinformationclass)))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwQueryInformationResourceManager(resourcemanagerhandle: Win32.Foundation.HANDLE, resourcemanagerinformationclass: Win32.System.SystemServices.RESOURCEMANAGER_INFORMATION_CLASS, resourcemanagerinformation: Long, resourcemanagerinformationlength: UInt, returnlength: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwQueryInformationResourceManager", longArrayOf(Win32DynamicFfi.objectSlot(resourcemanagerhandle), Win32DynamicFfi.objectSlot(resourcemanagerinformationclass), resourcemanagerinformation, resourcemanagerinformationlength.toLong(), returnlength))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwQueryInformationTransaction(transactionhandle: Win32.Foundation.HANDLE, transactioninformationclass: Win32.System.SystemServices.TRANSACTION_INFORMATION_CLASS, transactioninformation: Long, transactioninformationlength: UInt, returnlength: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwQueryInformationTransaction", longArrayOf(Win32DynamicFfi.objectSlot(transactionhandle), Win32DynamicFfi.objectSlot(transactioninformationclass), transactioninformation, transactioninformationlength.toLong(), returnlength))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwQueryInformationTransactionManager(transactionmanagerhandle: Win32.Foundation.HANDLE, transactionmanagerinformationclass: Win32.System.SystemServices.TRANSACTIONMANAGER_INFORMATION_CLASS, transactionmanagerinformation: Long, transactionmanagerinformationlength: UInt, returnlength: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwQueryInformationTransactionManager", longArrayOf(Win32DynamicFfi.objectSlot(transactionmanagerhandle), Win32DynamicFfi.objectSlot(transactionmanagerinformationclass), transactionmanagerinformation, transactionmanagerinformationlength.toLong(), returnlength))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwQuerySymbolicLinkObject(linkhandle: Win32.Foundation.HANDLE, linktarget: Long, returnedlength: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwQuerySymbolicLinkObject", longArrayOf(Win32DynamicFfi.objectSlot(linkhandle), linktarget, returnedlength))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwReadFile(filehandle: Win32.Foundation.HANDLE, event: Win32.Foundation.HANDLE, apcroutine: Win32.System.IO.PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, buffer: Long, length: UInt, byteoffset: Long, key: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwReadFile", longArrayOf(Win32DynamicFfi.objectSlot(filehandle), Win32DynamicFfi.objectSlot(event), Win32DynamicFfi.objectSlot(apcroutine), apccontext, iostatusblock, buffer, length.toLong(), byteoffset, key))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwReadOnlyEnlistment(enlistmenthandle: Win32.Foundation.HANDLE, tmvirtualclock: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwReadOnlyEnlistment", longArrayOf(Win32DynamicFfi.objectSlot(enlistmenthandle), tmvirtualclock))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwRecoverEnlistment(enlistmenthandle: Win32.Foundation.HANDLE, enlistmentkey: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwRecoverEnlistment", longArrayOf(Win32DynamicFfi.objectSlot(enlistmenthandle), enlistmentkey))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwRecoverResourceManager(resourcemanagerhandle: Win32.Foundation.HANDLE): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwRecoverResourceManager", longArrayOf(Win32DynamicFfi.objectSlot(resourcemanagerhandle)))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwRecoverTransactionManager(transactionmanagerhandle: Win32.Foundation.HANDLE): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwRecoverTransactionManager", longArrayOf(Win32DynamicFfi.objectSlot(transactionmanagerhandle)))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwRegisterProtocolAddressInformation(resourcemanager: Win32.Foundation.HANDLE, protocolid: Long, protocolinformationsize: UInt, protocolinformation: Long, createoptions: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwRegisterProtocolAddressInformation", longArrayOf(Win32DynamicFfi.objectSlot(resourcemanager), protocolid, protocolinformationsize.toLong(), protocolinformation, createoptions.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwRenameTransactionManager(logfilename: Long, existingtransactionmanagerguid: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwRenameTransactionManager", longArrayOf(logfilename, existingtransactionmanagerguid))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwRollbackComplete(enlistmenthandle: Win32.Foundation.HANDLE, tmvirtualclock: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwRollbackComplete", longArrayOf(Win32DynamicFfi.objectSlot(enlistmenthandle), tmvirtualclock))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwRollbackEnlistment(enlistmenthandle: Win32.Foundation.HANDLE, tmvirtualclock: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwRollbackEnlistment", longArrayOf(Win32DynamicFfi.objectSlot(enlistmenthandle), tmvirtualclock))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwRollbackTransaction(transactionhandle: Win32.Foundation.HANDLE, wait: Boolean): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwRollbackTransaction", longArrayOf(Win32DynamicFfi.objectSlot(transactionhandle), if (wait) 1L else 0L))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwRollforwardTransactionManager(transactionmanagerhandle: Win32.Foundation.HANDLE, tmvirtualclock: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwRollforwardTransactionManager", longArrayOf(Win32DynamicFfi.objectSlot(transactionmanagerhandle), tmvirtualclock))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwSetInformationEnlistment(enlistmenthandle: Win32.Foundation.HANDLE, enlistmentinformationclass: Win32.System.SystemServices.ENLISTMENT_INFORMATION_CLASS, enlistmentinformation: Long, enlistmentinformationlength: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwSetInformationEnlistment", longArrayOf(Win32DynamicFfi.objectSlot(enlistmenthandle), Win32DynamicFfi.objectSlot(enlistmentinformationclass), enlistmentinformation, enlistmentinformationlength.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwSetInformationFile(filehandle: Win32.Foundation.HANDLE, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: Storage.FileSystem.FILE_INFORMATION_CLASS): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwSetInformationFile", longArrayOf(Win32DynamicFfi.objectSlot(filehandle), iostatusblock, fileinformation, length.toLong(), Win32DynamicFfi.objectSlot(fileinformationclass)))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwSetInformationResourceManager(resourcemanagerhandle: Win32.Foundation.HANDLE, resourcemanagerinformationclass: Win32.System.SystemServices.RESOURCEMANAGER_INFORMATION_CLASS, resourcemanagerinformation: Long, resourcemanagerinformationlength: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwSetInformationResourceManager", longArrayOf(Win32DynamicFfi.objectSlot(resourcemanagerhandle), Win32DynamicFfi.objectSlot(resourcemanagerinformationclass), resourcemanagerinformation, resourcemanagerinformationlength.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwSetInformationTransaction(transactionhandle: Win32.Foundation.HANDLE, transactioninformationclass: Win32.System.SystemServices.TRANSACTION_INFORMATION_CLASS, transactioninformation: Long, transactioninformationlength: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwSetInformationTransaction", longArrayOf(Win32DynamicFfi.objectSlot(transactionhandle), Win32DynamicFfi.objectSlot(transactioninformationclass), transactioninformation, transactioninformationlength.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwSetInformationTransactionManager(tmhandle: Win32.Foundation.HANDLE, transactionmanagerinformationclass: Win32.System.SystemServices.TRANSACTIONMANAGER_INFORMATION_CLASS, transactionmanagerinformation: Long, transactionmanagerinformationlength: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwSetInformationTransactionManager", longArrayOf(Win32DynamicFfi.objectSlot(tmhandle), Win32DynamicFfi.objectSlot(transactionmanagerinformationclass), transactionmanagerinformation, transactionmanagerinformationlength.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwSinglePhaseReject(enlistmenthandle: Win32.Foundation.HANDLE, tmvirtualclock: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwSinglePhaseReject", longArrayOf(Win32DynamicFfi.objectSlot(enlistmenthandle), tmvirtualclock))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwUnloadDriver(driverservicename: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwUnloadDriver", longArrayOf(driverservicename))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwWriteFile(filehandle: Win32.Foundation.HANDLE, event: Win32.Foundation.HANDLE, apcroutine: Win32.System.IO.PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, buffer: Long, length: UInt, byteoffset: Long, key: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwWriteFile", longArrayOf(Win32DynamicFfi.objectSlot(filehandle), Win32DynamicFfi.objectSlot(event), Win32DynamicFfi.objectSlot(apcroutine), apccontext, iostatusblock, buffer, length.toLong(), byteoffset, key))
    return Win32.Foundation.NTSTATUS()
}

public fun vDbgPrintEx(componentid: UInt, level: UInt, format: PCSTR, arglist: Long): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "vDbgPrintEx", longArrayOf(componentid.toLong(), level.toLong(), format, arglist)).toUInt()
}

public fun vDbgPrintExWithPrefix(prefix: PCSTR, componentid: UInt, level: UInt, format: PCSTR, arglist: Long): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "vDbgPrintExWithPrefix", longArrayOf(prefix, componentid.toLong(), level.toLong(), format, arglist)).toUInt()
}
