package io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem

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

public expect fun RtlNtStatusToDosErrorNoTeb(status: NTSTATUS): UInt

public expect fun RtlOemStringToCountedUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS

public expect fun RtlOemStringToUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS

public expect fun RtlOemToUnicodeN(unicodestring: PWSTR, maxbytesinunicodestring: UInt, bytesinunicodestring: Long, oemstring: PCSTR, bytesinoemstring: UInt): NTSTATUS

public expect fun RtlPrefixString(string1: Long, string2: Long, caseinsensitive: Boolean): Boolean

public expect fun RtlQueryPackageIdentity(tokenobject: Long, packagefullname: PWSTR, packagesize: Long, appid: PWSTR, appidsize: Long, packaged: Long): NTSTATUS

public expect fun RtlQueryPackageIdentityEx(tokenobject: Long, packagefullname: PWSTR, packagesize: Long, appid: PWSTR, appidsize: Long, dynamicid: Long, flags: Long): NTSTATUS

public expect fun RtlQueryProcessPlaceholderCompatibilityMode(): Byte

public expect fun RtlQueryThreadPlaceholderCompatibilityMode(): Byte

public expect fun RtlRandom(seed: Long): UInt

public expect fun RtlRandomEx(seed: Long): UInt

public expect fun RtlRemoveUnicodePrefix(prefixtable: Long, prefixtableentry: Long)

public expect fun RtlReplaceSidInSd(securitydescriptor: PSECURITY_DESCRIPTOR, oldsid: PSID, newsid: PSID, numchanges: Long): NTSTATUS

public expect fun RtlReserveChunk(compressionformat: UShort, compressedbuffer: Long, endofcompressedbufferplus1: Long, chunkbuffer: Long, chunksize: UInt): NTSTATUS

public expect fun RtlSecondsSince1970ToTime(elapsedseconds: UInt, time: Long)

public expect fun RtlSecondsSince1980ToTime(elapsedseconds: UInt, time: Long)

public expect fun RtlSelfRelativeToAbsoluteSD(selfrelativesecuritydescriptor: PSECURITY_DESCRIPTOR, absolutesecuritydescriptor: PSECURITY_DESCRIPTOR, absolutesecuritydescriptorsize: Long, dacl: Long, daclsize: Long, sacl: Long, saclsize: Long, owner: PSID, ownersize: Long, primarygroup: PSID, primarygroupsize: Long): NTSTATUS

public expect fun RtlSetGroupSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR, group: PSID, groupdefaulted: Boolean): NTSTATUS

public expect fun RtlSetOwnerSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR, owner: PSID, ownerdefaulted: Boolean): NTSTATUS

public expect fun RtlSetProcessPlaceholderCompatibilityMode(mode: Byte): Byte

public expect fun RtlSetThreadPlaceholderCompatibilityMode(mode: Byte): Byte

public expect fun RtlSubAuthorityCountSid(sid: PSID): Long

public expect fun RtlSubAuthoritySid(sid: PSID, subauthority: UInt): Long

public expect fun RtlTimeToSecondsSince1980(time: Long, elapsedseconds: Long): Boolean

public expect fun RtlUnicodeStringToCountedOemString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS

public expect fun RtlUnicodeToCustomCPN(customcp: Long, customcpstring: PSTR, maxbytesincustomcpstring: UInt, bytesincustomcpstring: Long, unicodestring: PCWSTR, bytesinunicodestring: UInt): NTSTATUS

public expect fun RtlUnicodeToMultiByteN(multibytestring: PSTR, maxbytesinmultibytestring: UInt, bytesinmultibytestring: Long, unicodestring: Long, bytesinunicodestring: UInt): NTSTATUS

public expect fun RtlUnicodeToOemN(oemstring: PSTR, maxbytesinoemstring: UInt, bytesinoemstring: Long, unicodestring: Long, bytesinunicodestring: UInt): NTSTATUS

public expect fun RtlUpcaseUnicodeStringToCountedOemString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS

