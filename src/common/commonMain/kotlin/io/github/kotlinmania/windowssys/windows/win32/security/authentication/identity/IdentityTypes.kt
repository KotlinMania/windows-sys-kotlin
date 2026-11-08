package io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.LUID
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windowssys.windows.win32.security.PSID
import io.github.kotlinmania.windowssys.windows.win32.security.SECURITY_IMPERSONATION_LEVEL
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CRYPT_INTEGER_BLOB
import io.github.kotlinmania.windowssys.windows.win32.system.threading.LPTHREAD_START_ROUTINE

public fun interface ACCEPT_SECURITY_CONTEXT_FNFn {
    public operator fun invoke(param0: Long, param1: Long, param2: Long, param3: UInt, param4: UInt, param5: Long, param6: Long, param7: Long, param8: Long): HRESULT
}

public typealias ACCEPT_SECURITY_CONTEXT_FN = ACCEPT_SECURITY_CONTEXT_FNFn?

public fun interface ACQUIRE_CREDENTIALS_HANDLE_FN_AFn {
    public operator fun invoke(param0: Long, param1: Long, param2: UInt, param3: Long, param4: Long, param5: SEC_GET_KEY_FN, param6: Long, param7: Long, param8: Long): HRESULT
}

public typealias ACQUIRE_CREDENTIALS_HANDLE_FN_A = ACQUIRE_CREDENTIALS_HANDLE_FN_AFn?

public fun interface ACQUIRE_CREDENTIALS_HANDLE_FN_WFn {
    public operator fun invoke(param0: Long, param1: Long, param2: UInt, param3: Long, param4: Long, param5: SEC_GET_KEY_FN, param6: Long, param7: Long, param8: Long): HRESULT
}

public typealias ACQUIRE_CREDENTIALS_HANDLE_FN_W = ACQUIRE_CREDENTIALS_HANDLE_FN_WFn?

public fun interface ADD_CREDENTIALS_FN_AFn {
    public operator fun invoke(param0: Long, param1: Long, param2: Long, param3: UInt, param4: Long, param5: SEC_GET_KEY_FN, param6: Long, param7: Long): HRESULT
}

public typealias ADD_CREDENTIALS_FN_A = ADD_CREDENTIALS_FN_AFn?

public fun interface ADD_CREDENTIALS_FN_WFn {
    public operator fun invoke(param0: Long, param1: Long, param2: Long, param3: UInt, param4: Long, param5: SEC_GET_KEY_FN, param6: Long, param7: Long): HRESULT
}

public typealias ADD_CREDENTIALS_FN_W = ADD_CREDENTIALS_FN_WFn?

public fun interface APPLY_CONTROL_TOKEN_FNFn {
    public operator fun invoke(param0: Long, param1: Long): HRESULT
}

public typealias APPLY_CONTROL_TOKEN_FN = APPLY_CONTROL_TOKEN_FNFn?

public typealias ASC_REQ_FLAGS = UInt

public typealias ASC_REQ_HIGH_FLAGS = ULong

public fun interface CHANGE_PASSWORD_FN_AFn {
    public operator fun invoke(param0: Long, param1: Long, param2: Long, param3: Long, param4: Long, param5: Boolean, param6: UInt, param7: Long): HRESULT
}

public typealias CHANGE_PASSWORD_FN_A = CHANGE_PASSWORD_FN_AFn?

public fun interface CHANGE_PASSWORD_FN_WFn {
    public operator fun invoke(param0: Long, param1: Long, param2: Long, param3: Long, param4: Long, param5: Boolean, param6: UInt, param7: Long): HRESULT
}

public typealias CHANGE_PASSWORD_FN_W = CHANGE_PASSWORD_FN_WFn?

public fun interface COMPLETE_AUTH_TOKEN_FNFn {
    public operator fun invoke(param0: Long, param1: Long): HRESULT
}

public typealias COMPLETE_AUTH_TOKEN_FN = COMPLETE_AUTH_TOKEN_FNFn?

public typealias CRED_FETCH = Int

public fun interface CredFreeCredentialsFnFn {
    public operator fun invoke(count: UInt, credentials: Long)
}

public typealias CredFreeCredentialsFn = CredFreeCredentialsFnFn?

public fun interface CredReadDomainCredentialsFnFn {
    public operator fun invoke(logonid: Long, credflags: UInt, targetinfo: Long, flags: UInt, count: Long, credential: Long): NTSTATUS
}

public typealias CredReadDomainCredentialsFn = CredReadDomainCredentialsFnFn?

public fun interface CredReadFnFn {
    public operator fun invoke(logonid: Long, credflags: UInt, targetname: PCWSTR, type: UInt, flags: UInt, credential: Long): NTSTATUS
}

public typealias CredReadFn = CredReadFnFn?

public fun interface CredWriteFnFn {
    public operator fun invoke(logonid: Long, credflags: UInt, credential: Long, flags: UInt): NTSTATUS
}

public typealias CredWriteFn = CredWriteFnFn?

public fun interface CrediUnmarshalandDecodeStringFnFn {
    public operator fun invoke(marshaledstring: PCWSTR, blob: Long, blobsize: Long, isfailurefatal: Long): NTSTATUS
}

public typealias CrediUnmarshalandDecodeStringFn = CrediUnmarshalandDecodeStringFnFn?

public fun interface DECRYPT_MESSAGE_FNFn {
    public operator fun invoke(param0: Long, param1: Long, param2: UInt, param3: Long): HRESULT
}

public typealias DECRYPT_MESSAGE_FN = DECRYPT_MESSAGE_FNFn?

public fun interface DELETE_SECURITY_CONTEXT_FNFn {
    public operator fun invoke(param0: Long): HRESULT
}

public typealias DELETE_SECURITY_CONTEXT_FN = DELETE_SECURITY_CONTEXT_FNFn?

public typealias DOMAIN_PASSWORD_PROPERTIES = UInt

public fun interface ENCRYPT_MESSAGE_FNFn {
    public operator fun invoke(param0: Long, param1: UInt, param2: Long, param3: UInt): HRESULT
}

public typealias ENCRYPT_MESSAGE_FN = ENCRYPT_MESSAGE_FNFn?

public fun interface ENUMERATE_SECURITY_PACKAGES_FN_AFn {
    public operator fun invoke(param0: Long, param1: Long): HRESULT
}

public typealias ENUMERATE_SECURITY_PACKAGES_FN_A = ENUMERATE_SECURITY_PACKAGES_FN_AFn?

public fun interface ENUMERATE_SECURITY_PACKAGES_FN_WFn {
    public operator fun invoke(param0: Long, param1: Long): HRESULT
}

public typealias ENUMERATE_SECURITY_PACKAGES_FN_W = ENUMERATE_SECURITY_PACKAGES_FN_WFn?

public typealias EXPORT_SECURITY_CONTEXT_FLAGS = UInt

public fun interface EXPORT_SECURITY_CONTEXT_FNFn {
    public operator fun invoke(param0: Long, param1: UInt, param2: Long, param3: Long): HRESULT
}

public typealias EXPORT_SECURITY_CONTEXT_FN = EXPORT_SECURITY_CONTEXT_FNFn?

public typealias EXTENDED_NAME_FORMAT = Int

public fun interface FREE_CONTEXT_BUFFER_FNFn {
    public operator fun invoke(param0: Long): HRESULT
}

public typealias FREE_CONTEXT_BUFFER_FN = FREE_CONTEXT_BUFFER_FNFn?

public fun interface FREE_CREDENTIALS_HANDLE_FNFn {
    public operator fun invoke(param0: Long): HRESULT
}

public typealias FREE_CREDENTIALS_HANDLE_FN = FREE_CREDENTIALS_HANDLE_FNFn?

public fun interface IMPERSONATE_SECURITY_CONTEXT_FNFn {
    public operator fun invoke(param0: Long): HRESULT
}

public typealias IMPERSONATE_SECURITY_CONTEXT_FN = IMPERSONATE_SECURITY_CONTEXT_FNFn?

public fun interface IMPORT_SECURITY_CONTEXT_FN_AFn {
    public operator fun invoke(param0: Long, param1: Long, param2: Long, param3: Long): HRESULT
}

public typealias IMPORT_SECURITY_CONTEXT_FN_A = IMPORT_SECURITY_CONTEXT_FN_AFn?

public fun interface IMPORT_SECURITY_CONTEXT_FN_WFn {
    public operator fun invoke(param0: Long, param1: Long, param2: Long, param3: Long): HRESULT
}

public typealias IMPORT_SECURITY_CONTEXT_FN_W = IMPORT_SECURITY_CONTEXT_FN_WFn?

public fun interface INITIALIZE_SECURITY_CONTEXT_FN_AFn {
    public operator fun invoke(param0: Long, param1: Long, param2: Long, param3: UInt, param4: UInt, param5: UInt, param6: Long, param7: UInt, param8: Long, param9: Long, param10: Long, param11: Long): HRESULT
}

