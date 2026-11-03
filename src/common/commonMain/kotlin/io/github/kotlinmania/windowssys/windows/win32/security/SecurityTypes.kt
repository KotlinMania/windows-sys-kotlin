package io.github.kotlinmania.windowssys.windows.win32.security

public typealias ACE_FLAGS = UInt

public typealias ACE_REVISION = UInt

public typealias ACL_INFORMATION_CLASS = Int

public typealias AUDIT_EVENT_TYPE = Int

public typealias CLAIM_SECURITY_ATTRIBUTE_FLAGS = UInt

public typealias CLAIM_SECURITY_ATTRIBUTE_VALUE_TYPE = UShort

public typealias CREATE_RESTRICTED_TOKEN_FLAGS = UInt

public typealias ENUM_PERIOD = Int

public typealias LOGON32_LOGON = UInt

public typealias LOGON32_PROVIDER = UInt

public typealias MANDATORY_LEVEL = Int

public typealias NCRYPT_DESCRIPTOR_HANDLE = Long

public typealias NCRYPT_STREAM_HANDLE = Long

public typealias OBJECT_SECURITY_INFORMATION = UInt

public fun interface PLSA_AP_CALL_PACKAGE_UNTRUSTEDFn {
    public operator fun invoke(clientrequest: Long, protocolsubmitbuffer: Long, clientbufferbase: Long, submitbufferlength: UInt, protocolreturnbuffer: Long, returnbufferlength: Long, protocolstatus: Long): Foundation.NTSTATUS
}

public typealias PLSA_AP_CALL_PACKAGE_UNTRUSTED = PLSA_AP_CALL_PACKAGE_UNTRUSTEDFn?

public typealias PSECURITY_DESCRIPTOR = Long

public typealias PSID = Long

public typealias SAFER_LEVEL_HANDLE = Long

public typealias SECURITY_AUTO_INHERIT_FLAGS = UInt

public typealias SECURITY_DESCRIPTOR_CONTROL = UShort

public typealias SECURITY_IMPERSONATION_LEVEL = Int

public fun interface SEC_THREAD_STARTFn {
    public operator fun invoke(lpthreadparameter: Long): UInt
}

public typealias SEC_THREAD_START = SEC_THREAD_STARTFn?

public typealias SID_NAME_USE = Int

public typealias SYSTEM_AUDIT_OBJECT_ACE_FLAGS = UInt

public typealias TOKEN_ACCESS_MASK = UInt

public typealias TOKEN_ELEVATION_TYPE = Int

public typealias TOKEN_INFORMATION_CLASS = Int

public typealias TOKEN_MANDATORY_POLICY_ID = UInt

public typealias TOKEN_PRIVILEGES_ATTRIBUTES = UInt

public typealias TOKEN_TYPE = Int

public typealias WELL_KNOWN_SID_TYPE = Int