public expect fun RtlUpcaseUnicodeStringToOemString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS

public expect fun RtlUpcaseUnicodeToCustomCPN(customcp: Long, customcpstring: PSTR, maxbytesincustomcpstring: UInt, bytesincustomcpstring: Long, unicodestring: PCWSTR, bytesinunicodestring: UInt): NTSTATUS

public expect fun RtlUpcaseUnicodeToMultiByteN(multibytestring: PSTR, maxbytesinmultibytestring: UInt, bytesinmultibytestring: Long, unicodestring: Long, bytesinunicodestring: UInt): NTSTATUS

public expect fun RtlUpcaseUnicodeToOemN(oemstring: PSTR, maxbytesinoemstring: UInt, bytesinoemstring: Long, unicodestring: Long, bytesinunicodestring: UInt): NTSTATUS

public expect fun RtlValidSid(sid: PSID): Boolean

public expect fun RtlValidateUnicodeString(flags: UInt, string: Long): NTSTATUS

public expect fun RtlxOemStringToUnicodeSize(oemstring: Long): UInt

public expect fun RtlxUnicodeStringToOemSize(unicodestring: Long): UInt

public expect fun SeAccessCheckFromState(securitydescriptor: PSECURITY_DESCRIPTOR, primarytokeninformation: Long, clienttokeninformation: Long, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: Long, genericmapping: Long, accessmode: Byte, grantedaccess: Long, accessstatus: Long): Boolean

public expect fun SeAccessCheckFromStateEx(securitydescriptor: PSECURITY_DESCRIPTOR, primarytoken: Long, clienttoken: Long, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: Long, genericmapping: Long, accessmode: Byte, grantedaccess: Long, accessstatus: Long): Boolean

public expect fun SeAdjustAccessStateForAccessConstraints(objecttype: Long, securitydescriptor: PSECURITY_DESCRIPTOR, accessstate: Long)

public expect fun SeAdjustAccessStateForTrustLabel(objecttype: Long, securitydescriptor: PSECURITY_DESCRIPTOR, accessstate: Long)

public expect fun SeAdjustObjectSecurity(objectname: Long, originaldescriptor: PSECURITY_DESCRIPTOR, proposeddescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long, adjusteddescriptor: Long, applyadjusteddescriptor: Long): NTSTATUS

public expect fun SeAppendPrivileges(accessstate: Long, privileges: Long): NTSTATUS

public expect fun SeAuditFipsCryptoSelftests(bsuccess: Boolean, selftestcode: UInt)

public expect fun SeAuditHardLinkCreation(filename: Long, linkname: Long, bsuccess: Boolean)

public expect fun SeAuditHardLinkCreationWithTransaction(filename: Long, linkname: Long, bsuccess: Boolean, transactionid: Long)

public expect fun SeAuditTransactionStateChange(transactionid: Long, resourcemanagerid: Long, newtransactionstate: UInt)

public expect fun SeAuditingAnyFileEventsWithContext(securitydescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long): Boolean

public expect fun SeAuditingAnyFileEventsWithContextEx(securitydescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long, stagingenabled: Long): Boolean

public expect fun SeAuditingFileEvents(accessgranted: Boolean, securitydescriptor: PSECURITY_DESCRIPTOR): Boolean

public expect fun SeAuditingFileEventsWithContext(accessgranted: Boolean, securitydescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long): Boolean

public expect fun SeAuditingFileEventsWithContextEx(accessgranted: Boolean, securitydescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long, stagingenabled: Long): Boolean

public expect fun SeAuditingFileOrGlobalEvents(accessgranted: Boolean, securitydescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long): Boolean

public expect fun SeAuditingHardLinkEvents(accessgranted: Boolean, securitydescriptor: PSECURITY_DESCRIPTOR): Boolean

public expect fun SeAuditingHardLinkEventsWithContext(accessgranted: Boolean, securitydescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long): Boolean

