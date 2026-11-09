#ifndef WINDOWSSYS_WINDOWS_WIN32_UI_COLORSYSTEM_WINDOWS_WIN32_UI_COLORSYSTEM_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_UI_COLORSYSTEM_WINDOWS_WIN32_UI_COLORSYSTEM_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_ui_colorsystem_AssociateColorProfileWithDeviceA(void* pmachinename, void* pprofilename, void* pdevicename);
int32_t windowssys_windows_win32_ui_colorsystem_AssociateColorProfileWithDeviceW(void* pmachinename, void* pprofilename, void* pdevicename);
int32_t windowssys_windows_win32_ui_colorsystem_CMCheckColors(int64_t hcmtransform, void* lpainputcolors, uint32_t ncolors, int32_t ctinput, void* lparesult);
int32_t windowssys_windows_win32_ui_colorsystem_CMCheckColorsInGamut(int64_t hcmtransform, void* lpargbtriple, void* lparesult, uint32_t ncount);
int32_t windowssys_windows_win32_ui_colorsystem_CMCheckRGBs(int64_t hcmtransform, void* lpsrcbits, int32_t bminput, uint32_t dwwidth, uint32_t dwheight, uint32_t dwstride, void* lparesult, void* pfncallback, int64_t ulcallbackdata);
int32_t windowssys_windows_win32_ui_colorsystem_CMConvertColorNameToIndex(int64_t hprofile, void* pacolorname, void* paindex, uint32_t dwcount);
int32_t windowssys_windows_win32_ui_colorsystem_CMConvertIndexToColorName(int64_t hprofile, void* paindex, void* pacolorname, uint32_t dwcount);
int32_t windowssys_windows_win32_ui_colorsystem_CMCreateDeviceLinkProfile(void* pahprofiles, uint32_t nprofiles, void* padwintents, uint32_t nintents, uint32_t dwflags, void* lpprofiledata);
int64_t windowssys_windows_win32_ui_colorsystem_CMCreateMultiProfileTransform(void* pahprofiles, uint32_t nprofiles, void* padwintents, uint32_t nintents, uint32_t dwflags);
int32_t windowssys_windows_win32_ui_colorsystem_CMCreateProfile(void* lpcolorspace, void* lpprofiledata);
int32_t windowssys_windows_win32_ui_colorsystem_CMCreateProfileW(void* lpcolorspace, void* lpprofiledata);
int64_t windowssys_windows_win32_ui_colorsystem_CMCreateTransform(void* lpcolorspace, void* lpdevcharacter, void* lptargetdevcharacter);
int64_t windowssys_windows_win32_ui_colorsystem_CMCreateTransformExt(void* lpcolorspace, void* lpdevcharacter, void* lptargetdevcharacter, uint32_t dwflags);
int64_t windowssys_windows_win32_ui_colorsystem_CMCreateTransformExtW(void* lpcolorspace, void* lpdevcharacter, void* lptargetdevcharacter, uint32_t dwflags);
int64_t windowssys_windows_win32_ui_colorsystem_CMCreateTransformW(void* lpcolorspace, void* lpdevcharacter, void* lptargetdevcharacter);
int32_t windowssys_windows_win32_ui_colorsystem_CMDeleteTransform(int64_t hcmtransform);
uint32_t windowssys_windows_win32_ui_colorsystem_CMGetInfo(uint32_t dwinfo);
int32_t windowssys_windows_win32_ui_colorsystem_CMGetNamedProfileInfo(int64_t hprofile, void* pnamedprofileinfo);
int32_t windowssys_windows_win32_ui_colorsystem_CMIsProfileValid(int64_t hprofile, void* lpbvalid);
int32_t windowssys_windows_win32_ui_colorsystem_CMTranslateColors(int64_t hcmtransform, void* lpainputcolors, uint32_t ncolors, int32_t ctinput, void* lpaoutputcolors, int32_t ctoutput);
int32_t windowssys_windows_win32_ui_colorsystem_CMTranslateRGB(int64_t hcmtransform, uint32_t colorref, void* lpcolorref, uint32_t dwflags);
int32_t windowssys_windows_win32_ui_colorsystem_CMTranslateRGBs(int64_t hcmtransform, void* lpsrcbits, int32_t bminput, uint32_t dwwidth, uint32_t dwheight, uint32_t dwstride, void* lpdestbits, int32_t bmoutput, uint32_t dwtranslatedirection);
int32_t windowssys_windows_win32_ui_colorsystem_CMTranslateRGBsExt(int64_t hcmtransform, void* lpsrcbits, int32_t bminput, uint32_t dwwidth, uint32_t dwheight, uint32_t dwinputstride, void* lpdestbits, int32_t bmoutput, uint32_t dwoutputstride, void* lpfncallback, int64_t ulcallbackdata);
int32_t windowssys_windows_win32_ui_colorsystem_CheckBitmapBits(int64_t hcolortransform, void* psrcbits, int32_t bminput, uint32_t dwwidth, uint32_t dwheight, uint32_t dwstride, void* paresult, void* pfncallback, int64_t lpcallbackdata);
int32_t windowssys_windows_win32_ui_colorsystem_CheckColors(int64_t hcolortransform, void* painputcolors, uint32_t ncolors, int32_t ctinput, void* paresult);
int32_t windowssys_windows_win32_ui_colorsystem_CheckColorsInGamut(void* hdc, void* lprgbtriple, void* dlpbuffer, uint32_t ncount);
int32_t windowssys_windows_win32_ui_colorsystem_CloseColorProfile(int64_t hprofile);
int32_t windowssys_windows_win32_ui_colorsystem_ColorCorrectPalette(void* hdc, void* hpal, uint32_t defirst, uint32_t num);
int32_t windowssys_windows_win32_ui_colorsystem_ColorMatchToTarget(void* hdc, void* hdctarget, uint32_t action);
int32_t windowssys_windows_win32_ui_colorsystem_ConvertColorNameToIndex(int64_t hprofile, void* pacolorname, void* paindex, uint32_t dwcount);
int32_t windowssys_windows_win32_ui_colorsystem_ConvertIndexToColorName(int64_t hprofile, void* paindex, void* pacolorname, uint32_t dwcount);
void* windowssys_windows_win32_ui_colorsystem_CreateColorSpaceA(void* lplcs);
void* windowssys_windows_win32_ui_colorsystem_CreateColorSpaceW(void* lplcs);
int64_t windowssys_windows_win32_ui_colorsystem_CreateColorTransformA(void* plogcolorspace, int64_t hdestprofile, int64_t htargetprofile, uint32_t dwflags);
int64_t windowssys_windows_win32_ui_colorsystem_CreateColorTransformW(void* plogcolorspace, int64_t hdestprofile, int64_t htargetprofile, uint32_t dwflags);
int32_t windowssys_windows_win32_ui_colorsystem_CreateDeviceLinkProfile(void* hprofile, uint32_t nprofiles, void* padwintent, uint32_t nintents, uint32_t dwflags, void* pprofiledata, uint32_t indexpreferredcmm);
int64_t windowssys_windows_win32_ui_colorsystem_CreateMultiProfileTransform(void* pahprofiles, uint32_t nprofiles, void* padwintent, uint32_t nintents, uint32_t dwflags, uint32_t indexpreferredcmm);
int32_t windowssys_windows_win32_ui_colorsystem_CreateProfileFromLogColorSpaceA(void* plogcolorspace, void* pprofile);
int32_t windowssys_windows_win32_ui_colorsystem_CreateProfileFromLogColorSpaceW(void* plogcolorspace, void* pprofile);
int32_t windowssys_windows_win32_ui_colorsystem_DeleteColorSpace(void* hcs);
int32_t windowssys_windows_win32_ui_colorsystem_DeleteColorTransform(int64_t hxform);
int32_t windowssys_windows_win32_ui_colorsystem_DisassociateColorProfileFromDeviceA(void* pmachinename, void* pprofilename, void* pdevicename);
int32_t windowssys_windows_win32_ui_colorsystem_DisassociateColorProfileFromDeviceW(void* pmachinename, void* pprofilename, void* pdevicename);
int32_t windowssys_windows_win32_ui_colorsystem_EnumColorProfilesA(void* pmachinename, void* penumrecord, void* penumerationbuffer, void* pdwsizeofenumerationbuffer, void* pnprofiles);
int32_t windowssys_windows_win32_ui_colorsystem_EnumColorProfilesW(void* pmachinename, void* penumrecord, void* penumerationbuffer, void* pdwsizeofenumerationbuffer, void* pnprofiles);
int32_t windowssys_windows_win32_ui_colorsystem_EnumICMProfilesA(void* hdc, void* proc, int64_t param2);
int32_t windowssys_windows_win32_ui_colorsystem_EnumICMProfilesW(void* hdc, void* proc, int64_t param2);
uint32_t windowssys_windows_win32_ui_colorsystem_GetCMMInfo(int64_t hcolortransform, uint32_t param1);
int32_t windowssys_windows_win32_ui_colorsystem_GetColorDirectoryA(void* pmachinename, void* pbuffer, void* pdwsize);
int32_t windowssys_windows_win32_ui_colorsystem_GetColorDirectoryW(void* pmachinename, void* pbuffer, void* pdwsize);
int32_t windowssys_windows_win32_ui_colorsystem_GetColorProfileElement(int64_t hprofile, uint32_t tag, uint32_t dwoffset, void* pcbelement, void* pelement, void* pbreference);
int32_t windowssys_windows_win32_ui_colorsystem_GetColorProfileElementTag(int64_t hprofile, uint32_t dwindex, void* ptag);
int32_t windowssys_windows_win32_ui_colorsystem_GetColorProfileFromHandle(int64_t hprofile, void* pprofile, void* pcbprofile);
int32_t windowssys_windows_win32_ui_colorsystem_GetColorProfileHeader(int64_t hprofile, void* pheader);
void* windowssys_windows_win32_ui_colorsystem_GetColorSpace(void* hdc);
int32_t windowssys_windows_win32_ui_colorsystem_GetCountColorProfileElements(int64_t hprofile, void* pnelementcount);
int32_t windowssys_windows_win32_ui_colorsystem_GetDeviceGammaRamp(void* hdc, void* lpramp);
int32_t windowssys_windows_win32_ui_colorsystem_GetICMProfileA(void* hdc, void* pbufsize, void* pszfilename);
int32_t windowssys_windows_win32_ui_colorsystem_GetICMProfileW(void* hdc, void* pbufsize, void* pszfilename);
int32_t windowssys_windows_win32_ui_colorsystem_GetLogColorSpaceA(void* hcolorspace, void* lpbuffer, uint32_t nsize);
int32_t windowssys_windows_win32_ui_colorsystem_GetLogColorSpaceW(void* hcolorspace, void* lpbuffer, uint32_t nsize);
int32_t windowssys_windows_win32_ui_colorsystem_GetNamedProfileInfo(int64_t hprofile, void* pnamedprofileinfo);
int32_t windowssys_windows_win32_ui_colorsystem_GetPS2ColorRenderingDictionary(int64_t hprofile, uint32_t dwintent, void* pps2colorrenderingdictionary, void* pcbps2colorrenderingdictionary, void* pbbinary);
int32_t windowssys_windows_win32_ui_colorsystem_GetPS2ColorRenderingIntent(int64_t hprofile, uint32_t dwintent, void* pbuffer, void* pcbps2colorrenderingintent);
int32_t windowssys_windows_win32_ui_colorsystem_GetPS2ColorSpaceArray(int64_t hprofile, uint32_t dwintent, uint32_t dwcsatype, void* pps2colorspacearray, void* pcbps2colorspacearray, void* pbbinary);
int32_t windowssys_windows_win32_ui_colorsystem_GetStandardColorSpaceProfileA(void* pmachinename, uint32_t dwscs, void* pbuffer, void* pcbsize);
int32_t windowssys_windows_win32_ui_colorsystem_GetStandardColorSpaceProfileW(void* pmachinename, uint32_t dwscs, void* pbuffer, void* pcbsize);
int32_t windowssys_windows_win32_ui_colorsystem_InstallColorProfileA(void* pmachinename, void* pprofilename);
int32_t windowssys_windows_win32_ui_colorsystem_InstallColorProfileW(void* pmachinename, void* pprofilename);
int32_t windowssys_windows_win32_ui_colorsystem_IsColorProfileTagPresent(int64_t hprofile, uint32_t tag, void* pbpresent);
int32_t windowssys_windows_win32_ui_colorsystem_IsColorProfileValid(int64_t hprofile, void* pbvalid);
int64_t windowssys_windows_win32_ui_colorsystem_OpenColorProfileA(void* pprofile, uint32_t dwdesiredaccess, uint32_t dwsharemode, uint32_t dwcreationmode);
int64_t windowssys_windows_win32_ui_colorsystem_OpenColorProfileW(void* pprofile, uint32_t dwdesiredaccess, uint32_t dwsharemode, uint32_t dwcreationmode);
int32_t windowssys_windows_win32_ui_colorsystem_RegisterCMMA(void* pmachinename, uint32_t cmmid, void* pcmmdll);
int32_t windowssys_windows_win32_ui_colorsystem_RegisterCMMW(void* pmachinename, uint32_t cmmid, void* pcmmdll);
int32_t windowssys_windows_win32_ui_colorsystem_SelectCMM(uint32_t dwcmmtype);
int32_t windowssys_windows_win32_ui_colorsystem_SetColorProfileElement(int64_t hprofile, uint32_t tag, uint32_t dwoffset, void* pcbelement, void* pelement);
int32_t windowssys_windows_win32_ui_colorsystem_SetColorProfileElementReference(int64_t hprofile, uint32_t newtag, uint32_t reftag);
int32_t windowssys_windows_win32_ui_colorsystem_SetColorProfileElementSize(int64_t hprofile, uint32_t tagtype, uint32_t pcbelement);
int32_t windowssys_windows_win32_ui_colorsystem_SetColorProfileHeader(int64_t hprofile, void* pheader);
void* windowssys_windows_win32_ui_colorsystem_SetColorSpace(void* hdc, void* hcs);
int32_t windowssys_windows_win32_ui_colorsystem_SetDeviceGammaRamp(void* hdc, void* lpramp);
int32_t windowssys_windows_win32_ui_colorsystem_SetICMMode(void* hdc, int32_t mode);
int32_t windowssys_windows_win32_ui_colorsystem_SetICMProfileA(void* hdc, void* lpfilename);
int32_t windowssys_windows_win32_ui_colorsystem_SetICMProfileW(void* hdc, void* lpfilename);
int32_t windowssys_windows_win32_ui_colorsystem_SetStandardColorSpaceProfileA(void* pmachinename, uint32_t dwprofileid, void* pprofilename);
int32_t windowssys_windows_win32_ui_colorsystem_SetStandardColorSpaceProfileW(void* pmachinename, uint32_t dwprofileid, void* pprofilename);
int32_t windowssys_windows_win32_ui_colorsystem_SetupColorMatchingA(void* pcms);
int32_t windowssys_windows_win32_ui_colorsystem_SetupColorMatchingW(void* pcms);
int32_t windowssys_windows_win32_ui_colorsystem_TranslateBitmapBits(int64_t hcolortransform, void* psrcbits, int32_t bminput, uint32_t dwwidth, uint32_t dwheight, uint32_t dwinputstride, void* pdestbits, int32_t bmoutput, uint32_t dwoutputstride, void* pfncallback, int64_t ulcallbackdata);
int32_t windowssys_windows_win32_ui_colorsystem_TranslateColors(int64_t hcolortransform, void* painputcolors, uint32_t ncolors, int32_t ctinput, void* paoutputcolors, int32_t ctoutput);
int32_t windowssys_windows_win32_ui_colorsystem_UninstallColorProfileA(void* pmachinename, void* pprofilename, int32_t bdelete);
int32_t windowssys_windows_win32_ui_colorsystem_UninstallColorProfileW(void* pmachinename, void* pprofilename, int32_t bdelete);
int32_t windowssys_windows_win32_ui_colorsystem_UnregisterCMMA(void* pmachinename, uint32_t cmmid);
int32_t windowssys_windows_win32_ui_colorsystem_UnregisterCMMW(void* pmachinename, uint32_t cmmid);
int32_t windowssys_windows_win32_ui_colorsystem_UpdateICMRegKeyA(uint32_t reserved, void* lpszcmid, void* lpszfilename, uint32_t command);
int32_t windowssys_windows_win32_ui_colorsystem_UpdateICMRegKeyW(uint32_t reserved, void* lpszcmid, void* lpszfilename, uint32_t command);
int32_t windowssys_windows_win32_ui_colorsystem_WcsAssociateColorProfileWithDevice(int32_t scope, void* pprofilename, void* pdevicename);
int32_t windowssys_windows_win32_ui_colorsystem_WcsCheckColors(int64_t hcolortransform, uint32_t ncolors, uint32_t ninputchannels, int32_t cdtinput, uint32_t cbinput, void* pinputdata, void* paresult);
int64_t windowssys_windows_win32_ui_colorsystem_WcsCreateIccProfile(int64_t hwcsprofile, uint32_t dwoptions);
int32_t windowssys_windows_win32_ui_colorsystem_WcsDisassociateColorProfileFromDevice(int32_t scope, void* pprofilename, void* pdevicename);
int32_t windowssys_windows_win32_ui_colorsystem_WcsEnumColorProfiles(int32_t scope, void* penumrecord, void* pbuffer, uint32_t dwsize, void* pnprofiles);
int32_t windowssys_windows_win32_ui_colorsystem_WcsEnumColorProfilesSize(int32_t scope, void* penumrecord, void* pdwsize);
int32_t windowssys_windows_win32_ui_colorsystem_WcsGetCalibrationManagementState(void* pbisenabled);
int32_t windowssys_windows_win32_ui_colorsystem_WcsGetDefaultColorProfile(int32_t scope, void* pdevicename, int32_t cptcolorprofiletype, int32_t cpstcolorprofilesubtype, uint32_t dwprofileid, uint32_t cbprofilename, void* pprofilename);
int32_t windowssys_windows_win32_ui_colorsystem_WcsGetDefaultColorProfileSize(int32_t scope, void* pdevicename, int32_t cptcolorprofiletype, int32_t cpstcolorprofilesubtype, uint32_t dwprofileid, void* pcbprofilename);
int32_t windowssys_windows_win32_ui_colorsystem_WcsGetDefaultRenderingIntent(int32_t scope, void* pdwrenderingintent);
int32_t windowssys_windows_win32_ui_colorsystem_WcsGetUsePerUserProfiles(void* pdevicename, uint32_t dwdeviceclass, void* puseperuserprofiles);
int64_t windowssys_windows_win32_ui_colorsystem_WcsOpenColorProfileA(void* pcdmpprofile, void* pcampprofile, void* pgmmpprofile, uint32_t dwdesireaccess, uint32_t dwsharemode, uint32_t dwcreationmode, uint32_t dwflags);
int64_t windowssys_windows_win32_ui_colorsystem_WcsOpenColorProfileW(void* pcdmpprofile, void* pcampprofile, void* pgmmpprofile, uint32_t dwdesireaccess, uint32_t dwsharemode, uint32_t dwcreationmode, uint32_t dwflags);
int32_t windowssys_windows_win32_ui_colorsystem_WcsSetCalibrationManagementState(int32_t bisenabled);
int32_t windowssys_windows_win32_ui_colorsystem_WcsSetDefaultColorProfile(int32_t scope, void* pdevicename, int32_t cptcolorprofiletype, int32_t cpstcolorprofilesubtype, uint32_t dwprofileid, void* pprofilename);
int32_t windowssys_windows_win32_ui_colorsystem_WcsSetDefaultRenderingIntent(int32_t scope, uint32_t dwrenderingintent);
int32_t windowssys_windows_win32_ui_colorsystem_WcsSetUsePerUserProfiles(void* pdevicename, uint32_t dwdeviceclass, int32_t useperuserprofiles);
int32_t windowssys_windows_win32_ui_colorsystem_WcsTranslateColors(int64_t hcolortransform, uint32_t ncolors, uint32_t ninputchannels, int32_t cdtinput, uint32_t cbinput, void* pinputdata, uint32_t noutputchannels, int32_t cdtoutput, uint32_t cboutput, void* poutputdata);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_UI_COLORSYSTEM_WINDOWS_WIN32_UI_COLORSYSTEM_WRAPPER_H */
