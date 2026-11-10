package io.github.kotlinmania.windowssys.windows.win32.security.cryptography

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w

public val ALG_CLASS_ALL: UInt = 57344u

public val ALG_CLASS_ANY: UInt = 0u

public val ALG_CLASS_DATA_ENCRYPT: UInt = 24576u

public val ALG_CLASS_HASH: UInt = 32768u

public val ALG_CLASS_KEY_EXCHANGE: UInt = 40960u

public val ALG_CLASS_MSG_ENCRYPT: UInt = 16384u

public val ALG_CLASS_SIGNATURE: UInt = 8192u

public val ALG_SID_3DES: UInt = 3u

public val ALG_SID_3DES_112: UInt = 9u

public val ALG_SID_AES: UInt = 17u

public val ALG_SID_AES_128: UInt = 14u

public val ALG_SID_AES_192: UInt = 15u

public val ALG_SID_AES_256: UInt = 16u

public val ALG_SID_AGREED_KEY_ANY: UInt = 3u

public val ALG_SID_ANY: UInt = 0u

public val ALG_SID_CAST: UInt = 6u

public val ALG_SID_CYLINK_MEK: UInt = 12u

public val ALG_SID_DES: UInt = 1u

public val ALG_SID_DESX: UInt = 4u

public val ALG_SID_DH_EPHEM: UInt = 2u

public val ALG_SID_DH_SANDF: UInt = 1u

public val ALG_SID_DSS_ANY: UInt = 0u

public val ALG_SID_DSS_DMS: UInt = 2u

public val ALG_SID_DSS_PKCS: UInt = 1u

public val ALG_SID_ECDH: UInt = 5u

public val ALG_SID_ECDH_EPHEM: UInt = 6u

public val ALG_SID_ECDSA: UInt = 3u

public val ALG_SID_ECMQV: UInt = 1u

public val ALG_SID_EXAMPLE: UInt = 80u

public val ALG_SID_HASH_REPLACE_OWF: UInt = 11u

public val ALG_SID_HMAC: UInt = 9u

public val ALG_SID_IDEA: UInt = 5u

public val ALG_SID_KEA: UInt = 4u

public val ALG_SID_MAC: UInt = 5u

public val ALG_SID_MD2: UInt = 1u

public val ALG_SID_MD4: UInt = 2u

public val ALG_SID_MD5: UInt = 3u

public val ALG_SID_PCT1_MASTER: UInt = 4u

public val ALG_SID_RC2: UInt = 2u

public val ALG_SID_RC4: UInt = 1u

public val ALG_SID_RC5: UInt = 13u

public val ALG_SID_RIPEMD: UInt = 6u

public val ALG_SID_RIPEMD160: UInt = 7u

public val ALG_SID_RSA_ANY: UInt = 0u

public val ALG_SID_RSA_ENTRUST: UInt = 3u

public val ALG_SID_RSA_MSATWORK: UInt = 2u

public val ALG_SID_RSA_PGP: UInt = 4u

public val ALG_SID_RSA_PKCS: UInt = 1u

public val ALG_SID_SAFERSK128: UInt = 8u

public val ALG_SID_SAFERSK64: UInt = 7u

public val ALG_SID_SCHANNEL_ENC_KEY: UInt = 7u

public val ALG_SID_SCHANNEL_MAC_KEY: UInt = 3u

public val ALG_SID_SCHANNEL_MASTER_HASH: UInt = 2u

public val ALG_SID_SEAL: UInt = 2u

public val ALG_SID_SHA: UInt = 4u

public val ALG_SID_SHA1: UInt = 4u

public val ALG_SID_SHA_256: UInt = 12u

public val ALG_SID_SHA_384: UInt = 13u

public val ALG_SID_SHA_512: UInt = 14u

public val ALG_SID_SKIPJACK: UInt = 10u

public val ALG_SID_SSL2_MASTER: UInt = 5u

public val ALG_SID_SSL3SHAMD5: UInt = 8u

public val ALG_SID_SSL3_MASTER: UInt = 1u

public val ALG_SID_TEK: UInt = 11u

public val ALG_SID_THIRDPARTY_ANY: UInt = 0u

public val ALG_SID_TLS1PRF: UInt = 10u

public val ALG_SID_TLS1_MASTER: UInt = 6u

public val ALG_TYPE_ANY: UInt = 0u

public val ALG_TYPE_BLOCK: UInt = 1536u

public val ALG_TYPE_DH: UInt = 2560u

public val ALG_TYPE_DSS: UInt = 512u

public val ALG_TYPE_ECDH: UInt = 3584u

public val ALG_TYPE_RSA: UInt = 1024u

public val ALG_TYPE_SECURECHANNEL: UInt = 3072u

public val ALG_TYPE_STREAM: UInt = 2048u

public val ALG_TYPE_THIRDPARTY: UInt = 4096u

public val AT_ECDHE_P256: UInt = 6u

public val AT_ECDHE_P384: UInt = 7u

public val AT_ECDHE_P521: UInt = 8u

public val AT_ECDSA_P256: UInt = 3u

public val AT_ECDSA_P384: UInt = 4u

public val AT_ECDSA_P521: UInt = 5u

public val AT_KEYEXCHANGE: CertKeySpec = 1u

public val AT_SIGNATURE: CertKeySpec = 2u

public val AUDIT_CARD_DELETE: Hresult = 0x40050201u.toInt()

public val AUDIT_CARD_IMPORT: Hresult = 0x40050202u.toInt()

public val AUDIT_CARD_WRITTEN: Hresult = 0x40050200u.toInt()

public val AUDIT_SERVICE_IDLE_STOP: Hresult = 0x40050206u.toInt()

public val AUDIT_STORE_DELETE: Hresult = 0x40050205u.toInt()

public val AUDIT_STORE_EXPORT: Hresult = 0x40050204u.toInt()

public val AUDIT_STORE_IMPORT: Hresult = 0x40050203u.toInt()

public val AUTHTYPE_CLIENT: HttpspolicyCallbackDataAuthType = 1u

public val AUTHTYPE_SERVER: HttpspolicyCallbackDataAuthType = 2u

public val ADMIN_CREATE_DELETE_DIR_AC: CardDirectoryAccessCondition = 2

public val ADMIN_READ_WRITE_AC: CardFileAccessCondition = 6

public val ADMINISTRATOR_PIN: SecretPurpose = 4

public val ALPHA_NUMERIC_PIN_TYPE: SecretType = 0

public val AUTHENTICATION_PIN: SecretPurpose = 0

public val BASIC_CONSTRAINTS_CERT_CHAIN_POLICY_CA_FLAG: CertChainPolicyFlags = 2147483648u

public val BASIC_CONSTRAINTS_CERT_CHAIN_POLICY_END_ENTITY_FLAG: CertChainPolicyFlags = 1073741824u

public val BCRYPTBUFFER_VERSION: UInt = 0u

public val BCRYPT_3DES_112_ALGORITHM: Pcwstr = w("3DES_112")

public val BCRYPT_3DES_112_CBC_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(369u.toLong())

public val BCRYPT_3DES_112_CFB_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(401u.toLong())

public val BCRYPT_3DES_112_ECB_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(385u.toLong())

public val BCRYPT_3DES_ALGORITHM: Pcwstr = w("3DES")

public val BCRYPT_3DES_CBC_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(321u.toLong())

public val BCRYPT_3DES_CFB_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(353u.toLong())

public val BCRYPT_3DES_ECB_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(337u.toLong())

public val BCRYPT_AES_ALGORITHM: Pcwstr = w("AES")

public val BCRYPT_AES_CBC_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(417u.toLong())

public val BCRYPT_AES_CCM_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(465u.toLong())

public val BCRYPT_AES_CFB_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(449u.toLong())

public val BCRYPT_AES_CMAC_ALGORITHM: Pcwstr = w("AES-CMAC")

public val BCRYPT_AES_CMAC_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(257u.toLong())

public val BCRYPT_AES_ECB_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(433u.toLong())

public val BCRYPT_AES_GCM_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(481u.toLong())

public val BCRYPT_AES_GMAC_ALGORITHM: Pcwstr = w("AES-GMAC")

public val BCRYPT_AES_GMAC_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(273u.toLong())

public val BCRYPT_AES_WRAP_KEY_BLOB: Pcwstr = w("Rfc3565KeyWrapBlob")

public val BCRYPT_ALGORITHM_NAME: Pcwstr = w("AlgorithmName")

public val BCRYPT_ALG_HANDLE_HMAC_FLAG: BcryptOpenAlgorithmProviderFlags = 8u

public val BCRYPT_ASYMMETRIC_ENCRYPTION_INTERFACE: BcryptInterface = 3u

public val BCRYPT_ASYMMETRIC_ENCRYPTION_OPERATION: BcryptOperation = 4u

public val BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO_VERSION: UInt = 1u

public val BCRYPT_AUTH_MODE_CHAIN_CALLS_FLAG: UInt = 1u

public val BCRYPT_AUTH_MODE_IN_PROGRESS_FLAG: UInt = 2u

public val BCRYPT_AUTH_TAG_LENGTH: Pcwstr = w("AuthTagLength")

public val BCRYPT_BLOCK_LENGTH: Pcwstr = w("BlockLength")

public val BCRYPT_BLOCK_PADDING: BcryptFlags = 1u

public val BCRYPT_BLOCK_SIZE_LIST: Pcwstr = w("BlockSizeList")

public val BCRYPT_BUFFERS_LOCKED_FLAG: UInt = 64u

public val BCRYPT_CAPI_AES_FLAG: UInt = 16u

public val BCRYPT_CAPI_KDF_ALGORITHM: Pcwstr = w("CAPI_KDF")

public val BCRYPT_CAPI_KDF_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(801u.toLong())

public val BCRYPT_CHACHA20_POLY1305_ALGORITHM: Pcwstr = w("CHACHA20_POLY1305")

public val BCRYPT_CHACHA20_POLY1305_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(929u.toLong())

public val BCRYPT_CHAINING_MODE: Pcwstr = w("ChainingMode")

public val BCRYPT_CHAIN_MODE_CBC: Pcwstr = w("ChainingModeCBC")

public val BCRYPT_CHAIN_MODE_CCM: Pcwstr = w("ChainingModeCCM")

public val BCRYPT_CHAIN_MODE_CFB: Pcwstr = w("ChainingModeCFB")

public val BCRYPT_CHAIN_MODE_ECB: Pcwstr = w("ChainingModeECB")

public val BCRYPT_CHAIN_MODE_GCM: Pcwstr = w("ChainingModeGCM")

public val BCRYPT_CHAIN_MODE_NA: Pcwstr = w("ChainingModeN/A")

public val BCRYPT_CIPHER_INTERFACE: BcryptInterface = 1u

public val BCRYPT_CIPHER_OPERATION: BcryptOperation = 1u

public val BCRYPT_COPY_AFTER_PADDING_CHECK_FAILURE_FLAG: UInt = 256u

public val BCRYPT_DESX_ALGORITHM: Pcwstr = w("DESX")

public val BCRYPT_DESX_CBC_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(545u.toLong())

public val BCRYPT_DESX_CFB_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(577u.toLong())

public val BCRYPT_DESX_ECB_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(561u.toLong())

public val BCRYPT_DES_ALGORITHM: Pcwstr = w("DES")

public val BCRYPT_DES_CBC_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(497u.toLong())

public val BCRYPT_DES_CFB_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(529u.toLong())

public val BCRYPT_DES_ECB_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(513u.toLong())

public val BCRYPT_DH_ALGORITHM: Pcwstr = w("DH")

public val BCRYPT_DH_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(641u.toLong())

public val BCRYPT_DH_PARAMETERS: Pcwstr = w("DHParameters")

public val BCRYPT_DH_PARAMETERS_MAGIC: UInt = 1297107012u

public val BCRYPT_DH_PRIVATE_BLOB: Pcwstr = w("DHPRIVATEBLOB")

public val BCRYPT_DH_PRIVATE_MAGIC: BcryptDhKeyBlobMagic = 1448101956u

public val BCRYPT_DH_PUBLIC_BLOB: Pcwstr = w("DHPUBLICBLOB")

public val BCRYPT_DH_PUBLIC_MAGIC: BcryptDhKeyBlobMagic = 1112557636u

public val BCRYPT_DSA_ALGORITHM: Pcwstr = w("DSA")

public val BCRYPT_DSA_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(721u.toLong())

public val BCRYPT_DSA_PARAMETERS: Pcwstr = w("DSAParameters")

public val BCRYPT_DSA_PARAMETERS_MAGIC: UInt = 1297109828u

public val BCRYPT_DSA_PARAMETERS_MAGIC_V2: UInt = 843927620u

public val BCRYPT_DSA_PRIVATE_BLOB: Pcwstr = w("DSAPRIVATEBLOB")

public val BCRYPT_DSA_PRIVATE_MAGIC: BcryptDsaMagic = 1448104772u

public val BCRYPT_DSA_PRIVATE_MAGIC_V2: UInt = 844517444u

public val BCRYPT_DSA_PUBLIC_BLOB: Pcwstr = w("DSAPUBLICBLOB")

public val BCRYPT_DSA_PUBLIC_MAGIC: BcryptDsaMagic = 1112560452u

public val BCRYPT_DSA_PUBLIC_MAGIC_V2: UInt = 843206724u

public val BCRYPT_ECCFULLPRIVATE_BLOB: Pcwstr = w("ECCFULLPRIVATEBLOB")

public val BCRYPT_ECCFULLPUBLIC_BLOB: Pcwstr = w("ECCFULLPUBLICBLOB")

public val BCRYPT_ECCPRIVATE_BLOB: Pcwstr = w("ECCPRIVATEBLOB")

public val BCRYPT_ECCPUBLIC_BLOB: Pcwstr = w("ECCPUBLICBLOB")

public val BCRYPT_ECC_CURVE_25519: Pcwstr = w("curve25519")

public val BCRYPT_ECC_CURVE_BRAINPOOLP160R1: Pcwstr = w("brainpoolP160r1")

public val BCRYPT_ECC_CURVE_BRAINPOOLP160T1: Pcwstr = w("brainpoolP160t1")

public val BCRYPT_ECC_CURVE_BRAINPOOLP192R1: Pcwstr = w("brainpoolP192r1")

public val BCRYPT_ECC_CURVE_BRAINPOOLP192T1: Pcwstr = w("brainpoolP192t1")

public val BCRYPT_ECC_CURVE_BRAINPOOLP224R1: Pcwstr = w("brainpoolP224r1")

public val BCRYPT_ECC_CURVE_BRAINPOOLP224T1: Pcwstr = w("brainpoolP224t1")

public val BCRYPT_ECC_CURVE_BRAINPOOLP256R1: Pcwstr = w("brainpoolP256r1")

public val BCRYPT_ECC_CURVE_BRAINPOOLP256T1: Pcwstr = w("brainpoolP256t1")

public val BCRYPT_ECC_CURVE_BRAINPOOLP320R1: Pcwstr = w("brainpoolP320r1")

public val BCRYPT_ECC_CURVE_BRAINPOOLP320T1: Pcwstr = w("brainpoolP320t1")

public val BCRYPT_ECC_CURVE_BRAINPOOLP384R1: Pcwstr = w("brainpoolP384r1")

public val BCRYPT_ECC_CURVE_BRAINPOOLP384T1: Pcwstr = w("brainpoolP384t1")

public val BCRYPT_ECC_CURVE_BRAINPOOLP512R1: Pcwstr = w("brainpoolP512r1")

public val BCRYPT_ECC_CURVE_BRAINPOOLP512T1: Pcwstr = w("brainpoolP512t1")

public val BCRYPT_ECC_CURVE_EC192WAPI: Pcwstr = w("ec192wapi")

public val BCRYPT_ECC_CURVE_NAME: Pcwstr = w("ECCCurveName")

public val BCRYPT_ECC_CURVE_NAME_LIST: Pcwstr = w("ECCCurveNameList")

public val BCRYPT_ECC_CURVE_NISTP192: Pcwstr = w("nistP192")

public val BCRYPT_ECC_CURVE_NISTP224: Pcwstr = w("nistP224")

public val BCRYPT_ECC_CURVE_NISTP256: Pcwstr = w("nistP256")

public val BCRYPT_ECC_CURVE_NISTP384: Pcwstr = w("nistP384")

public val BCRYPT_ECC_CURVE_NISTP521: Pcwstr = w("nistP521")

public val BCRYPT_ECC_CURVE_NUMSP256T1: Pcwstr = w("numsP256t1")

public val BCRYPT_ECC_CURVE_NUMSP384T1: Pcwstr = w("numsP384t1")

public val BCRYPT_ECC_CURVE_NUMSP512T1: Pcwstr = w("numsP512t1")

public val BCRYPT_ECC_CURVE_SECP160K1: Pcwstr = w("secP160k1")

public val BCRYPT_ECC_CURVE_SECP160R1: Pcwstr = w("secP160r1")

public val BCRYPT_ECC_CURVE_SECP160R2: Pcwstr = w("secP160r2")

public val BCRYPT_ECC_CURVE_SECP192K1: Pcwstr = w("secP192k1")

public val BCRYPT_ECC_CURVE_SECP192R1: Pcwstr = w("secP192r1")

public val BCRYPT_ECC_CURVE_SECP224K1: Pcwstr = w("secP224k1")

public val BCRYPT_ECC_CURVE_SECP224R1: Pcwstr = w("secP224r1")

public val BCRYPT_ECC_CURVE_SECP256K1: Pcwstr = w("secP256k1")

public val BCRYPT_ECC_CURVE_SECP256R1: Pcwstr = w("secP256r1")

public val BCRYPT_ECC_CURVE_SECP384R1: Pcwstr = w("secP384r1")

public val BCRYPT_ECC_CURVE_SECP521R1: Pcwstr = w("secP521r1")

public val BCRYPT_ECC_CURVE_WTLS12: Pcwstr = w("wtls12")

public val BCRYPT_ECC_CURVE_WTLS7: Pcwstr = w("wtls7")

public val BCRYPT_ECC_CURVE_WTLS9: Pcwstr = w("wtls9")