public expect fun SeCaptureSubjectContextEx(thread: PETHREAD, process: PEPROCESS, subjectcontext: Long)

public expect fun SeCheckForCriticalAceRemoval(currentdescriptor: PSECURITY_DESCRIPTOR, newdescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long, aceremoved: Long)

public expect fun SeCreateClientSecurity(clientthread: PETHREAD, clientsecurityqos: Long, remotesession: Boolean, clientcontext: Long): NTSTATUS

public expect fun SeCreateClientSecurityFromSubjectContext(subjectcontext: Long, clientsecurityqos: Long, serverisremote: Boolean, clientcontext: Long): NTSTATUS

public expect fun SeDeleteClientSecurity(clientcontext: Long)

public expect fun SeDeleteObjectAuditAlarm(obj: Long, handle: HANDLE)

public expect fun SeDeleteObjectAuditAlarmWithTransaction(obj: Long, handle: HANDLE, transactionid: Long)

public expect fun SeExamineSacl(sacl: Long, resourcesacl: Long, token: Long, desiredaccess: UInt, accessgranted: Boolean, generateaudit: Long, generatealarm: Long)

public expect fun SeFilterToken(existingtoken: Long, flags: UInt, sidstodisable: Long, privilegestodelete: Long, restrictedsids: Long, filteredtoken: Long): NTSTATUS

public expect fun SeFreePrivileges(privileges: Long)

public expect fun SeImpersonateClient(clientcontext: Long, serverthread: PETHREAD)

public expect fun SeImpersonateClientEx(clientcontext: Long, serverthread: PETHREAD): NTSTATUS

public expect fun SeLocateProcessImageName(process: PEPROCESS, pimagefilename: Long): NTSTATUS

public expect fun SeMarkLogonSessionForTerminationNotification(logonid: Long): NTSTATUS

public expect fun SeMarkLogonSessionForTerminationNotificationEx(logonid: Long, pserversilo: PESILO): NTSTATUS

public expect fun SeOpenObjectAuditAlarm(objecttypename: Long, obj: Long, absoluteobjectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, accessstate: Long, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, generateonclose: Long)

public expect fun SeOpenObjectAuditAlarmWithTransaction(objecttypename: Long, obj: Long, absoluteobjectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, accessstate: Long, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, transactionid: Long, generateonclose: Long)

public expect fun SeOpenObjectForDeleteAuditAlarm(objecttypename: Long, obj: Long, absoluteobjectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, accessstate: Long, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, generateonclose: Long)

public expect fun SeOpenObjectForDeleteAuditAlarmWithTransaction(objecttypename: Long, obj: Long, absoluteobjectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, accessstate: Long, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, transactionid: Long, generateonclose: Long)

public expect fun SePrivilegeCheck(requiredprivileges: Long, subjectsecuritycontext: Long, accessmode: Byte): Boolean

public expect fun SeQueryAuthenticationIdToken(token: Long, authenticationid: Long): NTSTATUS

public expect fun SeQueryInformationToken(token: Long, tokeninformationclass: TOKEN_INFORMATION_CLASS, tokeninformation: Long): NTSTATUS

public expect fun SeQuerySecurityDescriptorInfo(securityinformation: Long, securitydescriptor: PSECURITY_DESCRIPTOR, length: Long, objectssecuritydescriptor: Long): NTSTATUS

public expect fun SeQueryServerSiloToken(token: Long, pserversilo: Long): NTSTATUS

public expect fun SeQuerySessionIdToken(token: Long, sessionid: Long): NTSTATUS

public expect fun SeQuerySessionIdTokenEx(token: Long, sessionid: Long, isservicesession: Long): NTSTATUS

public expect fun SeRegisterLogonSessionTerminatedRoutine(callbackroutine: PSE_LOGON_SESSION_TERMINATED_ROUTINE): NTSTATUS