public typealias INITIALIZE_SECURITY_CONTEXT_FN_A = INITIALIZE_SECURITY_CONTEXT_FN_AFn?

public fun interface INITIALIZE_SECURITY_CONTEXT_FN_WFn {
    public operator fun invoke(param0: Long, param1: Long, param2: Long, param3: UInt, param4: UInt, param5: UInt, param6: Long, param7: UInt, param8: Long, param9: Long, param10: Long, param11: Long): HRESULT
}

public typealias INITIALIZE_SECURITY_CONTEXT_FN_W = INITIALIZE_SECURITY_CONTEXT_FN_WFn?

public fun interface INIT_SECURITY_INTERFACE_AFn {
    public operator fun invoke(): Long
}

public typealias INIT_SECURITY_INTERFACE_A = INIT_SECURITY_INTERFACE_AFn?

public fun interface INIT_SECURITY_INTERFACE_WFn {
    public operator fun invoke(): Long
}

public typealias INIT_SECURITY_INTERFACE_W = INIT_SECURITY_INTERFACE_WFn?

public typealias ISC_REQ_FLAGS = UInt

public typealias ISC_REQ_HIGH_FLAGS = ULong

public typealias KERB_ADDRESS_TYPE = UInt

public typealias KERB_CERTIFICATE_INFO_TYPE = Int

public typealias KERB_CRYPTO_KEY_TYPE = Int

public typealias KERB_LOGON_SUBMIT_TYPE = Int

public typealias KERB_PROFILE_BUFFER_TYPE = Int

public typealias KERB_PROTOCOL_MESSAGE_TYPE = Int

public typealias KERB_REQUEST_FLAGS = UInt

public typealias KERB_TICKET_FLAGS = UInt

public typealias KSEC_CONTEXT_TYPE = Int

public fun interface KspCompleteTokenFnFn {
    public operator fun invoke(contextid: ULong, token: Long): NTSTATUS
}

public typealias KspCompleteTokenFn = KspCompleteTokenFnFn?

public fun interface KspDeleteContextFnFn {
    public operator fun invoke(contextid: ULong, lsacontextid: Long): NTSTATUS
}

public typealias KspDeleteContextFn = KspDeleteContextFnFn?

public fun interface KspGetTokenFnFn {
    public operator fun invoke(contextid: ULong, impersonationtoken: Long, rawtoken: Long): NTSTATUS
}

public typealias KspGetTokenFn = KspGetTokenFnFn?

public fun interface KspInitContextFnFn {
    public operator fun invoke(contextid: ULong, contextdata: Long, newcontextid: Long): NTSTATUS
}

public typealias KspInitContextFn = KspInitContextFnFn?

public fun interface KspInitPackageFnFn {
    public operator fun invoke(functiontable: Long): NTSTATUS
}

public typealias KspInitPackageFn = KspInitPackageFnFn?

public fun interface KspMakeSignatureFnFn {
    public operator fun invoke(contextid: ULong, fqop: UInt, message: Long, messageseqno: UInt): NTSTATUS
}

public typealias KspMakeSignatureFn = KspMakeSignatureFnFn?

public fun interface KspMapHandleFnFn {
    public operator fun invoke(contextid: ULong, lsacontextid: Long): NTSTATUS
}

public typealias KspMapHandleFn = KspMapHandleFnFn?

public fun interface KspQueryAttributesFnFn {
    public operator fun invoke(contextid: ULong, attribute: UInt, buffer: Long): NTSTATUS
}

public typealias KspQueryAttributesFn = KspQueryAttributesFnFn?

public fun interface KspSealMessageFnFn {
    public operator fun invoke(contextid: ULong, fqop: UInt, message: Long, messageseqno: UInt): NTSTATUS
}

public typealias KspSealMessageFn = KspSealMessageFnFn?

public fun interface KspSerializeAuthDataFnFn {
    public operator fun invoke(pvauthdata: Long, size: Long, serializeddata: Long): NTSTATUS
}

public typealias KspSerializeAuthDataFn = KspSerializeAuthDataFnFn?

public fun interface KspSetPagingModeFnFn {
    public operator fun invoke(pagingmode: Boolean): NTSTATUS
}

public typealias KspSetPagingModeFn = KspSetPagingModeFnFn?

public fun interface KspUnsealMessageFnFn {
    public operator fun invoke(contextid: ULong, message: Long, messageseqno: UInt, pfqop: Long): NTSTATUS
}

public typealias KspUnsealMessageFn = KspUnsealMessageFnFn?

public fun interface KspVerifySignatureFnFn {
    public operator fun invoke(contextid: ULong, message: Long, messageseqno: UInt, pfqop: Long): NTSTATUS
}

public typealias KspVerifySignatureFn = KspVerifySignatureFnFn?

public fun interface LSA_AP_POST_LOGON_USERFn {
    public operator fun invoke(postlogonuserinfo: Long): NTSTATUS
}

public typealias LSA_AP_POST_LOGON_USER = LSA_AP_POST_LOGON_USERFn?

public typealias LSA_AUTH_INFORMATION_AUTH_TYPE = UInt

public typealias LSA_FOREST_TRUST_COLLISION_RECORD_TYPE = Int

public typealias LSA_FOREST_TRUST_RECORD_TYPE = Int

public typealias LSA_HANDLE = Long

public typealias LSA_LOOKUP_DOMAIN_INFO_CLASS = Int

public typealias LSA_TOKEN_INFORMATION_TYPE = Int

public fun interface MAKE_SIGNATURE_FNFn {
    public operator fun invoke(param0: Long, param1: UInt, param2: Long, param3: UInt): HRESULT
}

public typealias MAKE_SIGNATURE_FN = MAKE_SIGNATURE_FNFn?

public typealias MSV1_0 = UInt

public typealias MSV1_0_AVID = Int

public typealias MSV1_0_CREDENTIAL_KEY_TYPE = Int

public typealias MSV1_0_LOGON_SUBMIT_TYPE = Int

public typealias MSV1_0_PROFILE_BUFFER_TYPE = Int

public typealias MSV1_0_PROTOCOL_MESSAGE_TYPE = Int

public typealias MSV_SUBAUTH_LOGON_PARAMETER_CONTROL = UInt

public typealias MSV_SUB_AUTHENTICATION_FILTER = UInt

public typealias MSV_SUPPLEMENTAL_CREDENTIAL_FLAGS = UInt

public typealias NEGOTIATE_MESSAGES = Int

public typealias NETLOGON_LOGON_INFO_CLASS = Int

public fun interface PKSEC_CREATE_CONTEXT_LISTFn {
    public operator fun invoke(type: KSEC_CONTEXT_TYPE): Long
}

public typealias PKSEC_CREATE_CONTEXT_LIST = PKSEC_CREATE_CONTEXT_LISTFn?

public fun interface PKSEC_DEREFERENCE_LIST_ENTRYFn {
    public operator fun invoke(entry: Long, delete: Long)
}

public typealias PKSEC_DEREFERENCE_LIST_ENTRY = PKSEC_DEREFERENCE_LIST_ENTRYFn?

public fun interface PKSEC_INSERT_LIST_ENTRYFn {
    public operator fun invoke(list: Long, entry: Long)
}

public typealias PKSEC_INSERT_LIST_ENTRY = PKSEC_INSERT_LIST_ENTRYFn?

public fun interface PKSEC_LOCATE_PKG_BY_IDFn {
    public operator fun invoke(packageid: UInt): Long
}

public typealias PKSEC_LOCATE_PKG_BY_ID = PKSEC_LOCATE_PKG_BY_IDFn?

public fun interface PKSEC_REFERENCE_LIST_ENTRYFn {
    public operator fun invoke(entry: Long, signature: UInt, removenoref: Boolean): NTSTATUS
}

public typealias PKSEC_REFERENCE_LIST_ENTRY = PKSEC_REFERENCE_LIST_ENTRYFn?

public fun interface PKSEC_SERIALIZE_SCHANNEL_AUTH_DATAFn {
    public operator fun invoke(pvauthdata: Long, size: Long, serializeddata: Long): NTSTATUS
}

public typealias PKSEC_SERIALIZE_SCHANNEL_AUTH_DATA = PKSEC_SERIALIZE_SCHANNEL_AUTH_DATAFn?

public fun interface PKSEC_SERIALIZE_WINNT_AUTH_DATAFn {
    public operator fun invoke(pvauthdata: Long, size: Long, serializeddata: Long): NTSTATUS
}

public typealias PKSEC_SERIALIZE_WINNT_AUTH_DATA = PKSEC_SERIALIZE_WINNT_AUTH_DATAFn?

public typealias PKU2U_LOGON_SUBMIT_TYPE = Int

public fun interface PLSA_ADD_CREDENTIALFn {
    public operator fun invoke(logonid: Long, authenticationpackage: UInt, primarykeyvalue: Long, credentials: Long): NTSTATUS
}