public val BCRYPT_ECC_CURVE_X962P192V1: Pcwstr = w("x962P192v1")

public val BCRYPT_ECC_CURVE_X962P192V2: Pcwstr = w("x962P192v2")

public val BCRYPT_ECC_CURVE_X962P192V3: Pcwstr = w("x962P192v3")

public val BCRYPT_ECC_CURVE_X962P239V1: Pcwstr = w("x962P239v1")

public val BCRYPT_ECC_CURVE_X962P239V2: Pcwstr = w("x962P239v2")

public val BCRYPT_ECC_CURVE_X962P239V3: Pcwstr = w("x962P239v3")

public val BCRYPT_ECC_CURVE_X962P256V1: Pcwstr = w("x962P256v1")

public val BCRYPT_ECC_FULLKEY_BLOB_V1: UInt = 1u

public val BCRYPT_ECC_PARAMETERS: Pcwstr = w("ECCParameters")

public val BCRYPT_ECC_PARAMETERS_MAGIC: UInt = 1346585413u

public val BCRYPT_ECC_PARAMETER_HEADER_V1: UInt = 1u

public val BCRYPT_ECC_PRIME_MONTGOMERY_CURVE: EccCurveTypeEnum = 3

public val BCRYPT_ECC_PRIME_SHORT_WEIERSTRASS_CURVE: EccCurveTypeEnum = 1

public val BCRYPT_ECC_PRIME_TWISTED_EDWARDS_CURVE: EccCurveTypeEnum = 2

public val BCRYPT_ECDH_ALGORITHM: Pcwstr = w("ECDH")

public val BCRYPT_ECDH_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(657u.toLong())

public val BCRYPT_ECDH_P256_ALGORITHM: Pcwstr = w("ECDH_P256")

public val BCRYPT_ECDH_P256_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(673u.toLong())

public val BCRYPT_ECDH_P384_ALGORITHM: Pcwstr = w("ECDH_P384")

public val BCRYPT_ECDH_P384_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(689u.toLong())

public val BCRYPT_ECDH_P521_ALGORITHM: Pcwstr = w("ECDH_P521")

public val BCRYPT_ECDH_P521_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(705u.toLong())

public val BCRYPT_ECDH_PRIVATE_GENERIC_MAGIC: UInt = 1447772997u

public val BCRYPT_ECDH_PRIVATE_P256_MAGIC: UInt = 843793221u

public val BCRYPT_ECDH_PRIVATE_P384_MAGIC: UInt = 877347653u

public val BCRYPT_ECDH_PRIVATE_P521_MAGIC: UInt = 910902085u

public val BCRYPT_ECDH_PUBLIC_GENERIC_MAGIC: UInt = 1347109701u

public val BCRYPT_ECDH_PUBLIC_P256_MAGIC: UInt = 827016005u

public val BCRYPT_ECDH_PUBLIC_P384_MAGIC: UInt = 860570437u

public val BCRYPT_ECDH_PUBLIC_P521_MAGIC: UInt = 894124869u

public val BCRYPT_ECDSA_ALGORITHM: Pcwstr = w("ECDSA")

public val BCRYPT_ECDSA_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(241u.toLong())

public val BCRYPT_ECDSA_P256_ALGORITHM: Pcwstr = w("ECDSA_P256")

public val BCRYPT_ECDSA_P256_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(737u.toLong())

public val BCRYPT_ECDSA_P384_ALGORITHM: Pcwstr = w("ECDSA_P384")

public val BCRYPT_ECDSA_P384_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(753u.toLong())

public val BCRYPT_ECDSA_P521_ALGORITHM: Pcwstr = w("ECDSA_P521")

public val BCRYPT_ECDSA_P521_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(769u.toLong())

public val BCRYPT_ECDSA_PRIVATE_GENERIC_MAGIC: UInt = 1447314245u

public val BCRYPT_ECDSA_PRIVATE_P256_MAGIC: UInt = 844317509u

public val BCRYPT_ECDSA_PRIVATE_P384_MAGIC: UInt = 877871941u

public val BCRYPT_ECDSA_PRIVATE_P521_MAGIC: UInt = 911426373u

public val BCRYPT_ECDSA_PUBLIC_GENERIC_MAGIC: UInt = 1346650949u

public val BCRYPT_ECDSA_PUBLIC_P256_MAGIC: UInt = 827540293u

public val BCRYPT_ECDSA_PUBLIC_P384_MAGIC: UInt = 861094725u

public val BCRYPT_ECDSA_PUBLIC_P521_MAGIC: UInt = 894649157u

public val BCRYPT_EFFECTIVE_KEY_LENGTH: Pcwstr = w("EffectiveKeyLength")

public val BCRYPT_ENABLE_INCOMPATIBLE_FIPS_CHECKS: UInt = 256u

public val BCRYPT_EXTENDED_KEYSIZE: UInt = 128u

public val BCRYPT_GENERATE_IV: UInt = 32u

public val BCRYPT_GLOBAL_PARAMETERS: Pcwstr = w("SecretAgreementParam")

public val BCRYPT_HASH_BLOCK_LENGTH: Pcwstr = w("HashBlockLength")

public val BCRYPT_HASH_INTERFACE: BcryptInterface = 2u

public val BCRYPT_HASH_INTERFACE_MAJORVERSION_2: UInt = 2u

public val BCRYPT_HASH_LENGTH: Pcwstr = w("HashDigestLength")

public val BCRYPT_HASH_OID_LIST: Pcwstr = w("HashOIDList")

public val BCRYPT_HASH_OPERATION: BcryptOperation = 2u

public val BCRYPT_HASH_OPERATION_FINISH_HASH: BcryptHashOperationType = 2

public val BCRYPT_HASH_OPERATION_HASH_DATA: BcryptHashOperationType = 1

public val BCRYPT_HASH_REUSABLE_FLAG: BcryptOpenAlgorithmProviderFlags = 32u

public val BCRYPT_HKDF_ALGORITHM: Pcwstr = w("HKDF")

public val BCRYPT_HKDF_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(913u.toLong())

public val BCRYPT_HKDF_HASH_ALGORITHM: Pcwstr = w("HkdfHashAlgorithm")

public val BCRYPT_HKDF_PRK_AND_FINALIZE: Pcwstr = w("HkdfPrkAndFinalize")

public val BCRYPT_HKDF_SALT_AND_FINALIZE: Pcwstr = w("HkdfSaltAndFinalize")

public val BCRYPT_HMAC_MD2_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(289u.toLong())

public val BCRYPT_HMAC_MD4_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(305u.toLong())

public val BCRYPT_HMAC_MD5_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(145u.toLong())

public val BCRYPT_HMAC_SHA1_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(161u.toLong())

public val BCRYPT_HMAC_SHA256_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(177u.toLong())

public val BCRYPT_HMAC_SHA384_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(193u.toLong())

public val BCRYPT_HMAC_SHA512_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(209u.toLong())

public val BCRYPT_INITIALIZATION_VECTOR: Pcwstr = w("IV")

public val BCRYPT_IS_IFX_TPM_WEAK_KEY: Pcwstr = w("IsIfxTpmWeakKey")

public val BCRYPT_IS_KEYED_HASH: Pcwstr = w("IsKeyedHash")

public val BCRYPT_IS_REUSABLE_HASH: Pcwstr = w("IsReusableHash")

public val BCRYPT_KDF_HASH: Pcwstr = w("HASH")

public val BCRYPT_KDF_HKDF: Pcwstr = w("HKDF")

public val BCRYPT_KDF_HMAC: Pcwstr = w("HMAC")

public val BCRYPT_KDF_RAW_SECRET: Pcwstr = w("TRUNCATE")

public val BCRYPT_KDF_SP80056A_CONCAT: Pcwstr = w("SP800_56A_CONCAT")

public val BCRYPT_KDF_TLS_PRF: Pcwstr = w("TLS_PRF")

public val BCRYPT_KEY_DATA_BLOB: Pcwstr = w("KeyDataBlob")

public val BCRYPT_KEY_DATA_BLOB_MAGIC: UInt = 1296188491u

public val BCRYPT_KEY_DATA_BLOB_VERSION1: UInt = 1u

public val BCRYPT_KEY_DERIVATION_INTERFACE: UInt = 7u

public val BCRYPT_KEY_DERIVATION_OPERATION: UInt = 64u

public val BCRYPT_KEY_LENGTH: Pcwstr = w("KeyLength")

public val BCRYPT_KEY_LENGTHS: Pcwstr = w("KeyLengths")

public val BCRYPT_KEY_OBJECT_LENGTH: Pcwstr = w("KeyObjectLength")

public val BCRYPT_KEY_STRENGTH: Pcwstr = w("KeyStrength")

public val BCRYPT_KEY_VALIDATION_RANGE: UInt = 16u

public val BCRYPT_KEY_VALIDATION_RANGE_AND_ORDER: UInt = 24u

public val BCRYPT_KEY_VALIDATION_REGENERATE: UInt = 32u

public val BCRYPT_MD2_ALGORITHM: Pcwstr = w("MD2")

public val BCRYPT_MD2_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(1u.toLong())

public val BCRYPT_MD4_ALGORITHM: Pcwstr = w("MD4")

public val BCRYPT_MD4_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(17u.toLong())

public val BCRYPT_MD5_ALGORITHM: Pcwstr = w("MD5")

public val BCRYPT_MD5_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(33u.toLong())

public val BCRYPT_MESSAGE_BLOCK_LENGTH: Pcwstr = w("MessageBlockLength")

public val BCRYPT_MULTI_FLAG: UInt = 64u

public val BCRYPT_MULTI_OBJECT_LENGTH: Pcwstr = w("MultiObjectLength")

public val BCRYPT_NO_CURVE_GENERATION_ALG_ID: EccCurveAlgIdEnum = 0

public val BCRYPT_NO_KEY_VALIDATION: UInt = 8u

public val BCRYPT_OBJECT_ALIGNMENT: UInt = 16u

public val BCRYPT_OBJECT_LENGTH: Pcwstr = w("ObjectLength")

public val BCRYPT_OPAQUE_KEY_BLOB: Pcwstr = w("OpaqueKeyBlob")

public val BCRYPT_OPERATION_TYPE_HASH: BcryptMultiOperationType = 1

public val BCRYPT_PADDING_SCHEMES: Pcwstr = w("PaddingSchemes")

public val BCRYPT_PAD_NONE: BcryptFlags = 1u

public val BCRYPT_PAD_OAEP: BcryptFlags = 4u

public val BCRYPT_PAD_PKCS1: BcryptFlags = 2u

public val BCRYPT_PAD_PKCS1_OPTIONAL_HASH_OID: UInt = 16u

public val BCRYPT_PAD_PSS: BcryptFlags = 8u

public val BCRYPT_PBKDF2_ALGORITHM: Pcwstr = w("PBKDF2")

public val BCRYPT_PBKDF2_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(817u.toLong())

public val BCRYPT_PCP_PLATFORM_TYPE_PROPERTY: Pcwstr = w("PCP_PLATFORM_TYPE")

public val BCRYPT_PCP_PROVIDER_VERSION_PROPERTY: Pcwstr = w("PCP_PROVIDER_VERSION")

public val BCRYPT_PRIMITIVE_TYPE: Pcwstr = w("PrimitiveType")

public val BCRYPT_PRIVATE_KEY: Pcwstr = w("PrivKeyVal")

public val BCRYPT_PRIVATE_KEY_BLOB: Pcwstr = w("PRIVATEBLOB")

public val BCRYPT_PRIVATE_KEY_FLAG: UInt = 2u

public val BCRYPT_PROVIDER_HANDLE: Pcwstr = w("ProviderHandle")

public val BCRYPT_PROV_DISPATCH: BcryptOpenAlgorithmProviderFlags = 1u

public val BCRYPT_PUBLIC_KEY_BLOB: Pcwstr = w("PUBLICBLOB")

public val BCRYPT_PUBLIC_KEY_FLAG: UInt = 1u

public val BCRYPT_PUBLIC_KEY_LENGTH: Pcwstr = w("PublicKeyLength")

public val BCRYPT_RC2_ALGORITHM: Pcwstr = w("RC2")

public val BCRYPT_RC2_CBC_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(593u.toLong())

public val BCRYPT_RC2_CFB_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(625u.toLong())

public val BCRYPT_RC2_ECB_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(609u.toLong())

public val BCRYPT_RC4_ALGORITHM: Pcwstr = w("RC4")

public val BCRYPT_RC4_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(113u.toLong())

public val BCRYPT_RNG_ALGORITHM: Pcwstr = w("RNG")

public val BCRYPT_RNG_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(129u.toLong())

public val BCRYPT_RNG_DUAL_EC_ALGORITHM: Pcwstr = w("DUALECRNG")

public val BCRYPT_RNG_FIPS186_DSA_ALGORITHM: Pcwstr = w("FIPS186DSARNG")

public val BCRYPT_RNG_INTERFACE: BcryptInterface = 6u

public val BCRYPT_RNG_OPERATION: BcryptOperation = 32u

public val BCRYPT_RNG_USE_ENTROPY_IN_BUFFER: BcryptgenrandomFlags = 1u

public val BCRYPT_RSAFULLPRIVATE_BLOB: Pcwstr = w("RSAFULLPRIVATEBLOB")

public val BCRYPT_RSAFULLPRIVATE_MAGIC: BcryptRsakeyBlobMagic = 859919186u

public val BCRYPT_RSAPRIVATE_BLOB: Pcwstr = w("RSAPRIVATEBLOB")

public val BCRYPT_RSAPRIVATE_MAGIC: BcryptRsakeyBlobMagic = 843141970u

public val BCRYPT_RSAPUBLIC_BLOB: Pcwstr = w("RSAPUBLICBLOB")

public val BCRYPT_RSAPUBLIC_MAGIC: BcryptRsakeyBlobMagic = 826364754u

public val BCRYPT_RSA_ALGORITHM: Pcwstr = w("RSA")

public val BCRYPT_RSA_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(225u.toLong())

public val BCRYPT_RSA_SIGN_ALGORITHM: Pcwstr = w("RSA_SIGN")

public val BCRYPT_RSA_SIGN_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(785u.toLong())

public val BCRYPT_SECRET_AGREEMENT_INTERFACE: BcryptInterface = 4u

public val BCRYPT_SECRET_AGREEMENT_OPERATION: BcryptOperation = 8u

public val BCRYPT_SHA1_ALGORITHM: Pcwstr = w("SHA1")

public val BCRYPT_SHA1_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(49u.toLong())

public val BCRYPT_SHA256_ALGORITHM: Pcwstr = w("SHA256")

public val BCRYPT_SHA256_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(65u.toLong())

public val BCRYPT_SHA384_ALGORITHM: Pcwstr = w("SHA384")

public val BCRYPT_SHA384_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(81u.toLong())

public val BCRYPT_SHA512_ALGORITHM: Pcwstr = w("SHA512")

public val BCRYPT_SHA512_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(97u.toLong())

public val BCRYPT_SIGNATURE_INTERFACE: BcryptInterface = 5u

public val BCRYPT_SIGNATURE_LENGTH: Pcwstr = w("SignatureLength")

public val BCRYPT_SIGNATURE_OPERATION: BcryptOperation = 16u

public val BCRYPT_SP800108_CTR_HMAC_ALGORITHM: Pcwstr = w("SP800_108_CTR_HMAC")

public val BCRYPT_SP800108_CTR_HMAC_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(833u.toLong())

public val BCRYPT_SP80056A_CONCAT_ALGORITHM: Pcwstr = w("SP800_56A_CONCAT")

public val BCRYPT_SP80056A_CONCAT_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(849u.toLong())

public val BCRYPT_SUPPORTED_PAD_OAEP: UInt = 8u

public val BCRYPT_SUPPORTED_PAD_PKCS1_ENC: UInt = 2u

public val BCRYPT_SUPPORTED_PAD_PKCS1_SIG: UInt = 4u

public val BCRYPT_SUPPORTED_PAD_PSS: UInt = 16u

public val BCRYPT_SUPPORTED_PAD_ROUTER: UInt = 1u

public val BCRYPT_TLS1_1_KDF_ALGORITHM: Pcwstr = w("TLS1_1_KDF")

public val BCRYPT_TLS1_1_KDF_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(865u.toLong())

public val BCRYPT_TLS1_2_KDF_ALGORITHM: Pcwstr = w("TLS1_2_KDF")

public val BCRYPT_TLS1_2_KDF_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(881u.toLong())

public val BCRYPT_TLS_CBC_HMAC_VERIFY_FLAG: UInt = 4u

public val BCRYPT_USE_SYSTEM_PREFERRED_RNG: BcryptgenrandomFlags = 2u

public val BCRYPT_XTS_AES_ALGORITHM: Pcwstr = w("XTS-AES")

public val BCRYPT_XTS_AES_ALG_HANDLE: BcryptAlgHandle = COpaquePointer(897u.toLong())

public val CALG_3DES: AlgId = 26115u

public val CALG_3DES_112: AlgId = 26121u

public val CALG_AES: AlgId = 26129u

public val CALG_AES_128: AlgId = 26126u

public val CALG_AES_192: AlgId = 26127u

public val CALG_AES_256: AlgId = 26128u

public val CALG_AGREEDKEY_ANY: AlgId = 43523u

public val CALG_CYLINK_MEK: AlgId = 26124u

public val CALG_DES: AlgId = 26113u

public val CALG_DESX: AlgId = 26116u

public val CALG_DH_EPHEM: AlgId = 43522u

public val CALG_DH_SF: AlgId = 43521u

public val CALG_DSS_SIGN: AlgId = 8704u

public val CALG_ECDH: AlgId = 43525u

public val CALG_ECDH_EPHEM: AlgId = 44550u

public val CALG_ECDSA: AlgId = 8707u

public val CALG_ECMQV: AlgId = 40961u

public val CALG_HASH_REPLACE_OWF: AlgId = 32779u

public val CALG_HMAC: AlgId = 32777u

public val CALG_HUGHES_MD5: AlgId = 40963u