public expect fun SeRegisterLogonSessionTerminatedRoutineEx(callbackroutine: PSE_LOGON_SESSION_TERMINATED_ROUTINE_EX, context: Long): NTSTATUS

public expect fun SeReportSecurityEventWithSubCategory(flags: UInt, sourcename: Long, usersid: PSID, auditparameters: Long, auditsubcategoryid: UInt): NTSTATUS

public expect fun SeSetAccessStateGenericMapping(accessstate: Long, genericmapping: Long)

public expect fun SeSetSecurityDescriptorInfo(obj: Long, securityinformation: Long, modificationdescriptor: PSECURITY_DESCRIPTOR, objectssecuritydescriptor: Long, pooltype: POOL_TYPE, genericmapping: Long): NTSTATUS

public expect fun SeSetSecurityDescriptorInfoEx(obj: Long, securityinformation: Long, modificationdescriptor: PSECURITY_DESCRIPTOR, objectssecuritydescriptor: Long, autoinheritflags: UInt, pooltype: POOL_TYPE, genericmapping: Long): NTSTATUS

public expect fun SeShouldCheckForAccessRightsFromParent(objecttype: Long, childdescriptor: PSECURITY_DESCRIPTOR, accessstate: Long): Boolean

public expect fun SeTokenFromAccessInformation(accessinformation: Long, token: Long, length: UInt, requiredlength: Long): NTSTATUS

public expect fun SeTokenIsAdmin(token: Long): Boolean

public expect fun SeTokenIsRestricted(token: Long): Boolean

public expect fun SeTokenIsWriteRestricted(token: Long): Boolean

public expect fun SeTokenType(token: Long): TOKEN_TYPE

public expect fun SeUnregisterLogonSessionTerminatedRoutine(callbackroutine: PSE_LOGON_SESSION_TERMINATED_ROUTINE): NTSTATUS

public expect fun SeUnregisterLogonSessionTerminatedRoutineEx(callbackroutine: PSE_LOGON_SESSION_TERMINATED_ROUTINE_EX, context: Long): NTSTATUS

public expect fun SecLookupAccountName(name: Long, sidsize: Long, sid: PSID, nameuse: Long, domainsize: Long, referenceddomain: Long): NTSTATUS

public expect fun SecLookupAccountSid(sid: PSID, namesize: Long, namebuffer: Long, domainsize: Long, domainbuffer: Long, nameuse: Long): NTSTATUS

public expect fun SecLookupWellKnownSid(sidtype: WELL_KNOWN_SID_TYPE, sid: PSID, sidbuffersize: UInt, sidsize: Long): NTSTATUS

public expect fun SecMakeSPN(serviceclass: Long, servicename: Long, instancename: Long, instanceport: UShort, referrer: Long, spn: Long, length: Long, allocate: Boolean): NTSTATUS

public expect fun SecMakeSPNEx(serviceclass: Long, servicename: Long, instancename: Long, instanceport: UShort, referrer: Long, targetinfo: Long, spn: Long, length: Long, allocate: Boolean): NTSTATUS

public expect fun SecMakeSPNEx2(serviceclass: Long, servicename: Long, instancename: Long, instanceport: UShort, referrer: Long, intargetinfo: Long, spn: Long, totalsize: Long, allocate: Boolean, istargetinfomarshaled: Boolean): NTSTATUS

public expect fun SetContextAttributesW(phcontext: Long, ulattribute: UInt, pbuffer: Long, cbbuffer: UInt): HRESULT