public typealias PLSA_ADD_CREDENTIAL = PLSA_ADD_CREDENTIALFn?

public fun interface PLSA_ALLOCATE_CLIENT_BUFFERFn {
    public operator fun invoke(clientrequest: Long, lengthrequired: UInt, clientbaseaddress: Long): NTSTATUS
}

public typealias PLSA_ALLOCATE_CLIENT_BUFFER = PLSA_ALLOCATE_CLIENT_BUFFERFn?

public fun interface PLSA_ALLOCATE_LSA_HEAPFn {
    public operator fun invoke(length: UInt): Long
}

public typealias PLSA_ALLOCATE_LSA_HEAP = PLSA_ALLOCATE_LSA_HEAPFn?

public fun interface PLSA_ALLOCATE_PRIVATE_HEAPFn {
    public operator fun invoke(length: ULong): Long
}

public typealias PLSA_ALLOCATE_PRIVATE_HEAP = PLSA_ALLOCATE_PRIVATE_HEAPFn?

public fun interface PLSA_ALLOCATE_SHARED_MEMORYFn {
    public operator fun invoke(sharedmem: Long, size: UInt): Long
}

public typealias PLSA_ALLOCATE_SHARED_MEMORY = PLSA_ALLOCATE_SHARED_MEMORYFn?

public fun interface PLSA_AP_CALL_PACKAGEFn {
    public operator fun invoke(clientrequest: Long, protocolsubmitbuffer: Long, clientbufferbase: Long, submitbufferlength: UInt, protocolreturnbuffer: Long, returnbufferlength: Long, protocolstatus: Long): NTSTATUS
}

public typealias PLSA_AP_CALL_PACKAGE = PLSA_AP_CALL_PACKAGEFn?

public fun interface PLSA_AP_CALL_PACKAGE_PASSTHROUGHFn {
    public operator fun invoke(clientrequest: Long, protocolsubmitbuffer: Long, clientbufferbase: Long, submitbufferlength: UInt, protocolreturnbuffer: Long, returnbufferlength: Long, protocolstatus: Long): NTSTATUS
}

public typealias PLSA_AP_CALL_PACKAGE_PASSTHROUGH = PLSA_AP_CALL_PACKAGE_PASSTHROUGHFn?

public fun interface PLSA_AP_INITIALIZE_PACKAGEFn {
    public operator fun invoke(authenticationpackageid: UInt, lsadispatchtable: Long, database: Long, confidentiality: Long, authenticationpackagename: Long): NTSTATUS
}

public typealias PLSA_AP_INITIALIZE_PACKAGE = PLSA_AP_INITIALIZE_PACKAGEFn?

public fun interface PLSA_AP_LOGON_TERMINATEDFn {
    public operator fun invoke(logonid: Long)
}

public typealias PLSA_AP_LOGON_TERMINATED = PLSA_AP_LOGON_TERMINATEDFn?

public fun interface PLSA_AP_LOGON_USERFn {
    public operator fun invoke(clientrequest: Long, logontype: SECURITY_LOGON_TYPE, authenticationinformation: Long, clientauthenticationbase: Long, authenticationinformationlength: UInt, profilebuffer: Long, profilebufferlength: Long, logonid: Long, substatus: Long, tokeninformationtype: Long, tokeninformation: Long, accountname: Long, authenticatingauthority: Long): NTSTATUS
}

public typealias PLSA_AP_LOGON_USER = PLSA_AP_LOGON_USERFn?

public fun interface PLSA_AP_LOGON_USER_EXFn {
    public operator fun invoke(clientrequest: Long, logontype: SECURITY_LOGON_TYPE, authenticationinformation: Long, clientauthenticationbase: Long, authenticationinformationlength: UInt, profilebuffer: Long, profilebufferlength: Long, logonid: Long, substatus: Long, tokeninformationtype: Long, tokeninformation: Long, accountname: Long, authenticatingauthority: Long, machinename: Long): NTSTATUS
}

public typealias PLSA_AP_LOGON_USER_EX = PLSA_AP_LOGON_USER_EXFn?

public fun interface PLSA_AP_LOGON_USER_EX2Fn {
    public operator fun invoke(clientrequest: Long, logontype: SECURITY_LOGON_TYPE, protocolsubmitbuffer: Long, clientbufferbase: Long, submitbuffersize: UInt, profilebuffer: Long, profilebuffersize: Long, logonid: Long, substatus: Long, tokeninformationtype: Long, tokeninformation: Long, accountname: Long, authenticatingauthority: Long, machinename: Long, primarycredentials: Long, supplementalcredentials: Long): NTSTATUS
}

public typealias PLSA_AP_LOGON_USER_EX2 = PLSA_AP_LOGON_USER_EX2Fn?

public fun interface PLSA_AP_LOGON_USER_EX3Fn {
    public operator fun invoke(clientrequest: Long, logontype: SECURITY_LOGON_TYPE, protocolsubmitbuffer: Long, clientbufferbase: Long, submitbuffersize: UInt, surrogatelogon: Long, profilebuffer: Long, profilebuffersize: Long, logonid: Long, substatus: Long, tokeninformationtype: Long, tokeninformation: Long, accountname: Long, authenticatingauthority: Long, machinename: Long, primarycredentials: Long, supplementalcredentials: Long): NTSTATUS
}

public typealias PLSA_AP_LOGON_USER_EX3 = PLSA_AP_LOGON_USER_EX3Fn?

public fun interface PLSA_AP_POST_LOGON_USER_SURROGATEFn {
    public operator fun invoke(clientrequest: Long, logontype: SECURITY_LOGON_TYPE, protocolsubmitbuffer: Long, clientbufferbase: Long, submitbuffersize: UInt, surrogatelogon: Long, profilebuffer: Long, profilebuffersize: UInt, logonid: Long, status: NTSTATUS, substatus: NTSTATUS, tokeninformationtype: LSA_TOKEN_INFORMATION_TYPE, tokeninformation: Long, accountname: Long, authenticatingauthority: Long, machinename: Long, primarycredentials: Long, supplementalcredentials: Long): NTSTATUS
}

public typealias PLSA_AP_POST_LOGON_USER_SURROGATE = PLSA_AP_POST_LOGON_USER_SURROGATEFn?

public fun interface PLSA_AP_PRE_LOGON_USER_SURROGATEFn {
    public operator fun invoke(clientrequest: Long, logontype: SECURITY_LOGON_TYPE, protocolsubmitbuffer: Long, clientbufferbase: Long, submitbuffersize: UInt, surrogatelogon: Long, substatus: Long): NTSTATUS
}

public typealias PLSA_AP_PRE_LOGON_USER_SURROGATE = PLSA_AP_PRE_LOGON_USER_SURROGATEFn?

public fun interface PLSA_AUDIT_ACCOUNT_LOGONFn {
    public operator fun invoke(auditid: UInt, success: Boolean, source: Long, clientname: Long, mappedname: Long, status: NTSTATUS): NTSTATUS
}

public typealias PLSA_AUDIT_ACCOUNT_LOGON = PLSA_AUDIT_ACCOUNT_LOGONFn?

public fun interface PLSA_AUDIT_LOGONFn {
    public operator fun invoke(status: NTSTATUS, substatus: NTSTATUS, accountname: Long, authenticatingauthority: Long, workstationname: Long, usersid: PSID, logontype: SECURITY_LOGON_TYPE, tokensource: Long, logonid: Long)
}

public typealias PLSA_AUDIT_LOGON = PLSA_AUDIT_LOGONFn?

public fun interface PLSA_AUDIT_LOGON_EXFn {
    public operator fun invoke(status: NTSTATUS, substatus: NTSTATUS, accountname: Long, authenticatingauthority: Long, workstationname: Long, usersid: PSID, logontype: SECURITY_LOGON_TYPE, impersonationlevel: SECURITY_IMPERSONATION_LEVEL, tokensource: Long, logonid: Long)
}

public typealias PLSA_AUDIT_LOGON_EX = PLSA_AUDIT_LOGON_EXFn?

public fun interface PLSA_CALLBACK_FUNCTIONFn {
    public operator fun invoke(argument1: ULong, argument2: ULong, inputbuffer: Long, outputbuffer: Long): NTSTATUS
}

public typealias PLSA_CALLBACK_FUNCTION = PLSA_CALLBACK_FUNCTIONFn?

public fun interface PLSA_CALL_PACKAGEFn {
    public operator fun invoke(authenticationpackage: Long, protocolsubmitbuffer: Long, submitbufferlength: UInt, protocolreturnbuffer: Long, returnbufferlength: Long, protocolstatus: Long): NTSTATUS
}

public typealias PLSA_CALL_PACKAGE = PLSA_CALL_PACKAGEFn?

public fun interface PLSA_CALL_PACKAGEEXFn {
    public operator fun invoke(authenticationpackage: Long, clientbufferbase: Long, protocolsubmitbuffer: Long, submitbufferlength: UInt, protocolreturnbuffer: Long, returnbufferlength: Long, protocolstatus: Long): NTSTATUS
}

