package io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.wdk.foundation.OBJECT_INFORMATION_CLASS
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PEPROCESS
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PESILO
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PETHREAD
import io.github.kotlinmania.windowssys.windows.wdk.foundation.POOL_TYPE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windowssys.windows.win32.security.AUDIT_EVENT_TYPE
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR
import io.github.kotlinmania.windowssys.windows.win32.security.PSID
import io.github.kotlinmania.windowssys.windows.win32.security.TOKEN_INFORMATION_CLASS
import io.github.kotlinmania.windowssys.windows.win32.security.TOKEN_TYPE
import io.github.kotlinmania.windowssys.windows.win32.security.WELL_KNOWN_SID_TYPE
import io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.SEC_GET_KEY_FN
import io.github.kotlinmania.windowssys.windows.win32.system.io.PIO_APC_ROUTINE
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.EVENT_TYPE

public fun interface FnCallbackPart2 {
    public operator fun invoke(): NTSTATUS
}

public fun interface FnCallback1Part2 {
    public operator fun invoke(handle: Long, callbackdata: Long)
}

public fun RtlNtStatusToDosErrorNoTeb(status: NTSTATUS): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlNtStatusToDosErrorNoTeb", longArrayOf(status.toLong())).toUInt()
}

public fun RtlOemStringToCountedUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "RtlOemStringToCountedUnicodeString", longArrayOf(destinationstring, sourcestring, if (allocatedestinationstring) 1L else 0L)).toInt()
}

public fun RtlOemStringToUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlOemStringToUnicodeString", longArrayOf(destinationstring, sourcestring, if (allocatedestinationstring) 1L else 0L)).toInt()
}

public fun RtlOemToUnicodeN(unicodestring: PWSTR, maxbytesinunicodestring: UInt, bytesinunicodestring: Long, oemstring: PCSTR, bytesinoemstring: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlOemToUnicodeN", longArrayOf(unicodestring, maxbytesinunicodestring.toLong(), bytesinunicodestring, oemstring, bytesinoemstring.toLong())).toInt()
}

public fun RtlPrefixString(string1: Long, string2: Long, caseinsensitive: Boolean): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "RtlPrefixString", longArrayOf(string1, string2, if (caseinsensitive) 1L else 0L))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlQueryPackageIdentity(tokenobject: Long, packagefullname: PWSTR, packagesize: Long, appid: PWSTR, appidsize: Long, packaged: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlQueryPackageIdentity", longArrayOf(tokenobject, packagefullname, packagesize, appid, appidsize, packaged)).toInt()
}

public fun RtlQueryPackageIdentityEx(tokenobject: Long, packagefullname: PWSTR, packagesize: Long, appid: PWSTR, appidsize: Long, dynamicid: Long, flags: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlQueryPackageIdentityEx", longArrayOf(tokenobject, packagefullname, packagesize, appid, appidsize, dynamicid, flags)).toInt()
}

public fun RtlQueryProcessPlaceholderCompatibilityMode(): Byte {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlQueryProcessPlaceholderCompatibilityMode", longArrayOf()).toByte()
}

public fun RtlQueryThreadPlaceholderCompatibilityMode(): Byte {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlQueryThreadPlaceholderCompatibilityMode", longArrayOf()).toByte()
}

public fun RtlRandom(seed: Long): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlRandom", longArrayOf(seed)).toUInt()
}

public fun RtlRandomEx(seed: Long): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlRandomEx", longArrayOf(seed)).toUInt()
}

public fun RtlRemoveUnicodePrefix(prefixtable: Long, prefixtableentry: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "RtlRemoveUnicodePrefix", longArrayOf(prefixtable, prefixtableentry))
}

public fun RtlReplaceSidInSd(securitydescriptor: PSECURITY_DESCRIPTOR, oldsid: PSID, newsid: PSID, numchanges: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlReplaceSidInSd", longArrayOf(securitydescriptor, oldsid, newsid, numchanges)).toInt()
}

public fun RtlReserveChunk(compressionformat: UShort, compressedbuffer: Long, endofcompressedbufferplus1: Long, chunkbuffer: Long, chunksize: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "RtlReserveChunk", longArrayOf(compressionformat.toLong(), compressedbuffer, endofcompressedbufferplus1, chunkbuffer, chunksize.toLong())).toInt()
}

public fun RtlSecondsSince1970ToTime(elapsedseconds: UInt, time: Long) {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlSecondsSince1970ToTime", longArrayOf(elapsedseconds.toLong(), time))
}

public fun RtlSecondsSince1980ToTime(elapsedseconds: UInt, time: Long) {
    Win32DynamicFfi.invoke("ntdll.dll", "RtlSecondsSince1980ToTime", longArrayOf(elapsedseconds.toLong(), time))
}

public fun RtlSelfRelativeToAbsoluteSD(selfrelativesecuritydescriptor: PSECURITY_DESCRIPTOR, absolutesecuritydescriptor: PSECURITY_DESCRIPTOR, absolutesecuritydescriptorsize: Long, dacl: Long, daclsize: Long, sacl: Long, saclsize: Long, owner: PSID, ownersize: Long, primarygroup: PSID, primarygroupsize: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlSelfRelativeToAbsoluteSD", longArrayOf(selfrelativesecuritydescriptor, absolutesecuritydescriptor, absolutesecuritydescriptorsize, dacl, daclsize, sacl, saclsize, owner, ownersize, primarygroup, primarygroupsize)).toInt()
}

public fun RtlSetGroupSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR, group: PSID, groupdefaulted: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlSetGroupSecurityDescriptor", longArrayOf(securitydescriptor, group, if (groupdefaulted) 1L else 0L)).toInt()
}

public fun RtlSetOwnerSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR, owner: PSID, ownerdefaulted: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlSetOwnerSecurityDescriptor", longArrayOf(securitydescriptor, owner, if (ownerdefaulted) 1L else 0L)).toInt()
}

public fun RtlSetProcessPlaceholderCompatibilityMode(mode: Byte): Byte {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlSetProcessPlaceholderCompatibilityMode", longArrayOf(mode.toLong())).toByte()
}

public fun RtlSetThreadPlaceholderCompatibilityMode(mode: Byte): Byte {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlSetThreadPlaceholderCompatibilityMode", longArrayOf(mode.toLong())).toByte()
}

public fun RtlSubAuthorityCountSid(sid: PSID): Long {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlSubAuthorityCountSid", longArrayOf(sid))
}

public fun RtlSubAuthoritySid(sid: PSID, subauthority: UInt): Long {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlSubAuthoritySid", longArrayOf(sid, subauthority.toLong()))
}