public val CALG_KEA_KEYX: AlgId = 43524u

public val CALG_MAC: AlgId = 32773u

public val CALG_MD2: AlgId = 32769u

public val CALG_MD4: AlgId = 32770u

public val CALG_MD5: AlgId = 32771u

public val CALG_NO_SIGN: AlgId = 8192u

public val CALG_NULLCIPHER: AlgId = 24576u

public val CALG_OID_INFO_CNG_ONLY: UInt = 4294967295u

public val CALG_OID_INFO_PARAMETERS: UInt = 4294967294u

public val CALG_PCT1_MASTER: AlgId = 19460u

public val CALG_RC2: AlgId = 26114u

public val CALG_RC4: AlgId = 26625u

public val CALG_RC5: AlgId = 26125u

public val CALG_RSA_KEYX: AlgId = 41984u

public val CALG_RSA_SIGN: AlgId = 9216u

public val CALG_SCHANNEL_ENC_KEY: AlgId = 19463u

public val CALG_SCHANNEL_MAC_KEY: AlgId = 19459u

public val CALG_SCHANNEL_MASTER_HASH: AlgId = 19458u

public val CALG_SEAL: AlgId = 26626u

public val CALG_SHA: AlgId = 32772u

public val CALG_SHA1: AlgId = 32772u

public val CALG_SHA_256: AlgId = 32780u

public val CALG_SHA_384: AlgId = 32781u

public val CALG_SHA_512: AlgId = 32782u

public val CALG_SKIPJACK: AlgId = 26122u

public val CALG_SSL2_MASTER: AlgId = 19461u

public val CALG_SSL3_MASTER: AlgId = 19457u

public val CALG_SSL3_SHAMD5: AlgId = 32776u

public val CALG_TEK: AlgId = 26123u

public val CALG_THIRDPARTY_CIPHER: AlgId = 28672u

public val CALG_THIRDPARTY_HASH: AlgId = 36864u

public val CALG_THIRDPARTY_KEY_EXCHANGE: AlgId = 45056u

public val CALG_THIRDPARTY_SIGNATURE: AlgId = 12288u

public val CALG_TLS1PRF: AlgId = 32778u

public val CALG_TLS1_MASTER: AlgId = 19462u

public val CARD_3DES_112_ALGORITHM: Pcwstr = w("3DES_112")

public val CARD_3DES_ALGORITHM: Pcwstr = w("3DES")

public val CARD_AES_ALGORITHM: Pcwstr = w("AES")

public val CARD_ASYMMETRIC_OPERATION: UInt = 2u

public val CARD_AUTHENTICATE_CURRENT_VERSION: UInt = 7u

public val CARD_AUTHENTICATE_GENERATE_SESSION_PIN: UInt = 268435456u

public val CARD_AUTHENTICATE_PIN_CHALLENGE_RESPONSE: UInt = 1u

public val CARD_AUTHENTICATE_PIN_PIN: UInt = 2u

public val CARD_AUTHENTICATE_RESPONSE_CURRENT_VERSION: UInt = 7u

public val CARD_AUTHENTICATE_RESPONSE_VERSION_SEVEN: UInt = 7u

public val CARD_AUTHENTICATE_SESSION_PIN: UInt = 536870912u

public val CARD_AUTHENTICATE_VERSION_SEVEN: UInt = 7u

public val CARD_BUFFER_SIZE_ONLY: UInt = 536870912u

public val CARD_CACHE_FILE_CURRENT_VERSION: UInt = 1u

public val CARD_CAPABILITIES_CURRENT_VERSION: UInt = 1u

public val CARD_CHAIN_MODE_CBC: Pcwstr = w("ChainingModeCBC")

public val CARD_CHANGE_AUTHENTICATOR_CURRENT_VERSION: UInt = 7u

public val CARD_CHANGE_AUTHENTICATOR_RESPONSE_CURRENT_VERSION: UInt = 7u

public val CARD_CHANGE_AUTHENTICATOR_RESPONSE_VERSION_SEVEN: UInt = 7u

public val CARD_CHANGE_AUTHENTICATOR_VERSION_SEVEN: UInt = 7u

public val CARD_CIPHER_OPERATION: UInt = 1u

public val CARD_CREATE_CONTAINER_KEY_GEN: UInt = 1u

public val CARD_CREATE_CONTAINER_KEY_IMPORT: UInt = 2u

public val CARD_DATA_CURRENT_VERSION: UInt = 7u

public val CARD_DATA_VALUE_UNKNOWN: UInt = 4294967295u

public val CARD_DATA_VERSION_FIVE: UInt = 5u

public val CARD_DATA_VERSION_FOUR: UInt = 4u

public val CARD_DATA_VERSION_SEVEN: UInt = 7u

public val CARD_DATA_VERSION_SIX: UInt = 6u

public val CARD_DERIVE_KEY_CURRENT_VERSION: UInt = 2u

public val CARD_DERIVE_KEY_VERSION: UInt = 1u

public val CARD_DERIVE_KEY_VERSION_TWO: UInt = 2u

public val CARD_DH_AGREEMENT_INFO_VERSION: UInt = 2u

public val CARD_FILE_INFO_CURRENT_VERSION: UInt = 1u

public val CARD_FREE_SPACE_INFO_CURRENT_VERSION: UInt = 1u

public val CARD_IMPORT_KEYPAIR_CURRENT_VERSION: UInt = 7u

public val CARD_IMPORT_KEYPAIR_VERSION_SEVEN: UInt = 7u

public val CARD_KEY_IMPORT_ECC_KEYEST: UInt = 4u

public val CARD_KEY_IMPORT_PLAIN_TEXT: UInt = 1u

public val CARD_KEY_IMPORT_RSA_KEYEST: UInt = 2u

public val CARD_KEY_IMPORT_SHARED_SYMMETRIC: UInt = 8u

public val CARD_KEY_SIZES_CURRENT_VERSION: UInt = 1u

public val CARD_PADDING_INFO_PRESENT: UInt = 1073741824u

public val CARD_PADDING_NONE: UInt = 1u

public val CARD_PADDING_OAEP: UInt = 8u

public val CARD_PADDING_PKCS1: UInt = 2u

public val CARD_PADDING_PSS: UInt = 4u

public val CARD_PIN_SILENT_CONTEXT: UInt = 64u

public val CARD_PIN_STRENGTH_PLAINTEXT: UInt = 1u

public val CARD_PIN_STRENGTH_SESSION_PIN: UInt = 2u

public val CARD_RETURN_KEY_HANDLE: UInt = 16777216u

public val CARD_RSA_KEY_DECRYPT_INFO_CURRENT_VERSION: UInt = 2u

public val CARD_RSA_KEY_DECRYPT_INFO_VERSION_ONE: UInt = 1u

public val CARD_RSA_KEY_DECRYPT_INFO_VERSION_TWO: UInt = 2u

public val CARD_SECURE_KEY_INJECTION_NO_CARD_MODE: UInt = 1u

public val CARD_SIGNING_INFO_BASIC_VERSION: UInt = 1u

public val CARD_SIGNING_INFO_CURRENT_VERSION: UInt = 2u

public val CCP_ASSOCIATED_ECDH_KEY: Pcwstr = w("Associated ECDH Key")

public val CCP_CONTAINER_INFO: Pcwstr = w("Container Info")

public val CCP_PIN_IDENTIFIER: Pcwstr = w("PIN Identifier")

public val C_CERT_SRV_SETUP: Guid = Guid.fromU128(U128(0x961f180ff55c413duL, 0xa9b37d2af4d8e42fuL))

public val C_CERT_SRV_SETUP_KEY_INFORMATION: Guid = Guid.fromU128(U128(0x3837390654334633uL, 0xb0fb29b7e78262e1uL))

public val C_CERTIFICATE_ENROLLMENT_POLICY_SERVER_SETUP: Guid = Guid.fromU128(U128(0xafe2fa3241b1459duL, 0xa5de49add8a72182uL))

public val C_CERTIFICATE_ENROLLMENT_SERVER_SETUP: Guid = Guid.fromU128(U128(0x9902f3bc88af4cf8uL, 0xae627140531552b6uL))

public val CERT_ACCESS_STATE_GP_SYSTEM_STORE_FLAG: UInt = 8u

public val CERT_ACCESS_STATE_LM_SYSTEM_STORE_FLAG: UInt = 4u

public val CERT_ACCESS_STATE_PROP_ID: UInt = 14u

public val CERT_ACCESS_STATE_SHARED_USER_FLAG: UInt = 16u

public val CERT_ACCESS_STATE_SYSTEM_STORE_FLAG: UInt = 2u

public val CERT_ACCESS_STATE_WRITE_PERSIST_FLAG: UInt = 1u

public val CERT_AIA_URL_RETRIEVED_PROP_ID: UInt = 67u

public val CERT_ALT_NAME_EDI_PARTY_NAME: UInt = 6u

public val CERT_ALT_NAME_ENTRY_ERR_INDEX_MASK: UInt = 255u

public val CERT_ALT_NAME_ENTRY_ERR_INDEX_SHIFT: UInt = 16u

public val CERT_ALT_NAME_VALUE_ERR_INDEX_MASK: UInt = 65535u

public val CERT_ALT_NAME_VALUE_ERR_INDEX_SHIFT: UInt = 0u

public val CERT_ALT_NAME_X400_ADDRESS: UInt = 4u

public val CERT_ARCHIVED_KEY_HASH_PROP_ID: UInt = 65u

public val CERT_ARCHIVED_PROP_ID: UInt = 19u

public val CERT_AUTHORITY_INFO_ACCESS_PROP_ID: UInt = 68u

public val CERT_AUTH_ROOT_AUTO_UPDATE_DISABLE_PARTIAL_CHAIN_LOGGING_FLAG: UInt = 2u

public val CERT_AUTH_ROOT_AUTO_UPDATE_DISABLE_UNTRUSTED_ROOT_LOGGING_FLAG: UInt = 1u

public val CERT_AUTH_ROOT_AUTO_UPDATE_ENCODED_CTL_VALUE_NAME: Pcwstr = w("EncodedCtl")

public val CERT_AUTH_ROOT_AUTO_UPDATE_FLAGS_VALUE_NAME: Pcwstr = w("Flags")

public val CERT_AUTH_ROOT_AUTO_UPDATE_LAST_SYNC_TIME_VALUE_NAME: Pcwstr = w("LastSyncTime")

public val CERT_AUTH_ROOT_AUTO_UPDATE_ROOT_DIR_URL_VALUE_NAME: Pcwstr = w("RootDirUrl")

public val CERT_AUTH_ROOT_AUTO_UPDATE_SYNC_DELTA_TIME_VALUE_NAME: Pcwstr = w("SyncDeltaTime")

public val CERT_AUTH_ROOT_CAB_FILENAME: Pcwstr = w("authrootstl.cab")

public val CERT_AUTH_ROOT_CERT_EXT: Pcwstr = w(".crt")

public val CERT_AUTH_ROOT_CTL_FILENAME: Pcwstr = w("authroot.stl")

public val CERT_AUTH_ROOT_CTL_FILENAME_A: Pcstr = s("authroot.stl")

public val CERT_AUTH_ROOT_SEQ_FILENAME: Pcwstr = w("authrootseq.txt")

public val CERT_AUTH_ROOT_SHA256_HASH_PROP_ID: UInt = 98u

public val CERT_AUTO_ENROLL_PROP_ID: UInt = 21u

public val CERT_AUTO_ENROLL_RETRY_PROP_ID: UInt = 66u

public val CERT_AUTO_UPDATE_DISABLE_RANDOM_QUERY_STRING_FLAG: UInt = 4u

public val CERT_AUTO_UPDATE_ROOT_DIR_URL_VALUE_NAME: Pcwstr = w("RootDirUrl")

public val CERT_AUTO_UPDATE_SYNC_FROM_DIR_URL_VALUE_NAME: Pcwstr = w("SyncFromDirUrl")

public val CERT_BACKED_UP_PROP_ID: UInt = 69u

public val CERT_BIOMETRIC_OID_DATA_CHOICE: CertBiometricDataType = 2u

public val CERT_BIOMETRIC_PICTURE_TYPE: UInt = 0u

public val CERT_BIOMETRIC_PREDEFINED_DATA_CHOICE: CertBiometricDataType = 1u

public val CERT_BIOMETRIC_SIGNATURE_TYPE: UInt = 1u

public val CERT_BUNDLE_CERTIFICATE: UInt = 0u

public val CERT_BUNDLE_CRL: UInt = 1u

public val CERT_CASE_INSENSITIVE_IS_RDN_ATTRS_FLAG: UInt = 2u

public val CERT_CA_DISABLE_CRL_PROP_ID: UInt = 82u

public val CERT_CA_OCSP_AUTHORITY_INFO_ACCESS_PROP_ID: UInt = 81u

public val CERT_CA_SUBJECT_FLAG: UInt = 128u

public val CERT_CEP_PROP_ID: UInt = 87u

public val CERT_CHAIN_AUTO_CURRENT_USER: UInt = 1u

public val CERT_CHAIN_AUTO_FLAGS_VALUE_NAME: Pcwstr = w("AutoFlags")

public val CERT_CHAIN_AUTO_FLUSH_DISABLE_FLAG: UInt = 1u

public val CERT_CHAIN_AUTO_FLUSH_FIRST_DELTA_SECONDS_VALUE_NAME: Pcwstr = w("AutoFlushFirstDeltaSeconds")

public val CERT_CHAIN_AUTO_FLUSH_NEXT_DELTA_SECONDS_VALUE_NAME: Pcwstr = w("AutoFlushNextDeltaSeconds")

public val CERT_CHAIN_AUTO_HPKP_RULE_INFO: UInt = 8u

public val CERT_CHAIN_AUTO_IMPERSONATED: UInt = 3u

public val CERT_CHAIN_AUTO_LOCAL_MACHINE: UInt = 2u

public val CERT_CHAIN_AUTO_LOG_CREATE_FLAG: UInt = 2u

public val CERT_CHAIN_AUTO_LOG_FILE_NAME_VALUE_NAME: Pcwstr = w("AutoLogFileName")

public val CERT_CHAIN_AUTO_LOG_FLUSH_FLAG: UInt = 8u

public val CERT_CHAIN_AUTO_LOG_FREE_FLAG: UInt = 4u

public val CERT_CHAIN_AUTO_NETWORK_INFO: UInt = 6u

public val CERT_CHAIN_AUTO_PINRULE_INFO: UInt = 5u

public val CERT_CHAIN_AUTO_PROCESS_INFO: UInt = 4u

public val CERT_CHAIN_AUTO_SERIAL_LOCAL_MACHINE: UInt = 7u

public val CERT_CHAIN_CACHE_END_CERT: UInt = 1u

public val CERT_CHAIN_CACHE_ONLY_URL_RETRIEVAL: UInt = 4u

public val CERT_CHAIN_CACHE_RESYNC_FILETIME_VALUE_NAME: Pcwstr = w("ChainCacheResyncFiletime")

public val CERT_CHAIN_CONFIG_REGPATH: Pcwstr = w("Software\\Microsoft\\Cryptography\\OID\\EncodingType 0\\CertDllCreateCertificateChainEngine\\Config")

public val CERT_CHAIN_CRL_VALIDITY_EXT_PERIOD_HOURS_DEFAULT: UInt = 12u

public val CERT_CHAIN_CRL_VALIDITY_EXT_PERIOD_HOURS_VALUE_NAME: Pcwstr = w("CRLValidityExtensionPeriod")

public val CERT_CHAIN_CROSS_CERT_DOWNLOAD_INTERVAL_HOURS_VALUE_NAME: Pcwstr = w("CrossCertDownloadIntervalHours")

public val CERT_CHAIN_DEFAULT_CONFIG_SUBDIR: Pcwstr = w("Default")

public val CERT_CHAIN_DISABLE_AIA: UInt = 8192u

public val CERT_CHAIN_DISABLE_AIA_URL_RETRIEVAL_VALUE_NAME: Pcwstr = w("DisableAIAUrlRetrieval")

public val CERT_CHAIN_DISABLE_ALL_EKU_WEAK_FLAG: UInt = 65536u

public val CERT_CHAIN_DISABLE_AUTH_ROOT_AUTO_UPDATE: UInt = 256u

public val CERT_CHAIN_DISABLE_AUTO_FLUSH_PROCESS_NAME_LIST_VALUE_NAME: Pcwstr = w("DisableAutoFlushProcessNameList")

public val CERT_CHAIN_DISABLE_CA_NAME_CONSTRAINTS_VALUE_NAME: Pcwstr = w("DisableCANameConstraints")

public val CERT_CHAIN_DISABLE_CODE_SIGNING_WEAK_FLAG: UInt = 4194304u

public val CERT_CHAIN_DISABLE_ECC_PARA_FLAG: UInt = 16u

public val CERT_CHAIN_DISABLE_FILE_HASH_WEAK_FLAG: UInt = 4096u

public val CERT_CHAIN_DISABLE_MANDATORY_BASIC_CONSTRAINTS_VALUE_NAME: Pcwstr = w("DisableMandatoryBasicConstraints")

public val CERT_CHAIN_DISABLE_MD2_MD4: UInt = 4096u

public val CERT_CHAIN_DISABLE_MOTW_CODE_SIGNING_WEAK_FLAG: UInt = 8388608u

public val CERT_CHAIN_DISABLE_MOTW_FILE_HASH_WEAK_FLAG: UInt = 8192u

public val CERT_CHAIN_DISABLE_MOTW_TIMESTAMP_HASH_WEAK_FLAG: UInt = 32768u

public val CERT_CHAIN_DISABLE_MOTW_TIMESTAMP_WEAK_FLAG: UInt = 134217728u

public val CERT_CHAIN_DISABLE_MY_PEER_TRUST: UInt = 2048u

public val CERT_CHAIN_DISABLE_OPT_IN_SERVER_AUTH_WEAK_FLAG: UInt = 262144u

public val CERT_CHAIN_DISABLE_PASS1_QUALITY_FILTERING: UInt = 64u