public expect fun SspiAcceptSecurityContextAsync(asynccontext: Long, phcredential: Long, phcontext: Long, pinput: Long, fcontextreq: UInt, targetdatarep: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT

public expect fun SspiAcquireCredentialsHandleAsyncA(asynccontext: Long, pszprincipal: PCSTR, pszpackage: PCSTR, fcredentialuse: UInt, pvlogonid: Long, pauthdata: Long, pgetkeyfn: SEC_GET_KEY_FN, pvgetkeyargument: Long, phcredential: Long, ptsexpiry: Long): HRESULT

public expect fun SspiAcquireCredentialsHandleAsyncW(asynccontext: Long, pszprincipal: Long, pszpackage: Long, fcredentialuse: UInt, pvlogonid: Long, pauthdata: Long, pgetkeyfn: SEC_GET_KEY_FN, pvgetkeyargument: Long, phcredential: Long, ptsexpiry: Long): HRESULT

public expect fun SspiCreateAsyncContext(): Long

public expect fun SspiDeleteSecurityContextAsync(asynccontext: Long, phcontext: Long): HRESULT

public expect fun SspiFreeAsyncContext(handle: Long)

public expect fun SspiFreeCredentialsHandleAsync(asynccontext: Long, phcredential: Long): HRESULT

public expect fun SspiGetAsyncCallStatus(handle: Long): HRESULT

public expect fun SspiInitializeSecurityContextAsyncA(asynccontext: Long, phcredential: Long, phcontext: Long, psztargetname: PCSTR, fcontextreq: UInt, reserved1: UInt, targetdatarep: UInt, pinput: Long, reserved2: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT

public expect fun SspiInitializeSecurityContextAsyncW(asynccontext: Long, phcredential: Long, phcontext: Long, psztargetname: Long, fcontextreq: UInt, reserved1: UInt, targetdatarep: UInt, pinput: Long, reserved2: UInt, phnewcontext: Long, poutput: Long, pfcontextattr: Long, ptsexpiry: Long): HRESULT

public expect fun SspiReinitAsyncContext(handle: Long): NTSTATUS

public expect fun SspiSetAsyncNotifyCallback(context: Long, callback: SspiAsyncNotifyCallback, callbackdata: Long): HRESULT

public expect fun VerifySignature(phcontext: Long, pmessage: Long, messageseqno: UInt, pfqop: Long): HRESULT

public expect fun ZwAccessCheckAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, desiredaccess: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): NTSTATUS

public expect fun ZwAccessCheckByTypeAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): NTSTATUS

public expect fun ZwAccessCheckByTypeResultListAndAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): NTSTATUS

public expect fun ZwAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname: Long, handleid: Long, clienttoken: HANDLE, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, principalselfsid: PSID, desiredaccess: UInt, audittype: AUDIT_EVENT_TYPE, flags: UInt, objecttypelist: Long, objecttypelistlength: UInt, genericmapping: Long, objectcreation: Boolean, grantedaccess: Long, accessstatus: Long, generateonclose: Long): NTSTATUS

public expect fun ZwAdjustGroupsToken(tokenhandle: HANDLE, resettodefault: Boolean, newstate: Long, bufferlength: UInt, previousstate: Long, returnlength: Long): NTSTATUS

public expect fun ZwAdjustPrivilegesToken(tokenhandle: HANDLE, disableallprivileges: Boolean, newstate: Long, bufferlength: UInt, previousstate: Long, returnlength: Long): NTSTATUS

public expect fun ZwAllocateVirtualMemory(processhandle: HANDLE, baseaddress: Long, zerobits: ULong, regionsize: Long, allocationtype: UInt, protect: UInt): NTSTATUS

public expect fun ZwAllocateVirtualMemoryEx(processhandle: HANDLE, baseaddress: Long, regionsize: Long, allocationtype: UInt, pageprotection: UInt, extendedparameters: Long, extendedparametercount: UInt): NTSTATUS

public expect fun ZwCancelIoFileEx(filehandle: HANDLE, iorequesttocancel: Long, iostatusblock: Long): NTSTATUS

public expect fun ZwCloseObjectAuditAlarm(subsystemname: Long, handleid: Long, generateonclose: Boolean): NTSTATUS