public typealias PLSA_CALL_PACKAGEEX = PLSA_CALL_PACKAGEEXFn?

public fun interface PLSA_CALL_PACKAGE_PASSTHROUGHFn {
    public operator fun invoke(authenticationpackage: Long, clientbufferbase: Long, protocolsubmitbuffer: Long, submitbufferlength: UInt, protocolreturnbuffer: Long, returnbufferlength: Long, protocolstatus: Long): NTSTATUS
}

public typealias PLSA_CALL_PACKAGE_PASSTHROUGH = PLSA_CALL_PACKAGE_PASSTHROUGHFn?

public fun interface PLSA_CANCEL_NOTIFICATIONFn {
    public operator fun invoke(notifyhandle: HANDLE): NTSTATUS
}

public typealias PLSA_CANCEL_NOTIFICATION = PLSA_CANCEL_NOTIFICATIONFn?

public fun interface PLSA_CHECK_PROTECTED_USER_BY_TOKENFn {
    public operator fun invoke(usertoken: HANDLE, protecteduser: Long): NTSTATUS
}

public typealias PLSA_CHECK_PROTECTED_USER_BY_TOKEN = PLSA_CHECK_PROTECTED_USER_BY_TOKENFn?

public fun interface PLSA_CLIENT_CALLBACKFn {
    public operator fun invoke(callback: PCSTR, argument1: ULong, argument2: ULong, input: Long, output: Long): NTSTATUS
}

public typealias PLSA_CLIENT_CALLBACK = PLSA_CLIENT_CALLBACKFn?

public fun interface PLSA_CLOSE_SAM_USERFn {
    public operator fun invoke(userhandle: Long): NTSTATUS
}

public typealias PLSA_CLOSE_SAM_USER = PLSA_CLOSE_SAM_USERFn?

public fun interface PLSA_CONVERT_AUTH_DATA_TO_TOKENFn {
    public operator fun invoke(userauthdata: Long, userauthdatasize: UInt, impersonationlevel: SECURITY_IMPERSONATION_LEVEL, tokensource: Long, logontype: SECURITY_LOGON_TYPE, authorityname: Long, token: Long, logonid: Long, accountname: Long, substatus: Long): NTSTATUS
}

public typealias PLSA_CONVERT_AUTH_DATA_TO_TOKEN = PLSA_CONVERT_AUTH_DATA_TO_TOKENFn?

public fun interface PLSA_COPY_FROM_CLIENT_BUFFERFn {
    public operator fun invoke(clientrequest: Long, length: UInt, buffertocopy: Long, clientbaseaddress: Long): NTSTATUS
}

public typealias PLSA_COPY_FROM_CLIENT_BUFFER = PLSA_COPY_FROM_CLIENT_BUFFERFn?

public fun interface PLSA_COPY_TO_CLIENT_BUFFERFn {
    public operator fun invoke(clientrequest: Long, length: UInt, clientbaseaddress: Long, buffertocopy: Long): NTSTATUS
}

public typealias PLSA_COPY_TO_CLIENT_BUFFER = PLSA_COPY_TO_CLIENT_BUFFERFn?

public fun interface PLSA_CRACK_SINGLE_NAMEFn {
    public operator fun invoke(formatoffered: UInt, performatgc: Boolean, nameinput: Long, prefix: Long, requestedformat: UInt, crackedname: Long, dnsdomainname: Long, substatus: Long): NTSTATUS
}

public typealias PLSA_CRACK_SINGLE_NAME = PLSA_CRACK_SINGLE_NAMEFn?

public fun interface PLSA_CREATE_LOGON_SESSIONFn {
    public operator fun invoke(logonid: Long): NTSTATUS
}

public typealias PLSA_CREATE_LOGON_SESSION = PLSA_CREATE_LOGON_SESSIONFn?

public fun interface PLSA_CREATE_SHARED_MEMORYFn {
    public operator fun invoke(maxsize: UInt, initialsize: UInt): Long
}

public typealias PLSA_CREATE_SHARED_MEMORY = PLSA_CREATE_SHARED_MEMORYFn?

public fun interface PLSA_CREATE_THREADFn {
    public operator fun invoke(securityattributes: Long, stacksize: UInt, startfunction: LPTHREAD_START_ROUTINE, threadparameter: Long, creationflags: UInt, threadid: Long): HANDLE
}

public typealias PLSA_CREATE_THREAD = PLSA_CREATE_THREADFn?

public fun interface PLSA_CREATE_TOKENFn {
    public operator fun invoke(logonid: Long, tokensource: Long, logontype: SECURITY_LOGON_TYPE, impersonationlevel: SECURITY_IMPERSONATION_LEVEL, tokeninformationtype: LSA_TOKEN_INFORMATION_TYPE, tokeninformation: Long, tokengroups: Long, accountname: Long, authorityname: Long, workstation: Long, profilepath: Long, token: Long, substatus: Long): NTSTATUS
}

public typealias PLSA_CREATE_TOKEN = PLSA_CREATE_TOKENFn?

public fun interface PLSA_CREATE_TOKEN_EXFn {
    public operator fun invoke(logonid: Long, tokensource: Long, logontype: SECURITY_LOGON_TYPE, impersonationlevel: SECURITY_IMPERSONATION_LEVEL, tokeninformationtype: LSA_TOKEN_INFORMATION_TYPE, tokeninformation: Long, tokengroups: Long, workstation: Long, profilepath: Long, sessioninformation: Long, sessioninformationtype: SECPKG_SESSIONINFO_TYPE, token: Long, substatus: Long): NTSTATUS
}

public typealias PLSA_CREATE_TOKEN_EX = PLSA_CREATE_TOKEN_EXFn?

public fun interface PLSA_DELETE_CREDENTIALFn {
    public operator fun invoke(logonid: Long, authenticationpackage: UInt, primarykeyvalue: Long): NTSTATUS
}

public typealias PLSA_DELETE_CREDENTIAL = PLSA_DELETE_CREDENTIALFn?

public fun interface PLSA_DELETE_LOGON_SESSIONFn {
    public operator fun invoke(logonid: Long): NTSTATUS
}

public typealias PLSA_DELETE_LOGON_SESSION = PLSA_DELETE_LOGON_SESSIONFn?

public fun interface PLSA_DELETE_SHARED_MEMORYFn {
    public operator fun invoke(sharedmem: Long): Boolean
}

public typealias PLSA_DELETE_SHARED_MEMORY = PLSA_DELETE_SHARED_MEMORYFn?

public fun interface PLSA_DUPLICATE_HANDLEFn {
    public operator fun invoke(sourcehandle: HANDLE, destionationhandle: Long): NTSTATUS
}

public typealias PLSA_DUPLICATE_HANDLE = PLSA_DUPLICATE_HANDLEFn?

public fun interface PLSA_EXPAND_AUTH_DATA_FOR_DOMAINFn {
    public operator fun invoke(userauthdata: Long, userauthdatasize: UInt, reserved: Long, expandedauthdata: Long, expandedauthdatasize: Long): NTSTATUS
}

public typealias PLSA_EXPAND_AUTH_DATA_FOR_DOMAIN = PLSA_EXPAND_AUTH_DATA_FOR_DOMAINFn?

public fun interface PLSA_FREE_CLIENT_BUFFERFn {
    public operator fun invoke(clientrequest: Long, clientbaseaddress: Long): NTSTATUS
}

public typealias PLSA_FREE_CLIENT_BUFFER = PLSA_FREE_CLIENT_BUFFERFn?

public fun interface PLSA_FREE_LSA_HEAPFn {
    public operator fun invoke(base: Long)
}

public typealias PLSA_FREE_LSA_HEAP = PLSA_FREE_LSA_HEAPFn?

public fun interface PLSA_FREE_PRIVATE_HEAPFn {
    public operator fun invoke(base: Long)
}

public typealias PLSA_FREE_PRIVATE_HEAP = PLSA_FREE_PRIVATE_HEAPFn?

public fun interface PLSA_FREE_SHARED_MEMORYFn {
    public operator fun invoke(sharedmem: Long, memory: Long)
}

public typealias PLSA_FREE_SHARED_MEMORY = PLSA_FREE_SHARED_MEMORYFn?

public fun interface PLSA_GET_APP_MODE_INFOFn {
    public operator fun invoke(userfunction: Long, argument1: Long, argument2: Long, userdata: Long, returntolsa: Long): NTSTATUS
}

public typealias PLSA_GET_APP_MODE_INFO = PLSA_GET_APP_MODE_INFOFn?

public fun interface PLSA_GET_AUTH_DATA_FOR_USERFn {
    public operator fun invoke(name: Long, nametype: SECPKG_NAME_TYPE, prefix: Long, userauthdata: Long, userauthdatasize: Long, userflatname: Long): NTSTATUS
}