public val CERT_CHAIN_DISABLE_SERIAL_CHAIN_VALUE_NAME: Pcwstr = w("DisableSerialChain")

public val CERT_CHAIN_DISABLE_SERVER_AUTH_WEAK_FLAG: UInt = 1048576u

public val CERT_CHAIN_DISABLE_SYNC_WITH_SSL_TIME_VALUE_NAME: Pcwstr = w("DisableSyncWithSslTime")

public val CERT_CHAIN_DISABLE_TIMESTAMP_HASH_WEAK_FLAG: UInt = 16384u

public val CERT_CHAIN_DISABLE_TIMESTAMP_WEAK_FLAG: UInt = 67108864u

public val CERT_CHAIN_DISABLE_UNSUPPORTED_CRITICAL_EXTENSIONS_VALUE_NAME: Pcwstr = w("DisableUnsupportedCriticalExtensions")

public val CERT_CHAIN_ENABLE_ALL_EKU_HYGIENE_FLAG: UInt = 131072u

public val CERT_CHAIN_ENABLE_CACHE_AUTO_UPDATE: UInt = 16u

public val CERT_CHAIN_ENABLE_CODE_SIGNING_HYGIENE_FLAG: UInt = 16777216u

public val CERT_CHAIN_ENABLE_DISALLOWED_CA: UInt = 131072u

public val CERT_CHAIN_ENABLE_MD2_MD4_FLAG: UInt = 1u

public val CERT_CHAIN_ENABLE_MOTW_CODE_SIGNING_HYGIENE_FLAG: UInt = 33554432u

public val CERT_CHAIN_ENABLE_MOTW_TIMESTAMP_HYGIENE_FLAG: UInt = 536870912u

public val CERT_CHAIN_ENABLE_ONLY_WEAK_LOGGING_FLAG: UInt = 8u

public val CERT_CHAIN_ENABLE_PEER_TRUST: UInt = 1024u

public val CERT_CHAIN_ENABLE_SERVER_AUTH_HYGIENE_FLAG: UInt = 2097152u

public val CERT_CHAIN_ENABLE_SHARE_STORE: UInt = 32u

public val CERT_CHAIN_ENABLE_TIMESTAMP_HYGIENE_FLAG: UInt = 268435456u

public val CERT_CHAIN_ENABLE_WEAK_LOGGING_FLAG: UInt = 4u

public val CERT_CHAIN_ENABLE_WEAK_RSA_ROOT_FLAG: UInt = 2u

public val CERT_CHAIN_ENABLE_WEAK_SETTINGS_FLAG: UInt = 2147483648u

public val CERT_CHAIN_ENABLE_WEAK_SIGNATURE_FLAGS_VALUE_NAME: Pcwstr = w("EnableWeakSignatureFlags")

public val CERT_CHAIN_EXCLUSIVE_ENABLE_CA_FLAG: UInt = 1u

public val CERT_CHAIN_FIND_BY_ISSUER: UInt = 1u

public val CERT_CHAIN_FIND_BY_ISSUER_CACHE_ONLY_FLAG: CertFindChainInStoreFlags = 32768u

public val CERT_CHAIN_FIND_BY_ISSUER_CACHE_ONLY_URL_FLAG: CertFindChainInStoreFlags = 4u

public val CERT_CHAIN_FIND_BY_ISSUER_COMPARE_KEY_FLAG: CertFindChainInStoreFlags = 1u

public val CERT_CHAIN_FIND_BY_ISSUER_COMPLEX_CHAIN_FLAG: CertFindChainInStoreFlags = 2u

public val CERT_CHAIN_FIND_BY_ISSUER_LOCAL_MACHINE_FLAG: CertFindChainInStoreFlags = 8u

public val CERT_CHAIN_FIND_BY_ISSUER_NO_KEY_FLAG: CertFindChainInStoreFlags = 16384u

public val CERT_CHAIN_HAS_MOTW: UInt = 16384u

public val CERT_CHAIN_MAX_AIA_URL_COUNT_IN_CERT_DEFAULT: UInt = 5u

public val CERT_CHAIN_MAX_AIA_URL_COUNT_IN_CERT_VALUE_NAME: Pcwstr = w("MaxAIAUrlCountInCert")

public val CERT_CHAIN_MAX_AIA_URL_RETRIEVAL_BYTE_COUNT_DEFAULT: UInt = 100000u

public val CERT_CHAIN_MAX_AIA_URL_RETRIEVAL_BYTE_COUNT_VALUE_NAME: Pcwstr = w("MaxAIAUrlRetrievalByteCount")

public val CERT_CHAIN_MAX_AIA_URL_RETRIEVAL_CERT_COUNT_DEFAULT: UInt = 10u

public val CERT_CHAIN_MAX_AIA_URL_RETRIEVAL_CERT_COUNT_VALUE_NAME: Pcwstr = w("MaxAIAUrlRetrievalCertCount")

public val CERT_CHAIN_MAX_AIA_URL_RETRIEVAL_COUNT_PER_CHAIN_DEFAULT: UInt = 3u

public val CERT_CHAIN_MAX_AIA_URL_RETRIEVAL_COUNT_PER_CHAIN_VALUE_NAME: Pcwstr = w("MaxAIAUrlRetrievalCountPerChain")

public val CERT_CHAIN_MAX_SSL_TIME_UPDATED_EVENT_COUNT_DEFAULT: UInt = 5u

public val CERT_CHAIN_MAX_SSL_TIME_UPDATED_EVENT_COUNT_DISABLE: UInt = 4294967295u

public val CERT_CHAIN_MAX_SSL_TIME_UPDATED_EVENT_COUNT_VALUE_NAME: Pcwstr = w("MaxSslTimeUpdatedEventCount")

public val CERT_CHAIN_MAX_URL_RETRIEVAL_BYTE_COUNT_VALUE_NAME: Pcwstr = w("MaxUrlRetrievalByteCount")

public val CERT_CHAIN_MIN_PUB_KEY_BIT_LENGTH_DISABLE: UInt = 4294967295u

public val CERT_CHAIN_MIN_RSA_PUB_KEY_BIT_LENGTH_DEFAULT: UInt = 1023u

public val CERT_CHAIN_MIN_RSA_PUB_KEY_BIT_LENGTH_DISABLE: UInt = 4294967295u

public val CERT_CHAIN_MIN_RSA_PUB_KEY_BIT_LENGTH_VALUE_NAME: Pcwstr = w("MinRsaPubKeyBitLength")

public val CERT_CHAIN_MOTW_IGNORE_AFTER_TIME_WEAK_FLAG: UInt = 1073741824u

public val CERT_CHAIN_OCSP_VALIDITY_SECONDS_VALUE_NAME: Pcwstr = w("OcspValiditySeconds")

public val CERT_CHAIN_ONLY_ADDITIONAL_AND_AUTH_ROOT: UInt = 32768u

public val CERT_CHAIN_OPTIONS_VALUE_NAME: Pcwstr = w("Options")

public val CERT_CHAIN_OPTION_DISABLE_AIA_URL_RETRIEVAL: UInt = 2u

public val CERT_CHAIN_OPTION_ENABLE_SIA_URL_RETRIEVAL: UInt = 4u

public val CERT_CHAIN_OPT_IN_WEAK_FLAGS: UInt = 262144u

public val CERT_CHAIN_OPT_IN_WEAK_SIGNATURE: UInt = 65536u

public val CERT_CHAIN_POLICY_ALLOW_TESTROOT_FLAG: CertChainPolicyFlags = 32768u

public val CERT_CHAIN_POLICY_ALLOW_UNKNOWN_CA_FLAG: CertChainPolicyFlags = 16u

public val CERT_CHAIN_POLICY_AUTHENTICODE: Pcstr = COpaquePointer(2.toLong())

public val CERT_CHAIN_POLICY_AUTHENTICODE_TS: Pcstr = COpaquePointer(3.toLong())

public val CERT_CHAIN_POLICY_BASE: Pcstr = COpaquePointer(1.toLong())

public val CERT_CHAIN_POLICY_BASIC_CONSTRAINTS: Pcstr = COpaquePointer(5.toLong())

public val CERT_CHAIN_POLICY_EV: Pcstr = COpaquePointer(8.toLong())

public val CERT_CHAIN_POLICY_IGNORE_ALL_NOT_TIME_VALID_FLAGS: CertChainPolicyFlags = 7u

public val CERT_CHAIN_POLICY_IGNORE_ALL_REV_UNKNOWN_FLAGS: CertChainPolicyFlags = 3840u

public val CERT_CHAIN_POLICY_IGNORE_CA_REV_UNKNOWN_FLAG: CertChainPolicyFlags = 1024u

public val CERT_CHAIN_POLICY_IGNORE_CTL_NOT_TIME_VALID_FLAG: CertChainPolicyFlags = 2u

public val CERT_CHAIN_POLICY_IGNORE_CTL_SIGNER_REV_UNKNOWN_FLAG: CertChainPolicyFlags = 512u

public val CERT_CHAIN_POLICY_IGNORE_END_REV_UNKNOWN_FLAG: CertChainPolicyFlags = 256u

public val CERT_CHAIN_POLICY_IGNORE_INVALID_BASIC_CONSTRAINTS_FLAG: CertChainPolicyFlags = 8u

public val CERT_CHAIN_POLICY_IGNORE_INVALID_NAME_FLAG: CertChainPolicyFlags = 64u

public val CERT_CHAIN_POLICY_IGNORE_INVALID_POLICY_FLAG: CertChainPolicyFlags = 128u

public val CERT_CHAIN_POLICY_IGNORE_NOT_SUPPORTED_CRITICAL_EXT_FLAG: CertChainPolicyFlags = 8192u

public val CERT_CHAIN_POLICY_IGNORE_NOT_TIME_NESTED_FLAG: CertChainPolicyFlags = 4u

public val CERT_CHAIN_POLICY_IGNORE_NOT_TIME_VALID_FLAG: CertChainPolicyFlags = 1u

public val CERT_CHAIN_POLICY_IGNORE_PEER_TRUST_FLAG: CertChainPolicyFlags = 4096u

public val CERT_CHAIN_POLICY_IGNORE_ROOT_REV_UNKNOWN_FLAG: CertChainPolicyFlags = 2048u

public val CERT_CHAIN_POLICY_IGNORE_WEAK_SIGNATURE_FLAG: CertChainPolicyFlags = 134217728u

public val CERT_CHAIN_POLICY_IGNORE_WRONG_USAGE_FLAG: CertChainPolicyFlags = 32u

public val CERT_CHAIN_POLICY_MICROSOFT_ROOT: Pcstr = COpaquePointer(7.toLong())

public val CERT_CHAIN_POLICY_NT_AUTH: Pcstr = COpaquePointer(6.toLong())

public val CERT_CHAIN_POLICY_SSL: Pcstr = COpaquePointer(4.toLong())

public val CERT_CHAIN_POLICY_SSL_F12: Pcstr = COpaquePointer(9.toLong())

public val CERT_CHAIN_POLICY_SSL_F12_ERROR_LEVEL: UInt = 2u

public val CERT_CHAIN_POLICY_SSL_F12_NONE_CATEGORY: UInt = 0u

public val CERT_CHAIN_POLICY_SSL_F12_ROOT_PROGRAM_CATEGORY: UInt = 2u

public val CERT_CHAIN_POLICY_SSL_F12_SUCCESS_LEVEL: UInt = 0u

public val CERT_CHAIN_POLICY_SSL_F12_WARNING_LEVEL: UInt = 1u

public val CERT_CHAIN_POLICY_SSL_F12_WEAK_CRYPTO_CATEGORY: UInt = 1u

public val CERT_CHAIN_POLICY_SSL_HPKP_HEADER: Pcstr = COpaquePointer(10.toLong())

public val CERT_CHAIN_POLICY_SSL_KEY_PIN: Pcstr = COpaquePointer(12.toLong())

public val CERT_CHAIN_POLICY_SSL_KEY_PIN_MISMATCH_ERROR: Int = -2

public val CERT_CHAIN_POLICY_SSL_KEY_PIN_MISMATCH_WARNING: UInt = 2u

public val CERT_CHAIN_POLICY_SSL_KEY_PIN_MITM_ERROR: Int = -1

public val CERT_CHAIN_POLICY_SSL_KEY_PIN_MITM_WARNING: UInt = 1u

public val CERT_CHAIN_POLICY_SSL_KEY_PIN_SUCCESS: UInt = 0u

public val CERT_CHAIN_POLICY_THIRD_PARTY_ROOT: Pcstr = COpaquePointer(11.toLong())

public val CERT_CHAIN_POLICY_TRUST_TESTROOT_FLAG: CertChainPolicyFlags = 16384u

public val CERT_CHAIN_RETURN_LOWER_QUALITY_CONTEXTS: UInt = 128u

public val CERT_CHAIN_REVOCATION_ACCUMULATIVE_TIMEOUT: UInt = 134217728u

public val CERT_CHAIN_REVOCATION_CHECK_CACHE_ONLY: UInt = 2147483648u

public val CERT_CHAIN_REVOCATION_CHECK_CHAIN: UInt = 536870912u

public val CERT_CHAIN_REVOCATION_CHECK_CHAIN_EXCLUDE_ROOT: UInt = 1073741824u

public val CERT_CHAIN_REVOCATION_CHECK_END_CERT: UInt = 268435456u

public val CERT_CHAIN_REVOCATION_CHECK_OCSP_CERT: UInt = 67108864u

public val CERT_CHAIN_REV_ACCUMULATIVE_URL_RETRIEVAL_TIMEOUT_MILLISECONDS_VALUE_NAME: Pcwstr = w("ChainRevAccumulativeUrlRetrievalTimeoutMilliseconds")

public val CERT_CHAIN_SERIAL_CHAIN_LOG_FILE_NAME_VALUE_NAME: Pcwstr = w("SerialChainLogFileName")

public val CERT_CHAIN_SSL_HANDSHAKE_LOG_FILE_NAME_VALUE_NAME: Pcwstr = w("SslHandshakeLogFileName")

public val CERT_CHAIN_STRONG_SIGN_DISABLE_END_CHECK_FLAG: UInt = 1u

public val CERT_CHAIN_THREAD_STORE_SYNC: UInt = 2u

public val CERT_CHAIN_TIMESTAMP_TIME: UInt = 512u

public val CERT_CHAIN_URL_RETRIEVAL_TIMEOUT_MILLISECONDS_VALUE_NAME: Pcwstr = w("ChainUrlRetrievalTimeoutMilliseconds")

public val CERT_CHAIN_USE_LOCAL_MACHINE_STORE: UInt = 8u

public val CERT_CHAIN_WEAK_AFTER_TIME_NAME: Pcwstr = w("AfterTime")

public val CERT_CHAIN_WEAK_ALL_CONFIG_NAME: Pcwstr = w("All")

public val CERT_CHAIN_WEAK_FILE_HASH_AFTER_TIME_NAME: Pcwstr = w("FileHashAfterTime")

public val CERT_CHAIN_WEAK_FLAGS_NAME: Pcwstr = w("Flags")

public val CERT_CHAIN_WEAK_HYGIENE_NAME: Pcwstr = w("Hygiene")

public val CERT_CHAIN_WEAK_MIN_BIT_LENGTH_NAME: Pcwstr = w("MinBitLength")

public val CERT_CHAIN_WEAK_PREFIX_NAME: Pcwstr = w("Weak")

public val CERT_CHAIN_WEAK_RSA_PUB_KEY_TIME_VALUE_NAME: Pcwstr = w("WeakRsaPubKeyTime")

public val CERT_CHAIN_WEAK_SHA256_ALLOW_NAME: Pcwstr = w("Sha256Allow")

public val CERT_CHAIN_WEAK_SIGNATURE_LOG_DIR_VALUE_NAME: Pcwstr = w("WeakSignatureLogDir")

public val CERT_CHAIN_WEAK_THIRD_PARTY_CONFIG_NAME: Pcwstr = w("ThirdParty")

public val CERT_CHAIN_WEAK_TIMESTAMP_HASH_AFTER_TIME_NAME: Pcwstr = w("TimestampHashAfterTime")

public val CERT_CLOSE_STORE_CHECK_FLAG: UInt = 2u

public val CERT_CLOSE_STORE_FORCE_FLAG: UInt = 1u

public val CERT_CLR_DELETE_KEY_PROP_ID: UInt = 125u

public val CERT_COMPARE_ANY: UInt = 0u

public val CERT_COMPARE_ATTR: UInt = 3u

public val CERT_COMPARE_CERT_ID: UInt = 16u

public val CERT_COMPARE_CROSS_CERT_DIST_POINTS: UInt = 17u

public val CERT_COMPARE_CTL_USAGE: UInt = 10u

public val CERT_COMPARE_ENHKEY_USAGE: UInt = 10u

public val CERT_COMPARE_EXISTING: UInt = 13u

public val CERT_COMPARE_HASH: UInt = 1u

public val CERT_COMPARE_HASH_STR: UInt = 20u

public val CERT_COMPARE_HAS_PRIVATE_KEY: UInt = 21u

public val CERT_COMPARE_ISSUER_OF: UInt = 12u

public val CERT_COMPARE_KEY_IDENTIFIER: UInt = 15u

public val CERT_COMPARE_KEY_SPEC: UInt = 9u

public val CERT_COMPARE_MASK: UInt = 65535u

public val CERT_COMPARE_MD5_HASH: UInt = 4u

public val CERT_COMPARE_NAME: UInt = 2u

public val CERT_COMPARE_NAME_STR_A: UInt = 7u

public val CERT_COMPARE_NAME_STR_W: UInt = 8u

public val CERT_COMPARE_PROPERTY: UInt = 5u

public val CERT_COMPARE_PUBKEY_MD5_HASH: UInt = 18u

public val CERT_COMPARE_PUBLIC_KEY: UInt = 6u

public val CERT_COMPARE_SHA1_HASH: UInt = 1u

public val CERT_COMPARE_SHIFT: Int = 16

public val CERT_COMPARE_SIGNATURE_HASH: UInt = 14u

public val CERT_COMPARE_SUBJECT_CERT: UInt = 11u