public fun RtlTimeToSecondsSince1980(time: Long, elapsedseconds: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "RtlTimeToSecondsSince1980", longArrayOf(time, elapsedseconds))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlUnicodeStringToCountedOemString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlUnicodeStringToCountedOemString", longArrayOf(destinationstring, sourcestring, if (allocatedestinationstring) 1L else 0L)).toInt()
}

public fun RtlUnicodeToCustomCPN(customcp: Long, customcpstring: PSTR, maxbytesincustomcpstring: UInt, bytesincustomcpstring: Long, unicodestring: PCWSTR, bytesinunicodestring: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlUnicodeToCustomCPN", longArrayOf(customcp, customcpstring, maxbytesincustomcpstring.toLong(), bytesincustomcpstring, unicodestring, bytesinunicodestring.toLong())).toInt()
}

public fun RtlUnicodeToMultiByteN(multibytestring: PSTR, maxbytesinmultibytestring: UInt, bytesinmultibytestring: Long, unicodestring: Long, bytesinunicodestring: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlUnicodeToMultiByteN", longArrayOf(multibytestring, maxbytesinmultibytestring.toLong(), bytesinmultibytestring, unicodestring, bytesinunicodestring.toLong())).toInt()
}

public fun RtlUnicodeToOemN(oemstring: PSTR, maxbytesinoemstring: UInt, bytesinoemstring: Long, unicodestring: Long, bytesinunicodestring: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlUnicodeToOemN", longArrayOf(oemstring, maxbytesinoemstring.toLong(), bytesinoemstring, unicodestring, bytesinunicodestring.toLong())).toInt()
}

public fun RtlUpcaseUnicodeStringToCountedOemString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlUpcaseUnicodeStringToCountedOemString", longArrayOf(destinationstring, sourcestring, if (allocatedestinationstring) 1L else 0L)).toInt()
}

public fun RtlUpcaseUnicodeStringToOemString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlUpcaseUnicodeStringToOemString", longArrayOf(destinationstring, sourcestring, if (allocatedestinationstring) 1L else 0L)).toInt()
}

public fun RtlUpcaseUnicodeToCustomCPN(customcp: Long, customcpstring: PSTR, maxbytesincustomcpstring: UInt, bytesincustomcpstring: Long, unicodestring: PCWSTR, bytesinunicodestring: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlUpcaseUnicodeToCustomCPN", longArrayOf(customcp, customcpstring, maxbytesincustomcpstring.toLong(), bytesincustomcpstring, unicodestring, bytesinunicodestring.toLong())).toInt()
}

public fun RtlUpcaseUnicodeToMultiByteN(multibytestring: PSTR, maxbytesinmultibytestring: UInt, bytesinmultibytestring: Long, unicodestring: Long, bytesinunicodestring: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlUpcaseUnicodeToMultiByteN", longArrayOf(multibytestring, maxbytesinmultibytestring.toLong(), bytesinmultibytestring, unicodestring, bytesinunicodestring.toLong())).toInt()
}

public fun RtlUpcaseUnicodeToOemN(oemstring: PSTR, maxbytesinoemstring: UInt, bytesinoemstring: Long, unicodestring: Long, bytesinunicodestring: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlUpcaseUnicodeToOemN", longArrayOf(oemstring, maxbytesinoemstring.toLong(), bytesinoemstring, unicodestring, bytesinunicodestring.toLong())).toInt()
}

public fun RtlValidSid(sid: PSID): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntdll.dll", "RtlValidSid", longArrayOf(sid))
    return (rawRet and 0xFFL) != 0L
}

public fun RtlValidateUnicodeString(flags: UInt, string: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlValidateUnicodeString", longArrayOf(flags.toLong(), string)).toInt()
}

public fun RtlxOemStringToUnicodeSize(oemstring: Long): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlxOemStringToUnicodeSize", longArrayOf(oemstring)).toUInt()
}

public fun RtlxUnicodeStringToOemSize(unicodestring: Long): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlxUnicodeStringToOemSize", longArrayOf(unicodestring)).toUInt()
}

public fun SeAccessCheckFromState(securitydescriptor: PSECURITY_DESCRIPTOR, primarytokeninformation: Long, clienttokeninformation: Long, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: Long, genericmapping: Long, accessmode: Byte, grantedaccess: Long, accessstatus: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "SeAccessCheckFromState", longArrayOf(securitydescriptor, primarytokeninformation, clienttokeninformation, desiredaccess.toLong(), previouslygrantedaccess.toLong(), privileges, genericmapping, accessmode.toLong(), grantedaccess, accessstatus))
    return (rawRet and 0xFFL) != 0L
}

public fun SeAccessCheckFromStateEx(securitydescriptor: PSECURITY_DESCRIPTOR, primarytoken: Long, clienttoken: Long, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: Long, genericmapping: Long, accessmode: Byte, grantedaccess: Long, accessstatus: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "SeAccessCheckFromStateEx", longArrayOf(securitydescriptor, primarytoken, clienttoken, desiredaccess.toLong(), previouslygrantedaccess.toLong(), privileges, genericmapping, accessmode.toLong(), grantedaccess, accessstatus))
    return (rawRet and 0xFFL) != 0L
}

public fun SeAdjustAccessStateForAccessConstraints(objecttype: Long, securitydescriptor: PSECURITY_DESCRIPTOR, accessstate: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeAdjustAccessStateForAccessConstraints", longArrayOf(objecttype, securitydescriptor, accessstate))
}

public fun SeAdjustAccessStateForTrustLabel(objecttype: Long, securitydescriptor: PSECURITY_DESCRIPTOR, accessstate: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeAdjustAccessStateForTrustLabel", longArrayOf(objecttype, securitydescriptor, accessstate))
}

public fun SeAdjustObjectSecurity(objectname: Long, originaldescriptor: PSECURITY_DESCRIPTOR, proposeddescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long, adjusteddescriptor: Long, applyadjusteddescriptor: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "SeAdjustObjectSecurity", longArrayOf(objectname, originaldescriptor, proposeddescriptor, subjectsecuritycontext, adjusteddescriptor, applyadjusteddescriptor)).toInt()
}

public fun SeAppendPrivileges(accessstate: Long, privileges: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "SeAppendPrivileges", longArrayOf(accessstate, privileges)).toInt()
}

public fun SeAuditFipsCryptoSelftests(bsuccess: Boolean, selftestcode: UInt) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeAuditFipsCryptoSelftests", longArrayOf(if (bsuccess) 1L else 0L, selftestcode.toLong()))
}

public fun SeAuditHardLinkCreation(filename: Long, linkname: Long, bsuccess: Boolean) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeAuditHardLinkCreation", longArrayOf(filename, linkname, if (bsuccess) 1L else 0L))
}

