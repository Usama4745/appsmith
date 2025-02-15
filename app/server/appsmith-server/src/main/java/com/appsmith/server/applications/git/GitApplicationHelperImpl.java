package com.appsmith.server.applications.git;

import com.appsmith.server.actioncollections.base.ActionCollectionService;
import com.appsmith.server.applications.base.ApplicationService;
import com.appsmith.server.domains.Application;
import com.appsmith.server.helpers.CommonGitFileUtils;
import com.appsmith.server.helpers.GitPrivateRepoHelper;
import com.appsmith.server.helpers.ResponseUtils;
import com.appsmith.server.newactions.base.NewActionService;
import com.appsmith.server.newpages.base.NewPageService;
import com.appsmith.server.services.ApplicationPageService;
import com.appsmith.server.services.GitArtifactHelper;
import com.appsmith.server.solutions.ApplicationPermission;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class GitApplicationHelperImpl extends GitApplicationHelperCECompatibleImpl
        implements GitArtifactHelper<Application> {

    public GitApplicationHelperImpl(
            CommonGitFileUtils gitFileUtils,
            GitPrivateRepoHelper gitPrivateRepoHelper,
            ApplicationService applicationService,
            ApplicationPageService applicationPageService,
            ApplicationPermission applicationPermission,
            NewPageService newPageService,
            ActionCollectionService actionCollectionService,
            NewActionService newActionService,
            ResponseUtils responseUtils) {
        super(
                gitFileUtils,
                gitPrivateRepoHelper,
                applicationService,
                applicationPageService,
                applicationPermission,
                newPageService,
                actionCollectionService,
                newActionService,
                responseUtils);
    }
}