public typealias PLSA_GET_AUTH_DATA_FOR_USER = PLSA_GET_AUTH_DATA_FOR_USERFn?

public fun interface PLSA_GET_CALL_INFOFn {
    public operator fun invoke(info: Long): Boolean
}

public typealias PLSA_GET_CALL_INFO = PLSA_GET_CALL_INFOFn?

public fun interface PLSA_GET_CLIENT_INFOFn {
    public operator fun invoke(clientinfo: Long): NTSTATUS
}

public typealias PLSA_GET_CLIENT_INFO = PLSA_GET_CLIENT_INFOFn?

public fun interface PLSA_GET_CLIENT_INFO_EXFn {
    public operator fun invoke(clientinfo: Long, structsize: UInt): NTSTATUS
}

public typealias PLSA_GET_CLIENT_INFO_EX = PLSA_GET_CLIENT_INFO_EXFn?

public fun interface PLSA_GET_CREDENTIALSFn {
    public operator fun invoke(logonid: Long, authenticationpackage: UInt, querycontext: Long, retrieveallcredentials: Boolean, primarykeyvalue: Long, primarykeylength: Long, credentials: Long): NTSTATUS
}

public typealias PLSA_GET_CREDENTIALS = PLSA_GET_CREDENTIALSFn?

public fun interface PLSA_GET_EXTENDED_CALL_FLAGSFn {
    public operator fun invoke(flags: Long): NTSTATUS
}

public typealias PLSA_GET_EXTENDED_CALL_FLAGS = PLSA_GET_EXTENDED_CALL_FLAGSFn?

public fun interface PLSA_GET_SERVICE_ACCOUNT_PASSWORDFn {
    public operator fun invoke(accountname: Long, domainname: Long, credfetch: CRED_FETCH, filetimeexpiry: Long, currentpassword: Long, previouspassword: Long, filetimecurrpwdvalidforoutbound: Long): NTSTATUS
}

public typealias PLSA_GET_SERVICE_ACCOUNT_PASSWORD = PLSA_GET_SERVICE_ACCOUNT_PASSWORDFn?

public fun interface PLSA_GET_USER_AUTH_DATAFn {
    public operator fun invoke(userhandle: Long, userauthdata: Long, userauthdatasize: Long): NTSTATUS
}

public typealias PLSA_GET_USER_AUTH_DATA = PLSA_GET_USER_AUTH_DATAFn?

public fun interface PLSA_GET_USER_CREDENTIALSFn {
    public operator fun invoke(userhandle: Long, primarycreds: Long, primarycredssize: Long, supplementalcreds: Long, supplementalcredssize: Long): NTSTATUS
}

public typealias PLSA_GET_USER_CREDENTIALS = PLSA_GET_USER_CREDENTIALSFn?

public fun interface PLSA_IMPERSONATE_CLIENTFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PLSA_IMPERSONATE_CLIENT = PLSA_IMPERSONATE_CLIENTFn?

public fun interface PLSA_LOCATE_PKG_BY_IDFn {
    public operator fun invoke(packgeid: UInt): Long
}

public typealias PLSA_LOCATE_PKG_BY_ID = PLSA_LOCATE_PKG_BY_IDFn?

public fun interface PLSA_MAP_BUFFERFn {
    public operator fun invoke(inputbuffer: Long, outputbuffer: Long): NTSTATUS
}

public typealias PLSA_MAP_BUFFER = PLSA_MAP_BUFFERFn?

public fun interface PLSA_OPEN_SAM_USERFn {
    public operator fun invoke(name: Long, nametype: SECPKG_NAME_TYPE, prefix: Long, allowguest: Boolean, reserved: UInt, userhandle: Long): NTSTATUS
}

public typealias PLSA_OPEN_SAM_USER = PLSA_OPEN_SAM_USERFn?

public fun interface PLSA_OPEN_TOKEN_BY_LOGON_IDFn {
    public operator fun invoke(logonid: Long, rettokenhandle: Long): NTSTATUS
}

public typealias PLSA_OPEN_TOKEN_BY_LOGON_ID = PLSA_OPEN_TOKEN_BY_LOGON_IDFn?

public fun interface PLSA_PROTECT_MEMORYFn {
    public operator fun invoke(buffer: Long, buffersize: UInt)
}

public typealias PLSA_PROTECT_MEMORY = PLSA_PROTECT_MEMORYFn?

public fun interface PLSA_QUERY_CLIENT_REQUESTFn {
    public operator fun invoke(clientrequest: Long, querytype: UInt, replybuffer: Long): NTSTATUS
}

public typealias PLSA_QUERY_CLIENT_REQUEST = PLSA_QUERY_CLIENT_REQUESTFn?

public fun interface PLSA_REDIRECTED_LOGON_CALLBACKFn {
    public operator fun invoke(redirectedlogonhandle: HANDLE, buffer: Long, bufferlength: UInt, returnbuffer: Long, returnbufferlength: Long): NTSTATUS
}

public typealias PLSA_REDIRECTED_LOGON_CALLBACK = PLSA_REDIRECTED_LOGON_CALLBACKFn?

public fun interface PLSA_REDIRECTED_LOGON_CLEANUP_CALLBACKFn {
    public operator fun invoke(redirectedlogonhandle: HANDLE)
}

public typealias PLSA_REDIRECTED_LOGON_CLEANUP_CALLBACK = PLSA_REDIRECTED_LOGON_CLEANUP_CALLBACKFn?

public fun interface PLSA_REDIRECTED_LOGON_GET_LOGON_CREDSFn {
    public operator fun invoke(redirectedlogonhandle: HANDLE, logonbuffer: Long, logonbufferlength: Long): NTSTATUS
}

public typealias PLSA_REDIRECTED_LOGON_GET_LOGON_CREDS = PLSA_REDIRECTED_LOGON_GET_LOGON_CREDSFn?

public fun interface PLSA_REDIRECTED_LOGON_GET_SIDFn {
    public operator fun invoke(redirectedlogonhandle: HANDLE, sid: Long): NTSTATUS
}

public typealias PLSA_REDIRECTED_LOGON_GET_SID = PLSA_REDIRECTED_LOGON_GET_SIDFn?

public fun interface PLSA_REDIRECTED_LOGON_GET_SUPP_CREDSFn {
    public operator fun invoke(redirectedlogonhandle: HANDLE, supplementalcredentials: Long): NTSTATUS
}

public typealias PLSA_REDIRECTED_LOGON_GET_SUPP_CREDS = PLSA_REDIRECTED_LOGON_GET_SUPP_CREDSFn?

public fun interface PLSA_REDIRECTED_LOGON_INITFn {
    public operator fun invoke(redirectedlogonhandle: HANDLE, packagename: Long, sessionid: UInt, logonid: Long): NTSTATUS
}

public typealias PLSA_REDIRECTED_LOGON_INIT = PLSA_REDIRECTED_LOGON_INITFn?

public fun interface PLSA_REGISTER_CALLBACKFn {
    public operator fun invoke(callbackid: UInt, callback: PLSA_CALLBACK_FUNCTION): NTSTATUS
}

public typealias PLSA_REGISTER_CALLBACK = PLSA_REGISTER_CALLBACKFn?

public fun interface PLSA_REGISTER_NOTIFICATIONFn {
    public operator fun invoke(startfunction: LPTHREAD_START_ROUTINE, parameter: Long, notificationtype: UInt, notificationclass: UInt, notificationflags: UInt, intervalminutes: UInt, waitevent: HANDLE): HANDLE
}

public typealias PLSA_REGISTER_NOTIFICATION = PLSA_REGISTER_NOTIFICATIONFn?

public fun interface PLSA_SAVE_SUPPLEMENTAL_CREDENTIALSFn {
    public operator fun invoke(logonid: Long, supplementalcredsize: UInt, supplementalcreds: Long, synchronous: Boolean): NTSTATUS
}

public typealias PLSA_SAVE_SUPPLEMENTAL_CREDENTIALS = PLSA_SAVE_SUPPLEMENTAL_CREDENTIALSFn?

public fun interface PLSA_SET_APP_MODE_INFOFn {
    public operator fun invoke(userfunction: UInt, argument1: ULong, argument2: ULong, userdata: Long, returntolsa: Boolean): NTSTATUS
}

public typealias PLSA_SET_APP_MODE_INFO = PLSA_SET_APP_MODE_INFOFn?

public fun interface PLSA_UNLOAD_PACKAGEFn {
    public operator fun invoke(): NTSTATUS
}

public typealias PLSA_UNLOAD_PACKAGE = PLSA_UNLOAD_PACKAGEFn?

public fun interface PLSA_UPDATE_PRIMARY_CREDENTIALSFn {
    public operator fun invoke(primarycredentials: Long, credentials: Long): NTSTATUS
}

public typealias PLSA_UPDATE_PRIMARY_CREDENTIALS = PLSA_UPDATE_PRIMARY_CREDENTIALSFn?