public fun SeAuditHardLinkCreationWithTransaction(filename: Long, linkname: Long, bsuccess: Boolean, transactionid: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeAuditHardLinkCreationWithTransaction", longArrayOf(filename, linkname, if (bsuccess) 1L else 0L, transactionid))
}

public fun SeAuditTransactionStateChange(transactionid: Long, resourcemanagerid: Long, newtransactionstate: UInt) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeAuditTransactionStateChange", longArrayOf(transactionid, resourcemanagerid, newtransactionstate.toLong()))
}

public fun SeAuditingAnyFileEventsWithContext(securitydescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "SeAuditingAnyFileEventsWithContext", longArrayOf(securitydescriptor, subjectsecuritycontext))
    return (rawRet and 0xFFL) != 0L
}

public fun SeAuditingAnyFileEventsWithContextEx(securitydescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long, stagingenabled: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "SeAuditingAnyFileEventsWithContextEx", longArrayOf(securitydescriptor, subjectsecuritycontext, stagingenabled))
    return (rawRet and 0xFFL) != 0L
}

public fun SeAuditingFileEvents(accessgranted: Boolean, securitydescriptor: PSECURITY_DESCRIPTOR): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "SeAuditingFileEvents", longArrayOf(if (accessgranted) 1L else 0L, securitydescriptor))
    return (rawRet and 0xFFL) != 0L
}

public fun SeAuditingFileEventsWithContext(accessgranted: Boolean, securitydescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "SeAuditingFileEventsWithContext", longArrayOf(if (accessgranted) 1L else 0L, securitydescriptor, subjectsecuritycontext))
    return (rawRet and 0xFFL) != 0L
}

public fun SeAuditingFileEventsWithContextEx(accessgranted: Boolean, securitydescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long, stagingenabled: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "SeAuditingFileEventsWithContextEx", longArrayOf(if (accessgranted) 1L else 0L, securitydescriptor, subjectsecuritycontext, stagingenabled))
    return (rawRet and 0xFFL) != 0L
}

public fun SeAuditingFileOrGlobalEvents(accessgranted: Boolean, securitydescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "SeAuditingFileOrGlobalEvents", longArrayOf(if (accessgranted) 1L else 0L, securitydescriptor, subjectsecuritycontext))
    return (rawRet and 0xFFL) != 0L
}

public fun SeAuditingHardLinkEvents(accessgranted: Boolean, securitydescriptor: PSECURITY_DESCRIPTOR): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "SeAuditingHardLinkEvents", longArrayOf(if (accessgranted) 1L else 0L, securitydescriptor))
    return (rawRet and 0xFFL) != 0L
}

public fun SeAuditingHardLinkEventsWithContext(accessgranted: Boolean, securitydescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "SeAuditingHardLinkEventsWithContext", longArrayOf(if (accessgranted) 1L else 0L, securitydescriptor, subjectsecuritycontext))
    return (rawRet and 0xFFL) != 0L
}

public fun SeCaptureSubjectContextEx(thread: PETHREAD, process: PEPROCESS, subjectcontext: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeCaptureSubjectContextEx", longArrayOf(thread, process, subjectcontext))
}

public fun SeCheckForCriticalAceRemoval(currentdescriptor: PSECURITY_DESCRIPTOR, newdescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long, aceremoved: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeCheckForCriticalAceRemoval", longArrayOf(currentdescriptor, newdescriptor, subjectsecuritycontext, aceremoved))
}

public fun SeCreateClientSecurity(clientthread: PETHREAD, clientsecurityqos: Long, remotesession: Boolean, clientcontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "SeCreateClientSecurity", longArrayOf(clientthread, clientsecurityqos, if (remotesession) 1L else 0L, clientcontext)).toInt()
}

public fun SeCreateClientSecurityFromSubjectContext(subjectcontext: Long, clientsecurityqos: Long, serverisremote: Boolean, clientcontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "SeCreateClientSecurityFromSubjectContext", longArrayOf(subjectcontext, clientsecurityqos, if (serverisremote) 1L else 0L, clientcontext)).toInt()
}

public fun SeDeleteClientSecurity(clientcontext: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeDeleteClientSecurity", longArrayOf(clientcontext))
}

public fun SeDeleteObjectAuditAlarm(obj: Long, handle: HANDLE) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeDeleteObjectAuditAlarm", longArrayOf(obj, handle))
}

public fun SeDeleteObjectAuditAlarmWithTransaction(obj: Long, handle: HANDLE, transactionid: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeDeleteObjectAuditAlarmWithTransaction", longArrayOf(obj, handle, transactionid))
}

public fun SeExamineSacl(sacl: Long, resourcesacl: Long, token: Long, desiredaccess: UInt, accessgranted: Boolean, generateaudit: Long, generatealarm: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeExamineSacl", longArrayOf(sacl, resourcesacl, token, desiredaccess.toLong(), if (accessgranted) 1L else 0L, generateaudit, generatealarm))
}

public fun SeFilterToken(existingtoken: Long, flags: UInt, sidstodisable: Long, privilegestodelete: Long, restrictedsids: Long, filteredtoken: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "SeFilterToken", longArrayOf(existingtoken, flags.toLong(), sidstodisable, privilegestodelete, restrictedsids, filteredtoken)).toInt()
}

public fun SeFreePrivileges(privileges: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeFreePrivileges", longArrayOf(privileges))
}

public fun SeImpersonateClient(clientcontext: Long, serverthread: PETHREAD) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeImpersonateClient", longArrayOf(clientcontext, serverthread))
}

public fun SeImpersonateClientEx(clientcontext: Long, serverthread: PETHREAD): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "SeImpersonateClientEx", longArrayOf(clientcontext, serverthread)).toInt()
}

public fun SeLocateProcessImageName(process: PEPROCESS, pimagefilename: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "SeLocateProcessImageName", longArrayOf(process, pimagefilename)).toInt()
}

public fun SeMarkLogonSessionForTerminationNotification(logonid: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "SeMarkLogonSessionForTerminationNotification", longArrayOf(logonid)).toInt()
}

public fun SeMarkLogonSessionForTerminationNotificationEx(logonid: Long, pserversilo: PESILO): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "SeMarkLogonSessionForTerminationNotificationEx", longArrayOf(logonid, pserversilo)).toInt()
}

public fun SeOpenObjectAuditAlarm(objecttypename: Long, obj: Long, absoluteobjectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, accessstate: Long, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, generateonclose: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeOpenObjectAuditAlarm", longArrayOf(objecttypename, obj, absoluteobjectname, securitydescriptor, accessstate, if (objectcreated) 1L else 0L, if (accessgranted) 1L else 0L, accessmode.toLong(), generateonclose))
}