public expect fun ZwCreateDirectoryObject(directoryhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS

public expect fun ZwCreateEvent(eventhandle: Long, desiredaccess: UInt, objectattributes: Long, eventtype: EVENT_TYPE, initialstate: Boolean): NTSTATUS

public expect fun ZwCreateSectionEx(sectionhandle: Long, desiredaccess: UInt, objectattributes: Long, maximumsize: Long, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: HANDLE, extendedparameters: Long, extendedparametercount: UInt): NTSTATUS

public expect fun ZwDeleteFile(objectattributes: Long): NTSTATUS

public expect fun ZwDeleteObjectAuditAlarm(subsystemname: Long, handleid: Long, generateonclose: Boolean): NTSTATUS

public expect fun ZwDuplicateObject(sourceprocesshandle: HANDLE, sourcehandle: HANDLE, targetprocesshandle: HANDLE, targethandle: Long, desiredaccess: UInt, handleattributes: UInt, options: UInt): NTSTATUS

public expect fun ZwDuplicateToken(existingtokenhandle: HANDLE, desiredaccess: UInt, objectattributes: Long, effectiveonly: Boolean, tokentype: TOKEN_TYPE, newtokenhandle: Long): NTSTATUS

public expect fun ZwFilterToken(existingtokenhandle: HANDLE, flags: UInt, sidstodisable: Long, privilegestodelete: Long, restrictedsids: Long, newtokenhandle: Long): NTSTATUS

public expect fun ZwFlushBuffersFile(filehandle: HANDLE, iostatusblock: Long): NTSTATUS

public expect fun ZwFlushBuffersFileEx(filehandle: HANDLE, flags: UInt, parameters: Long, parameterssize: UInt, iostatusblock: Long): NTSTATUS

public expect fun ZwFlushVirtualMemory(processhandle: HANDLE, baseaddress: Long, regionsize: Long, iostatus: Long): NTSTATUS

public expect fun ZwFreeVirtualMemory(processhandle: HANDLE, baseaddress: Long, regionsize: Long, freetype: UInt): NTSTATUS

public expect fun ZwFsControlFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, fscontrolcode: UInt, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt): NTSTATUS

public expect fun ZwImpersonateAnonymousToken(threadhandle: HANDLE): NTSTATUS

public expect fun ZwLockFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, byteoffset: Long, length: Long, key: UInt, failimmediately: Boolean, exclusivelock: Boolean): NTSTATUS

public expect fun ZwNotifyChangeKey(keyhandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, completionfilter: UInt, watchtree: Boolean, buffer: Long, buffersize: UInt, asynchronous: Boolean): NTSTATUS

public expect fun ZwOpenDirectoryObject(directoryhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS

public expect fun ZwOpenObjectAuditAlarm(subsystemname: Long, handleid: Long, objecttypename: Long, objectname: Long, securitydescriptor: PSECURITY_DESCRIPTOR, clienttoken: HANDLE, desiredaccess: UInt, grantedaccess: UInt, privileges: Long, objectcreation: Boolean, accessgranted: Boolean, generateonclose: Long): NTSTATUS

public expect fun ZwOpenProcessToken(processhandle: HANDLE, desiredaccess: UInt, tokenhandle: Long): NTSTATUS

public expect fun ZwOpenProcessTokenEx(processhandle: HANDLE, desiredaccess: UInt, handleattributes: UInt, tokenhandle: Long): NTSTATUS

public expect fun ZwOpenThreadToken(threadhandle: HANDLE, desiredaccess: UInt, openasself: Boolean, tokenhandle: Long): NTSTATUS

public expect fun ZwOpenThreadTokenEx(threadhandle: HANDLE, desiredaccess: UInt, openasself: Boolean, handleattributes: UInt, tokenhandle: Long): NTSTATUS

public expect fun ZwPrivilegeCheck(clienttoken: HANDLE, requiredprivileges: Long, result: Long): NTSTATUS

public expect fun ZwPrivilegeObjectAuditAlarm(subsystemname: Long, handleid: Long, clienttoken: HANDLE, desiredaccess: UInt, privileges: Long, accessgranted: Boolean): NTSTATUS

public expect fun ZwPrivilegedServiceAuditAlarm(subsystemname: Long, servicename: Long, clienttoken: HANDLE, privileges: Long, accessgranted: Boolean): NTSTATUS

public expect fun ZwQueryDirectoryFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, returnsingleentry: Boolean, filename: Long, restartscan: Boolean): NTSTATUS