public val CERT_COMPARE_SUBJECT_INFO_ACCESS: UInt = 19u

public val CERT_CONTEXT_REVOCATION_TYPE: UInt = 1u

public val CERT_CREATE_CONTEXT_NOCOPY_FLAG: UInt = 1u

public val CERT_CREATE_CONTEXT_NO_ENTRY_FLAG: UInt = 8u

public val CERT_CREATE_CONTEXT_NO_HCRYPTMSG_FLAG: UInt = 4u

public val CERT_CREATE_CONTEXT_SORTED_FLAG: UInt = 2u

public val CERT_CREATE_SELFSIGN_NO_KEY_INFO: CertCreateSelfsignFlags = 2u

public val CERT_CREATE_SELFSIGN_NO_SIGN: CertCreateSelfsignFlags = 1u

public val CERT_CRL_SIGN_KEY_USAGE: UInt = 2u

public val CERT_CROSS_CERT_DIST_POINTS_PROP_ID: UInt = 23u

public val CERT_CTL_USAGE_PROP_ID: UInt = 9u

public val CERT_DATA_ENCIPHERMENT_KEY_USAGE: UInt = 16u

public val CERT_DATE_STAMP_PROP_ID: UInt = 27u

public val CERT_DECIPHER_ONLY_KEY_USAGE: UInt = 128u

public val CERT_DEFAULT_OID_PUBLIC_KEY_SIGN: Pcwstr = w("1.2.840.113549.1.1.1")

public val CERT_DEFAULT_OID_PUBLIC_KEY_XCHG: Pcwstr = w("1.2.840.113549.1.1.1")

public val CERT_DESCRIPTION_PROP_ID: UInt = 13u

public val CERT_DIGITAL_SIGNATURE_KEY_USAGE: UInt = 128u

public val CERT_DISABLE_PIN_RULES_AUTO_UPDATE_VALUE_NAME: Pcwstr = w("DisablePinRulesAutoUpdate")

public val CERT_DISABLE_ROOT_AUTO_UPDATE_VALUE_NAME: Pcwstr = w("DisableRootAutoUpdate")

public val CERT_DISALLOWED_CA_FILETIME_PROP_ID: UInt = 128u

public val CERT_DISALLOWED_CERT_AUTO_UPDATE_ENCODED_CTL_VALUE_NAME: Pcwstr = w("DisallowedCertEncodedCtl")

public val CERT_DISALLOWED_CERT_AUTO_UPDATE_LAST_SYNC_TIME_VALUE_NAME: Pcwstr = w("DisallowedCertLastSyncTime")

public val CERT_DISALLOWED_CERT_AUTO_UPDATE_LIST_IDENTIFIER: Pcwstr = w("DisallowedCert_AutoUpdate_1")

public val CERT_DISALLOWED_CERT_AUTO_UPDATE_SYNC_DELTA_TIME_VALUE_NAME: Pcwstr = w("DisallowedCertSyncDeltaTime")

public val CERT_DISALLOWED_CERT_CAB_FILENAME: Pcwstr = w("disallowedcertstl.cab")

public val CERT_DISALLOWED_CERT_CTL_FILENAME: Pcwstr = w("disallowedcert.stl")

public val CERT_DISALLOWED_CERT_CTL_FILENAME_A: Pcstr = s("disallowedcert.stl")

public val CERT_DISALLOWED_ENHKEY_USAGE_PROP_ID: UInt = 122u

public val CERT_DISALLOWED_FILETIME_PROP_ID: UInt = 104u

public val CERT_DSS_R_LEN: UInt = 20u

public val CERT_DSS_S_LEN: UInt = 20u

public val CERT_EFSBLOB_VALUE_NAME: Pcwstr = w("EFSBlob")

public val CERT_EFS_PROP_ID: UInt = 17u

public val CERT_ENABLE_DISALLOWED_CERT_AUTO_UPDATE_VALUE_NAME: Pcwstr = w("EnableDisallowedCertAutoUpdate")

public val CERT_ENCIPHER_ONLY_KEY_USAGE: UInt = 1u

public val CERT_ENCODING_TYPE_MASK: UInt = 65535u

public val CERT_END_ENTITY_SUBJECT_FLAG: UInt = 64u

public val CERT_ENHKEY_USAGE_PROP_ID: UInt = 9u

public val CERT_ENROLLMENT_PROP_ID: UInt = 26u

public val CERT_EXCLUDED_SUBTREE_BIT: Int = -2147483648.toInt()

public val CERT_EXTENDED_ERROR_INFO_PROP_ID: UInt = 30u

public val CERT_FILE_HASH_USE_TYPE: UInt = 1u

public val CERT_FILE_STORE_COMMIT_ENABLE_FLAG: UInt = 65536u

public val CERT_FIND_ANY: CertFindFlags = 0u

public val CERT_FIND_CERT_ID: CertFindFlags = 1048576u

public val CERT_FIND_CROSS_CERT_DIST_POINTS: CertFindFlags = 1114112u

public val CERT_FIND_CTL_USAGE: CertFindFlags = 655360u

public val CERT_FIND_ENHKEY_USAGE: CertFindFlags = 655360u

public val CERT_FIND_EXISTING: CertFindFlags = 851968u

public val CERT_FIND_EXT_ONLY_CTL_USAGE_FLAG: CertFindFlags = 2u

public val CERT_FIND_EXT_ONLY_ENHKEY_USAGE_FLAG: CertFindFlags = 2u

public val CERT_FIND_HASH: CertFindFlags = 65536u

public val CERT_FIND_HASH_STR: CertFindFlags = 1310720u

public val CERT_FIND_HAS_PRIVATE_KEY: CertFindFlags = 1376256u

public val CERT_FIND_ISSUER_ATTR: CertFindFlags = 196612u

public val CERT_FIND_ISSUER_NAME: CertFindFlags = 131076u

public val CERT_FIND_ISSUER_OF: CertFindFlags = 786432u

public val CERT_FIND_ISSUER_STR: CertFindFlags = 524292u

public val CERT_FIND_ISSUER_STR_A: CertFindFlags = 458756u

public val CERT_FIND_ISSUER_STR_W: CertFindFlags = 524292u

public val CERT_FIND_KEY_IDENTIFIER: CertFindFlags = 983040u

public val CERT_FIND_KEY_SPEC: CertFindFlags = 589824u

public val CERT_FIND_MD5_HASH: CertFindFlags = 262144u

public val CERT_FIND_NO_CTL_USAGE_FLAG: CertFindFlags = 8u

public val CERT_FIND_NO_ENHKEY_USAGE_FLAG: CertFindFlags = 8u

public val CERT_FIND_OPTIONAL_CTL_USAGE_FLAG: CertFindFlags = 1u

public val CERT_FIND_OPTIONAL_ENHKEY_USAGE_FLAG: CertFindFlags = 1u

public val CERT_FIND_OR_CTL_USAGE_FLAG: CertFindFlags = 16u

public val CERT_FIND_OR_ENHKEY_USAGE_FLAG: CertFindFlags = 16u

public val CERT_FIND_PROPERTY: CertFindFlags = 327680u

public val CERT_FIND_PROP_ONLY_CTL_USAGE_FLAG: CertFindFlags = 4u

public val CERT_FIND_PROP_ONLY_ENHKEY_USAGE_FLAG: CertFindFlags = 4u

public val CERT_FIND_PUBKEY_MD5_HASH: CertFindFlags = 1179648u

public val CERT_FIND_PUBLIC_KEY: CertFindFlags = 393216u

public val CERT_FIND_SHA1_HASH: CertFindFlags = 65536u

public val CERT_FIND_SIGNATURE_HASH: CertFindFlags = 917504u

public val CERT_FIND_SUBJECT_ATTR: CertFindFlags = 196615u

public val CERT_FIND_SUBJECT_CERT: CertFindFlags = 720896u

public val CERT_FIND_SUBJECT_INFO_ACCESS: CertFindFlags = 1245184u

public val CERT_FIND_SUBJECT_NAME: CertFindFlags = 131079u

public val CERT_FIND_SUBJECT_STR: CertFindFlags = 524295u

public val CERT_FIND_SUBJECT_STR_A: CertFindFlags = 458759u

public val CERT_FIND_SUBJECT_STR_W: CertFindFlags = 524295u

public val CERT_FIND_VALID_CTL_USAGE_FLAG: CertFindFlags = 32u

public val CERT_FIND_VALID_ENHKEY_USAGE_FLAG: CertFindFlags = 32u

public val CERT_FIRST_RESERVED_PROP_ID: UInt = 129u

public val CERT_FIRST_USER_PROP_ID: UInt = 32768u

public val CERT_FORTEZZA_DATA_PROP_ID: UInt = 18u

public val CERT_FRIENDLY_NAME_PROP_ID: UInt = 11u

public val CERT_GROUP_POLICY_SYSTEM_STORE_REGPATH: Pcwstr = w("Software\\Policies\\Microsoft\\SystemCertificates")

public val CERT_HASH_PROP_ID: UInt = 3u

public val CERT_HCRYPTPROV_OR_NCRYPT_KEY_HANDLE_PROP_ID: UInt = 79u

public val CERT_HCRYPTPROV_TRANSFER_PROP_ID: UInt = 100u

public val CERT_ID_ISSUER_SERIAL_NUMBER: CertIdOption = 1u

public val CERT_ID_KEY_IDENTIFIER: CertIdOption = 2u

public val CERT_ID_SHA1_HASH: CertIdOption = 3u

public val CERT_IE30_RESERVED_PROP_ID: UInt = 7u

public val CERT_IE_DIRTY_FLAGS_REGPATH: Pcwstr = w("Software\\Microsoft\\Cryptography\\IEDirtyFlags")

public val CERT_INFO_EXTENSION_FLAG: UInt = 11u

public val CERT_INFO_ISSUER_FLAG: UInt = 4u

public val CERT_INFO_ISSUER_UNIQUE_ID_FLAG: UInt = 9u

public val CERT_INFO_NOT_AFTER_FLAG: UInt = 6u

public val CERT_INFO_NOT_BEFORE_FLAG: UInt = 5u

public val CERT_INFO_SERIAL_NUMBER_FLAG: UInt = 2u

public val CERT_INFO_SIGNATURE_ALGORITHM_FLAG: UInt = 3u

public val CERT_INFO_SUBJECT_FLAG: UInt = 7u

public val CERT_INFO_SUBJECT_PUBLIC_KEY_INFO_FLAG: UInt = 8u

public val CERT_INFO_SUBJECT_UNIQUE_ID_FLAG: UInt = 10u

public val CERT_INFO_VERSION_FLAG: UInt = 1u

public val CERT_ISOLATED_KEY_PROP_ID: UInt = 118u

public val CERT_ISSUER_CHAIN_PUB_KEY_CNG_ALG_BIT_LENGTH_PROP_ID: UInt = 96u

public val CERT_ISSUER_CHAIN_SIGN_HASH_CNG_ALG_PROP_ID: UInt = 95u

public val CERT_ISSUER_PUBLIC_KEY_MD5_HASH_PROP_ID: UInt = 24u

public val CERT_ISSUER_PUB_KEY_BIT_LENGTH_PROP_ID: UInt = 94u

public val CERT_ISSUER_SERIAL_NUMBER_MD5_HASH_PROP_ID: UInt = 28u

public val CERT_KEYGEN_REQUEST_V1: UInt = 0u

public val CERT_KEY_AGREEMENT_KEY_USAGE: UInt = 8u

public val CERT_KEY_CERT_SIGN_KEY_USAGE: UInt = 4u

public val CERT_KEY_CLASSIFICATION_PROP_ID: UInt = 120u

public val CERT_KEY_CONTEXT_PROP_ID: UInt = 5u

public val CERT_KEY_ENCIPHERMENT_KEY_USAGE: UInt = 32u

public val CERT_KEY_IDENTIFIER_PROP_ID: UInt = 20u

public val CERT_KEY_PROV_HANDLE_PROP_ID: UInt = 1u

public val CERT_KEY_PROV_INFO_PROP_ID: UInt = 2u

public val CERT_KEY_REPAIR_ATTEMPTED_PROP_ID: UInt = 103u

public val CERT_KEY_SPEC_PROP_ID: UInt = 6u

public val CERT_LAST_RESERVED_PROP_ID: UInt = 32767u

public val CERT_LAST_USER_PROP_ID: UInt = 65535u

public val CERT_LDAP_STORE_AREC_EXCLUSIVE_FLAG: UInt = 131072u

public val CERT_LDAP_STORE_OPENED_FLAG: UInt = 262144u

public val CERT_LDAP_STORE_SIGN_FLAG: UInt = 65536u

public val CERT_LDAP_STORE_UNBIND_FLAG: UInt = 524288u

public val CERT_LOCAL_MACHINE_SYSTEM_STORE_REGPATH: Pcwstr = w("Software\\Microsoft\\SystemCertificates")

public val CERT_LOGOTYPE_BITS_IMAGE_RESOLUTION_CHOICE: CertLogotypeChoice = 1u

public val CERT_LOGOTYPE_COLOR_IMAGE_INFO_CHOICE: CertLogotypeImageInfoType = 2u

public val CERT_LOGOTYPE_DIRECT_INFO_CHOICE: CertLogotypeOption = 1u

public val CERT_LOGOTYPE_GRAY_SCALE_IMAGE_INFO_CHOICE: CertLogotypeImageInfoType = 1u

public val CERT_LOGOTYPE_INDIRECT_INFO_CHOICE: CertLogotypeOption = 2u

public val CERT_LOGOTYPE_NO_IMAGE_RESOLUTION_CHOICE: CertLogotypeChoice = 0u

public val CERT_LOGOTYPE_TABLE_SIZE_IMAGE_RESOLUTION_CHOICE: CertLogotypeChoice = 2u

public val CERT_MD5_HASH_PROP_ID: UInt = 4u

public val CERT_NAME_ATTR_TYPE: UInt = 3u

public val CERT_NAME_DISABLE_IE4_UTF8_FLAG: UInt = 65536u

public val CERT_NAME_DNS_TYPE: UInt = 6u

public val CERT_NAME_EMAIL_TYPE: UInt = 1u

public val CERT_NAME_FRIENDLY_DISPLAY_TYPE: UInt = 5u

public val CERT_NAME_ISSUER_FLAG: UInt = 1u

public val CERT_NAME_RDN_TYPE: UInt = 2u

public val CERT_NAME_SEARCH_ALL_NAMES_FLAG: UInt = 2u

public val CERT_NAME_SIMPLE_DISPLAY_TYPE: UInt = 4u

public val CERT_NAME_STR_COMMA_FLAG: UInt = 67108864u

public val CERT_NAME_STR_CRLF_FLAG: UInt = 134217728u

public val CERT_NAME_STR_DISABLE_IE4_UTF8_FLAG: UInt = 65536u

public val CERT_NAME_STR_DISABLE_UTF8_DIR_STR_FLAG: UInt = 1048576u

public val CERT_NAME_STR_ENABLE_PUNYCODE_FLAG: UInt = 2097152u

public val CERT_NAME_STR_ENABLE_T61_UNICODE_FLAG: UInt = 131072u

public val CERT_NAME_STR_ENABLE_UTF8_UNICODE_FLAG: UInt = 262144u

public val CERT_NAME_STR_FORCE_UTF8_DIR_STR_FLAG: UInt = 524288u

public val CERT_NAME_STR_FORWARD_FLAG: UInt = 16777216u

public val CERT_NAME_STR_NO_PLUS_FLAG: UInt = 536870912u

public val CERT_NAME_STR_NO_QUOTING_FLAG: UInt = 268435456u

public val CERT_NAME_STR_REVERSE_FLAG: UInt = 33554432u

public val CERT_NAME_STR_SEMICOLON_FLAG: UInt = 1073741824u

public val CERT_NAME_UPN_TYPE: UInt = 8u

public val CERT_NAME_URL_TYPE: UInt = 7u

public val CERT_NCRYPT_KEY_HANDLE_PROP_ID: UInt = 78u

public val CERT_NCRYPT_KEY_HANDLE_TRANSFER_PROP_ID: UInt = 99u

public val CERT_NCRYPT_KEY_SPEC: CertKeySpec = 4294967295u

public val CERT_NEW_KEY_PROP_ID: UInt = 74u

public val CERT_NEXT_UPDATE_LOCATION_PROP_ID: UInt = 10u

public val CERT_NONCOMPLIANT_ROOT_URL_PROP_ID: UInt = 123u

public val CERT_NON_REPUDIATION_KEY_USAGE: UInt = 64u

public val CERT_NOT_BEFORE_ENHKEY_USAGE_PROP_ID: UInt = 127u

public val CERT_NOT_BEFORE_FILETIME_PROP_ID: UInt = 126u

public val CERT_NO_AUTO_EXPIRE_CHECK_PROP_ID: UInt = 77u

public val CERT_NO_EXPIRE_NOTIFICATION_PROP_ID: UInt = 97u

public val CERT_OCM_SUBCOMPONENTS_LOCAL_MACHINE_REGPATH: Pcwstr = w("SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\Setup\\OC Manager\\Subcomponents")

public val CERT_OCM_SUBCOMPONENTS_ROOT_AUTO_UPDATE_VALUE_NAME: Pcwstr = w("RootAutoUpdate")

public val CERT_OCSP_CACHE_PREFIX_PROP_ID: UInt = 75u

public val CERT_OCSP_MUST_STAPLE_PROP_ID: UInt = 121u

public val CERT_OCSP_RESPONSE_PROP_ID: UInt = 70u

public val CERT_OFFLINE_CRL_SIGN_KEY_USAGE: UInt = 2u

public val CERT_OID_NAME_STR: CertStringType = 2u

public val CERT_PHYSICAL_STORE_ADD_ENABLE_FLAG: UInt = 1u

public val CERT_PHYSICAL_STORE_AUTH_ROOT_NAME: Pcwstr = w(".AuthRoot")

public val CERT_PHYSICAL_STORE_DEFAULT_NAME: Pcwstr = w(".Default")