public fun SeOpenObjectAuditAlarmWithTransaction(objecttypename: Long, obj: Long, absoluteobjectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, accessstate: Long, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, transactionid: Long, generateonclose: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeOpenObjectAuditAlarmWithTransaction", longArrayOf(objecttypename, obj, absoluteobjectname, securitydescriptor, accessstate, if (objectcreated) 1L else 0L, if (accessgranted) 1L else 0L, accessmode.toLong(), transactionid, generateonclose))
}

public fun SeOpenObjectForDeleteAuditAlarm(objecttypename: Long, obj: Long, absoluteobjectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, accessstate: Long, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, generateonclose: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeOpenObjectForDeleteAuditAlarm", longArrayOf(objecttypename, obj, absoluteobjectname, securitydescriptor, accessstate, if (objectcreated) 1L else 0L, if (accessgranted) 1L else 0L, accessmode.toLong(), generateonclose))
}

public fun SeOpenObjectForDeleteAuditAlarmWithTransaction(objecttypename: Long, obj: Long, absoluteobjectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, accessstate: Long, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, transactionid: Long, generateonclose: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeOpenObjectForDeleteAuditAlarmWithTransaction", longArrayOf(objecttypename, obj, absoluteobjectname, securitydescriptor, accessstate, if (objectcreated) 1L else 0L, if (accessgranted) 1L else 0L, accessmode.toLong(), transactionid, generateonclose))
}

public fun SePrivilegeCheck(requiredprivileges: Long, subjectsecuritycontext: Long, accessmode: Byte): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "SePrivilegeCheck", longArrayOf(requiredprivileges, subjectsecuritycontext, accessmode.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun SeQueryAuthenticationIdToken(token: Long, authenticationid: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "SeQueryAuthenticationIdToken", longArrayOf(token, authenticationid)).toInt()
}

public fun SeQueryInformationToken(token: Long, tokeninformationclass: TOKEN_INFORMATION_CLASS, tokeninformation: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "SeQueryInformationToken", longArrayOf(token, tokeninformationclass.toLong(), tokeninformation)).toInt()
}

public fun SeQuerySecurityDescriptorInfo(securityinformation: Long, securitydescriptor: PSECURITY_DESCRIPTOR, length: Long, objectssecuritydescriptor: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "SeQuerySecurityDescriptorInfo", longArrayOf(securityinformation, securitydescriptor, length, objectssecuritydescriptor)).toInt()
}

public fun SeQueryServerSiloToken(token: Long, pserversilo: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "SeQueryServerSiloToken", longArrayOf(token, pserversilo)).toInt()
}

public fun SeQuerySessionIdToken(token: Long, sessionid: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "SeQuerySessionIdToken", longArrayOf(token, sessionid)).toInt()
}

public fun SeQuerySessionIdTokenEx(token: Long, sessionid: Long, isservicesession: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "SeQuerySessionIdTokenEx", longArrayOf(token, sessionid, isservicesession)).toInt()
}

public fun SeRegisterLogonSessionTerminatedRoutine(callbackroutine: PSE_LOGON_SESSION_TERMINATED_ROUTINE): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "SeRegisterLogonSessionTerminatedRoutine", longArrayOf(Win32DynamicFfi.objectSlot(callbackroutine))).toInt()
}

public fun SeRegisterLogonSessionTerminatedRoutineEx(callbackroutine: PSE_LOGON_SESSION_TERMINATED_ROUTINE_EX, context: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "SeRegisterLogonSessionTerminatedRoutineEx", longArrayOf(Win32DynamicFfi.objectSlot(callbackroutine), context)).toInt()
}

public fun SeReportSecurityEventWithSubCategory(flags: UInt, sourcename: Long, usersid: PSID, auditparameters: Long, auditsubcategoryid: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "SeReportSecurityEventWithSubCategory", longArrayOf(flags.toLong(), sourcename, usersid, auditparameters, auditsubcategoryid.toLong())).toInt()
}

public fun SeSetAccessStateGenericMapping(accessstate: Long, genericmapping: Long) {
    Win32DynamicFfi.invoke("ntoskrnl.exe", "SeSetAccessStateGenericMapping", longArrayOf(accessstate, genericmapping))
}

public fun SeSetSecurityDescriptorInfo(obj: Long, securityinformation: Long, modificationdescriptor: PSECURITY_DESCRIPTOR, objectssecuritydescriptor: Long, pooltype: POOL_TYPE, genericmapping: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "SeSetSecurityDescriptorInfo", longArrayOf(obj, securityinformation, modificationdescriptor, objectssecuritydescriptor, pooltype.toLong(), genericmapping)).toInt()
}

public fun SeSetSecurityDescriptorInfoEx(obj: Long, securityinformation: Long, modificationdescriptor: PSECURITY_DESCRIPTOR, objectssecuritydescriptor: Long, autoinheritflags: UInt, pooltype: POOL_TYPE, genericmapping: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "SeSetSecurityDescriptorInfoEx", longArrayOf(obj, securityinformation, modificationdescriptor, objectssecuritydescriptor, autoinheritflags.toLong(), pooltype.toLong(), genericmapping)).toInt()
}

public fun SeShouldCheckForAccessRightsFromParent(objecttype: Long, childdescriptor: PSECURITY_DESCRIPTOR, accessstate: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "SeShouldCheckForAccessRightsFromParent", longArrayOf(objecttype, childdescriptor, accessstate))
    return (rawRet and 0xFFL) != 0L
}

public fun SeTokenFromAccessInformation(accessinformation: Long, token: Long, length: UInt, requiredlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "SeTokenFromAccessInformation", longArrayOf(accessinformation, token, length.toLong(), requiredlength)).toInt()
}

public fun SeTokenIsAdmin(token: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "SeTokenIsAdmin", longArrayOf(token))
    return (rawRet and 0xFFL) != 0L
}

public fun SeTokenIsRestricted(token: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "SeTokenIsRestricted", longArrayOf(token))
    return (rawRet and 0xFFL) != 0L
}

public fun SeTokenIsWriteRestricted(token: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ntoskrnl.exe", "SeTokenIsWriteRestricted", longArrayOf(token))
    return (rawRet and 0xFFL) != 0L
}

public fun SeTokenType(token: Long): TOKEN_TYPE {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "SeTokenType", longArrayOf(token)).toInt()
}