public expect fun ZwQueryDirectoryFileEx(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, queryflags: UInt, filename: Long): NTSTATUS

public expect fun ZwQueryDirectoryObject(directoryhandle: HANDLE, buffer: Long, length: UInt, returnsingleentry: Boolean, restartscan: Boolean, context: Long, returnlength: Long): NTSTATUS

public expect fun ZwQueryEaFile(filehandle: HANDLE, iostatusblock: Long, buffer: Long, length: UInt, returnsingleentry: Boolean, ealist: Long, ealistlength: UInt, eaindex: Long, restartscan: Boolean): NTSTATUS

public expect fun ZwQueryFullAttributesFile(objectattributes: Long, fileinformation: Long): NTSTATUS

public expect fun ZwQueryInformationToken(tokenhandle: HANDLE, tokeninformationclass: TOKEN_INFORMATION_CLASS, tokeninformation: Long, tokeninformationlength: UInt, returnlength: Long): NTSTATUS

public expect fun ZwQueryObject(handle: HANDLE, objectinformationclass: OBJECT_INFORMATION_CLASS, objectinformation: Long, objectinformationlength: UInt, returnlength: Long): NTSTATUS

public expect fun ZwQueryQuotaInformationFile(filehandle: HANDLE, iostatusblock: Long, buffer: Long, length: UInt, returnsingleentry: Boolean, sidlist: Long, sidlistlength: UInt, startsid: PSID, restartscan: Boolean): NTSTATUS

public expect fun ZwQuerySecurityObject(handle: HANDLE, securityinformation: UInt, securitydescriptor: PSECURITY_DESCRIPTOR, length: UInt, lengthneeded: Long): NTSTATUS

public expect fun ZwQueryVirtualMemory(processhandle: HANDLE, baseaddress: Long, memoryinformationclass: MEMORY_INFORMATION_CLASS, memoryinformation: Long, memoryinformationlength: ULong, returnlength: Long): NTSTATUS

public expect fun ZwQueryVolumeInformationFile(filehandle: HANDLE, iostatusblock: Long, fsinformation: Long, length: UInt, fsinformationclass: FS_INFORMATION_CLASS): NTSTATUS

public expect fun ZwSetEaFile(filehandle: HANDLE, iostatusblock: Long, buffer: Long, length: UInt): NTSTATUS

public expect fun ZwSetEvent(eventhandle: HANDLE, previousstate: Long): NTSTATUS

public expect fun ZwSetInformationToken(tokenhandle: HANDLE, tokeninformationclass: TOKEN_INFORMATION_CLASS, tokeninformation: Long, tokeninformationlength: UInt): NTSTATUS

public expect fun ZwSetInformationVirtualMemory(processhandle: HANDLE, vminformationclass: VIRTUAL_MEMORY_INFORMATION_CLASS, numberofentries: ULong, virtualaddresses: Long, vminformation: Long, vminformationlength: UInt): NTSTATUS

public expect fun ZwSetQuotaInformationFile(filehandle: HANDLE, iostatusblock: Long, buffer: Long, length: UInt): NTSTATUS

public expect fun ZwSetSecurityObject(handle: HANDLE, securityinformation: UInt, securitydescriptor: PSECURITY_DESCRIPTOR): NTSTATUS

public expect fun ZwSetVolumeInformationFile(filehandle: HANDLE, iostatusblock: Long, fsinformation: Long, length: UInt, fsinformationclass: FS_INFORMATION_CLASS): NTSTATUS

public expect fun ZwUnlockFile(filehandle: HANDLE, iostatusblock: Long, byteoffset: Long, length: Long, key: UInt): NTSTATUS
