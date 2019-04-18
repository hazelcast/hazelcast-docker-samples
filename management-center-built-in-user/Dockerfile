FROM hazelcast/management-center:latest

# Start Management Center
CMD ["bash", "-c", "set -euo pipefail \
      # define a built-in user account on first start (if security.properties file is not present)
      && [ -f ${MC_DATA}/security.properties ] || ./mc-conf.sh create-user -H=${MC_DATA} -n=admin -p=p@ssw0rd -r=admin \
      && /mc-start.sh \
     "]