public val CERT_PHYSICAL_STORE_DS_USER_CERTIFICATE_NAME: Pcwstr = w(".UserCertificate")

public val CERT_PHYSICAL_STORE_ENTERPRISE_NAME: Pcwstr = w(".Enterprise")

public val CERT_PHYSICAL_STORE_GROUP_POLICY_NAME: Pcwstr = w(".GroupPolicy")

public val CERT_PHYSICAL_STORE_INSERT_COMPUTER_NAME_ENABLE_FLAG: UInt = 8u

public val CERT_PHYSICAL_STORE_LOCAL_MACHINE_GROUP_POLICY_NAME: Pcwstr = w(".LocalMachineGroupPolicy")

public val CERT_PHYSICAL_STORE_LOCAL_MACHINE_NAME: Pcwstr = w(".LocalMachine")

public val CERT_PHYSICAL_STORE_OPEN_DISABLE_FLAG: UInt = 2u

public val CERT_PHYSICAL_STORE_PREDEFINED_ENUM_FLAG: UInt = 1u

public val CERT_PHYSICAL_STORE_REMOTE_OPEN_DISABLE_FLAG: UInt = 4u

public val CERT_PHYSICAL_STORE_SMART_CARD_NAME: Pcwstr = w(".SmartCard")

public val CERT_PIN_RULES_AUTO_UPDATE_ENCODED_CTL_VALUE_NAME: Pcwstr = w("PinRulesEncodedCtl")

public val CERT_PIN_RULES_AUTO_UPDATE_LAST_SYNC_TIME_VALUE_NAME: Pcwstr = w("PinRulesLastSyncTime")

public val CERT_PIN_RULES_AUTO_UPDATE_LIST_IDENTIFIER: Pcwstr = w("PinRules_AutoUpdate_1")

public val CERT_PIN_RULES_AUTO_UPDATE_SYNC_DELTA_TIME_VALUE_NAME: Pcwstr = w("PinRulesSyncDeltaTime")

public val CERT_PIN_RULES_CAB_FILENAME: Pcwstr = w("pinrulesstl.cab")

public val CERT_PIN_RULES_CTL_FILENAME: Pcwstr = w("pinrules.stl")

public val CERT_PIN_RULES_CTL_FILENAME_A: Pcstr = s("pinrules.stl")

public val CERT_PIN_SHA256_HASH_PROP_ID: UInt = 124u

public val CERT_PROT_ROOT_DISABLE_CURRENT_USER_FLAG: UInt = 1u

public val CERT_PROT_ROOT_DISABLE_LM_AUTH_FLAG: UInt = 8u

public val CERT_PROT_ROOT_DISABLE_NOT_DEFINED_NAME_CONSTRAINT_FLAG: UInt = 32u

public val CERT_PROT_ROOT_DISABLE_NT_AUTH_REQUIRED_FLAG: UInt = 16u

public val CERT_PROT_ROOT_DISABLE_PEER_TRUST: UInt = 65536u

public val CERT_PROT_ROOT_FLAGS_VALUE_NAME: Pcwstr = w("Flags")

public val CERT_PROT_ROOT_INHIBIT_ADD_AT_INIT_FLAG: UInt = 2u

public val CERT_PROT_ROOT_INHIBIT_PURGE_LM_FLAG: UInt = 4u

public val CERT_PROT_ROOT_ONLY_LM_GPT_FLAG: UInt = 8u

public val CERT_PROT_ROOT_PEER_USAGES_VALUE_NAME: Pcwstr = w("PeerUsages")

public val CERT_PROT_ROOT_PEER_USAGES_VALUE_NAME_A: Pcstr = s("PeerUsages")

public val CERT_PUBKEY_ALG_PARA_PROP_ID: UInt = 22u

public val CERT_PUBKEY_HASH_RESERVED_PROP_ID: UInt = 8u

public val CERT_PUB_KEY_CNG_ALG_BIT_LENGTH_PROP_ID: UInt = 93u

public val CERT_PVK_FILE_PROP_ID: UInt = 12u

public val CERT_QUERY_CONTENT_CERT: CertQueryContentType = 1u

public val CERT_QUERY_CONTENT_CERT_PAIR: CertQueryContentType = 13u

public val CERT_QUERY_CONTENT_CRL: CertQueryContentType = 3u

public val CERT_QUERY_CONTENT_CTL: CertQueryContentType = 2u

public val CERT_QUERY_CONTENT_FLAG_ALL: CertQueryContentTypeFlags = 16382u

public val CERT_QUERY_CONTENT_FLAG_ALL_ISSUER_CERT: CertQueryContentTypeFlags = 818u

public val CERT_QUERY_CONTENT_FLAG_CERT: CertQueryContentTypeFlags = 2u

public val CERT_QUERY_CONTENT_FLAG_CERT_PAIR: CertQueryContentTypeFlags = 8192u

public val CERT_QUERY_CONTENT_FLAG_CRL: CertQueryContentTypeFlags = 8u

public val CERT_QUERY_CONTENT_FLAG_CTL: CertQueryContentTypeFlags = 4u

public val CERT_QUERY_CONTENT_FLAG_PFX: CertQueryContentTypeFlags = 4096u

public val CERT_QUERY_CONTENT_FLAG_PFX_AND_LOAD: CertQueryContentTypeFlags = 16384u

public val CERT_QUERY_CONTENT_FLAG_PKCS10: CertQueryContentTypeFlags = 2048u

public val CERT_QUERY_CONTENT_FLAG_PKCS7_SIGNED: CertQueryContentTypeFlags = 256u

public val CERT_QUERY_CONTENT_FLAG_PKCS7_SIGNED_EMBED: CertQueryContentTypeFlags = 1024u

public val CERT_QUERY_CONTENT_FLAG_PKCS7_UNSIGNED: CertQueryContentTypeFlags = 512u

public val CERT_QUERY_CONTENT_FLAG_SERIALIZED_CERT: CertQueryContentTypeFlags = 32u

public val CERT_QUERY_CONTENT_FLAG_SERIALIZED_CRL: CertQueryContentTypeFlags = 128u

public val CERT_QUERY_CONTENT_FLAG_SERIALIZED_CTL: CertQueryContentTypeFlags = 64u

public val CERT_QUERY_CONTENT_FLAG_SERIALIZED_STORE: CertQueryContentTypeFlags = 16u

public val CERT_QUERY_CONTENT_PFX: CertQueryContentType = 12u

public val CERT_QUERY_CONTENT_PFX_AND_LOAD: CertQueryContentType = 14u

public val CERT_QUERY_CONTENT_PKCS10: CertQueryContentType = 11u

public val CERT_QUERY_CONTENT_PKCS7_SIGNED: CertQueryContentType = 8u

public val CERT_QUERY_CONTENT_PKCS7_SIGNED_EMBED: CertQueryContentType = 10u

public val CERT_QUERY_CONTENT_PKCS7_UNSIGNED: CertQueryContentType = 9u

public val CERT_QUERY_CONTENT_SERIALIZED_CERT: CertQueryContentType = 5u

public val CERT_QUERY_CONTENT_SERIALIZED_CRL: CertQueryContentType = 7u

public val CERT_QUERY_CONTENT_SERIALIZED_CTL: CertQueryContentType = 6u

public val CERT_QUERY_CONTENT_SERIALIZED_STORE: CertQueryContentType = 4u

public val CERT_QUERY_FORMAT_ASN_ASCII_HEX_ENCODED: CertQueryFormatType = 3u

public val CERT_QUERY_FORMAT_BASE64_ENCODED: CertQueryFormatType = 2u

public val CERT_QUERY_FORMAT_BINARY: CertQueryFormatType = 1u

public val CERT_QUERY_FORMAT_FLAG_ALL: CertQueryFormatTypeFlags = 14u

public val CERT_QUERY_FORMAT_FLAG_ASN_ASCII_HEX_ENCODED: CertQueryFormatTypeFlags = 8u

public val CERT_QUERY_FORMAT_FLAG_BASE64_ENCODED: CertQueryFormatTypeFlags = 4u

public val CERT_QUERY_FORMAT_FLAG_BINARY: CertQueryFormatTypeFlags = 2u

public val CERT_QUERY_OBJECT_BLOB: CertQueryObjectType = 2u

public val CERT_QUERY_OBJECT_FILE: CertQueryObjectType = 1u

public val CERT_RDN_ANY_TYPE: CertRdnAttrValueType = 0

public val CERT_RDN_BMP_STRING: CertRdnAttrValueType = 12

public val CERT_RDN_DISABLE_CHECK_TYPE_FLAG: UInt = 1073741824u

public val CERT_RDN_DISABLE_IE4_UTF8_FLAG: UInt = 16777216u

public val CERT_RDN_ENABLE_PUNYCODE_FLAG: UInt = 33554432u

public val CERT_RDN_ENABLE_T61_UNICODE_FLAG: UInt = 2147483648u

public val CERT_RDN_ENABLE_UTF8_UNICODE_FLAG: UInt = 536870912u

public val CERT_RDN_ENCODED_BLOB: CertRdnAttrValueType = 1

public val CERT_RDN_FLAGS_MASK: UInt = 4278190080u

public val CERT_RDN_FORCE_UTF8_UNICODE_FLAG: UInt = 268435456u

public val CERT_RDN_GENERAL_STRING: CertRdnAttrValueType = 10

public val CERT_RDN_GRAPHIC_STRING: CertRdnAttrValueType = 8

public val CERT_RDN_IA5_STRING: CertRdnAttrValueType = 7

public val CERT_RDN_INT4_STRING: CertRdnAttrValueType = 11

public val CERT_RDN_ISO646_STRING: CertRdnAttrValueType = 9

public val CERT_RDN_NUMERIC_STRING: CertRdnAttrValueType = 3

public val CERT_RDN_OCTET_STRING: CertRdnAttrValueType = 2

public val CERT_RDN_PRINTABLE_STRING: CertRdnAttrValueType = 4

public val CERT_RDN_T61_STRING: CertRdnAttrValueType = 5

public val CERT_RDN_TELETEX_STRING: CertRdnAttrValueType = 5

public val CERT_RDN_TYPE_MASK: UInt = 255u

public val CERT_RDN_UNICODE_STRING: CertRdnAttrValueType = 12

public val CERT_RDN_UNIVERSAL_STRING: CertRdnAttrValueType = 11

public val CERT_RDN_UTF8_STRING: CertRdnAttrValueType = 13

public val CERT_RDN_VIDEOTEX_STRING: CertRdnAttrValueType = 6

public val CERT_RDN_VISIBLE_STRING: CertRdnAttrValueType = 9

public val CERT_REGISTRY_STORE_CLIENT_GPT_FLAG: UInt = 2147483648u

public val CERT_REGISTRY_STORE_EXTERNAL_FLAG: UInt = 1048576u

public val CERT_REGISTRY_STORE_LM_GPT_FLAG: UInt = 16777216u

public val CERT_REGISTRY_STORE_MY_IE_DIRTY_FLAG: UInt = 524288u

public val CERT_REGISTRY_STORE_REMOTE_FLAG: UInt = 65536u

public val CERT_REGISTRY_STORE_ROAMING_FLAG: UInt = 262144u

public val CERT_REGISTRY_STORE_SERIALIZED_FLAG: UInt = 131072u

public val CERT_RENEWAL_PROP_ID: UInt = 64u

public val CERT_REQUEST_ORIGINATOR_PROP_ID: UInt = 71u

public val CERT_REQUEST_V1: UInt = 0u

public val CERT_RETRIEVE_BIOMETRIC_PREDEFINED_BASE_TYPE: Pcstr = COpaquePointer(1000.toLong())

public val CERT_RETRIEVE_COMMUNITY_LOGO: Pcstr = COpaquePointer(3.toLong())

public val CERT_RETRIEVE_ISSUER_LOGO: Pcstr = COpaquePointer(1.toLong())

public val CERT_RETRIEVE_SUBJECT_LOGO: Pcstr = COpaquePointer(2.toLong())

public val CERT_RETR_BEHAVIOR_FILE_VALUE_NAME: Pcwstr = w("AllowFileUrlScheme")

public val CERT_RETR_BEHAVIOR_INET_AUTH_VALUE_NAME: Pcwstr = w("EnableInetUnknownAuth")

public val CERT_RETR_BEHAVIOR_INET_STATUS_VALUE_NAME: Pcwstr = w("EnableInetLocal")

public val CERT_RETR_BEHAVIOR_LDAP_VALUE_NAME: Pcwstr = w("DisableLDAPSignAndEncrypt")

public val CERT_ROOT_PROGRAM_CERT_POLICIES_PROP_ID: UInt = 83u

public val CERT_ROOT_PROGRAM_CHAIN_POLICIES_PROP_ID: UInt = 105u

public val CERT_ROOT_PROGRAM_FLAG_ADDRESS: UInt = 8u

public val CERT_ROOT_PROGRAM_FLAG_LSC: CertRootProgramFlags = 64u

public val CERT_ROOT_PROGRAM_FLAG_ORG: CertRootProgramFlags = 128u

public val CERT_ROOT_PROGRAM_FLAG_OU: UInt = 16u

public val CERT_ROOT_PROGRAM_FLAG_SUBJECT_LOGO: CertRootProgramFlags = 32u

public val CERT_ROOT_PROGRAM_NAME_CONSTRAINTS_PROP_ID: UInt = 84u

public val CERT_RSA_PUBLIC_KEY_OBJID: Pcwstr = w("1.2.840.113549.1.1.1")

public val CERT_SCARD_PIN_ID_PROP_ID: UInt = 90u

public val CERT_SCARD_PIN_INFO_PROP_ID: UInt = 91u

public val CERT_SCEP_CA_CERT_PROP_ID: UInt = 111u

public val CERT_SCEP_ENCRYPT_HASH_CNG_ALG_PROP_ID: UInt = 114u

public val CERT_SCEP_FLAGS_PROP_ID: UInt = 115u

public val CERT_SCEP_GUID_PROP_ID: UInt = 116u

public val CERT_SCEP_NONCE_PROP_ID: UInt = 113u

public val CERT_SCEP_RA_ENCRYPTION_CERT_PROP_ID: UInt = 110u

public val CERT_SCEP_RA_SIGNATURE_CERT_PROP_ID: UInt = 109u

public val CERT_SCEP_SERVER_CERTS_PROP_ID: UInt = 108u

public val CERT_SCEP_SIGNER_CERT_PROP_ID: UInt = 112u

public val CERT_SELECT_ALLOW_DUPLICATES: UInt = 128u

public val CERT_SELECT_ALLOW_EXPIRED: UInt = 1u

public val CERT_SELECT_BY_ENHKEY_USAGE: CertSelectCriteriaType = 1u

public val CERT_SELECT_BY_EXTENSION: CertSelectCriteriaType = 5u

public val CERT_SELECT_BY_FRIENDLYNAME: UInt = 13u

public val CERT_SELECT_BY_ISSUER_ATTR: CertSelectCriteriaType = 7u

public val CERT_SELECT_BY_ISSUER_DISPLAYNAME: UInt = 12u

public val CERT_SELECT_BY_ISSUER_NAME: CertSelectCriteriaType = 9u

public val CERT_SELECT_BY_KEY_USAGE: CertSelectCriteriaType = 2u

public val CERT_SELECT_BY_POLICY_OID: CertSelectCriteriaType = 3u

public val CERT_SELECT_BY_PROV_NAME: CertSelectCriteriaType = 4u

public val CERT_SELECT_BY_PUBLIC_KEY: CertSelectCriteriaType = 10u

public val CERT_SELECT_BY_SUBJECT_ATTR: CertSelectCriteriaType = 8u

public val CERT_SELECT_BY_SUBJECT_HOST_NAME: CertSelectCriteriaType = 6u

public val CERT_SELECT_BY_THUMBPRINT: UInt = 14u

public val CERT_SELECT_BY_TLS_SIGNATURES: CertSelectCriteriaType = 11u

public val CERT_SELECT_DISALLOW_SELFSIGNED: UInt = 4u

public val CERT_SELECT_HARDWARE_ONLY: UInt = 64u

public val CERT_SELECT_HAS_KEY_FOR_KEY_EXCHANGE: UInt = 32u

public val CERT_SELECT_HAS_KEY_FOR_SIGNATURE: UInt = 16u

public val CERT_SELECT_HAS_PRIVATE_KEY: UInt = 8u

public val CERT_SELECT_IGNORE_AUTOSELECT: UInt = 256u

public val CERT_SELECT_MAX_PARA: UInt = 500u

public val CERT_SELECT_TRUSTED_ROOT: UInt = 2u

public val CERT_SEND_AS_TRUSTED_ISSUER_PROP_ID: UInt = 102u

public val CERT_SERIALIZABLE_KEY_CONTEXT_PROP_ID: UInt = 117u

public val CERT_SERIAL_CHAIN_PROP_ID: UInt = 119u

public val CERT_SERVER_OCSP_RESPONSE_ASYNC_FLAG: UInt = 1u

public val CERT_SERVER_OCSP_RESPONSE_OPEN_PARA_READ_FLAG: UInt = 1u

public val CERT_SERVER_OCSP_RESPONSE_OPEN_PARA_WRITE_FLAG: UInt = 2u

public val CERT_SET_KEY_CONTEXT_PROP_ID: CryptKeyFlags = 1u

public val CERT_SET_KEY_PROV_HANDLE_PROP_ID: CryptKeyFlags = 1u

public val CERT_SET_PROPERTY_IGNORE_PERSIST_ERROR_FLAG: UInt = 2147483648u

public val CERT_SET_PROPERTY_INHIBIT_PERSIST_FLAG: UInt = 1073741824u

public val CERT_SHA1_HASH_PROP_ID: UInt = 3u

public val CERT_SHA256_HASH_PROP_ID: UInt = 107u

public val CERT_SIGNATURE_HASH_PROP_ID: UInt = 15u

public val CERT_SIGN_HASH_CNG_ALG_PROP_ID: UInt = 89u

public val CERT_SIMPLE_NAME_STR: CertStringType = 1u

public val CERT_SMART_CARD_DATA_PROP_ID: UInt = 16u