public fun SeUnregisterLogonSessionTerminatedRoutine(callbackroutine: PSE_LOGON_SESSION_TERMINATED_ROUTINE): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "SeUnregisterLogonSessionTerminatedRoutine", longArrayOf(Win32DynamicFfi.objectSlot(callbackroutine))).toInt()
}

public fun SeUnregisterLogonSessionTerminatedRoutineEx(callbackroutine: PSE_LOGON_SESSION_TERMINATED_ROUTINE_EX, context: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntoskrnl.exe", "SeUnregisterLogonSessionTerminatedRoutineEx", longArrayOf(Win32DynamicFfi.objectSlot(callbackroutine), context)).toInt()
}

public fun SecLookupAccountName(name: Long, sidsize: Long, sid: PSID, nameuse: Long, domainsize: Long, referenceddomain: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ksecdd.sys", "SecLookupAccountName", longArrayOf(name, sidsize, sid, nameuse, domainsize, referenceddomain)).toInt()
}

public fun SecLookupAccountSid(sid: PSID, namesize: Long, namebuffer: Long, domainsize: Long, domainbuffer: Long, nameuse: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ksecdd.sys", "SecLookupAccountSid", longArrayOf(sid, namesize, namebuffer, domainsize, domainbuffer, nameuse)).toInt()
}

public fun SecLookupWellKnownSid(sidtype: WELL_KNOWN_SID_TYPE, sid: PSID, sidbuffersize: UInt, sidsize: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ksecdd.sys", "SecLookupWellKnownSid", longArrayOf(sidtype.toLong(), sid, sidbuffersize.toLong(), sidsize)).toInt()
}

public fun SecMakeSPN(serviceclass: Long, servicename: Long, instancename: Long, instanceport: UShort, referrer: Long, spn: Long, length: Long, allocate: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ksecdd.sys", "SecMakeSPN", longArrayOf(serviceclass, servicename, instancename, instanceport.toLong(), referrer, spn, length, if (allocate) 1L else 0L)).toInt()
}

public fun SecMakeSPNEx(serviceclass: Long, servicename: Long, instancename: Long, instanceport: UShort, referrer: Long, targetinfo: Long, spn: Long, length: Long, allocate: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ksecdd.sys", "SecMakeSPNEx", longArrayOf(serviceclass, servicename, instancename, instanceport.toLong(), referrer, targetinfo, spn, length, if (allocate) 1L else 0L)).toInt()
}

public fun SecMakeSPNEx2(serviceclass: Long, servicename: Long, instancename: Long, instanceport: UShort, referrer: Long, intargetinfo: Long, spn: Long, totalsize: Long, allocate: Boolean, istargetinfomarshaled: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ksecdd.sys", "SecMakeSPNEx2", longArrayOf(serviceclass, servicename, instancename, instanceport.toLong(), referrer, intargetinfo, spn, totalsize, if (allocate) 1L else 0L, if (istargetinfomarshaled) 1L else 0L)).toInt()
}

public fun SetContextAttributesW(phcontext: Long, ulattribute: UInt, pbuffer: Long, cbbuffer: UInt): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "SetContextAttributesW", longArrayOf(phcontext, ulattribute.toLong(), pbuffer, cbbuffer.toLong())).toInt()
}

public fun SspiAcceptSecurityContextAsync(asynccontext: Long, phcredential: Long, phcontext: Long, pinput: Long, fcontextreq: UInt, targetdatarep: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT {
    return Win32DynamicFfi.invoke("ksecdd.sys", "SspiAcceptSecurityContextAsync", longArrayOf(asynccontext, phcredential, phcontext, pinput, fcontextreq.toLong(), targetdatarep.toLong(), phnewcontext, poutput, pfcontextattr, ptsexpiry)).toInt()
}

public fun SspiAcquireCredentialsHandleAsyncA(asynccontext: Long, pszprincipal: PCSTR, pszpackage: PCSTR, fcredentialuse: UInt, pvlogonid: Long, pauthdata: Long, pgetkeyfn: SEC_GET_KEY_FN, pvgetkeyargument: Long, phcredential: Long, ptsexpiry: Long): HRESULT {
    return Win32DynamicFfi.invoke("ksecdd.sys", "SspiAcquireCredentialsHandleAsyncA", longArrayOf(asynccontext, pszprincipal, pszpackage, fcredentialuse.toLong(), pvlogonid, pauthdata, Win32DynamicFfi.objectSlot(pgetkeyfn), pvgetkeyargument, phcredential, ptsexpiry)).toInt()
}

public fun SspiAcquireCredentialsHandleAsyncW(asynccontext: Long, pszprincipal: Long, pszpackage: Long, fcredentialuse: UInt, pvlogonid: Long, pauthdata: Long, pgetkeyfn: SEC_GET_KEY_FN, pvgetkeyargument: Long, phcredential: Long, ptsexpiry: Long): HRESULT {
    return Win32DynamicFfi.invoke("ksecdd.sys", "SspiAcquireCredentialsHandleAsyncW", longArrayOf(asynccontext, pszprincipal, pszpackage, fcredentialuse.toLong(), pvlogonid, pauthdata, Win32DynamicFfi.objectSlot(pgetkeyfn), pvgetkeyargument, phcredential, ptsexpiry)).toInt()
}

public fun SspiCreateAsyncContext(): Long {
    return Win32DynamicFfi.invoke("ksecdd.sys", "SspiCreateAsyncContext", longArrayOf())
}

public fun SspiDeleteSecurityContextAsync(asynccontext: Long, phcontext: Long): HRESULT {
    return Win32DynamicFfi.invoke("ksecdd.sys", "SspiDeleteSecurityContextAsync", longArrayOf(asynccontext, phcontext)).toInt()
}

public fun SspiFreeAsyncContext(handle: Long) {
    Win32DynamicFfi.invoke("ksecdd.sys", "SspiFreeAsyncContext", longArrayOf(handle))
}

public fun SspiFreeCredentialsHandleAsync(asynccontext: Long, phcredential: Long): HRESULT {
    return Win32DynamicFfi.invoke("ksecdd.sys", "SspiFreeCredentialsHandleAsync", longArrayOf(asynccontext, phcredential)).toInt()
}

public fun SspiGetAsyncCallStatus(handle: Long): HRESULT {
    return Win32DynamicFfi.invoke("ksecdd.sys", "SspiGetAsyncCallStatus", longArrayOf(handle)).toInt()
}

public fun SspiInitializeSecurityContextAsyncA(asynccontext: Long, phcredential: Long, phcontext: Long, psztargetname: PCSTR, fcontextreq: UInt, reserved1: UInt, targetdatarep: UInt, pinput: Long, reserved2: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT {
    return Win32DynamicFfi.invoke("ksecdd.sys", "SspiInitializeSecurityContextAsyncA", longArrayOf(asynccontext, phcredential, phcontext, psztargetname, fcontextreq.toLong(), reserved1.toLong(), targetdatarep.toLong(), pinput, reserved2.toLong(), phnewcontext, poutput, pfcontextattr, ptsexpiry)).toInt()
}

public fun SspiInitializeSecurityContextAsyncW(asynccontext: Long, phcredential: Long, phcontext: Long, psztargetname: Long, fcontextreq: UInt, reserved1: UInt, targetdatarep: UInt, pinput: Long, reserved2: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT {
    return Win32DynamicFfi.invoke("ksecdd.sys", "SspiInitializeSecurityContextAsyncW", longArrayOf(asynccontext, phcredential, phcontext, psztargetname, fcontextreq.toLong(), reserved1.toLong(), targetdatarep.toLong(), pinput, reserved2.toLong(), phnewcontext, poutput, pfcontextattr, ptsexpiry)).toInt()
}

public fun SspiReinitAsyncContext(handle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ksecdd.sys", "SspiReinitAsyncContext", longArrayOf(handle)).toInt()
}

public fun SspiSetAsyncNotifyCallback(context: Long, callback: SspiAsyncNotifyCallback, callbackdata: Long): HRESULT {
    return Win32DynamicFfi.invoke("ksecdd.sys", "SspiSetAsyncNotifyCallback", longArrayOf(context, Win32DynamicFfi.objectSlot(callback), callbackdata)).toInt()
}

public fun VerifySignature(phcontext: Long, pmessage: Long, messageseqno: UInt, pfqop: Long): HRESULT {
    return Win32DynamicFfi.invoke("secur32.dll", "VerifySignature", longArrayOf(phcontext, pmessage, messageseqno.toLong(), pfqop)).toInt()
}

public fun ZwAccessCheckAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, desiredaccess: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwAccessCheckAndAuditAlarm", longArrayOf(subsystemname, handleid, objecttypename, objectname, securitydescriptor, desiredaccess.toLong(), genericmapping, if (objectcreation) 1L else 0L, grantedaccess, accessstatus, generateonclose)).toInt()
}

public fun ZwAccessCheckByTypeAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwAccessCheckByTypeAndAuditAlarm", longArrayOf(subsystemname, handleid, objecttypename, objectname, securitydescriptor, principalselfsid, desiredaccess.toLong(), audittype.toLong(), flags.toLong(), objecttypelist, objecttypelistlength.toLong(), genericmapping, if (objectcreation) 1L else 0L, grantedaccess, accessstatus, generateonclose)).toInt()
}

public fun ZwAccessCheckByTypeResultListAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwAccessCheckByTypeResultListAndAuditAlarm", longArrayOf(subsystemname, handleid, objecttypename, objectname, securitydescriptor, principalselfsid, desiredaccess.toLong(), audittype.toLong(), flags.toLong(), objecttypelist, objecttypelistlength.toLong(), genericmapping, if (objectcreation) 1L else 0L, grantedaccess, accessstatus, generateonclose)).toInt()
}

