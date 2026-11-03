package io.github.kotlinmania.windowssys.windows.win32.security.applocker

import io.github.kotlinmania.windowssys.core.PCWSTR
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

public val SAFER_TOKEN_COMPARE_ONLY: SAFER_COMPUTE_TOKEN_FROM_LEVEL_FLAGS = 2u

public val SAFER_TOKEN_MAKE_INERT: SAFER_COMPUTE_TOKEN_FROM_LEVEL_FLAGS = 4u

public val SAFER_TOKEN_NULL_IF_EQUAL: SAFER_COMPUTE_TOKEN_FROM_LEVEL_FLAGS = 1u

public val SAFER_TOKEN_WANT_FLAGS: SAFER_COMPUTE_TOKEN_FROM_LEVEL_FLAGS = 8u

public val SRP_POLICY_APPX: PCWSTR = w("APPX")

public val SRP_POLICY_DLL: PCWSTR = w("DLL")

public val SRP_POLICY_EXE: PCWSTR = w("EXE")

public val SRP_POLICY_MANAGEDINSTALLER: PCWSTR = w("MANAGEDINSTALLER")

public val SRP_POLICY_MSI: PCWSTR = w("MSI")

public val SRP_POLICY_NOV2: PCWSTR = w("IGNORESRPV2")

public val SRP_POLICY_SCRIPT: PCWSTR = w("SCRIPT")

public val SRP_POLICY_SHELL: PCWSTR = w("SHELL")

public val SRP_POLICY_WLDPCONFIGCI: PCWSTR = w("WLDPCONFIGCI")

public val SRP_POLICY_WLDPMSI: PCWSTR = w("WLDPMSI")

public val SRP_POLICY_WLDPSCRIPT: PCWSTR = w("WLDPSCRIPT")

public val SaferIdentityDefault: SAFER_IDENTIFICATION_TYPES = 0

public val SaferIdentityTypeCertificate: SAFER_IDENTIFICATION_TYPES = 4

public val SaferIdentityTypeImageHash: SAFER_IDENTIFICATION_TYPES = 2

public val SaferIdentityTypeImageName: SAFER_IDENTIFICATION_TYPES = 1

public val SaferIdentityTypeUrlZone: SAFER_IDENTIFICATION_TYPES = 3

public val SaferObjectAllIdentificationGuids: SAFER_OBJECT_INFO_CLASS = 14

public val SaferObjectBuiltin: SAFER_OBJECT_INFO_CLASS = 5

public val SaferObjectDefaultOwner: SAFER_OBJECT_INFO_CLASS = 10

public val SaferObjectDeletedPrivileges: SAFER_OBJECT_INFO_CLASS = 9

public val SaferObjectDescription: SAFER_OBJECT_INFO_CLASS = 4

public val SaferObjectDisableMaxPrivilege: SAFER_OBJECT_INFO_CLASS = 7

public val SaferObjectDisallowed: SAFER_OBJECT_INFO_CLASS = 6

public val SaferObjectExtendedError: SAFER_OBJECT_INFO_CLASS = 16

public val SaferObjectFriendlyName: SAFER_OBJECT_INFO_CLASS = 3

public val SaferObjectInvertDeletedPrivileges: SAFER_OBJECT_INFO_CLASS = 8

public val SaferObjectLevelId: SAFER_OBJECT_INFO_CLASS = 1

public val SaferObjectRestrictedSidsAdded: SAFER_OBJECT_INFO_CLASS = 13

public val SaferObjectRestrictedSidsInverted: SAFER_OBJECT_INFO_CLASS = 12

public val SaferObjectScopeId: SAFER_OBJECT_INFO_CLASS = 2

public val SaferObjectSidsToDisable: SAFER_OBJECT_INFO_CLASS = 11

public val SaferObjectSingleIdentification: SAFER_OBJECT_INFO_CLASS = 15

public val SaferPolicyAuthenticodeEnabled: SAFER_POLICY_INFO_CLASS = 7

public val SaferPolicyDefaultLevel: SAFER_POLICY_INFO_CLASS = 3

public val SaferPolicyDefaultLevelFlags: SAFER_POLICY_INFO_CLASS = 6

public val SaferPolicyEnableTransparentEnforcement: SAFER_POLICY_INFO_CLASS = 2

public val SaferPolicyEvaluateUserScope: SAFER_POLICY_INFO_CLASS = 4

public val SaferPolicyLevelList: SAFER_POLICY_INFO_CLASS = 1

public val SaferPolicyScopeFlags: SAFER_POLICY_INFO_CLASS = 5