public val CERT_SMART_CARD_READER_NON_REMOVABLE_PROP_ID: UInt = 106u

public val CERT_SMART_CARD_READER_PROP_ID: UInt = 101u

public val CERT_SMART_CARD_ROOT_INFO_PROP_ID: UInt = 76u

public val CERT_SOURCE_LOCATION_PROP_ID: UInt = 72u

public val CERT_SOURCE_URL_PROP_ID: UInt = 73u

public val CERT_SRV_OCSP_RESP_MAX_BEFORE_NEXT_UPDATE_SECONDS_VALUE_NAME: Pcwstr = w("SrvOcspRespMaxBeforeNextUpdateSeconds")

public val CERT_SRV_OCSP_RESP_MAX_SYNC_CERT_FILE_SECONDS_VALUE_NAME: Pcwstr = w("SrvOcspRespMaxSyncCertFileSeconds")

public val CERT_SRV_OCSP_RESP_MIN_AFTER_NEXT_UPDATE_SECONDS_VALUE_NAME: Pcwstr = w("SrvOcspRespMinAfterNextUpdateSeconds")

public val CERT_SRV_OCSP_RESP_MIN_BEFORE_NEXT_UPDATE_SECONDS_VALUE_NAME: Pcwstr = w("SrvOcspRespMinBeforeNextUpdateSeconds")

public val CERT_SRV_OCSP_RESP_MIN_SYNC_CERT_FILE_SECONDS_DEFAULT: UInt = 5u

public val CERT_SRV_OCSP_RESP_MIN_SYNC_CERT_FILE_SECONDS_VALUE_NAME: Pcwstr = w("SrvOcspRespMinSyncCertFileSeconds")

public val CERT_SRV_OCSP_RESP_MIN_VALIDITY_SECONDS_VALUE_NAME: Pcwstr = w("SrvOcspRespMinValiditySeconds")

public val CERT_SRV_OCSP_RESP_URL_RETRIEVAL_TIMEOUT_MILLISECONDS_VALUE_NAME: Pcwstr = w("SrvOcspRespUrlRetrievalTimeoutMilliseconds")

public val CERT_STORE_ADD_ALWAYS: UInt = 4u

public val CERT_STORE_ADD_NEW: UInt = 1u

public val CERT_STORE_ADD_NEWER: UInt = 6u

public val CERT_STORE_ADD_NEWER_INHERIT_PROPERTIES: UInt = 7u

public val CERT_STORE_ADD_REPLACE_EXISTING: UInt = 3u

public val CERT_STORE_ADD_REPLACE_EXISTING_INHERIT_PROPERTIES: UInt = 5u

public val CERT_STORE_ADD_USE_EXISTING: UInt = 2u

public val CERT_STORE_BACKUP_RESTORE_FLAG: CertOpenStoreFlags = 2048u

public val CERT_STORE_BASE_CRL_FLAG: UInt = 256u

public val CERT_STORE_CERTIFICATE_CONTEXT: UInt = 1u

public val CERT_STORE_CREATE_NEW_FLAG: CertOpenStoreFlags = 8192u

public val CERT_STORE_CRL_CONTEXT: UInt = 2u

public val CERT_STORE_CTL_CONTEXT: UInt = 3u

public val CERT_STORE_CTRL_AUTO_RESYNC: UInt = 4u

public val CERT_STORE_CTRL_CANCEL_NOTIFY: UInt = 5u

public val CERT_STORE_CTRL_COMMIT: UInt = 3u

public val CERT_STORE_CTRL_COMMIT_CLEAR_FLAG: CertControlStoreFlags = 2u

public val CERT_STORE_CTRL_COMMIT_FORCE_FLAG: CertControlStoreFlags = 1u

public val CERT_STORE_CTRL_INHIBIT_DUPLICATE_HANDLE_FLAG: CertControlStoreFlags = 1u

public val CERT_STORE_CTRL_NOTIFY_CHANGE: UInt = 2u

public val CERT_STORE_CTRL_RESYNC: UInt = 1u

public val CERT_STORE_DEFER_CLOSE_UNTIL_LAST_FREE_FLAG: CertOpenStoreFlags = 4u

public val CERT_STORE_DELETE_FLAG: CertOpenStoreFlags = 16u

public val CERT_STORE_DELTA_CRL_FLAG: UInt = 512u

public val CERT_STORE_ENUM_ARCHIVED_FLAG: CertOpenStoreFlags = 512u

public val CERT_STORE_LOCALIZED_NAME_PROP_ID: UInt = 4096u

public val CERT_STORE_MANIFOLD_FLAG: UInt = 256u

public val CERT_STORE_MAXIMUM_ALLOWED_FLAG: CertOpenStoreFlags = 4096u

public val CERT_STORE_NO_CRL_FLAG: UInt = 65536u

public val CERT_STORE_NO_CRYPT_RELEASE_FLAG: CertOpenStoreFlags = 1u

public val CERT_STORE_NO_ISSUER_FLAG: UInt = 131072u

public val CERT_STORE_OPEN_EXISTING_FLAG: CertOpenStoreFlags = 16384u

public val CERT_STORE_PROV_CLOSE_FUNC: UInt = 0u

public val CERT_STORE_PROV_COLLECTION: Pcstr = COpaquePointer(11.toLong())

public val CERT_STORE_PROV_CONTROL_FUNC: UInt = 13u

public val CERT_STORE_PROV_DELETED_FLAG: CertStoreProvFlags = 2u

public val CERT_STORE_PROV_DELETE_CERT_FUNC: UInt = 3u

public val CERT_STORE_PROV_DELETE_CRL_FUNC: UInt = 7u

public val CERT_STORE_PROV_DELETE_CTL_FUNC: UInt = 11u

public val CERT_STORE_PROV_EXTERNAL_FLAG: CertStoreProvFlags = 1u

public val CERT_STORE_PROV_FILE: Pcstr = COpaquePointer(3.toLong())

public val CERT_STORE_PROV_FILENAME: Int = 8

public val CERT_STORE_PROV_FILENAME_A: Pcstr = COpaquePointer(7.toLong())

public val CERT_STORE_PROV_FILENAME_W: Pcstr = COpaquePointer(8.toLong())

public val CERT_STORE_PROV_FIND_CERT_FUNC: UInt = 14u

public val CERT_STORE_PROV_FIND_CRL_FUNC: UInt = 17u

public val CERT_STORE_PROV_FIND_CTL_FUNC: UInt = 20u

public val CERT_STORE_PROV_FREE_FIND_CERT_FUNC: UInt = 15u

public val CERT_STORE_PROV_FREE_FIND_CRL_FUNC: UInt = 18u

public val CERT_STORE_PROV_FREE_FIND_CTL_FUNC: UInt = 21u

public val CERT_STORE_PROV_GET_CERT_PROPERTY_FUNC: UInt = 16u

public val CERT_STORE_PROV_GET_CRL_PROPERTY_FUNC: UInt = 19u

public val CERT_STORE_PROV_GET_CTL_PROPERTY_FUNC: UInt = 22u

public val CERT_STORE_PROV_GP_SYSTEM_STORE_FLAG: UInt = 32u

public val CERT_STORE_PROV_LDAP: Int = 16

public val CERT_STORE_PROV_LDAP_W: Pcstr = COpaquePointer(16.toLong())

public val CERT_STORE_PROV_LM_SYSTEM_STORE_FLAG: CertStoreProvFlags = 16u

public val CERT_STORE_PROV_MEMORY: Pcstr = COpaquePointer(2.toLong())

public val CERT_STORE_PROV_MSG: Pcstr = COpaquePointer(1.toLong())

public val CERT_STORE_PROV_NO_PERSIST_FLAG: CertStoreProvFlags = 4u

public val CERT_STORE_PROV_PHYSICAL: Int = 14

public val CERT_STORE_PROV_PHYSICAL_W: Pcstr = COpaquePointer(14.toLong())

public val CERT_STORE_PROV_PKCS12: Pcstr = COpaquePointer(17.toLong())

public val CERT_STORE_PROV_PKCS7: Pcstr = COpaquePointer(5.toLong())

public val CERT_STORE_PROV_READ_CERT_FUNC: UInt = 1u

public val CERT_STORE_PROV_READ_CRL_FUNC: UInt = 5u

public val CERT_STORE_PROV_READ_CTL_FUNC: UInt = 9u

public val CERT_STORE_PROV_REG: Pcstr = COpaquePointer(4.toLong())

public val CERT_STORE_PROV_SERIALIZED: Pcstr = COpaquePointer(6.toLong())

public val CERT_STORE_PROV_SET_CERT_PROPERTY_FUNC: UInt = 4u

public val CERT_STORE_PROV_SET_CRL_PROPERTY_FUNC: UInt = 8u

public val CERT_STORE_PROV_SET_CTL_PROPERTY_FUNC: UInt = 12u

public val CERT_STORE_PROV_SHARED_USER_FLAG: UInt = 64u

public val CERT_STORE_PROV_SMART_CARD: Int = 15

public val CERT_STORE_PROV_SMART_CARD_W: Pcstr = COpaquePointer(15.toLong())

public val CERT_STORE_PROV_SYSTEM: Int = 10

public val CERT_STORE_PROV_SYSTEM_A: Pcstr = COpaquePointer(9.toLong())

public val CERT_STORE_PROV_SYSTEM_REGISTRY: Int = 13

public val CERT_STORE_PROV_SYSTEM_REGISTRY_A: Pcstr = COpaquePointer(12.toLong())

public val CERT_STORE_PROV_SYSTEM_REGISTRY_W: Pcstr = COpaquePointer(13.toLong())

public val CERT_STORE_PROV_SYSTEM_STORE_FLAG: CertStoreProvFlags = 8u

public val CERT_STORE_PROV_SYSTEM_W: Pcstr = COpaquePointer(10.toLong())

public val CERT_STORE_PROV_WRITE_ADD_FLAG: UInt = 1u

public val CERT_STORE_PROV_WRITE_CERT_FUNC: UInt = 2u

public val CERT_STORE_PROV_WRITE_CRL_FUNC: UInt = 6u

public val CERT_STORE_PROV_WRITE_CTL_FUNC: UInt = 10u

public val CERT_STORE_READONLY_FLAG: CertOpenStoreFlags = 32768u

public val CERT_STORE_REVOCATION_FLAG: UInt = 4u

public val CERT_STORE_SAVE_AS_PKCS12: UInt = 3u

public val CERT_STORE_SAVE_AS_PKCS7: CertStoreSaveAs = 2u

public val CERT_STORE_SAVE_AS_STORE: CertStoreSaveAs = 1u

public val CERT_STORE_SAVE_TO_FILE: CertStoreSaveTo = 1u

public val CERT_STORE_SAVE_TO_FILENAME: CertStoreSaveTo = 4u

public val CERT_STORE_SAVE_TO_FILENAME_A: CertStoreSaveTo = 3u

public val CERT_STORE_SAVE_TO_FILENAME_W: CertStoreSaveTo = 4u

public val CERT_STORE_SAVE_TO_MEMORY: CertStoreSaveTo = 2u

public val CERT_STORE_SET_LOCALIZED_NAME_FLAG: CertOpenStoreFlags = 2u

public val CERT_STORE_SHARE_CONTEXT_FLAG: CertOpenStoreFlags = 128u

public val CERT_STORE_SHARE_STORE_FLAG: UInt = 64u

public val CERT_STORE_SIGNATURE_FLAG: UInt = 1u

public val CERT_STORE_TIME_VALIDITY_FLAG: UInt = 2u

public val CERT_STORE_UNSAFE_PHYSICAL_FLAG: UInt = 32u

public val CERT_STORE_UPDATE_KEYID_FLAG: CertOpenStoreFlags = 1024u

public val CERT_STRONG_SIGN_ECDSA_ALGORITHM: Pcwstr = w("ECDSA")

public val CERT_STRONG_SIGN_ENABLE_CRL_CHECK: CertStrongSignFlags = 1u

public val CERT_STRONG_SIGN_ENABLE_OCSP_CHECK: CertStrongSignFlags = 2u

public val CERT_STRONG_SIGN_OID_INFO_CHOICE: UInt = 2u

public val CERT_STRONG_SIGN_SERIALIZED_INFO_CHOICE: UInt = 1u

public val CERT_SUBJECT_DISABLE_CRL_PROP_ID: UInt = 86u

public val CERT_SUBJECT_INFO_ACCESS_PROP_ID: UInt = 80u

public val CERT_SUBJECT_NAME_MD5_HASH_PROP_ID: UInt = 29u

public val CERT_SUBJECT_OCSP_AUTHORITY_INFO_ACCESS_PROP_ID: UInt = 85u

public val CERT_SUBJECT_PUBLIC_KEY_MD5_HASH_PROP_ID: UInt = 25u

public val CERT_SUBJECT_PUB_KEY_BIT_LENGTH_PROP_ID: UInt = 92u

public val CERT_SYSTEM_STORE_CURRENT_SERVICE_ID: UInt = 4u

public val CERT_SYSTEM_STORE_CURRENT_USER: UInt = 65536u

public val CERT_SYSTEM_STORE_CURRENT_USER_GROUP_POLICY_ID: UInt = 7u

public val CERT_SYSTEM_STORE_CURRENT_USER_ID: UInt = 1u

public val CERT_SYSTEM_STORE_DEFER_READ_FLAG: UInt = 536870912u

public val CERT_SYSTEM_STORE_LOCAL_MACHINE: UInt = 131072u

public val CERT_SYSTEM_STORE_LOCAL_MACHINE_ENTERPRISE_ID: UInt = 9u

public val CERT_SYSTEM_STORE_LOCAL_MACHINE_GROUP_POLICY_ID: UInt = 8u

public val CERT_SYSTEM_STORE_LOCAL_MACHINE_ID: UInt = 2u

public val CERT_SYSTEM_STORE_LOCAL_MACHINE_WCOS_ID: UInt = 10u

public val CERT_SYSTEM_STORE_LOCATION_MASK: CertSystemStoreFlags = 16711680u

public val CERT_SYSTEM_STORE_LOCATION_SHIFT: UInt = 16u

public val CERT_SYSTEM_STORE_MASK: UInt = 4294901760u

public val CERT_SYSTEM_STORE_RELOCATE_FLAG: CertSystemStoreFlags = 2147483648u

public val CERT_SYSTEM_STORE_SERVICES_ID: UInt = 5u

public val CERT_SYSTEM_STORE_UNPROTECTED_FLAG: UInt = 1073741824u

public val CERT_SYSTEM_STORE_USERS_ID: UInt = 6u

public val CERT_TIMESTAMP_HASH_USE_TYPE: UInt = 2u

public val CERT_TRUST_AUTO_UPDATE_CA_REVOCATION: UInt = 16u

public val CERT_TRUST_AUTO_UPDATE_END_REVOCATION: UInt = 32u

public val CERT_TRUST_BEFORE_DISALLOWED_CA_FILETIME: UInt = 2097152u

public val CERT_TRUST_CTL_IS_NOT_SIGNATURE_VALID: UInt = 262144u

public val CERT_TRUST_CTL_IS_NOT_TIME_VALID: UInt = 131072u

public val CERT_TRUST_CTL_IS_NOT_VALID_FOR_USAGE: UInt = 524288u

public val CERT_TRUST_HAS_ALLOW_WEAK_SIGNATURE: UInt = 131072u

public val CERT_TRUST_HAS_AUTO_UPDATE_WEAK_SIGNATURE: UInt = 32768u

public val CERT_TRUST_HAS_CRL_VALIDITY_EXTENDED: UInt = 4096u

public val CERT_TRUST_HAS_EXACT_MATCH_ISSUER: UInt = 1u

public val CERT_TRUST_HAS_EXCLUDED_NAME_CONSTRAINT: UInt = 32768u

public val CERT_TRUST_HAS_ISSUANCE_CHAIN_POLICY: UInt = 512u

public val CERT_TRUST_HAS_KEY_MATCH_ISSUER: UInt = 2u

public val CERT_TRUST_HAS_NAME_MATCH_ISSUER: UInt = 4u

public val CERT_TRUST_HAS_NOT_DEFINED_NAME_CONSTRAINT: UInt = 8192u

public val CERT_TRUST_HAS_NOT_PERMITTED_NAME_CONSTRAINT: UInt = 16384u

public val CERT_TRUST_HAS_NOT_SUPPORTED_CRITICAL_EXT: UInt = 134217728u

public val CERT_TRUST_HAS_NOT_SUPPORTED_NAME_CONSTRAINT: UInt = 4096u

public val CERT_TRUST_HAS_PREFERRED_ISSUER: UInt = 256u

public val CERT_TRUST_HAS_VALID_NAME_CONSTRAINTS: UInt = 1024u

public val CERT_TRUST_HAS_WEAK_HYGIENE: UInt = 2097152u

public val CERT_TRUST_HAS_WEAK_SIGNATURE: UInt = 1048576u

public val CERT_TRUST_INVALID_BASIC_CONSTRAINTS: UInt = 1024u

public val CERT_TRUST_INVALID_EXTENSION: UInt = 256u

public val CERT_TRUST_INVALID_NAME_CONSTRAINTS: UInt = 2048u

public val CERT_TRUST_INVALID_POLICY_CONSTRAINTS: UInt = 512u

public val CERT_TRUST_IS_CA_TRUSTED: UInt = 16384u

public val CERT_TRUST_IS_COMPLEX_CHAIN: UInt = 65536u

public val CERT_TRUST_IS_CYCLIC: UInt = 128u

public val CERT_TRUST_IS_EXPLICIT_DISTRUST: UInt = 67108864u

public val CERT_TRUST_IS_FROM_EXCLUSIVE_TRUST_STORE: UInt = 8192u

public val CERT_TRUST_IS_KEY_ROLLOVER: UInt = 128u

public val CERT_TRUST_IS_NOT_SIGNATURE_VALID: UInt = 8u

public val CERT_TRUST_IS_NOT_TIME_NESTED: UInt = 2u

public val CERT_TRUST_IS_NOT_TIME_VALID: UInt = 1u