public fun ZwAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname: Long, handleid: Long, clienttoken: HANDLE, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwAccessCheckByTypeResultListAndAuditAlarmByHandle", longArrayOf(subsystemname, handleid, clienttoken, objecttypename, objectname, securitydescriptor, principalselfsid, desiredaccess.toLong(), audittype.toLong(), flags.toLong(), objecttypelist, objecttypelistlength.toLong(), genericmapping, if (objectcreation) 1L else 0L, grantedaccess, accessstatus, generateonclose)).toInt()
}

public fun ZwAdjustGroupsToken(tokenhandle: HANDLE, resettodefault: Boolean, newstate: Long, bufferlength: UInt, previousstate: Long, returnlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwAdjustGroupsToken", longArrayOf(tokenhandle, if (resettodefault) 1L else 0L, newstate, bufferlength.toLong(), previousstate, returnlength)).toInt()
}

public fun ZwAdjustPrivilegesToken(tokenhandle: HANDLE, disableallprivileges: Boolean, newstate: Long, bufferlength: UInt, previousstate: Long, returnlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwAdjustPrivilegesToken", longArrayOf(tokenhandle, if (disableallprivileges) 1L else 0L, newstate, bufferlength.toLong(), previousstate, returnlength)).toInt()
}

public fun ZwAllocateVirtualMemory(processhandle: HANDLE, baseaddress: Long, zerobits: ULong, regionsize: Long, allocationtype: UInt, protect: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwAllocateVirtualMemory", longArrayOf(processhandle, baseaddress, zerobits.toLong(), regionsize, allocationtype.toLong(), protect.toLong())).toInt()
}

public fun ZwAllocateVirtualMemoryEx(processhandle: HANDLE, baseaddress: Long, regionsize: Long, allocationtype: UInt, pageprotection: UInt, extendedparameters: Long, extendedparametercount: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwAllocateVirtualMemoryEx", longArrayOf(processhandle, baseaddress, regionsize, allocationtype.toLong(), pageprotection.toLong(), extendedparameters, extendedparametercount.toLong())).toInt()
}

public fun ZwCancelIoFileEx(filehandle: HANDLE, iorequesttocancel: Long, iostatusblock: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwCancelIoFileEx", longArrayOf(filehandle, iorequesttocancel, iostatusblock)).toInt()
}

public fun ZwCloseObjectAuditAlarm(subsystemname: Long, handleid: Long, generateonclose: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwCloseObjectAuditAlarm", longArrayOf(subsystemname, handleid, if (generateonclose) 1L else 0L)).toInt()
}

public fun ZwCreateDirectoryObject(directoryhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwCreateDirectoryObject", longArrayOf(directoryhandle, desiredaccess.toLong(), objectattributes)).toInt()
}

public fun ZwCreateEvent(eventhandle: Long, desiredaccess: UInt, objectattributes: Long, eventtype: EVENT_TYPE, initialstate: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwCreateEvent", longArrayOf(eventhandle, desiredaccess.toLong(), objectattributes, eventtype.toLong(), if (initialstate) 1L else 0L)).toInt()
}

public fun ZwCreateSectionEx(sectionhandle: Long, desiredaccess: UInt, objectattributes: Long, maximumsize: Long, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: HANDLE, extendedparameters: Long, extendedparametercount: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwCreateSectionEx", longArrayOf(sectionhandle, desiredaccess.toLong(), objectattributes, maximumsize, sectionpageprotection.toLong(), allocationattributes.toLong(), filehandle, extendedparameters, extendedparametercount.toLong())).toInt()
}

public fun ZwDeleteFile(objectattributes: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwDeleteFile", longArrayOf(objectattributes)).toInt()
}