public typealias POLICY_AUDIT_EVENT_TYPE = Int

public typealias POLICY_DOMAIN_INFORMATION_CLASS = Int

public typealias POLICY_INFORMATION_CLASS = Int

public typealias POLICY_LSA_SERVER_ROLE = Int

public typealias POLICY_NOTIFICATION_INFORMATION_CLASS = Int

public fun interface PSAM_CREDENTIAL_UPDATE_FREE_ROUTINEFn {
    public operator fun invoke(p: Long)
}

public typealias PSAM_CREDENTIAL_UPDATE_FREE_ROUTINE = PSAM_CREDENTIAL_UPDATE_FREE_ROUTINEFn?

public fun interface PSAM_CREDENTIAL_UPDATE_NOTIFY_ROUTINEFn {
    public operator fun invoke(clearpassword: Long, oldcredentials: Long, oldcredentialsize: UInt, useraccountcontrol: UInt, upn: Long, username: Long, netbiosdomainname: Long, dnsdomainname: Long, newcredentials: Long, newcredentialsize: Long): NTSTATUS
}

public typealias PSAM_CREDENTIAL_UPDATE_NOTIFY_ROUTINE = PSAM_CREDENTIAL_UPDATE_NOTIFY_ROUTINEFn?

public fun interface PSAM_CREDENTIAL_UPDATE_REGISTER_MAPPED_ENTRYPOINTS_ROUTINEFn {
    public operator fun invoke(table: Long): NTSTATUS
}

public typealias PSAM_CREDENTIAL_UPDATE_REGISTER_MAPPED_ENTRYPOINTS_ROUTINE = PSAM_CREDENTIAL_UPDATE_REGISTER_MAPPED_ENTRYPOINTS_ROUTINEFn?

public fun interface PSAM_CREDENTIAL_UPDATE_REGISTER_ROUTINEFn {
    public operator fun invoke(credentialname: Long): Boolean
}

public typealias PSAM_CREDENTIAL_UPDATE_REGISTER_ROUTINE = PSAM_CREDENTIAL_UPDATE_REGISTER_ROUTINEFn?

public fun interface PSAM_INIT_NOTIFICATION_ROUTINEFn {
    public operator fun invoke(): Boolean
}

public typealias PSAM_INIT_NOTIFICATION_ROUTINE = PSAM_INIT_NOTIFICATION_ROUTINEFn?

public fun interface PSAM_PASSWORD_FILTER_ROUTINEFn {
    public operator fun invoke(accountname: Long, fullname: Long, password: Long, setoperation: Boolean): Boolean
}

public typealias PSAM_PASSWORD_FILTER_ROUTINE = PSAM_PASSWORD_FILTER_ROUTINEFn?

public fun interface PSAM_PASSWORD_NOTIFICATION_ROUTINEFn {
    public operator fun invoke(username: Long, relativeid: UInt, newpassword: Long): NTSTATUS
}

public typealias PSAM_PASSWORD_NOTIFICATION_ROUTINE = PSAM_PASSWORD_NOTIFICATION_ROUTINEFn?

public fun interface QUERY_CONTEXT_ATTRIBUTES_EX_FN_AFn {
    public operator fun invoke(param0: Long, param1: UInt, param2: Long, param3: UInt): HRESULT
}

public typealias QUERY_CONTEXT_ATTRIBUTES_EX_FN_A = QUERY_CONTEXT_ATTRIBUTES_EX_FN_AFn?

public fun interface QUERY_CONTEXT_ATTRIBUTES_EX_FN_WFn {
    public operator fun invoke(param0: Long, param1: UInt, param2: Long, param3: UInt): HRESULT
}

public typealias QUERY_CONTEXT_ATTRIBUTES_EX_FN_W = QUERY_CONTEXT_ATTRIBUTES_EX_FN_WFn?

public fun interface QUERY_CONTEXT_ATTRIBUTES_FN_AFn {
    public operator fun invoke(param0: Long, param1: UInt, param2: Long): HRESULT
}

public typealias QUERY_CONTEXT_ATTRIBUTES_FN_A = QUERY_CONTEXT_ATTRIBUTES_FN_AFn?

public fun interface QUERY_CONTEXT_ATTRIBUTES_FN_WFn {
    public operator fun invoke(param0: Long, param1: UInt, param2: Long): HRESULT
}

public typealias QUERY_CONTEXT_ATTRIBUTES_FN_W = QUERY_CONTEXT_ATTRIBUTES_FN_WFn?

public fun interface QUERY_CREDENTIALS_ATTRIBUTES_EX_FN_AFn {
    public operator fun invoke(param0: Long, param1: UInt, param2: Long, param3: UInt): HRESULT
}

public typealias QUERY_CREDENTIALS_ATTRIBUTES_EX_FN_A = QUERY_CREDENTIALS_ATTRIBUTES_EX_FN_AFn?

public fun interface QUERY_CREDENTIALS_ATTRIBUTES_EX_FN_WFn {
    public operator fun invoke(param0: Long, param1: UInt, param2: Long, param3: UInt): HRESULT
}

public typealias QUERY_CREDENTIALS_ATTRIBUTES_EX_FN_W = QUERY_CREDENTIALS_ATTRIBUTES_EX_FN_WFn?

public fun interface QUERY_CREDENTIALS_ATTRIBUTES_FN_AFn {
    public operator fun invoke(param0: Long, param1: UInt, param2: Long): HRESULT
}

public typealias QUERY_CREDENTIALS_ATTRIBUTES_FN_A = QUERY_CREDENTIALS_ATTRIBUTES_FN_AFn?

public fun interface QUERY_CREDENTIALS_ATTRIBUTES_FN_WFn {
    public operator fun invoke(param0: Long, param1: UInt, param2: Long): HRESULT
}

public typealias QUERY_CREDENTIALS_ATTRIBUTES_FN_W = QUERY_CREDENTIALS_ATTRIBUTES_FN_WFn?

public fun interface QUERY_SECURITY_CONTEXT_TOKEN_FNFn {
    public operator fun invoke(param0: Long, param1: Long): HRESULT
}

public typealias QUERY_SECURITY_CONTEXT_TOKEN_FN = QUERY_SECURITY_CONTEXT_TOKEN_FNFn?

public fun interface QUERY_SECURITY_PACKAGE_INFO_FN_AFn {
    public operator fun invoke(param0: Long, param1: Long): HRESULT
}

public typealias QUERY_SECURITY_PACKAGE_INFO_FN_A = QUERY_SECURITY_PACKAGE_INFO_FN_AFn?

public fun interface QUERY_SECURITY_PACKAGE_INFO_FN_WFn {
    public operator fun invoke(param0: Long, param1: Long): HRESULT
}

public typealias QUERY_SECURITY_PACKAGE_INFO_FN_W = QUERY_SECURITY_PACKAGE_INFO_FN_WFn?

public fun interface REVERT_SECURITY_CONTEXT_FNFn {
    public operator fun invoke(param0: Long): HRESULT
}

public typealias REVERT_SECURITY_CONTEXT_FN = REVERT_SECURITY_CONTEXT_FNFn?

public typealias SASL_AUTHZID_STATE = Int

public typealias SCHANNEL_ALERT_TOKEN_ALERT_TYPE = UInt

public typealias SCHANNEL_CRED_FLAGS = UInt

public typealias SCHANNEL_SESSION_TOKEN_FLAGS = UInt

public typealias SECPKG_ATTR = UInt

public typealias SECPKG_ATTR_LCT_STATUS = Int

public typealias SECPKG_CALL_PACKAGE_MESSAGE_TYPE = Int

public typealias SECPKG_CRED = UInt

public typealias SECPKG_CRED_CLASS = Int

public typealias SECPKG_EXTENDED_INFORMATION_CLASS = Int

public typealias SECPKG_NAME_TYPE = Int

public typealias SECPKG_PACKAGE_CHANGE_TYPE = UInt

public typealias SECPKG_SESSIONINFO_TYPE = Int

public typealias SECURITY_PACKAGE_OPTIONS_TYPE = UInt

public typealias SEC_APPLICATION_PROTOCOL_NEGOTIATION_EXT = Int

public typealias SEC_APPLICATION_PROTOCOL_NEGOTIATION_STATUS = Int

public fun interface SEC_GET_KEY_FNFn {
    public operator fun invoke(arg: Long, principal: Long, keyver: UInt, key: Long, status: Long)
}

public typealias SEC_GET_KEY_FN = SEC_GET_KEY_FNFn?

public typealias SEC_TRAFFIC_SECRET_TYPE = Int

public fun interface SET_CONTEXT_ATTRIBUTES_FN_AFn {
    public operator fun invoke(param0: Long, param1: UInt, param2: Long, param3: UInt): HRESULT
}

public typealias SET_CONTEXT_ATTRIBUTES_FN_A = SET_CONTEXT_ATTRIBUTES_FN_AFn?

