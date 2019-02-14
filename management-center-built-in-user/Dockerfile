FROM hazelcast/management-center:latest

# override start command for Management Center
CMD ["bash", "-c", "set -euo pipefail \
      # define a built-in user account on first start
      && [ -f ${MC_DATA}/security.properties ] || ${MC_HOME}/mc-conf.sh create-user -H=${MC_DATA} -n=admin -p=p@ssw0rd -r=admin \
      && if [[ \"x${JAVA_OPTS}\" != \"x\" ]]; then export JAVA_OPTS=\"${JAVA_OPTS_DEFAULT} ${JAVA_OPTS}\"; else export JAVA_OPTS=\"${JAVA_OPTS_DEFAULT}\"; fi \
      && if [[ \"x${MIN_HEAP_SIZE}\" != \"x\" ]]; then export JAVA_OPTS=\"${JAVA_OPTS} -Xms${MIN_HEAP_SIZE}\"; fi \
      && if [[ \"x${MAX_HEAP_SIZE}\" != \"x\" ]]; then export JAVA_OPTS=\"${JAVA_OPTS} -Xms${MAX_HEAP_SIZE}\"; fi \
      && echo \"########################################\" \
      && echo \"# JAVA_OPTS=${JAVA_OPTS}\" \
      && echo \"# starting now....\" \
      && echo \"########################################\" \
      && set -x \
      && exec java -server ${JAVA_OPTS} -jar ${MC_RUNTIME} \
                ${MC_HTTP_PORT} ${MC_HTTPS_PORT} ${MC_CONTEXT} \
     "]