public fun ZwDeleteObjectAuditAlarm(subsystemname: Long, handleid: Long, generateonclose: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwDeleteObjectAuditAlarm", longArrayOf(subsystemname, handleid, if (generateonclose) 1L else 0L)).toInt()
}

public fun ZwDuplicateObject(sourceprocesshandle: HANDLE, sourcehandle: HANDLE, targetprocesshandle: HANDLE, targethandle: Long, desiredaccess: UInt, handleattributes: UInt, options: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwDuplicateObject", longArrayOf(sourceprocesshandle, sourcehandle, targetprocesshandle, targethandle, desiredaccess.toLong(), handleattributes.toLong(), options.toLong())).toInt()
}

public fun ZwDuplicateToken(existingtokenhandle: HANDLE, desiredaccess: UInt, objectattributes: Long, effectiveonly: Boolean, tokentype: TOKEN_TYPE, newtokenhandle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwDuplicateToken", longArrayOf(existingtokenhandle, desiredaccess.toLong(), objectattributes, if (effectiveonly) 1L else 0L, tokentype.toLong(), newtokenhandle)).toInt()
}

public fun ZwFilterToken(existingtokenhandle: HANDLE, flags: UInt, sidstodisable: Long, privilegestodelete: Long, restrictedsids: Long, newtokenhandle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwFilterToken", longArrayOf(existingtokenhandle, flags.toLong(), sidstodisable, privilegestodelete, restrictedsids, newtokenhandle)).toInt()
}

public fun ZwFlushBuffersFile(filehandle: HANDLE, iostatusblock: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwFlushBuffersFile", longArrayOf(filehandle, iostatusblock)).toInt()
}

public fun ZwFlushBuffersFileEx(filehandle: HANDLE, flags: UInt, parameters: Long, parameterssize: UInt, iostatusblock: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwFlushBuffersFileEx", longArrayOf(filehandle, flags.toLong(), parameters, parameterssize.toLong(), iostatusblock)).toInt()
}

public fun ZwFlushVirtualMemory(processhandle: HANDLE, baseaddress: Long, regionsize: Long, iostatus: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwFlushVirtualMemory", longArrayOf(processhandle, baseaddress, regionsize, iostatus)).toInt()
}

public fun ZwFreeVirtualMemory(processhandle: HANDLE, baseaddress: Long, regionsize: Long, freetype: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwFreeVirtualMemory", longArrayOf(processhandle, baseaddress, regionsize, freetype.toLong())).toInt()
}

public fun ZwFsControlFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, fscontrolcode: UInt, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwFsControlFile", longArrayOf(filehandle, event, Win32DynamicFfi.objectSlot(apcroutine), apccontext, iostatusblock, fscontrolcode.toLong(), inputbuffer, inputbufferlength.toLong(), outputbuffer, outputbufferlength.toLong())).toInt()
}

public fun ZwImpersonateAnonymousToken(threadhandle: HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwImpersonateAnonymousToken", longArrayOf(threadhandle)).toInt()
}

public fun ZwLockFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, byteoffset: Long, length: Long, key: UInt, failimmediately: Boolean, exclusivelock: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwLockFile", longArrayOf(filehandle, event, Win32DynamicFfi.objectSlot(apcroutine), apccontext, iostatusblock, byteoffset, length, key.toLong(), if (failimmediately) 1L else 0L, if (exclusivelock) 1L else 0L)).toInt()
}

public fun ZwNotifyChangeKey(keyhandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, completionfilter: UInt, watchtree: Boolean, buffer: Long, buffersize: UInt, asynchronous: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwNotifyChangeKey", longArrayOf(keyhandle, event, Win32DynamicFfi.objectSlot(apcroutine), apccontext, iostatusblock, completionfilter.toLong(), if (watchtree) 1L else 0L, buffer, buffersize.toLong(), if (asynchronous) 1L else 0L)).toInt()
}

public fun ZwOpenDirectoryObject(directoryhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwOpenDirectoryObject", longArrayOf(directoryhandle, desiredaccess.toLong(), objectattributes)).toInt()
}

public fun ZwOpenObjectAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, clienttoken: HANDLE, desiredaccess: UInt, grantedaccess: UInt, privileges: Long, objectcreation: Boolean, accessgranted: Boolean, generateonclose: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwOpenObjectAuditAlarm", longArrayOf(subsystemname, handleid, objecttypename, objectname, securitydescriptor, clienttoken, desiredaccess.toLong(), grantedaccess.toLong(), privileges, if (objectcreation) 1L else 0L, if (accessgranted) 1L else 0L, generateonclose)).toInt()
}

public fun ZwOpenProcessToken(processhandle: HANDLE, desiredaccess: UInt, tokenhandle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwOpenProcessToken", longArrayOf(processhandle, desiredaccess.toLong(), tokenhandle)).toInt()
}

public fun ZwOpenProcessTokenEx(processhandle: HANDLE, desiredaccess: UInt, handleattributes: UInt, tokenhandle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwOpenProcessTokenEx", longArrayOf(processhandle, desiredaccess.toLong(), handleattributes.toLong(), tokenhandle)).toInt()
}

public fun ZwOpenThreadToken(threadhandle: HANDLE, desiredaccess: UInt, openasself: Boolean, tokenhandle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwOpenThreadToken", longArrayOf(threadhandle, desiredaccess.toLong(), if (openasself) 1L else 0L, tokenhandle)).toInt()
}

public fun ZwOpenThreadTokenEx(threadhandle: HANDLE, desiredaccess: UInt, openasself: Boolean, handleattributes: UInt, tokenhandle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwOpenThreadTokenEx", longArrayOf(threadhandle, desiredaccess.toLong(), if (openasself) 1L else 0L, handleattributes.toLong(), tokenhandle)).toInt()
}

public fun ZwPrivilegeCheck(clienttoken: HANDLE, requiredprivileges: Long, result: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwPrivilegeCheck", longArrayOf(clienttoken, requiredprivileges, result)).toInt()
}

public fun ZwPrivilegeObjectAuditAlarm(subsystemname: Long, handleid: Long, clienttoken: HANDLE, desiredaccess: UInt, privileges: Long, accessgranted: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwPrivilegeObjectAuditAlarm", longArrayOf(subsystemname, handleid, clienttoken, desiredaccess.toLong(), privileges, if (accessgranted) 1L else 0L)).toInt()
}

public fun ZwPrivilegedServiceAuditAlarm(subsystemname: Long, servicename: Long, clienttoken: HANDLE, privileges: Long, accessgranted: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwPrivilegedServiceAuditAlarm", longArrayOf(subsystemname, servicename, clienttoken, privileges, if (accessgranted) 1L else 0L)).toInt()
}

