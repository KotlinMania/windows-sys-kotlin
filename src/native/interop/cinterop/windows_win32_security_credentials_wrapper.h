#ifndef WINDOWSSYS_WINDOWS_WIN32_SECURITY_CREDENTIALS_WINDOWS_WIN32_SECURITY_CREDENTIALS_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SECURITY_CREDENTIALS_WINDOWS_WIN32_SECURITY_CREDENTIALS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32SecurityCredentialsCredDeleteA(void* targetname, uint32_t type, uint32_t flags);
int32_t windowssysWindowsWin32SecurityCredentialsCredDeleteW(void* targetname, uint32_t type, uint32_t flags);
int32_t windowssysWindowsWin32SecurityCredentialsCredEnumerateA(void* filter, uint32_t flags, void* count, void* credential);
int32_t windowssysWindowsWin32SecurityCredentialsCredEnumerateW(void* filter, uint32_t flags, void* count, void* credential);
int32_t windowssysWindowsWin32SecurityCredentialsCredFindBestCredentialA(void* targetname, uint32_t type, uint32_t flags, void* credential);
int32_t windowssysWindowsWin32SecurityCredentialsCredFindBestCredentialW(void* targetname, uint32_t type, uint32_t flags, void* credential);
void windowssysWindowsWin32SecurityCredentialsCredFree(void* buffer);
int32_t windowssysWindowsWin32SecurityCredentialsCredGetSessionTypes(uint32_t maximumpersistcount, void* maximumpersist);
int32_t windowssysWindowsWin32SecurityCredentialsCredGetTargetInfoA(void* targetname, uint32_t flags, void* targetinfo);
int32_t windowssysWindowsWin32SecurityCredentialsCredGetTargetInfoW(void* targetname, uint32_t flags, void* targetinfo);
int32_t windowssysWindowsWin32SecurityCredentialsCredIsMarshaledCredentialA(void* marshaledcredential);
int32_t windowssysWindowsWin32SecurityCredentialsCredIsMarshaledCredentialW(void* marshaledcredential);
int32_t windowssysWindowsWin32SecurityCredentialsCredIsProtectedA(void* pszprotectedcredentials, void* pprotectiontype);
int32_t windowssysWindowsWin32SecurityCredentialsCredIsProtectedW(void* pszprotectedcredentials, void* pprotectiontype);
int32_t windowssysWindowsWin32SecurityCredentialsCredMarshalCredentialA(int32_t credtype, void* credential, void* marshaledcredential);
int32_t windowssysWindowsWin32SecurityCredentialsCredMarshalCredentialW(int32_t credtype, void* credential, void* marshaledcredential);
int32_t windowssysWindowsWin32SecurityCredentialsCredPackAuthenticationBufferA(uint32_t dwflags, void* pszusername, void* pszpassword, void* ppackedcredentials, void* pcbpackedcredentials);
int32_t windowssysWindowsWin32SecurityCredentialsCredPackAuthenticationBufferW(uint32_t dwflags, void* pszusername, void* pszpassword, void* ppackedcredentials, void* pcbpackedcredentials);
int32_t windowssysWindowsWin32SecurityCredentialsCredProtectA(int32_t fasself, void* pszcredentials, uint32_t cchcredentials, void* pszprotectedcredentials, void* pcchmaxchars, void* protectiontype);
int32_t windowssysWindowsWin32SecurityCredentialsCredProtectW(int32_t fasself, void* pszcredentials, uint32_t cchcredentials, void* pszprotectedcredentials, void* pcchmaxchars, void* protectiontype);
int32_t windowssysWindowsWin32SecurityCredentialsCredReadA(void* targetname, uint32_t type, uint32_t flags, void* credential);
int32_t windowssysWindowsWin32SecurityCredentialsCredReadDomainCredentialsA(void* targetinfo, uint32_t flags, void* count, void* credential);
int32_t windowssysWindowsWin32SecurityCredentialsCredReadDomainCredentialsW(void* targetinfo, uint32_t flags, void* count, void* credential);
int32_t windowssysWindowsWin32SecurityCredentialsCredReadW(void* targetname, uint32_t type, uint32_t flags, void* credential);
int32_t windowssysWindowsWin32SecurityCredentialsCredRenameA(void* oldtargetname, void* newtargetname, uint32_t type, uint32_t flags);
int32_t windowssysWindowsWin32SecurityCredentialsCredRenameW(void* oldtargetname, void* newtargetname, uint32_t type, uint32_t flags);
uint32_t windowssysWindowsWin32SecurityCredentialsCredUICmdLinePromptForCredentialsA(void* psztargetname, void* pcontext, uint32_t dwautherror, void* username, uint32_t uluserbuffersize, void* pszpassword, uint32_t ulpasswordbuffersize, void* pfsave, uint32_t dwflags);
uint32_t windowssysWindowsWin32SecurityCredentialsCredUICmdLinePromptForCredentialsW(void* psztargetname, void* pcontext, uint32_t dwautherror, void* username, uint32_t uluserbuffersize, void* pszpassword, uint32_t ulpasswordbuffersize, void* pfsave, uint32_t dwflags);
uint32_t windowssysWindowsWin32SecurityCredentialsCredUIConfirmCredentialsA(void* psztargetname, int32_t bconfirm);
uint32_t windowssysWindowsWin32SecurityCredentialsCredUIConfirmCredentialsW(void* psztargetname, int32_t bconfirm);
uint32_t windowssysWindowsWin32SecurityCredentialsCredUIParseUserNameA(void* username, void* user, uint32_t userbuffersize, void* domain, uint32_t domainbuffersize);
uint32_t windowssysWindowsWin32SecurityCredentialsCredUIParseUserNameW(void* username, void* user, uint32_t userbuffersize, void* domain, uint32_t domainbuffersize);
uint32_t windowssysWindowsWin32SecurityCredentialsCredUIPromptForCredentialsA(void* puiinfo, void* psztargetname, void* pcontext, uint32_t dwautherror, void* pszusername, uint32_t ulusernamebuffersize, void* pszpassword, uint32_t ulpasswordbuffersize, void* save, uint32_t dwflags);
uint32_t windowssysWindowsWin32SecurityCredentialsCredUIPromptForCredentialsW(void* puiinfo, void* psztargetname, void* pcontext, uint32_t dwautherror, void* pszusername, uint32_t ulusernamebuffersize, void* pszpassword, uint32_t ulpasswordbuffersize, void* save, uint32_t dwflags);
uint32_t windowssysWindowsWin32SecurityCredentialsCredUIPromptForWindowsCredentialsA(void* puiinfo, uint32_t dwautherror, void* pulauthpackage, void* pvinauthbuffer, uint32_t ulinauthbuffersize, void* ppvoutauthbuffer, void* puloutauthbuffersize, void* pfsave, uint32_t dwflags);
uint32_t windowssysWindowsWin32SecurityCredentialsCredUIPromptForWindowsCredentialsW(void* puiinfo, uint32_t dwautherror, void* pulauthpackage, void* pvinauthbuffer, uint32_t ulinauthbuffersize, void* ppvoutauthbuffer, void* puloutauthbuffersize, void* pfsave, uint32_t dwflags);
uint32_t windowssysWindowsWin32SecurityCredentialsCredUIReadSSOCredW(void* pszrealm, void* ppszusername);
uint32_t windowssysWindowsWin32SecurityCredentialsCredUIStoreSSOCredW(void* pszrealm, void* pszusername, void* pszpassword, int32_t bpersist);
int32_t windowssysWindowsWin32SecurityCredentialsCredUnPackAuthenticationBufferA(uint32_t dwflags, void* pauthbuffer, uint32_t cbauthbuffer, void* pszusername, void* pcchlmaxusername, void* pszdomainname, void* pcchmaxdomainname, void* pszpassword, void* pcchmaxpassword);
int32_t windowssysWindowsWin32SecurityCredentialsCredUnPackAuthenticationBufferW(uint32_t dwflags, void* pauthbuffer, uint32_t cbauthbuffer, void* pszusername, void* pcchmaxusername, void* pszdomainname, void* pcchmaxdomainname, void* pszpassword, void* pcchmaxpassword);
int32_t windowssysWindowsWin32SecurityCredentialsCredUnmarshalCredentialA(void* marshaledcredential, void* credtype, void* credential);
int32_t windowssysWindowsWin32SecurityCredentialsCredUnmarshalCredentialW(void* marshaledcredential, void* credtype, void* credential);
int32_t windowssysWindowsWin32SecurityCredentialsCredUnprotectA(int32_t fasself, void* pszprotectedcredentials, uint32_t cchprotectedcredentials, void* pszcredentials, void* pcchmaxchars);
int32_t windowssysWindowsWin32SecurityCredentialsCredUnprotectW(int32_t fasself, void* pszprotectedcredentials, uint32_t cchprotectedcredentials, void* pszcredentials, void* pcchmaxchars);
int32_t windowssysWindowsWin32SecurityCredentialsCredWriteA(void* credential, uint32_t flags);
int32_t windowssysWindowsWin32SecurityCredentialsCredWriteDomainCredentialsA(void* targetinfo, void* credential, uint32_t flags);
int32_t windowssysWindowsWin32SecurityCredentialsCredWriteDomainCredentialsW(void* targetinfo, void* credential, uint32_t flags);
int32_t windowssysWindowsWin32SecurityCredentialsCredWriteW(void* credential, uint32_t flags);
int32_t windowssysWindowsWin32SecurityCredentialsGetOpenCardNameA(void* param0);
int32_t windowssysWindowsWin32SecurityCredentialsGetOpenCardNameW(void* param0);
void windowssysWindowsWin32SecurityCredentialsKeyCredentialManagerFreeInformation(void* keycredentialmanagerinfo);
int32_t windowssysWindowsWin32SecurityCredentialsKeyCredentialManagerGetInformation(void* keycredentialmanagerinfo);
int32_t windowssysWindowsWin32SecurityCredentialsKeyCredentialManagerGetOperationErrorStates(int32_t keycredentialmanageroperationtype, void* isready, void* keycredentialmanageroperationerrorstates);
int32_t windowssysWindowsWin32SecurityCredentialsKeyCredentialManagerShowUIOperation(void* hwndowner, int32_t keycredentialmanageroperationtype);
void* windowssysWindowsWin32SecurityCredentialsSCardAccessStartedEvent(void);
int32_t windowssysWindowsWin32SecurityCredentialsSCardAddReaderToGroupA(uint64_t hcontext, void* szreadername, void* szgroupname);
int32_t windowssysWindowsWin32SecurityCredentialsSCardAddReaderToGroupW(uint64_t hcontext, void* szreadername, void* szgroupname);
int32_t windowssysWindowsWin32SecurityCredentialsSCardAudit(uint64_t hcontext, uint32_t dwevent);
int32_t windowssysWindowsWin32SecurityCredentialsSCardBeginTransaction(uint64_t hcard);
int32_t windowssysWindowsWin32SecurityCredentialsSCardCancel(uint64_t hcontext);
int32_t windowssysWindowsWin32SecurityCredentialsSCardConnectA(uint64_t hcontext, void* szreader, uint32_t dwsharemode, uint32_t dwpreferredprotocols, void* phcard, void* pdwactiveprotocol);
int32_t windowssysWindowsWin32SecurityCredentialsSCardConnectW(uint64_t hcontext, void* szreader, uint32_t dwsharemode, uint32_t dwpreferredprotocols, void* phcard, void* pdwactiveprotocol);
int32_t windowssysWindowsWin32SecurityCredentialsSCardControl(uint64_t hcard, uint32_t dwcontrolcode, void* lpinbuffer, uint32_t cbinbuffersize, void* lpoutbuffer, uint32_t cboutbuffersize, void* lpbytesreturned);
int32_t windowssysWindowsWin32SecurityCredentialsSCardDisconnect(uint64_t hcard, uint32_t dwdisposition);
int32_t windowssysWindowsWin32SecurityCredentialsSCardDlgExtendedError(void);
int32_t windowssysWindowsWin32SecurityCredentialsSCardEndTransaction(uint64_t hcard, uint32_t dwdisposition);
int32_t windowssysWindowsWin32SecurityCredentialsSCardEstablishContext(uint32_t dwscope, void* pvreserved1, void* pvreserved2, void* phcontext);
int32_t windowssysWindowsWin32SecurityCredentialsSCardForgetCardTypeA(uint64_t hcontext, void* szcardname);
int32_t windowssysWindowsWin32SecurityCredentialsSCardForgetCardTypeW(uint64_t hcontext, void* szcardname);
int32_t windowssysWindowsWin32SecurityCredentialsSCardForgetReaderA(uint64_t hcontext, void* szreadername);
int32_t windowssysWindowsWin32SecurityCredentialsSCardForgetReaderGroupA(uint64_t hcontext, void* szgroupname);
int32_t windowssysWindowsWin32SecurityCredentialsSCardForgetReaderGroupW(uint64_t hcontext, void* szgroupname);
int32_t windowssysWindowsWin32SecurityCredentialsSCardForgetReaderW(uint64_t hcontext, void* szreadername);
int32_t windowssysWindowsWin32SecurityCredentialsSCardFreeMemory(uint64_t hcontext, void* pvmem);
int32_t windowssysWindowsWin32SecurityCredentialsSCardGetAttrib(uint64_t hcard, uint32_t dwattrid, void* pbattr, void* pcbattrlen);
int32_t windowssysWindowsWin32SecurityCredentialsSCardGetCardTypeProviderNameA(uint64_t hcontext, void* szcardname, uint32_t dwproviderid, void* szprovider, void* pcchprovider);
int32_t windowssysWindowsWin32SecurityCredentialsSCardGetCardTypeProviderNameW(uint64_t hcontext, void* szcardname, uint32_t dwproviderid, void* szprovider, void* pcchprovider);
int32_t windowssysWindowsWin32SecurityCredentialsSCardGetDeviceTypeIdA(uint64_t hcontext, void* szreadername, void* pdwdevicetypeid);
int32_t windowssysWindowsWin32SecurityCredentialsSCardGetDeviceTypeIdW(uint64_t hcontext, void* szreadername, void* pdwdevicetypeid);
int32_t windowssysWindowsWin32SecurityCredentialsSCardGetProviderIdA(uint64_t hcontext, void* szcard, void* pguidproviderid);
int32_t windowssysWindowsWin32SecurityCredentialsSCardGetProviderIdW(uint64_t hcontext, void* szcard, void* pguidproviderid);
int32_t windowssysWindowsWin32SecurityCredentialsSCardGetReaderDeviceInstanceIdA(uint64_t hcontext, void* szreadername, void* szdeviceinstanceid, void* pcchdeviceinstanceid);
int32_t windowssysWindowsWin32SecurityCredentialsSCardGetReaderDeviceInstanceIdW(uint64_t hcontext, void* szreadername, void* szdeviceinstanceid, void* pcchdeviceinstanceid);
int32_t windowssysWindowsWin32SecurityCredentialsSCardGetReaderIconA(uint64_t hcontext, void* szreadername, void* pbicon, void* pcbicon);
int32_t windowssysWindowsWin32SecurityCredentialsSCardGetReaderIconW(uint64_t hcontext, void* szreadername, void* pbicon, void* pcbicon);
int32_t windowssysWindowsWin32SecurityCredentialsSCardGetStatusChangeA(uint64_t hcontext, uint32_t dwtimeout, void* rgreaderstates, uint32_t creaders);
int32_t windowssysWindowsWin32SecurityCredentialsSCardGetStatusChangeW(uint64_t hcontext, uint32_t dwtimeout, void* rgreaderstates, uint32_t creaders);
int32_t windowssysWindowsWin32SecurityCredentialsSCardGetTransmitCount(uint64_t hcard, void* pctransmitcount);
int32_t windowssysWindowsWin32SecurityCredentialsSCardIntroduceCardTypeA(uint64_t hcontext, void* szcardname, void* pguidprimaryprovider, void* rgguidinterfaces, uint32_t dwinterfacecount, void* pbatr, void* pbatrmask, uint32_t cbatrlen);
int32_t windowssysWindowsWin32SecurityCredentialsSCardIntroduceCardTypeW(uint64_t hcontext, void* szcardname, void* pguidprimaryprovider, void* rgguidinterfaces, uint32_t dwinterfacecount, void* pbatr, void* pbatrmask, uint32_t cbatrlen);
int32_t windowssysWindowsWin32SecurityCredentialsSCardIntroduceReaderA(uint64_t hcontext, void* szreadername, void* szdevicename);
int32_t windowssysWindowsWin32SecurityCredentialsSCardIntroduceReaderGroupA(uint64_t hcontext, void* szgroupname);
int32_t windowssysWindowsWin32SecurityCredentialsSCardIntroduceReaderGroupW(uint64_t hcontext, void* szgroupname);
int32_t windowssysWindowsWin32SecurityCredentialsSCardIntroduceReaderW(uint64_t hcontext, void* szreadername, void* szdevicename);
int32_t windowssysWindowsWin32SecurityCredentialsSCardIsValidContext(uint64_t hcontext);
int32_t windowssysWindowsWin32SecurityCredentialsSCardListCardsA(uint64_t hcontext, void* pbatr, void* rgquidinterfaces, uint32_t cguidinterfacecount, void* mszcards, void* pcchcards);
int32_t windowssysWindowsWin32SecurityCredentialsSCardListCardsW(uint64_t hcontext, void* pbatr, void* rgquidinterfaces, uint32_t cguidinterfacecount, void* mszcards, void* pcchcards);
int32_t windowssysWindowsWin32SecurityCredentialsSCardListInterfacesA(uint64_t hcontext, void* szcard, void* pguidinterfaces, void* pcguidinterfaces);
int32_t windowssysWindowsWin32SecurityCredentialsSCardListInterfacesW(uint64_t hcontext, void* szcard, void* pguidinterfaces, void* pcguidinterfaces);
int32_t windowssysWindowsWin32SecurityCredentialsSCardListReaderGroupsA(uint64_t hcontext, void* mszgroups, void* pcchgroups);
int32_t windowssysWindowsWin32SecurityCredentialsSCardListReaderGroupsW(uint64_t hcontext, void* mszgroups, void* pcchgroups);
int32_t windowssysWindowsWin32SecurityCredentialsSCardListReadersA(uint64_t hcontext, void* mszgroups, void* mszreaders, void* pcchreaders);
int32_t windowssysWindowsWin32SecurityCredentialsSCardListReadersW(uint64_t hcontext, void* mszgroups, void* mszreaders, void* pcchreaders);
int32_t windowssysWindowsWin32SecurityCredentialsSCardListReadersWithDeviceInstanceIdA(uint64_t hcontext, void* szdeviceinstanceid, void* mszreaders, void* pcchreaders);
int32_t windowssysWindowsWin32SecurityCredentialsSCardListReadersWithDeviceInstanceIdW(uint64_t hcontext, void* szdeviceinstanceid, void* mszreaders, void* pcchreaders);
int32_t windowssysWindowsWin32SecurityCredentialsSCardLocateCardsA(uint64_t hcontext, void* mszcards, void* rgreaderstates, uint32_t creaders);
int32_t windowssysWindowsWin32SecurityCredentialsSCardLocateCardsByATRA(uint64_t hcontext, void* rgatrmasks, uint32_t catrs, void* rgreaderstates, uint32_t creaders);
int32_t windowssysWindowsWin32SecurityCredentialsSCardLocateCardsByATRW(uint64_t hcontext, void* rgatrmasks, uint32_t catrs, void* rgreaderstates, uint32_t creaders);
int32_t windowssysWindowsWin32SecurityCredentialsSCardLocateCardsW(uint64_t hcontext, void* mszcards, void* rgreaderstates, uint32_t creaders);
int32_t windowssysWindowsWin32SecurityCredentialsSCardReadCacheA(uint64_t hcontext, void* cardidentifier, uint32_t freshnesscounter, void* lookupname, void* data, void* datalen);
int32_t windowssysWindowsWin32SecurityCredentialsSCardReadCacheW(uint64_t hcontext, void* cardidentifier, uint32_t freshnesscounter, void* lookupname, void* data, void* datalen);
int32_t windowssysWindowsWin32SecurityCredentialsSCardReconnect(uint64_t hcard, uint32_t dwsharemode, uint32_t dwpreferredprotocols, uint32_t dwinitialization, void* pdwactiveprotocol);
int32_t windowssysWindowsWin32SecurityCredentialsSCardReleaseContext(uint64_t hcontext);
void windowssysWindowsWin32SecurityCredentialsSCardReleaseStartedEvent(void);
int32_t windowssysWindowsWin32SecurityCredentialsSCardRemoveReaderFromGroupA(uint64_t hcontext, void* szreadername, void* szgroupname);
int32_t windowssysWindowsWin32SecurityCredentialsSCardRemoveReaderFromGroupW(uint64_t hcontext, void* szreadername, void* szgroupname);
int32_t windowssysWindowsWin32SecurityCredentialsSCardSetAttrib(uint64_t hcard, uint32_t dwattrid, void* pbattr, uint32_t cbattrlen);
int32_t windowssysWindowsWin32SecurityCredentialsSCardSetCardTypeProviderNameA(uint64_t hcontext, void* szcardname, uint32_t dwproviderid, void* szprovider);
int32_t windowssysWindowsWin32SecurityCredentialsSCardSetCardTypeProviderNameW(uint64_t hcontext, void* szcardname, uint32_t dwproviderid, void* szprovider);
int32_t windowssysWindowsWin32SecurityCredentialsSCardState(uint64_t hcard, void* pdwstate, void* pdwprotocol, void* pbatr, void* pcbatrlen);
int32_t windowssysWindowsWin32SecurityCredentialsSCardStatusA(uint64_t hcard, void* mszreadernames, void* pcchreaderlen, void* pdwstate, void* pdwprotocol, void* pbatr, void* pcbatrlen);
int32_t windowssysWindowsWin32SecurityCredentialsSCardStatusW(uint64_t hcard, void* mszreadernames, void* pcchreaderlen, void* pdwstate, void* pdwprotocol, void* pbatr, void* pcbatrlen);
int32_t windowssysWindowsWin32SecurityCredentialsSCardTransmit(uint64_t hcard, void* piosendpci, void* pbsendbuffer, uint32_t cbsendlength, void* piorecvpci, void* pbrecvbuffer, void* pcbrecvlength);
int32_t windowssysWindowsWin32SecurityCredentialsSCardUIDlgSelectCardA(void* param0);
int32_t windowssysWindowsWin32SecurityCredentialsSCardUIDlgSelectCardW(void* param0);
int32_t windowssysWindowsWin32SecurityCredentialsSCardWriteCacheA(uint64_t hcontext, void* cardidentifier, uint32_t freshnesscounter, void* lookupname, void* data, uint32_t datalen);
int32_t windowssysWindowsWin32SecurityCredentialsSCardWriteCacheW(uint64_t hcontext, void* cardidentifier, uint32_t freshnesscounter, void* lookupname, void* data, uint32_t datalen);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SECURITY_CREDENTIALS_WINDOWS_WIN32_SECURITY_CREDENTIALS_WRAPPER_H */
