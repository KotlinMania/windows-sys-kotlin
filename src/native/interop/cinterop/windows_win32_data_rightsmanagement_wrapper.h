#ifndef WINDOWSSYS_WINDOWS_WIN32_DATA_RIGHTSMANAGEMENT_WINDOWS_WIN32_DATA_RIGHTSMANAGEMENT_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_DATA_RIGHTSMANAGEMENT_WINDOWS_WIN32_DATA_RIGHTSMANAGEMENT_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32DataRightsmanagementDRMAcquireAdvisories(uint32_t hlicensestorage, void* wszlicense, void* wszurl, void* pvcontext);
int32_t windowssysWindowsWin32DataRightsmanagementDRMAcquireIssuanceLicenseTemplate(uint32_t hclient, uint32_t uflags, void* pvreserved, uint32_t ctemplates, void* pwsztemplateids, void* wszurl, void* pvcontext);
int32_t windowssysWindowsWin32DataRightsmanagementDRMAcquireLicense(uint32_t hsession, uint32_t uflags, void* wszgroupidentitycredential, void* wszrequestedrights, void* wszcustomdata, void* wszurl, void* pvcontext);
int32_t windowssysWindowsWin32DataRightsmanagementDRMActivate(uint32_t hclient, uint32_t uflags, uint32_t ulangid, void* pactservinfo, void* pvcontext, void* hparentwnd);
int32_t windowssysWindowsWin32DataRightsmanagementDRMAddLicense(uint32_t hlicensestorage, uint32_t uflags, void* wszlicense);
int32_t windowssysWindowsWin32DataRightsmanagementDRMAddRightWithUser(uint32_t hissuancelicense, uint32_t hright, uint32_t huser);
int32_t windowssysWindowsWin32DataRightsmanagementDRMAttest(uint32_t henablingprincipal, void* wszdata, int32_t etype, void* pcattestedblob, void* wszattestedblob);
int32_t windowssysWindowsWin32DataRightsmanagementDRMCheckSecurity(uint32_t henv, uint32_t clevel);
int32_t windowssysWindowsWin32DataRightsmanagementDRMClearAllRights(uint32_t hissuancelicense);
int32_t windowssysWindowsWin32DataRightsmanagementDRMCloseEnvironmentHandle(uint32_t henv);
int32_t windowssysWindowsWin32DataRightsmanagementDRMCloseHandle(uint32_t handle);
int32_t windowssysWindowsWin32DataRightsmanagementDRMClosePubHandle(uint32_t hpub);
int32_t windowssysWindowsWin32DataRightsmanagementDRMCloseQueryHandle(uint32_t hquery);
int32_t windowssysWindowsWin32DataRightsmanagementDRMCloseSession(uint32_t hsession);
int32_t windowssysWindowsWin32DataRightsmanagementDRMConstructCertificateChain(uint32_t ccertificates, void* rgwszcertificates, void* pcchain, void* wszchain);
int32_t windowssysWindowsWin32DataRightsmanagementDRMCreateBoundLicense(uint32_t henv, void* pparams, void* wszlicensechain, void* phboundlicense, void* pherrorlog);
int32_t windowssysWindowsWin32DataRightsmanagementDRMCreateClientSession(void* pfncallback, uint32_t ucallbackversion, void* wszgroupidprovidertype, void* wszgroupid, void* phclient);
int32_t windowssysWindowsWin32DataRightsmanagementDRMCreateEnablingBitsDecryptor(uint32_t hboundlicense, void* wszright, uint32_t hauxlib, void* wszauxplug, void* phdecryptor);
int32_t windowssysWindowsWin32DataRightsmanagementDRMCreateEnablingBitsEncryptor(uint32_t hboundlicense, void* wszright, uint32_t hauxlib, void* wszauxplug, void* phencryptor);
int32_t windowssysWindowsWin32DataRightsmanagementDRMCreateEnablingPrincipal(uint32_t henv, uint32_t hlibrary, void* wszobject, void* pidprincipal, void* wszcredentials, void* phenablingprincipal);
int32_t windowssysWindowsWin32DataRightsmanagementDRMCreateIssuanceLicense(void* psttimefrom, void* psttimeuntil, void* wszreferralinfoname, void* wszreferralinfourl, uint32_t howner, void* wszissuancelicense, uint32_t hboundlicense, void* phissuancelicense);
int32_t windowssysWindowsWin32DataRightsmanagementDRMCreateLicenseStorageSession(uint32_t henv, uint32_t hdefaultlibrary, uint32_t hclient, uint32_t uflags, void* wszissuancelicense, void* phlicensestorage);
int32_t windowssysWindowsWin32DataRightsmanagementDRMCreateRight(void* wszrightname, void* pstfrom, void* pstuntil, uint32_t cextendedinfo, void* pwszextendedinfoname, void* pwszextendedinfovalue, void* phright);
int32_t windowssysWindowsWin32DataRightsmanagementDRMCreateUser(void* wszusername, void* wszuserid, void* wszuseridtype, void* phuser);
int32_t windowssysWindowsWin32DataRightsmanagementDRMDecode(void* wszalgid, void* wszencodedstring, void* pudecodeddatalen, void* pbdecodeddata);
int32_t windowssysWindowsWin32DataRightsmanagementDRMDeconstructCertificateChain(void* wszchain, uint32_t iwhich, void* pccert, void* wszcert);
int32_t windowssysWindowsWin32DataRightsmanagementDRMDecrypt(uint32_t hcryptoprovider, uint32_t iposition, uint32_t cnuminbytes, void* pbindata, void* pcnumoutbytes, void* pboutdata);
int32_t windowssysWindowsWin32DataRightsmanagementDRMDeleteLicense(uint32_t hsession, void* wszlicenseid);
int32_t windowssysWindowsWin32DataRightsmanagementDRMDuplicateEnvironmentHandle(uint32_t htocopy, void* phcopy);
int32_t windowssysWindowsWin32DataRightsmanagementDRMDuplicateHandle(uint32_t htocopy, void* phcopy);
int32_t windowssysWindowsWin32DataRightsmanagementDRMDuplicatePubHandle(uint32_t hpubin, void* phpubout);
int32_t windowssysWindowsWin32DataRightsmanagementDRMDuplicateSession(uint32_t hsessionin, void* phsessionout);
int32_t windowssysWindowsWin32DataRightsmanagementDRMEncode(void* wszalgid, uint32_t udatalen, void* pbdecodeddata, void* puencodedstringlen, void* wszencodedstring);
int32_t windowssysWindowsWin32DataRightsmanagementDRMEncrypt(uint32_t hcryptoprovider, uint32_t iposition, uint32_t cnuminbytes, void* pbindata, void* pcnumoutbytes, void* pboutdata);
int32_t windowssysWindowsWin32DataRightsmanagementDRMEnumerateLicense(uint32_t hsession, uint32_t uflags, uint32_t uindex, void* pfsharedflag, void* pucertificatedatalen, void* wszcertificatedata);
int32_t windowssysWindowsWin32DataRightsmanagementDRMGetApplicationSpecificData(uint32_t hissuancelicense, uint32_t uindex, void* punamelength, void* wszname, void* puvaluelength, void* wszvalue);
int32_t windowssysWindowsWin32DataRightsmanagementDRMGetBoundLicenseAttribute(uint32_t hqueryroot, void* wszattribute, uint32_t iwhich, void* peencoding, void* pcbuffer, void* pbbuffer);
int32_t windowssysWindowsWin32DataRightsmanagementDRMGetBoundLicenseAttributeCount(uint32_t hqueryroot, void* wszattribute, void* pcattributes);
int32_t windowssysWindowsWin32DataRightsmanagementDRMGetBoundLicenseObject(uint32_t hqueryroot, void* wszsubobjecttype, uint32_t iwhich, void* phsubobject);
int32_t windowssysWindowsWin32DataRightsmanagementDRMGetBoundLicenseObjectCount(uint32_t hqueryroot, void* wszsubobjecttype, void* pcsubobjects);
int32_t windowssysWindowsWin32DataRightsmanagementDRMGetCertificateChainCount(void* wszchain, void* pccertcount);
int32_t windowssysWindowsWin32DataRightsmanagementDRMGetClientVersion(void* pdrmclientversioninfo);
int32_t windowssysWindowsWin32DataRightsmanagementDRMGetEnvironmentInfo(uint32_t handle, void* wszattribute, void* peencoding, void* pcbuffer, void* pbbuffer);
int32_t windowssysWindowsWin32DataRightsmanagementDRMGetInfo(uint32_t handle, void* wszattribute, void* peencoding, void* pcbuffer, void* pbbuffer);
int32_t windowssysWindowsWin32DataRightsmanagementDRMGetIntervalTime(uint32_t hissuancelicense, void* pcdays);
int32_t windowssysWindowsWin32DataRightsmanagementDRMGetIssuanceLicenseInfo(uint32_t hissuancelicense, void* psttimefrom, void* psttimeuntil, uint32_t uflags, void* pudistributionpointnamelength, void* wszdistributionpointname, void* pudistributionpointurllength, void* wszdistributionpointurl, void* phowner, void* pfofficial);
int32_t windowssysWindowsWin32DataRightsmanagementDRMGetIssuanceLicenseTemplate(uint32_t hissuancelicense, void* puissuancelicensetemplatelength, void* wszissuancelicensetemplate);
int32_t windowssysWindowsWin32DataRightsmanagementDRMGetMetaData(uint32_t hissuancelicense, void* pucontentidlength, void* wszcontentid, void* pucontentidtypelength, void* wszcontentidtype, void* puskuidlength, void* wszskuid, void* puskuidtypelength, void* wszskuidtype, void* pucontenttypelength, void* wszcontenttype, void* pucontentnamelength, void* wszcontentname);
int32_t windowssysWindowsWin32DataRightsmanagementDRMGetNameAndDescription(uint32_t hissuancelicense, uint32_t uindex, void* pulcid, void* punamelength, void* wszname, void* pudescriptionlength, void* wszdescription);
int32_t windowssysWindowsWin32DataRightsmanagementDRMGetOwnerLicense(uint32_t hissuancelicense, void* puownerlicenselength, void* wszownerlicense);
int32_t windowssysWindowsWin32DataRightsmanagementDRMGetProcAddress(uint32_t hlibrary, void* wszprocname, void* ppfnprocaddress);
int32_t windowssysWindowsWin32DataRightsmanagementDRMGetRevocationPoint(uint32_t hissuancelicense, void* puidlength, void* wszid, void* puidtypelength, void* wszidtype, void* puurllength, void* wszrl, void* pstfrequency, void* punamelength, void* wszname, void* pupublickeylength, void* wszpublickey);
int32_t windowssysWindowsWin32DataRightsmanagementDRMGetRightExtendedInfo(uint32_t hright, uint32_t uindex, void* puextendedinfonamelength, void* wszextendedinfoname, void* puextendedinfovaluelength, void* wszextendedinfovalue);
int32_t windowssysWindowsWin32DataRightsmanagementDRMGetRightInfo(uint32_t hright, void* purightnamelength, void* wszrightname, void* pstfrom, void* pstuntil);
int32_t windowssysWindowsWin32DataRightsmanagementDRMGetSecurityProvider(uint32_t uflags, void* putypelen, void* wsztype, void* pupathlen, void* wszpath);
int32_t windowssysWindowsWin32DataRightsmanagementDRMGetServiceLocation(uint32_t hclient, uint32_t uservicetype, uint32_t uservicelocation, void* wszissuancelicense, void* puserviceurllength, void* wszserviceurl);
int32_t windowssysWindowsWin32DataRightsmanagementDRMGetSignedIssuanceLicense(uint32_t henv, uint32_t hissuancelicense, uint32_t uflags, void* pbsymkey, uint32_t cbsymkey, void* wszsymkeytype, void* wszclientlicensorcertificate, void* pfncallback, void* wszurl, void* pvcontext);
int32_t windowssysWindowsWin32DataRightsmanagementDRMGetSignedIssuanceLicenseEx(uint32_t henv, uint32_t hissuancelicense, uint32_t uflags, void* pbsymkey, uint32_t cbsymkey, void* wszsymkeytype, void* pvreserved, uint32_t henablingprincipal, uint32_t hboundlicenseclc, void* pfncallback, void* pvcontext);
int32_t windowssysWindowsWin32DataRightsmanagementDRMGetTime(uint32_t henv, int32_t etimeridtype, void* potimeobject);
int32_t windowssysWindowsWin32DataRightsmanagementDRMGetUnboundLicenseAttribute(uint32_t hqueryroot, void* wszattributetype, uint32_t iwhich, void* peencoding, void* pcbuffer, void* pbbuffer);
int32_t windowssysWindowsWin32DataRightsmanagementDRMGetUnboundLicenseAttributeCount(uint32_t hqueryroot, void* wszattributetype, void* pcattributes);
int32_t windowssysWindowsWin32DataRightsmanagementDRMGetUnboundLicenseObject(uint32_t hqueryroot, void* wszsubobjecttype, uint32_t iindex, void* phsubquery);
int32_t windowssysWindowsWin32DataRightsmanagementDRMGetUnboundLicenseObjectCount(uint32_t hqueryroot, void* wszsubobjecttype, void* pcsubobjects);
int32_t windowssysWindowsWin32DataRightsmanagementDRMGetUsagePolicy(uint32_t hissuancelicense, uint32_t uindex, void* peusagepolicytype, void* pfexclusion, void* punamelength, void* wszname, void* puminversionlength, void* wszminversion, void* pumaxversionlength, void* wszmaxversion, void* pupublickeylength, void* wszpublickey, void* pudigestalgorithmlength, void* wszdigestalgorithm, void* pcbdigest, void* pbdigest);
int32_t windowssysWindowsWin32DataRightsmanagementDRMGetUserInfo(uint32_t huser, void* puusernamelength, void* wszusername, void* puuseridlength, void* wszuserid, void* puuseridtypelength, void* wszuseridtype);
int32_t windowssysWindowsWin32DataRightsmanagementDRMGetUserRights(uint32_t hissuancelicense, uint32_t huser, uint32_t uindex, void* phright);
int32_t windowssysWindowsWin32DataRightsmanagementDRMGetUsers(uint32_t hissuancelicense, uint32_t uindex, void* phuser);
int32_t windowssysWindowsWin32DataRightsmanagementDRMInitEnvironment(int32_t esecurityprovidertype, int32_t especification, void* wszsecurityprovider, void* wszmanifestcredentials, void* wszmachinecredentials, void* phenv, void* phdefaultlibrary);
int32_t windowssysWindowsWin32DataRightsmanagementDRMIsActivated(uint32_t hclient, uint32_t uflags, void* pactservinfo);
int32_t windowssysWindowsWin32DataRightsmanagementDRMIsWindowProtected(void* hwnd, void* pfprotected);
int32_t windowssysWindowsWin32DataRightsmanagementDRMLoadLibrary(uint32_t henv, int32_t especification, void* wszlibraryprovider, void* wszcredentials, void* phlibrary);
int32_t windowssysWindowsWin32DataRightsmanagementDRMParseUnboundLicense(void* wszcertificate, void* phqueryroot);
int32_t windowssysWindowsWin32DataRightsmanagementDRMRegisterContent(int32_t fregister);
int32_t windowssysWindowsWin32DataRightsmanagementDRMRegisterProtectedWindow(uint32_t henv, void* hwnd);
int32_t windowssysWindowsWin32DataRightsmanagementDRMRegisterRevocationList(uint32_t henv, void* wszrevocationlist);
int32_t windowssysWindowsWin32DataRightsmanagementDRMRepair(void);
int32_t windowssysWindowsWin32DataRightsmanagementDRMSetApplicationSpecificData(uint32_t hissuancelicense, int32_t fdelete, void* wszname, void* wszvalue);
int32_t windowssysWindowsWin32DataRightsmanagementDRMSetGlobalOptions(int32_t eglobaloptions, void* pvdata, uint32_t dwlen);
int32_t windowssysWindowsWin32DataRightsmanagementDRMSetIntervalTime(uint32_t hissuancelicense, uint32_t cdays);
int32_t windowssysWindowsWin32DataRightsmanagementDRMSetMetaData(uint32_t hissuancelicense, void* wszcontentid, void* wszcontentidtype, void* wszskuid, void* wszskuidtype, void* wszcontenttype, void* wszcontentname);
int32_t windowssysWindowsWin32DataRightsmanagementDRMSetNameAndDescription(uint32_t hissuancelicense, int32_t fdelete, uint32_t lcid, void* wszname, void* wszdescription);
int32_t windowssysWindowsWin32DataRightsmanagementDRMSetRevocationPoint(uint32_t hissuancelicense, int32_t fdelete, void* wszid, void* wszidtype, void* wszurl, void* pstfrequency, void* wszname, void* wszpublickey);
int32_t windowssysWindowsWin32DataRightsmanagementDRMSetUsagePolicy(uint32_t hissuancelicense, int32_t eusagepolicytype, int32_t fdelete, int32_t fexclusion, void* wszname, void* wszminversion, void* wszmaxversion, void* wszpublickey, void* wszdigestalgorithm, void* pbdigest, uint32_t cbdigest);
int32_t windowssysWindowsWin32DataRightsmanagementDRMVerify(void* wszdata, void* pcattesteddata, void* wszattesteddata, void* petype, void* pcprincipal, void* wszprincipal, void* pcmanifest, void* wszmanifest);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_DATA_RIGHTSMANAGEMENT_WINDOWS_WIN32_DATA_RIGHTSMANAGEMENT_WRAPPER_H */