public fun interface SET_CONTEXT_ATTRIBUTES_FN_WFn {
    public operator fun invoke(param0: Long, param1: UInt, param2: Long, param3: UInt): HRESULT
}

public typealias SET_CONTEXT_ATTRIBUTES_FN_W = SET_CONTEXT_ATTRIBUTES_FN_WFn?

public fun interface SET_CREDENTIALS_ATTRIBUTES_FN_AFn {
    public operator fun invoke(param0: Long, param1: UInt, param2: Long, param3: UInt): HRESULT
}

public typealias SET_CREDENTIALS_ATTRIBUTES_FN_A = SET_CREDENTIALS_ATTRIBUTES_FN_AFn?

public fun interface SET_CREDENTIALS_ATTRIBUTES_FN_WFn {
    public operator fun invoke(param0: Long, param1: UInt, param2: Long, param3: UInt): HRESULT
}

public typealias SET_CREDENTIALS_ATTRIBUTES_FN_W = SET_CREDENTIALS_ATTRIBUTES_FN_WFn?

public typealias SE_ADT_PARAMETER_TYPE = Int

public typealias SLDATATYPE = UInt

public typealias SLIDTYPE = Int

public typealias SLLICENSINGSTATUS = Int

public typealias SLREFERRALTYPE = Int

public typealias SL_ACTIVATION_TYPE = Int

public typealias SL_GENUINE_STATE = Int

public fun interface SSL_CRACK_CERTIFICATE_FNFn {
    public operator fun invoke(pbcertificate: Long, cbcertificate: UInt, verifysignature: BOOL, ppcertificate: Long): BOOL
}

public typealias SSL_CRACK_CERTIFICATE_FN = SSL_CRACK_CERTIFICATE_FNFn?

public fun interface SSL_EMPTY_CACHE_FN_AFn {
    public operator fun invoke(psztargetname: PCSTR, dwflags: UInt): BOOL
}

public typealias SSL_EMPTY_CACHE_FN_A = SSL_EMPTY_CACHE_FN_AFn?

public fun interface SSL_EMPTY_CACHE_FN_WFn {
    public operator fun invoke(psztargetname: PCWSTR, dwflags: UInt): BOOL
}

public typealias SSL_EMPTY_CACHE_FN_W = SSL_EMPTY_CACHE_FN_WFn?

public fun interface SSL_FREE_CERTIFICATE_FNFn {
    public operator fun invoke(pcertificate: Long)
}

public typealias SSL_FREE_CERTIFICATE_FN = SSL_FREE_CERTIFICATE_FNFn?

public typealias SchGetExtensionsOptions = Int

public typealias SecDelegationType = Int

public fun interface SpAcceptCredentialsFnFn {
    public operator fun invoke(logontype: SECURITY_LOGON_TYPE, accountname: Long, primarycredentials: Long, supplementalcredentials: Long): NTSTATUS
}

public typealias SpAcceptCredentialsFn = SpAcceptCredentialsFnFn?

public fun interface SpAcceptLsaModeContextFnFn {
    public operator fun invoke(credentialhandle: ULong, contexthandle: ULong, inputbuffer: Long, contextrequirements: UInt, targetdatarep: UInt, newcontexthandle: Long, outputbuffer: Long, contextattributes: Long, expirationtime: Long, mappedcontext: Long, contextdata: Long): NTSTATUS
}

public typealias SpAcceptLsaModeContextFn = SpAcceptLsaModeContextFnFn?

public fun interface SpAcquireCredentialsHandleFnFn {
    public operator fun invoke(principalname: Long, credentialuseflags: UInt, logonid: Long, authorizationdata: Long, getkeyfunciton: Long, getkeyargument: Long, credentialhandle: Long, expirationtime: Long): NTSTATUS
}

public typealias SpAcquireCredentialsHandleFn = SpAcquireCredentialsHandleFnFn?

public fun interface SpAddCredentialsFnFn {
    public operator fun invoke(credentialhandle: ULong, principalname: Long, pkg: Long, credentialuseflags: UInt, authorizationdata: Long, getkeyfunciton: Long, getkeyargument: Long, expirationtime: Long): NTSTATUS
}

public typealias SpAddCredentialsFn = SpAddCredentialsFnFn?

public fun interface SpApplyControlTokenFnFn {
    public operator fun invoke(contexthandle: ULong, controltoken: Long): NTSTATUS
}

public typealias SpApplyControlTokenFn = SpApplyControlTokenFnFn?

public fun interface SpChangeAccountPasswordFnFn {
    public operator fun invoke(pdomainname: Long, paccountname: Long, poldpassword: Long, pnewpassword: Long, impersonating: Boolean, poutput: Long): NTSTATUS
}

public typealias SpChangeAccountPasswordFn = SpChangeAccountPasswordFnFn?

public fun interface SpCompleteAuthTokenFnFn {
    public operator fun invoke(contexthandle: ULong, inputbuffer: Long): NTSTATUS
}

public typealias SpCompleteAuthTokenFn = SpCompleteAuthTokenFnFn?

public fun interface SpDeleteContextFnFn {
    public operator fun invoke(contexthandle: ULong): NTSTATUS
}

public typealias SpDeleteContextFn = SpDeleteContextFnFn?

public fun interface SpDeleteCredentialsFnFn {
    public operator fun invoke(credentialhandle: ULong, key: Long): NTSTATUS
}

public typealias SpDeleteCredentialsFn = SpDeleteCredentialsFnFn?

public fun interface SpExchangeMetaDataFnFn {
    public operator fun invoke(credentialhandle: ULong, targetname: Long, contextrequirements: UInt, metadatalength: UInt, metadata: Long, contexthandle: Long): NTSTATUS
}

public typealias SpExchangeMetaDataFn = SpExchangeMetaDataFnFn?

public fun interface SpExportSecurityContextFnFn {
    public operator fun invoke(phcontext: ULong, fflags: UInt, ppackedcontext: Long, ptoken: Long): NTSTATUS
}

public typealias SpExportSecurityContextFn = SpExportSecurityContextFnFn?

public fun interface SpExtractTargetInfoFnFn {
    public operator fun invoke(clientrequest: Long, protocolsubmitbuffer: Long, clientbufferbase: Long, submitbufferlength: UInt, ppvtargetinfo: Long, pcbtargetinfo: Long): NTSTATUS
}

public typealias SpExtractTargetInfoFn = SpExtractTargetInfoFnFn?

public fun interface SpFormatCredentialsFnFn {
    public operator fun invoke(credentials: Long, formattedcredentials: Long): NTSTATUS
}

public typealias SpFormatCredentialsFn = SpFormatCredentialsFnFn?

public fun interface SpFreeCredentialsHandleFnFn {
    public operator fun invoke(credentialhandle: ULong): NTSTATUS
}

public typealias SpFreeCredentialsHandleFn = SpFreeCredentialsHandleFnFn?

public fun interface SpGetContextTokenFnFn {
    public operator fun invoke(contexthandle: ULong, impersonationtoken: Long): NTSTATUS
}

public typealias SpGetContextTokenFn = SpGetContextTokenFnFn?

public fun interface SpGetCredUIContextFnFn {
    public operator fun invoke(contexthandle: ULong, credtype: Long, flatcreduicontextlength: Long, flatcreduicontext: Long): NTSTATUS
}

public typealias SpGetCredUIContextFn = SpGetCredUIContextFnFn?

public fun interface SpGetCredentialsFnFn {
    public operator fun invoke(credentialhandle: ULong, credentials: Long): NTSTATUS
}

public typealias SpGetCredentialsFn = SpGetCredentialsFnFn?

public fun interface SpGetExtendedInformationFnFn {
    public operator fun invoke(cls: SECPKG_EXTENDED_INFORMATION_CLASS, ppinformation: Long): NTSTATUS
}

public typealias SpGetExtendedInformationFn = SpGetExtendedInformationFnFn?

public fun interface SpGetInfoFnFn {
    public operator fun invoke(packageinfo: Long): NTSTATUS
}

public typealias SpGetInfoFn = SpGetInfoFnFn?

public fun interface SpGetRemoteCredGuardLogonBufferFnFn {
    public operator fun invoke(credhandle: ULong, contexthandle: ULong, targetname: Long, redirectedlogonhandle: Long, callback: Long, cleanupcallback: Long, logonbuffersize: Long, logonbuffer: Long): NTSTATUS
}

public typealias SpGetRemoteCredGuardLogonBufferFn = SpGetRemoteCredGuardLogonBufferFnFn?

public fun interface SpGetRemoteCredGuardSupplementalCredsFnFn {
    public operator fun invoke(credhandle: ULong, targetname: Long, redirectedlogonhandle: Long, callback: Long, cleanupcallback: Long, supplementalcredssize: Long, supplementalcreds: Long): NTSTATUS
}

public typealias SpGetRemoteCredGuardSupplementalCredsFn = SpGetRemoteCredGuardSupplementalCredsFnFn?