public val CERT_TRUST_IS_NOT_VALID_FOR_USAGE: UInt = 16u

public val CERT_TRUST_IS_OFFLINE_REVOCATION: UInt = 16777216u

public val CERT_TRUST_IS_PARTIAL_CHAIN: UInt = 65536u

public val CERT_TRUST_IS_PEER_TRUSTED: UInt = 2048u

public val CERT_TRUST_IS_REVOKED: UInt = 4u

public val CERT_TRUST_IS_SELF_SIGNED: UInt = 8u

public val CERT_TRUST_IS_UNTRUSTED_ROOT: UInt = 32u

public val CERT_TRUST_NO_ERROR: UInt = 0u

public val CERT_TRUST_NO_ISSUANCE_CHAIN_POLICY: UInt = 33554432u

public val CERT_TRUST_NO_OCSP_FAILOVER_TO_CRL: UInt = 64u

public val CERT_TRUST_NO_TIME_CHECK: UInt = 33554432u

public val CERT_TRUST_PUB_ALLOW_END_USER_TRUST: UInt = 0u

public val CERT_TRUST_PUB_ALLOW_ENTERPRISE_ADMIN_TRUST: UInt = 2u

public val CERT_TRUST_PUB_ALLOW_MACHINE_ADMIN_TRUST: UInt = 1u

public val CERT_TRUST_PUB_ALLOW_TRUST_MASK: UInt = 3u

public val CERT_TRUST_PUB_AUTHENTICODE_FLAGS_VALUE_NAME: Pcwstr = w("AuthenticodeFlags")

public val CERT_TRUST_PUB_CHECK_PUBLISHER_REV_FLAG: UInt = 256u

public val CERT_TRUST_PUB_CHECK_TIMESTAMP_REV_FLAG: UInt = 512u

public val CERT_TRUST_REVOCATION_STATUS_UNKNOWN: UInt = 64u

public val CERT_TRUST_SSL_HANDSHAKE_OCSP: UInt = 262144u

public val CERT_TRUST_SSL_RECONNECT_OCSP: UInt = 1048576u

public val CERT_TRUST_SSL_TIME_VALID: UInt = 16777216u

public val CERT_TRUST_SSL_TIME_VALID_OCSP: UInt = 524288u

public val CERT_UNICODE_ATTR_ERR_INDEX_MASK: UInt = 63u

public val CERT_UNICODE_ATTR_ERR_INDEX_SHIFT: UInt = 16u

public val CERT_UNICODE_IS_RDN_ATTRS_FLAG: UInt = 1u

public val CERT_UNICODE_RDN_ERR_INDEX_MASK: UInt = 1023u

public val CERT_UNICODE_RDN_ERR_INDEX_SHIFT: UInt = 22u

public val CERT_UNICODE_VALUE_ERR_INDEX_MASK: UInt = 65535u

public val CERT_UNICODE_VALUE_ERR_INDEX_SHIFT: UInt = 0u

public val CERT_V1: UInt = 0u

public val CERT_V2: UInt = 1u

public val CERT_V3: UInt = 2u

public val CERT_VERIFY_ALLOW_MORE_USAGE_FLAG: UInt = 8u

public val CERT_VERIFY_CACHE_ONLY_BASED_REVOCATION: UInt = 2u

public val CERT_VERIFY_INHIBIT_CTL_UPDATE_FLAG: UInt = 1u

public val CERT_VERIFY_NO_TIME_CHECK_FLAG: UInt = 4u

public val CERT_VERIFY_REV_ACCUMULATIVE_TIMEOUT_FLAG: UInt = 4u

public val CERT_VERIFY_REV_CHAIN_FLAG: UInt = 1u

public val CERT_VERIFY_REV_NO_OCSP_FAILOVER_TO_CRL_FLAG: UInt = 16u

public val CERT_VERIFY_REV_SERVER_OCSP_FLAG: UInt = 8u

public val CERT_VERIFY_REV_SERVER_OCSP_WIRE_ONLY_FLAG: UInt = 32u

public val CERT_VERIFY_TRUSTED_SIGNERS_FLAG: UInt = 2u

public val CERT_VERIFY_UPDATED_CTL_FLAG: UInt = 1u

public val CERT_X500_NAME_STR: CertStringType = 3u

public val CERT_XML_NAME_STR: UInt = 4u

public val CKP_BLOCK_LENGTH: Pcwstr = w("BlockLength")

public val CKP_CHAINING_MODE: Pcwstr = w("ChainingMode")

public val CKP_INITIALIZATION_VECTOR: Pcwstr = w("IV")

public val CLMD_FILE_TAG_CARD_AUTH_CERT: UInt = 6275329u

public val CLMD_FILE_TAG_CARD_CAPABILITY_CONTAINER: UInt = 6275335u

public val CLMD_FILE_TAG_CHUID: UInt = 6275330u

public val CLMD_FILE_TAG_FACIAL_IMAGE: UInt = 6275336u

public val CLMD_FILE_TAG_FINGERPRINT: UInt = 6275331u

public val CLMD_FILE_TAG_FIRST_RETIRED_KEY_MGMT_KEY: UInt = 6275341u

public val CLMD_FILE_TAG_KEY_HISTORY: UInt = 6275340u

public val CLMD_FILE_TAG_KEY_MGMT_CERT: UInt = 6275339u

public val CLMD_FILE_TAG_LAST_RETIRED_KEY_MGMT_KEY: UInt = 6275360u

public val CLMD_FILE_TAG_PIV_AUTH_CERT: UInt = 6275333u

public val CLMD_FILE_TAG_PRINTED_INFORMATION: UInt = 6275337u

public val CLMD_FILE_TAG_SECURITY_OBJECT: UInt = 6275334u

public val CLMD_FILE_TAG_SIG_CERT: UInt = 6275338u

public val CLMD_FILE_TAG_UNSIGNED_CHUID: UInt = 6275332u

public val CLMD_PIV_CERT_DATA_CURRENT_VERSION: UInt = 0u

public val CLMD_PIV_GENERATE_ASYMMETRIC_KEY_CURRENT_VERSION: UInt = 0u

public val CLMD_PIV_PUBLIC_KEY_DATA_CURRENT_VERSION: UInt = 0u

public val CMC_ADD_ATTRIBUTES: Pcstr = COpaquePointer(63.toLong())

public val CMC_ADD_EXTENSIONS: Pcstr = COpaquePointer(62.toLong())

public val CMC_DATA: Pcstr = COpaquePointer(59.toLong())

public val CMC_FAIL_BAD_ALG: UInt = 0u

public val CMC_FAIL_BAD_CERT_ID: UInt = 4u

public val CMC_FAIL_BAD_IDENTITY: UInt = 7u

public val CMC_FAIL_BAD_MESSAGE_CHECK: UInt = 1u

public val CMC_FAIL_BAD_REQUEST: UInt = 2u

public val CMC_FAIL_BAD_TIME: UInt = 3u

public val CMC_FAIL_INTERNAL_CA_ERROR: UInt = 11u

public val CMC_FAIL_MUST_ARCHIVE_KEYS: UInt = 6u

public val CMC_FAIL_NO_KEY_REUSE: UInt = 10u

public val CMC_FAIL_POP_FAILED: UInt = 9u

public val CMC_FAIL_POP_REQUIRED: UInt = 8u

public val CMC_FAIL_TRY_LATER: UInt = 12u

public val CMC_FAIL_UNSUPORTED_EXT: UInt = 5u

public val CMC_OTHER_INFO_FAIL_CHOICE: UInt = 1u

public val CMC_OTHER_INFO_NO_CHOICE: UInt = 0u

public val CMC_OTHER_INFO_PEND_CHOICE: UInt = 2u

public val CMC_RESPONSE: Pcstr = COpaquePointer(60.toLong())

public val CMC_STATUS: Pcstr = COpaquePointer(61.toLong())

public val CMC_STATUS_CONFIRM_REQUIRED: UInt = 5u

public val CMC_STATUS_FAILED: UInt = 2u

public val CMC_STATUS_NO_SUPPORT: UInt = 4u

public val CMC_STATUS_PENDING: UInt = 3u

public val CMC_STATUS_SUCCESS: UInt = 0u

public val CMC_TAGGED_CERT_REQUEST_CHOICE: UInt = 1u

public val CMSCEP_SETUP: Guid = Guid.fromU128(U128(0xaa4f5c028e7c49c4uL, 0x94fa67a5cc5eadb4uL))

public val CMSG_ATTR_CERT_COUNT_PARAM: UInt = 31u

public val CMSG_ATTR_CERT_PARAM: UInt = 32u

public val CMSG_AUTHENTICATED_ATTRIBUTES_FLAG: UInt = 8u

public val CMSG_BARE_CONTENT_FLAG: UInt = 1u

public val CMSG_BARE_CONTENT_PARAM: UInt = 3u

public val CMSG_CERT_COUNT_PARAM: UInt = 11u

public val CMSG_CERT_PARAM: UInt = 12u

public val CMSG_CMS_ENCAPSULATED_CONTENT_FLAG: UInt = 64u

public val CMSG_CMS_ENCAPSULATED_CTL_FLAG: UInt = 32768u

public val CMSG_CMS_RECIPIENT_COUNT_PARAM: UInt = 33u

public val CMSG_CMS_RECIPIENT_ENCRYPTED_KEY_INDEX_PARAM: UInt = 35u

public val CMSG_CMS_RECIPIENT_INDEX_PARAM: UInt = 34u

public val CMSG_CMS_RECIPIENT_INFO_PARAM: UInt = 36u

public val CMSG_CMS_SIGNER_INFO_PARAM: UInt = 39u

public val CMSG_COMPUTED_HASH_PARAM: UInt = 22u

public val CMSG_CONTENTS_OCTETS_FLAG: UInt = 16u

public val CMSG_CONTENT_ENCRYPT_FREE_OBJID_FLAG: UInt = 2u

public val CMSG_CONTENT_ENCRYPT_FREE_PARA_FLAG: UInt = 1u

public val CMSG_CONTENT_ENCRYPT_PAD_ENCODED_LEN_FLAG: UInt = 1u

public val CMSG_CONTENT_ENCRYPT_RELEASE_CONTEXT_FLAG: UInt = 32768u

public val CMSG_CONTENT_PARAM: UInt = 2u

public val CMSG_CRL_COUNT_PARAM: UInt = 13u

public val CMSG_CRL_PARAM: UInt = 14u

public val CMSG_CRYPT_RELEASE_CONTEXT_FLAG: UInt = 32768u

public val CMSG_CTRL_ADD_ATTR_CERT: UInt = 14u

public val CMSG_CTRL_ADD_CERT: UInt = 10u

public val CMSG_CTRL_ADD_CMS_SIGNER_INFO: UInt = 20u

public val CMSG_CTRL_ADD_CRL: UInt = 12u

public val CMSG_CTRL_ADD_SIGNER: UInt = 6u

public val CMSG_CTRL_ADD_SIGNER_UNAUTH_ATTR: UInt = 8u

public val CMSG_CTRL_DECRYPT: UInt = 2u

public val CMSG_CTRL_DEL_ATTR_CERT: UInt = 15u

public val CMSG_CTRL_DEL_CERT: UInt = 11u

public val CMSG_CTRL_DEL_CRL: UInt = 13u

public val CMSG_CTRL_DEL_SIGNER: UInt = 7u

public val CMSG_CTRL_DEL_SIGNER_UNAUTH_ATTR: UInt = 9u

public val CMSG_CTRL_ENABLE_STRONG_SIGNATURE: UInt = 21u

public val CMSG_CTRL_KEY_AGREE_DECRYPT: UInt = 17u

public val CMSG_CTRL_KEY_TRANS_DECRYPT: UInt = 16u

public val CMSG_CTRL_MAIL_LIST_DECRYPT: UInt = 18u

public val CMSG_CTRL_VERIFY_HASH: UInt = 5u

public val CMSG_CTRL_VERIFY_SIGNATURE: UInt = 1u

public val CMSG_CTRL_VERIFY_SIGNATURE_EX: UInt = 19u

public val CMSG_DATA: CryptMsgType = 1u

public val CMSG_DEFAULT_INSTALLABLE_FUNC_OID: Pcstr = COpaquePointer(1.toLong())

public val CMSG_DETACHED_FLAG: UInt = 4u

public val CMSG_ENCODED_MESSAGE: UInt = 29u

public val CMSG_ENCODED_SIGNER: UInt = 28u

public val CMSG_ENCODE_HASHED_SUBJECT_IDENTIFIER_FLAG: UInt = 2u

public val CMSG_ENCODE_SORTED_CTL_FLAG: UInt = 1u

public val CMSG_ENCODING_TYPE_MASK: UInt = 4294901760u

public val CMSG_ENCRYPTED: UInt = 6u

public val CMSG_ENCRYPTED_DIGEST: UInt = 27u

public val CMSG_ENCRYPT_PARAM: UInt = 26u

public val CMSG_ENVELOPED: CryptMsgType = 3u

public val CMSG_ENVELOPED_DATA_CMS_VERSION: UInt = 2u

public val CMSG_ENVELOPED_DATA_PKCS_1_5_VERSION: UInt = 0u

public val CMSG_ENVELOPED_DATA_V0: UInt = 0u

public val CMSG_ENVELOPED_DATA_V2: UInt = 2u

public val CMSG_ENVELOPED_RECIPIENT_V0: UInt = 0u

public val CMSG_ENVELOPED_RECIPIENT_V2: UInt = 2u

public val CMSG_ENVELOPED_RECIPIENT_V3: UInt = 3u

public val CMSG_ENVELOPED_RECIPIENT_V4: UInt = 4u

public val CMSG_ENVELOPE_ALGORITHM_PARAM: UInt = 15u

public val CMSG_HASHED: CryptMsgType = 5u

public val CMSG_HASHED_DATA_CMS_VERSION: UInt = 2u

public val CMSG_HASHED_DATA_PKCS_1_5_VERSION: UInt = 0u

public val CMSG_HASHED_DATA_V0: UInt = 0u

public val CMSG_HASHED_DATA_V2: UInt = 2u

public val CMSG_HASH_ALGORITHM_PARAM: UInt = 20u

public val CMSG_HASH_DATA_PARAM: UInt = 21u

public val CMSG_INDEFINITE_LENGTH: UInt = 4294967295u

public val CMSG_INNER_CONTENT_TYPE_PARAM: UInt = 4u

public val CMSG_KEY_AGREE_ENCRYPT_FREE_MATERIAL_FLAG: UInt = 2u

public val CMSG_KEY_AGREE_ENCRYPT_FREE_OBJID_FLAG: UInt = 32u

public val CMSG_KEY_AGREE_ENCRYPT_FREE_PARA_FLAG: UInt = 1u

public val CMSG_KEY_AGREE_ENCRYPT_FREE_PUBKEY_ALG_FLAG: UInt = 4u

public val CMSG_KEY_AGREE_ENCRYPT_FREE_PUBKEY_BITS_FLAG: UInt = 16u

public val CMSG_KEY_AGREE_ENCRYPT_FREE_PUBKEY_PARA_FLAG: UInt = 8u

public val CMSG_KEY_AGREE_EPHEMERAL_KEY_CHOICE: CmsgKeyAgreeOption = 1u

public val CMSG_KEY_AGREE_ORIGINATOR_CERT: CmsgKeyAgreeOriginator = 1u

public val CMSG_KEY_AGREE_ORIGINATOR_PUBLIC_KEY: CmsgKeyAgreeOriginator = 2u

public val CMSG_KEY_AGREE_RECIPIENT: UInt = 2u

public val CMSG_KEY_AGREE_STATIC_KEY_CHOICE: CmsgKeyAgreeOption = 2u

public val CMSG_KEY_AGREE_VERSION: UInt = 3u

public val CMSG_KEY_TRANS_CMS_VERSION: UInt = 2u

public val CMSG_KEY_TRANS_ENCRYPT_FREE_OBJID_FLAG: UInt = 2u

public val CMSG_KEY_TRANS_ENCRYPT_FREE_PARA_FLAG: UInt = 1u

public val CMSG_KEY_TRANS_PKCS_1_5_VERSION: UInt = 0u

public val CMSG_KEY_TRANS_RECIPIENT: UInt = 1u

public val CMSG_LENGTH_ONLY_FLAG: UInt = 2u

public val CMSG_MAIL_LIST_ENCRYPT_FREE_OBJID_FLAG: UInt = 2u

public val CMSG_MAIL_LIST_ENCRYPT_FREE_PARA_FLAG: UInt = 1u

public val CMSG_MAIL_LIST_HANDLE_KEY_CHOICE: UInt = 1u

public val CMSG_MAIL_LIST_RECIPIENT: UInt = 3u

public val CMSG_MAIL_LIST_VERSION: UInt = 4u

public val CMSG_MAX_LENGTH_FLAG: UInt = 32u

public val CMSG_OID_CAPI1_EXPORT_KEY_AGREE_FUNC: Pcwstr = w("CryptMsgDllExportKeyAgree")

public val CMSG_OID_CAPI1_EXPORT_KEY_TRANS_FUNC: Pcwstr = w("CryptMsgDllExportKeyTrans")

public val CMSG_OID_CAPI1_EXPORT_MAIL_LIST_FUNC: Pcwstr = w("CryptMsgDllExportMailList")

public val CMSG_OID_CAPI1_GEN_CONTENT_ENCRYPT_KEY_FUNC: Pcwstr = w("CryptMsgDllGenContentEncryptKey")

public val CMSG_OID_CAPI1_IMPORT_KEY_AGREE_FUNC: Pcwstr = w("CryptMsgDllImportKeyAgree")

public val CMSG_OID_CAPI1_IMPORT_KEY_TRANS_FUNC: Pcwstr = w("CryptMsgDllImportKeyTrans")

public val CMSG_OID_CAPI1_IMPORT_MAIL_LIST_FUNC: Pcwstr = w("CryptMsgDllImportMailList")

public val CMSG_OID_CNG_EXPORT_KEY_AGREE_FUNC: Pcstr = s("CryptMsgDllCNGExportKeyAgree")
