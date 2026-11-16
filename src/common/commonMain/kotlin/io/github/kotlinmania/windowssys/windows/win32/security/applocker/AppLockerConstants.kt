package io.github.kotlinmania.windowssys.windows.win32.security.applocker

import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.w

public val SAFER_CRITERIA_APPX_PACKAGE: UInt = 32u

public val SAFER_CRITERIA_AUTHENTICODE: UInt = 8u

public val SAFER_CRITERIA_IMAGEHASH: UInt = 4u

public val SAFER_CRITERIA_IMAGEPATH: UInt = 1u

public val SAFER_CRITERIA_IMAGEPATH_NT: UInt = 4096u

public val SAFER_CRITERIA_NOSIGNEDHASH: UInt = 2u

public val SAFER_CRITERIA_URLZONE: UInt = 16u

public val SAFER_LEVELID_CONSTRAINED: UInt = 65536u

public val SAFER_LEVELID_DISALLOWED: UInt = 0u

public val SAFER_LEVELID_FULLYTRUSTED: UInt = 262144u

public val SAFER_LEVELID_NORMALUSER: UInt = 131072u

public val SAFER_LEVELID_UNTRUSTED: UInt = 4096u

public val SAFER_LEVEL_OPEN: UInt = 1u

public val SAFER_MAX_DESCRIPTION_SIZE: UInt = 256u

public val SAFER_MAX_FRIENDLYNAME_SIZE: UInt = 256u

public val SAFER_MAX_HASH_SIZE: UInt = 64u

public val SAFER_POLICY_BLOCK_CLIENT_UI: UInt = 8192u

public val SAFER_POLICY_HASH_DUPLICATE: UInt = 262144u

public val SAFER_POLICY_JOBID_CONSTRAINED: UInt = 67108864u

public val SAFER_POLICY_JOBID_MASK: UInt = 4278190080u

public val SAFER_POLICY_JOBID_UNTRUSTED: UInt = 50331648u

public val SAFER_POLICY_ONLY_AUDIT: UInt = 4096u

public val SAFER_POLICY_ONLY_EXES: UInt = 65536u

public val SAFER_POLICY_SANDBOX_INERT: UInt = 131072u

public val SAFER_POLICY_UIFLAGS_HIDDEN: UInt = 4u

public val SAFER_POLICY_UIFLAGS_INFORMATION_PROMPT: UInt = 1u

public val SAFER_POLICY_UIFLAGS_MASK: UInt = 255u

public val SAFER_POLICY_UIFLAGS_OPTION_PROMPT: UInt = 2u

public val SAFER_SCOPEID_MACHINE: UInt = 1u

public val SAFER_SCOPEID_USER: UInt = 2u

public val SAFER_TOKEN_COMPARE_ONLY: SaferComputeTokenFromLevelFlags = 2u

public val SAFER_TOKEN_MAKE_INERT: SaferComputeTokenFromLevelFlags = 4u

public val SAFER_TOKEN_NULL_IF_EQUAL: SaferComputeTokenFromLevelFlags = 1u

public val SAFER_TOKEN_WANT_FLAGS: SaferComputeTokenFromLevelFlags = 8u

public val SRP_POLICY_APPX: Pcwstr = w("APPX")

public val SRP_POLICY_DLL: Pcwstr = w("DLL")

public val SRP_POLICY_EXE: Pcwstr = w("EXE")

public val SRP_POLICY_MANAGEDINSTALLER: Pcwstr = w("MANAGEDINSTALLER")

public val SRP_POLICY_MSI: Pcwstr = w("MSI")

public val SRP_POLICY_NOV2: Pcwstr = w("IGNORESRPV2")

public val SRP_POLICY_SCRIPT: Pcwstr = w("SCRIPT")

public val SRP_POLICY_SHELL: Pcwstr = w("SHELL")

public val SRP_POLICY_WLDPCONFIGCI: Pcwstr = w("WLDPCONFIGCI")

public val SRP_POLICY_WLDPMSI: Pcwstr = w("WLDPMSI")

public val SRP_POLICY_WLDPSCRIPT: Pcwstr = w("WLDPSCRIPT")

public val SAFER_IDENTITY_DEFAULT: SaferIdentificationTypes = 0

public val SAFER_IDENTITY_TYPE_CERTIFICATE: SaferIdentificationTypes = 4

public val SAFER_IDENTITY_TYPE_IMAGE_HASH: SaferIdentificationTypes = 2

public val SAFER_IDENTITY_TYPE_IMAGE_NAME: SaferIdentificationTypes = 1

public val SAFER_IDENTITY_TYPE_URL_ZONE: SaferIdentificationTypes = 3

public val SAFER_OBJECT_ALL_IDENTIFICATION_GUIDS: SaferObjectInfoClass = 14

public val SAFER_OBJECT_BUILTIN: SaferObjectInfoClass = 5

public val SAFER_OBJECT_DEFAULT_OWNER: SaferObjectInfoClass = 10

public val SAFER_OBJECT_DELETED_PRIVILEGES: SaferObjectInfoClass = 9

public val SAFER_OBJECT_DESCRIPTION: SaferObjectInfoClass = 4

public val SAFER_OBJECT_DISABLE_MAX_PRIVILEGE: SaferObjectInfoClass = 7

public val SAFER_OBJECT_DISALLOWED: SaferObjectInfoClass = 6

public val SAFER_OBJECT_EXTENDED_ERROR: SaferObjectInfoClass = 16

public val SAFER_OBJECT_FRIENDLY_NAME: SaferObjectInfoClass = 3

public val SAFER_OBJECT_INVERT_DELETED_PRIVILEGES: SaferObjectInfoClass = 8

public val SAFER_OBJECT_LEVEL_ID: SaferObjectInfoClass = 1

public val SAFER_OBJECT_RESTRICTED_SIDS_ADDED: SaferObjectInfoClass = 13

public val SAFER_OBJECT_RESTRICTED_SIDS_INVERTED: SaferObjectInfoClass = 12

public val SAFER_OBJECT_SCOPE_ID: SaferObjectInfoClass = 2

public val SAFER_OBJECT_SIDS_TO_DISABLE: SaferObjectInfoClass = 11

public val SAFER_OBJECT_SINGLE_IDENTIFICATION: SaferObjectInfoClass = 15

public val SAFER_POLICY_AUTHENTICODE_ENABLED: SaferPolicyInfoClass = 7

public val SAFER_POLICY_DEFAULT_LEVEL: SaferPolicyInfoClass = 3

public val SAFER_POLICY_DEFAULT_LEVEL_FLAGS: SaferPolicyInfoClass = 6

public val SAFER_POLICY_ENABLE_TRANSPARENT_ENFORCEMENT: SaferPolicyInfoClass = 2

public val SAFER_POLICY_EVALUATE_USER_SCOPE: SaferPolicyInfoClass = 4

public val SAFER_POLICY_LEVEL_LIST: SaferPolicyInfoClass = 1

public val SAFER_POLICY_SCOPE_FLAGS: SaferPolicyInfoClass = 5