public fun interface SpGetTbalSupplementalCredsFnFn {
    public operator fun invoke(logonid: LUID, supplementalcredssize: Long, supplementalcreds: Long): NTSTATUS
}

public typealias SpGetTbalSupplementalCredsFn = SpGetTbalSupplementalCredsFnFn?

public fun interface SpGetUserInfoFnFn {
    public operator fun invoke(logonid: Long, flags: UInt, userdata: Long): NTSTATUS
}

public typealias SpGetUserInfoFn = SpGetUserInfoFnFn?

public fun interface SpImportSecurityContextFnFn {
    public operator fun invoke(ppackedcontext: Long, token: HANDLE, phcontext: Long): NTSTATUS
}

public typealias SpImportSecurityContextFn = SpImportSecurityContextFnFn?

public fun interface SpInitLsaModeContextFnFn {
    public operator fun invoke(credentialhandle: ULong, contexthandle: ULong, targetname: Long, contextrequirements: UInt, targetdatarep: UInt, inputbuffers: Long, newcontexthandle: Long, outputbuffers: Long, contextattributes: Long, expirationtime: Long, mappedcontext: Long, contextdata: Long): NTSTATUS
}

public typealias SpInitLsaModeContextFn = SpInitLsaModeContextFnFn?

public fun interface SpInitUserModeContextFnFn {
    public operator fun invoke(contexthandle: ULong, packedcontext: Long): NTSTATUS
}

public typealias SpInitUserModeContextFn = SpInitUserModeContextFnFn?

public fun interface SpInitializeFnFn {
    public operator fun invoke(packageid: ULong, parameters: Long, functiontable: Long): NTSTATUS
}

public typealias SpInitializeFn = SpInitializeFnFn?

public fun interface SpInstanceInitFnFn {
    public operator fun invoke(version: UInt, functiontable: Long, userfunctions: Long): NTSTATUS
}

public typealias SpInstanceInitFn = SpInstanceInitFnFn?

public fun interface SpLsaModeInitializeFnFn {
    public operator fun invoke(lsaversion: UInt, packageversion: Long, pptables: Long, pctables: Long): NTSTATUS
}

public typealias SpLsaModeInitializeFn = SpLsaModeInitializeFnFn?

public fun interface SpMakeSignatureFnFn {
    public operator fun invoke(contexthandle: ULong, qualityofprotection: UInt, messagebuffers: Long, messagesequencenumber: UInt): NTSTATUS
}

public typealias SpMakeSignatureFn = SpMakeSignatureFnFn?

public fun interface SpMarshalAttributeDataFnFn {
    public operator fun invoke(attributeinfo: UInt, attribute: UInt, attributedatasize: UInt, attributedata: Long, marshaledattributedatasize: Long, marshaledattributedata: Long): NTSTATUS
}

public typealias SpMarshalAttributeDataFn = SpMarshalAttributeDataFnFn?

public fun interface SpMarshallSupplementalCredsFnFn {
    public operator fun invoke(credentialsize: UInt, credentials: Long, marshalledcredsize: Long, marshalledcreds: Long): NTSTATUS
}

public typealias SpMarshallSupplementalCredsFn = SpMarshallSupplementalCredsFnFn?

public fun interface SpQueryContextAttributesFnFn {
    public operator fun invoke(contexthandle: ULong, contextattribute: UInt, buffer: Long): NTSTATUS
}

public typealias SpQueryContextAttributesFn = SpQueryContextAttributesFnFn?

public fun interface SpQueryCredentialsAttributesFnFn {
    public operator fun invoke(credentialhandle: ULong, credentialattribute: UInt, buffer: Long): NTSTATUS
}

public typealias SpQueryCredentialsAttributesFn = SpQueryCredentialsAttributesFnFn?

public fun interface SpQueryMetaDataFnFn {
    public operator fun invoke(credentialhandle: ULong, targetname: Long, contextrequirements: UInt, metadatalength: Long, metadata: Long, contexthandle: Long): NTSTATUS
}

public typealias SpQueryMetaDataFn = SpQueryMetaDataFnFn?

public fun interface SpSaveCredentialsFnFn {
    public operator fun invoke(credentialhandle: ULong, credentials: Long): NTSTATUS
}

public typealias SpSaveCredentialsFn = SpSaveCredentialsFnFn?

public fun interface SpSealMessageFnFn {
    public operator fun invoke(contexthandle: ULong, qualityofprotection: UInt, messagebuffers: Long, messagesequencenumber: UInt): NTSTATUS
}

public typealias SpSealMessageFn = SpSealMessageFnFn?

public fun interface SpSetContextAttributesFnFn {
    public operator fun invoke(contexthandle: ULong, contextattribute: UInt, buffer: Long, buffersize: UInt): NTSTATUS
}

public typealias SpSetContextAttributesFn = SpSetContextAttributesFnFn?

public fun interface SpSetCredentialsAttributesFnFn {
    public operator fun invoke(credentialhandle: ULong, credentialattribute: UInt, buffer: Long, buffersize: UInt): NTSTATUS
}

public typealias SpSetCredentialsAttributesFn = SpSetCredentialsAttributesFnFn?

public fun interface SpSetExtendedInformationFnFn {
    public operator fun invoke(cls: SECPKG_EXTENDED_INFORMATION_CLASS, info: Long): NTSTATUS
}

public typealias SpSetExtendedInformationFn = SpSetExtendedInformationFnFn?

public fun interface SpShutdownFnFn {
    public operator fun invoke(): NTSTATUS
}

public typealias SpShutdownFn = SpShutdownFnFn?

public fun interface SpUnsealMessageFnFn {
    public operator fun invoke(contexthandle: ULong, messagebuffers: Long, messagesequencenumber: UInt, qualityofprotection: Long): NTSTATUS
}

public typealias SpUnsealMessageFn = SpUnsealMessageFnFn?

public fun interface SpUpdateCredentialsFnFn {
    public operator fun invoke(contexthandle: ULong, credtype: Long, flatcreduicontextlength: UInt, flatcreduicontext: Long): NTSTATUS
}

public typealias SpUpdateCredentialsFn = SpUpdateCredentialsFnFn?

public fun interface SpUserModeInitializeFnFn {
    public operator fun invoke(lsaversion: UInt, packageversion: Long, pptables: Long, pctables: Long): NTSTATUS
}

public typealias SpUserModeInitializeFn = SpUserModeInitializeFnFn?

public fun interface SpValidateTargetInfoFnFn {
    public operator fun invoke(clientrequest: Long, protocolsubmitbuffer: Long, clientbufferbase: Long, submitbufferlength: UInt, targetinfo: Long): NTSTATUS
}

public typealias SpValidateTargetInfoFn = SpValidateTargetInfoFnFn?

public fun interface SpVerifySignatureFnFn {
    public operator fun invoke(contexthandle: ULong, messagebuffers: Long, messagesequencenumber: UInt, qualityofprotection: Long): NTSTATUS
}

public typealias SpVerifySignatureFn = SpVerifySignatureFnFn?

public fun interface SslDeserializeCertificateStoreFnFn {
    public operator fun invoke(serializedcertificatestore: CRYPT_INTEGER_BLOB, ppcertcontext: Long): HRESULT
}

public typealias SslDeserializeCertificateStoreFn = SslDeserializeCertificateStoreFnFn?

public fun interface SslGetExtensionsFnFn {
    public operator fun invoke(clienthello: Long, clienthellobytesize: UInt, genericextensions: Long, genericextensionscount: UByte, bytestoread: Long, flags: SchGetExtensionsOptions): HRESULT
}

public typealias SslGetExtensionsFn = SslGetExtensionsFnFn?

public fun interface SslGetServerIdentityFnFn {
    public operator fun invoke(clienthello: Long, clienthellosize: UInt, serveridentity: Long, serveridentitysize: Long, flags: UInt): HRESULT
}

public typealias SslGetServerIdentityFn = SslGetServerIdentityFnFn?

public typealias TOKENBINDING_EXTENSION_FORMAT = Int

public typealias TOKENBINDING_KEY_PARAMETERS_TYPE = Int

public typealias TOKENBINDING_TYPE = Int

public typealias TRUSTED_DOMAIN_TRUST_ATTRIBUTES = UInt

public typealias TRUSTED_DOMAIN_TRUST_DIRECTION = UInt

public typealias TRUSTED_DOMAIN_TRUST_TYPE = UInt

public typealias TRUSTED_INFORMATION_CLASS = Int

public fun interface VERIFY_SIGNATURE_FNFn {
    public operator fun invoke(param0: Long, param1: Long, param2: UInt, param3: Long): HRESULT
}

public typealias VERIFY_SIGNATURE_FN = VERIFY_SIGNATURE_FNFn?

public typealias _HMAPPER = Long

public typealias eTlsAlgorithmUsage = Int

public typealias eTlsHashAlgorithm = Int

public typealias eTlsSignatureAlgorithm = Int