public fun ZwQueryDirectoryFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, returnsingleentry: Boolean, filename: Long, restartscan: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwQueryDirectoryFile", longArrayOf(filehandle, event, Win32DynamicFfi.objectSlot(apcroutine), apccontext, iostatusblock, fileinformation, length.toLong(), fileinformationclass.toLong(), if (returnsingleentry) 1L else 0L, filename, if (restartscan) 1L else 0L)).toInt()
}

public fun ZwQueryDirectoryFileEx(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, queryflags: UInt, filename: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwQueryDirectoryFileEx", longArrayOf(filehandle, event, Win32DynamicFfi.objectSlot(apcroutine), apccontext, iostatusblock, fileinformation, length.toLong(), fileinformationclass.toLong(), queryflags.toLong(), filename)).toInt()
}

public fun ZwQueryDirectoryObject(directoryhandle: HANDLE, buffer: Long, length: UInt, returnsingleentry: Boolean, restartscan: Boolean, context: Long, returnlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwQueryDirectoryObject", longArrayOf(directoryhandle, buffer, length.toLong(), if (returnsingleentry) 1L else 0L, if (restartscan) 1L else 0L, context, returnlength)).toInt()
}

public fun ZwQueryEaFile(filehandle: HANDLE, iostatusblock: Long, buffer: Long, length: UInt, returnsingleentry: Boolean, ealist: Long, ealistlength: UInt, eaindex: Long, restartscan: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwQueryEaFile", longArrayOf(filehandle, iostatusblock, buffer, length.toLong(), if (returnsingleentry) 1L else 0L, ealist, ealistlength.toLong(), eaindex, if (restartscan) 1L else 0L)).toInt()
}

public fun ZwQueryFullAttributesFile(objectattributes: Long, fileinformation: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwQueryFullAttributesFile", longArrayOf(objectattributes, fileinformation)).toInt()
}

public fun ZwQueryInformationToken(tokenhandle: HANDLE, tokeninformationclass: TOKEN_INFORMATION_CLASS, tokeninformation: Long, tokeninformationlength: UInt, returnlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwQueryInformationToken", longArrayOf(tokenhandle, tokeninformationclass.toLong(), tokeninformation, tokeninformationlength.toLong(), returnlength)).toInt()
}

public fun ZwQueryObject(handle: HANDLE, objectinformationclass: OBJECT_INFORMATION_CLASS, objectinformation: Long, objectinformationlength: UInt, returnlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwQueryObject", longArrayOf(handle, objectinformationclass.toLong(), objectinformation, objectinformationlength.toLong(), returnlength)).toInt()
}

public fun ZwQueryQuotaInformationFile(filehandle: HANDLE, iostatusblock: Long, buffer: Long, length: UInt, returnsingleentry: Boolean, sidlist: Long, sidlistlength: UInt, startsid: PSID, restartscan: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwQueryQuotaInformationFile", longArrayOf(filehandle, iostatusblock, buffer, length.toLong(), if (returnsingleentry) 1L else 0L, sidlist, sidlistlength.toLong(), startsid, if (restartscan) 1L else 0L)).toInt()
}

public fun ZwQuerySecurityObject(handle: HANDLE, securityinformation: UInt, securitydescriptor: PSECURITY_DESCRIPTOR, length: UInt, lengthneeded: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwQuerySecurityObject", longArrayOf(handle, securityinformation.toLong(), securitydescriptor, length.toLong(), lengthneeded)).toInt()
}

public fun ZwQueryVirtualMemory(processhandle: HANDLE, baseaddress: Long, memoryinformationclass: MEMORY_INFORMATION_CLASS, memoryinformation: Long, memoryinformationlength: ULong, returnlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwQueryVirtualMemory", longArrayOf(processhandle, baseaddress, memoryinformationclass.toLong(), memoryinformation, memoryinformationlength.toLong(), returnlength)).toInt()
}

public fun ZwQueryVolumeInformationFile(filehandle: HANDLE, iostatusblock: Long, fsinformation: Long, length: UInt, fsinformationclass: FS_INFORMATION_CLASS): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwQueryVolumeInformationFile", longArrayOf(filehandle, iostatusblock, fsinformation, length.toLong(), fsinformationclass.toLong())).toInt()
}

public fun ZwSetEaFile(filehandle: HANDLE, iostatusblock: Long, buffer: Long, length: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwSetEaFile", longArrayOf(filehandle, iostatusblock, buffer, length.toLong())).toInt()
}

public fun ZwSetEvent(eventhandle: HANDLE, previousstate: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwSetEvent", longArrayOf(eventhandle, previousstate)).toInt()
}

public fun ZwSetInformationToken(tokenhandle: HANDLE, tokeninformationclass: TOKEN_INFORMATION_CLASS, tokeninformation: Long, tokeninformationlength: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwSetInformationToken", longArrayOf(tokenhandle, tokeninformationclass.toLong(), tokeninformation, tokeninformationlength.toLong())).toInt()
}

public fun ZwSetInformationVirtualMemory(processhandle: HANDLE, vminformationclass: VIRTUAL_MEMORY_INFORMATION_CLASS, numberofentries: ULong, virtualaddresses: Long, vminformation: Long, vminformationlength: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwSetInformationVirtualMemory", longArrayOf(processhandle, vminformationclass.toLong(), numberofentries.toLong(), virtualaddresses, vminformation, vminformationlength.toLong())).toInt()
}

public fun ZwSetQuotaInformationFile(filehandle: HANDLE, iostatusblock: Long, buffer: Long, length: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwSetQuotaInformationFile", longArrayOf(filehandle, iostatusblock, buffer, length.toLong())).toInt()
}

public fun ZwSetSecurityObject(handle: HANDLE, securityinformation: UInt, securitydescriptor: PSECURITY_DESCRIPTOR): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwSetSecurityObject", longArrayOf(handle, securityinformation.toLong(), securitydescriptor)).toInt()
}

public fun ZwSetVolumeInformationFile(filehandle: HANDLE, iostatusblock: Long, fsinformation: Long, length: UInt, fsinformationclass: FS_INFORMATION_CLASS): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwSetVolumeInformationFile", longArrayOf(filehandle, iostatusblock, fsinformation, length.toLong(), fsinformationclass.toLong())).toInt()
}

public fun ZwUnlockFile(filehandle: HANDLE, iostatusblock: Long, byteoffset: Long, length: Long, key: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwUnlockFile", longArrayOf(filehandle, iostatusblock, byteoffset, length, key.toLong())).toInt()
}
